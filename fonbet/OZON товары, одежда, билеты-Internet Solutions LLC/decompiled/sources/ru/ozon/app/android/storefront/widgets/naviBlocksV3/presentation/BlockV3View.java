package ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.R$style;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014J0\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014J\u000e\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/BlockV3View;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp76", "dp28", "dp16", "dp8", "dp2", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroidx/appcompat/widget/AppCompatTextView;", "subtitle", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "l", "t", "r", "b", "bind", "item", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/BlockV3VO;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlockV3View extends ViewGroup {
    private final int dp16;
    private final int dp2;
    private final int dp28;
    private final int dp76;
    private final int dp8;

    @NotNull
    private IconView icon;

    @NotNull
    private AppCompatTextView subtitle;

    @NotNull
    private AppCompatTextView title;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/BlockV3View$Companion;", "", "<init>", "()V", "TITLE_LOCATOR", "", "SUBTITLE_LOCATOR", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ BlockV3View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull BlockV3VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String backgroundColor = item.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.BG_PRIMARY.getToken();
        }
        Integer mapColor = styleParser.mapColor(context, backgroundColor);
        if (mapColor != null) {
            int intValue = mapColor.intValue();
            Drawable background = getBackground();
            Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            Drawable mutate = ((GradientDrawable) background).mutate();
            Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
            ColorStateList colorStateList = a.getColorStateList(getContext(), intValue);
            Intrinsics.g(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) mutate).setColor(colorStateList);
        }
        if (ExtensionsKt.isUrl(item.getIcon().getImage())) {
            ImageViewExtKt.load$default(this.icon, item.getIcon().getImage(), null, null, null, null, false, null, 126, null);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer iconResByToken = TokensExtKt.getIconResByToken(context2, item.getIcon().getImage());
            if (iconResByToken != null) {
                this.icon.setImageDrawable(C7232a.a(getContext(), iconResByToken.intValue()));
            }
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context3, item.getIcon().getTintColor());
        if (parseColor != null) {
            ThemeExtKt.tint(this.icon, Integer.valueOf(parseColor.intValue()));
        }
        AppCompatTextView appCompatTextView = this.title;
        appCompatTextView.setText(item.getTitle());
        appCompatTextView.setContentDescription(SelectionItemFormDTO.TITLE_FIELD_NAME);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        Context context4 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        TextViewExtKt.applyStyle(appCompatTextView, context4, R$style.OzonTextAppearance_Compact_400small);
        appCompatTextView.setTextAppearance(ru.ozon.uni.R$style.TextStyle_Body_M_Bold);
        Context context5 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        appCompatTextView.setTextColor(styleParser.parseColor(context5, item.getTitleColor(), R$color.text_primary));
        appCompatTextView.setMaxLines(1);
        AppCompatTextView appCompatTextView2 = this.subtitle;
        appCompatTextView2.setText(item.getSubtitle());
        appCompatTextView2.setContentDescription("subtitle");
        appCompatTextView2.setEllipsize(truncateAt);
        Context context6 = appCompatTextView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        TextViewExtKt.applyStyle(appCompatTextView2, context6, R$style.OzonTextAppearance_Compact_300xsmall);
        Context context7 = appCompatTextView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        appCompatTextView2.setTextColor(styleParser.parseColor(context7, item.getSubtitleColor(), R$color.text_secondary));
        appCompatTextView2.setMaxLines(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        IconView iconView = this.icon;
        int i11 = this.dp8;
        int i12 = this.dp28;
        iconView.layout(i11, i11, i12, i12);
        LayoutExtKt.layoutLeftTop(this.title, this.dp8, this.icon.getBottom() + this.dp8);
        LayoutExtKt.layoutLeftTop(this.subtitle, this.dp8, this.title.getBottom() + this.dp2);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        MeasureExtKt.measureUnspecified(this.icon);
        MeasureExtKt.measure(this.title, widthMeasureSpec - this.dp16, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        MeasureExtKt.measure(this.subtitle, widthMeasureSpec - this.dp16, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.dp76);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockV3View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp76 = UiExtKt.toPx(76, context);
        this.dp28 = UiExtKt.toPx(28, context);
        this.dp16 = UiExtKt.toPx(16, context);
        this.dp8 = UiExtKt.toPx(8, context);
        this.dp2 = UiExtKt.toPx(2, context);
        this.icon = new IconView(context, null, 0, 6, null);
        this.title = new AppCompatTextView(context);
        this.subtitle = new AppCompatTextView(context);
        addView(this.icon);
        addView(this.title);
        addView(this.subtitle);
        setBackground(new GradientDrawable());
    }
}
