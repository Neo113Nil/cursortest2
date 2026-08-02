package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import ca.AbstractC2904d;
import ca.InterfaceC2905e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3180d;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* loaded from: classes2.dex */
public final class O0 extends da.c implements f.b, f.c {

    /* renamed from: h, reason: collision with root package name */
    public static final C3117a.AbstractC0488a f32376h = AbstractC2904d.f27638c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f32377a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f32378b;

    /* renamed from: c, reason: collision with root package name */
    public final C3117a.AbstractC0488a f32379c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f32380d;

    /* renamed from: e, reason: collision with root package name */
    public final C3180d f32381e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2905e f32382f;

    /* renamed from: g, reason: collision with root package name */
    public N0 f32383g;

    public O0(Context context, Handler handler, C3180d c3180d) {
        C3117a.AbstractC0488a abstractC0488a = f32376h;
        this.f32377a = context;
        this.f32378b = handler;
        this.f32381e = (C3180d) AbstractC3191o.n(c3180d, "ClientSettings must not be null");
        this.f32380d = c3180d.g();
        this.f32379c = abstractC0488a;
    }

    public static /* bridge */ /* synthetic */ void M0(O0 o02, zak zakVar) {
        ConnectionResult g10 = zakVar.g();
        if (g10.l()) {
            zav zavVar = (zav) AbstractC3191o.m(zakVar.h());
            ConnectionResult g11 = zavVar.g();
            if (!g11.l()) {
                String valueOf = String.valueOf(g11);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                o02.f32383g.c(g11);
                o02.f32382f.disconnect();
                return;
            }
            o02.f32383g.b(zavVar.h(), o02.f32380d);
        } else {
            o02.f32383g.c(g10);
        }
        o02.f32382f.disconnect();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ca.e, com.google.android.gms.common.api.a$f] */
    public final void N0(N0 n02) {
        InterfaceC2905e interfaceC2905e = this.f32382f;
        if (interfaceC2905e != null) {
            interfaceC2905e.disconnect();
        }
        this.f32381e.l(Integer.valueOf(System.identityHashCode(this)));
        C3117a.AbstractC0488a abstractC0488a = this.f32379c;
        Context context = this.f32377a;
        Handler handler = this.f32378b;
        C3180d c3180d = this.f32381e;
        this.f32382f = abstractC0488a.buildClient(context, handler.getLooper(), c3180d, (Object) c3180d.h(), (f.b) this, (f.c) this);
        this.f32383g = n02;
        Set set = this.f32380d;
        if (set == null || set.isEmpty()) {
            this.f32378b.post(new L0(this));
        } else {
            this.f32382f.b();
        }
    }

    public final void O0() {
        InterfaceC2905e interfaceC2905e = this.f32382f;
        if (interfaceC2905e != null) {
            interfaceC2905e.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3146o
    public final void c(ConnectionResult connectionResult) {
        this.f32383g.c(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3128f
    public final void g(Bundle bundle) {
        this.f32382f.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3128f
    public final void i(int i10) {
        this.f32383g.d(i10);
    }

    @Override // da.e
    public final void s(zak zakVar) {
        this.f32378b.post(new M0(this, zakVar));
    }
}
