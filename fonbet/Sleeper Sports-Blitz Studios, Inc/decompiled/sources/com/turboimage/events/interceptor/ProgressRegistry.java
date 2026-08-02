package com.turboimage.events.interceptor;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgressRegistry.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J&\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/turboimage/events/interceptor/ProgressRegistry;", "", "<init>", "()V", "progressListeners", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/turboimage/events/interceptor/ProgressListener;", "register", "", "progressId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregister", "notify", "bytesRead", "", "contentLength", "done", "", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProgressRegistry {
    public static final ProgressRegistry INSTANCE = new ProgressRegistry();
    private static final ConcurrentHashMap<String, ProgressListener> progressListeners = new ConcurrentHashMap<>();

    private ProgressRegistry() {
    }

    public final void register(String progressId, ProgressListener listener) {
        Intrinsics.checkNotNullParameter(progressId, "progressId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        progressListeners.put(progressId, listener);
    }

    public final void unregister(String progressId) {
        Intrinsics.checkNotNullParameter(progressId, "progressId");
        progressListeners.remove(progressId);
    }

    public final void notify(String progressId, long bytesRead, long contentLength, boolean done) {
        Intrinsics.checkNotNullParameter(progressId, "progressId");
        ProgressListener progressListener = progressListeners.get(progressId);
        if (progressListener != null) {
            progressListener.update(bytesRead, contentLength, done);
        }
    }
}
