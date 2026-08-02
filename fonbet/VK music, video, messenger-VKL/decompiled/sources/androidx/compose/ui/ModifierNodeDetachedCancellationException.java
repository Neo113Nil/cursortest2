package androidx.compose.ui;

import androidx.compose.ui.internal.PlatformOptimizedCancellationException;

/* compiled from: Modifier.kt */
/* loaded from: classes11.dex */
public final class ModifierNodeDetachedCancellationException extends PlatformOptimizedCancellationException {
    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }
}
