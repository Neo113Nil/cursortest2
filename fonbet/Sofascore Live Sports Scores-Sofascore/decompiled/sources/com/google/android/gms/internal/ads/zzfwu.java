package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzfwu {
    public static final zzfwu d = new zzfwu();
    public WeakReference a;
    public boolean b = false;
    public boolean c = false;

    public final void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(zzfwk.c.a).iterator();
        while (it.hasNext()) {
            zzfxa zzfxaVar = ((zzfvq) it.next()).d;
            boolean z3 = z2 || z;
            if (zzfxaVar.b.get() != 0) {
                zzfwr.a.a(zzfxaVar.c(), "setDeviceLockState", true != z3 ? "unlocked" : "locked");
            }
        }
    }
}
