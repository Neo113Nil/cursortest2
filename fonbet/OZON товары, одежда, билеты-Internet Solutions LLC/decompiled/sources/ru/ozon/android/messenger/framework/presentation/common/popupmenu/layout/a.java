package ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout;

import Sc.InterfaceC4008j;
import Sc.k;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
public final class a extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private static final int f90921e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f90922f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f90923g;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f90924a;

    /* renamed from: b, reason: collision with root package name */
    private AnimatorSet f90925b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f90926c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f90927d;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.a$a, reason: collision with other inner class name */
    static final class C1692a extends AbstractC7737t implements Function0<LinearLayout> {
        C1692a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            LinearLayout linearLayout = new LinearLayout(a.this.f90924a);
            linearLayout.setId(R$id.m_popup_menu_actions_view);
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(4);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            linearLayout.setBackgroundResource(R$drawable.m_bg_popup_menu_rounded);
            s.b(linearLayout, androidx.core.content.a.getColor(linearLayout.getContext(), R$color.layer_floor_2));
            return linearLayout;
        }
    }

    static final class b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.presentation.common.screenshot.a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.framework.presentation.common.screenshot.a invoke() {
            Context context = a.this.f90924a;
            Intrinsics.checkNotNullParameter(context, "context");
            ru.ozon.android.messenger.framework.presentation.common.screenshot.a aVar = new ru.ozon.android.messenger.framework.presentation.common.screenshot.a(context, null, 0);
            aVar.setId(R$id.m_popup_menu_selection_view);
            aVar.setClipToOutline(true);
            aVar.setVisibility(4);
            return aVar;
        }
    }

    static final class c extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f90930b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11) {
            super(1);
            this.f90930b = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
            Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
            updateMarginLP.setMarginEnd(this.f90930b);
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f90931b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11) {
            super(1);
            this.f90931b = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
            Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
            updateMarginLP.setMarginStart(this.f90931b);
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f90932b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f90933c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, int i12) {
            super(1);
            this.f90932b = i11;
            this.f90933c = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
            Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
            updateMarginLP.setMarginStart(this.f90932b);
            updateMarginLP.topMargin = this.f90933c;
            return Unit.f71690a;
        }
    }

    static {
        int i11;
        int i12;
        int i13 = ru.ozon.android.messenger.blocks.chat.a.f84478c;
        i11 = ru.ozon.android.messenger.utils.e.f91917n;
        f90921e = i11;
        i12 = ru.ozon.android.messenger.utils.e.f91908e;
        f90922f = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f90924a = context;
        this.f90926c = k.b(new b());
        InterfaceC4008j b11 = k.b(new C1692a());
        this.f90927d = b11;
        setVisibility(4);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(androidx.core.content.a.getColor(context, R$color.layer_overlay_dimming));
        addView(e());
        addView((LinearLayout) b11.getValue());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(d((LinearLayout) b11.getValue()));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(d(this), d(e()), animatorSet);
        animatorSet2.start();
        this.f90925b = animatorSet2;
    }

    private static ObjectAnimator d(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        Intrinsics.f(ofFloat);
        ofFloat.addListener(new ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.b(view));
        ofFloat.setDuration(200L);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    private final ru.ozon.android.messenger.framework.presentation.common.screenshot.a e() {
        return (ru.ozon.android.messenger.framework.presentation.common.screenshot.a) this.f90926c.getValue();
    }

    public final void f() {
        ru.ozon.android.messenger.framework.presentation.common.screenshot.a e11 = e();
        ViewGroup.LayoutParams layoutParams = e11.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = (int) (layoutParams.width * 0.8f);
        layoutParams.height = (int) (layoutParams.height * 0.8f);
        e11.setLayoutParams(layoutParams);
    }

    public final void g(@NotNull List<? extends ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.c> actions, @NotNull Function2<? super AtomAction, ? super Map<String, MessengerTrackingInfo>, Unit> actionsHandler) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(actionsHandler, "actionsHandler");
        for (ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.c cVar : actions) {
            ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.a aVar = new ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.a(this.f90924a);
            aVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            cVar.a(aVar, actionsHandler);
            ((LinearLayout) this.f90927d.getValue()).addView(aVar);
        }
    }

    public final void h(@NotNull ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.c actionsPosition) {
        Intrinsics.checkNotNullParameter(actionsPosition, "actionsPosition");
        actionsPosition.a((LinearLayout) this.f90927d.getValue(), e());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void i(@NotNull Function0<Unit> onTouchListener) {
        Intrinsics.checkNotNullParameter(onTouchListener, "onTouchListener");
        setOnTouchListener(new Z40.a(onTouchListener));
    }

    public final void j(int i11) {
        e().setBackgroundResource(i11);
    }

    public final void k(int i11) {
        ru.ozon.android.messenger.framework.presentation.common.screenshot.a e11 = e();
        ViewGroup.LayoutParams layoutParams = e11.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = i11;
        e11.setLayoutParams(layoutParams2);
    }

    public final void l(int i11) {
        s.f(e(), new c(i11));
    }

    public final void m(int i11) {
        s.f(e(), new d(i11));
    }

    public final void n(int i11, int i12) {
        s.f(e(), new e(i11, i12));
    }

    public final void o(@NotNull View selectionView) {
        Intrinsics.checkNotNullParameter(selectionView, "selectionView");
        e().a(selectionView);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f90923g) {
            performClick();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f90925b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f90925b = null;
    }

    public final void p(boolean z11) {
        f90923g = z11;
    }
}
