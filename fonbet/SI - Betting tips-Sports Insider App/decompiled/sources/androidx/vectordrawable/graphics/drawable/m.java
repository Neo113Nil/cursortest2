package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import androidx.transition.n0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: d, reason: collision with root package name */
    public n0 f2804d;

    /* renamed from: e, reason: collision with root package name */
    public float f2805e;

    /* renamed from: f, reason: collision with root package name */
    public n0 f2806f;

    /* renamed from: g, reason: collision with root package name */
    public float f2807g;

    /* renamed from: h, reason: collision with root package name */
    public float f2808h;

    /* renamed from: i, reason: collision with root package name */
    public float f2809i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f2810k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f2811l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f2812m;

    /* renamed from: n, reason: collision with root package name */
    public float f2813n;

    @Override // androidx.vectordrawable.graphics.drawable.o
    public final boolean a() {
        return this.f2806f.e() || this.f2804d.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // androidx.vectordrawable.graphics.drawable.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z5;
        n0 n0Var;
        n0 n0Var2 = this.f2806f;
        boolean z7 = true;
        if (n0Var2.e()) {
            ColorStateList colorStateList = (ColorStateList) n0Var2.f2735d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != n0Var2.f2733b) {
                n0Var2.f2733b = colorForState;
                z5 = true;
                n0Var = this.f2804d;
                if (n0Var.e()) {
                    ColorStateList colorStateList2 = (ColorStateList) n0Var.f2735d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != n0Var.f2733b) {
                        n0Var.f2733b = colorForState2;
                        return z5 | z7;
                    }
                }
                z7 = false;
                return z5 | z7;
            }
        }
        z5 = false;
        n0Var = this.f2804d;
        if (n0Var.e()) {
        }
        z7 = false;
        return z5 | z7;
    }

    public float getFillAlpha() {
        return this.f2808h;
    }

    public int getFillColor() {
        return this.f2806f.f2733b;
    }

    public float getStrokeAlpha() {
        return this.f2807g;
    }

    public int getStrokeColor() {
        return this.f2804d.f2733b;
    }

    public float getStrokeWidth() {
        return this.f2805e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.f2810k;
    }

    public float getTrimPathStart() {
        return this.f2809i;
    }

    public void setFillAlpha(float f6) {
        this.f2808h = f6;
    }

    public void setFillColor(int i5) {
        this.f2806f.f2733b = i5;
    }

    public void setStrokeAlpha(float f6) {
        this.f2807g = f6;
    }

    public void setStrokeColor(int i5) {
        this.f2804d.f2733b = i5;
    }

    public void setStrokeWidth(float f6) {
        this.f2805e = f6;
    }

    public void setTrimPathEnd(float f6) {
        this.j = f6;
    }

    public void setTrimPathOffset(float f6) {
        this.f2810k = f6;
    }

    public void setTrimPathStart(float f6) {
        this.f2809i = f6;
    }
}
