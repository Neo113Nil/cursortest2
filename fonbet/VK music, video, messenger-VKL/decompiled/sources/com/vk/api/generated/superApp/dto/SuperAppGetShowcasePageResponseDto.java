package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseItemDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SuperAppGetShowcasePageResponseDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppGetShowcasePageResponseDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppGetShowcasePageResponseDto> CREATOR = new a();

    @pmi0("games")
    private final List<AppsAppDto> games;

    @pmi0("items")
    private final List<SuperAppShowcaseItemDto> items;

    @pmi0("mini_apps")
    private final List<AppsAppMinDto> miniApps;

    @pmi0("next_offset")
    private final Integer nextOffset;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: SuperAppGetShowcasePageResponseDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppGetShowcasePageResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppGetShowcasePageResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(SuperAppShowcaseItemDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = bo.b(SuperAppGetShowcasePageResponseDto.class, parcel, arrayList2, i3, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i4 = 0;
            while (i4 != readInt3) {
                i4 = bo.b(SuperAppGetShowcasePageResponseDto.class, parcel, arrayList3, i4, 1);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt4);
            while (i != readInt4) {
                i = bo.b(SuperAppGetShowcasePageResponseDto.class, parcel, arrayList4, i, 1);
            }
            return new SuperAppGetShowcasePageResponseDto(arrayList, arrayList2, arrayList3, arrayList4, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppGetShowcasePageResponseDto[] newArray(int i) {
            return new SuperAppGetShowcasePageResponseDto[i];
        }
    }

    public SuperAppGetShowcasePageResponseDto(List<SuperAppShowcaseItemDto> list, List<AppsAppMinDto> list2, List<AppsAppDto> list3, List<UsersUserFullDto> list4, Integer num) {
        this.items = list;
        this.miniApps = list2;
        this.games = list3;
        this.profiles = list4;
        this.nextOffset = num;
    }

    public final List<AppsAppDto> d() {
        return this.games;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<SuperAppShowcaseItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppGetShowcasePageResponseDto)) {
            return false;
        }
        SuperAppGetShowcasePageResponseDto superAppGetShowcasePageResponseDto = (SuperAppGetShowcasePageResponseDto) obj;
        return epx.f(this.items, superAppGetShowcasePageResponseDto.items) && epx.f(this.miniApps, superAppGetShowcasePageResponseDto.miniApps) && epx.f(this.games, superAppGetShowcasePageResponseDto.games) && epx.f(this.profiles, superAppGetShowcasePageResponseDto.profiles) && epx.f(this.nextOffset, superAppGetShowcasePageResponseDto.nextOffset);
    }

    public final List<AppsAppMinDto> f() {
        return this.miniApps;
    }

    public final Integer g() {
        return this.nextOffset;
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(fw3.a(this.items.hashCode() * 31, 31, this.miniApps), 31, this.games), 31, this.profiles);
        Integer num = this.nextOffset;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final List<UsersUserFullDto> i() {
        return this.profiles;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppGetShowcasePageResponseDto(items=");
        sb.append(this.items);
        sb.append(", miniApps=");
        sb.append(this.miniApps);
        sb.append(", games=");
        sb.append(this.games);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", nextOffset=");
        return uqi.b(sb, this.nextOffset, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SuperAppShowcaseItemDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.miniApps);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        Iterator a4 = ao.a(parcel, this.games);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
        Iterator a5 = ao.a(parcel, this.profiles);
        while (a5.hasNext()) {
            parcel.writeParcelable((Parcelable) a5.next(), i);
        }
        Integer num = this.nextOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ SuperAppGetShowcasePageResponseDto(List list, List list2, List list3, List list4, Integer num, int i, zcl zclVar) {
        this(list, list2, list3, list4, (i & 16) != 0 ? null : num);
    }
}
