package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields;

import Gw.ViewOnClickListenerC3131a;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.extensions.ClickableCiewKt;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormConfig;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldAction;
import ru.ozon.app.android.map.R$drawable;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldActionBinding;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\rH\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/ActionFieldVH;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldVH;", "binding", "Lru/ozon/app/android/map/databinding/ItemFormBlockFieldActionBinding;", "formConfig", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "onAction", "Lkotlin/Function1;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "", "<init>", "(Lru/ozon/app/android/map/databinding/ItemFormBlockFieldActionBinding;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;Lkotlin/jvm/functions/Function1;)V", "currentItem", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ActionField;", "bind", "item", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "getTitleTextAppearance", "", "getTitleText", "", "getErrorSeparatorBackgroundColor", "context", "Landroid/content/Context;", "getErrorSeparatorVisibility", "", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionFieldVH extends FieldVH {

    @NotNull
    private final ItemFormBlockFieldActionBinding binding;
    private FormBuilderBlockVO.Field.ActionField currentItem;

    @NotNull
    private final Function1<FieldAction, Unit> onAction;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormConfig.Mode.values().length];
            try {
                iArr[FormConfig.Mode.BORDER_FIELD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormConfig.Mode.BORDERLESS_FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormConfig.Mode.BORDERLESS_GRAY_FIELD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActionFieldVH(@NotNull ItemFormBlockFieldActionBinding binding, @NotNull FormConfig formConfig, @NotNull Function1<? super FieldAction, Unit> onAction) {
        super(r0, formConfig);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(formConfig, "formConfig");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.onAction = onAction;
        binding.getConstraintLayout().setOnClickListener(new ViewOnClickListenerC3131a(this, 8));
        FrameLayout fieldBackgroundFl = binding.fieldBackgroundFl;
        Intrinsics.checkNotNullExpressionValue(fieldBackgroundFl, "fieldBackgroundFl");
        ViewExtKt.showOrGone(fieldBackgroundFl, Boolean.valueOf(formConfig.getMode() != FormConfig.Mode.BORDERLESS_FIELD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ActionFieldVH actionFieldVH, View view) {
        FormBuilderBlockVO.Field.ActionField actionField = actionFieldVH.currentItem;
        if (actionField != null) {
            if (!actionField.getIsEnabled()) {
                actionField = null;
            }
            if (actionField != null) {
                actionFieldVH.onAction.invoke(new FieldAction.Click(actionField));
            }
        }
    }

    private final int getErrorSeparatorBackgroundColor(Context context, FormBuilderBlockVO.Field.ActionField item) {
        return a.getColor(context, item.getError() != null ? R$color.oz_semantic_accent_alert : ru.ozon.app.android.uikit.R$color.text_input_control_color);
    }

    private final boolean getErrorSeparatorVisibility(FormBuilderBlockVO.Field.ActionField item) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getFormConfig().getMode().ordinal()];
        boolean z11 = true;
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new o();
            }
            if (item.getError() == null) {
                z11 = false;
            }
        }
        return ((Boolean) WhenExtKt.getExhaustive(Boolean.valueOf(z11))).booleanValue();
    }

    private final CharSequence getTitleText(FormBuilderBlockVO.Field.ActionField item) {
        return h.K(item.getText()) ? item.getHint() : item.getText();
    }

    private final int getTitleTextAppearance(FormBuilderBlockVO.Field.ActionField item) {
        return h.K(item.getText()) ? R$style.TextStyle_Body_L_Gray60 : getFormConfig().getMode() != FormConfig.Mode.BORDER_FIELD ? R$style.TextStyle_Body : item.getIsEnabled() ? R$style.TextStyle_Body_L : R$style.TextStyle_Body_L_Gray60;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldVH
    public void bind(@NotNull FormBuilderBlockVO.Field item) {
        Unit unit;
        Intrinsics.checkNotNullParameter(item, "item");
        ItemFormBlockFieldActionBinding itemFormBlockFieldActionBinding = this.binding;
        if (item instanceof FormBuilderBlockVO.Field.ActionField) {
            FormBuilderBlockVO.Field.ActionField actionField = (FormBuilderBlockVO.Field.ActionField) item;
            this.currentItem = actionField;
            int i11 = WhenMappings.$EnumSwitchMapping$0[getFormConfig().getMode().ordinal()];
            if (i11 == 1) {
                View itemView = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                ClickableCiewKt.switchActive(itemView, actionField.getIsEnabled());
                View itemView2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                ClickableCiewKt.switchBluewaveRectRipple(itemView2, false);
                FrameLayout fieldBackgroundFl = itemFormBlockFieldActionBinding.fieldBackgroundFl;
                Intrinsics.checkNotNullExpressionValue(fieldBackgroundFl, "fieldBackgroundFl");
                ClickableCiewKt.switchForegroundBluewaveRoundedRipple(fieldBackgroundFl, actionField.getIsEnabled());
                unit = Unit.f71690a;
            } else if (i11 == 2) {
                View itemView3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                ClickableCiewKt.switchClickable(itemView3, actionField.getIsEnabled());
                FrameLayout fieldBackgroundFl2 = itemFormBlockFieldActionBinding.fieldBackgroundFl;
                Intrinsics.checkNotNullExpressionValue(fieldBackgroundFl2, "fieldBackgroundFl");
                ClickableCiewKt.switchForegroundBluewaveRoundedRipple(fieldBackgroundFl2, false);
                unit = Unit.f71690a;
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                View itemView4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                ClickableCiewKt.switchClickable(itemView4, actionField.getIsEnabled());
                itemFormBlockFieldActionBinding.fieldBackgroundFl.setBackground(g.d(this.itemView.getContext().getResources(), R$drawable.fake_field_background_round_corners, this.itemView.getContext().getTheme()));
                FrameLayout fieldBackgroundFl3 = itemFormBlockFieldActionBinding.fieldBackgroundFl;
                Intrinsics.checkNotNullExpressionValue(fieldBackgroundFl3, "fieldBackgroundFl");
                ClickableCiewKt.switchForegroundBluewaveRoundedRipple(fieldBackgroundFl3, false);
                unit = Unit.f71690a;
            }
            WhenExtKt.getExhaustive(unit);
            itemFormBlockFieldActionBinding.hintTv.setText(actionField.getHint());
            itemFormBlockFieldActionBinding.titleTv.setTextAppearance(getTitleTextAppearance(actionField));
            itemFormBlockFieldActionBinding.titleTv.setText(getTitleText(actionField));
            TextView textView = itemFormBlockFieldActionBinding.errorTv;
            Intrinsics.f(textView);
            ViewExtKt.showOrGone(textView, Boolean.valueOf(actionField.getError() != null));
            textView.setText(actionField.getError());
            View view = itemFormBlockFieldActionBinding.errorSeparatorV;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackgroundColor(getErrorSeparatorBackgroundColor(context, actionField));
            View errorSeparatorV = itemFormBlockFieldActionBinding.errorSeparatorV;
            Intrinsics.checkNotNullExpressionValue(errorSeparatorV, "errorSeparatorV");
            ViewExtKt.showOrGone(errorSeparatorV, Boolean.valueOf(getErrorSeparatorVisibility(actionField)));
            ImageView pickerIv = itemFormBlockFieldActionBinding.pickerIv;
            Intrinsics.checkNotNullExpressionValue(pickerIv, "pickerIv");
            ViewExtKt.showOrGone(pickerIv, Boolean.valueOf(actionField.getIsEnabled()));
        }
    }
}
