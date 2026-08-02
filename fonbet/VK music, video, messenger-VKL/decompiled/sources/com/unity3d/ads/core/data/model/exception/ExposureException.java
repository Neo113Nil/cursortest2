package com.unity3d.ads.core.data.model.exception;

/* compiled from: ExposureException.kt */
/* loaded from: classes14.dex */
public final class ExposureException extends Exception {
    private final Object[] parameters;

    public ExposureException(String str, Object[] objArr) {
        super(str);
        this.parameters = objArr;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }
}
