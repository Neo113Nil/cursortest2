package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Lf {

    @NotNull
    public static final Lf a = new Lf();

    private Lf() {
    }

    private final void a(EnumC4373w5 enumC4373w5, Integer num, String str) {
        Uf uf = Uf.a;
        JSONObject a2 = uf.a(false);
        if (num != null) {
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            JSONArray a3 = a();
            if (a3 != null) {
                a2.put(com.ironsource.mediationsdk.metadata.a.f, a3);
            }
        }
        if (str != null) {
            a2.put("reason", str);
        }
        uf.a(enumC4373w5, a2);
    }

    public final void b() {
        a(this, EnumC4373w5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() {
        a(this, EnumC4373w5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() {
        a(this, EnumC4373w5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    public final void a(@NotNull String str) {
        str.getClass();
        a(EnumC4373w5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), str);
    }

    public static /* synthetic */ void a(Lf lf, EnumC4373w5 enumC4373w5, Integer num, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        lf.a(enumC4373w5, num, str);
    }

    public final void a(int i) {
        a(EnumC4373w5.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i), null);
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> d = Uf.a.d();
        if (d.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            return new JSONArray((Collection) d.get(com.ironsource.mediationsdk.metadata.a.f));
        }
        return null;
    }
}
