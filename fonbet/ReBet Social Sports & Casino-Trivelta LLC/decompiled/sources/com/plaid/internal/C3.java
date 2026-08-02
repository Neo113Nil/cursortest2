package com.plaid.internal;

import Ph.AbstractC1459k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.plaid.link.R;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/plaid/internal/C3;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class C3 extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public D3 f39183a;

    @DebugMetadata(c = "com.plaid.internal.workflow.panes.loading.LoadingFragment$onCreateView$1", f = "LoadingFragment.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f39184a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C3718p5 f39186c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3718p5 c3718p5, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f39186c = c3718p5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return C3.this.new a(this.f39186c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return C3.this.new a(this.f39186c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39184a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                D3 d32 = C3.this.f39183a;
                W4 w42 = null;
                if (d32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    d32 = null;
                }
                this.f39184a = 1;
                W4 w43 = d32.f39204a;
                if (w43 != null) {
                    w42 = w43;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("clientSideOnlyConfigurationStore");
                }
                obj = w42.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            S4 s42 = (S4) obj;
            if (s42 != null) {
                this.f39186c.f40962a.setVisibility(s42.f39623a ? 4 : 0);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater.Factory activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.plaid.internal.workflow.panes.WorkflowViewModelFactoryProvider");
        this.f39183a = (D3) new androidx.lifecycle.U(this, ((w8) activity).b()).a(D3.class);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_loading_fragment, viewGroup, false);
        if (inflate == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        C3718p5 c3718p5 = new C3718p5(frameLayout);
        Intrinsics.checkNotNullExpressionValue(c3718p5, "inflate(...)");
        D3 d32 = this.f39183a;
        if (d32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            d32 = null;
        }
        AbstractC1459k.d(androidx.lifecycle.S.a(d32), null, null, new a(c3718p5, null), 3, null);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        return frameLayout;
    }
}
