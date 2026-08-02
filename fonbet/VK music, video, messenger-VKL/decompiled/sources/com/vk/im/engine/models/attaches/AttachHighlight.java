package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.narratives.Narrative;
import xsna.epx;
import xsna.shy;
import xsna.sr;
import xsna.t33;
import xsna.up2;
import xsna.zcl;

/* compiled from: AttachHighlight.kt */
/* loaded from: classes2.dex */
public final class AttachHighlight implements AttachWithId, AttachWithImage {
    public static final Serializer.c<AttachHighlight> CREATOR = new a();
    public Narrative b;
    public int c;
    public AttachSyncState d;
    public final ImageList e;
    public final ImageList f;
    public final UserId g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachHighlight> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachHighlight a(Serializer serializer) {
            return new AttachHighlight((Narrative) serializer.G(Narrative.class.getClassLoader()), serializer.u(), sr.b(serializer, AttachSyncState.Companion));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachHighlight[i];
        }
    }

    public AttachHighlight(Narrative narrative, int i, AttachSyncState attachSyncState) {
        this.b = narrative;
        this.c = i;
        this.d = attachSyncState;
        this.e = new ImageList(null, 1, null);
        this.f = up2.m(this.b.e);
        this.g = this.b.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.d;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        StringBuilder a2 = t33.a("https://", str, "/narrative");
        a2.append(this.b.c);
        a2.append('_');
        a2.append(this.b.b);
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.S(this.c);
        serializer.S(this.d.h());
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.d = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachHighlight(Narrative.zb(this.b, null, 2047), 0, null, 6, null);
    }

    @Override // xsna.ztx0
    public final ImageList d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachHighlight)) {
            return false;
        }
        AttachHighlight attachHighlight = (AttachHighlight) obj;
        return epx.f(this.b, attachHighlight.b) && this.c == attachHighlight.c && this.d == attachHighlight.d;
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return this.f;
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.b.b;
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.c = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.g;
    }

    public final String toString() {
        return "AttachHighlight(highlight=" + this.b + ", localId=" + this.c + ", syncState=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.c;
    }

    public /* synthetic */ AttachHighlight(Narrative narrative, int i, AttachSyncState attachSyncState, int i2, zcl zclVar) {
        this(narrative, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? AttachSyncState.DONE : attachSyncState);
    }
}
