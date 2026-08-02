package com.facebook.imagepipeline.request;

import B7.f;
import B7.g;
import B7.h;
import C7.EnumC1050n;
import D6.e;
import D6.i;
import D6.k;
import android.net.Uri;
import android.os.Build;
import com.twilio.voice.EventKeys;
import f8.C4267a;
import java.io.File;
import java.util.HashMap;
import w6.InterfaceC6713d;

/* loaded from: classes2.dex */
public class b {
    public static final e REQUEST_TO_URI_FN = new a();
    private static boolean sCacheHashcode;
    private static boolean sUseCachedHashcodeInEquals;
    private final B7.b mBytesRange;
    private final EnumC0484b mCacheChoice;
    protected int mCachesDisabled;
    private final Boolean mDecodePrefetches;
    private final int mDelayMs;
    private final String mDiskCacheId;
    private final EnumC1050n mDownsampleOverride;
    private int mHashcode;
    private final B7.d mImageDecodeOptions;
    private final boolean mIsDiskCacheEnabled;
    private final boolean mIsMemoryCacheEnabled;
    private final boolean mLoadThumbnailOnly;
    private final boolean mLocalThumbnailPreviewsEnabled;
    private final c mLowestPermittedRequestLevel;
    private final d mPostprocessor;
    private final boolean mProgressiveRenderingEnabled;
    private final J7.e mRequestListener;
    private final f mRequestPriority;
    private final g mResizeOptions;
    private final Boolean mResizingAllowedOverride;
    private final h mRotationOptions;
    private File mSourceFile;
    private final Uri mSourceUri;
    private final int mSourceUriType;

    public class a implements e {
        @Override // D6.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri apply(b bVar) {
            if (bVar != null) {
                return bVar.getSourceUri();
            }
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.request.b$b, reason: collision with other inner class name */
    public enum EnumC0484b {
        SMALL,
        DEFAULT,
        DYNAMIC
    }

    public enum c {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);


        /* renamed from: a, reason: collision with root package name */
        public int f30921a;

        c(int i10) {
            this.f30921a = i10;
        }

        public static c a(c cVar, c cVar2) {
            return cVar.b() > cVar2.b() ? cVar : cVar2;
        }

        public int b() {
            return this.f30921a;
        }
    }

    public b(com.facebook.imagepipeline.request.c cVar) {
        this.mCacheChoice = cVar.d();
        Uri r10 = cVar.r();
        this.mSourceUri = r10;
        this.mSourceUriType = b(r10);
        this.mProgressiveRenderingEnabled = cVar.w();
        this.mLocalThumbnailPreviewsEnabled = cVar.u();
        this.mLoadThumbnailOnly = cVar.j();
        this.mImageDecodeOptions = cVar.i();
        this.mResizeOptions = cVar.o();
        this.mRotationOptions = cVar.q() == null ? h.d() : cVar.q();
        this.mBytesRange = cVar.c();
        this.mRequestPriority = cVar.n();
        this.mLowestPermittedRequestLevel = cVar.k();
        boolean t10 = cVar.t();
        this.mIsDiskCacheEnabled = t10;
        int e10 = cVar.e();
        this.mCachesDisabled = t10 ? e10 : e10 | 48;
        this.mIsMemoryCacheEnabled = cVar.v();
        this.mDecodePrefetches = cVar.S();
        this.mPostprocessor = cVar.l();
        this.mRequestListener = cVar.m();
        this.mResizingAllowedOverride = cVar.p();
        this.mDownsampleOverride = cVar.h();
        this.mDelayMs = cVar.f();
        this.mDiskCacheId = cVar.g();
    }

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int b(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (com.facebook.common.util.f.p(uri)) {
            return 0;
        }
        if (uri.getPath() != null && com.facebook.common.util.f.n(uri)) {
            return F6.a.c(F6.a.b(uri.getPath())) ? 2 : 3;
        }
        if (com.facebook.common.util.f.m(uri)) {
            return 4;
        }
        if (com.facebook.common.util.f.j(uri)) {
            return 5;
        }
        if (com.facebook.common.util.f.o(uri)) {
            return 6;
        }
        if (com.facebook.common.util.f.i(uri)) {
            return 7;
        }
        return com.facebook.common.util.f.q(uri) ? 8 : -1;
    }

    public static b fromFile(File file) {
        if (file == null) {
            return null;
        }
        return fromUri(com.facebook.common.util.f.g(file));
    }

    public static b fromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        return com.facebook.imagepipeline.request.c.x(uri).a();
    }

    public static void setCacheHashcode(boolean z10) {
        sCacheHashcode = z10;
    }

    public static void setUseCachedHashcodeInEquals(boolean z10) {
        sUseCachedHashcodeInEquals = z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (sUseCachedHashcodeInEquals) {
            int i10 = this.mHashcode;
            int i11 = bVar.mHashcode;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
        }
        if (this.mLocalThumbnailPreviewsEnabled == bVar.mLocalThumbnailPreviewsEnabled && this.mIsDiskCacheEnabled == bVar.mIsDiskCacheEnabled && this.mIsMemoryCacheEnabled == bVar.mIsMemoryCacheEnabled && i.a(this.mSourceUri, bVar.mSourceUri) && i.a(this.mCacheChoice, bVar.mCacheChoice) && i.a(this.mDiskCacheId, bVar.mDiskCacheId) && i.a(this.mSourceFile, bVar.mSourceFile) && i.a(this.mBytesRange, bVar.mBytesRange) && i.a(this.mImageDecodeOptions, bVar.mImageDecodeOptions) && i.a(this.mResizeOptions, bVar.mResizeOptions) && i.a(this.mRequestPriority, bVar.mRequestPriority) && i.a(this.mLowestPermittedRequestLevel, bVar.mLowestPermittedRequestLevel) && i.a(Integer.valueOf(this.mCachesDisabled), Integer.valueOf(bVar.mCachesDisabled)) && i.a(this.mDecodePrefetches, bVar.mDecodePrefetches) && i.a(this.mResizingAllowedOverride, bVar.mResizingAllowedOverride) && i.a(this.mDownsampleOverride, bVar.mDownsampleOverride) && i.a(this.mRotationOptions, bVar.mRotationOptions) && this.mLoadThumbnailOnly == bVar.mLoadThumbnailOnly) {
            d dVar = this.mPostprocessor;
            InterfaceC6713d postprocessorCacheKey = dVar != null ? dVar.getPostprocessorCacheKey() : null;
            d dVar2 = bVar.mPostprocessor;
            if (i.a(postprocessorCacheKey, dVar2 != null ? dVar2.getPostprocessorCacheKey() : null) && this.mDelayMs == bVar.mDelayMs) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.j();
    }

    public B7.b getBytesRange() {
        return this.mBytesRange;
    }

    public EnumC0484b getCacheChoice() {
        return this.mCacheChoice;
    }

    public int getCachesDisabled() {
        return this.mCachesDisabled;
    }

    public int getDelayMs() {
        return this.mDelayMs;
    }

    public String getDiskCacheId() {
        return this.mDiskCacheId;
    }

    public EnumC1050n getDownsampleOverride() {
        return this.mDownsampleOverride;
    }

    public B7.d getImageDecodeOptions() {
        return this.mImageDecodeOptions;
    }

    public boolean getLoadThumbnailOnlyForAndroidSdkAboveQ() {
        return Build.VERSION.SDK_INT >= 29 && this.mLoadThumbnailOnly;
    }

    public boolean getLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    public c getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    public d getPostprocessor() {
        return this.mPostprocessor;
    }

    public int getPreferredHeight() {
        g gVar = this.mResizeOptions;
        if (gVar != null) {
            return gVar.f850b;
        }
        return 2048;
    }

    public int getPreferredWidth() {
        g gVar = this.mResizeOptions;
        if (gVar != null) {
            return gVar.f849a;
        }
        return 2048;
    }

    public f getPriority() {
        return this.mRequestPriority;
    }

    public boolean getProgressiveRenderingEnabled() {
        return this.mProgressiveRenderingEnabled;
    }

    public J7.e getRequestListener() {
        return this.mRequestListener;
    }

    public g getResizeOptions() {
        return this.mResizeOptions;
    }

    public Boolean getResizingAllowedOverride() {
        return this.mResizingAllowedOverride;
    }

    public h getRotationOptions() {
        return this.mRotationOptions;
    }

    public synchronized File getSourceFile() {
        try {
            if (this.mSourceFile == null) {
                k.g(this.mSourceUri.getPath());
                this.mSourceFile = new File(this.mSourceUri.getPath());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.mSourceFile;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public int getSourceUriType() {
        return this.mSourceUriType;
    }

    public int hashCode() {
        boolean z10 = sCacheHashcode;
        int i10 = z10 ? this.mHashcode : 0;
        if (i10 != 0) {
            return i10;
        }
        d dVar = this.mPostprocessor;
        int a10 = C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(C4267a.a(0, this.mCacheChoice), this.mSourceUri), Boolean.valueOf(this.mLocalThumbnailPreviewsEnabled)), this.mBytesRange), this.mRequestPriority), this.mLowestPermittedRequestLevel), Integer.valueOf(this.mCachesDisabled)), Boolean.valueOf(this.mIsDiskCacheEnabled)), Boolean.valueOf(this.mIsMemoryCacheEnabled)), this.mImageDecodeOptions), this.mDecodePrefetches), this.mResizeOptions), this.mRotationOptions), dVar != null ? dVar.getPostprocessorCacheKey() : null), this.mResizingAllowedOverride), this.mDownsampleOverride), Integer.valueOf(this.mDelayMs)), Boolean.valueOf(this.mLoadThumbnailOnly));
        if (z10) {
            this.mHashcode = a10;
        }
        return a10;
    }

    public boolean isCacheEnabled(int i10) {
        return (i10 & getCachesDisabled()) == 0;
    }

    public boolean isDiskCacheEnabled() {
        return this.mIsDiskCacheEnabled;
    }

    public boolean isMemoryCacheEnabled() {
        return this.mIsMemoryCacheEnabled;
    }

    public void recordHashCode(HashMap<String, Integer> hashMap) {
        d dVar = this.mPostprocessor;
        InterfaceC6713d postprocessorCacheKey = dVar != null ? dVar.getPostprocessorCacheKey() : null;
        hashMap.put("ImageRequest", Integer.valueOf(hashCode()));
        hashMap.put("ImageRequest.mSourceUri", Integer.valueOf(a(this.mSourceUri)));
        hashMap.put("ImageRequest.mLocalThumbnailPreviewsEnabled", Integer.valueOf(a(Boolean.valueOf(this.mLocalThumbnailPreviewsEnabled))));
        hashMap.put("ImageRequest.mBytesRange", Integer.valueOf(a(this.mBytesRange)));
        hashMap.put("ImageRequest.mRequestPriority", Integer.valueOf(a(this.mRequestPriority)));
        hashMap.put("ImageRequest.mLowestPermittedRequestLevel", Integer.valueOf(a(this.mLowestPermittedRequestLevel)));
        hashMap.put("ImageRequest.mCachesDisabled", Integer.valueOf(a(Integer.valueOf(this.mCachesDisabled))));
        hashMap.put("ImageRequest.mIsDiskCacheEnabled", Integer.valueOf(a(Boolean.valueOf(this.mIsDiskCacheEnabled))));
        hashMap.put("ImageRequest.mIsMemoryCacheEnabled", Integer.valueOf(a(Boolean.valueOf(this.mIsMemoryCacheEnabled))));
        hashMap.put("ImageRequest.mImageDecodeOptions", Integer.valueOf(a(this.mImageDecodeOptions)));
        hashMap.put("ImageRequest.mDecodePrefetches", Integer.valueOf(a(this.mDecodePrefetches)));
        hashMap.put("ImageRequest.mSoumResizeOptionsrceUri", Integer.valueOf(a(this.mResizeOptions)));
        hashMap.put("ImageRequest.mRotationOptions", Integer.valueOf(a(this.mRotationOptions)));
        hashMap.put("ImageRequest.postprocessorCacheKey", Integer.valueOf(a(postprocessorCacheKey)));
        hashMap.put("ImageRequest.mResizingAllowedOverride", Integer.valueOf(a(this.mResizingAllowedOverride)));
        hashMap.put("ImageRequest.mDownsampleOverride", Integer.valueOf(a(this.mDownsampleOverride)));
        hashMap.put("ImageRequest.mDelayMs", Integer.valueOf(a(Integer.valueOf(this.mDelayMs))));
        hashMap.put("ImageRequest.mLoadThumbnailOnly", Integer.valueOf(a(Boolean.valueOf(this.mLoadThumbnailOnly))));
    }

    public Boolean shouldDecodePrefetches() {
        return this.mDecodePrefetches;
    }

    public String toString() {
        return i.b(this).b("uri", this.mSourceUri).b("cacheChoice", this.mCacheChoice).b("decodeOptions", this.mImageDecodeOptions).b("postprocessor", this.mPostprocessor).b(EventKeys.PRIORITY, this.mRequestPriority).b("resizeOptions", this.mResizeOptions).b("rotationOptions", this.mRotationOptions).b("bytesRange", this.mBytesRange).b("resizingAllowedOverride", this.mResizingAllowedOverride).b("downsampleOverride", this.mDownsampleOverride).c("progressiveRenderingEnabled", this.mProgressiveRenderingEnabled).c("localThumbnailPreviewsEnabled", this.mLocalThumbnailPreviewsEnabled).c("loadThumbnailOnly", this.mLoadThumbnailOnly).b("lowestPermittedRequestLevel", this.mLowestPermittedRequestLevel).a("cachesDisabled", this.mCachesDisabled).c("isDiskCacheEnabled", this.mIsDiskCacheEnabled).c("isMemoryCacheEnabled", this.mIsMemoryCacheEnabled).b("decodePrefetches", this.mDecodePrefetches).a("delayMs", this.mDelayMs).toString();
    }

    public static b fromUri(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(str));
    }
}
