package ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes3.dex */
public class Bounds {
    public final double maxX;
    public final double maxY;
    public final double midX;
    public final double midY;
    public final double minX;
    public final double minY;

    public Bounds(double d11, double d12, double d13, double d14) {
        this.minX = d11;
        this.minY = d13;
        this.maxX = d12;
        this.maxY = d14;
        this.midX = (d11 + d12) / 2.0d;
        this.midY = (d13 + d14) / 2.0d;
    }

    public static Bitmap drawBounds(Bounds bounds, Bounds bounds2, int i11, int i12) {
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(-16776961);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(5.0f);
        Paint paint2 = new Paint();
        paint2.setColor(-65536);
        paint2.setStyle(style);
        paint2.setStrokeWidth(5.0f);
        double min = Math.min(bounds.minX, bounds2.minX);
        double max = Math.max(bounds.maxX, bounds2.maxX);
        double min2 = Math.min(bounds.minY, bounds2.minY);
        float f7 = i11 / ((float) (max - min));
        float max2 = i12 / ((float) (Math.max(bounds.maxY, bounds2.maxY) - min2));
        canvas.drawRect(mapX(bounds.minX, min, f7), mapY(bounds.maxY, min2, max2, i12), mapX(bounds.maxX, min, f7), mapY(bounds.minY, min2, max2, i12), paint);
        canvas.drawRect(mapX(bounds2.minX, min, f7), mapY(bounds2.maxY, min2, max2, i12), mapX(bounds2.maxX, min, f7), mapY(bounds2.minY, min2, max2, i12), paint2);
        return createBitmap;
    }

    private static float mapX(double d11, double d12, float f7) {
        return (float) ((d11 - d12) * f7);
    }

    private static float mapY(double d11, double d12, float f7, int i11) {
        return i11 - ((float) ((d11 - d12) * f7));
    }

    public boolean contains(double d11, double d12) {
        return this.minX <= d11 && d11 <= this.maxX && this.minY <= d12 && d12 <= this.maxY;
    }

    public boolean intersects(double d11, double d12, double d13, double d14) {
        return d11 < this.maxX && this.minX < d12 && d13 < this.maxY && this.minY < d14;
    }

    public boolean contains(Point point) {
        return contains(point.f97555x, point.f97556y);
    }

    public boolean intersects(Bounds bounds) {
        return intersects(bounds.minX, bounds.maxX, bounds.minY, bounds.maxY);
    }

    public boolean contains(Bounds bounds) {
        return bounds.minX >= this.minX && bounds.maxX <= this.maxX && bounds.minY >= this.minY && bounds.maxY <= this.maxY;
    }
}
