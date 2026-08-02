package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.setting.m;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class b {
    protected Handler a;

    public abstract void a(int i, long j, int i2, m mVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar, boolean z);

    public synchronized void a(int i, long j, int i2, m mVar, String str, String str2, boolean z, com.mbridge.msdk.preload.listenter.a aVar) {
        try {
            a(i, j, i2, mVar, str, str2, aVar, z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(Context context, CampaignEx campaignEx) {
    }

    public void a(CampaignUnit campaignUnit) {
    }

    public void a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar, int i) {
    }
}
