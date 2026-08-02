package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AtumVkuiRemoteImageViewPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiRemoteImageViewPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiRemoteImageViewPropsDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("ignore_transition")
    private final Boolean ignoreTransition;

    @pmi0("placeholder")
    private final AtumVkuiRemoteImageViewPlaceholderDto placeholder;

    @pmi0("url")
    private final String url;

    /* compiled from: AtumVkuiRemoteImageViewPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiRemoteImageViewPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiRemoteImageViewPropsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AtumVkuiRemoteImageViewPropsDto(readString, valueOf, (AtumVkuiRemoteImageViewPlaceholderDto) parcel.readParcelable(AtumVkuiRemoteImageViewPropsDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiRemoteImageViewPropsDto[] newArray(int i) {
            return new AtumVkuiRemoteImageViewPropsDto[i];
        }
    }

    public AtumVkuiRemoteImageViewPropsDto(String str, Boolean bool, AtumVkuiRemoteImageViewPlaceholderDto atumVkuiRemoteImageViewPlaceholderDto, String str2) {
        this.url = str;
        this.ignoreTransition = bool;
        this.placeholder = atumVkuiRemoteImageViewPlaceholderDto;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiRemoteImageViewPropsDto)) {
            return false;
        }
        AtumVkuiRemoteImageViewPropsDto atumVkuiRemoteImageViewPropsDto = (AtumVkuiRemoteImageViewPropsDto) obj;
        return epx.f(this.url, atumVkuiRemoteImageViewPropsDto.url) && epx.f(this.ignoreTransition, atumVkuiRemoteImageViewPropsDto.ignoreTransition) && epx.f(this.placeholder, atumVkuiRemoteImageViewPropsDto.placeholder) && epx.f(this.description, atumVkuiRemoteImageViewPropsDto.description);
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        Boolean bool = this.ignoreTransition;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        AtumVkuiRemoteImageViewPlaceholderDto atumVkuiRemoteImageViewPlaceholderDto = this.placeholder;
        int hashCode3 = (hashCode2 + (atumVkuiRemoteImageViewPlaceholderDto == null ? 0 : atumVkuiRemoteImageViewPlaceholderDto.hashCode())) * 31;
        String str = this.description;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumVkuiRemoteImageViewPropsDto(url=");
        sb.append(this.url);
        sb.append(", ignoreTransition=");
        sb.append(this.ignoreTransition);
        sb.append(", placeholder=");
        sb.append(this.placeholder);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        Boolean bool = this.ignoreTransition;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.placeholder, i);
        parcel.writeString(this.description);
    }

    public /* synthetic */ AtumVkuiRemoteImageViewPropsDto(String str, Boolean bool, AtumVkuiRemoteImageViewPlaceholderDto atumVkuiRemoteImageViewPlaceholderDto, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : atumVkuiRemoteImageViewPlaceholderDto, (i & 8) != 0 ? null : str2);
    }
}
