package w3;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import j3.C7270l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s3.InterfaceC9588b;
import u3.P;

/* loaded from: classes8.dex */
public interface o {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f103484a;

        /* renamed from: b, reason: collision with root package name */
        private final String f103485b;

        public a(String str, byte[] bArr) {
            this.f103484a = bArr;
            this.f103485b = str;
        }

        public final byte[] a() {
            return this.f103484a;
        }

        public final String b() {
            return this.f103485b;
        }
    }

    public interface b {
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f103486a;

        /* renamed from: b, reason: collision with root package name */
        private final String f103487b;

        public c(String str, byte[] bArr) {
            this.f103486a = bArr;
            this.f103487b = str;
        }

        public final byte[] a() {
            return this.f103486a;
        }

        public final String b() {
            return this.f103487b;
        }
    }

    Map<String, String> a(byte[] bArr);

    c b();

    byte[] c() throws MediaDrmException;

    void d(byte[] bArr, byte[] bArr2);

    byte[] e(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    boolean f(String str, byte[] bArr);

    void g(b bVar);

    void h(byte[] bArr) throws DeniedByServerException;

    int i();

    InterfaceC9588b j(byte[] bArr) throws MediaCryptoException;

    void k(byte[] bArr);

    a l(byte[] bArr, List<C7270l.b> list, int i11, HashMap<String, String> hashMap) throws NotProvisionedException;

    default void m(byte[] bArr, P p11) {
    }

    void release();
}
