package com.google.android.gms.internal.measurement;

import defpackage.j8n;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzss implements zzrt {
    public final zzafj a;
    public final zzadf b;

    public zzss(zzafj zzafjVar) {
        zzadf zzadfVar = zzadf.b;
        int i = j8n.a;
        this.b = zzadf.c;
        this.a = zzafjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object a(zzrs zzrsVar) {
        InputStream b = zzst.b(zzrsVar);
        try {
            zzadu a = this.a.a(b, this.b);
            if (b != null) {
                b.close();
            }
            return a;
        } catch (Throwable th) {
            if (b != null) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
