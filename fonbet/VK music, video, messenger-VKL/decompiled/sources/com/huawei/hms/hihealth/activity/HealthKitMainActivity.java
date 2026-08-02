package com.huawei.hms.hihealth.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.huawei.hms.health.aaba;
import com.huawei.hms.health.aabf;
import com.huawei.hms.health.aabg;
import com.huawei.hms.health.aabz;
import com.huawei.hms.kit.hihealth.R;
import xsna.tk5;

/* loaded from: classes13.dex */
public class HealthKitMainActivity extends FragmentActivity {
    public static final String HEALTH_FRAGMENT_CODE = "FragmentName";
    public static final int HEALTH_TRANSPARENT_CODE = 1;
    public static final int PRIVACY_TRANS_PARENT_ACTIVITY_CODE = 2;
    private static final String TAG = "HealthKitMainActivity";

    private void replaceFragment(Fragment fragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        a b = tk5.b(supportFragmentManager, supportFragmentManager);
        b.g(R.id.healthkit_main, fragment, null);
        b.k(false);
    }

    private void replaceWebviewFragment(Fragment fragment, Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putString("authUrl", intent.getStringExtra("authUrl"));
        bundle.putInt("flag", intent.getIntExtra("flag", 0));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        fragment.setArguments(bundle);
        aVar.g(R.id.healthkit_main, fragment, null);
        aVar.k(false);
    }

    @Override // android.app.Activity
    public void finish() {
        String str;
        try {
            aabz.aabb(TAG, "to finish HealthKitMainActivity");
            super.finish();
            overridePendingTransition(0, 0);
        } catch (IllegalArgumentException unused) {
            str = "finish has IllegalArgumentException";
            aabz.aab(TAG, str);
        } catch (Exception unused2) {
            str = "finish has exception";
            aabz.aab(TAG, str);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        aabz.aabb(TAG, "onActivityResult requestCode:" + i);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        aabz.aabb(TAG, "HealthKitMainActivity onCreate");
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_health_kit_main);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(67108864);
            getWindow().setStatusBarColor(getResources().getColor(R.color.healthkit_background));
            int intExtra = getIntent().getIntExtra(HEALTH_FRAGMENT_CODE, 0);
            if (intExtra != 1) {
                if (intExtra == 2) {
                    replaceWebviewFragment(new aabg(), getIntent());
                    return;
                } else {
                    replaceFragment(new aaba());
                    return;
                }
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = new a(supportFragmentManager);
            aVar.g(R.id.healthkit_main, new aabf(), null);
            aVar.d(null);
            aVar.k(false);
        } catch (Throwable unused) {
            aabz.aab(TAG, "onCreate has exception");
        }
    }
}
