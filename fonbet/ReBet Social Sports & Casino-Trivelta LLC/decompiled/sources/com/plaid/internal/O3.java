package com.plaid.internal;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class O3 implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.A f39475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P3 f39476b;

    public O3(P3 p32, androidx.room.A a10) {
        this.f39476b = p32;
        this.f39475a = a10;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        String str = null;
        Cursor c10 = A2.b.c(this.f39476b.f39506a, this.f39475a, false, null);
        try {
            if (c10.moveToFirst() && !c10.isNull(0)) {
                str = c10.getString(0);
            }
            return str;
        } finally {
            c10.close();
            this.f39475a.U();
        }
    }
}
