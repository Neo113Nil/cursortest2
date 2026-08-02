package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class O7 implements C8, C6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final T3 f39490a;

    public O7(@NotNull T3 localPaneStateStore) {
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        this.f39490a = localPaneStateStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.plaid.internal.C6
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        N7 n72;
        int i10;
        O7 o72;
        if (continuationImpl instanceof N7) {
            n72 = (N7) continuationImpl;
            int i11 = n72.f39468d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                n72.f39468d = i11 - Integer.MIN_VALUE;
                Object obj = n72.f39466b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = n72.f39468d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    T3 t32 = this.f39490a;
                    n72.f39465a = this;
                    n72.f39468d = 1;
                    obj = t32.a("webview_fallback_state", "webview_fallback_initial_uri", n72);
                    if (obj != coroutine_suspended) {
                        o72 = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = (String) n72.f39465a;
                    ResultKt.throwOnFailure(obj);
                    return str;
                }
                o72 = (O7) n72.f39465a;
                ResultKt.throwOnFailure(obj);
                String str2 = (String) obj;
                T3 t33 = o72.f39490a;
                n72.f39465a = str2;
                n72.f39468d = 2;
                return t33.a("webview_fallback_state", n72) != coroutine_suspended ? coroutine_suspended : str2;
            }
        }
        n72 = new N7(this, continuationImpl);
        Object obj2 = n72.f39466b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = n72.f39468d;
        if (i10 != 0) {
        }
        String str22 = (String) obj2;
        T3 t332 = o72.f39490a;
        n72.f39465a = str22;
        n72.f39468d = 2;
        if (t332.a("webview_fallback_state", n72) != coroutine_suspended2) {
        }
    }

    @Override // com.plaid.internal.C8
    @Nullable
    public final Object a(@NotNull String str, @NotNull C3741s2 c3741s2) {
        Object a10 = this.f39490a.a("webview_fallback_state", "webview_fallback_initial_uri", str, c3741s2);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }
}
