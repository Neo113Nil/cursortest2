package com.vk.voip.api.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VoipChatInfo.kt */
/* loaded from: classes7.dex */
public final class VoipChatInfo implements Parcelable {
    public static final a CREATOR = new a();
    public final long b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final Integer f;
    public final Boolean g;

    /* compiled from: VoipChatInfo.kt */
    public static final class a implements Parcelable.Creator<VoipChatInfo> {
        @Override // android.os.Parcelable.Creator
        public final VoipChatInfo createFromParcel(Parcel parcel) {
            return new VoipChatInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VoipChatInfo[] newArray(int i) {
            return new VoipChatInfo[i];
        }
    }

    public VoipChatInfo(long j, String str, String str2, Boolean bool, Integer num, Boolean bool2) {
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = bool;
        this.f = num;
        this.g = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoipChatInfo)) {
            return false;
        }
        VoipChatInfo voipChatInfo = (VoipChatInfo) obj;
        return this.b == voipChatInfo.b && epx.f(this.c, voipChatInfo.c) && epx.f(this.d, voipChatInfo.d) && epx.f(this.e, voipChatInfo.e) && epx.f(this.f, voipChatInfo.f) && epx.f(this.g, voipChatInfo.g);
    }

    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        Boolean bool = this.e;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.g;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipChatInfo(dialogId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", photo=");
        sb.append(this.d);
        sb.append(", canFinishCall=");
        sb.append(this.e);
        sb.append(", sessionRoomId=");
        sb.append(this.f);
        sb.append(", isService=");
        return tn.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeValue(this.e);
        parcel.writeValue(this.f);
        parcel.writeValue(this.g);
    }

    public /* synthetic */ VoipChatInfo(long j, String str, String str2, Boolean bool, Integer num, Boolean bool2, int i, zcl zclVar) {
        this(j, str, str2, bool, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VoipChatInfo(Parcel parcel) {
        this(r1, r3, r4, r5, r6, r10 instanceof Boolean ? (Boolean) r10 : null);
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Class cls = Boolean.TYPE;
        Object readValue = parcel.readValue(cls.getClassLoader());
        Boolean bool = readValue instanceof Boolean ? (Boolean) readValue : null;
        Object readValue2 = parcel.readValue(Integer.TYPE.getClassLoader());
        Integer num = readValue2 instanceof Integer ? (Integer) readValue2 : null;
        Object readValue3 = parcel.readValue(cls.getClassLoader());
    }
}
