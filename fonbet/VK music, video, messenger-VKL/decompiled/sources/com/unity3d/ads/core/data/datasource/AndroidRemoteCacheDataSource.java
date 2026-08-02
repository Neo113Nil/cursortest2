package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import java.io.File;
import xsna.myc0;
import xsna.ovj;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: AndroidRemoteCacheDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    private final HttpClientProvider httpClientProvider;
    private final ovj ioDispatcher;
    private final SessionRepository sessionRepository;

    public AndroidRemoteCacheDataSource(ovj ovjVar, CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl, HttpClientProvider httpClientProvider, SessionRepository sessionRepository) {
        this.ioDispatcher = ovjVar;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClientProvider = httpClientProvider;
        this.sessionRepository = sessionRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, String str2, Integer num, int i, yzs<? super Long, ? super Long, ? super spj<? super s3q0>, ? extends Object> yzsVar, spj<? super CacheResult> spjVar) {
        return myc0.k(this.ioDispatcher, new AndroidRemoteCacheDataSource$getFileInternal$2(str2, this, file, str, num, i, yzsVar, null), spjVar);
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, int i, yzs<? super Long, ? super Long, ? super spj<? super s3q0>, ? extends Object> yzsVar, spj<? super CacheResult> spjVar) {
        return getFileInternal(file, str, str2, num, i, yzsVar, spjVar);
    }
}
