package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.ICommonParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g {
    private String a = null;
    private int b = -1;

    public final String a() {
        if (!TextUtils.isEmpty(this.a) && !"0".equals(this.a)) {
            return this.a;
        }
        String d = com.apm.insight.e.a().d();
        this.a = d;
        if (!TextUtils.isEmpty(d) && !"0".equals(this.a)) {
            return this.a;
        }
        String b = o.a().b();
        this.a = b;
        return b;
    }

    public final boolean b() {
        return this.a != null;
    }

    public final void a(String str) {
        this.a = str;
        o.a().a(str);
    }

    public static com.apm.insight.nativecrash.b a(Context context) {
        return new com.apm.insight.nativecrash.b(context, new ICommonParams() { // from class: com.apm.insight.runtime.g.1
            @Override // com.apm.insight.ICommonParams
            public final Map<String, Object> getCommonParams() {
                return new HashMap();
            }

            @Override // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }
}
