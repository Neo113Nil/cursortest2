package ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton;

import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$drawable;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton.SelectionFormSubmitButtonVO;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonViewGroup;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "createButtonView", "(Landroid/content/Context;)Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO;", "model", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO;Lkotlin/jvm/functions/Function1;)V", "firstButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "LSc/j;", "secondButton", "LSc/j;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormSubmitButtonViewGroup extends LinearLayout {

    @NotNull
    private final ButtonV3View firstButton;

    @NotNull
    private final InterfaceC4008j<ButtonV3View> secondButton;

    public /* synthetic */ SelectionFormSubmitButtonViewGroup(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonV3View createButtonView(Context context) {
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.setMarginStart(dimens.getDP_8());
        layoutParams.topMargin = dimens.getDP_8();
        layoutParams.bottomMargin = dimens.getDP_4();
        buttonV3View.setLayoutParams(layoutParams);
        return buttonV3View;
    }

    public final void bind(@NotNull SelectionFormSubmitButtonVO model, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        SelectionFormSubmitButtonVO.ButtonWrapper buttonWrapper = model.getButtonWrapper();
        if (buttonWrapper instanceof SelectionFormSubmitButtonVO.ButtonWrapper.SingleButton) {
            ButtonV3HolderKt.bind(this.firstButton, ((SelectionFormSubmitButtonVO.ButtonWrapper.SingleButton) model.getButtonWrapper()).getSingleButton(), actionHandler);
            if (this.secondButton.isInitialized()) {
                ViewExtKt.gone(this.secondButton.getValue());
                return;
            }
            return;
        }
        if (!(buttonWrapper instanceof SelectionFormSubmitButtonVO.ButtonWrapper.DoubleButton)) {
            throw new o();
        }
        ButtonV3HolderKt.bind(this.firstButton, ((SelectionFormSubmitButtonVO.ButtonWrapper.DoubleButton) model.getButtonWrapper()).getFirstButton(), actionHandler);
        ButtonV3HolderKt.bindOrGone(this.secondButton.getValue(), ((SelectionFormSubmitButtonVO.ButtonWrapper.DoubleButton) model.getButtonWrapper()).getSecondButton(), actionHandler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionFormSubmitButtonViewGroup(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ButtonV3View createButtonView = createButtonView(context);
        this.firstButton = createButtonView;
        this.secondButton = DelegatesKt.lazyUnsafe(new SelectionFormSubmitButtonViewGroup$special$$inlined$lazyView$1(this, this, context));
        setOrientation(0);
        setBackground(androidx.core.content.a.getDrawable(context, R$drawable.bg_selection_form_submit_button));
        setPadding(0, 0, Dimens.INSTANCE.getDP_8(), 0);
        addView(createButtonView);
    }
}
