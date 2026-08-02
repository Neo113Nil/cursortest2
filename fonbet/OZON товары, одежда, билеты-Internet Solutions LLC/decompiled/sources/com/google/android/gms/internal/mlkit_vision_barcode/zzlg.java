package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import r8.c;
import r8.d;
import r8.e;

/* loaded from: classes9.dex */
final class zzlg implements d {
    static final zzlg zza = new zzlg();
    private static final c zzb = Im.a.b(1, c.a("errorCode"));

    private zzlg() {
    }

    @Override // r8.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((e) obj2).add(zzb, ((zzru) obj).zza());
    }
}
