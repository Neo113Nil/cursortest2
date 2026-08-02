package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzip implements zzhs {
    public final zzhs a;
    public Uri b = Uri.EMPTY;

    public zzip(zzhs zzhsVar) {
        this.a = zzhsVar;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long a(zzhw zzhwVar) {
        zzhs zzhsVar = this.a;
        this.b = zzhwVar.a;
        Map map = Collections.EMPTY_MAP;
        try {
            long a = zzhsVar.a(zzhwVar);
            Uri zzc = zzhsVar.zzc();
            if (zzc != null) {
                this.b = zzc;
            }
            zzhsVar.zzj();
            return a;
        } catch (Throwable th) {
            Uri zzc2 = zzhsVar.zzc();
            if (zzc2 != null) {
                this.b = zzc2;
            }
            zzhsVar.zzj();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        return this.a.b(i, i2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void c(zziq zziqVar) {
        zziqVar.getClass();
        this.a.c(zziqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        this.a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Map zzj() {
        return this.a.zzj();
    }
}
