package com.bytedance.adsdk.ugeno.vy.oo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.oo;
import com.bytedance.adsdk.ugeno.pcc.kj;
import com.bytedance.adsdk.ugeno.pcc.qf;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ljg;
import defpackage.ogj;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends ImageView implements IAnimation, qf {
    static final /* synthetic */ boolean sf = true;
    private Bitmap atb;
    private int dax;
    private kj fum;
    private boolean gbb;
    private float gm;
    private Shader.TileMode gpj;
    private boolean hc;
    private int jr;
    private float jsj;
    private float kj;
    private oo lo;
    private Shader.TileMode lu;
    private Canvas mk;
    private ImageView.ScaleType nac;
    private float of;
    private boolean ork;
    private ColorStateList qf;
    private Paint qy;
    private boolean tmg;
    private float tsz;
    private boolean tz;
    private Drawable vh;
    private final float[] vj;
    private ColorFilter vy;
    private Drawable wh;
    private final RectF ye;
    private Path yt;
    public static final Shader.TileMode pcc = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] oo = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.ugeno.vy.oo.pcc$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            pcc = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                pcc[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                pcc[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pcc[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pcc[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public pcc(Context context) {
        super(context);
        this.vj = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.qf = ColorStateList.valueOf(-16777216);
        this.kj = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.vy = null;
        this.ork = false;
        this.tmg = false;
        this.hc = false;
        this.gbb = false;
        Shader.TileMode tileMode = pcc;
        this.lu = tileMode;
        this.gpj = tileMode;
        this.tz = false;
        this.of = 50.0f;
        this.ye = new RectF();
        this.fum = new kj(this);
    }

    private void gm() {
        pcc(this.vh, this.nac);
    }

    private void oo() {
        Drawable drawable = this.vh;
        if (drawable == null || !this.ork) {
            return;
        }
        Drawable mutate = drawable.mutate();
        this.vh = mutate;
        if (this.tmg) {
            mutate.setColorFilter(this.vy);
        }
    }

    private void pcc(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof sf) {
            sf sfVar = (sf) drawable;
            sfVar.pcc(scaleType).pcc(this.kj).pcc(this.qf).pcc(this.hc).pcc(this.lu).sf(this.gpj);
            float[] fArr = this.vj;
            if (fArr != null) {
                sfVar.pcc(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            oo();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                pcc(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    private Drawable sf() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.dax;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.dax = 0;
            }
        }
        return sf.pcc(drawable);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        oo ooVar = this.lo;
        if (ooVar != null) {
            ooVar.sf(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.qf.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.qf;
    }

    public float getBorderRadius() {
        return this.fum.pcc();
    }

    public float getBorderWidth() {
        return this.kj;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float[] fArr = this.vj;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (float f2 : fArr) {
            f = Math.max(f2, f);
        }
        return f;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.pcc.qf
    public float getRipple() {
        return this.gm;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getRubIn() {
        return this.fum.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.nac;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getShine() {
        return this.fum.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getStretch() {
        return this.fum.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.lu;
    }

    public Shader.TileMode getTileModeY() {
        return this.gpj;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo ooVar = this.lo;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo ooVar = this.lo;
        if (ooVar != null) {
            ooVar.kj();
        }
        Canvas canvas = this.mk;
        if (canvas != null) {
            canvas.setBitmap(null);
        }
        Bitmap bitmap = this.atb;
        if (bitmap != null) {
            bitmap.recycle();
            this.mk = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.tz || (canvas2 = this.mk) == null || this.atb == null) {
            super.onDraw(canvas);
        } else {
            super.onDraw(canvas2);
            this.mk.drawPath(this.yt, this.qy);
            canvas.drawBitmap(this.atb, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        }
        oo ooVar = this.lo;
        if (ooVar != null) {
            ooVar.pcc(canvas, this);
            this.lo.pcc(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        oo ooVar = this.lo;
        if (ooVar != null) {
            ooVar.pcc(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        oo ooVar = this.lo;
        if (ooVar == null) {
            super.onMeasure(i, i2);
        } else {
            int[] pcc2 = ooVar.pcc(i, i2);
            super.onMeasure(pcc2[0], pcc2[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        oo ooVar = this.lo;
        if (ooVar != null) {
            ooVar.sf(i, i2, i3, i3);
        }
        if (i <= 0 || i2 <= 0 || !this.tz) {
            return;
        }
        this.atb = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.mk = new Canvas(this.atb);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (!this.tz) {
            return super.onTouchEvent(motionEvent);
        }
        this.lo.qf();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.yt.moveTo(x, y);
            this.jsj = x;
            this.tsz = y;
            HashMap hashMap = new HashMap();
            hashMap.put("state", 1);
            this.lo.pcc("eraseState", hashMap);
        } else if (action == 1) {
            this.yt.computeBounds(this.ye, true);
            try {
                i = (int) (((this.ye.width() * this.ye.height()) / (getWidth() * getHeight())) * 100.0f);
            } catch (Exception unused) {
                i = 0;
            }
            HashMap hashMap2 = new HashMap();
            ljg.s(2, i, "state", "percent", hashMap2);
            this.lo.pcc("eraseState", hashMap2);
        } else if (action == 2 && x > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && x < getWidth() && y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && y < getHeight()) {
            float f = this.jsj;
            float f2 = this.tsz;
            this.yt.quadTo(f, f2, (f + x) / 2.0f, (f2 + y) / 2.0f);
            this.jsj = x;
            this.tsz = y;
        }
        postInvalidate();
        return true;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.wh = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.wh = drawable;
        pcc(true);
        super.setBackgroundDrawable(this.wh);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.dax != i) {
            this.dax = i;
            Drawable sf2 = sf();
            this.wh = sf2;
            setBackgroundDrawable(sf2);
        }
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.qf.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.qf = colorStateList;
        gm();
        pcc(false);
        if (this.kj > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            invalidate();
        }
    }

    public void setBorderRadius(float f) {
        kj kjVar = this.fum;
        if (kjVar != null) {
            kjVar.pcc(f);
        }
    }

    public void setBorderWidth(float f) {
        if (this.kj == f) {
            return;
        }
        this.kj = f;
        gm();
        pcc(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.vy != colorFilter) {
            this.vy = colorFilter;
            this.tmg = true;
            this.ork = true;
            oo();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        pcc(f, f, f, f);
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        pcc(dimension, dimension, dimension, dimension);
    }

    public void setEraseEnabled(boolean z) {
        if (z) {
            this.yt = new Path();
            Paint paint = new Paint();
            this.qy = paint;
            paint.setAntiAlias(true);
            this.qy.setDither(true);
            this.qy.setStyle(Paint.Style.STROKE);
            this.qy.setStrokeWidth(this.of * 2.0f);
            this.qy.setStrokeCap(Paint.Cap.ROUND);
            this.qy.setStrokeJoin(Paint.Join.ROUND);
            this.qy.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.qy.setColor(0);
            this.tz = true;
        } else {
            this.tz = false;
        }
        postInvalidate();
    }

    public void setEraseRadius(float f) {
        this.of = f;
        Paint paint = this.qy;
        if (paint != null) {
            paint.setStrokeWidth(f * 2.0f);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.jr = 0;
        this.vh = sf.pcc(bitmap);
        gm();
        super.setImageDrawable(this.vh);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.jr = 0;
        this.vh = sf.pcc(drawable);
        gm();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.jr != i) {
            this.jr = i;
            this.vh = pcc();
            gm();
            super.setImageDrawable(this.vh);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.hc = z;
        gm();
        pcc(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.gm = f;
        kj kjVar = this.fum;
        if (kjVar != null) {
            kjVar.sf(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        kj kjVar = this.fum;
        if (kjVar != null) {
            kjVar.vj(f);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!sf && scaleType == null) {
            ogj.b();
            return;
        }
        if (this.nac != scaleType) {
            this.nac = scaleType;
            int i = AnonymousClass1.pcc[scaleType.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            gm();
            pcc(false);
            invalidate();
        }
    }

    public void setShine(float f) {
        kj kjVar = this.fum;
        if (kjVar != null) {
            kjVar.gm(f);
        }
    }

    public void setStretch(float f) {
        kj kjVar = this.fum;
        if (kjVar != null) {
            kjVar.oo(f);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.lu == tileMode) {
            return;
        }
        this.lu = tileMode;
        gm();
        pcc(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.gpj == tileMode) {
            return;
        }
        this.gpj = tileMode;
        gm();
        pcc(false);
        invalidate();
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    private void pcc(boolean z) {
        if (this.gbb) {
            if (z) {
                this.wh = sf.pcc(this.wh);
            }
            pcc(this.wh, ImageView.ScaleType.FIT_XY);
        }
    }

    private Drawable pcc() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.jr;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.jr = 0;
            }
        }
        return sf.pcc(drawable);
    }

    public void pcc(float f, float f2, float f3, float f4) {
        float[] fArr = this.vj;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        gm();
        pcc(false);
        invalidate();
    }

    public void pcc(oo ooVar) {
        this.lo = ooVar;
    }
}
