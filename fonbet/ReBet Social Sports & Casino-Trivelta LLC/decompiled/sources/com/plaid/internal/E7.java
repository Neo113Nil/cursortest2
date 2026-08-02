package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class E7 implements A6, A8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final T3 f39233a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3561b1 f39234b;

    public E7(@NotNull T3 localPaneStateStore, @NotNull C3561b1 featureManager) {
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        this.f39233a = localPaneStateStore;
        this.f39234b = featureManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.plaid.internal.A6
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        D7 d72;
        int i10;
        if (continuationImpl instanceof D7) {
            d72 = (D7) continuationImpl;
            int i11 = d72.f39211c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d72.f39211c = i11 - Integer.MIN_VALUE;
                Object obj = d72.f39209a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = d72.f39211c;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f39234b.getClass();
                    EnumC3571c1 enumC3571c1 = EnumC3571c1.BACKEND_DETERMINES;
                    if (enumC3571c1.isSet()) {
                        this.f39234b.getClass();
                        return Boxing.boxBoolean(enumC3571c1.toBoolean());
                    }
                    T3 t32 = this.f39233a;
                    d72.f39211c = 1;
                    obj = t32.a("webview_background_transparency_state", "webview_background_is_transparent", d72);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) obj;
                return str != null ? Boxing.boxBoolean(false) : Boxing.boxBoolean(Boolean.parseBoolean(str));
            }
        }
        d72 = new D7(this, continuationImpl);
        Object obj2 = d72.f39209a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = d72.f39211c;
        if (i10 != 0) {
        }
        String str2 = (String) obj2;
        if (str2 != null) {
        }
    }

    @Override // com.plaid.internal.A8
    @Nullable
    public final Object a(boolean z10, @NotNull C3741s2 c3741s2) {
        Object a10 = this.f39233a.a("webview_background_transparency_state", "webview_background_is_transparent", String.valueOf(z10), c3741s2);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.A6
    @Nullable
    public final Object a(@NotNull S7 s72) {
        Object a10 = this.f39233a.a("webview_background_transparency_state", s72);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }
}
