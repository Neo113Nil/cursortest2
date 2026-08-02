package com.vk.api.generated.vkidmail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.ironsource.C4217a2;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VkidmailBindListAccountDto.kt */
/* loaded from: classes15.dex */
public final class VkidmailBindListAccountDto implements Parcelable {
    public static final Parcelable.Creator<VkidmailBindListAccountDto> CREATOR = new a();

    @pmi0("avatar_url")
    private final String avatarUrl;

    @pmi0("block")
    private final VkidmailBindListAccountBlockDto block;

    @pmi0(C4217a2.e)
    private final Boolean disabled;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("login")
    private final String login;

    @pmi0(NotificationCompat.CATEGORY_SOCIAL)
    private final Boolean social;

    @pmi0("terminated")
    private final Boolean terminated;

    @pmi0("twostep")
    private final Boolean twostep;

    /* compiled from: VkidmailBindListAccountDto.kt */
    public static final class a implements Parcelable.Creator<VkidmailBindListAccountDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidmailBindListAccountDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VkidmailBindListAccountDto(readString, readString2, readString3, readString4, valueOf, valueOf2, valueOf3, valueOf4, parcel.readInt() != 0 ? VkidmailBindListAccountBlockDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VkidmailBindListAccountDto[] newArray(int i) {
            return new VkidmailBindListAccountDto[i];
        }
    }

    public VkidmailBindListAccountDto(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, VkidmailBindListAccountBlockDto vkidmailBindListAccountBlockDto) {
        this.login = str;
        this.firstName = str2;
        this.lastName = str3;
        this.avatarUrl = str4;
        this.twostep = bool;
        this.terminated = bool2;
        this.disabled = bool3;
        this.social = bool4;
        this.block = vkidmailBindListAccountBlockDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidmailBindListAccountDto)) {
            return false;
        }
        VkidmailBindListAccountDto vkidmailBindListAccountDto = (VkidmailBindListAccountDto) obj;
        return epx.f(this.login, vkidmailBindListAccountDto.login) && epx.f(this.firstName, vkidmailBindListAccountDto.firstName) && epx.f(this.lastName, vkidmailBindListAccountDto.lastName) && epx.f(this.avatarUrl, vkidmailBindListAccountDto.avatarUrl) && epx.f(this.twostep, vkidmailBindListAccountDto.twostep) && epx.f(this.terminated, vkidmailBindListAccountDto.terminated) && epx.f(this.disabled, vkidmailBindListAccountDto.disabled) && epx.f(this.social, vkidmailBindListAccountDto.social) && epx.f(this.block, vkidmailBindListAccountDto.block);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.login.hashCode() * 31, 31, this.firstName), 31, this.lastName), 31, this.avatarUrl);
        Boolean bool = this.twostep;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.terminated;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.disabled;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.social;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        VkidmailBindListAccountBlockDto vkidmailBindListAccountBlockDto = this.block;
        return hashCode4 + (vkidmailBindListAccountBlockDto != null ? vkidmailBindListAccountBlockDto.hashCode() : 0);
    }

    public final String toString() {
        return "VkidmailBindListAccountDto(login=" + this.login + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", avatarUrl=" + this.avatarUrl + ", twostep=" + this.twostep + ", terminated=" + this.terminated + ", disabled=" + this.disabled + ", social=" + this.social + ", block=" + this.block + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.login);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.avatarUrl);
        Boolean bool = this.twostep;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.terminated;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.disabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.social;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        VkidmailBindListAccountBlockDto vkidmailBindListAccountBlockDto = this.block;
        if (vkidmailBindListAccountBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkidmailBindListAccountBlockDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkidmailBindListAccountDto(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, VkidmailBindListAccountBlockDto vkidmailBindListAccountBlockDto, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : bool4, (i & 256) != 0 ? null : vkidmailBindListAccountBlockDto);
    }
}
