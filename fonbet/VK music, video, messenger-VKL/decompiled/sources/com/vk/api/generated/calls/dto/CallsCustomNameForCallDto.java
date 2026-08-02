package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CallsCustomNameForCallDto.kt */
/* loaded from: classes14.dex */
public final class CallsCustomNameForCallDto implements Parcelable {
    public static final Parcelable.Creator<CallsCustomNameForCallDto> CREATOR = new a();

    @pmi0("call_id")
    private final String callId;

    @pmi0("name")
    private final String name;

    /* compiled from: CallsCustomNameForCallDto.kt */
    public static final class a implements Parcelable.Creator<CallsCustomNameForCallDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsCustomNameForCallDto createFromParcel(Parcel parcel) {
            return new CallsCustomNameForCallDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsCustomNameForCallDto[] newArray(int i) {
            return new CallsCustomNameForCallDto[i];
        }
    }

    public CallsCustomNameForCallDto(String str, String str2) {
        this.callId = str;
        this.name = str2;
    }

    public final String d() {
        return this.callId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsCustomNameForCallDto)) {
            return false;
        }
        CallsCustomNameForCallDto callsCustomNameForCallDto = (CallsCustomNameForCallDto) obj;
        return epx.f(this.callId, callsCustomNameForCallDto.callId) && epx.f(this.name, callsCustomNameForCallDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (this.callId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsCustomNameForCallDto(callId=");
        sb.append(this.callId);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.callId);
        parcel.writeString(this.name);
    }
}
