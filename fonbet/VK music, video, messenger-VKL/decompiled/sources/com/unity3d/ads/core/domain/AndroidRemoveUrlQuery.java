package com.unity3d.ads.core.domain;

import android.net.Uri;

/* compiled from: AndroidRemoveUrlQuery.kt */
/* loaded from: classes14.dex */
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    public String invoke(String str) {
        return Uri.parse(str).buildUpon().clearQuery().build().toString();
    }
}
