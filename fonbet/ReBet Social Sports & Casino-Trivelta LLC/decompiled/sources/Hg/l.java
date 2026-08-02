package Hg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* loaded from: classes4.dex */
public class l implements a {

    /* renamed from: b, reason: collision with root package name */
    public final RenderScript f4943b;

    /* renamed from: c, reason: collision with root package name */
    public final ScriptIntrinsicBlur f4944c;

    /* renamed from: d, reason: collision with root package name */
    public Allocation f4945d;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4942a = new Paint(2);

    /* renamed from: e, reason: collision with root package name */
    public int f4946e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f4947f = -1;

    public l(Context context) {
        RenderScript create = RenderScript.create(context);
        this.f4943b = create;
        this.f4944c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    @Override // Hg.a
    public Bitmap.Config a() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // Hg.a
    public boolean b() {
        return true;
    }

    @Override // Hg.a
    public void c(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f4942a);
    }

    @Override // Hg.a
    public float d() {
        return 6.0f;
    }

    @Override // Hg.a
    public final void destroy() {
        this.f4944c.destroy();
        this.f4943b.destroy();
        Allocation allocation = this.f4945d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @Override // Hg.a
    public Bitmap e(Bitmap bitmap, float f10) {
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f4943b, bitmap);
        if (!f(bitmap)) {
            Allocation allocation = this.f4945d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f4945d = Allocation.createTyped(this.f4943b, createFromBitmap.getType());
            this.f4946e = bitmap.getWidth();
            this.f4947f = bitmap.getHeight();
        }
        this.f4944c.setRadius(f10);
        this.f4944c.setInput(createFromBitmap);
        this.f4944c.forEach(this.f4945d);
        this.f4945d.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }

    public final boolean f(Bitmap bitmap) {
        return bitmap.getHeight() == this.f4947f && bitmap.getWidth() == this.f4946e;
    }
}
