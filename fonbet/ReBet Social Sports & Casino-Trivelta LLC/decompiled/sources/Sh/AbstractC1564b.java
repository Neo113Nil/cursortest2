package Sh;

import kotlin.jvm.functions.Function2;

/* renamed from: Sh.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1564b {

    /* renamed from: a, reason: collision with root package name */
    public static final G f10782a = new G("CLOSED");

    public static final AbstractC1565c b(AbstractC1565c abstractC1565c) {
        while (true) {
            Object g10 = abstractC1565c.g();
            if (g10 == f10782a) {
                return abstractC1565c;
            }
            AbstractC1565c abstractC1565c2 = (AbstractC1565c) g10;
            if (abstractC1565c2 != null) {
                abstractC1565c = abstractC1565c2;
            } else if (abstractC1565c.m()) {
                return abstractC1565c;
            }
        }
    }

    public static final Object c(D d10, long j10, Function2 function2) {
        while (true) {
            if (d10.f10763c >= j10 && !d10.k()) {
                return E.a(d10);
            }
            Object g10 = d10.g();
            if (g10 == f10782a) {
                return E.a(f10782a);
            }
            D d11 = (D) ((AbstractC1565c) g10);
            if (d11 == null) {
                d11 = (D) function2.invoke(Long.valueOf(d10.f10763c + 1), d10);
                if (d10.o(d11)) {
                    if (d10.k()) {
                        d10.n();
                    }
                }
            }
            d10 = d11;
        }
    }
}
