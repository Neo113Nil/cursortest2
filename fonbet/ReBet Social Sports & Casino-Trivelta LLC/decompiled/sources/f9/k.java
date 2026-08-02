package f9;

import f9.C4272e;

/* loaded from: classes2.dex */
public abstract class k {

    public static abstract class a {
        public abstract k a();

        public abstract a b(AbstractC4268a abstractC4268a);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* renamed from: a, reason: collision with root package name */
        public final int f46546a;

        b(int i10) {
            this.f46546a = i10;
        }
    }

    public static a a() {
        return new C4272e.b();
    }

    public abstract AbstractC4268a b();

    public abstract b c();
}
