package ru.ozon.app.android.search.producttilebuttons.binders.multiButton;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.producttilebuttons.MultiButtonVO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.model.MultiButtonModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.model.MultiButtonTemplate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.view.MultiButtonItemView;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.view.VerticalMultiButtonContainerView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJS\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J)\u0010(\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00162\u0012\u0010'\u001a\u000e\u0012\u0002\b\u00030%j\u0006\u0012\u0002\b\u0003`&¢\u0006\u0004\b(\u0010)JA\u0010-\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u00132\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R#\u00104\u001a\n /*\u0004\u0018\u00010\u00030\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R#\u00107\u001a\n /*\u0004\u0018\u00010\u00030\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103¨\u00068"}, d2 = {"Lru/ozon/app/android/search/producttilebuttons/binders/multiButton/MultiButtonsBinder;", "", "LPc/a;", "Lru/ozon/app/android/search/producttilebuttons/binders/multiButton/MultiButtonItemBinder;", "pMultiButtonItemBinder", "<init>", "(LPc/a;)V", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate;", "buttonTemplate", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/view/VerticalMultiButtonContainerView;", "buttonsContainer", "", "modifyLoForSellerIconV2", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/view/VerticalMultiButtonContainerView;)V", "binder", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/view/MultiButtonItemView;", "button", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel;", "buttonModel", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate$MultiButtonOrientation;", "buttonOrientation", "bindButton", "(Lru/ozon/app/android/search/producttilebuttons/binders/multiButton/MultiButtonItemBinder;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/view/MultiButtonItemView;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/J;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate$MultiButtonOrientation;)V", "", "subtitleHeight", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "subtitleView", "updateLabelLayoutParams", "(Ljava/lang/Integer;Lru/ozon/uni/atoms/v3/containers/SingleAtom;)V", "refs", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "vh", "init", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;)V", "view", "Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;", "multiButtonTemplate", "bind", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/view/VerticalMultiButtonContainerView;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;)V", "kotlin.jvm.PlatformType", "firstButtonBinder$delegate", "LSc/j;", "getFirstButtonBinder", "()Lru/ozon/app/android/search/producttilebuttons/binders/multiButton/MultiButtonItemBinder;", "firstButtonBinder", "secondButtonBinder$delegate", "getSecondButtonBinder", "secondButtonBinder", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MultiButtonsBinder {

    /* renamed from: firstButtonBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j firstButtonBinder;

    /* renamed from: secondButtonBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j secondButtonBinder;

    public MultiButtonsBinder(@NotNull a<MultiButtonItemBinder> pMultiButtonItemBinder) {
        Intrinsics.checkNotNullParameter(pMultiButtonItemBinder, "pMultiButtonItemBinder");
        n nVar = n.NONE;
        this.firstButtonBinder = k.a(nVar, new MultiButtonsBinder$firstButtonBinder$2(pMultiButtonItemBinder));
        this.secondButtonBinder = k.a(nVar, new MultiButtonsBinder$secondButtonBinder$2(pMultiButtonItemBinder));
    }

    private final void bindButton(MultiButtonItemBinder binder, MultiButtonItemView button, MultiButtonModel buttonModel, Function1<? super AtomAction, Unit> actionHandler, ComposerReferences composerReferences, J lifecycleOwner, MultiButtonTemplate.MultiButtonOrientation buttonOrientation) {
        ViewExtKt.show(button);
        SingleAtom buttonView = button.getButtonView();
        MultiButtonModel.ButtonModel buttonModel2 = buttonModel.getButtonModel();
        if (buttonModel2 != null) {
            ViewExtKt.show(buttonView);
            binder.prepare(buttonView, composerReferences, lifecycleOwner, actionHandler);
            binder.bind(buttonModel2, buttonView, actionHandler);
        } else {
            ViewExtKt.gone(buttonView);
        }
        SingleAtom footerView = button.getFooterView();
        if (buttonModel.getText() == null && buttonModel.getFooterLabelTextHeight() == null) {
            ViewExtKt.gone(footerView);
            return;
        }
        updateLabelLayoutParams(buttonModel.getFooterLabelTextHeight(), footerView);
        AtomDTO text = buttonModel.getText();
        if (text == null) {
            ViewExtKt.invisible(footerView);
        } else {
            ViewExtKt.show(footerView);
            SingleAtom.bind$default(footerView, text, false, 2, null);
        }
    }

    private final MultiButtonItemBinder getFirstButtonBinder() {
        return (MultiButtonItemBinder) this.firstButtonBinder.getValue();
    }

    private final MultiButtonItemBinder getSecondButtonBinder() {
        return (MultiButtonItemBinder) this.secondButtonBinder.getValue();
    }

    private final void modifyLoForSellerIconV2(MultiButtonTemplate buttonTemplate, VerticalMultiButtonContainerView buttonsContainer) {
        ViewGroup.LayoutParams layoutParams = buttonsContainer.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams == null || marginLayoutParams.bottomMargin != buttonTemplate.getContainerBottomOffset()) {
            ViewGroup.LayoutParams layoutParams2 = buttonsContainer.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.bottomMargin = buttonTemplate.getContainerBottomOffset();
            buttonsContainer.setLayoutParams(marginLayoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = buttonsContainer.getSecondButton().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? layoutParams3 : null);
        if (marginLayoutParams3 == null || marginLayoutParams3.topMargin != buttonTemplate.getSecondButtonTopOffset()) {
            MultiButtonItemView secondButton = buttonsContainer.getSecondButton();
            ViewGroup.LayoutParams layoutParams4 = secondButton.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams4.topMargin = buttonTemplate.getSecondButtonTopOffset();
            secondButton.setLayoutParams(marginLayoutParams4);
        }
    }

    private final void updateLabelLayoutParams(Integer subtitleHeight, SingleAtom subtitleView) {
        if (subtitleHeight != null) {
            ViewGroup.LayoutParams layoutParams = subtitleView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = subtitleHeight.intValue();
            subtitleView.setLayoutParams(layoutParams);
        }
    }

    public final void bind(@NotNull VerticalMultiButtonContainerView view, @NotNull ComposerReferences composerReferences, @NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull MultiButtonVO multiButtonTemplate) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(multiButtonTemplate, "multiButtonTemplate");
        MultiButtonItemView firstButton = view.getFirstButton();
        MultiButtonModel multiButtonModel = (MultiButtonModel) C7714v.M(multiButtonTemplate.getTemplate().getButtons());
        if (multiButtonModel == null) {
            ViewExtKt.gone(firstButton);
        } else {
            MultiButtonItemBinder firstButtonBinder = getFirstButtonBinder();
            Intrinsics.checkNotNullExpressionValue(firstButtonBinder, "<get-firstButtonBinder>(...)");
            bindButton(firstButtonBinder, firstButton, multiButtonModel, actionHandler, composerReferences, lifecycleOwner, view.getButtonsOrientation());
        }
        MultiButtonItemView secondButton = view.getSecondButton();
        MultiButtonModel multiButtonModel2 = (MultiButtonModel) C7714v.Q(1, multiButtonTemplate.getTemplate().getButtons());
        if (multiButtonModel2 == null) {
            ViewExtKt.gone(secondButton);
        } else {
            MultiButtonItemBinder secondButtonBinder = getSecondButtonBinder();
            Intrinsics.checkNotNullExpressionValue(secondButtonBinder, "<get-secondButtonBinder>(...)");
            bindButton(secondButtonBinder, secondButton, multiButtonModel2, actionHandler, composerReferences, lifecycleOwner, view.getButtonsOrientation());
        }
        modifyLoForSellerIconV2(multiButtonTemplate.getTemplate(), view);
    }

    public final void init(@NotNull ComposerReferences refs, @NotNull ru.ozon.composer.ui.widget.k<?> vh2) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(vh2, "vh");
        getFirstButtonBinder().init(refs, vh2);
        getSecondButtonBinder().init(refs, vh2);
    }
}
