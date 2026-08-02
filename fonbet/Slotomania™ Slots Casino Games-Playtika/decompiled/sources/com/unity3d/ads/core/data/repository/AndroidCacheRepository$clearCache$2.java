package com.unity3d.ads.core.data.repository;

import com.unity3d.services.core.network.domain.CleanupDirectory;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidCacheRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class AndroidCacheRepository$clearCache$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidCacheRepository$clearCache$2(AndroidCacheRepository androidCacheRepository, Continuation<? super AndroidCacheRepository$clearCache$2> continuation) {
        super(2, continuation);
        this.this$0 = androidCacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidCacheRepository$clearCache$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AndroidCacheRepository$clearCache$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        File file;
        File file2;
        File[] listFiles;
        SessionRepository sessionRepository2;
        SessionRepository sessionRepository3;
        CleanupDirectory cleanupDirectory;
        File file3;
        SessionRepository sessionRepository4;
        SessionRepository sessionRepository5;
        CleanupDirectory cleanupDirectory2;
        File file4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            sessionRepository = this.this$0.sessionRepository;
            boolean cleanCache = sessionRepository.getNativeConfiguration().getDebugSettings().getCleanCache();
            if (!cleanCache) {
                sessionRepository4 = this.this$0.sessionRepository;
                if (sessionRepository4.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                    sessionRepository5 = this.this$0.sessionRepository;
                    NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = sessionRepository5.getNativeConfiguration().getCachedAssetsConfiguration();
                    cleanupDirectory2 = this.this$0.cleanupDirectory;
                    file4 = this.this$0.cacheDir;
                    cleanupDirectory2.invoke(file4, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
                    if (!cleanCache) {
                        sessionRepository2 = this.this$0.sessionRepository;
                        if (sessionRepository2.getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                            sessionRepository3 = this.this$0.sessionRepository;
                            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = sessionRepository3.getNativeConfiguration().getCachedWebviewFilesConfiguration();
                            cleanupDirectory = this.this$0.cleanupDirectory;
                            file3 = this.this$0.webviewCacheDir;
                            cleanupDirectory.invoke(file3, cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                            return Unit.INSTANCE;
                        }
                    }
                    file2 = this.this$0.webviewCacheDir;
                    listFiles = file2.listFiles();
                    if (listFiles != null) {
                        return null;
                    }
                    for (File file5 : listFiles) {
                        file5.delete();
                    }
                    return Unit.INSTANCE;
                }
            }
            file = this.this$0.cacheDir;
            File[] listFiles2 = file.listFiles();
            if (listFiles2 != null) {
                for (File file6 : listFiles2) {
                    file6.delete();
                }
            }
            if (!cleanCache) {
            }
            file2 = this.this$0.webviewCacheDir;
            listFiles = file2.listFiles();
            if (listFiles != null) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
