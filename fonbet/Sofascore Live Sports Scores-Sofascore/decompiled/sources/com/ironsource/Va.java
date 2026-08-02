package com.ironsource;

import android.app.Activity;
import com.ironsource.C4052e6;
import com.ironsource.C4243p0;
import com.ironsource.E0;
import com.ironsource.InterfaceC4153k0;
import com.ironsource.V0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import defpackage.akk;
import defpackage.dmi;
import defpackage.ecg;
import defpackage.kdc;
import defpackage.kx0;
import defpackage.og4;
import defpackage.q12;
import defpackage.zjk;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Va implements InterfaceC4034d6 {

    @NotNull
    public static final a p = new a(null);

    @NotNull
    public static final String q = "Fullscreen Ad Internal";

    @NotNull
    private final LevelPlay.AdFormat a;

    @NotNull
    private final String b;

    @NotNull
    private final b c;

    @NotNull
    private final C4243p0 d;

    @NotNull
    private final C4016c6 e;

    @NotNull
    private final X0 f;

    @NotNull
    private final InterfaceC4404y0 g;

    @NotNull
    private final F7 h;

    @NotNull
    private final InterfaceC4193m4 i;

    @Nullable
    private C3998b6 j;

    @Nullable
    private Wa k;

    @NotNull
    private final W8 l;

    @NotNull
    private final UUID m;

    @NotNull
    private InterfaceC4213n6 n;

    @Nullable
    private C4051e5 o;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface b {
        @Nullable
        Double getBidFloor();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* loaded from: classes6.dex */
    public static final class c {

        @NotNull
        private final C4243p0 a;

        @NotNull
        private final C4016c6 b;

        @NotNull
        private final F7 c;

        @NotNull
        private final InterfaceC4193m4 d;

        @NotNull
        private final C4303s7 e;

        @NotNull
        private final b f;

        @NotNull
        private final X0 g;

        public c(@NotNull C4243p0 c4243p0, @NotNull C4016c6 c4016c6, @NotNull F7 f7, @NotNull InterfaceC4193m4 interfaceC4193m4, @NotNull C4303s7 c4303s7, @NotNull b bVar, @NotNull X0 x0) {
            c4243p0.getClass();
            c4016c6.getClass();
            f7.getClass();
            interfaceC4193m4.getClass();
            c4303s7.getClass();
            bVar.getClass();
            x0.getClass();
            this.a = c4243p0;
            this.b = c4016c6;
            this.c = f7;
            this.d = interfaceC4193m4;
            this.e = c4303s7;
            this.f = bVar;
            this.g = x0;
        }

        @NotNull
        public final C4016c6 a() {
            return this.b;
        }

        @NotNull
        public final C4243p0 b() {
            return this.a;
        }

        @NotNull
        public final X0 c() {
            return this.g;
        }

        @NotNull
        public final b d() {
            return this.f;
        }

        @NotNull
        public final InterfaceC4193m4 e() {
            return this.d;
        }

        @NotNull
        public final C4303s7 f() {
            return this.e;
        }

        @NotNull
        public final F7 g() {
            return this.c;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class d implements InterfaceC4249p6 {
        final /* synthetic */ C4100h0 b;

        public d(C4100h0 c4100h0) {
            this.b = c4100h0;
        }

        @Override // com.ironsource.InterfaceC4249p6
        @NotNull
        public C4231o6 a(boolean z, @NotNull InterfaceC4284r6 interfaceC4284r6) {
            interfaceC4284r6.getClass();
            AbstractC4386x0 a = Va.this.g().a(z, this.b);
            return new C4231o6(Ib.v.c(), new T0(Va.this.f(), a, E0.b.MEDIATION), a, interfaceC4284r6, Va.this.l, null, null, null, null, 480, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Va(@NotNull LevelPlay.AdFormat adFormat, @NotNull String str, @NotNull b bVar, @NotNull C4243p0 c4243p0, @NotNull C4016c6 c4016c6, @NotNull X0 x0, @NotNull InterfaceC4404y0 interfaceC4404y0, @NotNull F7 f7, @NotNull InterfaceC4193m4 interfaceC4193m4, @NotNull C4303s7 c4303s7) {
        adFormat.getClass();
        str.getClass();
        bVar.getClass();
        c4243p0.getClass();
        c4016c6.getClass();
        x0.getClass();
        interfaceC4404y0.getClass();
        f7.getClass();
        interfaceC4193m4.getClass();
        c4303s7.getClass();
        this.a = adFormat;
        this.b = str;
        this.c = bVar;
        this.d = c4243p0;
        this.e = c4016c6;
        this.f = x0;
        this.g = interfaceC4404y0;
        this.h = f7;
        this.i = interfaceC4193m4;
        this.l = new W8(c4243p0);
        this.m = c4303s7.a();
        this.n = new C4052e6(this, null, 2, 0 == true ? 1 : 0);
        c4243p0.a(new zjk(this, 0));
    }

    @InterfaceC4307sb
    private final C3998b6 b() {
        C4077fd c4077fd = null;
        C4100h0 c4100h0 = new C4100h0(com.unity3d.mediation.a.a(this.a), this.m, this.b, c4077fd, this.h.A().a(), this.c.getBidFloor(), 8, null);
        d dVar = new d(c4100h0);
        C4391x5 f = this.d.f();
        C4243p0 c4243p0 = this.d;
        f.a(new C0(c4243p0, c4100h0, c4243p0.b(this.a, this.b).b().b()));
        return this.e.a(this, this.d, c4100h0, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Va va) {
        va.getClass();
        va.d.f().f().a();
        va.n.loadAd();
    }

    private final void p() {
        Double bidFloor = this.c.getBidFloor();
        if (bidFloor != null) {
            this.d.f().f().a(bidFloor.doubleValue());
        }
    }

    @NotNull
    public final LevelPlayReward a(@Nullable String str) {
        L7 D = this.h.D();
        F8 f = this.h.f();
        Sc f2 = this.d.f().f();
        V0 a2 = this.f.a(this.b, this.a, f);
        if (!(a2 instanceof V0.a)) {
            LevelPlayReward a3 = D.a(str, this.b);
            this.d.a(new kdc(24, f2, a3, str));
            return a3;
        }
        V0.a aVar = (V0.a) a2;
        IronLog.INTERNAL.warning(C4243p0.a(this.d, dmi.q("getReward() returned a default reward. Reason: ", aVar.b()), (String) null, 2, (Object) null));
        LevelPlayReward levelPlayReward = new LevelPlayReward("", 0);
        this.d.a(new kx0(f2, levelPlayReward, str, aVar, 13));
        return levelPlayReward;
    }

    public final boolean m() {
        InterfaceC4153k0 c2 = this.n.c();
        this.d.a(new ecg(17, c2, this));
        return c2.a();
    }

    public final void n() {
        this.o = new C4051e5();
        this.d.a(new zjk(this, 1));
    }

    @InterfaceC4307sb
    public final void o() {
        a(new C4159k6(this, this.i));
        c().b();
    }

    @Override // com.ironsource.InterfaceC4034d6
    public void onAdClicked() {
        this.n.onAdClicked();
    }

    @Override // com.ironsource.InterfaceC4034d6
    public void onAdClosed() {
        this.n.onAdClosed();
    }

    @Override // com.ironsource.InterfaceC4034d6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.n.onAdDisplayed(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4034d6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.n.onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4034d6
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        this.n.onAdLoadFailed(levelPlayAdError);
    }

    @Override // com.ironsource.InterfaceC4034d6
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.n.onAdLoaded(levelPlayAdInfo);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
            str.getClass();
            adFormat.getClass();
            C4243p0 a = C4243p0.a.a(com.unity3d.mediation.a.a(adFormat), E0.b.MEDIATION);
            if (!a.a()) {
                a.a(new ecg(18, a, str));
                return false;
            }
            D3 a2 = Ib.v.d().p().a(str, adFormat);
            boolean d = a2.d();
            a.a(new q12(a, str, a2, d, 3));
            return d;
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4243p0 c4243p0, String str) {
            c4243p0.getClass();
            str.getClass();
            c4243p0.f().a().a(str, W0.b, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4243p0 c4243p0, String str, D3 d3, boolean z) {
            c4243p0.getClass();
            str.getClass();
            d3.getClass();
            c4243p0.f().a().a(str, d3.e(), z);
        }
    }

    @NotNull
    public final LevelPlay.AdFormat d() {
        return this.a;
    }

    @NotNull
    public final UUID e() {
        return this.m;
    }

    @NotNull
    public final C4243p0 f() {
        return this.d;
    }

    @NotNull
    public final InterfaceC4404y0 g() {
        return this.g;
    }

    @NotNull
    public final String h() {
        return this.b;
    }

    @NotNull
    public final b i() {
        return this.c;
    }

    @NotNull
    public final InterfaceC4193m4 j() {
        return this.i;
    }

    @Nullable
    public final Wa k() {
        return this.k;
    }

    @NotNull
    public final F7 l() {
        return this.h;
    }

    @InterfaceC4307sb
    @NotNull
    public final C3998b6 c() {
        C3998b6 c3998b6 = this.j;
        if (c3998b6 != null) {
            return c3998b6;
        }
        C3998b6 b2 = b();
        this.j = b2;
        return b2;
    }

    public final void b(@NotNull String str) {
        str.getClass();
        this.d.f().h().f("Fullscreen Ad Internal - " + str);
    }

    public /* synthetic */ Va(LevelPlay.AdFormat adFormat, String str, b bVar, C4243p0 c4243p0, C4016c6 c4016c6, X0 x0, InterfaceC4404y0 interfaceC4404y0, F7 f7, InterfaceC4193m4 interfaceC4193m4, C4303s7 c4303s7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, str, bVar, c4243p0, c4016c6, x0, interfaceC4404y0, (i & 128) != 0 ? Ib.v.d() : f7, interfaceC4193m4, c4303s7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va va) {
        va.getClass();
        va.d.f().a(new C4206n(com.unity3d.mediation.a.a(va.a), va.m, va.b));
        va.p();
    }

    public final void a(@NotNull InterfaceC4213n6 interfaceC4213n6) {
        interfaceC4213n6.getClass();
        this.n = interfaceC4213n6;
    }

    public final void a(@Nullable LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        IronLog.INTERNAL.verbose(C4243p0.a(this.d, "setImpressionDataListener listener: " + levelPlayImpressionDataListener, (String) null, 2, (Object) null));
        this.d.a(new ecg(15, this, levelPlayImpressionDataListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va va, LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        va.getClass();
        va.l.a(levelPlayImpressionDataListener);
    }

    public final void a(@NotNull Activity activity, @Nullable String str) {
        activity.getClass();
        this.d.a(new kdc(23, activity, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, Va va, String str) {
        activity.getClass();
        va.getClass();
        ContextProvider.getInstance().updateActivity(activity);
        va.d.f().h().c();
        va.n.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4153k0 interfaceC4153k0, Va va) {
        interfaceC4153k0.getClass();
        va.getClass();
        va.d.f().e().a(Boolean.valueOf(interfaceC4153k0.a()), interfaceC4153k0 instanceof InterfaceC4153k0.a ? ((InterfaceC4153k0.a) interfaceC4153k0).c() : null);
    }

    @InterfaceC4307sb
    public final void a(@NotNull C4052e6.a aVar) {
        aVar.getClass();
        this.n = new C4052e6(this, aVar);
    }

    @Override // com.ironsource.InterfaceC4034d6
    public void a(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        this.n.a(levelPlayAdError);
    }

    @Override // com.ironsource.InterfaceC4034d6
    public void a() {
        this.n.a();
    }

    @Override // com.ironsource.InterfaceC4034d6
    public void a(@NotNull LevelPlayReward levelPlayReward) {
        levelPlayReward.getClass();
        LevelPlayAdInfo b2 = this.n.b();
        IronLog.INTERNAL.verbose(C4243p0.a(this.d, "onAdRewarded adInfo: " + b2 + " reward: " + levelPlayReward, (String) null, 2, (Object) null));
        this.d.b(new kdc(25, this, levelPlayReward, b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va va, LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo) {
        va.getClass();
        levelPlayReward.getClass();
        levelPlayAdInfo.getClass();
        Wa wa = va.k;
        if (wa != null) {
            wa.onAdRewarded(levelPlayReward, levelPlayAdInfo);
        }
    }

    public final void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        IronLog.INTERNAL.verbose(C4243p0.a(this.d, "onAdLoaded adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        this.d.a(new og4(this, C4051e5.a(this.o), 1));
        this.d.b(new ecg(16, this, levelPlayAdInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va va, long j) {
        va.getClass();
        va.d.f().f().a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va va, LevelPlayAdInfo levelPlayAdInfo) {
        va.getClass();
        levelPlayAdInfo.getClass();
        Wa wa = va.k;
        if (wa != null) {
            wa.onAdLoaded(levelPlayAdInfo);
        }
    }

    public static /* synthetic */ void a(Va va, LevelPlayAdError levelPlayAdError, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        va.a(levelPlayAdError, j);
    }

    public final void a(@Nullable LevelPlayAdError levelPlayAdError, long j) {
        IronLog.INTERNAL.verbose(C4243p0.a(this.d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.d.a(new defpackage.jd(this, j, levelPlayAdError, 4));
        this.d.b(new akk(levelPlayAdError, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va va, long j, LevelPlayAdError levelPlayAdError) {
        String str;
        va.getClass();
        Sc f = va.d.f().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (str = levelPlayAdError.getErrorMessage()) == null) {
            str = "";
        }
        f.a(j, errorCode, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, Va va) {
        Wa wa;
        va.getClass();
        if (levelPlayAdError == null || (wa = va.k) == null) {
            return;
        }
        wa.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(@NotNull LevelPlayAdError levelPlayAdError, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdError.getClass();
        levelPlayAdInfo.getClass();
        IronLog.INTERNAL.verbose(C4243p0.a(this.d, "onAdDisplayFailed error: " + levelPlayAdError + ", adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        this.d.a(new akk(this, levelPlayAdError));
        this.d.b(new kdc(26, this, levelPlayAdError, levelPlayAdInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va va, LevelPlayAdError levelPlayAdError) {
        va.getClass();
        levelPlayAdError.getClass();
        va.d.f().h().a(levelPlayAdError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va va, LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        va.getClass();
        levelPlayAdError.getClass();
        levelPlayAdInfo.getClass();
        Wa wa = va.k;
        if (wa != null) {
            wa.onAdDisplayFailed(levelPlayAdError, levelPlayAdInfo);
        }
    }

    public final void a(@Nullable Wa wa) {
        this.k = wa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sc sc, LevelPlayReward levelPlayReward, String str, V0 v0) {
        sc.getClass();
        levelPlayReward.getClass();
        v0.getClass();
        sc.a(levelPlayReward, str, ((V0.a) v0).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sc sc, LevelPlayReward levelPlayReward, String str) {
        sc.getClass();
        levelPlayReward.getClass();
        Sc.a(sc, levelPlayReward, str, null, 4, null);
    }
}
