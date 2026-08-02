package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesChatSettingsPermissionsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatSettingsPermissionsDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatSettingsPermissionsDto> CREATOR = new a();

    @pmi0(NotificationCompat.CATEGORY_CALL)
    private final CallDto call;

    @pmi0("change_admins")
    private final ChangeAdminsDto changeAdmins;

    @pmi0("change_info")
    private final ChangeInfoDto changeInfo;

    @pmi0("change_pin")
    private final ChangePinDto changePin;

    @pmi0("change_style")
    private final ChangeStyleDto changeStyle;

    @pmi0("invite")
    private final InviteDto invite;

    @pmi0("see_invite_link")
    private final SeeInviteLinkDto seeInviteLink;

    @pmi0("use_mass_mentions")
    private final UseMassMentionsDto useMassMentions;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class CallDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CallDto[] $VALUES;

        @pmi0("all")
        public static final CallDto ALL;
        public static final Parcelable.Creator<CallDto> CREATOR;

        @pmi0("owner")
        public static final CallDto OWNER;

        @pmi0("owner_and_admins")
        public static final CallDto OWNER_AND_ADMINS;
        private final String value;

        /* compiled from: MessagesChatSettingsPermissionsDto.kt */
        public static final class a implements Parcelable.Creator<CallDto> {
            @Override // android.os.Parcelable.Creator
            public final CallDto createFromParcel(Parcel parcel) {
                return CallDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CallDto[] newArray(int i) {
                return new CallDto[i];
            }
        }

        static {
            CallDto callDto = new CallDto("OWNER", 0, "owner");
            OWNER = callDto;
            CallDto callDto2 = new CallDto("OWNER_AND_ADMINS", 1, "owner_and_admins");
            OWNER_AND_ADMINS = callDto2;
            CallDto callDto3 = new CallDto("ALL", 2, "all");
            ALL = callDto3;
            CallDto[] callDtoArr = {callDto, callDto2, callDto3};
            $VALUES = callDtoArr;
            $ENTRIES = new asp(callDtoArr);
            CREATOR = new a();
        }

        private CallDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static CallDto valueOf(String str) {
            return (CallDto) Enum.valueOf(CallDto.class, str);
        }

        public static CallDto[] values() {
            return (CallDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class ChangeAdminsDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChangeAdminsDto[] $VALUES;
        public static final Parcelable.Creator<ChangeAdminsDto> CREATOR;

        @pmi0("owner")
        public static final ChangeAdminsDto OWNER;

        @pmi0("owner_and_admins")
        public static final ChangeAdminsDto OWNER_AND_ADMINS;
        private final String value;

        /* compiled from: MessagesChatSettingsPermissionsDto.kt */
        public static final class a implements Parcelable.Creator<ChangeAdminsDto> {
            @Override // android.os.Parcelable.Creator
            public final ChangeAdminsDto createFromParcel(Parcel parcel) {
                return ChangeAdminsDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ChangeAdminsDto[] newArray(int i) {
                return new ChangeAdminsDto[i];
            }
        }

        static {
            ChangeAdminsDto changeAdminsDto = new ChangeAdminsDto("OWNER", 0, "owner");
            OWNER = changeAdminsDto;
            ChangeAdminsDto changeAdminsDto2 = new ChangeAdminsDto("OWNER_AND_ADMINS", 1, "owner_and_admins");
            OWNER_AND_ADMINS = changeAdminsDto2;
            ChangeAdminsDto[] changeAdminsDtoArr = {changeAdminsDto, changeAdminsDto2};
            $VALUES = changeAdminsDtoArr;
            $ENTRIES = new asp(changeAdminsDtoArr);
            CREATOR = new a();
        }

        private ChangeAdminsDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ChangeAdminsDto valueOf(String str) {
            return (ChangeAdminsDto) Enum.valueOf(ChangeAdminsDto.class, str);
        }

        public static ChangeAdminsDto[] values() {
            return (ChangeAdminsDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class ChangeInfoDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChangeInfoDto[] $VALUES;

        @pmi0("all")
        public static final ChangeInfoDto ALL;
        public static final Parcelable.Creator<ChangeInfoDto> CREATOR;

        @pmi0("owner")
        public static final ChangeInfoDto OWNER;

        @pmi0("owner_and_admins")
        public static final ChangeInfoDto OWNER_AND_ADMINS;
        private final String value;

        /* compiled from: MessagesChatSettingsPermissionsDto.kt */
        public static final class a implements Parcelable.Creator<ChangeInfoDto> {
            @Override // android.os.Parcelable.Creator
            public final ChangeInfoDto createFromParcel(Parcel parcel) {
                return ChangeInfoDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ChangeInfoDto[] newArray(int i) {
                return new ChangeInfoDto[i];
            }
        }

        static {
            ChangeInfoDto changeInfoDto = new ChangeInfoDto("OWNER", 0, "owner");
            OWNER = changeInfoDto;
            ChangeInfoDto changeInfoDto2 = new ChangeInfoDto("OWNER_AND_ADMINS", 1, "owner_and_admins");
            OWNER_AND_ADMINS = changeInfoDto2;
            ChangeInfoDto changeInfoDto3 = new ChangeInfoDto("ALL", 2, "all");
            ALL = changeInfoDto3;
            ChangeInfoDto[] changeInfoDtoArr = {changeInfoDto, changeInfoDto2, changeInfoDto3};
            $VALUES = changeInfoDtoArr;
            $ENTRIES = new asp(changeInfoDtoArr);
            CREATOR = new a();
        }

        private ChangeInfoDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ChangeInfoDto valueOf(String str) {
            return (ChangeInfoDto) Enum.valueOf(ChangeInfoDto.class, str);
        }

        public static ChangeInfoDto[] values() {
            return (ChangeInfoDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class ChangePinDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChangePinDto[] $VALUES;

        @pmi0("all")
        public static final ChangePinDto ALL;
        public static final Parcelable.Creator<ChangePinDto> CREATOR;

        @pmi0("owner")
        public static final ChangePinDto OWNER;

        @pmi0("owner_and_admins")
        public static final ChangePinDto OWNER_AND_ADMINS;
        private final String value;

        /* compiled from: MessagesChatSettingsPermissionsDto.kt */
        public static final class a implements Parcelable.Creator<ChangePinDto> {
            @Override // android.os.Parcelable.Creator
            public final ChangePinDto createFromParcel(Parcel parcel) {
                return ChangePinDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ChangePinDto[] newArray(int i) {
                return new ChangePinDto[i];
            }
        }

        static {
            ChangePinDto changePinDto = new ChangePinDto("OWNER", 0, "owner");
            OWNER = changePinDto;
            ChangePinDto changePinDto2 = new ChangePinDto("OWNER_AND_ADMINS", 1, "owner_and_admins");
            OWNER_AND_ADMINS = changePinDto2;
            ChangePinDto changePinDto3 = new ChangePinDto("ALL", 2, "all");
            ALL = changePinDto3;
            ChangePinDto[] changePinDtoArr = {changePinDto, changePinDto2, changePinDto3};
            $VALUES = changePinDtoArr;
            $ENTRIES = new asp(changePinDtoArr);
            CREATOR = new a();
        }

        private ChangePinDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ChangePinDto valueOf(String str) {
            return (ChangePinDto) Enum.valueOf(ChangePinDto.class, str);
        }

        public static ChangePinDto[] values() {
            return (ChangePinDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class ChangeStyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChangeStyleDto[] $VALUES;

        @pmi0("all")
        public static final ChangeStyleDto ALL;
        public static final Parcelable.Creator<ChangeStyleDto> CREATOR;

        @pmi0("owner")
        public static final ChangeStyleDto OWNER;

        @pmi0("owner_and_admins")
        public static final ChangeStyleDto OWNER_AND_ADMINS;
        private final String value;

        /* compiled from: MessagesChatSettingsPermissionsDto.kt */
        public static final class a implements Parcelable.Creator<ChangeStyleDto> {
            @Override // android.os.Parcelable.Creator
            public final ChangeStyleDto createFromParcel(Parcel parcel) {
                return ChangeStyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ChangeStyleDto[] newArray(int i) {
                return new ChangeStyleDto[i];
            }
        }

        static {
            ChangeStyleDto changeStyleDto = new ChangeStyleDto("OWNER", 0, "owner");
            OWNER = changeStyleDto;
            ChangeStyleDto changeStyleDto2 = new ChangeStyleDto("OWNER_AND_ADMINS", 1, "owner_and_admins");
            OWNER_AND_ADMINS = changeStyleDto2;
            ChangeStyleDto changeStyleDto3 = new ChangeStyleDto("ALL", 2, "all");
            ALL = changeStyleDto3;
            ChangeStyleDto[] changeStyleDtoArr = {changeStyleDto, changeStyleDto2, changeStyleDto3};
            $VALUES = changeStyleDtoArr;
            $ENTRIES = new asp(changeStyleDtoArr);
            CREATOR = new a();
        }

        private ChangeStyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ChangeStyleDto valueOf(String str) {
            return (ChangeStyleDto) Enum.valueOf(ChangeStyleDto.class, str);
        }

        public static ChangeStyleDto[] values() {
            return (ChangeStyleDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class InviteDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InviteDto[] $VALUES;

        @pmi0("all")
        public static final InviteDto ALL;
        public static final Parcelable.Creator<InviteDto> CREATOR;

        @pmi0("owner")
        public static final InviteDto OWNER;

        @pmi0("owner_and_admins")
        public static final InviteDto OWNER_AND_ADMINS;
        private final String value;

        /* compiled from: MessagesChatSettingsPermissionsDto.kt */
        public static final class a implements Parcelable.Creator<InviteDto> {
            @Override // android.os.Parcelable.Creator
            public final InviteDto createFromParcel(Parcel parcel) {
                return InviteDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InviteDto[] newArray(int i) {
                return new InviteDto[i];
            }
        }

        static {
            InviteDto inviteDto = new InviteDto("OWNER", 0, "owner");
            OWNER = inviteDto;
            InviteDto inviteDto2 = new InviteDto("OWNER_AND_ADMINS", 1, "owner_and_admins");
            OWNER_AND_ADMINS = inviteDto2;
            InviteDto inviteDto3 = new InviteDto("ALL", 2, "all");
            ALL = inviteDto3;
            InviteDto[] inviteDtoArr = {inviteDto, inviteDto2, inviteDto3};
            $VALUES = inviteDtoArr;
            $ENTRIES = new asp(inviteDtoArr);
            CREATOR = new a();
        }

        private InviteDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InviteDto valueOf(String str) {
            return (InviteDto) Enum.valueOf(InviteDto.class, str);
        }

        public static InviteDto[] values() {
            return (InviteDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class SeeInviteLinkDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SeeInviteLinkDto[] $VALUES;

        @pmi0("all")
        public static final SeeInviteLinkDto ALL;
        public static final Parcelable.Creator<SeeInviteLinkDto> CREATOR;

        @pmi0("owner")
        public static final SeeInviteLinkDto OWNER;

        @pmi0("owner_and_admins")
        public static final SeeInviteLinkDto OWNER_AND_ADMINS;
        private final String value;

        /* compiled from: MessagesChatSettingsPermissionsDto.kt */
        public static final class a implements Parcelable.Creator<SeeInviteLinkDto> {
            @Override // android.os.Parcelable.Creator
            public final SeeInviteLinkDto createFromParcel(Parcel parcel) {
                return SeeInviteLinkDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SeeInviteLinkDto[] newArray(int i) {
                return new SeeInviteLinkDto[i];
            }
        }

        static {
            SeeInviteLinkDto seeInviteLinkDto = new SeeInviteLinkDto("OWNER", 0, "owner");
            OWNER = seeInviteLinkDto;
            SeeInviteLinkDto seeInviteLinkDto2 = new SeeInviteLinkDto("OWNER_AND_ADMINS", 1, "owner_and_admins");
            OWNER_AND_ADMINS = seeInviteLinkDto2;
            SeeInviteLinkDto seeInviteLinkDto3 = new SeeInviteLinkDto("ALL", 2, "all");
            ALL = seeInviteLinkDto3;
            SeeInviteLinkDto[] seeInviteLinkDtoArr = {seeInviteLinkDto, seeInviteLinkDto2, seeInviteLinkDto3};
            $VALUES = seeInviteLinkDtoArr;
            $ENTRIES = new asp(seeInviteLinkDtoArr);
            CREATOR = new a();
        }

        private SeeInviteLinkDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SeeInviteLinkDto valueOf(String str) {
            return (SeeInviteLinkDto) Enum.valueOf(SeeInviteLinkDto.class, str);
        }

        public static SeeInviteLinkDto[] values() {
            return (SeeInviteLinkDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class UseMassMentionsDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UseMassMentionsDto[] $VALUES;

        @pmi0("all")
        public static final UseMassMentionsDto ALL;
        public static final Parcelable.Creator<UseMassMentionsDto> CREATOR;

        @pmi0("owner")
        public static final UseMassMentionsDto OWNER;

        @pmi0("owner_and_admins")
        public static final UseMassMentionsDto OWNER_AND_ADMINS;
        private final String value;

        /* compiled from: MessagesChatSettingsPermissionsDto.kt */
        public static final class a implements Parcelable.Creator<UseMassMentionsDto> {
            @Override // android.os.Parcelable.Creator
            public final UseMassMentionsDto createFromParcel(Parcel parcel) {
                return UseMassMentionsDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UseMassMentionsDto[] newArray(int i) {
                return new UseMassMentionsDto[i];
            }
        }

        static {
            UseMassMentionsDto useMassMentionsDto = new UseMassMentionsDto("OWNER", 0, "owner");
            OWNER = useMassMentionsDto;
            UseMassMentionsDto useMassMentionsDto2 = new UseMassMentionsDto("OWNER_AND_ADMINS", 1, "owner_and_admins");
            OWNER_AND_ADMINS = useMassMentionsDto2;
            UseMassMentionsDto useMassMentionsDto3 = new UseMassMentionsDto("ALL", 2, "all");
            ALL = useMassMentionsDto3;
            UseMassMentionsDto[] useMassMentionsDtoArr = {useMassMentionsDto, useMassMentionsDto2, useMassMentionsDto3};
            $VALUES = useMassMentionsDtoArr;
            $ENTRIES = new asp(useMassMentionsDtoArr);
            CREATOR = new a();
        }

        private UseMassMentionsDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static UseMassMentionsDto valueOf(String str) {
            return (UseMassMentionsDto) Enum.valueOf(UseMassMentionsDto.class, str);
        }

        public static UseMassMentionsDto[] values() {
            return (UseMassMentionsDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatSettingsPermissionsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsPermissionsDto createFromParcel(Parcel parcel) {
            return new MessagesChatSettingsPermissionsDto(parcel.readInt() == 0 ? null : InviteDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ChangeInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ChangePinDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UseMassMentionsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SeeInviteLinkDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CallDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ChangeAdminsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ChangeStyleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsPermissionsDto[] newArray(int i) {
            return new MessagesChatSettingsPermissionsDto[i];
        }
    }

    public MessagesChatSettingsPermissionsDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsPermissionsDto)) {
            return false;
        }
        MessagesChatSettingsPermissionsDto messagesChatSettingsPermissionsDto = (MessagesChatSettingsPermissionsDto) obj;
        return this.invite == messagesChatSettingsPermissionsDto.invite && this.changeInfo == messagesChatSettingsPermissionsDto.changeInfo && this.changePin == messagesChatSettingsPermissionsDto.changePin && this.useMassMentions == messagesChatSettingsPermissionsDto.useMassMentions && this.seeInviteLink == messagesChatSettingsPermissionsDto.seeInviteLink && this.call == messagesChatSettingsPermissionsDto.call && this.changeAdmins == messagesChatSettingsPermissionsDto.changeAdmins && this.changeStyle == messagesChatSettingsPermissionsDto.changeStyle;
    }

    public final int hashCode() {
        InviteDto inviteDto = this.invite;
        int hashCode = (inviteDto == null ? 0 : inviteDto.hashCode()) * 31;
        ChangeInfoDto changeInfoDto = this.changeInfo;
        int hashCode2 = (hashCode + (changeInfoDto == null ? 0 : changeInfoDto.hashCode())) * 31;
        ChangePinDto changePinDto = this.changePin;
        int hashCode3 = (hashCode2 + (changePinDto == null ? 0 : changePinDto.hashCode())) * 31;
        UseMassMentionsDto useMassMentionsDto = this.useMassMentions;
        int hashCode4 = (hashCode3 + (useMassMentionsDto == null ? 0 : useMassMentionsDto.hashCode())) * 31;
        SeeInviteLinkDto seeInviteLinkDto = this.seeInviteLink;
        int hashCode5 = (hashCode4 + (seeInviteLinkDto == null ? 0 : seeInviteLinkDto.hashCode())) * 31;
        CallDto callDto = this.call;
        int hashCode6 = (hashCode5 + (callDto == null ? 0 : callDto.hashCode())) * 31;
        ChangeAdminsDto changeAdminsDto = this.changeAdmins;
        int hashCode7 = (hashCode6 + (changeAdminsDto == null ? 0 : changeAdminsDto.hashCode())) * 31;
        ChangeStyleDto changeStyleDto = this.changeStyle;
        return hashCode7 + (changeStyleDto != null ? changeStyleDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesChatSettingsPermissionsDto(invite=" + this.invite + ", changeInfo=" + this.changeInfo + ", changePin=" + this.changePin + ", useMassMentions=" + this.useMassMentions + ", seeInviteLink=" + this.seeInviteLink + ", call=" + this.call + ", changeAdmins=" + this.changeAdmins + ", changeStyle=" + this.changeStyle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InviteDto inviteDto = this.invite;
        if (inviteDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inviteDto.writeToParcel(parcel, i);
        }
        ChangeInfoDto changeInfoDto = this.changeInfo;
        if (changeInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            changeInfoDto.writeToParcel(parcel, i);
        }
        ChangePinDto changePinDto = this.changePin;
        if (changePinDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            changePinDto.writeToParcel(parcel, i);
        }
        UseMassMentionsDto useMassMentionsDto = this.useMassMentions;
        if (useMassMentionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            useMassMentionsDto.writeToParcel(parcel, i);
        }
        SeeInviteLinkDto seeInviteLinkDto = this.seeInviteLink;
        if (seeInviteLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seeInviteLinkDto.writeToParcel(parcel, i);
        }
        CallDto callDto = this.call;
        if (callDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callDto.writeToParcel(parcel, i);
        }
        ChangeAdminsDto changeAdminsDto = this.changeAdmins;
        if (changeAdminsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            changeAdminsDto.writeToParcel(parcel, i);
        }
        ChangeStyleDto changeStyleDto = this.changeStyle;
        if (changeStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            changeStyleDto.writeToParcel(parcel, i);
        }
    }

    public MessagesChatSettingsPermissionsDto(InviteDto inviteDto, ChangeInfoDto changeInfoDto, ChangePinDto changePinDto, UseMassMentionsDto useMassMentionsDto, SeeInviteLinkDto seeInviteLinkDto, CallDto callDto, ChangeAdminsDto changeAdminsDto, ChangeStyleDto changeStyleDto) {
        this.invite = inviteDto;
        this.changeInfo = changeInfoDto;
        this.changePin = changePinDto;
        this.useMassMentions = useMassMentionsDto;
        this.seeInviteLink = seeInviteLinkDto;
        this.call = callDto;
        this.changeAdmins = changeAdminsDto;
        this.changeStyle = changeStyleDto;
    }

    public /* synthetic */ MessagesChatSettingsPermissionsDto(InviteDto inviteDto, ChangeInfoDto changeInfoDto, ChangePinDto changePinDto, UseMassMentionsDto useMassMentionsDto, SeeInviteLinkDto seeInviteLinkDto, CallDto callDto, ChangeAdminsDto changeAdminsDto, ChangeStyleDto changeStyleDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : inviteDto, (i & 2) != 0 ? null : changeInfoDto, (i & 4) != 0 ? null : changePinDto, (i & 8) != 0 ? null : useMassMentionsDto, (i & 16) != 0 ? null : seeInviteLinkDto, (i & 32) != 0 ? null : callDto, (i & 64) != 0 ? null : changeAdminsDto, (i & 128) != 0 ? null : changeStyleDto);
    }
}
