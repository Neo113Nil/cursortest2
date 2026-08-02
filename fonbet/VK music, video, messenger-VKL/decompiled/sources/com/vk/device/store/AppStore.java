package com.vk.device.store;

import android.net.Uri;
import com.huawei.hms.android.SystemUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppStore.kt */
/* loaded from: classes18.dex */
public final class AppStore {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppStore[] $VALUES;
    public static final a Companion;
    public static final AppStore GOOGLE;
    public static final AppStore HUAWEI;
    public static final AppStore RUSTORE;
    public static final AppStore SAMSUNG;
    public static final AppStore XIAOMI;
    private final List<String> deepLinks;
    private final List<String> hosts;
    private final String packageName;

    /* compiled from: AppStore.kt */
    public static final class a {
        public static AppStore a(Uri uri) {
            String scheme;
            Boolean bool;
            String host = uri.getHost();
            if (host != null && (scheme = uri.getScheme()) != null) {
                for (AppStore appStore : AppStore.values()) {
                    List<String> i = appStore.i();
                    boolean z = true;
                    if (i == null || !i.contains(host)) {
                        List<String> h = appStore.h();
                        if (h != null) {
                            List<String> list = h;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    if (drm0.D((String) it.next(), scheme, false)) {
                                        break;
                                    }
                                }
                            }
                            z = false;
                            bool = Boolean.valueOf(z);
                        } else {
                            bool = null;
                        }
                        if (!epx.f(bool, Boolean.TRUE)) {
                        }
                    }
                    return appStore;
                }
            }
            return null;
        }
    }

    static {
        AppStore appStore = new AppStore(0, "GOOGLE", "com.android.vending", Collections.singletonList("play.google.com"), Collections.singletonList("market"));
        GOOGLE = appStore;
        AppStore appStore2 = new AppStore(1, "SAMSUNG", "com.sec.android.app.samsungapps", Collections.singletonList("galaxystore.samsung.com"), Collections.singletonList("samsungapps"));
        SAMSUNG = appStore2;
        AppStore appStore3 = new AppStore(2, SystemUtils.PRODUCT_HUAWEI, "com.huawei.appmarket", Collections.singletonList("appgallery.huawei.com"), e43.l("appmarket", "hiapplink"));
        HUAWEI = appStore3;
        AppStore appStore4 = new AppStore(3, "RUSTORE", "ru.vk.store", e43.l("apps.rustore.ru", "adv.rustore.ru"), null);
        RUSTORE = appStore4;
        AppStore appStore5 = new AppStore(4, "XIAOMI", "com.xiaomi.mipicks", Collections.singletonList("global.app.mi.com"), null);
        XIAOMI = appStore5;
        AppStore[] appStoreArr = {appStore, appStore2, appStore3, appStore4, appStore5};
        $VALUES = appStoreArr;
        $ENTRIES = new asp(appStoreArr);
        Companion = new a();
    }

    public AppStore(int i, String str, String str2, List list, List list2) {
        this.packageName = str2;
        this.hosts = list;
        this.deepLinks = list2;
    }

    public static AppStore valueOf(String str) {
        return (AppStore) Enum.valueOf(AppStore.class, str);
    }

    public static AppStore[] values() {
        return (AppStore[]) $VALUES.clone();
    }

    public final List<String> h() {
        return this.deepLinks;
    }

    public final List<String> i() {
        return this.hosts;
    }

    public final String j() {
        return this.packageName;
    }
}
