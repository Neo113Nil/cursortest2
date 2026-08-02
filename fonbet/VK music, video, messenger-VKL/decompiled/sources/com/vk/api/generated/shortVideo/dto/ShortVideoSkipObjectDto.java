package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.FreeSpaceBox;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ShortVideoSkipObjectDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoSkipObjectDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoSkipObjectDto> CREATOR = new a();

    @pmi0(FreeSpaceBox.TYPE)
    private final Boolean skip;

    /* compiled from: ShortVideoSkipObjectDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoSkipObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoSkipObjectDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoSkipObjectDto(valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoSkipObjectDto[] newArray(int i) {
            return new ShortVideoSkipObjectDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoSkipObjectDto() {
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
        return (obj instanceof ShortVideoSkipObjectDto) && epx.f(this.skip, ((ShortVideoSkipObjectDto) obj).skip);
    }

    public final int hashCode() {
        Boolean bool = this.skip;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return tn.a(new StringBuilder("ShortVideoSkipObjectDto(skip="), this.skip, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.skip;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public ShortVideoSkipObjectDto(Boolean bool) {
        this.skip = bool;
    }

    public /* synthetic */ ShortVideoSkipObjectDto(Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
