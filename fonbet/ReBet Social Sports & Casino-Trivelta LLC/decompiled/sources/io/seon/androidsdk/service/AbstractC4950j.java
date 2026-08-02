package io.seon.androidsdk.service;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.seon.androidsdk.service.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4950j implements InterfaceC4966l {

    /* renamed from: d, reason: collision with root package name */
    public static final Lh.a f53366d = Lh.a.d(AbstractC4950j.class);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f53367a;

    /* renamed from: b, reason: collision with root package name */
    public C4878a f53368b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53369c;

    public AbstractC4950j() {
        HashMap hashMap = new HashMap();
        this.f53367a = hashMap;
        String simpleName = getClass().getSimpleName();
        this.f53369c = simpleName;
        hashMap.put(simpleName, new HashMap());
    }

    public static Object b(N4 n42) {
        try {
            return n42.a();
        } catch (Exception e10) {
            f53366d.b(e10);
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void c(C4878a c4878a) {
        long currentTimeMillis = System.currentTimeMillis();
        a(c4878a);
        try {
            ((Map) this.f53367a.get(this.f53369c)).put("bootstrap", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable unused) {
        }
    }

    public final HashMap d() {
        return this.f53367a;
    }

    public final Map e() {
        long currentTimeMillis = System.currentTimeMillis();
        Map a10 = a();
        try {
            ((Map) this.f53367a.get(this.f53369c)).put("scan", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable unused) {
        }
        return a10;
    }
}
