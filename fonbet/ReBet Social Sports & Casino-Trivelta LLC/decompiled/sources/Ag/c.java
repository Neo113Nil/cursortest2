package Ag;

import android.app.Activity;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f457a = new c();

    public static final void a(a onContractInit) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(onContractInit, "onContractInit");
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls = Class.forName("com.zoho.zsiqavlibrary.openApi.ZSIQAVContractImpl");
            if (b.class.isAssignableFrom(cls)) {
                Object newInstance = cls.getConstructor(null).newInstance(null);
                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.zoho.zsiqcore.av.contracts.ZSIQAVContract");
                android.support.v4.media.session.b.a(newInstance);
                onContractInit.onSuccess(null);
            }
            m147constructorimpl = Result.m147constructorimpl(cls);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Result.m150exceptionOrNullimpl(m147constructorimpl);
    }

    public static final boolean b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return Intrinsics.areEqual(activity.getLocalClassName(), "com.zoho.zsiqavlibrary.ui.CallActivity");
    }
}
