package g9;

import android.util.Base64;
import d9.EnumC4042e;
import g9.d;

/* loaded from: classes2.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(EnumC4042e enumC4042e);
    }

    public static a a() {
        return new d.b().d(EnumC4042e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract EnumC4042e d();

    public boolean e() {
        return c() != null;
    }

    public o f(EnumC4042e enumC4042e) {
        return a().b(b()).d(enumC4042e).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
