package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public interface r9k {
    default String a(of3 of3Var) {
        String c;
        av8 av8Var = (av8) of3Var;
        av8Var.d0(-2133657518);
        if (this instanceof m9k) {
            av8Var.d0(-1745471849);
            av8Var.s(false);
            c = ((m9k) this).a;
        } else if (this instanceof q9k) {
            av8Var.d0(-1745470512);
            q9k q9kVar = (q9k) this;
            gv9 gv9Var = q9kVar.b;
            boolean isEmpty = gv9Var.isEmpty();
            int i = q9kVar.a;
            if (isEmpty) {
                c = ljg.k(av8Var, -1745469943, i, av8Var, false);
            } else {
                av8Var.d0(-1745468993);
                Object[] array = gv9Var.toArray(new Object[0]);
                c = oea.w(i, Arrays.copyOf(array, array.length), av8Var);
                av8Var.s(false);
            }
            av8Var.s(false);
        } else if (this instanceof p9k) {
            av8Var.d0(-1745466374);
            p9k p9kVar = (p9k) this;
            gv9 gv9Var2 = p9kVar.c;
            boolean isEmpty2 = gv9Var2.isEmpty();
            int i2 = p9kVar.b;
            int i3 = p9kVar.a;
            if (isEmpty2) {
                av8Var.d0(-1745465826);
                c = ((Resources) av8Var.k(nz.c)).getQuantityString(i3, i2);
            } else {
                av8Var.d0(-1745464204);
                Object[] array2 = gv9Var2.toArray(new Object[0]);
                c = oea.t(i3, i2, Arrays.copyOf(array2, array2.length), av8Var);
            }
            av8Var.s(false);
            av8Var.s(false);
        } else if (this instanceof n9k) {
            av8Var.d0(-1745460738);
            n9k n9kVar = (n9k) this;
            c = s02.H(n9kVar.a, n9kVar.b, n9kVar.c.toArray(new Object[0]), av8Var, 0);
            av8Var.s(false);
        } else {
            if (!(this instanceof o9k)) {
                throw dmi.h(av8Var, -1745472772, false);
            }
            av8Var.d0(-1745457344);
            c = ((o9k) this).c((Context) av8Var.k(nz.b));
            av8Var.s(false);
        }
        av8Var.s(false);
        return c;
    }

    default String b(Context context) {
        String quantityString;
        String string;
        context.getClass();
        if (this instanceof m9k) {
            return ((m9k) this).a;
        }
        if (this instanceof q9k) {
            q9k q9kVar = (q9k) this;
            gv9 gv9Var = q9kVar.b;
            boolean isEmpty = gv9Var.isEmpty();
            int i = q9kVar.a;
            if (isEmpty) {
                string = context.getString(i);
            } else {
                Object[] array = gv9Var.toArray(new Object[0]);
                string = context.getString(i, Arrays.copyOf(array, array.length));
            }
            string.getClass();
            return string;
        }
        if (!(this instanceof p9k)) {
            if (this instanceof n9k) {
                n9k n9kVar = (n9k) this;
                return hkg.Q(context, n9kVar.a, n9kVar.b, n9kVar.c.toArray(new Object[0]));
            }
            if (this instanceof o9k) {
                return ((o9k) this).c(context);
            }
            zzl.b();
            return null;
        }
        p9k p9kVar = (p9k) this;
        gv9 gv9Var2 = p9kVar.c;
        boolean isEmpty2 = gv9Var2.isEmpty();
        int i2 = p9kVar.b;
        int i3 = p9kVar.a;
        Resources resources = context.getResources();
        if (isEmpty2) {
            quantityString = resources.getQuantityString(i3, i2);
        } else {
            Object[] array2 = gv9Var2.toArray(new Object[0]);
            quantityString = resources.getQuantityString(i3, i2, Arrays.copyOf(array2, array2.length));
        }
        quantityString.getClass();
        return quantityString;
    }
}
