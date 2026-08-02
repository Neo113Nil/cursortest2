package Hg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import com.airbnb.lottie.utils.u;

/* loaded from: classes4.dex */
public class k implements a {

    /* renamed from: b, reason: collision with root package name */
    public int f4937b;

    /* renamed from: c, reason: collision with root package name */
    public int f4938c;

    /* renamed from: e, reason: collision with root package name */
    public a f4940e;

    /* renamed from: f, reason: collision with root package name */
    public Context f4941f;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f4936a = u.a("BlurViewNode");

    /* renamed from: d, reason: collision with root package name */
    public float f4939d = 1.0f;

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
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f4936a);
            return;
        }
        if (this.f4940e == null) {
            this.f4940e = new l(this.f4941f);
        }
        this.f4940e.e(bitmap, this.f4939d);
        this.f4940e.c(canvas, bitmap);
    }

    @Override // Hg.a
    public float d() {
        return 6.0f;
    }

    @Override // Hg.a
    public void destroy() {
        this.f4936a.discardDisplayList();
        a aVar = this.f4940e;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // Hg.a
    public Bitmap e(Bitmap bitmap, float f10) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        this.f4939d = f10;
        if (bitmap.getHeight() != this.f4937b || bitmap.getWidth() != this.f4938c) {
            this.f4937b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f4938c = width;
            this.f4936a.setPosition(0, 0, width, this.f4937b);
        }
        beginRecording = this.f4936a.beginRecording();
        beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f4936a.endRecording();
        RenderNode renderNode = this.f4936a;
        createBlurEffect = RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.MIRROR);
        renderNode.setRenderEffect(createBlurEffect);
        return bitmap;
    }

    public void f(Context context) {
        this.f4941f = context;
    }
}
