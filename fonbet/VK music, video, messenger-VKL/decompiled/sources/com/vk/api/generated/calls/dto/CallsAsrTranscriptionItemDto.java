package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CallsAsrTranscriptionItemDto.kt */
/* loaded from: classes14.dex */
public final class CallsAsrTranscriptionItemDto implements Parcelable {
    public static final Parcelable.Creator<CallsAsrTranscriptionItemDto> CREATOR = new a();

    @pmi0("chat")
    private final CallsChatDto chat;

    @pmi0("date")
    private final int date;

    @pmi0("doc_id")
    private final String docId;

    @pmi0("doc_size")
    private final Integer docSize;

    @pmi0("doc_url")
    private final String docUrl;

    @pmi0("name")
    private final String name;

    /* compiled from: CallsAsrTranscriptionItemDto.kt */
    public static final class a implements Parcelable.Creator<CallsAsrTranscriptionItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsAsrTranscriptionItemDto createFromParcel(Parcel parcel) {
            return new CallsAsrTranscriptionItemDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? CallsChatDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CallsAsrTranscriptionItemDto[] newArray(int i) {
            return new CallsAsrTranscriptionItemDto[i];
        }
    }

    public CallsAsrTranscriptionItemDto(int i, String str, String str2, String str3, Integer num, CallsChatDto callsChatDto) {
        this.date = i;
        this.docId = str;
        this.name = str2;
        this.docUrl = str3;
        this.docSize = num;
        this.chat = callsChatDto;
    }

    public final CallsChatDto d() {
        return this.chat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsAsrTranscriptionItemDto)) {
            return false;
        }
        CallsAsrTranscriptionItemDto callsAsrTranscriptionItemDto = (CallsAsrTranscriptionItemDto) obj;
        return this.date == callsAsrTranscriptionItemDto.date && epx.f(this.docId, callsAsrTranscriptionItemDto.docId) && epx.f(this.name, callsAsrTranscriptionItemDto.name) && epx.f(this.docUrl, callsAsrTranscriptionItemDto.docUrl) && epx.f(this.docSize, callsAsrTranscriptionItemDto.docSize) && epx.f(this.chat, callsAsrTranscriptionItemDto.chat);
    }

    public final String f() {
        return this.docId;
    }

    public final Integer g() {
        return this.docSize;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.date) * 31, 31, this.docId);
        String str = this.name;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.docUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.docSize;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        CallsChatDto callsChatDto = this.chat;
        return hashCode3 + (callsChatDto != null ? callsChatDto.hashCode() : 0);
    }

    public final String i() {
        return this.docUrl;
    }

    public final String j() {
        return this.name;
    }

    public final String toString() {
        return "CallsAsrTranscriptionItemDto(date=" + this.date + ", docId=" + this.docId + ", name=" + this.name + ", docUrl=" + this.docUrl + ", docSize=" + this.docSize + ", chat=" + this.chat + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.date);
        parcel.writeString(this.docId);
        parcel.writeString(this.name);
        parcel.writeString(this.docUrl);
        Integer num = this.docSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        CallsChatDto callsChatDto = this.chat;
        if (callsChatDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callsChatDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CallsAsrTranscriptionItemDto(int i, String str, String str2, String str3, Integer num, CallsChatDto callsChatDto, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : callsChatDto);
    }
}
