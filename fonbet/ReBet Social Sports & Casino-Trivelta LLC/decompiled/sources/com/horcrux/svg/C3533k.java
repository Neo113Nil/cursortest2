package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3533k extends AbstractC3539q {

    /* renamed from: c, reason: collision with root package name */
    public String f38873c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC3542t f38874d;

    /* renamed from: e, reason: collision with root package name */
    public ReadableArray f38875e;

    /* renamed from: com.horcrux.svg.k$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$FilterProperties$FeColorMatrixType;

        static {
            int[] iArr = new int[EnumC3542t.values().length];
            $SwitchMap$com$horcrux$svg$FilterProperties$FeColorMatrixType = iArr;
            try {
                iArr[EnumC3542t.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeColorMatrixType[EnumC3542t.SATURATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeColorMatrixType[EnumC3542t.HUE_ROTATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeColorMatrixType[EnumC3542t.LUMINANCE_TO_ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C3533k(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC3539q
    public Bitmap o(HashMap hashMap, Bitmap bitmap) {
        Bitmap q10 = AbstractC3539q.q(hashMap, bitmap, this.f38873c);
        ColorMatrix colorMatrix = new ColorMatrix();
        int i10 = a.$SwitchMap$com$horcrux$svg$FilterProperties$FeColorMatrixType[this.f38874d.ordinal()];
        if (i10 == 1) {
            if (this.f38875e.size() >= 20) {
                float[] fArr = new float[this.f38875e.size()];
                for (int i11 = 0; i11 < this.f38875e.size(); i11++) {
                    fArr[i11] = ((float) this.f38875e.getDouble(i11)) * (i11 % 5 == 4 ? 255 : 1);
                }
                colorMatrix.set(fArr);
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, q10);
            }
            return q10;
        }
        if (i10 == 2) {
            if (this.f38875e.size() == 1) {
                colorMatrix.setSaturation((float) this.f38875e.getDouble(0));
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, q10);
            }
            return q10;
        }
        if (i10 == 3) {
            if (this.f38875e.size() == 1) {
                double d10 = (((float) this.f38875e.getDouble(0)) * 3.141592653589793d) / 180.0d;
                float cos = (float) Math.cos(d10);
                float sin = (float) Math.sin(d10);
                float f10 = 0.715f - (cos * 0.715f);
                float f11 = sin * 0.715f;
                float f12 = 0.072f - (cos * 0.072f);
                float f13 = 0.213f - (cos * 0.213f);
                colorMatrix.set(new float[]{((cos * 0.787f) + 0.213f) - (sin * 0.213f), f10 - f11, f12 + (sin * 0.928f), 0.0f, 0.0f, f13 + (0.143f * sin), (0.285f * cos) + 0.715f + (0.14f * sin), f12 - (0.283f * sin), 0.0f, 0.0f, f13 - (0.787f * sin), f10 + f11, (cos * 0.928f) + 0.072f + (sin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            }
            return q10;
        }
        if (i10 == 4) {
            colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, q10);
    }

    public void w(String str) {
        this.f38873c = str;
        invalidate();
    }

    public void x(String str) {
        this.f38874d = EnumC3542t.b(str);
        invalidate();
    }

    public void y(ReadableArray readableArray) {
        this.f38875e = readableArray;
        invalidate();
    }
}
