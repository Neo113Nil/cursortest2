package com.ironsource;

import xsna.epx;
import xsna.zcl;
import xsna.zr;

/* renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4394k0 {

    /* renamed from: com.ironsource.k0$a */
    public static final class a implements InterfaceC4394k0 {
        public static final C0221a c = new C0221a(null);
        private final String a;
        private final boolean b;

        /* renamed from: com.ironsource.k0$a$a, reason: collision with other inner class name */
        public static final class C0221a {
            public /* synthetic */ C0221a(zcl zclVar) {
                this();
            }

            public final a a(String str) {
                return new a(str);
            }

            private C0221a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(String str) {
            return new a(str);
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return zr.a("NotReady(reason=", this.a, ")");
        }

        public a(String str) {
            this.a = str;
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            return aVar.a(str);
        }

        public /* synthetic */ a(String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC4394k0
        public boolean a() {
            return this.b;
        }
    }

    /* renamed from: com.ironsource.k0$b */
    public static final class b implements InterfaceC4394k0 {
        public static final b a = new b();
        private static final boolean b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC4394k0
        public boolean a() {
            return b;
        }
    }

    boolean a();
}
