package B4;

import B4.n;
import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    public final a f703a;

    public interface a {
        Class a();

        void b(Object obj);

        Object c(String str);
    }

    public e(a aVar) {
        this.f703a = aVar;
    }

    @Override // B4.n
    public boolean a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // B4.n
    public n.a b(Object obj, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return new n.a(new O4.c(obj), new b(obj.toString(), this.f703a));
    }

    public static final class b implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        public final String f704a;

        /* renamed from: b, reason: collision with root package name */
        public final a f705b;

        /* renamed from: c, reason: collision with root package name */
        public Object f706c;

        public b(String str, a aVar) {
            this.f704a = str;
            this.f705b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f705b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f705b.b(this.f706c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            try {
                Object c10 = this.f705b.c(this.f704a);
                this.f706c = c10;
                aVar.f(c10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    public static final class c implements o {

        /* renamed from: a, reason: collision with root package name */
        public final a f707a = new a();

        public class a implements a {
            public a() {
            }

            @Override // B4.e.a
            public Class a() {
                return InputStream.class;
            }

            @Override // B4.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // B4.e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // B4.o
        public n e(r rVar) {
            return new e(this.f707a);
        }

        @Override // B4.o
        public void d() {
        }
    }
}
