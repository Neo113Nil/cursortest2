package io.branch.referral;

import android.content.Context;
import android.content.SharedPreferences;
import io.branch.referral.Defines;
import io.branch.referral.ServerRequest;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
class ServerRequestQueue {
    private static final int MAX_ITEMS = 25;
    private static final String PREF_KEY = "BNCServerRequestQueue";
    private static ServerRequestQueue SharedInstance;
    private static final Object reqQueueLockObject = new Object();
    private SharedPreferences.Editor editor;
    private final List<ServerRequest> queue;
    private SharedPreferences sharedPref;

    public static ServerRequestQueue getInstance(Context context) {
        if (SharedInstance == null) {
            synchronized (ServerRequestQueue.class) {
                if (SharedInstance == null) {
                    SharedInstance = new ServerRequestQueue(context);
                }
            }
        }
        return SharedInstance;
    }

    static void shutDown() {
        synchronized (reqQueueLockObject) {
            SharedInstance = null;
        }
    }

    private ServerRequestQueue(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("BNC_Server_Request_Queue", 0);
        this.sharedPref = sharedPreferences;
        this.editor = sharedPreferences.edit();
        this.queue = retrieve(context);
    }

    private void persist() {
        new Thread(new Runnable() { // from class: io.branch.referral.ServerRequestQueue.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject json;
                JSONArray jSONArray = new JSONArray();
                synchronized (ServerRequestQueue.reqQueueLockObject) {
                    for (ServerRequest serverRequest : ServerRequestQueue.this.queue) {
                        if (serverRequest.isPersistable() && (json = serverRequest.toJSON()) != null) {
                            jSONArray.put(json);
                        }
                    }
                }
                try {
                    ServerRequestQueue.this.editor.putString(ServerRequestQueue.PREF_KEY, jSONArray.toString()).commit();
                } catch (Exception e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder("Failed to persist queue");
                    if (message == null) {
                        message = "";
                    }
                    sb.append(message);
                    PrefHelper.Debug(sb.toString());
                }
            }
        }).start();
    }

    private List<ServerRequest> retrieve(Context context) {
        String string = this.sharedPref.getString(PREF_KEY, null);
        List<ServerRequest> synchronizedList = Collections.synchronizedList(new LinkedList());
        synchronized (reqQueueLockObject) {
            if (string != null) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    int min = Math.min(jSONArray.length(), 25);
                    for (int i = 0; i < min; i++) {
                        ServerRequest fromJSON = ServerRequest.fromJSON(jSONArray.getJSONObject(i), context);
                        if (fromJSON != null) {
                            synchronizedList.add(fromJSON);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return synchronizedList;
    }

    public int getSize() {
        int size;
        synchronized (reqQueueLockObject) {
            size = this.queue.size();
        }
        return size;
    }

    void enqueue(ServerRequest serverRequest) {
        synchronized (reqQueueLockObject) {
            if (serverRequest != null) {
                this.queue.add(serverRequest);
                if (getSize() >= 25) {
                    this.queue.remove(1);
                }
                persist();
            }
        }
    }

    ServerRequest dequeue() {
        ServerRequest serverRequest;
        synchronized (reqQueueLockObject) {
            ServerRequest serverRequest2 = null;
            try {
                serverRequest = this.queue.remove(0);
                try {
                    persist();
                } catch (IndexOutOfBoundsException | NoSuchElementException unused) {
                    serverRequest2 = serverRequest;
                    serverRequest = serverRequest2;
                    return serverRequest;
                }
            } catch (IndexOutOfBoundsException | NoSuchElementException unused2) {
            }
        }
        return serverRequest;
    }

    ServerRequest peek() {
        ServerRequest serverRequest;
        synchronized (reqQueueLockObject) {
            try {
                serverRequest = this.queue.get(0);
            } catch (IndexOutOfBoundsException | NoSuchElementException unused) {
                serverRequest = null;
            }
        }
        return serverRequest;
    }

    ServerRequest peekAt(int i) {
        ServerRequest serverRequest;
        synchronized (reqQueueLockObject) {
            try {
                serverRequest = this.queue.get(i);
            } catch (IndexOutOfBoundsException | NoSuchElementException unused) {
                serverRequest = null;
            }
        }
        return serverRequest;
    }

    void insert(ServerRequest serverRequest, int i) {
        synchronized (reqQueueLockObject) {
            try {
                if (this.queue.size() < i) {
                    i = this.queue.size();
                }
                this.queue.add(i, serverRequest);
                persist();
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    public ServerRequest removeAt(int i) {
        ServerRequest serverRequest;
        synchronized (reqQueueLockObject) {
            ServerRequest serverRequest2 = null;
            try {
                serverRequest = this.queue.remove(i);
                try {
                    persist();
                } catch (IndexOutOfBoundsException unused) {
                    serverRequest2 = serverRequest;
                    serverRequest = serverRequest2;
                    return serverRequest;
                }
            } catch (IndexOutOfBoundsException unused2) {
            }
        }
        return serverRequest;
    }

    public boolean remove(ServerRequest serverRequest) {
        boolean z;
        synchronized (reqQueueLockObject) {
            z = false;
            try {
                z = this.queue.remove(serverRequest);
                persist();
            } catch (UnsupportedOperationException unused) {
            }
        }
        return z;
    }

    void clear() {
        synchronized (reqQueueLockObject) {
            try {
                this.queue.clear();
                persist();
            } catch (UnsupportedOperationException unused) {
            }
        }
    }

    boolean containsClose() {
        synchronized (reqQueueLockObject) {
            for (ServerRequest serverRequest : this.queue) {
                if (serverRequest != null && serverRequest.getRequestPath().equals(Defines.RequestPath.RegisterClose.getPath())) {
                    return true;
                }
            }
            return false;
        }
    }

    boolean containsInitRequest() {
        synchronized (reqQueueLockObject) {
            Iterator<ServerRequest> it = this.queue.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof ServerRequestInitSession) {
                    return true;
                }
            }
            return false;
        }
    }

    void unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK process_wait_lock) {
        synchronized (reqQueueLockObject) {
            for (ServerRequest serverRequest : this.queue) {
                if (serverRequest != null) {
                    serverRequest.removeProcessWaitLock(process_wait_lock);
                }
            }
        }
    }

    void setStrongMatchWaitLock() {
        synchronized (reqQueueLockObject) {
            for (ServerRequest serverRequest : this.queue) {
                if (serverRequest != null && (serverRequest instanceof ServerRequestInitSession)) {
                    serverRequest.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
                }
            }
        }
    }
}
