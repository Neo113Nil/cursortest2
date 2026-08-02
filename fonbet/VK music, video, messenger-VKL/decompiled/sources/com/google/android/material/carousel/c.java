package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import com.google.android.material.carousel.b;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.ji;
import xsna.lv9;
import xsna.rq2;
import xsna.xy9;

/* compiled from: KeylineStateList.java */
/* loaded from: classes13.dex */
public final class c {
    public final b a;
    public final List<b> b;
    public final List<b> c;
    public final float[] d;
    public final float[] e;
    public final float f;
    public final float g;

    public c(@NonNull b bVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = bVar;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = Collections.unmodifiableList(arrayList2);
        float f = ((b) xy9.b(1, arrayList)).b().a - bVar.b().a;
        this.f = f;
        float f2 = bVar.d().a - ((b) xy9.b(1, arrayList2)).d().a;
        this.g = f2;
        this.d = d(f, arrayList, true);
        this.e = d(f2, arrayList2, false);
    }

    public static float[] d(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            b bVar = (b) arrayList.get(i2);
            b bVar2 = (b) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? bVar2.b().a - bVar.b().a : bVar.d().a - bVar2.d().a) / f);
            i++;
        }
        return fArr;
    }

    public static b e(b bVar, int i, int i2, float f, int i3, int i4, float f2) {
        ArrayList arrayList = new ArrayList(bVar.b);
        arrayList.add(i2, (b.C0118b) arrayList.remove(i));
        b.a aVar = new b.a(bVar.a, f2);
        float f3 = f;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            b.C0118b c0118b = (b.C0118b) arrayList.get(i5);
            float f4 = c0118b.d;
            aVar.b((f4 / 2.0f) + f3, c0118b.c, f4, i5 >= i3 && i5 <= i4, c0118b.e, c0118b.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            f3 += c0118b.d;
            i5++;
        }
        return aVar.d();
    }

    public static b f(b bVar, float f, float f2, boolean z, float f3) {
        int i;
        List<b.C0118b> list = bVar.b;
        ArrayList arrayList = new ArrayList(list);
        float f4 = bVar.a;
        b.a aVar = new b.a(f4, f2);
        Iterator<b.C0118b> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().e) {
                i2++;
            }
        }
        float size = f / (list.size() - i2);
        float f5 = z ? f : 0.0f;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            b.C0118b c0118b = (b.C0118b) arrayList.get(i3);
            if (c0118b.e) {
                i = i3;
                aVar.b(c0118b.b, c0118b.c, c0118b.d, false, true, c0118b.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                i = i3;
                boolean z2 = i >= bVar.c && i <= bVar.d;
                float f6 = c0118b.d - size;
                float a = lv9.a(f6, f4, f3);
                float f7 = (f6 / 2.0f) + f5;
                float f8 = f7 - c0118b.b;
                float f9 = c0118b.f;
                float f10 = f8;
                if (!z) {
                    f8 = 0.0f;
                }
                if (z) {
                    f10 = 0.0f;
                }
                aVar.b(f7, a, f6, z2, false, f9, f8, f10);
                f5 += f6;
            }
            i3 = i + 1;
        }
        return aVar.d();
    }

    public final b a() {
        return (b) ji.a(1, this.c);
    }

    public final b b(float f, float f2, float f3) {
        float b;
        List<b> list;
        float[] fArr;
        float[] fArr2;
        float f4 = this.f;
        float f5 = f2 + f4;
        float f6 = this.g;
        float f7 = f3 - f6;
        float f8 = c().a().g;
        float f9 = a().c().h;
        if (f4 == f8) {
            f5 += f8;
        }
        if (f6 == f9) {
            f7 -= f9;
        }
        if (f < f5) {
            b = rq2.b(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f5, f);
            list = this.b;
            fArr = this.d;
        } else {
            if (f <= f7) {
                return this.a;
            }
            b = rq2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f7, f3, f);
            list = this.c;
            fArr = this.e;
        }
        int size = list.size();
        float f10 = fArr[0];
        int i = 1;
        while (true) {
            if (i >= size) {
                fArr2 = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                break;
            }
            float f11 = fArr[i];
            if (b <= f11) {
                fArr2 = new float[]{rq2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f10, f11, b), i - 1, i};
                break;
            }
            i++;
            f10 = f11;
        }
        b bVar = list.get((int) fArr2[1]);
        b bVar2 = list.get((int) fArr2[2]);
        float f12 = fArr2[0];
        float f13 = bVar.a;
        List<b.C0118b> list2 = bVar.b;
        if (f13 != bVar2.a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<b.C0118b> list3 = bVar2.b;
        if (list2.size() != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            b.C0118b c0118b = list2.get(i2);
            b.C0118b c0118b2 = list3.get(i2);
            arrayList.add(new b.C0118b(rq2.a(c0118b.a, c0118b2.a, f12), rq2.a(c0118b.b, c0118b2.b, f12), rq2.a(c0118b.c, c0118b2.c, f12), rq2.a(c0118b.d, c0118b2.d, f12), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        return new b(bVar.a, arrayList, rq2.c(bVar.c, bVar2.c, f12), rq2.c(bVar.d, bVar2.d, f12));
    }

    public final b c() {
        return (b) ji.a(1, this.b);
    }
}
