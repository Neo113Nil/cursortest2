package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CallsReactionDto.kt */
/* loaded from: classes14.dex */
public final class CallsReactionDto implements Parcelable {
    public static final Parcelable.Creator<CallsReactionDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("images")
    private final List<CallsReactionImageDto> images;

    @pmi0("key")
    private final String key;

    /* compiled from: CallsReactionDto.kt */
    public static final class a implements Parcelable.Creator<CallsReactionDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsReactionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(CallsReactionImageDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new CallsReactionDto(readString, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsReactionDto[] newArray(int i) {
            return new CallsReactionDto[i];
        }
    }

    public CallsReactionDto(String str, List<CallsReactionImageDto> list, String str2) {
        this.key = str;
        this.images = list;
        this.description = str2;
    }

    public final List<CallsReactionImageDto> d() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsReactionDto)) {
            return false;
        }
        CallsReactionDto callsReactionDto = (CallsReactionDto) obj;
        return epx.f(this.key, callsReactionDto.key) && epx.f(this.images, callsReactionDto.images) && epx.f(this.description, callsReactionDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int a2 = fw3.a(this.key.hashCode() * 31, 31, this.images);
        String str = this.description;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsReactionDto(key=");
        sb.append(this.key);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        Iterator a2 = ao.a(parcel, this.images);
        while (a2.hasNext()) {
            ((CallsReactionImageDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
    }

    public /* synthetic */ CallsReactionDto(String str, List list, String str2, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : str2);
    }
}
