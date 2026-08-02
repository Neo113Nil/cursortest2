package com.google.android.gms.measurement.internal;

import java.util.List;

/* loaded from: classes2.dex */
public final class Z1 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f33771g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f33772a;

    /* renamed from: b, reason: collision with root package name */
    public final K f33773b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f33774c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f33775d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f33776e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f33777f = null;

    public /* synthetic */ Z1(String str, Object obj, Object obj2, K k10, byte[] bArr) {
        this.f33772a = str;
        this.f33774c = obj;
        this.f33773b = k10;
    }

    public final String a() {
        return this.f33772a;
    }

    public final Object b(Object obj) {
        List<Z1> list;
        synchronized (this.f33775d) {
        }
        if (obj != null) {
            return obj;
        }
        if (T1.f33663a == null) {
            return this.f33774c;
        }
        synchronized (f33771g) {
            try {
                if (C3246f.a()) {
                    return this.f33777f == null ? this.f33774c : this.f33777f;
                }
                try {
                    list = AbstractC3209a2.f33852a;
                    for (Z1 z12 : list) {
                        if (C3246f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            K k10 = z12.f33773b;
                            if (k10 != null) {
                                obj2 = k10.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f33771g) {
                            z12.f33777f = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                K k11 = this.f33773b;
                if (k11 != null) {
                    try {
                        return k11.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f33774c;
            } finally {
            }
        }
    }
}
