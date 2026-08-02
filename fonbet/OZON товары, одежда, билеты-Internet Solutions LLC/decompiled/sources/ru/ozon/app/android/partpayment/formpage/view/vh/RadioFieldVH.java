package ru.ozon.app.android.partpayment.formpage.view.vh;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldRadioBinding;
import ru.ozon.app.android.partpayment.formpage.view.vh.RadioFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.uni.R$style;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R,\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/RadioFieldVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "Landroid/view/View;", "containerView", "Lkotlin/Function3;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "", "", "onFieldsChanged", "<init>", "(Landroid/view/View;Lfd/n;)V", "", "checkedValue", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$TitleValue;", "options", "addRadioButtons", "(Ljava/lang/String;Ljava/util/List;)V", "item", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lfd/n;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldRadioBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldRadioBinding;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RadioFieldVH extends DynamicFormFieldVH {

    @NotNull
    private final ItemDynamicFormFieldRadioBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final InterfaceC6511n<DynamicFormFieldVH, FormPageVO.Field, Boolean, Unit> onFieldsChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RadioFieldVH(@NotNull View containerView, @NotNull InterfaceC6511n<? super DynamicFormFieldVH, ? super FormPageVO.Field, ? super Boolean, Unit> onFieldsChanged) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onFieldsChanged, "onFieldsChanged");
        this.containerView = containerView;
        this.onFieldsChanged = onFieldsChanged;
        ItemDynamicFormFieldRadioBinding bind = ItemDynamicFormFieldRadioBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: ZB.b
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                RadioFieldVH._init_$lambda$2(RadioFieldVH.this, radioGroup, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(RadioFieldVH radioFieldVH, RadioGroup radioGroup, int i11) {
        int indexOfChild;
        Intrinsics.checkNotNullParameter(radioGroup, "<unused var>");
        FormPageVO.Field field = radioFieldVH.getField();
        FormPageVO.Field.Radio radio = field instanceof FormPageVO.Field.Radio ? (FormPageVO.Field.Radio) field : null;
        if (radio != null) {
            View findViewById = radioFieldVH.binding.radioGroup.findViewById(i11);
            RadioButton radioButton = findViewById instanceof RadioButton ? (RadioButton) findViewById : null;
            if (radioButton == null || (indexOfChild = radioFieldVH.binding.radioGroup.indexOfChild(radioButton)) < 0 || indexOfChild > radio.getOptions().size()) {
                return;
            }
            radioFieldVH.onFieldsChanged.invoke(radioFieldVH, FormPageVO.Field.Radio.copy$default(radio, null, null, radio.getOptions().get(indexOfChild).getValue(), radio.getOptions().get(indexOfChild).getTitle(), null, null, 51, null), Boolean.FALSE);
        }
    }

    private final void addRadioButtons(String checkedValue, List<FormPageVO.Field.Options.TitleValue> options) {
        int i11 = 0;
        for (Object obj : options) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FormPageVO.Field.Options.TitleValue titleValue = (FormPageVO.Field.Options.TitleValue) obj;
            RadioGroup radioGroup = this.binding.radioGroup;
            RadioButton radioButton = new RadioButton(this.binding.radioGroup.getContext());
            radioButton.setId(View.generateViewId());
            radioButton.setText(titleValue.getTitle());
            radioButton.setChecked(Intrinsics.d(checkedValue, titleValue.getValue()));
            int dimension = (int) radioButton.getResources().getDimension(R$dimen.padding_small);
            int dimension2 = (int) radioButton.getResources().getDimension(R$dimen.padding_extra_small);
            radioButton.setPadding(dimension, dimension2, (int) radioButton.getResources().getDimension((options.size() == 2 && i11 == 0) ? R$dimen.double_padding : R$dimen.default_padding), dimension2);
            radioButton.setTextAppearance(R$style.TextStyle_Body_L);
            radioGroup.addView(radioButton);
            i11 = i12;
        }
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH
    public void bind(@NotNull FormPageVO.Field item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        FormPageVO.Field.Radio radio = (FormPageVO.Field.Radio) item;
        ItemDynamicFormFieldRadioBinding itemDynamicFormFieldRadioBinding = this.binding;
        itemDynamicFormFieldRadioBinding.titleTv.setText(radio.getTitle());
        itemDynamicFormFieldRadioBinding.titleTv.setContentDescription(radio.getTitle());
        itemDynamicFormFieldRadioBinding.radioGroup.setOrientation(radio.getOptions().size() == 2 ? 0 : 1);
        itemDynamicFormFieldRadioBinding.radioGroup.removeAllViews();
        addRadioButtons(radio.getValue(), radio.getOptions());
    }
}
