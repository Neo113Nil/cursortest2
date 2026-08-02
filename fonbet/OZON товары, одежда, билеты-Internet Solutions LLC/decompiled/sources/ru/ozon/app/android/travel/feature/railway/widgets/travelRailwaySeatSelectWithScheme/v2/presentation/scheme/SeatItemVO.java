package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;
import ru.ozon.app.android.travel.utils.extensions.IsActivityDarkThemeExtensionKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010+\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u0011\"\u0004\b2\u0010/R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u00108\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001d\u001a\u0004\b9\u0010\u000e\"\u0004\b:\u0010 R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010A\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/SeatItemVO;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatVO;", "seat", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatTypeVO;", "seatType", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatVO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatTypeVO;)V", "Landroid/content/Context;", "context", "", "getThemedBitmapLink", "(Landroid/content/Context;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatVO;", "getSeat", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatTypeVO;", "getSeatType", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatTypeVO;", "bitmapLink", "Ljava/lang/String;", "getBitmapLink", "setBitmapLink", "(Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "cancelIcon", "getCancelIcon", "setCancelIcon", "x", "I", "getX", "setX", "(I)V", "y", "getY", "setY", "Landroid/graphics/Rect;", "textBoundRect", "Landroid/graphics/Rect;", "getTextBoundRect", "()Landroid/graphics/Rect;", "text", "getText", "setText", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "Landroid/graphics/Paint;", "iconPaint", "Landroid/graphics/Paint;", "getIconPaint", "()Landroid/graphics/Paint;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SeatItemVO {
    private Bitmap bitmap;
    private String bitmapLink;
    private Bitmap cancelIcon;

    @NotNull
    private final Paint iconPaint;

    @NotNull
    private final TravelRailwaySeatSelectWithSchemeVO.SeatVO seat;

    @NotNull
    private final TravelRailwaySeatSelectWithSchemeVO.SeatTypeVO seatType;
    private String text;

    @NotNull
    private final Rect textBoundRect;

    @NotNull
    private final TextPaint textPaint;
    private int x;
    private int y;

    public SeatItemVO(@NotNull TravelRailwaySeatSelectWithSchemeVO.SeatVO seat, @NotNull TravelRailwaySeatSelectWithSchemeVO.SeatTypeVO seatType) {
        Intrinsics.checkNotNullParameter(seat, "seat");
        Intrinsics.checkNotNullParameter(seatType, "seatType");
        this.seat = seat;
        this.seatType = seatType;
        this.textBoundRect = new Rect();
        this.textPaint = new TextPaint(1);
        this.iconPaint = new Paint(1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeatItemVO)) {
            return false;
        }
        SeatItemVO seatItemVO = (SeatItemVO) other;
        return Intrinsics.d(this.seat, seatItemVO.seat) && Intrinsics.d(this.seatType, seatItemVO.seatType);
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final String getBitmapLink() {
        return this.bitmapLink;
    }

    public final Bitmap getCancelIcon() {
        return this.cancelIcon;
    }

    @NotNull
    public final Paint getIconPaint() {
        return this.iconPaint;
    }

    @NotNull
    public final TravelRailwaySeatSelectWithSchemeVO.SeatVO getSeat() {
        return this.seat;
    }

    @NotNull
    public final TravelRailwaySeatSelectWithSchemeVO.SeatTypeVO getSeatType() {
        return this.seatType;
    }

    public final String getText() {
        return this.text;
    }

    @NotNull
    public final Rect getTextBoundRect() {
        return this.textBoundRect;
    }

    @NotNull
    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    @NotNull
    public final String getThemedBitmapLink(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return IsActivityDarkThemeExtensionKt.isActivityDarkThemeActive(context) ? this.seatType.getDarkImageLink() : this.seatType.getLightImageLink();
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public int hashCode() {
        return this.seatType.hashCode() + (this.seat.hashCode() * 31);
    }

    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setBitmapLink(String str) {
        this.bitmapLink = str;
    }

    public final void setCancelIcon(Bitmap bitmap) {
        this.cancelIcon = bitmap;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setX(int i11) {
        this.x = i11;
    }

    public final void setY(int i11) {
        this.y = i11;
    }

    @NotNull
    public String toString() {
        return "SeatItemVO(seat=" + this.seat + ", seatType=" + this.seatType + ")";
    }
}
