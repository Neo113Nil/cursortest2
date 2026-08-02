package ru.ozon.app.android.search.widgets.title.presentation;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$string;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J0\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "getTitleTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "clearTextView", "getClearTextView", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchTitleView extends ViewGroup {

    @NotNull
    private final AppCompatTextView clearTextView;

    @NotNull
    private final AppCompatTextView titleTextView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int containerHorizontalPadding = UiExtKt.toPx(16);
    private static final int containerTopPadding = UiExtKt.toPx(12);
    private static final int containerBottomPadding = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleView$Companion;", "", "<init>", "()V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTitleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.titleTv);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_M_Bold);
        addView(appCompatTextView);
        this.titleTextView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R$id.closeTv);
        appCompatTextView2.setText(StringProvider.getString(R$string.search_clear));
        appCompatTextView2.setBackground(a.getDrawable(context, R$drawable.bg_ripple_blue_rounded));
        appCompatTextView2.setTextAppearance(R$style.TextStyle_Body_M);
        addView(appCompatTextView2);
        this.clearTextView = appCompatTextView2;
    }

    @NotNull
    public final AppCompatTextView getClearTextView() {
        return this.clearTextView;
    }

    @NotNull
    public final AppCompatTextView getTitleTextView() {
        return this.titleTextView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        AppCompatTextView appCompatTextView = this.titleTextView;
        int i11 = containerHorizontalPadding;
        int i12 = containerTopPadding;
        appCompatTextView.layout(i11, i12, appCompatTextView.getMeasuredWidth() + i11, this.titleTextView.getMeasuredHeight() + i12);
        int measuredWidth = getMeasuredWidth() - i11;
        AppCompatTextView appCompatTextView2 = this.clearTextView;
        appCompatTextView2.layout(measuredWidth - appCompatTextView2.getMeasuredWidth(), i12, measuredWidth, this.clearTextView.getMeasuredHeight() + i12);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        MeasureExtKt.measureUnspecified(this.clearTextView);
        MeasureExtKt.measureUnspecified(this.titleTextView);
        setMeasuredDimension(size, this.clearTextView.getMeasuredHeight() + containerBottomPadding + containerTopPadding);
    }
}
