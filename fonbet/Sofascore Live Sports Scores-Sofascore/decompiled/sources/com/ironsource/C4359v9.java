package com.ironsource;

import android.app.Activity;
import com.ironsource.C4190m1;
import com.ironsource.InterfaceC4136j1;
import com.ironsource.J8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import defpackage.uym;
import defpackage.wem;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.v9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4359v9 implements InterfaceC3955a6 {

    @NotNull
    private J9 a;

    @NotNull
    private InterfaceC4010c0 b;

    @NotNull
    private X1 c;

    @NotNull
    private InterfaceC4262q1 d;

    @NotNull
    private InterfaceC4165kc e;

    @NotNull
    private InterfaceC4080fg f;

    @NotNull
    private J8 g;

    @NotNull
    private J8.a h;

    @NotNull
    private final Map<String, C4359v9> i;

    @NotNull
    private InterstitialAdInfo j;

    @Nullable
    private InterfaceC4377w9 k;

    public C4359v9(@NotNull J9 j9, @NotNull InterfaceC4010c0 interfaceC4010c0, @NotNull X1 x1, @NotNull InterfaceC4262q1 interfaceC4262q1, @NotNull InterfaceC4165kc interfaceC4165kc, @NotNull InterfaceC4080fg interfaceC4080fg, @NotNull J8 j8, @NotNull J8.a aVar, @NotNull Map<String, C4359v9> map) {
        j9.getClass();
        interfaceC4010c0.getClass();
        x1.getClass();
        interfaceC4262q1.getClass();
        interfaceC4165kc.getClass();
        interfaceC4080fg.getClass();
        j8.getClass();
        aVar.getClass();
        map.getClass();
        this.a = j9;
        this.b = interfaceC4010c0;
        this.c = x1;
        this.d = interfaceC4262q1;
        this.e = interfaceC4165kc;
        this.f = interfaceC4080fg;
        this.g = j8;
        this.h = aVar;
        this.i = map;
        String f = j9.f();
        f.getClass();
        String e = this.a.e();
        e.getClass();
        this.j = new InterstitialAdInfo(f, e);
        Y5 y5 = new Y5();
        this.a.a(y5);
        y5.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4359v9 c4359v9) {
        c4359v9.getClass();
        InterfaceC4377w9 interfaceC4377w9 = c4359v9.k;
        if (interfaceC4377w9 != null) {
            interfaceC4377w9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4359v9 c4359v9) {
        c4359v9.getClass();
        InterfaceC4377w9 interfaceC4377w9 = c4359v9.k;
        if (interfaceC4377w9 != null) {
            interfaceC4377w9.onAdInstanceDidDismiss();
        }
    }

    public final void a(@NotNull Activity activity) {
        activity.getClass();
        this.i.put(this.j.getAdId(), this);
        if (!this.b.a(this.a)) {
            a(C4301s5.a.t());
        } else {
            InterfaceC4136j1.a.a.d(new InterfaceC4208n1[0]).a(this.d);
            this.b.a(activity, this.a);
        }
    }

    public final boolean d() {
        boolean a = this.b.a(this.a);
        InterfaceC4136j1.a.a.a(a).a(this.d);
        return a;
    }

    public final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC3955a6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC4136j1.a.a.f(new InterfaceC4208n1[0]).a(this.d);
    }

    @Override // com.ironsource.InterfaceC3955a6
    public void onAdInstanceDidClick() {
        InterfaceC4136j1.a.a.a().a(this.d);
        this.f.a(new uym(this, 0));
    }

    @Override // com.ironsource.InterfaceC3955a6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC4136j1.a.a.a(new InterfaceC4208n1[0]).a(this.d);
        this.f.a(new uym(this, 2));
    }

    @Override // com.ironsource.InterfaceC3955a6
    public void onAdInstanceDidShow() {
        J8 j8 = this.g;
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        InterfaceC4136j1.a.a.b(new C4190m1.w(j8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new uym(this, 3));
    }

    @NotNull
    public final InterstitialAdInfo b() {
        return this.j;
    }

    @Nullable
    public final InterfaceC4377w9 c() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4359v9 c4359v9) {
        c4359v9.getClass();
        InterfaceC4377w9 interfaceC4377w9 = c4359v9.k;
        if (interfaceC4377w9 != null) {
            interfaceC4377w9.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.InterfaceC3955a6
    public void onAdInstanceDidReward(@Nullable String str, int i) {
    }

    public final void a(@Nullable InterfaceC4377w9 interfaceC4377w9) {
        this.k = interfaceC4377w9;
    }

    public final void a(@NotNull InterstitialAdInfo interstitialAdInfo) {
        interstitialAdInfo.getClass();
        this.j = interstitialAdInfo;
    }

    @Override // com.ironsource.InterfaceC3955a6
    public void a(@Nullable String str) {
        a(C4301s5.a.c(new IronSourceError(0, str)));
    }

    private final void a(IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        InterfaceC4136j1.a.a.a(new C4190m1.j(ironSourceError.getErrorCode()), new C4190m1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new wem(16, this, ironSourceError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4359v9 c4359v9, IronSourceError ironSourceError) {
        c4359v9.getClass();
        ironSourceError.getClass();
        InterfaceC4377w9 interfaceC4377w9 = c4359v9.k;
        if (interfaceC4377w9 != null) {
            interfaceC4377w9.onAdInstanceDidFailedToShow(ironSourceError);
        }
    }

    public final void a() {
        InterfaceC4080fg.a(this.f, new uym(this, 1), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4359v9 c4359v9) {
        c4359v9.getClass();
        InterfaceC4136j1.d.a.b().a(c4359v9.d);
        c4359v9.e.a(c4359v9.a);
    }

    public /* synthetic */ C4359v9(J9 j9, InterfaceC4010c0 interfaceC4010c0, X1 x1, InterfaceC4262q1 interfaceC4262q1, InterfaceC4165kc interfaceC4165kc, InterfaceC4080fg interfaceC4080fg, J8 j8, J8.a aVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, interfaceC4010c0, x1, interfaceC4262q1, (i & 16) != 0 ? new C4183lc() : interfaceC4165kc, (i & 32) != 0 ? O7.a : interfaceC4080fg, (i & 64) != 0 ? Ib.v.d().s() : j8, (i & 128) != 0 ? Ib.v.a().i() : aVar, map);
    }
}
