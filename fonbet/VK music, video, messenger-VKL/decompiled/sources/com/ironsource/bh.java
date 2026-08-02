package com.ironsource;

import xsna.zcl;

/* loaded from: classes13.dex */
public interface bh {

    public static final class a {
        public static final C0213a a = new C0213a(null);

        /* renamed from: com.ironsource.bh$a$a, reason: collision with other inner class name */
        public static final class C0213a {
            public /* synthetic */ C0213a(zcl zclVar) {
                this();
            }

            public final bh a(boolean z, Ug ug) {
                return z ? new Zg(ug) : new Yg(ug);
            }

            private C0213a() {
            }
        }
    }

    void a();

    void a(B b);

    Nd b();

    default B c() {
        return null;
    }
}
