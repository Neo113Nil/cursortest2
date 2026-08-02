package ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014J0\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/presentation/TitleSubtitleView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "isVertical", "", "alignment", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "left", "top", "right", "bottom", "bind", "item", "Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/presentation/TitleSubtitleVO;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TitleSubtitleView extends ViewGroup {
    private static final int horizontalMargin;
    private static final int titleSubtitleMargin;
    private int alignment;
    private boolean isVertical;

    @NotNull
    private final TextAtomV2View subtitle;

    @NotNull
    private final TextAtomV2View title;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/presentation/TitleSubtitleView$Companion;", "", "<init>", "()V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        titleSubtitleMargin = dimens.getDP_4();
        horizontalMargin = dimens.getDP_8();
    }

    public /* synthetic */ TitleSubtitleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull TitleSubtitleVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(this.title, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitle, item.getSubtitle(), null, 2, null);
        this.alignment = item.getAlignment();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i11 = right - left;
        if (this.isVertical) {
            int paddingTop = getPaddingTop();
            int measuredWidth = this.alignment == 17 ? (i11 - this.title.getMeasuredWidth()) / 2 : getPaddingLeft();
            TextAtomV2View textAtomV2View = this.title;
            textAtomV2View.layout(measuredWidth, paddingTop, textAtomV2View.getMeasuredWidth() + measuredWidth, this.title.getMeasuredHeight() + paddingTop);
            int measuredHeight = this.title.getMeasuredHeight() + paddingTop;
            if (this.subtitle.getVisibility() == 0) {
                int measuredWidth2 = this.alignment == 17 ? (i11 - this.subtitle.getMeasuredWidth()) / 2 : getPaddingLeft();
                TextAtomV2View textAtomV2View2 = this.subtitle;
                textAtomV2View2.layout(measuredWidth2, measuredHeight, textAtomV2View2.getMeasuredWidth() + measuredWidth2, this.subtitle.getMeasuredHeight() + measuredHeight);
                return;
            }
            return;
        }
        int paddingTop2 = getPaddingTop();
        int measuredWidth3 = this.alignment == 17 ? (i11 - (this.title.getMeasuredWidth() + (this.subtitle.getVisibility() == 0 ? this.subtitle.getMeasuredWidth() + titleSubtitleMargin : 0))) / 2 : getPaddingLeft();
        int max = Math.max(this.title.getMeasuredHeight(), this.subtitle.getMeasuredHeight());
        int measuredHeight2 = max - this.title.getMeasuredHeight();
        int measuredHeight3 = max - this.subtitle.getMeasuredHeight();
        TextAtomV2View textAtomV2View3 = this.title;
        int i12 = measuredHeight2 + paddingTop2;
        textAtomV2View3.layout(measuredWidth3, i12, textAtomV2View3.getMeasuredWidth() + measuredWidth3, this.title.getMeasuredHeight() + i12);
        if (this.subtitle.getVisibility() == 0) {
            TextAtomV2View textAtomV2View4 = this.subtitle;
            int measuredWidth4 = this.title.getMeasuredWidth() + measuredWidth3;
            int i13 = titleSubtitleMargin;
            int i14 = paddingTop2 + measuredHeight3;
            textAtomV2View4.layout(measuredWidth4 + i13, i14, this.subtitle.getMeasuredWidth() + this.title.getMeasuredWidth() + measuredWidth3 + i13, this.subtitle.getMeasuredHeight() + i14);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureChildWithMargins(this.title, widthMeasureSpec, 0, heightMeasureSpec, 0);
        int measuredWidth = this.title.getMeasuredWidth();
        int measuredHeight = this.title.getMeasuredHeight();
        if (this.subtitle.getVisibility() == 0) {
            measureChildWithMargins(this.subtitle, widthMeasureSpec, 0, heightMeasureSpec, 0);
            measuredWidth += this.subtitle.getMeasuredWidth() + titleSubtitleMargin;
            measuredHeight = Math.max(measuredHeight, this.subtitle.getMeasuredHeight());
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        boolean z11 = measuredWidth > size - (horizontalMargin * 2);
        this.isVertical = z11;
        if (z11) {
            measuredWidth = size;
        }
        if (z11) {
            measuredHeight = this.title.getMeasuredHeight() + (this.subtitle.getVisibility() == 0 ? this.subtitle.getMeasuredHeight() : 0);
        }
        setMeasuredDimension(View.resolveSize(measuredWidth, widthMeasureSpec), View.resolveSize(measuredHeight, heightMeasureSpec));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleSubtitleView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        textAtomV2View.setId(R$id.titleSubtitleTitleTAV);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.title = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        textAtomV2View2.setId(R$id.titleSubtitleSubtitleTAV);
        textAtomV2View2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.subtitle = textAtomV2View2;
        this.alignment = 8388611;
        setId(R$id.titleSubtitleV);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int i12 = horizontalMargin;
        setPadding(i12, 0, i12, 0);
        addView(textAtomV2View);
        addView(textAtomV2View2);
    }
}
