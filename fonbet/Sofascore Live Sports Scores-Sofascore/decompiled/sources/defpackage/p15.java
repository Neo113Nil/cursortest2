package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.s;
import com.sofascore.results.main.MainActivity;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p15 implements skd {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ p15(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.skd
    public final void h(Object obj) {
        zrh zrhVar;
        int i = this.a;
        Object obj2 = null;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                DialogFragment dialogFragment = (DialogFragment) obj3;
                if (((u6b) obj) != null && dialogFragment.h) {
                    View requireView = dialogFragment.requireView();
                    if (requireView.getParent() != null) {
                        a70.r("DialogFragment can not be attached to a container view");
                        break;
                    } else if (dialogFragment.l != null) {
                        if (s.O(3)) {
                            Objects.toString(dialogFragment.l);
                        }
                        dialogFragment.l.setContentView(requireView);
                        break;
                    }
                }
                break;
            case 1:
                z46 z46Var = (z46) obj;
                z46Var.getClass();
                if (!z46Var.b) {
                    z46Var.b = true;
                    obj2 = z46Var.a;
                }
                if (obj2 != null) {
                    ((Function1) obj3).invoke(obj2);
                    break;
                }
                break;
            default:
                pn3 pn3Var = (pn3) obj;
                MainActivity mainActivity = (MainActivity) obj3;
                boolean z = MainActivity.n0;
                mainActivity.T().f.i(this);
                if (pn3Var != null && (zrhVar = (zrh) pn3Var.a()) != null) {
                    WeakReference weakReference = new WeakReference(mainActivity);
                    mainActivity.T().n(zrhVar, null);
                    MainActivity mainActivity2 = (MainActivity) weakReference.get();
                    if (mainActivity2 != null) {
                        SharedPreferences.Editor edit = mainActivity.A().edit();
                        edit.getClass();
                        edit.putLong("PREF_LAST_MAIN_MATCHES_INTERSTITIAL_AD_SHOWN", System.currentTimeMillis());
                        edit.apply();
                        zrhVar.f(mainActivity2);
                        break;
                    }
                }
                break;
        }
    }
}
