package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1cSDK;
import com.facebook.applinks.AppLinkData;
import com.facebook.share.internal.ShareConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class AFa1aSDK implements AFb1zSDK {
    private boolean getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;
    private final AFc1hSDK getMonetizationNetwork;

    public AFa1aSDK(AFc1hSDK aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getMonetizationNetwork = aFc1hSDK;
    }

    private boolean getMediationNetwork() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFb1zSDK
    public final void getCurrencyIso4217Code(boolean z) {
        this.getCurrencyIso4217Code = z;
    }

    @Override // com.appsflyer.internal.AFb1zSDK
    public final Map<String, Object> getCurrencyIso4217Code() {
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFb1zSDK
    public final void getRevenue() {
        Context context;
        if (getMediationNetwork() && (context = this.getMonetizationNetwork.getMonetizationNetwork) != null) {
            this.getMediationNetwork = new LinkedHashMap();
            AFa1tSDK aFa1tSDK = new AFa1tSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1cSDK.1
                    private /* synthetic */ AFa1zSDK getMediationNetwork;
                    private /* synthetic */ Class getMonetizationNetwork;

                    AnonymousClass1(Class cls3, AFa1zSDK aFa1tSDK2) {
                        r1 = cls3;
                        r2 = aFa1tSDK2;
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
                                Bundle bundle2 = (Bundle) Bundle.class.cast(r1.getMethod("getArgumentBundle", new Class[0]).invoke(r1.cast(obj2), new Object[0]));
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
                                    aFa1zSDK.getRevenue(str2, str3, str);
                                }
                            } else {
                                AFa1zSDK aFa1zSDK2 = r2;
                                if (aFa1zSDK2 != null) {
                                    aFa1zSDK2.getRevenue(null, null, null);
                                }
                            }
                            return null;
                        }
                        AFa1zSDK aFa1zSDK3 = r2;
                        if (aFa1zSDK3 != null) {
                            aFa1zSDK3.AFAdRevenueData("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1tSDK2.AFAdRevenueData("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, newProxyInstance);
                }
            } catch (ClassNotFoundException e) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
                aFa1tSDK2.AFAdRevenueData(e.toString());
            } catch (IllegalAccessException e2) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e2);
                aFa1tSDK2.AFAdRevenueData(e2.toString());
            } catch (NoSuchMethodException e3) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e3);
                aFa1tSDK2.AFAdRevenueData(e3.toString());
            } catch (InvocationTargetException e4) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e4);
                aFa1tSDK2.AFAdRevenueData(e4.toString());
            }
        }
    }

    public static final class AFa1tSDK implements AFa1cSDK.AFa1zSDK {
        private /* synthetic */ long getRevenue;

        AFa1tSDK(long j) {
            this.getRevenue = j;
        }

        @Override // com.appsflyer.internal.AFa1cSDK.AFa1zSDK
        public final void getRevenue(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: " + str);
                Map<String, Object> map2 = AFa1aSDK.this.getMediationNetwork;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFa1aSDK.this.getMediationNetwork) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFa1aSDK aFa1aSDK = AFa1aSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put(ShareConstants.PROMO_CODE, str3);
                    linkedHashMap.put(ShareConstants.DEEPLINK_CONTEXT, linkedHashMap2);
                    Map<String, Object> map3 = aFa1aSDK.getMediationNetwork;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFa1aSDK.this.getMediationNetwork;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String valueOf = String.valueOf(System.currentTimeMillis() - this.getRevenue);
            Map<String, Object> map5 = AFa1aSDK.this.getMediationNetwork;
            if (map5 != null) {
                map5.put("ttr", valueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1cSDK.AFa1zSDK
        public final void AFAdRevenueData(String str) {
            Map<String, Object> map = AFa1aSDK.this.getMediationNetwork;
            if (map != null) {
                map.put("error", str);
            }
        }
    }

    @Override // com.appsflyer.internal.AFb1zSDK
    public final boolean AFAdRevenueData() {
        if (!getMediationNetwork()) {
            return false;
        }
        Map<String, Object> map = this.getMediationNetwork;
        return map == null || map.isEmpty();
    }
}
