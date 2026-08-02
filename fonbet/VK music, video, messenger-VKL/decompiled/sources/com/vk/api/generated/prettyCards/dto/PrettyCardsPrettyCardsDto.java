package com.vk.api.generated.prettyCards.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: PrettyCardsPrettyCardsDto.kt */
/* loaded from: classes15.dex */
public final class PrettyCardsPrettyCardsDto implements Parcelable {
    public static final Parcelable.Creator<PrettyCardsPrettyCardsDto> CREATOR = new a();

    @pmi0("cards")
    private final List<PrettyCardsPrettyCardDto> cards;

    /* compiled from: PrettyCardsPrettyCardsDto.kt */
    public static final class a implements Parcelable.Creator<PrettyCardsPrettyCardsDto> {
        @Override // android.os.Parcelable.Creator
        public final PrettyCardsPrettyCardsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(PrettyCardsPrettyCardDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new PrettyCardsPrettyCardsDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PrettyCardsPrettyCardsDto[] newArray(int i) {
            return new PrettyCardsPrettyCardsDto[i];
        }
    }

    public PrettyCardsPrettyCardsDto(List<PrettyCardsPrettyCardDto> list) {
        this.cards = list;
    }

    public final List<PrettyCardsPrettyCardDto> d() {
        return this.cards;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrettyCardsPrettyCardsDto) && epx.f(this.cards, ((PrettyCardsPrettyCardsDto) obj).cards);
    }

    public final int hashCode() {
        return this.cards.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("PrettyCardsPrettyCardsDto(cards="), this.cards);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.cards);
        while (a2.hasNext()) {
            ((PrettyCardsPrettyCardDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
