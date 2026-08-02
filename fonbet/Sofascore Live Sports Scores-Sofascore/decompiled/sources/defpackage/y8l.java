package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y8l implements View.OnApplyWindowInsetsListener {
    public final qo2 a;
    public x9l b;

    public y8l(View view, qo2 qo2Var) {
        x9l x9lVar;
        this.a = qo2Var;
        WeakHashMap weakHashMap = bsk.a;
        x9l a = trk.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            x9lVar = (i >= 36 ? new k9l(a) : i >= 35 ? new j9l(a) : i >= 34 ? new i9l(a) : i >= 31 ? new h9l(a) : i >= 30 ? new g9l(a) : i >= 29 ? new f9l(a) : new e9l(a)).b();
        } else {
            x9lVar = null;
        }
        this.b = x9lVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = x9l.h(view, windowInsets);
            return z8l.j(view, windowInsets);
        }
        x9l h = x9l.h(view, windowInsets);
        u9l u9lVar = h.a;
        x9l x9lVar = this.b;
        if (x9lVar == null) {
            WeakHashMap weakHashMap = bsk.a;
            x9lVar = trk.a(view);
            this.b = x9lVar;
        }
        if (x9lVar == null) {
            this.b = h;
            return z8l.j(view, windowInsets);
        }
        qo2 k = z8l.k(view);
        if (k != null && Objects.equals((x9l) k.b, h)) {
            return z8l.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        x9l x9lVar2 = this.b;
        int i = 1;
        while (i <= 512) {
            u4a i2 = u9lVar.i(i);
            u4a i3 = x9lVar2.a.i(i);
            int i4 = i2.a;
            int i5 = i2.d;
            int i6 = i2.c;
            int i7 = i2.b;
            int i8 = i3.a;
            int i9 = i3.d;
            int i10 = i3.c;
            int i11 = i3.b;
            if (i4 > i8 || i7 > i11 || i6 > i10 || i5 > i9) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i4 < i8 || i7 < i11 || i6 < i10 || i5 < i9)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i12 = iArr2[0];
        int i13 = iArr3[0];
        int i14 = i12 | i13;
        if (i14 == 0) {
            this.b = h;
            return z8l.j(view, windowInsets);
        }
        x9l x9lVar3 = this.b;
        d9l d9lVar = new d9l(i14, (i12 & 8) != 0 ? z8l.e : (i13 & 8) != 0 ? z8l.f : (i12 & 519) != 0 ? z8l.g : (i13 & 519) != 0 ? z8l.h : null, (i14 & 8) != 0 ? 160L : 250L);
        d9lVar.a.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(d9lVar.a.b());
        u4a i15 = u9lVar.i(i14);
        u4a i16 = x9lVar3.a.i(i14);
        int min = Math.min(i15.a, i16.a);
        int i17 = i15.b;
        int i18 = i16.b;
        int min2 = Math.min(i17, i18);
        int i19 = i15.c;
        int i20 = i16.c;
        int min3 = Math.min(i19, i20);
        int i21 = i15.d;
        int i22 = i16.d;
        c0l c0lVar = new c0l(2, u4a.c(min, min2, min3, Math.min(i21, i22)), u4a.c(Math.max(i15.a, i16.a), Math.max(i17, i18), Math.max(i19, i20), Math.max(i21, i22)));
        z8l.g(view, d9lVar, h, false);
        duration.addUpdateListener(new x8l(d9lVar, h, x9lVar3, i14, view));
        duration.addListener(new fz7(5, d9lVar, view));
        jtd.a(view, new n2(5, view, d9lVar, c0lVar, duration, false));
        this.b = h;
        return z8l.j(view, windowInsets);
    }
}
