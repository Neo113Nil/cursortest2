package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.SourceType;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.i5s;
import xsna.sr;
import xsna.t33;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: AttachWallReply.kt */
/* loaded from: classes2.dex */
public final class AttachWallReply implements AttachWithId {
    public static final Serializer.c<AttachWallReply> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public UserId d;
    public int e;
    public int f;
    public int g;
    public SourceType h;
    public long i;
    public String j;
    public String k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachWallReply> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachWallReply a(Serializer serializer) {
            return new AttachWallReply(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachWallReply[i];
        }
    }

    public AttachWallReply() {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.h = SourceType.UNKNOWN;
        this.j = "";
        this.k = "";
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        String str2;
        StringBuilder a2 = t33.a("https://", str, "/wall");
        a2.append(this.d);
        a2.append('_');
        a2.append(this.g);
        a2.append("?reply=");
        a2.append(this.e);
        if (this.f > 0) {
            str2 = "&thread=" + this.f;
        } else {
            str2 = "";
        }
        a2.append(str2);
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.S(this.e);
        serializer.S(this.f);
        serializer.S(this.g);
        serializer.e0(this.d);
        serializer.S(this.h.j());
        serializer.Y(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void c(UserId userId) {
        throw null;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachWallReply(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttachWallReply.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachWallReply attachWallReply = (AttachWallReply) obj;
        return this.b == attachWallReply.b && this.c == attachWallReply.c && this.e == attachWallReply.e && this.f == attachWallReply.f && this.g == attachWallReply.g && epx.f(this.d, attachWallReply.d) && this.h == attachWallReply.h && this.i == attachWallReply.i && epx.f(this.j, attachWallReply.j) && epx.f(this.k, attachWallReply.k);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.g;
    }

    public final int hashCode() {
        return this.k.hashCode() + urd0.a(bh10.a((this.h.hashCode() + bh10.a((((((bo.a(this.c, this.b * 31, 31) + this.e) * 31) + this.f) * 31) + this.g) * 31, 31, this.d.b)) * 31, 31, this.i), 31, this.j);
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
            StringBuilder sb = new StringBuilder("AttachWallReply(localId=");
            sb.append(this.b);
            sb.append(", syncState=");
            sb.append(this.c);
            sb.append(", replyId=");
            sb.append(this.e);
            sb.append(", threadId=");
            sb.append(this.f);
            sb.append(", postId=");
            sb.append(this.g);
            sb.append(", ownerId=");
            sb.append(this.d);
            sb.append(", sourceType=");
            sb.append(this.h);
            sb.append(", sourceId=");
            return vu5.a(')', this.i, sb);
        }
        StringBuilder sb2 = new StringBuilder("AttachWallReply(localId=");
        sb2.append(this.b);
        sb2.append(", syncState=");
        sb2.append(this.c);
        sb2.append(", replyId=");
        sb2.append(this.e);
        sb2.append(", threadId=");
        sb2.append(this.f);
        sb2.append(", postId=");
        sb2.append(this.g);
        sb2.append(", ownerId=");
        sb2.append(this.d);
        sb2.append(", sourceType=");
        sb2.append(this.h);
        sb2.append(", sourceId=");
        sb2.append(this.i);
        sb2.append(", text='");
        sb2.append(this.j);
        sb2.append("', accessKey='");
        return i5s.a(sb2, this.k, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachWallReply(AttachWallReply attachWallReply) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.h = SourceType.UNKNOWN;
        this.j = "";
        this.k = "";
        this.b = attachWallReply.b;
        this.c = attachWallReply.c;
        this.e = attachWallReply.e;
        this.f = attachWallReply.f;
        this.g = attachWallReply.g;
        this.d = attachWallReply.d;
        this.h = attachWallReply.h;
        this.i = attachWallReply.i;
        this.j = attachWallReply.j;
        this.k = attachWallReply.k;
    }

    public AttachWallReply(Serializer serializer, zcl zclVar) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.h = SourceType.UNKNOWN;
        this.j = "";
        this.k = "";
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.e = serializer.u();
        this.f = serializer.u();
        this.g = serializer.u();
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        SourceType.a aVar = SourceType.Companion;
        int u = serializer.u();
        aVar.getClass();
        this.h = SourceType.a.a(u);
        this.i = serializer.w();
        this.j = serializer.H();
        this.k = serializer.H();
    }
}
