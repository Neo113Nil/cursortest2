package ru.ozon.android.messenger.framework.presentation.common.screen;

import X4.a;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import fd.InterfaceC6511n;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.messenger.R$style;

/* loaded from: classes10.dex */
public abstract class h<B extends X4.a, P extends Parcelable> extends com.google.android.material.bottomsheet.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, B> f91116a;

    /* renamed from: b, reason: collision with root package name */
    private B f91117b;

    /* renamed from: c, reason: collision with root package name */
    private String f91118c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f91119d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f91120e;

    /* renamed from: f, reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f91121f;

    private static final class a extends com.google.android.material.bottomsheet.a {
        @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
        protected final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.design_bottom_sheet);
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = -1;
                BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkNotNullExpressionValue(from, "from(...)");
                from.setSkipCollapsed(true);
                frameLayout.setLayoutParams(layoutParams);
            }
        }
    }

    static final class b extends AbstractC7737t implements Function0<P> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h<B, P> f91122b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h<B, P> hVar) {
            super(0);
            this.f91122b = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h.t(this.f91122b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull InterfaceC6511n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends B> inflate) {
        Intrinsics.checkNotNullParameter(inflate, "inflate");
        this.f91116a = inflate;
        this.f91120e = ru.ozon.android.messenger.utils.f.b(new b(this));
    }

    public static final Parcelable t(h hVar) {
        return hVar.requireArguments().getParcelable(hVar.f91118c);
    }

    public static void w(ru.ozon.android.messenger.blocks.rateoperator.b bVar, ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.a aVar) {
        Intrinsics.checkNotNullParameter("RateOperator", "constArg");
        ((h) aVar).f91118c = "RateOperator";
        ((h) aVar).f91119d = 3;
        ru.ozon.android.messenger.utils.g.g(aVar, new Pair("RateOperator", bVar));
    }

    @NotNull
    protected final B getBinding() {
        B b11 = this.f91117b;
        Intrinsics.f(b11);
        return b11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ViewParent parent = requireView().getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
        BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from((FrameLayout) parent);
        this.f91121f = from;
        if (from != null) {
            Integer num = this.f91119d;
            from.setState(num != null ? num.intValue() : 3);
        }
        ?? r22 = this.f91120e;
        if (((Parcelable) r22.getValue()) != null) {
            u((Parcelable) r22.getValue());
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R$style.m_OzonBottomSheetDialog_AdjustResize);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle bundle) {
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        int theme = getTheme();
        Intrinsics.checkNotNullParameter(context, "context");
        return new a(context, theme);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        B invoke = this.f91116a.invoke(inflater, viewGroup, Boolean.FALSE);
        this.f91117b = invoke;
        View constraintLayout = invoke.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.f91117b = null;
    }

    protected abstract void u(P p11);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f91121f;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(5);
        }
    }

    protected final void x(@NotNull Function1<? super B, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        B b11 = this.f91117b;
        Intrinsics.f(b11);
        block.invoke(b11);
    }
}
