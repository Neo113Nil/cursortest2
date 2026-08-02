package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.pmi0;

/* compiled from: StickersStickerPopupDto.kt */
/* loaded from: classes15.dex */
public final class StickersStickerPopupDto implements Parcelable {
    public static final Parcelable.Creator<StickersStickerPopupDto> CREATOR = new a();

    @pmi0("autoplay")
    private final boolean autoplay;

    @pmi0("layers")
    private final List<StickersStickerPopupLayerDto> layers;

    /* compiled from: StickersStickerPopupDto.kt */
    public static final class a implements Parcelable.Creator<StickersStickerPopupDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersStickerPopupDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(StickersStickerPopupDto.class, parcel, arrayList, i, 1);
            }
            return new StickersStickerPopupDto(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersStickerPopupDto[] newArray(int i) {
            return new StickersStickerPopupDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickersStickerPopupDto(List<? extends StickersStickerPopupLayerDto> list, boolean z) {
        this.layers = list;
        this.autoplay = z;
    }

    public final boolean d() {
        return this.autoplay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<StickersStickerPopupLayerDto> e() {
        return this.layers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersStickerPopupDto)) {
            return false;
        }
        StickersStickerPopupDto stickersStickerPopupDto = (StickersStickerPopupDto) obj;
        return epx.f(this.layers, stickersStickerPopupDto.layers) && this.autoplay == stickersStickerPopupDto.autoplay;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.autoplay) + (this.layers.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersStickerPopupDto(layers=");
        sb.append(this.layers);
        sb.append(", autoplay=");
        return q0.a(sb, this.autoplay, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.layers);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.autoplay ? 1 : 0);
    }
}
