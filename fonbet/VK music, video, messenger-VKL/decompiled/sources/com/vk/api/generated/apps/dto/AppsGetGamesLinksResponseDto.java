package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AppsGetGamesLinksResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetGamesLinksResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetGamesLinksResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<AppsGameLinkDto> items;

    @pmi0(X3.i.l)
    private final int total;

    /* compiled from: AppsGetGamesLinksResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetGamesLinksResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetGamesLinksResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(AppsGameLinkDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsGetGamesLinksResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetGamesLinksResponseDto[] newArray(int i) {
            return new AppsGetGamesLinksResponseDto[i];
        }
    }

    public AppsGetGamesLinksResponseDto(int i, List<AppsGameLinkDto> list) {
        this.total = i;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetGamesLinksResponseDto)) {
            return false;
        }
        AppsGetGamesLinksResponseDto appsGetGamesLinksResponseDto = (AppsGetGamesLinksResponseDto) obj;
        return this.total == appsGetGamesLinksResponseDto.total && epx.f(this.items, appsGetGamesLinksResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.total) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetGamesLinksResponseDto(total=");
        sb.append(this.total);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.total);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsGameLinkDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
