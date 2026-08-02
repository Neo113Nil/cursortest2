package ru.ozon.app.android.regulardraw.ui.indicator;

import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorAtomDTO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0001\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0014J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0012\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0019\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0002\u0010\"R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorView;", "Landroid/widget/FrameLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewWidth", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO$Size;", "size", "setSize", "(Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO$Size;)V", "indicatorTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "indicatorImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "bind", "dto", "Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "bindOrGone", "setText", "text", "", "getTextSize", "", "(Ljava/lang/String;)Ljava/lang/Float;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class IndicatorView extends FrameLayout implements AtomView {

    @NotNull
    private final AppCompatImageView indicatorImageView;

    @NotNull
    private final AppCompatTextView indicatorTextView;

    @NotNull
    private IndicatorAtomDTO.Size size;
    private int viewWidth;
    public static final int $stable = 8;
    private static final int widthLarge = UiExtKt.toPx(32);
    private static final int widthSmall = UiExtKt.toPx(15);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndicatorAtomDTO.Size.values().length];
            try {
                iArr[IndicatorAtomDTO.Size.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndicatorAtomDTO.Size.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndicatorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Float getTextSize(String text) {
        if (text == null) {
            return null;
        }
        int length = text.length();
        if (length == 1) {
            return Float.valueOf(20.0f);
        }
        if (length == 2) {
            return Float.valueOf(16.0f);
        }
        if (length != 3) {
            return null;
        }
        return Float.valueOf(12.0f);
    }

    private final void setSize(IndicatorAtomDTO.Size size) {
        int i11;
        this.size = size;
        int i12 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
        if (i12 == 1) {
            i11 = widthLarge;
        } else {
            if (i12 != 2) {
                throw new o();
            }
            i11 = widthSmall;
        }
        this.viewWidth = i11;
        AppCompatImageView appCompatImageView = this.indicatorImageView;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i13 = this.viewWidth;
        layoutParams2.width = i13;
        layoutParams2.height = i13;
        appCompatImageView.setLayoutParams(layoutParams2);
    }

    private final void setText(String text) {
        Float textSize = getTextSize(text);
        AppCompatTextView appCompatTextView = this.indicatorTextView;
        if (textSize == null) {
            ViewExtKt.gone(appCompatTextView);
            return;
        }
        appCompatTextView.setText(text);
        appCompatTextView.setTextSize(1, textSize.floatValue());
        ViewExtKt.show(appCompatTextView);
    }

    public final void bind(@NotNull IndicatorAtomDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        AppCompatImageView appCompatImageView = this.indicatorImageView;
        String bgImage = dto.getBgImage();
        int i11 = this.viewWidth;
        ImageViewExtKt.load$default(appCompatImageView, bgImage, null, null, null, new ImageSize(i11, i11), false, null, 110, null);
        setSize(dto.getSize());
        setText(this.size == IndicatorAtomDTO.Size.LARGE ? dto.getText() : null);
    }

    public final void bindOrGone(IndicatorAtomDTO dto) {
        if (dto == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(dto);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int i11 = this.viewWidth;
        setMeasuredDimension(i11, i11);
    }

    public /* synthetic */ IndicatorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewWidth = widthLarge;
        this.size = IndicatorAtomDTO.Size.LARGE;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextAppearance(R$style.Text_Bold);
        appCompatTextView.setTextAlignment(4);
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextIsSelectable(false);
        appCompatTextView.setTextColor(context.getColor(UniColors.BG_LIGHT_KEY.getResId()));
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.indicatorTextView = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        int i12 = this.viewWidth;
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(i12, i12, 17));
        this.indicatorImageView = appCompatImageView;
        addView(appCompatImageView);
        addView(appCompatTextView);
    }
}
