package defpackage;

import android.content.Context;
import com.sofascore.model.Country;
import com.sofascore.results.R;
import java.text.Collator;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.b;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class tv3 {
    public static final List a = b.j(" Olympic Team", " Universiade Team", " 7S", " A", " B", " C");
    public static final mqi b = ypa.b(new t63(18));

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rv3 a(Context context, String str) {
        sv3 sv3Var;
        int length;
        int i;
        boolean J;
        String string;
        String substring;
        int length2;
        context.getClass();
        String str2 = null;
        if (str == null) {
            return new rv3("", null);
        }
        int S = StringsKt.S(str, ' ', 0, 6);
        if (S > 0 && 2 <= (length2 = (substring = str.substring(S + 1)).length()) && length2 < 4 && substring.charAt(0) == 'U') {
            String C = iii.C(1, substring);
            for (int i2 = 0; i2 < C.length(); i2++) {
                if (Character.isDigit(C.charAt(i2))) {
                }
            }
            sv3Var = new sv3(str.substring(0, S), str.substring(S));
            String lowerCase = c.r(sv3Var == null ? sv3Var.a : str, "-", " ", false).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            mqi mqiVar = qhi.a;
            String normalize = Normalizer.normalize(lowerCase, Normalizer.Form.NFD);
            normalize.getClass();
            String replace = ((Regex) qhi.c.getValue()).replace(normalize, "");
            replace.getClass();
            StringBuilder sb = new StringBuilder();
            length = replace.length();
            for (i = 0; i < length; i++) {
                char charAt = replace.charAt(i);
                if (Character.isLetterOrDigit(charAt) || CharsKt.b(charAt)) {
                    sb.append(charAt);
                }
            }
            String replace2 = ((Regex) qhi.d.getValue()).replace(sb.toString(), " ");
            J = StringsKt.J(replace2, "amateur", false);
            boolean J2 = StringsKt.J(replace2, "college", false);
            Integer num = (Integer) ((Map) b.getValue()).get(StringsKt.l0(c.r(c.r(replace2, "amateur", "", false), "college", "", false)).toString());
            string = num == null ? context.getString(num.intValue()) : null;
            if (string != null) {
                str = sv3Var != null ? string.concat(sv3Var.b) : string;
            }
            if (!J) {
                str2 = context.getString(R.string.category_amateur);
            } else if (J2) {
                str2 = context.getString(R.string.category_college);
            }
            return new rv3(str, str2);
        }
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                sv3Var = null;
                break;
            }
            String str3 = (String) it.next();
            if (c.n(str, str3, false)) {
                sv3Var = new sv3(iii.D(str3.length(), str), str3);
                break;
            }
        }
        String lowerCase2 = c.r(sv3Var == null ? sv3Var.a : str, "-", " ", false).toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        mqi mqiVar2 = qhi.a;
        String normalize2 = Normalizer.normalize(lowerCase2, Normalizer.Form.NFD);
        normalize2.getClass();
        String replace3 = ((Regex) qhi.c.getValue()).replace(normalize2, "");
        replace3.getClass();
        StringBuilder sb2 = new StringBuilder();
        length = replace3.length();
        while (i < length) {
        }
        String replace22 = ((Regex) qhi.d.getValue()).replace(sb2.toString(), " ");
        J = StringsKt.J(replace22, "amateur", false);
        boolean J22 = StringsKt.J(replace22, "college", false);
        Integer num2 = (Integer) ((Map) b.getValue()).get(StringsKt.l0(c.r(c.r(replace22, "amateur", "", false), "college", "", false)).toString());
        if (num2 == null) {
        }
        if (string != null) {
        }
        if (!J) {
        }
        return new rv3(str, str2);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [qv3] */
    public static qv3 b(final Context context) {
        context.getClass();
        final Collator collator = Collator.getInstance(Locale.getDefault());
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        return new Comparator() { // from class: qv3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Country country = (Country) obj;
                Country country2 = (Country) obj2;
                country.getClass();
                country2.getClass();
                String name = country.getName();
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                Object obj3 = linkedHashMap2.get(name);
                Context context2 = context;
                if (obj3 == null) {
                    obj3 = tv3.c(context2, country.getName());
                    linkedHashMap2.put(name, obj3);
                }
                String str = (String) obj3;
                String name2 = country2.getName();
                Object obj4 = linkedHashMap2.get(name2);
                if (obj4 == null) {
                    obj4 = tv3.c(context2, country2.getName());
                    linkedHashMap2.put(name2, obj4);
                }
                return collator.compare(str, (String) obj4);
            }
        };
    }

    public static final String c(Context context, String str) {
        context.getClass();
        rv3 a2 = a(context, str);
        String str2 = a2.b;
        String str3 = a2.a;
        return str2 != null ? String.format("%s (%s)", Arrays.copyOf(new Object[]{str3, str2}, 2)) : str3;
    }
}
