package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseConfigurationDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseItemDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseStubsDto;
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
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SuperAppGetShowcaseResponseDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppGetShowcaseResponseDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppGetShowcaseResponseDto> CREATOR = new a();

    @pmi0("configurations")
    private final List<SuperAppShowcaseConfigurationDto> configurations;

    @pmi0("games")
    private final List<AppsAppDto> games;

    @pmi0("items")
    private final List<SuperAppShowcaseItemDto> items;

    @pmi0("mini_apps")
    private final List<AppsAppMinDto> miniApps;

    @pmi0("next_offset")
    private final Integer nextOffset;

    @pmi0("pagination_meta")
    private final String paginationMeta;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("queue")
    private final SuperAppQueueSubscriptionInfoDto queue;

    @pmi0("session_id")
    private final int sessionId;

    @pmi0("stubs")
    private final SuperAppShowcaseStubsDto stubs;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("update_options")
    private final SuperAppItemUpdateOptionsDto updateOptions;

    /* compiled from: SuperAppGetShowcaseResponseDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppGetShowcaseResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppGetShowcaseResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(SuperAppShowcaseItemDto.CREATOR, parcel, arrayList2, i, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i2 = 0;
            while (i2 != readInt3) {
                i2 = bo.b(SuperAppGetShowcaseResponseDto.class, parcel, arrayList3, i2, 1);
            }
            int readInt4 = parcel.readInt();
            int i3 = 0;
            ArrayList arrayList4 = new ArrayList(readInt4);
            int i4 = 0;
            while (i4 != readInt4) {
                i4 = bo.b(SuperAppGetShowcaseResponseDto.class, parcel, arrayList4, i4, 1);
            }
            int readInt5 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt5);
            int i5 = 0;
            while (i5 != readInt5) {
                i5 = bo.b(SuperAppGetShowcaseResponseDto.class, parcel, arrayList5, i5, 1);
            }
            String readString = parcel.readString();
            SuperAppItemUpdateOptionsDto createFromParcel = parcel.readInt() == 0 ? null : SuperAppItemUpdateOptionsDto.CREATOR.createFromParcel(parcel);
            SuperAppQueueSubscriptionInfoDto createFromParcel2 = parcel.readInt() == 0 ? null : SuperAppQueueSubscriptionInfoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList = new ArrayList(readInt6);
                while (i3 != readInt6) {
                    i3 = bo.b(SuperAppGetShowcaseResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            return new SuperAppGetShowcaseResponseDto(readInt, arrayList2, arrayList3, arrayList4, arrayList5, readString, createFromParcel, createFromParcel2, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? SuperAppShowcaseStubsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppGetShowcaseResponseDto[] newArray(int i) {
            return new SuperAppGetShowcaseResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppGetShowcaseResponseDto(int i, List<SuperAppShowcaseItemDto> list, List<AppsAppMinDto> list2, List<AppsAppDto> list3, List<UsersUserFullDto> list4, String str, SuperAppItemUpdateOptionsDto superAppItemUpdateOptionsDto, SuperAppQueueSubscriptionInfoDto superAppQueueSubscriptionInfoDto, List<? extends SuperAppShowcaseConfigurationDto> list5, Integer num, String str2, SuperAppShowcaseStubsDto superAppShowcaseStubsDto) {
        this.sessionId = i;
        this.items = list;
        this.miniApps = list2;
        this.games = list3;
        this.profiles = list4;
        this.trackCode = str;
        this.updateOptions = superAppItemUpdateOptionsDto;
        this.queue = superAppQueueSubscriptionInfoDto;
        this.configurations = list5;
        this.nextOffset = num;
        this.paginationMeta = str2;
        this.stubs = superAppShowcaseStubsDto;
    }

    public final List<SuperAppShowcaseConfigurationDto> d() {
        return this.configurations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AppsAppDto> e() {
        return this.games;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppGetShowcaseResponseDto)) {
            return false;
        }
        SuperAppGetShowcaseResponseDto superAppGetShowcaseResponseDto = (SuperAppGetShowcaseResponseDto) obj;
        return this.sessionId == superAppGetShowcaseResponseDto.sessionId && epx.f(this.items, superAppGetShowcaseResponseDto.items) && epx.f(this.miniApps, superAppGetShowcaseResponseDto.miniApps) && epx.f(this.games, superAppGetShowcaseResponseDto.games) && epx.f(this.profiles, superAppGetShowcaseResponseDto.profiles) && epx.f(this.trackCode, superAppGetShowcaseResponseDto.trackCode) && epx.f(this.updateOptions, superAppGetShowcaseResponseDto.updateOptions) && epx.f(this.queue, superAppGetShowcaseResponseDto.queue) && epx.f(this.configurations, superAppGetShowcaseResponseDto.configurations) && epx.f(this.nextOffset, superAppGetShowcaseResponseDto.nextOffset) && epx.f(this.paginationMeta, superAppGetShowcaseResponseDto.paginationMeta) && epx.f(this.stubs, superAppGetShowcaseResponseDto.stubs);
    }

    public final List<SuperAppShowcaseItemDto> f() {
        return this.items;
    }

    public final List<AppsAppMinDto> g() {
        return this.miniApps;
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(fw3.a(fw3.a(fw3.a(Integer.hashCode(this.sessionId) * 31, 31, this.items), 31, this.miniApps), 31, this.games), 31, this.profiles), 31, this.trackCode);
        SuperAppItemUpdateOptionsDto superAppItemUpdateOptionsDto = this.updateOptions;
        int hashCode = (a2 + (superAppItemUpdateOptionsDto == null ? 0 : superAppItemUpdateOptionsDto.hashCode())) * 31;
        SuperAppQueueSubscriptionInfoDto superAppQueueSubscriptionInfoDto = this.queue;
        int hashCode2 = (hashCode + (superAppQueueSubscriptionInfoDto == null ? 0 : superAppQueueSubscriptionInfoDto.hashCode())) * 31;
        List<SuperAppShowcaseConfigurationDto> list = this.configurations;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.nextOffset;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.paginationMeta;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        SuperAppShowcaseStubsDto superAppShowcaseStubsDto = this.stubs;
        return hashCode5 + (superAppShowcaseStubsDto != null ? superAppShowcaseStubsDto.hashCode() : 0);
    }

    public final Integer i() {
        return this.nextOffset;
    }

    public final String j() {
        return this.paginationMeta;
    }

    public final List<UsersUserFullDto> k() {
        return this.profiles;
    }

    public final SuperAppQueueSubscriptionInfoDto l() {
        return this.queue;
    }

    public final int n() {
        return this.sessionId;
    }

    public final SuperAppShowcaseStubsDto o() {
        return this.stubs;
    }

    public final SuperAppItemUpdateOptionsDto p() {
        return this.updateOptions;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "SuperAppGetShowcaseResponseDto(sessionId=" + this.sessionId + ", items=" + this.items + ", miniApps=" + this.miniApps + ", games=" + this.games + ", profiles=" + this.profiles + ", trackCode=" + this.trackCode + ", updateOptions=" + this.updateOptions + ", queue=" + this.queue + ", configurations=" + this.configurations + ", nextOffset=" + this.nextOffset + ", paginationMeta=" + this.paginationMeta + ", stubs=" + this.stubs + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sessionId);
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
        parcel.writeString(this.trackCode);
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
        List<SuperAppShowcaseConfigurationDto> list = this.configurations;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.nextOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.paginationMeta);
        SuperAppShowcaseStubsDto superAppShowcaseStubsDto = this.stubs;
        if (superAppShowcaseStubsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppShowcaseStubsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppGetShowcaseResponseDto(int i, List list, List list2, List list3, List list4, String str, SuperAppItemUpdateOptionsDto superAppItemUpdateOptionsDto, SuperAppQueueSubscriptionInfoDto superAppQueueSubscriptionInfoDto, List list5, Integer num, String str2, SuperAppShowcaseStubsDto superAppShowcaseStubsDto, int i2, zcl zclVar) {
        this(i, list, list2, list3, list4, str, (i2 & 64) != 0 ? null : superAppItemUpdateOptionsDto, (i2 & 128) != 0 ? null : superAppQueueSubscriptionInfoDto, (i2 & 256) != 0 ? null : list5, (i2 & 512) != 0 ? null : num, (i2 & 1024) != 0 ? null : str2, (i2 & 2048) != 0 ? null : superAppShowcaseStubsDto);
    }
}
