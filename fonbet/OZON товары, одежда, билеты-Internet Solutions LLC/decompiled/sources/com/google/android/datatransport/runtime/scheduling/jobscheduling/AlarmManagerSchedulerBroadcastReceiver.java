package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import S6.r;
import S6.u;
import Y6.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import c7.C5758a;

/* loaded from: classes9.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f57796a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i11 = intent.getExtras().getInt("attemptNumber");
        u.c(context);
        r.a a11 = r.a();
        a11.b(queryParameter);
        a11.d(C5758a.b(intValue));
        if (queryParameter2 != null) {
            a11.c(Base64.decode(queryParameter2, 0));
        }
        u.a().b().k(a11.a(), i11, new a());
    }
}
