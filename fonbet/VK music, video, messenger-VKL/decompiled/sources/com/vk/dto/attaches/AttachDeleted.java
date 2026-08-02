package com.vk.dto.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.sr;
import xsna.vu5;
import xsna.zcl;

/* compiled from: AttachDeleted.kt */
/* loaded from: classes18.dex */
public final class AttachDeleted implements AttachWithId {
    public static final Serializer.c<AttachDeleted> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public final UserId d;
    public final int e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachDeleted> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachDeleted a(Serializer serializer) {
            return new AttachDeleted(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachDeleted[i];
        }
    }

    public AttachDeleted(int i, AttachSyncState attachSyncState, UserId userId, int i2) {
        this.b = i;
        this.c = attachSyncState;
        this.d = userId;
        this.e = i2;
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
        serializer.e0(this.d);
        serializer.S(this.e);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachDeleted(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachDeleted)) {
            return false;
        }
        AttachDeleted attachDeleted = (AttachDeleted) obj;
        return this.b == attachDeleted.b && this.c == attachDeleted.c && epx.f(this.d, attachDeleted.d) && this.e == attachDeleted.e;
    }

    @Override // xsna.htx0
    public final long getId() {
        return Integer.hashCode(this.e) + Long.hashCode(this.d.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + bh10.a(bo.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d.b);
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
        StringBuilder sb = new StringBuilder("AttachDeleted(localId=");
        sb.append(this.b);
        sb.append(", syncState=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", type=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachDeleted(AttachDeleted attachDeleted) {
        this(attachDeleted.b, attachDeleted.c, attachDeleted.d, attachDeleted.e);
    }

    public AttachDeleted(Serializer serializer, zcl zclVar) {
        this(serializer.u(), sr.b(serializer, AttachSyncState.Companion), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.u());
    }
}
