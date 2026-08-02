package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC2082d0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2069y {

    /* renamed from: k, reason: collision with root package name */
    public static final RectF f17392k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    public static ConcurrentHashMap f17393l = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public TextPaint f17400g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f17401h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f17402i;

    /* renamed from: j, reason: collision with root package name */
    public final d f17403j;

    /* renamed from: a, reason: collision with root package name */
    public int f17394a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17395b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f17396c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f17397d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f17398e = -1.0f;
    private int[] mAutoSizeTextSizesInPx = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public boolean f17399f = false;

    /* renamed from: androidx.appcompat.widget.y$a */
    public static final class a {
        @NonNull
        public static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull d dVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: androidx.appcompat.widget.y$b */
    public static class b extends d {
        @Override // androidx.appcompat.widget.C2069y.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C2069y.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.y$c */
    public static class c extends b {
        @Override // androidx.appcompat.widget.C2069y.b, androidx.appcompat.widget.C2069y.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.C2069y.d
        public boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* renamed from: androidx.appcompat.widget.y$d */
    public static class d {
        public abstract void a(StaticLayout.Builder builder, TextView textView);

        public boolean b(TextView textView) {
            return ((Boolean) C2069y.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C2069y(TextView textView) {
        this.f17401h = textView;
        this.f17402i = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f17403j = new c();
        } else {
            this.f17403j = new b();
        }
    }

    public static Method k(String str) {
        try {
            Method method = (Method) f17393l.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            f17393l.put(str, method);
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public void a() {
        if (n()) {
            if (this.f17395b) {
                if (this.f17401h.getMeasuredHeight() <= 0 || this.f17401h.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f17403j.b(this.f17401h) ? PKIFailureInfo.badCertTemplate : (this.f17401h.getMeasuredWidth() - this.f17401h.getTotalPaddingLeft()) - this.f17401h.getTotalPaddingRight();
                int height = (this.f17401h.getHeight() - this.f17401h.getCompoundPaddingBottom()) - this.f17401h.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f17392k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float e10 = e(rectF);
                        if (e10 != this.f17401h.getTextSize()) {
                            t(0, e10);
                        }
                    } finally {
                    }
                }
            }
            this.f17395b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final void c() {
        this.f17394a = 0;
        this.f17397d = -1.0f;
        this.f17398e = -1.0f;
        this.f17396c = -1.0f;
        this.mAutoSizeTextSizesInPx = new int[0];
        this.f17395b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f17401h, this.f17400g, this.f17403j);
    }

    public final int e(RectF rectF) {
        int length = this.mAutoSizeTextSizesInPx.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.mAutoSizeTextSizesInPx[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.mAutoSizeTextSizesInPx[i12];
    }

    public int f() {
        return Math.round(this.f17398e);
    }

    public int g() {
        return Math.round(this.f17397d);
    }

    public int h() {
        return Math.round(this.f17396c);
    }

    public int[] i() {
        return this.mAutoSizeTextSizesInPx;
    }

    public int j() {
        return this.f17394a;
    }

    public void l(int i10) {
        TextPaint textPaint = this.f17400g;
        if (textPaint == null) {
            this.f17400g = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f17400g.set(this.f17401h.getPaint());
        this.f17400g.setTextSize(i10);
    }

    public boolean n() {
        return y() && this.f17394a != 0;
    }

    public void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f17402i.obtainStyledAttributes(attributeSet, l.j.AppCompatTextView, i10, 0);
        TextView textView = this.f17401h;
        AbstractC2082d0.j0(textView, textView.getContext(), l.j.AppCompatTextView, attributeSet, obtainStyledAttributes, i10, 0);
        if (obtainStyledAttributes.hasValue(l.j.f55266Z)) {
            this.f17394a = obtainStyledAttributes.getInt(l.j.f55266Z, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(l.j.f55262Y) ? obtainStyledAttributes.getDimension(l.j.f55262Y, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(l.j.f55254W) ? obtainStyledAttributes.getDimension(l.j.f55254W, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(l.j.f55250V) ? obtainStyledAttributes.getDimension(l.j.f55250V, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(l.j.f55258X) && (resourceId = obtainStyledAttributes.getResourceId(l.j.f55258X, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f17394a = 0;
            return;
        }
        if (this.f17394a == 1) {
            if (!this.f17399f) {
                DisplayMetrics displayMetrics = this.f17402i.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    public void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f17402i.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    public void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f17402i.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.mAutoSizeTextSizesInPx = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f17399f = false;
            }
            if (u()) {
                a();
            }
        }
    }

    public void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f17402i.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    public final void s(float f10) {
        if (f10 != this.f17401h.getPaint().getTextSize()) {
            this.f17401h.getPaint().setTextSize(f10);
            boolean isInLayout = this.f17401h.isInLayout();
            if (this.f17401h.getLayout() != null) {
                this.f17395b = false;
                try {
                    Method k10 = k("nullLayouts");
                    if (k10 != null) {
                        k10.invoke(this.f17401h, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (isInLayout) {
                    this.f17401h.forceLayout();
                } else {
                    this.f17401h.requestLayout();
                }
                this.f17401h.invalidate();
            }
        }
    }

    public void t(int i10, float f10) {
        Context context = this.f17402i;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean u() {
        if (y() && this.f17394a == 1) {
            if (!this.f17399f || this.mAutoSizeTextSizesInPx.length == 0) {
                int floor = ((int) Math.floor((this.f17398e - this.f17397d) / this.f17396c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f17397d + (i10 * this.f17396c));
                }
                this.mAutoSizeTextSizesInPx = b(iArr);
            }
            this.f17395b = true;
        } else {
            this.f17395b = false;
        }
        return this.f17395b;
    }

    public final void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.mAutoSizeTextSizesInPx = b(iArr);
            w();
        }
    }

    public final boolean w() {
        boolean z10 = this.mAutoSizeTextSizesInPx.length > 0;
        this.f17399f = z10;
        if (z10) {
            this.f17394a = 1;
            this.f17397d = r0[0];
            this.f17398e = r0[r1 - 1];
            this.f17396c = -1.0f;
        }
        return z10;
    }

    public final boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f17401h.getText();
        TransformationMethod transformationMethod = this.f17401h.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f17401h)) != null) {
            text = transformation;
        }
        int maxLines = this.f17401h.getMaxLines();
        l(i10);
        StaticLayout d10 = d(text, (Layout.Alignment) m(this.f17401h, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d10.getLineCount() <= maxLines && d10.getLineEnd(d10.getLineCount() - 1) == text.length())) && ((float) d10.getHeight()) <= rectF.bottom;
    }

    public final boolean y() {
        return !(this.f17401h instanceof AppCompatEditText);
    }

    public final void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f17394a = 1;
        this.f17397d = f10;
        this.f17398e = f11;
        this.f17396c = f12;
        this.f17399f = false;
    }
}
