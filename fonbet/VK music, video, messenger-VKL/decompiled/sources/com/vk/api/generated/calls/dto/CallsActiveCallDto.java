package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CallsActiveCallDto.kt */
/* loaded from: classes14.dex */
public final class CallsActiveCallDto implements Parcelable {
    public static final Parcelable.Creator<CallsActiveCallDto> CREATOR = new a();

    @pmi0("call_id")
    private final String callId;

    @pmi0("ok_join_link")
    private final String okJoinLink;

    @pmi0("title")
    private final String title;

    /* compiled from: CallsActiveCallDto.kt */
    public static final class a implements Parcelable.Creator<CallsActiveCallDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsActiveCallDto createFromParcel(Parcel parcel) {
            return new CallsActiveCallDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsActiveCallDto[] newArray(int i) {
            return new CallsActiveCallDto[i];
        }
    }

    public CallsActiveCallDto(String str, String str2, String str3) {
        this.callId = str;
        this.title = str2;
        this.okJoinLink = str3;
    }

    public final String d() {
        return this.okJoinLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsActiveCallDto)) {
            return false;
        }
        CallsActiveCallDto callsActiveCallDto = (CallsActiveCallDto) obj;
        return epx.f(this.callId, callsActiveCallDto.callId) && epx.f(this.title, callsActiveCallDto.title) && epx.f(this.okJoinLink, callsActiveCallDto.okJoinLink);
    }

    public final int hashCode() {
        int hashCode = this.callId.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.okJoinLink;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsActiveCallDto(callId=");
        sb.append(this.callId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", okJoinLink=");
        return ho8.a(sb, this.okJoinLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.callId);
        parcel.writeString(this.title);
        parcel.writeString(this.okJoinLink);
    }

    public /* synthetic */ CallsActiveCallDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
