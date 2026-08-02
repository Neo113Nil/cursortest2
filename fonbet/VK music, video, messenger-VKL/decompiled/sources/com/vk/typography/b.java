package com.vk.typography;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.TypedValue;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.Font;
import com.vk.typography.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;

/* compiled from: TextViewExt.kt */
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: TextViewExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextSizeUnit.values().length];
            try {
                iArr[TextSizeUnit.PX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextSizeUnit.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float a(float f) {
        float deriveDimension = Build.VERSION.SDK_INT >= 34 ? TypedValue.deriveDimension(2, f, Resources.getSystem().getDisplayMetrics()) : f / Resources.getSystem().getDisplayMetrics().density;
        return an10.b(deriveDimension * ((int) r0)) / ((float) Math.pow(10.0f, 0));
    }

    public static final float b(float f) {
        float applyDimension = TypedValue.applyDimension(2, f, Resources.getSystem().getDisplayMetrics());
        return an10.b(applyDimension * ((int) r0)) / ((float) Math.pow(10.0f, 0));
    }

    public static final void c(Paint paint, Context context, FontFamily fontFamily, Float f, TextSizeUnit textSizeUnit) {
        float f2;
        boolean z = f == null;
        if (f == null) {
            textSizeUnit = TextSizeUnit.SP;
        }
        float floatValue = f != null ? f.floatValue() : a(paint.getTextSize());
        if (floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            floatValue = 13.0f;
        }
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
        if (i == 1) {
            f2 = floatValue;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = b(floatValue);
        }
        Font.Companion.getClass();
        Font a2 = Font.a.a(fontFamily, f2);
        Typeface k = a2.k(context);
        float j = a2.j();
        paint.setTypeface(k);
        paint.setLetterSpacing(j);
        if (z) {
            return;
        }
        int i2 = a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            floatValue = b(floatValue);
        }
        paint.setTextSize(floatValue);
    }

    public static final void d(Paint paint, com.vk.typography.a aVar, int i) {
        float f = aVar.b;
        paint.setTypeface(aVar.a);
        paint.setLetterSpacing(aVar.d);
        if ((i & TextFlag.DO_NOT_CHANGE_SIZE.h()) == 0) {
            int i2 = a.$EnumSwitchMapping$0[aVar.c.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = b(f);
            }
            paint.setTextSize(f);
        }
    }

    public static final void e(TextPaint textPaint, Context context, String str, Float f, TextSizeUnit textSizeUnit) {
        float floatValue = f.floatValue();
        if (floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            floatValue = 13.0f;
        }
        d(textPaint, a.C1933a.b(context, str, floatValue, textSizeUnit), 0);
    }

    public static final void f(TextView textView, FontFamily fontFamily) {
        k(textView, fontFamily, null, 6);
    }

    public static final void g(TextView textView, FontFamily fontFamily, Float f, TextSizeUnit textSizeUnit) {
        float f2;
        int i = 0;
        boolean z = f == null;
        if (f == null) {
            textSizeUnit = TextSizeUnit.SP;
        }
        float floatValue = f != null ? f.floatValue() : a(textView.getTextSize());
        if (floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            floatValue = 13.0f;
        }
        Context context = textView.getContext();
        int i2 = a.C1933a.C1934a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
        if (i2 == 1) {
            f2 = floatValue;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = b(floatValue);
        }
        Font.Companion.getClass();
        Font a2 = Font.a.a(fontFamily, f2);
        Typeface k = a2.k(context);
        float j = a2.j();
        int h = z ? TextFlag.DO_NOT_CHANGE_SIZE.h() : 0;
        textView.setTypeface(k);
        textView.setLetterSpacing(j);
        if ((TextFlag.DO_NOT_CHANGE_SIZE.h() & h) == 0) {
            int i3 = a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 2;
            }
            textView.setTextSize(i, floatValue);
        }
    }

    public static final void h(TextView textView, com.vk.typography.a aVar, int i) {
        int i2;
        textView.setTypeface(aVar.a);
        textView.setLetterSpacing(aVar.d);
        if ((i & TextFlag.DO_NOT_CHANGE_SIZE.h()) == 0) {
            int i3 = a.$EnumSwitchMapping$0[aVar.c.ordinal()];
            if (i3 != 1) {
                i2 = 2;
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i2 = 0;
            }
            textView.setTextSize(i2, aVar.b);
        }
    }

    public static final void i(TextView textView, String str, Float f, TextSizeUnit textSizeUnit) {
        boolean z = f == null;
        if (f == null) {
            textSizeUnit = TextSizeUnit.SP;
        }
        float floatValue = f != null ? f.floatValue() : a(textView.getTextSize());
        if (floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            floatValue = 13.0f;
        }
        h(textView, a.C1933a.b(textView.getContext(), str, floatValue, textSizeUnit), z ? TextFlag.DO_NOT_CHANGE_SIZE.h() : 0);
    }

    public static /* synthetic */ void j(Paint paint, Context context, FontFamily fontFamily, Float f, int i) {
        if ((i & 2) != 0) {
            fontFamily = FontFamily.REGULAR;
        }
        if ((i & 4) != 0) {
            f = null;
        }
        c(paint, context, fontFamily, f, TextSizeUnit.SP);
    }

    public static /* synthetic */ void k(TextView textView, FontFamily fontFamily, Float f, int i) {
        if ((i & 2) != 0) {
            f = null;
        }
        g(textView, fontFamily, f, TextSizeUnit.SP);
    }
}
