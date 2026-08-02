package com.plaid.internal;

import com.plaid.internal.A;
import ei.AbstractC4212b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class C implements InterfaceC3781w6, x8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final T3 f39180a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbstractC4212b f39181b;

    public C(@NotNull T3 localPaneStateStore, @NotNull AbstractC4212b json) {
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f39180a = localPaneStateStore;
        this.f39181b = json;
    }

    @Override // com.plaid.internal.x8
    @Nullable
    public final Object a(@NotNull A a10, @NotNull C3741s2 c3741s2) {
        Object a11 = this.f39180a.a("channel_state", "Channel_info", this.f39181b.b(A.a.f39140a, a10), c3741s2);
        return a11 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a11 : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.plaid.internal.InterfaceC3781w6
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull ContinuationImpl continuationImpl) {
        B b10;
        int i10;
        C c10;
        String str;
        if (continuationImpl instanceof B) {
            b10 = (B) continuationImpl;
            int i11 = b10.f39166d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b10.f39166d = i11 - Integer.MIN_VALUE;
                Object obj = b10.f39164b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = b10.f39166d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    T3 t32 = this.f39180a;
                    b10.f39163a = this;
                    b10.f39166d = 1;
                    obj = t32.a("channel_state", "Channel_info", b10);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c10 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10 = b10.f39163a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str == null) {
                    return (A) c10.f39181b.d(A.a.f39140a, str);
                }
                return null;
            }
        }
        b10 = new B(this, continuationImpl);
        Object obj2 = b10.f39164b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = b10.f39166d;
        if (i10 != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }

    @Override // com.plaid.internal.InterfaceC3781w6
    @Nullable
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        Object a10 = this.f39180a.a("channel_state", continuationImpl);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.x8
    @Nullable
    public final Object a(@NotNull C3741s2 c3741s2) {
        Object a10 = a((ContinuationImpl) c3741s2);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }
}
