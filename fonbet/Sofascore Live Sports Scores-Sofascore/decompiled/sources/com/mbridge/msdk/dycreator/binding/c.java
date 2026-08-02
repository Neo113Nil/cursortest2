package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.strategy.d;
import com.mbridge.msdk.dycreator.binding.strategy.e;
import com.mbridge.msdk.dycreator.binding.strategy.f;
import com.mbridge.msdk.dycreator.binding.strategy.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c {
    private static volatile c a;

    private c() {
    }

    public <T extends BaseStrategy> T a(String str) {
        T t = null;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) {
                t = new com.mbridge.msdk.dycreator.binding.strategy.c();
            } else if (str.equals("download")) {
                t = new com.mbridge.msdk.dycreator.binding.strategy.b();
            } else if (!str.equals("deeplink") && str.equals("activity")) {
                t = new com.mbridge.msdk.dycreator.binding.strategy.a();
            }
            if (str.equals("feedback")) {
                t = new d();
            }
            if (str.equals("notice")) {
                t = new e();
            }
            if (str.equals("permissionInfo")) {
                t = new f();
            }
            if (str.equals("privateAddress")) {
                return new g();
            }
        }
        return t;
    }

    public static c a() {
        if (a == null) {
            synchronized (c.class) {
                try {
                    if (a == null) {
                        a = new c();
                    }
                } finally {
                }
            }
        }
        return a;
    }
}
