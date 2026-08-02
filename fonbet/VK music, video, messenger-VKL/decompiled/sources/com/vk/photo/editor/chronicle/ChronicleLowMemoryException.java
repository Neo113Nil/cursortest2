package com.vk.photo.editor.chronicle;

/* compiled from: ChronicleLowMemoryException.kt */
/* loaded from: classes4.dex */
public final class ChronicleLowMemoryException extends Exception {
    public ChronicleLowMemoryException() {
        this(null, 3);
    }

    public ChronicleLowMemoryException(String str, int i) {
        super((i & 1) != 0 ? null : str, null);
    }
}
