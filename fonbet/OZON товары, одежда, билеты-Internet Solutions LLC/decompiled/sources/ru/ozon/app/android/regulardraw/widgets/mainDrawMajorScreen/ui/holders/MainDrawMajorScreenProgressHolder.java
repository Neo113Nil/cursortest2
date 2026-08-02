package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.holders;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.progressView.MainDrawMajorScreenProgressView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 02\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.¨\u00061"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/holders/MainDrawMajorScreenProgressHolder;", "", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;Lkotlin/jvm/functions/Function1;)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "left", "top", "right", "bottom", "onLayout", "(IIII)V", "getMeasuredHeight", "()Ljava/lang/Integer;", "percent", "", "text", "updateProgress", "(ILjava/lang/String;)V", "Landroid/view/ViewGroup;", "", "isVisible", "Z", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/progressView/MainDrawMajorScreenProgressView;", "progressView", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/progressView/MainDrawMajorScreenProgressView;", "Landroidx/appcompat/widget/AppCompatImageView;", "progressImage", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/appcompat/widget/AppCompatTextView;", "progressText", "Landroidx/appcompat/widget/AppCompatTextView;", "progressTextInfo", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MainDrawMajorScreenProgressHolder {
    private boolean isVisible;

    @NotNull
    private final ViewGroup parent;

    @NotNull
    private final AppCompatImageView progressImage;

    @NotNull
    private final AppCompatTextView progressText;

    @NotNull
    private final AppCompatTextView progressTextInfo;

    @NotNull
    private final MainDrawMajorScreenProgressView progressView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int progressImageHeight = ResourceExtKt.toPx(83);
    private static final int progressImageWidth = ResourceExtKt.toPx(70);
    private static final int progressImageRightMargin = ResourceExtKt.toPx(6);
    private static final int progressViewRightMargin = ResourceExtKt.toPx(16);
    private static final int progressViewHeight = ResourceExtKt.toPx(22);
    private static final int progressViewTopMargin = ResourceExtKt.toPx(12);
    private static final int progressTextTopMargin = ResourceExtKt.toPx(6);
    private static final int progressTextRightMargin = ResourceExtKt.toPx(8);
    private static final int progressBottomMargin = ResourceExtKt.toPx(11);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/holders/MainDrawMajorScreenProgressHolder$Companion;", "", "<init>", "()V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MainDrawMajorScreenProgressHolder(@NotNull Context context, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        MainDrawMajorScreenProgressView mainDrawMajorScreenProgressView = new MainDrawMajorScreenProgressView(context, null, 0, 0, 14, null);
        parent.addView(mainDrawMajorScreenProgressView);
        this.progressView = mainDrawMajorScreenProgressView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        parent.addView(appCompatImageView);
        this.progressImage = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        TextViewExtKt.applyStyle(appCompatTextView, context, R$style.Text_Body_Small);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setTextColor(UtilKt.parseColor(R$color.prize_progress_text_empty_color, context));
        parent.addView(appCompatTextView);
        this.progressText = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        TextViewExtKt.applyStyle(appCompatTextView2, context, R$style.Text_Body_Small);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setTextColor(UtilKt.parseColor(R$color.prize_progress_text_empty_color, context));
        parent.addView(appCompatTextView2);
        this.progressTextInfo = appCompatTextView2;
    }

    public void bind(@NotNull MainDrawMajorScreenVO.ProgressBlock item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        boolean z11 = item instanceof MainDrawMajorScreenVO.ProgressBlock.Progress;
        this.isVisible = z11;
        this.progressView.setVisibility(z11 ? 0 : 8);
        this.progressImage.setVisibility(this.isVisible ? 0 : 8);
        this.progressText.setVisibility(this.isVisible ? 0 : 8);
        this.progressTextInfo.setVisibility(this.isVisible ? 0 : 8);
        if (z11) {
            MainDrawMajorScreenVO.ProgressBlock.Progress progress = (MainDrawMajorScreenVO.ProgressBlock.Progress) item;
            this.progressView.bind(progress.getProgressBar());
            ImageViewExtKt.load$default(this.progressImage, progress.getLeftImage(), null, null, null, new ImageSize(progressImageWidth, progressImageHeight), false, null, 110, null);
            this.progressText.setText(progress.getCentralText());
            this.progressTextInfo.setText(progress.getRightFinalText());
        }
    }

    public Integer getMeasuredHeight() {
        if (this.isVisible) {
            return Integer.valueOf(progressImageHeight);
        }
        return null;
    }

    public void onLayout(int left, int top, int right, int bottom) {
        if (this.isVisible) {
            LayoutExtKt.layoutLeftTop(this.progressImage, left, top);
            LayoutExtKt.layoutLeftTop(this.progressView, this.progressImage.getRight() + progressImageRightMargin, top + progressViewTopMargin);
            AppCompatTextView appCompatTextView = this.progressTextInfo;
            int right2 = this.progressView.getRight();
            int bottom2 = this.progressView.getBottom();
            int i11 = progressTextTopMargin;
            LayoutExtKt.layoutRightTop(appCompatTextView, right2, bottom2 + i11);
            LayoutExtKt.layoutLeftTop(this.progressText, this.progressView.getLeft(), this.progressView.getBottom() + i11);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.isVisible) {
            int size = View.MeasureSpec.getSize(widthMeasureSpec);
            AppCompatImageView appCompatImageView = this.progressImage;
            int i11 = progressImageWidth;
            int i12 = progressImageHeight;
            MeasureExtKt.measureExactly(appCompatImageView, i11, i12);
            int i13 = ((size - i11) - progressImageRightMargin) - progressViewRightMargin;
            MainDrawMajorScreenProgressView mainDrawMajorScreenProgressView = this.progressView;
            int i14 = progressViewHeight;
            MeasureExtKt.measureExactly(mainDrawMajorScreenProgressView, i13, i14);
            int i15 = (((i12 - progressViewTopMargin) - i14) - progressTextTopMargin) - progressBottomMargin;
            MeasureExtKt.measureAtMost(this.progressTextInfo, this.progressView.getMeasuredWidth(), i15);
            MeasureExtKt.measureAtMost(this.progressText, this.progressView.getMeasuredWidth() - (this.progressTextInfo.getMeasuredWidth() > 0 ? this.progressTextInfo.getMeasuredWidth() + progressTextRightMargin : 0), i15);
        }
    }

    public final void updateProgress(int percent, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.progressView.updateWithAnimation(percent, text);
    }
}
