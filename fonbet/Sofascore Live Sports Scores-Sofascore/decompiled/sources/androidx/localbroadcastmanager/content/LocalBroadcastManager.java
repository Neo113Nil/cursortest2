package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.NonNull;
import defpackage.gl0;
import defpackage.tgb;
import defpackage.wj9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final Context mAppContext;
    private final Handler mHandler;
    private final HashMap<BroadcastReceiver, ArrayList<tgb>> mReceivers = new HashMap<>();
    private final HashMap<String, ArrayList<tgb>> mActions = new HashMap<>();
    private final ArrayList<wj9> mPendingBroadcasts = new ArrayList<>();

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new gl0(this, context.getMainLooper(), 5);
    }

    @NonNull
    public static LocalBroadcastManager getInstance(@NonNull Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            try {
                localBroadcastManager = mInstance;
                if (localBroadcastManager == null) {
                    localBroadcastManager = new LocalBroadcastManager(context.getApplicationContext());
                    mInstance = localBroadcastManager;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return localBroadcastManager;
    }

    public void executePendingBroadcasts() {
        int size;
        wj9[] wj9VarArr;
        while (true) {
            synchronized (this.mReceivers) {
                try {
                    size = this.mPendingBroadcasts.size();
                    if (size <= 0) {
                        return;
                    }
                    wj9VarArr = new wj9[size];
                    this.mPendingBroadcasts.toArray(wj9VarArr);
                    this.mPendingBroadcasts.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                wj9 wj9Var = wj9VarArr[i];
                int size2 = ((ArrayList) wj9Var.c).size();
                for (int i2 = 0; i2 < size2; i2++) {
                    tgb tgbVar = (tgb) ((ArrayList) wj9Var.c).get(i2);
                    if (!tgbVar.d) {
                        tgbVar.b.onReceive(this.mAppContext, (Intent) wj9Var.b);
                    }
                }
            }
        }
    }

    public void registerReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            try {
                tgb tgbVar = new tgb(broadcastReceiver, intentFilter);
                ArrayList<tgb> arrayList = this.mReceivers.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.mReceivers.put(broadcastReceiver, arrayList);
                }
                arrayList.add(tgbVar);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<tgb> arrayList2 = this.mActions.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.mActions.put(action, arrayList2);
                    }
                    arrayList2.add(tgbVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean sendBroadcast(@NonNull Intent intent) {
        int match;
        synchronized (this.mReceivers) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    intent.toString();
                }
                ArrayList<tgb> arrayList = this.mActions.get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i = 0; i < arrayList.size(); i++) {
                        tgb tgbVar = arrayList.get(i);
                        if (z) {
                            Objects.toString(tgbVar.a);
                        }
                        if (!tgbVar.c && (match = tgbVar.a.match(action, resolveTypeIfNeeded, scheme, data, categories, TAG)) >= 0) {
                            if (z) {
                                Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(tgbVar);
                            tgbVar.c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((tgb) arrayList2.get(i2)).c = false;
                        }
                        this.mPendingBroadcasts.add(new wj9(12, intent, arrayList2));
                        if (!this.mHandler.hasMessages(1)) {
                            this.mHandler.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sendBroadcastSync(@NonNull Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    public void unregisterReceiver(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            try {
                ArrayList<tgb> remove = this.mReceivers.remove(broadcastReceiver);
                if (remove == null) {
                    return;
                }
                for (int size = remove.size() - 1; size >= 0; size--) {
                    tgb tgbVar = remove.get(size);
                    tgbVar.d = true;
                    for (int i = 0; i < tgbVar.a.countActions(); i++) {
                        String action = tgbVar.a.getAction(i);
                        ArrayList<tgb> arrayList = this.mActions.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                tgb tgbVar2 = arrayList.get(size2);
                                if (tgbVar2.b == broadcastReceiver) {
                                    tgbVar2.d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.mActions.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
