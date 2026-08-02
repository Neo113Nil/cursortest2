package com.vk.catalog2.common.dto.api.video;

import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.c;
import com.vk.internal.api.GsonHolder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;
import xsna.iq;
import xsna.ms9;
import xsna.qaj0;
import xsna.qgj0;

/* compiled from: TopshelfItem.kt */
/* loaded from: classes16.dex */
public final class TopshelfItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<TopshelfItem> CREATOR = new b();
    public final String b;
    public final String c;
    public final VideoFile d;
    public final ClipVideoFile e;
    public final TopshelfImage f;
    public final TopshelfTrackCodes g;
    public final TopshelfMeta h;
    public final TopshelfLiveInfo i;
    public final String j;
    public final String k;
    public final TopshelfTrailer l;
    public final Boolean m;
    public final Integer n;
    public final String o;

    /* compiled from: TopshelfItem.kt */
    public static final class TopshelfImage implements Serializable {
        private final Long duration;
        private final String url;

        public TopshelfImage(JSONObject jSONObject) {
            String optString = jSONObject.optString("url");
            Long valueOf = Long.valueOf(jSONObject.optLong("duration"));
            this.url = optString;
            this.duration = valueOf;
        }

        public final Long d() {
            return this.duration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopshelfImage)) {
                return false;
            }
            TopshelfImage topshelfImage = (TopshelfImage) obj;
            return epx.f(this.url, topshelfImage.url) && epx.f(this.duration, topshelfImage.duration);
        }

        public final String g() {
            return this.url;
        }

        public final int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.duration;
            return hashCode + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopshelfImage(url=");
            sb.append(this.url);
            sb.append(", duration=");
            return iq.b(sb, this.duration, ')');
        }
    }

    /* compiled from: TopshelfItem.kt */
    public static final class TopshelfLiveInfo implements Serializable {
        private final List<Info> info;

        /* compiled from: TopshelfItem.kt */
        public static final class Icon implements Serializable {
            private final String height;
            private final String url;
            private final String width;

            public Icon(JSONObject jSONObject) {
                String optString = jSONObject.optString("url");
                String optString2 = jSONObject.optString("width");
                String optString3 = jSONObject.optString("height");
                this.url = optString;
                this.width = optString2;
                this.height = optString3;
            }

            public final String d() {
                return this.height;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj;
                return epx.f(this.url, icon.url) && epx.f(this.width, icon.width) && epx.f(this.height, icon.height);
            }

            public final String g() {
                return this.url;
            }

            public final String h() {
                return this.width;
            }

            public final int hashCode() {
                String str = this.url;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.width;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.height;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Icon(url=");
                sb.append(this.url);
                sb.append(", width=");
                sb.append(this.width);
                sb.append(", height=");
                return ho8.a(sb, this.height, ')');
            }
        }

        /* compiled from: TopshelfItem.kt */
        public static final class Info implements Serializable {
            private final List<Icon> icon;
            private final String text;

            public Info() {
                throw null;
            }

            public Info(JSONObject jSONObject) {
                JSONArray optJSONArray = jSONObject.optJSONArray("icon");
                ArrayList arrayList = null;
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object opt = optJSONArray.opt(i);
                        JSONObject jSONObject2 = opt instanceof JSONObject ? (JSONObject) opt : null;
                        if (jSONObject2 != null) {
                            arrayList2.add(new Icon(jSONObject2));
                        }
                    }
                    arrayList = arrayList2;
                }
                String optString = jSONObject.optString("text");
                this.icon = arrayList;
                this.text = optString;
            }

            public final List<Icon> d() {
                return this.icon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Info)) {
                    return false;
                }
                Info info = (Info) obj;
                return epx.f(this.icon, info.icon) && epx.f(this.text, info.text);
            }

            public final String g() {
                return this.text;
            }

            public final int hashCode() {
                List<Icon> list = this.icon;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                String str = this.text;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Info(icon=");
                sb.append(this.icon);
                sb.append(", text=");
                return ho8.a(sb, this.text, ')');
            }
        }

        public TopshelfLiveInfo() {
            throw null;
        }

        public TopshelfLiveInfo(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray("info");
            ArrayList arrayList = null;
            if (optJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object opt = optJSONArray.opt(i);
                    JSONObject jSONObject2 = opt instanceof JSONObject ? (JSONObject) opt : null;
                    if (jSONObject2 != null) {
                        arrayList2.add(new Info(jSONObject2));
                    }
                }
                arrayList = arrayList2;
            }
            this.info = arrayList;
        }

        public final List<Info> d() {
            return this.info;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TopshelfLiveInfo) && epx.f(this.info, ((TopshelfLiveInfo) obj).info);
        }

        public final int hashCode() {
            List<Info> list = this.info;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("TopshelfLiveInfo(info="), this.info);
        }
    }

    /* compiled from: TopshelfItem.kt */
    public static final class TopshelfMeta implements Serializable {
        private final String ageRating;
        private final List<String> genres;
        private final String year;

        public TopshelfMeta() {
            throw null;
        }

        public TopshelfMeta(JSONObject jSONObject) {
            String optString = jSONObject.optString("year");
            String optString2 = jSONObject.optString("age_rating");
            JSONArray optJSONArray = jSONObject.optJSONArray("genres");
            ArrayList a = optJSONArray != null ? qaj0.a(optJSONArray) : null;
            this.year = optString;
            this.ageRating = optString2;
            this.genres = a;
        }

        public final String d() {
            return this.ageRating;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopshelfMeta)) {
                return false;
            }
            TopshelfMeta topshelfMeta = (TopshelfMeta) obj;
            return epx.f(this.year, topshelfMeta.year) && epx.f(this.ageRating, topshelfMeta.ageRating) && epx.f(this.genres, topshelfMeta.genres);
        }

        public final List<String> g() {
            return this.genres;
        }

        public final String h() {
            return this.year;
        }

        public final int hashCode() {
            String str = this.year;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.ageRating;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<String> list = this.genres;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopshelfMeta(year=");
            sb.append(this.year);
            sb.append(", ageRating=");
            sb.append(this.ageRating);
            sb.append(", genres=");
            return ms9.a(')', sb, this.genres);
        }
    }

    /* compiled from: TopshelfItem.kt */
    public static final class TopshelfTrackCodes implements Serializable {
        private final String topshelfTrackCode;
        private final String trailerTrackCode;

        public TopshelfTrackCodes(JSONObject jSONObject) {
            String optString = jSONObject.optString("topshelf_track_code");
            String optString2 = jSONObject.optString("trailer_track_code");
            this.topshelfTrackCode = optString;
            this.trailerTrackCode = optString2;
        }

        public final String d() {
            return this.topshelfTrackCode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopshelfTrackCodes)) {
                return false;
            }
            TopshelfTrackCodes topshelfTrackCodes = (TopshelfTrackCodes) obj;
            return epx.f(this.topshelfTrackCode, topshelfTrackCodes.topshelfTrackCode) && epx.f(this.trailerTrackCode, topshelfTrackCodes.trailerTrackCode);
        }

        public final String g() {
            return this.trailerTrackCode;
        }

        public final int hashCode() {
            String str = this.topshelfTrackCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.trailerTrackCode;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopshelfTrackCodes(topshelfTrackCode=");
            sb.append(this.topshelfTrackCode);
            sb.append(", trailerTrackCode=");
            return ho8.a(sb, this.trailerTrackCode, ')');
        }
    }

    /* compiled from: TopshelfItem.kt */
    public static final class TopshelfTrailer implements Serializable {
        private final Long duration;
        private final Map<String, String> files;

        public TopshelfTrailer() {
            throw null;
        }

        public TopshelfTrailer(JSONObject jSONObject) {
            String str;
            JSONObject optJSONObject = jSONObject.optJSONObject("files");
            HashMap hashMap = null;
            if (optJSONObject != null) {
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        str = optJSONObject.get(next).toString();
                    } catch (Throwable unused) {
                        str = null;
                    }
                    if (next != null && str != null) {
                        hashMap2.put(next, str);
                    }
                }
                hashMap = hashMap2;
            }
            Long valueOf = Long.valueOf(jSONObject.optLong("duration"));
            this.files = hashMap;
            this.duration = valueOf;
        }

        public final Long d() {
            return this.duration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopshelfTrailer)) {
                return false;
            }
            TopshelfTrailer topshelfTrailer = (TopshelfTrailer) obj;
            return epx.f(this.files, topshelfTrailer.files) && epx.f(this.duration, topshelfTrailer.duration);
        }

        public final Map<String, String> g() {
            return this.files;
        }

        public final int hashCode() {
            Map<String, String> map = this.files;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            Long l = this.duration;
            return hashCode + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopshelfTrailer(files=");
            sb.append(this.files);
            sb.append(", duration=");
            return iq.b(sb, this.duration, ')');
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<TopshelfItem> {
        @Override // xsna.aay
        public final TopshelfItem a(JSONObject jSONObject) {
            return new TopshelfItem(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<TopshelfItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TopshelfItem a(Serializer serializer) {
            return new TopshelfItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TopshelfItem[i];
        }
    }

    static {
        new a();
    }

    public TopshelfItem(String str, String str2, VideoFile videoFile, ClipVideoFile clipVideoFile, TopshelfImage topshelfImage, TopshelfTrackCodes topshelfTrackCodes, TopshelfMeta topshelfMeta, TopshelfLiveInfo topshelfLiveInfo, String str3, String str4, TopshelfTrailer topshelfTrailer, Boolean bool, Integer num, String str5) {
        this.b = str;
        this.c = str2;
        this.d = videoFile;
        this.e = clipVideoFile;
        this.f = topshelfImage;
        this.g = topshelfTrackCodes;
        this.h = topshelfMeta;
        this.i = topshelfLiveInfo;
        this.j = str3;
        this.k = str4;
        this.l = topshelfTrailer;
        this.m = bool;
        this.n = num;
        this.o = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.e0(this.d);
        serializer.e0(this.e);
        serializer.g0(this.f);
        serializer.g0(this.g);
        serializer.g0(this.h);
        serializer.g0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.g0(this.l);
        Boolean bool = this.m;
        serializer.L(bool != null ? bool.booleanValue() : (byte) 0);
        Integer num = this.n;
        serializer.S(num != null ? num.intValue() : 0);
        serializer.j0(this.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopshelfItem)) {
            return false;
        }
        TopshelfItem topshelfItem = (TopshelfItem) obj;
        return epx.f(this.b, topshelfItem.b) && epx.f(this.c, topshelfItem.c) && epx.f(this.d, topshelfItem.d) && epx.f(this.e, topshelfItem.e) && epx.f(this.f, topshelfItem.f) && epx.f(this.g, topshelfItem.g) && epx.f(this.h, topshelfItem.h) && epx.f(this.i, topshelfItem.i) && epx.f(this.j, topshelfItem.j) && epx.f(this.k, topshelfItem.k) && epx.f(this.l, topshelfItem.l) && epx.f(this.m, topshelfItem.m) && epx.f(this.n, topshelfItem.n) && epx.f(this.o, topshelfItem.o);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        VideoFile videoFile = this.d;
        int hashCode3 = (hashCode2 + (videoFile == null ? 0 : videoFile.hashCode())) * 31;
        ClipVideoFile clipVideoFile = this.e;
        int hashCode4 = (hashCode3 + (clipVideoFile == null ? 0 : clipVideoFile.hashCode())) * 31;
        TopshelfImage topshelfImage = this.f;
        int hashCode5 = (hashCode4 + (topshelfImage == null ? 0 : topshelfImage.hashCode())) * 31;
        TopshelfTrackCodes topshelfTrackCodes = this.g;
        int hashCode6 = (hashCode5 + (topshelfTrackCodes == null ? 0 : topshelfTrackCodes.hashCode())) * 31;
        TopshelfMeta topshelfMeta = this.h;
        int hashCode7 = (hashCode6 + (topshelfMeta == null ? 0 : topshelfMeta.hashCode())) * 31;
        TopshelfLiveInfo topshelfLiveInfo = this.i;
        int hashCode8 = (hashCode7 + (topshelfLiveInfo == null ? 0 : topshelfLiveInfo.hashCode())) * 31;
        String str3 = this.j;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TopshelfTrailer topshelfTrailer = this.l;
        int hashCode11 = (hashCode10 + (topshelfTrailer == null ? 0 : topshelfTrailer.hashCode())) * 31;
        Boolean bool = this.m;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.n;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.o;
        return hashCode13 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfItem(id=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", targetVideo=");
        sb.append(this.d);
        sb.append(", targetClip=");
        sb.append(this.e);
        sb.append(", topshelfImage=");
        sb.append(this.f);
        sb.append(", topshelfTrackCodes=");
        sb.append(this.g);
        sb.append(", topshelfMeta=");
        sb.append(this.h);
        sb.append(", topshelfLiveInfo=");
        sb.append(this.i);
        sb.append(", title=");
        sb.append(this.j);
        sb.append(", text=");
        sb.append(this.k);
        sb.append(", topshelfTrailer=");
        sb.append(this.l);
        sb.append(", isSubscribed=");
        sb.append(this.m);
        sb.append(", videosInPlaylist=");
        sb.append(this.n);
        sb.append(", action=");
        return ho8.a(sb, this.o, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TopshelfItem(JSONObject jSONObject) {
        this(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r1 != null ? new TopshelfTrailer(r1) : null, Boolean.valueOf(jSONObject.optBoolean("is_subscribed")), Integer.valueOf(jSONObject.optInt("videos_in_playlist")), jSONObject.optString("action"));
        VideoFileOld videoFileOld;
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("type");
        JSONObject optJSONObject = jSONObject.optJSONObject("target_video");
        if (optJSONObject != null) {
            VideoFileOld.a aVar = VideoFileOld.z1;
            videoFileOld = c.b(optJSONObject);
        } else {
            videoFileOld = null;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("target_short_video");
        ClipVideoFile b2 = optJSONObject2 != null ? qgj0.b((ShortVideoShortVideoFullDto) GsonHolder.a().fromJson(optJSONObject2.toString(), ShortVideoShortVideoFullDto.class), null, null, null, null, null, null, null, null, null, null) : null;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("topshelf_image");
        TopshelfImage topshelfImage = optJSONObject3 != null ? new TopshelfImage(optJSONObject3) : null;
        JSONObject optJSONObject4 = jSONObject.optJSONObject("topshelf_track_codes");
        TopshelfTrackCodes topshelfTrackCodes = optJSONObject4 != null ? new TopshelfTrackCodes(optJSONObject4) : null;
        JSONObject optJSONObject5 = jSONObject.optJSONObject("topshelf_meta");
        TopshelfMeta topshelfMeta = optJSONObject5 != null ? new TopshelfMeta(optJSONObject5) : null;
        JSONObject optJSONObject6 = jSONObject.optJSONObject("topshelf_live");
        TopshelfLiveInfo topshelfLiveInfo = optJSONObject6 != null ? new TopshelfLiveInfo(optJSONObject6) : null;
        String optString3 = jSONObject.optString("title");
        String optString4 = jSONObject.optString("text");
        JSONObject optJSONObject7 = jSONObject.optJSONObject("topshelf_trailer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TopshelfItem(Serializer serializer) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, r12, r1 == null ? "" : r1, (TopshelfTrailer) serializer.C(), Boolean.valueOf(serializer.m()), Integer.valueOf(serializer.u()), serializer.H());
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        VideoFile videoFile = (VideoFile) serializer.A(VideoFile.class.getClassLoader());
        ClipVideoFile clipVideoFile = (ClipVideoFile) serializer.A(ClipVideoFile.class.getClassLoader());
        TopshelfImage topshelfImage = (TopshelfImage) serializer.C();
        TopshelfTrackCodes topshelfTrackCodes = (TopshelfTrackCodes) serializer.C();
        TopshelfMeta topshelfMeta = (TopshelfMeta) serializer.C();
        TopshelfLiveInfo topshelfLiveInfo = (TopshelfLiveInfo) serializer.C();
        String H3 = serializer.H();
        String str3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
    }
}
