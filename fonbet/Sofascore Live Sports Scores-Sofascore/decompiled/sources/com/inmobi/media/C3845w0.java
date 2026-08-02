package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ph0;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.w0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3845w0 implements Parcelable {
    public final long a;
    public final String b;
    public Map c;
    public String d;
    public final String e;
    public final String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public boolean l;
    public String m;
    public static final Set n = ph0.a0(new String[]{"c_applovin", "c_applovincustom"});

    @NotNull
    public static final Parcelable.Creator<C3845w0> CREATOR = new C3819v0();

    public C3845w0(Parcel parcel) {
        this.h = "";
        this.i = "";
        String str = "activity";
        this.k = "activity";
        this.a = parcel.readLong();
        String readString = parcel.readString();
        if (readString != null && !readString.equals("activity") && readString.equals("others")) {
            str = "others";
        }
        this.k = str;
        this.e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3845w0)) {
            return false;
        }
        C3845w0 c3845w0 = (C3845w0) obj;
        return this.a == c3845w0.a && Intrinsics.c(this.k, c3845w0.k) && Intrinsics.c(this.b, c3845w0.b) && Intrinsics.c(this.e, c3845w0.e);
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.e;
        return this.k.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeString(this.k);
        parcel.writeString(this.e);
    }

    public C3845w0(long j, String str, String str2, String str3) {
        this.h = "";
        this.i = "";
        this.k = "activity";
        this.a = j;
        this.e = str2;
        this.b = str;
        this.f = str3;
    }
}
