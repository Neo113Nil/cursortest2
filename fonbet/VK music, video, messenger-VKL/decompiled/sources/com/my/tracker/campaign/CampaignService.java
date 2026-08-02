package com.my.tracker.campaign;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.my.tracker.obfuscated.m;
import com.my.tracker.obfuscated.p0;
import com.my.tracker.obfuscated.x2;
import xsna.ac3;
import xsna.hv2;

/* loaded from: classes14.dex */
public final class CampaignService extends Service {
    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        x2.a("CampaignService: onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        x2.a("CampaignService: onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        hv2 hv2Var = new hv2(this, 1);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra)) {
                m.a(new ac3(1, this, hv2Var, stringExtra));
                return super.onStartCommand(null, i, i2);
            }
        }
        m.a(hv2Var);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        p0.a(str, this, runnable);
    }
}
