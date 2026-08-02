package com.vk.im.engine.models.attaches.miniapp;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.gp;
import xsna.shy;
import xsna.sr;
import xsna.t33;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AttachMiniApp.kt */
/* loaded from: classes2.dex */
public final class AttachMiniApp implements AttachWithId {
    public static final Serializer.c<AttachMiniApp> CREATOR = new a();
    public final ApiApplication b;
    public final String c;
    public final String d;
    public final ImageList e;
    public final String f;
    public final AttachMiniAppButton g;
    public int h;
    public AttachSyncState i;
    public final UserId j;
    public final long k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachMiniApp> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachMiniApp a(Serializer serializer) {
            return new AttachMiniApp(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachMiniApp[i];
        }
    }

    public AttachMiniApp(ApiApplication apiApplication, String str, String str2, ImageList imageList, String str3, AttachMiniAppButton attachMiniAppButton, int i, AttachSyncState attachSyncState, UserId userId) {
        this.b = apiApplication;
        this.c = str;
        this.d = str2;
        this.e = imageList;
        this.f = str3;
        this.g = attachMiniAppButton;
        this.h = i;
        this.i = attachSyncState;
        this.j = userId;
        this.k = apiApplication.b.b;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        StringBuilder a2 = t33.a("https://", str, "/app");
        a2.append(this.b.b);
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.j0(this.f);
        serializer.i0(this.g);
        serializer.S(this.h);
        serializer.S(this.i.h());
        serializer.e0(this.j);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.i = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachMiniApp(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachMiniApp)) {
            return false;
        }
        AttachMiniApp attachMiniApp = (AttachMiniApp) obj;
        return epx.f(this.b, attachMiniApp.b) && epx.f(this.c, attachMiniApp.c) && epx.f(this.d, attachMiniApp.d) && epx.f(this.e, attachMiniApp.e) && epx.f(this.f, attachMiniApp.f) && epx.f(this.g, attachMiniApp.g) && this.h == attachMiniApp.h && this.i == attachMiniApp.i && epx.f(this.j, attachMiniApp.j);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.k;
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e.b), 31, this.f);
        AttachMiniAppButton attachMiniAppButton = this.g;
        return Long.hashCode(this.j.b) + bo.a(this.i, shy.a(this.h, (a2 + (attachMiniAppButton == null ? 0 : attachMiniAppButton.hashCode())) * 31, 31), 31);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.h = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachMiniApp(app=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", images=");
        sb.append(this.e);
        sb.append(", buttonText=");
        sb.append(this.f);
        sb.append(", attachMiniAppButton=");
        sb.append(this.g);
        sb.append(", localId=");
        sb.append(this.h);
        sb.append(", syncState=");
        sb.append(this.i);
        sb.append(", ownerId=");
        return gp.b(sb, this.j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.h;
    }

    public /* synthetic */ AttachMiniApp(ApiApplication apiApplication, String str, String str2, ImageList imageList, String str3, AttachMiniAppButton attachMiniAppButton, int i, AttachSyncState attachSyncState, UserId userId, int i2, zcl zclVar) {
        this(apiApplication, str, str2, imageList, str3, attachMiniAppButton, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? AttachSyncState.DONE : attachSyncState, (i2 & 256) != 0 ? UserId.d : userId);
    }

    public AttachMiniApp(AttachMiniApp attachMiniApp) {
        this(attachMiniApp.b, attachMiniApp.c, attachMiniApp.d, attachMiniApp.e, attachMiniApp.f, attachMiniApp.g, attachMiniApp.h, attachMiniApp.i, attachMiniApp.j);
    }

    public AttachMiniApp(Serializer serializer) {
        this((ApiApplication) serializer.G(ApiApplication.class.getClassLoader()), serializer.H(), serializer.H(), (ImageList) serializer.G(ImageList.class.getClassLoader()), serializer.H(), (AttachMiniAppButton) serializer.G(AttachMiniAppButton.class.getClassLoader()), serializer.u(), sr.b(serializer, AttachSyncState.Companion), (UserId) serializer.A(UserId.class.getClassLoader()));
    }
}
