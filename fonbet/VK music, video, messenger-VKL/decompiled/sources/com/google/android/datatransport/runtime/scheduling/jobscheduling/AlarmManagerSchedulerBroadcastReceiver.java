package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.acd0;
import xsna.eo5;
import xsna.fdq0;
import xsna.qdq0;
import xsna.sop0;
import xsna.uc1;
import xsna.zop0;

/* loaded from: classes12.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        zop0.b(context);
        eo5.a a2 = sop0.a();
        a2.b(queryParameter);
        a2.c = acd0.b(intValue);
        if (queryParameter2 != null) {
            a2.b = Base64.decode(queryParameter2, 0);
        }
        qdq0 qdq0Var = zop0.a().d;
        qdq0Var.e.execute(new fdq0(qdq0Var, a2.a(), i, new uc1()));
    }
}
