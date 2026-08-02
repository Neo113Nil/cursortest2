package md;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {
    public static boolean a(WeakReference weakReference, String str, Integer num, String str2) {
        String g10 = ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).g(R.string.supportTitle);
        String titleChooser = ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).g(R.string.supportTitleChooser);
        StringBuilder sb2 = new StringBuilder(" [");
        String c2 = ((ea.a) y3.m(ea.a.class, null, 6)).c();
        if (c2 == null) {
            c2 = ((ea.a) y3.m(ea.a.class, null, 6)).d();
        }
        sb2.append(c2);
        sb2.append(':');
        StringBuilder c8 = v.f.c(g10, d9.e.l(sb2, Build.VERSION.RELEASE, ":1.2.44.123:google]"));
        if (num != null && num.intValue() != -1) {
            c8.append(":E" + num.intValue());
        }
        if (str2 != null) {
            c8.append(":A".concat(str2));
        }
        String sb3 = c8.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        Intrinsics.checkNotNullParameter(titleChooser, "titleChooser");
        Context context = (Context) weakReference.get();
        if (context == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sup.sportinsider@gmail.com"});
            intent.putExtra("android.intent.extra.SUBJECT", sb3);
            if (str != null) {
                intent.putExtra("android.intent.extra.TEXT", str);
            }
            Intent createChooser = Intent.createChooser(intent, titleChooser);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 24 || i5 >= 28) {
                createChooser.addFlags(268435456);
            }
            context.startActivity(createChooser);
            return true;
        } catch (Exception e7) {
            zc.d.b(6, null, e7);
            return false;
        }
    }
}
