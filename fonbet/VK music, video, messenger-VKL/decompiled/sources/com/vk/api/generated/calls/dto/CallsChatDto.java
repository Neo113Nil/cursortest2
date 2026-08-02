package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;

/* compiled from: CallsChatDto.kt */
/* loaded from: classes14.dex */
public final class CallsChatDto implements Parcelable {
    public static final Parcelable.Creator<CallsChatDto> CREATOR = new a();

    @pmi0("is_kicked")
    private final boolean isKicked;

    @pmi0("is_left")
    private final boolean isLeft;

    @pmi0("peer_id")
    private final long peerId;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("title")
    private final String title;

    /* compiled from: CallsChatDto.kt */
    public static final class a implements Parcelable.Creator<CallsChatDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsChatDto createFromParcel(Parcel parcel) {
            return new CallsChatDto(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CallsChatDto[] newArray(int i) {
            return new CallsChatDto[i];
        }
    }

    public CallsChatDto(long j, String str, String str2, boolean z, boolean z2) {
        this.peerId = j;
        this.title = str;
        this.photoBase = str2;
        this.isLeft = z;
        this.isKicked = z2;
    }

    public final long d() {
        return this.peerId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.photoBase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsChatDto)) {
            return false;
        }
        CallsChatDto callsChatDto = (CallsChatDto) obj;
        return this.peerId == callsChatDto.peerId && epx.f(this.title, callsChatDto.title) && epx.f(this.photoBase, callsChatDto.photoBase) && this.isLeft == callsChatDto.isLeft && this.isKicked == callsChatDto.isKicked;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isKicked) + qoy.b(urd0.a(urd0.a(Long.hashCode(this.peerId) * 31, 31, this.title), 31, this.photoBase), 31, this.isLeft);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsChatDto(peerId=");
        sb.append(this.peerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", isLeft=");
        sb.append(this.isLeft);
        sb.append(", isKicked=");
        return q0.a(sb, this.isKicked, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.peerId);
        parcel.writeString(this.title);
        parcel.writeString(this.photoBase);
        parcel.writeInt(this.isLeft ? 1 : 0);
        parcel.writeInt(this.isKicked ? 1 : 0);
    }
}
