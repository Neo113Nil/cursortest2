package com.unity3d.ads.core.domain;

import io.jsonwebtoken.JwtParser;
import xsna.drm0;

/* compiled from: CommonGetFileExtensionFromUrl.kt */
/* loaded from: classes14.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(RemoveUrlQuery removeUrlQuery) {
        this.removeUrlQuery = removeUrlQuery;
    }

    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    public String invoke(String str) {
        String invoke = this.removeUrlQuery.invoke(str);
        if (invoke == null) {
            return null;
        }
        String i0 = drm0.i0('/', invoke, invoke);
        if (!drm0.E(i0, JwtParser.SEPARATOR_CHAR)) {
            return null;
        }
        String i02 = drm0.i0(JwtParser.SEPARATOR_CHAR, i0, i0);
        if (i02.length() == 0) {
            return null;
        }
        return i02;
    }
}
