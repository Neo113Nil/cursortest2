package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsAdsPostsInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsAdsPostsInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsAdsPostsInfoDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    private final Boolean active;

    @pmi0("activity_readonly")
    private final Boolean activityReadonly;

    @pmi0("comment")
    private final String comment;

    @pmi0("cost")
    private final Integer cost;

    @pmi0("editor_access")
    private final Boolean editorAccess;

    @pmi0("enabled")
    private final boolean enabled;

    @pmi0("error")
    private final String error;

    @pmi0("subject_id")
    private final Integer subjectId;

    /* compiled from: GroupsAdsPostsInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsAdsPostsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsAdsPostsInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            boolean z = parcel.readInt() != 0;
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
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z2 = true;
            Boolean bool2 = valueOf2;
            String readString = parcel.readString();
            Boolean bool3 = valueOf;
            Integer num = valueOf3;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                bool = Boolean.valueOf(z2);
            }
            return new GroupsAdsPostsInfoDto(z, bool3, bool2, num, valueOf4, readString, readString2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsAdsPostsInfoDto[] newArray(int i) {
            return new GroupsAdsPostsInfoDto[i];
        }
    }

    public GroupsAdsPostsInfoDto(boolean z, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, Boolean bool3) {
        this.enabled = z;
        this.active = bool;
        this.activityReadonly = bool2;
        this.cost = num;
        this.subjectId = num2;
        this.comment = str;
        this.error = str2;
        this.editorAccess = bool3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAdsPostsInfoDto)) {
            return false;
        }
        GroupsAdsPostsInfoDto groupsAdsPostsInfoDto = (GroupsAdsPostsInfoDto) obj;
        return this.enabled == groupsAdsPostsInfoDto.enabled && epx.f(this.active, groupsAdsPostsInfoDto.active) && epx.f(this.activityReadonly, groupsAdsPostsInfoDto.activityReadonly) && epx.f(this.cost, groupsAdsPostsInfoDto.cost) && epx.f(this.subjectId, groupsAdsPostsInfoDto.subjectId) && epx.f(this.comment, groupsAdsPostsInfoDto.comment) && epx.f(this.error, groupsAdsPostsInfoDto.error) && epx.f(this.editorAccess, groupsAdsPostsInfoDto.editorAccess);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.enabled) * 31;
        Boolean bool = this.active;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.activityReadonly;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.cost;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.subjectId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.comment;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.editorAccess;
        return hashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsAdsPostsInfoDto(enabled=");
        sb.append(this.enabled);
        sb.append(", active=");
        sb.append(this.active);
        sb.append(", activityReadonly=");
        sb.append(this.activityReadonly);
        sb.append(", cost=");
        sb.append(this.cost);
        sb.append(", subjectId=");
        sb.append(this.subjectId);
        sb.append(", comment=");
        sb.append(this.comment);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", editorAccess=");
        return tn.a(sb, this.editorAccess, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
        Boolean bool = this.active;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.activityReadonly;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.cost;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.subjectId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.comment);
        parcel.writeString(this.error);
        Boolean bool3 = this.editorAccess;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ GroupsAdsPostsInfoDto(boolean z, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, Boolean bool3, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : bool3);
    }
}
