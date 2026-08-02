package com.vk.geo.impl.util;

/* compiled from: LiteViewBinding.kt */
/* loaded from: classes2.dex */
public final class BinderNotFoundValueException extends RuntimeException {
    private final String name;

    public BinderNotFoundValueException(String str, Exception exc) {
        super("could not extract value for name ".concat(str), exc);
        this.name = str;
    }
}
