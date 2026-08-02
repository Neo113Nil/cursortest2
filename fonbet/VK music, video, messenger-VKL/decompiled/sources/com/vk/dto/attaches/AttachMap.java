package com.vk.dto.attaches;

import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.bo;
import xsna.epx;
import xsna.i5s;
import xsna.sr;
import xsna.urd0;
import xsna.zcl;
import xsna.zjh0;

/* compiled from: AttachMap.kt */
/* loaded from: classes18.dex */
public final class AttachMap implements AttachWithId {
    public static final Serializer.c<AttachMap> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public final UserId d;
    public double e;
    public double f;
    public String g;
    public String h;
    public String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachMap> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachMap a(Serializer serializer) {
            return new AttachMap(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachMap[i];
        }
    }

    public AttachMap() {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.g = "";
        this.h = "";
        this.i = "";
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
        serializer.O(this.e);
        serializer.O(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachMap(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttachMap.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachMap attachMap = (AttachMap) obj;
        return this.b == attachMap.b && this.c == attachMap.c && this.e == attachMap.e && this.f == attachMap.f && epx.f(this.g, attachMap.g) && epx.f(this.h, attachMap.h) && epx.f(this.i, attachMap.i);
    }

    @Override // xsna.htx0
    public final long getId() {
        return Long.hashCode(this.d.b) + Double.hashCode(this.e) + Double.hashCode(this.f) + this.h.hashCode() + this.i.hashCode() + this.g.hashCode();
    }

    public final int hashCode() {
        return this.i.hashCode() + urd0.a(urd0.a(zjh0.b(this.f, zjh0.b(this.e, bo.a(this.c, this.b * 31, 31), 31), 31), 31, this.g), 31, this.h);
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
        if (!BuildInfo.h()) {
            return "AttachMap(localId=" + this.b + ", syncState=" + this.c + ')';
        }
        StringBuilder sb = new StringBuilder("AttachMap(localId=");
        sb.append(this.b);
        sb.append(", syncState=");
        sb.append(this.c);
        sb.append(", latitude=");
        sb.append(this.e);
        sb.append(", longitude=");
        sb.append(this.f);
        sb.append(", title='");
        sb.append(this.g);
        sb.append("', country='");
        sb.append(this.h);
        sb.append("', city='");
        return i5s.a(sb, this.i, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachMap(AttachMap attachMap) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.g = "";
        this.h = "";
        this.i = "";
        this.b = attachMap.b;
        this.c = attachMap.c;
        this.e = attachMap.e;
        this.f = attachMap.f;
        this.g = attachMap.g;
        this.h = attachMap.h;
        this.i = attachMap.i;
    }

    public AttachMap(Serializer serializer, zcl zclVar) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.g = "";
        this.h = "";
        this.i = "";
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.e = serializer.r();
        this.f = serializer.r();
        this.g = serializer.H();
        this.h = serializer.H();
        this.i = serializer.H();
    }
}
