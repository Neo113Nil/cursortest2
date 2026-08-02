package com.vk.dto.stories.entities;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StorySharingInfo.kt */
/* loaded from: classes18.dex */
public final class StorySharingInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StorySharingInfo> CREATOR = new a();
    public final int b;
    public final Long c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public String i;
    public final boolean j;
    public final boolean k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StorySharingInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StorySharingInfo a(Serializer serializer) {
            return new StorySharingInfo(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StorySharingInfo[i];
        }
    }

    public /* synthetic */ StorySharingInfo(int i, Long l, Long l2, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i2, zcl zclVar) {
        this(i, l, l2, str, str2, str3, str4, str5, (i2 & 256) != 0 ? true : z, (i2 & 512) != 0 ? true : z2);
    }

    public final String Ab() {
        return this.h;
    }

    public final String Bb() {
        return this.f;
    }

    public final String C1() {
        return this.e;
    }

    public final Long Cb() {
        return this.d;
    }

    public final Long Db() {
        return this.c;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.b0(this.c);
        serializer.b0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorySharingInfo)) {
            return false;
        }
        StorySharingInfo storySharingInfo = (StorySharingInfo) obj;
        return this.b == storySharingInfo.b && epx.f(this.c, storySharingInfo.c) && epx.f(this.d, storySharingInfo.d) && epx.f(this.e, storySharingInfo.e) && epx.f(this.f, storySharingInfo.f) && epx.f(this.g, storySharingInfo.g) && epx.f(this.h, storySharingInfo.h) && epx.f(this.i, storySharingInfo.i) && this.j == storySharingInfo.j && this.k == storySharingInfo.k;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return Boolean.hashCode(this.k) + qoy.b(urd0.a(urd0.a(urd0.a((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorySharingInfo(attachmentType=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", objectId=");
        sb.append(this.d);
        sb.append(", accessKey=");
        sb.append(this.e);
        sb.append(", link=");
        sb.append(this.f);
        sb.append(", name=");
        sb.append(this.g);
        sb.append(", buttonText=");
        sb.append(this.h);
        sb.append(", hintText=");
        sb.append(this.i);
        sb.append(", showUploadToast=");
        sb.append(this.j);
        sb.append(", showAtEditor=");
        return q0.a(sb, this.k, ')');
    }

    public final int zb() {
        return this.b;
    }

    public StorySharingInfo(int i, Long l, Long l2, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.b = i;
        this.c = l;
        this.d = l2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = z;
        this.k = z2;
    }

    public StorySharingInfo(Serializer serializer, zcl zclVar) {
        this(serializer.u(), serializer.x(), serializer.x(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.m(), serializer.m());
    }
}
