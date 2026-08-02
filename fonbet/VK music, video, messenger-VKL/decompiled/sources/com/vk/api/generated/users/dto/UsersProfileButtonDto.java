package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: UsersProfileButtonDto.kt */
/* loaded from: classes15.dex */
public final class UsersProfileButtonDto implements Parcelable {
    public static final Parcelable.Creator<UsersProfileButtonDto> CREATOR = new a();

    @pmi0("action")
    private final UsersProfileButtonActionDto action;

    @pmi0("badge_counter")
    private final Integer badgeCounter;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("icons_additional")
    private final List<BaseImageDto> iconsAdditional;

    @pmi0("no_follow")
    private final Boolean noFollow;

    @pmi0("text")
    private final String text;

    @pmi0("uid")
    private final String uid;

    /* compiled from: UsersProfileButtonDto.kt */
    public static final class a implements Parcelable.Creator<UsersProfileButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersProfileButtonDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            UsersProfileButtonActionDto createFromParcel = UsersProfileButtonActionDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(BaseImageDto.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UsersProfileButtonDto(createFromParcel, readString, readString2, arrayList, arrayList2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersProfileButtonDto[] newArray(int i) {
            return new UsersProfileButtonDto[i];
        }
    }

    public UsersProfileButtonDto(UsersProfileButtonActionDto usersProfileButtonActionDto, String str, String str2, List<BaseImageDto> list, List<BaseImageDto> list2, Integer num, Boolean bool) {
        this.action = usersProfileButtonActionDto;
        this.text = str;
        this.uid = str2;
        this.icons = list;
        this.iconsAdditional = list2;
        this.badgeCounter = num;
        this.noFollow = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersProfileButtonDto)) {
            return false;
        }
        UsersProfileButtonDto usersProfileButtonDto = (UsersProfileButtonDto) obj;
        return epx.f(this.action, usersProfileButtonDto.action) && epx.f(this.text, usersProfileButtonDto.text) && epx.f(this.uid, usersProfileButtonDto.uid) && epx.f(this.icons, usersProfileButtonDto.icons) && epx.f(this.iconsAdditional, usersProfileButtonDto.iconsAdditional) && epx.f(this.badgeCounter, usersProfileButtonDto.badgeCounter) && epx.f(this.noFollow, usersProfileButtonDto.noFollow);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.action.hashCode() * 31, 31, this.text);
        String str = this.uid;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.icons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.iconsAdditional;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.badgeCounter;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.noFollow;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersProfileButtonDto(action=");
        sb.append(this.action);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", icons=");
        sb.append(this.icons);
        sb.append(", iconsAdditional=");
        sb.append(this.iconsAdditional);
        sb.append(", badgeCounter=");
        sb.append(this.badgeCounter);
        sb.append(", noFollow=");
        return tn.a(sb, this.noFollow, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.action.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        parcel.writeString(this.uid);
        List<BaseImageDto> list = this.icons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<BaseImageDto> list2 = this.iconsAdditional;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((BaseImageDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.badgeCounter;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.noFollow;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ UsersProfileButtonDto(UsersProfileButtonActionDto usersProfileButtonActionDto, String str, String str2, List list, List list2, Integer num, Boolean bool, int i, zcl zclVar) {
        this(usersProfileButtonActionDto, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool);
    }
}
