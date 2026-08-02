package com.plaid.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.plaid.internal.u8;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class p8<VM extends u8> extends Fragment {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f40976d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Class<VM> f40977a;

    /* renamed from: b, reason: collision with root package name */
    public VM f40978b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f40979c;

    public static final class a extends Lambda implements Function1<J4, u8> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p8<VM> f40980a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p8<VM> p8Var) {
            super(1);
            this.f40980a = p8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final u8 invoke(J4 j42) {
            J4 component = j42;
            Intrinsics.checkNotNullParameter(component, "component");
            p8<VM> p8Var = this.f40980a;
            r8 r8Var = (r8) p8Var.f40979c.getValue();
            Intrinsics.checkNotNullExpressionValue(r8Var, "access$getModelId(...)");
            return p8Var.a(r8Var, component);
        }
    }

    public p8() {
        Intrinsics.checkNotNullParameter(C3678l1.class, "viewModelClass");
        this.f40977a = C3678l1.class;
        this.f40979c = LazyKt.lazy(new o8(this));
    }

    @NotNull
    public abstract C3678l1 a(@NotNull r8 r8Var, @NotNull J4 j42);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater.Factory activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.plaid.internal.workflow.panes.WorkflowViewModelFactoryProvider");
        VM vm = (VM) new androidx.lifecycle.U(this, ((w8) activity).a(new a(this))).a(this.f40977a);
        Intrinsics.checkNotNullParameter(vm, "<set-?>");
        this.f40978b = vm;
    }
}
