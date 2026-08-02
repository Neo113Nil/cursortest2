package com.vk.media.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import java.io.File;

/* loaded from: classes3.dex */
public class CameraVideoEncoderParameters extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CameraVideoEncoderParameters> CREATOR = new a();
    public final File b;

    @Nullable
    public File c;
    public File d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;

    @Nullable
    public int[] i;

    @Nullable
    public float[] j;
    public long k;
    public long l;
    public int m;
    public final int n;
    public float o;

    @Nullable
    public String p;

    @Nullable
    public String q;

    @Nullable
    public File r;
    public int s;
    public int t;
    public int u;
    public float v;
    public int w;
    public boolean x;

    public class a extends Serializer.c<CameraVideoEncoderParameters> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CameraVideoEncoderParameters a(@NonNull Serializer serializer) {
            return new CameraVideoEncoderParameters(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CameraVideoEncoderParameters[i];
        }
    }

    public CameraVideoEncoderParameters(File file) {
        this.n = -1;
        this.o = 1.0f;
        this.b = file;
    }

    @Nullable
    public final File Ab() {
        return this.r;
    }

    @Nullable
    public final String Bb() {
        return this.p;
    }

    @Nullable
    public final String Cb() {
        return this.q;
    }

    public final int Db() {
        return this.w;
    }

    public final int Eb() {
        return this.g;
    }

    public final int Fb() {
        return this.h;
    }

    public final boolean Gb() {
        return (this.r == null && this.q == null) ? false : true;
    }

    public final boolean Hb() {
        return this.f;
    }

    public final void Ib(@Nullable File file) {
        this.r = file;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.g0(this.b);
        serializer.g0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.S(this.h);
        serializer.S(this.g);
        serializer.T(this.i);
        float[] fArr = this.j;
        if (fArr == null) {
            serializer.S(-1);
        } else {
            serializer.S(fArr.length);
            for (float f : fArr) {
                serializer.P(f);
            }
        }
        serializer.Y(this.k);
        serializer.Y(this.l);
        serializer.g0(this.r);
        serializer.j0(this.q);
        serializer.j0(this.p);
        serializer.S(this.s);
        serializer.S(this.t);
        serializer.S(this.u);
        serializer.S(this.m);
        serializer.S(this.w);
        serializer.P(this.o);
        serializer.P(this.v);
        serializer.L(this.x ? (byte) 1 : (byte) 0);
        serializer.S(this.n);
        serializer.g0(this.c);
    }

    public final File zb() {
        return this.b;
    }

    public CameraVideoEncoderParameters(Serializer serializer) {
        this.n = -1;
        this.o = 1.0f;
        this.b = (File) serializer.C();
        this.d = (File) serializer.C();
        this.e = serializer.m();
        this.f = serializer.m();
        this.h = serializer.u();
        this.g = serializer.u();
        this.i = serializer.c();
        this.j = serializer.b();
        this.k = serializer.w();
        this.l = serializer.w();
        this.r = (File) serializer.C();
        this.q = serializer.H();
        this.p = serializer.H();
        this.s = serializer.u();
        this.t = serializer.u();
        this.u = serializer.u();
        this.m = serializer.u();
        this.w = serializer.u();
        this.o = serializer.s();
        this.v = serializer.s();
        this.x = serializer.m();
        this.n = serializer.u();
        this.c = (File) serializer.C();
    }
}
