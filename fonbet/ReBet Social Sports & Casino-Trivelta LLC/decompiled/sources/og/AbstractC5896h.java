package og;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* renamed from: og.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5896h {
    public static final boolean a(com.google.gson.h hVar) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(Boolean.valueOf(hVar.a()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = null;
        }
        Boolean bool = (Boolean) m147constructorimpl;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final int b(com.google.gson.h hVar) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(Integer.valueOf(hVar.b()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = null;
        }
        Integer num = (Integer) m147constructorimpl;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static final com.google.gson.e c(com.google.gson.h hVar) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(hVar.c());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = null;
        }
        return (com.google.gson.e) m147constructorimpl;
    }

    public static final com.google.gson.k d(com.google.gson.h hVar) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(hVar.e());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = null;
        }
        return (com.google.gson.k) m147constructorimpl;
    }

    public static final long e(com.google.gson.h hVar) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(Long.valueOf(hVar != null ? hVar.g() : -1L));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = null;
        }
        Long l10 = (Long) m147constructorimpl;
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }

    public static final String f(com.google.gson.h hVar) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(hVar != null ? hVar.h() : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        String str = (String) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
        return str == null ? String.valueOf(hVar) : str;
    }

    public static final RequestBody g(com.google.gson.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String hVar2 = hVar.toString();
        Intrinsics.checkNotNullExpressionValue(hVar2, "toString(...)");
        return companion.create(hVar2, MediaType.INSTANCE.parse("application/json; charset=utf-8"));
    }
}
