package com.vk.instantjobs.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.instantjobs.services.a;
import xsna.mnm;
import xsna.pn3;
import xsna.rgl;
import xsna.x6x;
import xsna.xyx;

/* compiled from: InstantJobCancelReceiver.kt */
/* loaded from: classes2.dex */
public final class InstantJobCancelReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.vk.instantjobs.receivers.ACTION_CANCEL".equals(intent.getAction()) && intent.hasExtra("com.vk.instantjobs.receivers.EXTRA_JOB_ID") && intent.hasExtra("com.vk.instantjobs.receivers.EXTRA_INSTANCE_ID")) {
            int intExtra = intent.getIntExtra("com.vk.instantjobs.receivers.EXTRA_JOB_ID", 0);
            int intExtra2 = intent.getIntExtra("com.vk.instantjobs.receivers.EXTRA_JOB_NOTIFY_ID", 0);
            String stringExtra = intent.getStringExtra("com.vk.instantjobs.receivers.EXTRA_INSTANCE_ID");
            if (intExtra == 0 || stringExtra == null || stringExtra.length() == 0) {
                return;
            }
            x6x x6xVar = rgl.f.get(stringExtra);
            if (x6xVar != null) {
                x6xVar.k("Canceled from push", new mnm(intExtra, 2));
            }
            a.a.post(new pn3(1, new xyx(context, intExtra2)));
        }
    }
}
