package com.vk.newsfeed.posting.additional_settings.domain.model.author;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: Signer.kt */
/* loaded from: classes4.dex */
public final class Signer implements Serializer.StreamParcelable {
    public static final Serializer.c<Signer> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Signer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Signer a(Serializer serializer) {
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new Signer(userId, H, H2 != null ? H2 : "");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Signer[i];
        }
    }

    public Signer(UserId userId, String str, String str2) {
        this.b = userId;
        this.c = str;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Signer)) {
            return false;
        }
        Signer signer = (Signer) obj;
        return epx.f(this.b, signer.b) && epx.f(this.c, signer.c) && epx.f(this.d, signer.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signer(id=");
        sb.append(this.b);
        sb.append(", firstNameGen=");
        sb.append(this.c);
        sb.append(", lastNameGen=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
