package com.vk.api.generated.shortVideo.dto;

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
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ShortVideoShortVideoOrdDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoOrdDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoOrdDto> CREATOR = new a();

    @pmi0("advertisers")
    private final List<ShortVideoShortVideoOrdAdvertiserDto> advertisers;

    @pmi0("moderated")
    private final Boolean moderated;

    @pmi0("title")
    private final String title;

    /* compiled from: ShortVideoShortVideoOrdDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoOrdDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoOrdDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoShortVideoOrdAdvertiserDto.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoShortVideoOrdDto(readString, arrayList, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoOrdDto[] newArray(int i) {
            return new ShortVideoShortVideoOrdDto[i];
        }
    }

    public ShortVideoShortVideoOrdDto(String str, List<ShortVideoShortVideoOrdAdvertiserDto> list, Boolean bool) {
        this.title = str;
        this.advertisers = list;
        this.moderated = bool;
    }

    public final List<ShortVideoShortVideoOrdAdvertiserDto> d() {
        return this.advertisers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoOrdDto)) {
            return false;
        }
        ShortVideoShortVideoOrdDto shortVideoShortVideoOrdDto = (ShortVideoShortVideoOrdDto) obj;
        return epx.f(this.title, shortVideoShortVideoOrdDto.title) && epx.f(this.advertisers, shortVideoShortVideoOrdDto.advertisers) && epx.f(this.moderated, shortVideoShortVideoOrdDto.moderated);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = fw3.a(this.title.hashCode() * 31, 31, this.advertisers);
        Boolean bool = this.moderated;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoOrdDto(title=");
        sb.append(this.title);
        sb.append(", advertisers=");
        sb.append(this.advertisers);
        sb.append(", moderated=");
        return tn.a(sb, this.moderated, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.advertisers);
        while (a2.hasNext()) {
            ((ShortVideoShortVideoOrdAdvertiserDto) a2.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.moderated;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ ShortVideoShortVideoOrdDto(String str, List list, Boolean bool, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : bool);
    }
}
