package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields;

import Hx.ViewOnClickListenerC3169a;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.extensions.ClickableCiewKt;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormConfig;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldAction;
import ru.ozon.app.android.map.R$dimen;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldSearchBinding;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/YandexSearchFieldVH;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldVH;", "binding", "Lru/ozon/app/android/map/databinding/ItemFormBlockFieldSearchBinding;", "formConfig", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "onAction", "Lkotlin/Function1;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "", "<init>", "(Lru/ozon/app/android/map/databinding/ItemFormBlockFieldSearchBinding;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;Lkotlin/jvm/functions/Function1;)V", "currentItem", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField;", "verticalEdgeMargin", "", "defaultPadding", "hintOffset", "bind", "item", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "Companion", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YandexSearchFieldVH extends FieldVH {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float SELECT_CORNER_RADIUS = ResourceExtKt.toPxF(CornerRadius.RADIUS_500.getPx());

    @NotNull
    private final ItemFormBlockFieldSearchBinding binding;
    private FormBuilderBlockVO.Field.YandexSearchField currentItem;
    private final int defaultPadding;
    private final int hintOffset;
    private final int verticalEdgeMargin;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/YandexSearchFieldVH$Companion;", "", "<init>", "()V", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public YandexSearchFieldVH(@NotNull ItemFormBlockFieldSearchBinding binding, @NotNull FormConfig formConfig, @NotNull Function1<? super FieldAction, Unit> onAction) {
        super(r0, formConfig);
        int px;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(formConfig, "formConfig");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        int i11 = WhenMappings.$EnumSwitchMapping$0[formConfig.getMode().ordinal()];
        if (i11 == 1) {
            px = ResourceExtKt.toPx(4);
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new o();
            }
            px = binding.getConstraintLayout().getContext().getResources().getDimensionPixelSize(R$dimen.checkout_form_builder_field_vertical_padding);
        }
        this.verticalEdgeMargin = px;
        this.defaultPadding = binding.getConstraintLayout().getResources().getDimensionPixelSize(R$dimen.checkout_form_builder_field_vertical_padding);
        this.hintOffset = binding.getConstraintLayout().getResources().getDimensionPixelSize(R$dimen.checkout_form_builder_field_hint_vertical_offset);
        binding.getConstraintLayout().setOnClickListener(new ViewOnClickListenerC3169a(2, this, onAction));
        FrameLayout fieldBackgroundFl = binding.fieldBackgroundFl;
        Intrinsics.checkNotNullExpressionValue(fieldBackgroundFl, "fieldBackgroundFl");
        ViewExtKt.showOrGone(fieldBackgroundFl, Boolean.valueOf(formConfig.getMode() == FormConfig.Mode.BORDER_FIELD));
        Context context = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (UniGlobalConfigKt.getRoundCornersFlag(context)) {
            Drawable background = binding.fieldBackgroundFl.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(SELECT_CORNER_RADIUS);
            }
        }
        binding.titleTv.setPadding(0, px, 0, px);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(YandexSearchFieldVH yandexSearchFieldVH, Function1 function1, View view) {
        FormBuilderBlockVO.Field.YandexSearchField yandexSearchField = yandexSearchFieldVH.currentItem;
        if (yandexSearchField != null) {
            if (!yandexSearchField.getIsEnabled()) {
                yandexSearchField = null;
            }
            if (yandexSearchField != null) {
                function1.invoke(new FieldAction.Click(yandexSearchField));
            }
        }
    }

    @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldVH
    public void bind(@NotNull FormBuilderBlockVO.Field item) {
        Unit unit;
        Intrinsics.checkNotNullParameter(item, "item");
        ItemFormBlockFieldSearchBinding itemFormBlockFieldSearchBinding = this.binding;
        FormBuilderBlockVO.Field.YandexSearchField yandexSearchField = (FormBuilderBlockVO.Field.YandexSearchField) item;
        this.currentItem = yandexSearchField;
        int i11 = WhenMappings.$EnumSwitchMapping$0[getFormConfig().getMode().ordinal()];
        if (i11 == 1) {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ClickableCiewKt.switchActive(itemView, yandexSearchField.getIsEnabled());
            View itemView2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            ClickableCiewKt.switchBluewaveRectRipple(itemView2, false);
            FrameLayout fieldBackgroundFl = itemFormBlockFieldSearchBinding.fieldBackgroundFl;
            Intrinsics.checkNotNullExpressionValue(fieldBackgroundFl, "fieldBackgroundFl");
            ClickableCiewKt.switchForegroundBluewaveRoundedRipple(fieldBackgroundFl, yandexSearchField.getIsEnabled());
            unit = Unit.f71690a;
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new o();
            }
            View itemView3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            ClickableCiewKt.switchClickable(itemView3, yandexSearchField.getIsEnabled());
            FrameLayout fieldBackgroundFl2 = itemFormBlockFieldSearchBinding.fieldBackgroundFl;
            Intrinsics.checkNotNullExpressionValue(fieldBackgroundFl2, "fieldBackgroundFl");
            ClickableCiewKt.switchForegroundBluewaveRoundedRipple(fieldBackgroundFl2, false);
            unit = Unit.f71690a;
        }
        WhenExtKt.getExhaustive(unit);
        if (h.K(yandexSearchField.getText())) {
            TextView textView = itemFormBlockFieldSearchBinding.titleTv;
            int i12 = this.defaultPadding;
            textView.setPadding(0, i12, 0, i12);
            TextView hintTv = itemFormBlockFieldSearchBinding.hintTv;
            Intrinsics.checkNotNullExpressionValue(hintTv, "hintTv");
            ViewExtKt.gone(hintTv);
            itemFormBlockFieldSearchBinding.titleTv.setText(yandexSearchField.getHint());
            itemFormBlockFieldSearchBinding.titleTv.setTextAppearance(R$style.TextStyle_Body_L_Gray60);
        } else {
            TextView textView2 = itemFormBlockFieldSearchBinding.titleTv;
            int i13 = this.defaultPadding;
            int i14 = this.hintOffset;
            textView2.setPadding(0, i13 + i14, 0, i13 - i14);
            itemFormBlockFieldSearchBinding.hintTv.setText(yandexSearchField.getHint());
            TextView hintTv2 = itemFormBlockFieldSearchBinding.hintTv;
            Intrinsics.checkNotNullExpressionValue(hintTv2, "hintTv");
            ViewExtKt.show(hintTv2);
            itemFormBlockFieldSearchBinding.titleTv.setText(yandexSearchField.getText());
            itemFormBlockFieldSearchBinding.titleTv.setTextAppearance(yandexSearchField.getIsEnabled() ? R$style.TextStyle_Body_L : R$style.TextStyle_Body_L_Gray60);
        }
        TextView textView3 = itemFormBlockFieldSearchBinding.errorTv;
        Intrinsics.f(textView3);
        ViewExtKt.showOrGone(textView3, Boolean.valueOf(yandexSearchField.getError() != null));
        textView3.setText(yandexSearchField.getError());
    }
}
