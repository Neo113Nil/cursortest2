package com.vk.attachpicker.impl.graffiti.presentation;

import android.os.Bundle;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.log.L;
import com.vk.pushes.PushAwareActivity;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.rok;
import xsna.sok;
import xsna.tok;

/* compiled from: GraffitiDrawingActivity.kt */
/* loaded from: classes15.dex */
public final class GraffitiDrawingActivity extends PushAwareActivity implements rok {
    public final sok v = new sok(this);

    @Override // xsna.rok
    public final tok R() {
        return this.v;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        GraffitiDrawingFragment graffitiDrawingFragment = (GraffitiDrawingFragment) n().f(R.id.layout_graffiti_container);
        if (graffitiDrawingFragment != null) {
            graffitiDrawingFragment.a0();
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        dhr0.a.getClass();
        setTheme(dhr0.u().c);
        dhr0.u0(getWindow(), NavigationBarStyle.DARK);
        super.onCreate(bundle);
        setContentView(R.layout.activity_graffiti_container);
        String stringExtra = getIntent().getStringExtra("graffiti_title");
        String stringExtra2 = getIntent().getStringExtra("graffiti_avatar");
        Bundle bundle2 = new Bundle();
        if (stringExtra2 != null) {
            bundle2.putString("graffiti_avatar", stringExtra2);
        }
        if (stringExtra != null) {
            bundle2.putString("graffiti_title", stringExtra);
        }
        try {
            if (((GraffitiDrawingFragment) n().f(R.id.layout_graffiti_container)) == null) {
                GraffitiDrawingFragment graffitiDrawingFragment = new GraffitiDrawingFragment();
                graffitiDrawingFragment.setArguments(bundle2);
                n().q().c(R.id.layout_graffiti_container, graffitiDrawingFragment);
            }
        } catch (Exception e) {
            L.g("GraffitiDrawingActivity", e);
        }
    }
}
