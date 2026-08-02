package com.vk.music.player;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.music.player.StandalonePlayerFragment;
import com.vkontakte.android.VKActivity;
import xsna.dhr0;

/* compiled from: StandalonePlayerActivity.kt */
/* loaded from: classes3.dex */
public final class StandalonePlayerActivity extends VKActivity {
    public final a v = new a();

    /* compiled from: StandalonePlayerActivity.kt */
    public static final class a implements StandalonePlayerFragment.b {
        public a() {
        }

        @Override // com.vk.music.player.StandalonePlayerFragment.b
        public final void onDismiss() {
            StandalonePlayerActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("com.vk.music.common.FLAG_SECURE", false)) {
            getWindow().addFlags(8192);
        }
        setTheme(dhr0.C().c);
        dhr0.r0(this);
        FragmentManager fragmentManager = n().a;
        if (fragmentManager.H("StandalonePlayerFragment") != null) {
            return;
        }
        StandalonePlayerFragment standalonePlayerFragment = new StandalonePlayerFragment();
        standalonePlayerFragment.V = this.v;
        standalonePlayerFragment.Td(fragmentManager, "StandalonePlayerFragment");
    }
}
