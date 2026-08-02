package zc;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import com.sports.insider.domain.entity.CustomTypefaceSpan;
import f0.l;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import ve.s;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {
    public static Typeface a() {
        return ((za.i) e()).a();
    }

    public static CustomTypefaceSpan b() {
        Typeface typeface;
        ((za.i) e()).getClass();
        s c2 = za.i.c();
        if (c2.f24829c == null) {
            try {
                typeface = l.b(c2.f24827a, R.font.arimo_bold);
            } catch (Exception unused) {
                typeface = null;
            }
            c2.f24829c = typeface;
        }
        return new CustomTypefaceSpan("arimo_bold", c2.f24829c);
    }

    public static Typeface c() {
        return ((za.i) e()).b();
    }

    public static CustomTypefaceSpan d() {
        Typeface typeface;
        ((za.i) e()).getClass();
        s c2 = za.i.c();
        if (c2.f24828b == null) {
            try {
                typeface = l.b(c2.f24827a, R.font.arimo_regular);
            } catch (Exception unused) {
                typeface = null;
            }
            c2.f24828b = typeface;
        }
        return new CustomTypefaceSpan("arimo_regular", c2.f24828b);
    }

    public static nc.g e() {
        return (nc.g) y3.m(nc.g.class, null, 6);
    }

    public static String f(int i5) {
        String string = ((za.i) e()).f25901a.getResources().getString(i5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static String g(int i5, int i10, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        nc.g e7 = e();
        Object[] formatArgs2 = Arrays.copyOf(formatArgs, formatArgs.length);
        za.i iVar = (za.i) e7;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
        Context context = iVar.f25901a;
        String str = gc.d.f9945a;
        Locale e9 = d2.i.e();
        Object[] objArr = {formatArgs2};
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(e9);
        Object obj = objArr[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr2 = (Object[]) obj;
        String quantityString = context.createConfigurationContext(configuration).getResources().getQuantityString(i5, i10, Arrays.copyOf(objArr2, objArr2.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    public static String h(int i5) {
        return ((za.i) e()).g(i5);
    }

    public static String i(int i5, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return ((za.i) e()).h(i5, Arrays.copyOf(formatArgs, formatArgs.length));
    }
}
