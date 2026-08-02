package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.BlazeDirectMediaSource;
import com.blaze.blazesdk.database.BlazeDatabase;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.shared.models.shared_models.BaseLayerDto;
import com.blaze.blazesdk.features.shared.models.shared_models.ContentDto;
import com.blaze.blazesdk.features.shared.models.shared_models.PosterDto;
import com.blaze.blazesdk.features.shared.models.shared_models.RenditionsDto;
import com.blaze.blazesdk.features.shared.models.ui_shared.BaseLayerType;
import com.blaze.blazesdk.features.videos.models.dto.VideoDto;
import com.blaze.blazesdk.features.videos.models.local.VideoLikedStatus;
import com.blaze.blazesdk.features.videos.models.local.VideoViewed;
import com.blaze.blazesdk.features.videos.models.responses.VideosResponse;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.ErrorReason;
import com.blaze.blazesdk.shared.results.q0;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qom extends atl implements fsl {
    public static final qom b = new qom();
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
    }

    public static Object c(BlazeDataSourceType blazeDataSourceType, String str, Map map, w9m w9mVar) {
        if (blazeDataSourceType instanceof BlazeDataSourceType.Labels) {
            BlazeDataSourceType.Labels labels = (BlazeDataSourceType.Labels) blazeDataSourceType;
            LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
            if (str != null) {
                linkedHashMap.put("forcedFirstContentId", str);
            }
            return rwl.safeApiCall$default(rwl.a, false, new dwl(labels, linkedHashMap, null), w9mVar, 1, null);
        }
        if (blazeDataSourceType instanceof BlazeDataSourceType.Ids) {
            BlazeDataSourceType.Ids ids = (BlazeDataSourceType.Ids) blazeDataSourceType;
            LinkedHashMap linkedHashMap2 = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
            if (str != null) {
                linkedHashMap2.put("forcedFirstContentId", str);
            }
            return rwl.safeApiCall$default(rwl.a, false, new f0m(ids, linkedHashMap2, null), w9mVar, 1, null);
        }
        if (blazeDataSourceType instanceof BlazeDataSourceType.Search) {
            BlazeDataSourceType.Search search = (BlazeDataSourceType.Search) blazeDataSourceType;
            LinkedHashMap linkedHashMap3 = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
            if (str != null) {
                linkedHashMap3.put("forcedFirstContentId", str);
            }
            return rwl.safeApiCall$default(rwl.a, false, new x3m(search, linkedHashMap3, null), w9mVar, 1, null);
        }
        if (blazeDataSourceType instanceof BlazeDataSourceType.Recommendations) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(f1m.a, null);
            return a59.e;
        }
        if (blazeDataSourceType instanceof BlazeDataSourceType.RemoteConfig) {
            throw f1m.a;
        }
        if (!(blazeDataSourceType instanceof BlazeDataSourceType.a)) {
            zzl.b();
            return null;
        }
        BlazeDirectMediaSource blazeDirectMediaSource = ((BlazeDataSourceType.a) blazeDataSourceType).a;
        blazeDirectMediaSource.getClass();
        String id = blazeDirectMediaSource.getId();
        String title = blazeDirectMediaSource.getTitle();
        String description = blazeDirectMediaSource.getDescription();
        String previewImageUrl = blazeDirectMediaSource.getPreviewImageUrl();
        return new qbm(new VideosResponse(null, null, null, a.c(new VideoDto(id, title, null, description, null, previewImageUrl != null ? new PosterDto(new RenditionsDto(previewImageUrl, null, null, null, null, null), null, null) : null, null, null, new BaseLayerDto(BaseLayerType.VIDEO, new ContentDto(a.c(new RenditionsDto(blazeDirectMediaSource.getVideoUrl(), null, null, null, null, null)))), null, null, null, null, null, null, null, null, null, null, null))));
    }

    public static Unit e(String str, float f2) {
        BlazeDatabase instance;
        s9m videosViewedDao;
        s9m videosViewedDao2;
        Object obj;
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
                    if (Intrinsics.c(((VideoModel) obj).id, str)) {
                        break;
                    }
                }
                VideoModel videoModel = (VideoModel) obj;
                if (videoModel != null) {
                    videoModel.l = f2;
                }
                d.b(entry.getKey());
            }
            BlazeDatabase.Companion companion = BlazeDatabase.INSTANCE;
            BlazeDatabase instance2 = companion.instance();
            Integer num = (instance2 == null || (videosViewedDao2 = instance2.getVideosViewedDao()) == null) ? null : new Integer(videosViewedDao2.b(str, f2));
            if (num != null && num.intValue() == 0 && (instance = companion.instance()) != null && (videosViewedDao = instance.getVideosViewedDao()) != null) {
                o02.L(videosViewedDao.c(new VideoViewed(str, false, f2, false)));
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(String str, String str2, boolean z) {
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
                    if (Intrinsics.c(((VideoModel) it.next()).id, str2)) {
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
                    if (Intrinsics.c(((VideoModel) obj2).id, str2)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            VideoModel videoModel = (VideoModel) obj2;
            if (videoModel != null) {
                num = Integer.valueOf(videoModel.w);
                Set<Map.Entry> entrySet2 = hashMap.entrySet();
                entrySet2.getClass();
                for (Map.Entry entry2 : entrySet2) {
                    if (!Intrinsics.c(entry2.getKey(), str)) {
                        Object value2 = entry2.getValue();
                        value2.getClass();
                        Iterator it3 = ((Iterable) value2).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj = it3.next();
                                if (Intrinsics.c(((VideoModel) obj).id, str2)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        VideoModel videoModel2 = (VideoModel) obj;
                        if (videoModel2 != null) {
                            videoModel2.v = z;
                            videoModel2.w = num != null ? num.intValue() : videoModel2.w;
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

    public static void i(String str, ArrayList arrayList) {
        try {
            c.put(str, new ArrayList(arrayList));
            d.b(str);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static void j(String str, Date date) {
        try {
            xw3.L(evl.coroutineContextOnIO$default(BlazeSDK.INSTANCE, null, 1, null), null, null, new rjm((long) ((date.getTime() - new Date().getTime()) * 0.8d), str, null), 3);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static void k(ArrayList arrayList) {
        boolean z;
        Object obj;
        s9m videosViewedDao;
        try {
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((VideoModel) it.next()).id);
            }
            BlazeDatabase instance = BlazeDatabase.INSTANCE.instance();
            ArrayList d2 = (instance == null || (videosViewedDao = instance.getVideosViewedDao()) == null) ? null : videosViewedDao.d(arrayList2);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                VideoModel videoModel = (VideoModel) it2.next();
                if (d2 != null) {
                    Iterator it3 = d2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it3.next();
                            if (Intrinsics.c(((VideoViewed) obj).getVideoId(), videoModel.id)) {
                                break;
                            }
                        }
                    }
                    VideoViewed videoViewed = (VideoViewed) obj;
                    if (videoViewed != null) {
                        z = videoViewed.isRead();
                        videoModel.k = z;
                    }
                }
                z = false;
                videoModel.k = z;
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static List l(String str) {
        str.getClass();
        try {
            List list = (List) c.get(str);
            return list != null ? new ArrayList(list) : km5.a;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return km5.a;
        }
    }

    public static void m(ArrayList arrayList) {
        float f2;
        Object obj;
        s9m videosViewedDao;
        try {
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((VideoModel) it.next()).id);
            }
            BlazeDatabase instance = BlazeDatabase.INSTANCE.instance();
            ArrayList d2 = (instance == null || (videosViewedDao = instance.getVideosViewedDao()) == null) ? null : videosViewedDao.d(arrayList2);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                VideoModel videoModel = (VideoModel) it2.next();
                if (d2 != null) {
                    Iterator it3 = d2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it3.next();
                            if (Intrinsics.c(((VideoViewed) obj).getVideoId(), videoModel.id)) {
                                break;
                            }
                        }
                    }
                    VideoViewed videoViewed = (VideoViewed) obj;
                    if (videoViewed != null) {
                        f2 = videoViewed.getLastViewedMs();
                        videoModel.l = f2;
                    }
                }
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                videoModel.l = f2;
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|8|(1:(4:11|12|13|14)(2:82|83))(14:84|85|86|87|88|89|90|91|92|93|94|(1:115)(6:97|98|99|100|101|102)|103|(1:105)(1:106))|15|16|(5:18|19|20|21|23)(2:29|(19:31|(1:33)(1:75)|(1:35)(1:74)|36|37|38|39|40|(4:42|43|44|45)|49|(3:52|(1:54)(3:55|56|57)|50)|58|59|(2:62|60)|63|64|(1:68)|69|70)(2:76|77))|27|28))|128|6|7|8|(0)(0)|15|16|(0)(0)|27|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb A[Catch: all -> 0x011a, CancellationException -> 0x0262, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0262, blocks: (B:13:0x003e, B:16:0x00e4, B:18:0x00eb, B:21:0x010e, B:29:0x011d, B:31:0x0121, B:33:0x012f, B:35:0x0137, B:36:0x013b, B:39:0x015d, B:40:0x0160, B:42:0x016d, B:45:0x0188, B:48:0x017f, B:49:0x018b, B:50:0x01a9, B:52:0x01af, B:54:0x01b7, B:56:0x01d2, B:57:0x01d5, B:59:0x01d6, B:60:0x01df, B:62:0x01e5, B:64:0x01ef, B:66:0x01fa, B:68:0x0200, B:69:0x0208, B:76:0x0217, B:77:0x021c, B:86:0x0058, B:89:0x0078, B:92:0x0080, B:94:0x0083, B:97:0x008b, B:103:0x00c6, B:110:0x00aa, B:123:0x006e), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011d A[Catch: all -> 0x011a, CancellationException -> 0x0262, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0262, blocks: (B:13:0x003e, B:16:0x00e4, B:18:0x00eb, B:21:0x010e, B:29:0x011d, B:31:0x0121, B:33:0x012f, B:35:0x0137, B:36:0x013b, B:39:0x015d, B:40:0x0160, B:42:0x016d, B:45:0x0188, B:48:0x017f, B:49:0x018b, B:50:0x01a9, B:52:0x01af, B:54:0x01b7, B:56:0x01d2, B:57:0x01d5, B:59:0x01d6, B:60:0x01df, B:62:0x01e5, B:64:0x01ef, B:66:0x01fa, B:68:0x0200, B:69:0x0208, B:76:0x0217, B:77:0x021c, B:86:0x0058, B:89:0x0078, B:92:0x0080, B:94:0x0083, B:97:0x008b, B:103:0x00c6, B:110:0x00aa, B:123:0x006e), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var, BlazeDataSourceType blazeDataSourceType, String str, String str2, String str3, String str4, Map map, boolean z, boolean z2) {
        w9m w9mVar;
        int i2;
        BlazeDataSourceType blazeDataSourceType2;
        String str5;
        mom momVar;
        qom qomVar;
        boolean z3;
        a9m a9mVar;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        HashMap hashMap = j;
        try {
            if (rq3Var instanceof w9m) {
                w9mVar = (w9m) rq3Var;
                int i3 = w9mVar.z;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    w9mVar.z = i3 - Integer.MIN_VALUE;
                    w9m w9mVar2 = w9mVar;
                    Object obj = w9mVar2.x;
                    lu3 lu3Var = lu3.a;
                    i2 = w9mVar2.z;
                    if (i2 != 0) {
                        y6a.M(obj);
                        try {
                            gzk gzkVar = gzk.a;
                            gzk.g(str7, blazeDataSourceType.getStringRepresentation$blazesdk_release(), BlazePlayerType.VIDEOS, str8);
                            str6.getClass();
                            try {
                                momVar = (mom) hashMap.get(str6);
                            } catch (Throwable th) {
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                momVar = null;
                            }
                            blazeDataSourceType2 = blazeDataSourceType;
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                boolean c2 = Intrinsics.c(momVar, new mom(blazeDataSourceType2, z2, str7, str8, str4));
                                if (z || c2) {
                                    blazeDataSourceType2 = blazeDataSourceType;
                                    str7 = str2;
                                    str8 = str3;
                                } else {
                                    g(str6);
                                    try {
                                        blazeDataSourceType2 = blazeDataSourceType;
                                        str7 = str2;
                                        str8 = str3;
                                        try {
                                            hashMap.put(str6, new mom(blazeDataSourceType2, z2, str7, str8, str4));
                                        } catch (Throwable th3) {
                                            th = th3;
                                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                            w9mVar2.r = this;
                                            w9mVar2.s = blazeDataSourceType2;
                                            w9mVar2.t = str6;
                                            w9mVar2.u = str7;
                                            w9mVar2.v = str8;
                                            w9mVar2.w = z2;
                                            w9mVar2.z = 1;
                                            obj = c(blazeDataSourceType2, str4, map, w9mVar2);
                                            if (obj != lu3Var) {
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        blazeDataSourceType2 = blazeDataSourceType;
                                        str7 = str2;
                                        str8 = str3;
                                    }
                                }
                                w9mVar2.r = this;
                                w9mVar2.s = blazeDataSourceType2;
                                w9mVar2.t = str6;
                                w9mVar2.u = str7;
                                w9mVar2.v = str8;
                                w9mVar2.w = z2;
                                w9mVar2.z = 1;
                                obj = c(blazeDataSourceType2, str4, map, w9mVar2);
                                if (obj != lu3Var) {
                                    return lu3Var;
                                }
                                str5 = str8;
                                qomVar = this;
                                z3 = z2;
                            } catch (Throwable th5) {
                                th = th5;
                                blazeDataSourceType2 = blazeDataSourceType;
                                str7 = str2;
                                str8 = str3;
                                str5 = str8;
                                gzk gzkVar2 = gzk.a;
                                gzk.f(str7, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.VIDEOS, 0, str5, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                return new bx0(null, null, null, 7, null);
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            blazeDataSourceType2 = blazeDataSourceType;
                        }
                    } else {
                        if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = w9mVar2.w;
                        str5 = w9mVar2.v;
                        String str9 = w9mVar2.u;
                        String str10 = w9mVar2.t;
                        BlazeDataSourceType blazeDataSourceType3 = w9mVar2.s;
                        qomVar = w9mVar2.r;
                        try {
                            y6a.M(obj);
                            str7 = str9;
                            blazeDataSourceType2 = blazeDataSourceType3;
                            str6 = str10;
                        } catch (Throwable th7) {
                            th = th7;
                            str7 = str9;
                            blazeDataSourceType2 = blazeDataSourceType3;
                        }
                    }
                    a9mVar = (a9m) obj;
                    if (!(a9mVar instanceof a6m)) {
                        evl.m(qomVar);
                        gzk gzkVar3 = gzk.a;
                        String str11 = str5;
                        String str12 = str7;
                        try {
                            gzk.f(str12, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.VIDEOS, 0, str11, ErrorReason.FAILED_FETCHING_CONTENT, ((a6m) a9mVar).b());
                            return a9mVar;
                        } catch (Throwable th8) {
                            th = th8;
                            str7 = str12;
                            str5 = str11;
                        }
                    } else {
                        if (!(a9mVar instanceof qbm)) {
                            throw new ndd();
                        }
                        List<VideoDto> result = ((VideosResponse) ((qbm) a9mVar).a).getResult();
                        int i4 = 0;
                        int size = result != null ? result.size() : 0;
                        String str13 = str5;
                        String str14 = str7;
                        try {
                            gzk.globalBroadcastDataLoadCompleted$default(gzk.a, str14, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.VIDEOS, size, str13, size == 0 ? ErrorReason.NO_AVAILABLE_CONTENT_FOR_DATA_SOURCE : null, null, 64, null);
                            Date assetsExpiryTime = ((VideosResponse) ((qbm) a9mVar).a).getAssetsExpiryTime();
                            if (assetsExpiryTime != null) {
                                b.getClass();
                                try {
                                    ((Map) h.getValue()).put(str6, assetsExpiryTime);
                                } catch (Throwable th9) {
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th9, null);
                                }
                                j(str6, assetsExpiryTime);
                            }
                            List a = asl.a(result, ((VideosResponse) ((qbm) a9mVar).a).getDefaultAdsInfo());
                            ArrayList arrayList = new ArrayList(k13.r(a, 10));
                            for (Object obj2 : a) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    b.q();
                                    throw null;
                                }
                                VideoModel videoModel = (VideoModel) obj2;
                                videoModel.h = ((VideosResponse) ((qbm) a9mVar).a).getAssetsExpiryTime();
                                videoModel.m = new Integer(i4);
                                arrayList.add(videoModel);
                                i4 = i5;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add((VideoModel) it.next());
                            }
                            qomVar.getClass();
                            k(arrayList2);
                            m(arrayList2);
                            if (z3 && arrayList2.size() > 1) {
                                n13.u(new c7m(), arrayList2);
                            }
                            i(str6, arrayList2);
                            return new qbm(arrayList2);
                        } catch (Throwable th10) {
                            th = th10;
                            str7 = str14;
                            str5 = str13;
                        }
                    }
                    gzk gzkVar22 = gzk.a;
                    gzk.f(str7, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.VIDEOS, 0, str5, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
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
            gzk.f(str7, blazeDataSourceType2.getStringRepresentation$blazesdk_release(), BlazePlayerType.VIDEOS, 0, str5, ErrorReason.FAILED_FETCHING_CONTENT, th.getMessage());
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return new bx0(null, null, null, 7, null);
        } catch (CancellationException e2) {
            throw e2;
        }
        w9mVar = new w9m(this, rq3Var);
        w9m w9mVar22 = w9mVar;
        Object obj3 = w9mVar22.x;
        lu3 lu3Var2 = lu3.a;
        i2 = w9mVar22.z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|8|(1:(2:11|12)(2:26|27))(2:28|29)|13|(3:16|(2:18|19)(1:21)|14)|22|23|24))|32|6|7|8|(0)(0)|13|(1:14)|22|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r0, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:14:0x0047, B:16:0x004d, B:29:0x003c), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        wfm wfmVar;
        int i2;
        Iterator it;
        Iterator it2;
        if (sq3Var instanceof wfm) {
            wfmVar = (wfm) sq3Var;
            int i3 = wfmVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wfmVar.u = i3 - Integer.MIN_VALUE;
                wfm wfmVar2 = wfmVar;
                Object obj = wfmVar2.s;
                lu3 lu3Var = lu3.a;
                i2 = wfmVar2.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    it = j.entrySet().iterator();
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = wfmVar2.r;
                    y6a.M(obj);
                }
                it2 = it;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    BlazeDataSourceType blazeDataSourceType = ((mom) entry.getValue()).a;
                    boolean z = ((mom) entry.getValue()).b;
                    String str = (String) entry.getKey();
                    String str2 = ((mom) entry.getValue()).c;
                    String str3 = ((mom) entry.getValue()).d;
                    String str4 = ((mom) entry.getValue()).e;
                    qom qomVar = b;
                    wfmVar2.r = it2;
                    wfmVar2.u = 1;
                    if (fsl.getVideos$default(qomVar, blazeDataSourceType, str, str2, false, z, str3, str4, null, wfmVar2, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, null) == lu3Var) {
                        return lu3Var;
                    }
                }
                return Unit.a;
            }
        }
        wfmVar = new wfm(this, sq3Var);
        wfm wfmVar22 = wfmVar;
        Object obj2 = wfmVar22.s;
        lu3 lu3Var2 = lu3.a;
        i2 = wfmVar22.u;
        if (i2 != 0) {
        }
        it2 = it;
        while (it2.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:13:0x005a, B:15:0x0060, B:18:0x0064, B:20:0x0068, B:22:0x006e, B:24:0x007b, B:26:0x0081, B:29:0x00af, B:32:0x0092, B:34:0x009c, B:36:0x00a2, B:38:0x00a8, B:42:0x00b7, B:44:0x00c1, B:45:0x00c6, B:49:0x003f), top: B:8:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:13:0x005a, B:15:0x0060, B:18:0x0064, B:20:0x0068, B:22:0x006e, B:24:0x007b, B:26:0x0081, B:29:0x00af, B:32:0x0092, B:34:0x009c, B:36:0x00a2, B:38:0x00a8, B:42:0x00b7, B:44:0x00c1, B:45:0x00c6, B:49:0x003f), top: B:8:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, boolean z, sq3 sq3Var) {
        qlm qlmVar;
        int i2;
        a9m a9mVar;
        BlazeDatabase instance;
        bsl videosLikedDao;
        bsl videosLikedDao2;
        try {
            if (sq3Var instanceof qlm) {
                qlmVar = (qlm) sq3Var;
                int i3 = qlmVar.x;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    qlmVar.x = i3 - Integer.MIN_VALUE;
                    qlm qlmVar2 = qlmVar;
                    Object obj = qlmVar2.v;
                    lu3 lu3Var = lu3.a;
                    i2 = qlmVar2.x;
                    if (i2 != 0) {
                        y6a.M(obj);
                        rwl rwlVar = rwl.a;
                        enm enmVar = new enm(str2, z, null);
                        qlmVar2.r = this;
                        qlmVar2.s = str;
                        qlmVar2.t = str2;
                        qlmVar2.u = z;
                        qlmVar2.x = 1;
                        obj = rwl.safeApiCall$default(rwlVar, false, enmVar, qlmVar2, 1, null);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = qlmVar2.u;
                        str2 = qlmVar2.t;
                        str = qlmVar2.s;
                        this = qlmVar2.r;
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
                    h(str, str2, z);
                    try {
                        VideoLikedStatus videoLikedStatus = new VideoLikedStatus(str2, z);
                        BlazeDatabase.Companion companion = BlazeDatabase.INSTANCE;
                        BlazeDatabase instance2 = companion.instance();
                        Long l2 = (instance2 == null || (videosLikedDao2 = instance2.getVideosLikedDao()) == null) ? null : new Long(videosLikedDao2.b(videoLikedStatus));
                        if (l2 != null && l2.longValue() == -1 && (instance = companion.instance()) != null && (videosLikedDao = instance.getVideosLikedDao()) != null) {
                            o02.K(videosLikedDao.a(str2, z));
                        }
                        return new qbm(Unit.a);
                    } catch (Exception e2) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e2, null);
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
        qlmVar = new qlm(this, sq3Var);
        qlm qlmVar22 = qlmVar;
        Object obj2 = qlmVar22.v;
        lu3 lu3Var2 = lu3.a;
        i2 = qlmVar22.x;
    }

    public final void f(BlazeDataSourceType blazeDataSourceType, String str, String str2, String str3, Function1 function1) {
        blazeDataSourceType.getClass();
        if (com.blaze.blazesdk.data_source.a.b(blazeDataSourceType)) {
            try {
                evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new kcm(blazeDataSourceType, str, str2, str3, function1, null), 1, null);
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

    public final void g(String str) {
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
}
