package com.google.android.gms.measurement.internal;

import defpackage.fon;
import defpackage.vha;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfx {
    public static final Object f = new Object();
    public final String a;
    public final fon b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ zzfx(String str, Object obj, fon fonVar) {
        this.a = str;
        this.c = obj;
        this.b = fonVar;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (vha.d == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (zzae.a()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (zzfx zzfxVar : zzfy.a) {
                        if (zzae.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            fon fonVar = zzfxVar.b;
                            if (fonVar != null) {
                                obj2 = fonVar.mo792zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            zzfxVar.e = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                fon fonVar2 = this.b;
                if (fonVar2 != null) {
                    try {
                        return fonVar2.mo792zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } finally {
            }
        }
    }
}
