package io.ktor.client.plugins.cache.storage;

import com.appsflyer.AppsFlyerProperties;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13}, l = {186, 187, TsExtractor.TS_PACKET_SIZE, PsExtractor.PRIVATE_STREAM_1, 191, 193, 194, 196, 197, 198, 199, 201, 202, 204, 205}, m = "writeCache", n = {AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", "headers", AppsFlyerProperties.CHANNEL, "cache", "value", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache", "value", AppsFlyerProperties.CHANNEL, "cache", AppsFlyerProperties.CHANNEL, "cache"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes2.dex */
final class FileCacheStorage$writeCache$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$writeCache$1(FileCacheStorage fileCacheStorage, Continuation<? super FileCacheStorage$writeCache$1> continuation) {
        super(continuation);
        this.this$0 = fileCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object writeCache;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        writeCache = this.this$0.writeCache(null, null, this);
        return writeCache;
    }
}
