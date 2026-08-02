package com.vk.im.engine.models.education;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.Image;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;

/* compiled from: Achievements.kt */
/* loaded from: classes2.dex */
public final class EduAchievement implements Serializer.StreamParcelable {
    public static final Serializer.c<EduAchievement> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final Image e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<EduAchievement> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EduAchievement a(Serializer serializer) {
            return new EduAchievement(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EduAchievement[i];
        }
    }

    public EduAchievement(int i, String str, String str2, Image image) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = image;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EduAchievement)) {
            return false;
        }
        EduAchievement eduAchievement = (EduAchievement) obj;
        return this.b == eduAchievement.b && epx.f(this.c, eduAchievement.c) && epx.f(this.d, eduAchievement.d) && epx.f(this.e, eduAchievement.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.e;
        return hashCode + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        return "EduAchievement(id=" + this.b + ", title=" + this.c + ", description=" + this.d + ", logo=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EduAchievement(Serializer serializer, zcl zclVar) {
        this(r5, r0 == null ? "" : r0, serializer.H(), (Image) serializer.A(Image.class.getClassLoader()));
        int u = serializer.u();
        String H = serializer.H();
    }
}
