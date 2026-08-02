package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashSet;
import java.util.Iterator;
import xsna.eng0;
import xsna.ihs;
import xsna.ktc0;
import xsna.liw;
import xsna.meq0;
import xsna.v7g0;
import xsna.x9g0;

/* loaded from: classes12.dex */
public final class ImageRequestBuilder {
    public static final HashSet m = new HashSet();
    public Uri a;
    public ImageRequest.RequestLevel b;
    public int c;
    public x9g0 d;
    public eng0 e;
    public liw f;
    public ImageRequest.CacheChoice g;
    public boolean h;
    public boolean i;
    public Priority j;
    public ktc0 k;
    public v7g0 l;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: ".concat(str));
        }
    }

    public static ImageRequestBuilder d(ImageRequest imageRequest) {
        ImageRequestBuilder h = h(imageRequest.b);
        h.f = imageRequest.g;
        h.g = imageRequest.a;
        h.h = imageRequest.e;
        h.i = imageRequest.d();
        h.b = imageRequest.k;
        h.c = imageRequest.l;
        h.k = imageRequest.o;
        h.j = imageRequest.j;
        h.d = imageRequest.h;
        h.l = imageRequest.p;
        h.e = imageRequest.i;
        return h;
    }

    public static boolean f(Uri uri) {
        HashSet hashSet = m;
        if (hashSet == null || uri == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static ImageRequestBuilder g(int i) {
        return h(meq0.c(i));
    }

    public static ImageRequestBuilder h(Uri uri) {
        ImageRequestBuilder imageRequestBuilder = new ImageRequestBuilder();
        imageRequestBuilder.a = null;
        imageRequestBuilder.b = ImageRequest.RequestLevel.FULL_FETCH;
        imageRequestBuilder.c = 0;
        imageRequestBuilder.d = null;
        imageRequestBuilder.e = null;
        imageRequestBuilder.f = liw.d;
        imageRequestBuilder.g = ImageRequest.CacheChoice.DEFAULT;
        imageRequestBuilder.h = false;
        imageRequestBuilder.i = false;
        imageRequestBuilder.j = Priority.HIGH;
        imageRequestBuilder.k = null;
        uri.getClass();
        imageRequestBuilder.a = uri;
        return imageRequestBuilder;
    }

    public final ImageRequest a() {
        Uri uri = this.a;
        if (uri == null) {
            throw new BuilderException("Source must be set!");
        }
        if (meq0.d(uri)) {
            if (!this.a.isAbsolute()) {
                throw new BuilderException("Resource URI path must be absolute.");
            }
            if (this.a.getPath().isEmpty()) {
                throw new BuilderException("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new BuilderException("Resource URI path must be a resource id.");
            }
        }
        if (!"asset".equals(meq0.b(this.a)) || this.a.isAbsolute()) {
            return new ImageRequest(this);
        }
        throw new BuilderException("Asset URI path must be absolute.");
    }

    public final void b() {
        this.c |= 48;
    }

    public final void c() {
        this.c |= 15;
    }

    public final Uri e() {
        return this.a;
    }

    public final void i(ImageRequest.CacheChoice cacheChoice) {
        this.g = cacheChoice;
    }

    public final void j(liw liwVar) {
        this.f = liwVar;
    }

    public final void k(ktc0 ktc0Var) {
        this.k = ktc0Var;
    }

    public final void l(ihs ihsVar) {
        this.l = ihsVar;
    }

    public final void m(x9g0 x9g0Var) {
        this.d = x9g0Var;
    }

    public final void n(eng0 eng0Var) {
        this.e = eng0Var;
    }

    public final void o(Uri uri) {
        this.a = uri;
    }
}
