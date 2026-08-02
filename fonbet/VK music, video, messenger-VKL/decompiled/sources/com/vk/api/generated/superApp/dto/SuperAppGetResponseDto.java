package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppGetResponseDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppGetResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("games")
    private final List<AppsAppDto> games;

    @pmi0("items")
    private final List<SuperAppItemDto> items;

    @pmi0("mini_apps")
    private final List<AppsAppMinDto> miniApps;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("promo_widget_ids")
    private final List<String> promoWidgetIds;

    @pmi0("queue")
    private final SuperAppQueueSubscriptionInfoDto queue;

    @pmi0("session_id")
    private final Integer sessionId;

    @pmi0("update_options")
    private final SuperAppItemUpdateOptionsDto updateOptions;

    /* compiled from: SuperAppGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppGetResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(SuperAppItemDto.CREATOR, parcel, arrayList4, i2, 1);
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(SuperAppGetResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(SuperAppGetResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = bo.b(SuperAppGetResponseDto.class, parcel, arrayList5, i, 1);
                }
                arrayList3 = arrayList5;
            }
            return new SuperAppGetResponseDto(readInt, arrayList4, valueOf, arrayList, arrayList2, arrayList3, parcel.readInt() == 0 ? null : SuperAppItemUpdateOptionsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppQueueSubscriptionInfoDto.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppGetResponseDto[] newArray(int i) {
            return new SuperAppGetResponseDto[i];
        }
    }

    public SuperAppGetResponseDto(int i, List<SuperAppItemDto> list, Integer num, List<AppsAppMinDto> list2, List<AppsAppDto> list3, List<UsersUserFullDto> list4, SuperAppItemUpdateOptionsDto superAppItemUpdateOptionsDto, SuperAppQueueSubscriptionInfoDto superAppQueueSubscriptionInfoDto, List<String> list5) {
        this.count = i;
        this.items = list;
        this.sessionId = num;
        this.miniApps = list2;
        this.games = list3;
        this.profiles = list4;
        this.updateOptions = superAppItemUpdateOptionsDto;
        this.queue = superAppQueueSubscriptionInfoDto;
        this.promoWidgetIds = list5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppGetResponseDto)) {
            return false;
        }
        SuperAppGetResponseDto superAppGetResponseDto = (SuperAppGetResponseDto) obj;
        return this.count == superAppGetResponseDto.count && epx.f(this.items, superAppGetResponseDto.items) && epx.f(this.sessionId, superAppGetResponseDto.sessionId) && epx.f(this.miniApps, superAppGetResponseDto.miniApps) && epx.f(this.games, superAppGetResponseDto.games) && epx.f(this.profiles, superAppGetResponseDto.profiles) && epx.f(this.updateOptions, superAppGetResponseDto.updateOptions) && epx.f(this.queue, superAppGetResponseDto.queue) && epx.f(this.promoWidgetIds, superAppGetResponseDto.promoWidgetIds);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.sessionId;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        List<AppsAppMinDto> list = this.miniApps;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AppsAppDto> list2 = this.games;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        SuperAppItemUpdateOptionsDto superAppItemUpdateOptionsDto = this.updateOptions;
        int hashCode5 = (hashCode4 + (superAppItemUpdateOptionsDto == null ? 0 : superAppItemUpdateOptionsDto.hashCode())) * 31;
        SuperAppQueueSubscriptionInfoDto superAppQueueSubscriptionInfoDto = this.queue;
        int hashCode6 = (hashCode5 + (superAppQueueSubscriptionInfoDto == null ? 0 : superAppQueueSubscriptionInfoDto.hashCode())) * 31;
        List<String> list4 = this.promoWidgetIds;
        return hashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppGetResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", miniApps=");
        sb.append(this.miniApps);
        sb.append(", games=");
        sb.append(this.games);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", updateOptions=");
        sb.append(this.updateOptions);
        sb.append(", queue=");
        sb.append(this.queue);
        sb.append(", promoWidgetIds=");
        return ms9.a(')', sb, this.promoWidgetIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SuperAppItemDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.sessionId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<AppsAppMinDto> list = this.miniApps;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<AppsAppDto> list2 = this.games;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<UsersUserFullDto> list3 = this.profiles;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        SuperAppItemUpdateOptionsDto superAppItemUpdateOptionsDto = this.updateOptions;
        if (superAppItemUpdateOptionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppItemUpdateOptionsDto.writeToParcel(parcel, i);
        }
        SuperAppQueueSubscriptionInfoDto superAppQueueSubscriptionInfoDto = this.queue;
        if (superAppQueueSubscriptionInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppQueueSubscriptionInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.promoWidgetIds);
    }

    public /* synthetic */ SuperAppGetResponseDto(int i, List list, Integer num, List list2, List list3, List list4, SuperAppItemUpdateOptionsDto superAppItemUpdateOptionsDto, SuperAppQueueSubscriptionInfoDto superAppQueueSubscriptionInfoDto, List list5, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : list4, (i2 & 64) != 0 ? null : superAppItemUpdateOptionsDto, (i2 & 128) != 0 ? null : superAppQueueSubscriptionInfoDto, (i2 & 256) != 0 ? null : list5);
    }
}
