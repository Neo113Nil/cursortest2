package ru.sberdevices.salutevision.multiscanner;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.multiscanner.AsyncScanner;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0082 J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0019\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0082 ¨\u0006\r"}, d2 = {"Lru/sberdevices/salutevision/multiscanner/AsyncScannerWrapper;", "Lru/sberdevices/salutevision/multiscanner/ScannerWrapper;", "delegate", "", "(J)V", "detachObserver", "", "detachObserverNative", "handle", "registerObserver", "observer", "Lru/sberdevices/salutevision/multiscanner/AsyncScanner$AsyncScannerObserver;", "registerObserverNative", "salutevision-multiscanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AsyncScannerWrapper extends ScannerWrapper {
    public AsyncScannerWrapper(long j11) {
        super(j11);
    }

    private final native void detachObserverNative(long handle);

    private final native void registerObserverNative(long handle, AsyncScanner.AsyncScannerObserver observer);

    public final void detachObserver() {
        detachObserverNative(getDelegate());
    }

    public final void registerObserver(@NotNull AsyncScanner.AsyncScannerObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        registerObserverNative(getDelegate(), observer);
    }
}
