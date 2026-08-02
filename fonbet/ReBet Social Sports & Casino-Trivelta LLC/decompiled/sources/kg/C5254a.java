package kg;

import android.support.v4.media.session.b;
import jg.InterfaceC5134b;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import lg.InterfaceC5465a;

/* renamed from: kg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5254a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5254a f54485a = new C5254a();

    public final void a(InterfaceC5465a contractImplResult) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(contractImplResult, "contractImplResult");
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls = Class.forName("com.zoho.salesiq.mobilisten.calls.impl.MobilistenCallsContractImpl");
            if (InterfaceC5134b.class.isAssignableFrom(cls)) {
                Object newInstance = cls.getConstructor(null).newInstance(null);
                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.zoho.salesiq.mobilisten.calls.core.contracts.MobilistenContract");
                b.a(newInstance);
                contractImplResult.onSuccess(null);
            }
            m147constructorimpl = Result.m147constructorimpl(cls);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            contractImplResult.onFailure(m150exceptionOrNullimpl);
        }
    }
}
