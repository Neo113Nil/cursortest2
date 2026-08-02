package ru.ozon.app.android.partpayment.formpage.view.vh;

import Sc.o;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldTextBinding;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R,\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/TextFieldVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "Landroid/view/View;", "containerView", "Lkotlin/Function3;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "", "", "onFieldsChanged", "<init>", "(Landroid/view/View;Lfd/n;)V", "item", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lfd/n;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldTextBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldTextBinding;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextFieldVH extends DynamicFormFieldVH {

    @NotNull
    private final ItemDynamicFormFieldTextBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final InterfaceC6511n<DynamicFormFieldVH, FormPageVO.Field, Boolean, Unit> onFieldsChanged;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormPageVO.Field.KeyboardType.values().length];
            try {
                iArr[FormPageVO.Field.KeyboardType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormPageVO.Field.KeyboardType.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormPageVO.Field.KeyboardType.PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FormPageVO.Field.KeyboardType.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldVH(@NotNull View containerView, @NotNull InterfaceC6511n<? super DynamicFormFieldVH, ? super FormPageVO.Field, ? super Boolean, Unit> onFieldsChanged) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onFieldsChanged, "onFieldsChanged");
        this.containerView = containerView;
        this.onFieldsChanged = onFieldsChanged;
        ItemDynamicFormFieldTextBinding bind = ItemDynamicFormFieldTextBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.fieldEt.addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.partpayment.formpage.view.vh.TextFieldVH.1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void onTextChanged(CharSequence s11, int start, int before, int count) {
                Intrinsics.checkNotNullParameter(s11, "s");
                FormPageVO.Field field = TextFieldVH.this.getField();
                FormPageVO.Field.Text text = field instanceof FormPageVO.Field.Text ? (FormPageVO.Field.Text) field : null;
                if (text != null) {
                    TextFieldVH textFieldVH = TextFieldVH.this;
                    String obj = s11.toString();
                    textFieldVH.onFieldsChanged.invoke(textFieldVH, FormPageVO.Field.Text.copy$default(text, null, null, obj, obj, null, false, null, null, 243, null), Boolean.FALSE);
                }
                TextFieldVH.this.binding.fieldTil.Z(null);
            }
        });
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH
    public void bind(@NotNull FormPageVO.Field item) {
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        FormPageVO.Field.Text text = (FormPageVO.Field.Text) item;
        this.binding.fieldEt.setTag(text.getFocusableViewTag());
        TextInputEditText textInputEditText = this.binding.fieldEt;
        int i12 = WhenMappings.$EnumSwitchMapping$0[text.getKeyboardType().ordinal()];
        if (i12 != 1) {
            i11 = 2;
            if (i12 != 2) {
                i11 = 3;
                if (i12 != 3) {
                    if (i12 != 4) {
                        throw new o();
                    }
                    i11 = 33;
                }
            }
        } else {
            i11 = (text.getIsMultiline() ? 131072 : 0) | 16385;
        }
        textInputEditText.setInputType(i11);
        textInputEditText.setContentDescription(text.getTitle());
        textInputEditText.setText(text.getValue());
        TextInputLayout textInputLayout = this.binding.fieldTil;
        textInputLayout.d0(text.getTitle());
        textInputLayout.Z(text.getError());
    }
}
