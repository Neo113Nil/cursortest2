package com.vk.photos.ui.profile;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: ProfilePhotoTag.kt */
/* loaded from: classes3.dex */
public final class ProfilePhotoTag implements Serializer.StreamParcelable {
    public static final Serializer.c<ProfilePhotoTag> CREATOR = new a();
    public final Photo b;
    public final Owner c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final long j;
    public final int k;
    public final boolean l;
    public final String m;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ProfilePhotoTag> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProfilePhotoTag a(Serializer serializer) {
            return new ProfilePhotoTag(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProfilePhotoTag[i];
        }
    }

    public ProfilePhotoTag(Photo photo, Owner owner, boolean z, String str, String str2, String str3, String str4, boolean z2, long j, int i, boolean z3, String str5) {
        this.b = photo;
        this.c = owner;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = z2;
        this.j = j;
        this.k = i;
        this.l = z3;
        this.m = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.Y(this.j);
        serializer.S(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.j0(this.m);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePhotoTag)) {
            return false;
        }
        ProfilePhotoTag profilePhotoTag = (ProfilePhotoTag) obj;
        return epx.f(this.b, profilePhotoTag.b) && epx.f(this.c, profilePhotoTag.c) && this.d == profilePhotoTag.d && epx.f(this.e, profilePhotoTag.e) && epx.f(this.f, profilePhotoTag.f) && epx.f(this.g, profilePhotoTag.g) && epx.f(this.h, profilePhotoTag.h) && this.i == profilePhotoTag.i && this.j == profilePhotoTag.j && this.k == profilePhotoTag.k && this.l == profilePhotoTag.l && epx.f(this.m, profilePhotoTag.m);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Owner owner = this.c;
        int b = qoy.b((hashCode + (owner == null ? 0 : owner.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode2 = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int b2 = qoy.b(shy.a(this.k, bh10.a(qoy.b((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i), 31, this.j), 31), 31, this.l);
        String str5 = this.m;
        return b2 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfilePhotoTag(photo=");
        sb.append(this.b);
        sb.append(", author=");
        sb.append(this.c);
        sb.append(", isRecognition=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        sb.append(", primaryBtnTitle=");
        sb.append(this.g);
        sb.append(", secondaryBtnTitle=");
        sb.append(this.h);
        sb.append(", isFullWidth=");
        sb.append(this.i);
        sb.append(", date=");
        sb.append(this.j);
        sb.append(", tagId=");
        sb.append(this.k);
        sb.append(", isDeleted=");
        sb.append(this.l);
        sb.append(", trackCode=");
        return ho8.a(sb, this.m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ ProfilePhotoTag(Photo photo, Owner owner, boolean z, String str, String str2, String str3, String str4, boolean z2, long j, int i, boolean z3, String str5, int i2, zcl zclVar) {
        this(photo, owner, z, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? 0L : j, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? false : z3, (i2 & 2048) != 0 ? null : str5);
    }

    public ProfilePhotoTag(Serializer serializer) {
        this((Photo) serializer.G(Photo.class.getClassLoader()), (Owner) serializer.G(Owner.class.getClassLoader()), serializer.m(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.m(), serializer.w(), serializer.u(), serializer.m(), serializer.H());
    }
}
