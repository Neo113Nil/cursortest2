package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsGetBirthdaysResponseDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetBirthdaysResponseDto implements Parcelable {
    public static final Parcelable.Creator<FriendsGetBirthdaysResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("sections")
    private final List<FriendsGetBirthdaysSectionDto> sections;

    /* compiled from: FriendsGetBirthdaysResponseDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetBirthdaysResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetBirthdaysResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(FriendsGetBirthdaysSectionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new FriendsGetBirthdaysResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetBirthdaysResponseDto[] newArray(int i) {
            return new FriendsGetBirthdaysResponseDto[i];
        }
    }

    public FriendsGetBirthdaysResponseDto(int i, List<FriendsGetBirthdaysSectionDto> list) {
        this.count = i;
        this.sections = list;
    }

    public final List<FriendsGetBirthdaysSectionDto> d() {
        return this.sections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsGetBirthdaysResponseDto)) {
            return false;
        }
        FriendsGetBirthdaysResponseDto friendsGetBirthdaysResponseDto = (FriendsGetBirthdaysResponseDto) obj;
        return this.count == friendsGetBirthdaysResponseDto.count && epx.f(this.sections, friendsGetBirthdaysResponseDto.sections);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        List<FriendsGetBirthdaysSectionDto> list = this.sections;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsGetBirthdaysResponseDto(count=");
        sb.append(this.count);
        sb.append(", sections=");
        return ms9.a(')', sb, this.sections);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        List<FriendsGetBirthdaysSectionDto> list = this.sections;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((FriendsGetBirthdaysSectionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FriendsGetBirthdaysResponseDto(int i, List list, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list);
    }
}
