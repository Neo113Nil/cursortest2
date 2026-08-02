package ru.ozon.app.android.partpayment.formpage.view.vh;

import Bm0.e;
import Dm0.b;
import Em0.d;
import Sc.o;
import ZB.a;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldMaskBinding;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R,\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/MaskFieldVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "Landroid/view/View;", "containerView", "Lkotlin/Function3;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "", "", "onFieldsChanged", "Lkotlin/Function2;", "", "onAutocompleteRequested", "<init>", "(Landroid/view/View;Lfd/n;Lkotlin/jvm/functions/Function2;)V", FormPageDTO.Field.FIELD_TYPE_MASK, "LBm0/e;", "convertMask", "(Ljava/lang/String;)LBm0/e;", "item", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lfd/n;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldMaskBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldMaskBinding;", "LEm0/d;", "watcher", "LEm0/d;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MaskFieldVH extends DynamicFormFieldVH {

    @NotNull
    private final ItemDynamicFormFieldMaskBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final Function2<DynamicFormFieldVH, String, Unit> onAutocompleteRequested;

    @NotNull
    private final InterfaceC6511n<DynamicFormFieldVH, FormPageVO.Field, Boolean, Unit> onFieldsChanged;

    @NotNull
    private final d watcher;

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
    public MaskFieldVH(@NotNull View containerView, @NotNull InterfaceC6511n<? super DynamicFormFieldVH, ? super FormPageVO.Field, ? super Boolean, Unit> onFieldsChanged, @NotNull Function2<? super DynamicFormFieldVH, ? super String, Unit> onAutocompleteRequested) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onFieldsChanged, "onFieldsChanged");
        Intrinsics.checkNotNullParameter(onAutocompleteRequested, "onAutocompleteRequested");
        this.containerView = containerView;
        this.onFieldsChanged = onFieldsChanged;
        this.onAutocompleteRequested = onAutocompleteRequested;
        ItemDynamicFormFieldMaskBinding bind = ItemDynamicFormFieldMaskBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        d dVar = new d(new e(new b[0], true));
        this.watcher = dVar;
        dVar.c(bind.fieldEt);
        bind.fieldEt.setOnFocusChangeListener(new a());
        bind.fieldEt.addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.partpayment.formpage.view.vh.MaskFieldVH.2
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                Intrinsics.checkNotNullParameter(s11, "s");
                FormPageVO.Field.Mask mask = (FormPageVO.Field.Mask) MaskFieldVH.this.getField();
                if (mask != null) {
                    MaskFieldVH maskFieldVH = MaskFieldVH.this;
                    String obj = s11.toString();
                    String str = mask.getAutocompleteUrl() != null ? obj : null;
                    if (s11.length() != maskFieldVH.watcher.b().getSize()) {
                        str = null;
                    }
                    if (str != null) {
                        maskFieldVH.onAutocompleteRequested.invoke(maskFieldVH, str);
                    }
                    maskFieldVH.onFieldsChanged.invoke(maskFieldVH, FormPageVO.Field.Mask.copy$default(mask, null, null, obj, obj, null, null, null, null, null, 499, null), Boolean.FALSE);
                }
                MaskFieldVH.this.binding.fieldTil.Z(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(View view, boolean z11) {
        if (z11) {
            Intrinsics.g(view, "null cannot be cast to non-null type android.widget.EditText");
            EditText editText = (EditText) view;
            editText.setSelection(editText.getText().length());
        }
    }

    private final e convertMask(String mask) {
        e eVar = new e((b[]) l.C(l.w(Regex.d(new Regex("\\\\d|\\\\a|\\\\\\.|."), mask), MaskFieldVH$convertMask$1.INSTANCE)).toArray(new b[0]), true);
        Intrinsics.checkNotNullExpressionValue(eVar, "let(...)");
        return eVar;
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH
    public void bind(@NotNull FormPageVO.Field item) {
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        FormPageVO.Field.Mask mask = (FormPageVO.Field.Mask) item;
        this.binding.fieldEt.setTag(mask.getFocusableViewTag());
        FormPageVO.Field field = getField();
        Intrinsics.g(field, "null cannot be cast to non-null type ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field.Mask");
        this.watcher.f(convertMask(((FormPageVO.Field.Mask) field).getMask()));
        TextInputEditText textInputEditText = this.binding.fieldEt;
        textInputEditText.setText(mask.getValue());
        textInputEditText.setContentDescription(mask.getTitle());
        int i12 = WhenMappings.$EnumSwitchMapping$0[mask.getKeyboardType().ordinal()];
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
            i11 = 16385;
        }
        textInputEditText.setInputType(i11);
        TextInputLayout textInputLayout = this.binding.fieldTil;
        textInputLayout.d0(mask.getTitle());
        textInputLayout.Z(mask.getError());
    }
}
