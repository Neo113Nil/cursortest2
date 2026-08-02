package com.vk.im.engine.exceptions.folder;

/* compiled from: FoldersException.kt */
/* loaded from: classes2.dex */
public class FoldersException extends Exception {
    private final String message;

    public FoldersException() {
        this(0);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public FoldersException(int i) {
        super((String) null);
        this.message = null;
    }
}
