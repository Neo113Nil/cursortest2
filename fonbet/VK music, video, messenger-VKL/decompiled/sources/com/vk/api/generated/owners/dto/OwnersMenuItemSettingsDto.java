package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: OwnersMenuItemSettingsDto.kt */
/* loaded from: classes15.dex */
public final class OwnersMenuItemSettingsDto implements Parcelable {
    public static final Parcelable.Creator<OwnersMenuItemSettingsDto> CREATOR = new a();

    @pmi0("app_id")
    private final String appId;

    @pmi0("can_delete")
    private final boolean canDelete;

    @pmi0("can_edit_app")
    private final boolean canEditApp;

    @pmi0("can_edit_hidden")
    private final boolean canEditHidden;

    @pmi0("can_edit_title")
    private final boolean canEditTitle;

    @pmi0("can_edit_url")
    private final boolean canEditUrl;

    @pmi0("hidden")
    private final Boolean hidden;

    @pmi0("hide_edit_url")
    private final Boolean hideEditUrl;

    @pmi0("subtitle")
    private final String subtitle;

    /* compiled from: OwnersMenuItemSettingsDto.kt */
    public static final class a implements Parcelable.Creator<OwnersMenuItemSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersMenuItemSettingsDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Boolean valueOf;
            String readString = parcel.readString();
            boolean z5 = false;
            boolean z6 = true;
            boolean z7 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
            } else {
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z2;
            } else {
                z4 = z2;
                z2 = z3;
            }
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? z4 : z3);
            }
            boolean z8 = z4;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z3 = z8;
                }
                bool = Boolean.valueOf(z3);
            }
            return new OwnersMenuItemSettingsDto(readString, z7, z5, z6, z, z2, valueOf, readString2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersMenuItemSettingsDto[] newArray(int i) {
            return new OwnersMenuItemSettingsDto[i];
        }
    }

    public OwnersMenuItemSettingsDto(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Boolean bool, String str2, Boolean bool2) {
        this.subtitle = str;
        this.canEditTitle = z;
        this.canEditUrl = z2;
        this.canEditApp = z3;
        this.canDelete = z4;
        this.canEditHidden = z5;
        this.hideEditUrl = bool;
        this.appId = str2;
        this.hidden = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnersMenuItemSettingsDto)) {
            return false;
        }
        OwnersMenuItemSettingsDto ownersMenuItemSettingsDto = (OwnersMenuItemSettingsDto) obj;
        return epx.f(this.subtitle, ownersMenuItemSettingsDto.subtitle) && this.canEditTitle == ownersMenuItemSettingsDto.canEditTitle && this.canEditUrl == ownersMenuItemSettingsDto.canEditUrl && this.canEditApp == ownersMenuItemSettingsDto.canEditApp && this.canDelete == ownersMenuItemSettingsDto.canDelete && this.canEditHidden == ownersMenuItemSettingsDto.canEditHidden && epx.f(this.hideEditUrl, ownersMenuItemSettingsDto.hideEditUrl) && epx.f(this.appId, ownersMenuItemSettingsDto.appId) && epx.f(this.hidden, ownersMenuItemSettingsDto.hidden);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(this.subtitle.hashCode() * 31, 31, this.canEditTitle), 31, this.canEditUrl), 31, this.canEditApp), 31, this.canDelete), 31, this.canEditHidden);
        Boolean bool = this.hideEditUrl;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.appId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.hidden;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnersMenuItemSettingsDto(subtitle=");
        sb.append(this.subtitle);
        sb.append(", canEditTitle=");
        sb.append(this.canEditTitle);
        sb.append(", canEditUrl=");
        sb.append(this.canEditUrl);
        sb.append(", canEditApp=");
        sb.append(this.canEditApp);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", canEditHidden=");
        sb.append(this.canEditHidden);
        sb.append(", hideEditUrl=");
        sb.append(this.hideEditUrl);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", hidden=");
        return tn.a(sb, this.hidden, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.subtitle);
        parcel.writeInt(this.canEditTitle ? 1 : 0);
        parcel.writeInt(this.canEditUrl ? 1 : 0);
        parcel.writeInt(this.canEditApp ? 1 : 0);
        parcel.writeInt(this.canDelete ? 1 : 0);
        parcel.writeInt(this.canEditHidden ? 1 : 0);
        Boolean bool = this.hideEditUrl;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.appId);
        Boolean bool2 = this.hidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ OwnersMenuItemSettingsDto(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Boolean bool, String str2, Boolean bool2, int i, zcl zclVar) {
        this(str, z, z2, z3, z4, z5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : bool2);
    }
}
