package com.vk.superapp.logs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import xsna.brm0;
import xsna.gnj;
import xsna.par0;

/* compiled from: SuperappLogsBroadcastReceiver.kt */
/* loaded from: classes6.dex */
public final class SuperappLogsBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String host;
        Uri data = intent.getData();
        if (!brm0.w(intent.getAction(), "android.provider.Telephony.SECRET_CODE", false) || data == null || (host = data.getHost()) == null) {
            return;
        }
        int i = gnj.a(context).getInt("com.vk.sdk.APP_ID");
        par0 par0Var = par0.a;
        String str = "SuperappLogsBroadcastReceiver check secret code(" + data.getHost() + ") with appId(" + i + ')';
        par0Var.getClass();
        par0.e(str);
        if (!host.equals(i + "725") || i == 0) {
            return;
        }
        Intent intent2 = new Intent(context, (Class<?>) SuperappLogsActivity.class);
        intent2.addFlags(268435456);
        context.startActivity(intent2);
    }
}
