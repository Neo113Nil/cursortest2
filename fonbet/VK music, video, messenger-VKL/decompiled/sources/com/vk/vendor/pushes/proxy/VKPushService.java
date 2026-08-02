package com.vk.vendor.pushes.proxy;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import com.vk.vendor.pushes.FirebasePushService;
import java.util.concurrent.ExecutorService;
import xsna.che0;
import xsna.dm10;
import xsna.oa01;
import xsna.ui70;
import xsna.v801;
import xsna.xf00;
import xsna.xhe0;
import xsna.z4g;

/* compiled from: VKPushService.kt */
/* loaded from: classes6.dex */
public final class VKPushService extends Service {
    public che0 b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        che0 che0Var = this.b;
        if (che0Var == null) {
            Context applicationContext = getApplicationContext();
            ExecutorService executorService = oa01.c;
            if (executorService == null) {
                executorService = null;
            }
            ExecutorService executorService2 = executorService;
            xhe0 e = dm10.e();
            ui70 d = z4g.d();
            v801 v801Var = FirebasePushService.d;
            if (v801Var == null) {
                throw new IllegalArgumentException("Method initLibverify was not called on FirebasePushService!");
            }
            che0Var = new che0(new xf00(applicationContext, executorService2, e, d, v801Var));
            this.b = che0Var;
        }
        return (IBinder) che0Var.e.getValue();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        che0 che0Var = this.b;
        if (che0Var != null) {
            che0Var.b = true;
            ((HandlerThread) che0Var.c.getValue()).quit();
        }
        this.b = null;
    }
}
