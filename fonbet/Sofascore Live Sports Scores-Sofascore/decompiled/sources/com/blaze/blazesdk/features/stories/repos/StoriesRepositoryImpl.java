package com.blaze.blazesdk.features.stories.repos;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.dto.AdInfoDto;
import com.blaze.blazesdk.data_source.BlazeAdvancedOrderType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.a;
import com.blaze.blazesdk.database.BlazeDatabase;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.shared.repos.RecommendationsFetcher;
import com.blaze.blazesdk.features.stories.models.dto.StoryDto;
import com.blaze.blazesdk.features.stories.models.local.StoryPageStatus;
import com.blaze.blazesdk.features.stories.models.responses.StoriesResponse;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.interactions.models.local.InteractionStatus;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.ErrorReason;
import com.blaze.blazesdk.shared.results.q0;
import com.blaze.blazesdk.shared.results.s0;
import com.blaze.blazesdk.user_activity.models.responses.UserActivityInteraction;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import defpackage.a0m;
import defpackage.a62;
import defpackage.a6m;
import defpackage.a70;
import defpackage.a9m;
import defpackage.aeh;
import defpackage.beh;
import defpackage.bmm;
import defpackage.bx0;
import defpackage.esm;
import defpackage.evl;
import defpackage.f1m;
import defpackage.fcm;
import defpackage.fdi;
import defpackage.fn0;
import defpackage.gdi;
import defpackage.gzk;
import defpackage.hof;
import defpackage.if5;
import defpackage.j1m;
import defpackage.jca;
import defpackage.jlm;
import defpackage.k13;
import defpackage.k4g;
import defpackage.km5;
import defpackage.kom;
import defpackage.ljm;
import defpackage.lu3;
import defpackage.mqi;
import defpackage.n13;
import defpackage.ndd;
import defpackage.o02;
import defpackage.o3a;
import defpackage.o93;
import defpackage.p13;
import defpackage.q9m;
import defpackage.qbm;
import defpackage.rfi;
import defpackage.rhm;
import defpackage.rq3;
import defpackage.rwl;
import defpackage.s3m;
import defpackage.s9i;
import defpackage.sq3;
import defpackage.srl;
import defpackage.tdm;
import defpackage.trl;
import defpackage.tub;
import defpackage.tvl;
import defpackage.u9i;
import defpackage.un0;
import defpackage.v7a;
import defpackage.vym;
import defpackage.w6m;
import defpackage.xmm;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.ypa;
import defpackage.yrl;
import defpackage.yvl;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001R>\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/blaze/blazesdk/features/stories/repos/StoriesRepositoryImpl;", "Lyrl;", "Ljava/util/HashMap;", "", "", "Lcom/blaze/blazesdk/features/stories/models/ui/StoryModel;", "Lkotlin/collections/HashMap;", "entryIdToStoriesList", "Ljava/util/HashMap;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StoriesRepositoryImpl implements yrl {
    public static final aeh b;
    public static final hof c;
    public static final aeh d;
    public static final hof e;
    public static final fdi f;
    public static final fdi g;
    public static final fdi h;
    public static final fdi i;
    public static final mqi j;
    public static final HashMap k;
    public static final StoriesRepositoryImpl a = new StoriesRepositoryImpl();

    @Keep
    @NotNull
    private static HashMap<String, List<StoryModel>> entryIdToStoriesList = new HashMap<>();

    static {
        a62 a62Var = a62.b;
        aeh b2 = beh.b(0, TTAdConstant.STYLE_SIZE_RADIO_3_2, a62Var, 1);
        b = b2;
        c = un0.t(b2);
        aeh b3 = beh.b(0, TTAdConstant.STYLE_SIZE_RADIO_3_2, a62Var, 1);
        d = b3;
        e = un0.t(b3);
        fdi a2 = gdi.a(new HashMap());
        f = a2;
        g = a2;
        fdi a3 = gdi.a(new HashMap());
        h = a3;
        i = a3;
        j = ypa.b(new u9i(27));
        k = new HashMap();
    }

    public static List d(ArrayList arrayList) {
        trl storyPageDao;
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                StoryModel storyModel = (StoryModel) it.next();
                List list = storyModel.g;
                ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((srl) it2.next()).a);
                }
                BlazeDatabase instance = BlazeDatabase.INSTANCE.instance();
                ArrayList d2 = (instance == null || (storyPageDao = instance.getStoryPageDao()) == null) ? null : storyPageDao.d(arrayList2);
                for (srl srlVar : storyModel.g) {
                    srlVar.h = d2 != null ? Boolean.valueOf(d2.contains(srlVar.a)) : null;
                }
                p(storyModel);
            }
            return arrayList;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return km5.a;
        }
    }

    public static Unit e(StoryModel storyModel, String str, boolean z, Integer num, String str2) {
        StoryPageStatus storyPageStatus;
        String str3;
        Long l;
        BlazeDatabase instance;
        trl storyPageDao;
        trl storyPageDao2;
        Object obj;
        Object obj2;
        if (storyModel == null) {
            try {
                Set<Map.Entry<String, List<StoryModel>>> entrySet = entryIdToStoriesList.entrySet();
                entrySet.getClass();
                Iterator<T> it = entrySet.iterator();
                loop3: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object value = ((Map.Entry) it.next()).getValue();
                    value.getClass();
                    for (StoryModel storyModel2 : (Iterable) value) {
                        List list = storyModel2.g;
                        ArrayList arrayList = new ArrayList(k13.r(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((srl) it2.next()).a);
                        }
                        if (arrayList.contains(str)) {
                            storyModel = storyModel2;
                            break loop3;
                        }
                    }
                }
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
        Set<Map.Entry<String, List<StoryModel>>> entrySet2 = entryIdToStoriesList.entrySet();
        entrySet2.getClass();
        Iterator<T> it3 = entrySet2.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Object value2 = entry.getValue();
            value2.getClass();
            Iterator it4 = ((Iterable) value2).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it4.next();
                if (Intrinsics.c(((StoryModel) obj).id, storyModel != null ? storyModel.id : null)) {
                    break;
                }
            }
            StoryModel storyModel3 = (StoryModel) obj;
            if (storyModel3 != null) {
                Iterator it5 = storyModel3.g.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it5.next();
                    if (Intrinsics.c(((srl) obj2).a, str)) {
                        break;
                    }
                }
                srl srlVar = (srl) obj2;
                if (srlVar != null) {
                    srlVar.h = Boolean.TRUE;
                }
                p(storyModel3);
                b.b(entry.getKey());
                aeh aehVar = d;
                Object key = entry.getKey();
                key.getClass();
                aehVar.b(key);
                if (Intrinsics.c(entry.getKey(), str2)) {
                    fdi fdiVar = h;
                    HashMap f2 = tub.f(new Pair(str2, num));
                    fdiVar.getClass();
                    fdiVar.m(null, f2);
                }
            }
        }
        try {
        } catch (Exception e2) {
            s0 s0Var = new s0();
            s0Var.f = e2;
            s0Var.g = tub.h(new Pair("pageId", str), new Pair("context", "Failed updating page read status in DB"));
            j1m.a(s0Var);
        }
        if (storyModel != null) {
            str3 = storyModel.id;
            if (str3 == null) {
            }
            storyPageStatus = new StoryPageStatus(str, str3, z);
            BlazeDatabase.Companion companion = BlazeDatabase.INSTANCE;
            BlazeDatabase instance2 = companion.instance();
            l = (instance2 != null || (storyPageDao2 = instance2.getStoryPageDao()) == null) ? null : new Long(storyPageDao2.b(storyPageStatus));
            if (l != null && l.longValue() == -1 && !StringsKt.R(storyPageStatus.getStoryId()) && (instance = companion.instance()) != null && (storyPageDao = instance.getStoryPageDao()) != null) {
                o02.K(storyPageDao.a(storyPageStatus.getPageId(), storyPageStatus.getStoryId()));
            }
            return Unit.a;
        }
        str3 = "";
        storyPageStatus = new StoryPageStatus(str, str3, z);
        BlazeDatabase.Companion companion2 = BlazeDatabase.INSTANCE;
        BlazeDatabase instance22 = companion2.instance();
        if (instance22 != null) {
        }
        if (l != null) {
            o02.K(storyPageDao.a(storyPageStatus.getPageId(), storyPageStatus.getStoryId()));
        }
        return Unit.a;
    }

    public static Unit f(String str, ArrayList arrayList) {
        try {
            entryIdToStoriesList.put(str, new ArrayList(arrayList));
            b.b(str);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        return Unit.a;
    }

    public static void g(BlazeDataSourceType blazeDataSourceType, String str, String str2, String str3, esm esmVar) {
        blazeDataSourceType.getClass();
        if (a.b(blazeDataSourceType)) {
            try {
                evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new q9m(blazeDataSourceType, str, str2, str3, esmVar, null), 1, null);
                return;
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                return;
            }
        }
        j1m j1mVar = j1m.a;
        q0 q0Var = new q0();
        q0Var.g = fn0.p("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release());
        j1m.a(q0Var);
        evl.l(q0Var.d(), esmVar);
    }

    public static void h(String str) {
        str.getClass();
        try {
            List<StoryModel> list = entryIdToStoriesList.get(str);
            if (list != null) {
                list.clear();
            }
            bmm.b(str);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r2 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r4 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r5.add(0, r5.remove(r4.intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(String str, String str2) {
        str.getClass();
        List<StoryModel> list = entryIdToStoriesList.get(str);
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        int i2 = 0;
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it.next();
            if (i2 < 0) {
                b.q();
                throw null;
            }
            if (Intrinsics.c(((StoryModel) next).id, str2)) {
                break;
            } else {
                i2++;
            }
        }
    }

    public static void j(String str, Date date) {
        try {
            xw3.L(evl.coroutineContextOnIO$default(BlazeSDK.INSTANCE, null, 1, null), null, null, new rhm((long) ((date.getTime() - new Date().getTime()) * 0.8d), str, null), 3);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void k(ArrayList arrayList, BlazeDataSourceType blazeDataSourceType) {
        boolean z;
        tdm tdmVar = blazeDataSourceType instanceof tdm ? (tdm) blazeDataSourceType : null;
        BlazeAdvancedOrderType advancedOrderType = tdmVar != null ? tdmVar.getAdvancedOrderType() : null;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            StoryModel storyModel = (StoryModel) next;
            if (Intrinsics.c(advancedOrderType, BlazeAdvancedOrderType.LiveFirst.INSTANCE)) {
                z = storyModel.a;
            } else {
                if (advancedOrderType != null) {
                    zzl.b();
                    return;
                }
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        arrayList.clear();
        arrayList.addAll(CollectionsKt.w0(CollectionsKt.H0(arrayList3, new jlm()), CollectionsKt.H0(arrayList2, new ljm())));
    }

    public static Unit m(String str) {
        try {
            List<StoryModel> list = entryIdToStoriesList.get(str);
            if (list != null) {
                list.clear();
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        return Unit.a;
    }

    public static void n(String str, String str2) {
        InteractionModel interactionModel;
        Set<Map.Entry<String, List<StoryModel>>> entrySet = entryIdToStoriesList.entrySet();
        entrySet.getClass();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            value.getClass();
            Iterator it2 = ((Iterable) value).iterator();
            while (it2.hasNext()) {
                for (srl srlVar : ((StoryModel) it2.next()).g) {
                    InteractionModel interactionModel2 = srlVar.l;
                    if (Intrinsics.c(interactionModel2 != null ? interactionModel2.getId() : null, str) && (interactionModel = srlVar.l) != null) {
                        interactionModel.setUserAnswer(str2);
                    }
                }
            }
        }
    }

    public static List o(String str) {
        str.getClass();
        try {
            List<StoryModel> list = entryIdToStoriesList.get(str);
            return list != null ? new ArrayList(list) : new ArrayList();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return km5.a;
        }
    }

    public static void p(StoryModel storyModel) {
        boolean z;
        srl srlVar;
        List<srl> list = storyModel.g;
        if (list == null || !list.isEmpty()) {
            for (srl srlVar2 : list) {
                if (!srlVar2.m || !Intrinsics.c(srlVar2.h, Boolean.TRUE)) {
                    Iterator it = p13.F(list).iterator();
                    do {
                        ListIterator listIterator = (ListIterator) ((k4g) it).b;
                        if (listIterator.hasPrevious()) {
                            srlVar = (srl) listIterator.previous();
                            if (!srlVar.m || !Intrinsics.c(srlVar.h, Boolean.FALSE)) {
                            }
                        }
                        z = false;
                        break;
                    } while (srlVar.m);
                    z = Intrinsics.c(srlVar.h, Boolean.TRUE);
                    storyModel.c = z;
                    int x = jca.x(v7a.g(storyModel));
                    storyModel.p = x;
                    storyModel.q = x;
                }
            }
        }
        z = true;
        storyModel.c = z;
        int x2 = jca.x(v7a.g(storyModel));
        storyModel.p = x2;
        storyModel.q = x2;
    }

    public static void q(String str) {
        List<StoryModel> list = entryIdToStoriesList.get(str);
        if (list != null) {
            n13.u(o93.a(new s9i(29), new rfi(0)), list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x03fe, code lost:
    
        if (r0 == r10) goto L190;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02a3 A[Catch: all -> 0x01f5, CancellationException -> 0x045e, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x045e, blocks: (B:15:0x0047, B:17:0x0401, B:26:0x0068, B:28:0x029b, B:31:0x029f, B:34:0x02a3, B:36:0x02c9, B:38:0x02d5, B:40:0x02d9, B:42:0x02f1, B:44:0x02f8, B:46:0x0320, B:47:0x034d, B:50:0x0371, B:52:0x037e, B:53:0x0381, B:54:0x0395, B:56:0x039b, B:58:0x03a3, B:60:0x03b2, B:62:0x03b7, B:65:0x03c8, B:66:0x03cb, B:68:0x03cc, B:70:0x03d6, B:71:0x03d9, B:73:0x03e1, B:74:0x03e3, B:76:0x03eb, B:77:0x03ed, B:82:0x0368, B:83:0x0324, B:85:0x034a, B:86:0x0408, B:87:0x040d, B:92:0x008c, B:94:0x026d, B:96:0x00aa, B:98:0x023d, B:100:0x00c8, B:102:0x01f1, B:104:0x00e6, B:107:0x01b0, B:115:0x00f7, B:118:0x0117, B:121:0x011f, B:123:0x0122, B:126:0x012a, B:132:0x016d, B:136:0x0175, B:138:0x0182, B:141:0x0186, B:144:0x01a3, B:153:0x017b, B:156:0x01c4, B:159:0x01c8, B:161:0x01e6, B:164:0x0200, B:167:0x0206, B:169:0x0213, B:170:0x0216, B:172:0x0232, B:175:0x020c, B:177:0x0242, B:179:0x0246, B:182:0x0270, B:184:0x0274, B:186:0x0278, B:189:0x040e, B:190:0x0413, B:191:0x0414, B:192:0x0416, B:198:0x014d, B:211:0x010d), top: B:8:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02d5 A[Catch: all -> 0x01f5, CancellationException -> 0x045e, TRY_ENTER, TryCatch #3 {CancellationException -> 0x045e, blocks: (B:15:0x0047, B:17:0x0401, B:26:0x0068, B:28:0x029b, B:31:0x029f, B:34:0x02a3, B:36:0x02c9, B:38:0x02d5, B:40:0x02d9, B:42:0x02f1, B:44:0x02f8, B:46:0x0320, B:47:0x034d, B:50:0x0371, B:52:0x037e, B:53:0x0381, B:54:0x0395, B:56:0x039b, B:58:0x03a3, B:60:0x03b2, B:62:0x03b7, B:65:0x03c8, B:66:0x03cb, B:68:0x03cc, B:70:0x03d6, B:71:0x03d9, B:73:0x03e1, B:74:0x03e3, B:76:0x03eb, B:77:0x03ed, B:82:0x0368, B:83:0x0324, B:85:0x034a, B:86:0x0408, B:87:0x040d, B:92:0x008c, B:94:0x026d, B:96:0x00aa, B:98:0x023d, B:100:0x00c8, B:102:0x01f1, B:104:0x00e6, B:107:0x01b0, B:115:0x00f7, B:118:0x0117, B:121:0x011f, B:123:0x0122, B:126:0x012a, B:132:0x016d, B:136:0x0175, B:138:0x0182, B:141:0x0186, B:144:0x01a3, B:153:0x017b, B:156:0x01c4, B:159:0x01c8, B:161:0x01e6, B:164:0x0200, B:167:0x0206, B:169:0x0213, B:170:0x0216, B:172:0x0232, B:175:0x020c, B:177:0x0242, B:179:0x0246, B:182:0x0270, B:184:0x0274, B:186:0x0278, B:189:0x040e, B:190:0x0413, B:191:0x0414, B:192:0x0416, B:198:0x014d, B:211:0x010d), top: B:8:0x0030 }] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v44, types: [int] */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var, BlazeDataSourceType blazeDataSourceType, String str, String str2, String str3, String str4, Map map, boolean z, boolean z2) {
        yvl yvlVar;
        BlazeDataSourceType blazeDataSourceType2;
        ?? r7;
        tvl tvlVar;
        boolean z3;
        lu3 lu3Var;
        boolean z4;
        String str5;
        StoriesRepositoryImpl storiesRepositoryImpl;
        boolean z5;
        Object obj;
        Object obj2;
        LinkedHashMap linkedHashMap;
        Object obj3;
        String str6;
        BlazeDataSourceType blazeDataSourceType3;
        String str7;
        String str8;
        a9m a9mVar;
        String str9;
        BlazeDataSourceType blazeDataSourceType4;
        String str10;
        BlazeDataSourceType blazeDataSourceType5;
        Object obj4;
        String str11;
        BlazeDataSourceType blazeDataSourceType6;
        String str12;
        a9m a9mVar2;
        Object obj5;
        String str13;
        BlazeDataSourceType blazeDataSourceType7;
        Object obj6;
        String str14;
        BlazeDataSourceType blazeDataSourceType8;
        Collection collection;
        ?? r3;
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        HashMap hashMap = k;
        if (!(rq3Var instanceof yvl) || (r7 = (r3 = (yvlVar = (yvl) rq3Var).z) & (-2147483648)) == 0) {
            yvlVar = new yvl(this, rq3Var);
            blazeDataSourceType2 = r3;
        } else {
            ?? r32 = r3 - Integer.MIN_VALUE;
            yvlVar.z = r32;
            blazeDataSourceType2 = r32;
        }
        yvl yvlVar2 = yvlVar;
        Object obj7 = yvlVar2.x;
        lu3 lu3Var2 = lu3.a;
        ?? r2 = yvlVar2.z;
        try {
            try {
                try {
                    switch (r2) {
                        case 0:
                            y6a.M(obj7);
                            try {
                                gzk gzkVar = gzk.a;
                                gzk.g(str16, blazeDataSourceType.getStringRepresentation$blazesdk_release(), BlazePlayerType.STORIES, str17);
                                str15.getClass();
                                try {
                                    tvlVar = (tvl) hashMap.get(str15);
                                } catch (Throwable th) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                    tvlVar = null;
                                }
                                blazeDataSourceType2 = blazeDataSourceType;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    blazeDataSourceType2 = blazeDataSourceType2;
                                    str16 = str16;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                blazeDataSourceType2 = blazeDataSourceType;
                                str16 = str16;
                            }
                            try {
                                boolean c2 = Intrinsics.c(tvlVar, new tvl(blazeDataSourceType2, z, str16, str17, str4));
                                if (z2 || c2) {
                                    blazeDataSourceType2 = blazeDataSourceType;
                                    str16 = str2;
                                    str17 = str3;
                                    r7 = str4;
                                    z3 = z;
                                } else {
                                    h(str15);
                                    try {
                                        blazeDataSourceType3 = blazeDataSourceType;
                                        str7 = str2;
                                        str17 = str3;
                                        str8 = str4;
                                        z3 = z;
                                        try {
                                            hashMap.put(str15, new tvl(blazeDataSourceType3, z3, str7, str17, str8));
                                            blazeDataSourceType2 = blazeDataSourceType3;
                                            str16 = str7;
                                            r7 = str8;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                            blazeDataSourceType2 = blazeDataSourceType3;
                                            str16 = str7;
                                            r7 = str8;
                                            if (blazeDataSourceType2 instanceof BlazeDataSourceType.Labels) {
                                            }
                                            return lu3Var;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        blazeDataSourceType3 = blazeDataSourceType;
                                        str7 = str2;
                                        str17 = str3;
                                        str8 = str4;
                                        z3 = z;
                                    }
                                }
                                if (blazeDataSourceType2 instanceof BlazeDataSourceType.Labels) {
                                    lu3Var = lu3Var2;
                                    try {
                                        try {
                                            if (blazeDataSourceType2 instanceof BlazeDataSourceType.Ids) {
                                                rwl rwlVar = rwl.a;
                                                s3m s3mVar = new s3m(blazeDataSourceType2, map, null);
                                                yvlVar2.r = this;
                                                yvlVar2.s = blazeDataSourceType2;
                                                yvlVar2.t = str15;
                                                yvlVar2.u = str16;
                                                yvlVar2.v = str17;
                                                yvlVar2.w = z3;
                                                yvlVar2.z = 2;
                                                obj2 = null;
                                                z4 = true;
                                                obj7 = rwl.safeApiCall$default(rwlVar, false, s3mVar, yvlVar2, 1, null);
                                                if (obj7 != lu3Var) {
                                                    str5 = str17;
                                                    storiesRepositoryImpl = this;
                                                    z5 = z3;
                                                    blazeDataSourceType4 = blazeDataSourceType2;
                                                    str9 = str16;
                                                    a9mVar = (a9m) obj7;
                                                    blazeDataSourceType7 = blazeDataSourceType4;
                                                    str13 = str9;
                                                    obj5 = obj2;
                                                    z3 = z5;
                                                    blazeDataSourceType2 = blazeDataSourceType7;
                                                    str12 = str13;
                                                    r7 = obj5;
                                                    a9mVar2 = a9mVar;
                                                    if (!(a9mVar2 instanceof a6m)) {
                                                    }
                                                }
                                            } else if (blazeDataSourceType2 instanceof BlazeDataSourceType.Search) {
                                                LinkedHashMap linkedHashMap2 = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
                                                if (r7 != 0) {
                                                    linkedHashMap2.put("forcedFirstContentId", r7);
                                                }
                                                z4 = true;
                                                rwl rwlVar2 = rwl.a;
                                                w6m w6mVar = new w6m(blazeDataSourceType2, linkedHashMap2, null);
                                                yvlVar2.r = this;
                                                yvlVar2.s = blazeDataSourceType2;
                                                yvlVar2.t = str15;
                                                yvlVar2.u = str16;
                                                yvlVar2.v = str17;
                                                yvlVar2.w = z3;
                                                yvlVar2.z = 3;
                                                obj = null;
                                                obj7 = rwl.safeApiCall$default(rwlVar2, false, w6mVar, yvlVar2, 1, null);
                                                if (obj7 != lu3Var) {
                                                    str5 = str17;
                                                    storiesRepositoryImpl = this;
                                                    z5 = z3;
                                                    blazeDataSourceType5 = blazeDataSourceType2;
                                                    str10 = str16;
                                                    a9mVar = (a9m) obj7;
                                                    blazeDataSourceType7 = blazeDataSourceType5;
                                                    str13 = str10;
                                                    obj5 = obj;
                                                    z3 = z5;
                                                    blazeDataSourceType2 = blazeDataSourceType7;
                                                    str12 = str13;
                                                    r7 = obj5;
                                                    a9mVar2 = a9mVar;
                                                    if (!(a9mVar2 instanceof a6m)) {
                                                    }
                                                }
                                            } else {
                                                z4 = true;
                                                Object obj8 = null;
                                                if (blazeDataSourceType2 instanceof BlazeDataSourceType.Recommendations) {
                                                    yvlVar2.r = this;
                                                    yvlVar2.s = blazeDataSourceType2;
                                                    yvlVar2.t = str15;
                                                    yvlVar2.u = str16;
                                                    yvlVar2.v = str17;
                                                    yvlVar2.w = z3;
                                                    yvlVar2.z = 4;
                                                    obj7 = RecommendationsFetcher.INSTANCE.execute((BlazeDataSourceType.Recommendations) blazeDataSourceType2, (StoriesRecommendationStrategy) j.getValue(), yvlVar2);
                                                    if (obj7 != lu3Var) {
                                                        str5 = str17;
                                                        storiesRepositoryImpl = this;
                                                        z5 = z3;
                                                        blazeDataSourceType6 = blazeDataSourceType2;
                                                        str11 = str16;
                                                        obj4 = obj8;
                                                        a9mVar = (a9m) obj7;
                                                        blazeDataSourceType7 = blazeDataSourceType6;
                                                        str13 = str11;
                                                        obj5 = obj4;
                                                        z3 = z5;
                                                        blazeDataSourceType2 = blazeDataSourceType7;
                                                        str12 = str13;
                                                        r7 = obj5;
                                                        a9mVar2 = a9mVar;
                                                        if (!(a9mVar2 instanceof a6m)) {
                                                        }
                                                    }
                                                } else {
                                                    if (blazeDataSourceType2 instanceof BlazeDataSourceType.RemoteConfig) {
                                                        throw f1m.a;
                                                    }
                                                    if (!(blazeDataSourceType2 instanceof BlazeDataSourceType.a)) {
                                                        throw new ndd();
                                                    }
                                                    yvlVar2.r = this;
                                                    yvlVar2.s = blazeDataSourceType2;
                                                    yvlVar2.t = str15;
                                                    yvlVar2.u = str16;
                                                    yvlVar2.v = str17;
                                                    yvlVar2.w = z3;
                                                    yvlVar2.z = 5;
                                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(f1m.a, null);
                                                    obj7 = if5.e;
                                                    if (obj7 != lu3Var) {
                                                        str5 = str17;
                                                        storiesRepositoryImpl = this;
                                                        z5 = z3;
                                                        blazeDataSourceType8 = blazeDataSourceType2;
                                                        str14 = str16;
                                                        obj6 = obj8;
                                                        a9mVar = (a9m) obj7;
                                                        blazeDataSourceType7 = blazeDataSourceType8;
                                                        str13 = str14;
                                                        obj5 = obj6;
                                                        z3 = z5;
                                                        blazeDataSourceType2 = blazeDataSourceType7;
                                                        str12 = str13;
                                                        r7 = obj5;
                                                        a9mVar2 = a9mVar;
                                                        if (!(a9mVar2 instanceof a6m)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            gzk gzkVar2 = gzk.a;
                                            gzk.f(str16, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.STORIES, 0, str17, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
                                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, r7);
                                            return new bx0(null, null, null, 7, null);
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        r7 = 0;
                                    }
                                } else {
                                    if (map != null) {
                                        linkedHashMap = new LinkedHashMap(map);
                                    } else {
                                        try {
                                            linkedHashMap = new LinkedHashMap();
                                        } catch (Throwable th8) {
                                            th = th8;
                                            obj3 = null;
                                            r7 = obj3;
                                            gzk gzkVar22 = gzk.a;
                                            gzk.f(str16, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.STORIES, 0, str17, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
                                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, r7);
                                            return new bx0(null, null, null, 7, null);
                                        }
                                    }
                                    if (r7 != 0) {
                                        linkedHashMap.put("forcedFirstContentId", r7);
                                    }
                                    rwl rwlVar3 = rwl.a;
                                    a0m a0mVar = new a0m(blazeDataSourceType2, linkedHashMap, null);
                                    yvlVar2.r = this;
                                    yvlVar2.s = blazeDataSourceType2;
                                    yvlVar2.t = str15;
                                    yvlVar2.u = str16;
                                    yvlVar2.v = str17;
                                    yvlVar2.w = z3;
                                    yvlVar2.z = 1;
                                    z4 = true;
                                    lu3Var = lu3Var2;
                                    obj3 = null;
                                    try {
                                        obj7 = rwl.safeApiCall$default(rwlVar3, false, a0mVar, yvlVar2, 1, null);
                                        if (obj7 != lu3Var) {
                                            String str18 = str17;
                                            storiesRepositoryImpl = this;
                                            str6 = str18;
                                            blazeDataSourceType2 = blazeDataSourceType2;
                                            str16 = str16;
                                            try {
                                                a9mVar = (a9m) obj7;
                                                r7 = obj3;
                                                str5 = str6;
                                                blazeDataSourceType2 = blazeDataSourceType2;
                                                str12 = str16;
                                                a9mVar2 = a9mVar;
                                                try {
                                                    if (!(a9mVar2 instanceof a6m)) {
                                                        evl.m(storiesRepositoryImpl);
                                                        gzk.globalBroadcastDataLoadCompleted$default(gzk.a, str12, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.STORIES, 0, str5, ErrorReason.FAILED_FETCHING_CONTENT, null, 64, null);
                                                        return a9mVar2;
                                                    }
                                                    if (!(a9mVar2 instanceof qbm)) {
                                                        throw new ndd();
                                                    }
                                                    List<StoryDto> result = ((StoriesResponse) ((qbm) a9mVar2).a).getResult();
                                                    AdInfoDto defaultAdsInfo = ((StoriesResponse) ((qbm) a9mVar2).a).getDefaultAdsInfo();
                                                    if (result == null || (result.isEmpty() ^ z4) != z4) {
                                                        gzk.globalBroadcastDataLoadCompleted$default(gzk.a, str12, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.STORIES, 0, str5, ErrorReason.NO_AVAILABLE_CONTENT_FOR_DATA_SOURCE, null, 64, null);
                                                    } else {
                                                        gzk.globalBroadcastDataLoadCompleted$default(gzk.a, str12, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.STORIES, result.size(), str5, null, null, 96, null);
                                                    }
                                                    Date assetsExpiryTime = ((StoriesResponse) ((qbm) a9mVar2).a).getAssetsExpiryTime();
                                                    storiesRepositoryImpl.getClass();
                                                    try {
                                                        ((Map) f.getValue()).put(str15, assetsExpiryTime);
                                                    } catch (Throwable th9) {
                                                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th9, r7);
                                                    }
                                                    Date assetsExpiryTime2 = ((StoriesResponse) ((qbm) a9mVar2).a).getAssetsExpiryTime();
                                                    if (assetsExpiryTime2 != null) {
                                                        j(str15, assetsExpiryTime2);
                                                    }
                                                    List l = o3a.l(result, defaultAdsInfo);
                                                    ArrayList arrayList = new ArrayList(k13.r(l, 10));
                                                    int i2 = 0;
                                                    for (Object obj9 : l) {
                                                        int i3 = i2 + 1;
                                                        if (i2 < 0) {
                                                            b.q();
                                                            throw r7;
                                                        }
                                                        StoryModel storyModel = (StoryModel) obj9;
                                                        Date assetsExpiryTime3 = ((StoriesResponse) ((qbm) a9mVar2).a).getAssetsExpiryTime();
                                                        if (assetsExpiryTime3 == null) {
                                                            assetsExpiryTime3 = new Date();
                                                        }
                                                        storyModel.getClass();
                                                        storyModel.d = assetsExpiryTime3;
                                                        storyModel.r = new Integer(i2);
                                                        arrayList.add(storyModel);
                                                        i2 = i3;
                                                    }
                                                    ArrayList U0 = CollectionsKt.U0(d(arrayList));
                                                    if (z3) {
                                                        k(U0, blazeDataSourceType2);
                                                    }
                                                    StoryModel storyModel2 = (StoryModel) CollectionsKt.firstOrNull(U0);
                                                    if (storyModel2 != null) {
                                                        storyModel2.n = z4;
                                                    }
                                                    StoryModel storyModel3 = (StoryModel) CollectionsKt.j0(U0);
                                                    if (storyModel3 != null) {
                                                        storyModel3.o = z4;
                                                    }
                                                    yvlVar2.r = blazeDataSourceType2;
                                                    yvlVar2.s = str12;
                                                    yvlVar2.t = str5;
                                                    yvlVar2.u = U0;
                                                    yvlVar2.v = r7;
                                                    yvlVar2.z = 6;
                                                    Unit f2 = f(str15, U0);
                                                    collection = U0;
                                                    break;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    str16 = rq3Var;
                                                    r2 = str3;
                                                    str17 = r2;
                                                    gzk gzkVar222 = gzk.a;
                                                    gzk.f(str16, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.STORIES, 0, str17, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
                                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, r7);
                                                    return new bx0(null, null, null, 7, null);
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                                str17 = str6;
                                                r7 = obj3;
                                                gzk gzkVar2222 = gzk.a;
                                                gzk.f(str16, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.STORIES, 0, str17, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
                                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, r7);
                                                return new bx0(null, null, null, 7, null);
                                            }
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        r7 = obj3;
                                        gzk gzkVar22222 = gzk.a;
                                        gzk.f(str16, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.STORIES, 0, str17, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
                                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, r7);
                                        return new bx0(null, null, null, 7, null);
                                    }
                                }
                                return lu3Var;
                            } catch (Throwable th13) {
                                th = th13;
                                blazeDataSourceType2 = blazeDataSourceType;
                                str16 = str2;
                                str17 = str3;
                                r7 = 0;
                                gzk gzkVar222222 = gzk.a;
                                gzk.f(str16, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.STORIES, 0, str17, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, r7);
                                return new bx0(null, null, null, 7, null);
                            }
                        case 1:
                            boolean z6 = yvlVar2.w;
                            String str19 = yvlVar2.v;
                            String str20 = (String) yvlVar2.u;
                            String str21 = yvlVar2.t;
                            BlazeDataSourceType blazeDataSourceType9 = (BlazeDataSourceType) yvlVar2.s;
                            storiesRepositoryImpl = (StoriesRepositoryImpl) yvlVar2.r;
                            y6a.M(obj7);
                            str16 = str20;
                            blazeDataSourceType2 = blazeDataSourceType9;
                            str15 = str21;
                            lu3Var = lu3Var2;
                            z4 = true;
                            z3 = z6;
                            str6 = str19;
                            obj3 = null;
                            a9mVar = (a9m) obj7;
                            r7 = obj3;
                            str5 = str6;
                            blazeDataSourceType2 = blazeDataSourceType2;
                            str12 = str16;
                            a9mVar2 = a9mVar;
                            if (!(a9mVar2 instanceof a6m)) {
                            }
                            break;
                        case 2:
                            z5 = yvlVar2.w;
                            str5 = yvlVar2.v;
                            String str22 = (String) yvlVar2.u;
                            String str23 = yvlVar2.t;
                            BlazeDataSourceType blazeDataSourceType10 = (BlazeDataSourceType) yvlVar2.s;
                            storiesRepositoryImpl = (StoriesRepositoryImpl) yvlVar2.r;
                            y6a.M(obj7);
                            str9 = str22;
                            blazeDataSourceType4 = blazeDataSourceType10;
                            str15 = str23;
                            lu3Var = lu3Var2;
                            z4 = true;
                            obj2 = null;
                            a9mVar = (a9m) obj7;
                            blazeDataSourceType7 = blazeDataSourceType4;
                            str13 = str9;
                            obj5 = obj2;
                            z3 = z5;
                            blazeDataSourceType2 = blazeDataSourceType7;
                            str12 = str13;
                            r7 = obj5;
                            a9mVar2 = a9mVar;
                            if (!(a9mVar2 instanceof a6m)) {
                            }
                            break;
                        case 3:
                            z5 = yvlVar2.w;
                            str5 = yvlVar2.v;
                            String str24 = (String) yvlVar2.u;
                            String str25 = yvlVar2.t;
                            BlazeDataSourceType blazeDataSourceType11 = (BlazeDataSourceType) yvlVar2.s;
                            storiesRepositoryImpl = (StoriesRepositoryImpl) yvlVar2.r;
                            y6a.M(obj7);
                            str10 = str24;
                            blazeDataSourceType5 = blazeDataSourceType11;
                            str15 = str25;
                            lu3Var = lu3Var2;
                            z4 = true;
                            obj = null;
                            a9mVar = (a9m) obj7;
                            blazeDataSourceType7 = blazeDataSourceType5;
                            str13 = str10;
                            obj5 = obj;
                            z3 = z5;
                            blazeDataSourceType2 = blazeDataSourceType7;
                            str12 = str13;
                            r7 = obj5;
                            a9mVar2 = a9mVar;
                            if (!(a9mVar2 instanceof a6m)) {
                            }
                            break;
                        case 4:
                            z5 = yvlVar2.w;
                            str5 = yvlVar2.v;
                            String str26 = (String) yvlVar2.u;
                            String str27 = yvlVar2.t;
                            BlazeDataSourceType blazeDataSourceType12 = (BlazeDataSourceType) yvlVar2.s;
                            storiesRepositoryImpl = (StoriesRepositoryImpl) yvlVar2.r;
                            y6a.M(obj7);
                            str11 = str26;
                            blazeDataSourceType6 = blazeDataSourceType12;
                            str15 = str27;
                            lu3Var = lu3Var2;
                            z4 = true;
                            obj4 = null;
                            a9mVar = (a9m) obj7;
                            blazeDataSourceType7 = blazeDataSourceType6;
                            str13 = str11;
                            obj5 = obj4;
                            z3 = z5;
                            blazeDataSourceType2 = blazeDataSourceType7;
                            str12 = str13;
                            r7 = obj5;
                            a9mVar2 = a9mVar;
                            if (!(a9mVar2 instanceof a6m)) {
                            }
                            break;
                        case 5:
                            z5 = yvlVar2.w;
                            str5 = yvlVar2.v;
                            String str28 = (String) yvlVar2.u;
                            String str29 = yvlVar2.t;
                            BlazeDataSourceType blazeDataSourceType13 = (BlazeDataSourceType) yvlVar2.s;
                            storiesRepositoryImpl = (StoriesRepositoryImpl) yvlVar2.r;
                            y6a.M(obj7);
                            str14 = str28;
                            blazeDataSourceType8 = blazeDataSourceType13;
                            str15 = str29;
                            lu3Var = lu3Var2;
                            z4 = true;
                            obj6 = null;
                            a9mVar = (a9m) obj7;
                            blazeDataSourceType7 = blazeDataSourceType8;
                            str13 = str14;
                            obj5 = obj6;
                            z3 = z5;
                            blazeDataSourceType2 = blazeDataSourceType7;
                            str12 = str13;
                            r7 = obj5;
                            a9mVar2 = a9mVar;
                            if (!(a9mVar2 instanceof a6m)) {
                            }
                            break;
                        case 6:
                            Collection collection2 = (List) yvlVar2.u;
                            String str30 = yvlVar2.t;
                            String str31 = (String) yvlVar2.s;
                            BlazeDataSourceType blazeDataSourceType14 = (BlazeDataSourceType) yvlVar2.r;
                            try {
                                y6a.M(obj7);
                                collection = collection2;
                                return new qbm(collection);
                            } catch (Throwable th14) {
                                th = th14;
                                str17 = str30;
                                str16 = str31;
                                blazeDataSourceType2 = blazeDataSourceType14;
                                r7 = 0;
                                gzk gzkVar2222222 = gzk.a;
                                gzk.f(str16, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.STORIES, 0, str17, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, r7);
                                return new bx0(null, null, null, 7, null);
                            }
                        default:
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
            } catch (Throwable th15) {
                th = th15;
                str16 = blazeDataSourceType2;
                blazeDataSourceType2 = str16;
                str17 = r2;
            }
        } catch (Throwable th16) {
            th = th16;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        fcm fcmVar;
        int i2;
        Iterator it;
        if (sq3Var instanceof fcm) {
            fcmVar = (fcm) sq3Var;
            int i3 = fcmVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fcmVar.u = i3 - Integer.MIN_VALUE;
                fcm fcmVar2 = fcmVar;
                Object obj = fcmVar2.s;
                lu3 lu3Var = lu3.a;
                i2 = fcmVar2.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    it = k.entrySet().iterator();
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = fcmVar2.r;
                    y6a.M(obj);
                }
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    BlazeDataSourceType blazeDataSourceType = ((tvl) entry.getValue()).a;
                    String str = (String) entry.getKey();
                    boolean z = ((tvl) entry.getValue()).b;
                    String str2 = ((tvl) entry.getValue()).c;
                    String str3 = ((tvl) entry.getValue()).d;
                    String str4 = ((tvl) entry.getValue()).e;
                    fcmVar2.r = it;
                    fcmVar2.u = 1;
                    if (yrl.fetchStories$default(a, blazeDataSourceType, str, null, str2, z, false, str3, str4, fcmVar2, 36, null) == lu3Var) {
                        return lu3Var;
                    }
                }
                return Unit.a;
            }
        }
        fcmVar = new fcm(this, sq3Var);
        fcm fcmVar22 = fcmVar;
        Object obj2 = fcmVar22.s;
        lu3 lu3Var2 = lu3.a;
        i2 = fcmVar22.u;
        if (i2 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(8:11|12|13|14|15|(2:17|(2:19|20)(7:22|23|(1:28)|13|14|15|(0)))|30|31)(2:33|34))(10:35|36|23|(1:25)(2:26|28)|13|14|15|(0)|30|31))(6:37|38|15|(0)|30|31)))|41|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        if (defpackage.vym.a(r5, r6) != r12) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0031, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r10, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002b, B:14:0x009e, B:15:0x0049, B:17:0x004f, B:23:0x0075, B:26:0x007a, B:28:0x0084, B:36:0x003e, B:38:0x0045), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0082 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009b -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, sq3 sq3Var) {
        xmm xmmVar;
        int i2;
        Iterator it;
        InteractionStatus interactionStatus;
        Iterator it2;
        Long l;
        if (sq3Var instanceof xmm) {
            xmmVar = (xmm) sq3Var;
            int i3 = xmmVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xmmVar.v = i3 - Integer.MIN_VALUE;
                Object obj = xmmVar.t;
                lu3 lu3Var = lu3.a;
                i2 = xmmVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                    return Unit.a;
                }
                if (i2 == 1) {
                    interactionStatus = xmmVar.s;
                    it2 = xmmVar.r;
                    y6a.M(obj);
                    l = (Long) obj;
                    if (l != null) {
                        vym vymVar = vym.a;
                        String interactionId = interactionStatus.getInteractionId();
                        String interactionValue = interactionStatus.getInteractionValue();
                        xmmVar.r = it2;
                        xmmVar.s = interactionStatus;
                        xmmVar.v = 2;
                        vymVar.getClass();
                    }
                    it = it2;
                    n(interactionStatus.getInteractionId(), interactionStatus.getInteractionValue());
                    if (it.hasNext()) {
                    }
                    return Unit.a;
                }
                if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interactionStatus = xmmVar.s;
                it2 = xmmVar.r;
                y6a.M(obj);
                it = it2;
                n(interactionStatus.getInteractionId(), interactionStatus.getInteractionValue());
                if (it.hasNext()) {
                    UserActivityInteraction userActivityInteraction = (UserActivityInteraction) it.next();
                    InteractionStatus interactionStatus2 = new InteractionStatus(userActivityInteraction.getInteractionId(), userActivityInteraction.getResponseId());
                    vym vymVar2 = vym.a;
                    xmmVar.r = it;
                    xmmVar.s = interactionStatus2;
                    xmmVar.v = 1;
                    Object b2 = vymVar2.b(interactionStatus2, xmmVar);
                    if (b2 == lu3Var) {
                        return lu3Var;
                    }
                    it2 = it;
                    obj = b2;
                    interactionStatus = interactionStatus2;
                    l = (Long) obj;
                    if (l != null && l.longValue() == -1) {
                        vym vymVar3 = vym.a;
                        String interactionId2 = interactionStatus.getInteractionId();
                        String interactionValue2 = interactionStatus.getInteractionValue();
                        xmmVar.r = it2;
                        xmmVar.s = interactionStatus;
                        xmmVar.v = 2;
                        vymVar3.getClass();
                    }
                    it = it2;
                    n(interactionStatus.getInteractionId(), interactionStatus.getInteractionValue());
                    if (it.hasNext()) {
                    }
                }
                return Unit.a;
            }
        }
        xmmVar = new xmm(this, sq3Var);
        Object obj2 = xmmVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = xmmVar.v;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(List list, sq3 sq3Var) {
        kom komVar;
        int i2;
        Iterator it;
        if (sq3Var instanceof kom) {
            komVar = (kom) sq3Var;
            int i3 = komVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                komVar.u = i3 - Integer.MIN_VALUE;
                Object obj = komVar.s;
                lu3 lu3Var = lu3.a;
                i2 = komVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    it = list.iterator();
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = komVar.r;
                    y6a.M(obj);
                }
                while (it.hasNext()) {
                    String str = (String) it.next();
                    komVar.r = it;
                    komVar.u = 1;
                    a.getClass();
                    if (e(null, str, true, null, null) == lu3Var) {
                        return lu3Var;
                    }
                }
                return Unit.a;
            }
        }
        komVar = new kom(this, sq3Var);
        Object obj2 = komVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = komVar.u;
        if (i2 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }
}
