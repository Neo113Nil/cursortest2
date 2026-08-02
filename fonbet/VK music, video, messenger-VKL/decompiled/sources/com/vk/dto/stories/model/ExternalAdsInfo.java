package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import xsna.asp;
import xsna.epx;
import xsna.shy;
import xsna.zrp;

/* compiled from: ExternalAdsInfo.kt */
/* loaded from: classes18.dex */
public final class ExternalAdsInfo extends Serializer.StreamParcelableAdapter {
    public final Image b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final ScaleType g;
    public static final a h = new a();
    public static final Serializer.c<ExternalAdsInfo> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExternalAdsInfo.kt */
    public static final class ScaleType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScaleType[] $VALUES;
        public static final a Companion;
        public static final ScaleType FILL;
        public static final ScaleType FIT;

        /* compiled from: ExternalAdsInfo.kt */
        public static final class a {
        }

        static {
            ScaleType scaleType = new ScaleType("FIT", 0);
            FIT = scaleType;
            ScaleType scaleType2 = new ScaleType("FILL", 1);
            FILL = scaleType2;
            ScaleType[] scaleTypeArr = {scaleType, scaleType2};
            $VALUES = scaleTypeArr;
            $ENTRIES = new asp(scaleTypeArr);
            Companion = new a();
        }

        public ScaleType() {
            throw null;
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) $VALUES.clone();
        }
    }

    /* compiled from: ExternalAdsInfo.kt */
    public static final class a {
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ExternalAdsInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ExternalAdsInfo a(Serializer serializer) {
            return new ExternalAdsInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExternalAdsInfo[i];
        }
    }

    public ExternalAdsInfo(Image image, String str, int i, String str2, String str3, ScaleType scaleType) {
        this.b = image;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = scaleType;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.S(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.g0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalAdsInfo)) {
            return false;
        }
        ExternalAdsInfo externalAdsInfo = (ExternalAdsInfo) obj;
        return epx.f(this.b, externalAdsInfo.b) && epx.f(this.c, externalAdsInfo.c) && this.d == externalAdsInfo.d && epx.f(this.e, externalAdsInfo.e) && epx.f(this.f, externalAdsInfo.f) && this.g == externalAdsInfo.g;
    }

    public final int hashCode() {
        Image image = this.b;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.c;
        int a2 = shy.a(this.d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        int hashCode2 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ScaleType scaleType = this.g;
        return hashCode3 + (scaleType != null ? scaleType.hashCode() : 0);
    }

    public final String toString() {
        return "ExternalAdsInfo(photoIcon=" + this.b + ", title=" + this.c + ", linkUrlTarget=" + this.d + ", appBundle=" + this.e + ", deepLink=" + this.f + ", scaleType=" + this.g + ')';
    }

    public ExternalAdsInfo(Serializer serializer) {
        this((Image) serializer.G(Image.class.getClassLoader()), serializer.H(), serializer.u(), serializer.H(), serializer.H(), (ScaleType) serializer.C());
    }
}
