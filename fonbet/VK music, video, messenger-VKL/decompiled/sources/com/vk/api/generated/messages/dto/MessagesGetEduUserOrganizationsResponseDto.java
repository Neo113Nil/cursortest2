package com.vk.api.generated.messages.dto;

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

/* compiled from: MessagesGetEduUserOrganizationsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetEduUserOrganizationsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetEduUserOrganizationsResponseDto> CREATOR = new a();

    @pmi0("organizations")
    private final List<MessagesEduUserOrganizationDto> organizations;

    /* compiled from: MessagesGetEduUserOrganizationsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetEduUserOrganizationsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetEduUserOrganizationsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesEduUserOrganizationDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesGetEduUserOrganizationsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetEduUserOrganizationsResponseDto[] newArray(int i) {
            return new MessagesGetEduUserOrganizationsResponseDto[i];
        }
    }

    public MessagesGetEduUserOrganizationsResponseDto(List<MessagesEduUserOrganizationDto> list) {
        this.organizations = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesGetEduUserOrganizationsResponseDto) && epx.f(this.organizations, ((MessagesGetEduUserOrganizationsResponseDto) obj).organizations);
    }

    public final int hashCode() {
        return this.organizations.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesGetEduUserOrganizationsResponseDto(organizations="), this.organizations);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.organizations);
        while (a2.hasNext()) {
            ((MessagesEduUserOrganizationDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
