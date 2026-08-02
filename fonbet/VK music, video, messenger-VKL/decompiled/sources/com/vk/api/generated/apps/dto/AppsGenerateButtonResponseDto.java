package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersProfileButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AppsGenerateButtonResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGenerateButtonResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGenerateButtonResponseDto> CREATOR = new a();

    @pmi0("third_party_buttons_guest")
    private final List<UsersProfileButtonDto> thirdPartyButtonsGuest;

    @pmi0("third_party_buttons_own_profile")
    private final List<UsersProfileButtonDto> thirdPartyButtonsOwnProfile;

    /* compiled from: AppsGenerateButtonResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGenerateButtonResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGenerateButtonResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(AppsGenerateButtonResponseDto.class, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = bo.b(AppsGenerateButtonResponseDto.class, parcel, arrayList2, i, 1);
            }
            return new AppsGenerateButtonResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGenerateButtonResponseDto[] newArray(int i) {
            return new AppsGenerateButtonResponseDto[i];
        }
    }

    public AppsGenerateButtonResponseDto(List<UsersProfileButtonDto> list, List<UsersProfileButtonDto> list2) {
        this.thirdPartyButtonsOwnProfile = list;
        this.thirdPartyButtonsGuest = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGenerateButtonResponseDto)) {
            return false;
        }
        AppsGenerateButtonResponseDto appsGenerateButtonResponseDto = (AppsGenerateButtonResponseDto) obj;
        return epx.f(this.thirdPartyButtonsOwnProfile, appsGenerateButtonResponseDto.thirdPartyButtonsOwnProfile) && epx.f(this.thirdPartyButtonsGuest, appsGenerateButtonResponseDto.thirdPartyButtonsGuest);
    }

    public final int hashCode() {
        return this.thirdPartyButtonsGuest.hashCode() + (this.thirdPartyButtonsOwnProfile.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGenerateButtonResponseDto(thirdPartyButtonsOwnProfile=");
        sb.append(this.thirdPartyButtonsOwnProfile);
        sb.append(", thirdPartyButtonsGuest=");
        return ms9.a(')', sb, this.thirdPartyButtonsGuest);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.thirdPartyButtonsOwnProfile);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.thirdPartyButtonsGuest);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
    }
}
