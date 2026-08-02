package com.ironsource;

import android.app.Activity;
import com.ironsource.C2571o1;
import com.ironsource.InterfaceC2517l1;
import com.ironsource.L8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Wd implements InterfaceC2343b6 {
    private J9 a;
    private InterfaceC2355c0 b;
    private Z1 c;
    private InterfaceC2642s1 d;
    private InterfaceC2510kc e;
    private InterfaceC2371cg f;
    private L8 g;
    private L8.a h;
    private final Map<String, Wd> i;
    private RewardedAdInfo j;
    private Xd k;

    public Wd(J9 adInstance, InterfaceC2355c0 adNetworkShow, Z1 auctionDataReporter, InterfaceC2642s1 analytics, InterfaceC2510kc networkDestroyAPI, InterfaceC2371cg threadManager, L8 sessionDepthService, L8.a sessionDepthServiceEditor, Map<String, Wd> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.a = adInstance;
        this.b = adNetworkShow;
        this.c = auctionDataReporter;
        this.d = analytics;
        this.e = networkDestroyAPI;
        this.f = threadManager;
        this.g = sessionDepthService;
        this.h = sessionDepthServiceEditor;
        this.i = retainer;
        String f = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(f, "adInstance.instanceId");
        String e = this.a.e();
        Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        this.j = new RewardedAdInfo(f, e);
        Z5 z5 = new Z5();
        this.a.a(z5);
        z5.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Wd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Xd xd = this$0.k;
        if (xd != null) {
            xd.onRewardedAdShown();
        }
    }

    public final void a(RewardedAdInfo rewardedAdInfo) {
        Intrinsics.checkNotNullParameter(rewardedAdInfo, "<set-?>");
        this.j = rewardedAdInfo;
    }

    public final RewardedAdInfo b() {
        return this.j;
    }

    public final Xd c() {
        return this.k;
    }

    public final boolean d() {
        boolean a = this.b.a(this.a);
        InterfaceC2517l1.a.a.a(a).a(this.d);
        return a;
    }

    protected final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC2343b6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC2517l1.a.a.f(new InterfaceC2589p1[0]).a(this.d);
    }

    @Override // com.ironsource.InterfaceC2343b6
    public void onAdInstanceDidClick() {
        InterfaceC2517l1.a.a.a().a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Wd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Wd.b(Wd.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2343b6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC2517l1.a.a.a(new InterfaceC2589p1[0]).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Wd$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Wd.c(Wd.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2343b6
    public void onAdInstanceDidReward(String str, int i) {
        C2571o1.u uVar = new C2571o1.u("Virtual Item");
        C2571o1.t tVar = new C2571o1.t(1);
        C2571o1.q qVar = new C2571o1.q("DefaultRewardedVideo");
        String a = IronSourceUtils.a(System.currentTimeMillis(), this.a.g());
        Intrinsics.checkNotNullExpressionValue(a, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC2517l1.a.a.c(uVar, tVar, qVar, new C2571o1.y(a)).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Wd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Wd.d(Wd.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2343b6
    public void onAdInstanceDidShow() {
        L8 l8 = this.g;
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        InterfaceC2517l1.a.a.b(new C2571o1.w(l8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new Runnable() { // from class: com.ironsource.Wd$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Wd.e(Wd.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Wd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Xd xd = this$0.k;
        if (xd != null) {
            xd.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Wd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Xd xd = this$0.k;
        if (xd != null) {
            xd.onRewardedAdDismissed();
        }
    }

    public final void a(Xd xd) {
        this.k = xd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Wd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Xd xd = this$0.k;
        if (xd != null) {
            xd.onUserEarnedReward();
        }
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.i.put(this.j.getAdId(), this);
        if (!this.b.a(this.a)) {
            a(C2682u5.a.t());
        } else {
            InterfaceC2517l1.a.a.d(new InterfaceC2589p1[0]).a(this.d);
            this.b.a(activity, this.a);
        }
    }

    @Override // com.ironsource.InterfaceC2343b6
    public void a(String str) {
        a(C2682u5.a.c(new IronSourceError(0, str)));
    }

    private final void a(final IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        InterfaceC2517l1.a.a.a(new C2571o1.j(ironSourceError.getErrorCode()), new C2571o1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Wd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Wd.a(Wd.this, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Wd this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Xd xd = this$0.k;
        if (xd != null) {
            xd.onRewardedAdFailedToShow(error);
        }
    }

    public final void a() {
        InterfaceC2371cg.a(this.f, new Runnable() { // from class: com.ironsource.Wd$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Wd.a(Wd.this);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Wd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC2517l1.d.a.b().a(this$0.d);
        this$0.e.a(this$0.a);
    }

    public /* synthetic */ Wd(J9 j9, InterfaceC2355c0 interfaceC2355c0, Z1 z1, InterfaceC2642s1 interfaceC2642s1, InterfaceC2510kc interfaceC2510kc, InterfaceC2371cg interfaceC2371cg, L8 l8, L8.a aVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, interfaceC2355c0, z1, interfaceC2642s1, (i & 16) != 0 ? new C2528lc() : interfaceC2510kc, (i & 32) != 0 ? Q7.a : interfaceC2371cg, (i & 64) != 0 ? Jb.u.d().s() : l8, (i & 128) != 0 ? Jb.u.a().i() : aVar, map);
    }
}
