package com.vk.auth.oauth;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.LinkedHashMap;
import java.util.UUID;
import xsna.hvr0;
import xsna.i0q0;
import xsna.w0m;
import xsna.x0m;

/* compiled from: VkBaseOAuthActivity.kt */
/* loaded from: classes15.dex */
public abstract class VkBaseOAuthActivity extends FragmentActivity {
    public static final /* synthetic */ int k = 0;
    public w0m f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;

    public abstract w0m O1();

    public final void Q1(String str) {
        setResult(2, str != null ? new Intent().putExtra("error_message", str) : null);
        finish();
    }

    public final void R1(Intent intent) {
        setResult(-1, intent);
        finish();
    }

    public abstract void T1();

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.h = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        this.j = bundle != null ? bundle.getBoolean("vk_base_oauth_activity.key_is_changing_config", false) : false;
        String string = bundle != null ? bundle.getString("vk_base_oauth_activity.key_storage_key") : null;
        if (string == null) {
            w0m O1 = O1();
            this.f = O1;
            LinkedHashMap linkedHashMap = x0m.a;
            String uuid = UUID.randomUUID().toString();
            x0m.a.put(uuid, O1);
            this.g = uuid;
        } else {
            LinkedHashMap linkedHashMap2 = x0m.a;
            w0m w0mVar = (w0m) linkedHashMap2.get(string);
            if (w0mVar == null) {
                w0m O12 = O1();
                this.f = O12;
                String uuid2 = UUID.randomUUID().toString();
                linkedHashMap2.put(uuid2, O12);
                this.g = uuid2;
            } else {
                this.f = w0mVar;
                this.g = string;
            }
        }
        if (bundle != null) {
            this.h = bundle.getBoolean("vk_base_oauth_activity.key_awaiting_result", false);
        } else {
            if (!getIntent().getBooleanExtra("vk_base_oauth_activity.key_start_auth", false)) {
                finish();
                return;
            }
            this.h = true;
            this.i = true;
            i0q0.f(new hvr0(this, 14));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            w0m w0mVar = this.f;
            if (w0mVar == null) {
                w0mVar = null;
            }
            w0mVar.onDestroy();
            LinkedHashMap linkedHashMap = x0m.a;
            String str = this.g;
            x0m.a.remove(str != null ? str : null);
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.h = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.h && !this.i && !this.j) {
            setResult(0);
            finish();
        }
        this.i = false;
        this.j = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("vk_base_oauth_activity.key_awaiting_result", this.h);
        String str = this.g;
        if (str == null) {
            str = null;
        }
        bundle.putString("vk_base_oauth_activity.key_storage_key", str);
        bundle.putBoolean("vk_base_oauth_activity.key_is_changing_config", isChangingConfigurations());
    }
}
