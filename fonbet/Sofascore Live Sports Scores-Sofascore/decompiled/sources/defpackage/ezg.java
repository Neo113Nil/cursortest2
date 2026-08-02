package defpackage;

import android.content.Context;
import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ezg {
    public static final Boolean a(xbb xbbVar, Context context, int i, String str) {
        context.getClass();
        if (str == null) {
            return null;
        }
        String string = context.getString(i);
        string.getClass();
        xbbVar.add(new jei(string, str, null));
        return Boolean.TRUE;
    }

    public static final void b(xbb xbbVar, Context context, int i, Integer num) {
        context.getClass();
        if (num != null) {
            String string = context.getString(i);
            string.getClass();
            xbbVar.add(new jei(string, String.valueOf(num.intValue()), null));
        }
    }

    public static void c(xbb xbbVar, Context context, int i, Double d, int i2) {
        boolean z = (i2 & 16) != 0;
        context.getClass();
        if (d != null) {
            double doubleValue = d.doubleValue();
            String string = context.getString(i);
            string.getClass();
            xbbVar.add(new jei(string, rei.c(Double.valueOf(doubleValue), 1, z), null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(xbb xbbVar, String str, Integer num, Integer num2, Integer num3, boolean z) {
        String n;
        str.getClass();
        if (num != null) {
            if (!z && num2 != null) {
                n = ljg.m(num, num2, "/");
            } else if (!z && num2 == null) {
                n = String.valueOf(num.intValue());
            } else if (z && num2 == null) {
                n = i(num, num3);
            } else if (num2 != null && num3 != null && num3.intValue() > 0) {
                n = rei.n(num.intValue(), num3.intValue(), num2.intValue());
            }
            if (n == null) {
                xbbVar.add(new jei(str, n, null));
                return;
            }
            return;
        }
        n = null;
        if (n == null) {
        }
    }

    public static void e(AbstractList abstractList, String str, Integer num, Integer num2, boolean z) {
        str.getClass();
        String valueOf = num == null ? null : !z ? String.valueOf(num.intValue()) : i(num, num2);
        if (valueOf != null) {
            abstractList.add(new jei(str, valueOf, null));
        }
    }

    public static final void f(xbb xbbVar, Context context, int i, Integer num) {
        context.getClass();
        if (num != null) {
            int intValue = num.intValue();
            String string = context.getString(i);
            string.getClass();
            xbbVar.add(new jei(string, rei.k(intValue, false), null));
        }
    }

    public static final void g(AbstractList abstractList, String str, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            abstractList.add(new iei(str, list2));
            abstractList.addAll(list);
        }
    }

    public static void h(AbstractList abstractList, String str, List list) {
        g(abstractList, str, list, km5.a);
    }

    public static final String i(Integer num, Integer num2) {
        if (num == null || num2 == null || num2.intValue() <= 0) {
            return null;
        }
        return rei.l(num2.intValue(), num);
    }
}
