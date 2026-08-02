package defpackage;

import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import com.sofascore.results.settings.about.AboutActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m0 extends ap8 {
    public final /* synthetic */ AboutActivity a;

    public m0(AboutActivity aboutActivity) {
        this.a = aboutActivity;
    }

    @Override // defpackage.ap8
    public final void a(s sVar, Fragment fragment) {
        AboutActivity aboutActivity = this.a;
        MenuItem menuItem = aboutActivity.J;
        if (menuItem != null) {
            menuItem.setVisible(aboutActivity.D().getDevMod());
        }
        aboutActivity.N();
    }
}
