package com.vk.api.generated.messagesEdu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesEduGetTransitionOnboardingBannersResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduGetTransitionOnboardingBannersResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduGetTransitionOnboardingBannersResponseDto> CREATOR = new a();

    @pmi0("banners")
    private final List<MessagesEduTransitionOnboardingBannerDto> banners;

    @pmi0("not_changed")
    private final Boolean notChanged;

    @pmi0("version_hash")
    private final String versionHash;

    /* compiled from: MessagesEduGetTransitionOnboardingBannersResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduGetTransitionOnboardingBannersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduGetTransitionOnboardingBannersResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesEduTransitionOnboardingBannerDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesEduGetTransitionOnboardingBannersResponseDto(arrayList, readString, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduGetTransitionOnboardingBannersResponseDto[] newArray(int i) {
            return new MessagesEduGetTransitionOnboardingBannersResponseDto[i];
        }
    }

    public MessagesEduGetTransitionOnboardingBannersResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduGetTransitionOnboardingBannersResponseDto)) {
            return false;
        }
        MessagesEduGetTransitionOnboardingBannersResponseDto messagesEduGetTransitionOnboardingBannersResponseDto = (MessagesEduGetTransitionOnboardingBannersResponseDto) obj;
        return epx.f(this.banners, messagesEduGetTransitionOnboardingBannersResponseDto.banners) && epx.f(this.versionHash, messagesEduGetTransitionOnboardingBannersResponseDto.versionHash) && epx.f(this.notChanged, messagesEduGetTransitionOnboardingBannersResponseDto.notChanged);
    }

    public final int hashCode() {
        List<MessagesEduTransitionOnboardingBannerDto> list = this.banners;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.versionHash;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.notChanged;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduGetTransitionOnboardingBannersResponseDto(banners=");
        sb.append(this.banners);
        sb.append(", versionHash=");
        sb.append(this.versionHash);
        sb.append(", notChanged=");
        return tn.a(sb, this.notChanged, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MessagesEduTransitionOnboardingBannerDto> list = this.banners;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesEduTransitionOnboardingBannerDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.versionHash);
        Boolean bool = this.notChanged;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public MessagesEduGetTransitionOnboardingBannersResponseDto(List<MessagesEduTransitionOnboardingBannerDto> list, String str, Boolean bool) {
        this.banners = list;
        this.versionHash = str;
        this.notChanged = bool;
    }

    public /* synthetic */ MessagesEduGetTransitionOnboardingBannersResponseDto(List list, String str, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool);
    }
}
