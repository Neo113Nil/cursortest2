package B4;

import B4.n;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final d f719a;

    public static class b extends a {

        public class a implements d {
            @Override // B4.g.d
            public Class a() {
                return ParcelFileDescriptor.class;
            }

            @Override // B4.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            @Override // B4.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    public interface d {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    public static class e extends a {

        public class a implements d {
            @Override // B4.g.d
            public Class a() {
                return InputStream.class;
            }

            @Override // B4.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // B4.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d dVar) {
        this.f719a = dVar;
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(File file, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return new n.a(new O4.c(file), new c(file, this.f719a));
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final d f720a;

        public a(d dVar) {
            this.f720a = dVar;
        }

        @Override // B4.o
        public final n e(r rVar) {
            return new g(this.f720a);
        }

        @Override // B4.o
        public final void d() {
        }
    }

    public static final class c implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        public final File f721a;

        /* renamed from: b, reason: collision with root package name */
        public final d f722b;

        /* renamed from: c, reason: collision with root package name */
        public Object f723c;

        public c(File file, d dVar) {
            this.f721a = file;
            this.f722b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f722b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f723c;
            if (obj != null) {
                try {
                    this.f722b.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            try {
                Object c10 = this.f722b.c(this.f721a);
                this.f723c = c10;
                aVar.f(c10);
            } catch (FileNotFoundException e10) {
                Log.isLoggable("FileLoader", 3);
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
