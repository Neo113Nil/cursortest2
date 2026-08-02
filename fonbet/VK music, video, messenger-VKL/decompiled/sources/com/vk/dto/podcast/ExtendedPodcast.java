package com.vk.dto.podcast;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.fq;
import xsna.ho8;

/* compiled from: ExtendedPodcast.kt */
/* loaded from: classes18.dex */
public final class ExtendedPodcast extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ExtendedPodcast> CREATOR = new b();
    public static final a g = new a();
    public final String b;
    public final String c;
    public final Image d;
    public final Image e;
    public final Podcast f;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ExtendedPodcast> {
        @Override // xsna.aay
        public final ExtendedPodcast a(JSONObject jSONObject) {
            return new ExtendedPodcast(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ExtendedPodcast> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ExtendedPodcast a(Serializer serializer) {
            return new ExtendedPodcast(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExtendedPodcast[i];
        }
    }

    public ExtendedPodcast(String str, String str2, Image image, Image image2, Podcast podcast) {
        this.b = str;
        this.c = str2;
        this.d = image;
        this.e = image2;
        this.f = podcast;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedPodcast)) {
            return false;
        }
        ExtendedPodcast extendedPodcast = (ExtendedPodcast) obj;
        return epx.f(this.b, extendedPodcast.b) && epx.f(this.c, extendedPodcast.c) && epx.f(this.d, extendedPodcast.d) && epx.f(this.e, extendedPodcast.e) && epx.f(this.f, extendedPodcast.f);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return this.f.hashCode() + fq.b(this.e, fq.b(this.d, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendedPodcast(id=");
        sb.append(this.f.b);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", tag=");
        return ho8.a(sb, this.c, ')');
    }

    public ExtendedPodcast(JSONObject jSONObject) {
        this(jSONObject.optString("editor_annotation"), jSONObject.optString("editor_tag"), new Image(jSONObject.getJSONArray("editor_background_image"), null, 2, null), new Image(jSONObject.getJSONArray("editor_gradient_image"), null, 2, null), new Podcast(jSONObject.getJSONObject("podcast")));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExtendedPodcast(Serializer serializer) {
        this(r3, r4, r5, r0 == null ? Image.d : r0, (Podcast) serializer.G(Podcast.class.getClassLoader()));
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        Image image = (Image) serializer.G(Image.class.getClassLoader());
        Image image2 = image == null ? Image.d : image;
        Image image3 = (Image) serializer.G(Image.class.getClassLoader());
    }
}
