package com.google.android.gms.internal.measurement;

import defpackage.n4o;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzna implements zzrt {
    public final boolean a;

    public zzna(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object a(zzrs zzrsVar) {
        zznd a;
        InputStream b = zzst.b(zzrsVar);
        try {
            int i = 4096;
            if (this.a) {
                if (b instanceof zzsf) {
                    long length = ((zzsf) b).zza().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                a = zznd.a(zzacv.h(b, i), true);
            } else {
                a = zznd.a(zzacv.h(b, 4096), false);
            }
            n4o.x(b, null);
            return a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n4o.x(b, th);
                throw th2;
            }
        }
    }
}
