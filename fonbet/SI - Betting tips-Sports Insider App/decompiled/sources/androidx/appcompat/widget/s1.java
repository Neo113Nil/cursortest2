package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f905l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f906m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f907a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f908b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f909c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f910d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f911e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f912f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f913g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f914h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f915i;
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public final p1 f916k;

    public s1(TextView textView) {
        this.f915i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f916k = new q1();
        } else {
            this.f916k = new p1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i5 : iArr) {
                if (i5 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i5)) < 0) {
                    arrayList.add(Integer.valueOf(i5));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f906m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e7) {
            io.sentry.android.core.w0.n("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e7) {
            io.sentry.android.core.w0.n("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f908b) {
                if (this.f915i.getMeasuredHeight() <= 0 || this.f915i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f916k.b(this.f915i) ? 1048576 : (this.f915i.getMeasuredWidth() - this.f915i.getTotalPaddingLeft()) - this.f915i.getTotalPaddingRight();
                int height = (this.f915i.getHeight() - this.f915i.getCompoundPaddingBottom()) - this.f915i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f905l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c2 = c(rectF);
                        if (c2 != this.f915i.getTextSize()) {
                            g(c2, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f908b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f912f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i5 = length - 1;
        int i10 = 0;
        int i11 = 1;
        while (i11 <= i5) {
            int i12 = (i11 + i5) / 2;
            int i13 = this.f912f[i12];
            TextView textView = this.f915i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f914h;
            if (textPaint == null) {
                this.f914h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f914h.set(textView.getPaint());
            this.f914h.setTextSize(i13);
            StaticLayout a7 = o1.a(charSequence, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f915i, this.f914h, this.f916k);
            if ((maxLines == -1 || (a7.getLineCount() <= maxLines && a7.getLineEnd(a7.getLineCount() - 1) == charSequence.length())) && a7.getHeight() <= rectF.bottom) {
                int i14 = i12 + 1;
                i10 = i11;
                i11 = i14;
            } else {
                i10 = i12 - 1;
                i5 = i10;
            }
        }
        return this.f912f[i10];
    }

    public final boolean f() {
        return j() && this.f907a != 0;
    }

    public final void g(float f6, int i5) {
        Context context = this.j;
        float applyDimension = TypedValue.applyDimension(i5, f6, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f915i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f908b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, null);
                    }
                } catch (Exception e7) {
                    io.sentry.android.core.w0.n("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f907a == 1) {
            if (!this.f913g || this.f912f.length == 0) {
                int floor = ((int) Math.floor((this.f911e - this.f910d) / this.f909c)) + 1;
                int[] iArr = new int[floor];
                for (int i5 = 0; i5 < floor; i5++) {
                    iArr[i5] = Math.round((i5 * this.f909c) + this.f910d);
                }
                this.f912f = b(iArr);
            }
            this.f908b = true;
        } else {
            this.f908b = false;
        }
        return this.f908b;
    }

    public final boolean i() {
        boolean z5 = this.f912f.length > 0;
        this.f913g = z5;
        if (z5) {
            this.f907a = 1;
            this.f910d = r0[0];
            this.f911e = r0[r1 - 1];
            this.f909c = -1.0f;
        }
        return z5;
    }

    public final boolean j() {
        return !(this.f915i instanceof d0);
    }

    public final void k(float f6, float f10, float f11) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        }
        if (f10 <= f6) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        }
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        }
        this.f907a = 1;
        this.f910d = f6;
        this.f911e = f10;
        this.f909c = f11;
        this.f913g = false;
    }
}
