package ru.ozon.app.android.pdp.widgets.othersellers.presentation.footer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.FrameAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/presentation/footer/OtherSellersFooterDecoration;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/FrameAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "marginStart", "", "line", "Landroid/graphics/Paint;", "decorate", "", "canvas", "Landroid/graphics/Canvas;", "bounds", "Landroid/graphics/Rect;", "position", "last", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OtherSellersFooterDecoration extends AtomDecorator implements FrameAtomsDecorator {

    @NotNull
    private final Paint line;
    private final int marginStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherSellersFooterDecoration(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.marginStart = toPx(16);
        Paint paint = new Paint();
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        paint.setStrokeWidth(toPx(1));
        this.line = paint;
    }

    @Override // ru.ozon.uni.atoms.af.AtomDecorator, ru.ozon.uni.atoms.af.CommonAtomDecorator
    public void decorate(@NotNull Canvas canvas, @NotNull Rect bounds, int position, boolean last) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        canvas.drawLine(bounds.left + this.marginStart, this.line.getStrokeWidth() + bounds.top, bounds.right, this.line.getStrokeWidth() + bounds.top, this.line);
    }

    @Override // ru.ozon.uni.atoms.af.FrameAtomsDecorator
    @NotNull
    public FrameLayout.LayoutParams modifyFrameLayoutParams(@NotNull FrameLayout.LayoutParams layoutParams, @NotNull AtomDTO atomDTO, int i11, boolean z11) {
        return FrameAtomsDecorator.DefaultImpls.modifyFrameLayoutParams(this, layoutParams, atomDTO, i11, z11);
    }
}
