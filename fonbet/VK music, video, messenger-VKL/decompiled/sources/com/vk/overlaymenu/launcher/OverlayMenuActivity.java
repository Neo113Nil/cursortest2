package com.vk.overlaymenu.launcher;

import android.os.Build;
import android.os.Bundle;
import com.vk.core.ui.themes.ThemableActivity;
import com.vkontakte.android.R;
import xsna.a5g0;
import xsna.dhr0;
import xsna.hk70;
import xsna.rok;
import xsna.rte0;
import xsna.sok;
import xsna.tok;

/* compiled from: OverlayMenuActivity.kt */
/* loaded from: classes4.dex */
public final class OverlayMenuActivity extends ThemableActivity implements rok {
    public static final /* synthetic */ int m = 0;
    public final sok l = new sok(this);

    @Override // xsna.rok
    public final tok R() {
        return this.l;
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(dhr0.C().b ? R.style.OverlayMenuActivityThemeLight : R.style.OverlayMenuActivityThemeDark);
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
            overrideActivityTransition(1, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
        getWindow().getDecorView().setTag(37742015, rte0.n);
        if (bundle == null) {
            new a5g0.a(this, new hk70(this, 2), 4).I0("ReportBottomSheetDialog");
        }
    }
}
