package com.vk.api.generated.uxpolls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: UxpollsPollDto.kt */
/* loaded from: classes15.dex */
public final class UxpollsPollDto implements Parcelable {
    public static final Parcelable.Creator<UxpollsPollDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("initial_height")
    private final Integer initialHeight;

    @pmi0("metadata")
    private final String metadata;

    @pmi0("triggers")
    private final List<String> triggers;

    /* compiled from: UxpollsPollDto.kt */
    public static final class a implements Parcelable.Creator<UxpollsPollDto> {
        @Override // android.os.Parcelable.Creator
        public final UxpollsPollDto createFromParcel(Parcel parcel) {
            return new UxpollsPollDto(parcel.readInt(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final UxpollsPollDto[] newArray(int i) {
            return new UxpollsPollDto[i];
        }
    }

    public UxpollsPollDto(int i, List<String> list, String str, Integer num) {
        this.id = i;
        this.triggers = list;
        this.metadata = str;
        this.initialHeight = num;
    }

    public final Integer d() {
        return this.initialHeight;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxpollsPollDto)) {
            return false;
        }
        UxpollsPollDto uxpollsPollDto = (UxpollsPollDto) obj;
        return this.id == uxpollsPollDto.id && epx.f(this.triggers, uxpollsPollDto.triggers) && epx.f(this.metadata, uxpollsPollDto.metadata) && epx.f(this.initialHeight, uxpollsPollDto.initialHeight);
    }

    public final List<String> f() {
        return this.triggers;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.id) * 31, 31, this.triggers);
        String str = this.metadata;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.initialHeight;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UxpollsPollDto(id=");
        sb.append(this.id);
        sb.append(", triggers=");
        sb.append(this.triggers);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", initialHeight=");
        return uqi.b(sb, this.initialHeight, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeStringList(this.triggers);
        parcel.writeString(this.metadata);
        Integer num = this.initialHeight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ UxpollsPollDto(int i, List list, String str, Integer num, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : num);
    }
}
