package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.UnityAds;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.gzs;

/* renamed from: com.ironsource.tg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4571tg implements InterfaceC4535rg {
    public static final C4571tg a = new C4571tg();
    private static final Lazy b = new bpn0(a.a);

    /* renamed from: com.ironsource.tg$a */
    public static final class a extends Lambda implements gzs<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                UnityAds unityAds = UnityAds.INSTANCE;
                Object invoke = UnityAds.class.getMethod(C4553sg.b, null).invoke(null, null);
                if (invoke instanceof String) {
                    return (String) invoke;
                }
                return null;
            } catch (Throwable th) {
                C4452n4.d().a(th);
                IronLog.INTERNAL.warning(th.getMessage());
                return null;
            }
        }
    }

    private C4571tg() {
    }

    @Override // com.ironsource.InterfaceC4535rg
    public String a() {
        return (String) b.getValue();
    }
}
