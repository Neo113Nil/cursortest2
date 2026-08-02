package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.extensions.StringExtensionsKt;
import io.jsonwebtoken.JwtParser;
import xsna.drm0;

/* compiled from: GetAssetFileName.kt */
/* loaded from: classes14.dex */
public final class GetAssetFileName {
    public final String invoke(String str) {
        String l0 = drm0.l0(str, '?');
        String i0 = drm0.i0(JwtParser.SEPARATOR_CHAR, drm0.i0('/', l0, l0), "");
        if (drm0.N(i0)) {
            return StringExtensionsKt.getSHA256Hash(str);
        }
        return StringExtensionsKt.getSHA256Hash(str) + JwtParser.SEPARATOR_CHAR + i0;
    }
}
