package B4;

import B4.n;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import y4.AbstractC6853b;

/* loaded from: classes2.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f740a;

    public l(Context context) {
        this.f740a = context;
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return new n.a(new O4.c(uri), new b(this.f740a, uri));
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return AbstractC6853b.c(uri);
    }

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f741a;

        public a(Context context) {
            this.f741a = context;
        }

        @Override // B4.o
        public n e(r rVar) {
            return new l(this.f741a);
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static class b implements com.bumptech.glide.load.data.d {
        private static final String[] PROJECTION = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final Context f742a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f743b;

        public b(Context context, Uri uri) {
            this.f742a = context;
            this.f743b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            Cursor query = this.f742a.getContentResolver().query(this.f743b, PROJECTION, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                    query.close();
                } catch (Throwable th2) {
                    query.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.f(new File(r0));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f743b));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
