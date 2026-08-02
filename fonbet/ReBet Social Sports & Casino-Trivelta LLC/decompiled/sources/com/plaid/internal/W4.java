package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nPlaidClientSideOnlyConfigurationStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaidClientSideOnlyConfigurationStore.kt\ncom/plaid/internal/globalvalues/PlaidClientSideOnlyConfigurationStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* loaded from: classes3.dex */
public final class W4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final H5 f39740a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public S4 f39741b;

    public W4(@NotNull H5 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f39740a = storage;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        T4 t42;
        int i10;
        W4 w42;
        if (continuationImpl instanceof T4) {
            t42 = (T4) continuationImpl;
            int i11 = t42.f39641d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t42.f39641d = i11 - Integer.MIN_VALUE;
                Object obj = t42.f39639b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = t42.f39641d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    S4 s42 = this.f39741b;
                    if (s42 != null) {
                        return s42;
                    }
                    t42.f39638a = this;
                    t42.f39641d = 1;
                    if ((s42 != null ? Boxing.boxBoolean(s42.f39623a) : null) != null) {
                        S4 s43 = this.f39741b;
                        obj = Boxing.boxBoolean(s43 != null && s43.f39623a);
                    } else {
                        obj = AbstractC1455i.g(C1452g0.b(), new U4(this, null), t42);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    w42 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w42 = t42.f39638a;
                    ResultKt.throwOnFailure(obj);
                }
                S4 s44 = new S4(((Boolean) obj).booleanValue());
                w42.f39741b = s44;
                return s44;
            }
        }
        t42 = new T4(this, continuationImpl);
        Object obj2 = t42.f39639b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = t42.f39641d;
        if (i10 != 0) {
        }
        S4 s442 = new S4(((Boolean) obj2).booleanValue());
        w42.f39741b = s442;
        return s442;
    }
}
