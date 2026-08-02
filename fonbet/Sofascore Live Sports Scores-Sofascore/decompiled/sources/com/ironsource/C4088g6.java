package com.ironsource;

import android.app.Activity;
import com.ironsource.C4088g6;
import com.ironsource.U3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import defpackage.dmi;
import defpackage.fsf;
import defpackage.k13;
import defpackage.km5;
import defpackage.ltb;
import defpackage.rdm;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.g6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4088g6 extends B implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {

    @Nullable
    private C4051e5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4088g6(@NotNull T0 t0, @NotNull C c, @NotNull I i) {
        super(t0, c, i, null, null, 24, null);
        t0.getClass();
        c.getClass();
        i.getClass();
    }

    private final List<String> K() {
        JSONObject optJSONObject = new N6().a(new String[]{L6.u}).optJSONObject(L6.u);
        if (optJSONObject == null) {
            return km5.a;
        }
        Object opt = optJSONObject.opt(L6.C);
        List list = opt instanceof List ? (List) opt : null;
        if (list == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final InterfaceC4106h6 L() {
        F s = s();
        if (s instanceof InterfaceC4106h6) {
            return (InterfaceC4106h6) s;
        }
        return null;
    }

    private final Map<String, Object> M() {
        List split$default;
        ltb ltbVar = new ltb();
        for (String str : K()) {
            split$default = StringsKt__StringsKt.split$default(str, new String[]{U3.j.b}, false, 2, 2, null);
            if (split$default.size() < 2) {
                IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                String str2 = (String) split$default.get(0);
                ltbVar.put("custom_" + str2, (String) split$default.get(1));
            }
        }
        return ltbVar.d();
    }

    @InterfaceC4307sb
    private final void N() {
        if (w()) {
            f().f().h().l("closed after failure");
            return;
        }
        if (!z()) {
            a(1000, "ad closed before ad opened");
            return;
        }
        this.z = new C4051e5();
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().f().a().a(k(), "");
        InterfaceC4106h6 L = L();
        if (L != null) {
            L.b(this);
        }
        c();
    }

    private final void O() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().f().a().d(k());
    }

    @InterfaceC4307sb
    private final void P() {
        if (w()) {
            f().f().h().l("rewarded after failure");
            return;
        }
        Map<String, Object> M = M();
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = f().a(currentTimeMillis, p());
        long a3 = C4051e5.a(this.z);
        LevelPlayReward a4 = Ib.v.d().D().a(k(), n().j().b().c());
        f().f().a().a(k(), a4.getName(), a4.getAmount(), currentTimeMillis, a2, a3, M, f().j());
        InterfaceC4106h6 L = L();
        if (L != null) {
            L.a(this, a4);
        }
    }

    @InterfaceC4307sb
    private final void Q() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        InterfaceC4106h6 L = L();
        if (L != null) {
            L.a(this);
        }
    }

    private final void R() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().f().a().i(k());
    }

    private final void S() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().f().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4088g6 c4088g6) {
        c4088g6.getClass();
        c4088g6.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4088g6 c4088g6) {
        c4088g6.getClass();
        c4088g6.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4088g6 c4088g6) {
        c4088g6.getClass();
        c4088g6.R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C4088g6 c4088g6) {
        c4088g6.getClass();
        c4088g6.S();
    }

    @Override // com.ironsource.B
    public void C() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object g = g();
        g.getClass();
        ((AdapterAdFullScreenInterface) g).loadAd(n().h(), ContextProvider.getInstance().getActiveContext(), this);
    }

    @InterfaceC4307sb
    public final void a(@NotNull Activity activity) {
        activity.getClass();
        IronLog.INTERNAL.verbose(a("placementName = " + k()));
        fsf fsfVar = new fsf();
        f().f().a().a(activity, k());
        a(new b(activity, fsfVar));
    }

    @Override // com.ironsource.B
    public void c() {
        if (g() instanceof AdapterAdFullScreenInterface) {
            a(new a());
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        f().a(new rdm(this, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        f().a(new rdm(this, 4));
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull Map<String, Object> map) {
        map.getClass();
        super.onAdOpened(map);
        f().a(new rdm(this, 2));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        f().a(new rdm(this, 1));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        f().a(new rdm(this, 5));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        f().a(new rdm(this, 3));
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4088g6 c4088g6) {
        c4088g6.getClass();
        c4088g6.Q();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g6$a */
    public static final class a extends xka implements Function0<Unit> {
        public a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Throwable th, C4088g6 c4088g6) {
            th.getClass();
            c4088g6.getClass();
            C4157k4.d().a(th);
            String q = dmi.q("destroyAd - exception = ", th.getLocalizedMessage());
            IronLog.INTERNAL.error(c4088g6.a(q));
            c4088g6.f().f().h().g(q);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.a;
        }

        public final void a() {
            try {
                Object g = C4088g6.this.g();
                g.getClass();
                ((AdapterAdFullScreenInterface) g).destroyAd(C4088g6.this.n().h());
            } catch (Throwable th) {
                C4088g6.this.f().a(new hh(1, th, C4088g6.this));
            }
        }
    }

    @Override // com.ironsource.B
    public void a(@NotNull K k) {
        k.getClass();
        k.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4088g6 c4088g6) {
        c4088g6.getClass();
        c4088g6.N();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g6$b */
    public static final class b extends xka implements Function0<Unit> {
        final /* synthetic */ Activity b;
        final /* synthetic */ fsf c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, fsf fsfVar) {
            super(0);
            this.b = activity;
            this.c = fsfVar;
        }

        public final void a() {
            try {
                if (C4088g6.this.g() instanceof AdapterAdFullScreenInterface) {
                    Object g = C4088g6.this.g();
                    g.getClass();
                    ((AdapterAdFullScreenInterface) g).showAd(C4088g6.this.i(), this.b, C4088g6.this);
                } else {
                    this.c.a = "showAd - adapter not instance of AdapterAdFullScreenInterface";
                    IronLog.INTERNAL.error(C4088g6.this.a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                    C4088g6.this.f().a(new hh(2, C4088g6.this, this.c));
                }
            } catch (Throwable th) {
                T0 f = C4088g6.this.f();
                final fsf fsfVar = this.c;
                final C4088g6 c4088g6 = C4088g6.this;
                f.a(new Runnable() { // from class: com.ironsource.ih
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4088g6.b.a(th, fsfVar, c4088g6);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4088g6 c4088g6, fsf fsfVar) {
            c4088g6.getClass();
            fsfVar.getClass();
            c4088g6.f().f().h().g((String) fsfVar.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Throwable th, fsf fsfVar, C4088g6 c4088g6) {
            th.getClass();
            fsfVar.getClass();
            c4088g6.getClass();
            C4157k4.d().a(th);
            String q = dmi.q("showAd - exception = ", th.getMessage());
            fsfVar.a = q;
            IronLog.INTERNAL.error(c4088g6.a(q));
            c4088g6.f().f().h().g((String) fsfVar.a);
            c4088g6.a(A0.h(c4088g6.n().i()), (String) fsfVar.a);
        }
    }
}
