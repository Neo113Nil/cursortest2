package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsCreationOnboardingScreenFinishDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenFinishDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenFinishDto> CREATOR = new a();

    @pmi0("button")
    private final GroupsCreationOnboardingScreenButtonDto button;

    @pmi0("image")
    private final String image;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<GroupsCreationOnboardingScreenOptionDto> options;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsCreationOnboardingScreenFinishDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenFinishDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenFinishDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            GroupsCreationOnboardingScreenButtonDto createFromParcel = parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenButtonDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsCreationOnboardingScreenOptionDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new GroupsCreationOnboardingScreenFinishDto(readString, readString2, readString3, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenFinishDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenFinishDto[i];
        }
    }

    public GroupsCreationOnboardingScreenFinishDto(String str, String str2, String str3, GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto, List<GroupsCreationOnboardingScreenOptionDto> list) {
        this.title = str;
        this.subtitle = str2;
        this.image = str3;
        this.button = groupsCreationOnboardingScreenButtonDto;
        this.options = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCreationOnboardingScreenFinishDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenFinishDto groupsCreationOnboardingScreenFinishDto = (GroupsCreationOnboardingScreenFinishDto) obj;
        return epx.f(this.title, groupsCreationOnboardingScreenFinishDto.title) && epx.f(this.subtitle, groupsCreationOnboardingScreenFinishDto.subtitle) && epx.f(this.image, groupsCreationOnboardingScreenFinishDto.image) && epx.f(this.button, groupsCreationOnboardingScreenFinishDto.button) && epx.f(this.options, groupsCreationOnboardingScreenFinishDto.options);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.subtitle), 31, this.image);
        GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto = this.button;
        int hashCode = (a2 + (groupsCreationOnboardingScreenButtonDto == null ? 0 : groupsCreationOnboardingScreenButtonDto.hashCode())) * 31;
        List<GroupsCreationOnboardingScreenOptionDto> list = this.options;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCreationOnboardingScreenFinishDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", options=");
        return ms9.a(')', sb, this.options);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.image);
        GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto = this.button;
        if (groupsCreationOnboardingScreenButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenButtonDto.writeToParcel(parcel, i);
        }
        List<GroupsCreationOnboardingScreenOptionDto> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsCreationOnboardingScreenOptionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsCreationOnboardingScreenFinishDto(String str, String str2, String str3, GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto, List list, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : groupsCreationOnboardingScreenButtonDto, (i & 16) != 0 ? null : list);
    }
}
