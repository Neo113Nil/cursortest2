package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014a4 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13334a;

    /* renamed from: b, reason: collision with root package name */
    public final C0093d5 f13335b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f13336c;

    /* renamed from: d, reason: collision with root package name */
    public final C0403pa f13337d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f13338e;

    /* renamed from: f, reason: collision with root package name */
    public final C0221i4 f13339f;

    public C0014a4(Context context, C0093d5 c0093d5) {
        this(context, c0093d5, new C0221i4());
    }

    public final InterfaceC0143f4 a(P3 p32, C0397p4 c0397p4) {
        InterfaceC0143f4 interfaceC0143f4;
        synchronized (this.f13334a) {
            try {
                interfaceC0143f4 = (InterfaceC0143f4) this.f13336c.get(p32);
                if (interfaceC0143f4 == null) {
                    this.f13339f.getClass();
                    interfaceC0143f4 = C0221i4.a(p32).a(this.f13338e, this.f13335b, p32, c0397p4);
                    this.f13336c.put(p32, interfaceC0143f4);
                    this.f13337d.a(new Z3(p32.f12723b, p32.f12724c, p32.f12725d), p32);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC0143f4;
    }

    public C0014a4(Context context, C0093d5 c0093d5, C0221i4 c0221i4) {
        this.f13334a = new Object();
        this.f13336c = new HashMap();
        this.f13337d = new C0403pa();
        this.f13338e = context.getApplicationContext();
        this.f13335b = c0093d5;
        this.f13339f = c0221i4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f13334a) {
            try {
                C0403pa c0403pa = this.f13337d;
                Collection collection = (Collection) c0403pa.f14468a.remove(new Z3(str, num, str2));
                if (!lo.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC0143f4) this.f13336c.remove((P3) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC0143f4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
