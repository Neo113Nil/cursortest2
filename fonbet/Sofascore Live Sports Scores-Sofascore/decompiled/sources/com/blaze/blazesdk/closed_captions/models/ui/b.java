package com.blaze.blazesdk.closed_captions.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lnb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b implements e {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final String a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public b(@NotNull String str) {
        str.getClass();
        this.a = str;
    }

    public static b copy$default(b bVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.a;
        }
        bVar.getClass();
        str.getClass();
        return new b(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.c(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder("Language(isoCode="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
