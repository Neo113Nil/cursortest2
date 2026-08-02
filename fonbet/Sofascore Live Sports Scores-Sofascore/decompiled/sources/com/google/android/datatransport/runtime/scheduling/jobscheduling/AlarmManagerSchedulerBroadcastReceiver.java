package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.ax0;
import defpackage.gyj;
import defpackage.hcc;
import defpackage.ji3;
import defpackage.jv0;
import defpackage.m7f;
import defpackage.x;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        gyj.b(context);
        hcc a2 = jv0.a();
        a2.Y(queryParameter);
        a2.d = m7f.b(intValue);
        if (queryParameter2 != null) {
            a2.c = Base64.decode(queryParameter2, 0);
        }
        ji3 ji3Var = gyj.a().d;
        ((Executor) ji3Var.c).execute(new ax0(ji3Var, a2.H(), i, new x(3), 1));
    }
}
