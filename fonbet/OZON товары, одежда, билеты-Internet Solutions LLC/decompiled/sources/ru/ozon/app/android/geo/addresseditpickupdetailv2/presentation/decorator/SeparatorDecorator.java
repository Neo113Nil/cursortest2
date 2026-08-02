package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.decorator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/decorator/SeparatorDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "lastDivider", "", "<init>", "(Landroid/content/Context;Z)V", "dp1", "", "dp52", "paint", "Landroid/graphics/Paint;", "decorate", "", "canvas", "Landroid/graphics/Canvas;", "bounds", "Landroid/graphics/Rect;", "position", "last", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SeparatorDecorator extends AtomDecorator implements VerticalAtomsDecorator {
    private final int dp1;
    private final int dp52;
    private final boolean lastDivider;

    @NotNull
    private final Paint paint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorDecorator(@NotNull Context context, boolean z11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.lastDivider = z11;
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        this.dp52 = ResourceExtKt.toPx(52, context);
        Paint paint = new Paint(1);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        paint.setStrokeWidth(px);
        this.paint = paint;
    }

    @Override // ru.ozon.uni.atoms.af.AtomDecorator, ru.ozon.uni.atoms.af.CommonAtomDecorator
    public void decorate(@NotNull Canvas canvas, @NotNull Rect bounds, int position, boolean last) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (!last || this.lastDivider) {
            int i11 = bounds.bottom;
            int i12 = this.dp1;
            canvas.drawLine(bounds.left + this.dp52, i11 - i12, bounds.right, i11 - i12, this.paint);
        }
    }

    @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
    @NotNull
    public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams layoutParams, @NotNull AtomDTO atomDTO, int i11, boolean z11) {
        return VerticalAtomsDecorator.DefaultImpls.modifyVerticalLayoutParams(this, layoutParams, atomDTO, i11, z11);
    }
}
