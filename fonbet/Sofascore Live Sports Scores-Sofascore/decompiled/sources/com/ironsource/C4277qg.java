package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.UnityAds;
import defpackage.joa;
import defpackage.xka;
import defpackage.ypa;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.qg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4277qg implements InterfaceC4241og {

    @NotNull
    public static final C4277qg a = new C4277qg();

    @NotNull
    private static final joa b = ypa.b(a.a);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.qg$a */
    public static final class a extends xka implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                UnityAds unityAds = UnityAds.INSTANCE;
                Object invoke = UnityAds.class.getMethod(C4259pg.b, null).invoke(null, null);
                if (invoke instanceof String) {
                    return (String) invoke;
                }
                return null;
            } catch (Throwable th) {
                C4157k4.d().a(th);
                IronLog.INTERNAL.warning(th.getMessage());
                return null;
            }
        }
    }

    private C4277qg() {
    }

    @Override // com.ironsource.InterfaceC4241og
    @Nullable
    public String a() {
        return (String) b.getValue();
    }
}
