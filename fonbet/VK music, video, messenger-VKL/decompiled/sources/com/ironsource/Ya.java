package com.ironsource;

import android.app.Activity;
import com.ironsource.C4347h6;
import com.ironsource.C4484p0;
import com.ironsource.F0;
import com.ironsource.InterfaceC4394k0;
import com.ironsource.X0;
import com.ironsource.Ya;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import xsna.boy0;
import xsna.bpn0;
import xsna.go9;
import xsna.gzs;
import xsna.he6;
import xsna.i6k;
import xsna.kw6;
import xsna.n52;
import xsna.nx3;
import xsna.oo6;
import xsna.qye;
import xsna.sx3;
import xsna.vc2;
import xsna.vke;
import xsna.w3t;
import xsna.w9j;
import xsna.wc2;
import xsna.wq8;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Ya implements InterfaceC4329g6 {
    public static final a o = new a(null);
    public static final String p = "Fullscreen Ad Internal";
    private final LevelPlay.AdFormat a;
    private final String b;
    private final b c;
    private final C4484p0 d;
    private final C4311f6 e;
    private final Z0 f;
    private final InterfaceC4645y0 g;
    private final I7 h;
    private final InterfaceC4488p4 i;
    private final Lazy j;
    private Za k;
    private final UUID l;
    private InterfaceC4508q6 m;
    private C4328g5 n;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final boolean a(String str, LevelPlay.AdFormat adFormat) {
            C4484p0 a = C4484p0.a.a(com.unity3d.mediation.a.a(adFormat), F0.b.MEDIATION);
            if (!a.f()) {
                a.d().a().a(str, Y0.b, false);
                return false;
            }
            G3 a2 = Kb.u.d().p().a(str, adFormat);
            boolean d = a2.d();
            a.d().a().a(str, a2.e(), d);
            return d;
        }

        private a() {
        }
    }

    public interface b {
        Double getBidFloor();
    }

    public static final class c {
        private final C4484p0 a;
        private final C4311f6 b;
        private final I7 c;
        private final InterfaceC4488p4 d;
        private final C4616w7 e;
        private final b f;
        private final Z0 g;

        public c(C4484p0 c4484p0, C4311f6 c4311f6, I7 i7, InterfaceC4488p4 interfaceC4488p4, C4616w7 c4616w7, b bVar, Z0 z0) {
            this.a = c4484p0;
            this.b = c4311f6;
            this.c = i7;
            this.d = interfaceC4488p4;
            this.e = c4616w7;
            this.f = bVar;
            this.g = z0;
        }

        public final C4311f6 a() {
            return this.b;
        }

        public final C4484p0 b() {
            return this.a;
        }

        public final Z0 c() {
            return this.g;
        }

        public final b d() {
            return this.f;
        }

        public final InterfaceC4488p4 e() {
            return this.d;
        }

        public final C4616w7 f() {
            return this.e;
        }

        public final I7 g() {
            return this.c;
        }
    }

    public static final class d extends Lambda implements gzs<C4293e6> {
        public d() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4293e6 invoke() {
            return Ya.this.b();
        }
    }

    public static final class e implements InterfaceC4543s6 {
        final /* synthetic */ C4341h0 b;

        public e(C4341h0 c4341h0) {
            this.b = c4341h0;
        }

        @Override // com.ironsource.InterfaceC4543s6
        public C4525r6 a(boolean z, InterfaceC4579u6 interfaceC4579u6) {
            AbstractC4627x0 a = Ya.this.g().a(z, this.b);
            return new C4525r6(Kb.u.c(), new V0(Ya.this.f(), a, F0.b.MEDIATION), a, interfaceC4579u6, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ya(LevelPlay.AdFormat adFormat, String str, b bVar, C4484p0 c4484p0, C4311f6 c4311f6, Z0 z0, InterfaceC4645y0 interfaceC4645y0, I7 i7, InterfaceC4488p4 interfaceC4488p4, C4616w7 c4616w7) {
        this.a = adFormat;
        this.b = str;
        this.c = bVar;
        this.d = c4484p0;
        this.e = c4311f6;
        this.f = z0;
        this.g = interfaceC4645y0;
        this.h = i7;
        this.i = interfaceC4488p4;
        this.j = new bpn0(new d());
        UUID a2 = c4616w7.a();
        this.l = a2;
        this.m = new C4347h6(this, null, 2, 0 == true ? 1 : 0);
        c4484p0.d().a(new C4447n(com.unity3d.mediation.a.a(adFormat), a2, str));
        p();
    }

    public final C4293e6 c() {
        return (C4293e6) this.j.getValue();
    }

    public final LevelPlay.AdFormat d() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4329g6
    public void onAdClicked() {
        this.d.c(new wc2(this, 21));
    }

    @Override // com.ironsource.InterfaceC4329g6
    public void onAdClosed() {
        this.d.c(new sx3(this, 15));
    }

    @Override // com.ironsource.InterfaceC4329g6
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        this.d.c(new xsna.z6(5, this, levelPlayAdInfo));
    }

    @Override // com.ironsource.InterfaceC4329g6
    public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        this.d.c(new qye(15, this, levelPlayAdInfo));
    }

    @Override // com.ironsource.InterfaceC4329g6
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        this.d.c(new wq8(9, this, levelPlayAdError));
    }

    @Override // com.ironsource.InterfaceC4329g6
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        this.d.c(new xsna.e6(11, this, levelPlayAdInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ya ya) {
        ya.d.d().f().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ya ya) {
        ya.d.d().f().a();
        ya.m.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ya ya, LevelPlayAdInfo levelPlayAdInfo) {
        ya.m.onAdLoaded(levelPlayAdInfo);
    }

    private final void p() {
        Double bidFloor = this.c.getBidFloor();
        if (bidFloor != null) {
            this.d.d().f().a(bidFloor.doubleValue());
        }
    }

    public final void a(Za za) {
        this.k = za;
    }

    public final UUID e() {
        return this.l;
    }

    public final C4484p0 f() {
        return this.d;
    }

    public final InterfaceC4645y0 g() {
        return this.g;
    }

    public final String h() {
        return this.b;
    }

    public final b i() {
        return this.c;
    }

    public final InterfaceC4488p4 j() {
        return this.i;
    }

    public final Za k() {
        return this.k;
    }

    public final I7 l() {
        return this.h;
    }

    public final boolean m() {
        InterfaceC4394k0 c2 = this.m.c();
        this.d.d().e().a(Boolean.valueOf(c2.a()), c2 instanceof InterfaceC4394k0.a ? ((InterfaceC4394k0.a) c2).c() : null);
        return c2.a();
    }

    public final void n() {
        if (this.d.f()) {
            this.n = new C4328g5();
            this.d.c(new oo6(this, 15));
        } else {
            this.d.c(new nx3(this, 22));
            a(this, new LevelPlayAdError(this.l.toString(), this.b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
        }
    }

    public final void o() {
        a(new C4454n6(this, this.i));
        c().m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ya ya, LevelPlayAdInfo levelPlayAdInfo) {
        ya.m.onAdDisplayed(levelPlayAdInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ya ya) {
        ya.m.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Ya ya) {
        ya.m.onAdClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Ya ya) {
        ya.m.a();
    }

    public final void a(InterfaceC4508q6 interfaceC4508q6) {
        this.m = interfaceC4508q6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ya ya, LevelPlayAdError levelPlayAdError) {
        ya.m.a(levelPlayAdError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ya ya, LevelPlayAdError levelPlayAdError) {
        ya.m.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(Activity activity, String str) {
        this.d.c(new vke(activity, this, str, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, Ya ya, String str) {
        ContextProvider.getInstance().updateActivity(activity);
        ya.d.d().h().d();
        ya.m.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ya ya, LevelPlayAdInfo levelPlayAdInfo) {
        ya.m.onAdInfoChanged(levelPlayAdInfo);
    }

    public final void b(String str) {
        this.d.d().h().f("Fullscreen Ad Internal - ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4293e6 b() {
        C4336gd c4336gd = null;
        C4341h0 c4341h0 = new C4341h0(com.unity3d.mediation.a.a(this.a), this.l, this.b, c4336gd, this.h.A().a(), this.c.getBidFloor(), 8, null);
        e eVar = new e(c4341h0);
        C4668z5 d2 = this.d.d();
        C4484p0 c4484p0 = this.d;
        d2.a(new D0(c4484p0, c4341h0, c4484p0.b(this.a, this.b).b().b()));
        return this.e.a(this, this.d, c4341h0, eVar);
    }

    public final void a(C4347h6.a aVar) {
        this.m = new C4347h6(this, aVar);
    }

    @Override // com.ironsource.InterfaceC4329g6
    public void a(LevelPlayAdError levelPlayAdError) {
        this.d.c(new kw6(11, this, levelPlayAdError));
    }

    @Override // com.ironsource.InterfaceC4329g6
    public void a() {
        this.d.c(new n52(this, 18));
    }

    @Override // com.ironsource.InterfaceC4329g6
    public void a(LevelPlayReward levelPlayReward) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.d, "onAdRewarded state.getAdInfo: " + this.m.b() + " reward: " + levelPlayReward, (String) null, 2, (Object) null));
        this.d.c(new i6k(9, this, levelPlayReward));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya ya, LevelPlayReward levelPlayReward) {
        LevelPlayAdInfo b2 = ya.m.b();
        IronLog.INTERNAL.verbose(C4484p0.a(ya.d, "onAdRewarded adInfo: " + b2 + " reward: " + levelPlayReward, (String) null, 2, (Object) null));
        ya.d.d(new vc2(ya, levelPlayReward, b2, 5));
    }

    public /* synthetic */ Ya(LevelPlay.AdFormat adFormat, String str, b bVar, C4484p0 c4484p0, C4311f6 c4311f6, Z0 z0, InterfaceC4645y0 interfaceC4645y0, I7 i7, InterfaceC4488p4 interfaceC4488p4, C4616w7 c4616w7, int i, zcl zclVar) {
        this(adFormat, str, bVar, c4484p0, c4311f6, z0, interfaceC4645y0, (i & 128) != 0 ? Kb.u.d() : i7, interfaceC4488p4, c4616w7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya ya, LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo) {
        Za za = ya.k;
        if (za != null) {
            za.onAdRewarded(levelPlayReward, levelPlayAdInfo);
        }
    }

    public final void a(LevelPlayAdInfo levelPlayAdInfo) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.d, "onAdLoaded adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        final long a2 = C4328g5.a(this.n);
        this.d.c(new Runnable() { // from class: xsna.t4y0
            @Override // java.lang.Runnable
            public final void run() {
                Ya.a(Ya.this, a2);
            }
        });
        this.d.d(new w9j(8, this, levelPlayAdInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya ya, long j) {
        ya.d.d().f().a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya ya, LevelPlayAdInfo levelPlayAdInfo) {
        Za za = ya.k;
        if (za != null) {
            za.onAdLoaded(levelPlayAdInfo);
        }
    }

    public static /* synthetic */ void a(Ya ya, LevelPlayAdError levelPlayAdError, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ya.a(levelPlayAdError, j);
    }

    public final void a(final LevelPlayAdError levelPlayAdError, final long j) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.d.c(new Runnable() { // from class: xsna.u4y0
            @Override // java.lang.Runnable
            public final void run() {
                Ya.a(Ya.this, j, levelPlayAdError);
            }
        });
        this.d.d(new he6(7, levelPlayAdError, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya ya, long j, LevelPlayAdError levelPlayAdError) {
        String str;
        Tc f = ya.d.d().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (str = levelPlayAdError.getErrorMessage()) == null) {
            str = "";
        }
        f.a(j, errorCode, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, Ya ya) {
        Za za;
        if (levelPlayAdError == null || (za = ya.k) == null) {
            return;
        }
        za.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.d, "onAdDisplayFailed error: " + levelPlayAdError + ", adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        this.d.c(new w3t(4, this, levelPlayAdError));
        this.d.d(new boy0(this, levelPlayAdError, levelPlayAdInfo, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya ya, LevelPlayAdError levelPlayAdError) {
        ya.d.d().h().a(levelPlayAdError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya ya, LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        Za za = ya.k;
        if (za != null) {
            za.onAdDisplayFailed(levelPlayAdError, levelPlayAdInfo);
        }
    }

    public final LevelPlayReward a(String str) {
        O7 C = this.h.C();
        I8 f = this.h.f();
        Tc f2 = this.d.d().f();
        X0 a2 = this.f.a(this.b, this.a, f);
        if (a2 instanceof X0.a) {
            X0.a aVar = (X0.a) a2;
            IronLog.INTERNAL.warning(C4484p0.a(this.d, go9.b("getReward() returned a default reward. Reason: ", aVar.b()), (String) null, 2, (Object) null));
            LevelPlayReward levelPlayReward = new LevelPlayReward("", 0);
            f2.a(levelPlayReward, str, aVar.b());
            return levelPlayReward;
        }
        LevelPlayReward a3 = C.a(str, this.b);
        Tc.a(f2, a3, str, null, 4, null);
        return a3;
    }
}
