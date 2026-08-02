package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import java.io.File;
import xsna.brm0;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: AndroidLocalCacheDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidLocalCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    public AndroidLocalCacheDataSource(CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl) {
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
    }

    public final CreateFile getCreateFile() {
        return this.createFile;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, int i, yzs<? super Long, ? super Long, ? super spj<? super s3q0>, ? extends Object> yzsVar, spj<? super CacheResult> spjVar) {
        File invoke = this.createFile.invoke(file, str);
        if (!invoke.exists() || brm0.v(invoke.getName(), ".part", false)) {
            return new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL, null, 4, null);
        }
        String invoke2 = (str2 == null || str2.length() == 0) ? null : this.getFileExtensionFromUrl.invoke(str2);
        return new CacheResult.Success(new CachedFile(str2 == null ? "" : str2, str, invoke, invoke2 == null ? "" : invoke2, invoke.length(), null, num != null ? num.intValue() : Integer.MAX_VALUE, 32, null), CacheSource.LOCAL);
    }

    public final GetFileExtensionFromUrl getGetFileExtensionFromUrl() {
        return this.getFileExtensionFromUrl;
    }
}
