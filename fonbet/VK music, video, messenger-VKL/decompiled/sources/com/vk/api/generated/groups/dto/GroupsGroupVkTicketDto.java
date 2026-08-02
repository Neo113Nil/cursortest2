package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsGroupVkTicketDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupVkTicketDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupVkTicketDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("is_onboarding_enabled")
    private final Boolean isOnboardingEnabled;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: GroupsGroupVkTicketDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupVkTicketDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupVkTicketDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsGroupVkTicketDto(readString, readString2, readString3, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupVkTicketDto[] newArray(int i) {
            return new GroupsGroupVkTicketDto[i];
        }
    }

    public GroupsGroupVkTicketDto(String str, String str2, String str3, Boolean bool) {
        this.title = str;
        this.description = str2;
        this.url = str3;
        this.isOnboardingEnabled = bool;
    }

    public final Boolean d() {
        return this.isOnboardingEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupVkTicketDto)) {
            return false;
        }
        GroupsGroupVkTicketDto groupsGroupVkTicketDto = (GroupsGroupVkTicketDto) obj;
        return epx.f(this.title, groupsGroupVkTicketDto.title) && epx.f(this.description, groupsGroupVkTicketDto.description) && epx.f(this.url, groupsGroupVkTicketDto.url) && epx.f(this.isOnboardingEnabled, groupsGroupVkTicketDto.isOnboardingEnabled);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.description), 31, this.url);
        Boolean bool = this.isOnboardingEnabled;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupVkTicketDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", isOnboardingEnabled=");
        return tn.a(sb, this.isOnboardingEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
        Boolean bool = this.isOnboardingEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ GroupsGroupVkTicketDto(String str, String str2, String str3, Boolean bool, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : bool);
    }
}
