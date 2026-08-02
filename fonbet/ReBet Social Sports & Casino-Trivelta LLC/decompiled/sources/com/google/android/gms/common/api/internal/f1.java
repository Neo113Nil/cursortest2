package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public final class f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f32481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f32482b;

    public f1(g1 g1Var, d1 d1Var) {
        this.f32482b = g1Var;
        this.f32481a = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f32482b.f32517a) {
            ConnectionResult b10 = this.f32481a.b();
            if (b10.k()) {
                g1 g1Var = this.f32482b;
                g1Var.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(g1Var.getActivity(), (PendingIntent) AbstractC3191o.m(b10.j()), this.f32481a.a(), false), 1);
                return;
            }
            g1 g1Var2 = this.f32482b;
            if (g1Var2.f32520d.d(g1Var2.getActivity(), b10.h(), null) != null) {
                g1 g1Var3 = this.f32482b;
                g1Var3.f32520d.B(g1Var3.getActivity(), g1Var3.mLifecycleFragment, b10.h(), 2, this.f32482b);
                return;
            }
            if (b10.h() != 18) {
                this.f32482b.a(b10, this.f32481a.a());
                return;
            }
            g1 g1Var4 = this.f32482b;
            Dialog w10 = g1Var4.f32520d.w(g1Var4.getActivity(), g1Var4);
            g1 g1Var5 = this.f32482b;
            g1Var5.f32520d.x(g1Var5.getActivity().getApplicationContext(), new e1(this, w10));
        }
    }
}
