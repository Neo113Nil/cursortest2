package defpackage;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowInsetsController;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.blaze.blazesdk.players.ui.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class arl {
    public static final void a(ComponentActivity componentActivity) {
        componentActivity.setRequestedOrientation(cnb.i(componentActivity) ? 2 : 1);
    }

    public static final void b(FragmentActivity fragmentActivity, eqm eqmVar) {
        fragmentActivity.getClass();
        List x = eqmVar.getX();
        if (x != null) {
            ArrayList arrayList = new ArrayList(k13.r(x, 10));
            Iterator it = x.iterator();
            while (it.hasNext()) {
                arrayList.add(((gbm) it.next()).b);
            }
            n.r.getClass();
            n.a aVar = new n.a(arrayList);
            Bundle bundle = new Bundle();
            bundle.putParcelable("available_languages", aVar);
            n nVar = new n();
            nVar.setArguments(bundle);
            nVar.p(fragmentActivity.k(), "ClosedCaptionsBottomSheetFragment");
        }
    }

    public static final void c(FragmentActivity fragmentActivity, boolean z) {
        fragmentActivity.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            ApplicationInfo applicationInfoCompat$default = cnb.getApplicationInfoCompat$default(fragmentActivity, 0, 1, null);
            if ((applicationInfoCompat$default != null ? applicationInfoCompat$default.targetSdkVersion : 0) >= 35) {
                if (i < 30) {
                    fragmentActivity.getWindow().getDecorView().setSystemUiVisibility(z ? 0 : 8192);
                    return;
                }
                WindowInsetsController insetsController = fragmentActivity.getWindow().getInsetsController();
                if (insetsController != null) {
                    if (z) {
                        insetsController.setSystemBarsAppearance(0, 8);
                    } else {
                        insetsController.setSystemBarsAppearance(8, 8);
                    }
                }
            }
        }
    }
}
