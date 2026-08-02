package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xah implements vah {
    public static final lwf m = new lwf(0.5f);
    public hz8 a = new p7g();
    public hz8 b = new p7g();
    public hz8 c = new p7g();
    public hz8 d = new p7g();
    public ut3 e = new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public ut3 f = new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public ut3 g = new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public ut3 h = new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public ug5 i = new ug5();
    public ug5 j = new ug5();
    public ug5 k = new ug5();
    public ug5 l = new ug5();

    public static wah g(Context context, int i, int i2) {
        q0 q0Var = new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return j(contextThemeWrapper.obtainStyledAttributes(pjf.M), q0Var);
    }

    public static wah h(Context context, AttributeSet attributeSet, int i, int i2) {
        return i(context, attributeSet, i, i2, new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    public static wah i(Context context, AttributeSet attributeSet, int i, int i2, ut3 ut3Var) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.E, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return j(contextThemeWrapper.obtainStyledAttributes(pjf.M), ut3Var);
    }

    public static wah j(TypedArray typedArray, ut3 ut3Var) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            ut3 k = k(typedArray, 5, ut3Var);
            ut3 k2 = k(typedArray, 8, k);
            ut3 k3 = k(typedArray, 9, k);
            ut3 k4 = k(typedArray, 7, k);
            ut3 k5 = k(typedArray, 6, k);
            wah wahVar = new wah();
            wahVar.a = l4a.n(i2);
            wahVar.e = k2;
            wahVar.b = l4a.n(i3);
            wahVar.f = k3;
            wahVar.c = l4a.n(i4);
            wahVar.g = k4;
            wahVar.d = l4a.n(i5);
            wahVar.h = k5;
            return wahVar;
        } finally {
            typedArray.recycle();
        }
    }

    public static ut3 k(TypedArray typedArray, int i, ut3 ut3Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new q0(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new lwf(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return ut3Var;
    }

    @Override // defpackage.vah
    public final xah a(float f) {
        wah m2 = m();
        m2.b(f);
        return m2.a();
    }

    @Override // defpackage.vah
    public final xah[] c() {
        return new xah[]{this};
    }

    @Override // defpackage.vah
    public final xah e(lwf lwfVar) {
        wah m2 = m();
        m2.e = lwfVar;
        m2.f = lwfVar;
        m2.g = lwfVar;
        m2.h = lwfVar;
        return m2.a();
    }

    @Override // defpackage.vah
    public final boolean f() {
        return false;
    }

    public final boolean l(RectF rectF) {
        boolean z = this.l.getClass().equals(ug5.class) && this.j.getClass().equals(ug5.class) && this.i.getClass().equals(ug5.class) && this.k.getClass().equals(ug5.class);
        float a = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a ? 1 : (this.f.a(rectF) == a ? 0 : -1)) == 0 && (this.h.a(rectF) > a ? 1 : (this.h.a(rectF) == a ? 0 : -1)) == 0 && (this.g.a(rectF) > a ? 1 : (this.g.a(rectF) == a ? 0 : -1)) == 0) && (this.b instanceof p7g) && (this.a instanceof p7g) && (this.c instanceof p7g) && (this.d instanceof p7g);
    }

    public final wah m() {
        wah wahVar = new wah();
        wahVar.a = this.a;
        wahVar.b = this.b;
        wahVar.c = this.c;
        wahVar.d = this.d;
        wahVar.e = this.e;
        wahVar.f = this.f;
        wahVar.g = this.g;
        wahVar.h = this.h;
        wahVar.i = this.i;
        wahVar.j = this.j;
        wahVar.k = this.k;
        wahVar.l = this.l;
        return wahVar;
    }

    public final String toString() {
        return U3.j.d + this.e + ", " + this.f + ", " + this.g + ", " + this.h + U3.j.e;
    }

    @Override // defpackage.vah
    public final xah d() {
        return this;
    }

    @Override // defpackage.vah
    public final xah b(int[] iArr) {
        return this;
    }
}
