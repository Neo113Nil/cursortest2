package defpackage;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jsi {
    public CharSequence a;
    public int b;
    public View c;
    public TabLayout d;
    public lsi e;

    public final boolean a() {
        TabLayout tabLayout = this.d;
        if (tabLayout != null) {
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.b;
        }
        a70.p("Tab not attached to a TabLayout");
        return false;
    }
}
