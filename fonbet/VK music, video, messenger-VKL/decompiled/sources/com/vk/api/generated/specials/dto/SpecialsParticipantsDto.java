package com.vk.api.generated.specials.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: SpecialsParticipantsDto.kt */
/* loaded from: classes15.dex */
public final class SpecialsParticipantsDto implements Parcelable {
    public static final Parcelable.Creator<SpecialsParticipantsDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<Integer> items;

    @pmi0("text")
    private final String text;

    @pmi0(X3.i.l)
    private final int total;

    /* compiled from: SpecialsParticipantsDto.kt */
    public static final class a implements Parcelable.Creator<SpecialsParticipantsDto> {
        @Override // android.os.Parcelable.Creator
        public final SpecialsParticipantsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new SpecialsParticipantsDto(arrayList, parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpecialsParticipantsDto[] newArray(int i) {
            return new SpecialsParticipantsDto[i];
        }
    }

    public SpecialsParticipantsDto(List<Integer> list, int i, int i2, String str) {
        this.items = list;
        this.total = i;
        this.count = i2;
        this.text = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsParticipantsDto)) {
            return false;
        }
        SpecialsParticipantsDto specialsParticipantsDto = (SpecialsParticipantsDto) obj;
        return epx.f(this.items, specialsParticipantsDto.items) && this.total == specialsParticipantsDto.total && this.count == specialsParticipantsDto.count && epx.f(this.text, specialsParticipantsDto.text);
    }

    public final int hashCode() {
        int a2 = shy.a(this.count, shy.a(this.total, this.items.hashCode() * 31, 31), 31);
        String str = this.text;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialsParticipantsDto(items=");
        sb.append(this.items);
        sb.append(", total=");
        sb.append(this.total);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeInt(this.total);
        parcel.writeInt(this.count);
        parcel.writeString(this.text);
    }

    public /* synthetic */ SpecialsParticipantsDto(List list, int i, int i2, String str, int i3, zcl zclVar) {
        this(list, i, i2, (i3 & 8) != 0 ? null : str);
    }
}
