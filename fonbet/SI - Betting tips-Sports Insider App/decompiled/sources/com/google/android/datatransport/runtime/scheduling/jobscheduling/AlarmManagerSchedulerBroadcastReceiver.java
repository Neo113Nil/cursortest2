package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.appcompat.app.v0;
import e5.i;
import e5.r;
import k5.d;
import k5.h;
import o5.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4185a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i5 = intent.getExtras().getInt("attemptNumber");
        r.b(context);
        v0 a7 = i.a();
        a7.Y(queryParameter);
        a7.f366d = a.b(intValue);
        if (queryParameter2 != null) {
            a7.f365c = Base64.decode(queryParameter2, 0);
        }
        h hVar = r.a().f8666d;
        hVar.f18837e.execute(new d(hVar, a7.d(), i5, new aa.d(6)));
    }
}
