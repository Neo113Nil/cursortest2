package com.vk.photo.editor.domain;

/* compiled from: LowMemoryException.kt */
/* loaded from: classes4.dex */
public final class LowMemoryException extends Exception {
    public LowMemoryException() {
        this(null, 3);
    }

    public LowMemoryException(String str, int i) {
        super((i & 1) != 0 ? null : str, null);
    }
}
