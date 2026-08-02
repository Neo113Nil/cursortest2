package com.ironsource;

import android.app.Activity;
import com.ironsource.C4467o1;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;
import xsna.fs2;
import xsna.gs2;
import xsna.hod;
import xsna.kv2;
import xsna.w29;
import xsna.zcl;
import xsna.zv4;

/* loaded from: classes13.dex */
public final class Wd implements InterfaceC4275d6 {
    private K9 a;
    private InterfaceC4251c0 b;
    private Z1 c;
    private InterfaceC4538s1 d;
    private InterfaceC4424lc e;
    private InterfaceC4357hg f;
    private M8 g;
    private M8.a h;
    private final Map<String, Wd> i;
    private RewardedAdInfo j;
    private Xd k;

    public Wd(K9 k9, InterfaceC4251c0 interfaceC4251c0, Z1 z1, InterfaceC4538s1 interfaceC4538s1, InterfaceC4424lc interfaceC4424lc, InterfaceC4357hg interfaceC4357hg, M8 m8, M8.a aVar, Map<String, Wd> map) {
        this.a = k9;
        this.b = interfaceC4251c0;
        this.c = z1;
        this.d = interfaceC4538s1;
        this.e = interfaceC4424lc;
        this.f = interfaceC4357hg;
        this.g = m8;
        this.h = aVar;
        this.i = map;
        this.j = new RewardedAdInfo(k9.f(), this.a.e());
        C4239b6 c4239b6 = new C4239b6();
        this.a.a(c4239b6);
        c4239b6.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Wd wd) {
        Xd xd = wd.k;
        if (xd != null) {
            xd.onRewardedAdShown();
        }
    }

    public final void a(RewardedAdInfo rewardedAdInfo) {
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
        InterfaceC4413l1.a.a.a(a).a(this.d);
        return a;
    }

    public final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC4275d6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC4413l1.a.a.f(new InterfaceC4485p1[0]).a(this.d);
    }

    @Override // com.ironsource.InterfaceC4275d6
    public void onAdInstanceDidClick() {
        InterfaceC4413l1.a.a.a().a(this.d);
        this.f.a(new w29(this, 15));
    }

    @Override // com.ironsource.InterfaceC4275d6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC4413l1.a.a.a(new InterfaceC4485p1[0]).a(this.d);
        this.f.a(new gs2(this, 18));
    }

    @Override // com.ironsource.InterfaceC4275d6
    public void onAdInstanceDidReward(String str, int i) {
        InterfaceC4413l1.a.a.c(new C4467o1.u("Virtual Item"), new C4467o1.t(1), new C4467o1.q("DefaultRewardedVideo"), new C4467o1.y(IronSourceUtils.a(System.currentTimeMillis(), this.a.g()))).a(this.d);
        this.f.a(new kv2(this, 18));
    }

    @Override // com.ironsource.InterfaceC4275d6
    public void onAdInstanceDidShow() {
        M8 m8 = this.g;
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        InterfaceC4413l1.a.a.b(new C4467o1.w(m8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new fs2(this, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Wd wd) {
        Xd xd = wd.k;
        if (xd != null) {
            xd.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Wd wd) {
        Xd xd = wd.k;
        if (xd != null) {
            xd.onRewardedAdDismissed();
        }
    }

    public final void a(Xd xd) {
        this.k = xd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Wd wd) {
        Xd xd = wd.k;
        if (xd != null) {
            xd.onUserEarnedReward();
        }
    }

    public final void a(Activity activity) {
        this.i.put(this.j.getAdId(), this);
        if (!this.b.a(this.a)) {
            a(C4578u5.a.t());
        } else {
            InterfaceC4413l1.a.a.d(new InterfaceC4485p1[0]).a(this.d);
            this.b.a(activity, this.a);
        }
    }

    @Override // com.ironsource.InterfaceC4275d6
    public void a(String str) {
        a(C4578u5.a.c(new IronSourceError(0, str)));
    }

    private final void a(IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        InterfaceC4413l1.a.a.a(new C4467o1.j(ironSourceError.getErrorCode()), new C4467o1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new zv4(10, this, ironSourceError));
    }

    public /* synthetic */ Wd(K9 k9, InterfaceC4251c0 interfaceC4251c0, Z1 z1, InterfaceC4538s1 interfaceC4538s1, InterfaceC4424lc interfaceC4424lc, InterfaceC4357hg interfaceC4357hg, M8 m8, M8.a aVar, Map map, int i, zcl zclVar) {
        this(k9, interfaceC4251c0, z1, interfaceC4538s1, (i & 16) != 0 ? new C4442mc() : interfaceC4424lc, (i & 32) != 0 ? R7.a : interfaceC4357hg, (i & 64) != 0 ? Kb.u.d().s() : m8, (i & 128) != 0 ? Kb.u.a().i() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Wd wd, IronSourceError ironSourceError) {
        Xd xd = wd.k;
        if (xd != null) {
            xd.onRewardedAdFailedToShow(ironSourceError);
        }
    }

    public final void a() {
        InterfaceC4357hg.a(this.f, new hod(this, 22), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Wd wd) {
        InterfaceC4413l1.d.a.b().a(wd.d);
        wd.e.a(wd.a);
    }
}
