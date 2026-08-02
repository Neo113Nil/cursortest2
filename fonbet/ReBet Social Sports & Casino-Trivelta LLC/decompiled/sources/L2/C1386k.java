package L2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: L2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1386k extends T {

    /* renamed from: a, reason: collision with root package name */
    public float f6859a = 3.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f6860b = 80;

    @Override // L2.w
    public long c(ViewGroup viewGroup, AbstractC1388m abstractC1388m, A a10, A a11) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup viewGroup2;
        int i14;
        A a12 = a10;
        if (a12 == null && a11 == null) {
            return 0L;
        }
        Rect v10 = abstractC1388m.v();
        if (a11 == null || e(a12) == 0) {
            i10 = -1;
        } else {
            a12 = a11;
            i10 = 1;
        }
        int f10 = f(a12);
        int g10 = g(a12);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + round;
        int height = viewGroup.getHeight() + round2;
        if (v10 != null) {
            int centerX = v10.centerX();
            i13 = g10;
            viewGroup2 = viewGroup;
            i14 = round2;
            i12 = v10.centerY();
            i11 = centerX;
        } else {
            i11 = (round + width) / 2;
            i12 = (round2 + height) / 2;
            i13 = g10;
            viewGroup2 = viewGroup;
            i14 = round2;
        }
        float h10 = h(viewGroup2, f10, i13, i11, i12, round, i14, width, height) / i(viewGroup);
        long u10 = abstractC1388m.u();
        if (u10 < 0) {
            u10 = 300;
        }
        return Math.round(((u10 * i10) / this.f6859a) * h10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0012, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001d, code lost:
    
        if (r6.getLayoutDirection() == 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r6.getLayoutDirection() == 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        r0 = 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = this.f6860b;
        if (i18 != 8388611) {
            if (i18 == 8388613) {
            }
        }
        if (i18 == 3) {
            return (i16 - i10) + Math.abs(i13 - i11);
        }
        if (i18 == 5) {
            return (i10 - i14) + Math.abs(i13 - i11);
        }
        if (i18 == 48) {
            return (i17 - i11) + Math.abs(i12 - i10);
        }
        if (i18 != 80) {
            return 0;
        }
        return (i11 - i15) + Math.abs(i12 - i10);
    }

    public final int i(ViewGroup viewGroup) {
        int i10 = this.f6860b;
        return (i10 == 3 || i10 == 5 || i10 == 8388611 || i10 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    public void j(int i10) {
        this.f6860b = i10;
    }
}
