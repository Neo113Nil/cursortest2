package Sh;

import a.C1902a;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: classes5.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement f10764a = new C1902a().a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f10765b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f10766c;

    static {
        Object m147constructorimpl;
        Object m147constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m150exceptionOrNullimpl(m147constructorimpl) != null) {
            m147constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f10765b = (String) m147constructorimpl;
        try {
            m147constructorimpl2 = Result.m147constructorimpl(F.class.getCanonicalName());
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
            m147constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f10766c = (String) m147constructorimpl2;
    }

    public static final Throwable a(Throwable th2) {
        return th2;
    }
}
