package com.vk.search.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.chromium.net.NetError;
import xsna.set0;

/* compiled from: VideoSearchFiltersImpl.kt */
/* loaded from: classes5.dex */
public final class VideoSearchFiltersImpl implements Serializer.StreamParcelable, set0 {
    public static final Serializer.c<VideoSearchFiltersImpl> CREATOR = new a();
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoSearchFiltersImpl> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoSearchFiltersImpl a(Serializer serializer) {
            return new VideoSearchFiltersImpl(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoSearchFiltersImpl[i];
        }
    }

    public VideoSearchFiltersImpl() {
        this.g = 2;
    }

    @Override // xsna.set0
    public final int B() {
        return this.c;
    }

    @Override // xsna.set0
    public final void C() {
        this.k = null;
    }

    @Override // xsna.set0
    public final void C0(int i) {
        this.i = i;
    }

    @Override // xsna.set0
    public final int D() {
        return this.b;
    }

    @Override // xsna.set0
    public final Integer F(String str) {
        switch (str.hashCode()) {
            case 96673:
                return !str.equals("all") ? null : 0;
            case 96748:
                return !str.equals("any") ? null : 0;
            case 3056464:
                return !str.equals("clip") ? null : 2;
            case 3322092:
                return !str.equals("live") ? null : 3;
            case 3327612:
                return !str.equals("long") ? null : 1200;
            case 109413500:
                if (str.equals("short")) {
                    return Integer.valueOf(NetError.ERR_INVALID_URL);
                }
                return null;
            case 112202875:
                return !str.equals("video") ? null : 1;
            default:
                return null;
        }
    }

    @Override // xsna.set0
    public final void G(boolean z) {
        this.d = z;
    }

    @Override // xsna.set0
    public final boolean I() {
        return !this.d && !this.e && !this.f && this.i == 0 && this.g == 2 && this.h == 0 && this.b == 0;
    }

    @Override // xsna.set0
    public final String K() {
        return this.m;
    }

    @Override // xsna.set0
    public final void M(String str) {
        this.m = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.S(this.g);
        serializer.S(this.h);
        serializer.S(this.i);
        serializer.S(this.c);
        serializer.S(this.b);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.j0(this.j);
        serializer.j0(this.k);
    }

    @Override // xsna.set0
    public final void R(set0 set0Var) {
        this.d = set0Var.d();
        this.g = set0Var.e();
        this.h = set0Var.getContentType();
        this.b = set0Var.D();
        this.c = set0Var.B();
        this.i = set0Var.getDuration();
        this.e = set0Var.v();
        this.f = set0Var.p();
        this.j = set0Var.getCategory();
        this.l = set0Var.j();
        this.m = set0Var.K();
        this.n = set0Var.k();
        this.o = set0Var.f();
    }

    @Override // xsna.set0
    public final void a(String str) {
        this.l = str;
    }

    @Override // xsna.set0
    public final void b(String str) {
        this.o = str;
    }

    @Override // xsna.set0
    public final VideoSearchFiltersImpl copy() {
        return new VideoSearchFiltersImpl(this);
    }

    @Override // xsna.set0
    public final boolean d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.set0
    public final int e() {
        return this.g;
    }

    @Override // xsna.set0
    public final String f() {
        return this.o;
    }

    @Override // xsna.set0
    public final void g(int i) {
        this.h = i;
    }

    @Override // xsna.set0
    public final String getCategory() {
        return this.j;
    }

    @Override // xsna.set0
    public final int getContentType() {
        return this.h;
    }

    @Override // xsna.set0
    public final int getDuration() {
        return this.i;
    }

    @Override // xsna.set0
    public final void i(String str) {
        this.n = str;
    }

    @Override // xsna.set0
    public final String j() {
        return this.l;
    }

    @Override // xsna.set0
    public final String k() {
        return this.n;
    }

    @Override // xsna.set0
    public final void l() {
        this.j = null;
    }

    @Override // xsna.set0
    public final void n(int i) {
        this.g = i;
    }

    @Override // xsna.set0
    public final void o(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.set0
    public final boolean p() {
        return this.f;
    }

    @Override // xsna.set0
    public final void reset() {
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = 2;
        this.h = 0;
        this.b = 0;
        this.c = 0;
        this.i = 0;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
    }

    @Override // xsna.set0
    public final void u(boolean z) {
        this.f = z;
    }

    @Override // xsna.set0
    public final boolean v() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public VideoSearchFiltersImpl(set0 set0Var) {
        this.g = 2;
        R(set0Var);
    }

    public VideoSearchFiltersImpl(Serializer serializer) {
        this.g = 2;
        this.d = serializer.m();
        this.f = serializer.m();
        this.g = serializer.u();
        this.h = serializer.u();
        this.i = serializer.u();
        this.c = serializer.u();
        this.b = serializer.u();
        this.e = serializer.m();
        this.j = serializer.H();
        this.k = serializer.H();
    }
}
