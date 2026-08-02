package yb;

import yb.C6867a;

/* renamed from: yb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6870d {

    /* renamed from: yb.d$a */
    public static abstract class a {
        public abstract AbstractC6870d a();

        public abstract a b(AbstractC6872f abstractC6872f);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(b bVar);

        public abstract a f(String str);
    }

    /* renamed from: yb.d$b */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a a() {
        return new C6867a.b();
    }

    public abstract AbstractC6872f b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
