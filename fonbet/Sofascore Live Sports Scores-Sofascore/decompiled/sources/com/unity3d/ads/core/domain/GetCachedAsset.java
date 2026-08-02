package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.C4427z5;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.lm5;
import defpackage.p2g;
import defpackage.td4;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.wv8;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0003J\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/GetCachedAsset;", "", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "context", "Landroid/content/Context;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "getAssetFileName", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "<init>", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Landroid/content/Context;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;Lcom/unity3d/ads/core/domain/GetAssetFileName;)V", "getNotFoundResponse", "Landroid/webkit/WebResourceResponse;", "invoke", "uri", "Landroid/net/Uri;", "webviewType", "", "getLegacyCachedAsset", "getBundledAsset", "tryGetWebViewAsset", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetCachedAsset {

    @NotNull
    private final CacheRepository cacheRepository;

    @NotNull
    private final CacheWebViewAssets cacheWebViewAssets;

    @NotNull
    private final Context context;

    @NotNull
    private final GetAssetFileName getAssetFileName;

    @NotNull
    private final SessionRepository sessionRepository;

    public GetCachedAsset(@NotNull CacheRepository cacheRepository, @NotNull SessionRepository sessionRepository, @NotNull Context context, @NotNull CacheWebViewAssets cacheWebViewAssets, @NotNull GetAssetFileName getAssetFileName) {
        cacheRepository.getClass();
        sessionRepository.getClass();
        context.getClass();
        cacheWebViewAssets.getClass();
        getAssetFileName.getClass();
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
        this.getAssetFileName = getAssetFileName;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String valueOf = String.valueOf(uri.getPath());
        String d0 = StringsKt.d0(valueOf, "/", valueOf);
        try {
            InputStream open = this.context.getAssets().open(d0);
            open.getClass();
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(d0), null, open);
        } catch (Exception unused) {
            return getNotFoundResponse();
        }
    }

    private final WebResourceResponse getLegacyCachedAsset(Uri uri) {
        Object u2gVar;
        String uri2 = uri.toString();
        uri2.getClass();
        CacheResult cacheResult = (CacheResult) td4.t0(g.a, new GetCachedAsset$getLegacyCachedAsset$result$1(this, StringsKt.f0(uri2, "/"), null));
        if (!(cacheResult instanceof CacheResult.Success)) {
            return getNotFoundResponse();
        }
        File file = ((CacheResult.Success) cacheResult).getCachedFile().getFile();
        if (file != null) {
            try {
                p2g p2gVar = w2g.b;
                u2gVar = new FileInputStream(file);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            if (u2gVar instanceof u2g) {
                u2gVar = null;
            }
            FileInputStream fileInputStream = (FileInputStream) u2gVar;
            if (fileInputStream != null) {
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                return new WebResourceResponse(StringExtensionsKt.guessMimeType(absolutePath), null, fileInputStream);
            }
        }
        return null;
    }

    private final WebResourceResponse getNotFoundResponse() {
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return new WebResourceResponse("text/html", C4427z5.O, 404, "Not Found", lm5Var, new ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String webviewType) {
        Object u2gVar;
        File file;
        Object u2gVar2;
        StringBuilder sb = new StringBuilder();
        sb.append(webviewType);
        sb.append('/');
        String uri2 = uri.toString();
        uri2.getClass();
        sb.append(StringsKt.f0(StringsKt.h0(uri2, "?"), "/"));
        String sb2 = sb.toString();
        File file2 = this.cacheWebViewAssets.getCached().get(sb2);
        if (file2 != null) {
            try {
                p2g p2gVar = w2g.b;
                u2gVar = new FileInputStream(file2);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            if (u2gVar instanceof u2g) {
                u2gVar = null;
            }
            FileInputStream fileInputStream = (FileInputStream) u2gVar;
            if (fileInputStream != null) {
                return new WebResourceResponse(StringExtensionsKt.guessMimeType(sb2), null, fileInputStream);
            }
        } else {
            String uri3 = uri.toString();
            uri3.getClass();
            CacheResult cacheResult = (CacheResult) td4.t0(g.a, new GetCachedAsset$tryGetWebViewAsset$result$1(this, this.getAssetFileName.invoke(uri3), null));
            if ((cacheResult instanceof CacheResult.Success) && (file = ((CacheResult.Success) cacheResult).getCachedFile().getFile()) != null) {
                try {
                    p2g p2gVar3 = w2g.b;
                    u2gVar2 = new FileInputStream(file);
                } catch (Throwable th2) {
                    p2g p2gVar4 = w2g.b;
                    u2gVar2 = new u2g(th2);
                }
                if (u2gVar2 instanceof u2g) {
                    u2gVar2 = null;
                }
                FileInputStream fileInputStream2 = (FileInputStream) u2gVar2;
                if (fileInputStream2 != null) {
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    return new WebResourceResponse(StringExtensionsKt.guessMimeType(absolutePath), null, 200, Payload.RESPONSE_OK, wv8.o("Access-Control-Allow-Origin", "*"), fileInputStream2);
                }
            }
        }
        return null;
    }

    @Nullable
    public final WebResourceResponse invoke(@NotNull Uri uri, @NotNull String webviewType) {
        uri.getClass();
        webviewType.getClass();
        boolean disableCustomScheme = this.sessionRepository.getFeatureFlags().getDisableCustomScheme();
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1921537799) {
                if (hashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return disableCustomScheme ? tryGetWebViewAsset(uri, webviewType) : getLegacyCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, webviewType);
    }
}
