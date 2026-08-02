package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Kf {
    public static final Kf a = new Kf();

    private Kf() {
    }

    public final void a(int i) {
        a(EnumC2754y5.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i), null);
    }

    public final void b() {
        a(this, EnumC2754y5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() {
        a(this, EnumC2754y5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() {
        a(this, EnumC2754y5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    public final void a(String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        a(EnumC2754y5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }

    static /* synthetic */ void a(Kf kf, EnumC2754y5 enumC2754y5, Integer num, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        kf.a(enumC2754y5, num, str);
    }

    private final void a(EnumC2754y5 enumC2754y5, Integer num, String str) {
        Tf tf = Tf.a;
        JSONObject a2 = tf.a(false);
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
        tf.a(enumC2754y5, a2);
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> d = Tf.a.d();
        if (d.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            return new JSONArray((Collection) d.get(com.ironsource.mediationsdk.metadata.a.f));
        }
        return null;
    }
}
