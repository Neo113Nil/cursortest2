package k2;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.collect.E;
import com.google.common.collect.I;
import com.google.common.collect.g0;
import java.util.regex.Pattern;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5147b {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f54132d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    public static final E f54133e = E.s("auto", ViewProps.NONE);

    /* renamed from: f, reason: collision with root package name */
    public static final E f54134f = E.t("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    public static final E f54135g = E.s("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    public static final E f54136h = E.t("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f54137a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54139c;

    public C5147b(int i10, int i11, int i12) {
        this.f54137a = i10;
        this.f54138b = i11;
        this.f54139c = i12;
    }

    public static C5147b a(String str) {
        if (str == null) {
            return null;
        }
        String e10 = Ra.c.e(str.trim());
        if (e10.isEmpty()) {
            return null;
        }
        return b(E.n(TextUtils.split(e10, f54132d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C5147b b(E e10) {
        int i10;
        g0.f e11;
        int i11;
        int hashCode;
        String str = (String) I.e(g0.e(f54136h, e10), "outside");
        int hashCode2 = str.hashCode();
        int i12 = 1;
        if (hashCode2 != -1392885889) {
            if (hashCode2 != -1106037339) {
                if (hashCode2 == 92734940 && str.equals("after")) {
                    i10 = 2;
                }
            } else if (str.equals("outside")) {
                i10 = -2;
            }
            e11 = g0.e(f54133e, e10);
            int i13 = -1;
            if (e11.isEmpty()) {
                String str2 = (String) e11.iterator().next();
                int hashCode3 = str2.hashCode();
                if (hashCode3 == 3005871) {
                    str2.equals("auto");
                } else if (hashCode3 == 3387192 && str2.equals(ViewProps.NONE)) {
                    i13 = 0;
                }
                return new C5147b(i13, 0, i10);
            }
            g0.f e12 = g0.e(f54135g, e10);
            g0.f e13 = g0.e(f54134f, e10);
            if (e12.isEmpty() && e13.isEmpty()) {
                return new C5147b(-1, 0, i10);
            }
            String str3 = (String) I.e(e12, "filled");
            int hashCode4 = str3.hashCode();
            if (hashCode4 == -1274499742) {
                str3.equals("filled");
            } else if (hashCode4 == 3417674 && str3.equals("open")) {
                i11 = 2;
                String str4 = (String) I.e(e13, "circle");
                hashCode = str4.hashCode();
                if (hashCode != -1360216880) {
                    str4.equals("circle");
                } else if (hashCode != -905816648) {
                    if (hashCode == 99657 && str4.equals("dot")) {
                        i12 = 2;
                    }
                } else if (str4.equals("sesame")) {
                    i12 = 3;
                }
                return new C5147b(i12, i11, i10);
            }
            i11 = 1;
            String str42 = (String) I.e(e13, "circle");
            hashCode = str42.hashCode();
            if (hashCode != -1360216880) {
            }
            return new C5147b(i12, i11, i10);
        }
        str.equals("before");
        i10 = 1;
        e11 = g0.e(f54133e, e10);
        int i132 = -1;
        if (e11.isEmpty()) {
        }
    }
}
