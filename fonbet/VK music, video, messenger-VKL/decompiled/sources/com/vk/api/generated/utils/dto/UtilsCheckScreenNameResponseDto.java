package com.vk.api.generated.utils.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsCheckScreenNameResponseDto.kt */
/* loaded from: classes15.dex */
public final class UtilsCheckScreenNameResponseDto implements Parcelable {
    public static final Parcelable.Creator<UtilsCheckScreenNameResponseDto> CREATOR = new a();

    @pmi0("domain_faq_url")
    private final String domainFaqUrl;

    @pmi0("reason")
    private final String reason;

    @pmi0("status")
    private final BaseBoolIntDto status;

    @pmi0("suggestions")
    private final UtilsScreenNameSuggestionsDto suggestions;

    /* compiled from: UtilsCheckScreenNameResponseDto.kt */
    public static final class a implements Parcelable.Creator<UtilsCheckScreenNameResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final UtilsCheckScreenNameResponseDto createFromParcel(Parcel parcel) {
            return new UtilsCheckScreenNameResponseDto((BaseBoolIntDto) parcel.readParcelable(UtilsCheckScreenNameResponseDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UtilsScreenNameSuggestionsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UtilsCheckScreenNameResponseDto[] newArray(int i) {
            return new UtilsCheckScreenNameResponseDto[i];
        }
    }

    public UtilsCheckScreenNameResponseDto(BaseBoolIntDto baseBoolIntDto, String str, String str2, UtilsScreenNameSuggestionsDto utilsScreenNameSuggestionsDto) {
        this.status = baseBoolIntDto;
        this.reason = str;
        this.domainFaqUrl = str2;
        this.suggestions = utilsScreenNameSuggestionsDto;
    }

    public final String d() {
        return this.reason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsCheckScreenNameResponseDto)) {
            return false;
        }
        UtilsCheckScreenNameResponseDto utilsCheckScreenNameResponseDto = (UtilsCheckScreenNameResponseDto) obj;
        return this.status == utilsCheckScreenNameResponseDto.status && epx.f(this.reason, utilsCheckScreenNameResponseDto.reason) && epx.f(this.domainFaqUrl, utilsCheckScreenNameResponseDto.domainFaqUrl) && epx.f(this.suggestions, utilsCheckScreenNameResponseDto.suggestions);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.reason;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.domainFaqUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UtilsScreenNameSuggestionsDto utilsScreenNameSuggestionsDto = this.suggestions;
        return hashCode3 + (utilsScreenNameSuggestionsDto != null ? utilsScreenNameSuggestionsDto.hashCode() : 0);
    }

    public final String toString() {
        return "UtilsCheckScreenNameResponseDto(status=" + this.status + ", reason=" + this.reason + ", domainFaqUrl=" + this.domainFaqUrl + ", suggestions=" + this.suggestions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.status, i);
        parcel.writeString(this.reason);
        parcel.writeString(this.domainFaqUrl);
        UtilsScreenNameSuggestionsDto utilsScreenNameSuggestionsDto = this.suggestions;
        if (utilsScreenNameSuggestionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            utilsScreenNameSuggestionsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ UtilsCheckScreenNameResponseDto(BaseBoolIntDto baseBoolIntDto, String str, String str2, UtilsScreenNameSuggestionsDto utilsScreenNameSuggestionsDto, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : utilsScreenNameSuggestionsDto);
    }
}
