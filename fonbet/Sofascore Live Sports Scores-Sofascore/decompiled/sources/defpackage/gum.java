package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.a;
import com.blaze.blazesdk.database.BlazeDatabase;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.moments.models.dto.MomentsDto;
import com.blaze.blazesdk.features.moments.models.local.MomentLikedStatus;
import com.blaze.blazesdk.features.moments.models.local.MomentViewed;
import com.blaze.blazesdk.features.moments.models.responses.MomentsResponse;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.features.moments.repos.MomentsRecommendationStrategy;
import com.blaze.blazesdk.features.shared.repos.RecommendationsFetcher;
import com.blaze.blazesdk.interactions.models.local.InteractionStatus;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.ErrorReason;
import com.blaze.blazesdk.shared.results.q0;
import com.blaze.blazesdk.shared.results.s0;
import com.blaze.blazesdk.user_activity.models.responses.UserActivityInteraction;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gum extends atl implements jrl {
    public static final gum b = new gum();
    public static final HashMap c = new HashMap();
    public static final aeh d;
    public static final hof e;
    public static final aeh f;
    public static final hof g;
    public static final fdi h;
    public static final fdi i;
    public static final HashMap j;
    public static final fdi k;
    public static final fdi l;
    public static final mqi m;

    static {
        a62 a62Var = a62.b;
        aeh b2 = beh.b(0, TTAdConstant.STYLE_SIZE_RADIO_3_2, a62Var, 1);
        d = b2;
        e = un0.t(b2);
        aeh b3 = beh.b(0, TTAdConstant.STYLE_SIZE_RADIO_3_2, a62Var, 1);
        f = b3;
        g = un0.t(b3);
        fdi a = gdi.a(new HashMap());
        h = a;
        i = a;
        j = new HashMap();
        fdi a2 = gdi.a(new HashMap());
        k = a2;
        l = a2;
        m = ypa.b(new xqm(1));
    }

    public static Object d(BlazeDataSourceType blazeDataSourceType, String str, Map map, sq3 sq3Var) {
        if (blazeDataSourceType instanceof BlazeDataSourceType.Labels) {
            BlazeDataSourceType.Labels labels = (BlazeDataSourceType.Labels) blazeDataSourceType;
            LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
            if (str != null) {
                linkedHashMap.put("forcedFirstContentId", str);
            }
            return rwl.safeApiCall$default(rwl.a, false, new lvl(labels, linkedHashMap, null), sq3Var, 1, null);
        }
        if (blazeDataSourceType instanceof BlazeDataSourceType.Ids) {
            BlazeDataSourceType.Ids ids = (BlazeDataSourceType.Ids) blazeDataSourceType;
            LinkedHashMap linkedHashMap2 = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
            if (str != null) {
                linkedHashMap2.put("forcedFirstContentId", str);
            }
            return rwl.safeApiCall$default(rwl.a, false, new mzl(ids, linkedHashMap2, null), sq3Var, 1, null);
        }
        if (blazeDataSourceType instanceof BlazeDataSourceType.Search) {
            BlazeDataSourceType.Search search = (BlazeDataSourceType.Search) blazeDataSourceType;
            LinkedHashMap linkedHashMap3 = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
            if (str != null) {
                linkedHashMap3.put("forcedFirstContentId", str);
            }
            return rwl.safeApiCall$default(rwl.a, false, new i3m(search, linkedHashMap3, null), sq3Var, 1, null);
        }
        if (blazeDataSourceType instanceof BlazeDataSourceType.Recommendations) {
            return RecommendationsFetcher.INSTANCE.execute((BlazeDataSourceType.Recommendations) blazeDataSourceType, (MomentsRecommendationStrategy) m.getValue(), sq3Var);
        }
        if (blazeDataSourceType instanceof BlazeDataSourceType.RemoteConfig) {
            throw f1m.a;
        }
        if (blazeDataSourceType instanceof BlazeDataSourceType.a) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(f1m.a, null);
            return ua4.e;
        }
        zzl.b();
        return null;
    }

    public static Unit g(String str, boolean z, Integer num, String str2) {
        i9m momentsViewedDao;
        Object obj;
        MomentViewed momentViewed = new MomentViewed(str, z);
        try {
            Set<Map.Entry> entrySet = c.entrySet();
            entrySet.getClass();
            for (Map.Entry entry : entrySet) {
                Object value = entry.getValue();
                value.getClass();
                Iterator it = ((Iterable) value).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.c(((MomentModel) obj).id, str)) {
                        break;
                    }
                }
                MomentModel momentModel = (MomentModel) obj;
                if (momentModel != null) {
                    momentModel.k = true;
                }
                d.b(entry.getKey());
                aeh aehVar = f;
                Object key = entry.getKey();
                key.getClass();
                aehVar.b(key);
                if (Intrinsics.c(entry.getKey(), str2)) {
                    fdi fdiVar = k;
                    HashMap f2 = tub.f(new Pair(str2, num));
                    fdiVar.getClass();
                    fdiVar.m(null, f2);
                }
            }
            BlazeDatabase instance = BlazeDatabase.INSTANCE.instance();
            if (instance != null && (momentsViewedDao = instance.getMomentsViewedDao()) != null) {
                o02.L(momentsViewedDao.a(momentViewed));
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        return Unit.a;
    }

    public static void j(String str, String str2) {
        Set<Map.Entry> entrySet = c.entrySet();
        entrySet.getClass();
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            value.getClass();
            for (MomentModel momentModel : (Iterable) value) {
                InteractionModel interactionModel = momentModel.n;
                if (Intrinsics.c(interactionModel != null ? interactionModel.getId() : null, str)) {
                    momentModel.n.setUserAnswer(str2);
                    d.b(entry.getKey());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(String str, String str2, boolean z, boolean z2) {
        Object key;
        Integer num;
        Object obj;
        Object obj2;
        HashMap hashMap = c;
        if (str == null || StringsKt.R(str)) {
            Set<Map.Entry> entrySet = hashMap.entrySet();
            entrySet.getClass();
            loop3: for (Map.Entry entry : entrySet) {
                Object value = entry.getValue();
                value.getClass();
                Iterator it = ((Iterable) value).iterator();
                while (it.hasNext()) {
                    if (Intrinsics.c(((MomentModel) it.next()).id, str2)) {
                        key = entry.getKey();
                        break loop3;
                    }
                }
            }
        }
        key = str;
        List list = (List) hashMap.get(key);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (Intrinsics.c(((MomentModel) obj2).id, str2)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            MomentModel momentModel = (MomentModel) obj2;
            if (momentModel != null) {
                num = Integer.valueOf(momentModel.v);
                Set<Map.Entry> entrySet2 = hashMap.entrySet();
                entrySet2.getClass();
                for (Map.Entry entry2 : entrySet2) {
                    if (!z2 || !Intrinsics.c(entry2.getKey(), str)) {
                        Object value2 = entry2.getValue();
                        value2.getClass();
                        Iterator it3 = ((Iterable) value2).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj = it3.next();
                                if (Intrinsics.c(((MomentModel) obj).id, str2)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        MomentModel momentModel2 = (MomentModel) obj;
                        if (momentModel2 != null) {
                            momentModel2.u = z;
                            momentModel2.v = num != null ? num.intValue() : momentModel2.v;
                            d.b(entry2.getKey());
                        }
                    }
                }
            }
        }
        num = null;
        Set<Map.Entry> entrySet22 = hashMap.entrySet();
        entrySet22.getClass();
        while (r0.hasNext()) {
        }
    }

    public static void l(String str, ArrayList arrayList, boolean z) {
        HashMap hashMap = c;
        try {
            if (z) {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    hashMap.put(str, obj);
                }
                ((List) obj).addAll(new ArrayList(arrayList));
            } else {
                hashMap.put(str, new ArrayList(arrayList));
            }
            d.b(str);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static void m(String str, Date date) {
        try {
            xw3.L(evl.coroutineContextOnIO$default(BlazeSDK.INSTANCE, null, 1, null), null, null, new znm((long) ((date.getTime() - new Date().getTime()) * 0.8d), str, null), 3);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static void n(ArrayList arrayList) {
        i9m momentsViewedDao;
        try {
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((MomentModel) it.next()).id);
            }
            BlazeDatabase instance = BlazeDatabase.INSTANCE.instance();
            ArrayList c2 = (instance == null || (momentsViewedDao = instance.getMomentsViewedDao()) == null) ? null : momentsViewedDao.c(arrayList2);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                MomentModel momentModel = (MomentModel) it2.next();
                momentModel.k = c2 != null ? c2.contains(momentModel.id) : false;
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static h9m o(String str) {
        str.getClass();
        try {
            return (h9m) j.get(str);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return null;
        }
    }

    public static List q(String str) {
        str.getClass();
        try {
            List list = (List) c.get(str);
            return list != null ? new ArrayList(list) : km5.a;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return km5.a;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|8|(1:(2:11|12)(2:26|27))(2:28|29)|13|(3:16|(2:19|20)(1:18)|14)|22|23|24))|32|6|7|8|(0)(0)|13|(1:14)|22|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r0, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:14:0x0048, B:16:0x004e, B:29:0x003d), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        qkm qkmVar;
        int i2;
        Iterator it;
        Iterator it2;
        if (sq3Var instanceof qkm) {
            qkmVar = (qkm) sq3Var;
            int i3 = qkmVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qkmVar.u = i3 - Integer.MIN_VALUE;
                qkm qkmVar2 = qkmVar;
                Object obj = qkmVar2.s;
                lu3 lu3Var = lu3.a;
                i2 = qkmVar2.u;
                int i4 = 1;
                if (i2 != 0) {
                    y6a.M(obj);
                    it = j.entrySet().iterator();
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = qkmVar2.r;
                    y6a.M(obj);
                }
                it2 = it;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    BlazeDataSourceType blazeDataSourceType = ((h9m) entry.getValue()).a;
                    boolean z = ((h9m) entry.getValue()).b;
                    String str = (String) entry.getKey();
                    String str2 = ((h9m) entry.getValue()).c;
                    String str3 = ((h9m) entry.getValue()).d;
                    gum gumVar = b;
                    qkmVar2.r = it2;
                    qkmVar2.u = i4;
                    int i5 = i4;
                    if (jrl.getMomentsAndSaveToCache$default(gumVar, blazeDataSourceType, str, str2, false, z, str3, null, null, false, qkmVar2, 456, null) == lu3Var) {
                        return lu3Var;
                    }
                    i4 = i5;
                }
                return Unit.a;
            }
        }
        qkmVar = new qkm(this, sq3Var);
        qkm qkmVar22 = qkmVar;
        Object obj2 = qkmVar22.s;
        lu3 lu3Var2 = lu3.a;
        i2 = qkmVar22.u;
        int i42 = 1;
        if (i2 != 0) {
        }
        it2 = it;
        while (it2.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[Catch: all -> 0x0034, CancellationException -> 0x0151, TryCatch #3 {CancellationException -> 0x0151, all -> 0x0034, blocks: (B:11:0x0030, B:12:0x0058, B:16:0x005f, B:18:0x0063, B:20:0x007b, B:23:0x0096, B:26:0x008d, B:27:0x0099, B:28:0x00c3, B:30:0x00c9, B:32:0x00d1, B:34:0x00ec, B:35:0x00ef, B:37:0x00f0, B:38:0x00f9, B:40:0x00ff, B:42:0x0109, B:44:0x0111, B:46:0x0117, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:54:0x0043), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(BlazeDataSourceType blazeDataSourceType, String str, String str2, boolean z, String str3, String str4, Map map, rq3 rq3Var) {
        l9m l9mVar;
        int i2;
        a9m a9mVar;
        try {
            if (rq3Var instanceof l9m) {
                l9mVar = (l9m) rq3Var;
                int i3 = l9mVar.z;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    l9mVar.z = i3 - Integer.MIN_VALUE;
                    Object obj = l9mVar.x;
                    lu3 lu3Var = lu3.a;
                    i2 = l9mVar.z;
                    if (i2 != 0) {
                        y6a.M(obj);
                        l9mVar.r = this;
                        l9mVar.s = blazeDataSourceType;
                        l9mVar.t = str;
                        l9mVar.u = str2;
                        l9mVar.v = str3;
                        l9mVar.w = z;
                        l9mVar.z = 1;
                        obj = d(blazeDataSourceType, str4, map, l9mVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = l9mVar.w;
                        String str5 = l9mVar.v;
                        String str6 = l9mVar.u;
                        str = l9mVar.t;
                        BlazeDataSourceType blazeDataSourceType2 = l9mVar.s;
                        this = l9mVar.r;
                        y6a.M(obj);
                    }
                    a9mVar = (a9m) obj;
                    if (!(a9mVar instanceof a6m)) {
                        return a9mVar;
                    }
                    if (!(a9mVar instanceof qbm)) {
                        throw new ndd();
                    }
                    List<MomentsDto> result = ((MomentsResponse) ((qbm) a9mVar).a).getResult();
                    Date assetsExpiryTime = ((MomentsResponse) ((qbm) a9mVar).a).getAssetsExpiryTime();
                    if (assetsExpiryTime != null) {
                        b.getClass();
                        try {
                            ((Map) h.getValue()).put(str, assetsExpiryTime);
                        } catch (Throwable th) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        }
                        m(str, assetsExpiryTime);
                    }
                    List a = erl.a(result, ((MomentsResponse) ((qbm) a9mVar).a).getDefaultAdsInfo(), ((MomentsResponse) ((qbm) a9mVar).a).getAttributionToken());
                    ArrayList arrayList = new ArrayList(k13.r(a, 10));
                    int i4 = 0;
                    for (Object obj2 : a) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            b.q();
                            throw null;
                        }
                        MomentModel momentModel = (MomentModel) obj2;
                        momentModel.h = ((MomentsResponse) ((qbm) a9mVar).a).getAssetsExpiryTime();
                        momentModel.m = new Integer(i4);
                        arrayList.add(momentModel);
                        i4 = i5;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((MomentModel) it.next());
                    }
                    this.getClass();
                    n(arrayList2);
                    if (z && arrayList2.size() > 1) {
                        n13.u(new o6m(), arrayList2);
                    }
                    return new qbm(arrayList2);
                }
            }
            if (i2 != 0) {
            }
            a9mVar = (a9m) obj;
            if (!(a9mVar instanceof a6m)) {
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            gzk gzkVar = gzk.a;
            gzk.f(str2, blazeDataSourceType.getStringRepresentation$blazesdk_release(), BlazePlayerType.MOMENTS, 0, str3, ErrorReason.FAILED_FETCHING_CONTENT, th2.getMessage());
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
            return new bx0(null, null, null, 7, null);
        }
        l9mVar = new l9m(this, rq3Var);
        Object obj3 = l9mVar.x;
        lu3 lu3Var2 = lu3.a;
        i2 = l9mVar.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e4 A[Catch: all -> 0x0046, CancellationException -> 0x0260, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0260, blocks: (B:13:0x0040, B:15:0x00dd, B:17:0x00e4, B:20:0x0107, B:28:0x0113, B:30:0x0117, B:32:0x0125, B:34:0x012d, B:35:0x0131, B:38:0x0153, B:39:0x0156, B:41:0x0163, B:44:0x017e, B:47:0x0175, B:48:0x0181, B:49:0x01aa, B:51:0x01b0, B:53:0x01b8, B:55:0x01d3, B:56:0x01d6, B:58:0x01d7, B:59:0x01e0, B:61:0x01e6, B:63:0x01f0, B:65:0x01f8, B:67:0x01fe, B:68:0x0206, B:75:0x0215, B:76:0x021a, B:82:0x0052, B:85:0x006c, B:87:0x006f, B:91:0x0079, B:97:0x00b9, B:104:0x009a), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0113 A[Catch: all -> 0x0046, CancellationException -> 0x0260, TRY_ENTER, TryCatch #1 {CancellationException -> 0x0260, blocks: (B:13:0x0040, B:15:0x00dd, B:17:0x00e4, B:20:0x0107, B:28:0x0113, B:30:0x0117, B:32:0x0125, B:34:0x012d, B:35:0x0131, B:38:0x0153, B:39:0x0156, B:41:0x0163, B:44:0x017e, B:47:0x0175, B:48:0x0181, B:49:0x01aa, B:51:0x01b0, B:53:0x01b8, B:55:0x01d3, B:56:0x01d6, B:58:0x01d7, B:59:0x01e0, B:61:0x01e6, B:63:0x01f0, B:65:0x01f8, B:67:0x01fe, B:68:0x0206, B:75:0x0215, B:76:0x021a, B:82:0x0052, B:85:0x006c, B:87:0x006f, B:91:0x0079, B:97:0x00b9, B:104:0x009a), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(BlazeDataSourceType blazeDataSourceType, String str, String str2, boolean z, boolean z2, String str3, String str4, Map map, boolean z3, rq3 rq3Var) {
        jfm jfmVar;
        int i2;
        BlazeDataSourceType blazeDataSourceType2;
        BlazeDataSourceType blazeDataSourceType3;
        String str5;
        String str6;
        gum gumVar;
        boolean z4;
        String str7;
        a9m a9mVar;
        String str8 = str2;
        String str9 = str3;
        boolean z5 = z3;
        try {
            if (rq3Var instanceof jfm) {
                jfmVar = (jfm) rq3Var;
                int i3 = jfmVar.A;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    jfmVar.A = i3 - Integer.MIN_VALUE;
                    jfm jfmVar2 = jfmVar;
                    Object obj = jfmVar2.y;
                    lu3 lu3Var = lu3.a;
                    i2 = jfmVar2.A;
                    if (i2 != 0) {
                        y6a.M(obj);
                        try {
                            gzk gzkVar = gzk.a;
                            gzk.g(str8, blazeDataSourceType.getStringRepresentation$blazesdk_release(), BlazePlayerType.MOMENTS, str9);
                            str.getClass();
                            blazeDataSourceType2 = blazeDataSourceType;
                            try {
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                boolean c2 = Intrinsics.c(o(str), new h9m(blazeDataSourceType2, z2, str8, str9, str4));
                                if (z5 || z || c2) {
                                    blazeDataSourceType2 = blazeDataSourceType;
                                    str8 = str2;
                                    str9 = str3;
                                } else {
                                    i(str);
                                    try {
                                        blazeDataSourceType2 = blazeDataSourceType;
                                        str8 = str2;
                                        str9 = str3;
                                        try {
                                            j.put(str, new h9m(blazeDataSourceType2, z2, str8, str9, str4));
                                        } catch (Throwable th2) {
                                            th = th2;
                                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                            jfmVar2.r = this;
                                            jfmVar2.s = blazeDataSourceType2;
                                            jfmVar2.t = str;
                                            jfmVar2.u = str8;
                                            jfmVar2.v = str9;
                                            jfmVar2.w = z2;
                                            jfmVar2.x = z5;
                                            jfmVar2.A = 1;
                                            obj = d(blazeDataSourceType2, str4, map, jfmVar2);
                                            if (obj != lu3Var) {
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        blazeDataSourceType2 = blazeDataSourceType;
                                        str8 = str2;
                                        str9 = str3;
                                    }
                                }
                                jfmVar2.r = this;
                                jfmVar2.s = blazeDataSourceType2;
                                jfmVar2.t = str;
                                jfmVar2.u = str8;
                                jfmVar2.v = str9;
                                jfmVar2.w = z2;
                                jfmVar2.x = z5;
                                jfmVar2.A = 1;
                                obj = d(blazeDataSourceType2, str4, map, jfmVar2);
                                if (obj != lu3Var) {
                                    return lu3Var;
                                }
                                String str10 = str9;
                                blazeDataSourceType3 = blazeDataSourceType2;
                                str5 = str10;
                                gumVar = this;
                                z4 = z2;
                                str6 = str8;
                                str7 = str;
                            } catch (Throwable th4) {
                                th = th4;
                                blazeDataSourceType2 = blazeDataSourceType;
                                str8 = str2;
                                str9 = str3;
                                String str11 = str9;
                                blazeDataSourceType3 = blazeDataSourceType2;
                                str5 = str11;
                                str6 = str8;
                                gzk gzkVar2 = gzk.a;
                                gzk.f(str6, blazeDataSourceType3.getStringRepresentation$blazesdk_release(), BlazePlayerType.MOMENTS, 0, str5, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                return new bx0(null, null, null, 7, null);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            blazeDataSourceType2 = blazeDataSourceType;
                        }
                    } else {
                        if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z6 = jfmVar2.x;
                        z4 = jfmVar2.w;
                        str5 = jfmVar2.v;
                        str6 = jfmVar2.u;
                        str7 = jfmVar2.t;
                        blazeDataSourceType3 = jfmVar2.s;
                        gumVar = jfmVar2.r;
                        try {
                            y6a.M(obj);
                            z5 = z6;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                    a9mVar = (a9m) obj;
                    if (!(a9mVar instanceof a6m)) {
                        evl.m(gumVar);
                        gzk gzkVar3 = gzk.a;
                        String str12 = str5;
                        String str13 = str6;
                        try {
                            gzk.f(str13, blazeDataSourceType3.getStringRepresentation$blazesdk_release(), BlazePlayerType.MOMENTS, 0, str12, ErrorReason.FAILED_FETCHING_CONTENT, ((a6m) a9mVar).b());
                            return a9mVar;
                        } catch (Throwable th7) {
                            th = th7;
                            str6 = str13;
                            str5 = str12;
                        }
                    } else {
                        if (!(a9mVar instanceof qbm)) {
                            throw new ndd();
                        }
                        List<MomentsDto> result = ((MomentsResponse) ((qbm) a9mVar).a).getResult();
                        int i4 = 0;
                        int size = result != null ? result.size() : 0;
                        String str14 = str5;
                        String str15 = str6;
                        try {
                            gzk.globalBroadcastDataLoadCompleted$default(gzk.a, str15, blazeDataSourceType3.getStringRepresentation$blazesdk_release(), BlazePlayerType.MOMENTS, size, str14, size == 0 ? ErrorReason.NO_AVAILABLE_CONTENT_FOR_DATA_SOURCE : null, null, 64, null);
                            Date assetsExpiryTime = ((MomentsResponse) ((qbm) a9mVar).a).getAssetsExpiryTime();
                            if (assetsExpiryTime != null) {
                                b.getClass();
                                try {
                                    ((Map) h.getValue()).put(str7, assetsExpiryTime);
                                } catch (Throwable th8) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th8, null);
                                }
                                m(str7, assetsExpiryTime);
                            }
                            List a = erl.a(result, ((MomentsResponse) ((qbm) a9mVar).a).getDefaultAdsInfo(), ((MomentsResponse) ((qbm) a9mVar).a).getAttributionToken());
                            ArrayList arrayList = new ArrayList(k13.r(a, 10));
                            for (Object obj2 : a) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    b.q();
                                    throw null;
                                }
                                MomentModel momentModel = (MomentModel) obj2;
                                momentModel.h = ((MomentsResponse) ((qbm) a9mVar).a).getAssetsExpiryTime();
                                momentModel.m = new Integer(i4);
                                arrayList.add(momentModel);
                                i4 = i5;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add((MomentModel) it.next());
                            }
                            gumVar.getClass();
                            n(arrayList2);
                            if (z4 && arrayList2.size() > 1) {
                                n13.u(new xbm(), arrayList2);
                            }
                            l(str7, arrayList2, z5);
                            return new qbm(arrayList2);
                        } catch (Throwable th9) {
                            th = th9;
                            str6 = str15;
                            str5 = str14;
                        }
                    }
                    gzk gzkVar22 = gzk.a;
                    gzk.f(str6, blazeDataSourceType3.getStringRepresentation$blazesdk_release(), BlazePlayerType.MOMENTS, 0, str5, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                    return new bx0(null, null, null, 7, null);
                }
            }
            if (i2 != 0) {
            }
            a9mVar = (a9m) obj;
            if (!(a9mVar instanceof a6m)) {
            }
            gzk gzkVar222 = gzk.a;
            gzk.f(str6, blazeDataSourceType3.getStringRepresentation$blazesdk_release(), BlazePlayerType.MOMENTS, 0, str5, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return new bx0(null, null, null, 7, null);
        } catch (CancellationException e2) {
            throw e2;
        }
        jfmVar = new jfm(this, rq3Var);
        jfm jfmVar22 = jfmVar;
        Object obj3 = jfmVar22.y;
        lu3 lu3Var2 = lu3.a;
        i2 = jfmVar22.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:13:0x005a, B:15:0x0060, B:18:0x0064, B:20:0x0068, B:22:0x006e, B:24:0x007b, B:26:0x0081, B:29:0x00af, B:32:0x0092, B:34:0x009c, B:36:0x00a2, B:38:0x00a8, B:42:0x00b7, B:44:0x00e3, B:45:0x00e8, B:49:0x003f), top: B:8:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:13:0x005a, B:15:0x0060, B:18:0x0064, B:20:0x0068, B:22:0x006e, B:24:0x007b, B:26:0x0081, B:29:0x00af, B:32:0x0092, B:34:0x009c, B:36:0x00a2, B:38:0x00a8, B:42:0x00b7, B:44:0x00e3, B:45:0x00e8, B:49:0x003f), top: B:8:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, boolean z, sq3 sq3Var) {
        tqm tqmVar;
        int i2;
        a9m a9mVar;
        BlazeDatabase instance;
        frl momentsLikedDao;
        frl momentsLikedDao2;
        try {
            if (sq3Var instanceof tqm) {
                tqmVar = (tqm) sq3Var;
                int i3 = tqmVar.x;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    tqmVar.x = i3 - Integer.MIN_VALUE;
                    tqm tqmVar2 = tqmVar;
                    Object obj = tqmVar2.v;
                    lu3 lu3Var = lu3.a;
                    i2 = tqmVar2.x;
                    if (i2 != 0) {
                        y6a.M(obj);
                        rwl rwlVar = rwl.a;
                        srm srmVar = new srm(str2, z, null);
                        tqmVar2.r = this;
                        tqmVar2.s = str;
                        tqmVar2.t = str2;
                        tqmVar2.u = z;
                        tqmVar2.x = 1;
                        obj = rwl.safeApiCall$default(rwlVar, false, srmVar, tqmVar2, 1, null);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = tqmVar2.u;
                        str2 = tqmVar2.t;
                        str = tqmVar2.s;
                        this = tqmVar2.r;
                        y6a.M(obj);
                    }
                    a9mVar = (a9m) obj;
                    if (!(a9mVar instanceof a6m)) {
                        evl.m(this);
                        return a9mVar;
                    }
                    if (!(a9mVar instanceof qbm)) {
                        throw new ndd();
                    }
                    this.getClass();
                    k(str, str2, z, true);
                    try {
                        MomentLikedStatus momentLikedStatus = new MomentLikedStatus(str2, z);
                        BlazeDatabase.Companion companion = BlazeDatabase.INSTANCE;
                        BlazeDatabase instance2 = companion.instance();
                        Long l2 = (instance2 == null || (momentsLikedDao2 = instance2.getMomentsLikedDao()) == null) ? null : new Long(momentsLikedDao2.b(momentLikedStatus));
                        if (l2 != null && l2.longValue() == -1 && (instance = companion.instance()) != null && (momentsLikedDao = instance.getMomentsLikedDao()) != null) {
                            o02.K(momentsLikedDao.a(str2, z));
                        }
                        return new qbm(Unit.a);
                    } catch (Exception e2) {
                        s0 s0Var = new s0();
                        s0Var.f = e2;
                        s0Var.g = tub.h(new Pair("entryId", str), new Pair("momentId", str2), new Pair("context", "Failed updating liked Moments in DB while new user is set"));
                        j1m.a(s0Var);
                        return a9mVar;
                    }
                }
            }
            if (i2 != 0) {
            }
            a9mVar = (a9m) obj;
            if (!(a9mVar instanceof a6m)) {
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return new bx0(null, null, null, 7, null);
        }
        tqmVar = new tqm(this, sq3Var);
        tqm tqmVar22 = tqmVar;
        Object obj2 = tqmVar22.v;
        lu3 lu3Var2 = lu3.a;
        i2 = tqmVar22.x;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(8:11|12|13|14|15|(2:17|(2:19|20)(7:22|23|(1:28)|13|14|15|(0)))|30|31)(2:33|34))(10:35|36|23|(1:25)(2:26|28)|13|14|15|(0)|30|31))(6:37|38|15|(0)|30|31)))|41|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        if (defpackage.vym.a(r5, r6) != r12) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0031, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
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
    public final Object f(List list, sq3 sq3Var) {
        ppm ppmVar;
        int i2;
        Iterator it;
        InteractionStatus interactionStatus;
        Iterator it2;
        Long l2;
        if (sq3Var instanceof ppm) {
            ppmVar = (ppm) sq3Var;
            int i3 = ppmVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ppmVar.v = i3 - Integer.MIN_VALUE;
                Object obj = ppmVar.t;
                lu3 lu3Var = lu3.a;
                i2 = ppmVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                    return Unit.a;
                }
                if (i2 == 1) {
                    interactionStatus = ppmVar.s;
                    it2 = ppmVar.r;
                    y6a.M(obj);
                    l2 = (Long) obj;
                    if (l2 != null) {
                        vym vymVar = vym.a;
                        String interactionId = interactionStatus.getInteractionId();
                        String interactionValue = interactionStatus.getInteractionValue();
                        ppmVar.r = it2;
                        ppmVar.s = interactionStatus;
                        ppmVar.v = 2;
                        vymVar.getClass();
                    }
                    it = it2;
                    gum gumVar = b;
                    String interactionId2 = interactionStatus.getInteractionId();
                    String interactionValue2 = interactionStatus.getInteractionValue();
                    gumVar.getClass();
                    j(interactionId2, interactionValue2);
                    if (it.hasNext()) {
                    }
                    return Unit.a;
                }
                if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interactionStatus = ppmVar.s;
                it2 = ppmVar.r;
                y6a.M(obj);
                it = it2;
                gum gumVar2 = b;
                String interactionId22 = interactionStatus.getInteractionId();
                String interactionValue22 = interactionStatus.getInteractionValue();
                gumVar2.getClass();
                j(interactionId22, interactionValue22);
                if (it.hasNext()) {
                    UserActivityInteraction userActivityInteraction = (UserActivityInteraction) it.next();
                    InteractionStatus interactionStatus2 = new InteractionStatus(userActivityInteraction.getInteractionId(), userActivityInteraction.getResponseId());
                    vym vymVar2 = vym.a;
                    ppmVar.r = it;
                    ppmVar.s = interactionStatus2;
                    ppmVar.v = 1;
                    Object b2 = vymVar2.b(interactionStatus2, ppmVar);
                    if (b2 == lu3Var) {
                        return lu3Var;
                    }
                    it2 = it;
                    obj = b2;
                    interactionStatus = interactionStatus2;
                    l2 = (Long) obj;
                    if (l2 != null && l2.longValue() == -1) {
                        vym vymVar3 = vym.a;
                        String interactionId3 = interactionStatus.getInteractionId();
                        String interactionValue3 = interactionStatus.getInteractionValue();
                        ppmVar.r = it2;
                        ppmVar.s = interactionStatus;
                        ppmVar.v = 2;
                        vymVar3.getClass();
                    }
                    it = it2;
                    gum gumVar22 = b;
                    String interactionId222 = interactionStatus.getInteractionId();
                    String interactionValue222 = interactionStatus.getInteractionValue();
                    gumVar22.getClass();
                    j(interactionId222, interactionValue222);
                    if (it.hasNext()) {
                    }
                }
                return Unit.a;
            }
        }
        ppmVar = new ppm(this, sq3Var);
        Object obj2 = ppmVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = ppmVar.v;
        if (i2 != 0) {
        }
    }

    public final void h(BlazeDataSourceType blazeDataSourceType, String str, String str2, String str3, Function1 function1) {
        blazeDataSourceType.getClass();
        if (a.b(blazeDataSourceType)) {
            try {
                evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new lhm(blazeDataSourceType, str, str2, str3, function1, null), 1, null);
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
        evl.l(q0Var.d(), function1);
    }

    public final void i(String str) {
        str.getClass();
        try {
            List list = (List) c.get(str);
            if (list != null) {
                list.clear();
            }
            bmm.b(str);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(List list, sq3 sq3Var) {
        zsm zsmVar;
        int i2;
        Iterator it;
        if (sq3Var instanceof zsm) {
            zsmVar = (zsm) sq3Var;
            int i3 = zsmVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zsmVar.u = i3 - Integer.MIN_VALUE;
                Object obj = zsmVar.s;
                lu3 lu3Var = lu3.a;
                i2 = zsmVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    it = list.iterator();
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = zsmVar.r;
                    y6a.M(obj);
                }
                while (it.hasNext()) {
                    String str = (String) it.next();
                    zsmVar.r = it;
                    zsmVar.u = 1;
                    b.getClass();
                    if (g(str, true, null, null) == lu3Var) {
                        return lu3Var;
                    }
                }
                return Unit.a;
            }
        }
        zsmVar = new zsm(this, sq3Var);
        Object obj2 = zsmVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = zsmVar.u;
        if (i2 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }
}
