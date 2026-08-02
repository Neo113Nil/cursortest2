package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.JavascriptException;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import io.sentry.A1;
import io.sentry.AbstractC4772k2;
import io.sentry.C4733c3;
import io.sentry.C4744f;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.H3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4839u0;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.Z1;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.C4705r0;
import io.sentry.android.core.NdkIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.a1;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public abstract class G {
    public static /* synthetic */ boolean a(InterfaceC4839u0 interfaceC4839u0) {
        return (interfaceC4839u0 instanceof UncaughtExceptionHandlerIntegration) || (interfaceC4839u0 instanceof AnrIntegration) || (interfaceC4839u0 instanceof NdkIntegration);
    }

    public static /* synthetic */ C4733c3 d(F3.c cVar, C4733c3 c4733c3, io.sentry.J j10) {
        m(c4733c3);
        return cVar != null ? cVar.a(c4733c3, j10) : c4733c3;
    }

    public static /* synthetic */ C4744f e(String str, String str2, C4744f c4744f, io.sentry.J j10) {
        Object k10 = c4744f.k(EventKeys.URL);
        String str3 = k10 instanceof String ? (String) k10 : "";
        if ("http".equals(c4744f.r())) {
            if (str != null && str3.startsWith(str)) {
                return null;
            }
            if (str2 != null && str3.startsWith(str2)) {
                return null;
            }
        }
        return c4744f;
    }

    public static void f(SentryAndroidOptions sentryAndroidOptions, ReadableMap readableMap, ILogger iLogger) {
        ReadableMap map;
        ReadableMap map2;
        if (readableMap.hasKey("_experiments") && (map = readableMap.getMap("_experiments")) != null && map.hasKey("profilingOptions") && (map2 = map.getMap("profilingOptions")) != null) {
            if (map2.hasKey("profileSessionSampleRate")) {
                if (map2.getType("profileSessionSampleRate") == ReadableType.Number) {
                    double d10 = map2.getDouble("profileSessionSampleRate");
                    sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(d10));
                    iLogger.c(EnumC4788n3.INFO, String.format("UI Profiling profileSessionSampleRate set to: %.2f", Double.valueOf(d10)), new Object[0]);
                } else {
                    iLogger.c(EnumC4788n3.WARNING, "UI Profiling profileSessionSampleRate must be a number, ignoring invalid value", new Object[0]);
                }
            }
            if (map2.hasKey("lifecycle")) {
                if (map2.getType("lifecycle") == ReadableType.String) {
                    String string = map2.getString("lifecycle");
                    if ("manual".equalsIgnoreCase(string)) {
                        sentryAndroidOptions.setProfileLifecycle(A1.MANUAL);
                        iLogger.c(EnumC4788n3.INFO, "UI Profile Lifecycle set to MANUAL", new Object[0]);
                    } else if ("trace".equalsIgnoreCase(string)) {
                        sentryAndroidOptions.setProfileLifecycle(A1.TRACE);
                        iLogger.c(EnumC4788n3.INFO, "UI Profile Lifecycle set to TRACE", new Object[0]);
                    }
                } else {
                    iLogger.c(EnumC4788n3.WARNING, "UI Profiling lifecycle must be a string, ignoring invalid value", new Object[0]);
                }
            }
            if (map2.hasKey("startOnAppStart")) {
                if (map2.getType("startOnAppStart") != ReadableType.Boolean) {
                    iLogger.c(EnumC4788n3.WARNING, "UI Profiling startOnAppStart must be a boolean, ignoring invalid value", new Object[0]);
                    return;
                }
                boolean z10 = map2.getBoolean("startOnAppStart");
                sentryAndroidOptions.setStartProfilerOnAppStart(z10);
                iLogger.c(EnumC4788n3.INFO, String.format("UI Profiling startOnAppStart set to %b", Boolean.valueOf(z10)), new Object[0]);
            }
        }
    }

    public static H3 g(ReadableMap readableMap) {
        ReadableMap map;
        H3 h32 = new H3(false, new io.sentry.protocol.s("sentry.javascript.react-native", "8.18.0"));
        if (readableMap.hasKey("replaysSessionSampleRate") || readableMap.hasKey("replaysOnErrorSampleRate")) {
            h32.S(readableMap.hasKey("replaysSessionSampleRate") ? Double.valueOf(readableMap.getDouble("replaysSessionSampleRate")) : null);
            h32.P(readableMap.hasKey("replaysOnErrorSampleRate") ? Double.valueOf(readableMap.getDouble("replaysOnErrorSampleRate")) : null);
            if (readableMap.hasKey("mobileReplayOptions") && (map = readableMap.getMap("mobileReplayOptions")) != null) {
                h32.h(!map.hasKey("maskAllText") || map.getBoolean("maskAllText"));
                h32.g(!map.hasKey("maskAllImages") || map.getBoolean("maskAllImages"));
                if (!map.hasKey("maskAllVectors") || map.getBoolean("maskAllVectors")) {
                    h32.a("com.horcrux.svg.SvgView");
                }
                if (map.hasKey("captureSurfaceViews")) {
                    h32.I(map.getBoolean("captureSurfaceViews"));
                }
                if (map.hasKey("screenshotStrategy")) {
                    if ("canvas".equals(map.getString("screenshotStrategy"))) {
                        h32.Q(Z1.CANVAS);
                    } else {
                        h32.Q(Z1.PIXEL_COPY);
                    }
                }
                if (map.hasKey("networkDetailAllowUrls")) {
                    h32.L(o(map.getArray("networkDetailAllowUrls")));
                }
                if (map.hasKey("networkDetailDenyUrls")) {
                    h32.M(o(map.getArray("networkDetailDenyUrls")));
                }
                if (map.hasKey("networkCaptureBodies")) {
                    h32.K(map.getBoolean("networkCaptureBodies"));
                }
                if (map.hasKey("networkRequestHeaders")) {
                    h32.N(o(map.getArray("networkRequestHeaders")));
                }
                if (map.hasKey("networkResponseHeaders")) {
                    h32.O(o(map.getArray("networkResponseHeaders")));
                }
                h32.i(io.sentry.react.replay.a.class.getName());
                h32.j(io.sentry.react.replay.b.class.getName());
                return h32;
            }
        }
        return h32;
    }

    public static void h(SentryAndroidOptions sentryAndroidOptions, ReadableMap readableMap, ILogger iLogger) {
        ReadableMap map;
        ReadableArray array;
        ReadableArray array2;
        if (readableMap.hasKey("debug") && readableMap.getBoolean("debug")) {
            sentryAndroidOptions.setDebug(true);
        }
        if (!readableMap.hasKey("dsn") || readableMap.getString("dsn") == null) {
            sentryAndroidOptions.setDsn("");
        } else {
            String string = readableMap.getString("dsn");
            iLogger.c(EnumC4788n3.INFO, String.format("Starting with DSN: '%s'", string), new Object[0]);
            sentryAndroidOptions.setDsn(string);
        }
        if (readableMap.hasKey("sampleRate")) {
            sentryAndroidOptions.setSampleRate(Double.valueOf(readableMap.getDouble("sampleRate")));
        }
        if (readableMap.hasKey("sendClientReports")) {
            sentryAndroidOptions.setSendClientReports(readableMap.getBoolean("sendClientReports"));
        }
        if (readableMap.hasKey("maxBreadcrumbs")) {
            sentryAndroidOptions.setMaxBreadcrumbs(readableMap.getInt("maxBreadcrumbs"));
        }
        if (readableMap.hasKey("maxCacheItems")) {
            sentryAndroidOptions.setMaxCacheItems(readableMap.getInt("maxCacheItems"));
        }
        if (readableMap.hasKey("environment") && readableMap.getString("environment") != null) {
            sentryAndroidOptions.setEnvironment(readableMap.getString("environment"));
        }
        if (readableMap.hasKey("release") && readableMap.getString("release") != null) {
            sentryAndroidOptions.setRelease(readableMap.getString("release"));
        }
        if (readableMap.hasKey("dist") && readableMap.getString("dist") != null) {
            sentryAndroidOptions.setDist(readableMap.getString("dist"));
        }
        if (readableMap.hasKey("enableAutoSessionTracking")) {
            sentryAndroidOptions.setEnableAutoSessionTracking(readableMap.getBoolean("enableAutoSessionTracking"));
        }
        if (readableMap.hasKey("sessionTrackingIntervalMillis")) {
            sentryAndroidOptions.setSessionTrackingIntervalMillis(readableMap.getInt("sessionTrackingIntervalMillis"));
        }
        if (readableMap.hasKey("shutdownTimeout")) {
            sentryAndroidOptions.setShutdownTimeoutMillis(readableMap.getInt("shutdownTimeout"));
        }
        if (readableMap.hasKey("enableNdkScopeSync")) {
            sentryAndroidOptions.setEnableScopeSync(readableMap.getBoolean("enableNdkScopeSync"));
        }
        if (readableMap.hasKey("attachStacktrace")) {
            sentryAndroidOptions.setAttachStacktrace(readableMap.getBoolean("attachStacktrace"));
        }
        if (readableMap.hasKey("attachThreads")) {
            sentryAndroidOptions.setAttachThreads(readableMap.getBoolean("attachThreads"));
        }
        if (readableMap.hasKey("attachScreenshot")) {
            sentryAndroidOptions.setAttachScreenshot(readableMap.getBoolean("attachScreenshot"));
        }
        if (readableMap.hasKey("screenshot") && (map = readableMap.getMap("screenshot")) != null) {
            if (map.hasKey("maskAllText")) {
                sentryAndroidOptions.getScreenshot().h(map.getBoolean("maskAllText"));
            }
            if (map.hasKey("maskAllImages")) {
                sentryAndroidOptions.getScreenshot().g(map.getBoolean("maskAllImages"));
            }
            if (map.hasKey("maskedViewClasses") && (array2 = map.getArray("maskedViewClasses")) != null) {
                for (int i10 = 0; i10 < array2.size(); i10++) {
                    sentryAndroidOptions.getScreenshot().a(array2.getString(i10));
                }
            }
            if (map.hasKey("unmaskedViewClasses") && (array = map.getArray("unmaskedViewClasses")) != null) {
                for (int i11 = 0; i11 < array.size(); i11++) {
                    sentryAndroidOptions.getScreenshot().b(array.getString(i11));
                }
            }
        }
        if (readableMap.hasKey("attachViewHierarchy")) {
            sentryAndroidOptions.setAttachViewHierarchy(readableMap.getBoolean("attachViewHierarchy"));
        }
        if (readableMap.hasKey("sendDefaultPii")) {
            sentryAndroidOptions.setSendDefaultPii(readableMap.getBoolean("sendDefaultPii"));
        }
        if (readableMap.hasKey("strictTraceContinuation")) {
            sentryAndroidOptions.setStrictTraceContinuation(readableMap.getBoolean("strictTraceContinuation"));
        }
        if (readableMap.hasKey("orgId")) {
            if (readableMap.getType("orgId") == ReadableType.String) {
                sentryAndroidOptions.setOrgId(readableMap.getString("orgId"));
            } else if (readableMap.getType("orgId") == ReadableType.Number) {
                sentryAndroidOptions.setOrgId(String.valueOf((long) readableMap.getDouble("orgId")));
            }
        }
        if (readableMap.hasKey("maxQueueSize")) {
            sentryAndroidOptions.setMaxQueueSize(readableMap.getInt("maxQueueSize"));
        }
        if (readableMap.hasKey("enableNdk")) {
            sentryAndroidOptions.setEnableNdk(readableMap.getBoolean("enableNdk"));
        }
        if (readableMap.hasKey("enableTombstone")) {
            sentryAndroidOptions.setTombstoneEnabled(readableMap.getBoolean("enableTombstone"));
        }
        if (readableMap.hasKey("enableAnrFingerprinting")) {
            sentryAndroidOptions.setEnableAnrFingerprinting(readableMap.getBoolean("enableAnrFingerprinting"));
        }
        if (readableMap.hasKey("spotlight")) {
            if (readableMap.getType("spotlight") == ReadableType.Boolean) {
                sentryAndroidOptions.setEnableSpotlight(readableMap.getBoolean("spotlight"));
                if (readableMap.hasKey("defaultSidecarUrl")) {
                    sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("defaultSidecarUrl"));
                }
            } else if (readableMap.getType("spotlight") == ReadableType.String) {
                sentryAndroidOptions.setEnableSpotlight(true);
                sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("spotlight"));
            }
        }
        H3 g10 = g(readableMap);
        sentryAndroidOptions.setSessionReplay(g10);
        if (j(g10)) {
            sentryAndroidOptions.getReplayController().z0(new z());
        }
        f(sentryAndroidOptions, readableMap, iLogger);
        final String i12 = readableMap.hasKey("dsn") ? i(readableMap.getString("dsn")) : null;
        final String string2 = readableMap.hasKey("devServerUrl") ? readableMap.getString("devServerUrl") : null;
        sentryAndroidOptions.setBeforeBreadcrumb(new F3.a() { // from class: io.sentry.react.E
            @Override // io.sentry.F3.a
            public final C4744f a(C4744f c4744f, io.sentry.J j10) {
                return G.e(i12, string2, c4744f, j10);
            }
        });
        if (readableMap.hasKey("enableNativeCrashHandling") && !readableMap.getBoolean("enableNativeCrashHandling")) {
            sentryAndroidOptions.getIntegrations().removeIf(new Predicate() { // from class: io.sentry.react.F
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return G.a((InterfaceC4839u0) obj);
                }
            });
        }
        iLogger.c(EnumC4788n3.INFO, String.format("Native Integrations '%s'", sentryAndroidOptions.getIntegrations()), new Object[0]);
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public static boolean j(H3 h32) {
        return (h32.z() == null && h32.u() == null) ? false : true;
    }

    public static void k(Activity activity) {
        C4705r0 c10 = C4705r0.c();
        if (activity != null) {
            c10.d(activity);
        }
    }

    public static void l(C4733c3 c4733c3, String str) {
        c4733c3.d0("event.origin", Constants.PLATFORM_ANDROID);
        c4733c3.d0("event.environment", str);
    }

    public static void m(C4733c3 c4733c3) {
        io.sentry.protocol.s L10 = c4733c3.L();
        if (L10 != null) {
            String e10 = L10.e();
            e10.getClass();
            if (e10.equals("sentry.java.android.react-native")) {
                l(c4733c3, "java");
            } else if (e10.equals("sentry.native.android.react-native")) {
                l(c4733c3, "native");
            }
        }
    }

    public static void n(Context context, final ReadableMap readableMap, final Activity activity, AbstractC4772k2.a aVar, final ILogger iLogger) {
        final String string = readableMap.hasKey("sdkVersion") ? readableMap.getString("sdkVersion") : null;
        a1.g(context, new C4817b(new AbstractC4772k2.a() { // from class: io.sentry.react.B
            @Override // io.sentry.AbstractC4772k2.a
            public final void a(F3 f32) {
                G.h((SentryAndroidOptions) f32, ReadableMap.this, iLogger);
            }
        }, new AbstractC4772k2.a() { // from class: io.sentry.react.A
            @Override // io.sentry.AbstractC4772k2.a
            public final void a(F3 f32) {
                G.p((SentryAndroidOptions) f32, activity, string);
            }
        }, aVar, new AbstractC4772k2.a() { // from class: io.sentry.react.C
            @Override // io.sentry.AbstractC4772k2.a
            public final void a(F3 f32) {
                G.q((SentryAndroidOptions) f32);
            }
        }));
    }

    public static List o(ReadableArray readableArray) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (readableArray != null) {
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                if (readableArray.getType(i10) == ReadableType.String && (string = readableArray.getString(i10)) != null) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }

    public static void p(SentryAndroidOptions sentryAndroidOptions, Activity activity, String str) {
        io.sentry.protocol.s sdkVersion = sentryAndroidOptions.getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new io.sentry.protocol.s("sentry.java.android.react-native", "8.48.0");
        } else {
            sdkVersion.h("sentry.java.android.react-native");
        }
        sdkVersion.c("npm:@sentry/react-native", "8.18.0");
        if (str != null && !str.equals("8.18.0")) {
            sdkVersion.c("npm:@sentry/react-native:ota", str);
        }
        sentryAndroidOptions.setSentryClientName(sdkVersion.e() + "/" + sdkVersion.g());
        sentryAndroidOptions.setNativeSdkName("sentry.native.android.react-native");
        sentryAndroidOptions.setSdkVersion(sdkVersion);
        sentryAndroidOptions.setTracesSampleRate(null);
        sentryAndroidOptions.setTracesSampler(null);
        sentryAndroidOptions.addIgnoredExceptionForType(JavascriptException.class);
        k(activity);
    }

    public static void q(SentryAndroidOptions sentryAndroidOptions) {
        final F3.c beforeSend = sentryAndroidOptions.getBeforeSend();
        sentryAndroidOptions.setBeforeSend(new F3.c() { // from class: io.sentry.react.D
            @Override // io.sentry.F3.c
            public final C4733c3 a(C4733c3 c4733c3, io.sentry.J j10) {
                return G.d(F3.c.this, c4733c3, j10);
            }
        });
    }
}
