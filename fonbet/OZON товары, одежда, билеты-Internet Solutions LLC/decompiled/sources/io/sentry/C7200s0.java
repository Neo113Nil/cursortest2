package io.sentry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7200s0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<c> f68472a = new ArrayList<>();

    /* renamed from: io.sentry.s0$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f68473a;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
            f68473a = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68473a[io.sentry.vendor.gson.stream.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68473a[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68473a[io.sentry.vendor.gson.stream.b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68473a[io.sentry.vendor.gson.stream.b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68473a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68473a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f68473a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f68473a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f68473a[io.sentry.vendor.gson.stream.b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.s0$b */
    interface b {
        Object a() throws IOException;
    }

    /* renamed from: io.sentry.s0$c */
    private interface c {
        @NotNull
        Object getValue();
    }

    /* renamed from: io.sentry.s0$f */
    private static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        final String f68476a;

        f(@NotNull String str) {
            this.f68476a = str;
        }

        @Override // io.sentry.C7200s0.c
        @NotNull
        public final Object getValue() {
            return this.f68476a;
        }
    }

    /* renamed from: io.sentry.s0$g */
    /* loaded from: classes10.dex */
    private static final class g implements c {

        /* renamed from: a, reason: collision with root package name */
        final Object f68477a;

        g(@NotNull Object obj) {
            this.f68477a = obj;
        }

        @Override // io.sentry.C7200s0.c
        @NotNull
        public final Object getValue() {
            return this.f68477a;
        }
    }

    private c b() {
        ArrayList<c> arrayList = this.f68472a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (c) C.o0.b(1, arrayList);
    }

    private boolean c() {
        if (this.f68472a.size() == 1) {
            return true;
        }
        c b11 = b();
        f();
        if (!(b() instanceof f)) {
            if (!(b() instanceof d)) {
                return false;
            }
            d dVar = (d) b();
            if (b11 == null || dVar == null) {
                return false;
            }
            dVar.f68474a.add(b11.getValue());
            return false;
        }
        f fVar = (f) b();
        f();
        e eVar = (e) b();
        if (fVar == null || b11 == null || eVar == null) {
            return false;
        }
        eVar.f68475a.put(fVar.f68476a, b11.getValue());
        return false;
    }

    private boolean d(b bVar) throws IOException {
        Object a11 = bVar.a();
        if (b() == null && a11 != null) {
            this.f68472a.add(new g(a11));
            return true;
        }
        if (b() instanceof f) {
            f fVar = (f) b();
            f();
            ((e) b()).f68475a.put(fVar.f68476a, a11);
            return false;
        }
        if (!(b() instanceof d)) {
            return false;
        }
        ((d) b()).f68474a.add(a11);
        return false;
    }

    private void e(@NotNull final C7204t0 c7204t0) throws IOException {
        int i11 = a.f68473a[c7204t0.peek().ordinal()];
        boolean z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        ArrayList<c> arrayList = this.f68472a;
        switch (i11) {
            case 1:
                c7204t0.beginArray();
                arrayList.add(new d(z11 ? 1 : 0));
                break;
            case 2:
                c7204t0.endArray();
                z11 = c();
                break;
            case 3:
                c7204t0.beginObject();
                arrayList.add(new e(z11 ? 1 : 0));
                break;
            case 4:
                c7204t0.endObject();
                z11 = c();
                break;
            case 5:
                arrayList.add(new f(c7204t0.nextName()));
                break;
            case 6:
                z11 = d(new b() { // from class: io.sentry.o0
                    @Override // io.sentry.C7200s0.b
                    public final Object a() {
                        return C7204t0.this.nextString();
                    }
                });
                break;
            case 7:
                z11 = d(new b() { // from class: io.sentry.p0
                    @Override // io.sentry.C7200s0.b
                    public final Object a() {
                        C7204t0 c7204t02 = c7204t0;
                        C7200s0.this.getClass();
                        try {
                            try {
                                return Integer.valueOf(c7204t02.nextInt());
                            } catch (Exception unused) {
                                return Double.valueOf(c7204t02.nextDouble());
                            }
                        } catch (Exception unused2) {
                            return Long.valueOf(c7204t02.nextLong());
                        }
                    }
                });
                break;
            case 8:
                z11 = d(new b() { // from class: io.sentry.q0
                    @Override // io.sentry.C7200s0.b
                    public final Object a() {
                        return Boolean.valueOf(C7204t0.this.c());
                    }
                });
                break;
            case 9:
                c7204t0.d();
                z11 = d(new C7196r0());
                break;
            case 10:
                z11 = true;
                break;
        }
        if (z11) {
            return;
        }
        e(c7204t0);
    }

    private void f() {
        ArrayList<c> arrayList = this.f68472a;
        if (arrayList.isEmpty()) {
            return;
        }
        Ej.b.b(1, arrayList);
    }

    public final Object a(@NotNull C7204t0 c7204t0) throws IOException {
        e(c7204t0);
        c b11 = b();
        if (b11 != null) {
            return b11.getValue();
        }
        return null;
    }

    /* renamed from: io.sentry.s0$d */
    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList<Object> f68474a;

        private d() {
            this.f68474a = new ArrayList<>();
        }

        @Override // io.sentry.C7200s0.c
        @NotNull
        public final Object getValue() {
            return this.f68474a;
        }

        /* synthetic */ d(int i11) {
            this();
        }
    }

    /* renamed from: io.sentry.s0$e */
    /* loaded from: classes10.dex */
    private static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        final HashMap<String, Object> f68475a;

        private e() {
            this.f68475a = new HashMap<>();
        }

        @Override // io.sentry.C7200s0.c
        @NotNull
        public final Object getValue() {
            return this.f68475a;
        }

        /* synthetic */ e(int i11) {
            this();
        }
    }
}
