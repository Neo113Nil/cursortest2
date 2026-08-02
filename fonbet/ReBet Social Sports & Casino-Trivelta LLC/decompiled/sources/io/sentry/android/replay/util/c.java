package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends Drawable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f51756e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f51757f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f51758g = Color.argb(32, 255, 20, 20);

    /* renamed from: h, reason: collision with root package name */
    public static final int f51759h = Color.argb(128, 255, 20, 20);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f51760a = new Paint(1);

    /* renamed from: b, reason: collision with root package name */
    public final float f51761b = 6.0f;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f51762c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public List f51763d = CollectionsKt.emptyList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public final void a(Canvas canvas, String str, float f10, float f11) {
        this.f51760a.setColor(-1);
        this.f51760a.setStyle(Paint.Style.STROKE);
        canvas.drawText(str, f10, f11, this.f51760a);
        this.f51760a.setColor(-16777216);
        this.f51760a.setStyle(Paint.Style.FILL);
        canvas.drawText(str, f10, f11, this.f51760a);
    }

    public final void b(List masks) {
        Intrinsics.checkNotNullParameter(masks, "masks");
        this.f51763d = masks;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f51760a.setTextSize(32.0f);
        this.f51760a.setColor(-16777216);
        this.f51760a.setStrokeWidth(6.0f);
        for (Rect rect : this.f51763d) {
            this.f51760a.setColor(f51758g);
            this.f51760a.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, this.f51760a);
            this.f51760a.setColor(f51759h);
            this.f51760a.setStyle(Paint.Style.STROKE);
            canvas.drawRect(rect, this.f51760a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.left);
            sb2.append('/');
            sb2.append(rect.top);
            String sb3 = sb2.toString();
            this.f51760a.getTextBounds(sb3, 0, sb3.length(), this.f51762c);
            a(canvas, sb3, rect.left, rect.top);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(rect.right);
            sb4.append('/');
            sb4.append(rect.bottom);
            String sb5 = sb4.toString();
            this.f51760a.getTextBounds(sb5, 0, sb5.length(), this.f51762c);
            a(canvas, sb5, rect.right - this.f51762c.width(), rect.bottom + this.f51762c.height());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
