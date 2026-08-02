package com.plaid.internal;

import Ph.AbstractC1459k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plaid/internal/k1;", "Lcom/plaid/internal/p8;", "Lcom/plaid/internal/l1;", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.plaid.internal.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3669k1 extends p8<C3678l1> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f40718e = 0;

    @DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthFragment$onCreate$1", f = "HeadlessOAuthFragment.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.k1$a */
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f40719a;

        @DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthFragment$onCreate$1$1", f = "HeadlessOAuthFragment.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.plaid.internal.k1$a$a, reason: collision with other inner class name */
        public static final class C0586a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f40721a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C3669k1 f40722b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0586a(C3669k1 c3669k1, Continuation<? super C0586a> continuation) {
                super(2, continuation);
                this.f40722b = c3669k1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0586a(this.f40722b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
                return new C0586a(this.f40722b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f40721a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C3669k1 c3669k1 = this.f40722b;
                    int i11 = C3669k1.f40718e;
                    Object obj2 = c3669k1.f40978b;
                    if (obj2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        obj2 = null;
                    }
                    this.f40721a = 1;
                    if (((C3678l1) obj2).a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return C3669k1.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return C3669k1.this.new a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f40719a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C3669k1 c3669k1 = C3669k1.this;
                AbstractC2185j.b bVar = AbstractC2185j.b.f20393d;
                C0586a c0586a = new C0586a(c3669k1, null);
                this.f40719a = 1;
                if (RepeatOnLifecycleKt.b(c3669k1, bVar, c0586a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.plaid.internal.p8
    public final C3678l1 a(r8 paneId, J4 component) {
        Intrinsics.checkNotNullParameter(paneId, "paneId");
        Intrinsics.checkNotNullParameter(component, "component");
        return new C3678l1(paneId, component);
    }

    @Override // com.plaid.internal.p8, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new a(null), 3, null);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return null;
    }
}
