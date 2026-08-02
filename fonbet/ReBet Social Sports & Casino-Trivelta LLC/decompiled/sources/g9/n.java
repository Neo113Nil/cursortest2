package g9;

import d9.AbstractC4041d;
import d9.C4040c;
import d9.InterfaceC4044g;
import g9.c;

/* loaded from: classes2.dex */
public abstract class n {

    public static abstract class a {
        public abstract n a();

        public abstract a b(C4040c c4040c);

        public abstract a c(AbstractC4041d abstractC4041d);

        public abstract a d(InterfaceC4044g interfaceC4044g);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract C4040c b();

    public abstract AbstractC4041d c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    public abstract InterfaceC4044g e();

    public abstract o f();

    public abstract String g();
}
