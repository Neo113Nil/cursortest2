package androidx.compose.foundation;

import androidx.compose.foundation.internal.PlatformOptimizedCancellationException;

/* compiled from: MutatorMutex.kt */
/* loaded from: classes11.dex */
public final class MutationInterruptedException extends PlatformOptimizedCancellationException {
    public MutationInterruptedException() {
        super("Mutation interrupted");
    }
}
