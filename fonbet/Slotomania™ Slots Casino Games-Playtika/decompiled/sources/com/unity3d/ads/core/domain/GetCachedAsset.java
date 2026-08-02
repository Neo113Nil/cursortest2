package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.ironsource.B5;
import com.ironsource.InterfaceC2517l1;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.io.files.FileSystemKt;

/* compiled from: GetCachedAsset.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\b\u0010\u000e\u001a\u00020\nH\u0003J\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0087\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/GetCachedAsset;", "", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "context", "Landroid/content/Context;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Landroid/content/Context;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;)V", "getBundledAsset", "Landroid/webkit/WebResourceResponse;", "uri", "Landroid/net/Uri;", "getCachedAsset", "getNotFoundResponse", "invoke", "webviewType", "", "tryGetWebViewAsset", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetCachedAsset {
    private final CacheRepository cacheRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final Context context;

    public GetCachedAsset(CacheRepository cacheRepository, Context context, CacheWebViewAssets cacheWebViewAssets) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheWebViewAssets, "cacheWebViewAssets");
        this.cacheRepository = cacheRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    private final WebResourceResponse getNotFoundResponse() {
        return new WebResourceResponse("text/html", B5.O, InterfaceC2517l1.a.b.d, "Not Found", MapsKt.emptyMap(), new ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    public final WebResourceResponse invoke(Uri uri, String webviewType) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(webviewType, "webviewType");
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1921537799) {
                if (hashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, webviewType);
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String substringAfter$default = StringsKt.substringAfter$default(String.valueOf(uri.getPath()), "/", (String) null, 2, (Object) null);
        try {
            InputStream open = this.context.getAssets().open(substringAfter$default);
            Intrinsics.checkNotNullExpressionValue(open, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(substringAfter$default), null, open);
        } catch (Exception unused) {
            return getNotFoundResponse();
        }
    }

    private final WebResourceResponse getCachedAsset(Uri uri) {
        Object runBlocking$default;
        Object m11180constructorimpl;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new GetCachedAsset$getCachedAsset$result$1(this, StringsKt.substringAfterLast$default(uri2, "/", (String) null, 2, (Object) null), null), 1, null);
        CacheResult cacheResult = (CacheResult) runBlocking$default;
        if (cacheResult instanceof CacheResult.Success) {
            File file = ((CacheResult.Success) cacheResult).getCachedFile().getFile();
            if (file == null) {
                return null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                GetCachedAsset getCachedAsset = this;
                m11180constructorimpl = Result.m11180constructorimpl(new FileInputStream(file));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                m11180constructorimpl = null;
            }
            FileInputStream fileInputStream = (FileInputStream) m11180constructorimpl;
            if (fileInputStream == null) {
                return null;
            }
            String filePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(filePath), null, fileInputStream);
        }
        return getNotFoundResponse();
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String webviewType) {
        Object m11180constructorimpl;
        StringBuilder append = new StringBuilder().append(webviewType).append(FileSystemKt.UnixPathSeparator);
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        String sb = append.append(StringsKt.substringAfterLast$default(StringsKt.substringBefore$default(uri2, "?", (String) null, 2, (Object) null), "/", (String) null, 2, (Object) null)).toString();
        File file = this.cacheWebViewAssets.getCached().get(sb);
        if (file == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            GetCachedAsset getCachedAsset = this;
            m11180constructorimpl = Result.m11180constructorimpl(new FileInputStream(file));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
            m11180constructorimpl = null;
        }
        FileInputStream fileInputStream = (FileInputStream) m11180constructorimpl;
        if (fileInputStream == null) {
            return null;
        }
        return new WebResourceResponse(StringExtensionsKt.guessMimeType(sb), null, fileInputStream);
    }
}
