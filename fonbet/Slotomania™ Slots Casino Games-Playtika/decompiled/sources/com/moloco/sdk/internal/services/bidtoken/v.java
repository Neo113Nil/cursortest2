package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.services.J;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface v {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final v a(com.moloco.sdk.internal.bidtoken.b bidTokenParser, J timeProviderService) {
            Intrinsics.checkNotNullParameter(bidTokenParser, "bidTokenParser");
            Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
            return new w(bidTokenParser, timeProviderService);
        }
    }

    k a();

    Object a(k kVar, Continuation<? super Unit> continuation);

    Object a(Continuation<? super B> continuation);

    void b();
}
