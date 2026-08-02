package com.vk.api.generated.artist.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ArtistGetArtistPromoResponseDto.kt */
/* loaded from: classes14.dex */
public final class ArtistGetArtistPromoResponseDto implements Parcelable {
    public static final Parcelable.Creator<ArtistGetArtistPromoResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<ArtistArtistPromoDto> items;

    @pmi0("relevant")
    private final ArtistArtistPromoDto relevant;

    /* compiled from: ArtistGetArtistPromoResponseDto.kt */
    public static final class a implements Parcelable.Creator<ArtistGetArtistPromoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ArtistGetArtistPromoResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ArtistArtistPromoDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ArtistGetArtistPromoResponseDto(arrayList, parcel.readInt() == 0 ? null : ArtistArtistPromoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ArtistGetArtistPromoResponseDto[] newArray(int i) {
            return new ArtistGetArtistPromoResponseDto[i];
        }
    }

    public ArtistGetArtistPromoResponseDto(List<ArtistArtistPromoDto> list, ArtistArtistPromoDto artistArtistPromoDto) {
        this.items = list;
        this.relevant = artistArtistPromoDto;
    }

    public final List<ArtistArtistPromoDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ArtistArtistPromoDto e() {
        return this.relevant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtistGetArtistPromoResponseDto)) {
            return false;
        }
        ArtistGetArtistPromoResponseDto artistGetArtistPromoResponseDto = (ArtistGetArtistPromoResponseDto) obj;
        return epx.f(this.items, artistGetArtistPromoResponseDto.items) && epx.f(this.relevant, artistGetArtistPromoResponseDto.relevant);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        ArtistArtistPromoDto artistArtistPromoDto = this.relevant;
        return hashCode + (artistArtistPromoDto == null ? 0 : artistArtistPromoDto.hashCode());
    }

    public final String toString() {
        return "ArtistGetArtistPromoResponseDto(items=" + this.items + ", relevant=" + this.relevant + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ArtistArtistPromoDto) a2.next()).writeToParcel(parcel, i);
        }
        ArtistArtistPromoDto artistArtistPromoDto = this.relevant;
        if (artistArtistPromoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            artistArtistPromoDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ArtistGetArtistPromoResponseDto(List list, ArtistArtistPromoDto artistArtistPromoDto, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : artistArtistPromoDto);
    }
}
