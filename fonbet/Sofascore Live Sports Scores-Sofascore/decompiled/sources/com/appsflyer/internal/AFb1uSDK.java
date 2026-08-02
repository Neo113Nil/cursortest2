package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1cSDK;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFb1uSDK implements AFa1aSDK {
    private boolean AFKeystoreWrapper;

    @NotNull
    private final AFc1cSDK AFLogger;

    @Nullable
    Map<String, Object> unregisterClient;

    public AFb1uSDK(@NotNull AFc1cSDK aFc1cSDK) {
        aFc1cSDK.getClass();
        this.AFLogger = aFc1cSDK;
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final void AFKeystoreWrapper() {
        Context context;
        if (this.AFKeystoreWrapper && (context = this.AFLogger.d) != null) {
            this.unregisterClient = new LinkedHashMap();
            AFa1tSDK aFa1tSDK = new AFa1tSDK(System.currentTimeMillis());
            try {
                com.facebook.w wVar = com.facebook.w.a;
                com.facebook.w.class.getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1cSDK.5
                    private /* synthetic */ AFa1tSDK AFKeystoreWrapper;
                    private /* synthetic */ Class unregisterClient;

                    public AnonymousClass5(Class cls3, AFa1tSDK aFa1tSDK2) {
                        r1 = cls3;
                        r2 = aFa1tSDK2;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                        String str;
                        String str2;
                        String str3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1tSDK aFa1tSDK2 = r2;
                            if (aFa1tSDK2 != null) {
                                aFa1tSDK2.registerClient("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(r1.getMethod("getArgumentBundle", null).invoke(r1.cast(obj2), null));
                            if (bundle2 != null) {
                                str2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                str3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                                str = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                str = null;
                                str2 = null;
                                str3 = null;
                            }
                            AFa1tSDK aFa1tSDK3 = r2;
                            if (aFa1tSDK3 != null) {
                                aFa1tSDK3.registerClient(str2, str3, str);
                            }
                        } else {
                            AFa1tSDK aFa1tSDK4 = r2;
                            if (aFa1tSDK4 != null) {
                                aFa1tSDK4.registerClient(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1tSDK2.registerClient("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, newProxyInstance);
                }
            } catch (ClassNotFoundException e) {
                AFLogger.INSTANCE.e(LogTag.META_REFERRER, "FB class missing error", e, false, false);
                aFa1tSDK2.registerClient(e.toString());
            } catch (IllegalAccessException e2) {
                AFLogger.INSTANCE.e(LogTag.META_REFERRER, "FB illegal access", e2, false, false);
                aFa1tSDK2.registerClient(e2.toString());
            } catch (NoSuchMethodException e3) {
                AFLogger.INSTANCE.e(LogTag.META_REFERRER, "FB method missing error", e3, false, false);
                aFa1tSDK2.registerClient(e3.toString());
            } catch (InvocationTargetException e4) {
                AFLogger.INSTANCE.e(LogTag.META_REFERRER, "FB invocation error", e4, false, false);
                aFa1tSDK2.registerClient(e4.toString());
            }
        }
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final void d(boolean z) {
        this.AFKeystoreWrapper = z;
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final boolean unregisterClient() {
        if (!this.AFKeystoreWrapper) {
            return false;
        }
        Map<String, Object> map = this.unregisterClient;
        return map == null || map.isEmpty();
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    @Nullable
    public final Map<String, Object> d() {
        return this.unregisterClient;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class AFa1tSDK implements AFa1cSDK.AFa1tSDK {
        private /* synthetic */ long registerClient;

        public AFa1tSDK(long j) {
            this.registerClient = j;
        }

        @Override // com.appsflyer.internal.AFa1cSDK.AFa1tSDK
        public final void registerClient(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Facebook Deferred AppLink data received: ".concat(str), false, 4, null);
                Map<String, Object> map2 = AFb1uSDK.this.unregisterClient;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFb1uSDK.this.unregisterClient) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFb1uSDK aFb1uSDK = AFb1uSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFb1uSDK.unregisterClient;
                    if (map3 != null) {
                        map3.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFb1uSDK.this.unregisterClient;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String valueOf = String.valueOf(System.currentTimeMillis() - this.registerClient);
            Map<String, Object> map5 = AFb1uSDK.this.unregisterClient;
            if (map5 != null) {
                map5.put("ttr", valueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1cSDK.AFa1tSDK
        public final void registerClient(String str) {
            Map<String, Object> map = AFb1uSDK.this.unregisterClient;
            if (map != null) {
                map.put("error", str);
            }
        }
    }
}
