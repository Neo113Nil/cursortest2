package defpackage;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.vungle.ads.internal.protos.Sdk;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj6i;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class j6i extends q8 {
    public final umd e;
    public final amd f;
    public Stage g;
    public List h;
    public ArrayList i;
    public g9i j;
    public final e1d k;
    public final yzc l;
    public final lec m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6i(Application application, umd umdVar, amd amdVar) {
        super(application);
        umdVar.getClass();
        amdVar.getClass();
        this.e = umdVar;
        this.f = amdVar;
        OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.Y(amdVar.c());
        oddsCountryProvider.getClass();
        OddsProvider provider = oddsCountryProvider.getProvider();
        provider.getClass();
        yld yldVar = new yld(provider.getId(), provider.getColors(), provider.getSlug());
        String defaultBetSlipLink = oddsCountryProvider.getDefaultBetSlipLink();
        old oldVar = new old(yldVar, defaultBetSlipLink == null ? oddsCountryProvider.getProvider().getDefaultBetSlipLink() : defaultBetSlipLink, oddsCountryProvider.getBranded(), oddsCountryProvider.getOddsOffset(), oddsCountryProvider.getOddsMayDiffer(), oddsCountryProvider.getType(), oddsCountryProvider.getSignupLink());
        bgf bgfVar = w5i.b;
        int i = ke0.c;
        bgfVar.getClass();
        this.k = e.f(new f6i(true, rlh.b, null, oldVar, null, bgf.a(i), vmd.RACE_ODDS_TAB, false));
        yzc yzcVar = new yzc();
        this.l = yzcVar;
        this.m = waa.w(yzcVar);
    }

    public final f6i k() {
        return (f6i) ((eoh) this.k).getValue();
    }

    public final void l(boolean z) {
        OddsCountryProvider oddsCountryProvider;
        Stage stage = this.g;
        if (stage == null || (oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(this.f.c())) == null) {
            return;
        }
        xw3.L(un0.z(this), null, null, new kv7(this, z, stage, oddsCountryProvider, (rq3) null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        if (r3 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0267, code lost:
    
        if (r1 != null) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078 A[LOOP:0: B:14:0x0072->B:16:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v32, types: [km5] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(c6i c6iVar, sq3 sq3Var) {
        h6i h6iVar;
        int i;
        e1d e1dVar;
        Stage stage;
        ArrayList arrayList;
        Iterator it;
        c6i c6iVar2;
        List list;
        Stage d;
        Object obj;
        Iterator it2;
        Stage stage2;
        c6i c6iVar3;
        Stage stage3;
        e1d e1dVar2;
        ?? c;
        ArrayList arrayList2;
        Iterator it3;
        List list2;
        Iterator it4;
        f6i f6iVar;
        int i2;
        ?? arrayList3;
        g6i g6iVar;
        Object obj2;
        g6i g6iVar2;
        e1d e1dVar3;
        Boolean bool;
        Object obj3;
        Stage stage4;
        Stage stage5;
        Stage stage6;
        Stage stage7;
        Object obj4;
        if (sq3Var instanceof h6i) {
            h6iVar = (h6i) sq3Var;
            int i3 = h6iVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h6iVar.t = i3 - Integer.MIN_VALUE;
                Object obj5 = h6iVar.r;
                lu3 lu3Var = lu3.a;
                i = h6iVar.t;
                e1dVar = this.k;
                if (i != 0) {
                    y6a.M(obj5);
                    ((eoh) e1dVar).setValue(f6i.a(k(), false, null, c6iVar, null, null, false, 251));
                    g9i g9iVar = this.j;
                    if (g9iVar != null) {
                        h6iVar.t = 1;
                        if (g9iVar.Z(h6iVar) == lu3Var) {
                            return lu3Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj5);
                }
                stage = this.g;
                arrayList = this.i;
                if (stage != null && arrayList != null) {
                    ArrayList arrayList4 = new ArrayList(k13.r(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        w1l.A(arrayList4, ((ProviderOdds) it.next()).getMarketId());
                    }
                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList4));
                    kp5 kp5Var = c6i.e;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj6 : kp5Var) {
                        List list3 = ((c6i) obj6).c;
                        if (list3 == null || !list3.isEmpty()) {
                            Iterator it5 = list3.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                if (S0.contains(new Integer(((Number) it5.next()).intValue()))) {
                                    arrayList5.add(obj6);
                                    break;
                                }
                            }
                        }
                    }
                    gv9 W = l6g.W(arrayList5);
                    c6iVar2 = k().c;
                    if (c6iVar2 != null) {
                        if (!W.contains(c6iVar2)) {
                            c6iVar2 = null;
                        }
                    }
                    joa joaVar = l5i.a;
                    list = this.h;
                    if (list == null) {
                        list = km5.a;
                    }
                    d = l5i.d(list);
                    if (d == null) {
                        Iterator it6 = W.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it6.next();
                            if (CollectionsKt.R(((c6i) obj).a.b, d.getType())) {
                                break;
                            }
                        }
                        c6iVar2 = (c6i) obj;
                    } else {
                        c6iVar2 = null;
                    }
                    if (c6iVar2 == null) {
                        c6iVar2 = (c6i) CollectionsKt.Y(W);
                    }
                    f6i k = k();
                    Context i4 = i();
                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.Y(this.f.c());
                    List list4 = this.h;
                    oddsCountryProvider.getClass();
                    c6iVar2.getClass();
                    List list5 = c6iVar2.c;
                    ArrayList arrayList6 = new ArrayList();
                    it2 = list5.iterator();
                    while (it2.hasNext()) {
                        int intValue = ((Number) it2.next()).intValue();
                        if (list4 != null) {
                            if (intValue == 105 || intValue == 113) {
                                stage2 = stage;
                                c6iVar3 = c6iVar2;
                                Iterator it7 = list4.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        obj3 = it7.next();
                                        if (((Stage) obj3).getType() == ServerType.QUALIFYING) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                stage4 = (Stage) obj3;
                            } else {
                                switch (intValue) {
                                    case TPAT_ERROR_VALUE:
                                    case INVALID_ADS_ENDPOINT_VALUE:
                                    case INVALID_RI_ENDPOINT_VALUE:
                                        stage2 = stage;
                                        c6iVar3 = c6iVar2;
                                        Iterator it8 = list4.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                stage6 = it8.next();
                                                Stage stage8 = (Stage) stage6;
                                                if (stage8.getType() == ServerType.PRACTICE) {
                                                    Integer sequence = stage8.getSequence();
                                                    int i5 = intValue - 120;
                                                    if (sequence != null && sequence.intValue() == i5) {
                                                    }
                                                }
                                            } else {
                                                stage6 = 0;
                                            }
                                        }
                                        stage4 = stage6;
                                        break;
                                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                    case INVALID_METRICS_ENDPOINT_VALUE:
                                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                                        Iterator it9 = list4.iterator();
                                        while (true) {
                                            if (it9.hasNext()) {
                                                stage7 = it9.next();
                                                Stage stage9 = (Stage) stage7;
                                                stage2 = stage;
                                                c6iVar3 = c6iVar2;
                                                if (stage9.getType() == ServerType.QUALIFYING_PART) {
                                                    Integer sequence2 = stage9.getSequence();
                                                    int i6 = intValue - 123;
                                                    if (sequence2 != null && sequence2.intValue() == i6) {
                                                    }
                                                }
                                                stage = stage2;
                                                c6iVar2 = c6iVar3;
                                            } else {
                                                stage2 = stage;
                                                c6iVar3 = c6iVar2;
                                                stage7 = 0;
                                            }
                                        }
                                        stage4 = stage7;
                                        break;
                                    default:
                                        Iterator it10 = list4.iterator();
                                        while (true) {
                                            if (it10.hasNext()) {
                                                obj4 = it10.next();
                                                if (((Stage) obj4).getType() == ServerType.RACE) {
                                                }
                                            } else {
                                                obj4 = null;
                                            }
                                        }
                                        c6iVar3 = c6iVar2;
                                        stage5 = (Stage) obj4;
                                        stage2 = stage;
                                        break;
                                }
                                if (stage5 != null) {
                                    stage3 = Stage.copy$default(stage5, null, null, null, null, null, null, null, null, null, stage2.getId(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108351, null);
                                }
                            }
                            stage5 = stage4;
                            if (stage5 != null) {
                            }
                        } else {
                            stage2 = stage;
                            c6iVar3 = c6iVar2;
                        }
                        stage3 = stage2;
                        DayOfWeek dayOfWeek = hwc.a;
                        boolean f = hwc.f(stage3);
                        if (intValue == 129) {
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it11 = arrayList.iterator();
                            while (it11.hasNext()) {
                                Object next = it11.next();
                                ProviderOdds providerOdds = (ProviderOdds) next;
                                Iterator it12 = it11;
                                if (providerOdds.getMarketId() == intValue) {
                                    Stage stage10 = providerOdds.getStage();
                                    if (stage10 != null) {
                                        DayOfWeek dayOfWeek2 = hwc.a;
                                        bool = Boolean.valueOf(hwc.f(stage10));
                                    } else {
                                        bool = null;
                                    }
                                    e1dVar3 = e1dVar;
                                    if (Intrinsics.c(bool, Boolean.TRUE) || !providerOdds.isLive()) {
                                        arrayList7.add(next);
                                    }
                                } else {
                                    e1dVar3 = e1dVar;
                                }
                                it11 = it12;
                                e1dVar = e1dVar3;
                            }
                            e1dVar2 = e1dVar;
                            List H0 = CollectionsKt.H0(arrayList7, new laf(28));
                            HashSet hashSet = new HashSet();
                            c = new ArrayList();
                            for (Object obj7 : H0) {
                                Stage stage11 = ((ProviderOdds) obj7).getStage();
                                if (hashSet.add(stage11 != null ? Integer.valueOf(stage11.getId()) : null)) {
                                    c.add(obj7);
                                }
                            }
                        } else {
                            e1dVar2 = e1dVar;
                            ProviderOdds d2 = ug5.d(intValue, arrayList, f);
                            c = d2 != null ? a.c(d2) : 0;
                        }
                        if (c == 0) {
                            c = km5.a;
                        }
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it13 = c.iterator();
                        while (it13.hasNext()) {
                            ProviderOdds providerOdds2 = (ProviderOdds) it13.next();
                            switch (intValue) {
                                case 101:
                                case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                                    arrayList2 = arrayList;
                                    DayOfWeek dayOfWeek3 = hwc.a;
                                    boolean f2 = hwc.f(stage3);
                                    Integer valueOf = Integer.valueOf(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                                    it3 = it13;
                                    list2 = list4;
                                    ArrayList arrayList9 = new ArrayList();
                                    for (Object obj8 : arrayList2) {
                                        Iterator it14 = it2;
                                        ProviderOdds providerOdds3 = (ProviderOdds) obj8;
                                        f6i f6iVar2 = k;
                                        int i7 = intValue;
                                        if (b.j(101, valueOf, 103, 104).contains(Integer.valueOf(providerOdds3.getMarketId())) && (!providerOdds3.isLive() || f2)) {
                                            arrayList9.add(obj8);
                                        }
                                        it2 = it14;
                                        k = f6iVar2;
                                        intValue = i7;
                                    }
                                    it4 = it2;
                                    f6iVar = k;
                                    i2 = intValue;
                                    List H02 = CollectionsKt.H0(arrayList9, new laf(29));
                                    HashSet hashSet2 = new HashSet();
                                    ArrayList arrayList10 = new ArrayList();
                                    Iterator it15 = H02.iterator();
                                    while (it15.hasNext()) {
                                        List list6 = H02;
                                        Object next2 = it15.next();
                                        Iterator it16 = it15;
                                        if (hashSet2.add(Integer.valueOf(((ProviderOdds) next2).getMarketId()))) {
                                            arrayList10.add(next2);
                                        }
                                        H02 = list6;
                                        it15 = it16;
                                    }
                                    List list7 = H02;
                                    if (list7.size() == arrayList10.size()) {
                                        arrayList3 = list7;
                                    } else {
                                        arrayList3 = new ArrayList();
                                        for (Object obj9 : list7) {
                                            if (((ProviderOdds) obj9).isLive() == f2) {
                                                arrayList3.add(obj9);
                                            }
                                        }
                                    }
                                    if (arrayList3.size() == 1) {
                                        g6iVar = z5i.c(i4, (ProviderOdds) CollectionsKt.Y(arrayList3), oddsCountryProvider, stage3, d6i.b);
                                    } else {
                                        int intValue2 = ((Number) CollectionsKt.Y(b.j(101, valueOf, 103, 104))).intValue();
                                        d6i d6iVar = d6i.c;
                                        ArrayList arrayList11 = new ArrayList();
                                        Iterator it17 = arrayList3.iterator();
                                        while (it17.hasNext()) {
                                            o13.v(((ProviderOdds) it17.next()).getChoices(), arrayList11);
                                        }
                                        ArrayList arrayList12 = new ArrayList();
                                        Iterator it18 = arrayList11.iterator();
                                        while (it18.hasNext()) {
                                            Object next3 = it18.next();
                                            if (!Intrinsics.c(OddsChoice.getReversibleName$default((OddsChoice) next3, null, 1, null), "No")) {
                                                arrayList12.add(next3);
                                            }
                                        }
                                        Boolean bool2 = null;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        Iterator it19 = arrayList12.iterator();
                                        while (it19.hasNext()) {
                                            Object next4 = it19.next();
                                            Team team = ((OddsChoice) next4).getTeam();
                                            Object obj10 = linkedHashMap.get(team);
                                            if (obj10 == null) {
                                                obj10 = new ArrayList();
                                                linkedHashMap.put(team, obj10);
                                            }
                                            ((List) obj10).add(next4);
                                        }
                                        ArrayList arrayList13 = new ArrayList(linkedHashMap.size());
                                        Iterator it20 = linkedHashMap.entrySet().iterator();
                                        while (it20.hasNext()) {
                                            List<OddsChoice> list8 = (List) ((Map.Entry) it20.next()).getValue();
                                            ProviderOdds providerOdds4 = (ProviderOdds) CollectionsKt.firstOrNull(arrayList3);
                                            int marketId = providerOdds4 != null ? providerOdds4.getMarketId() : 0;
                                            ProviderOdds providerOdds5 = (ProviderOdds) CollectionsKt.firstOrNull(arrayList3);
                                            boolean c2 = Intrinsics.c(providerOdds5 != null ? Boolean.valueOf(providerOdds5.isLive()) : bool2, Boolean.TRUE);
                                            ArrayList arrayList14 = new ArrayList(k13.r(list8, 10));
                                            for (OddsChoice oddsChoice : list8) {
                                                Iterator it21 = arrayList3.iterator();
                                                while (true) {
                                                    if (it21.hasNext()) {
                                                        obj2 = it21.next();
                                                        List<OddsChoice> choices = ((ProviderOdds) obj2).getChoices();
                                                        if (choices == null || !choices.isEmpty()) {
                                                            Iterator it22 = choices.iterator();
                                                            while (it22.hasNext()) {
                                                                if (Intrinsics.c(((OddsChoice) it22.next()).getId(), oddsChoice.getId())) {
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        obj2 = null;
                                                    }
                                                }
                                                ProviderOdds providerOdds6 = (ProviderOdds) obj2;
                                                arrayList14.add(z5i.a(i4, oddsChoice, rld.k(i4, oddsCountryProvider, (ProviderOdds) CollectionsKt.Y(arrayList3), oddsChoice), ug5.q(Integer.valueOf(providerOdds6 != null ? providerOdds6.getMarketId() : 0), false, false)));
                                            }
                                            arrayList13.add(new fgf(-1, (r9k) null, marketId, c2, l6g.W(arrayList14), (ProviderOdds.Type) null, (String) null, 224));
                                            bool2 = null;
                                        }
                                        gv9 W2 = l6g.W(arrayList13);
                                        wmd D = w3a.D(i4, stage3);
                                        OddsProvider provider = oddsCountryProvider.getProvider();
                                        provider.getClass();
                                        yld yldVar = new yld(provider.getId(), provider.getColors(), provider.getSlug());
                                        String defaultBetSlipLink = oddsCountryProvider.getDefaultBetSlipLink();
                                        if (defaultBetSlipLink == null) {
                                            defaultBetSlipLink = oddsCountryProvider.getProvider().getDefaultBetSlipLink();
                                        }
                                        g6iVar = new g6i(intValue2, null, d6iVar, null, W2, D, new old(yldVar, defaultBetSlipLink, oddsCountryProvider.getBranded(), oddsCountryProvider.getOddsOffset(), oddsCountryProvider.getOddsMayDiffer(), oddsCountryProvider.getType(), oddsCountryProvider.getSignupLink()));
                                    }
                                    g6iVar2 = g6iVar;
                                    break;
                                case 102:
                                case 112:
                                case 113:
                                case INVALID_INDEX_URL_VALUE:
                                case JSON_ENCODE_ERROR_VALUE:
                                    arrayList2 = arrayList;
                                    g6iVar = z5i.c(i4, providerOdds2, oddsCountryProvider, stage3, d6i.d);
                                    it3 = it13;
                                    list2 = list4;
                                    it4 = it2;
                                    f6iVar = k;
                                    i2 = intValue;
                                    g6iVar2 = g6iVar;
                                    break;
                                case 103:
                                case 104:
                                case 108:
                                case 109:
                                case 110:
                                case 111:
                                case ASSET_WRITE_ERROR_VALUE:
                                case GZIP_ENCODE_ERROR_VALUE:
                                case ASSET_FAILED_STATUS_CODE_VALUE:
                                case 120:
                                case 128:
                                default:
                                    arrayList2 = arrayList;
                                    it3 = it13;
                                    list2 = list4;
                                    it4 = it2;
                                    f6iVar = k;
                                    i2 = intValue;
                                    g6iVar2 = null;
                                    break;
                                case 105:
                                case 106:
                                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                case TPAT_ERROR_VALUE:
                                case INVALID_ADS_ENDPOINT_VALUE:
                                case INVALID_RI_ENDPOINT_VALUE:
                                case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                case INVALID_METRICS_ENDPOINT_VALUE:
                                case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                                case 129:
                                    arrayList2 = arrayList;
                                    g6iVar = z5i.c(i4, providerOdds2, oddsCountryProvider, stage3, d6i.b);
                                    it3 = it13;
                                    list2 = list4;
                                    it4 = it2;
                                    f6iVar = k;
                                    i2 = intValue;
                                    g6iVar2 = g6iVar;
                                    break;
                                case 107:
                                    int marketId2 = providerOdds2.getMarketId();
                                    arrayList2 = arrayList;
                                    q9k r = ug5.r(6, Integer.valueOf(providerOdds2.getMarketId()), false);
                                    d6i d6iVar2 = d6i.a;
                                    gv9 W3 = l6g.W(a.c(egf.a(i4, oddsCountryProvider, providerOdds2)));
                                    wmd D2 = w3a.D(i4, stage3);
                                    OddsProvider provider2 = oddsCountryProvider.getProvider();
                                    provider2.getClass();
                                    yld yldVar2 = new yld(provider2.getId(), provider2.getColors(), provider2.getSlug());
                                    String defaultBetSlipLink2 = oddsCountryProvider.getDefaultBetSlipLink();
                                    if (defaultBetSlipLink2 == null) {
                                        defaultBetSlipLink2 = oddsCountryProvider.getProvider().getDefaultBetSlipLink();
                                    }
                                    g6iVar = new g6i(marketId2, r, d6iVar2, null, W3, D2, new old(yldVar2, defaultBetSlipLink2, oddsCountryProvider.getBranded(), oddsCountryProvider.getOddsOffset(), oddsCountryProvider.getOddsMayDiffer(), oddsCountryProvider.getType(), oddsCountryProvider.getSignupLink()));
                                    it3 = it13;
                                    list2 = list4;
                                    it4 = it2;
                                    f6iVar = k;
                                    i2 = intValue;
                                    g6iVar2 = g6iVar;
                                    break;
                            }
                            if (g6iVar2 != null) {
                                arrayList8.add(g6iVar2);
                            }
                            arrayList = arrayList2;
                            list4 = list2;
                            it13 = it3;
                            it2 = it4;
                            k = f6iVar;
                            intValue = i2;
                        }
                        o13.v(arrayList8, arrayList6);
                        stage = stage2;
                        c6iVar2 = c6iVar3;
                        e1dVar = e1dVar2;
                    }
                    c6i c6iVar4 = c6iVar2;
                    ((eoh) e1dVar).setValue(f6i.a(k, false, W, c6iVar4, l6g.W(arrayList6), null, false, 232));
                    this.l.k(c6iVar4.a);
                }
                return Unit.a;
            }
        }
        h6iVar = new h6i(this, sq3Var);
        Object obj52 = h6iVar.r;
        lu3 lu3Var2 = lu3.a;
        i = h6iVar.t;
        e1dVar = this.k;
        if (i != 0) {
        }
        stage = this.g;
        arrayList = this.i;
        if (stage != null) {
            ArrayList arrayList42 = new ArrayList(k13.r(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
            }
            List S02 = CollectionsKt.S0(CollectionsKt.V0(arrayList42));
            kp5 kp5Var2 = c6i.e;
            ArrayList arrayList52 = new ArrayList();
            while (r8.hasNext()) {
            }
            gv9 W4 = l6g.W(arrayList52);
            c6iVar2 = k().c;
            if (c6iVar2 != null) {
            }
            joa joaVar2 = l5i.a;
            list = this.h;
            if (list == null) {
            }
            d = l5i.d(list);
            if (d == null) {
            }
            if (c6iVar2 == null) {
            }
            f6i k2 = k();
            Context i42 = i();
            OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) CollectionsKt.Y(this.f.c());
            List list42 = this.h;
            oddsCountryProvider2.getClass();
            c6iVar2.getClass();
            List list52 = c6iVar2.c;
            ArrayList arrayList62 = new ArrayList();
            it2 = list52.iterator();
            while (it2.hasNext()) {
            }
            c6i c6iVar42 = c6iVar2;
            ((eoh) e1dVar).setValue(f6i.a(k2, false, W4, c6iVar42, l6g.W(arrayList62), null, false, 232));
            this.l.k(c6iVar42.a);
        }
        return Unit.a;
    }

    public final void n(Stage stage) {
        Boolean bool;
        Category category;
        this.g = stage;
        vmd vmdVar = stage.getType() == ServerType.SEASON ? vmd.CATEGORY_INFO : vmd.RACE_ODDS_TAB;
        int i = 0;
        rq3 rq3Var = null;
        if (k().g != vmdVar) {
            f6i k = k();
            UniqueStage uniqueStage = stage.getUniqueStage();
            if (uniqueStage == null || (category = uniqueStage.getCategory()) == null) {
                bool = null;
            } else {
                joa joaVar = l5i.a;
                boolean z = true;
                if (!c.o(category.getSlug(), "bikes", true) && !c.v(category.getSlug(), "moto", true)) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            ((eoh) this.k).setValue(f6i.a(k, false, null, null, null, vmdVar, Intrinsics.c(bool, Boolean.TRUE), 63));
        }
        xw3.L(un0.z(this), null, null, new i6i(this, rq3Var, i), 3);
    }
}
