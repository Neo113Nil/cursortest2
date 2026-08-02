package com.mbridge.msdk.video.module.listener.impl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a extends f {
    private Activity a;
    private CampaignEx b;

    public a(Activity activity, CampaignEx campaignEx) {
        this.a = activity;
        this.b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        if (i != 106 || this.a == null || this.b == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            String a = com.mbridge.msdk.click.c.a(this.b.getClickURL(), "-999", "-999");
            if (!TextUtils.isEmpty(a)) {
                intent.setData(Uri.parse(a));
                this.a.startActivity(intent);
            }
        } catch (Throwable th) {
            q0.b("NotifyListener", th.getMessage(), th);
        }
        this.a.finish();
    }
}
