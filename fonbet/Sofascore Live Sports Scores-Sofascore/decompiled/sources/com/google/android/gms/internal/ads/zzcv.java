package com.google.android.gms.internal.ads;

import defpackage.uvn;
import defpackage.vvh;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcv implements zzcp {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public zzcl e;
    public zzcl f;
    public zzcl g;
    public zzcl h;
    public boolean i;
    public vvh j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    public zzcv() {
        zzcl zzclVar = zzcl.e;
        this.e = zzclVar;
        this.f = zzclVar;
        this.g = zzclVar;
        this.h = zzclVar;
        ByteBuffer byteBuffer = zzcp.a;
        this.k = byteBuffer;
        this.l = byteBuffer;
        this.b = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            vvh vvhVar = this.j;
            vvhVar.getClass();
            this.m += byteBuffer.remaining();
            uvn uvnVar = (uvn) vvhVar.q;
            int remaining = byteBuffer.remaining();
            int zza = remaining / (uvnVar.zza() * vvhVar.b);
            uvnVar.p(zza);
            uvnVar.z(remaining, byteBuffer);
            vvhVar.i += zza;
            vvhVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void b(zzcn zzcnVar) {
        if (zzc()) {
            zzcl zzclVar = this.e;
            this.g = zzclVar;
            zzcl zzclVar2 = this.f;
            this.h = zzclVar2;
            if (this.i) {
                this.j = new vvh(zzclVar.a, zzclVar.b, this.c, this.d, zzclVar2.a, zzclVar.c == 4, 1);
            } else {
                vvh vvhVar = this.j;
                if (vvhVar != null) {
                    vvhVar.i = 0;
                    vvhVar.j = 0;
                    vvhVar.k = 0;
                    vvhVar.l = 0;
                    vvhVar.m = 0;
                    vvhVar.n = 0;
                    vvhVar.o = 0;
                    vvhVar.p = 0.0d;
                    ((uvn) vvhVar.q).zzg();
                }
            }
        }
        this.l = zzcp.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long c(long j) {
        if (this.n < 1024) {
            return (long) (j / this.c);
        }
        long j2 = this.m;
        this.j.getClass();
        long zza = j2 - (((uvn) r2.q).zza() * (r2.i * r2.b));
        int i = this.h.a;
        int i2 = this.g.a;
        long j3 = this.n;
        return i == i2 ? zzfm.w(j, j3, zza, RoundingMode.DOWN) : zzfm.w(j, j3 * i2, zza * i, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl d(zzcl zzclVar) {
        int i = zzclVar.c;
        if (i != 2 && i != 4) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i2 = this.b;
        if (i2 == -1) {
            i2 = zzclVar.a;
        }
        this.e = zzclVar;
        zzcl zzclVar2 = new zzcl(i2, zzclVar.b, i);
        this.f = zzclVar2;
        this.i = true;
        return zzclVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzc() {
        if (this.f.a != -1) {
            return Math.abs(this.c + (-1.0f)) >= 1.0E-4f || Math.abs(this.d + (-1.0f)) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zze() {
        vvh vvhVar = this.j;
        if (vvhVar != null) {
            int i = vvhVar.i;
            int i2 = vvhVar.n;
            int i3 = vvhVar.j;
            float f = vvhVar.c;
            float f2 = vvhVar.d;
            int i4 = i3 + ((int) (((((((i - i2) / (f / f2)) + i2) + vvhVar.p) + vvhVar.k) / (vvhVar.e * f2)) + 0.5d));
            vvhVar.p = 0.0d;
            int i5 = vvhVar.h;
            int i6 = i5 + i5;
            uvn uvnVar = (uvn) vvhVar.q;
            uvnVar.p(i + i6);
            uvnVar.A(i * vvhVar.b, i6);
            vvhVar.i += i6;
            vvhVar.d();
            if (vvhVar.j > i4) {
                vvhVar.j = Math.max(i4, 0);
            }
            vvhVar.i = 0;
            vvhVar.n = 0;
            vvhVar.k = 0;
        }
        this.o = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final ByteBuffer zzf() {
        vvh vvhVar = this.j;
        if (vvhVar != null) {
            uvn uvnVar = (uvn) vvhVar.q;
            int i = vvhVar.b;
            zzguk.f(vvhVar.j >= 0);
            int zza = uvnVar.zza() * vvhVar.j * i;
            if (zza > 0) {
                if (this.k.capacity() < zza) {
                    this.k = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                zzguk.f(vvhVar.j >= 0);
                int min = Math.min(byteBuffer.remaining() / (uvnVar.zza() * i), vvhVar.j);
                uvnVar.B(min, byteBuffer);
                vvhVar.j -= min;
                System.arraycopy(uvnVar.zzq(), min * i, uvnVar.zzq(), 0, vvhVar.j * i);
                this.k.flip();
                this.n += zza;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = zzcp.a;
        return byteBuffer2;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzg() {
        if (this.o) {
            vvh vvhVar = this.j;
            if (vvhVar != null) {
                zzguk.f(vvhVar.j >= 0);
                if (((uvn) vvhVar.q).zza() * vvhVar.j * vvhVar.b != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzj() {
        this.c = 1.0f;
        this.d = 1.0f;
        zzcl zzclVar = zzcl.e;
        this.e = zzclVar;
        this.f = zzclVar;
        this.g = zzclVar;
        this.h = zzclVar;
        ByteBuffer byteBuffer = zzcp.a;
        this.k = byteBuffer;
        this.l = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }
}
