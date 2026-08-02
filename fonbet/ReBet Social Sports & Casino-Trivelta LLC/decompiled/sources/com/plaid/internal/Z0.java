package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Z0 f39799a = new Z0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull U2 u22, @NotNull ContinuationImpl continuationImpl) {
        X0 x02;
        Object coroutine_suspended;
        int i10;
        Ref.ObjectRef objectRef;
        Function1 function1;
        Ref.ObjectRef objectRef2;
        T t10;
        Ph.L b10;
        Y0 y02;
        Ref.ObjectRef objectRef3;
        if (continuationImpl instanceof X0) {
            x02 = (X0) continuationImpl;
            int i11 = x02.f39761f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x02.f39761f = i11 - Integer.MIN_VALUE;
                Object obj = x02.f39759d;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = x02.f39761f;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    objectRef = new Ref.ObjectRef();
                    x02.f39756a = u22;
                    x02.f39757b = objectRef;
                    x02.f39758c = objectRef;
                    x02.f39761f = 1;
                    Object invoke = u22.invoke(x02);
                    if (invoke != coroutine_suspended) {
                        function1 = u22;
                        objectRef2 = objectRef;
                        t10 = invoke;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef3 = (Ref.ObjectRef) x02.f39756a;
                    ResultKt.throwOnFailure(obj);
                    return objectRef3.element;
                }
                objectRef2 = x02.f39758c;
                Ref.ObjectRef objectRef4 = x02.f39757b;
                function1 = (Function1) x02.f39756a;
                ResultKt.throwOnFailure(obj);
                t10 = obj;
                objectRef = objectRef4;
                objectRef2.element = t10;
                Ref.IntRef intRef = new Ref.IntRef();
                b10 = C1452g0.b();
                y02 = new Y0(intRef, objectRef, function1, null);
                x02.f39756a = objectRef;
                x02.f39757b = null;
                x02.f39758c = null;
                x02.f39761f = 2;
                if (AbstractC1455i.g(b10, y02, x02) != coroutine_suspended) {
                    objectRef3 = objectRef;
                    return objectRef3.element;
                }
                return coroutine_suspended;
            }
        }
        x02 = new X0(this, continuationImpl);
        Object obj2 = x02.f39759d;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = x02.f39761f;
        if (i10 != 0) {
        }
        objectRef2.element = t10;
        Ref.IntRef intRef2 = new Ref.IntRef();
        b10 = C1452g0.b();
        y02 = new Y0(intRef2, objectRef, function1, null);
        x02.f39756a = objectRef;
        x02.f39757b = null;
        x02.f39758c = null;
        x02.f39761f = 2;
        if (AbstractC1455i.g(b10, y02, x02) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
