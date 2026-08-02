package O2;

import P2.i;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import x0.C6774c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f8310a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f8311a;

        /* renamed from: b, reason: collision with root package name */
        public String f8312b = "appassets.androidplatform.net";

        /* renamed from: c, reason: collision with root package name */
        public final List f8313c = new ArrayList();

        public a a(String str, c cVar) {
            this.f8313c.add(C6774c.a(str, cVar));
            return this;
        }

        public e b() {
            ArrayList arrayList = new ArrayList();
            for (C6774c c6774c : this.f8313c) {
                arrayList.add(new d(this.f8312b, (String) c6774c.f67817a, this.f8311a, (c) c6774c.f67818b));
            }
            return new e(arrayList);
        }

        public a c(String str) {
            this.f8312b = str;
            return this;
        }
    }

    public static final class b implements c {
        private static final String[] FORBIDDEN_DATA_DIRS = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* renamed from: a, reason: collision with root package name */
        public final File f8314a;

        public b(Context context, File file) {
            try {
                this.f8314a = new File(i.a(file));
                if (b(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e10);
            }
        }

        @Override // O2.e.c
        public WebResourceResponse a(String str) {
            File b10;
            try {
                b10 = i.b(this.f8314a, str);
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e10);
            }
            if (b10 != null) {
                return new WebResourceResponse(i.d(str), null, i.f(b10));
            }
            Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, this.f8314a));
            return new WebResourceResponse(null, null, null);
        }

        public final boolean b(Context context) {
            String a10 = i.a(this.f8314a);
            String a11 = i.a(context.getCacheDir());
            String a12 = i.a(i.c(context));
            if ((!a10.startsWith(a11) && !a10.startsWith(a12)) || a10.equals(a11) || a10.equals(a12)) {
                return false;
            }
            for (String str : FORBIDDEN_DATA_DIRS) {
                if (a10.startsWith(a12 + str)) {
                    return false;
                }
            }
            return true;
        }
    }

    public interface c {
        WebResourceResponse a(String str);
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8315a;

        /* renamed from: b, reason: collision with root package name */
        public final String f8316b;

        /* renamed from: c, reason: collision with root package name */
        public final String f8317c;

        /* renamed from: d, reason: collision with root package name */
        public final c f8318d;

        public d(String str, String str2, boolean z10, c cVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith("/")) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f8316b = str;
            this.f8317c = str2;
            this.f8315a = z10;
            this.f8318d = cVar;
        }

        public String a(String str) {
            return str.replaceFirst(this.f8317c, "");
        }

        public c b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.f8315a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f8316b) && uri.getPath().startsWith(this.f8317c)) {
                return this.f8318d;
            }
            return null;
        }
    }

    public e(List list) {
        this.f8310a = list;
    }

    public WebResourceResponse a(Uri uri) {
        WebResourceResponse a10;
        for (d dVar : this.f8310a) {
            c b10 = dVar.b(uri);
            if (b10 != null && (a10 = b10.a(dVar.a(uri.getPath()))) != null) {
                return a10;
            }
        }
        return null;
    }
}
