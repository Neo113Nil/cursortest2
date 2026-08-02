package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.WebViewConfiguration;
import java.io.File;
import java.util.Map;
import xsna.s3q0;
import xsna.spj;

/* compiled from: CacheWebViewAssets.kt */
/* loaded from: classes14.dex */
public interface CacheWebViewAssets {

    /* compiled from: CacheWebViewAssets.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(CacheWebViewAssets cacheWebViewAssets, WebViewConfiguration webViewConfiguration, boolean z, spj spjVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return cacheWebViewAssets.invoke(webViewConfiguration, z, spjVar);
        }
    }

    Map<String, File> getCached();

    Object invoke(WebViewConfiguration webViewConfiguration, boolean z, spj<? super s3q0> spjVar);

    Object warmFromDisk(WebViewConfiguration webViewConfiguration, spj<? super Boolean> spjVar);
}
