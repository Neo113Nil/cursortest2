package com.ironsource;

import android.app.Activity;
import com.ironsource.C4190m1;
import com.ironsource.InterfaceC4136j1;
import com.ironsource.J8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import defpackage.ecg;
import defpackage.ulk;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vd implements InterfaceC3955a6 {

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
    private final Map<String, Vd> i;

    @NotNull
    private RewardedAdInfo j;

    @Nullable
    private Wd k;

    public Vd(@NotNull J9 j9, @NotNull InterfaceC4010c0 interfaceC4010c0, @NotNull X1 x1, @NotNull InterfaceC4262q1 interfaceC4262q1, @NotNull InterfaceC4165kc interfaceC4165kc, @NotNull InterfaceC4080fg interfaceC4080fg, @NotNull J8 j8, @NotNull J8.a aVar, @NotNull Map<String, Vd> map) {
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
        this.j = new RewardedAdInfo(f, e);
        Y5 y5 = new Y5();
        this.a.a(y5);
        y5.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Vd vd) {
        vd.getClass();
        Wd wd = vd.k;
        if (wd != null) {
            wd.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Vd vd) {
        vd.getClass();
        Wd wd = vd.k;
        if (wd != null) {
            wd.onRewardedAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Vd vd) {
        vd.getClass();
        Wd wd = vd.k;
        if (wd != null) {
            wd.onRewardedAdShown();
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
        this.f.a(new ulk(this, 3));
    }

    @Override // com.ironsource.InterfaceC3955a6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC4136j1.a.a.a(new InterfaceC4208n1[0]).a(this.d);
        this.f.a(new ulk(this, 1));
    }

    @Override // com.ironsource.InterfaceC3955a6
    public void onAdInstanceDidReward(@Nullable String str, int i) {
        C4190m1.u uVar = new C4190m1.u("Virtual Item");
        C4190m1.t tVar = new C4190m1.t(1);
        C4190m1.q qVar = new C4190m1.q("DefaultRewardedVideo");
        String a = IronSourceUtils.a(System.currentTimeMillis(), this.a.g());
        a.getClass();
        InterfaceC4136j1.a.a.c(uVar, tVar, qVar, new C4190m1.y(a)).a(this.d);
        this.f.a(new ulk(this, 4));
    }

    @Override // com.ironsource.InterfaceC3955a6
    public void onAdInstanceDidShow() {
        J8 j8 = this.g;
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        InterfaceC4136j1.a.a.b(new C4190m1.w(j8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new ulk(this, 2));
    }

    @NotNull
    public final RewardedAdInfo b() {
        return this.j;
    }

    @Nullable
    public final Wd c() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Vd vd) {
        vd.getClass();
        Wd wd = vd.k;
        if (wd != null) {
            wd.onUserEarnedReward();
        }
    }

    public final void a(@Nullable Wd wd) {
        this.k = wd;
    }

    public final void a(@NotNull RewardedAdInfo rewardedAdInfo) {
        rewardedAdInfo.getClass();
        this.j = rewardedAdInfo;
    }

    @Override // com.ironsource.InterfaceC3955a6
    public void a(@Nullable String str) {
        a(C4301s5.a.c(new IronSourceError(0, str)));
    }

    private final void a(IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        InterfaceC4136j1.a.a.a(new C4190m1.j(ironSourceError.getErrorCode()), new C4190m1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new ecg(19, this, ironSourceError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Vd vd, IronSourceError ironSourceError) {
        vd.getClass();
        ironSourceError.getClass();
        Wd wd = vd.k;
        if (wd != null) {
            wd.onRewardedAdFailedToShow(ironSourceError);
        }
    }

    public final void a() {
        InterfaceC4080fg.a(this.f, new ulk(this, 0), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Vd vd) {
        vd.getClass();
        InterfaceC4136j1.d.a.b().a(vd.d);
        vd.e.a(vd.a);
    }

    public /* synthetic */ Vd(J9 j9, InterfaceC4010c0 interfaceC4010c0, X1 x1, InterfaceC4262q1 interfaceC4262q1, InterfaceC4165kc interfaceC4165kc, InterfaceC4080fg interfaceC4080fg, J8 j8, J8.a aVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, interfaceC4010c0, x1, interfaceC4262q1, (i & 16) != 0 ? new C4183lc() : interfaceC4165kc, (i & 32) != 0 ? O7.a : interfaceC4080fg, (i & 64) != 0 ? Ib.v.d().s() : j8, (i & 128) != 0 ? Ib.v.a().i() : aVar, map);
    }
}
