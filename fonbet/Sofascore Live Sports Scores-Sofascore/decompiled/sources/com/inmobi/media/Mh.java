package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import defpackage.b1c;
import defpackage.joa;
import defpackage.ypa;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Mh {
    public final C3487i4 a;
    public final joa b;

    public Mh(C3487i4 c3487i4) {
        c3487i4.getClass();
        this.a = c3487i4;
        this.b = ypa.b(new b1c(13));
    }

    public static final ArrayList a(Mh mh) {
        C3797u4 c3797u4;
        C3797u4 c3797u42;
        C3797u4 c3797u43;
        C3797u4 c3797u44;
        C3797u4 c3797u45;
        ArrayList arrayList = new ArrayList();
        C3694q4 c3694q4 = AbstractC3435g4.a;
        RootConfig rootConfig = (RootConfig) c3694q4.a(RootConfig.class);
        if (a(rootConfig, RootConfig.class)) {
            RootConfig rootConfig2 = (RootConfig) c3694q4.a(RootConfig.class);
            if (RootConfig.class.equals(RootConfig.class)) {
                c3797u45 = new C3797u4(rootConfig2.getUrlForType("root"), rootConfig2);
            } else {
                Config a = c3694q4.a(RootConfig.class);
                c3797u45 = new C3797u4(rootConfig2.getUrlForType(a.getType()), a);
            }
            arrayList.add(c3797u45);
            return arrayList;
        }
        if (a(rootConfig, AdConfig.class)) {
            RootConfig rootConfig3 = (RootConfig) c3694q4.a(RootConfig.class);
            if (AdConfig.class.equals(RootConfig.class)) {
                c3797u44 = new C3797u4(rootConfig3.getUrlForType("root"), rootConfig3);
            } else {
                Config a2 = c3694q4.a(AdConfig.class);
                c3797u44 = new C3797u4(rootConfig3.getUrlForType(a2.getType()), a2);
            }
            arrayList.add(c3797u44);
        }
        if (a(rootConfig, TelemetryConfig.class)) {
            RootConfig rootConfig4 = (RootConfig) c3694q4.a(RootConfig.class);
            if (TelemetryConfig.class.equals(RootConfig.class)) {
                c3797u43 = new C3797u4(rootConfig4.getUrlForType("root"), rootConfig4);
            } else {
                Config a3 = c3694q4.a(TelemetryConfig.class);
                c3797u43 = new C3797u4(rootConfig4.getUrlForType(a3.getType()), a3);
            }
            arrayList.add(c3797u43);
        }
        if (a(rootConfig, SignalsConfig.class)) {
            RootConfig rootConfig5 = (RootConfig) c3694q4.a(RootConfig.class);
            if (SignalsConfig.class.equals(RootConfig.class)) {
                c3797u42 = new C3797u4(rootConfig5.getUrlForType("root"), rootConfig5);
            } else {
                Config a4 = c3694q4.a(SignalsConfig.class);
                c3797u42 = new C3797u4(rootConfig5.getUrlForType(a4.getType()), a4);
            }
            arrayList.add(c3797u42);
        }
        if (a(rootConfig, CrashConfig.class)) {
            RootConfig rootConfig6 = (RootConfig) c3694q4.a(RootConfig.class);
            if (CrashConfig.class.equals(RootConfig.class)) {
                c3797u4 = new C3797u4(rootConfig6.getUrlForType("root"), rootConfig6);
            } else {
                Config a5 = c3694q4.a(CrashConfig.class);
                c3797u4 = new C3797u4(rootConfig6.getUrlForType(a5.getType()), a5);
            }
            arrayList.add(c3797u4);
        }
        return arrayList;
    }

    public static final Sh a() {
        return new Sh((F9) Ve.b.getValue());
    }

    public static boolean a(RootConfig rootConfig, Class cls) {
        C3694q4 c3694q4 = AbstractC3435g4.a;
        cls.getClass();
        Config a = AbstractC3435g4.a.a(cls);
        return a == null || System.currentTimeMillis() - a.getLastUpdateTimeStamp() > rootConfig.getExpiryInMillisForType(B4.a(cls));
    }
}
