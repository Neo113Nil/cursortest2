package com.vk.api.sdk.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import com.vkontakte.android.R;
import java.util.concurrent.ExecutorService;
import xsna.lwd;
import xsna.v1p;
import xsna.xer0;
import xsna.yhr0;
import xsna.yr2;

/* compiled from: VKCaptchaActivity.kt */
/* loaded from: classes15.dex */
public final class VKCaptchaActivity extends Activity {
    public static final /* synthetic */ int e = 0;
    public EditText b;
    public ImageView c;
    public ProgressBar d;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        LinearLayout linearLayout = new LinearLayout(this);
        int ceil = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 12);
        int intExtra = getIntent().getIntExtra("key_width", -1);
        int max = (int) (Math.max(1.0f, Resources.getSystem().getDisplayMetrics().density) * (intExtra <= 0 ? 130.0f : intExtra));
        int intExtra2 = getIntent().getIntExtra("key_height", -1);
        int max2 = (int) (Math.max(1.0f, Resources.getSystem().getDisplayMetrics().density) * (intExtra2 <= 0 ? 50.0f : intExtra2));
        linearLayout.setPadding(ceil, ceil, ceil, ceil);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(max, max2);
        layoutParams.bottomMargin = ceil;
        frameLayout.setLayoutParams(layoutParams);
        this.d = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        ProgressBar progressBar = this.d;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setLayoutParams(layoutParams2);
        ProgressBar progressBar2 = this.d;
        if (progressBar2 == null) {
            progressBar2 = null;
        }
        frameLayout.addView(progressBar2);
        this.c = new ImageView(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        ImageView imageView = this.c;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams3);
        ImageView imageView2 = this.c;
        if (imageView2 == null) {
            imageView2 = null;
        }
        frameLayout.addView(imageView2);
        linearLayout.addView(frameLayout);
        EditText editText = new EditText(this);
        this.b = editText;
        editText.setInputType(176);
        EditText editText2 = this.b;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(max, -2);
        EditText editText3 = this.b;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.setLayoutParams(layoutParams4);
        View view = this.b;
        if (view == null) {
            view = null;
        }
        linearLayout.addView(view);
        new AlertDialog.Builder(this, 5).setView(linearLayout).setTitle(R.string.vk_captcha_hint).setPositiveButton(android.R.string.ok, new lwd(this, 1)).setNegativeButton(android.R.string.cancel, new v1p(this, 1)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xsna.war0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                int i = VKCaptchaActivity.e;
                yhr0.b();
                VKCaptchaActivity vKCaptchaActivity = VKCaptchaActivity.this;
                vKCaptchaActivity.setResult(0);
                vKCaptchaActivity.finish();
            }
        }).show();
        EditText editText4 = this.b;
        (editText4 != null ? editText4 : null).requestFocus();
        String stringExtra = getIntent().getStringExtra("key_url");
        if (stringExtra == null) {
            return;
        }
        ((ExecutorService) xer0.c.getValue()).submit(new yr2(6, stringExtra, this));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        yhr0.b();
        super.onDestroy();
    }
}
