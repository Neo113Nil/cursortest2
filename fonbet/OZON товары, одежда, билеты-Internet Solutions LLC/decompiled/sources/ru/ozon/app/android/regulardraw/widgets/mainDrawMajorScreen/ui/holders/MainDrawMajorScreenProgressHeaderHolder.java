package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.holders;

import Gl.C3124a;
import IW.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0007\b\u0001\u0018\u0000 72\u00020\u0001:\u00017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/holders/MainDrawMajorScreenProgressHeaderHolder;", "", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "", "setPath", "()V", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;Lkotlin/jvm/functions/Function1;)V", "", "getMeasuredHeight", "()Ljava/lang/Integer;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "left", "top", "right", "bottom", "onLayout", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "Landroid/view/ViewGroup;", "Landroid/graphics/Paint;", "bgPaint", "Landroid/graphics/Paint;", "Landroidx/appcompat/widget/AppCompatTextView;", "infoText", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "infoIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/graphics/Path;", "bgPath", "Landroid/graphics/Path;", "", "radii", "[F", "getInfoLeftMargin", "()I", "infoLeftMargin", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MainDrawMajorScreenProgressHeaderHolder {

    @NotNull
    private final Paint bgPaint;

    @NotNull
    private final Path bgPath;

    @NotNull
    private final Context context;

    @NotNull
    private final AppCompatImageView infoIcon;

    @NotNull
    private final AppCompatTextView infoText;

    @NotNull
    private final ViewGroup parent;

    @NotNull
    private final float[] radii;
    public static final int $stable = 8;
    private static final float cornerRadius = ResourceExtKt.toPxF(6);
    private static final int infoIconWidth = ResourceExtKt.toPx(12);
    private static final int infoIconLeftMarginConst = ResourceExtKt.toPx(3);
    private static final int horizontalMargin = ResourceExtKt.toPx(6);
    private static final int textTopPadding = ResourceExtKt.toPx(2);

    public MainDrawMajorScreenProgressHeaderHolder(@NotNull Context context, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.context = context;
        this.parent = parent;
        Paint paint = new Paint(1);
        paint.setColor(UtilKt.parseColor(R$color.prize_progress_border_color, context));
        this.bgPaint = paint;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.progressInfoText);
        Context context2 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextViewExtKt.applyStyle(appCompatTextView, context2, R$style.Text_SemiBold_Small);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = R$color.prize_progress_info_text_color;
        Context context3 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        appCompatTextView.setTextColor(UtilKt.parseColor(i11, context3));
        appCompatTextView.setPadding(0, textTopPadding, 0, 0);
        parent.addView(appCompatTextView);
        this.infoText = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.progressInfoIcon);
        int i12 = R$color.prize_progress_info_icon_color;
        Context context4 = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ThemeExtKt.tint(appCompatImageView, Integer.valueOf(UtilKt.parseColor(i12, context4)));
        parent.addView(appCompatImageView);
        this.infoIcon = appCompatImageView;
        this.bgPath = new Path();
        float f7 = cornerRadius;
        this.radii = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$5(MainDrawMajorScreenVO.ProgressBlock progressBlock, Function1 function1, View view) {
        AtomAction infoAction = progressBlock.getInfoAction();
        if (infoAction != null) {
            function1.invoke(infoAction);
        }
    }

    private final int getInfoLeftMargin() {
        if (this.infoIcon.getVisibility() == 0) {
            return infoIconLeftMarginConst;
        }
        return 0;
    }

    private final void setPath() {
        this.bgPath.reset();
        Path path = this.bgPath;
        float left = this.infoText.getLeft();
        int i11 = horizontalMargin;
        path.addRoundRect(left - i11, this.infoText.getTop(), this.infoIcon.getRight() + i11, this.infoText.getBottom(), this.radii, Path.Direction.CW);
    }

    public void bind(@NotNull MainDrawMajorScreenVO.ProgressBlock item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.infoText.setText(item.getInfoText());
        ImageViewExtKt.loadImageOrGone(this.infoIcon, item.getInfoIcon());
        a aVar = new a(5, item, actionHandler);
        this.infoText.setOnClickListener(aVar);
        this.infoIcon.setOnClickListener(aVar);
    }

    public final void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.bgPath, this.bgPaint);
    }

    @NotNull
    public Integer getMeasuredHeight() {
        return Integer.valueOf(this.infoText.getMeasuredHeight());
    }

    public void onLayout(int left, int top, int right, int bottom) {
        int a11 = C3124a.a(right, left, 2, left);
        int measuredWidth = this.infoText.getMeasuredWidth() + getInfoLeftMargin();
        View ifNotGone = ViewExtKt.getIfNotGone(this.infoIcon);
        int measuredWidth2 = measuredWidth + (ifNotGone != null ? ifNotGone.getMeasuredWidth() : 0);
        int i11 = horizontalMargin;
        LayoutExtKt.layoutLeftTop(this.infoText, (a11 - (((i11 * 2) + measuredWidth2) / 2)) + i11, top);
        LayoutExtKt.layoutLeftTop(this.infoIcon, this.infoText.getRight() + getInfoLeftMargin(), (textTopPadding / 2) + ((this.infoText.getMeasuredHeight() / 2) - (this.infoIcon.getMeasuredHeight() / 2)));
        setPath();
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        View ifNotGone = ViewExtKt.getIfNotGone(this.infoIcon);
        if (ifNotGone != null) {
            int i11 = infoIconWidth;
            MeasureExtKt.measureExactly(ifNotGone, i11, i11);
        }
        this.infoText.measure(View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(widthMeasureSpec) - this.infoIcon.getMeasuredWidth()) - getInfoLeftMargin()) - (horizontalMargin * 2), LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
    }
}
