package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: BaseLinkButtonActionShareOptionsDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkButtonActionShareOptionsDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkButtonActionShareOptionsDto> CREATOR = new a();

    @pmi0("disable_message")
    private final boolean disableMessage;

    /* compiled from: BaseLinkButtonActionShareOptionsDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkButtonActionShareOptionsDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionShareOptionsDto createFromParcel(Parcel parcel) {
            return new BaseLinkButtonActionShareOptionsDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionShareOptionsDto[] newArray(int i) {
            return new BaseLinkButtonActionShareOptionsDto[i];
        }
    }

    public BaseLinkButtonActionShareOptionsDto(boolean z) {
        this.disableMessage = z;
    }

    public final boolean d() {
        return this.disableMessage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseLinkButtonActionShareOptionsDto) && this.disableMessage == ((BaseLinkButtonActionShareOptionsDto) obj).disableMessage;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.disableMessage);
    }

    public final String toString() {
        return q0.a(new StringBuilder("BaseLinkButtonActionShareOptionsDto(disableMessage="), this.disableMessage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.disableMessage ? 1 : 0);
    }
}
