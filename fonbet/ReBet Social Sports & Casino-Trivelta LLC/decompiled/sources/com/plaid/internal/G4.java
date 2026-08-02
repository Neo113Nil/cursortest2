package com.plaid.internal;

import android.database.Cursor;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class G4 implements Callable<I4> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.A f39259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H4 f39260b;

    public G4(H4 h42, androidx.room.A a10) {
        this.f39260b = h42;
        this.f39259a = a10;
    }

    @Override // java.util.concurrent.Callable
    public final I4 call() {
        Cursor c10 = A2.b.c(this.f39260b.f39270a, this.f39259a, false, null);
        try {
            return c10.moveToFirst() ? new I4(c10.getString(A2.a.e(c10, "workflow_id")), c10.getString(A2.a.e(c10, StackTraceHelper.ID_KEY)), c10.getBlob(A2.a.e(c10, "model"))) : null;
        } finally {
            c10.close();
            this.f39259a.U();
        }
    }
}
