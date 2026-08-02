package ru.ozon.app.android.commonwidgets.widgets.logosList.presentation.view;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.commonwidgets.R$id;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/view/LogosListItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textTv", "Landroid/widget/TextView;", "getTextTv", "()Landroid/widget/TextView;", "subtextTv", "getSubtextTv", "setupBackground", "", "appType", "Lru/ozon/app/android/utils/AppType;", "createBackgroundSelector", "Landroid/graphics/drawable/StateListDrawable;", "radius", "", "activeStrokeColor", "createRippleDrawable", "Landroid/graphics/drawable/RippleDrawable;", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LogosListItemView extends LinearLayout {

    @NotNull
    private final TextView subtextTv;

    @NotNull
    private final TextView textTv;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int STROKE_WIDTH = ResourceExtKt.toPx(2);
    private static final float SELECT_RADIUS = ResourceExtKt.toPxF(10);
    private static final float BO_RADIUS = ResourceExtKt.toPxF(6);
    private static final int VIEW_HEIGHT = ResourceExtKt.toPx(48);
    private static final int HORIZONTAL_PADDING = ResourceExtKt.toPx(12);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/view/LogosListItemView$Companion;", "", "<init>", "()V", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ LogosListItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final StateListDrawable createBackgroundSelector(float radius, int activeStrokeColor) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(radius);
        int i11 = STROKE_WIDTH;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setStroke(i11, ThemeExtKt.themeColor(context, R$attr.oz_semantic_separator));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        gradientDrawable.setColor(ThemeExtKt.themeColor(context2, R$attr.oz_semantic_bg_secondary));
        stateListDrawable.addState(new int[]{-16842913}, gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(radius);
        gradientDrawable2.setStroke(i11, activeStrokeColor);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        gradientDrawable2.setColor(ThemeExtKt.themeColor(context3, R$attr.oz_semantic_bg_secondary));
        stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
        return stateListDrawable;
    }

    private final RippleDrawable createRippleDrawable(float radius) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(radius);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.oz_semantic_bg_secondary));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new RippleDrawable(ColorStateList.valueOf(ThemeExtKt.themeColor(context2, R$attr.oz_semantic_accent_primary_pale)), null, gradientDrawable);
    }

    @NotNull
    public final TextView getSubtextTv() {
        return this.subtextTv;
    }

    @NotNull
    public final TextView getTextTv() {
        return this.textTv;
    }

    public final void setupBackground(@NotNull AppType appType) {
        int themeColor;
        Intrinsics.checkNotNullParameter(appType, "appType");
        boolean z11 = appType == AppType.SELECT;
        float f7 = z11 ? SELECT_RADIUS : BO_RADIUS;
        if (z11) {
            themeColor = getContext().getColor(UniColors.TEXT_ACTION.getResId());
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context, R$attr.textAction);
        }
        setBackground(createBackgroundSelector(f7, themeColor));
        setForeground(createRippleDrawable(f7));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogosListItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.logosListTextViewId);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_M_Bold);
        addView(appCompatTextView);
        this.textTv = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R$id.logosListSubTextViewId);
        appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView2.setTextAppearance(R$style.TextStyle_Caption);
        appCompatTextView2.setTextColor(ThemeExtKt.themeColor(context, R$attr.oz_semantic_text_secondary));
        addView(appCompatTextView2);
        this.subtextTv = appCompatTextView2;
        setId(R$id.logoLl);
        setLayoutParams(new LinearLayout.LayoutParams(-2, VIEW_HEIGHT));
        setOrientation(1);
        setGravity(16);
        int i12 = HORIZONTAL_PADDING;
        setPadding(i12, 0, i12, 0);
    }
}
