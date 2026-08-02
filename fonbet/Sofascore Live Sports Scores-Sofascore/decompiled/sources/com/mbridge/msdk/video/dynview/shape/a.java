package com.mbridge.msdk.video.dynview.shape;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a extends ShapeDrawable {
    private int a;
    private float b;
    private float c;
    private int d;
    private int e;
    private Bitmap f;
    private Bitmap g;
    private boolean h;
    private Paint i;
    private Matrix j;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface c {
        c a(float f);

        c a(int i);

        c a(Bitmap bitmap);

        c a(boolean z);

        c b(Bitmap bitmap);

        a build();

        c orientation(int i);
    }

    private a(b bVar) {
        super(bVar.a);
        this.h = false;
        this.f = bVar.b;
        this.g = bVar.c;
        this.h = bVar.d;
        this.a = bVar.e;
        this.d = bVar.f;
        this.e = bVar.g;
        this.b = bVar.h;
        this.c = bVar.i;
        Paint paint = new Paint();
        this.i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.i.setAntiAlias(true);
        this.j = new Matrix();
    }

    private void a(Canvas canvas) {
        float f = this.b / 2.0f;
        Path path = new Path();
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.c);
        path.lineTo((f - this.d) - this.e, this.c);
        path.lineTo((this.d + f) - this.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.h) {
            try {
                a(canvas, path);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.d + f + this.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path2.lineTo(this.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path2.lineTo(this.b, this.c);
        path2.lineTo((f - this.d) + this.e, this.c);
        if (this.h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.g);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private void b(Canvas canvas) {
        float f = this.c / 2.0f;
        Path path = new Path();
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (this.d + f) - this.e);
        path.lineTo(this.b, (f - this.d) - this.e);
        path.lineTo(this.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.h) {
            try {
                a(canvas, path);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.d + f + this.e);
        path2.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.c);
        path2.lineTo(this.b, this.c);
        path2.lineTo(this.b, (f - this.d) + this.e);
        if (this.h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.g);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.a == 1) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class b implements c {
        private RectShape a;
        private Bitmap b;
        private Bitmap c;
        private boolean d;
        private int e;
        private int f;
        private int g;
        private float h;
        private float i;

        private b() {
            this.f = 100;
            this.g = 10;
            this.a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public a build() {
            return new a(this);
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c orientation(int i) {
            this.e = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(Bitmap bitmap) {
            this.c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c b(Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(boolean z) {
            this.d = z;
            return this;
        }

        public c b(float f) {
            this.h = f;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(float f) {
            this.i = f;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(int i) {
            this.g = i;
            return this;
        }
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float max = Math.max(this.b / bitmap.getWidth(), this.c / bitmap.getHeight());
            Matrix matrix = this.j;
            if (matrix == null) {
                matrix = new Matrix();
                this.j = matrix;
            }
            matrix.reset();
            this.j.preScale(max, max);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.j);
        this.i.setShader(bitmapShader);
        canvas.drawPath(path, this.i);
    }

    private void a(Canvas canvas, Path path) {
        this.i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.i);
    }

    public static b a() {
        return new b();
    }
}
