package com.plaid.internal;

import android.database.Cursor;
import androidx.annotation.NonNull;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class Z7 implements Callable<List<h8>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.A f39811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g8 f39812b;

    public Z7(g8 g8Var, androidx.room.A a10) {
        this.f39812b = g8Var;
        this.f39811a = a10;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final List<h8> call() {
        Cursor c10 = A2.b.c(this.f39812b.f40632a, this.f39811a, false, null);
        try {
            int e10 = A2.a.e(c10, "workflow_id");
            int e11 = A2.a.e(c10, StackTraceHelper.ID_KEY);
            int e12 = A2.a.e(c10, "analytics_model");
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(new h8(c10.getString(e10), c10.getString(e11), c10.getBlob(e12)));
            }
            return arrayList;
        } finally {
            c10.close();
            this.f39811a.U();
        }
    }
}
