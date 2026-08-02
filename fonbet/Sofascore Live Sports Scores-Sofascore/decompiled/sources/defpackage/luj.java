package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.moloco.sdk.acm.d;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.y;
import com.moloco.sdk.internal.publisher.o0;
import com.moloco.sdk.internal.services.b0;
import com.moloco.sdk.j2;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.service.WeeklyChallengeWorker;
import com.sofascore.results.wc26.widget.configurationActivity.WorldCupWidgetConfigActivity;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsFragment;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class luj extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ luj(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = 2;
        switch (this.r) {
            case 0:
                return new luj((muj) this.t, rq3Var, 0);
            case 1:
                return new luj((c0k) this.t, rq3Var, 1);
            case 2:
                return new luj((k0k) this.t, rq3Var, i);
            case 3:
                return new luj((i1k) this.t, rq3Var, 3);
            case 4:
                return new luj((u3k) this.t, rq3Var, 4);
            case 5:
                return new luj((g4k) this.t, rq3Var, 5);
            case 6:
                return new luj((bfk) this.t, rq3Var, 6);
            case 7:
                return new luj((j3l) this.t, rq3Var, 7);
            case 8:
                return new luj((p3l) this.t, rq3Var, 8);
            case 9:
                return new luj((WeeklyChallengeWorker) this.t, rq3Var, 9);
            case 10:
                return new luj((WeeklyPredictionsFragment) this.t, rq3Var, 10);
            case 11:
                return new luj((WorldCupWidgetConfigActivity) this.t, rq3Var, 11);
            case 12:
                return new luj(i, rq3Var);
            case 13:
                return new luj((d) this.t, rq3Var, 13);
            case 14:
                return new luj((h) this.t, rq3Var, 14);
            case 15:
                return new luj((aq4) this.t, rq3Var, 15);
            case 16:
                return new luj((b0) this.t, rq3Var, 16);
            case 17:
                return new luj((n) this.t, rq3Var, 17);
            case 18:
                return new luj((c) this.t, rq3Var, 18);
            case 19:
                return new luj((f) this.t, rq3Var, 19);
            case 20:
                return new luj((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c) this.t, rq3Var, 20);
            case 21:
                return new luj((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c) this.t, rq3Var, 21);
            case 22:
                return new luj((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c) this.t, rq3Var, 22);
            case 23:
                return new luj((com.appsflyer.f) this.t, rq3Var, 23);
            case 24:
                return new luj((XmlPullParser) this.t, rq3Var, 24);
            case 25:
                return new luj((m) this.t, rq3Var, 25);
            case 26:
                return new luj((g) this.t, rq3Var, 26);
            case 27:
                return new luj((i) this.t, rq3Var, 27);
            case 28:
                return new luj((b) this.t, rq3Var, 28);
            default:
                return new luj((e) this.t, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 25:
                ((luj) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            case 27:
                ((luj) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
        }
        return ((luj) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x04bd, code lost:
    
        if (r0 == r3) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x048f, code lost:
    
        if (r4 == r3) goto L260;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0412  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object r;
        Object P;
        Object T;
        Object c;
        Iterator it;
        Iterator it2;
        KType kType;
        Object a;
        NetworkCapabilities networkCapabilities;
        int i = 16;
        int i2 = 17;
        int i3 = 26;
        int i4 = 27;
        int i5 = 2;
        int i6 = 3;
        int i7 = 0;
        int i8 = 1;
        rq3 rq3Var = null;
        switch (this.r) {
            case 0:
                muj mujVar = (muj) this.t;
                lu3 lu3Var = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    cuj cujVar = (cuj) mujVar.l().a();
                    if (cujVar == null) {
                        return Unit.a;
                    }
                    gv9 gv9Var = cujVar.j;
                    this.s = 1;
                    r = s9a.r(new h4i(gv9Var, mujVar, rq3Var, 21), this);
                    if (r == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r = obj;
                }
                for (Pair pair : (List) r) {
                    mujVar.t.put(new Integer(((Number) pair.a).intValue()), (xtj) pair.b);
                }
                muj.v(mujVar);
                mujVar.u = null;
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    c0k c0kVar = (c0k) this.t;
                    this.s = 1;
                    if (c0kVar.t(this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                k0k k0kVar = (k0k) this.t;
                lu3 lu3Var3 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    vyh vyhVar = k0kVar.e;
                    String c2 = dv3.c();
                    this.s = 1;
                    vyhVar.getClass();
                    P = yaa.P(new uyh(vyhVar, c2, rq3Var, i6), this);
                    if (P == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                Iterable iterable = (List) yaa.x((x2g) P);
                if (iterable == null) {
                    iterable = km5.a;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : iterable) {
                    long timestamp = ((Event) obj2).getTimestamp();
                    ZoneId systemDefault = ZoneId.systemDefault();
                    if (Instant.ofEpochSecond(timestamp).atZone(systemDefault).toLocalDate().isBefore(LocalDate.now(systemDefault))) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                yzc yzcVar = k0kVar.f;
                Context i12 = k0kVar.i();
                km5 km5Var = km5.a;
                yzcVar.j(new pyj(k0kVar.k(dy0.w(i12, new ys7(arrayList, km5Var), false)), k0kVar.k(dy0.w(k0kVar.i(), new ys7(km5Var, arrayList2), false))));
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    i1k i1kVar = (i1k) this.t;
                    this.s = 1;
                    if (i1kVar.h(this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    u3k u3kVar = (u3k) this.t;
                    z3k z3kVar = u3kVar.e;
                    ArrayList arrayList3 = u3kVar.k;
                    ArrayList arrayList4 = u3kVar.l;
                    this.s = 1;
                    r3k r3kVar = z3kVar.a;
                    T = gz8.T(this, r3kVar.a, new yw(r3kVar, arrayList3, arrayList4, null, 18));
                    if (T == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    T = obj;
                }
                if (((Number) T).intValue() > 0) {
                    ad2 ad2Var = qv5.a;
                    qv5.a(d52.a);
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                z3k z3kVar2 = ((g4k) this.t).f;
                this.s = 1;
                Object U = gz8.U(this, z3kVar2.a.a, true, false, new crj(18));
                return U == lu3Var6 ? lu3Var6 : U;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                bfk bfkVar = (bfk) this.t;
                this.s = 1;
                Serializable c3 = bfkVar.c(this);
                return c3 == lu3Var7 ? lu3Var7 : c3;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                a3l a3lVar = ((j3l) this.t).g;
                this.s = 1;
                Object c4 = a3lVar.c(this);
                return c4 == lu3Var8 ? lu3Var8 : c4;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i18 = this.s;
                if (i18 != 0) {
                    if (i18 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                p3l p3lVar = (p3l) this.t;
                s96 s96Var = p3lVar.f;
                int id = p3lVar.j.getId();
                this.s = 1;
                s96Var.getClass();
                Object P2 = yaa.P(new a86(s96Var, id, rq3Var, 9), this);
                return P2 == lu3Var9 ? lu3Var9 : P2;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i19 = this.s;
                if (i19 != 0) {
                    if (i19 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                a3l a3lVar2 = ((WeeklyChallengeWorker) this.t).c;
                this.s = 1;
                Object c5 = a3lVar2.c(this);
                return c5 == lu3Var10 ? lu3Var10 : c5;
            case 10:
                WeeklyPredictionsFragment weeklyPredictionsFragment = (WeeklyPredictionsFragment) this.t;
                lu3 lu3Var11 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    z88 z88Var = weeklyPredictionsFragment.C().c;
                    pdk pdkVar = new pdk(weeklyPredictionsFragment, rq3Var, 8);
                    this.s = 1;
                    if (fcp.c0(z88Var, pdkVar, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                WorldCupWidgetConfigActivity worldCupWidgetConfigActivity = (WorldCupWidgetConfigActivity) this.t;
                otk otkVar = worldCupWidgetConfigActivity.M;
                lu3 lu3Var12 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    int i22 = WorldCupWidgetConfigActivity.N;
                    if (!((Boolean) worldCupWidgetConfigActivity.L.getValue()).booleanValue()) {
                        ill illVar = (ill) otkVar.getValue();
                        this.s = 1;
                        c = illVar.n.c(this);
                        break;
                    }
                    zb3.a(worldCupWidgetConfigActivity, new tc3(-570409561, new ykl(worldCupWidgetConfigActivity, i7), true));
                    return Unit.a;
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    int i23 = WorldCupWidgetConfigActivity.N;
                    Intent putExtra = new Intent().putExtra("appWidgetId", ((Number) worldCupWidgetConfigActivity.K.getValue()).intValue());
                    putExtra.getClass();
                    worldCupWidgetConfigActivity.setResult(-1, putExtra);
                    worldCupWidgetConfigActivity.finish();
                    return Unit.a;
                }
                y6a.M(obj);
                c = obj;
                if (((Boolean) c).booleanValue()) {
                    int i24 = WorldCupWidgetConfigActivity.N;
                    ill illVar2 = (ill) otkVar.getValue();
                    this.s = 2;
                    auh auhVar = new auh(i8);
                    Context applicationContext = illVar2.i().getApplicationContext();
                    applicationContext.getClass();
                    Object y0 = td4.y0(auhVar, applicationContext, this);
                    if (y0 != lu3Var12) {
                        y0 = Unit.a;
                        break;
                    }
                }
                zb3.a(worldCupWidgetConfigActivity, new tc3(-570409561, new ykl(worldCupWidgetConfigActivity, i7), true));
                return Unit.a;
            case 12:
                Object obj3 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    it = com.moloco.sdk.acm.b.i.iterator();
                } else {
                    if (i25 != 1) {
                        if (i25 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it2 = (Iterator) this.t;
                        y6a.M(obj);
                        while (it2.hasNext()) {
                            d dVar = (d) it2.next();
                            com.facebook.login.i iVar = com.moloco.sdk.acm.b.b;
                            if (iVar == null) {
                                Intrinsics.i("eventProcessor");
                                throw null;
                            }
                            dVar.getClass();
                            this.t = it2;
                            this.s = 2;
                            hs4 hs4Var = z45.a;
                            Object R = xw3.R(hq4.c, new i3l(iVar, dVar, rq3Var, i), this);
                            if (R != lu3.a) {
                                R = Unit.a;
                            }
                            if (R == obj3) {
                                return obj3;
                            }
                        }
                        com.moloco.sdk.acm.b.i.clear();
                        com.moloco.sdk.acm.b.j.clear();
                        return Unit.a;
                    }
                    it = (Iterator) this.t;
                    y6a.M(obj);
                }
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    com.facebook.login.i iVar2 = com.moloco.sdk.acm.b.b;
                    if (iVar2 == null) {
                        Intrinsics.i("eventProcessor");
                        throw null;
                    }
                    hVar.getClass();
                    this.t = it;
                    this.s = 1;
                    hs4 hs4Var2 = z45.a;
                    Object R2 = xw3.R(hq4.c, new i3l(hVar, iVar2, rq3Var, i2), this);
                    if (R2 != lu3.a) {
                        R2 = Unit.a;
                    }
                    if (R2 == obj3) {
                        return obj3;
                    }
                }
                it2 = com.moloco.sdk.acm.b.j.iterator();
                while (it2.hasNext()) {
                }
                com.moloco.sdk.acm.b.i.clear();
                com.moloco.sdk.acm.b.j.clear();
                return Unit.a;
            case 13:
                Object obj4 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    com.facebook.login.i iVar3 = com.moloco.sdk.acm.b.b;
                    if (iVar3 == null) {
                        Intrinsics.i("eventProcessor");
                        throw null;
                    }
                    d dVar2 = (d) this.t;
                    this.s = 1;
                    hs4 hs4Var3 = z45.a;
                    Object R3 = xw3.R(hq4.c, new i3l(iVar3, dVar2, rq3Var, i), this);
                    if (R3 != obj4) {
                        R3 = Unit.a;
                    }
                    if (R3 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 14:
                Object obj5 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    com.facebook.login.i iVar4 = com.moloco.sdk.acm.b.b;
                    if (iVar4 == null) {
                        Intrinsics.i("eventProcessor");
                        throw null;
                    }
                    h hVar2 = (h) this.t;
                    this.s = 1;
                    hs4 hs4Var4 = z45.a;
                    Object R4 = xw3.R(hq4.c, new i3l(hVar2, iVar4, rq3Var, i2), this);
                    if (R4 != obj5) {
                        R4 = Unit.a;
                    }
                    if (R4 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                lu3 lu3Var13 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitApi", "Successful Init", null, false, 12, null);
                    xh9 b = ((aq4) this.t).b();
                    KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(byte[].class);
                    try {
                        kType = duf.b(byte[].class);
                    } catch (Throwable unused) {
                        kType = null;
                    }
                    h5k h5kVar = new h5k(orCreateKotlinClass, kType);
                    this.s = 1;
                    a = b.a(h5kVar, this);
                    if (a == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    a = obj;
                }
                if (a != null) {
                    return j2.u((byte[]) a);
                }
                yhk.s("null cannot be cast to non-null type kotlin.ByteArray");
                return null;
            case 16:
                b0 b0Var = (b0) this.t;
                lu3 lu3Var14 = lu3.a;
                int i29 = this.s;
                if (i29 != 0 && i29 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                do {
                    Object systemService = b0Var.a.getSystemService("connectivity");
                    systemService.getClass();
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3))) {
                        return Boolean.TRUE;
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "ConnectivityServiceImpl", "waiting because of no network connection", null, false, 12, null);
                    this.s = 1;
                } while (n4o.y(100L, this) != lu3Var14);
                return lu3Var14;
            case 17:
                lu3 lu3Var15 = lu3.a;
                int i30 = this.s;
                if (i30 != 0) {
                    if (i30 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                n nVar = (n) this.t;
                u uVar = nVar.c;
                y yVar = nVar.a;
                String str = yVar.a;
                String str2 = yVar.d.b;
                if (str2 == null) {
                    str2 = "UNKNOWN_MTID";
                }
                this.s = 1;
                Object i31 = uVar.i(str, str2, false, this);
                return i31 == lu3Var15 ? lu3Var15 : i31;
            case 18:
                lu3 lu3Var16 = lu3.a;
                int i32 = this.s;
                if (i32 != 0) {
                    if (i32 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.d dVar3 = ((c) this.t).d;
                yf4 yf4Var = new yf4(dVar3.e, dVar3.i, new v24(i6, rq3Var, i6), i8);
                d11 d11Var = new d11(i5, rq3Var, 24);
                this.s = 1;
                Object z = rd0.z(yf4Var, d11Var, this);
                return z == lu3Var16 ? lu3Var16 : z;
            case 19:
                lu3 lu3Var17 = lu3.a;
                int i33 = this.s;
                if (i33 != 0) {
                    if (i33 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j jVar = ((f) this.t).c;
                yf4 yf4Var2 = new yf4(jVar.f, jVar.j, new v24(i6, rq3Var, 4), i8);
                d11 d11Var2 = new d11(i5, rq3Var, i3);
                this.s = 1;
                Object z2 = rd0.z(yf4Var2, d11Var2, this);
                return z2 == lu3Var17 ? lu3Var17 : z2;
            case 20:
                lu3 lu3Var18 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    aeh aehVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c) this.t).c;
                    Unit unit = Unit.a;
                    this.s = 1;
                    if (aehVar.emit(unit, this) == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i34 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 21:
                lu3 lu3Var19 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    aeh aehVar2 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c) this.t).c;
                    Unit unit2 = Unit.a;
                    this.s = 1;
                    if (aehVar2.emit(unit2, this) == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 22:
                lu3 lu3Var20 = lu3.a;
                int i36 = this.s;
                if (i36 == 0) {
                    y6a.M(obj);
                    aeh aehVar3 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c) this.t).c;
                    Unit unit3 = Unit.a;
                    this.s = 1;
                    if (aehVar3.emit(unit3, this) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i36 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 23:
                lu3 lu3Var21 = lu3.a;
                int i37 = this.s;
                if (i37 == 0) {
                    y6a.M(obj);
                    v98 v98Var = new v98(VastActivity.e, new pdk((com.appsflyer.f) this.t, rq3Var, i3), i6);
                    d11 d11Var3 = new d11(i5, rq3Var, i4);
                    this.s = 1;
                    if (rd0.B(v98Var, d11Var3, this) == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i37 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 24:
                lu3 lu3Var22 = lu3.a;
                int i38 = this.s;
                if (i38 != 0) {
                    if (i38 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                XmlPullParser xmlPullParser = (XmlPullParser) this.t;
                this.s = 1;
                Object r2 = d1.r(xmlPullParser, this);
                return r2 == lu3Var22 ? lu3Var22 : r2;
            case 25:
                m mVar = (m) this.t;
                lu3 lu3Var23 = lu3.a;
                int i39 = this.s;
                if (i39 == 0) {
                    fsf g = lnb.g(obj);
                    ddi l = mVar.g.l();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.e eVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.e(g, mVar, i7);
                    this.s = 1;
                    if (l.collect(eVar, this) == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i39 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 26:
                lu3 lu3Var24 = lu3.a;
                int i40 = this.s;
                if (i40 == 0) {
                    y6a.M(obj);
                    hs4 hs4Var5 = z45.a;
                    r69 r69Var = rob.a;
                    hje hjeVar = new hje((g) this.t, rq3Var, 25);
                    this.s = 1;
                    if (xw3.R(r69Var, hjeVar, this) == lu3Var24) {
                        return lu3Var24;
                    }
                } else {
                    if (i40 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 27:
                lu3 lu3Var25 = lu3.a;
                int i41 = this.s;
                if (i41 != 0) {
                    if (i41 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                i iVar5 = (i) this.t;
                fdi fdiVar = (fdi) iVar5.a.p;
                o0 o0Var = new o0(iVar5, 6);
                this.s = 1;
                fdiVar.collect(o0Var, this);
                return lu3Var25;
            case 28:
                lu3 lu3Var26 = lu3.a;
                int i42 = this.s;
                if (i42 == 0) {
                    y6a.M(obj);
                    hs4 hs4Var6 = z45.a;
                    r69 r69Var2 = rob.a;
                    hje hjeVar2 = new hje((b) this.t, rq3Var, i4);
                    this.s = 1;
                    if (xw3.R(r69Var2, hjeVar2, this) == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i42 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var27 = lu3.a;
                int i43 = this.s;
                if (i43 == 0) {
                    y6a.M(obj);
                    hs4 hs4Var7 = z45.a;
                    r69 r69Var3 = rob.a;
                    hje hjeVar3 = new hje((e) this.t, rq3Var, 28);
                    this.s = 1;
                    if (xw3.R(r69Var3, hjeVar3, this) == lu3Var27) {
                        return lu3Var27;
                    }
                } else {
                    if (i43 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ luj(int i, rq3 rq3Var) {
        super(i, rq3Var);
        this.r = 12;
    }
}
