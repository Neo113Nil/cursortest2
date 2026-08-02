package Y2;

import Q2.AbstractC1508t;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.react.uimanager.ViewProps;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13900a = AbstractC1508t.i("PackageManagerHelper");

    public static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    public static boolean b(int i10, boolean z10) {
        return i10 == 0 ? z10 : i10 == 1;
    }

    public static void c(Context context, Class cls, boolean z10) {
        try {
            if (z10 == b(a(context, cls.getName()), false)) {
                AbstractC1508t.e().a(f13900a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            AbstractC1508t e10 = AbstractC1508t.e();
            String str = f13900a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? ViewProps.ENABLED : "disabled");
            e10.a(str, sb2.toString());
        } catch (Exception e11) {
            AbstractC1508t e12 = AbstractC1508t.e();
            String str2 = f13900a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? ViewProps.ENABLED : "disabled");
            e12.b(str2, sb3.toString(), e11);
        }
    }
}
