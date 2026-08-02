package com.vk.dto.common.donut.popup;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.urd0;
import xsna.w9y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoDonutPopup.kt */
/* loaded from: classes18.dex */
public final class VideoDonutPopup extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<VideoDonutPopup> CREATOR = new b();
    public static final a f = new a();
    public final Illustration b;
    public final String c;
    public final String d;
    public final VideoDonutAction e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoDonutPopup.kt */
    public static final class Illustration {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Illustration[] $VALUES;
        public static final a Companion;
        public static final Illustration ILLUSTRATION_DONUT_LOGO_CONFETTI_120H;
        public static final Illustration UNKNOWN;
        private final String value;

        /* compiled from: VideoDonutPopup.kt */
        public static final class a {
            public static Illustration a(String str) {
                Object obj;
                Iterator<E> it = Illustration.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((Illustration) obj).i(), str)) {
                        break;
                    }
                }
                Illustration illustration = (Illustration) obj;
                return illustration == null ? Illustration.UNKNOWN : illustration;
            }
        }

        static {
            Illustration illustration = new Illustration("ILLUSTRATION_DONUT_LOGO_CONFETTI_120H", 0, "illustration_donut_logo_confetti_120h");
            ILLUSTRATION_DONUT_LOGO_CONFETTI_120H = illustration;
            Illustration illustration2 = new Illustration(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1, "unknown");
            UNKNOWN = illustration2;
            Illustration[] illustrationArr = {illustration, illustration2};
            $VALUES = illustrationArr;
            $ENTRIES = new asp(illustrationArr);
            Companion = new a();
        }

        public Illustration(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<Illustration> h() {
            return $ENTRIES;
        }

        public static Illustration valueOf(String str) {
            return (Illustration) Enum.valueOf(Illustration.class, str);
        }

        public static Illustration[] values() {
            return (Illustration[]) $VALUES.clone();
        }

        public final String i() {
            return this.value;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<VideoDonutPopup> {
        @Override // xsna.aay
        public final VideoDonutPopup a(JSONObject jSONObject) {
            return new VideoDonutPopup(jSONObject, (zcl) null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VideoDonutPopup> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoDonutPopup a(Serializer serializer) {
            return new VideoDonutPopup(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoDonutPopup[i];
        }
    }

    public VideoDonutPopup(Illustration illustration, String str, String str2, VideoDonutAction videoDonutAction) {
        this.b = illustration;
        this.c = str;
        this.d = str2;
        this.e = videoDonutAction;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.i());
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b.i(), "illustration");
        w9yVar.e(this.c, "title");
        w9yVar.e(this.d, "text");
        w9yVar.g("action", this.e);
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDonutPopup)) {
            return false;
        }
        VideoDonutPopup videoDonutPopup = (VideoDonutPopup) obj;
        return this.b == videoDonutPopup.b && epx.f(this.c, videoDonutPopup.c) && epx.f(this.d, videoDonutPopup.d) && epx.f(this.e, videoDonutPopup.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        VideoDonutAction videoDonutAction = this.e;
        return a2 + (videoDonutAction == null ? 0 : videoDonutAction.hashCode());
    }

    public final String toString() {
        return "VideoDonutPopup(illustration=" + this.b + ", title=" + this.c + ", text=" + this.d + ", action=" + this.e + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoDonutPopup(JSONObject jSONObject, zcl zclVar) {
        this(Illustration.a.a(r0), jSONObject.getString("title"), jSONObject.getString("text"), jSONObject.has("action") ? (VideoDonutAction) VideoDonutAction.e.a(jSONObject.getJSONObject("action")) : null);
        Illustration.a aVar = Illustration.Companion;
        String string = jSONObject.getString("illustration");
        aVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoDonutPopup(Serializer serializer, zcl zclVar) {
        this(Illustration.a.a(r0), serializer.H(), serializer.H(), (VideoDonutAction) serializer.G(VideoDonutAction.class.getClassLoader()));
        Illustration.a aVar = Illustration.Companion;
        String H = serializer.H();
        aVar.getClass();
    }
}
