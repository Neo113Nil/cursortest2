package za;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import f0.l;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import ve.s;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements nc.g {

    /* renamed from: a, reason: collision with root package name */
    public Context f25901a;

    public static s c() {
        return (s) y3.m(s.class, null, 6);
    }

    public static String e(Context context, int i5, Locale locale) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        String string = context.createConfigurationContext(configuration).getResources().getString(i5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final Typeface a() {
        Typeface typeface;
        s c2 = c();
        if (c2.f24829c == null) {
            try {
                typeface = l.b(c2.f24827a, R.font.arimo_bold);
            } catch (Exception unused) {
                typeface = null;
            }
            c2.f24829c = typeface;
        }
        return c2.f24829c;
    }

    public final Typeface b() {
        Typeface typeface;
        s c2 = c();
        if (c2.f24828b == null) {
            try {
                typeface = l.b(c2.f24827a, R.font.arimo_regular);
            } catch (Exception unused) {
                typeface = null;
            }
            c2.f24828b = typeface;
        }
        return c2.f24828b;
    }

    public final String d(int i5, int i10) {
        Context context = this.f25901a;
        String str = gc.d.f9945a;
        Locale e7 = d2.i.e();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(e7);
        String quantityString = context.createConfigurationContext(configuration).getResources().getQuantityString(i5, i10);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    public final String f(int i5, String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        Context context = this.f25901a;
        Locale of2 = Build.VERSION.SDK_INT >= 36 ? Locale.of(language) : new Locale(language);
        Intrinsics.checkNotNull(of2);
        return e(context, i5, of2);
    }

    public final String g(int i5) {
        Context context = this.f25901a;
        String str = gc.d.f9945a;
        return e(context, i5, d2.i.e());
    }

    public final String h(int i5, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        Context context = this.f25901a;
        String str = gc.d.f9945a;
        Locale e7 = d2.i.e();
        Object[] objArr = {formatArgs};
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(e7);
        Object obj = objArr[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr2 = (Object[]) obj;
        String string = context.createConfigurationContext(configuration).getResources().getString(i5, Arrays.copyOf(objArr2, objArr2.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
