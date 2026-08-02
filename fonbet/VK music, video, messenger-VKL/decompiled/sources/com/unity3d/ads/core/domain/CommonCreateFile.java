package com.unity3d.ads.core.domain;

import java.io.File;

/* compiled from: CommonCreateFile.kt */
/* loaded from: classes14.dex */
public final class CommonCreateFile implements CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(File file, String str) {
        return new File(file, str);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(String str) {
        return new File(str);
    }
}
