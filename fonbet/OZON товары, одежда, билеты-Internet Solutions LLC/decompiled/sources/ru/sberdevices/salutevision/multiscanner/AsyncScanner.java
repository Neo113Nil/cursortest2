package ru.sberdevices.salutevision.multiscanner;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lru/sberdevices/salutevision/multiscanner/AsyncScanner;", "Lru/sberdevices/salutevision/multiscanner/Scanner;", "async", "Lru/sberdevices/salutevision/multiscanner/AsyncScannerWrapper;", "(Lru/sberdevices/salutevision/multiscanner/AsyncScannerWrapper;)V", "getAsync", "()Lru/sberdevices/salutevision/multiscanner/AsyncScannerWrapper;", "detachObserver", "", "registerObserver", "observer", "Lru/sberdevices/salutevision/multiscanner/AsyncScanner$AsyncScannerObserver;", "AsyncScannerObserver", "salutevision-multiscanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AsyncScanner extends Scanner {

    @NotNull
    private final AsyncScannerWrapper async;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lru/sberdevices/salutevision/multiscanner/AsyncScanner$AsyncScannerObserver;", "", "handleResult", "", "id", "", "recognition", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition;", "salutevision-multiscanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface AsyncScannerObserver {
        void handleResult(long id2, SaluteVisionRecognition recognition);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncScanner(@NotNull AsyncScannerWrapper async) {
        super(async);
        Intrinsics.checkNotNullParameter(async, "async");
        this.async = async;
    }

    public final void detachObserver() {
        this.async.detachObserver();
    }

    @NotNull
    public final AsyncScannerWrapper getAsync() {
        return this.async;
    }

    public final void registerObserver(@NotNull AsyncScannerObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.async.registerObserver(observer);
    }
}
