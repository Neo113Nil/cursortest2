package defpackage;

import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nvi extends hoi implements Function2 {
    public int A;
    public int B;
    public int C;
    public final /* synthetic */ pvi D;
    public final /* synthetic */ int E;
    public Event r;
    public pvi s;
    public Collection t;
    public Iterator u;
    public OddsCountryProvider v;
    public String w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvi(pvi pviVar, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.D = pviVar;
        this.E = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new nvi(this.D, this.E, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nvi) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x010e, code lost:
    
        if (r5 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0110, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0052, code lost:
    
        if (r2 == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018e  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [xmd] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.sofascore.model.odds.OddsCountryProvider] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x010e -> B:6:0x0111). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Event event;
        Object d;
        Event event2;
        ?? r5;
        int i;
        pvi pviVar;
        Iterator it;
        int i2;
        int i3;
        Collection collection;
        int i4;
        Event event3;
        int i5;
        ?? r14;
        Object obj2;
        Map<String, ProviderOdds> featured;
        ProviderOdds providerOdds;
        lu3 lu3Var = lu3.a;
        int i6 = this.C;
        pvi pviVar2 = this.D;
        if (i6 == 0) {
            event = null;
            y6a.M(obj);
            s96 s96Var = pviVar2.e;
            this.C = 1;
            d = s96Var.d(this.E, this);
        } else if (i6 == 1) {
            event = null;
            y6a.M(obj);
            d = obj;
        } else {
            if (i6 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i5 = this.B;
            i2 = this.A;
            i = this.z;
            i4 = this.y;
            i3 = this.x;
            String featuredOddsType = this.w;
            OddsCountryProvider oddsCountryProvider = this.v;
            it = this.u;
            collection = this.t;
            pviVar = this.s;
            event = null;
            event3 = this.r;
            y6a.M(obj);
            Object b = obj;
            FeaturedOddsResponse featuredOddsResponse = (FeaturedOddsResponse) b;
            if (featuredOddsResponse == null || (featured = featuredOddsResponse.getFeatured()) == null || (providerOdds = featured.get(featuredOddsType)) == null || (i4 != 0 && providerOdds.getMarketId() != 1)) {
                obj2 = event;
                if (obj2 != null) {
                    collection.add(obj2);
                }
                if (!it.hasNext()) {
                    ?? r142 = (List) collection;
                    if (r142 != 0) {
                        int size = r142.size();
                        Event event4 = r142;
                        if (size < pviVar.h.i) {
                            event4 = event;
                        }
                        if (event4 != null) {
                            event2 = event3;
                            r14 = event4;
                            b7 Z = l6g.Z(r14);
                            event2.getClass();
                            OddsEventUIModel oddsEventUIModel = new OddsEventUIModel(event2.getId(), o3a.F(event2.getTournament()), event2.getStatusType(), ok3.s(event2), event2.shouldReverseTeams());
                            List list = pviVar.n;
                            r5 = new xmd((gv9) Z, (OddsCountryProvider) (list != null ? (OddsCountryProvider) CollectionsKt.firstOrNull(list) : event), oddsEventUIModel, (tld) null, 24);
                            pviVar2.j.j(event2 == null ? new bu7(event2, r5) : event);
                            return Unit.a;
                        }
                    }
                    event2 = event3;
                    r14 = km5.a;
                    b7 Z2 = l6g.Z(r14);
                    event2.getClass();
                    OddsEventUIModel oddsEventUIModel2 = new OddsEventUIModel(event2.getId(), o3a.F(event2.getTournament()), event2.getStatusType(), ok3.s(event2), event2.shouldReverseTeams());
                    List list2 = pviVar.n;
                    r5 = new xmd((gv9) Z2, (OddsCountryProvider) (list2 != null ? (OddsCountryProvider) CollectionsKt.firstOrNull(list2) : event), oddsEventUIModel2, (tld) null, 24);
                    pviVar2.j.j(event2 == null ? new bu7(event2, r5) : event);
                    return Unit.a;
                }
                oddsCountryProvider = (OddsCountryProvider) it.next();
                featuredOddsType = i4 != 0 ? "fullTime" : oddsCountryProvider.getFeaturedOddsType();
                umd umdVar = pviVar.g;
                this.r = event3;
                this.s = pviVar;
                this.t = collection;
                this.u = it;
                this.v = oddsCountryProvider;
                this.w = featuredOddsType;
                this.x = i3;
                this.y = i4;
                this.z = i;
                this.A = i2;
                this.B = i5;
                this.C = 2;
                b = umdVar.b(event3, oddsCountryProvider, this);
            }
            obj2 = sld.b(pviVar.i(), oddsCountryProvider, providerOdds, ok3.s(event3));
            if (obj2 != null) {
            }
            if (!it.hasNext()) {
            }
        }
        EventResponse eventResponse = (EventResponse) yaa.x((x2g) d);
        event2 = eventResponse != null ? eventResponse.getEvent() : event;
        if (event2 != null) {
            i = 0;
            if ((rld.s(pviVar2.i(), vmd.TEAM_DETAILS, event2, false) ? event2 : event) != null) {
                List list3 = pviVar2.n;
                amd amdVar = pviVar2.h;
                if (list3 == null) {
                    bga bgaVar = xld.a;
                    List b2 = xld.b(pviVar2.i());
                    BrandingTeam brandingTeam = pviVar2.i;
                    List e = rld.e(brandingTeam != null ? brandingTeam.getOddsProviderId() : event, b2);
                    if (e == null && (e = amdVar.a(o3a.F(event2.getTournament()))) == null) {
                        e = amdVar.c();
                    }
                    pviVar2.n = e;
                }
                int i7 = amdVar.c().size() > 1 ? 1 : 0;
                List list4 = pviVar2.n;
                if (list4 == null) {
                    pviVar = pviVar2;
                    r14 = km5.a;
                    b7 Z22 = l6g.Z(r14);
                    event2.getClass();
                    OddsEventUIModel oddsEventUIModel22 = new OddsEventUIModel(event2.getId(), o3a.F(event2.getTournament()), event2.getStatusType(), ok3.s(event2), event2.shouldReverseTeams());
                    List list22 = pviVar.n;
                    r5 = new xmd((gv9) Z22, (OddsCountryProvider) (list22 != null ? (OddsCountryProvider) CollectionsKt.firstOrNull(list22) : event), oddsEventUIModel22, (tld) null, 24);
                    pviVar2.j.j(event2 == null ? new bu7(event2, r5) : event);
                    return Unit.a;
                }
                ArrayList arrayList = new ArrayList();
                pviVar = pviVar2;
                it = list4.iterator();
                i2 = 0;
                i3 = 0;
                collection = arrayList;
                i4 = i7;
                event3 = event2;
                i5 = 0;
                if (!it.hasNext()) {
                }
            }
        }
        r5 = event;
        pviVar2.j.j(event2 == null ? new bu7(event2, r5) : event);
        return Unit.a;
    }
}
