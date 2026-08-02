package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBCusRoundImageView extends ImageView {
    private int a;
    private int b;
    private int c;
    private int d;
    private Xfermode e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private float[] o;
    private float[] p;
    private RectF q;
    private RectF r;
    private boolean s;
    private boolean t;
    private Path u;
    private Paint v;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBCusRoundImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new Path();
        this.v = new Paint();
        this.o = new float[8];
        this.p = new float[8];
        this.r = new RectF();
        this.q = new RectF();
        this.e = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a() {
        if (this.o == null || this.p == null) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                float[] fArr = this.o;
                if (i >= fArr.length) {
                    return;
                }
                float f = this.h;
                fArr[i] = f;
                this.p[i] = f - (this.m / 2.0f);
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    private void b() {
        int i;
        int i2;
        int i3;
        try {
            if (this.o == null || this.p == null) {
                return;
            }
            int i4 = 0;
            while (true) {
                i = 2;
                if (i4 >= 2) {
                    break;
                }
                float[] fArr = this.o;
                float f = this.i;
                fArr[i4] = f;
                this.p[i4] = f - (this.m / 2.0f);
                i4++;
            }
            while (true) {
                i2 = 4;
                if (i >= 4) {
                    break;
                }
                float[] fArr2 = this.o;
                float f2 = this.j;
                fArr2[i] = f2;
                this.p[i] = f2 - (this.m / 2.0f);
                i++;
            }
            while (true) {
                if (i2 >= 6) {
                    break;
                }
                float[] fArr3 = this.o;
                float f3 = this.k;
                fArr3[i2] = f3;
                this.p[i2] = f3 - (this.m / 2.0f);
                i2++;
            }
            for (i3 = 6; i3 < 8; i3++) {
                float[] fArr4 = this.o;
                float f4 = this.l;
                fArr4[i3] = f4;
                this.p[i3] = f4 - (this.m / 2.0f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.r;
        if (rectF != null) {
            float f = this.m / 2.0f;
            rectF.set(f, f, this.f - f, this.g - f);
        }
    }

    private void d() {
        RectF rectF = this.q;
        if (rectF != null) {
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f, this.g);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, c> c = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            c cVar = c.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                int i2 = AnonymousClass1.a[cVar.ordinal()];
                if (i2 == 6) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i2 == 13) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = b.a().a(attributeValue2);
                    }
                } else if (i2 == 14) {
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (attributeValue3.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue3.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.height = -1;
                    } else if (attributeValue3.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = b.a().a(attributeValue3);
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.q, null, 31);
            int i = this.f;
            int i2 = this.m * 2;
            float f = (i - i2) * 1.0f;
            float f2 = i;
            float f3 = this.g;
            canvas.scale(f / f2, ((r5 - i2) * 1.0f) / f3, f2 / 2.0f, f3 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.v;
            if (paint != null) {
                paint.reset();
                this.v.setAntiAlias(true);
                this.v.setStyle(Paint.Style.FILL);
                this.v.setXfermode(this.e);
            }
            Path path = this.u;
            if (path != null) {
                path.reset();
                this.u.addRoundRect(this.q, this.p, Path.Direction.CCW);
            }
            canvas.drawPath(this.u, this.v);
            Paint paint2 = this.v;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.s) {
                a(canvas);
            }
        } catch (Exception e) {
            q0.a("MBridgeImageView", e.getMessage());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        try {
            this.f = i;
            this.g = i2;
            if (this.t) {
                b();
            } else {
                a();
            }
            c();
            d();
        } catch (Exception e) {
            q0.b("MBridgeImageView", e.getMessage());
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, c> c = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            c cVar = c.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                switch (AnonymousClass1.a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        b.a().a(attributeSet.getAttributeValue(i), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArr = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr == null || strArr.length > 2) {
                                if (strArr == null || strArr.length != 3) {
                                    setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i)));
                                    break;
                                } else {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                        break;
                                    } catch (Exception unused2) {
                                        setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i)));
                                        break;
                                    }
                                }
                            } else {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i)));
                                break;
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                            break;
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue3)) {
                            break;
                        } else {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.utils.b.a.get(attributeValue3.substring(8));
                            if (TextUtils.isEmpty(charSequence)) {
                                break;
                            } else {
                                setContentDescription(charSequence);
                                break;
                            }
                        }
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue4)) {
                            break;
                        } else {
                            String str = com.mbridge.msdk.dycreator.utils.b.a.get(attributeValue4.substring(8));
                            if (TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                setTag(str);
                                break;
                            }
                        }
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue5)) {
                            break;
                        } else if (attributeValue5.equals("invisible")) {
                            setVisibility(4);
                            break;
                        } else if (attributeValue5.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue6)) {
                            break;
                        } else if (attributeValue6.equals("fitXY")) {
                            setScaleType(ImageView.ScaleType.FIT_XY);
                            break;
                        } else if (attributeValue6.equals("centerInside")) {
                            setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            break;
                        } else if (attributeValue6.equals("centerCrop")) {
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        int a = b.a().a(attributeSet.getAttributeValue(i));
                        this.d = a;
                        this.c = a;
                        this.b = a;
                        this.a = a;
                        setPadding(a, a, a, a);
                        break;
                    case 9:
                        int a2 = b.a().a(attributeSet.getAttributeValue(i));
                        this.b = a2;
                        setPadding(this.a, a2, this.c, this.d);
                        break;
                    case 10:
                        int a3 = b.a().a(attributeSet.getAttributeValue(i));
                        this.d = a3;
                        setPadding(this.a, this.b, this.c, a3);
                        break;
                    case 11:
                        int a4 = b.a().a(attributeSet.getAttributeValue(i));
                        this.a = a4;
                        setPadding(a4, this.b, this.c, this.d);
                        break;
                    case 12:
                        int a5 = b.a().a(attributeSet.getAttributeValue(i));
                        this.c = a5;
                        setPadding(this.a, this.b, a5, this.d);
                        break;
                }
            }
        }
    }

    public void setBorder(int i, int i2, int i3) {
        this.s = true;
        this.m = i2;
        this.n = i3;
        this.h = i;
    }

    public void setCornerRadius(int i) {
        this.h = i;
    }

    public void setCustomBorder(int i, int i2, int i3, int i4, int i5, int i6) {
        this.s = true;
        this.t = true;
        this.m = i5;
        this.n = i6;
        this.i = i;
        this.k = i3;
        this.j = i2;
        this.l = i4;
    }

    private void a(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        try {
            a(i, i2);
            Path path = this.u;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.u, this.v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(int i, int i2) {
        Path path = this.u;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.v;
        if (paint != null) {
            paint.setStrokeWidth(i);
            this.v.setColor(i2);
            this.v.setStyle(Paint.Style.STROKE);
        }
    }

    private void a(Canvas canvas) {
        a(canvas, this.m, this.n, this.r, this.o);
    }

    public MBCusRoundImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MBCusRoundImageView(Context context) {
        this(context, null);
    }
}
