package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3534l extends AbstractC3539q {

    /* renamed from: c, reason: collision with root package name */
    public String f38878c;

    /* renamed from: d, reason: collision with root package name */
    public String f38879d;

    /* renamed from: e, reason: collision with root package name */
    public float f38880e;

    /* renamed from: f, reason: collision with root package name */
    public float f38881f;

    /* renamed from: g, reason: collision with root package name */
    public float f38882g;

    /* renamed from: h, reason: collision with root package name */
    public float f38883h;

    /* renamed from: i, reason: collision with root package name */
    public EnumC3543u f38884i;

    /* renamed from: com.horcrux.svg.l$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator;

        static {
            int[] iArr = new int[EnumC3543u.values().length];
            $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator = iArr;
            try {
                iArr[EnumC3543u.OVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator[EnumC3543u.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator[EnumC3543u.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator[EnumC3543u.ATOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator[EnumC3543u.XOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator[EnumC3543u.ARITHMETIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C3534l(ReactContext reactContext) {
        super(reactContext);
    }

    public void A(Float f10) {
        this.f38882g = f10.floatValue();
        invalidate();
    }

    public void B(Float f10) {
        this.f38883h = f10.floatValue();
        invalidate();
    }

    public void C(String str) {
        this.f38884i = EnumC3543u.b(str);
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC3539q
    public Bitmap o(HashMap hashMap, Bitmap bitmap) {
        Bitmap q10 = AbstractC3539q.q(hashMap, bitmap, this.f38878c);
        Bitmap q11 = AbstractC3539q.q(hashMap, bitmap, this.f38879d);
        Bitmap createBitmap = Bitmap.createBitmap(q10.getWidth(), q10.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(q10, 0.0f, 0.0f, paint);
        switch (a.$SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator[this.f38884i.ordinal()]) {
            case 1:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                break;
            case 2:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                break;
            case 3:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                break;
            case 4:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                break;
            case 5:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                break;
            case 6:
                int width = createBitmap.getWidth() * createBitmap.getHeight();
                int[] iArr = new int[width];
                createBitmap.getPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                int width2 = createBitmap.getWidth();
                int width3 = createBitmap.getWidth();
                int height = createBitmap.getHeight();
                int[] iArr2 = new int[width];
                q11.getPixels(iArr2, 0, width2, 0, 0, width3, height);
                int i10 = 0;
                while (i10 < width) {
                    int i11 = iArr[i10];
                    int i12 = iArr2[i10];
                    int i13 = width;
                    int[] iArr3 = iArr2;
                    float f10 = this.f38880e;
                    float f11 = (i11 >> 16) & 255;
                    float f12 = (i12 >> 16) & 255;
                    float f13 = f10 * f11 * f12;
                    float f14 = this.f38881f;
                    float f15 = f13 + (f11 * f14);
                    float f16 = this.f38882g;
                    float f17 = f15 + (f12 * f16);
                    float f18 = this.f38883h;
                    int i14 = (int) (f17 + f18);
                    float f19 = (i11 >> 8) & 255;
                    float f20 = (i12 >> 8) & 255;
                    int i15 = (int) ((f10 * f19 * f20) + (f19 * f14) + (f20 * f16) + f18);
                    float f21 = i11 & 255;
                    float f22 = i12 & 255;
                    int i16 = (int) ((f10 * f21 * f22) + (f21 * f14) + (f22 * f16) + f18);
                    float f23 = i11 >>> 24;
                    float f24 = i12 >>> 24;
                    int i17 = (int) ((f10 * f23 * f24) + (f23 * f14) + (f16 * f24) + f18);
                    int min = Math.min(255, Math.max(0, i14));
                    iArr[i10] = (Math.min(255, Math.max(0, i15)) << 8) | (min << 16) | (Math.min(255, Math.max(0, i17)) << 24) | Math.min(255, Math.max(0, i16));
                    i10++;
                    width = i13;
                    iArr2 = iArr3;
                }
                int width4 = createBitmap.getWidth();
                int width5 = createBitmap.getWidth();
                createBitmap = createBitmap;
                createBitmap.setPixels(iArr, 0, width4, 0, 0, width5, createBitmap.getHeight());
                break;
        }
        if (this.f38884i != EnumC3543u.ARITHMETIC) {
            canvas.drawBitmap(q11, 0.0f, 0.0f, paint);
        }
        return createBitmap;
    }

    public void w(String str) {
        this.f38878c = str;
        invalidate();
    }

    public void x(String str) {
        this.f38879d = str;
        invalidate();
    }

    public void y(Float f10) {
        this.f38880e = f10.floatValue();
        invalidate();
    }

    public void z(Float f10) {
        this.f38881f = f10.floatValue();
        invalidate();
    }
}
