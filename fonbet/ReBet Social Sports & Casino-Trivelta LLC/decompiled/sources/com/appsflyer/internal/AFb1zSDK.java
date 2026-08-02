package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1bSDK;
import g6.C4331C;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u6.C6526a;

/* loaded from: classes.dex */
public final class AFb1zSDK implements AFa1cSDK {
    private boolean AFAdRevenueData;

    @NotNull
    private final AFc1hSDK getMonetizationNetwork;

    @Nullable
    Map<String, Object> getRevenue;

    public AFb1zSDK(@NotNull AFc1hSDK aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getMonetizationNetwork = aFc1hSDK;
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final boolean AFAdRevenueData() {
        if (!getCurrencyIso4217Code()) {
            return false;
        }
        Map<String, Object> map = this.getRevenue;
        return map == null || map.isEmpty();
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final void getCurrencyIso4217Code(boolean z10) {
        this.AFAdRevenueData = z10;
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    @Nullable
    public final Map<String, Object> getMediationNetwork() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final void getMonetizationNetwork() {
        Context context;
        if (getCurrencyIso4217Code() && (context = this.getMonetizationNetwork.getMonetizationNetwork) != null) {
            this.getRevenue = new LinkedHashMap();
            AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
            try {
                C4331C c4331c = C4331C.f46921a;
                C4331C.class.getMethod("sdkInitialize", Context.class).invoke(null, context);
                String str = C6526a.f66177g;
                Method method = C6526a.class.getMethod("fetchDeferredAppLinkData", Context.class, String.class, C6526a.b.class);
                Object newProxyInstance = Proxy.newProxyInstance(C6526a.b.class.getClassLoader(), new Class[]{C6526a.b.class}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1bSDK.5
                    private /* synthetic */ AFa1uSDK getCurrencyIso4217Code;
                    private /* synthetic */ Class getMonetizationNetwork;

                    public AnonymousClass5(Class cls, AFa1uSDK aFa1zSDK2) {
                        r1 = cls;
                        r2 = aFa1zSDK2;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        String str2;
                        String str3;
                        String str4;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1uSDK aFa1uSDK = r2;
                            if (aFa1uSDK != null) {
                                aFa1uSDK.getRevenue("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(r1.getMethod("getArgumentBundle", null).invoke(r1.cast(obj2), null));
                            if (bundle2 != null) {
                                str3 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                str4 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                str2 = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                str2 = null;
                                str3 = null;
                                str4 = null;
                            }
                            AFa1uSDK aFa1uSDK2 = r2;
                            if (aFa1uSDK2 != null) {
                                aFa1uSDK2.getRevenue(str3, str4, str2);
                            }
                        } else {
                            AFa1uSDK aFa1uSDK3 = r2;
                            if (aFa1uSDK3 != null) {
                                aFa1uSDK3.getRevenue(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1zSDK2.getRevenue("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, newProxyInstance);
                }
            } catch (ClassNotFoundException e10) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e10);
                aFa1zSDK2.getRevenue(e10.toString());
            } catch (IllegalAccessException e11) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e11);
                aFa1zSDK2.getRevenue(e11.toString());
            } catch (NoSuchMethodException e12) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e12);
                aFa1zSDK2.getRevenue(e12.toString());
            } catch (InvocationTargetException e13) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e13);
                aFa1zSDK2.getRevenue(e13.toString());
            }
        }
    }

    private boolean getCurrencyIso4217Code() {
        return this.AFAdRevenueData;
    }

    public static final class AFa1zSDK implements AFa1bSDK.AFa1uSDK {
        private /* synthetic */ long getMonetizationNetwork;

        public AFa1zSDK(long j10) {
            this.getMonetizationNetwork = j10;
        }

        @Override // com.appsflyer.internal.AFa1bSDK.AFa1uSDK
        public final void getRevenue(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: " + str);
                Map<String, Object> map2 = AFb1zSDK.this.getRevenue;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFb1zSDK.this.getRevenue) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFb1zSDK aFb1zSDK = AFb1zSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFb1zSDK.getRevenue;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFb1zSDK.this.getRevenue;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String valueOf = String.valueOf(System.currentTimeMillis() - this.getMonetizationNetwork);
            Map<String, Object> map5 = AFb1zSDK.this.getRevenue;
            if (map5 != null) {
                map5.put("ttr", valueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1bSDK.AFa1uSDK
        public final void getRevenue(@Nullable String str) {
            Map<String, Object> map = AFb1zSDK.this.getRevenue;
            if (map != null) {
                map.put("error", str);
            }
        }
    }
}
