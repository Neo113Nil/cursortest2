package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import s0.AbstractC6307a;

/* loaded from: classes3.dex */
public final class j extends f {

    /* renamed from: c, reason: collision with root package name */
    public int f35142c = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    @Override // com.google.android.material.carousel.f
    public h g(b bVar, View view) {
        boolean z10;
        int b10 = bVar.b();
        if (bVar.k()) {
            b10 = bVar.a();
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.k()) {
            f10 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float d10 = d() + f10;
        float max = Math.max(c() + f10, d10);
        float f11 = b10;
        float min = Math.min(measuredHeight + f10, f11);
        float a10 = AbstractC6307a.a((measuredHeight / 3.0f) + f10, d10 + f10, max + f10);
        float f12 = (min + a10) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        float f13 = 2.0f * d10;
        if (f11 <= f13) {
            iArr = new int[]{0};
        }
        int[] iArr2 = MEDIUM_COUNTS;
        if (bVar.h() == 1) {
            iArr = f.a(iArr);
            iArr2 = f.a(iArr2);
        }
        int[] iArr3 = iArr2;
        int[] iArr4 = iArr;
        float f14 = f10;
        int max2 = (int) Math.max(1.0d, Math.floor(((f11 - (g.i(iArr3) * f12)) - (g.i(iArr4) * max)) / min));
        int ceil = (int) Math.ceil(f11 / min);
        int i10 = (ceil - max2) + 1;
        int[] iArr5 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr5[i11] = ceil - i11;
        }
        a c10 = a.c(f11, a10, d10, max, iArr4, f12, iArr3, min, iArr5);
        this.f35142c = c10.e();
        boolean i12 = i(c10, bVar.j());
        int i13 = c10.f35100d;
        if (i13 == 0 && c10.f35099c == 0 && f11 > f13) {
            c10.f35099c = 1;
            z10 = true;
        } else {
            z10 = i12;
        }
        if (z10) {
            c10 = a.c(f11, a10, d10, max, new int[]{c10.f35099c}, f12, new int[]{i13}, min, new int[]{c10.f35103g});
        }
        return g.d(view.getContext(), f14, b10, c10, bVar.h());
    }

    @Override // com.google.android.material.carousel.f
    public boolean h(b bVar, int i10) {
        if (i10 >= this.f35142c || bVar.j() < this.f35142c) {
            return i10 >= this.f35142c && bVar.j() < this.f35142c;
        }
        return true;
    }

    public boolean i(a aVar, int i10) {
        int e10 = aVar.e() - i10;
        boolean z10 = e10 > 0 && (aVar.f35099c > 0 || aVar.f35100d > 1);
        while (e10 > 0) {
            int i11 = aVar.f35099c;
            if (i11 > 0) {
                aVar.f35099c = i11 - 1;
            } else {
                int i12 = aVar.f35100d;
                if (i12 > 1) {
                    aVar.f35100d = i12 - 1;
                }
            }
            e10--;
        }
        return z10;
    }
}
