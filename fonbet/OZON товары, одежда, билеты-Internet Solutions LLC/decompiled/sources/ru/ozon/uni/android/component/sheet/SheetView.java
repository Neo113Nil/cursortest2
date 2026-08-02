package ru.ozon.uni.android.component.sheet;

import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.common.ComponentExtKt;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.databinding.SheetViewUniBinding;

@InterfaceC3999a
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 :2\u00020\u0001:\u0001:B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u000eJ+\u0010#\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u000eJ\u000f\u0010(\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b\u0006\u0010+J\u000f\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lru/ozon/uni/android/component/sheet/SheetView;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/View;", "contentView", "Lkotlin/Function0;", "", "onDismiss", "Lru/ozon/uni/android/component/sheet/SheetMode;", "sheetMode", "", "isCloseButtonEnabled", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lru/ozon/uni/android/component/sheet/SheetMode;Z)V", "addContentView", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "addRecyclerViewContent", "(Landroidx/recyclerview/widget/RecyclerView;)V", "view", "addScrollViewContent", "(Landroid/view/View;)V", "setupContentConstraints", "addCloseButton", "setupContentMaxHeight", "", "getScreenHeight", "()I", "startBottomSheetSlideUpAnimation", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "getTheme", "Landroid/content/DialogInterface;", "dialog", "(Landroid/content/DialogInterface;)V", "onDestroyView", "Landroid/view/View;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/uni/android/component/sheet/SheetMode;", "Z", "Lru/ozon/uni/databinding/SheetViewUniBinding;", "_binding", "Lru/ozon/uni/databinding/SheetViewUniBinding;", "Landroid/view/animation/LinearInterpolator;", "slideUpAnimationInterpolator", "Landroid/view/animation/LinearInterpolator;", "getBinding", "()Lru/ozon/uni/databinding/SheetViewUniBinding;", "binding", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class SheetView extends b {
    private SheetViewUniBinding _binding;
    private final View contentView;
    private final boolean isCloseButtonEnabled;

    @NotNull
    private final Function0<Unit> onDismiss;

    @NotNull
    private final SheetMode sheetMode;

    @NotNull
    private final LinearInterpolator slideUpAnimationInterpolator;
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.android.component.sheet.SheetView$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetMode.values().length];
            try {
                iArr[SheetMode.HALF_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetMode.FULLSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetMode.HUG_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SheetView() {
        this(null, null, null, false, 15, null);
    }

    private final void addCloseButton() {
        if (this.isCloseButtonEnabled) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            IconButtonView createCloseButton = ComponentExtKt.createCloseButton(requireContext, new SheetView$addCloseButton$closeButton$1(this));
            createCloseButton.setId(R$id.sheetViewCloseButton);
            ConstraintLayout constraintLayout = getBinding().contentContainer;
            constraintLayout.addView(createCloseButton);
            ConstraintLayoutExtKt.updateConstraints(constraintLayout, new SheetView$addCloseButton$1$1(createCloseButton));
        }
    }

    private final void addContentView() {
        View view = this.contentView;
        if (view != null) {
            if (view instanceof RecyclerView) {
                addRecyclerViewContent((RecyclerView) view);
            } else {
                addScrollViewContent(view);
            }
        }
    }

    private final void addRecyclerViewContent(RecyclerView recyclerView) {
        recyclerView.setOverScrollMode(2);
        setupContentConstraints(recyclerView);
    }

    private final void addScrollViewContent(View view) {
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(view);
        NestedScrollView nestedScrollView = new NestedScrollView(requireContext());
        nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(0, -2));
        nestedScrollView.addView(linearLayout);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.setOverScrollMode(2);
        setupContentConstraints(nestedScrollView);
    }

    private final SheetViewUniBinding getBinding() {
        SheetViewUniBinding sheetViewUniBinding = this._binding;
        Intrinsics.f(sheetViewUniBinding);
        return sheetViewUniBinding;
    }

    private final int getScreenHeight() {
        return getResources().getDisplayMetrics().heightPixels;
    }

    private final void setupContentConstraints(View view) {
        view.setId(View.generateViewId());
        ConstraintLayout constraintLayout = getBinding().contentContainer;
        constraintLayout.addView(view);
        ConstraintLayoutExtKt.updateConstraints(constraintLayout, new SheetView$setupContentConstraints$1$1(view));
    }

    private final void setupContentMaxHeight() {
        MaterialCardView cardContainer = getBinding().cardContainer;
        Intrinsics.checkNotNullExpressionValue(cardContainer, "cardContainer");
        ViewGroup.LayoutParams layoutParams = cardContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = getScreenHeight() - UiExtKt.toPx(16);
        cardContainer.setLayoutParams(layoutParams);
    }

    private final void startBottomSheetSlideUpAnimation() {
        Window window;
        View decorView;
        r activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        float height = decorView.getHeight();
        Object parent = getBinding().root.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            return;
        }
        view.setTranslationY(height);
        view.animate().setDuration(250L).setInterpolator(this.slideUpAnimationInterpolator).translationY(0.0f).start();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public int getTheme() {
        return R$style.SheetTheme;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SheetViewUniBinding.inflate(inflater);
        FrameLayout root = getBinding().root;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        return root;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.contentView;
        if (view != null) {
            ViewExtKt.removeSelf(view);
        }
        this._binding = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.onDismiss.invoke();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        Object parent = requireView().getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior from = BottomSheetBehavior.from((View) parent);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.sheetMode.ordinal()];
        if (i11 == 1) {
            setupContentMaxHeight();
            from.setPeekHeight(getScreenHeight() / 2);
            from.setState(6);
            from.setSkipCollapsed(false);
        } else if (i11 == 2) {
            setupContentMaxHeight();
            from.setState(3);
            from.setSkipCollapsed(true);
        } else {
            if (i11 != 3) {
                throw new o();
            }
            from.setState(3);
            from.setSkipCollapsed(true);
        }
        startBottomSheetSlideUpAnimation();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        addContentView();
        addCloseButton();
    }

    public /* synthetic */ SheetView(View view, Function0 function0, SheetMode sheetMode, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : view, (i11 & 2) != 0 ? AnonymousClass1.INSTANCE : function0, (i11 & 4) != 0 ? SheetMode.HUG_CONTENT : sheetMode, (i11 & 8) != 0 ? true : z11);
    }

    public SheetView(View view, @NotNull Function0<Unit> onDismiss, @NotNull SheetMode sheetMode, boolean z11) {
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(sheetMode, "sheetMode");
        this.contentView = view;
        this.onDismiss = onDismiss;
        this.sheetMode = sheetMode;
        this.isCloseButtonEnabled = z11;
        this.slideUpAnimationInterpolator = new LinearInterpolator();
    }
}
