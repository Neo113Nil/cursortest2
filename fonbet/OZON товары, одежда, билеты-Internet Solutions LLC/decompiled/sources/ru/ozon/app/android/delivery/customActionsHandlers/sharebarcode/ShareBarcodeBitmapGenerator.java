package ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode;

import N9.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import h9.EnumC6876a;
import h9.g;
import j.C7232a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.delivery.customActionsHandlers.R$drawable;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$style;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0014*\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeBitmapGenerator;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "Landroid/graphics/Bitmap;", "barcodeBitmap", "", "drawBarcode", "(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V", "drawRoundedCorners", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "context", "drawLogo", "(Landroid/graphics/Canvas;Landroid/content/Context;)V", "", "code", "drawCode", "(Landroid/graphics/Canvas;Landroid/content/Context;Ljava/lang/String;)V", "", "leftBound", "(Landroid/graphics/Bitmap;)I", "rightBound", "x", "", "isPixelNotWhite", "(Landroid/graphics/Bitmap;I)Z", "visibleCode", "generateBitmap", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;", "LN9/b;", "barcodeEncoder", "LN9/b;", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShareBarcodeBitmapGenerator {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final b barcodeEncoder = new b();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeBitmapGenerator$Companion;", "", "<init>", "()V", "SCALE", "", "BITMAP_WIDTH", "BITMAP_HEIGHT", "PADDING", "CORNER_RADIUS", "LOGO_WIDTH", "LOGO_HEIGHT", "TEXT_SIZE", "CODE_HORIZONTAL_PADDING", "BARCODE_WIDTH", "BARCODE_HEIGHT", "PADDING_F", "", "CORNER_RADIUS_F", "BITMAP_WIDTH_F", "BITMAP_HEIGHT_F", "TEXT_SIZE_F", "CODE_HORIZONTAL_PADDING_F", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void drawBarcode(Canvas canvas, Bitmap bitmap) {
        Rect rect = new Rect();
        rect.left = leftBound(bitmap);
        rect.top = 0;
        rect.right = rightBound(bitmap);
        rect.bottom = bitmap.getHeight() - 1;
        Rect rect2 = new Rect();
        rect2.left = 48;
        rect2.top = 48;
        rect2.right = 1029;
        rect2.bottom = 528;
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
        drawRoundedCorners(canvas);
    }

    private final void drawCode(Canvas canvas, Context context, String str) {
        TextPaint textPaint = new TextPaint();
        TextPaintExtKt.applyStyle(textPaint, context, R$style.OzonTextAppearance_Headline_600large);
        textPaint.setTextSize(72.0f);
        textPaint.setColor(context.getColor(R$color.text_primary_on_light));
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        Path path = new Path();
        float measureText = textPaint.measureText(str);
        float f7 = 538.5f - (measureText / 2);
        float f11 = -textPaint.ascent();
        path.moveTo(f7 - 24.0f, 528.0f);
        float f12 = f11 - 36.0f;
        path.rLineTo(0.0f, -f12);
        path.rQuadTo(0.0f, -36.0f, 36.0f, -36.0f);
        path.rLineTo((measureText + 48.0f) - 72.0f, 0.0f);
        path.rQuadTo(36.0f, 0.0f, 36.0f, 36.0f);
        path.rLineTo(0.0f, f12);
        path.close();
        canvas.drawPath(path, paint);
        canvas.drawText(str, f7, 528.0f, textPaint);
    }

    private final void drawLogo(Canvas canvas, Context context) {
        Drawable a11 = C7232a.a(context, AppTokensProvider.INSTANCE.isSelect(context) ? R$drawable.barcode_logo_select : R$drawable.barcode_logo_bo);
        if (a11 == null) {
            return;
        }
        a11.setBounds(421, 48, 655, 111);
        a11.draw(canvas);
    }

    private final void drawRoundedCorners(Canvas canvas) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        Path path = new Path();
        path.moveTo(48.0f, 48.0f);
        path.rLineTo(36.0f, 0.0f);
        path.rQuadTo(-36.0f, 0.0f, -36.0f, 36.0f);
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        path.moveTo(1029.0f, 48.0f);
        path.rLineTo(-36.0f, 0.0f);
        path.rQuadTo(36.0f, 0.0f, 36.0f, 36.0f);
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        path.moveTo(48.0f, 528.0f);
        path.rLineTo(36.0f, 0.0f);
        path.rQuadTo(-36.0f, 0.0f, -36.0f, -36.0f);
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        path.moveTo(1029.0f, 528.0f);
        path.rLineTo(-36.0f, 0.0f);
        path.rQuadTo(36.0f, 0.0f, 36.0f, -36.0f);
        path.close();
        canvas.drawPath(path, paint);
    }

    private final boolean isPixelNotWhite(Bitmap bitmap, int i11) {
        return bitmap.getPixel(i11, 0) != -1;
    }

    private final int leftBound(Bitmap bitmap) {
        int width = bitmap.getWidth();
        for (int i11 = 0; i11 < width; i11++) {
            if (isPixelNotWhite(bitmap, i11)) {
                return i11;
            }
        }
        return 0;
    }

    private final int rightBound(Bitmap bitmap) {
        int width = bitmap.getWidth();
        do {
            width--;
            if (-1 >= width) {
                return bitmap.getWidth() - 1;
            }
        } while (!isPixelNotWhite(bitmap, width));
        return width;
    }

    @NotNull
    public final Bitmap generateBitmap(@NotNull Context context, @NotNull String code, @NotNull String visibleCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(visibleCode, "visibleCode");
        b bVar = this.barcodeEncoder;
        EnumC6876a enumC6876a = EnumC6876a.CODE_128;
        Map i11 = U.i(new Pair(g.MARGIN, 0));
        bVar.getClass();
        Bitmap a11 = b.a(code, enumC6876a, 981, 480, i11);
        Bitmap createBitmap = Bitmap.createBitmap(1077, 576, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        drawBarcode(canvas, a11);
        drawLogo(canvas, context);
        drawCode(canvas, context, visibleCode);
        return createBitmap;
    }
}
