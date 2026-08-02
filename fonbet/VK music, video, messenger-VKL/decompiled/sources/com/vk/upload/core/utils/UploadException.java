package com.vk.upload.core.utils;

import org.json.JSONObject;

/* compiled from: UploadExceptions.kt */
/* loaded from: classes6.dex */
public class UploadException extends Exception {
    private boolean isLogError;

    public UploadException() {
        this.isLogError = true;
    }

    public final boolean d() {
        return this.isLogError;
    }

    public UploadException(String str) {
        super(str);
        this.isLogError = true;
    }

    public UploadException(String str, Exception exc) {
        super(str, exc);
        this.isLogError = true;
    }

    public UploadException(String str, String str2) {
        super(str);
        this.isLogError = true;
        try {
            this.isLogError = new JSONObject(str2).optBoolean("error_is_logged", true);
        } catch (Exception unused) {
        }
    }

    public UploadException(String str, String str2, Exception exc) {
        super(str, exc);
        this.isLogError = true;
        try {
            this.isLogError = new JSONObject(str2).optBoolean("error_is_logged", true);
        } catch (Exception unused) {
        }
    }
}
