package com.unity3d.ads.core.domain;

import java.io.File;

/* compiled from: CommonGetCacheDirectory.kt */
/* loaded from: classes14.dex */
public final class CommonGetCacheDirectory implements GetCacheDirectory {
    @Override // com.unity3d.ads.core.domain.GetCacheDirectory
    public File invoke(File file, String str) {
        return new File(file, str);
    }
}
