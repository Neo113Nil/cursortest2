package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dmi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.lb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3571lb implements Parcelable {

    @NotNull
    public static final C3545kb CREATOR = new C3545kb();
    public final C3597mb a;
    public final String b;
    public final int c;
    public final long d;
    public int e;
    public String f;

    public C3571lb(C3597mb c3597mb, String str, int i, long j) {
        c3597mb.getClass();
        str.getClass();
        this.a = c3597mb;
        this.b = str;
        this.c = i;
        this.d = j;
        this.e = -1;
    }

    public static C3571lb a(C3571lb c3571lb) {
        C3597mb c3597mb = c3571lb.a;
        String str = c3571lb.b;
        int i = c3571lb.c;
        long j = c3571lb.d;
        c3597mb.getClass();
        str.getClass();
        return new C3571lb(c3597mb, str, i, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3571lb)) {
            return false;
        }
        C3571lb c3571lb = (C3571lb) obj;
        return Intrinsics.c(this.a, c3571lb.a) && Intrinsics.c(this.b, c3571lb.b) && this.c == c3571lb.c && this.d == c3571lb.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + Ai.a(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=" + this.a + ", urlType=" + this.b + ", counter=" + this.c + ", startTime=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a.a);
        parcel.writeString(this.a.b);
        parcel.writeString(this.a.c);
        parcel.writeString(this.a.d);
        parcel.writeString(this.a.e);
        parcel.writeString(this.a.f);
        parcel.writeString(this.a.g);
        parcel.writeByte(this.a.h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.a.i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
    }
}
