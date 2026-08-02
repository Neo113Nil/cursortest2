package yb;

import yb.C6868b;

/* renamed from: yb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6872f {

    /* renamed from: yb.f$a */
    public static abstract class a {
        public abstract AbstractC6872f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j10);
    }

    /* renamed from: yb.f$b */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new C6868b.C0974b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
