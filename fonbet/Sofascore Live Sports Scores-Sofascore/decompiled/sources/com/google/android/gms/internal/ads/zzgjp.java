package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgjp extends zzgka {
    public static volatile Long f;
    public static final Object g = new Object();

    @Override // com.google.android.gms.internal.ads.zzgka
    public final void a(Method method, zzaya zzayaVar) {
        if (f == null) {
            synchronized (g) {
                try {
                    if (f == null) {
                        Long l = (Long) method.invoke("", null);
                        if (l == null) {
                            throw null;
                        }
                        f = l;
                    }
                } finally {
                }
            }
        }
        synchronized (zzayaVar) {
            try {
                if (f != null) {
                    long longValue = f.longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).U0(longValue);
                }
            } finally {
            }
        }
    }
}
