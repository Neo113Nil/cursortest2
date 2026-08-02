package q1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import n1.G1;

/* renamed from: q1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6089A {

    /* renamed from: q1.A$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f63227a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63228b;
        private final byte[] data;

        public a(byte[] bArr, String str, int i10) {
            this.data = bArr;
            this.f63227a = str;
            this.f63228b = i10;
        }

        public byte[] a() {
            return this.data;
        }

        public String b() {
            return this.f63227a;
        }
    }

    /* renamed from: q1.A$b */
    public interface b {
        void a(InterfaceC6089A interfaceC6089A, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* renamed from: q1.A$c */
    public interface c {
        InterfaceC6089A a(UUID uuid);
    }

    /* renamed from: q1.A$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f63229a;
        private final byte[] data;

        public d(byte[] bArr, String str) {
            this.data = bArr;
            this.f63229a = str;
        }

        public byte[] a() {
            return this.data;
        }

        public String b() {
            return this.f63229a;
        }
    }

    Map a(byte[] bArr);

    d b();

    byte[] c();

    void d(byte[] bArr, byte[] bArr2);

    void e(byte[] bArr);

    int f();

    void g(b bVar);

    k1.b h(byte[] bArr);

    boolean j(byte[] bArr, String str);

    void k(byte[] bArr);

    byte[] l(byte[] bArr, byte[] bArr2);

    a m(byte[] bArr, List list, int i10, HashMap hashMap);

    void release();

    default void i(byte[] bArr, G1 g12) {
    }
}
