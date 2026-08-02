package com.vk.dto.newsfeed.entries.post;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.so;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AttachmentsMeta.kt */
/* loaded from: classes18.dex */
public final class AttachmentsMeta implements Serializer.StreamParcelable {
    public static final Serializer.c<AttachmentsMeta> CREATOR = new a();
    public final PrimaryMode b;
    public final float c;
    public final CarouselLayout d;
    public final Float e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AttachmentsMeta.kt */
    public static final class CarouselLayout {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CarouselLayout[] $VALUES;
        public static final CarouselLayout ROUNDED;
        public static final CarouselLayout WIDE;

        static {
            CarouselLayout carouselLayout = new CarouselLayout("ROUNDED", 0);
            ROUNDED = carouselLayout;
            CarouselLayout carouselLayout2 = new CarouselLayout("WIDE", 1);
            WIDE = carouselLayout2;
            CarouselLayout[] carouselLayoutArr = {carouselLayout, carouselLayout2};
            $VALUES = carouselLayoutArr;
            $ENTRIES = new asp(carouselLayoutArr);
        }

        public CarouselLayout() {
            throw null;
        }

        public static CarouselLayout valueOf(String str) {
            return (CarouselLayout) Enum.valueOf(CarouselLayout.class, str);
        }

        public static CarouselLayout[] values() {
            return (CarouselLayout[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AttachmentsMeta.kt */
    public static final class PrimaryMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PrimaryMode[] $VALUES;
        public static final PrimaryMode CAROUSEL;
        public static final PrimaryMode GRID;
        public static final PrimaryMode SINGLE;

        static {
            PrimaryMode primaryMode = new PrimaryMode("SINGLE", 0);
            SINGLE = primaryMode;
            PrimaryMode primaryMode2 = new PrimaryMode(SignalingProtocol.KEY_GRID, 1);
            GRID = primaryMode2;
            PrimaryMode primaryMode3 = new PrimaryMode("CAROUSEL", 2);
            CAROUSEL = primaryMode3;
            PrimaryMode[] primaryModeArr = {primaryMode, primaryMode2, primaryMode3};
            $VALUES = primaryModeArr;
            $ENTRIES = new asp(primaryModeArr);
        }

        public PrimaryMode() {
            throw null;
        }

        public static PrimaryMode valueOf(String str) {
            return (PrimaryMode) Enum.valueOf(PrimaryMode.class, str);
        }

        public static PrimaryMode[] values() {
            return (PrimaryMode[]) $VALUES.clone();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachmentsMeta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachmentsMeta a(Serializer serializer) {
            return new AttachmentsMeta((PrimaryMode) serializer.C(), serializer.s(), (CarouselLayout) serializer.C(), serializer.t());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachmentsMeta[i];
        }
    }

    public AttachmentsMeta(PrimaryMode primaryMode, float f, CarouselLayout carouselLayout, Float f2) {
        this.b = primaryMode;
        this.c = f;
        this.d = carouselLayout;
        this.e = f2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.P(this.c);
        serializer.g0(this.d);
        serializer.R(this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentsMeta)) {
            return false;
        }
        AttachmentsMeta attachmentsMeta = (AttachmentsMeta) obj;
        return this.b == attachmentsMeta.b && Float.compare(this.c, attachmentsMeta.c) == 0 && this.d == attachmentsMeta.d && epx.f(this.e, attachmentsMeta.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + b.a(this.c, this.b.hashCode() * 31, 31)) * 31;
        Float f = this.e;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachmentsMeta(primaryMode=");
        sb.append(this.b);
        sb.append(", carouselRatio=");
        sb.append(this.c);
        sb.append(", carouselLayout=");
        sb.append(this.d);
        sb.append(", ratio=");
        return so.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ AttachmentsMeta(PrimaryMode primaryMode, float f, CarouselLayout carouselLayout, Float f2, int i, zcl zclVar) {
        this(primaryMode, f, carouselLayout, (i & 8) != 0 ? null : f2);
    }
}
