package nm0;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import h9.EnumC6876a;
import java.util.Map;
import o9.C8660b;

/* renamed from: nm0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8612b implements h9.u {
    public static final ViewGroup b(ComponentCallbacksC5392m componentCallbacksC5392m) {
        View view;
        View rootView = (componentCallbacksC5392m == null || (view = componentCallbacksC5392m.getView()) == null) ? null : view.getRootView();
        if (rootView instanceof ViewGroup) {
            return (ViewGroup) rootView;
        }
        return null;
    }

    @Override // h9.u
    public C8660b a(String str, EnumC6876a enumC6876a, int i11, int i12, Map map) {
        String str2;
        h9.f fVar;
        C8660b c8660b;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (enumC6876a != EnumC6876a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(enumC6876a)));
        }
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i11 + 'x' + i12);
        }
        u9.l lVar = u9.l.FORCE_NONE;
        h9.f fVar2 = null;
        if (map != null) {
            u9.l lVar2 = (u9.l) map.get(h9.g.DATA_MATRIX_SHAPE);
            if (lVar2 != null) {
                lVar = lVar2;
            }
            h9.f fVar3 = (h9.f) map.get(h9.g.MIN_SIZE);
            if (fVar3 == null) {
                fVar3 = null;
            }
            fVar = (h9.f) map.get(h9.g.MAX_SIZE);
            if (fVar == null) {
                fVar = null;
            }
            fVar2 = fVar3;
            str2 = str;
        } else {
            str2 = str;
            fVar = null;
        }
        String a11 = u9.j.a(str2, lVar, fVar2, fVar);
        u9.k l11 = u9.k.l(a11.length(), lVar, fVar2, fVar);
        u9.e eVar = new u9.e(u9.i.b(a11, l11), l11.h(), l11.g());
        eVar.c();
        int h11 = l11.h();
        int g10 = l11.g();
        K9.b bVar = new K9.b(l11.j(), l11.i());
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z11 = true;
            if (i13 >= g10) {
                break;
            }
            int i15 = l11.f100423e;
            int i16 = i13 % i15;
            if (i16 == 0) {
                int i17 = 0;
                for (int i18 = 0; i18 < l11.j(); i18++) {
                    bVar.j(i17, i14, i18 % 2 == 0);
                    i17++;
                }
                i14++;
            }
            int i19 = 0;
            int i21 = 0;
            while (i19 < h11) {
                int i22 = l11.f100422d;
                int i23 = i19 % i22;
                if (i23 == 0) {
                    bVar.j(i21, i14, z11);
                    i21++;
                }
                bVar.j(i21, i14, eVar.a(i19, i13));
                int i24 = i21 + 1;
                if (i23 == i22 - 1) {
                    bVar.j(i24, i14, i13 % 2 == 0);
                    i21 += 2;
                } else {
                    i21 = i24;
                }
                i19++;
                z11 = true;
            }
            int i25 = i14 + 1;
            if (i16 == i15 - 1) {
                int i26 = 0;
                for (int i27 = 0; i27 < l11.j(); i27++) {
                    bVar.j(i26, i25, true);
                    i26++;
                }
                i14 += 2;
            } else {
                i14 = i25;
            }
            i13++;
        }
        int h12 = bVar.h();
        int e11 = bVar.e();
        int max = Math.max(i11, h12);
        int max2 = Math.max(i12, e11);
        int min = Math.min(max / h12, max2 / e11);
        int i28 = (max - (h12 * min)) / 2;
        int i29 = (max2 - (e11 * min)) / 2;
        if (i12 < e11 || i11 < h12) {
            c8660b = new C8660b(h12, e11);
            i28 = 0;
            i29 = 0;
        } else {
            c8660b = new C8660b(i11, i12);
        }
        c8660b.a();
        int i31 = 0;
        while (i31 < e11) {
            int i32 = i28;
            int i33 = 0;
            while (i33 < h12) {
                if (bVar.b(i33, i31) == 1) {
                    c8660b.m(i32, i29, min, min);
                }
                i33++;
                i32 += min;
            }
            i31++;
            i29 += min;
        }
        return c8660b;
    }
}
