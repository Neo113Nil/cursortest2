package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.extensions.StringExtensionsKt;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAssetFileName;", "", "<init>", "()V", "invoke", "", "url", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetAssetFileName {
    @NotNull
    public final String invoke(@NotNull String url) {
        url.getClass();
        String g0 = StringsKt.g0(url, '?');
        String e0 = StringsKt.e0('.', StringsKt.e0('/', g0, g0), "");
        if (StringsKt.R(e0)) {
            return StringExtensionsKt.getSHA256Hash(url);
        }
        return StringExtensionsKt.getSHA256Hash(url) + '.' + e0;
    }
}
