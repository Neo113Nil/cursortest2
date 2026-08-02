package com.vk.core.fragments.exceptions;

/* compiled from: FragmentNavigationException.kt */
/* loaded from: classes17.dex */
public final class FragmentNavigationException extends IllegalStateException {
    public FragmentNavigationException() {
        super("Calling from non UI-thread");
    }
}
