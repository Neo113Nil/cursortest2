package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.WebViewConfiguration;
import defpackage.a70;
import defpackage.rq3;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦B¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\nR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "webviewConfiguration", "", "forceDownload", "", "invoke", "(Lcom/unity3d/ads/core/data/model/WebViewConfiguration;ZLrq3;)Ljava/lang/Object;", "warmFromDisk", "(Lcom/unity3d/ads/core/data/model/WebViewConfiguration;Lrq3;)Ljava/lang/Object;", "", "", "Ljava/io/File;", "getCached", "()Ljava/util/Map;", "cached", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CacheWebViewAssets {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(CacheWebViewAssets cacheWebViewAssets, WebViewConfiguration webViewConfiguration, boolean z, rq3 rq3Var, int i, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: invoke");
                return null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return cacheWebViewAssets.invoke(webViewConfiguration, z, rq3Var);
        }
    }

    @NotNull
    Map<String, File> getCached();

    @Nullable
    Object invoke(@NotNull WebViewConfiguration webViewConfiguration, boolean z, @NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object warmFromDisk(@NotNull WebViewConfiguration webViewConfiguration, @NotNull rq3<? super Boolean> rq3Var);
}
