package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.C3171d;

/* loaded from: classes2.dex */
public final class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f32364a;

    public K(X x10) {
        this.f32364a = x10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3171d c3171d;
        Context context;
        X x10 = this.f32364a;
        c3171d = x10.f32409d;
        context = x10.f32408c;
        c3171d.a(context);
    }
}
