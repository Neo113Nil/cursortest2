package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.kj.pcc.wh;
import com.bytedance.sdk.openadsdk.lu.sf;
import com.bytedance.sdk.openadsdk.lu.sf.pcc;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class BusMonitorDependWrapper implements sf {
    private sf pcc;
    private wh sf;

    public BusMonitorDependWrapper(sf sfVar) {
        this.pcc = sfVar;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object invoke = method.invoke(null, null);
            return (Application) invoke.getClass().getMethod("getApplication", null).invoke(invoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lu.sf
    public Context getContext() {
        sf sfVar = this.pcc;
        return (sfVar == null || sfVar.getContext() == null) ? getReflectContext() : this.pcc.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.lu.sf
    public wh getHandler() {
        sf sfVar = this.pcc;
        if (sfVar != null && sfVar.getHandler() != null) {
            return this.pcc.getHandler();
        }
        wh whVar = this.sf;
        if (whVar != null) {
            return whVar;
        }
        wh whVar2 = new wh(new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper())) { // from class: com.bytedance.sdk.openadsdk.BusMonitorDependWrapper.1
            @Override // com.bytedance.sdk.component.kj.pcc.wh
            public boolean pcc() {
                return false;
            }
        };
        this.sf = whVar2;
        return whVar2;
    }

    @Override // com.bytedance.sdk.openadsdk.lu.sf
    public int getOnceLogCount() {
        sf sfVar = this.pcc;
        if (sfVar != null) {
            return sfVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.lu.sf
    public int getOnceLogInterval() {
        sf sfVar = this.pcc;
        if (sfVar != null) {
            return sfVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.lu.sf
    public HandlerThread getSafeHandlerThread(String str, int i) {
        HandlerThread safeHandlerThread;
        sf sfVar = this.pcc;
        if (sfVar != null && (safeHandlerThread = sfVar.getSafeHandlerThread(str, i)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.lu.sf
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        sf sfVar = this.pcc;
        if (sfVar == null || (uploadIntervalTime = sfVar.getUploadIntervalTime()) < 3600000) {
            return 86400000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.lu.sf
    public boolean isMonitorOpen() {
        sf sfVar = this.pcc;
        if (sfVar != null) {
            return sfVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.lu.sf
    public void onMonitorUpload(List<pcc> list) {
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.onMonitorUpload(list);
        }
    }
}
