package h5;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final String f64981a = androidx.work.o.i("PackageManagerHelper");

    public static void a(@NonNull Context context, @NonNull Class<?> cls, boolean z11) {
        String str = f64981a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z11 ? 1 : 2, 1);
            androidx.work.o e11 = androidx.work.o.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z11 ? "enabled" : "disabled");
            e11.a(str, sb2.toString());
        } catch (Exception e12) {
            androidx.work.o e13 = androidx.work.o.e();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z11 ? "enabled" : "disabled");
            e13.b(str, sb3.toString(), e12);
        }
    }
}
