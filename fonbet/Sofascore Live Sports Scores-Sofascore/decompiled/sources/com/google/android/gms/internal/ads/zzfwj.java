package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfwj extends zzfwm {
    public static final zzfwj d = new zzfwj();

    private zzfwj() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfwm
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(zzfwk.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((zzfvq) it.next()).c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final void b(boolean z) {
        Iterator it = Collections.unmodifiableCollection(zzfwk.c.a).iterator();
        while (it.hasNext()) {
            zzfxa zzfxaVar = ((zzfvq) it.next()).d;
            if (zzfxaVar.b.get() != 0) {
                zzfwr.a.a(zzfxaVar.c(), "setState", true != z ? "backgrounded" : "foregrounded", zzfxaVar.a);
            }
        }
    }
}
