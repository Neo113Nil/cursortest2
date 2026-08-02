package com.vk.superapp.advertisement.api.dto;

import xsna.asp;
import xsna.zrp;

/* compiled from: BannerAdUiData.kt */
/* loaded from: classes6.dex */
public final class BannerAdUiData {
    public static final BannerAdUiData g;
    public final LayoutType a;
    public final LayoutType b;
    public final BannerLocation c;
    public final BannerAlign d;
    public final HeightType e;
    public final Orientation f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerAdUiData.kt */
    public static final class BannerAlign {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BannerAlign[] $VALUES;
        public static final BannerAlign CENTER;
        public static final a Companion;
        public static final BannerAlign LEFT;
        public static final BannerAlign RIGHT;
        public static final BannerAlign UNSPECIFIED;

        /* compiled from: BannerAdUiData.kt */
        public static final class a {
        }

        static {
            BannerAlign bannerAlign = new BannerAlign("LEFT", 0);
            LEFT = bannerAlign;
            BannerAlign bannerAlign2 = new BannerAlign("CENTER", 1);
            CENTER = bannerAlign2;
            BannerAlign bannerAlign3 = new BannerAlign("RIGHT", 2);
            RIGHT = bannerAlign3;
            BannerAlign bannerAlign4 = new BannerAlign("UNSPECIFIED", 3);
            UNSPECIFIED = bannerAlign4;
            BannerAlign[] bannerAlignArr = {bannerAlign, bannerAlign2, bannerAlign3, bannerAlign4};
            $VALUES = bannerAlignArr;
            $ENTRIES = new asp(bannerAlignArr);
            Companion = new a();
        }

        public BannerAlign() {
            throw null;
        }

        public static BannerAlign valueOf(String str) {
            return (BannerAlign) Enum.valueOf(BannerAlign.class, str);
        }

        public static BannerAlign[] values() {
            return (BannerAlign[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerAdUiData.kt */
    public static final class BannerLocation {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BannerLocation[] $VALUES;
        public static final BannerLocation BOTTOM;
        public static final BannerLocation TOP;

        static {
            BannerLocation bannerLocation = new BannerLocation("TOP", 0);
            TOP = bannerLocation;
            BannerLocation bannerLocation2 = new BannerLocation("BOTTOM", 1);
            BOTTOM = bannerLocation2;
            BannerLocation[] bannerLocationArr = {bannerLocation, bannerLocation2};
            $VALUES = bannerLocationArr;
            $ENTRIES = new asp(bannerLocationArr);
        }

        public BannerLocation() {
            throw null;
        }

        public static BannerLocation valueOf(String str) {
            return (BannerLocation) Enum.valueOf(BannerLocation.class, str);
        }

        public static BannerLocation[] values() {
            return (BannerLocation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerAdUiData.kt */
    public static final class HeightType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HeightType[] $VALUES;
        public static final HeightType COMPACT;
        public static final HeightType REGULAR;
        public static final HeightType UNSPECIFIED;

        static {
            HeightType heightType = new HeightType("COMPACT", 0);
            COMPACT = heightType;
            HeightType heightType2 = new HeightType("REGULAR", 1);
            REGULAR = heightType2;
            HeightType heightType3 = new HeightType("UNSPECIFIED", 2);
            UNSPECIFIED = heightType3;
            HeightType[] heightTypeArr = {heightType, heightType2, heightType3};
            $VALUES = heightTypeArr;
            $ENTRIES = new asp(heightTypeArr);
        }

        public HeightType() {
            throw null;
        }

        public static HeightType valueOf(String str) {
            return (HeightType) Enum.valueOf(HeightType.class, str);
        }

        public static HeightType[] values() {
            return (HeightType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerAdUiData.kt */
    public static final class LayoutType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LayoutType[] $VALUES;
        public static final LayoutType OVERLAY;
        public static final LayoutType RESIZE;

        static {
            LayoutType layoutType = new LayoutType("RESIZE", 0);
            RESIZE = layoutType;
            LayoutType layoutType2 = new LayoutType("OVERLAY", 1);
            OVERLAY = layoutType2;
            LayoutType[] layoutTypeArr = {layoutType, layoutType2};
            $VALUES = layoutTypeArr;
            $ENTRIES = new asp(layoutTypeArr);
        }

        public LayoutType() {
            throw null;
        }

        public static LayoutType valueOf(String str) {
            return (LayoutType) Enum.valueOf(LayoutType.class, str);
        }

        public static LayoutType[] values() {
            return (LayoutType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerAdUiData.kt */
    public static final class Orientation {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Orientation[] $VALUES;
        public static final a Companion;
        public static final Orientation HORIZONTAL;
        public static final Orientation UNSPECIFIED;
        public static final Orientation VERTICAL;

        /* compiled from: BannerAdUiData.kt */
        public static final class a {
        }

        static {
            Orientation orientation = new Orientation("HORIZONTAL", 0);
            HORIZONTAL = orientation;
            Orientation orientation2 = new Orientation("VERTICAL", 1);
            VERTICAL = orientation2;
            Orientation orientation3 = new Orientation("UNSPECIFIED", 2);
            UNSPECIFIED = orientation3;
            Orientation[] orientationArr = {orientation, orientation2, orientation3};
            $VALUES = orientationArr;
            $ENTRIES = new asp(orientationArr);
            Companion = new a();
        }

        public Orientation() {
            throw null;
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) $VALUES.clone();
        }
    }

    static {
        LayoutType layoutType = LayoutType.RESIZE;
        g = new BannerAdUiData(layoutType, layoutType, BannerLocation.BOTTOM, BannerAlign.UNSPECIFIED, HeightType.UNSPECIFIED, Orientation.UNSPECIFIED);
    }

    public BannerAdUiData(LayoutType layoutType, LayoutType layoutType2, BannerLocation bannerLocation, BannerAlign bannerAlign, HeightType heightType, Orientation orientation) {
        this.a = layoutType;
        this.b = layoutType2;
        this.c = bannerLocation;
        this.d = bannerAlign;
        this.e = heightType;
        this.f = orientation;
    }

    public static BannerAdUiData a(BannerAdUiData bannerAdUiData, LayoutType layoutType, LayoutType layoutType2, BannerLocation bannerLocation, BannerAlign bannerAlign, int i) {
        if ((i & 1) != 0) {
            layoutType = bannerAdUiData.a;
        }
        LayoutType layoutType3 = layoutType;
        if ((i & 2) != 0) {
            layoutType2 = bannerAdUiData.b;
        }
        LayoutType layoutType4 = layoutType2;
        if ((i & 4) != 0) {
            bannerLocation = bannerAdUiData.c;
        }
        BannerLocation bannerLocation2 = bannerLocation;
        if ((i & 8) != 0) {
            bannerAlign = bannerAdUiData.d;
        }
        return new BannerAdUiData(layoutType3, layoutType4, bannerLocation2, bannerAlign, bannerAdUiData.e, bannerAdUiData.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdUiData)) {
            return false;
        }
        BannerAdUiData bannerAdUiData = (BannerAdUiData) obj;
        return this.a == bannerAdUiData.a && this.b == bannerAdUiData.b && this.c == bannerAdUiData.c && this.d == bannerAdUiData.d && this.e == bannerAdUiData.e && this.f == bannerAdUiData.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BannerAdUiData(layoutType=" + this.a + ", landscapeLayoutType=" + this.b + ", bannerLocation=" + this.c + ", bannerAlign=" + this.d + ", heightType=" + this.e + ", orientation=" + this.f + ')';
    }
}
