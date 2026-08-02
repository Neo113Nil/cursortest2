package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcq implements zzcp {
    public zzcl b;
    public zzcl c;
    public zzcl d;
    public zzcl e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public zzcq() {
        ByteBuffer byteBuffer = zzcp.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        zzcl zzclVar = zzcl.e;
        this.d = zzclVar;
        this.e = zzclVar;
        this.b = zzclVar;
        this.c = zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void b(zzcn zzcnVar) {
        this.g = zzcp.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        h();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl d(zzcl zzclVar) {
        this.d = zzclVar;
        this.e = f(zzclVar);
        return zzc() ? this.e : zzcl.e;
    }

    public final ByteBuffer e(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public zzcl f(zzcl zzclVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public boolean zzc() {
        return this.e != zzcl.e;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zze() {
        this.h = true;
        g();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public ByteBuffer zzf() {
        ByteBuffer byteBuffer = this.g;
        this.g = zzcp.a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public boolean zzg() {
        return this.h && this.g == zzcp.a;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzh() {
        zzcn zzcnVar = zzcn.d;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzj() {
        ByteBuffer byteBuffer = zzcp.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        zzcl zzclVar = zzcl.e;
        this.d = zzclVar;
        this.e = zzclVar;
        this.b = zzclVar;
        this.c = zzclVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
