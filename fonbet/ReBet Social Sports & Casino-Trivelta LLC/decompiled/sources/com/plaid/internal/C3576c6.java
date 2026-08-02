package com.plaid.internal;

import android.util.Base64;
import com.plaid.internal.C3797y4;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.c6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3576c6 implements InterfaceC3808z6, z8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final T3 f39852a;

    public C3576c6(@NotNull T3 localPaneStateStore) {
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        this.f39852a = localPaneStateStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.plaid.internal.InterfaceC3808z6
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        C3566b6 c3566b6;
        int i10;
        String str;
        if (continuationImpl instanceof C3566b6) {
            c3566b6 = (C3566b6) continuationImpl;
            int i11 = c3566b6.f39842c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3566b6.f39842c = i11 - Integer.MIN_VALUE;
                Object obj = c3566b6.f39840a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3566b6.f39842c;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    T3 t32 = this.f39852a;
                    c3566b6.f39842c = 1;
                    obj = t32.a("pre_completion_result_state", "pre_completion_result", c3566b6);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return null;
                }
                return Channel$Message.SDKResult.parseFrom(Base64.decode(str, 0));
            }
        }
        c3566b6 = new C3566b6(this, continuationImpl);
        Object obj2 = c3566b6.f39840a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3566b6.f39842c;
        if (i10 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    @Override // com.plaid.internal.InterfaceC3808z6
    @Nullable
    public final Object b(@NotNull ContinuationImpl continuationImpl) {
        Object a10 = this.f39852a.a("pre_completion_result_state", continuationImpl);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.z8
    @Nullable
    public final Object a(@NotNull Channel$Message.SDKResult sDKResult, @NotNull C3797y4.b bVar) {
        String encodeToString = Base64.encodeToString(sDKResult.toByteArray(), 0);
        T3 t32 = this.f39852a;
        Intrinsics.checkNotNull(encodeToString);
        Object a10 = t32.a("pre_completion_result_state", "pre_completion_result", encodeToString, bVar);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }
}
