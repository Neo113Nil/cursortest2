package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsCreationOnboardingScreenOptionDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenOptionDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenOptionDto> CREATOR = new a();

    @pmi0("entity_id")
    private final Integer entityId;

    @pmi0("image")
    private final String image;

    @pmi0(C4504q2.u)
    private final int order;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    /* compiled from: GroupsCreationOnboardingScreenOptionDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenOptionDto createFromParcel(Parcel parcel) {
            return new GroupsCreationOnboardingScreenOptionDto(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenOptionDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenOptionDto[i];
        }
    }

    public GroupsCreationOnboardingScreenOptionDto(String str, String str2, int i, String str3, Integer num, String str4, String str5) {
        this.title = str;
        this.type = str2;
        this.order = i;
        this.subtitle = str3;
        this.entityId = num;
        this.image = str4;
        this.url = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCreationOnboardingScreenOptionDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenOptionDto groupsCreationOnboardingScreenOptionDto = (GroupsCreationOnboardingScreenOptionDto) obj;
        return epx.f(this.title, groupsCreationOnboardingScreenOptionDto.title) && epx.f(this.type, groupsCreationOnboardingScreenOptionDto.type) && this.order == groupsCreationOnboardingScreenOptionDto.order && epx.f(this.subtitle, groupsCreationOnboardingScreenOptionDto.subtitle) && epx.f(this.entityId, groupsCreationOnboardingScreenOptionDto.entityId) && epx.f(this.image, groupsCreationOnboardingScreenOptionDto.image) && epx.f(this.url, groupsCreationOnboardingScreenOptionDto.url);
    }

    public final int hashCode() {
        int a2 = shy.a(this.order, urd0.a(this.title.hashCode() * 31, 31, this.type), 31);
        String str = this.subtitle;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.entityId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.image;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCreationOnboardingScreenOptionDto(title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", order=");
        sb.append(this.order);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", entityId=");
        sb.append(this.entityId);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.type);
        parcel.writeInt(this.order);
        parcel.writeString(this.subtitle);
        Integer num = this.entityId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.image);
        parcel.writeString(this.url);
    }

    public /* synthetic */ GroupsCreationOnboardingScreenOptionDto(String str, String str2, int i, String str3, Integer num, String str4, String str5, int i2, zcl zclVar) {
        this(str, str2, i, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5);
    }
}
