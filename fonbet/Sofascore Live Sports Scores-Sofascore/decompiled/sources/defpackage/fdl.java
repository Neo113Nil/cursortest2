package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.StatFs;
import android.view.View;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.facebook.internal.t;
import com.ironsource.B1;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.e;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.ortb.model.a0;
import com.moloco.sdk.internal.ortb.model.y;
import com.moloco.sdk.internal.publisher.a;
import com.moloco.sdk.internal.publisher.c1;
import com.moloco.sdk.internal.publisher.z0;
import com.moloco.sdk.internal.utils.c;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.results.wc26.WorldCupFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class fdl extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdl(b1d b1dVar, WorldCupFragment worldCupFragment, rq3 rq3Var, WorldCupFragment worldCupFragment2) {
        super(2, rq3Var);
        this.r = 1;
        this.t = b1dVar;
        this.u = worldCupFragment;
        this.v = worldCupFragment2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new fdl((gdl) this.t, (kdb) this.u, (pbl) obj2, rq3Var, 0);
            case 1:
                return new fdl((b1d) this.t, (WorldCupFragment) this.u, rq3Var, (WorldCupFragment) obj2);
            case 2:
                return new fdl((a6e) this.t, (Function1) this.u, (e1d) obj2, rq3Var, 2);
            case 3:
                return new fdl((qkl) this.u, (sfl) obj2, rq3Var, 3);
            case 4:
                fdl fdlVar = new fdl((ArrayList) this.u, (qkl) obj2, rq3Var, 4);
                fdlVar.t = obj;
                return fdlVar;
            case 5:
                return new fdl((e) obj2, rq3Var, 5);
            case 6:
                return new fdl((p) this.t, (a) this.u, (c1) obj2, rq3Var, 6);
            case 7:
                fdl fdlVar2 = new fdl((k) this.u, (t) obj2, rq3Var, 7);
                fdlVar2.t = obj;
                return fdlVar2;
            case 8:
                return new fdl((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p) this.t, (z0) this.u, (s) obj2, rq3Var, 8);
            case 9:
                fdl fdlVar3 = new fdl((View) obj2, rq3Var, 9);
                fdlVar3.u = obj;
                return fdlVar3;
            case 10:
                fdl fdlVar4 = new fdl((View) this.u, (q) obj2, rq3Var, 10);
                fdlVar4.t = obj;
                return fdlVar4;
            case 11:
                return new fdl((k0) this.u, (rd4) obj2, rq3Var, 11);
            case 12:
                return new fdl((d) this.t, (String) this.u, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a) obj2, rq3Var, 12);
            case 13:
                return new fdl((f) this.t, (c40) this.u, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a) obj2, rq3Var, 13);
            case 14:
                fdl fdlVar5 = new fdl((g) this.u, (Function0) obj2, rq3Var, 14);
                fdlVar5.t = obj;
                return fdlVar5;
            case 15:
                fdl fdlVar6 = new fdl((Function0) this.u, (b) obj2, rq3Var, 15);
                fdlVar6.t = obj;
                return fdlVar6;
            case 16:
                fdl fdlVar7 = new fdl((Function0) this.u, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) obj2, rq3Var, 16);
                fdlVar7.t = obj;
                return fdlVar7;
            case 17:
                return new fdl((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b) this.t, (qze) this.u, (Function2) obj2, rq3Var, 17);
            case 18:
                fdl fdlVar8 = new fdl((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b) this.u, (Function2) obj2, rq3Var, 18);
                fdlVar8.t = obj;
                return fdlVar8;
            default:
                return new fdl((m0) this.u, (x0) obj2, rq3Var, 19);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return lu3.a;
            case 2:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                ((fdl) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return lu3.a;
            case 10:
                return ((fdl) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((fdl) create((qze) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((fdl) create((qze) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((fdl) create((qze) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((fdl) create((qze) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((fdl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x02a7, code lost:
    
        if (r3.emit(r7, r22) == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02b6, code lost:
    
        if (defpackage.n4o.y(500, r22) == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02b9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05cf, code lost:
    
        if (defpackage.rd0.z(r1, r4, r22) == r7) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05b4, code lost:
    
        if (defpackage.rd0.z(r8, r9, r22) == r7) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0619, code lost:
    
        if (r2.e(r22) == r0) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x06e4, code lost:
    
        if (r2 == r1) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x071e, code lost:
    
        if (r2 == r1) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0809, code lost:
    
        if (r0 == r1) goto L411;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03b2  */
    /* JADX WARN: Type inference failed for: r10v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Float, java.lang.Object, java.lang.String, rq3] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Float, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x02b6 -> B:131:0x028a). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        rfl rflVar;
        agl aglVar;
        Integer num;
        Object I0;
        Object C;
        e eVar;
        h2d h2dVar;
        h2d h2dVar2;
        ?? r11;
        ?? r112;
        c cVar;
        long j;
        long j2;
        String str;
        File externalCacheDir;
        String str2;
        File parentFile;
        k0 k0Var;
        Integer num2;
        String str3;
        h hVar;
        String str4;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h a;
        Integer num3;
        b98 b98Var;
        Rect rect;
        x xVar;
        Object d;
        a0 a0Var;
        int i = this.r;
        int i2 = 4;
        int i3 = 5;
        int i4 = 3;
        boolean z = false;
        z = false;
        int i5 = 2;
        Object obj3 = this.v;
        String str5 = 0;
        str5 = 0;
        switch (i) {
            case 0:
                kdb kdbVar = (kdb) this.u;
                gdl gdlVar = (gdl) this.t;
                Object obj4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    Context context = gdlVar.b;
                    lcl lclVar = gdlVar.a;
                    pbl pblVar = (pbl) obj3;
                    zbl zblVar = gdlVar.e;
                    this.s = 1;
                    int i7 = obl.a;
                    if (lclVar.q && Build.VERSION.SDK_INT < 31) {
                        wog wogVar = zblVar.d;
                        wogVar.getClass();
                        Object R = xw3.R(fz8.P(wogVar), new kuj(kdbVar, lclVar, pblVar, context, (rq3) null, 11), this);
                        obj2 = R;
                        if (R != obj4) {
                            obj2 = Unit.a;
                            break;
                        }
                    } else {
                        obj2 = Unit.a;
                        break;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                int i8 = hdl.a;
                rik.o().getClass();
                ddb startWork = kdbVar.startWork();
                startWork.getClass();
                this.s = 2;
                Object a2 = hdl.a(startWork, kdbVar, this);
                if (a2 != obj4) {
                    return a2;
                }
                return obj4;
            case 1:
                lu3 lu3Var = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    b1d b1dVar = (b1d) this.t;
                    usf usfVar = new usf(14, (WorldCupFragment) this.u, (WorldCupFragment) obj3);
                    this.s = 1;
                    if (b1dVar.collect(usfVar, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 2:
                lu3 lu3Var2 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    z88 H = hkg.H(sea.y(new jt7((a6e) this.t, 7)));
                    usf usfVar2 = new usf(15, (Function1) this.u, (e1d) obj3);
                    this.s = 1;
                    if (H.collect(usfVar2, this) == lu3Var2) {
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
            case 3:
                sfl sflVar = (sfl) obj3;
                qkl qklVar = (qkl) this.u;
                Object obj5 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    qklVar.n(null, new qdj(sflVar, 25));
                    int i12 = sflVar == null ? -1 : mkl.a[sflVar.ordinal()];
                    if (i12 == 1) {
                        oil oilVar = (oil) qklVar.l().a();
                        if (oilVar != null && (rflVar = oilVar.g) != null && (aglVar = rflVar.e) != null && (num = aglVar.a) != null) {
                            int intValue = num.intValue();
                            w3b w3bVar = qklVar.l;
                            this.t = qklVar;
                            this.s = 1;
                            I0 = w3bVar.I0(16, intValue, this);
                            break;
                        }
                    } else if (i12 == 2) {
                        this.s = 2;
                        C = qklVar.C(this);
                        break;
                    }
                } else if (i11 == 1) {
                    qklVar = (qkl) this.t;
                    y6a.M(obj);
                    I0 = obj;
                    qklVar.n(null, new r41((List) I0, 8));
                } else {
                    if (i11 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    C = obj;
                    qklVar.n(null, new qdj((ajl) C, 26));
                }
                return Unit.a;
            case 4:
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var3 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ArrayList arrayList = (ArrayList) this.u;
                qkl qklVar2 = (qkl) obj3;
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(xw3.t(ku3Var, null, new tjl((rxb) it.next(), qklVar2, null, 1), 3));
                }
                this.t = null;
                this.s = 1;
                Object u = m6k.u(arrayList2, this);
                return u == lu3Var3 ? lu3Var3 : u;
            case 5:
                Object obj6 = lu3.a;
                int i14 = this.s;
                try {
                    if (i14 == 0) {
                        y6a.M(obj);
                        eVar = (e) obj3;
                        h2dVar = eVar.p;
                        this.t = h2dVar;
                        this.u = eVar;
                        this.s = 1;
                        break;
                    } else {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h2dVar2 = (h2d) this.t;
                            try {
                                y6a.M(obj);
                                obj6 = Unit.a;
                                h2dVar2.f(null);
                                return obj6;
                            } catch (Throwable th) {
                                th = th;
                                h2dVar = h2dVar2;
                                h2dVar.f(null);
                                throw th;
                            }
                        }
                        eVar = (e) this.u;
                        h2dVar = (h2d) this.t;
                        y6a.M(obj);
                    }
                    this.t = h2dVar;
                    this.u = null;
                    this.s = 2;
                    if (eVar.b(this) != obj6) {
                        h2dVar2 = h2dVar;
                        obj6 = Unit.a;
                        h2dVar2.f(null);
                    }
                    return obj6;
                } catch (Throwable th2) {
                    th = th2;
                    h2dVar.f(null);
                    throw th;
                }
            case 6:
                String str6 = ((c1) obj3).d;
                a aVar2 = (a) this.u;
                p pVar = (p) this.t;
                lu3 lu3Var4 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    ddi l = pVar.l();
                    r11 = 0;
                    jk0 jk0Var = new jk0(i5, false ? 1 : 0, i2);
                    this.s = 1;
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        r112 = 0;
                        if (aVar2 != 0) {
                            aVar2.onAdHidden(MolocoAdKt.createAdInfo$default(str6, r112, r112, 6, r112));
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                    r11 = 0;
                }
                if (aVar2 != 0) {
                    aVar2.c(MolocoAdKt.createAdInfo$default(str6, r11, r11, 6, r11), r11);
                }
                ddi l2 = pVar.l();
                jk0 jk0Var2 = new jk0(i5, r11, i3);
                this.s = 2;
                r112 = r11;
                break;
            case 7:
                t tVar = (t) obj3;
                k kVar = (k) this.u;
                lu3 lu3Var5 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var2 = (ku3) this.t;
                    rq3 rq3Var = null;
                    List j3 = kotlin.collections.b.j(xw3.L(ku3Var2, null, null, new j(kVar, tVar, rq3Var, false ? 1 : 0), 3), xw3.L(ku3Var2, null, null, new j(kVar, tVar, rq3Var, 1), 3), xw3.L(ku3Var2, null, null, new j(kVar, tVar, rq3Var, i5), 3));
                    hof hofVar = kVar.e.d;
                    pdk pdkVar = new pdk(j3, kVar, rq3Var, 19);
                    this.s = 1;
                    if (fcp.c0(hofVar, pdkVar, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                z0 z0Var = (z0) this.u;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p pVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p) this.t;
                fdi fdiVar = pVar2.g;
                com.moloco.sdk.acm.recorder.c cVar2 = pVar2.d;
                Context context2 = pVar2.a;
                n nVar = pVar2.f;
                Object obj7 = lu3.a;
                int i17 = this.s;
                try {
                    if (i17 == 0) {
                        y6a.M(obj);
                        l0 l0Var = nVar.g;
                        if (l0Var instanceof j0) {
                            z0Var.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((j0) l0Var).a);
                            return Unit.a;
                        }
                        if (l0Var instanceof k0) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((k0) l0Var).a;
                            if (!aVar3.a.b.exists()) {
                                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                                MolocoLogger.info$default(molocoLogger, "VastFullscreenAdImpl", "VAST ad media file does not exist", null, false, 12, null);
                                File file = aVar3.a.b;
                                File cacheDir = context2.getCacheDir();
                                cacheDir.getClass();
                                try {
                                    String parent = cacheDir.getParent();
                                    if (parent == null) {
                                        parent = cacheDir.getAbsolutePath();
                                    }
                                    StatFs statFs = new StatFs(parent);
                                    cVar = new c(statFs.getAvailableBytes(), statFs.getTotalBytes());
                                } catch (Exception unused) {
                                    cVar = null;
                                }
                                if (cVar != null) {
                                    j2 = 100;
                                    long j4 = cVar.b;
                                    if (j4 > 0) {
                                        j = 0;
                                        num3 = Integer.valueOf((int) (((j4 - cVar.a) * 100) / j4));
                                    } else {
                                        j = 0;
                                        num3 = null;
                                    }
                                    if (num3 != null) {
                                        int intValue2 = num3.intValue();
                                        str = intValue2 < 50 ? "low" : intValue2 < 75 ? "medium" : FootballShotmapItem.GOAL_HIGH;
                                        externalCacheDir = context2.getExternalCacheDir();
                                        String absolutePath = file.getAbsolutePath();
                                        if (externalCacheDir != null) {
                                            absolutePath.getClass();
                                            String absolutePath2 = externalCacheDir.getAbsolutePath();
                                            absolutePath2.getClass();
                                            if (kotlin.text.c.v(absolutePath, absolutePath2, false)) {
                                                str2 = B1.e;
                                                parentFile = file.getParentFile();
                                                l0 l0Var2 = nVar.g;
                                                k0Var = l0Var2 instanceof k0 ? (k0) l0Var2 : null;
                                                if (k0Var != null && (aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) k0Var.a) != null) {
                                                    u uVar = nVar.c;
                                                    String str7 = aVar.a.d;
                                                    str7.getClass();
                                                    a = uVar.c.a(str7);
                                                    if (!(a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d)) {
                                                        num2 = 100;
                                                    } else if (a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) {
                                                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) a).b;
                                                        long j5 = gVar.b;
                                                        if (j5 > j) {
                                                            num2 = Integer.valueOf((int) ((gVar.a * j2) / j5));
                                                        }
                                                    } else if (!(a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e)) {
                                                        zzl.b();
                                                    }
                                                    if (num2 != null) {
                                                        int intValue3 = num2.intValue();
                                                        str3 = intValue3 <= 33 ? "0-33" : intValue3 <= 66 ? "34-66" : intValue3 < 100 ? "67-99" : StatisticData.ERROR_CODE_NOT_FOUND;
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    StringBuilder q = wt3.q("\n                    ACM Event: vast_show_file_not_exists\n                    - storage_bucket_at_show: ", str, "\n                    - storage_bucket_at_load: ");
                                                    bf3.v(q, nVar.l, "\n                    - download_bucket_at_show: ", str3, "\n                    - cache_location_type: ");
                                                    q.append(str2);
                                                    q.append("\n                    - cache_dir_exists: ");
                                                    q.append(parentFile == null && parentFile.exists());
                                                    q.append("\n                ");
                                                    MolocoLogger.info$default(molocoLogger, "VastFullscreenAdImpl", dii.c(q.toString()), null, false, 12, null);
                                                    hVar = nVar.k;
                                                    if (hVar != null) {
                                                        cVar2.b(hVar);
                                                    }
                                                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                                                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("vast_show_file_not_exists");
                                                    if (parentFile != null && parentFile.exists()) {
                                                        z = true;
                                                    }
                                                    dVar.a("cache_dir_exists", String.valueOf(z));
                                                    if (str != null) {
                                                        dVar.a("storage_bucket_at_show", str);
                                                    }
                                                    str4 = nVar.l;
                                                    if (str4 != null) {
                                                        dVar.a("storage_bucket_at_load", str4);
                                                    }
                                                    if (str3 != null) {
                                                        dVar.a("download_bucket_at_show", str3);
                                                    }
                                                    if (str2 != null) {
                                                        dVar.a("cache_location_type", str2);
                                                    }
                                                    cVar2.a(dVar);
                                                    z0Var.a(l.d);
                                                    return Unit.a;
                                                }
                                                num2 = null;
                                                if (num2 != null) {
                                                }
                                                StringBuilder q2 = wt3.q("\n                    ACM Event: vast_show_file_not_exists\n                    - storage_bucket_at_show: ", str, "\n                    - storage_bucket_at_load: ");
                                                bf3.v(q2, nVar.l, "\n                    - download_bucket_at_show: ", str3, "\n                    - cache_location_type: ");
                                                q2.append(str2);
                                                q2.append("\n                    - cache_dir_exists: ");
                                                q2.append(parentFile == null && parentFile.exists());
                                                q2.append("\n                ");
                                                MolocoLogger.info$default(molocoLogger, "VastFullscreenAdImpl", dii.c(q2.toString()), null, false, 12, null);
                                                hVar = nVar.k;
                                                if (hVar != null) {
                                                }
                                                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                                                com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("vast_show_file_not_exists");
                                                if (parentFile != null) {
                                                    z = true;
                                                }
                                                dVar2.a("cache_dir_exists", String.valueOf(z));
                                                if (str != null) {
                                                }
                                                str4 = nVar.l;
                                                if (str4 != null) {
                                                }
                                                if (str3 != null) {
                                                }
                                                if (str2 != null) {
                                                }
                                                cVar2.a(dVar2);
                                                z0Var.a(l.d);
                                                return Unit.a;
                                            }
                                        }
                                        absolutePath.getClass();
                                        String absolutePath3 = context2.getCacheDir().getAbsolutePath();
                                        absolutePath3.getClass();
                                        str2 = !kotlin.text.c.v(absolutePath, absolutePath3, false) ? "internal" : null;
                                        parentFile = file.getParentFile();
                                        l0 l0Var22 = nVar.g;
                                        if (l0Var22 instanceof k0) {
                                        }
                                        if (k0Var != null) {
                                            u uVar2 = nVar.c;
                                            String str72 = aVar.a.d;
                                            str72.getClass();
                                            a = uVar2.c.a(str72);
                                            if (!(a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d)) {
                                            }
                                            if (num2 != null) {
                                            }
                                            StringBuilder q22 = wt3.q("\n                    ACM Event: vast_show_file_not_exists\n                    - storage_bucket_at_show: ", str, "\n                    - storage_bucket_at_load: ");
                                            bf3.v(q22, nVar.l, "\n                    - download_bucket_at_show: ", str3, "\n                    - cache_location_type: ");
                                            q22.append(str2);
                                            q22.append("\n                    - cache_dir_exists: ");
                                            q22.append(parentFile == null && parentFile.exists());
                                            q22.append("\n                ");
                                            MolocoLogger.info$default(molocoLogger, "VastFullscreenAdImpl", dii.c(q22.toString()), null, false, 12, null);
                                            hVar = nVar.k;
                                            if (hVar != null) {
                                            }
                                            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr22 = com.moloco.sdk.internal.client_metrics_data.a.b;
                                            com.moloco.sdk.acm.d dVar22 = new com.moloco.sdk.acm.d("vast_show_file_not_exists");
                                            if (parentFile != null) {
                                            }
                                            dVar22.a("cache_dir_exists", String.valueOf(z));
                                            if (str != null) {
                                            }
                                            str4 = nVar.l;
                                            if (str4 != null) {
                                            }
                                            if (str3 != null) {
                                            }
                                            if (str2 != null) {
                                            }
                                            cVar2.a(dVar22);
                                            z0Var.a(l.d);
                                            return Unit.a;
                                        }
                                        num2 = null;
                                        if (num2 != null) {
                                        }
                                        StringBuilder q222 = wt3.q("\n                    ACM Event: vast_show_file_not_exists\n                    - storage_bucket_at_show: ", str, "\n                    - storage_bucket_at_load: ");
                                        bf3.v(q222, nVar.l, "\n                    - download_bucket_at_show: ", str3, "\n                    - cache_location_type: ");
                                        q222.append(str2);
                                        q222.append("\n                    - cache_dir_exists: ");
                                        q222.append(parentFile == null && parentFile.exists());
                                        q222.append("\n                ");
                                        MolocoLogger.info$default(molocoLogger, "VastFullscreenAdImpl", dii.c(q222.toString()), null, false, 12, null);
                                        hVar = nVar.k;
                                        if (hVar != null) {
                                        }
                                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr222 = com.moloco.sdk.internal.client_metrics_data.a.b;
                                        com.moloco.sdk.acm.d dVar222 = new com.moloco.sdk.acm.d("vast_show_file_not_exists");
                                        if (parentFile != null) {
                                        }
                                        dVar222.a("cache_dir_exists", String.valueOf(z));
                                        if (str != null) {
                                        }
                                        str4 = nVar.l;
                                        if (str4 != null) {
                                        }
                                        if (str3 != null) {
                                        }
                                        if (str2 != null) {
                                        }
                                        cVar2.a(dVar222);
                                        z0Var.a(l.d);
                                        return Unit.a;
                                    }
                                } else {
                                    j = 0;
                                    j2 = 100;
                                }
                                str = null;
                                externalCacheDir = context2.getExternalCacheDir();
                                String absolutePath4 = file.getAbsolutePath();
                                if (externalCacheDir != null) {
                                }
                                absolutePath4.getClass();
                                String absolutePath32 = context2.getCacheDir().getAbsolutePath();
                                absolutePath32.getClass();
                                if (!kotlin.text.c.v(absolutePath4, absolutePath32, false)) {
                                }
                                parentFile = file.getParentFile();
                                l0 l0Var222 = nVar.g;
                                if (l0Var222 instanceof k0) {
                                }
                                if (k0Var != null) {
                                }
                                num2 = null;
                                if (num2 != null) {
                                }
                                StringBuilder q2222 = wt3.q("\n                    ACM Event: vast_show_file_not_exists\n                    - storage_bucket_at_show: ", str, "\n                    - storage_bucket_at_load: ");
                                bf3.v(q2222, nVar.l, "\n                    - download_bucket_at_show: ", str3, "\n                    - cache_location_type: ");
                                q2222.append(str2);
                                q2222.append("\n                    - cache_dir_exists: ");
                                q2222.append(parentFile == null && parentFile.exists());
                                q2222.append("\n                ");
                                MolocoLogger.info$default(molocoLogger, "VastFullscreenAdImpl", dii.c(q2222.toString()), null, false, 12, null);
                                hVar = nVar.k;
                                if (hVar != null) {
                                }
                                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2222 = com.moloco.sdk.internal.client_metrics_data.a.b;
                                com.moloco.sdk.acm.d dVar2222 = new com.moloco.sdk.acm.d("vast_show_file_not_exists");
                                if (parentFile != null) {
                                }
                                dVar2222.a("cache_dir_exists", String.valueOf(z));
                                if (str != null) {
                                }
                                str4 = nVar.l;
                                if (str4 != null) {
                                }
                                if (str3 != null) {
                                }
                                if (str2 != null) {
                                }
                                cVar2.a(dVar2222);
                                z0Var.a(l.d);
                                return Unit.a;
                            }
                            aeh aehVar = VastActivity.e;
                            com.moloco.sdk.internal.publisher.nativead.b bVar = new com.moloco.sdk.internal.publisher.nativead.b(0, pVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p.class, "onClose", "onClose()V", 0, 5);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar2 = pVar2.c;
                            String str8 = pVar2.b.f;
                            com.moloco.sdk.acm.recorder.c cVar3 = pVar2.d;
                            com.appsflyer.f fVar = new com.appsflyer.f(i5, pVar2, z0Var);
                            this.s = 1;
                            VastActivity.k = bVar2;
                            VastActivity.i = bVar;
                            VastActivity.l = cVar3;
                            hs4 hs4Var = z45.a;
                            Object R2 = xw3.R(rob.a, new ajj(aVar3, (s) obj3, fVar, context2, str8, null, 16), this);
                            if ((R2 == obj7 ? R2 : Unit.a) == obj7) {
                                return obj7;
                            }
                        } else {
                            zzl.b();
                        }
                        return null;
                    }
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    fdiVar.m(null, Boolean.FALSE);
                    return Unit.a;
                } catch (Throwable th3) {
                    fdiVar.m(null, Boolean.FALSE);
                    throw th3;
                }
            case 9:
                View view = (View) obj3;
                lu3 lu3Var6 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    b98Var = (b98) this.u;
                    rect = new Rect(0, 0, 0, 0);
                } else if (i18 == 1) {
                    rect = (Rect) this.t;
                    b98Var = (b98) this.u;
                    y6a.M(obj);
                    this.u = b98Var;
                    this.t = rect;
                    this.s = 2;
                    break;
                } else {
                    if (i18 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rect = (Rect) this.t;
                    b98Var = (b98) this.u;
                    y6a.M(obj);
                }
                Boolean valueOf = Boolean.valueOf(view.isShown() && view.getGlobalVisibleRect(rect));
                this.u = b98Var;
                this.t = rect;
                this.s = 1;
                break;
            case 10:
                View view2 = (View) this.u;
                lu3 lu3Var7 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    k8f k8fVar = (k8f) this.t;
                    z88 c = i0.c(yso.q(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s(view2, str5, false ? 1 : 0)));
                    w21 w21Var = new w21(view2, k8fVar, (q) obj3, (rq3) null);
                    this.s = 1;
                    if (fcp.c0(c, w21Var, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                rd4 rd4Var = (rd4) obj3;
                lu3 lu3Var8 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    x xVar2 = (x) ((k0) this.u).a;
                    aeh aehVar2 = (aeh) rd4Var.c;
                    this.t = xVar2;
                    this.s = 1;
                    if (aehVar2.emit(xVar2, this) == lu3Var8) {
                        return lu3Var8;
                    }
                    xVar = xVar2;
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = (x) this.t;
                    y6a.M(obj);
                }
                rd4Var.g("mraidbridge.nativeCallComplete(" + JSONObject.quote(xVar.a) + ')');
                return Unit.a;
            case 12:
                lu3 lu3Var9 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    d dVar3 = (d) this.t;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n nVar2 = dVar3.c;
                    aeh aehVar3 = dVar3.j;
                    this.s = 1;
                    if (dVar3.b.a((String) this.u, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a) obj3, nVar2, aehVar3, this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 13:
                lu3 lu3Var10 = lu3.a;
                int i22 = this.s;
                try {
                    if (i22 != 0) {
                        if (i22 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        throw new fka();
                    }
                    y6a.M(obj);
                    f fVar2 = (f) this.t;
                    aeh aehVar4 = fVar2.a.d;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0 k0Var2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0(1, fVar2, (c40) this.u, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a) obj3);
                    this.s = 1;
                    aehVar4.collect(k0Var2, this);
                    return lu3Var10;
                } catch (Exception e) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Error collecting playlist item displaying events", e, false, 8, null);
                    return Unit.a;
                }
            case 14:
                lu3 lu3Var11 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    qze qzeVar = (qze) this.t;
                    com.moloco.sdk.internal.k kVar2 = new com.moloco.sdk.internal.k(i4, (g) this.u, (Function0) obj3);
                    this.s = 1;
                    if (com.facebook.appevents.n.e(qzeVar, kVar2, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i23 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                lu3 lu3Var12 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    qze qzeVar2 = (qze) this.t;
                    com.moloco.sdk.internal.k kVar3 = new com.moloco.sdk.internal.k(i2, (Function0) this.u, (b) obj3);
                    this.s = 1;
                    if (com.facebook.appevents.n.e(qzeVar2, kVar3, this) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 16:
                lu3 lu3Var13 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    qze qzeVar3 = (qze) this.t;
                    com.moloco.sdk.internal.k kVar4 = new com.moloco.sdk.internal.k(i3, (Function0) this.u, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) obj3);
                    this.s = 1;
                    if (com.facebook.appevents.n.e(qzeVar3, kVar4, this) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 17:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b bVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b) this.t;
                lu3 lu3Var14 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    bVar3.d.g();
                    bVar3.b = false;
                    bVar3.c = false;
                    qze qzeVar4 = (qze) this.u;
                    kj6 kj6Var = new kj6(bVar3, (Function2) obj3, str5, i3);
                    this.s = 1;
                    if (((ooi) qzeVar4).k1(kj6Var, this) == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 18:
                lu3 lu3Var15 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    fdl fdlVar = new fdl((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b) this.u, (qze) this.t, (Function2) obj3, null, 17);
                    this.s = 1;
                    if (s9a.r(fdlVar, this) == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                Object obj8 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    m0 m0Var = (m0) this.u;
                    if (m0Var == null) {
                        return null;
                    }
                    x0 x0Var = (x0) obj3;
                    try {
                        t tVar2 = x0Var.c;
                        y yVar = x0Var.b;
                        if (yVar != null && (a0Var = yVar.d) != null) {
                            str5 = a0Var.b;
                        }
                        this.t = m0Var;
                        this.s = 1;
                        d = tVar2.d(m0Var, str5, this);
                        if (d != obj8) {
                            obj8 = m0Var;
                        }
                        return obj8;
                    } catch (Exception unused2) {
                        return m0Var;
                    }
                }
                if (i28 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj8 = (m0) this.t;
                try {
                    y6a.M(obj);
                    d = obj;
                } catch (Exception unused3) {
                }
                return (m0) d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fdl(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fdl(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fdl(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
    }
}
