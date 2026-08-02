package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1rSDK;
import com.facebook.applinks.AppLinkData;
import com.facebook.share.internal.ShareConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFc1iSDK implements AFc1hSDK {
    private boolean getMediationNetwork;
    private final AFd1lSDK getMonetizationNetwork;
    Map<String, Object> getRevenue;

    public AFc1iSDK(AFd1lSDK aFd1lSDK) {
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        this.getMonetizationNetwork = aFd1lSDK;
    }

    private boolean getMediationNetwork() {
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    public final void getMonetizationNetwork(boolean z) {
        this.getMediationNetwork = z;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    public final Map<String, Object> AFAdRevenueData() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    public final void getCurrencyIso4217Code() {
        Context context;
        if (getMediationNetwork() && (context = this.getMonetizationNetwork.getCurrencyIso4217Code) != null) {
            this.getRevenue = new LinkedHashMap();
            AFa1vSDK aFa1vSDK = new AFa1vSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1rSDK.1
                    private /* synthetic */ Class AFAdRevenueData;
                    private /* synthetic */ AFa1zSDK getMediationNetwork;

                    public AnonymousClass1(Class cls3, AFa1zSDK aFa1vSDK2) {
                        r1 = cls3;
                        r2 = aFa1vSDK2;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                        String str;
                        String str2;
                        String str3;
                        Bundle bundle;
                        if (method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            Object obj2 = objArr[0];
                            if (obj2 != null) {
                                Bundle bundle2 = (Bundle) Bundle.class.cast(r1.getMethod("getArgumentBundle", null).invoke(r1.cast(obj2), null));
                                if (bundle2 != null) {
                                    str2 = bundle2.getString(AppLinkData.ARGUMENTS_NATIVE_URL);
                                    str3 = bundle2.getString("target_url");
                                    Bundle bundle3 = bundle2.getBundle("extras");
                                    str = (bundle3 == null || (bundle = bundle3.getBundle(ShareConstants.DEEPLINK_CONTEXT)) == null) ? null : bundle.getString(ShareConstants.PROMO_CODE);
                                } else {
                                    str = null;
                                    str2 = null;
                                    str3 = null;
                                }
                                AFa1zSDK aFa1zSDK = r2;
                                if (aFa1zSDK != null) {
                                    aFa1zSDK.getMonetizationNetwork(str2, str3, str);
                                }
                            } else {
                                AFa1zSDK aFa1zSDK2 = r2;
                                if (aFa1zSDK2 != null) {
                                    aFa1zSDK2.getMonetizationNetwork(null, null, null);
                                }
                            }
                            return null;
                        }
                        AFa1zSDK aFa1zSDK3 = r2;
                        if (aFa1zSDK3 != null) {
                            aFa1zSDK3.getRevenue("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1vSDK2.getRevenue("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, newProxyInstance);
                }
            } catch (ClassNotFoundException e) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
                aFa1vSDK2.getRevenue(e.toString());
            } catch (IllegalAccessException e2) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e2);
                aFa1vSDK2.getRevenue(e2.toString());
            } catch (NoSuchMethodException e3) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e3);
                aFa1vSDK2.getRevenue(e3.toString());
            } catch (InvocationTargetException e4) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e4);
                aFa1vSDK2.getRevenue(e4.toString());
            }
        }
    }

    public static final class AFa1vSDK implements AFa1rSDK.AFa1zSDK {
        private /* synthetic */ long AFAdRevenueData;

        AFa1vSDK(long j) {
            this.AFAdRevenueData = j;
        }

        @Override // com.appsflyer.internal.AFa1rSDK.AFa1zSDK
        public final void getMonetizationNetwork(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: " + str);
                Map<String, Object> map2 = AFc1iSDK.this.getRevenue;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFc1iSDK.this.getRevenue) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFc1iSDK aFc1iSDK = AFc1iSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put(ShareConstants.PROMO_CODE, str3);
                    linkedHashMap.put(ShareConstants.DEEPLINK_CONTEXT, linkedHashMap2);
                    Map<String, Object> map3 = aFc1iSDK.getRevenue;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFc1iSDK.this.getRevenue;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String valueOf = String.valueOf(System.currentTimeMillis() - this.AFAdRevenueData);
            Map<String, Object> map5 = AFc1iSDK.this.getRevenue;
            if (map5 != null) {
                map5.put("ttr", valueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1rSDK.AFa1zSDK
        public final void getRevenue(String str) {
            Map<String, Object> map = AFc1iSDK.this.getRevenue;
            if (map != null) {
                map.put("error", str);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    public final boolean getMonetizationNetwork() {
        if (!getMediationNetwork()) {
            return false;
        }
        Map<String, Object> map = this.getRevenue;
        return map == null || map.isEmpty();
    }
}
