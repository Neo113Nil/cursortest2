package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ActionLinksSaveLinksResponseDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksSaveLinksResponseDto implements Parcelable {
    public static final Parcelable.Creator<ActionLinksSaveLinksResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<ActionLinksActionDto> items;

    /* compiled from: ActionLinksSaveLinksResponseDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksSaveLinksResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksSaveLinksResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ActionLinksSaveLinksResponseDto.class, parcel, arrayList, i, 1);
            }
            return new ActionLinksSaveLinksResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksSaveLinksResponseDto[] newArray(int i) {
            return new ActionLinksSaveLinksResponseDto[i];
        }
    }

    public ActionLinksSaveLinksResponseDto(List<ActionLinksActionDto> list) {
        this.items = list;
    }

    public final List<ActionLinksActionDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionLinksSaveLinksResponseDto) && epx.f(this.items, ((ActionLinksSaveLinksResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ActionLinksSaveLinksResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
