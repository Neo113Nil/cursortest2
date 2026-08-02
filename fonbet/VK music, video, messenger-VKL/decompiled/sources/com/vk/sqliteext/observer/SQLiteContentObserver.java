package com.vk.sqliteext.observer;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import xsna.dhs;
import xsna.epx;
import xsna.i9x;
import xsna.iyg0;
import xsna.sd;
import xsna.sin0;
import xsna.swe0;

/* compiled from: SQLiteContentObserver.kt */
/* loaded from: classes5.dex */
public final class SQLiteContentObserver {
    private static final long EVENT_TYPE_DELETE = 3;
    private static final long EVENT_TYPE_REPLACE = 1;
    private static final long EVENT_TYPE_UPDATE = 2;
    public static final String EXTENSION_NAME = "libsqliteobserver.so";
    public static final SQLiteContentObserver INSTANCE;
    public static final String LIBRARY_NAME = "sqliteobserver";
    private static final Executor executor;
    private static final CopyOnWriteArrayList<ListenerInfo> listeners;

    /* compiled from: SQLiteContentObserver.kt */
    public static final class ListenerInfo {
        private final String dbFilePath;
        private final SQLiteContentChangesListener listener;

        public ListenerInfo(String str, SQLiteContentChangesListener sQLiteContentChangesListener) {
            this.dbFilePath = str;
            this.listener = sQLiteContentChangesListener;
        }

        public static /* synthetic */ ListenerInfo copy$default(ListenerInfo listenerInfo, String str, SQLiteContentChangesListener sQLiteContentChangesListener, int i, Object obj) {
            if ((i & 1) != 0) {
                str = listenerInfo.dbFilePath;
            }
            if ((i & 2) != 0) {
                sQLiteContentChangesListener = listenerInfo.listener;
            }
            return listenerInfo.copy(str, sQLiteContentChangesListener);
        }

        public final String component1() {
            return this.dbFilePath;
        }

        public final SQLiteContentChangesListener component2() {
            return this.listener;
        }

        public final ListenerInfo copy(String str, SQLiteContentChangesListener sQLiteContentChangesListener) {
            return new ListenerInfo(str, sQLiteContentChangesListener);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerInfo)) {
                return false;
            }
            ListenerInfo listenerInfo = (ListenerInfo) obj;
            return epx.f(this.dbFilePath, listenerInfo.dbFilePath) && epx.f(this.listener, listenerInfo.listener);
        }

        public final String getDbFilePath() {
            return this.dbFilePath;
        }

        public final SQLiteContentChangesListener getListener() {
            return this.listener;
        }

        public int hashCode() {
            return this.listener.hashCode() + (this.dbFilePath.hashCode() * 31);
        }

        public String toString() {
            return "ListenerInfo(dbFilePath=" + this.dbFilePath + ", listener=" + this.listener + ')';
        }
    }

    static {
        SQLiteContentObserver sQLiteContentObserver = new SQLiteContentObserver();
        INSTANCE = sQLiteContentObserver;
        listeners = new CopyOnWriteArrayList<>();
        executor = sQLiteContentObserver.createSingleThreadExecutor();
    }

    private SQLiteContentObserver() {
    }

    private final Executor createSingleThreadExecutor() {
        return Executors.newSingleThreadExecutor(new iyg0(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread createSingleThreadExecutor$lambda$2(Runnable runnable) {
        return new Thread(runnable, "sqlite-content-observer");
    }

    private final void handleEvents(String str, String str2, long[] jArr) {
        try {
            handleEventsImpl(str, str2, jArr);
        } catch (Throwable th) {
            throwExceptionOnMainThread(th);
        }
    }

    private final void handleEventsImpl(String str, String str2, long[] jArr) {
        HashSet hashSet = new HashSet(jArr.length);
        HashSet hashSet2 = new HashSet(jArr.length);
        HashSet hashSet3 = new HashSet(jArr.length);
        i9x p = swe0.p(2, swe0.q(0, jArr.length));
        int i = p.b;
        int i2 = p.c;
        int i3 = p.d;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                long j = jArr[i];
                long j2 = jArr[i + 1];
                if (j == 1) {
                    hashSet.add(Long.valueOf(j2));
                    hashSet2.remove(Long.valueOf(j2));
                    hashSet3.remove(Long.valueOf(j2));
                } else if (j == 2) {
                    if (!hashSet.contains(Long.valueOf(j2)) && !hashSet3.contains(Long.valueOf(j2))) {
                        hashSet2.add(Long.valueOf(j2));
                    }
                } else if (j == 3) {
                    hashSet.remove(Long.valueOf(j2));
                    hashSet2.remove(Long.valueOf(j2));
                    hashSet3.add(Long.valueOf(j2));
                }
                if (i == i2) {
                    break;
                } else {
                    i += i3;
                }
            }
        }
        if (hashSet.isEmpty() && hashSet2.isEmpty() && hashSet3.isEmpty()) {
            return;
        }
        handleEventsImpl(str, str2, hashSet, hashSet2, hashSet3);
    }

    @Keep
    private final void onRowsChanged(String str, String str2, long[] jArr) {
        if (jArr.length == 0) {
            return;
        }
        executor.execute(new dhs(str, str2, jArr, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRowsChanged$lambda$4(String str, String str2, long[] jArr) {
        INSTANCE.handleEvents(str, str2, jArr);
    }

    private final void throwExceptionOnMainThread(Throwable th) {
        new Handler(Looper.getMainLooper()).post(new sd(th, 13));
    }

    public final void addChangesListener(sin0 sin0Var, SQLiteContentChangesListener sQLiteContentChangesListener) {
        String path = sin0Var.getPath();
        if (path == null) {
            path = "";
        }
        addChangesListener(path, sQLiteContentChangesListener);
    }

    public final void removeChangesListener(SQLiteContentChangesListener sQLiteContentChangesListener) {
        CopyOnWriteArrayList<ListenerInfo> copyOnWriteArrayList = listeners;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (epx.f(((ListenerInfo) obj).getListener(), sQLiteContentChangesListener)) {
                arrayList.add(obj);
            }
        }
        listeners.removeAll(arrayList);
    }

    public final void addChangesListener(String str, SQLiteContentChangesListener sQLiteContentChangesListener) {
        listeners.add(new ListenerInfo(str, sQLiteContentChangesListener));
    }

    private final void handleEventsImpl(String str, String str2, Collection<Long> collection, Collection<Long> collection2, Collection<Long> collection3) {
        for (ListenerInfo listenerInfo : listeners) {
            if (epx.f(listenerInfo.getDbFilePath(), str)) {
                listenerInfo.getListener().onChanges(str2, collection, collection2, collection3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void throwExceptionOnMainThread$lambda$3(Throwable th) {
        throw th;
    }
}
