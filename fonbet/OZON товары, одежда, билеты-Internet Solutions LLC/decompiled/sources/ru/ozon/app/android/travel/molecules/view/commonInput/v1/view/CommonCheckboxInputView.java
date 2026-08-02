package ru.ozon.app.android.travel.molecules.view.commonInput.v1.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.switchmaterial.SwitchMaterial;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonCheckboxInputView;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewCommonInputsCheckboxBinding;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ3\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonCheckboxInputView;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/AbstractCommonInputView;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Checkbox;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "item", "", "updateValue", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Checkbox;)V", "bindError", "Lkotlin/Function2;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bind", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Checkbox;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsCheckboxBinding;", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCommonInputsCheckboxBinding;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonCheckboxInputView extends AbstractCommonInputView<CommonInputVO.Checkbox> {

    @NotNull
    private final ViewCommonInputsCheckboxBinding binding;

    public /* synthetic */ CommonCheckboxInputView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(Function2 function2, CommonInputVO.Checkbox checkbox, CompoundButton compoundButton, boolean z11) {
        if (function2 != null) {
            function2.invoke(Long.valueOf(checkbox.getId()), Boolean.valueOf(z11));
        }
    }

    public final void bind(@NotNull final CommonInputVO.Checkbox item, final Function2<? super Long, ? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.commonInputCheckboxTextTv.setText(item.getText());
        SwitchMaterial switchMaterial = this.binding.commonInputCheckboxView;
        switchMaterial.setOnCheckedChangeListener(null);
        switchMaterial.setChecked(item.getIsSelected());
        switchMaterial.setEnabled(item.getIsEnabled());
        switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: hU.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                CommonCheckboxInputView.bind$lambda$2$lambda$1(listener, item, compoundButton, z11);
            }
        });
        bindError(item);
    }

    public void bindError(@NotNull CommonInputVO.Checkbox item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatTextView appCompatTextView = this.binding.commonInputCheckboxErrorTv;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(item.getIsErrorVisible() ? 0 : 8);
        appCompatTextView.setText(item.getError());
    }

    public void updateValue(@NotNull CommonInputVO.Checkbox item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.commonInputCheckboxView.setChecked(item.getIsSelected());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonCheckboxInputView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewCommonInputsCheckboxBinding.inflate(LayoutInflater.from(context), this);
    }
}
