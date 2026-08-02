package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e51 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e51(int i, String str, Class cls) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                int alpha = Color.alpha(((ExtendedFloatingActionButton) obj).getCurrentOriginalTextColor());
                return Float.valueOf(alpha != 0 ? Color.alpha(r2.getCurrentTextColor()) / alpha : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return Float.valueOf(((hv2) obj).h);
            case 7:
                return Float.valueOf(((hv2) obj).i);
            case 8:
                return Float.valueOf(((jv2) obj).h);
            case 9:
                return Float.valueOf(((jv2) obj).i);
            case 10:
                return Float.valueOf(((hb5) obj).b());
            case 11:
                return Float.valueOf(((View) obj).getLayoutParams().width);
            case 12:
                return Float.valueOf(((View) obj).getLayoutParams().height);
            case 13:
                return Float.valueOf(((View) obj).getPaddingStart());
            case 14:
                return Float.valueOf(((View) obj).getPaddingEnd());
            case 15:
                return Float.valueOf(((w7b) obj).h);
            case 16:
                return Float.valueOf(((y7b) obj).i);
            case 17:
                return Float.valueOf(((SwitchCompat) obj).z);
            case 18:
                return Float.valueOf(kvk.a.F((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                Float f = (Float) obj2;
                if (f.floatValue() == 1.0f) {
                    extendedFloatingActionButton.z(extendedFloatingActionButton.getOriginalTextColor());
                    break;
                } else {
                    extendedFloatingActionButton.z(ColorStateList.valueOf(o23.k(extendedFloatingActionButton.getCurrentOriginalTextColor(), Math.round(e80.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Color.alpha(r13), f.floatValue())))));
                    break;
                }
            case 1:
                fn2 fn2Var = (fn2) obj;
                PointF pointF = (PointF) obj2;
                fn2Var.getClass();
                fn2Var.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                fn2Var.b = round;
                int i = fn2Var.f + 1;
                fn2Var.f = i;
                if (i == fn2Var.g) {
                    kvk.a(fn2Var.e, fn2Var.a, round, fn2Var.c, fn2Var.d);
                    fn2Var.f = 0;
                    fn2Var.g = 0;
                    break;
                }
                break;
            case 2:
                fn2 fn2Var2 = (fn2) obj;
                PointF pointF2 = (PointF) obj2;
                fn2Var2.getClass();
                fn2Var2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                fn2Var2.d = round2;
                int i2 = fn2Var2.g + 1;
                fn2Var2.g = i2;
                if (fn2Var2.f == i2) {
                    kvk.a(fn2Var2.e, fn2Var2.a, fn2Var2.b, fn2Var2.c, round2);
                    fn2Var2.f = 0;
                    fn2Var2.g = 0;
                    break;
                }
                break;
            case 3:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                kvk.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 4:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                kvk.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 5:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                kvk.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 6:
                hv2 hv2Var = (hv2) obj;
                float floatValue = ((Float) obj2).floatValue();
                hv2Var.h = floatValue;
                int i3 = (int) (floatValue * 5400.0f);
                qq7 qq7Var = hv2Var.e;
                ArrayList arrayList = (ArrayList) hv2Var.b;
                kb5 kb5Var = (kb5) arrayList.get(0);
                float f2 = hv2Var.h * 1520.0f;
                kb5Var.a = (-20.0f) + f2;
                kb5Var.b = f2;
                for (int i4 = 0; i4 < 4; i4++) {
                    kb5Var.b = (qq7Var.getInterpolation(r9.j(i3, hv2.k[i4], 667)) * 250.0f) + kb5Var.b;
                    kb5Var.a = (qq7Var.getInterpolation(r9.j(i3, hv2.l[i4], 667)) * 250.0f) + kb5Var.a;
                }
                float f3 = kb5Var.a;
                float f4 = kb5Var.b;
                kb5Var.a = (((f4 - f3) * hv2Var.i) + f3) / 360.0f;
                kb5Var.b = f4 / 360.0f;
                int i5 = 0;
                while (true) {
                    if (i5 < 4) {
                        float j = r9.j(i3, hv2.m[i5], 333);
                        if (j <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || j >= 1.0f) {
                            i5++;
                        } else {
                            int i6 = i5 + hv2Var.g;
                            int[] iArr = hv2Var.f.e;
                            int length = i6 % iArr.length;
                            int length2 = (length + 1) % iArr.length;
                            ((kb5) arrayList.get(0)).c = jg0.a(qq7Var.getInterpolation(j), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2])).intValue();
                        }
                    }
                }
                ((v0a) hv2Var.a).invalidateSelf();
                break;
            case 7:
                ((hv2) obj).i = ((Float) obj2).floatValue();
                break;
            case 8:
                jv2 jv2Var = (jv2) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                jv2Var.h = floatValue2;
                int i7 = (int) (floatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = jv2Var.e;
                ArrayList arrayList2 = (ArrayList) jv2Var.b;
                kb5 kb5Var2 = (kb5) arrayList2.get(0);
                float f5 = jv2Var.h * 1080.0f;
                int[] iArr2 = jv2.l;
                float f6 = 0.0f;
                for (int i8 : iArr2) {
                    f6 += timeInterpolator.getInterpolation(r9.j(i7, i8, 500)) * 90.0f;
                }
                kb5Var2.g = f5 + f6;
                float interpolation = timeInterpolator.getInterpolation(r9.j(i7, 0, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED)) - timeInterpolator.getInterpolation(r9.j(i7, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED));
                kb5Var2.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float[] fArr = jv2.m;
                float F = o6a.F(fArr[0], fArr[1], interpolation);
                kb5Var2.b = F;
                float f7 = jv2Var.i;
                if (f7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    kb5Var2.b = (1.0f - f7) * F;
                }
                int i9 = 0;
                while (true) {
                    if (i9 < iArr2.length) {
                        float j2 = r9.j(i7, iArr2[i9], 100);
                        if (j2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || j2 > 1.0f) {
                            i9++;
                        } else {
                            int i10 = i9 + jv2Var.g;
                            int[] iArr3 = jv2Var.f.e;
                            int length3 = i10 % iArr3.length;
                            int length4 = (length3 + 1) % iArr3.length;
                            ((kb5) arrayList2.get(0)).c = jg0.a(timeInterpolator.getInterpolation(j2), Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4])).intValue();
                        }
                    }
                }
                ((v0a) jv2Var.a).invalidateSelf();
                break;
            case 9:
                ((jv2) obj).i = ((Float) obj2).floatValue();
                break;
            case 10:
                hb5 hb5Var = (hb5) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                if (hb5Var.i != floatValue3) {
                    hb5Var.i = floatValue3;
                    hb5Var.invalidateSelf();
                    break;
                }
                break;
            case 11:
                View view4 = (View) obj;
                view4.getLayoutParams().width = ((Float) obj2).intValue();
                view4.requestLayout();
                break;
            case 12:
                View view5 = (View) obj;
                view5.getLayoutParams().height = ((Float) obj2).intValue();
                view5.requestLayout();
                break;
            case 13:
                View view6 = (View) obj;
                view6.setPaddingRelative(((Float) obj2).intValue(), view6.getPaddingTop(), view6.getPaddingEnd(), view6.getPaddingBottom());
                break;
            case 14:
                View view7 = (View) obj;
                view7.setPaddingRelative(view7.getPaddingStart(), view7.getPaddingTop(), ((Float) obj2).intValue(), view7.getPaddingBottom());
                break;
            case 15:
                w7b w7bVar = (w7b) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                w7bVar.h = floatValue4;
                ArrayList arrayList3 = (ArrayList) w7bVar.b;
                ((kb5) arrayList3.get(0)).a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float j3 = r9.j((int) (floatValue4 * 333.0f), 0, 667);
                kb5 kb5Var3 = (kb5) arrayList3.get(0);
                kb5 kb5Var4 = (kb5) arrayList3.get(1);
                qq7 qq7Var2 = w7bVar.d;
                float interpolation2 = qq7Var2.getInterpolation(j3);
                kb5Var4.a = interpolation2;
                kb5Var3.b = interpolation2;
                kb5 kb5Var5 = (kb5) arrayList3.get(1);
                kb5 kb5Var6 = (kb5) arrayList3.get(2);
                float interpolation3 = qq7Var2.getInterpolation(j3 + 0.49925038f);
                kb5Var6.a = interpolation3;
                kb5Var5.b = interpolation3;
                ((kb5) arrayList3.get(2)).b = 1.0f;
                if (w7bVar.g && ((kb5) arrayList3.get(1)).b < 1.0f) {
                    ((kb5) arrayList3.get(2)).c = ((kb5) arrayList3.get(1)).c;
                    ((kb5) arrayList3.get(1)).c = ((kb5) arrayList3.get(0)).c;
                    ((kb5) arrayList3.get(0)).c = w7bVar.e.e[w7bVar.f];
                    w7bVar.g = false;
                }
                ((v0a) w7bVar.a).invalidateSelf();
                break;
            case 16:
                y7b y7bVar = (y7b) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                y7bVar.i = floatValue5;
                int i11 = (int) (floatValue5 * 1800.0f);
                Interpolator[] interpolatorArr = y7bVar.e;
                ArrayList arrayList4 = (ArrayList) y7bVar.b;
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    kb5 kb5Var7 = (kb5) arrayList4.get(i12);
                    int[] iArr4 = y7b.l;
                    int i13 = i12 * 2;
                    int i14 = iArr4[i13];
                    int[] iArr5 = y7b.k;
                    kb5Var7.a = s6a.s(interpolatorArr[i13].getInterpolation(r9.j(i11, i14, iArr5[i13])), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    int i15 = i13 + 1;
                    kb5Var7.b = s6a.s(interpolatorArr[i15].getInterpolation(r9.j(i11, iArr4[i15], iArr5[i15])), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                }
                if (y7bVar.h) {
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((kb5) it.next()).c = y7bVar.f.e[y7bVar.g];
                    }
                    y7bVar.h = false;
                }
                ((v0a) y7bVar.a).invalidateSelf();
                break;
            case 17:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 18:
                kvk.a.M((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
