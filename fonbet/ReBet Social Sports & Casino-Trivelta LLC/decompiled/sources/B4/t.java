package B4;

import B4.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class t implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f780a;

    /* renamed from: b, reason: collision with root package name */
    public final n f781b;

    public t(Context context, n nVar) {
        this.f780a = context.getApplicationContext();
        this.f781b = nVar;
    }

    public static o e(Context context) {
        return new a(context);
    }

    public static o f(Context context) {
        return new b(context);
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, com.bumptech.glide.load.j jVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, jVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, jVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f780a.getPackageName().equals(uri.getAuthority());
    }

    public final n.a g(Uri uri, int i10, int i11, com.bumptech.glide.load.j jVar) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f781b.b(Integer.valueOf(parseInt), i10, i11, jVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    public final n.a h(Uri uri, int i10, int i11, com.bumptech.glide.load.j jVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f780a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f780a.getPackageName());
        if (identifier != 0) {
            return this.f781b.b(Integer.valueOf(identifier), i10, i11, jVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f782a;

        public a(Context context) {
            this.f782a = context;
        }

        @Override // B4.o
        public n e(r rVar) {
            return new t(this.f782a, rVar.d(Integer.class, AssetFileDescriptor.class));
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f783a;

        public b(Context context) {
            this.f783a = context;
        }

        @Override // B4.o
        public n e(r rVar) {
            return new t(this.f783a, rVar.d(Integer.class, InputStream.class));
        }

        @Override // B4.o
        public void d() {
        }
    }
}
