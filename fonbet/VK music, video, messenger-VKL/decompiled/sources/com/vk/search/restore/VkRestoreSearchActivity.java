package com.vk.search.restore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.vk.superapp.core.ui.VkDelegatingActivity;
import com.vkontakte.android.R;
import xsna.e370;
import xsna.s3q0;
import xsna.tgn0;
import xsna.xgx0;

/* compiled from: VkRestoreSearchActivity.kt */
/* loaded from: classes5.dex */
public class VkRestoreSearchActivity extends VkDelegatingActivity {
    public int g;

    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        tgn0 tgn0Var = e370.x;
        if (tgn0Var == null) {
            tgn0Var = null;
        }
        setTheme(tgn0Var.b());
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.vk_fragment_container);
        int id = frameLayout.getId();
        setContentView(frameLayout);
        this.g = id;
        if (getSupportFragmentManager().G(this.g) == null) {
            Intent intent = getIntent();
            try {
                if ((intent != null ? intent.getSerializableExtra("fragmentClass") : null) != null) {
                    O1(this.g);
                } else {
                    finish();
                    s3q0 s3q0Var = s3q0.a;
                }
            } catch (Exception e) {
                xgx0.a.getClass();
                xgx0.d(e);
                finish();
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
    }
}
