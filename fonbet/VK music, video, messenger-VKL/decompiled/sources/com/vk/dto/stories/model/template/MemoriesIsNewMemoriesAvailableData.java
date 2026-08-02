package com.vk.dto.stories.model.template;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.sn;

/* compiled from: MemoriesIsNewMemoriesAvailableData.kt */
/* loaded from: classes18.dex */
public final class MemoriesIsNewMemoriesAvailableData implements Parcelable {
    public static final Parcelable.Creator<MemoriesIsNewMemoriesAvailableData> CREATOR = new a();
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    /* compiled from: MemoriesIsNewMemoriesAvailableData.kt */
    public static final class a implements Parcelable.Creator<MemoriesIsNewMemoriesAvailableData> {
        @Override // android.os.Parcelable.Creator
        public final MemoriesIsNewMemoriesAvailableData createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            boolean z;
            Boolean bool;
            boolean z2;
            boolean z3;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            boolean z4;
            boolean z5;
            Boolean bool6 = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                z = true;
                bool = valueOf4;
                z2 = true;
            } else {
                z = true;
                bool = valueOf4;
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = false;
                bool2 = valueOf3;
                bool3 = bool6;
                bool4 = valueOf2;
                bool5 = valueOf5;
                z4 = z;
            } else {
                z3 = false;
                bool2 = valueOf3;
                bool3 = bool6;
                bool4 = valueOf2;
                bool5 = valueOf5;
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = z;
            } else {
                z5 = z;
                z = z3;
            }
            if (parcel.readInt() != 0) {
                z3 = z5;
            }
            return new MemoriesIsNewMemoriesAvailableData(valueOf, bool4, bool2, bool, bool5, bool3, z2, z4, z, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final MemoriesIsNewMemoriesAvailableData[] newArray(int i) {
            return new MemoriesIsNewMemoriesAvailableData[i];
        }
    }

    public MemoriesIsNewMemoriesAvailableData(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = bool;
        this.c = bool2;
        this.d = bool3;
        this.e = bool4;
        this.f = bool5;
        this.g = bool6;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoriesIsNewMemoriesAvailableData)) {
            return false;
        }
        MemoriesIsNewMemoriesAvailableData memoriesIsNewMemoriesAvailableData = (MemoriesIsNewMemoriesAvailableData) obj;
        return epx.f(this.b, memoriesIsNewMemoriesAvailableData.b) && epx.f(this.c, memoriesIsNewMemoriesAvailableData.c) && epx.f(this.d, memoriesIsNewMemoriesAvailableData.d) && epx.f(this.e, memoriesIsNewMemoriesAvailableData.e) && epx.f(this.f, memoriesIsNewMemoriesAvailableData.f) && epx.f(this.g, memoriesIsNewMemoriesAvailableData.g) && this.h == memoriesIsNewMemoriesAvailableData.h && this.i == memoriesIsNewMemoriesAvailableData.i && this.j == memoriesIsNewMemoriesAvailableData.j && this.k == memoriesIsNewMemoriesAvailableData.k;
    }

    public final int hashCode() {
        Boolean bool = this.b;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.c;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.d;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.e;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.g;
        return Boolean.hashCode(this.k) + qoy.b(qoy.b(qoy.b((hashCode5 + (bool6 != null ? bool6.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemoriesIsNewMemoriesAvailableData(posts=");
        sb.append(this.b);
        sb.append(", photos=");
        sb.append(this.c);
        sb.append(", stories=");
        sb.append(this.d);
        sb.append(", albums=");
        sb.append(this.e);
        sb.append(", yearSummary=");
        sb.append(this.f);
        sb.append(", friendships=");
        sb.append(this.g);
        sb.append(", firstAvatar=");
        sb.append(this.h);
        sb.append(", firstPost=");
        sb.append(this.i);
        sb.append(", firstAudio=");
        sb.append(this.j);
        sb.append(", firstStory=");
        return q0.a(sb, this.k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.c;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.d;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.e;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.f;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.g;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
    }
}
