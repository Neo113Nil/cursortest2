package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes2.dex */
public final class e1 extends AbstractC3158u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dialog f32478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f32479b;

    public e1(f1 f1Var, Dialog dialog) {
        this.f32479b = f1Var;
        this.f32478a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3158u0
    public final void a() {
        this.f32479b.f32482b.d();
        if (this.f32478a.isShowing()) {
            this.f32478a.dismiss();
        }
    }
}
