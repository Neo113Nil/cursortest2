package ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation;

import Al.ViewOnClickListenerC2437a;
import FG.a;
import W10.c;
import WZ.t;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.bank.R$drawable;
import ru.ozon.app.android.bank.databinding.WidgetBankAccountStatusBinding;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation.BankAccountStatusWidgetVH;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010%\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` 2\u000e\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#H\u0016¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000f0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusViewModel;", "widgetViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusViewModel;)V", "Landroid/graphics/drawable/Drawable;", "", "colorInt", "", "overrideColor", "(Landroid/graphics/drawable/Drawable;I)V", "Landroidx/lifecycle/J;", "lifecycle", "onDetachViewModel", "(Landroidx/lifecycle/J;)V", "onAttachViewModel", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusVO;Ll20/d;)V", "onDetach", "()V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusViewModel;", "Lru/ozon/app/android/bank/databinding/WidgetBankAccountStatusBinding;", "binding", "Lru/ozon/app/android/bank/databinding/WidgetBankAccountStatusBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusVO;", "Lxe/B0;", "balanceJob", "Lxe/B0;", "Landroidx/lifecycle/G;", "fragmentLifecycleObserver", "Landroidx/lifecycle/G;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BankAccountStatusWidgetVH extends k<BankAccountStatusVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private B0 balanceJob;

    @NotNull
    private final WidgetBankAccountStatusBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final G fragmentLifecycleObserver;
    private BankAccountStatusVO item;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final BankAccountStatusViewModel widgetViewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankAccountStatusWidgetVH(@NotNull View containerView, @NotNull ComposerReferences ref, @NotNull BankAccountStatusViewModel widgetViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        this.containerView = containerView;
        this.ref = ref;
        this.widgetViewModel = widgetViewModel;
        WidgetBankAccountStatusBinding bind = WidgetBankAccountStatusBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        this.fragmentLifecycleObserver = new G() { // from class: rm.a
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                BankAccountStatusWidgetVH.fragmentLifecycleObserver$lambda$0(BankAccountStatusWidgetVH.this, j11, aVar);
            }
        };
        containerView.setClipToOutline(true);
        containerView.setOnClickListener(new a(this, 18));
        bind.titleTv.setTextIsSelectable(false);
        bind.titleTv.setOnClickListener(new BC.a(this, 14));
        bind.subTitleTv.setTextIsSelectable(false);
        bind.subTitleTv.setOnClickListener(new ViewOnClickListenerC2437a(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(BankAccountStatusWidgetVH bankAccountStatusWidgetVH, View view) {
        AtomAction action;
        BankAccountStatusVO boundedData = bankAccountStatusWidgetVH.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        bankAccountStatusWidgetVH.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(BankAccountStatusWidgetVH bankAccountStatusWidgetVH, View view) {
        AtomAction action;
        BankAccountStatusVO boundedData = bankAccountStatusWidgetVH.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        bankAccountStatusWidgetVH.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fragmentLifecycleObserver$lambda$0(BankAccountStatusWidgetVH bankAccountStatusWidgetVH, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            bankAccountStatusWidgetVH.widgetViewModel.setWasStopped(true);
        } else if (bankAccountStatusWidgetVH.widgetViewModel.getWasStopped()) {
            bankAccountStatusWidgetVH.widgetViewModel.handleBalanceState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(BankAccountStatusWidgetVH bankAccountStatusWidgetVH, View view) {
        AtomAction action;
        BankAccountStatusVO boundedData = bankAccountStatusWidgetVH.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        bankAccountStatusWidgetVH.actionHandler.invoke(action);
    }

    private final void overrideColor(Drawable drawable, int i11) {
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i11);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i11);
        } else if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(i11);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        AbstractC5434v lifecycle2;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        BankAccountStatusVO bankAccountStatusVO = this.item;
        if (bankAccountStatusVO == null || !bankAccountStatusVO.getNeedBankBalanceRefresh()) {
            return;
        }
        ComponentCallbacksC5392m c11 = this.ref.getContainer().c();
        if (c11 != null && (lifecycle2 = c11.getLifecycle()) != null) {
            lifecycle2.a(this.fragmentLifecycleObserver);
        }
        B0 b02 = this.balanceJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.balanceJob = C10727i.c(K.a(lifecycle), null, null, new BankAccountStatusWidgetVH$onAttachViewModel$1(this, null), 3);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onDetachViewModel(@NotNull J lifecycle) {
        AbstractC5434v lifecycle2;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        ComponentCallbacksC5392m c11 = this.ref.getContainer().c();
        if (c11 != null && (lifecycle2 = c11.getLifecycle()) != null) {
            lifecycle2.e(this.fragmentLifecycleObserver);
        }
        B0 b02 = this.balanceJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BankAccountStatusVO item, @NotNull d info) {
        Drawable.ConstantState constantState;
        Drawable newDrawable;
        Drawable mutate;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        TextAtomV2View titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextHolderKt.bind$default(titleTv, item.getTitle(), null, 2, null);
        if (item.getSubTitle() == null) {
            TextAtomV2View subTitleTv = this.binding.subTitleTv;
            Intrinsics.checkNotNullExpressionValue(subTitleTv, "subTitleTv");
            subTitleTv.setVisibility(8);
        } else {
            TextAtomV2View subTitleTv2 = this.binding.subTitleTv;
            Intrinsics.checkNotNullExpressionValue(subTitleTv2, "subTitleTv");
            TextHolderKt.bind$default(subTitleTv2, item.getSubTitle(), null, 2, null);
            TextAtomV2View subTitleTv3 = this.binding.subTitleTv;
            Intrinsics.checkNotNullExpressionValue(subTitleTv3, "subTitleTv");
            subTitleTv3.setVisibility(0);
        }
        if (item.getDescriptionAtom() == null) {
            SingleAtom descriptionTv = this.binding.descriptionTv;
            Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
            descriptionTv.setVisibility(8);
        } else {
            SingleAtom.bind$default(this.binding.descriptionTv, item.getDescriptionAtom(), false, 2, null);
            SingleAtom descriptionTv2 = this.binding.descriptionTv;
            Intrinsics.checkNotNullExpressionValue(descriptionTv2, "descriptionTv");
            descriptionTv2.setVisibility(0);
        }
        ButtonV3Atom.SmallButton button = item.getButton();
        if (button != null) {
            SmallButtonView buttonSbv = this.binding.buttonSbv;
            Intrinsics.checkNotNullExpressionValue(buttonSbv, "buttonSbv");
            WrappedButtonHolderKt.bind(buttonSbv, button, this.actionHandler);
        }
        Drawable a11 = C7232a.a(getContext(), R$drawable.bg_bank_banner_rounded);
        if (a11 != null && (constantState = a11.getConstantState()) != null && (newDrawable = constantState.newDrawable()) != null && (mutate = newDrawable.mutate()) != null) {
            overrideColor(mutate, StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), R$color.oz_semantic_bg_secondary));
            this.binding.cardContainerCl.setBackground(mutate);
        }
        this.containerView.setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getWidgetBackground(), R$color.oz_semantic_bg_primary));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BankAccountStatusVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
