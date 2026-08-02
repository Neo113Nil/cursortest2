package com.vk.dto.common;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: DuetMeta.kt */
/* loaded from: classes18.dex */
public final class DuetMeta implements Serializer.StreamParcelable {
    public static final Serializer.c<DuetMeta> CREATOR = new a();
    public final Boolean b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DuetMeta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DuetMeta a(Serializer serializer) {
            return new DuetMeta(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DuetMeta[i];
        }
    }

    public DuetMeta() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.J(this.b);
        serializer.J(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetMeta)) {
            return false;
        }
        DuetMeta duetMeta = (DuetMeta) obj;
        return epx.f(this.b, duetMeta.b) && epx.f(this.c, duetMeta.c) && epx.f(this.d, duetMeta.d) && epx.f(this.e, duetMeta.e) && epx.f(this.f, duetMeta.f);
    }

    public final int hashCode() {
        Boolean bool = this.b;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.c;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DuetMeta(canMakeDuet=");
        sb.append(this.b);
        sb.append(", showDuetTooltip=");
        sb.append(this.c);
        sb.append(", duetOwnerId=");
        sb.append(this.d);
        sb.append(", duetVideoId=");
        sb.append(this.e);
        sb.append(", duetOriginAuthorFullNameIns=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public DuetMeta(Boolean bool, Boolean bool2, String str, String str2, String str3) {
        this.b = bool;
        this.c = bool2;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public /* synthetic */ DuetMeta(Boolean bool, Boolean bool2, String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public DuetMeta(Serializer serializer) {
        this(serializer.n(), serializer.n(), serializer.H(), serializer.H(), serializer.H());
    }
}
