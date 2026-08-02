package ru.ozon.app.android.cml.delivery.widgets.input.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.CommonControlSettingsExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.cell.label.data.LabelAddonWrapperPreset;
import ru.ozon.uni.android.cell.label.data.SmartLabelPresets;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPreset;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.data.TextInputStyle;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonSettings;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonWrapperSettings;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "input", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "getInput", "()Lru/ozon/uni/android/cell/text/TextFieldCellView;", "bind", "", "item", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputContainerView extends FrameLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final TextFieldPreset inputPreset = new TextFieldPreset(TextInputStyle.INSTANCE.createInput600Style(), new LabelAddonWrapperPreset(MainAddonSettings.copy$default(MainAddonWrapperSettings.INSTANCE.getVerticalEnd500Compact(), null, null, null, null, null, 0, 0, new LayoutPadding.zero(), null, null, 895, null), SmartLabelPresets.INSTANCE.getLeadingSubtitle300()));

    @NotNull
    private final TextFieldCellView input;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputContainerView$Companion;", "", "<init>", "()V", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ InputContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull InputWidgetVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setContentDescription(CommonControlSettingsExtKt.getAutomatizationId(item.getCommon()));
        int px = item.getTopPadding().getPx();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px2 = ResourceExtKt.toPx(px, context);
        int px3 = item.getRightPadding().getPx();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px4 = ResourceExtKt.toPx(px3, context2);
        int px5 = item.getBottomPadding().getPx();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px6 = ResourceExtKt.toPx(px5, context3);
        int px7 = item.getLeftPadding().getPx();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ViewExtKt.updatePadding(this, ResourceExtKt.toPx(px7, context4), px2, px4, px6);
        String backgroundColor = item.getBackgroundColor();
        if (backgroundColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            setBackgroundColor(styleParser.parseColor(context5, backgroundColor, R$color.layer_floor_1));
        }
    }

    @NotNull
    public final TextFieldCellView getInput() {
        return this.input;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputContainerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextFieldCellView textFieldCellView = new TextFieldCellView(context, null, 0, 0, null, false, 62, null);
        textFieldCellView.setId(View.generateViewId());
        textFieldCellView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textFieldCellView.setPreset(inputPreset);
        textFieldCellView.setInputKeyboardAction(OzonTextInputLayoutModel.KeyboardAction.DONE);
        addView(textFieldCellView);
        this.input = textFieldCellView;
    }
}
