package com.vk.push.common.utils;

import java.io.File;
import kotlin.Result;

/* compiled from: FileExtension.kt */
/* loaded from: classes.dex */
public final class FileExtensionKt {
    public static final boolean existsSafe(File file) {
        Object failure;
        try {
            failure = Boolean.valueOf(file.exists());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }
}
