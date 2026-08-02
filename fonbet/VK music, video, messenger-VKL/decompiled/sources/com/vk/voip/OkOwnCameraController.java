package com.vk.voip;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import xsna.s3q0;

/* compiled from: OkOwnCameraController.kt */
/* loaded from: classes11.dex */
public final class OkOwnCameraController extends BroadcastReceiver {
    public static final OkOwnCameraController a = new OkOwnCameraController();
    public static final OKVoipEngine b = OKVoipEngine.b;
    public static boolean c;
    public static boolean d;

    private OkOwnCameraController() {
    }

    public final void a(Application application) {
        if (c) {
            return;
        }
        c = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        s3q0 s3q0Var = s3q0.a;
        application.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            OKVoipEngine oKVoipEngine = b;
            if (hashCode != -2128145023) {
                if (hashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON") && d) {
                    oKVoipEngine.y().b(true);
                    return;
                }
                return;
            }
            if (action.equals("android.intent.action.SCREEN_OFF")) {
                oKVoipEngine.getClass();
                d = OKVoipEngine.I();
                oKVoipEngine.y().b(false);
            }
        }
    }
}
