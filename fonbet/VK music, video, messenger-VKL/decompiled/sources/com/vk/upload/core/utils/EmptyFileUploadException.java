package com.vk.upload.core.utils;

/* compiled from: UploadExceptions.kt */
/* loaded from: classes6.dex */
public final class EmptyFileUploadException extends UploadException {
    public EmptyFileUploadException() {
        super("can't upload, no file found!");
    }
}
