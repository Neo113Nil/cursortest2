package com.google.android.gms.internal.ads;

import defpackage.dpo;
import defpackage.tco;
import defpackage.xco;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzggc implements xco {
    public final zzigw a;

    public zzggc(zzigw zzigwVar) {
        this.a = zzigwVar;
    }

    @Override // defpackage.xco
    public final Object a(FileInputStream fileInputStream) {
        try {
            zzihe j = this.a.j();
            zziew zziewVar = zziew.b;
            int i = dpo.a;
            return j.a(fileInputStream, zziew.c);
        } catch (zzige e) {
            throw new tco("Cannot read proto.", e);
        }
    }

    @Override // defpackage.xco
    public final /* synthetic */ void b(Object obj, FileOutputStream fileOutputStream) {
        ((zzigw) obj).b(fileOutputStream);
    }

    @Override // defpackage.xco
    public final /* synthetic */ Object zzc() {
        return this.a;
    }
}
