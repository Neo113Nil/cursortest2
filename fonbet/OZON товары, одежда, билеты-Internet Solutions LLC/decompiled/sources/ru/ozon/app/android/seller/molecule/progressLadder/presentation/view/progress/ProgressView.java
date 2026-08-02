package ru.ozon.app.android.seller.molecule.progressLadder.presentation.view.progress;

import P9.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.h;
import l1.C7791I;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.ui.R$id;
import ru.ozon.app.android.seller.molecule.progressLadder.data.ProgressLadderDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/seller/molecule/progressLadder/presentation/view/progress/ProgressView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO;", "dto", "bind", "(Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO;)V", "Landroid/content/Context;", "", "cornerRadius$delegate", "LSc/j;", "getCornerRadius", "()F", "cornerRadius", AppMeasurementSdk.ConditionalUserProperty.VALUE, "progressPercent", "I", "setProgressPercent", "(I)V", "progressWidth", "F", "", "isGradient", "Z", "Ll1/Z;", "startColor", "J", "endColor", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "progressPaint", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Companion", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressView extends FrameLayout {

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final Context context;

    /* renamed from: cornerRadius$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cornerRadius;
    private long endColor;
    private boolean isGradient;

    @NotNull
    private final Paint progressPaint;
    private int progressPercent;
    private float progressWidth;
    private long startColor;

    @NotNull
    private final TextAtomV2View textView;
    private static final float selectCornerRadius = ResourceExtKt.toPxF(10);
    private static final float bxCornerRadius = ResourceExtKt.toPxF(6);
    private static final int horizontalPadding = ResourceExtKt.toPx(6);
    private static final int verticalPadding = ResourceExtKt.toPx(2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressView(@NotNull Context context) {
        super(context);
        long j11;
        long j12;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.cornerRadius = k.b(new ProgressView$cornerRadius$2(this));
        int i11 = C7807Z.f72260n;
        j11 = C7807Z.f72259m;
        this.startColor = j11;
        j12 = C7807Z.f72259m;
        this.endColor = j12;
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        this.progressPaint = paint2;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.progressLadder_Item_Progress_Text);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388629;
        textAtomV2View.setLayoutParams(layoutParams);
        addView(textAtomV2View);
        this.textView = textAtomV2View;
        setId(R$id.progressLadder_Item_Progress_Root);
        setLayoutParams(new ConstraintLayout.b(0, -2));
        int i12 = horizontalPadding;
        int i13 = verticalPadding;
        ViewExtKt.updatePadding(this, i12, i13, i12, i13);
    }

    private final float getCornerRadius() {
        return ((Number) this.cornerRadius.getValue()).floatValue();
    }

    private final void setProgressPercent(int i11) {
        this.progressPercent = h.f(i11, new IntRange(0, 100, 1));
    }

    public final void bind(@NotNull ProgressLadderDTO.StepDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Paint paint = this.backgroundPaint;
        StyleParser styleParser = StyleParser.INSTANCE;
        paint.setColor(styleParser.parseColor(this.context, dto.getBackgroundColor(), UniColors.BG_ACCENT_SECONDARY.getResId()));
        if (dto.getFillGradientColor() == null) {
            this.progressPaint.setColor(styleParser.parseColor(this.context, dto.getFillColor(), UniColors.BG_ACCENT_SECONDARY_INVERTED.getResId()));
            this.isGradient = false;
        } else {
            Context context = this.context;
            String startColor = dto.getFillGradientColor().getStartColor();
            UniColors uniColors = UniColors.BG_ACCENT_SECONDARY_INVERTED;
            this.startColor = C7811b0.b(styleParser.parseColor(context, startColor, uniColors.getResId()));
            this.endColor = C7811b0.b(styleParser.parseColor(this.context, dto.getFillGradientColor().getEndColor(), uniColors.getResId()));
            this.isGradient = true;
        }
        Integer percent = dto.getPercent();
        setProgressPercent(percent != null ? percent.intValue() : 0);
        TextHolderKt.bindOrGone$default(this.textView, dto.getDiscount(), null, 2, null);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), getCornerRadius(), getCornerRadius(), this.backgroundPaint);
        canvas.drawRoundRect(0.0f, 0.0f, this.progressWidth, getHeight(), getCornerRadius(), getCornerRadius(), this.progressPaint);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float size = (View.MeasureSpec.getSize(widthMeasureSpec) * this.progressPercent) / 100.0f;
        this.progressWidth = size;
        if (this.isGradient) {
            this.progressPaint.setShader(C7791I.a(0L, a.a(size, 0.0f), C7714v.b0(C7807Z.m(this.startColor), C7807Z.m(this.endColor)), null, 0));
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
