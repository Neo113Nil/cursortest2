package C4;

import B4.n;
import B4.o;
import B4.r;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import y4.AbstractC6853b;

/* loaded from: classes2.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1111a;

    /* renamed from: b, reason: collision with root package name */
    public final n f1112b;

    /* renamed from: c, reason: collision with root package name */
    public final n f1113c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f1114d;

    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: C4.d$d, reason: collision with other inner class name */
    public static final class C0030d implements com.bumptech.glide.load.data.d {
        private static final String[] PROJECTION = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final Context f1117a;

        /* renamed from: b, reason: collision with root package name */
        public final n f1118b;

        /* renamed from: c, reason: collision with root package name */
        public final n f1119c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f1120d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1121e;

        /* renamed from: f, reason: collision with root package name */
        public final int f1122f;

        /* renamed from: g, reason: collision with root package name */
        public final j f1123g;

        /* renamed from: h, reason: collision with root package name */
        public final Class f1124h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f1125i;

        /* renamed from: j, reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d f1126j;

        public C0030d(Context context, n nVar, n nVar2, Uri uri, int i10, int i11, j jVar, Class cls) {
            this.f1117a = context.getApplicationContext();
            this.f1118b = nVar;
            this.f1119c = nVar2;
            this.f1120d = uri;
            this.f1121e = i10;
            this.f1122f = i11;
            this.f1123g = jVar;
            this.f1124h = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f1124h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d dVar = this.f1126j;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final n.a c() {
            boolean isExternalStorageLegacy;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.f1118b.b(h(this.f1120d), this.f1121e, this.f1122f, this.f1123g);
            }
            if (AbstractC6853b.a(this.f1120d)) {
                return this.f1119c.b(this.f1120d, this.f1121e, this.f1122f, this.f1123g);
            }
            return this.f1119c.b(g() ? MediaStore.setRequireOriginal(this.f1120d) : this.f1120d, this.f1121e, this.f1122f, this.f1123g);
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f1125i = true;
            com.bumptech.glide.load.data.d dVar = this.f1126j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(h hVar, d.a aVar) {
            try {
                com.bumptech.glide.load.data.d f10 = f();
                if (f10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f1120d));
                    return;
                }
                this.f1126j = f10;
                if (this.f1125i) {
                    cancel();
                } else {
                    f10.e(hVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }

        public final com.bumptech.glide.load.data.d f() {
            n.a c10 = c();
            if (c10 != null) {
                return c10.f752c;
            }
            return null;
        }

        public final boolean g() {
            return this.f1117a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        public final File h(Uri uri) {
            try {
                Cursor query = this.f1117a.getContentResolver().query(uri, PROJECTION, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    query.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } finally {
            }
        }
    }

    public d(Context context, n nVar, n nVar2, Class cls) {
        this.f1111a = context.getApplicationContext();
        this.f1112b = nVar;
        this.f1113c = nVar2;
        this.f1114d = cls;
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, j jVar) {
        return new n.a(new O4.c(uri), new C0030d(this.f1111a, this.f1112b, this.f1113c, uri, i10, i11, jVar, this.f1114d));
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC6853b.c(uri);
    }

    public static abstract class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f1115a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f1116b;

        public a(Context context, Class cls) {
            this.f1115a = context;
            this.f1116b = cls;
        }

        @Override // B4.o
        public final n e(r rVar) {
            return new d(this.f1115a, rVar.d(File.class, this.f1116b), rVar.d(Uri.class, this.f1116b), this.f1116b);
        }

        @Override // B4.o
        public final void d() {
        }
    }
}
