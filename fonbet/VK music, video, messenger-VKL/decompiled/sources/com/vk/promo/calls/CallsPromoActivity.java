package com.vk.promo.calls;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.im.engine.internal.storage.delegates.messages.b;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.bwt0;
import xsna.dhr0;
import xsna.fnj;
import xsna.g2v;
import xsna.iah0;
import xsna.sf1;
import xsna.sg0;

/* compiled from: CallsPromoActivity.kt */
/* loaded from: classes5.dex */
public final class CallsPromoActivity extends ThemableActivity {
    public static final /* synthetic */ int l = 0;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        g2v.c().j().b();
        super.onBackPressed();
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        HashSet hashSet = iah0.a;
        setTheme(fnj.d(this) ? dhr0.M() ? R.style.VoipDialogDarkTheme : R.style.VoipDialogTheme : dhr0.M() ? R.style.VoipPromoDarkTheme : R.style.VoipPromoTheme);
        super.onCreate(bundle);
        setContentView(R.layout.calls_promo_activity);
        if (!fnj.d(this)) {
            dhr0.s0(getWindow());
        }
        if (fnj.d(this)) {
            findViewById(R.id.calls_promo_root_view).setOnClickListener(new sg0(this, 2));
        }
        ((ImageView) findViewById(R.id.calls_promo_image)).setImageResource(dhr0.M() ? R.drawable.img_calls_promo_dark : R.drawable.img_calls_promo_light);
        View findViewById = findViewById(R.id.calls_promo_close_btn);
        if (findViewById != null) {
            bwt0.i0(findViewById, new sf1(this, 13));
        }
        bwt0.i0(findViewById(R.id.calls_promo_call_btn), new b(this, 15));
    }
}
