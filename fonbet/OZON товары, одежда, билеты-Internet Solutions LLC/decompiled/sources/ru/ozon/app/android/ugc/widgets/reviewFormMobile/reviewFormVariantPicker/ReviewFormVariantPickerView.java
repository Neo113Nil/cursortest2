package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.InputSelectButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.button.InputSelectButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\"\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/ReviewFormVariantPickerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", FormPageDTO.Field.FIELD_TYPE_PICKER, "Lru/ozon/uni/android/controls/button/InputSelectButtonView;", "setTitle", "", "dto", "Lru/ozon/uni/atoms/data/text/TextDTO;", "setPicker", "variantPickerVO", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO;", "action", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormVariantPickerView extends LinearLayout {
    public static final int $stable = InputSelectButtonView.$stable | TextAtomV2View.$stable;

    @NotNull
    private final InputSelectButtonView picker;

    @NotNull
    private final TextAtomV2View title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFormVariantPickerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        this.title = textAtomV2View;
        InputSelectButtonView inputSelectButtonView = new InputSelectButtonView(context, null, 0, 0, 14, null);
        inputSelectButtonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        inputSelectButtonView.setPadding(dimens.getDP_16(), 0, dimens.getDP_16(), 0);
        this.picker = inputSelectButtonView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        addView(textAtomV2View);
        addView(inputSelectButtonView);
    }

    public final void setPicker(@NotNull VariantPickerVO variantPickerVO, @NotNull Function1<? super AtomAction, Unit> action) {
        Intrinsics.checkNotNullParameter(variantPickerVO, "variantPickerVO");
        Intrinsics.checkNotNullParameter(action, "action");
        InputSelectButtonHolderKt.bindOrGone(this.picker, variantPickerVO.getSelectionButton(), action);
    }

    public final void setTitle(@NotNull TextDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        TextHolderKt.bindOrGone$default(this.title, dto, null, 2, null);
    }
}
