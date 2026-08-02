package com.vk.api.generated.settings.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: SettingsOAuthServicesResponseDto.kt */
/* loaded from: classes15.dex */
public final class SettingsOAuthServicesResponseDto implements Parcelable {
    public static final Parcelable.Creator<SettingsOAuthServicesResponseDto> CREATOR = new a();

    @pmi0("dev_ok_ru")
    private final Boolean devOkRu;

    @pmi0("mail_ru")
    private final Boolean mailRu;

    @pmi0("ok_ru")
    private final Boolean okRu;

    /* compiled from: SettingsOAuthServicesResponseDto.kt */
    public static final class a implements Parcelable.Creator<SettingsOAuthServicesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SettingsOAuthServicesResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SettingsOAuthServicesResponseDto(valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final SettingsOAuthServicesResponseDto[] newArray(int i) {
            return new SettingsOAuthServicesResponseDto[i];
        }
    }

    public SettingsOAuthServicesResponseDto() {
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
        if (!(obj instanceof SettingsOAuthServicesResponseDto)) {
            return false;
        }
        SettingsOAuthServicesResponseDto settingsOAuthServicesResponseDto = (SettingsOAuthServicesResponseDto) obj;
        return epx.f(this.okRu, settingsOAuthServicesResponseDto.okRu) && epx.f(this.devOkRu, settingsOAuthServicesResponseDto.devOkRu) && epx.f(this.mailRu, settingsOAuthServicesResponseDto.mailRu);
    }

    public final int hashCode() {
        Boolean bool = this.okRu;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.devOkRu;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.mailRu;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsOAuthServicesResponseDto(okRu=");
        sb.append(this.okRu);
        sb.append(", devOkRu=");
        sb.append(this.devOkRu);
        sb.append(", mailRu=");
        return tn.a(sb, this.mailRu, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.okRu;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.devOkRu;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.mailRu;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public SettingsOAuthServicesResponseDto(Boolean bool, Boolean bool2, Boolean bool3) {
        this.okRu = bool;
        this.devOkRu = bool2;
        this.mailRu = bool3;
    }

    public /* synthetic */ SettingsOAuthServicesResponseDto(Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}
