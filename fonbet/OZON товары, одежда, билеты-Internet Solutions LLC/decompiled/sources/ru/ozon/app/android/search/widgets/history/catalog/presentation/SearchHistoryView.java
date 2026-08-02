package ru.ozon.app.android.search.widgets.history.catalog.presentation;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0014J0\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "getTitleTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "closeIconImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "getCloseIconImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "historyIconImageView", "divider", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "onAttachedToWindow", "", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchHistoryView extends ViewGroup {

    @NotNull
    private final AppCompatImageView closeIconImageView;

    @NotNull
    private final View divider;

    @NotNull
    private final AppCompatImageView historyIconImageView;

    @NotNull
    private final AppCompatTextView titleTextView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int historyIconSize = UiExtKt.toPx(24);
    private static final int historyIconEndMargin = UiExtKt.toPx(12);
    private static final int historyPadding = UiExtKt.toPx(4);
    private static final int closeIconSize = UiExtKt.toPx(16);
    private static final int closeIconStartMargin = UiExtKt.toPx(8);
    private static final int defaultContainerHeight = UiExtKt.toPx(44);
    private static final int containerHorizontalPadding = UiExtKt.toPx(16);
    private static final int dividerHeight = UiExtKt.toPx(1);
    private static final int dividerTopPadding = UiExtKt.toPx(11);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryView$Companion;", "", "<init>", "()V", "", "titleMaxLines", "I", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHistoryView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.titleTv);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setHorizontallyScrolling(false);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L);
        appCompatTextView.setSelected(true);
        addView(appCompatTextView);
        this.titleTextView = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.closeIv);
        appCompatImageView.setColorFilter(context.getColor(R$color.graphic_neutral), PorterDuff.Mode.SRC_IN);
        appCompatImageView.setImageResource(R$drawable.ic_s_cross);
        addView(appCompatImageView);
        this.closeIconImageView = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R$id.historyIv);
        appCompatImageView2.setImageResource(ru.ozon.app.android.search.R$drawable.ic_search_history_s);
        addView(appCompatImageView2);
        this.historyIconImageView = appCompatImageView2;
        View view = new View(context);
        view.setBackgroundColor(ResourceExtKt.color(context, R$color.graphic_neutral));
        addView(view);
        this.divider = view;
    }

    @NotNull
    public final AppCompatImageView getCloseIconImageView() {
        return this.closeIconImageView;
    }

    @NotNull
    public final View getDivider() {
        return this.divider;
    }

    @NotNull
    public final AppCompatTextView getTitleTextView() {
        return this.titleTextView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppCompatImageView appCompatImageView = this.historyIconImageView;
        int i11 = historyPadding;
        appCompatImageView.setPadding(i11, i11, i11, i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int measuredHeight = getMeasuredHeight() / 2;
        int i11 = containerHorizontalPadding;
        int i12 = historyIconSize;
        int i13 = i11 + i12;
        int i14 = measuredHeight - (i12 / 2);
        this.historyIconImageView.layout(i11, i14, i13, i12 + i14);
        int i15 = i13 + historyIconEndMargin;
        int measuredWidth = this.titleTextView.getMeasuredWidth() + i15;
        int measuredHeight2 = measuredHeight - (this.titleTextView.getMeasuredHeight() / 2);
        int measuredHeight3 = this.titleTextView.getMeasuredHeight() + measuredHeight2;
        this.titleTextView.layout(i15, measuredHeight2, measuredWidth, measuredHeight3);
        int i16 = measuredWidth + closeIconStartMargin;
        int i17 = closeIconSize;
        int i18 = measuredHeight - (i17 / 2);
        this.closeIconImageView.layout(i16, i18, i16 + i17, i17 + i18);
        int i19 = measuredHeight3 + dividerTopPadding;
        View ifNotGone = ViewExtKt.getIfNotGone(this.divider);
        if (ifNotGone != null) {
            ifNotGone.layout(i15, i19, this.divider.getMeasuredWidth() + i15, this.divider.getMeasuredHeight() + i19);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        AppCompatImageView appCompatImageView = this.historyIconImageView;
        int i11 = historyIconSize;
        MeasureExtKt.measureExactly(appCompatImageView, i11, i11);
        AppCompatImageView appCompatImageView2 = this.closeIconImageView;
        int i12 = closeIconSize;
        MeasureExtKt.measureExactly(appCompatImageView2, i12, i12);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int i13 = containerHorizontalPadding;
        int i14 = i11 + i13 + historyIconEndMargin;
        int i15 = closeIconStartMargin + i12 + i13;
        MeasureExtKt.measure(this.titleTextView, (size - i14) - i15, 1073741824, 0, 0);
        View ifNotGone = ViewExtKt.getIfNotGone(this.divider);
        if (ifNotGone != null) {
            MeasureExtKt.measureExactly(ifNotGone, this.titleTextView.getMeasuredWidth() + i15, dividerHeight);
        }
        int measuredHeight = this.titleTextView.getMeasuredHeight();
        int i16 = dividerTopPadding;
        setMeasuredDimension(size, Math.max(this.divider.getMeasuredHeight() + measuredHeight + i16 + i16, defaultContainerHeight));
    }
}
