package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzawv {
    public final zzavq a;
    public final zzawr b;
    public final zzawo c = new zzawo();
    public final zzawj d;

    public zzawv(zzavq zzavqVar, zzawr zzawrVar, zzawj zzawjVar) {
        this.a = zzavqVar;
        this.b = zzawrVar;
        this.d = zzawjVar;
    }

    public final Optional a() {
        zzavk zzavkVar;
        try {
            try {
                ArrayDeque arrayDeque = this.c.a;
                if (arrayDeque.isEmpty()) {
                    throw new zzawn();
                }
                zzawl zzawlVar = (zzawl) arrayDeque.pop();
                long j = zzawlVar.a;
                long j2 = zzawlVar.b;
                long j3 = zzawlVar.c;
                zzawr zzawrVar = this.b;
                if (zzawrVar.b < j2) {
                    return Optional.of(zzavk.H);
                }
                this.d.a(j);
                if (j3 == 0) {
                    while (zzawrVar.b > j2) {
                        zzawrVar.c();
                    }
                }
                return Optional.empty();
            } catch (zzawh | zzawi e) {
                throw new AssertionError(zzawc.a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (zzawn unused) {
            zzavkVar = zzavk.x;
            return Optional.of(zzavkVar);
        } catch (zzawp unused2) {
            zzavkVar = zzavk.H;
            return Optional.of(zzavkVar);
        }
    }
}
