package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NewsfeedPromotionListDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedPromotionListDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedPromotionListDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("is_unavailable")
    private final Boolean isUnavailable;

    @pmi0("title")
    private final String title;

    /* compiled from: NewsfeedPromotionListDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedPromotionListDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedPromotionListDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NewsfeedPromotionListDto(readString, readString2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedPromotionListDto[] newArray(int i) {
            return new NewsfeedPromotionListDto[i];
        }
    }

    public NewsfeedPromotionListDto(String str, String str2, Boolean bool, Boolean bool2) {
        this.id = str;
        this.title = str2;
        this.isHidden = bool;
        this.isUnavailable = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedPromotionListDto)) {
            return false;
        }
        NewsfeedPromotionListDto newsfeedPromotionListDto = (NewsfeedPromotionListDto) obj;
        return epx.f(this.id, newsfeedPromotionListDto.id) && epx.f(this.title, newsfeedPromotionListDto.title) && epx.f(this.isHidden, newsfeedPromotionListDto.isHidden) && epx.f(this.isUnavailable, newsfeedPromotionListDto.isUnavailable);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.id.hashCode() * 31, 31, this.title);
        Boolean bool = this.isHidden;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isUnavailable;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedPromotionListDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isHidden=");
        sb.append(this.isHidden);
        sb.append(", isUnavailable=");
        return tn.a(sb, this.isUnavailable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isUnavailable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ NewsfeedPromotionListDto(String str, String str2, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2);
    }
}
