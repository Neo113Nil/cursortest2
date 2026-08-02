package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class l51 {
    public int a;
    public int b;
    public float c;
    public boolean d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public float o;
    public float p;

    public l51(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        m6k.v(context, attributeSet, i, i2);
        int[] iArr = pjf.d;
        m6k.w(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = w3a.y(context, obtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null) {
            int i3 = peekValue.type;
            if (i3 == 5) {
                this.b = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), this.a / 2);
                this.d = false;
            } else if (i3 == 6) {
                this.c = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.d = true;
            }
        }
        this.g = obtainStyledAttributes.getInt(6, 0);
        this.h = obtainStyledAttributes.getInt(1, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        int abs = Math.abs(obtainStyledAttributes.getDimensionPixelSize(15, 0));
        this.j = Math.abs(obtainStyledAttributes.getDimensionPixelSize(16, abs));
        this.k = Math.abs(obtainStyledAttributes.getDimensionPixelSize(17, abs));
        this.l = Math.abs(obtainStyledAttributes.getDimensionPixelSize(11, 0));
        this.m = obtainStyledAttributes.getDimensionPixelSize(14, 0);
        this.n = obtainStyledAttributes.getFloat(2, 1.0f);
        this.o = obtainStyledAttributes.getFloat(13, 0.1f);
        this.p = obtainStyledAttributes.getFloat(12, 0.9f);
        if (!obtainStyledAttributes.hasValue(3)) {
            Integer v = o3a.v(R.attr.colorPrimary, context);
            this.e = new int[]{v != null ? v.intValue() : -1};
        } else if (obtainStyledAttributes.peekValue(3).type != 1) {
            this.e = new int[]{obtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(3, -1));
            this.e = intArray;
            if (intArray.length == 0) {
                a70.p("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (obtainStyledAttributes.hasValue(8)) {
            this.f = obtainStyledAttributes.getColor(8, -1);
        } else {
            this.f = this.e[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.f = o3a.q(this.f, (int) (f * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public final int a() {
        return this.d ? (int) (this.a * this.c) : this.b;
    }

    public final boolean b(boolean z) {
        if (this.l <= 0) {
            return false;
        }
        if (z || this.k <= 0) {
            return z && this.j > 0;
        }
        return true;
    }

    public boolean c() {
        return this.d && this.c == 0.5f;
    }

    public void d() {
        if (this.i >= 0) {
            return;
        }
        a70.p("indicatorTrackGapSize must be >= 0.");
    }
}
