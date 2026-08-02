package defpackage;

import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.cuptree.CupTreesResponse;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.ShotMapPoint;
import com.sofascore.model.network.response.MediaHighlightedItem;
import com.sofascore.model.newNetwork.EventMediaNews;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.HistoricalSeasonComparisonResponse;
import com.sofascore.model.newNetwork.MediaVideoResponse;
import com.sofascore.model.newNetwork.PlayerShotmapResponse;
import com.sofascore.model.newNetwork.SeasonHighlightedComparison;
import com.sofascore.results.team.TeamWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class du1 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public int t;
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du1(Object obj, int i, int i2, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.v = obj;
        this.t = i;
        this.u = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new du1((eu1) this.v, this.t, this.u, rq3Var, 0);
            case 1:
                return new du1((n84) this.v, this.t, this.u, rq3Var, 1);
            case 2:
                return new du1((tj7) this.v, this.t, this.u, rq3Var, 2);
            case 3:
                return new du1((my7) this.v, this.t, this.u, rq3Var, 3);
            case 4:
                return new du1((gya) this.v, this.t, this.u, rq3Var, 4);
            case 5:
                return new du1((e5c) this.v, this.t, this.u, rq3Var, 5);
            case 6:
                return new du1((cnc) this.v, this.t, this.u, rq3Var, 6);
            case 7:
                return new du1((j0j) this.v, this.t, this.u, rq3Var, 7);
            case 8:
                return new du1((y0j) this.v, this.t, this.u, rq3Var, 8);
            case 9:
                return new du1((TeamWorker) this.v, this.t, this.u, rq3Var, 9);
            case 10:
                return new du1((qlj) this.v, this.t, this.u, rq3Var, 10);
            default:
                du1 du1Var = new du1(this.u, rq3Var);
                du1Var.v = obj;
                return du1Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((du1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((du1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((du1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((du1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((du1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((du1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((du1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((du1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((du1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((du1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((du1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((du1) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        if (r5.emit(r6, r25) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x028c, code lost:
    
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (defpackage.n4o.y(1000, r25) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r5.emit(r7, r25) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r10 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        if (r11 == (-1)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [rlh] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0074 -> B:14:0x004f). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object P;
        List<ShotMapPoint> list;
        Object p0;
        Object e;
        List<SeasonHighlightedComparison> comparisons;
        Object M0;
        Object obj2;
        r5c r5cVar;
        Object k;
        ?? r5;
        Object value;
        plj pljVar;
        gv9 W;
        Integer valueOf;
        b98 b98Var;
        int i = this.r;
        int i2 = this.u;
        SeasonHighlightedComparison seasonHighlightedComparison = null;
        switch (i) {
            case 0:
                eu1 eu1Var = (eu1) this.v;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    g39 g39Var = eu1Var.e;
                    int i4 = this.t;
                    this.s = 1;
                    g39Var.getClass();
                    P = yaa.P(new w29(g39Var, i4, this.u, null, 7), this);
                    if (P == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                yzc yzcVar = eu1Var.f;
                PlayerShotmapResponse playerShotmapResponse = (PlayerShotmapResponse) yaa.x((x2g) P);
                if (playerShotmapResponse == null || (list = playerShotmapResponse.getShotmap()) == null) {
                    list = km5.a;
                }
                yzcVar.j(list);
                return Unit.a;
            case 1:
                n84 n84Var = (n84) this.v;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = n84Var.e;
                    int i6 = this.t;
                    this.s = 1;
                    p0 = w3bVar.p0(i6, i2, this);
                    if (p0 == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    p0 = obj;
                }
                CupTreesResponse cupTreesResponse = (CupTreesResponse) p0;
                if (cupTreesResponse != null) {
                    n84Var.f.j(cupTreesResponse);
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var = ((tj7) this.v).b;
                int i8 = this.t;
                this.s = 1;
                Object y = wi7Var.y(i8, i2, this);
                return y == lu3Var3 ? lu3Var3 : y;
            case 3:
                int i9 = this.t;
                my7 my7Var = (my7) this.v;
                lu3 lu3Var4 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    m7c m7cVar = my7Var.b;
                    this.s = 1;
                    if (m7cVar.a(i9, i2, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                int i11 = i2 + 1;
                koh kohVar = my7Var.k;
                Integer num = new Integer(i9);
                x43 x43Var = (x43) my7Var.k.get(new Integer(i9));
                kohVar.put(num, x43Var != null ? x43.a(x43Var, null, 0, i11, null, 27) : new x43((MediaReactionType) null, 0, i11, (Boolean) null, 27));
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    w3b w3bVar2 = ((gya) this.v).e;
                    int i13 = this.t;
                    this.s = 1;
                    e = w3bVar2.e(i13, this);
                    if (e == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e = obj;
                }
                HistoricalSeasonComparisonResponse historicalSeasonComparisonResponse = (HistoricalSeasonComparisonResponse) e;
                if (historicalSeasonComparisonResponse == null || (comparisons = historicalSeasonComparisonResponse.getComparisons()) == null) {
                    return null;
                }
                Iterator it = comparisons.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ?? next = it.next();
                        if (((SeasonHighlightedComparison) next).getSeason().getId() == i2) {
                            seasonHighlightedComparison = next;
                        }
                    }
                }
                return seasonHighlightedComparison;
            case 5:
                e5c e5cVar = (e5c) this.v;
                lu3 lu3Var6 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    w3b w3bVar3 = e5cVar.c;
                    int i15 = this.t;
                    this.s = 1;
                    M0 = w3bVar3.M0(i15, this);
                    if (M0 == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    M0 = obj;
                }
                MediaVideoResponse mediaVideoResponse = (MediaVideoResponse) M0;
                List<MediaHighlightedItem<?>> videos = mediaVideoResponse != null ? mediaVideoResponse.getVideos() : null;
                if (videos != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = videos.iterator();
                    while (it2.hasNext()) {
                        MediaHighlightedItem mediaHighlightedItem = (MediaHighlightedItem) it2.next();
                        Integer mo689getId = mediaHighlightedItem.getItem().mo689getId();
                        if (mo689getId != null) {
                            int intValue = mo689getId.intValue();
                            String title = mediaHighlightedItem.getItem().getTitle();
                            if (title == null) {
                                title = "";
                            }
                            String subtitle = mediaHighlightedItem.getItem().getSubtitle();
                            if (subtitle == null) {
                                subtitle = "";
                            }
                            String videoUrl = mediaHighlightedItem.getItem().getVideoUrl();
                            Highlight highlight = new Highlight(intValue, title, subtitle, mediaHighlightedItem.getItem().getThumbnailUrl(), videoUrl == null ? "" : videoUrl, 6, false, null, 0L, "", Boolean.FALSE, null, a.o, null);
                            Integer mo689getId2 = mediaHighlightedItem.getItem().mo689getId();
                            r5cVar = new r5c(highlight, false, mo689getId2 != null && mo689getId2.intValue() == i2, 0, (Integer) null, 58);
                        } else {
                            r5cVar = null;
                        }
                        if (r5cVar != null) {
                            arrayList.add(r5cVar);
                        }
                    }
                    obj2 = CollectionsKt.H0(arrayList, new d5c(i2, 0));
                    break;
                }
                obj2 = km5.a;
                e5cVar.d.j(obj2);
                return Unit.a;
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
                wqc wqcVar = ((cnc) this.v).f;
                int i17 = this.t;
                this.s = 1;
                Object e2 = wqcVar.e(i17, i2, this, Season.YEAR_ALL_TIME);
                return e2 == lu3Var7 ? lu3Var7 : e2;
            case 7:
                lu3 lu3Var8 = lu3.a;
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
                j0j j0jVar = (j0j) this.v;
                int i19 = this.t;
                this.s = 1;
                Object p = j0jVar.p(i19, i2, this);
                return p == lu3Var8 ? lu3Var8 : p;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i20 = this.s;
                if (i20 != 0) {
                    if (i20 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar4 = ((y0j) this.v).f;
                int i21 = this.t;
                this.s = 1;
                Object o0 = w3bVar4.o0(i21, i2, this);
                return o0 == lu3Var9 ? lu3Var9 : o0;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    TeamWorker teamWorker = (TeamWorker) this.v;
                    int i23 = this.t;
                    this.s = 1;
                    if (teamWorker.e(i23, i2, this) == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 10:
                qlj qljVar = (qlj) this.v;
                lu3 lu3Var11 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    t9c t9cVar = qljVar.f;
                    int i25 = this.t;
                    this.s = 1;
                    k = t9cVar.k(i25, this);
                    if (k == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    k = obj;
                }
                List list2 = (List) k;
                if (list2 != null) {
                    int i26 = ecd.h;
                    r5 = new ArrayList(k13.r(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        r5.add(wca.v((EventMediaNews) it3.next()));
                    }
                } else {
                    r5 = rlh.b;
                }
                Iterable iterable = r5;
                fdi fdiVar = qljVar.j;
                do {
                    value = fdiVar.getValue();
                    pljVar = (plj) value;
                    W = l6g.W(iterable);
                    Iterator it4 = iterable.iterator();
                    int i27 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i27 = -1;
                            break;
                        } else {
                            Object next2 = it4.next();
                            if (i27 < 0) {
                                b.q();
                                throw null;
                            }
                            if (((ecd) next2).a == i2) {
                                break;
                            } else {
                                i27++;
                            }
                        }
                    }
                } while (!fdiVar.k(value, plj.a(pljVar, W, yid.m(valueOf), 8)));
                return Unit.a;
            default:
                lu3 lu3Var12 = lu3.a;
                int i28 = this.t;
                if (i28 == 0) {
                    y6a.M(obj);
                    b98Var = (b98) this.v;
                    y7k y7kVar = new y7k(i2);
                    this.v = b98Var;
                    this.s = i2;
                    this.t = 1;
                    break;
                } else {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            i2 = this.s;
                            b98Var = (b98) this.v;
                            y6a.M(obj);
                            i2--;
                            y7k y7kVar2 = new y7k(i2);
                            this.v = b98Var;
                            this.s = i2;
                            this.t = 3;
                            break;
                        } else if (i28 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    i2 = this.s;
                    b98Var = (b98) this.v;
                    y6a.M(obj);
                }
                if (Integer.compareUnsigned(i2, 0) <= 0) {
                    return Unit.a;
                }
                this.v = b98Var;
                this.s = i2;
                this.t = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du1(int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 11;
        this.u = i;
    }
}
