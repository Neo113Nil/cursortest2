package yi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;

/* renamed from: yi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6898a extends ReactViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public Bitmap f68428a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f68429b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f68430c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuffXfermode f68431d;

    /* renamed from: e, reason: collision with root package name */
    public int f68432e;

    public C6898a(Context context) {
        super(context);
        this.f68428a = null;
        this.f68429b = false;
        this.f68432e = 2;
        this.f68430c = new Paint(1);
        this.f68431d = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    public static Bitmap o(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f68429b) {
            p();
            this.f68429b = false;
        }
        if (this.f68428a != null) {
            setLayerType(this.f68432e, this.f68430c);
            this.f68430c.setXfermode(this.f68431d);
            canvas.drawBitmap(this.f68428a, 0.0f, 0.0f, this.f68430c);
            this.f68430c.setXfermode(null);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f68429b = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        View childAt;
        super.onDescendantInvalidated(view, view2);
        if (!this.f68429b && (childAt = getChildAt(0)) != null && childAt.equals(view)) {
            this.f68429b = true;
        }
        invalidate();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            this.f68429b = true;
        }
    }

    public final void p() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setVisibility(0);
            Bitmap bitmap = this.f68428a;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f68428a = o(childAt);
            childAt.setVisibility(4);
        }
    }

    public void setRenderingMode(String str) {
        this.f68432e = str.equals("software") ? 1 : 2;
    }
}
