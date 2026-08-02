package com.vk.dto.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.bo;
import xsna.epx;
import xsna.i5s;
import xsna.sr;
import xsna.zcl;

/* compiled from: AttachUnsupported.kt */
/* loaded from: classes18.dex */
public final class AttachUnsupported implements AttachWithId {
    public static final Serializer.c<AttachUnsupported> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public final UserId d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachUnsupported> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachUnsupported a(Serializer serializer) {
            return new AttachUnsupported(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachUnsupported[i];
        }
    }

    public AttachUnsupported(String str) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.e = str;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return "";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.j0(this.e);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachUnsupported(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttachUnsupported.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachUnsupported attachUnsupported = (AttachUnsupported) obj;
        return this.b == attachUnsupported.b && this.c == attachUnsupported.c && epx.f(this.e, attachUnsupported.e);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.d.b;
    }

    public final int hashCode() {
        return this.e.hashCode() + bo.a(this.c, this.b * 31, 31);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.b = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachUnsupported(localId=");
        sb.append(this.b);
        sb.append(", syncState=");
        sb.append(this.c);
        sb.append(", debug='");
        return i5s.a(sb, this.e, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachUnsupported(AttachUnsupported attachUnsupported) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.e = "";
        this.b = attachUnsupported.b;
        this.c = attachUnsupported.c;
        this.e = attachUnsupported.e;
    }

    public AttachUnsupported(Serializer serializer, zcl zclVar) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.e = "";
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.e = serializer.H();
    }
}
