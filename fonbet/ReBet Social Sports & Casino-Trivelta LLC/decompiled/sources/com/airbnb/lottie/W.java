package com.airbnb.lottie;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import x0.C6774c;
import z.C6901b;

/* loaded from: classes.dex */
public class W {

    /* renamed from: a, reason: collision with root package name */
    public boolean f28493a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Set f28494b = new C6901b();

    /* renamed from: c, reason: collision with root package name */
    public final Map f28495c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Comparator f28496d = new a();

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(C6774c c6774c, C6774c c6774c2) {
            float floatValue = ((Float) c6774c.f67818b).floatValue();
            float floatValue2 = ((Float) c6774c2.f67818b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    public void a(String str, float f10) {
        if (this.f28493a) {
            com.airbnb.lottie.utils.k kVar = (com.airbnb.lottie.utils.k) this.f28495c.get(str);
            if (kVar == null) {
                kVar = new com.airbnb.lottie.utils.k();
                this.f28495c.put(str, kVar);
            }
            kVar.a(f10);
            if (str.equals("__container")) {
                Iterator it = this.f28494b.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
        }
    }

    public void b(boolean z10) {
        this.f28493a = z10;
    }
}
