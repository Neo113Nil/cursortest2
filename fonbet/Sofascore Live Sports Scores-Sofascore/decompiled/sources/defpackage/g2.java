package defpackage;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.CategoriesForDateResponse;
import com.sofascore.model.newNetwork.CategoryWrapper;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import com.sofascore.model.newNetwork.PostChatMessage;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment;
import com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g2 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(z88 z88Var, rq3 rq3Var, pk0 pk0Var) {
        super(2, rq3Var);
        this.r = 10;
        this.u = z88Var;
        this.v = pk0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new g2((wzc) this.t, (k6f) this.u, (q55) obj2, rq3Var, 0);
            case 1:
                g2 g2Var = new g2((kk) obj2, rq3Var, 1);
                g2Var.u = obj;
                return g2Var;
            case 2:
                g2 g2Var2 = new g2((dk2) this.u, (AlertDialog) obj2, rq3Var, 2);
                g2Var2.t = obj;
                return g2Var2;
            case 3:
                g2 g2Var3 = new g2((ct8) this.u, (dx) obj2, rq3Var, 3);
                g2Var3.t = obj;
                return g2Var3;
            case 4:
                g2 g2Var4 = new g2((ct8) this.u, (dx) obj2, rq3Var, 4);
                g2Var4.t = obj;
                return g2Var4;
            case 5:
                g2 g2Var5 = new g2((et8) this.u, (dx) obj2, rq3Var, 5);
                g2Var5.t = obj;
                return g2Var5;
            case 6:
                g2 g2Var6 = new g2((et8) this.u, (dx) obj2, rq3Var, 6);
                g2Var6.t = obj;
                return g2Var6;
            case 7:
                g2 g2Var7 = new g2((axj) this.u, (e1d) obj2, rq3Var, 7);
                g2Var7.t = obj;
                return g2Var7;
            case 8:
                return new g2((t01) this.t, (Context) this.u, (re0) obj2, rq3Var, 8);
            case 9:
                return new g2((yj0) this.u, (ij0) obj2, rq3Var, 9);
            case 10:
                g2 g2Var8 = new g2((z88) this.u, rq3Var, (pk0) obj2);
                g2Var8.t = obj;
                return g2Var8;
            case 11:
                return new g2((b1d) this.t, (Fragment) this.u, rq3Var, (u11) obj2, 11);
            case 12:
                return new g2((us2) this.t, (String) this.u, (PostChatMessage) obj2, rq3Var, 12);
            case 13:
                g2 g2Var9 = new g2((UniqueTournament) this.u, (BaseCupTreeFragment) obj2, rq3Var, 13);
                g2Var9.t = obj;
                return g2Var9;
            case 14:
                return new g2((n29) this.t, (ct8) this.u, this.v, rq3Var, 14);
            case 15:
                return new g2((f1d) this.u, (ykj) obj2, rq3Var, 15);
            case 16:
                return new g2((x32) this.t, (wdd) this.u, (y1) obj2, rq3Var, 16);
            case 17:
                g2 g2Var10 = new g2((p03) obj2, rq3Var, 17);
                g2Var10.u = obj;
                return g2Var10;
            case 18:
                g2 g2Var11 = new g2((aea) this.u, (va8) obj2, rq3Var, 18);
                g2Var11.t = obj;
                return g2Var11;
            case 19:
                g2 g2Var12 = new g2((b98) this.u, (rn2) obj2, rq3Var, 19);
                g2Var12.t = obj;
                return g2Var12;
            case 20:
                g2 g2Var13 = new g2((l4h) this.u, obj2, rq3Var, 20);
                g2Var13.t = obj;
                return g2Var13;
            case 21:
                return new g2((us2) this.u, (Event) obj2, rq3Var, 21);
            case 22:
                return new g2((Context) this.t, (String) this.u, (Bitmap.Config) obj2, rq3Var, 22);
            case 23:
                return new g2((b1d) this.t, (CompetitionsFragment) this.u, rq3Var, (CompetitionsFragment) obj2, 23);
            case 24:
                return new g2((Function1) this.t, (qug) this.u, (Function1) obj2, rq3Var, 24);
            case 25:
                return new g2((Function1) this.t, (ksa) this.u, (Function1) obj2, rq3Var, 25);
            case 26:
                return new g2((ov3) this.t, (String) this.u, (String) obj2, rq3Var, 26);
            case 27:
                g2 g2Var14 = new g2((qf4) obj2, rq3Var, 27);
                g2Var14.u = obj;
                return g2Var14;
            case 28:
                g2 g2Var15 = new g2((qf4) this.u, (Function2) obj2, rq3Var, 28);
                g2Var15.t = obj;
                return g2Var15;
            default:
                return new g2((ai4) this.t, (String) this.u, (String) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 11:
                ((g2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 23:
                ((g2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((g2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x041f, code lost:
    
        if (r4 == r1) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x058b, code lost:
    
        if (defpackage.fcp.c0(r8, r0, r19) == r10) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x05a7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0577, code lost:
    
        if (r9.c(r0, r19) == r10) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x05e3, code lost:
    
        if (r2.invoke(r1, r4, r19) == r0) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x05ce, code lost:
    
        if (r1 == r0) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x07fc, code lost:
    
        if (r0 == r8) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x09d6, code lost:
    
        if (defpackage.n4o.y(1000, r19) == r8) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x09c2, code lost:
    
        if (defpackage.n4o.y(1000, r19) == r8) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x09e5, code lost:
    
        if (defpackage.n4o.y(1000, r19) == r8) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0aee, code lost:
    
        if (defpackage.zu3.z.hasMcc(java.lang.Integer.valueOf(r1)) == false) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019d, code lost:
    
        if (defpackage.fcp.g0(r9, r0, r19) != r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013d, code lost:
    
        if (r9 == r8) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0aff  */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [km5] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList a;
        Object u;
        int i;
        ArrayList arrayList;
        FeaturedOddsWithProvider featuredOddsWithProvider;
        Map<String, ProviderOdds> featured;
        ProviderOdds providerOdds;
        Object c;
        yj0 yj0Var;
        Object a2;
        rj0 rj0Var;
        wt9 wt9Var;
        rj0 lj0Var;
        Object P;
        Object intent;
        Bitmap createBitmap;
        Object i2;
        Object obj2;
        b98 b98Var;
        Object o;
        Iterator it;
        Object u2gVar;
        Object n;
        yzc yzcVar;
        b98 b98Var2;
        Object R;
        b98 b98Var3;
        adi adiVar;
        Object P2;
        List<CategoryWrapper> categories;
        int i3 = 0;
        int i4 = 2;
        int i5 = 1;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    wzc wzcVar = (wzc) this.t;
                    k6f k6fVar = (k6f) this.u;
                    this.s = 1;
                    if (wzcVar.a(k6fVar, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                q55 q55Var = (q55) this.v;
                if (q55Var != null) {
                    q55Var.d();
                }
                return Unit.a;
            case 1:
                kk kkVar = (kk) this.v;
                ku3 ku3Var = (ku3) this.u;
                lu3 lu3Var2 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    if (kkVar.p != null) {
                        return Unit.a;
                    }
                    a = kkVar.n.a(ok3.v(kkVar.t()));
                    bga bgaVar = xld.a;
                    Application application = kkVar.b;
                    application.getClass();
                    if (!xld.g(application)) {
                        r7 = km5.a;
                        i = ke0.c;
                        if (!zu3.V.hasMcc(Integer.valueOf(i)) && !zu3.d0.hasMcc(Integer.valueOf(i))) {
                            arrayList = r7;
                            break;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : r7) {
                            if (!((FeaturedOddsWithProvider) obj3).getFeaturedOdds().isLive()) {
                                arrayList2.add(obj3);
                            }
                        }
                        arrayList = arrayList2;
                        featuredOddsWithProvider = (FeaturedOddsWithProvider) CollectionsKt.firstOrNull(arrayList);
                        if (featuredOddsWithProvider != null) {
                            kkVar.p = featuredOddsWithProvider.getCountryProvider();
                        }
                        return Unit.a;
                    }
                    if (a == null) {
                        amd amdVar = kkVar.n;
                        ?? r8 = amdVar.g;
                        ArrayList arrayList3 = r8;
                        if (r8 == 0) {
                            arrayList3 = amdVar.e;
                        }
                        a = arrayList3;
                    }
                    ArrayList arrayList4 = new ArrayList(k13.r(a, 10));
                    Iterator it2 = a.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(xw3.t(ku3Var, null, new ik(kkVar, (OddsCountryProvider) it2.next(), r7, i5), 3));
                    }
                    this.u = null;
                    this.t = a;
                    this.s = 1;
                    u = m6k.u(arrayList4, this);
                    if (u == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r1 = (List) this.t;
                    y6a.M(obj);
                    a = r1;
                    u = obj;
                }
                ArrayList arrayList5 = new ArrayList();
                for (Pair pair : (Iterable) u) {
                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) pair.a;
                    FeaturedOddsResponse featuredOddsResponse = (FeaturedOddsResponse) pair.b;
                    FeaturedOddsWithProvider featuredOddsWithProvider2 = (featuredOddsResponse == null || (featured = featuredOddsResponse.getFeatured()) == null || (providerOdds = featured.get(oddsCountryProvider.getFeaturedOddsType())) == null) ? null : new FeaturedOddsWithProvider(oddsCountryProvider, providerOdds);
                    if (featuredOddsWithProvider2 != null) {
                        arrayList5.add(featuredOddsWithProvider2);
                    }
                }
                r7 = arrayList5.size() == a.size() ? arrayList5 : 0;
                if (r7 == 0) {
                    r7 = km5.a;
                }
                i = ke0.c;
                if (!zu3.V.hasMcc(Integer.valueOf(i))) {
                    arrayList = r7;
                }
                ArrayList arrayList22 = new ArrayList();
                while (r2.hasNext()) {
                }
                arrayList = arrayList22;
                featuredOddsWithProvider = (FeaturedOddsWithProvider) CollectionsKt.firstOrNull(arrayList);
                if (featuredOddsWithProvider != null) {
                }
                return Unit.a;
            case 2:
                AlertDialog alertDialog = (AlertDialog) this.v;
                String str = (String) this.t;
                lu3 lu3Var3 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    if (str != null && str.length() != 0) {
                        this.t = str;
                        this.s = 1;
                        break;
                    } else {
                        this.t = null;
                        this.s = 3;
                        break;
                    }
                    return lu3Var3;
                }
                if (i8 == 1) {
                    y6a.M(obj);
                    ((dk2) this.u).c.setText(str);
                    this.t = null;
                    this.s = 2;
                    break;
                } else if (i8 == 2) {
                    y6a.M(obj);
                    alertDialog.dismiss();
                } else {
                    if (i8 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    alertDialog.dismiss();
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    ptb ptbVar = (ptb) this.t;
                    ct8 ct8Var = (ct8) this.u;
                    zw zwVar = (zw) ((dx) this.v).o;
                    this.s = 1;
                    if (ct8Var.invoke(zwVar, ptbVar, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    lo4 lo4Var = (lo4) this.t;
                    ct8 ct8Var2 = (ct8) this.u;
                    ax axVar = (ax) ((dx) this.v).o;
                    this.s = 1;
                    if (ct8Var2.invoke(axVar, lo4Var, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    Pair pair2 = (Pair) this.t;
                    ptb ptbVar2 = (ptb) pair2.a;
                    Object obj4 = pair2.b;
                    et8 et8Var = (et8) this.u;
                    zw zwVar2 = (zw) ((dx) this.v).o;
                    this.s = 1;
                    if (et8Var.invoke(zwVar2, ptbVar2, obj4, this) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    Pair pair3 = (Pair) this.t;
                    lo4 lo4Var2 = (lo4) pair3.a;
                    Object obj5 = pair3.b;
                    et8 et8Var2 = (et8) this.u;
                    ax axVar2 = (ax) ((dx) this.v).o;
                    this.s = 1;
                    if (et8Var2.invoke(axVar2, lo4Var2, obj5, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 7:
                axj axjVar = (axj) this.u;
                lu3 lu3Var8 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    i8f i8fVar = (i8f) this.t;
                    pog y = sea.y(new w1(axjVar, 5));
                    m70 m70Var = new m70(i3, i8fVar, axjVar, (e1d) this.v);
                    this.s = 1;
                    if (y.collect(m70Var, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                t01 t01Var = (t01) this.t;
                Context context = (Context) this.u;
                re0 re0Var = (re0) this.v;
                this.s = 1;
                t01Var.F(context, re0Var, this);
                return lu3Var9;
            case 9:
                ij0 ij0Var = (ij0) this.v;
                yj0 yj0Var2 = (yj0) this.u;
                lu3 lu3Var10 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    dk0 dk0Var = yj0Var2.q;
                    if (dk0Var != null) {
                        nt9 n2 = yj0Var2.n(ij0Var.b, true);
                        apf apfVar = ij0Var.a;
                        this.s = 1;
                        a2 = dk0Var.a(apfVar, n2, this);
                        break;
                    } else {
                        nt9 n3 = yj0Var2.n(ij0Var.b, false);
                        apf apfVar2 = ij0Var.a;
                        this.t = yj0Var2;
                        this.s = 2;
                        c = apfVar2.c(n3, this);
                        if (c != lu3Var10) {
                            yj0Var = yj0Var2;
                            wt9Var = (wt9) c;
                            yj0Var.getClass();
                            if (!(wt9Var instanceof emi)) {
                            }
                            rj0Var = lj0Var;
                        }
                    }
                    return lu3Var10;
                }
                if (i15 == 1) {
                    y6a.M(obj);
                    a2 = obj;
                    rj0Var = (rj0) a2;
                } else {
                    if (i15 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yj0 yj0Var3 = (yj0) this.t;
                    y6a.M(obj);
                    yj0Var = yj0Var3;
                    c = obj;
                    wt9Var = (wt9) c;
                    yj0Var.getClass();
                    if (!(wt9Var instanceof emi)) {
                        emi emiVar = (emi) wt9Var;
                        lj0Var = new pj0(wnn.w(emiVar.a, emiVar.b.a, yj0Var.p), emiVar);
                    } else {
                        if (!(wt9Var instanceof fq5)) {
                            zzl.b();
                            return null;
                        }
                        fq5 fq5Var = (fq5) wt9Var;
                        nr9 nr9Var = fq5Var.a;
                        lj0Var = new lj0(nr9Var != null ? wnn.w(nr9Var, fq5Var.b.a, yj0Var.p) : null, fq5Var);
                    }
                    rj0Var = lj0Var;
                }
                yj0Var2.o(rj0Var);
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    b98 b98Var4 = (b98) this.t;
                    z88 z88Var = (z88) this.u;
                    nk0 nk0Var = new nk0(i3, b98Var4, (pk0) this.v);
                    this.s = 1;
                    if (z88Var.collect(nk0Var, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    b1d b1dVar = (b1d) this.t;
                    nk0 nk0Var2 = new nk0(i4, (Fragment) this.u, (u11) this.v);
                    this.s = 1;
                    if (b1dVar.collect(nk0Var2, this) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 12:
                us2 us2Var = (us2) this.t;
                lu3 lu3Var13 = lu3.a;
                int i18 = this.s;
                boolean z = false;
                if (i18 == 0) {
                    y6a.M(obj);
                    cs2 cs2Var = us2Var.e;
                    String str2 = (String) this.u;
                    PostChatMessage postChatMessage = (PostChatMessage) this.v;
                    this.s = 1;
                    cs2Var.getClass();
                    P = yaa.P(new yw(cs2Var, str2, postChatMessage, z ? 1 : 0, 3), this);
                    if (P == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                x2g x2gVar = (x2g) P;
                if (x2gVar instanceof t2g) {
                    Throwable th = ((t2g) x2gVar).a;
                    if (th instanceof wi9) {
                        i2g i2gVar = ((wi9) th).c.c;
                        String string = i2gVar != null ? i2gVar.string() : null;
                        if (string != null) {
                            try {
                                bga bgaVar2 = vga.a;
                                bgaVar2.getClass();
                                NetworkResponse networkResponse = (NetworkResponse) bgaVar2.b(NetworkResponse.INSTANCE.serializer(), string);
                                if (networkResponse != null) {
                                    us2Var.p = true;
                                    us2Var.n.j(networkResponse.getError());
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        return Unit.a;
                    }
                }
                return Unit.a;
            case 13:
                BaseCupTreeFragment baseCupTreeFragment = (BaseCupTreeFragment) this.v;
                Application application2 = (Application) this.t;
                lu3 lu3Var14 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    UniqueTournament uniqueTournament = (UniqueTournament) this.u;
                    krk krkVar = baseCupTreeFragment.l;
                    krkVar.getClass();
                    LinearLayout cupTreeContainerView = ((co8) krkVar).d.getCupTreeContainerView();
                    Integer num = new Integer(baseCupTreeFragment.requireContext().getColor(R.color.surface_1));
                    this.t = application2;
                    this.s = 1;
                    String string2 = application2.getString(R.string.share_screen_preview_text, tba.x(uniqueTournament), application2.getString(R.string.share_link));
                    string2.getClass();
                    if (cupTreeContainerView.getWidth() > 0 && cupTreeContainerView.getHeight() > 0) {
                        createBitmap = Bitmap.createBitmap(cupTreeContainerView.getWidth(), cupTreeContainerView.getHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                    } else if (cupTreeContainerView.getMeasuredWidth() <= 0 || cupTreeContainerView.getMeasuredHeight() <= 0) {
                        intent = new Intent("android.intent.action.SEND");
                        if (intent == lu3Var14) {
                            return lu3Var14;
                        }
                    } else {
                        createBitmap = Bitmap.createBitmap(cupTreeContainerView.getMeasuredWidth(), cupTreeContainerView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                    }
                    Bitmap bitmap = createBitmap;
                    Canvas canvas = new Canvas(bitmap);
                    Paint paint = new Paint();
                    paint.setColor(num.intValue());
                    canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cupTreeContainerView.getMeasuredWidth(), cupTreeContainerView.getHeight(), paint);
                    cupTreeContainerView.draw(canvas);
                    hs4 hs4Var = z45.a;
                    intent = xw3.R(hq4.c, new v1f(application2, bitmap, string2, (rq3) null, 19), this);
                    if (intent == lu3Var14) {
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    intent = obj;
                }
                baseCupTreeFragment.startActivity(Intent.createChooser((Intent) intent, application2.getString(R.string.share_string)));
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    n29 n29Var = (n29) this.t;
                    this.s = 1;
                    i2 = n29Var.i(this);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    i2 = obj;
                }
                Bitmap z2 = c6o.z((a10) i2);
                ct8 ct8Var3 = (ct8) this.u;
                Object obj6 = this.v;
                this.s = 2;
                break;
            case 15:
                f1d f1dVar = (f1d) this.u;
                ykj ykjVar = (ykj) this.v;
                lu3 lu3Var16 = lu3.a;
                int i21 = this.s;
                try {
                    if (i21 == 0) {
                        y6a.M(obj);
                        Boolean bool = Boolean.TRUE;
                        fdi fdiVar = (fdi) f1dVar;
                        fdiVar.getClass();
                        fdiVar.m(null, bool);
                        m1d m1dVar = m1d.c;
                        this.s = 1;
                        break;
                    } else {
                        if (i21 != 1) {
                            if (i21 == 2) {
                                y6a.M(obj);
                                return Unit.a;
                            }
                            if (i21 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th2 = (Throwable) this.t;
                            y6a.M(obj);
                            throw th2;
                        }
                        y6a.M(obj);
                    }
                    if (ykjVar.b()) {
                        mp1 mp1Var = new mp1(ykjVar, (rq3) r7, i3);
                        this.s = 2;
                        break;
                    }
                    return Unit.a;
                } catch (Throwable th3) {
                    if (!ykjVar.b()) {
                        throw th3;
                    }
                    mp1 mp1Var2 = new mp1(ykjVar, (rq3) r7, i3);
                    this.t = th3;
                    this.s = 3;
                    if (fcp.c0(f1dVar, mp1Var2, this) != lu3Var16) {
                        throw th3;
                    }
                }
                break;
            case 16:
                x32 x32Var = (x32) this.t;
                lu3 lu3Var17 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    wo3 wo3Var = x32Var.o;
                    v32 v32Var = new v32(x32Var, (wdd) this.u, (y1) this.v);
                    this.s = 1;
                    wo3Var.getClass();
                    oqf oqfVar = (oqf) v32Var.invoke();
                    if (oqfVar == null || wo3.m1(wo3Var, oqfVar, 0L, 0L, 3)) {
                        obj2 = Unit.a;
                    } else {
                        lj2 lj2Var = new lj2(1, z9a.b(this));
                        lj2Var.t();
                        to3 to3Var = new to3(v32Var, lj2Var);
                        j0l j0lVar = wo3Var.t;
                        i1d i1dVar = (i1d) j0lVar.b;
                        oqf oqfVar2 = (oqf) v32Var.invoke();
                        if (oqfVar2 == null) {
                            p2g p2gVar = w2g.b;
                            lj2Var.resumeWith(Unit.a);
                        } else {
                            lj2Var.v(new s1(29, j0lVar, to3Var));
                            IntRange j = llf.j(0, i1dVar.c);
                            int i23 = j.a;
                            int i24 = j.b;
                            if (i23 <= i24) {
                                while (true) {
                                    oqf oqfVar3 = (oqf) ((to3) i1dVar.a[i24]).a.invoke();
                                    if (oqfVar3 != null) {
                                        oqf g = oqfVar2.g(oqfVar3);
                                        if (g.equals(oqfVar2)) {
                                            i1dVar.a(i24 + 1, to3Var);
                                        } else if (!g.equals(oqfVar3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i25 = i1dVar.c - 1;
                                            if (i25 <= i24) {
                                                while (true) {
                                                    ((to3) i1dVar.a[i24]).b.a(cancellationException);
                                                    if (i25 != i24) {
                                                        i25++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i24 != i23) {
                                        i24--;
                                    }
                                }
                            }
                            i1dVar.a(0, to3Var);
                            if (!wo3Var.w) {
                                wo3Var.n1(0L);
                            }
                        }
                        obj2 = lj2Var.q();
                        if (obj2 != lu3.a) {
                            obj2 = Unit.a;
                        }
                    }
                    if (obj2 == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 17:
                p03 p03Var = (p03) this.v;
                lu3 lu3Var18 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    b98Var = (b98) this.u;
                    b10 b10Var = (b10) p03Var.b;
                    this.u = b98Var;
                    this.s = 1;
                    o = b10Var.o(this);
                    break;
                } else {
                    if (i26 != 1) {
                        if (i26 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (Iterator) this.t;
                        b98Var = (b98) this.u;
                        y6a.M(obj);
                        while (it.hasNext()) {
                            IndexedValue indexedValue = (IndexedValue) it.next();
                            this.u = b98Var;
                            this.t = it;
                            this.s = 2;
                            if (b98Var.emit(indexedValue, this) == lu3Var18) {
                                return lu3Var18;
                            }
                        }
                        return Unit.a;
                    }
                    b98Var = (b98) this.u;
                    y6a.M(obj);
                    o = obj;
                }
                ((g9i) p03Var.e).start();
                it = ((List) o).iterator();
                while (it.hasNext()) {
                }
                return Unit.a;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    nhh nhhVar = (nhh) this.t;
                    ((aea) this.u).n(new ox1(nhhVar, 15));
                    va8 va8Var = (va8) this.v;
                    this.s = 1;
                    if (va8Var.invoke(nhhVar, this) == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 19:
                ku3 ku3Var2 = (ku3) this.t;
                Object obj7 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    b98 b98Var5 = (b98) this.u;
                    ln2 j2 = ((rn2) this.v).j(ku3Var2);
                    this.t = null;
                    this.s = 1;
                    Object y2 = f5p.y(b98Var5, j2, true, this);
                    Object obj8 = y2;
                    if (y2 != obj7) {
                        obj8 = Unit.a;
                    }
                    if (obj8 == obj7) {
                        return obj7;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 20:
                lu3 lu3Var20 = lu3.a;
                int i29 = this.s;
                try {
                    if (i29 == 0) {
                        y6a.M(obj);
                        l4h l4hVar = (l4h) this.u;
                        Object obj9 = this.v;
                        p2g p2gVar2 = w2g.b;
                        this.t = null;
                        this.s = 1;
                        if (l4hVar.q(this, obj9) == lu3Var20) {
                            return lu3Var20;
                        }
                    } else {
                        if (i29 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    u2gVar = Unit.a;
                    p2g p2gVar3 = w2g.b;
                } catch (Throwable th4) {
                    p2g p2gVar4 = w2g.b;
                    u2gVar = new u2g(th4);
                }
                return new go2(!(u2gVar instanceof u2g) ? Unit.a : new eo2(w2g.a(u2gVar)));
            case 21:
                lu3 lu3Var21 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    us2 us2Var2 = (us2) this.u;
                    yzc yzcVar2 = us2Var2.C;
                    s96 s96Var = us2Var2.r;
                    Event event = (Event) this.v;
                    this.t = yzcVar2;
                    this.s = 1;
                    n = s96Var.n(event, this);
                    if (n == lu3Var21) {
                        return lu3Var21;
                    }
                    yzcVar = yzcVar2;
                } else {
                    if (i30 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzcVar = (yzc) this.t;
                    y6a.M(obj);
                    n = obj;
                }
                EventIncidentsResponse eventIncidentsResponse = (EventIncidentsResponse) n;
                List<Incident> incidents = eventIncidentsResponse != null ? eventIncidentsResponse.getIncidents() : null;
                if (incidents == null) {
                    incidents = km5.a;
                }
                yzcVar.j(incidents);
                return Unit.a;
            case 22:
                lu3 lu3Var22 = lu3.a;
                int i31 = this.s;
                if (i31 != 0) {
                    if (i31 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                inb inbVar = inb.g;
                Context context2 = (Context) this.t;
                String str3 = (String) this.u;
                Bitmap.Config config = (Bitmap.Config) this.v;
                this.s = 1;
                Object u2 = inbVar.u(context2, str3, null, config, this);
                return u2 == lu3Var22 ? lu3Var22 : u2;
            case 23:
                lu3 lu3Var23 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    b1d b1dVar2 = (b1d) this.t;
                    nk0 nk0Var3 = new nk0(4, (CompetitionsFragment) this.u, (CompetitionsFragment) this.v);
                    this.s = 1;
                    if (b1dVar2.collect(nk0Var3, this) == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 24:
                lu3 lu3Var24 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    z88 H = hkg.H(sea.y(new ix1(23, (Function1) this.t, (qug) this.u)));
                    je3 je3Var = new je3(0, (Function1) this.v);
                    this.s = 1;
                    if (H.collect(je3Var, this) == lu3Var24) {
                        return lu3Var24;
                    }
                } else {
                    if (i33 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 25:
                lu3 lu3Var25 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    z88 H2 = hkg.H(sea.y(new ix1(24, (Function1) this.t, (ksa) this.u)));
                    je3 je3Var2 = new je3(1, (Function1) this.v);
                    this.s = 1;
                    if (H2.collect(je3Var2, this) == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i34 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 26:
                lu3 lu3Var26 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    aeh aehVar = ((ov3) this.t).f;
                    bv3 bv3Var = new bv3((String) this.u, (String) this.v);
                    this.s = 1;
                    if (aehVar.emit(bv3Var, this) == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 27:
                qf4 qf4Var = (qf4) this.v;
                lu3 lu3Var27 = lu3.a;
                int i36 = this.s;
                if (i36 == 0) {
                    y6a.M(obj);
                    b98Var2 = (b98) this.u;
                    this.u = b98Var2;
                    this.s = 1;
                    R = xw3.R(qf4Var.c.getCoroutineContext(), new ef4(qf4Var, r7, i4), this);
                    break;
                } else if (i36 == 1) {
                    b98Var2 = (b98) this.u;
                    y6a.M(obj);
                    R = obj;
                } else {
                    if (i36 != 2) {
                        if (i36 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    adiVar = (od4) this.t;
                    b98Var3 = (b98) this.u;
                    y6a.M(obj);
                    t98 t98Var = new t98(new wf2(new v98(new v98(new v98(new ef4(qf4Var, r7, i3), (fdi) qf4Var.h.b), new d11(i4, r7, 7), 2), new r1(adiVar, r7, 14), 1), 2), new ff4(qf4Var, (rq3) null), 0);
                    this.u = null;
                    this.t = null;
                    this.s = 3;
                    break;
                }
                adi adiVar2 = (adi) R;
                if (!(adiVar2 instanceof od4)) {
                    if (adiVar2 instanceof t9k) {
                        a70.r("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    if (adiVar2 instanceof wnf) {
                        throw ((wnf) adiVar2).b;
                    }
                    if (adiVar2 instanceof e38) {
                        return Unit.a;
                    }
                    if (adiVar2 instanceof mdd) {
                        a70.r("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    zzl.b();
                    return null;
                }
                od4 od4Var = (od4) adiVar2;
                Object obj10 = od4Var.b;
                this.u = b98Var2;
                this.t = od4Var;
                this.s = 2;
                if (b98Var2.emit(obj10, this) != lu3Var27) {
                    b98Var3 = b98Var2;
                    adiVar = adiVar2;
                    t98 t98Var2 = new t98(new wf2(new v98(new v98(new v98(new ef4(qf4Var, r7, i3), (fdi) qf4Var.h.b), new d11(i4, r7, 7), 2), new r1(adiVar, r7, 14), 1), 2), new ff4(qf4Var, (rq3) null), 0);
                    this.u = null;
                    this.t = null;
                    this.s = 3;
                }
                return lu3Var27;
            case 28:
                qf4 qf4Var2 = (qf4) this.u;
                lu3 lu3Var28 = lu3.a;
                int i37 = this.s;
                if (i37 != 0) {
                    if (i37 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ku3 ku3Var3 = (ku3) this.t;
                qa3 c2 = qx9.c();
                adi t = qf4Var2.h.t();
                if (t instanceof od4) {
                    t = new mdd(((od4) t).a);
                }
                rgc rgcVar = new rgc((Function2) this.v, c2, t, ku3Var3.getCoroutineContext());
                g7h g7hVar = qf4Var2.l;
                Object d = ((g62) g7hVar.d).d(rgcVar);
                if (d instanceof eo2) {
                    Throwable th5 = ((eo2) d).a;
                    if (th5 == null) {
                        throw new pz2("Channel was closed normally");
                    }
                    throw th5;
                }
                if (d instanceof fo2) {
                    a70.r("Check failed.");
                    return null;
                }
                if (((AtomicInteger) ((de0) g7hVar.e).b).getAndIncrement() == 0) {
                    xw3.L((ku3) g7hVar.b, null, null, new big(g7hVar, r7, 11), 3);
                }
                this.s = 1;
                Object w = c2.w(this);
                return w == lu3Var28 ? lu3Var28 : w;
            default:
                lu3 lu3Var29 = lu3.a;
                int i38 = this.s;
                if (i38 == 0) {
                    y6a.M(obj);
                    vyh vyhVar = ((ai4) this.t).e;
                    String str4 = (String) this.u;
                    String str5 = (String) this.v;
                    Calendar calendar = ke0.a;
                    int c3 = ke0.c();
                    this.s = 1;
                    vyhVar.getClass();
                    P2 = yaa.P(new syh(vyhVar, str4, str5, c3, null, 0), this);
                    if (P2 == lu3Var29) {
                        return lu3Var29;
                    }
                } else {
                    if (i38 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                CategoriesForDateResponse categoriesForDateResponse = (CategoriesForDateResponse) yaa.x((x2g) P2);
                return (categoriesForDateResponse == null || (categories = categoriesForDateResponse.getCategories()) == null) ? km5.a : categories;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(b1d b1dVar, Fragment fragment, rq3 rq3Var, Object obj, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = b1dVar;
        this.u = fragment;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
    }
}
