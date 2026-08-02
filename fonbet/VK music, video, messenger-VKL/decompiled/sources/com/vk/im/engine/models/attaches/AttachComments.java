package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: AttachComments.kt */
/* loaded from: classes2.dex */
public final class AttachComments implements Serializer.StreamParcelable {
    public static final Serializer.c<AttachComments> CREATOR = new a();
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachComments> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachComments a(Serializer serializer) {
            return new AttachComments(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachComments[i];
        }
    }

    public AttachComments(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachComments)) {
            return false;
        }
        AttachComments attachComments = (AttachComments) obj;
        return this.b == attachComments.b && this.c == attachComments.c && this.d == attachComments.d && this.e == attachComments.e && this.f == attachComments.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachComments(count=");
        sb.append(this.b);
        sb.append(", canView=");
        sb.append(this.c);
        sb.append(", canPost=");
        sb.append(this.d);
        sb.append(", canOpen=");
        sb.append(this.e);
        sb.append(", canClose=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public AttachComments(Serializer serializer, zcl zclVar) {
        this(serializer.u(), serializer.m(), serializer.m(), serializer.m(), serializer.m());
    }
}
