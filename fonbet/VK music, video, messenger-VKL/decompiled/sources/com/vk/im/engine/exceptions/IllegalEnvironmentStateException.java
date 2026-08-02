package com.vk.im.engine.exceptions;

import com.vk.im.engine.ImEnvironmentRunner;
import java.util.Set;

/* compiled from: IllegalEnvironmentStateException.kt */
/* loaded from: classes2.dex */
public final class IllegalEnvironmentStateException extends IllegalStateException {
    public static final /* synthetic */ int b = 0;

    /* compiled from: IllegalEnvironmentStateException.kt */
    public static final class a {
        public static IllegalEnvironmentStateException a() {
            return new IllegalEnvironmentStateException("Environment is in shutdown state");
        }
    }

    public IllegalEnvironmentStateException(ImEnvironmentRunner.State state, Set<? extends ImEnvironmentRunner.State> set) {
        super("Illegal Environment state. Expecting: " + set + ". Current: " + state);
    }
}
