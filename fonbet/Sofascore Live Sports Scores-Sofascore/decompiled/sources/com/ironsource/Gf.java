package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4121i3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import defpackage.dmi;
import defpackage.lnb;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Gf {
    private static final Map<IronSource.a, C4278r0> a = new HashMap();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IronSource.a.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IronSource.a.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public static IronSource.a b(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return null;
        }
        int i = a.b[adFormat.ordinal()];
        if (i == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i == 3) {
            return IronSource.a.BANNER;
        }
        if (i != 4) {
            return null;
        }
        return IronSource.a.NATIVE_AD;
    }

    public static int c(IronSource.a aVar) {
        int i = a.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? AbstractC4121i3.e.NOT_SUPPORTED.b() : AbstractC4121i3.e.BANNER.b() : AbstractC4121i3.e.NATIVE_AD.b() : AbstractC4121i3.e.INTERSTITIAL.b() : AbstractC4121i3.e.REWARDED_VIDEO.b();
    }

    public static b b(IronSource.a aVar) {
        return new b(aVar);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class b {
        private final IronSource.a a;

        public b(IronSource.a aVar) {
            this.a = aVar;
        }

        private String b() {
            IronSource.a aVar = this.a;
            return aVar != null ? aVar.name() : "";
        }

        public String a(String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append(b());
            sb.append(TextUtils.isEmpty(str2) ? "" : dmi.q(" - ", str2));
            String sb2 = sb.toString();
            return TextUtils.isEmpty(str) ? sb2 : lnb.o(sb2, " - ", str);
        }

        public String a(String str) {
            return a(str, null);
        }

        public String a() {
            return a(null);
        }
    }

    private static C4278r0 a(AbstractC4386x0 abstractC4386x0) {
        Map<IronSource.a, C4278r0> map = a;
        if (map.containsKey(abstractC4386x0.b().a())) {
            return map.get(abstractC4386x0.b().a());
        }
        C4278r0 c4278r0 = new C4278r0();
        map.put(abstractC4386x0.b().a(), c4278r0);
        return c4278r0;
    }

    public static C3959aa a() {
        return com.ironsource.mediationsdk.p.g().m();
    }

    public static void a(Throwable th) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", th.getMessage());
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        a(EnumC4373w5.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    public static void a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        a(EnumC4373w5.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    public static void a(EnumC4373w5 enumC4373w5, JSONObject jSONObject) {
        Ib.a0().q().a(new C4355v5(enumC4373w5, C4110ha.a(IronSourceUtils.b(false), jSONObject)));
    }

    public static Q0 a(AbstractC4386x0 abstractC4386x0, int i) {
        return a(abstractC4386x0).a(abstractC4386x0.b().c(), abstractC4386x0.m(), i);
    }

    public static String a(LevelPlay.AdFormat adFormat) {
        int i = a.b[adFormat.ordinal()];
        if (i == 1) {
            return "rewarded";
        }
        if (i == 2) {
            return "interstitial";
        }
        if (i == 3) {
            return "banner";
        }
        if (i != 4) {
            return "";
        }
        return "nativeAd";
    }

    public static LevelPlay.AdFormat a(IronSource.a aVar) {
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        if (i != 4) {
            return null;
        }
        return LevelPlay.AdFormat.BANNER;
    }
}
