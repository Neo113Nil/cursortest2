package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3532j extends AbstractC3539q {

    /* renamed from: c, reason: collision with root package name */
    public String f38868c;

    /* renamed from: d, reason: collision with root package name */
    public String f38869d;

    /* renamed from: e, reason: collision with root package name */
    public EnumC3541s f38870e;

    /* renamed from: com.horcrux.svg.j$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode;

        static {
            int[] iArr = new int[EnumC3541s.values().length];
            $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode = iArr;
            try {
                iArr[EnumC3541s.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[EnumC3541s.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[EnumC3541s.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[EnumC3541s.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[EnumC3541s.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[EnumC3541s.MULTIPLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C3532j(ReactContext reactContext) {
        super(reactContext);
        this.f38919b.mX = new SVGLength(0.0d);
        this.f38919b.mY = new SVGLength(0.0d);
        this.f38919b.mW = new SVGLength("100%");
        this.f38919b.mH = new SVGLength("100%");
    }

    public static /* synthetic */ float[] w(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = 1.0f - f10;
        float f12 = fArr2[0];
        float f13 = 1.0f - f12;
        float f14 = fArr[1] * f10;
        float f15 = fArr2[1];
        float f16 = (f14 * f13) + (f15 * f12 * f11) + (f14 * f15 * f12);
        float f17 = fArr[2] * f10;
        float f18 = fArr2[2];
        float f19 = fArr[3] * f10;
        float f20 = fArr2[3];
        return new float[]{1.0f - (f11 * f13), f16, (f17 * f13) + (f18 * f12 * f11) + (f17 * f18 * f12), (f13 * f19) + (f20 * f12 * f11) + (f19 * f20 * f12)};
    }

    @Override // com.horcrux.svg.AbstractC3539q
    public Bitmap o(HashMap hashMap, Bitmap bitmap) {
        Bitmap q10 = AbstractC3539q.q(hashMap, bitmap, this.f38868c);
        Bitmap q11 = AbstractC3539q.q(hashMap, bitmap, this.f38869d);
        if (this.f38870e == EnumC3541s.MULTIPLY) {
            return CustomFilter.apply(q10, q11, new InterfaceC3526d() { // from class: com.horcrux.svg.i
                @Override // com.horcrux.svg.InterfaceC3526d
                public final float[] a(float[] fArr, float[] fArr2) {
                    return C3532j.w(fArr, fArr2);
                }
            });
        }
        Bitmap createBitmap = Bitmap.createBitmap(q10.getWidth(), q10.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(q10, 0.0f, 0.0f, paint);
        int i10 = a.$SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[this.f38870e.ordinal()];
        if (i10 == 1 || i10 == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (i10 == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (i10 == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        } else if (i10 == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        }
        canvas.drawBitmap(q11, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public void x(String str) {
        this.f38868c = str;
        invalidate();
    }

    public void y(String str) {
        this.f38869d = str;
        invalidate();
    }

    public void z(String str) {
        this.f38870e = EnumC3541s.b(str);
        invalidate();
    }
}
