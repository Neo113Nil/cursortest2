package com.bytedance.sdk.openadsdk.lu;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.kj.pcc.wh;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface sf {
    Context getContext();

    wh getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    HandlerThread getSafeHandlerThread(String str, int i);

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.lu.sf.pcc> list);
}
