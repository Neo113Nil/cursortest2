package B4;

import B4.n;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0017b f698a;

    /* renamed from: B4.b$b, reason: collision with other inner class name */
    public interface InterfaceC0017b {
        Class a();

        Object b(byte[] bArr);
    }

    public b(InterfaceC0017b interfaceC0017b) {
        this.f698a = interfaceC0017b;
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(byte[] bArr, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return new n.a(new O4.c(bArr), new c(bArr, this.f698a));
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(byte[] bArr) {
        return true;
    }

    public static class a implements o {

        /* renamed from: B4.b$a$a, reason: collision with other inner class name */
        public class C0016a implements InterfaceC0017b {
            public C0016a() {
            }

            @Override // B4.b.InterfaceC0017b
            public Class a() {
                return ByteBuffer.class;
            }

            @Override // B4.b.InterfaceC0017b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // B4.o
        public n e(r rVar) {
            return new b(new C0016a());
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static class c implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0017b f700a;
        private final byte[] model;

        public c(byte[] bArr, InterfaceC0017b interfaceC0017b) {
            this.model = bArr;
            this.f700a = interfaceC0017b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f700a.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            aVar.f(this.f700a.b(this.model));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    public static class d implements o {

        public class a implements InterfaceC0017b {
            public a() {
            }

            @Override // B4.b.InterfaceC0017b
            public Class a() {
                return InputStream.class;
            }

            @Override // B4.b.InterfaceC0017b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // B4.o
        public n e(r rVar) {
            return new b(new a());
        }

        @Override // B4.o
        public void d() {
        }
    }
}
