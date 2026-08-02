package io.sentry.android.core;

import android.view.View;
import androidx.core.view.C5353y0;
import io.sentry.C7209u1;
import io.sentry.InterfaceC7142f0;
import vb0.C10295b;

/* renamed from: io.sentry.android.core.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C7106g implements C7209u1.c, androidx.core.view.D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f67097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f67098b;

    public /* synthetic */ C7106g(Object obj, Object obj2) {
        this.f67097a = obj;
        this.f67098b = obj2;
    }

    @Override // io.sentry.C7209u1.c
    public void a(InterfaceC7142f0 interfaceC7142f0) {
        if (interfaceC7142f0 == ((InterfaceC7142f0) this.f67097a)) {
            ((io.sentry.U) this.f67098b).v();
        }
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C10295b.a((C10295b.EnumC2227b) this.f67097a, (View) this.f67098b, view, c5353y0);
        return c5353y0;
    }
}
