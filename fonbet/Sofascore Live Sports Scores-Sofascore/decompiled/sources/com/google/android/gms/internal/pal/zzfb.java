package com.google.android.gms.internal.pal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfb extends zzfg {
    public static volatile Long b;
    public static final Object c = new Object();

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void a() {
        if (b != null) {
            throw null;
        }
        synchronized (c) {
            try {
                if (b == null) {
                    b = (Long) this.a.invoke(null, null);
                }
            } finally {
            }
        }
        throw null;
    }
}
