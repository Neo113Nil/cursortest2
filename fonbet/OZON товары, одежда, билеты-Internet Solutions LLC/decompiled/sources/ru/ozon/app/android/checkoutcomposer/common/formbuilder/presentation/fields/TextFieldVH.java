package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields;

import Sc.o;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.a;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.atom2.InputAtom;
import ru.ozon.app.android.atoms.extensions.ClickableCiewKt;
import ru.ozon.app.android.atoms.utils.EditTextExtKt;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormConfig;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldAction;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.TextFieldVH;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldTextBinding;
import ru.ozon.app.android.uikit.R$color;
import ru.ozon.app.android.uikit.text.OzonPhoneNumberFormattingTextWatcher;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/TextFieldVH;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldVH;", "binding", "Lru/ozon/app/android/map/databinding/ItemFormBlockFieldTextBinding;", "formConfig", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "onAction", "Lkotlin/Function1;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "", "<init>", "(Lru/ozon/app/android/map/databinding/ItemFormBlockFieldTextBinding;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;Lkotlin/jvm/functions/Function1;)V", "currentItem", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$TextField;", "phoneTextWatcher", "Lru/ozon/app/android/uikit/text/OzonPhoneNumberFormattingTextWatcher;", "textWatcher", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "bind", "item", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextFieldVH extends FieldVH {

    @NotNull
    private final ItemFormBlockFieldTextBinding binding;
    private FormBuilderBlockVO.Field.TextField currentItem;

    @NotNull
    private final OzonPhoneNumberFormattingTextWatcher phoneTextWatcher;

    @NotNull
    private final SimpleTextWatcher textWatcher;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputAtom.Configuration.InputType.values().length];
            try {
                iArr[InputAtom.Configuration.InputType.TEXT_MULTILINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputAtom.Configuration.InputType.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputAtom.Configuration.InputType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InputAtom.Configuration.InputType.PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InputAtom.Configuration.InputType.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextFieldVH(@NotNull ItemFormBlockFieldTextBinding binding, @NotNull FormConfig formConfig, @NotNull final Function1<? super FieldAction, Unit> onAction) {
        super(r0, formConfig);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(formConfig, "formConfig");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        TextInputLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.phoneTextWatcher = new OzonPhoneNumberFormattingTextWatcher(false, 1, null);
        this.textWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.TextFieldVH$textWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                FormBuilderBlockVO.Field.TextField textField;
                ItemFormBlockFieldTextBinding itemFormBlockFieldTextBinding;
                Intrinsics.checkNotNullParameter(s11, "s");
                textField = TextFieldVH.this.currentItem;
                if (textField != null) {
                    if (!textField.getIsEnabled()) {
                        textField = null;
                    }
                    if (textField != null) {
                        Function1<FieldAction, Unit> function1 = onAction;
                        TextFieldVH textFieldVH = TextFieldVH.this;
                        function1.invoke(new FieldAction.TextChanged(textField, s11.toString()));
                        itemFormBlockFieldTextBinding = textFieldVH.binding;
                        TextInputLayout textInputLayout = itemFormBlockFieldTextBinding.fieldTil;
                        textInputLayout.Z(null);
                        textInputLayout.a0(false);
                    }
                }
            }
        };
        TextInputEditText fieldEt = binding.fieldEt;
        Intrinsics.checkNotNullExpressionValue(fieldEt, "fieldEt");
        EditTextExtKt.setupBackgroundForSelect(fieldEt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$4$lambda$3(ItemFormBlockFieldTextBinding itemFormBlockFieldTextBinding, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        itemFormBlockFieldTextBinding.fieldEt.clearFocus();
        TextInputEditText fieldEt = itemFormBlockFieldTextBinding.fieldEt;
        Intrinsics.checkNotNullExpressionValue(fieldEt, "fieldEt");
        KeyboardUtilsKt.hideKeyboard(fieldEt);
        return true;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldVH
    public void bind(@NotNull FormBuilderBlockVO.Field item) {
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        final ItemFormBlockFieldTextBinding itemFormBlockFieldTextBinding = this.binding;
        FormBuilderBlockVO.Field.TextField textField = (FormBuilderBlockVO.Field.TextField) item;
        this.currentItem = textField;
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ClickableCiewKt.switchActive(itemView, textField.getIsEnabled());
        itemFormBlockFieldTextBinding.fieldEt.setEnabled(textField.getIsEnabled());
        itemFormBlockFieldTextBinding.fieldEt.removeTextChangedListener(this.textWatcher);
        itemFormBlockFieldTextBinding.fieldEt.removeTextChangedListener(this.phoneTextWatcher);
        TextInputEditText textInputEditText = itemFormBlockFieldTextBinding.fieldEt;
        int i12 = WhenMappings.$EnumSwitchMapping$0[textField.getInputType().ordinal()];
        if (i12 != 1) {
            i11 = 2;
            if (i12 == 2) {
                i11 = 16385;
            } else if (i12 != 3) {
                if (i12 == 4) {
                    itemFormBlockFieldTextBinding.fieldEt.addTextChangedListener(this.phoneTextWatcher);
                    i11 = 3;
                } else {
                    if (i12 != 5) {
                        throw new o();
                    }
                    i11 = 33;
                }
            }
        } else {
            i11 = 147457;
        }
        textInputEditText.setInputType(i11);
        itemFormBlockFieldTextBinding.fieldEt.setText(textField.getText());
        String error = textField.getError();
        if (error != null) {
            itemFormBlockFieldTextBinding.fieldTil.Z(error);
        } else {
            itemFormBlockFieldTextBinding.fieldTil.a0(false);
            Unit unit = Unit.f71690a;
        }
        TextInputLayout textInputLayout = itemFormBlockFieldTextBinding.fieldTil;
        textInputLayout.d0(textField.getHint());
        textInputLayout.K(getFormConfig().getMode() == FormConfig.Mode.BORDER_FIELD ? a.getColor(this.itemView.getContext(), R$color.text_input_box_background_color) : 0);
        itemFormBlockFieldTextBinding.fieldEt.addTextChangedListener(this.textWatcher);
        itemFormBlockFieldTextBinding.fieldEt.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ho.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                boolean bind$lambda$4$lambda$3;
                bind$lambda$4$lambda$3 = TextFieldVH.bind$lambda$4$lambda$3(ItemFormBlockFieldTextBinding.this, textView, i13, keyEvent);
                return bind$lambda$4$lambda$3;
            }
        });
    }
}
