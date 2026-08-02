package com.vk.api.sdk.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.vk.api.sdk.ui.VKConfirmationActivity;
import com.vkontakte.android.R;
import xsna.bxe;
import xsna.tbj;
import xsna.yhr0;

/* compiled from: VKConfirmationActivity.kt */
/* loaded from: classes15.dex */
public final class VKConfirmationActivity extends Activity {
    public static final /* synthetic */ int b = 0;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        yhr0.b();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        new AlertDialog.Builder(this, 5).setTitle(R.string.vk_confirm).setMessage(getIntent().getStringExtra("key_message")).setPositiveButton(android.R.string.ok, new tbj(this, 2)).setNegativeButton(android.R.string.cancel, new bxe(this, 2)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xsna.lbr0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                int i = VKConfirmationActivity.b;
                VKConfirmationActivity.this.finish();
            }
        }).show();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        yhr0.b();
    }
}
