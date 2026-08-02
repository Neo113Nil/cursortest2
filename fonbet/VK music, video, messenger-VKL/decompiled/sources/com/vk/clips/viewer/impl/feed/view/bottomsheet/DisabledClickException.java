package com.vk.clips.viewer.impl.feed.view.bottomsheet;

/* compiled from: DisabledClickException.kt */
/* loaded from: classes17.dex */
public final class DisabledClickException extends Throwable {
    public static final DisabledClickException b = new DisabledClickException();

    private DisabledClickException() {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof DisabledClickException);
    }

    public final int hashCode() {
        return -265949217;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "DisabledClickException";
    }
}
