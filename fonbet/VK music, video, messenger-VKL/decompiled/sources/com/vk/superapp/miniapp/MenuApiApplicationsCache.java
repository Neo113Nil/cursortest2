package com.vk.superapp.miniapp;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.VkAppsFeatured;
import com.vk.dto.common.data.VkAppsList;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;
import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import xsna.aqi;
import xsna.asp;
import xsna.bpn0;
import xsna.drm0;
import xsna.dt;
import xsna.etb;
import xsna.gx8;
import xsna.hg1;
import xsna.hms;
import xsna.it80;
import xsna.k220;
import xsna.kwg0;
import xsna.m20;
import xsna.mb3;
import xsna.oqu;
import xsna.pf1;
import xsna.qey;
import xsna.qft;
import xsna.rsg0;
import xsna.st0;
import xsna.t33;
import xsna.up;
import xsna.wmi0;
import xsna.z410;
import xsna.zau0;
import xsna.zrp;

/* compiled from: MenuApiApplicationsCache.kt */
/* loaded from: classes11.dex */
public final class MenuApiApplicationsCache implements gx8.a {
    public static final MenuApiApplicationsCache b = new MenuApiApplicationsCache();
    public static final bpn0 c = new bpn0(new mb3(8));
    public static final bpn0 d = new bpn0(new aqi(3));
    public static final HashMap<AppsType, Long> e = new HashMap<>();
    public static final b f = new b();
    public static final f<VkAppsList> g = new f<>();
    public static final f<VkAppsList> h = new f<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MenuApiApplicationsCache.kt */
    /* loaded from: classes6.dex */
    public static final class AppsType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AppsType[] $VALUES;
        public static final AppsType APP;
        public static final AppsType GAME;

        static {
            AppsType appsType = new AppsType("APP", 0);
            APP = appsType;
            AppsType appsType2 = new AppsType("GAME", 1);
            GAME = appsType2;
            AppsType[] appsTypeArr = {appsType, appsType2};
            $VALUES = appsTypeArr;
            $ENTRIES = new asp(appsTypeArr);
        }

        public AppsType() {
            throw null;
        }

        public static AppsType valueOf(String str) {
            return (AppsType) Enum.valueOf(AppsType.class, str);
        }

        public static AppsType[] values() {
            return (AppsType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VkAppsList b(List list, it80 it80Var) {
        T t = it80Var.a;
        if (list.isEmpty()) {
            VkAppsFeatured vkAppsFeatured = (VkAppsFeatured) t;
            List<ApiApplication> d2 = vkAppsFeatured != null ? vkAppsFeatured.d() : null;
            if (d2 == null || d2.isEmpty()) {
                throw new IllegalStateException("Empty cache.");
            }
        }
        VkAppsFeatured vkAppsFeatured2 = (VkAppsFeatured) t;
        if (vkAppsFeatured2 == null) {
            vkAppsFeatured2 = new VkAppsFeatured(null, null, null, 7, null);
        }
        return new VkAppsList(list, vkAppsFeatured2);
    }

    public static String c(AppsType appsType) {
        String s;
        String lowerCase = appsType.name().toLowerCase(Locale.ENGLISH);
        StringBuilder a = t33.a("menu_items_vk_", lowerCase, "s_v_");
        a.append(BuildInfo.e);
        String sb = a.toString();
        SharedPreferences f2 = Preference.f("menu_items_vk_apps");
        ArrayList arrayList = new ArrayList();
        Preference.Type type = Preference.Type.String;
        Preference preference = Preference.a;
        preference.getClass();
        arrayList.add(Preference.c(f2, type, "menu_items_vk_apps", "menu_items_vk_apps_timestamp_name", ""));
        Preference.Type type2 = Preference.Type.Number;
        preference.getClass();
        arrayList.add(Preference.c(f2, type2, "menu_items_vk_apps", sb, -1));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Preference.f) it.next()).a();
        }
        s = Preference.s("menu_items_vk_apps", "menu_items_vk_apps_timestamp_name", new String());
        if (!s.equals(sb) && drm0.D(s, lowerCase, false)) {
            Preference.H("menu_items_vk_apps", "menu_items_vk_apps_timestamp_name", sb);
            if (!TextUtils.isEmpty(s)) {
                SharedPreferences f3 = Preference.f("menu_items_vk_apps");
                ArrayList arrayList2 = new ArrayList();
                Preference.a.getClass();
                arrayList2.add(Preference.c(f3, type, "menu_items_vk_apps", s, ""));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((Preference.f) it2.next()).a();
                }
                Preference.C("menu_items_vk_apps", s);
            }
        }
        return sb;
    }

    public static void d() {
        q c0;
        if (g(AppsType.APP)) {
            c0 = e();
        } else {
            wmi0 wmi0Var = wmi0.a;
            c0 = q.I0(wmi0Var.e("key_menu_fav_vk_apps_list"), wmi0Var.l("key_menu_fea_vk_apps", a.b()), new dt(17)).c0(e());
        }
        hg1.e(f, c0.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.d520
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                MenuApiApplicationsCache.g.onNext((VkAppsList) obj);
            }
        }, kwg0.b()));
    }

    public static b0 e() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Preference.F(currentTimeMillis, "menu_items_vk_apps", (String) c.getValue());
        e.put(AppsType.APP, Long.valueOf(currentTimeMillis));
        zau0 zau0Var = new zau0();
        zau0Var.k = true;
        m1 y0 = rsg0.y0(zau0Var, null, null, 3);
        hms hmsVar = new hms(new qey(7), 10);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(hmsVar, lVar, kVar, kVar).F(new pf1(new oqu(8), 29));
    }

    public static b0 f() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Preference.F(currentTimeMillis, "menu_items_vk_apps", (String) d.getValue());
        e.put(AppsType.GAME, Long.valueOf(currentTimeMillis));
        qft qftVar = new qft();
        qftVar.k = true;
        m1 y0 = rsg0.y0(qftVar, null, null, 3);
        st0 st0Var = new st0(new k220(1), 24);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(st0Var, lVar, kVar, kVar).F(new m20(new z410(1), 26));
    }

    public static boolean g(AppsType appsType) {
        String str = appsType == AppsType.GAME ? (String) d.getValue() : (String) c.getValue();
        HashMap<AppsType, Long> hashMap = e;
        if (!hashMap.containsKey(appsType)) {
            hashMap.put(appsType, Long.valueOf(Preference.m(-1L, "menu_items_vk_apps", str)));
        }
        Long l = hashMap.get(appsType);
        if (l != null) {
            return (System.currentTimeMillis() / ((long) 1000)) - l.longValue() > TimeUnit.HOURS.toSeconds(6L);
        }
        return true;
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.SYSTEM;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        Preference.C("menu_items_vk_apps", (String) c.getValue());
        AppsType appsType = AppsType.APP;
        HashMap<AppsType, Long> hashMap = e;
        hashMap.remove(appsType);
        Preference.C("menu_items_vk_apps", (String) d.getValue());
        hashMap.remove(AppsType.GAME);
        f.e();
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "MiniAppsMenuCache";
    }

    public final void h() {
        q c0;
        Preference.C("menu_items_vk_apps", (String) c.getValue());
        AppsType appsType = AppsType.APP;
        HashMap<AppsType, Long> hashMap = e;
        hashMap.remove(appsType);
        Preference.C("menu_items_vk_apps", (String) d.getValue());
        AppsType appsType2 = AppsType.GAME;
        hashMap.remove(appsType2);
        b bVar = f;
        bVar.e();
        d();
        if (g(appsType2)) {
            c0 = f();
        } else {
            wmi0 wmi0Var = wmi0.a;
            c0 = q.I0(wmi0Var.e("key_menu_fav_vk_games_list"), wmi0Var.l("key_menu_fea_vk_games", io.reactivex.rxjava3.android.schedulers.a.b()), new up(20)).c0(f());
        }
        hg1.e(bVar, c0.subscribe(new etb(), kwg0.b()));
    }

    @Override // xsna.gx8.a
    public final long u() {
        return 0L;
    }
}
