package com.blaze.blazesdk.features.shared.models.ui_shared;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lnb;
import defpackage.s6m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new a();
    public final s6m a;
    public final boolean b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readInt() == 0 ? null : s6m.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new f[i];
        }
    }

    public f(@Nullable s6m s6mVar, boolean z) {
        this.a = s6mVar;
        this.b = z;
    }

    public static f copy$default(f fVar, s6m s6mVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            s6mVar = fVar.a;
        }
        if ((i & 2) != 0) {
            z = fVar.b;
        }
        fVar.getClass();
        return new f(s6mVar, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b;
    }

    public final int hashCode() {
        s6m s6mVar = this.a;
        return Boolean.hashCode(this.b) + ((s6mVar == null ? 0 : s6mVar.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CTAEnhancementsModel(animationType=");
        sb.append(this.a);
        sb.append(", hasSwipeUp=");
        return lnb.r(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        s6m s6mVar = this.a;
        if (s6mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(s6mVar.name());
        }
        parcel.writeInt(this.b ? 1 : 0);
    }
}
