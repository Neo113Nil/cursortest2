package com.facebook.imagepipeline.request;

import android.net.Uri;
import android.os.Build;
import com.facebook.imagepipeline.common.Priority;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import xsna.cq70;
import xsna.eng0;
import xsna.k020;
import xsna.ktc0;
import xsna.liw;
import xsna.lmc;
import xsna.meq0;
import xsna.v7g0;
import xsna.ww8;
import xsna.x9g0;

/* loaded from: classes12.dex */
public final class ImageRequest {
    public final CacheChoice a;
    public final Uri b;
    public final int c;
    public File d;
    public final boolean e;
    public final boolean f;
    public final liw g;
    public final x9g0 h;
    public final eng0 i;
    public final Priority j;
    public final RequestLevel k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final ktc0 o;
    public final v7g0 p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CacheChoice {
        private static final /* synthetic */ CacheChoice[] $VALUES;
        public static final CacheChoice DEFAULT;
        public static final CacheChoice DYNAMIC;
        public static final CacheChoice SMALL;

        static {
            CacheChoice cacheChoice = new CacheChoice("SMALL", 0);
            SMALL = cacheChoice;
            CacheChoice cacheChoice2 = new CacheChoice("DEFAULT", 1);
            DEFAULT = cacheChoice2;
            CacheChoice cacheChoice3 = new CacheChoice("DYNAMIC", 2);
            DYNAMIC = cacheChoice3;
            $VALUES = new CacheChoice[]{cacheChoice, cacheChoice2, cacheChoice3};
        }

        public CacheChoice() {
            throw null;
        }

        public static CacheChoice valueOf(String str) {
            return (CacheChoice) Enum.valueOf(CacheChoice.class, str);
        }

        public static CacheChoice[] values() {
            return (CacheChoice[]) $VALUES.clone();
        }
    }

    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);

        private int mValue;

        RequestLevel(int i) {
            this.mValue = i;
        }

        public static RequestLevel a(RequestLevel requestLevel, RequestLevel requestLevel2) {
            return requestLevel.mValue > requestLevel2.mValue ? requestLevel : requestLevel2;
        }

        public final int h() {
            return this.mValue;
        }
    }

    public class a {
    }

    public ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        this.a = imageRequestBuilder.g;
        Uri uri = imageRequestBuilder.a;
        this.b = uri;
        int i = -1;
        if (uri != null) {
            if (meq0.e(uri)) {
                i = 0;
            } else if (uri.getPath() != null && X3.i.b.equals(meq0.b(uri))) {
                i = k020.b(k020.a(uri.getPath())) ? 2 : 3;
            } else if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(meq0.b(uri))) {
                i = 4;
            } else if ("asset".equals(meq0.b(uri))) {
                i = 5;
            } else if (meq0.d(uri)) {
                i = 6;
            } else if ("data".equals(uri.getScheme())) {
                i = 7;
            } else if (meq0.f(uri)) {
                i = 8;
            }
        }
        this.c = i;
        this.e = imageRequestBuilder.h;
        this.f = imageRequestBuilder.i;
        this.g = imageRequestBuilder.f;
        this.h = imageRequestBuilder.d;
        eng0 eng0Var = imageRequestBuilder.e;
        this.i = eng0Var == null ? eng0.c : eng0Var;
        this.j = imageRequestBuilder.j;
        this.k = imageRequestBuilder.b;
        boolean z = (imageRequestBuilder.c & 48) == 0 && (meq0.e(imageRequestBuilder.a) || ImageRequestBuilder.f(imageRequestBuilder.a));
        this.m = z;
        int i2 = imageRequestBuilder.c;
        this.l = !z ? i2 | 48 : i2;
        this.n = (i2 & 15) == 0;
        this.o = imageRequestBuilder.k;
        this.p = imageRequestBuilder.l;
    }

    public static ImageRequest a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.h(uri).a();
    }

    public final CacheChoice b() {
        return this.a;
    }

    public final liw c() {
        return this.g;
    }

    public final boolean d() {
        return Build.VERSION.SDK_INT >= 29 && this.f;
    }

    public final RequestLevel e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (this.e != imageRequest.e || this.m != imageRequest.m || this.n != imageRequest.n || !cq70.a(this.b, imageRequest.b) || !cq70.a(this.a, imageRequest.a)) {
            return false;
        }
        if (!cq70.a(null, null) || !cq70.a(this.d, imageRequest.d) || !cq70.a(null, null) || !cq70.a(this.g, imageRequest.g) || !cq70.a(this.h, imageRequest.h) || !cq70.a(this.j, imageRequest.j) || !cq70.a(this.k, imageRequest.k) || !cq70.a(Integer.valueOf(this.l), Integer.valueOf(imageRequest.l)) || !cq70.a(null, null) || !cq70.a(null, null) || !cq70.a(null, null) || !cq70.a(this.i, imageRequest.i) || this.f != imageRequest.f) {
            return false;
        }
        ktc0 ktc0Var = this.o;
        ww8 a2 = ktc0Var != null ? ktc0Var.a() : null;
        ktc0 ktc0Var2 = imageRequest.o;
        return cq70.a(a2, ktc0Var2 != null ? ktc0Var2.a() : null);
    }

    public final ktc0 f() {
        return this.o;
    }

    public final Priority g() {
        return this.j;
    }

    public final v7g0 h() {
        return this.p;
    }

    public final int hashCode() {
        ktc0 ktc0Var = this.o;
        return lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(lmc.b(0, this.a), this.b), Boolean.valueOf(this.e)), null), this.j), this.k), Integer.valueOf(this.l)), Boolean.valueOf(this.m)), Boolean.valueOf(this.n)), this.g), null), this.h), this.i), ktc0Var != null ? ktc0Var.a() : null), null), null), 0), Boolean.valueOf(this.f));
    }

    public final x9g0 i() {
        return this.h;
    }

    public final eng0 j() {
        return this.i;
    }

    public final synchronized File k() {
        try {
            if (this.d == null) {
                this.b.getPath().getClass();
                this.d = new File(this.b.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public final Uri l() {
        return this.b;
    }

    public final int m() {
        return this.c;
    }

    public final boolean n(int i) {
        return (i & this.l) == 0;
    }

    public final String toString() {
        cq70.a b = cq70.b(this);
        b.d(this.b, "uri");
        b.d(this.a, "cacheChoice");
        b.d(this.g, "decodeOptions");
        b.d(this.o, "postprocessor");
        b.d(this.j, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        b.d(this.h, "resizeOptions");
        b.d(this.i, "rotationOptions");
        b.d(null, "bytesRange");
        b.d(null, "resizingAllowedOverride");
        b.d(null, "downsampleOverride");
        b.c("progressiveRenderingEnabled", false);
        b.c("localThumbnailPreviewsEnabled", this.e);
        b.c("loadThumbnailOnly", this.f);
        b.d(this.k, "lowestPermittedRequestLevel");
        b.a(this.l, "cachesDisabled");
        b.c("isDiskCacheEnabled", this.m);
        b.c("isMemoryCacheEnabled", this.n);
        b.d(null, "decodePrefetches");
        b.a(0, "delayMs");
        return b.toString();
    }
}
