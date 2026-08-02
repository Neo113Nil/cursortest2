package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 T2\u00020\u0001:\u0001TB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J?\u0010*\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010&\u001a\u0004\u0018\u00010\u00062\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t0'¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103R\u0016\u00104\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u001b\u0010O\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bK\u0010L*\u0004\bM\u0010NR\u001b\u0010S\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bP\u0010Q*\u0004\bR\u0010N¨\u0006U"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/CommentFooterView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/atoms/data/common/Paddings;", "left", "right", "", "applyButtonMargins", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "top", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "bindIcon", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "leftPadding", "rightPadding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lkotlin/jvm/functions/Function1;)V", "", "colorToken", "setBackgroundToken", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "radius", "setCornerRadius", "(Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "backgroundCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundColorToken", "Ljava/lang/String;", "lastButtonMarginStart", "I", "lastButtonMarginEnd", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "titleBgBounds", "Landroid/graphics/RectF;", "buttonBgBounds", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "LSc/j;", "Lru/ozon/uni/android/atom/icon/IconView;", "iconViewDelegate", "LSc/j;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonViewDelegate", "getIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "getIconView$delegate", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/CommentFooterView;)Ljava/lang/Object;", "iconView", "getButtonView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButtonView$delegate", "buttonView", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentFooterView extends ViewGroup {
    private String backgroundColorToken;

    @NotNull
    private CornerRadius backgroundCornerRadius;

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final RectF buttonBgBounds;

    @NotNull
    private final InterfaceC4008j<ButtonV3View> buttonViewDelegate;

    @NotNull
    private final InterfaceC4008j<IconView> iconViewDelegate;
    private int lastButtonMarginEnd;
    private int lastButtonMarginStart;

    @NotNull
    private final RectF titleBgBounds;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final CornerRadius DEFAULT_CORNER_RADIUS = CornerRadius.RADIUS_350;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/CommentFooterView$Companion;", "", "<init>", "()V", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentFooterView(@NotNull Context context) {
        super(context);
        Context context2;
        TextAtomV2View textAtomV2View;
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundCornerRadius = DEFAULT_CORNER_RADIUS;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(StyleParser.INSTANCE.parseColor(context, (String) null, UniColors.CLEAR_LIGHT_KEY_400.getResId()));
        this.backgroundPaint = paint;
        this.titleBgBounds = new RectF();
        this.buttonBgBounds = new RectF();
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View2 == null) {
            context2 = context;
            textAtomV2View = new TextAtomV2View(context2, null, 0, 6, null);
        } else {
            context2 = context;
            textAtomV2View = textAtomV2View2;
        }
        textAtomV2View.setId(R$id.reviewGalleryCommentFooterTitle);
        Dimens dimens = Dimens.INSTANCE;
        ViewExtKt.updatePadding$default(textAtomV2View, 0, dimens.getDP_10(), 0, dimens.getDP_10(), 5, null);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        this.iconViewDelegate = DelegatesKt.lazyUnsafe(new CommentFooterView$special$$inlined$lazyView$1(this, context2));
        this.buttonViewDelegate = DelegatesKt.lazyUnsafe(new CommentFooterView$special$$inlined$lazyView$2(this, context2));
        setWillNotDraw(false);
    }

    private final void applyButtonMargins(Paddings left, Paddings right) {
        int px = left != null ? ResourceExtKt.toPx(left.getPx()) : 0;
        int px2 = right != null ? ResourceExtKt.toPx(right.getPx()) : 0;
        if (px == this.lastButtonMarginStart && px2 == this.lastButtonMarginEnd) {
            return;
        }
        this.lastButtonMarginStart = px;
        this.lastButtonMarginEnd = px2;
        requestLayout();
    }

    private final ButtonV3View getButtonView() {
        return this.buttonViewDelegate.getValue();
    }

    private final IconView getIconView() {
        return this.iconViewDelegate.getValue();
    }

    public final void bindButton(ButtonV3DTO button, Paddings leftPadding, Paddings rightPadding, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (button != null || this.buttonViewDelegate.isInitialized()) {
            ButtonV3HolderKt.bindOrGone(getButtonView(), button, onAction);
            getButtonView().setBackground(null);
            getButtonView().setHoverDisabled(true);
            if (button != null) {
                applyButtonMargins(leftPadding, rightPadding);
            }
        }
    }

    public final void bindIcon(IconDTO icon) {
        if (icon != null || this.iconViewDelegate.isInitialized()) {
            IconHolderKt.bindOrGone$default(getIconView(), icon, null, 2, null);
        }
    }

    public final void bindTitle(@NotNull TextDTO title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextHolderKt.bind$default(this.titleView, title, null, 2, null);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float pxF = ResourceExtKt.toPxF(this.backgroundCornerRadius.getPx());
        canvas.drawRoundRect(this.titleBgBounds, pxF, pxF, this.backgroundPaint);
        if (!this.buttonViewDelegate.isInitialized() || getButtonView().getVisibility() == 8) {
            return;
        }
        canvas.drawRoundRect(this.buttonBgBounds, pxF, pxF, this.backgroundPaint);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i11 = right - left;
        int i12 = bottom - top;
        if (this.buttonViewDelegate.isInitialized() && getButtonView().getVisibility() != 8) {
            int measuredWidth = getButtonView().getMeasuredWidth();
            int measuredHeight = getButtonView().getMeasuredHeight();
            int i13 = i11 - this.lastButtonMarginEnd;
            int i14 = i13 - measuredWidth;
            int i15 = (i12 - measuredHeight) / 2;
            getButtonView().layout(i14, i15, i13, measuredHeight + i15);
            this.buttonBgBounds.set(i14, 0.0f, i13, i12);
            i11 = i14 - this.lastButtonMarginStart;
        }
        this.titleBgBounds.set(0.0f, 0.0f, i11, i12);
        if (this.iconViewDelegate.isInitialized() && getIconView().getVisibility() != 8) {
            int measuredWidth2 = getIconView().getMeasuredWidth();
            int measuredHeight2 = getIconView().getMeasuredHeight();
            int dp_10 = i11 - Dimens.INSTANCE.getDP_10();
            int i16 = dp_10 - measuredWidth2;
            int i17 = (i12 - measuredHeight2) / 2;
            getIconView().layout(i16, i17, dp_10, measuredHeight2 + i17);
            i11 = i16;
        }
        int measuredHeight3 = this.titleView.getMeasuredHeight();
        int i18 = (i12 - measuredHeight3) / 2;
        this.titleView.layout(0, i18, i11, measuredHeight3 + i18);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11;
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        Dimens dimens = Dimens.INSTANCE;
        int dp_36 = dimens.getDP_36();
        if (!this.buttonViewDelegate.isInitialized() || getButtonView().getVisibility() == 8) {
            i11 = 0;
        } else {
            getButtonView().measure(mode == 0 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(size, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = getButtonView().getMeasuredWidth() + this.lastButtonMarginStart + this.lastButtonMarginEnd;
            dp_36 = Math.max(dp_36, getButtonView().getMeasuredHeight());
        }
        if (this.iconViewDelegate.isInitialized() && getIconView().getVisibility() != 8) {
            getIconView().measure(mode == 0 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - i11), LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 += dimens.getDP_10() + getIconView().getMeasuredWidth();
            dp_36 = Math.max(dp_36, getIconView().getMeasuredHeight());
        }
        this.titleView.measure(mode == 0 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - i11), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int max = Math.max(dp_36, this.titleView.getMeasuredHeight());
        int measuredWidth = this.titleView.getMeasuredWidth() + i11;
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, measuredWidth);
        } else if (mode != 1073741824) {
            size = measuredWidth;
        }
        setMeasuredDimension(size, View.resolveSize(max, heightMeasureSpec));
    }

    public final void setBackgroundToken(String colorToken) {
        if (Intrinsics.d(colorToken, this.backgroundColorToken)) {
            return;
        }
        this.backgroundColorToken = colorToken;
        Paint paint = this.backgroundPaint;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(styleParser.parseColor(context, colorToken, UniColors.CLEAR_LIGHT_KEY_400.getResId()));
        invalidate();
    }

    public final void setCornerRadius(CornerRadius radius) {
        if (radius == null) {
            radius = DEFAULT_CORNER_RADIUS;
        }
        if (radius == this.backgroundCornerRadius) {
            return;
        }
        this.backgroundCornerRadius = radius;
        invalidate();
    }
}
