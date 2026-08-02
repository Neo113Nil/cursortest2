package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import com.ironsource.L6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a {
    private List<String> a;
    private int b = 1;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    public static class C0023a {
        String a;
        String b;
        int c;
        long d;
        File e;

        public C0023a(String str, String str2, int i, long j, File file) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = j;
            this.e = file;
        }
    }

    public a(List<String> list) {
        this.a = list;
    }

    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, com.bykv.vk.openvk.preload.geckox.d.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        List<ComponentModel.a> list;
        List<Long> b;
        List<Long> b2;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ComponentModel.b> entry : map.entrySet()) {
                String key = entry.getKey();
                File file2 = new File(file, key);
                if (file2.isDirectory() && (value = entry.getValue()) != null && (list = value.a) != null && !list.isEmpty()) {
                    List<ComponentModel.a> list2 = value.a;
                    HashSet hashSet = new HashSet();
                    for (ComponentModel.a aVar2 : list2) {
                        String str = aVar2.a;
                        if (!hashSet.contains(str)) {
                            hashSet.add(str);
                            int i = aVar2.b;
                            List<Long> list3 = aVar2.c;
                            File file3 = new File(file2, str);
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        File file4 = new File(file2, str);
                                        File file5 = new File(file2, str + "--pending-delete");
                                        file4.renameTo(file5);
                                        arrayList.add(new C0023a(key, str, i, 0L, file5));
                                    }
                                } else if (list3 != null && (b = g.b(file3)) != null && !b.isEmpty()) {
                                    for (Long l : b) {
                                        if (list3.get(0).longValue() > l.longValue()) {
                                            File file6 = new File(file3, l + "--pending-delete");
                                            new File(file3, String.valueOf(l)).renameTo(file6);
                                            arrayList.add(new C0023a(key, str, i, l.longValue(), file6));
                                        }
                                    }
                                }
                            } else if (list3 != null && (b2 = g.b(file3)) != null && !b2.isEmpty()) {
                                for (Long l2 : b2) {
                                    if (list3.contains(l2)) {
                                        File file7 = new File(file3, l2 + "--pending-delete");
                                        new File(file3, String.valueOf(l2)).renameTo(file7);
                                        arrayList.add(new C0023a(key, str, i, l2.longValue(), file7));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0023a> list4 = arrayList;
                    if (list4 != null && !list4.isEmpty()) {
                        for (C0023a c0023a : list4) {
                            File file8 = c0023a.e;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            boolean a = com.bykv.vk.openvk.preload.geckox.utils.b.a(file8);
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            if (a) {
                                b.a(context2).a(c0023a.a, c0023a.b, c0023a.c, 200, c0023a.d, 0, null, uptimeMillis2 - uptimeMillis);
                            } else {
                                b.a(context2).a(c0023a.a, c0023a.b, c0023a.c, 201, c0023a.d, 601, "delete failed", uptimeMillis2 - uptimeMillis);
                            }
                        }
                    }
                } catch (Exception e2) {
                    GeckoLogger.w("clean-channel", "", e2);
                }
            }
        });
    }

    public static List<StatisticModel.PackageStatisticModel> a(Context context) {
        return b.a(context).a();
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.c()) {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a()), e.a(bVar.a()), bVar.l(), bVar.m());
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.a()).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = "https://" + bVar.j() + "/gecko/server/packages/stats";
            try {
                Response doPost = bVar.i().doPost(str, statisticModel.toJson());
                if (doPost.code == 200) {
                    if (new JSONObject(doPost.body).getInt("status") != 0) {
                        throw new RuntimeException("upload failed");
                    }
                } else {
                    throw new NetworkErrorException("net work get failed, code: " + doPost.code + ", url:" + str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.a.size(); i++) {
                    jSONArray.put(this.a.get(i));
                }
                jSONObject.put("gecko_accesskey", jSONArray);
            }
            jSONObject.put(L6.F, 0);
            jSONObject.put("msg_type", this.b);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
