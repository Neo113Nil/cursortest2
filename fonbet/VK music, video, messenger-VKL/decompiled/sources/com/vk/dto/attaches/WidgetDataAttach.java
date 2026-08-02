package com.vk.dto.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.bo;
import xsna.epx;
import xsna.gp;
import xsna.shy;
import xsna.sr;
import xsna.urd0;
import xsna.zcl;

/* compiled from: WidgetDataAttach.kt */
/* loaded from: classes18.dex */
public final class WidgetDataAttach implements AttachWithId {
    public static final Serializer.c<WidgetDataAttach> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public int e;
    public AttachSyncState f;
    public final UserId g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WidgetDataAttach> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WidgetDataAttach a(Serializer serializer) {
            return new WidgetDataAttach(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetDataAttach[i];
        }
    }

    public WidgetDataAttach(String str, String str2, String str3, int i, AttachSyncState attachSyncState, UserId userId) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = attachSyncState;
        this.g = userId;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.f;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return "";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.S(this.e);
        serializer.S(this.f.h());
        serializer.e0(this.g);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.f = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new WidgetDataAttach(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetDataAttach)) {
            return false;
        }
        WidgetDataAttach widgetDataAttach = (WidgetDataAttach) obj;
        return epx.f(this.b, widgetDataAttach.b) && epx.f(this.c, widgetDataAttach.c) && epx.f(this.d, widgetDataAttach.d) && this.e == widgetDataAttach.e && this.f == widgetDataAttach.f && epx.f(this.g, widgetDataAttach.g);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.c.hashCode() + Long.hashCode(this.g.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.g.b) + bo.a(this.f, shy.a(this.e, urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31), 31);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.e = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetDataAttach(widgetPayload=");
        sb.append(this.b);
        sb.append(", widgetType=");
        sb.append(this.c);
        sb.append(", widgetPayloadHash=");
        sb.append(this.d);
        sb.append(", localId=");
        sb.append(this.e);
        sb.append(", syncState=");
        sb.append(this.f);
        sb.append(", ownerId=");
        return gp.b(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.e;
    }

    public /* synthetic */ WidgetDataAttach(String str, String str2, String str3, int i, AttachSyncState attachSyncState, UserId userId, int i2, zcl zclVar) {
        this(str, str2, str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? AttachSyncState.DONE : attachSyncState, (i2 & 32) != 0 ? UserId.d : userId);
    }

    public WidgetDataAttach(WidgetDataAttach widgetDataAttach) {
        this(widgetDataAttach.b, widgetDataAttach.c, widgetDataAttach.d, widgetDataAttach.e, widgetDataAttach.f, widgetDataAttach.g);
    }

    public WidgetDataAttach(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.u(), sr.b(serializer, AttachSyncState.Companion), (UserId) serializer.A(UserId.class.getClassLoader()));
    }
}
