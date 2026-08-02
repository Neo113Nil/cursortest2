package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.r4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3734r4 implements y8, InterfaceC3790x6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final T3 f41025a;

    public C3734r4(@NotNull T3 localPaneStateStore) {
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        this.f41025a = localPaneStateStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.plaid.internal.InterfaceC3790x6
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        C3726q4 c3726q4;
        int i10;
        C3734r4 c3734r4;
        if (continuationImpl instanceof C3726q4) {
            c3726q4 = (C3726q4) continuationImpl;
            int i11 = c3726q4.f41002d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3726q4.f41002d = i11 - Integer.MIN_VALUE;
                Object obj = c3726q4.f41000b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3726q4.f41002d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    T3 t32 = this.f41025a;
                    c3726q4.f40999a = this;
                    c3726q4.f41002d = 1;
                    obj = t32.a("oauth_pane_state", "received_redirect_uri", c3726q4);
                    if (obj != coroutine_suspended) {
                        c3734r4 = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = (String) c3726q4.f40999a;
                    ResultKt.throwOnFailure(obj);
                    return str;
                }
                c3734r4 = (C3734r4) c3726q4.f40999a;
                ResultKt.throwOnFailure(obj);
                String str2 = (String) obj;
                T3 t33 = c3734r4.f41025a;
                c3726q4.f40999a = str2;
                c3726q4.f41002d = 2;
                return t33.a("oauth_pane_state", c3726q4) != coroutine_suspended ? coroutine_suspended : str2;
            }
        }
        c3726q4 = new C3726q4(this, continuationImpl);
        Object obj2 = c3726q4.f41000b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3726q4.f41002d;
        if (i10 != 0) {
        }
        String str22 = (String) obj2;
        T3 t332 = c3734r4.f41025a;
        c3726q4.f40999a = str22;
        c3726q4.f41002d = 2;
        if (t332.a("oauth_pane_state", c3726q4) != coroutine_suspended2) {
        }
    }

    @Override // com.plaid.internal.y8
    @Nullable
    public final Object a(@NotNull String str, @NotNull C3724q2 c3724q2) {
        Object a10 = this.f41025a.a("oauth_pane_state", "received_redirect_uri", str, c3724q2);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.y8
    @Nullable
    public final Object a(@NotNull X2 x22) {
        Object a10 = this.f41025a.a("oauth_pane_state", x22);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }
}
