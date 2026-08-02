package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsContentSectionsDataDto.kt */
/* loaded from: classes14.dex */
public final class GroupsContentSectionsDataDto implements Parcelable {
    public static final Parcelable.Creator<GroupsContentSectionsDataDto> CREATOR = new a();

    @pmi0("first_section_name")
    private final String firstSectionName;

    /* compiled from: GroupsContentSectionsDataDto.kt */
    public static final class a implements Parcelable.Creator<GroupsContentSectionsDataDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsContentSectionsDataDto createFromParcel(Parcel parcel) {
            return new GroupsContentSectionsDataDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsContentSectionsDataDto[] newArray(int i) {
            return new GroupsContentSectionsDataDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsContentSectionsDataDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupsContentSectionsDataDto) && epx.f(this.firstSectionName, ((GroupsContentSectionsDataDto) obj).firstSectionName);
    }

    public final int hashCode() {
        String str = this.firstSectionName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("GroupsContentSectionsDataDto(firstSectionName="), this.firstSectionName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstSectionName);
    }

    public GroupsContentSectionsDataDto(String str) {
        this.firstSectionName = str;
    }

    public /* synthetic */ GroupsContentSectionsDataDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
