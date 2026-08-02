package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view;

import Lc.a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownVO;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownView;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.adapter.DirectFlightsDropdownAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.adapter.DirectFlightsDropdownItemsDecoration;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsExtKt;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t0\u001c¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/DirectFlightsDropdownView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "targetRVHeight", "Lkotlin/Function0;", "", "function", "applyRVHeight", "(ILkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;", "button", "bindButton", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;)V", "", "targetAngle", "rotateIcon", "(F)V", "setupConstraints", "()V", "onDetachedFromWindow", "getFirstItemHeight", "()Ljava/lang/Integer;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "setupAdapter", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;", "data", "onExpandAction", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;ILkotlin/jvm/functions/Function0;)V", "dp2", "I", "dp6", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "expandButtonTitle", "Lru/ozon/uni/android/atom/icon/IconView;", "expandButtonIcon", "Lru/ozon/uni/android/atom/icon/IconView;", "Landroid/view/View;", "expandButtonOverlay", "Landroid/view/View;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/adapter/DirectFlightsDropdownAdapter;", "itemsAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/adapter/DirectFlightsDropdownAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView;", "itemsList", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "cachedWidgetSettingsVO", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "Lkotlin/jvm/functions/Function0;", "Landroid/animation/ValueAnimator;", "heightAnimator", "Landroid/animation/ValueAnimator;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DirectFlightsDropdownView extends ConstraintLayout {
    private TravelWidgetSettingsVO cachedWidgetSettingsVO;
    private final int dp2;
    private final int dp6;

    @NotNull
    private final IconView expandButtonIcon;

    @NotNull
    private final View expandButtonOverlay;

    @NotNull
    private final TextAtomV2View expandButtonTitle;
    private ValueAnimator heightAnimator;
    private DirectFlightsDropdownAdapter itemsAdapter;

    @NotNull
    private final RecyclerView itemsList;

    @NotNull
    private final LinearLayoutManager linearLayoutManager;

    @NotNull
    private Function0<Unit> onExpandAction;

    @NotNull
    private final TextAtomV2View title;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            DirectFlightsDropdownView.this.onExpandAction.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectFlightsDropdownView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = UiExtKt.toPx(2, context);
        this.dp6 = UiExtKt.toPx(6, context);
        q qVar = q.f64554a;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        a.d(textAtomV2View, R$id.directFlightsDropdownTitle, 0, -2, false);
        addView(g10);
        this.title = textAtomV2View;
        View g11 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) g11;
        a.d(textAtomV2View2, R$id.directFlightsDropdownExpandButtonTitle, -2, -2, false);
        addView(g11);
        this.expandButtonTitle = textAtomV2View2;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.directFlightsDropdownExpandButtonIcon);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(iconView);
        this.expandButtonIcon = iconView;
        View view = new View(context);
        view.setId(R$id.directFlightsDropdownExpandButtonOverlay);
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        addView(view);
        this.expandButtonOverlay = view;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.linearLayoutManager = linearLayoutManager;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.directFlightsDropdownExpandCellList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.addItemDecoration(new DirectFlightsDropdownItemsDecoration(context));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        addView(recyclerView);
        this.itemsList = recyclerView;
        this.onExpandAction = DirectFlightsDropdownView$onExpandAction$1.INSTANCE;
        setupConstraints();
        ViewExtKt.setOnClickListenerThrottle$default(view, 0L, new AnonymousClass1(), 1, null);
    }

    private final void applyRVHeight(final int targetRVHeight, final Function0<Unit> function) {
        DirectFlightsDropdownAdapter directFlightsDropdownAdapter;
        if (targetRVHeight == this.itemsList.getHeight() || ((directFlightsDropdownAdapter = this.itemsAdapter) != null && directFlightsDropdownAdapter.getCardsCount() == 0)) {
            if (function != null) {
                function.invoke();
                return;
            }
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.itemsList.getHeight(), targetRVHeight);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: JM.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DirectFlightsDropdownView.applyRVHeight$lambda$14$lambda$10(DirectFlightsDropdownView.this, valueAnimator);
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownView$applyRVHeight$lambda$14$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                Function0 function0 = Function0.this;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownView$applyRVHeight$lambda$14$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
                RecyclerView recyclerView;
                recyclerView = DirectFlightsDropdownView.this.itemsList;
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = targetRVHeight;
                recyclerView.setLayoutParams(layoutParams);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofInt.start();
        this.heightAnimator = ofInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void applyRVHeight$default(DirectFlightsDropdownView directFlightsDropdownView, int i11, Function0 function0, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            function0 = null;
        }
        directFlightsDropdownView.applyRVHeight(i11, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyRVHeight$lambda$14$lambda$10(DirectFlightsDropdownView directFlightsDropdownView, ValueAnimator valueAnimator) {
        int intValue = ((Integer) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        RecyclerView recyclerView = directFlightsDropdownView.itemsList;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = intValue;
        recyclerView.setLayoutParams(layoutParams);
    }

    private final void bindButton(DirectFlightsDropdownVO.ExpandCollapseButtonVO button) {
        if (button == null) {
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.expandButtonIcon);
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.expandButtonTitle);
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.expandButtonOverlay);
            return;
        }
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(this.expandButtonOverlay);
        IconHolderKt.bindOrGone$default(this.expandButtonIcon, button.getIcon(), null, 2, null);
        if (button.getIsExpanded()) {
            TextHolderKt.bindOrGone$default(this.expandButtonTitle, button.getExpandedLabel(), null, 2, null);
            rotateIcon(180.0f);
        } else {
            TextHolderKt.bindOrGone$default(this.expandButtonTitle, button.getCollapsedLabel(), null, 2, null);
            rotateIcon(0.0f);
        }
    }

    private final void rotateIcon(float targetAngle) {
        this.expandButtonIcon.animate().cancel();
        this.expandButtonIcon.animate().rotation(targetAngle).setDuration(300L).start();
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new DirectFlightsDropdownView$setupConstraints$1(this));
    }

    public final void bind(@NotNull DirectFlightsDropdownVO data, int targetRVHeight, @NotNull Function0<Unit> onExpandAction) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onExpandAction, "onExpandAction");
        this.onExpandAction = onExpandAction;
        TravelWidgetSettingsExtKt.updatePadding$default(this, data.getSettings().getPaddings(), 0, 0, 0, 0, 30, null);
        TravelWidgetSettingsExtKt.safeUpdateBackground$default(this, data.getSettings(), this.cachedWidgetSettingsVO, 0, 4, null);
        this.cachedWidgetSettingsVO = data.getSettings();
        TextHolderKt.bind$default(this.title, data.getTitle(), null, 2, null);
        if (targetRVHeight == -2) {
            DirectFlightsDropdownAdapter directFlightsDropdownAdapter = this.itemsAdapter;
            if (directFlightsDropdownAdapter != null) {
                directFlightsDropdownAdapter.submitList(data.getVisibleItems());
            }
        } else {
            DirectFlightsDropdownVO.ExpandCollapseButtonVO expandCollapseButton = data.getExpandCollapseButton();
            if (expandCollapseButton == null || !expandCollapseButton.getIsExpanded()) {
                applyRVHeight(targetRVHeight, new DirectFlightsDropdownView$bind$1(this, data));
            } else {
                applyRVHeight$default(this, targetRVHeight, null, 2, null);
                DirectFlightsDropdownAdapter directFlightsDropdownAdapter2 = this.itemsAdapter;
                if (directFlightsDropdownAdapter2 != null) {
                    directFlightsDropdownAdapter2.submitList(data.getVisibleItems());
                }
            }
        }
        bindButton(data.getExpandCollapseButton());
    }

    public final Integer getFirstItemHeight() {
        View view;
        RecyclerView.C findViewHolderForAdapterPosition = this.itemsList.findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
            return null;
        }
        return Integer.valueOf(view.getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.expandButtonIcon.animate().cancel();
        ValueAnimator valueAnimator = this.heightAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void setupAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        DirectFlightsDropdownAdapter directFlightsDropdownAdapter = new DirectFlightsDropdownAdapter(lifecycleOwner, actionHandler);
        this.itemsAdapter = directFlightsDropdownAdapter;
        this.itemsList.setAdapter(directFlightsDropdownAdapter);
    }
}
