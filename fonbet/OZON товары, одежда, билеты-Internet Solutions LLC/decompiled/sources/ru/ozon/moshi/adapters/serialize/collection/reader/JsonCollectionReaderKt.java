package ru.ozon.moshi.adapters.serialize.collection.reader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"JsonCollectionReader", "Lru/ozon/moshi/adapters/serialize/collection/reader/JsonCollectionReader;", "executorService", "Ljava/util/concurrent/ExecutorService;", "moshi-adapters_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JsonCollectionReaderKt {
    @NotNull
    public static final JsonCollectionReader JsonCollectionReader() {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        Intrinsics.checkNotNullExpressionValue(commonPool, "commonPool(...)");
        return ExecutorCollectionJsonReader.m1657boximpl(ExecutorCollectionJsonReader.m1658constructorimpl(commonPool));
    }

    @NotNull
    public static final JsonCollectionReader JsonCollectionReader(@NotNull ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        return ExecutorCollectionJsonReader.m1657boximpl(ExecutorCollectionJsonReader.m1658constructorimpl(executorService));
    }
}
