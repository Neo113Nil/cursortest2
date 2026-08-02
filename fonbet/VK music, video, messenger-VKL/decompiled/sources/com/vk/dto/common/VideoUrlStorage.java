package com.vk.dto.common;

import android.net.Uri;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoFilesDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoFullDto;
import com.vk.api.generated.video.dto.VideoInteractiveCurrentVideoDto;
import com.vk.api.generated.video.dto.VideoInteractiveInfoDto;
import com.vk.api.generated.video.dto.VideoVideoFilesDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.toggle.features.VideoFeatures;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.brm0;
import xsna.c5g;
import xsna.epx;
import xsna.f370;
import xsna.gzs;
import xsna.ho8;
import xsna.j5g;
import xsna.jgp;
import xsna.jw5;
import xsna.myc0;
import xsna.rl3;
import xsna.zcl;

/* compiled from: VideoUrlStorage.kt */
/* loaded from: classes18.dex */
public final class VideoUrlStorage extends Serializer.StreamParcelableAdapter {
    public final Map<String, VideoUrlInfo> b;
    public static final b c = new b(0, VideoFeatures.VIDEO_HLS_FMP4, VideoFeatures.class, "hasFeatureEnabled", "hasFeatureEnabled()Z", 0);
    public static final c d = new c(0, VideoFeatures.VIDEO_LIVE_CMAF, VideoFeatures.class, "hasFeatureEnabled", "hasFeatureEnabled()Z", 0);
    public static final Serializer.c<VideoUrlStorage> CREATOR = new f();

    /* compiled from: VideoUrlStorage.kt */
    public static final class a {
        public final HashMap<String, VideoUrlInfo> a;

        public a(HashMap<String, VideoUrlInfo> hashMap) {
            this.a = hashMap;
        }

        public final void a(VideoUrl videoUrl, String str) {
            if (str != null) {
                if (!myc0.f(str)) {
                    str = null;
                }
                if (str != null) {
                    b bVar = VideoUrlStorage.c;
                    d.b(this.a, videoUrl, str);
                }
            }
        }

        public final VideoUrlStorage b() {
            return new VideoUrlStorage(this.a);
        }

        public a(VideoUrlStorage videoUrlStorage) {
            this((HashMap<String, VideoUrlInfo>) new HashMap(videoUrlStorage.b));
        }
    }

    /* compiled from: VideoUrlStorage.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            VideoFeatures videoFeatures = (VideoFeatures) this.receiver;
            videoFeatures.getClass();
            return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
        }
    }

    /* compiled from: VideoUrlStorage.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            VideoFeatures videoFeatures = (VideoFeatures) this.receiver;
            videoFeatures.getClass();
            return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
        }
    }

    /* compiled from: VideoUrlStorage.kt */
    public static final class d {
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x005e A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static VideoUrlStorage a(JSONObject jSONObject, JSONObject jSONObject2) {
            VideoUrl videoUrl;
            String D;
            HashMap hashMap = new HashMap();
            if (jSONObject2 != null) {
                for (VideoUrl videoUrl2 : VideoUrl.k()) {
                    b bVar = VideoUrlStorage.c;
                    String D2 = f370.D(jSONObject2, videoUrl2.l());
                    if (D2 != null) {
                        b(hashMap, videoUrl2, D2);
                    } else {
                        String i = videoUrl2.i();
                        if (i != null && (D = f370.D(jSONObject2, i)) != null) {
                            b(hashMap, videoUrl2, D);
                        }
                    }
                }
                b bVar2 = VideoUrlStorage.c;
                VideoUrl videoUrl3 = VideoUrl.HLS_URL;
                VideoUrl videoUrl4 = VideoUrl.FMP4_HLS;
                if (!((Boolean) VideoUrlStorage.c.invoke()).booleanValue()) {
                    videoUrl4 = null;
                }
                for (VideoUrl videoUrl5 : rl3.I(new VideoUrl[]{videoUrl3, videoUrl4})) {
                    VideoUrlInfo videoUrlInfo = (VideoUrlInfo) hashMap.get(videoUrl5.l());
                    if (videoUrlInfo != null) {
                        b bVar3 = VideoUrlStorage.c;
                        String str = videoUrlInfo.c;
                        String lastPathSegment = Uri.parse(str).getLastPathSegment();
                        if (lastPathSegment != null) {
                            boolean z = false;
                            if (brm0.v(lastPathSegment, ".240.mp4", false)) {
                                videoUrl = VideoUrl.URL_240;
                            } else if (brm0.v(lastPathSegment, ".360.mp4", false)) {
                                videoUrl = VideoUrl.URL_360;
                            } else if (brm0.v(lastPathSegment, ".480.mp4", false)) {
                                videoUrl = VideoUrl.URL_480;
                            } else if (brm0.v(lastPathSegment, ".720.mp4", false)) {
                                videoUrl = VideoUrl.URL_720;
                            } else if (brm0.v(lastPathSegment, ".1080.mp4", false)) {
                                videoUrl = VideoUrl.URL_1080;
                            } else {
                                videoUrl = null;
                                if (videoUrl != null) {
                                    b(hashMap, videoUrl, str);
                                }
                                if (!z) {
                                    hashMap.remove(videoUrl5.l());
                                }
                            }
                            z = true;
                            if (videoUrl != null) {
                            }
                            if (!z) {
                            }
                        }
                    }
                }
            }
            VideoUrl videoUrl6 = VideoUrl.EMBED_URL;
            String D3 = f370.D(jSONObject, videoUrl6.l());
            if (D3 != null) {
                b bVar4 = VideoUrlStorage.c;
                b(hashMap, videoUrl6, D3);
            }
            c(hashMap);
            return new VideoUrlStorage(hashMap);
        }

        public static void b(HashMap hashMap, VideoUrl videoUrl, String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            if (videoUrl != VideoUrl.DASH_LIVE_ON_DEMAND_URL || ((Boolean) VideoUrlStorage.d.invoke()).booleanValue()) {
                hashMap.put(videoUrl.l(), new VideoUrlInfo(videoUrl.m(), str, videoUrl.q(), videoUrl.s(), videoUrl.o(), videoUrl.r(), videoUrl.j().h()));
            }
        }

        public static void c(HashMap hashMap) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                if (((VideoUrlInfo) entry.getValue()).c.length() == 0) {
                    hashSet.add(str);
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hashMap.remove((String) it.next());
            }
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((VideoUrlInfo) t).b), Integer.valueOf(((VideoUrlInfo) t2).b));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class f extends Serializer.c<VideoUrlStorage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoUrlStorage a(Serializer serializer) {
            Map map;
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        String H = serializer.H();
                        VideoUrlInfo videoUrlInfo = (VideoUrlInfo) serializer.G(VideoUrlInfo.class.getClassLoader());
                        if (H != null && videoUrlInfo != null) {
                            map.put(H, videoUrlInfo);
                        }
                    }
                } else {
                    map = jgp.b;
                }
                return new VideoUrlStorage((Map<String, VideoUrlInfo>) map);
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoUrlStorage[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoUrlStorage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String Ab(VideoUrl videoUrl) {
        String str;
        VideoUrlInfo videoUrlInfo = this.b.get(videoUrl.l());
        if (videoUrlInfo == null || (str = videoUrlInfo.c) == null || !myc0.f(str)) {
            return null;
        }
        return str;
    }

    public final ArrayList Bb() {
        Collection<VideoUrlInfo> values = this.b.values();
        ArrayList arrayList = new ArrayList(c5g.u(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((VideoUrlInfo) it.next()).c);
        }
        return arrayList;
    }

    public final String Cb() {
        VideoUrlInfo videoUrlInfo = (VideoUrlInfo) j5g.Z(this.b.values());
        if (videoUrlInfo != null) {
            return videoUrlInfo.c;
        }
        return null;
    }

    public final String Db(List<? extends VideoUrl> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            VideoUrlInfo videoUrlInfo = this.b.get(((VideoUrl) it.next()).l());
            if (videoUrlInfo != null) {
                String str = videoUrlInfo.c;
                if (myc0.f(str)) {
                    return str;
                }
            }
        }
        return null;
    }

    public final VideoUrlInfo Eb(String str) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator<T> it = this.b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((VideoUrlInfo) next).c, str)) {
                obj = next;
                break;
            }
        }
        return (VideoUrlInfo) obj;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Map<String, VideoUrlInfo> map = this.b;
        if (map == null) {
            serializer.S(-1);
            return;
        }
        Iterator c2 = n.c(serializer, map);
        while (c2.hasNext()) {
            Map.Entry entry = (Map.Entry) c2.next();
            serializer.j0((String) entry.getKey());
            serializer.i0((Serializer.StreamParcelable) entry.getValue());
        }
    }

    public final String T7() {
        Collection<VideoUrlInfo> values = this.b.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((VideoUrlInfo) obj).b > 0) {
                arrayList.add(obj);
            }
        }
        VideoUrlInfo videoUrlInfo = (VideoUrlInfo) j5g.k0(j5g.D0(new e(), arrayList));
        if (videoUrlInfo != null) {
            return videoUrlInfo.c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        VideoUrlStorage videoUrlStorage = obj instanceof VideoUrlStorage ? (VideoUrlStorage) obj : null;
        if (videoUrlStorage != null) {
            return epx.f(videoUrlStorage.b, this.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoUrlStorage with values = ("), j5g.g0(this.b.keySet(), ", ", null, null, 0, null, 62), ')');
    }

    public final Map<String, VideoUrlInfo> v9() {
        return this.b;
    }

    public final void zb(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Map<String, VideoUrlInfo> map = this.b;
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            VideoUrlInfo videoUrlInfo = (VideoUrlInfo) entry.getValue();
            if (str == null || str.equals(videoUrlInfo.c)) {
                jSONObject2.put(str2, videoUrlInfo.c);
            }
        }
        jSONObject.put("files", jSONObject2);
        VideoUrl videoUrl = VideoUrl.EMBED_URL;
        VideoUrlInfo videoUrlInfo2 = map.get(videoUrl.l());
        if (videoUrlInfo2 != null) {
            jSONObject.put(videoUrl.l(), videoUrlInfo2.c);
        }
    }

    public VideoUrlStorage(Map<String, VideoUrlInfo> map) {
        this.b = map;
    }

    public /* synthetic */ VideoUrlStorage(Map map, int i, zcl zclVar) {
        this((Map<String, VideoUrlInfo>) ((i & 1) != 0 ? jgp.b : map));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoUrlStorage(VideoVideoFullDto videoVideoFullDto) {
        this(r0);
        VideoInteractiveCurrentVideoDto d2;
        HashMap hashMap = new HashMap();
        VideoInteractiveInfoDto x1 = videoVideoFullDto.x1();
        VideoVideoFilesDto U0 = (x1 == null || (d2 = x1.d()) == null || (U0 = d2.d()) == null) ? videoVideoFullDto.U0() : U0;
        if (U0 != null) {
            d.b(hashMap, VideoUrl.DASH_URL, U0.f());
            d.b(hashMap, VideoUrl.DASH_ONDEMAND_URL, U0.e());
            d.b(hashMap, VideoUrl.DASH_WEBM_URL, U0.i());
            if (((Boolean) d.invoke()).booleanValue()) {
                d.b(hashMap, VideoUrl.DASH_LIVE_ON_DEMAND_URL, U0.d());
            }
            d.b(hashMap, VideoUrl.DASH_STREAMS, U0.g());
            d.b(hashMap, VideoUrl.DASH_AV1, U0.j());
            if (((Boolean) c.invoke()).booleanValue()) {
                VideoUrl videoUrl = VideoUrl.FMP4_HLS;
                String n = U0.n();
                d.b(hashMap, videoUrl, n == null ? U0.C() : n);
            }
            VideoUrl videoUrl2 = VideoUrl.HLS_URL;
            String l = U0.l();
            d.b(hashMap, videoUrl2, l == null ? U0.C() : l);
            d.b(hashMap, VideoUrl.HLS_ONDEMAND_URL, U0.B());
            d.b(hashMap, VideoUrl.HLS_ONDEMAND_LIVE_URL, U0.p());
            d.b(hashMap, VideoUrl.HLS_LIVE_PAYBACK_URL, U0.u());
            d.b(hashMap, VideoUrl.HLS_LIVE, U0.o());
            VideoUrl videoUrl3 = VideoUrl.URL_240;
            String K = U0.K();
            d.b(hashMap, videoUrl3, K == null ? U0.a0() : K);
            d.b(hashMap, VideoUrl.URL_360, U0.M());
            d.b(hashMap, VideoUrl.URL_480, U0.R());
            d.b(hashMap, VideoUrl.URL_720, U0.T());
            d.b(hashMap, VideoUrl.URL_1080, U0.D());
            d.b(hashMap, VideoUrl.URL_1440, U0.F());
            d.b(hashMap, VideoUrl.URL_2160, U0.G());
            d.b(hashMap, VideoUrl.RTMP_URL, U0.Z());
            d.b(hashMap, VideoUrl.OKMP_URL, U0.W());
            d.b(hashMap, VideoUrl.EXTERNAL_URL, U0.k());
        }
        d.b(hashMap, VideoUrl.EMBED_URL, videoVideoFullDto.i2());
        d.c(hashMap);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoUrlStorage(ShortVideoShortVideoFullDto shortVideoShortVideoFullDto) {
        this(r0);
        HashMap hashMap = new HashMap();
        ShortVideoShortVideoFilesDto F = shortVideoShortVideoFullDto.F();
        if (F != null) {
            d.b(hashMap, VideoUrl.DASH_URL, F.d());
            d.b(hashMap, VideoUrl.DASH_WEBM_URL, F.e());
            d.b(hashMap, VideoUrl.DASH_AV1, F.f());
            d.b(hashMap, VideoUrl.HLS_URL, F.g());
            d.b(hashMap, VideoUrl.URL_240, F.l());
            d.b(hashMap, VideoUrl.URL_360, F.n());
            d.b(hashMap, VideoUrl.URL_480, F.o());
            d.b(hashMap, VideoUrl.URL_720, F.p());
            d.b(hashMap, VideoUrl.URL_1080, F.i());
            d.b(hashMap, VideoUrl.URL_1440, F.j());
            d.b(hashMap, VideoUrl.URL_2160, F.k());
        }
        d.c(hashMap);
    }
}
