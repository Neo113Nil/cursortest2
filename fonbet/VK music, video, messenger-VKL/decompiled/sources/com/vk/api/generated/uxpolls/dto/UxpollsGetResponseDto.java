package com.vk.api.generated.uxpolls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UxpollsGetResponseDto.kt */
/* loaded from: classes15.dex */
public final class UxpollsGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<UxpollsGetResponseDto> CREATOR = new a();

    @pmi0("config")
    private final UxpollsConfigDto config;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UxpollsPollDto> items;

    /* compiled from: UxpollsGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<UxpollsGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final UxpollsGetResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(UxpollsPollDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new UxpollsGetResponseDto(readInt, arrayList, parcel.readInt() == 0 ? null : UxpollsConfigDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UxpollsGetResponseDto[] newArray(int i) {
            return new UxpollsGetResponseDto[i];
        }
    }

    public UxpollsGetResponseDto(int i, List<UxpollsPollDto> list, UxpollsConfigDto uxpollsConfigDto) {
        this.count = i;
        this.items = list;
        this.config = uxpollsConfigDto;
    }

    public final UxpollsConfigDto d() {
        return this.config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UxpollsPollDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxpollsGetResponseDto)) {
            return false;
        }
        UxpollsGetResponseDto uxpollsGetResponseDto = (UxpollsGetResponseDto) obj;
        return this.count == uxpollsGetResponseDto.count && epx.f(this.items, uxpollsGetResponseDto.items) && epx.f(this.config, uxpollsGetResponseDto.config);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        UxpollsConfigDto uxpollsConfigDto = this.config;
        return a2 + (uxpollsConfigDto == null ? 0 : uxpollsConfigDto.hashCode());
    }

    public final String toString() {
        return "UxpollsGetResponseDto(count=" + this.count + ", items=" + this.items + ", config=" + this.config + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((UxpollsPollDto) a2.next()).writeToParcel(parcel, i);
        }
        UxpollsConfigDto uxpollsConfigDto = this.config;
        if (uxpollsConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uxpollsConfigDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ UxpollsGetResponseDto(int i, List list, UxpollsConfigDto uxpollsConfigDto, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : uxpollsConfigDto);
    }
}
