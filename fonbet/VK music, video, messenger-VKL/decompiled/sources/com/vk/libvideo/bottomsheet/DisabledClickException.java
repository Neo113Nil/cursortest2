package com.vk.libvideo.bottomsheet;

/* compiled from: DisabledClickException.kt */
/* loaded from: classes2.dex */
public final class DisabledClickException extends Throwable {
    public static final /* synthetic */ int b = 0;

    static {
        new DisabledClickException();
    }

    private DisabledClickException() {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof DisabledClickException);
    }

    public final int hashCode() {
        return 2118737065;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "DisabledClickException";
    }
}
