package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066c4 {

    /* renamed from: a, reason: collision with root package name */
    public final C0017a7 f13482a;

    /* renamed from: b, reason: collision with root package name */
    public C0478sb f13483b;

    /* renamed from: c, reason: collision with root package name */
    public C0503tb f13484c;

    /* renamed from: d, reason: collision with root package name */
    public Zb f13485d;

    public C0066c4(File file) {
        this.f13482a = new C0017a7(file);
    }

    public final synchronized Ha a(Context context) {
        C0503tb c0503tb;
        c0503tb = this.f13484c;
        if (c0503tb == null) {
            c0503tb = new C0503tb(c(context));
            this.f13484c = c0503tb;
        }
        return c0503tb;
    }

    public final synchronized Ha b(Context context) {
        return c(context);
    }

    public final Ha c(Context context) {
        Zb zb2;
        C0478sb c0478sb = this.f13483b;
        if (c0478sb != null) {
            return c0478sb;
        }
        synchronized (this) {
            zb2 = this.f13485d;
            if (zb2 == null) {
                C0017a7 c0017a7 = this.f13482a;
                String a7 = new Z6(c0017a7.f13348a, c0017a7.f13349b, true).a(context, new N3());
                M6 m6 = AbstractC0572w5.f14822c;
                m6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", InterfaceC0497t5.f14665a);
                C0214hn c0214hn = m6.f12570c;
                W6 w62 = m6.f12568a;
                S6 s62 = w62.f13085c;
                T6 t62 = w62.f13086d;
                C0403pa c0403pa = new C0403pa(false);
                c0403pa.a(112, new O3());
                C0291kn c0291kn = new C0291kn("service database", hashMap);
                c0214hn.getClass();
                zb2 = new Zb(context, a7, new Y9(a7), new C0239in(s62, t62, c0403pa, c0291kn));
                this.f13485d = zb2;
            }
        }
        C0478sb c0478sb2 = new C0478sb(zb2);
        this.f13483b = c0478sb2;
        return c0478sb2;
    }
}
