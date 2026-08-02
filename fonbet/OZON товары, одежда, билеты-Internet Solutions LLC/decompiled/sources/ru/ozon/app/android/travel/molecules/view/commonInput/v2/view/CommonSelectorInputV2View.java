package ru.ozon.app.android.travel.molecules.view.commonInput.v2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonSelectorInputV2View;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayoutV2;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewCommonInputsV2TextInputBinding;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\r2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\r2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0012JK\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014j\u0004\u0018\u0001`\u00162\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonSelectorInputV2View;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/AbstractCommonInputV2View;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "item", "", "bindError", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;)V", "icon", "bindOrGoneRightIcon", "(Ljava/lang/Integer;)V", "bindOrGoneLeftIcon", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "onClickAction", "onSelectorClicked", "bind", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsV2TextInputBinding;", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsV2TextInputBinding;", "iconColor", "I", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonSelectorInputV2View extends AbstractCommonInputV2View<CommonInputV2VO.SelectorV2> {

    @NotNull
    private final ViewCommonInputsV2TextInputBinding binding;
    private final int iconColor;

    public /* synthetic */ CommonSelectorInputV2View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(CommonSelectorInputV2View commonSelectorInputV2View, CommonInputV2VO.SelectorV2 selectorV2, Function1 function1, Function1 function12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function12 = null;
        }
        commonSelectorInputV2View.bind(selectorV2, function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4$lambda$3(TravelTextInputLayoutV2 travelTextInputLayoutV2, CommonInputV2VO.SelectorV2 selectorV2, Function1 function1, Function1 function12, View view) {
        Intrinsics.f(travelTextInputLayoutV2);
        KeyboardUtilsKt.hideKeyboard(travelTextInputLayoutV2);
        travelTextInputLayoutV2.requestFocus();
        if (selectorV2.getOnClick() != null) {
            if (function1 != null) {
                function1.invoke(selectorV2.getOnClick());
            }
        } else if (function12 != null) {
            function12.invoke(Integer.valueOf(selectorV2.getId()));
        }
    }

    public final void bind(@NotNull final CommonInputV2VO.SelectorV2 item, final Function1<? super AtomAction, Unit> onClickAction, final Function1<? super Integer, Unit> onSelectorClicked) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatTextView appCompatTextView = this.binding.commonInputV2TextInputEt;
        appCompatTextView.setText(item.getText());
        appCompatTextView.setFocusable(false);
        appCompatTextView.setEnabled(item.getIsEnabled());
        appCompatTextView.setContentDescription(item.getPlaceholder());
        final TravelTextInputLayoutV2 travelTextInputLayoutV2 = this.binding.commonInputV2TextInputMtil;
        travelTextInputLayoutV2.setHint(item.getPlaceholder());
        travelTextInputLayoutV2.setEnabled(item.getIsEnabled());
        travelTextInputLayoutV2.setOnClickListener(new View.OnClickListener() { // from class: iU.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonSelectorInputV2View.bind$lambda$4$lambda$3(TravelTextInputLayoutV2.this, item, onClickAction, onSelectorClicked, view);
            }
        });
        bindError(item);
        bindOrGoneLeftIcon(item.getLeftIcon());
        bindOrGoneRightIcon(item.getRightIcon());
    }

    public void bindError(@NotNull CommonInputV2VO.SelectorV2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.commonInputV2TextInputMtil.setShowError(item.getIsErrorVisible());
        AppCompatTextView appCompatTextView = this.binding.commonInputV2TextInputErrorTv;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(item.getIsErrorVisible() ? 0 : 8);
        appCompatTextView.setText(item.getError());
    }

    protected void bindOrGoneLeftIcon(Integer icon) {
        if (icon != null) {
            this.binding.commonInputV2TextInputMtil.showLeftImageView(icon.intValue(), Integer.valueOf(this.iconColor));
        } else {
            this.binding.commonInputV2TextInputMtil.hideLeftImageView();
        }
    }

    protected void bindOrGoneRightIcon(Integer icon) {
        if (icon != null) {
            this.binding.commonInputV2TextInputMtil.showRightImageView(icon.intValue(), Integer.valueOf(this.iconColor));
        } else {
            this.binding.commonInputV2TextInputMtil.hideRightImageView();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonSelectorInputV2View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconColor = ThemeExtKt.themeColor(context, R$attr.graphicTertiary);
        this.binding = ViewCommonInputsV2TextInputBinding.inflate(LayoutInflater.from(context), this);
    }
}
