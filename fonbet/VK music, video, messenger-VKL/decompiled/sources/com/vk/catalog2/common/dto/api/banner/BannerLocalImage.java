package com.vk.catalog2.common.dto.api.banner;

import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.j5g;
import xsna.shy;
import xsna.zrp;

/* compiled from: BannerLocalImage.kt */
/* loaded from: classes16.dex */
public final class BannerLocalImage extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<BannerLocalImage> CREATOR = new a();
    public final int b;
    public final int c;
    public final Radius d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerLocalImage.kt */
    public static final class Radius {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Radius[] $VALUES;
        public static final Radius Large;
        public static final Radius Medium;
        public static final Radius Small;

        static {
            Radius radius = new Radius("Small", 0);
            Small = radius;
            Radius radius2 = new Radius("Medium", 1);
            Medium = radius2;
            Radius radius3 = new Radius("Large", 2);
            Large = radius3;
            Radius[] radiusArr = {radius, radius2, radius3};
            $VALUES = radiusArr;
            $ENTRIES = new asp(radiusArr);
        }

        public Radius() {
            throw null;
        }

        public static zrp<Radius> h() {
            return $ENTRIES;
        }

        public static Radius valueOf(String str) {
            return (Radius) Enum.valueOf(Radius.class, str);
        }

        public static Radius[] values() {
            return (Radius[]) $VALUES.clone();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BannerLocalImage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BannerLocalImage a(Serializer serializer) {
            return new BannerLocalImage(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BannerLocalImage[i];
        }
    }

    public BannerLocalImage(int i, int i2, Radius radius) {
        this.b = i;
        this.c = i2;
        this.d = radius;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.S(this.d.ordinal());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerLocalImage)) {
            return false;
        }
        BannerLocalImage bannerLocalImage = (BannerLocalImage) obj;
        return this.b == bannerLocalImage.b && this.c == bannerLocalImage.c && this.d == bannerLocalImage.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return "BannerLocalImage(resId=" + this.b + ", sizeDp=" + this.c + ", radius=" + this.d + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BannerLocalImage(Serializer serializer) {
        this(r0, r1, r4 == null ? Radius.Small : r4);
        int u = serializer.u();
        int u2 = serializer.u();
        Radius radius = (Radius) j5g.b0(serializer.u(), Radius.h());
    }
}
