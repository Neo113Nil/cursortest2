package com.vk.dto.attaches;

import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.gp;
import xsna.ho8;
import xsna.sr;
import xsna.urd0;
import xsna.zcl;
import xsna.ztx0;

/* compiled from: AttachCurator.kt */
/* loaded from: classes18.dex */
public final class AttachCurator implements Attach, ztx0 {
    public static final Serializer.c<AttachCurator> CREATOR = new a();
    public final String b;
    public final String c;
    public final ImageList d;
    public final String e;
    public final UserId f;
    public int g;
    public AttachSyncState h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachCurator> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachCurator a(Serializer serializer) {
            return new AttachCurator(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachCurator[i];
        }
    }

    public AttachCurator() {
        this(null, null, null, null, null, 0, null, 127, null);
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.h;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return this.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.j0(this.e);
        serializer.e0(this.f);
        serializer.S(this.g);
        serializer.S(this.h.h());
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.h = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachCurator(this);
    }

    @Override // xsna.ztx0
    public final ImageList d() {
        return new ImageList(null, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachCurator)) {
            return false;
        }
        AttachCurator attachCurator = (AttachCurator) obj;
        return this.g == attachCurator.g && this.h == attachCurator.h && epx.f(this.b, attachCurator.b) && epx.f(this.f, attachCurator.f) && epx.f(this.c, attachCurator.c) && epx.f(this.d, attachCurator.d) && epx.f(this.e, attachCurator.e);
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return new ImageList(this.d);
    }

    public final int hashCode() {
        return this.e.hashCode() + fw3.a(urd0.a(bh10.a(urd0.a(bo.a(this.h, this.g * 31, 31), 31, this.b), 31, this.f.b), 31, this.c), 31, this.d.b);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.g = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.f;
    }

    public final String toString() {
        boolean h = BuildInfo.h();
        UserId userId = this.f;
        String str = this.b;
        if (!h) {
            StringBuilder sb = new StringBuilder("AttachArtist(localId=");
            sb.append(this.g);
            sb.append(", syncState=");
            sb.append(this.h);
            sb.append(", id=");
            sb.append(str);
            sb.append(", ownerId=");
            return gp.b(sb, userId, ')');
        }
        StringBuilder sb2 = new StringBuilder("AttachCurator(localId=");
        sb2.append(this.g);
        sb2.append(", syncState=");
        sb2.append(this.h);
        sb2.append(", id=");
        sb2.append(str);
        sb2.append(", ownerId=");
        sb2.append(userId);
        sb2.append(", name='");
        sb2.append(this.c);
        sb2.append("', thumbList=");
        sb2.append(this.d);
        sb2.append("),  url='");
        return ho8.a(sb2, this.e, '\'');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.g;
    }

    public AttachCurator(String str, String str2, ImageList imageList, String str3, UserId userId, int i, AttachSyncState attachSyncState) {
        this.b = str;
        this.c = str2;
        this.d = imageList;
        this.e = str3;
        this.f = userId;
        this.g = i;
        this.h = attachSyncState;
    }

    public /* synthetic */ AttachCurator(String str, String str2, ImageList imageList, String str3, UserId userId, int i, AttachSyncState attachSyncState, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? new ImageList(null, 1, null) : imageList, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? UserId.d : userId, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? AttachSyncState.DONE : attachSyncState);
    }

    public AttachCurator(AttachCurator attachCurator) {
        this(attachCurator.b, attachCurator.c, attachCurator.d, attachCurator.e, attachCurator.f, attachCurator.g, attachCurator.h);
    }

    public AttachCurator(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H(), (ImageList) serializer.G(ImageList.class.getClassLoader()), serializer.H(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.u(), sr.b(serializer, AttachSyncState.Companion));
    }
}
