package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import hd.C6915b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.SeatItemVO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J0\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeItemRenderer;", "", "<init>", "()V", "paint", "Landroid/graphics/Paint;", "dstRect", "Landroid/graphics/RectF;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "seatItems", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/SeatItemVO;", "scrollXValue", "", "viewportWidth", "", "checkItemVisibility", "", "seatItem", "drawItem", "bmp", "Landroid/graphics/Bitmap;", "screenX", "screenY", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySchemeItemRenderer {

    @NotNull
    private final Paint paint = new Paint(1);

    @NotNull
    private final RectF dstRect = new RectF();

    private final boolean checkItemVisibility(SeatItemVO seatItem, float scrollXValue, int viewportWidth) {
        int x11 = seatItem.getX();
        Bitmap bitmap = seatItem.getBitmap();
        int width = (bitmap != null ? bitmap.getWidth() : 0) + x11;
        int c11 = C6915b.c(scrollXValue);
        int c12 = C6915b.c(scrollXValue + viewportWidth);
        if (c11 > x11 || x11 > c12) {
            return c11 <= width && width <= c12;
        }
        return true;
    }

    private final void drawItem(Bitmap bmp, float screenX, float screenY, Canvas canvas, SeatItemVO seatItem) {
        float width = bmp.getWidth() / 2.0f;
        float height = bmp.getHeight() / 2.0f;
        this.dstRect.set(screenX, screenY, bmp.getWidth() + screenX, bmp.getHeight() + screenY);
        canvas.drawBitmap(bmp, (Rect) null, this.dstRect, this.paint);
        Bitmap cancelIcon = seatItem.getCancelIcon();
        if (cancelIcon != null) {
            canvas.drawBitmap(cancelIcon, (screenX + width) - (cancelIcon.getWidth() / 2.0f), (screenY + height) - (cancelIcon.getHeight() / 2.0f), seatItem.getIconPaint());
            return;
        }
        String text = seatItem.getText();
        if (text != null) {
            canvas.drawText(text, (screenX + width) - seatItem.getTextBoundRect().exactCenterX(), (screenY + height) - seatItem.getTextBoundRect().exactCenterY(), seatItem.getTextPaint());
        }
    }

    public final void draw(@NotNull Canvas canvas, @NotNull List<SeatItemVO> seatItems, float scrollXValue, int viewportWidth) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(seatItems, "seatItems");
        for (SeatItemVO seatItemVO : seatItems) {
            if (checkItemVisibility(seatItemVO, scrollXValue, viewportWidth) && (bitmap = seatItemVO.getBitmap()) != null) {
                drawItem(bitmap, seatItemVO.getX(), seatItemVO.getY(), canvas, seatItemVO);
            }
        }
    }
}
