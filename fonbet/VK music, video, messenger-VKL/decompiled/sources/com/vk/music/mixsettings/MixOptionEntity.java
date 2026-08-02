package com.vk.music.mixsettings;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.urd0;

/* compiled from: MixOptionEntity.kt */
/* loaded from: classes3.dex */
public final class MixOptionEntity implements Parcelable {
    public static final Parcelable.Creator<MixOptionEntity> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public boolean f;

    /* compiled from: MixOptionEntity.kt */
    public static final class a implements Parcelable.Creator<MixOptionEntity> {
        @Override // android.os.Parcelable.Creator
        public final MixOptionEntity createFromParcel(Parcel parcel) {
            return new MixOptionEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MixOptionEntity[] newArray(int i) {
            return new MixOptionEntity[i];
        }
    }

    public MixOptionEntity(String str, String str2, String str3, String str4, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final void a(boolean z) {
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixOptionEntity)) {
            return false;
        }
        MixOptionEntity mixOptionEntity = (MixOptionEntity) obj;
        return epx.f(this.b, mixOptionEntity.b) && epx.f(this.c, mixOptionEntity.c) && epx.f(this.d, mixOptionEntity.d) && epx.f(this.e, mixOptionEntity.e) && this.f == mixOptionEntity.f;
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixOptionEntity(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", badgeIconUrl=");
        sb.append(this.e);
        sb.append(", isSelected=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
