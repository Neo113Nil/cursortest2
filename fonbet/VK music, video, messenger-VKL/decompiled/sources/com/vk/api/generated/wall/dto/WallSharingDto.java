package com.vk.api.generated.wall.dto;

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

/* compiled from: WallSharingDto.kt */
/* loaded from: classes15.dex */
public final class WallSharingDto implements Parcelable {
    public static final Parcelable.Creator<WallSharingDto> CREATOR = new a();

    @pmi0("targets")
    private final List<WallSharingTargetDto> targets;

    /* compiled from: WallSharingDto.kt */
    public static final class a implements Parcelable.Creator<WallSharingDto> {
        @Override // android.os.Parcelable.Creator
        public final WallSharingDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(WallSharingTargetDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new WallSharingDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final WallSharingDto[] newArray(int i) {
            return new WallSharingDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallSharingDto() {
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
        return (obj instanceof WallSharingDto) && epx.f(this.targets, ((WallSharingDto) obj).targets);
    }

    public final int hashCode() {
        List<WallSharingTargetDto> list = this.targets;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("WallSharingDto(targets="), this.targets);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<WallSharingTargetDto> list = this.targets;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((WallSharingTargetDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public WallSharingDto(List<WallSharingTargetDto> list) {
        this.targets = list;
    }

    public /* synthetic */ WallSharingDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
