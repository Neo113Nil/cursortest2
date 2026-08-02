package com.unity3d.services.core.domain;

import com.unity3d.ads.core.data.model.exception.InitializationException;
import kotlin.Result;
import xsna.epx;

/* compiled from: ResultExtensions.kt */
/* loaded from: classes14.dex */
public final class ResultExtensionsKt {
    public static final <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        Result.a(obj);
        epx.k();
        throw null;
    }

    public static final <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        Result.a(obj);
        epx.k();
        throw null;
    }

    public static final InitializationException getInitializationExceptionOrNull(Object obj) {
        Throwable a = Result.a(obj);
        if (a instanceof InitializationException) {
            return (InitializationException) a;
        }
        return null;
    }

    public static final InitializationException getInitializationExceptionOrThrow(Object obj) {
        Throwable a = Result.a(obj);
        if (a instanceof InitializationException) {
            return (InitializationException) a;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
