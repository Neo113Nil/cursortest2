package ru.ozon.app.android.travel.molecules.view.commonInput.v2.view;

import CM.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewCommonInputsV2CheckboxBinding;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonCheckboxInputV2View;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/AbstractCommonInputV2View;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "item", "", "bindError", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;)V", "Lkotlin/Function2;", "", "onCheckboxChanged", "bind", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsV2CheckboxBinding;", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsV2CheckboxBinding;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonCheckboxInputV2View extends AbstractCommonInputV2View<CommonInputV2VO.CheckboxV2> {

    @NotNull
    private final ViewCommonInputsV2CheckboxBinding binding;

    public /* synthetic */ CommonCheckboxInputV2View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(Function2 function2, CommonInputV2VO.CheckboxV2 checkboxV2, CompoundButton compoundButton, boolean z11) {
        if (function2 != null) {
            function2.invoke(Integer.valueOf(checkboxV2.getId()), Boolean.valueOf(z11));
        }
    }

    public final void bind(@NotNull CommonInputV2VO.CheckboxV2 item, Function2<? super Integer, ? super Boolean, Unit> onCheckboxChanged) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.commonInputV2CheckboxTextTv.setText(item.getText());
        SwitchMaterial switchMaterial = this.binding.commonInputV2CheckboxView;
        switchMaterial.setOnCheckedChangeListener(null);
        switchMaterial.setChecked(item.getIsSelected());
        switchMaterial.setEnabled(item.getIsEnabled());
        switchMaterial.setOnCheckedChangeListener(new a(1, onCheckboxChanged, item));
        bindError(item);
    }

    public void bindError(@NotNull CommonInputV2VO.CheckboxV2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatTextView appCompatTextView = this.binding.commonInputV2CheckboxErrorTv;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(item.getIsErrorVisible() ? 0 : 8);
        appCompatTextView.setText(item.getError());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonCheckboxInputV2View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewCommonInputsV2CheckboxBinding.inflate(LayoutInflater.from(context), this);
    }
}
