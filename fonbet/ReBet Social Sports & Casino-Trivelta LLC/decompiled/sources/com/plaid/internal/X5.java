package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.InterfaceC5322g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PlaidWebview.kt\ncom/plaid/core/webview/PlaidWebview$submit$1\n*L\n1#1,222:1\n21#2:223\n22#2:225\n156#3:224\n*E\n"})
/* loaded from: classes3.dex */
public final class X5<T> implements InterfaceC5322g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5322g f39770a;

    @DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$submit$1$invokeSuspend$$inlined$filter$1$2", f = "PlaidWebview.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f39771a;

        /* renamed from: b, reason: collision with root package name */
        public int f39772b;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f39771a = obj;
            this.f39772b |= Integer.MIN_VALUE;
            return X5.this.emit(null, this);
        }
    }

    public X5(InterfaceC5322g interfaceC5322g) {
        this.f39770a = interfaceC5322g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.InterfaceC5322g
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, @NotNull Continuation continuation) {
        a aVar;
        int i10;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f39772b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f39772b = i11 - Integer.MIN_VALUE;
                Object obj2 = aVar.f39771a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar.f39772b;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    InterfaceC5322g interfaceC5322g = this.f39770a;
                    if (((Boolean) obj).booleanValue()) {
                        aVar.f39772b = 1;
                        if (interfaceC5322g.emit(obj, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        aVar = new a(continuation);
        Object obj22 = aVar.f39771a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f39772b;
        if (i10 != 0) {
        }
        return Unit.INSTANCE;
    }
}
