package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ChannelsUserDataDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsUserDataDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsUserDataDto> CREATOR = new a();

    @pmi0("admin_level")
    private final int adminLevel;

    @pmi0("ban_info")
    private final ChannelsBanInfoDto banInfo;

    @pmi0("can_post")
    private final Boolean canPost;

    @pmi0("can_post_donut")
    private final Boolean canPostDonut;

    @pmi0("is_archived")
    private final boolean isArchived;

    @pmi0("is_don")
    private final Boolean isDon;

    @pmi0("is_hidden_in_all_folder")
    private final Boolean isHiddenInAllFolder;

    @pmi0("is_member")
    private final boolean isMember;

    @pmi0("is_owner")
    private final ChannelsIsOwnerDto isOwner;

    @pmi0("notification_settings")
    private final ChannelsNotificationSettingsDto notificationSettings;

    @pmi0("read_state")
    private final ChannelsReadStateDto readState;

    /* compiled from: ChannelsUserDataDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsUserDataDto> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.api.generated.channels.dto.ChannelsUserDataDto createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */

        @Override // android.os.Parcelable.Creator
        public final ChannelsUserDataDto[] newArray(int i) {
            return new ChannelsUserDataDto[i];
        }
    }

    public ChannelsUserDataDto(boolean z, boolean z2, ChannelsNotificationSettingsDto channelsNotificationSettingsDto, int i, ChannelsReadStateDto channelsReadStateDto, Boolean bool, ChannelsIsOwnerDto channelsIsOwnerDto, Boolean bool2, ChannelsBanInfoDto channelsBanInfoDto, Boolean bool3, Boolean bool4) {
        this.isArchived = z;
        this.isMember = z2;
        this.notificationSettings = channelsNotificationSettingsDto;
        this.adminLevel = i;
        this.readState = channelsReadStateDto;
        this.isDon = bool;
        this.isOwner = channelsIsOwnerDto;
        this.canPost = bool2;
        this.banInfo = channelsBanInfoDto;
        this.isHiddenInAllFolder = bool3;
        this.canPostDonut = bool4;
    }

    public final boolean d() {
        return this.isMember;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsUserDataDto)) {
            return false;
        }
        ChannelsUserDataDto channelsUserDataDto = (ChannelsUserDataDto) obj;
        return this.isArchived == channelsUserDataDto.isArchived && this.isMember == channelsUserDataDto.isMember && epx.f(this.notificationSettings, channelsUserDataDto.notificationSettings) && this.adminLevel == channelsUserDataDto.adminLevel && epx.f(this.readState, channelsUserDataDto.readState) && epx.f(this.isDon, channelsUserDataDto.isDon) && this.isOwner == channelsUserDataDto.isOwner && epx.f(this.canPost, channelsUserDataDto.canPost) && epx.f(this.banInfo, channelsUserDataDto.banInfo) && epx.f(this.isHiddenInAllFolder, channelsUserDataDto.isHiddenInAllFolder) && epx.f(this.canPostDonut, channelsUserDataDto.canPostDonut);
    }

    public final int hashCode() {
        int a2 = shy.a(this.adminLevel, (this.notificationSettings.hashCode() + qoy.b(Boolean.hashCode(this.isArchived) * 31, 31, this.isMember)) * 31, 31);
        ChannelsReadStateDto channelsReadStateDto = this.readState;
        int hashCode = (a2 + (channelsReadStateDto == null ? 0 : channelsReadStateDto.hashCode())) * 31;
        Boolean bool = this.isDon;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ChannelsIsOwnerDto channelsIsOwnerDto = this.isOwner;
        int hashCode3 = (hashCode2 + (channelsIsOwnerDto == null ? 0 : channelsIsOwnerDto.hashCode())) * 31;
        Boolean bool2 = this.canPost;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ChannelsBanInfoDto channelsBanInfoDto = this.banInfo;
        int hashCode5 = (hashCode4 + (channelsBanInfoDto == null ? 0 : channelsBanInfoDto.hashCode())) * 31;
        Boolean bool3 = this.isHiddenInAllFolder;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canPostDonut;
        return hashCode6 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsUserDataDto(isArchived=");
        sb.append(this.isArchived);
        sb.append(", isMember=");
        sb.append(this.isMember);
        sb.append(", notificationSettings=");
        sb.append(this.notificationSettings);
        sb.append(", adminLevel=");
        sb.append(this.adminLevel);
        sb.append(", readState=");
        sb.append(this.readState);
        sb.append(", isDon=");
        sb.append(this.isDon);
        sb.append(", isOwner=");
        sb.append(this.isOwner);
        sb.append(", canPost=");
        sb.append(this.canPost);
        sb.append(", banInfo=");
        sb.append(this.banInfo);
        sb.append(", isHiddenInAllFolder=");
        sb.append(this.isHiddenInAllFolder);
        sb.append(", canPostDonut=");
        return tn.a(sb, this.canPostDonut, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isArchived ? 1 : 0);
        parcel.writeInt(this.isMember ? 1 : 0);
        this.notificationSettings.writeToParcel(parcel, i);
        parcel.writeInt(this.adminLevel);
        ChannelsReadStateDto channelsReadStateDto = this.readState;
        if (channelsReadStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsReadStateDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isDon;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        ChannelsIsOwnerDto channelsIsOwnerDto = this.isOwner;
        if (channelsIsOwnerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsIsOwnerDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.canPost;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        ChannelsBanInfoDto channelsBanInfoDto = this.banInfo;
        if (channelsBanInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsBanInfoDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.isHiddenInAllFolder;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.canPostDonut;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
    }

    public /* synthetic */ ChannelsUserDataDto(boolean z, boolean z2, ChannelsNotificationSettingsDto channelsNotificationSettingsDto, int i, ChannelsReadStateDto channelsReadStateDto, Boolean bool, ChannelsIsOwnerDto channelsIsOwnerDto, Boolean bool2, ChannelsBanInfoDto channelsBanInfoDto, Boolean bool3, Boolean bool4, int i2, zcl zclVar) {
        this(z, z2, channelsNotificationSettingsDto, i, (i2 & 16) != 0 ? null : channelsReadStateDto, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : channelsIsOwnerDto, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : channelsBanInfoDto, (i2 & 512) != 0 ? null : bool3, (i2 & 1024) != 0 ? null : bool4);
    }
}
