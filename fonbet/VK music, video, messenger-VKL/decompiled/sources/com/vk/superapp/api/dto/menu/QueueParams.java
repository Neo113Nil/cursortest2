package com.vk.superapp.api.dto.menu;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;

/* compiled from: QueueParams.kt */
/* loaded from: classes6.dex */
public final class QueueParams implements Parcelable {
    public static final Parcelable.Creator<QueueParams> CREATOR = new b();
    public static final QueueParams g = new QueueParams("", "", "", 0, false, 16, null);
    public final String b;
    public final String c;
    public final String d;
    public long e;
    public final boolean f;

    /* compiled from: QueueParams.kt */
    public static final class a {
        public static QueueParams a() {
            return QueueParams.g;
        }
    }

    /* compiled from: QueueParams.kt */
    public static final class b implements Parcelable.Creator<QueueParams> {
        @Override // android.os.Parcelable.Creator
        public final QueueParams createFromParcel(Parcel parcel) {
            return new QueueParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final QueueParams[] newArray(int i) {
            return new QueueParams[i];
        }
    }

    public QueueParams(String str, String str2, String str3, long j, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = z;
    }

    public static QueueParams a(QueueParams queueParams, long j) {
        return new QueueParams(queueParams.b, queueParams.c, queueParams.d, j, queueParams.f);
    }

    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueParams)) {
            return false;
        }
        QueueParams queueParams = (QueueParams) obj;
        return epx.f(this.b, queueParams.b) && epx.f(this.c, queueParams.c) && epx.f(this.d, queueParams.d) && this.e == queueParams.e && this.f == queueParams.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + bh10.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueParams(queueId=");
        sb.append(this.b);
        sb.append(", baseUrl=");
        sb.append(this.c);
        sb.append(", key=");
        sb.append(this.d);
        sb.append(", timestamp=");
        sb.append(this.e);
        sb.append(", isSseQueue=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ QueueParams(String str, String str2, String str3, long j, boolean z, int i, zcl zclVar) {
        this(str, str2, str3, j, (i & 16) != 0 ? false : z);
    }
}
