package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import d1.C3985a;
import d1.InterfaceC3990f;
import e1.AbstractC4134a;

/* loaded from: classes.dex */
public abstract class k0 {
    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof InterfaceC3990f);
    }

    public static void c(C3985a.b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            e((Spannable) AbstractC4134a.e(bVar.e()), new Ra.o() { // from class: androidx.media3.ui.i0
                @Override // Ra.o
                public final boolean apply(Object obj) {
                    return k0.b(obj);
                }
            });
        }
        d(bVar);
    }

    public static void d(C3985a.b bVar) {
        bVar.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            e((Spannable) AbstractC4134a.e(bVar.e()), new Ra.o() { // from class: androidx.media3.ui.j0
                @Override // Ra.o
                public final boolean apply(Object obj) {
                    return k0.a(obj);
                }
            });
        }
    }

    public static void e(Spannable spannable, Ra.o oVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (oVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float f(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }
}
