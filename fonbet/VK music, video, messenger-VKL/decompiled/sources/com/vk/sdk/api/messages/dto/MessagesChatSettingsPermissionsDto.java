package com.vk.sdk.api.messages.dto;

import androidx.core.app.NotificationCompat;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesChatSettingsPermissionsDto.kt */
/* loaded from: classes5.dex */
public final class MessagesChatSettingsPermissionsDto {

    @pmi0(NotificationCompat.CATEGORY_CALL)
    private final CallDto call;

    @pmi0("change_admins")
    private final ChangeAdminsDto changeAdmins;

    @pmi0("change_info")
    private final ChangeInfoDto changeInfo;

    @pmi0("change_pin")
    private final ChangePinDto changePin;

    @pmi0("invite")
    private final InviteDto invite;

    @pmi0("see_invite_link")
    private final SeeInviteLinkDto seeInviteLink;

    @pmi0("use_mass_mentions")
    private final UseMassMentionsDto useMassMentions;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class CallDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CallDto[] $VALUES;

        @pmi0("all")
        public static final CallDto ALL;

        @pmi0("owner")
        public static final CallDto OWNER;

        @pmi0("owner_and_admins")
        public static final CallDto OWNER_AND_ADMINS;
        private final String value;

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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class ChangeAdminsDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChangeAdminsDto[] $VALUES;

        @pmi0("owner")
        public static final ChangeAdminsDto OWNER;

        @pmi0("owner_and_admins")
        public static final ChangeAdminsDto OWNER_AND_ADMINS;
        private final String value;

        static {
            ChangeAdminsDto changeAdminsDto = new ChangeAdminsDto("OWNER", 0, "owner");
            OWNER = changeAdminsDto;
            ChangeAdminsDto changeAdminsDto2 = new ChangeAdminsDto("OWNER_AND_ADMINS", 1, "owner_and_admins");
            OWNER_AND_ADMINS = changeAdminsDto2;
            ChangeAdminsDto[] changeAdminsDtoArr = {changeAdminsDto, changeAdminsDto2};
            $VALUES = changeAdminsDtoArr;
            $ENTRIES = new asp(changeAdminsDtoArr);
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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class ChangeInfoDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChangeInfoDto[] $VALUES;

        @pmi0("all")
        public static final ChangeInfoDto ALL;

        @pmi0("owner")
        public static final ChangeInfoDto OWNER;

        @pmi0("owner_and_admins")
        public static final ChangeInfoDto OWNER_AND_ADMINS;
        private final String value;

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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class ChangePinDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChangePinDto[] $VALUES;

        @pmi0("all")
        public static final ChangePinDto ALL;

        @pmi0("owner")
        public static final ChangePinDto OWNER;

        @pmi0("owner_and_admins")
        public static final ChangePinDto OWNER_AND_ADMINS;
        private final String value;

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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class InviteDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InviteDto[] $VALUES;

        @pmi0("all")
        public static final InviteDto ALL;

        @pmi0("owner")
        public static final InviteDto OWNER;

        @pmi0("owner_and_admins")
        public static final InviteDto OWNER_AND_ADMINS;
        private final String value;

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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class SeeInviteLinkDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SeeInviteLinkDto[] $VALUES;

        @pmi0("all")
        public static final SeeInviteLinkDto ALL;

        @pmi0("owner")
        public static final SeeInviteLinkDto OWNER;

        @pmi0("owner_and_admins")
        public static final SeeInviteLinkDto OWNER_AND_ADMINS;
        private final String value;

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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesChatSettingsPermissionsDto.kt */
    public static final class UseMassMentionsDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UseMassMentionsDto[] $VALUES;

        @pmi0("all")
        public static final UseMassMentionsDto ALL;

        @pmi0("owner")
        public static final UseMassMentionsDto OWNER;

        @pmi0("owner_and_admins")
        public static final UseMassMentionsDto OWNER_AND_ADMINS;
        private final String value;

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
    }

    public MessagesChatSettingsPermissionsDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsPermissionsDto)) {
            return false;
        }
        MessagesChatSettingsPermissionsDto messagesChatSettingsPermissionsDto = (MessagesChatSettingsPermissionsDto) obj;
        return this.invite == messagesChatSettingsPermissionsDto.invite && this.changeInfo == messagesChatSettingsPermissionsDto.changeInfo && this.changePin == messagesChatSettingsPermissionsDto.changePin && this.useMassMentions == messagesChatSettingsPermissionsDto.useMassMentions && this.seeInviteLink == messagesChatSettingsPermissionsDto.seeInviteLink && this.call == messagesChatSettingsPermissionsDto.call && this.changeAdmins == messagesChatSettingsPermissionsDto.changeAdmins;
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
        return hashCode6 + (changeAdminsDto != null ? changeAdminsDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesChatSettingsPermissionsDto(invite=" + this.invite + ", changeInfo=" + this.changeInfo + ", changePin=" + this.changePin + ", useMassMentions=" + this.useMassMentions + ", seeInviteLink=" + this.seeInviteLink + ", call=" + this.call + ", changeAdmins=" + this.changeAdmins + ")";
    }

    public MessagesChatSettingsPermissionsDto(InviteDto inviteDto, ChangeInfoDto changeInfoDto, ChangePinDto changePinDto, UseMassMentionsDto useMassMentionsDto, SeeInviteLinkDto seeInviteLinkDto, CallDto callDto, ChangeAdminsDto changeAdminsDto) {
        this.invite = inviteDto;
        this.changeInfo = changeInfoDto;
        this.changePin = changePinDto;
        this.useMassMentions = useMassMentionsDto;
        this.seeInviteLink = seeInviteLinkDto;
        this.call = callDto;
        this.changeAdmins = changeAdminsDto;
    }

    public /* synthetic */ MessagesChatSettingsPermissionsDto(InviteDto inviteDto, ChangeInfoDto changeInfoDto, ChangePinDto changePinDto, UseMassMentionsDto useMassMentionsDto, SeeInviteLinkDto seeInviteLinkDto, CallDto callDto, ChangeAdminsDto changeAdminsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : inviteDto, (i & 2) != 0 ? null : changeInfoDto, (i & 4) != 0 ? null : changePinDto, (i & 8) != 0 ? null : useMassMentionsDto, (i & 16) != 0 ? null : seeInviteLinkDto, (i & 32) != 0 ? null : callDto, (i & 64) != 0 ? null : changeAdminsDto);
    }
}
