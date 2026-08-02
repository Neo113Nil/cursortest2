package com.vk.sqliteext.observer;

import xsna.sin0;

/* compiled from: SQLiteContentObserverExt.kt */
/* loaded from: classes5.dex */
public final class SQLiteContentObserverExtKt {
    public static final void addChangesListener(sin0 sin0Var, SQLiteContentChangesListener sQLiteContentChangesListener) {
        SQLiteContentObserver.INSTANCE.addChangesListener(sin0Var, sQLiteContentChangesListener);
    }

    public static final void removeChangesListener(sin0 sin0Var, SQLiteContentChangesListener sQLiteContentChangesListener) {
        SQLiteContentObserver.INSTANCE.removeChangesListener(sQLiteContentChangesListener);
    }
}
