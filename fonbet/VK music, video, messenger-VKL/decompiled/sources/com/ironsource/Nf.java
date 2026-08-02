package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Nf {
    public static final Nf a = new Nf();

    private Nf() {
    }

    public final void a(int i) {
        a(EnumC4650y5.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i), null);
    }

    public final void b() {
        a(this, EnumC4650y5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() {
        a(this, EnumC4650y5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() {
        a(this, EnumC4650y5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    public final void a(String str) {
        a(EnumC4650y5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), str);
    }

    public static /* synthetic */ void a(Nf nf, EnumC4650y5 enumC4650y5, Integer num, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        nf.a(enumC4650y5, num, str);
    }

    private final void a(EnumC4650y5 enumC4650y5, Integer num, String str) {
        Wf wf = Wf.a;
        JSONObject a2 = wf.a(false);
        if (num != null) {
            a2.put("errorCode", num.intValue());
            JSONArray a3 = a();
            if (a3 != null) {
                a2.put(com.ironsource.mediationsdk.metadata.a.f, a3);
            }
        }
        if (str != null) {
            a2.put("reason", str);
        }
        wf.a(enumC4650y5, a2);
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> d = Wf.a.d();
        if (d.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            return new JSONArray((Collection) d.get(com.ironsource.mediationsdk.metadata.a.f));
        }
        return null;
    }
}
