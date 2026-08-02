package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.appsflyer.f;
import com.moloco.sdk.acm.services.d;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.nativead.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.Sports;
import com.sofascore.model.database.DbVote;
import com.sofascore.model.mvvm.model.City;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.weeklyChallenge.PopularEvent;
import com.sofascore.model.weeklyChallenge.PopularEventsResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeAssetsResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeagueAsset;
import com.sofascore.model.weeklyChallenge.WeeklyLeagueImageUrl;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ajj extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ajj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.w = obj4;
        this.x = obj5;
    }

    private final Object e(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        try {
            if (i == 0) {
                y6a.M(obj);
                aeh aehVar = VastActivity.e;
                VastActivity.g = (a) this.t;
                s sVar = (s) this.u;
                VastActivity.h = sVar.h;
                w32 w32Var = new w32((f) this.v, (Context) this.w, sVar, (String) this.x, null, 5);
                this.s = 1;
                obj = s9a.r(w32Var, this);
                if (obj == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            yda ydaVar = (yda) obj;
            VastActivity vastActivity = (VastActivity) VastActivity.f.get();
            if (vastActivity != null) {
                vastActivity.finish();
            }
            VastActivity.i = null;
            VastActivity.g = null;
            VastActivity.l = null;
            VastActivity.h = null;
            x.h();
            return ydaVar;
        } catch (Throwable th) {
            VastActivity vastActivity2 = (VastActivity) VastActivity.f.get();
            if (vastActivity2 != null) {
                vastActivity2.finish();
            }
            VastActivity.i = null;
            VastActivity.g = null;
            VastActivity.l = null;
            VastActivity.h = null;
            x.h();
            throw th;
        }
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                ajj ajjVar = new ajj((Function2) this.u, (ogj) this.v, (ku3) this.w, (AtomicReference) obj2, rq3Var, 0);
                ajjVar.t = obj;
                return ajjVar;
            case 1:
                ajj ajjVar2 = new ajj((hkj) this.w, (yy0) obj2, rq3Var, 1);
                ajjVar2.t = obj;
                return ajjVar2;
            case 2:
                return new ajj((koj) this.u, (List) this.v, (rnj) this.w, (boj) obj2, rq3Var, 2);
            case 3:
                return new ajj((String) this.t, (Map) this.u, (ct8) this.v, (Function1) this.w, (Function1) obj2, rq3Var, 3);
            case 4:
                ajj ajjVar3 = new ajj((quj) this.v, (svg) this.w, (fsf) obj2, rq3Var, 4);
                ajjVar3.t = obj;
                return ajjVar3;
            case 5:
                ajj ajjVar4 = new ajj((c0k) this.w, (String) obj2, rq3Var, 5);
                ajjVar4.v = obj;
                return ajjVar4;
            case 6:
                ajj ajjVar5 = new ajj((g4k) obj2, rq3Var, 6);
                ajjVar5.t = obj;
                return ajjVar5;
            case 7:
                ajj ajjVar6 = new ajj((j3l) obj2, rq3Var, 7);
                ajjVar6.t = obj;
                return ajjVar6;
            case 8:
                ajj ajjVar7 = new ajj((WeeklyChallengeViewModel) this.v, (Integer) this.w, (Set) obj2, rq3Var, 8);
                ajjVar7.t = obj;
                return ajjVar7;
            case 9:
                return new ajj((String) this.t, (ct8) this.u, (tm0) this.v, (String) this.w, (String) obj2, rq3Var, 9);
            case 10:
                ajj ajjVar8 = new ajj((kgl) obj2, rq3Var, 10);
                ajjVar8.t = obj;
                return ajjVar8;
            case 11:
                return new ajj((OddsCountryProvider) this.v, (Event) this.w, (qkl) obj2, rq3Var, 11);
            case 12:
                ajj ajjVar9 = new ajj((qkl) obj2, rq3Var, 12);
                ajjVar9.t = obj;
                return ajjVar9;
            case 13:
                ajj ajjVar10 = new ajj((ill) this.w, (uv3) obj2, rq3Var, 13);
                ajjVar10.t = obj;
                return ajjVar10;
            case 14:
                ajj ajjVar11 = new ajj((dsf) this.v, (z88) this.w, (dsf) obj2, rq3Var, 14);
                ajjVar11.t = obj;
                return ajjVar11;
            case 15:
                return new ajj((j) this.t, (String) this.u, (File) this.v, (String) this.w, (c) obj2, rq3Var, 15);
            case 16:
                return new ajj((a) this.t, (s) this.u, (f) this.v, (Context) this.w, (String) obj2, rq3Var, 16);
            default:
                return new ajj((vh9) this.t, (String) this.u, (String) this.v, (byte[]) this.w, (up3) obj2, rq3Var, 17);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((ajj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0247, code lost:
    
        if (r3 == r2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x033b, code lost:
    
        if (r1 == r12) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02c8, code lost:
    
        if (r5.Z(r27) == r12) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x05bf, code lost:
    
        if (((java.util.Collection) r0).isEmpty() == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x05b5, code lost:
    
        if (r0 == r2) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x057d, code lost:
    
        if (r1 == r2) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0540, code lost:
    
        if (r1 == r2) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x075d, code lost:
    
        if (r0 == r3) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x06af, code lost:
    
        if (r7 == r3) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x067c, code lost:
    
        if (r9 == r3) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x07e5, code lost:
    
        if (r0 == r2) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x07ca, code lost:
    
        if (r5 == r2) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0966, code lost:
    
        if (r2 == r3) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x093a, code lost:
    
        if (r0 == r3) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0902, code lost:
    
        if (r1 == r3) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x09cf, code lost:
    
        if (r0 == r2) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x09c0, code lost:
    
        if (r1 == r2) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0b57, code lost:
    
        if (r5 == r2) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0c2a, code lost:
    
        if (defpackage.xw3.R(r0, r10, r27) != r1) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0bfb, code lost:
    
        if (r2 == r1) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01dc, code lost:
    
        if (defpackage.v7a.i(r2, r1, r27) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f4, code lost:
    
        if (r1.collect(r3, r27) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a3, code lost:
    
        if (((defpackage.j8f) r2).e.q(r27, r5) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0258, code lost:
    
        if (r1 == r2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0b9d A[LOOP:9: B:498:0x0b7a->B:500:0x0b9d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0b9a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v52, types: [zu4] */
    /* JADX WARN: Type inference failed for: r1v36, types: [zu4] */
    /* JADX WARN: Type inference failed for: r1v76, types: [zu4] */
    /* JADX WARN: Type inference failed for: r1v79, types: [zu4] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:422:0x0a4d -> B:412:0x0a4f). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        Object w;
        Object T;
        Bitmap bitmap;
        Object x;
        Object B;
        qnj qnjVar;
        gv9 gv9Var;
        gv9 gv9Var2;
        qnj qnjVar2;
        fdi fdiVar;
        Object value;
        gv9 gv9Var3;
        rnj rnjVar;
        gv9 gv9Var4;
        qvg qvgVar;
        av4 t2;
        Object w2;
        Object T2;
        av4 t3;
        Object b;
        Object u;
        List H0;
        yzc yzcVar;
        Object T3;
        av4 t4;
        Object w3;
        ProfileData profileData;
        Object T4;
        WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset;
        WeeklyLeagueImageUrl imageUrl;
        Object obj2;
        Object U;
        ArrayList arrayList;
        Object a;
        ArrayList arrayList2;
        Object u2;
        List<Integer> events;
        Object a2;
        av4 t5;
        zu4 t6;
        Object w4;
        av4 av4Var;
        Object T5;
        Object T6;
        Object T7;
        and andVar;
        Object r;
        qkl qklVar;
        OddsCountryProvider oddsCountryProvider;
        Venue venue;
        City city;
        and andVar2;
        Map<String, ProviderOdds> featured;
        ProviderOdds providerOdds;
        Map map;
        av4 t7;
        Object w5;
        gv9<rxb> gv9Var5;
        Object T8;
        List list;
        Map map2;
        Object R;
        av4 t8;
        Object w6;
        skl sklVar;
        Object T9;
        k8f k8fVar;
        fsf fsfVar;
        k8f k8fVar2;
        Object i;
        int i2 = this.r;
        int i3 = 5;
        int i4 = 4;
        boolean z = false;
        r5 = false;
        boolean z2 = false;
        int i5 = 3;
        int i6 = 2;
        Object obj3 = this.x;
        int i7 = 1;
        rq3 rq3Var = null;
        KType kType = null;
        KType kType2 = null;
        switch (i2) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                zij zijVar = new zij((ku3) this.t, (ogj) this.v, (ku3) this.w, (Function2) this.u, (AtomicReference) obj3);
                Function2 function2 = (Function2) this.u;
                this.s = 1;
                Object invoke = function2.invoke(zijVar, this);
                return invoke == lu3Var ? lu3Var : invoke;
            case 1:
                yy0 yy0Var = (yy0) obj3;
                hkj hkjVar = (hkj) this.w;
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i9 = this.s;
                rq3 rq3Var2 = null;
                if (i9 == 0) {
                    y6a.M(obj);
                    av4 t9 = xw3.t(ku3Var, null, new gkj(hkjVar, yy0Var, rq3Var2, z ? 1 : 0), 3);
                    t = xw3.t(ku3Var, null, new gkj(hkjVar, yy0Var, rq3Var2, 1), 3);
                    this.t = null;
                    this.u = t;
                    this.s = 1;
                    w = t9.w(this);
                    break;
                } else if (i9 == 1) {
                    t = (av4) this.u;
                    y6a.M(obj);
                    w = obj;
                } else {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Bitmap bitmap2 = (Bitmap) this.v;
                    y6a.M(obj);
                    bitmap = bitmap2;
                    T = obj;
                    Bitmap bitmap3 = (Bitmap) T;
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a;
                    ccj ccjVar = new ccj(bitmap, bitmap3, hkjVar, rq3Var2, 1);
                    this.t = null;
                    this.u = null;
                    this.v = null;
                    this.s = 3;
                    break;
                }
                Bitmap bitmap4 = (Bitmap) w;
                this.t = null;
                this.u = null;
                this.v = bitmap4;
                this.s = 2;
                T = t.T(this);
                if (T != lu3Var2) {
                    bitmap = bitmap4;
                    Bitmap bitmap32 = (Bitmap) T;
                    hs4 hs4Var2 = z45.a;
                    r69 r69Var2 = rob.a;
                    ccj ccjVar2 = new ccj(bitmap, bitmap32, hkjVar, rq3Var2, 1);
                    this.t = null;
                    this.u = null;
                    this.v = null;
                    this.s = 3;
                }
                return lu3Var2;
            case 2:
                boj bojVar = (boj) obj3;
                rnj rnjVar2 = (rnj) this.w;
                koj kojVar = (koj) this.u;
                lu3 lu3Var3 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    List list2 = (List) this.v;
                    this.s = 1;
                    x = kojVar.x(list2, rnjVar2, bojVar, this);
                    break;
                } else if (i10 == 1) {
                    y6a.M(obj);
                    x = obj;
                } else {
                    if (i10 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qnjVar = (qnj) this.t;
                    y6a.M(obj);
                    B = obj;
                    gv9Var = (gv9) B;
                    Pair E = koj.E(gv9Var, qnjVar);
                    gv9Var2 = (gv9) E.a;
                    qnjVar2 = (qnj) E.b;
                    fdiVar = kojVar.e;
                    while (true) {
                        value = fdiVar.getValue();
                        gv9Var3 = gv9Var;
                        rnjVar = rnjVar2;
                        gv9Var4 = gv9Var2;
                        rnjVar2 = rnjVar;
                        if (!fdiVar.k(value, new unb(new ynj(gv9Var3, gv9Var4, bojVar, rnjVar, false, qnjVar2)))) {
                            return Unit.a;
                        }
                        gv9Var = gv9Var3;
                        gv9Var2 = gv9Var4;
                    }
                }
                qnj qnjVar3 = (qnj) x;
                this.t = qnjVar3;
                this.s = 2;
                B = kojVar.B(qnjVar3, rnjVar2, bojVar, this);
                if (B != lu3Var3) {
                    qnjVar = qnjVar3;
                    gv9Var = (gv9) B;
                    Pair E2 = koj.E(gv9Var, qnjVar);
                    gv9Var2 = (gv9) E2.a;
                    qnjVar2 = (qnj) E2.b;
                    fdiVar = kojVar.e;
                    while (true) {
                        value = fdiVar.getValue();
                        gv9Var3 = gv9Var;
                        rnjVar = rnjVar2;
                        gv9Var4 = gv9Var2;
                        rnjVar2 = rnjVar;
                        if (!fdiVar.k(value, new unb(new ynj(gv9Var3, gv9Var4, bojVar, rnjVar, false, qnjVar2)))) {
                        }
                        gv9Var = gv9Var3;
                        gv9Var2 = gv9Var4;
                    }
                }
                return lu3Var3;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object B2 = uxf.w.B((String) this.t, (Map) this.u, (ct8) this.v, (Function1) this.w, (Function1) obj3, this);
                    return B2 == lu3Var4 ? lu3Var4 : B2;
                }
                if (i11 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                svg svgVar = (svg) this.w;
                fsf fsfVar2 = (fsf) obj3;
                quj qujVar = (quj) this.v;
                lu3 lu3Var5 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    qvg qvgVar2 = (qvg) this.t;
                    float i13 = svgVar.i(svgVar.e(((ouj) fsfVar2.a).a));
                    svg svgVar2 = (svg) qujVar.b;
                    svgVar2.g(svgVar2.e(qvgVar2.a(1, svgVar2.h(svgVar2.d(i13)))));
                    qvgVar = qvgVar2;
                    if (!((ouj) fsfVar2.a).c) {
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsf fsfVar3 = (fsf) this.u;
                    qvg qvgVar3 = (qvg) this.t;
                    y6a.M(obj);
                    qvg qvgVar4 = qvgVar3;
                    fsf fsfVar4 = fsfVar3;
                    Object r2 = obj;
                    fsfVar4.a = r2;
                    ouj oujVar = (ouj) fsfVar2.a;
                    fp4 fp4Var = (fp4) qujVar.e;
                    long j = oujVar.b;
                    long j2 = oujVar.a;
                    ((xmk) fp4Var.b).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((xmk) fp4Var.c).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
                    ouj m = quj.m(qujVar.f);
                    if (m != null) {
                        fp4 fp4Var2 = (fp4) qujVar.e;
                        long j3 = m.b;
                        long j4 = m.a;
                        ((xmk) fp4Var2.b).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                        ((xmk) fp4Var2.c).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                        fsfVar2.a = ((ouj) fsfVar2.a).a(m);
                    }
                    float i14 = svgVar.i(svgVar.e(((ouj) fsfVar2.a).a));
                    svg svgVar3 = (svg) qujVar.b;
                    svgVar3.g(svgVar3.e(qvgVar4.a(1, svgVar3.h(svgVar3.d(i14)))));
                    i7 = 1;
                    qvgVar = qvgVar4;
                    rq3Var = null;
                    if (!((ouj) fsfVar2.a).c) {
                        g62 g62Var = qujVar.f;
                        this.t = qvgVar;
                        this.u = fsfVar2;
                        this.s = i7;
                        r2 = s9a.r(new gjb(g62Var, rq3Var, 17), this);
                        if (r2 == lu3Var5) {
                            return lu3Var5;
                        }
                        qvgVar4 = qvgVar;
                        fsfVar4 = fsfVar2;
                        fsfVar4.a = r2;
                        ouj oujVar2 = (ouj) fsfVar2.a;
                        fp4 fp4Var3 = (fp4) qujVar.e;
                        long j5 = oujVar2.b;
                        long j22 = oujVar2.a;
                        ((xmk) fp4Var3.b).a(j5, Float.intBitsToFloat((int) (j22 >> 32)));
                        ((xmk) fp4Var3.c).a(j5, Float.intBitsToFloat((int) (j22 & 4294967295L)));
                        ouj m2 = quj.m(qujVar.f);
                        if (m2 != null) {
                        }
                        float i142 = svgVar.i(svgVar.e(((ouj) fsfVar2.a).a));
                        svg svgVar32 = (svg) qujVar.b;
                        svgVar32.g(svgVar32.e(qvgVar4.a(1, svgVar32.h(svgVar32.d(i142)))));
                        i7 = 1;
                        qvgVar = qvgVar4;
                        rq3Var = null;
                        if (!((ouj) fsfVar2.a).c) {
                            return Unit.a;
                        }
                    }
                }
            case 5:
                String str = (String) obj3;
                c0k c0kVar = (c0k) this.w;
                ku3 ku3Var2 = (ku3) this.v;
                lu3 lu3Var6 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    av4 t10 = xw3.t(ku3Var2, null, new b0k(c0kVar, str, rq3Var, i7), 3);
                    t2 = xw3.t(ku3Var2, null, new b0k(c0kVar, str, rq3Var, z ? 1 : 0), 3);
                    this.v = null;
                    this.u = t2;
                    this.s = 1;
                    w2 = t10.w(this);
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj4 = this.t;
                        y6a.M(obj);
                        w2 = obj4;
                        T2 = obj;
                        return new Pair(w2, T2);
                    }
                    t2 = (av4) this.u;
                    y6a.M(obj);
                    w2 = obj;
                }
                this.v = null;
                this.u = null;
                this.t = w2;
                this.s = 2;
                T2 = t2.T(this);
                break;
            case 6:
                g4k g4kVar = (g4k) obj3;
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var7 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    t3 = xw3.t(ku3Var3, null, new luj(g4kVar, rq3Var, i3), 3);
                    z3k z3kVar = g4kVar.f;
                    this.t = ku3Var3;
                    this.u = t3;
                    this.s = 1;
                    b = z3kVar.b(this);
                    break;
                } else if (i16 == 1) {
                    ?? r1 = (zu4) this.u;
                    y6a.M(obj);
                    t3 = r1;
                    b = obj;
                } else {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        H0 = (List) this.w;
                        yzcVar = (yzc) this.v;
                        y6a.M(obj);
                        T3 = obj;
                        yzcVar.j(new Pair(H0, T3));
                        return Unit.a;
                    }
                    ?? r0 = (zu4) this.u;
                    y6a.M(obj);
                    t3 = r0;
                    u = obj;
                    H0 = CollectionsKt.H0(k13.s((Iterable) u), new rs2(new t6j(20), 19));
                    yzcVar = g4kVar.i;
                    this.t = null;
                    this.u = null;
                    this.v = yzcVar;
                    this.w = H0;
                    this.s = 3;
                    T3 = t3.T(this);
                    break;
                }
                Iterable iterable = (Iterable) b;
                ArrayList arrayList3 = new ArrayList(k13.r(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList3.add(xw3.t(ku3Var3, null, new vki(g4kVar, (String) it.next(), rq3Var, 24), 3));
                }
                this.t = null;
                this.u = t3;
                this.s = 2;
                u = m6k.u(arrayList3, this);
                break;
            case 7:
                j3l j3lVar = (j3l) obj3;
                fdi fdiVar2 = j3lVar.h;
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var8 = lu3.a;
                int i17 = this.s;
                f3l f3lVar = f3l.a;
                if (i17 == 0) {
                    y6a.M(obj);
                    UserAccount b2 = j3lVar.e.b();
                    if (!b2.getIsLoggedIn()) {
                        fdiVar2.getClass();
                        fdiVar2.m(null, f3lVar);
                        return Unit.a;
                    }
                    av4 t11 = xw3.t(ku3Var4, null, new i3l(j3lVar, b2, rq3Var, z ? 1 : 0), 3);
                    t4 = xw3.t(ku3Var4, null, new luj(j3lVar, rq3Var, 7), 3);
                    this.t = ku3Var4;
                    this.u = t4;
                    this.s = 1;
                    w3 = t11.w(this);
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ProfileData profileData2 = (ProfileData) this.w;
                        j3lVar = (j3l) this.v;
                        y6a.M(obj);
                        profileData = profileData2;
                        T4 = obj;
                        WeeklyChallengeAssetsResponse weeklyChallengeAssetsResponse = (WeeklyChallengeAssetsResponse) T4;
                        List<WeeklyChallengeLeagueAsset> meta = weeklyChallengeAssetsResponse != null ? weeklyChallengeAssetsResponse.getMeta() : null;
                        if (meta != null) {
                            Iterator it2 = meta.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    int level = ((WeeklyChallengeLeagueAsset) obj2).getLevel();
                                    Integer weeklyChallengeMaxFinishedLeagueLevel = profileData.getWeeklyChallengeMaxFinishedLeagueLevel();
                                    if (weeklyChallengeMaxFinishedLeagueLevel != null && level == weeklyChallengeMaxFinishedLeagueLevel.intValue()) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            weeklyChallengeLeagueAsset = (WeeklyChallengeLeagueAsset) obj2;
                        } else {
                            weeklyChallengeLeagueAsset = null;
                        }
                        if (profileData.getWeeklyChallengeCurrentWeeklyStreak() == null && profileData.getWeeklyChallengeMaxWeeklyStreak() == null && profileData.getWeeklyChallengeBestRank() == null && profileData.getWeeklyChallengeMaxFinishedLeagueLevel() == null) {
                            fdi fdiVar3 = j3lVar.h;
                            fdiVar3.getClass();
                            fdiVar3.m(null, f3lVar);
                        } else {
                            fdi fdiVar4 = j3lVar.h;
                            g3l g3lVar = new g3l((profileData.getWeeklyChallengeCurrentWeeklyStreak() == null && profileData.getWeeklyChallengeMaxWeeklyStreak() == null) ? null : new q5l(profileData.getWeeklyChallengeCurrentWeeklyStreak(), profileData.getWeeklyChallengeMaxWeeklyStreak()), (profileData.getWeeklyChallengeBestRank() == null && profileData.getWeeklyChallengeMaxFinishedLeagueLevel() == null) ? null : new s2l(profileData.getWeeklyChallengeBestRank(), profileData.getWeeklyChallengeMaxFinishedLeagueLevel(), (weeklyChallengeLeagueAsset == null || (imageUrl = weeklyChallengeLeagueAsset.getImageUrl()) == null) ? null : imageUrl.getPng(), weeklyChallengeLeagueAsset != null ? weeklyChallengeLeagueAsset.getTitle() : null));
                            fdiVar4.getClass();
                            fdiVar4.m(null, g3lVar);
                        }
                        return Unit.a;
                    }
                    t4 = (av4) this.u;
                    y6a.M(obj);
                    w3 = obj;
                }
                profileData = (ProfileData) yaa.x((x2g) w3);
                if (profileData == null) {
                    fdiVar2.getClass();
                    fdiVar2.m(null, f3lVar);
                    return Unit.a;
                }
                this.t = ku3Var4;
                this.u = null;
                this.v = j3lVar;
                this.w = profileData;
                this.s = 2;
                T4 = t4.T(this);
                break;
                break;
            case 8:
                WeeklyChallengeViewModel weeklyChallengeViewModel = (WeeklyChallengeViewModel) this.v;
                ku3 ku3Var5 = (ku3) this.t;
                lu3 lu3Var9 = lu3.a;
                int i18 = this.s;
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            if (i18 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            u2 = obj;
                            List list3 = (List) u2;
                            if (list3 != null) {
                                return CollectionsKt.W(list3);
                            }
                            return null;
                        }
                        ArrayList arrayList4 = (ArrayList) this.u;
                        y6a.M(obj);
                        arrayList = arrayList4;
                        a = obj;
                        PopularEventsResponse popularEventsResponse = (PopularEventsResponse) a;
                        if (popularEventsResponse == null || (events = popularEventsResponse.getEvents()) == null) {
                            arrayList2 = null;
                        } else {
                            Set set = (Set) obj3;
                            arrayList2 = new ArrayList();
                            for (Object obj5 : events) {
                                int intValue = ((Number) obj5).intValue();
                                if (!arrayList.contains(new Integer(intValue))) {
                                    Set set2 = set;
                                    if (set2 != null && !set2.isEmpty()) {
                                        Set set3 = set;
                                        PopularEvent popularEvent = (PopularEvent) me4.f(intValue, popularEventsResponse.getPopularEvents());
                                        if (!CollectionsKt.R(set3, popularEvent != null ? popularEvent.getSport() : null)) {
                                        }
                                    }
                                    arrayList2.add(obj5);
                                }
                            }
                        }
                        ArrayList L0 = arrayList2 != null ? CollectionsKt.L0(arrayList2, ((Integer) this.w).intValue()) : null;
                        if (L0 != null) {
                            arrayList2 = L0;
                        }
                        if (arrayList2 == null) {
                            return null;
                        }
                        ArrayList arrayList5 = new ArrayList(k13.r(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(xw3.t(ku3Var5, null, new e4l(weeklyChallengeViewModel, ((Number) it3.next()).intValue(), rq3Var, z ? 1 : 0), 3));
                        }
                        this.t = null;
                        this.u = null;
                        this.s = 3;
                        u2 = m6k.u(arrayList5, this);
                        break;
                    } else {
                        y6a.M(obj);
                        U = obj;
                    }
                } else {
                    y6a.M(obj);
                    fyk fykVar = weeklyChallengeViewModel.g;
                    this.t = ku3Var5;
                    this.s = 1;
                    U = gz8.U(this, fykVar.a.a, true, false, new nxk(i6));
                    break;
                }
                Iterable iterable2 = (Iterable) U;
                arrayList = new ArrayList(k13.r(iterable2, 10));
                Iterator it4 = iterable2.iterator();
                while (it4.hasNext()) {
                    w1l.A(arrayList, ((DbVote) it4.next()).getId());
                }
                a3l a3lVar = weeklyChallengeViewModel.e;
                this.t = ku3Var5;
                this.u = arrayList;
                this.s = 2;
                a = a3lVar.a(this);
                break;
            case 9:
                String str2 = (String) obj3;
                String str3 = (String) this.w;
                lu3 lu3Var10 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    String str4 = (String) this.t;
                    ct8 ct8Var = (ct8) this.u;
                    xjd xjdVar = new xjd((tm0) this.v, 13);
                    i20 i20Var = new i20(13, str3, str2);
                    this.s = 1;
                    a2 = k38.a(str4, ct8Var, xjdVar, i20Var, this, 1);
                    if (a2 == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    a2 = obj;
                }
                int intValue2 = ((Number) a2).intValue();
                if (200 <= intValue2 && intValue2 < 400) {
                    cjb.a("Successfully fired " + str3 + " event tracker [" + str2 + ']');
                }
                return Unit.a;
            case 10:
                kgl kglVar = (kgl) obj3;
                ku3 ku3Var6 = (ku3) this.t;
                lu3 lu3Var11 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    av4 t12 = xw3.t(ku3Var6, null, new ggl(kglVar, rq3Var, i3), 3);
                    av4 t13 = xw3.t(ku3Var6, null, new ggl(kglVar, rq3Var, i5), 3);
                    t5 = xw3.t(ku3Var6, null, new ggl(kglVar, rq3Var, i4), 3);
                    t6 = xw3.t(ku3Var6, null, new ggl(kglVar, rq3Var, i6), 3);
                    this.t = null;
                    this.u = t13;
                    this.v = t5;
                    this.w = t6;
                    this.s = 1;
                    w4 = t12.w(this);
                    if (w4 != lu3Var11) {
                        av4Var = t13;
                    }
                    return lu3Var11;
                }
                if (i20 != 1) {
                    if (i20 != 2) {
                        if (i20 != 3) {
                            if (i20 != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            T7 = obj;
                            break;
                        } else {
                            t6 = (zu4) this.w;
                            y6a.M(obj);
                            T6 = obj;
                            Iterable iterable3 = (Iterable) T6;
                            if (!(iterable3 instanceof Collection) || !((Collection) iterable3).isEmpty()) {
                                Iterator it5 = iterable3.iterator();
                                while (it5.hasNext()) {
                                    if (Intrinsics.c((String) it5.next(), Sports.FOOTBALL)) {
                                        z = true;
                                        return Boolean.valueOf(z);
                                    }
                                }
                            }
                            this.t = null;
                            this.u = null;
                            this.v = null;
                            this.w = null;
                            this.s = 4;
                            T7 = t6.T(this);
                            break;
                        }
                    } else {
                        t6 = (zu4) this.w;
                        ?? r12 = (zu4) this.v;
                        y6a.M(obj);
                        t5 = r12;
                        T5 = obj;
                        Iterable iterable4 = (Iterable) T5;
                        if (!(iterable4 instanceof Collection) || !((Collection) iterable4).isEmpty()) {
                            Iterator it6 = iterable4.iterator();
                            while (it6.hasNext()) {
                                if (Intrinsics.c(((UniqueTournament) it6.next()).getSportSlug(), Sports.FOOTBALL)) {
                                    z = true;
                                    return Boolean.valueOf(z);
                                }
                            }
                        }
                        this.t = null;
                        this.u = null;
                        this.v = null;
                        this.w = t6;
                        this.s = 3;
                        T6 = t5.T(this);
                        break;
                    }
                } else {
                    t6 = (zu4) this.w;
                    ?? r13 = (zu4) this.v;
                    av4Var = (av4) this.u;
                    y6a.M(obj);
                    t5 = r13;
                    w4 = obj;
                }
                Iterable iterable5 = (Iterable) w4;
                if (!(iterable5 instanceof Collection) || !((Collection) iterable5).isEmpty()) {
                    Iterator it7 = iterable5.iterator();
                    while (it7.hasNext()) {
                        if (Intrinsics.c(((Team) it7.next()).getSportSlug(), Sports.FOOTBALL)) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                this.t = null;
                this.u = null;
                this.v = t5;
                this.w = t6;
                this.s = 2;
                T5 = av4Var.T(this);
                break;
            case 11:
                qkl qklVar2 = (qkl) obj3;
                Event event = (Event) this.w;
                lu3 lu3Var12 = lu3.a;
                int i21 = this.s;
                boolean z3 = false;
                if (i21 == 0) {
                    y6a.M(obj);
                    OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) this.v;
                    if (oddsCountryProvider2 == null) {
                        andVar = null;
                        wn1 R2 = gz8.R(qklVar2.i(), event, true);
                        r9k w7 = wba.w(event.getTournament().getGroupName());
                        Regex regex = c7g.a;
                        Round roundInfo = event.getRoundInfo();
                        r9k a3 = c7g.a(roundInfo != null ? roundInfo.getName() : null, event.getSportSlug());
                        venue = event.getVenue();
                        if (venue != null || (city = venue.getCity()) == null || (r0 = city.getName()) == null) {
                            String str5 = "";
                        }
                        String str6 = str5;
                        Round roundInfo2 = event.getRoundInfo();
                        boolean R3 = CollectionsKt.R(b.j("Match for 3rd place", "3rd place playoffs", "3rd place playoff", "Bronzefinal", "3rd place final", "Bronze"), roundInfo2 != null ? roundInfo2.getName() : null);
                        Round roundInfo3 = event.getRoundInfo();
                        return new xel(R2, w7, a3, str6, null, R3, Intrinsics.c(roundInfo3 != null ? roundInfo3.getName() : null, "Final"), andVar);
                    }
                    umd umdVar = qklVar2.s;
                    this.t = qklVar2;
                    this.u = oddsCountryProvider2;
                    this.s = 1;
                    umdVar.getClass();
                    r = s9a.r(new kmd(umdVar, oddsCountryProvider2, event, (rq3) (z3 ? 1 : 0), 1), this);
                    if (r == lu3Var12) {
                        return lu3Var12;
                    }
                    qklVar = qklVar2;
                    oddsCountryProvider = oddsCountryProvider2;
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oddsCountryProvider = (OddsCountryProvider) this.u;
                    qkl qklVar3 = (qkl) this.t;
                    y6a.M(obj);
                    qklVar = qklVar3;
                    r = obj;
                }
                FeaturedOddsResponse featuredOddsResponse = (FeaturedOddsResponse) r;
                if (featuredOddsResponse != null && (featured = featuredOddsResponse.getFeatured()) != null && (providerOdds = featured.get(oddsCountryProvider.getFeaturedOddsType())) != null) {
                    if (providerOdds.getMarketId() != 1) {
                        providerOdds = null;
                    }
                    if (providerOdds != null) {
                        andVar2 = r4a.B(qklVar.i(), oddsCountryProvider, providerOdds);
                        andVar = andVar2;
                        wn1 R22 = gz8.R(qklVar2.i(), event, true);
                        r9k w72 = wba.w(event.getTournament().getGroupName());
                        Regex regex2 = c7g.a;
                        Round roundInfo4 = event.getRoundInfo();
                        r9k a32 = c7g.a(roundInfo4 != null ? roundInfo4.getName() : null, event.getSportSlug());
                        venue = event.getVenue();
                        if (venue != null) {
                        }
                        String str52 = "";
                        String str62 = str52;
                        Round roundInfo22 = event.getRoundInfo();
                        boolean R32 = CollectionsKt.R(b.j("Match for 3rd place", "3rd place playoffs", "3rd place playoff", "Bronzefinal", "3rd place final", "Bronze"), roundInfo22 != null ? roundInfo22.getName() : null);
                        Round roundInfo32 = event.getRoundInfo();
                        return new xel(R22, w72, a32, str62, null, R32, Intrinsics.c(roundInfo32 != null ? roundInfo32.getName() : null, "Final"), andVar);
                    }
                }
                andVar2 = null;
                andVar = andVar2;
                wn1 R222 = gz8.R(qklVar2.i(), event, true);
                r9k w722 = wba.w(event.getTournament().getGroupName());
                Regex regex22 = c7g.a;
                Round roundInfo42 = event.getRoundInfo();
                r9k a322 = c7g.a(roundInfo42 != null ? roundInfo42.getName() : null, event.getSportSlug());
                venue = event.getVenue();
                if (venue != null) {
                }
                String str522 = "";
                String str622 = str522;
                Round roundInfo222 = event.getRoundInfo();
                boolean R322 = CollectionsKt.R(b.j("Match for 3rd place", "3rd place playoffs", "3rd place playoff", "Bronzefinal", "3rd place final", "Bronze"), roundInfo222 != null ? roundInfo222.getName() : null);
                Round roundInfo322 = event.getRoundInfo();
                return new xel(R222, w722, a322, str622, null, R322, Intrinsics.c(roundInfo322 != null ? roundInfo322.getName() : null, "Final"), andVar);
            case 12:
                qkl qklVar4 = (qkl) obj3;
                ku3 ku3Var7 = (ku3) this.t;
                lu3 lu3Var13 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    g9i g9iVar = qklVar4.R;
                    if (g9iVar != null) {
                        this.t = ku3Var7;
                        this.s = 1;
                        break;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            if (i22 != 3) {
                                if (i22 != 4) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y6a.M(obj);
                                return obj;
                            }
                            List list4 = (List) this.w;
                            map2 = (Map) this.u;
                            y6a.M(obj);
                            list = list4;
                            T8 = obj;
                            Set set4 = (Set) T8;
                            hs4 hs4Var3 = z45.a;
                            jk jkVar = new jk(list, qklVar4, map2, set4, (rq3) null);
                            this.t = null;
                            this.u = null;
                            this.v = null;
                            this.w = null;
                            this.s = 4;
                            R = xw3.R(hs4Var3, jkVar, this);
                            if (R != lu3Var13) {
                                return R;
                            }
                            return lu3Var13;
                        }
                        t7 = (av4) this.v;
                        Map map3 = (Map) this.u;
                        y6a.M(obj);
                        map = map3;
                        w5 = obj;
                        List list5 = (List) w5;
                        if (list5 == null) {
                            return null;
                        }
                        this.t = null;
                        this.u = map;
                        this.v = null;
                        this.w = list5;
                        this.s = 3;
                        T8 = t7.T(this);
                        if (T8 != lu3Var13) {
                            list = list5;
                            map2 = map;
                            Set set42 = (Set) T8;
                            hs4 hs4Var32 = z45.a;
                            jk jkVar2 = new jk(list, qklVar4, map2, set42, (rq3) null);
                            this.t = null;
                            this.u = null;
                            this.v = null;
                            this.w = null;
                            this.s = 4;
                            R = xw3.R(hs4Var32, jkVar2, this);
                            if (R != lu3Var13) {
                            }
                        }
                        return lu3Var13;
                    }
                    y6a.M(obj);
                }
                oil oilVar = (oil) qklVar4.l().a();
                if (oilVar == null || (gv9Var5 = oilVar.q) == null) {
                    map = null;
                } else {
                    int c = sub.c(k13.r(gv9Var5, 10));
                    if (c < 16) {
                        c = 16;
                    }
                    map = new LinkedHashMap(c);
                    for (rxb rxbVar : gv9Var5) {
                        map.put(new Integer(rxbVar.a.getId()), rxbVar.g);
                    }
                }
                if (map == null) {
                    map = lm5.a;
                    map.getClass();
                }
                av4 t14 = xw3.t(ku3Var7, null, new njl(qklVar4, rq3Var, i3), 3);
                t7 = xw3.t(ku3Var7, null, new njl(qklVar4, rq3Var, 6), 3);
                this.t = null;
                this.u = map;
                this.v = t7;
                this.s = 2;
                w5 = t14.w(this);
                lu3 lu3Var14 = lu3.a;
                break;
            case 13:
                uv3 uv3Var = (uv3) obj3;
                ill illVar = (ill) this.w;
                ku3 ku3Var8 = (ku3) this.t;
                lu3 lu3Var15 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    av4 t15 = xw3.t(ku3Var8, null, new hll(illVar, uv3Var, rq3Var, z ? 1 : 0), 3);
                    t8 = xw3.t(ku3Var8, null, new hll(illVar, uv3Var, rq3Var, i7), 3);
                    this.t = null;
                    this.u = t8;
                    this.s = 1;
                    w6 = t15.w(this);
                    break;
                } else {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        skl sklVar2 = (skl) this.v;
                        y6a.M(obj);
                        sklVar = sklVar2;
                        T9 = obj;
                        illVar.n(null, new ncj(14, uv3Var, sklVar, (Bitmap) T9));
                        return Unit.a;
                    }
                    t8 = (av4) this.u;
                    y6a.M(obj);
                    w6 = obj;
                }
                sklVar = (skl) w6;
                this.t = null;
                this.u = null;
                this.v = sklVar;
                this.s = 2;
                T9 = t8.T(this);
                break;
            case 14:
                dsf dsfVar = (dsf) this.v;
                lu3 lu3Var16 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    k8fVar = (k8f) this.t;
                    fsfVar = new fsf();
                    y7k y7kVar = new y7k(dsfVar.a);
                    this.t = k8fVar;
                    this.u = fsfVar;
                    this.s = 1;
                    break;
                } else {
                    if (i24 != 1) {
                        if (i24 == 2 || i24 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = (fsf) this.u;
                    k8fVar = (k8f) this.t;
                    y6a.M(obj);
                }
                fsf fsfVar5 = fsfVar;
                k8f k8fVar3 = k8fVar;
                z88 z88Var = (z88) this.w;
                dsf dsfVar2 = (dsf) obj3;
                if (z88Var == null) {
                    if (dsfVar2.a == 0 || fsfVar5.a != null) {
                        k8fVar2 = k8fVar3;
                    } else {
                        k8fVar2 = k8fVar3;
                        fsfVar5.a = xw3.L(k8fVar2, null, null, new kuj(dsfVar2, fsfVar5, dsfVar, k8fVar3, (rq3) null, 23), 3);
                    }
                    d dVar = new d(fsfVar5, 12);
                    this.t = null;
                    this.u = null;
                    this.s = 2;
                    break;
                } else {
                    z88 H = hkg.H(z88Var);
                    j0 j0Var = new j0(dsfVar2, fsfVar5, k8fVar3, dsfVar);
                    this.t = null;
                    this.u = null;
                    this.s = 3;
                    break;
                }
                break;
            case 15:
                String str7 = (String) this.u;
                j jVar = (j) this.t;
                lu3 lu3Var17 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    n nVar = jVar.b;
                    File file = (File) this.v;
                    String str8 = (String) this.w;
                    this.s = 1;
                    hs4 hs4Var4 = z45.a;
                    if (xw3.R(hq4.c, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c(nVar, str7, file, (c) obj3, str8, null), this) == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                jVar.f.remove(str7);
                jVar.g.remove(str7);
                return Unit.a;
            case 16:
                return e(obj);
            default:
                String str9 = (String) this.u;
                lu3 lu3Var18 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    vh9 vh9Var = (vh9) this.t;
                    String str10 = (String) this.v;
                    byte[] bArr = (byte[]) this.w;
                    up3 up3Var = (up3) obj3;
                    yj9 yj9Var = new yj9();
                    yj9Var.d(ij9.c);
                    pm0 pm0Var = ak9.a;
                    str9.getClass();
                    n8k.b(yj9Var.a, str9);
                    if (str10 != null && (!StringsKt.R(str10))) {
                        List list6 = zi9.a;
                        yj9Var.c.i("Content-Encoding", str10);
                        Unit unit = Unit.a;
                    }
                    if (bArr == null) {
                        yj9Var.d = kid.a;
                        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(byte[].class);
                        try {
                            kType2 = duf.b(byte[].class);
                        } catch (Throwable unused) {
                        }
                        yj9Var.b(new h5k(orCreateKotlinClass, kType2));
                    } else if (bArr instanceof swd) {
                        yj9Var.d = bArr;
                        yj9Var.b(null);
                    } else {
                        yj9Var.d = bArr;
                        KClass orCreateKotlinClass2 = duf.a.getOrCreateKotlinClass(byte[].class);
                        try {
                            kType = duf.b(byte[].class);
                        } catch (Throwable unused2) {
                        }
                        yj9Var.b(new h5k(orCreateKotlinClass2, kType));
                    }
                    xw3.D(yj9Var, up3Var);
                    com.facebook.appevents.n.i(yj9Var, 5000L);
                    yj9Var.d(ij9.c);
                    wj9 wj9Var = new wj9(yj9Var, vh9Var);
                    this.s = 1;
                    i = wj9Var.i(this);
                    if (i == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    i = obj;
                }
                zk9 d = ((aq4) i).d();
                MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "HttpClient", "Response status: " + d + " for url: " + str9, false, 4, null);
                zk9 zk9Var = zk9.c;
                d.getClass();
                int i27 = d.a;
                zk9Var.getClass();
                if (i27 - zk9Var.a >= 0) {
                    zk9 zk9Var2 = zk9.k;
                    zk9Var2.getClass();
                    if (i27 - zk9Var2.a < 0) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ajj(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = obj;
        this.x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ajj(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ajj(Object obj, Object obj2, Object obj3, Serializable serializable, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
        this.x = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ajj(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.x = obj;
    }
}
