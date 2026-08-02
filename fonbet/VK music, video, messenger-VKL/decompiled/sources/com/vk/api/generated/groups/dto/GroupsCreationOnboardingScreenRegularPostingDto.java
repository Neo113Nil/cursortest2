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

/* compiled from: GroupsCreationOnboardingScreenRegularPostingDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenRegularPostingDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenRegularPostingDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<GroupsCreationOnboardingScreenOptionDto> options;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsCreationOnboardingScreenRegularPostingDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenRegularPostingDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenRegularPostingDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsCreationOnboardingScreenOptionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GroupsCreationOnboardingScreenRegularPostingDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenRegularPostingDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenRegularPostingDto[i];
        }
    }

    public GroupsCreationOnboardingScreenRegularPostingDto(String str, String str2, List<GroupsCreationOnboardingScreenOptionDto> list) {
        this.title = str;
        this.subtitle = str2;
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
        if (!(obj instanceof GroupsCreationOnboardingScreenRegularPostingDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenRegularPostingDto groupsCreationOnboardingScreenRegularPostingDto = (GroupsCreationOnboardingScreenRegularPostingDto) obj;
        return epx.f(this.title, groupsCreationOnboardingScreenRegularPostingDto.title) && epx.f(this.subtitle, groupsCreationOnboardingScreenRegularPostingDto.subtitle) && epx.f(this.options, groupsCreationOnboardingScreenRegularPostingDto.options);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.title.hashCode() * 31, 31, this.subtitle);
        List<GroupsCreationOnboardingScreenOptionDto> list = this.options;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCreationOnboardingScreenRegularPostingDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", options=");
        return ms9.a(')', sb, this.options);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
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

    public /* synthetic */ GroupsCreationOnboardingScreenRegularPostingDto(String str, String str2, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }
}
