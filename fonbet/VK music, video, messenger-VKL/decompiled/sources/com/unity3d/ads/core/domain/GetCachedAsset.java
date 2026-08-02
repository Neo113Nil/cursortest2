package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.B5;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.drm0;
import xsna.dt;
import xsna.jgp;
import xsna.myc0;
import xsna.v1v;

/* compiled from: GetCachedAsset.kt */
/* loaded from: classes14.dex */
public final class GetCachedAsset {
    private final CacheRepository cacheRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final Context context;
    private final GetAssetFileName getAssetFileName;
    private final SessionRepository sessionRepository;

    public GetCachedAsset(CacheRepository cacheRepository, SessionRepository sessionRepository, Context context, CacheWebViewAssets cacheWebViewAssets, GetAssetFileName getAssetFileName) {
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
        this.getAssetFileName = getAssetFileName;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String valueOf = String.valueOf(uri.getPath());
        String g0 = drm0.g0(valueOf, DomExceptionUtils.SEPARATOR, valueOf);
        try {
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(g0), null, this.context.getAssets().open(g0));
        } catch (Exception unused) {
            return getNotFoundResponse();
        }
    }

    private final WebResourceResponse getLegacyCachedAsset(Uri uri) {
        Object failure;
        String uri2 = uri.toString();
        CacheResult cacheResult = (CacheResult) myc0.i(EmptyCoroutineContext.b, new GetCachedAsset$getLegacyCachedAsset$result$1(this, drm0.j0(uri2, DomExceptionUtils.SEPARATOR, uri2), null));
        if (!(cacheResult instanceof CacheResult.Success)) {
            return getNotFoundResponse();
        }
        File file = ((CacheResult.Success) cacheResult).getCachedFile().getFile();
        if (file != null) {
            try {
                failure = new FileInputStream(file);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            FileInputStream fileInputStream = (FileInputStream) failure;
            if (fileInputStream != null) {
                return new WebResourceResponse(StringExtensionsKt.guessMimeType(file.getAbsolutePath()), null, fileInputStream);
            }
        }
        return null;
    }

    private final WebResourceResponse getNotFoundResponse() {
        return new WebResourceResponse("text/html", B5.O, 404, "Not Found", jgp.b, new ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String str) {
        Object failure;
        File file;
        Object failure2;
        StringBuilder b = v1v.b(str, '/');
        String uri2 = uri.toString();
        String k0 = drm0.k0(uri2, "?", uri2);
        b.append(drm0.j0(k0, DomExceptionUtils.SEPARATOR, k0));
        String sb = b.toString();
        File file2 = this.cacheWebViewAssets.getCached().get(sb);
        if (file2 != null) {
            try {
                failure = new FileInputStream(file2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            FileInputStream fileInputStream = (FileInputStream) failure;
            if (fileInputStream != null) {
                return new WebResourceResponse(StringExtensionsKt.guessMimeType(sb), null, fileInputStream);
            }
        } else {
            CacheResult cacheResult = (CacheResult) myc0.i(EmptyCoroutineContext.b, new GetCachedAsset$tryGetWebViewAsset$result$1(this, this.getAssetFileName.invoke(uri.toString()), null));
            if ((cacheResult instanceof CacheResult.Success) && (file = ((CacheResult.Success) cacheResult).getCachedFile().getFile()) != null) {
                try {
                    failure2 = new FileInputStream(file);
                } catch (Throwable th2) {
                    failure2 = new Result.Failure(th2);
                }
                if (failure2 instanceof Result.Failure) {
                    failure2 = null;
                }
                FileInputStream fileInputStream2 = (FileInputStream) failure2;
                if (fileInputStream2 != null) {
                    return new WebResourceResponse(StringExtensionsKt.guessMimeType(file.getAbsolutePath()), null, 200, "OK", dt.b("Access-Control-Allow-Origin", "*"), fileInputStream2);
                }
            }
        }
        return null;
    }

    public final WebResourceResponse invoke(Uri uri, String str) {
        boolean disableCustomScheme = this.sessionRepository.getFeatureFlags().getDisableCustomScheme();
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1921537799) {
                if (hashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return disableCustomScheme ? tryGetWebViewAsset(uri, str) : getLegacyCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, str);
    }
}
