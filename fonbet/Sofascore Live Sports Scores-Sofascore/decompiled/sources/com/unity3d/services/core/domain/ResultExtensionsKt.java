package com.unity3d.services.core.domain;

import com.unity3d.ads.core.data.model.exception.InitializationException;
import defpackage.a70;
import defpackage.w2g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0002\u0018\u0001*\u00060\u0000j\u0002`\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a(\u0010\u0006\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0002\u0018\u0001*\u00060\u0000j\u0002`\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0017\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\n\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "E", "Lw2g;", "getCustomExceptionOrNull", "(Ljava/lang/Object;)Ljava/lang/Exception;", "getCustomExceptionOrThrow", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "getInitializationExceptionOrNull", "(Ljava/lang/Object;)Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "getInitializationExceptionOrThrow", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResultExtensionsKt {
    public static final <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        w2g.a(obj);
        Intrinsics.h();
        throw null;
    }

    public static final <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        w2g.a(obj);
        Intrinsics.h();
        throw null;
    }

    @Nullable
    public static final InitializationException getInitializationExceptionOrNull(@NotNull Object obj) {
        Throwable a = w2g.a(obj);
        if (a instanceof InitializationException) {
            return (InitializationException) a;
        }
        return null;
    }

    @NotNull
    public static final InitializationException getInitializationExceptionOrThrow(@NotNull Object obj) {
        Throwable a = w2g.a(obj);
        if (a instanceof InitializationException) {
            return (InitializationException) a;
        }
        a70.p("Wrong Exception type found");
        return null;
    }
}
