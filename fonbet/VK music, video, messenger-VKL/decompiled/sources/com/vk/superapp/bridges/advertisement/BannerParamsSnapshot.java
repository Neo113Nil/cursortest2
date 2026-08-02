package com.vk.superapp.bridges.advertisement;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.qoy;
import xsna.rl3;
import xsna.shy;
import xsna.zrp;

/* compiled from: BannerParamsSnapshot.kt */
/* loaded from: classes6.dex */
public final class BannerParamsSnapshot implements Parcelable {
    public static final Parcelable.Creator<BannerParamsSnapshot> CREATOR = new a();
    public final int b;
    public final int c;
    public final boolean d;
    public final LayoutType e;
    public final BannerLocation f;
    public final BannerAlign g;
    public final HeightType h;
    public final Orientation i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerParamsSnapshot.kt */
    public static final class BannerAlign {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BannerAlign[] $VALUES;
        public static final BannerAlign CENTER;
        public static final a Companion;
        public static final BannerAlign LEFT;
        public static final BannerAlign RIGHT;

        /* compiled from: BannerParamsSnapshot.kt */
        public static final class a {
        }

        static {
            BannerAlign bannerAlign = new BannerAlign("LEFT", 0);
            LEFT = bannerAlign;
            BannerAlign bannerAlign2 = new BannerAlign("CENTER", 1);
            CENTER = bannerAlign2;
            BannerAlign bannerAlign3 = new BannerAlign("RIGHT", 2);
            RIGHT = bannerAlign3;
            BannerAlign[] bannerAlignArr = {bannerAlign, bannerAlign2, bannerAlign3};
            $VALUES = bannerAlignArr;
            $ENTRIES = new asp(bannerAlignArr);
            Companion = new a();
        }

        public BannerAlign() {
            throw null;
        }

        public static zrp<BannerAlign> h() {
            return $ENTRIES;
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
    /* compiled from: BannerParamsSnapshot.kt */
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

        public static zrp<BannerLocation> h() {
            return $ENTRIES;
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
    /* compiled from: BannerParamsSnapshot.kt */
    public static final class HeightType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HeightType[] $VALUES;
        public static final HeightType COMPACT;
        public static final a Companion;
        public static final HeightType REGULAR;

        /* compiled from: BannerParamsSnapshot.kt */
        public static final class a {
        }

        static {
            HeightType heightType = new HeightType("COMPACT", 0);
            COMPACT = heightType;
            HeightType heightType2 = new HeightType("REGULAR", 1);
            REGULAR = heightType2;
            HeightType[] heightTypeArr = {heightType, heightType2};
            $VALUES = heightTypeArr;
            $ENTRIES = new asp(heightTypeArr);
            Companion = new a();
        }

        public HeightType() {
            throw null;
        }

        public static zrp<HeightType> h() {
            return $ENTRIES;
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
    /* compiled from: BannerParamsSnapshot.kt */
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

        public static zrp<LayoutType> h() {
            return $ENTRIES;
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
    /* compiled from: BannerParamsSnapshot.kt */
    public static final class Orientation {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Orientation[] $VALUES;
        public static final a Companion;
        public static final Orientation HORIZONTAL;
        public static final Orientation VERTICAL;

        /* compiled from: BannerParamsSnapshot.kt */
        public static final class a {
        }

        static {
            Orientation orientation = new Orientation("HORIZONTAL", 0);
            HORIZONTAL = orientation;
            Orientation orientation2 = new Orientation("VERTICAL", 1);
            VERTICAL = orientation2;
            Orientation[] orientationArr = {orientation, orientation2};
            $VALUES = orientationArr;
            $ENTRIES = new asp(orientationArr);
            Companion = new a();
        }

        public Orientation() {
            throw null;
        }

        public static zrp<Orientation> h() {
            return $ENTRIES;
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) $VALUES.clone();
        }
    }

    /* compiled from: BannerParamsSnapshot.kt */
    public static final class a implements Parcelable.Creator<BannerParamsSnapshot> {
        @Override // android.os.Parcelable.Creator
        public final BannerParamsSnapshot createFromParcel(Parcel parcel) {
            return new BannerParamsSnapshot(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BannerParamsSnapshot[] newArray(int i) {
            return new BannerParamsSnapshot[i];
        }
    }

    public BannerParamsSnapshot(int i, int i2, boolean z, LayoutType layoutType, BannerLocation bannerLocation, BannerAlign bannerAlign, HeightType heightType, Orientation orientation) {
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = layoutType;
        this.f = bannerLocation;
        this.g = bannerAlign;
        this.h = heightType;
        this.i = orientation;
    }

    public final BannerParamsSnapshot d() {
        if (this.i != null) {
            return this;
        }
        Orientation.Companion.getClass();
        return new BannerParamsSnapshot(this.b, this.c, this.d, this.e, this.f, this.g, this.h, Orientation.HORIZONTAL);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerParamsSnapshot)) {
            return false;
        }
        BannerParamsSnapshot bannerParamsSnapshot = (BannerParamsSnapshot) obj;
        return this.b == bannerParamsSnapshot.b && this.c == bannerParamsSnapshot.c && this.d == bannerParamsSnapshot.d && this.e == bannerParamsSnapshot.e && this.f == bannerParamsSnapshot.f && this.g == bannerParamsSnapshot.g && this.h == bannerParamsSnapshot.h && this.i == bannerParamsSnapshot.i;
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d);
        LayoutType layoutType = this.e;
        int hashCode = (b + (layoutType == null ? 0 : layoutType.hashCode())) * 31;
        BannerLocation bannerLocation = this.f;
        int hashCode2 = (hashCode + (bannerLocation == null ? 0 : bannerLocation.hashCode())) * 31;
        BannerAlign bannerAlign = this.g;
        int hashCode3 = (hashCode2 + (bannerAlign == null ? 0 : bannerAlign.hashCode())) * 31;
        HeightType heightType = this.h;
        int hashCode4 = (hashCode3 + (heightType == null ? 0 : heightType.hashCode())) * 31;
        Orientation orientation = this.i;
        return hashCode4 + (orientation != null ? orientation.hashCode() : 0);
    }

    public final String toString() {
        return "BannerParamsSnapshot(bannerWidth=" + this.b + ", bannerHeight=" + this.c + ", isDeviceOrientationPortrait=" + this.d + ", layoutType=" + this.e + ", bannerLocation=" + this.f + ", bannerAlign=" + this.g + ", heightType=" + this.h + ", orientation=" + this.i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        LayoutType layoutType = this.e;
        parcel.writeInt(layoutType != null ? layoutType.ordinal() : -1);
        BannerLocation bannerLocation = this.f;
        parcel.writeInt(bannerLocation != null ? bannerLocation.ordinal() : -1);
        BannerAlign bannerAlign = this.g;
        parcel.writeInt(bannerAlign != null ? bannerAlign.ordinal() : -1);
        HeightType heightType = this.h;
        parcel.writeInt(heightType != null ? heightType.ordinal() : -1);
        Orientation orientation = this.i;
        parcel.writeInt(orientation != null ? orientation.ordinal() : -1);
    }

    public BannerParamsSnapshot(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt() == 1, (LayoutType) rl3.S(parcel.readInt(), LayoutType.h().toArray(new LayoutType[0])), (BannerLocation) rl3.S(parcel.readInt(), BannerLocation.h().toArray(new BannerLocation[0])), (BannerAlign) rl3.S(parcel.readInt(), BannerAlign.h().toArray(new BannerAlign[0])), (HeightType) rl3.S(parcel.readInt(), HeightType.h().toArray(new HeightType[0])), (Orientation) rl3.S(parcel.readInt(), Orientation.h().toArray(new Orientation[0])));
    }
}
