package ru.ozon.app.android.fresh.unsorted.widgets.separatorBadge.presentation;

import Gl.C3124a;
import Lm0.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014J0\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"J\u0014\u0010#\u001a\u00020\u0007*\u00020\u00032\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/separatorBadge/presentation/SeparatorBadgeView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "topPadding", "bottomPadding", "horizontalPadding", "mBackgroundColor", "paintLineColor", "getPaintLineColor", "()I", "lineView", "Landroid/view/View;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "bind", "item", "Lru/ozon/app/android/fresh/unsorted/widgets/separatorBadge/presentation/SeparatorBadgeVO;", "getDimenFromPadding", "padding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SeparatorBadgeView extends ViewGroup {

    @NotNull
    private final BadgeView badgeView;
    private int bottomPadding;
    private int horizontalPadding;

    @NotNull
    private final View lineView;
    private int mBackgroundColor;
    private int topPadding;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final ViewGroup.LayoutParams defaultLayoutParams = new ViewGroup.LayoutParams(-1, -2);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/separatorBadge/presentation/SeparatorBadgeView$Companion;", "", "<init>", "()V", "LINE_HEIGHT", "", "EMPTY_SIZE", "CENTER_TILE_TAG", "", "defaultLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "create", "Lru/ozon/app/android/fresh/unsorted/widgets/separatorBadge/presentation/SeparatorBadgeView;", "context", "Landroid/content/Context;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SeparatorBadgeView create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SeparatorBadgeView separatorBadgeView = new SeparatorBadgeView(context, null, 0, 6, null);
            separatorBadgeView.setLayoutParams(SeparatorBadgeView.defaultLayoutParams);
            return separatorBadgeView;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SeparatorBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final int getDimenFromPadding(Context context, CommonCellSettings.LayoutPadding layoutPadding) {
        return (int) context.getResources().getDimension(layoutPadding.getCellLayoutPadding());
    }

    private final int getPaintLineColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ThemeExtKt.themeColor(context, R$attr.graphicNeutral);
    }

    public final void bind(@NotNull SeparatorBadgeVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        try {
            BadgeHolderKt.bind$default(this.badgeView, item.getBadge(), (Function1) null, 2, (Object) null);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.topPadding = getDimenFromPadding(context, item.getTopPadding());
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.bottomPadding = getDimenFromPadding(context2, item.getBottomPadding());
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            this.horizontalPadding = getDimenFromPadding(context3, item.getHorizontalPadding());
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            this.mBackgroundColor = styleParser.parseColor(context4, item.getBackgroundColor(), UniColors.CLEAR_LIGHT_KEY_0.getResId());
            this.lineView.setBackgroundColor(getPaintLineColor());
            setBackgroundColor(this.mBackgroundColor);
            requestLayout();
        } catch (Exception e11) {
            a.f17149a.e(e11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int a11 = C3124a.a(getHeight() - this.topPadding, this.bottomPadding, 2, this.topPadding);
        this.lineView.layout(this.horizontalPadding, a11, getWidth() - this.horizontalPadding, this.lineView.getMeasuredHeight() + a11);
        int measuredWidth = this.badgeView.getMeasuredWidth();
        int measuredHeight = this.badgeView.getMeasuredHeight();
        int width = (getWidth() - measuredWidth) / 2;
        int height = ((((getHeight() - this.topPadding) - this.bottomPadding) - measuredHeight) / 2) + this.topPadding;
        this.badgeView.layout(width, height, measuredWidth + width, measuredHeight + height);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureChildWithMargins(this.badgeView, widthMeasureSpec, 0, heightMeasureSpec, 0);
        measureChildWithMargins(this.lineView, widthMeasureSpec, 0, heightMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), this.badgeView.getMeasuredHeight() + this.topPadding + this.bottomPadding);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mBackgroundColor = ThemeExtKt.themeColor(context, UniColors.CLEAR_LIGHT_KEY_0.getResId());
        View view = new View(context);
        view.setBackgroundColor(getPaintLineColor());
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, 1));
        this.lineView = view;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        this.badgeView = badgeView;
        addView(view);
        addView(badgeView);
        badgeView.setLocatorTag("separatorBadgeCenterTile");
    }
}
