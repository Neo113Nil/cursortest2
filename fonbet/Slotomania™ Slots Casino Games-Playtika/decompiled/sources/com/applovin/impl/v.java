package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class v {
    private static boolean a = true;
    private static final Object b = new Object();
    private static final Collection c = new HashSet();
    private static boolean d = false;
    private static a e = null;

    public static class a {
        private boolean a;
        private String b = "";
        private EnumC0112a c = EnumC0112a.NOT_SET;

        /* renamed from: com.applovin.impl.v$a$a, reason: collision with other inner class name */
        public enum EnumC0112a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");

            private final String a;

            EnumC0112a(String str) {
                this.a = str;
            }

            public String b() {
                return this.a;
            }
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public EnumC0112a b() {
            return this.c;
        }

        public boolean c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || c() != aVar.c()) {
                return false;
            }
            String a = a();
            String a2 = aVar.a();
            if (a != null ? !a.equals(a2) : a2 != null) {
                return false;
            }
            EnumC0112a b = b();
            EnumC0112a b2 = aVar.b();
            return b != null ? b.equals(b2) : b2 == null;
        }

        public int hashCode() {
            int i = c() ? 79 : 97;
            String a = a();
            int hashCode = ((i + 59) * 59) + (a == null ? 43 : a.hashCode());
            EnumC0112a b = b();
            return (hashCode * 59) + (b != null ? b.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public void a(boolean z) {
            this.a = z;
        }

        public void a(String str) {
            this.b = str;
        }

        public void a(EnumC0112a enumC0112a) {
            this.c = enumC0112a;
        }

        public String a() {
            return this.b;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        q7.a();
        Object obj = b;
        synchronized (obj) {
            if (d) {
                return e;
            }
            Collection collection = c;
            boolean isEmpty = collection.isEmpty();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            collection.add(countDownLatch);
            if (isEmpty) {
                a c2 = c(context);
                synchronized (obj) {
                    d = true;
                    e = c2;
                    hashSet = new HashSet(collection);
                    collection.clear();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((CountDownLatch) it.next()).countDown();
                }
            }
            try {
                if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                    com.applovin.impl.sdk.p.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                }
            } catch (InterruptedException e2) {
                com.applovin.impl.sdk.p.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e2);
            }
            synchronized (b) {
                aVar = e;
            }
            return aVar;
        }
    }

    public static a b(Context context) {
        return a(context);
    }

    private static a c(Context context) {
        a collectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (collectGoogleAdvertisingInfo == null) {
            collectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return collectGoogleAdvertisingInfo == null ? new a() : collectGoogleAdvertisingInfo;
    }

    private static a collectFireOSAdvertisingInfo(Context context) {
        if (a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z);
                aVar.a(z ? a.EnumC0112a.ON : a.EnumC0112a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e2) {
                com.applovin.impl.sdk.p.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e2);
            } catch (Throwable th) {
                com.applovin.impl.sdk.p.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        a = false;
        return null;
    }

    private static a collectGoogleAdvertisingInfo(Context context) {
        q7.a();
        if (!a()) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.p.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            a aVar = new a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.a(isLimitAdTrackingEnabled);
            aVar.a(isLimitAdTrackingEnabled ? a.EnumC0112a.ON : a.EnumC0112a.OFF);
            aVar.a(advertisingIdInfo.getId());
            return aVar;
        } catch (Throwable th) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.p.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            return null;
        }
    }

    public static boolean a() {
        return q7.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}
