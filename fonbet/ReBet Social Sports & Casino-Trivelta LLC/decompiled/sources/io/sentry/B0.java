package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f50193a = new ArrayList();

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$vendor$gson$stream$JsonToken;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
            $SwitchMap$io$sentry$vendor$gson$stream$JsonToken = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface b {
        Object a();
    }

    public interface c {
        Object getValue();
    }

    public static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f50196a;

        public f(String str) {
            this.f50196a = str;
        }

        @Override // io.sentry.B0.c
        public Object getValue() {
            return this.f50196a;
        }
    }

    public static final class g implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f50197a;

        public g(Object obj) {
            this.f50197a = obj;
        }

        @Override // io.sentry.B0.c
        public Object getValue() {
            return this.f50197a;
        }
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    public Object e(C0 c02) {
        k(c02);
        c f10 = f();
        if (f10 != null) {
            return f10.getValue();
        }
        return null;
    }

    public final c f() {
        if (this.f50193a.isEmpty()) {
            return null;
        }
        return (c) this.f50193a.get(r0.size() - 1);
    }

    public final boolean g() {
        if (i()) {
            return true;
        }
        c f10 = f();
        l();
        if (!(f() instanceof f)) {
            if (!(f() instanceof d)) {
                return false;
            }
            d dVar = (d) f();
            if (f10 == null || dVar == null) {
                return false;
            }
            dVar.f50194a.add(f10.getValue());
            return false;
        }
        f fVar = (f) f();
        l();
        e eVar = (e) f();
        if (fVar == null || f10 == null || eVar == null) {
            return false;
        }
        eVar.f50195a.put(fVar.f50196a, f10.getValue());
        return false;
    }

    public final boolean h(b bVar) {
        Object a10 = bVar.a();
        if (f() == null && a10 != null) {
            m(new g(a10));
            return true;
        }
        if (f() instanceof f) {
            f fVar = (f) f();
            l();
            ((e) f()).f50195a.put(fVar.f50196a, a10);
            return false;
        }
        if (!(f() instanceof d)) {
            return false;
        }
        ((d) f()).f50194a.add(a10);
        return false;
    }

    public final boolean i() {
        return this.f50193a.size() == 1;
    }

    public final Object j(C0 c02) {
        try {
            try {
                return Integer.valueOf(c02.nextInt());
            } catch (Exception unused) {
                return Double.valueOf(c02.nextDouble());
            }
        } catch (Exception unused2) {
            return Long.valueOf(c02.nextLong());
        }
    }

    public final void k(final C0 c02) {
        boolean z10 = false;
        while (!z10) {
            a aVar = null;
            switch (a.$SwitchMap$io$sentry$vendor$gson$stream$JsonToken[c02.peek().ordinal()]) {
                case 1:
                    c02.p();
                    m(new d(aVar));
                    break;
                case 2:
                    c02.n();
                    z10 = g();
                    break;
                case 3:
                    c02.m();
                    m(new e(aVar));
                    break;
                case 4:
                    c02.t();
                    z10 = g();
                    break;
                case 5:
                    m(new f(c02.f0()));
                    break;
                case 6:
                    z10 = h(new b() { // from class: io.sentry.x0
                        @Override // io.sentry.B0.b
                        public final Object a() {
                            Object M02;
                            M02 = C0.this.M0();
                            return M02;
                        }
                    });
                    break;
                case 7:
                    z10 = h(new b() { // from class: io.sentry.y0
                        @Override // io.sentry.B0.b
                        public final Object a() {
                            Object j10;
                            j10 = B0.this.j(c02);
                            return j10;
                        }
                    });
                    break;
                case 8:
                    z10 = h(new b() { // from class: io.sentry.z0
                        @Override // io.sentry.B0.b
                        public final Object a() {
                            Object valueOf;
                            valueOf = Boolean.valueOf(C0.this.B());
                            return valueOf;
                        }
                    });
                    break;
                case 9:
                    c02.J();
                    z10 = h(new b() { // from class: io.sentry.A0
                        @Override // io.sentry.B0.b
                        public final Object a() {
                            return B0.a();
                        }
                    });
                    break;
                case 10:
                    z10 = true;
                    break;
            }
        }
    }

    public final void l() {
        if (this.f50193a.isEmpty()) {
            return;
        }
        this.f50193a.remove(r0.size() - 1);
    }

    public final void m(c cVar) {
        this.f50193a.add(cVar);
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f50194a;

        public d() {
            this.f50194a = new ArrayList();
        }

        @Override // io.sentry.B0.c
        public Object getValue() {
            return this.f50194a;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f50195a;

        public e() {
            this.f50195a = new HashMap();
        }

        @Override // io.sentry.B0.c
        public Object getValue() {
            return this.f50195a;
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }
}
