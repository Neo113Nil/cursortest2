package defpackage;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.play.core.install.zza;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class jdk {
    public final /* synthetic */ ldk a;

    public /* synthetic */ jdk(ldk ldkVar) {
        this.a = ldkVar;
    }

    public final void a(zza zzaVar) {
        int i = zzaVar.a;
        ldk ldkVar = this.a;
        dmh dmhVar = null;
        if (i != 2) {
            if (i == 11) {
                dmh b = ldkVar.b();
                ldkVar.c = b;
                if (b != null) {
                    b.i();
                    return;
                }
                return;
            }
            if (i == 5 || i == 6) {
                dmh dmhVar2 = ldkVar.c;
                if (dmhVar2 != null) {
                    dmhVar2.b(3);
                }
                ldkVar.c = null;
                return;
            }
            return;
        }
        int i2 = (int) ((zzaVar.b / zzaVar.c) * 100.0d);
        ComponentActivity componentActivity = ldkVar.a;
        dmh dmhVar3 = ldkVar.c;
        if (dmhVar3 == null) {
            View findViewById = componentActivity.findViewById(ldkVar.b);
            CoordinatorLayout coordinatorLayout = findViewById instanceof CoordinatorLayout ? (CoordinatorLayout) findViewById : null;
            if (coordinatorLayout != null) {
                String string = componentActivity.getString(R.string.app_update_download_percentage, yid.r(i2));
                string.getClass();
                dmhVar = wca.C(coordinatorLayout, string, null, null);
            }
        } else {
            String string2 = componentActivity.getString(R.string.app_update_download_percentage, yid.r(i2));
            string2.getClass();
            wca.H(dmhVar3, string2);
            dmhVar3.l(null, null);
            dmhVar = dmhVar3;
        }
        ldkVar.c = dmhVar;
        if (dmhVar != null) {
            dmhVar.i();
        }
    }
}
