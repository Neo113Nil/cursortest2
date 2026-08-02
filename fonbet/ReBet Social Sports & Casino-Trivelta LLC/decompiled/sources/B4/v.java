package B4;

import B4.n;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class v implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f785a;

    public v(n nVar) {
        this.f785a = nVar;
    }

    public static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    public static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(String str, int i10, int i11, com.bumptech.glide.load.j jVar) {
        Uri e10 = e(str);
        if (e10 == null || !this.f785a.a(e10)) {
            return null;
        }
        return this.f785a.b(e10, i10, i11, jVar);
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(String str) {
        return true;
    }

    public static final class a implements o {
        @Override // B4.o
        public n e(r rVar) {
            return new v(rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static class b implements o {
        @Override // B4.o
        public n e(r rVar) {
            return new v(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static class c implements o {
        @Override // B4.o
        public n e(r rVar) {
            return new v(rVar.d(Uri.class, InputStream.class));
        }

        @Override // B4.o
        public void d() {
        }
    }
}
