package ru.ozon.app.android.product.molecules.countbutton.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.view.PaintExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\nR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/BadgeDrawer;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "text", "", "onTextChanged", "(Ljava/lang/String;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "Landroid/graphics/RectF;", "bounds", "Landroid/graphics/RectF;", "", "textCenterY", "F", "badgeText", "Ljava/lang/String;", "getBadgeText", "()Ljava/lang/String;", "setBadgeText", "Landroid/text/TextPaint;", "badgeTextPaint$delegate", "LSc/j;", "getBadgeTextPaint", "()Landroid/text/TextPaint;", "badgeTextPaint", "Landroid/graphics/Paint;", "badgeBackgroundPaint$delegate", "getBadgeBackgroundPaint", "()Landroid/graphics/Paint;", "badgeBackgroundPaint", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BadgeDrawer {

    /* renamed from: badgeBackgroundPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeBackgroundPaint;
    private String badgeText;

    /* renamed from: badgeTextPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeTextPaint;

    @NotNull
    private final RectF bounds;

    @NotNull
    private final Context context;
    private float textCenterY;

    public BadgeDrawer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.bounds = new RectF();
        this.badgeTextPaint = LazyUtilsKt.unsafeLazy(new BadgeDrawer$badgeTextPaint$2(this));
        this.badgeBackgroundPaint = LazyUtilsKt.unsafeLazy(new BadgeDrawer$badgeBackgroundPaint$2(this));
    }

    private final Paint getBadgeBackgroundPaint() {
        return (Paint) this.badgeBackgroundPaint.getValue();
    }

    private final TextPaint getBadgeTextPaint() {
        return (TextPaint) this.badgeTextPaint.getValue();
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        String str = this.badgeText;
        if (str != null) {
            RectF rectF = this.bounds;
            TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
            canvas.drawRoundRect(rectF, tileGrid2Constants.getCountButtonBadgeRadius(), tileGrid2Constants.getCountButtonBadgeRadius(), getBadgeBackgroundPaint());
            canvas.drawText(str, this.bounds.centerX(), this.textCenterY, getBadgeTextPaint());
        }
    }

    public final void onTextChanged(String text) {
        if (Intrinsics.d(text, this.badgeText)) {
            return;
        }
        this.badgeText = text;
        if (text == null) {
            return;
        }
        float measureText = getBadgeTextPaint().measureText(this.badgeText);
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        this.bounds.set((tileGrid2Constants.getCountButtonSize() - tileGrid2Constants.getCountButtonBadgeMargin()) - (measureText + (tileGrid2Constants.getCountButtonBadgeHorizontalPadding() * 2)), tileGrid2Constants.getCountButtonBadgeMargin(), tileGrid2Constants.getCountButtonSize() - tileGrid2Constants.getCountButtonBadgeMargin(), PaintExtKt.getTextHeight(getBadgeTextPaint()) + tileGrid2Constants.getCountButtonBadgeMargin());
        this.textCenterY = this.bounds.centerY() - ((getBadgeTextPaint().descent() + getBadgeTextPaint().ascent()) / 2);
    }
}
