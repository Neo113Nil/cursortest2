package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.k;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.PreloadListener;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.m;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {
    private static final String r = "d";
    private static Map<String, Map<Long, Object>> s = new HashMap();
    private static Map<String, Boolean> t = new HashMap();
    private static Map<String, k> u = new HashMap();
    private static Map<String, Integer> v = new HashMap();
    private static Map<String, Integer> w = new HashMap();
    private static d x = null;
    private static int y = -1;
    private static int z = -2;
    private com.mbridge.msdk.setting.k b;
    private com.mbridge.msdk.click.a c;
    private m d;
    private String e;
    private Map<String, Object> i;
    private List<Integer> j;
    protected List<Integer> k;
    private List<Integer> l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    Queue<Integer> f = null;
    Queue<Long> g = null;
    private int h = 0;
    private com.mbridge.msdk.foundation.same.task.b q = new com.mbridge.msdk.foundation.same.task.b(com.mbridge.msdk.foundation.controller.c.n().d());

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.a = new a();
    }

    public static void b(int i, String str) {
        if (u.containsKey(str)) {
            k kVar = u.get(str);
            if (i == 1) {
                kVar.a(0);
            } else if (i == 2) {
                kVar.b(0);
            }
            u.put(str, kVar);
        }
    }

    public static Map<String, Integer> c() {
        return v;
    }

    public static Map<String, Integer> d() {
        return w;
    }

    public static Map<String, k> e() {
        return u;
    }

    public static Map<String, Map<Long, Object>> f() {
        return s;
    }

    public static Map<String, Boolean> g() {
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x028e A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:23:0x00bd, B:25:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:42:0x013f, B:45:0x0147, B:47:0x014f, B:49:0x0155, B:52:0x015a, B:54:0x015e, B:60:0x016b, B:62:0x0173, B:64:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:72:0x01b6, B:74:0x01be, B:76:0x01cd, B:78:0x01de, B:83:0x01ef, B:85:0x01f5, B:87:0x0209, B:89:0x020f, B:95:0x0218, B:97:0x021e, B:105:0x022e, B:107:0x0251, B:109:0x0265, B:111:0x028e, B:112:0x0295, B:114:0x029d, B:116:0x02af, B:117:0x02b8, B:119:0x02c3, B:125:0x02d3, B:127:0x02e4, B:132:0x02f1, B:133:0x031d, B:135:0x0358, B:136:0x035d, B:138:0x0365, B:140:0x036f, B:141:0x038f, B:143:0x0397, B:145:0x03a1, B:146:0x03c1, B:149:0x03f5, B:151:0x0421, B:152:0x0455, B:156:0x043e, B:157:0x03f2, B:159:0x0309, B:161:0x02d9, B:162:0x02de, B:167:0x0246, B:176:0x0255, B:183:0x045b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029d A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:23:0x00bd, B:25:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:42:0x013f, B:45:0x0147, B:47:0x014f, B:49:0x0155, B:52:0x015a, B:54:0x015e, B:60:0x016b, B:62:0x0173, B:64:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:72:0x01b6, B:74:0x01be, B:76:0x01cd, B:78:0x01de, B:83:0x01ef, B:85:0x01f5, B:87:0x0209, B:89:0x020f, B:95:0x0218, B:97:0x021e, B:105:0x022e, B:107:0x0251, B:109:0x0265, B:111:0x028e, B:112:0x0295, B:114:0x029d, B:116:0x02af, B:117:0x02b8, B:119:0x02c3, B:125:0x02d3, B:127:0x02e4, B:132:0x02f1, B:133:0x031d, B:135:0x0358, B:136:0x035d, B:138:0x0365, B:140:0x036f, B:141:0x038f, B:143:0x0397, B:145:0x03a1, B:146:0x03c1, B:149:0x03f5, B:151:0x0421, B:152:0x0455, B:156:0x043e, B:157:0x03f2, B:159:0x0309, B:161:0x02d9, B:162:0x02de, B:167:0x0246, B:176:0x0255, B:183:0x045b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c3 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:23:0x00bd, B:25:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:42:0x013f, B:45:0x0147, B:47:0x014f, B:49:0x0155, B:52:0x015a, B:54:0x015e, B:60:0x016b, B:62:0x0173, B:64:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:72:0x01b6, B:74:0x01be, B:76:0x01cd, B:78:0x01de, B:83:0x01ef, B:85:0x01f5, B:87:0x0209, B:89:0x020f, B:95:0x0218, B:97:0x021e, B:105:0x022e, B:107:0x0251, B:109:0x0265, B:111:0x028e, B:112:0x0295, B:114:0x029d, B:116:0x02af, B:117:0x02b8, B:119:0x02c3, B:125:0x02d3, B:127:0x02e4, B:132:0x02f1, B:133:0x031d, B:135:0x0358, B:136:0x035d, B:138:0x0365, B:140:0x036f, B:141:0x038f, B:143:0x0397, B:145:0x03a1, B:146:0x03c1, B:149:0x03f5, B:151:0x0421, B:152:0x0455, B:156:0x043e, B:157:0x03f2, B:159:0x0309, B:161:0x02d9, B:162:0x02de, B:167:0x0246, B:176:0x0255, B:183:0x045b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0358 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:23:0x00bd, B:25:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:42:0x013f, B:45:0x0147, B:47:0x014f, B:49:0x0155, B:52:0x015a, B:54:0x015e, B:60:0x016b, B:62:0x0173, B:64:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:72:0x01b6, B:74:0x01be, B:76:0x01cd, B:78:0x01de, B:83:0x01ef, B:85:0x01f5, B:87:0x0209, B:89:0x020f, B:95:0x0218, B:97:0x021e, B:105:0x022e, B:107:0x0251, B:109:0x0265, B:111:0x028e, B:112:0x0295, B:114:0x029d, B:116:0x02af, B:117:0x02b8, B:119:0x02c3, B:125:0x02d3, B:127:0x02e4, B:132:0x02f1, B:133:0x031d, B:135:0x0358, B:136:0x035d, B:138:0x0365, B:140:0x036f, B:141:0x038f, B:143:0x0397, B:145:0x03a1, B:146:0x03c1, B:149:0x03f5, B:151:0x0421, B:152:0x0455, B:156:0x043e, B:157:0x03f2, B:159:0x0309, B:161:0x02d9, B:162:0x02de, B:167:0x0246, B:176:0x0255, B:183:0x045b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0365 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:23:0x00bd, B:25:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:42:0x013f, B:45:0x0147, B:47:0x014f, B:49:0x0155, B:52:0x015a, B:54:0x015e, B:60:0x016b, B:62:0x0173, B:64:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:72:0x01b6, B:74:0x01be, B:76:0x01cd, B:78:0x01de, B:83:0x01ef, B:85:0x01f5, B:87:0x0209, B:89:0x020f, B:95:0x0218, B:97:0x021e, B:105:0x022e, B:107:0x0251, B:109:0x0265, B:111:0x028e, B:112:0x0295, B:114:0x029d, B:116:0x02af, B:117:0x02b8, B:119:0x02c3, B:125:0x02d3, B:127:0x02e4, B:132:0x02f1, B:133:0x031d, B:135:0x0358, B:136:0x035d, B:138:0x0365, B:140:0x036f, B:141:0x038f, B:143:0x0397, B:145:0x03a1, B:146:0x03c1, B:149:0x03f5, B:151:0x0421, B:152:0x0455, B:156:0x043e, B:157:0x03f2, B:159:0x0309, B:161:0x02d9, B:162:0x02de, B:167:0x0246, B:176:0x0255, B:183:0x045b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0397 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:23:0x00bd, B:25:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:42:0x013f, B:45:0x0147, B:47:0x014f, B:49:0x0155, B:52:0x015a, B:54:0x015e, B:60:0x016b, B:62:0x0173, B:64:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:72:0x01b6, B:74:0x01be, B:76:0x01cd, B:78:0x01de, B:83:0x01ef, B:85:0x01f5, B:87:0x0209, B:89:0x020f, B:95:0x0218, B:97:0x021e, B:105:0x022e, B:107:0x0251, B:109:0x0265, B:111:0x028e, B:112:0x0295, B:114:0x029d, B:116:0x02af, B:117:0x02b8, B:119:0x02c3, B:125:0x02d3, B:127:0x02e4, B:132:0x02f1, B:133:0x031d, B:135:0x0358, B:136:0x035d, B:138:0x0365, B:140:0x036f, B:141:0x038f, B:143:0x0397, B:145:0x03a1, B:146:0x03c1, B:149:0x03f5, B:151:0x0421, B:152:0x0455, B:156:0x043e, B:157:0x03f2, B:159:0x0309, B:161:0x02d9, B:162:0x02de, B:167:0x0246, B:176:0x0255, B:183:0x045b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0421 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:23:0x00bd, B:25:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:42:0x013f, B:45:0x0147, B:47:0x014f, B:49:0x0155, B:52:0x015a, B:54:0x015e, B:60:0x016b, B:62:0x0173, B:64:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:72:0x01b6, B:74:0x01be, B:76:0x01cd, B:78:0x01de, B:83:0x01ef, B:85:0x01f5, B:87:0x0209, B:89:0x020f, B:95:0x0218, B:97:0x021e, B:105:0x022e, B:107:0x0251, B:109:0x0265, B:111:0x028e, B:112:0x0295, B:114:0x029d, B:116:0x02af, B:117:0x02b8, B:119:0x02c3, B:125:0x02d3, B:127:0x02e4, B:132:0x02f1, B:133:0x031d, B:135:0x0358, B:136:0x035d, B:138:0x0365, B:140:0x036f, B:141:0x038f, B:143:0x0397, B:145:0x03a1, B:146:0x03c1, B:149:0x03f5, B:151:0x0421, B:152:0x0455, B:156:0x043e, B:157:0x03f2, B:159:0x0309, B:161:0x02d9, B:162:0x02de, B:167:0x0246, B:176:0x0255, B:183:0x045b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0309 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:23:0x00bd, B:25:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:42:0x013f, B:45:0x0147, B:47:0x014f, B:49:0x0155, B:52:0x015a, B:54:0x015e, B:60:0x016b, B:62:0x0173, B:64:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:72:0x01b6, B:74:0x01be, B:76:0x01cd, B:78:0x01de, B:83:0x01ef, B:85:0x01f5, B:87:0x0209, B:89:0x020f, B:95:0x0218, B:97:0x021e, B:105:0x022e, B:107:0x0251, B:109:0x0265, B:111:0x028e, B:112:0x0295, B:114:0x029d, B:116:0x02af, B:117:0x02b8, B:119:0x02c3, B:125:0x02d3, B:127:0x02e4, B:132:0x02f1, B:133:0x031d, B:135:0x0358, B:136:0x035d, B:138:0x0365, B:140:0x036f, B:141:0x038f, B:143:0x0397, B:145:0x03a1, B:146:0x03c1, B:149:0x03f5, B:151:0x0421, B:152:0x0455, B:156:0x043e, B:157:0x03f2, B:159:0x0309, B:161:0x02d9, B:162:0x02de, B:167:0x0246, B:176:0x0255, B:183:0x045b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0306  */
    @Override // com.mbridge.msdk.mbnative.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i, long j, int i2, m mVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String a2;
        b bVar;
        long j2;
        k kVar;
        String str3;
        String str4;
        int i9;
        List<Campaign> a3;
        List<Campaign> a4;
        try {
            com.mbridge.msdk.foundation.db.e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d())).d();
            int f = this.d.f();
            int e = this.d.e();
            com.mbridge.msdk.mbnative.service.net.a aVar2 = new com.mbridge.msdk.mbnative.service.net.a(com.mbridge.msdk.foundation.controller.c.n().d());
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String b2 = com.mbridge.msdk.foundation.controller.c.n().b();
            String c2 = com.mbridge.msdk.foundation.controller.c.n().c();
            Map<String, Object> map = this.i;
            if (map != null && map.containsKey(MBridgeConstans.APP_ID) && this.i.containsKey("app_key") && this.i.containsKey(MBridgeConstans.KEY_WORD) && this.i.get(MBridgeConstans.KEY_WORD) != null) {
                if (this.i.get(MBridgeConstans.APP_ID) instanceof String) {
                    b2 = (String) this.i.get(MBridgeConstans.APP_ID);
                }
                if (this.i.get("app_key") instanceof String) {
                    c2 = (String) this.i.get("app_key");
                }
                String str5 = this.i.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.i.get(MBridgeConstans.KEY_WORD) : null;
                if (!TextUtils.isEmpty(str5)) {
                    eVar.a("smart", k0.b(str5));
                }
            }
            String str6 = b2;
            String str7 = c2;
            eVar.a(MBridgeConstans.APP_ID, str6);
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            eVar.a("req_type", "1");
            if (!TextUtils.isEmpty(this.e)) {
                eVar.a("category", this.e);
            }
            if (!TextUtils.isEmpty(str2)) {
                eVar.a(MBridgeConstans.PLACEMENT_ID, str2);
            }
            eVar.a("sign", SameMD5.getMD5(str6 + str7));
            eVar.a("only_impression", "1");
            String d = v0.d(str);
            if (!TextUtils.isEmpty(d)) {
                eVar.a(j.b, d);
            }
            int intValue = v.get(str).intValue();
            if (f == y || f == 0 || intValue == 0) {
                a("The request was refused", i2, str, str2, aVar);
                return;
            }
            if (i2 == 0) {
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> a5 = com.mbridge.msdk.mbnative.cache.c.a(i);
                if (z2) {
                    if (a5 != null && (a4 = a5.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, intValue)) != null && a4.size() > 0) {
                        a(true, aVar, (String) null);
                        return;
                    } else {
                        if (this.n) {
                            a("", i2, str, str2, aVar);
                            return;
                        }
                        return;
                    }
                }
                if (i != 1 && a5 != null && (a3 = a5.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, intValue)) != null && a3.size() > 0) {
                    a(true, aVar, (String) null);
                    return;
                }
            }
            if (intValue != 0) {
                eVar.a("ad_num", intValue + "");
            }
            if (this.h != 0) {
                StringBuilder sb = new StringBuilder();
                i3 = intValue;
                sb.append(this.h);
                sb.append("");
                eVar.a("frame_num", sb.toString());
            } else {
                i3 = intValue;
            }
            if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                String str8 = (String) this.i.get(MBridgeConstans.NATIVE_INFO);
                if (!TextUtils.isEmpty(str8)) {
                    q0.b(r, "nativeinfo" + str8);
                    try {
                        JSONArray jSONArray = new JSONArray(str8);
                        str3 = str8;
                        if (jSONArray.length() > 0) {
                            int i10 = 0;
                            i5 = 0;
                            i6 = 0;
                            while (i10 < jSONArray.length()) {
                                try {
                                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                                    JSONArray jSONArray2 = jSONArray;
                                    int i11 = i10;
                                    int optInt = jSONObject.optInt("id", 0);
                                    if (2 == optInt) {
                                        i5 = jSONObject.optInt("ad_num");
                                        if (f > 0) {
                                            jSONObject.put("ad_num", f);
                                        }
                                    } else if (3 == optInt) {
                                        i6 = jSONObject.optInt("ad_num");
                                        if (f > 0) {
                                            jSONObject.put("ad_num", f);
                                        }
                                    }
                                    i10 = i11 + 1;
                                    jSONArray = jSONArray2;
                                } catch (JSONException e2) {
                                    e = e2;
                                    q0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
                                    str4 = str3;
                                    eVar.a(MBridgeConstans.NATIVE_INFO, str4);
                                    f = i3;
                                    i4 = i6;
                                    eVar.a("ad_num", f + "");
                                    eVar.a("ping_mode", "1");
                                    if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                                    }
                                    if (!NativeController.b(this.i)) {
                                    }
                                    a(eVar, i);
                                    if (u.containsKey(str)) {
                                    }
                                    i7 = 0;
                                    if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                                    }
                                    if (i == i8) {
                                    }
                                    eVar.a("offset", i7 + "");
                                    eVar.a("ad_type", "42");
                                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                                    a2 = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                                    if (!TextUtils.isEmpty(a2)) {
                                    }
                                    if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                                    }
                                    if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                                    }
                                    eVar.a("video_version", "2.0");
                                    bVar = new b(i);
                                    bVar.setUnitId(str);
                                    bVar.setPlacementId(str2);
                                    bVar.setAdType(42);
                                    bVar.d(i3);
                                    bVar.c(i5);
                                    bVar.e(i4);
                                    bVar.b(e);
                                    bVar.a(aVar);
                                    if (i == 1) {
                                    }
                                    bVar.b(true);
                                    bVar.b(NativeController.a(this.i));
                                    c cVar = new c(1, bVar, i2, str, str2);
                                    bVar.a(cVar);
                                    bVar.a(i2);
                                    cVar.a(aVar);
                                    cVar.a(z2);
                                    cVar.a(str);
                                    if (i2 != 0) {
                                    }
                                    this.a.postDelayed(cVar, j2);
                                }
                            }
                            i9 = i6;
                        } else {
                            i9 = 0;
                            i5 = 0;
                        }
                        JSONArray jSONArray3 = jSONArray;
                        try {
                            this.o = Math.max(i5, i9);
                            i6 = i9;
                            str4 = jSONArray3.toString();
                        } catch (JSONException e3) {
                            e = e3;
                            i6 = i9;
                            q0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
                            str4 = str3;
                            eVar.a(MBridgeConstans.NATIVE_INFO, str4);
                            f = i3;
                            i4 = i6;
                            eVar.a("ad_num", f + "");
                            eVar.a("ping_mode", "1");
                            if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                            }
                            if (!NativeController.b(this.i)) {
                            }
                            a(eVar, i);
                            if (u.containsKey(str)) {
                            }
                            i7 = 0;
                            if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                            }
                            if (i == i8) {
                            }
                            eVar.a("offset", i7 + "");
                            eVar.a("ad_type", "42");
                            eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                            a2 = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                            if (!TextUtils.isEmpty(a2)) {
                            }
                            if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                            }
                            if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                            }
                            eVar.a("video_version", "2.0");
                            bVar = new b(i);
                            bVar.setUnitId(str);
                            bVar.setPlacementId(str2);
                            bVar.setAdType(42);
                            bVar.d(i3);
                            bVar.c(i5);
                            bVar.e(i4);
                            bVar.b(e);
                            bVar.a(aVar);
                            if (i == 1) {
                            }
                            bVar.b(true);
                            bVar.b(NativeController.a(this.i));
                            c cVar2 = new c(1, bVar, i2, str, str2);
                            bVar.a(cVar2);
                            bVar.a(i2);
                            cVar2.a(aVar);
                            cVar2.a(z2);
                            cVar2.a(str);
                            if (i2 != 0) {
                            }
                            this.a.postDelayed(cVar2, j2);
                        }
                    } catch (JSONException e4) {
                        e = e4;
                        str3 = str8;
                        i5 = 0;
                        i6 = 0;
                    }
                    eVar.a(MBridgeConstans.NATIVE_INFO, str4);
                    f = i3;
                    i4 = i6;
                    eVar.a("ad_num", f + "");
                    eVar.a("ping_mode", "1");
                    if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                        i.b().a();
                    }
                    if (!NativeController.b(this.i)) {
                        JSONArray b3 = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                        if (b3.length() > 0) {
                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.h, v0.a(b3));
                        }
                    }
                    a(eVar, i);
                    if (u.containsKey(str) || (kVar = u.get(str)) == null) {
                        i7 = 0;
                    } else {
                        i7 = i != 1 ? i != 2 ? kVar.a() : kVar.b() : kVar.a();
                    }
                    if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i8 = 1;
                        if (i == 1) {
                            eVar.a("tnum", this.o + "");
                            eVar.a("offset", i7 + "");
                            eVar.a("ad_type", "42");
                            eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                            a2 = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                            if (!TextUtils.isEmpty(a2)) {
                                eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.g, a2);
                            }
                            if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                                eVar.a("video_width", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                            }
                            if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                                eVar.a("video_height", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                            }
                            eVar.a("video_version", "2.0");
                            bVar = new b(i);
                            bVar.setUnitId(str);
                            bVar.setPlacementId(str2);
                            bVar.setAdType(42);
                            bVar.d(i3);
                            bVar.c(i5);
                            bVar.e(i4);
                            bVar.b(e);
                            bVar.a(aVar);
                            if (i == 1 || z2) {
                                bVar.b(true);
                            }
                            bVar.b(NativeController.a(this.i));
                            c cVar22 = new c(1, bVar, i2, str, str2);
                            bVar.a(cVar22);
                            bVar.a(i2);
                            cVar22.a(aVar);
                            cVar22.a(z2);
                            cVar22.a(str);
                            if (i2 != 0) {
                                j2 = j;
                                aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j2, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                            } else {
                                j2 = j;
                                if (i2 == 1) {
                                    aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j2, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                                }
                            }
                            this.a.postDelayed(cVar22, j2);
                        }
                    } else {
                        i8 = 1;
                    }
                    if (i == i8) {
                        eVar.a("tnum", this.p + "");
                    }
                    eVar.a("offset", i7 + "");
                    eVar.a("ad_type", "42");
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                    a2 = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                    if (!TextUtils.isEmpty(a2)) {
                    }
                    if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", "2.0");
                    bVar = new b(i);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(i3);
                    bVar.c(i5);
                    bVar.e(i4);
                    bVar.b(e);
                    bVar.a(aVar);
                    if (i == 1) {
                    }
                    bVar.b(true);
                    bVar.b(NativeController.a(this.i));
                    c cVar222 = new c(1, bVar, i2, str, str2);
                    bVar.a(cVar222);
                    bVar.a(i2);
                    cVar222.a(aVar);
                    cVar222.a(z2);
                    cVar222.a(str);
                    if (i2 != 0) {
                    }
                    this.a.postDelayed(cVar222, j2);
                }
            } else if (f != z && f != 0) {
                i4 = 0;
                i5 = 0;
                eVar.a("ad_num", f + "");
                eVar.a("ping_mode", "1");
                if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                }
                if (!NativeController.b(this.i)) {
                }
                a(eVar, i);
                if (u.containsKey(str)) {
                }
                i7 = 0;
                if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                }
                if (i == i8) {
                }
                eVar.a("offset", i7 + "");
                eVar.a("ad_type", "42");
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                a2 = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                if (!TextUtils.isEmpty(a2)) {
                }
                if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                }
                if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                }
                eVar.a("video_version", "2.0");
                bVar = new b(i);
                bVar.setUnitId(str);
                bVar.setPlacementId(str2);
                bVar.setAdType(42);
                bVar.d(i3);
                bVar.c(i5);
                bVar.e(i4);
                bVar.b(e);
                bVar.a(aVar);
                if (i == 1) {
                }
                bVar.b(true);
                bVar.b(NativeController.a(this.i));
                c cVar2222 = new c(1, bVar, i2, str, str2);
                bVar.a(cVar2222);
                bVar.a(i2);
                cVar2222.a(aVar);
                cVar2222.a(z2);
                cVar2222.a(str);
                if (i2 != 0) {
                }
                this.a.postDelayed(cVar2222, j2);
            }
            i5 = 0;
            i6 = 0;
            f = i3;
            i4 = i6;
            eVar.a("ad_num", f + "");
            eVar.a("ping_mode", "1");
            if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
            }
            if (!NativeController.b(this.i)) {
            }
            a(eVar, i);
            if (u.containsKey(str)) {
            }
            i7 = 0;
            if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
            }
            if (i == i8) {
            }
            eVar.a("offset", i7 + "");
            eVar.a("ad_type", "42");
            eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
            a2 = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
            if (!TextUtils.isEmpty(a2)) {
            }
            if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
            }
            if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
            }
            eVar.a("video_version", "2.0");
            bVar = new b(i);
            bVar.setUnitId(str);
            bVar.setPlacementId(str2);
            bVar.setAdType(42);
            bVar.d(i3);
            bVar.c(i5);
            bVar.e(i4);
            bVar.b(e);
            bVar.a(aVar);
            if (i == 1) {
            }
            bVar.b(true);
            bVar.b(NativeController.a(this.i));
            c cVar22222 = new c(1, bVar, i2, str, str2);
            bVar.a(cVar22222);
            bVar.a(i2);
            cVar22222.a(aVar);
            cVar22222.a(z2);
            cVar22222.a(str);
            if (i2 != 0) {
            }
            this.a.postDelayed(cVar22222, j2);
        } catch (Exception e5) {
            String str9 = r;
            q0.b(str9, com.mbridge.msdk.mbnative.common.a.a(e5));
            q0.b(str9, e5.getMessage());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private Runnable j;
        private com.mbridge.msdk.preload.listenter.a l;
        private List<String> h = null;
        private boolean i = false;
        private boolean k = true;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class a implements Runnable {
            final /* synthetic */ CampaignUnit a;

            public a(CampaignUnit campaignUnit) {
                this.a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z = true;
                } else {
                    z = false;
                }
                if (b.this.j != null) {
                    b bVar = b.this;
                    d.this.a.removeCallbacks(bVar.j);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    d.this.a(this.a);
                }
                if (d.s.containsKey("0_" + b.this.unitId)) {
                    d.s.remove("0_" + b.this.unitId);
                }
                if (b.this.g > 0) {
                    int size = this.a.ads.size();
                    int i = b.this.g;
                    b bVar2 = b.this;
                    if (size > i) {
                        bVar2.d = bVar2.g;
                    } else {
                        bVar2.d = this.a.ads.size();
                    }
                } else {
                    int i2 = b.this.g;
                    b bVar3 = b.this;
                    if (i2 == -1) {
                        bVar3.d = 0;
                    } else {
                        int i3 = bVar3.g;
                        b bVar4 = b.this;
                        if (i3 == -3) {
                            bVar4.d = this.a.ads.size();
                        } else if (bVar4.g == -2) {
                            int template = this.a.getTemplate();
                            b bVar5 = b.this;
                            if (template == 3) {
                                if (bVar5.f != 0) {
                                    b bVar6 = b.this;
                                    bVar6.d = bVar6.f;
                                }
                            } else if (bVar5.e != 0) {
                                b bVar7 = b.this;
                                bVar7.d = bVar7.e;
                            }
                            if (b.this.d <= 0) {
                                b.this.d = ((Integer) d.v.get(b.this.unitId)).intValue();
                            }
                        }
                    }
                }
                if (this.a.ads.size() < b.this.d) {
                    b.this.d = this.a.ads.size();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("adtp", 42);
                if (TextUtils.isEmpty(b.this.b())) {
                    eVar.a(CampaignEx.JSON_KEY_HB, 0);
                } else {
                    eVar.a(CampaignEx.JSON_KEY_HB, 1);
                }
                com.mbridge.msdk.foundation.same.report.metrics.c a = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b.this.b(), eVar, this.a.getAds().get(0), b.this.unitId);
                for (int i4 = 0; i4 < this.a.ads.size(); i4++) {
                    CampaignEx campaignEx = this.a.ads.get(i4);
                    campaignEx.setLocalRequestId(a.t());
                    campaignEx.setCampaignUnitId(b.this.unitId);
                    boolean c = v0.c(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx.getPackageName());
                    d.this.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
                    if (arrayList.size() < b.this.d && campaignEx.getOfferType() != 99) {
                        if (v0.c(campaignEx)) {
                            campaignEx.setRtinsType(c ? 1 : 2);
                        }
                        if (com.mbridge.msdk.foundation.same.c.b(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList2.add(campaignEx);
                            }
                        } else {
                            v0.a(b.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.x);
                        }
                        b.this.a(campaignEx, null, null);
                    }
                    d dVar = d.this;
                    dVar.a(dVar.m, campaignEx);
                }
                b bVar8 = b.this;
                d.this.a(arrayList2, bVar8.unitId);
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> a2 = com.mbridge.msdk.mbnative.cache.c.a(this.a.getAds().get(0) != null ? this.a.getAds().get(0).getType() : 1);
                if (a2 != null) {
                    a2.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) b.this.unitId, (String) arrayList);
                }
                d.a(b.this.c, b.this.unitId);
                if (Looper.myLooper() != null && z) {
                    Looper.loop();
                }
                if (this.a.getAds().get(0) != null) {
                    com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.a.getAds().get(0).getMaitve(), this.a.getAds().get(0).getMaitve_src());
                }
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.mbridge.msdk.mbnative.controller.d$b$b, reason: collision with other inner class name */
        public class C1275b extends c.a {
            final /* synthetic */ CampaignEx a;
            final /* synthetic */ Context b;

            public C1275b(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.a = campaignEx;
                this.b = context;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.a, this.b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class c implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ int b;

            public c(String str, int i) {
                this.a = str;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = b.this.i;
                b bVar = b.this;
                if (!z2) {
                    if (bVar.j != null) {
                        b bVar2 = b.this;
                        d.this.a.removeCallbacks(bVar2.j);
                    }
                    if (b.this.a() == 1 || b.this.k) {
                        b bVar3 = b.this;
                        d dVar = d.this;
                        String str = this.a;
                        int a = bVar3.a();
                        b bVar4 = b.this;
                        dVar.a(str, a, bVar4.unitId, bVar4.placementId, bVar4.l);
                    }
                } else if (bVar.k) {
                    b bVar5 = b.this;
                    d dVar2 = d.this;
                    String str2 = this.a;
                    int a2 = bVar5.a();
                    b bVar6 = b.this;
                    dVar2.a(str2, a2, bVar6.unitId, bVar6.placementId, bVar6.l);
                }
                if (this.b == -1) {
                    d.b(b.this.c, b.this.unitId);
                }
                if (Looper.myLooper() == null || !z) {
                    return;
                }
                Looper.loop();
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.mbridge.msdk.mbnative.controller.d$b$d, reason: collision with other inner class name */
        public class RunnableC1276d implements Runnable {
            final /* synthetic */ List a;

            public RunnableC1276d(List list) {
                this.a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z = true;
                } else {
                    z = false;
                }
                if (!b.this.i && b.this.j != null) {
                    b bVar = b.this;
                    d.this.a.removeCallbacks(bVar.j);
                }
                List list = this.a;
                if (list != null && list.size() > 0) {
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                            d dVar = d.this;
                            dVar.a(dVar.m, campaignEx);
                        }
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(Long.valueOf(System.currentTimeMillis()), this.a);
                    if (d.s.containsKey("1_" + b.this.unitId)) {
                        d.s.remove("1_" + b.this.unitId);
                    }
                    d.s.put("1_" + b.this.unitId, hashMap);
                }
                if (Looper.myLooper() == null || !z) {
                    return;
                }
                Looper.loop();
            }
        }

        public b(int i) {
            this.c = i;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<com.mbridge.msdk.tracker.network.g> list, CampaignUnit campaignUnit) {
            d.this.n = true;
            d.this.a(true, this.l, (String) null);
            d.this.a(new Thread(new a(campaignUnit)));
        }

        public void b(List<String> list) {
            this.h = list;
        }

        public void c(int i) {
            this.e = i;
        }

        public void d(int i) {
            this.d = i;
        }

        public void e(int i) {
            this.f = i;
        }

        public void b(int i) {
            this.g = i;
        }

        public void b(boolean z) {
            this.k = z;
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.l = aVar;
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z) {
            this.i = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                Context d = com.mbridge.msdk.foundation.controller.c.n().d();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, d, cVar, new C1275b(campaignEx, d, aVar));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i, String str) {
            d.this.a(new Thread(new c(str, i)));
        }

        public void a(Runnable runnable) {
            this.j = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            d.this.a(new Thread(new RunnableC1276d(list)));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements Runnable {
        private int a;
        private com.mbridge.msdk.foundation.same.task.d b;
        private int c;
        private String d;
        private String e;
        private com.mbridge.msdk.preload.listenter.a f;
        private boolean g = false;

        public c(int i, com.mbridge.msdk.foundation.same.task.d dVar, int i2, String str, String str2) {
            this.a = i;
            this.b = dVar;
            this.c = i2;
            this.d = str;
            this.e = str2;
        }

        public void a(boolean z) {
            this.g = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.a(true);
            int i = this.a;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                d.this.a("REQUEST_TIMEOUT", this.c, this.d, this.e, this.f);
            } else {
                d.this.n = true;
                if (this.g || this.c == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.c, this.d, this.e, this.f);
                }
            }
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f = aVar;
        }

        public void a(String str) {
            this.d = str;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f3, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cd A[Catch: Exception -> 0x03a8, TryCatch #6 {Exception -> 0x03a8, blocks: (B:3:0x001f, B:8:0x002c, B:10:0x0052, B:14:0x006e, B:18:0x0076, B:20:0x007c, B:21:0x0088, B:23:0x008c, B:24:0x009f, B:26:0x00a5, B:27:0x00b1, B:29:0x00b7, B:30:0x00bf, B:32:0x00c7, B:34:0x00d5, B:36:0x0103, B:38:0x0109, B:40:0x011d, B:41:0x0125, B:43:0x0136, B:48:0x013f, B:59:0x016f, B:61:0x0181, B:63:0x0187, B:64:0x0190, B:66:0x01a6, B:68:0x01ac, B:70:0x01b4, B:71:0x01c2, B:73:0x01d1, B:74:0x01d7, B:76:0x01df, B:78:0x01e7, B:81:0x01fb, B:83:0x0217, B:85:0x021d, B:86:0x022a, B:88:0x0230, B:90:0x023c, B:92:0x0240, B:94:0x0246, B:95:0x0253, B:97:0x0259, B:99:0x0270, B:122:0x02bf, B:124:0x02cd, B:125:0x02d7, B:156:0x0397, B:173:0x03a2, B:178:0x0168, B:179:0x009c, B:127:0x02e2, B:129:0x02f8, B:131:0x0313, B:132:0x031b, B:134:0x0321, B:135:0x0323, B:137:0x0329, B:138:0x032f, B:140:0x0335, B:142:0x0345, B:144:0x0348, B:147:0x034b, B:149:0x0351, B:50:0x0149, B:52:0x014f, B:54:0x015e, B:57:0x0165), top: B:2:0x001f, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f8 A[Catch: all -> 0x0397, TryCatch #2 {all -> 0x0397, blocks: (B:127:0x02e2, B:129:0x02f8, B:131:0x0313, B:132:0x031b, B:134:0x0321, B:135:0x0323, B:137:0x0329, B:138:0x032f, B:140:0x0335, B:142:0x0345, B:144:0x0348, B:147:0x034b, B:149:0x0351), top: B:126:0x02e2, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Map<String, Object> map, int i) {
        String str;
        String str2;
        int i2;
        int i3;
        com.mbridge.msdk.preload.listenter.a aVar;
        String str3;
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> a2;
        Object obj;
        try {
            this.i = map;
            this.n = false;
            if (!map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                return;
            }
            String str4 = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (s.containsKey(((i + 1) % 2) + "_" + str4)) {
                if (!s.containsKey(i + "_" + str4)) {
                    return;
                }
            }
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            if (map.containsKey(MBridgeConstans.PREIMAGE)) {
                this.m = ((Boolean) map.get(MBridgeConstans.PREIMAGE)).booleanValue();
            }
            com.mbridge.msdk.click.a aVar2 = this.c;
            if (aVar2 == null) {
                this.c = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), str4);
            } else {
                aVar2.a(str4);
            }
            if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                this.h = ((Integer) map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)).intValue();
            }
            if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
                this.e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
            }
            if (t.containsKey(str4) && t.get(str4).booleanValue()) {
                Map<String, Map<Long, Object>> f = f();
                Map<Long, Object> map2 = f.get(i + "_" + str4);
                com.mbridge.msdk.setting.g f2 = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (map2 != null && map2.size() > 0) {
                    Long next = map2.keySet().iterator().next();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (f2 == null) {
                        f2 = i.b().a();
                    }
                    if (currentTimeMillis - next.longValue() >= f2.c0() * 1000) {
                        f.remove(str4);
                    } else if (i == 1) {
                        return;
                    }
                }
            }
            t.put(str4, Boolean.TRUE);
            this.p = 1;
            try {
                if (map.containsKey("ad_num")) {
                    int intValue = ((Integer) map.get("ad_num")).intValue();
                    this.p = intValue;
                    if (intValue < 1) {
                        this.p = 1;
                        intValue = 1;
                    }
                    if (intValue > 10) {
                        this.p = 10;
                    }
                }
            } catch (Exception unused) {
                q0.b(r, "ADNUM MUST BE INTEGER");
            }
            v.put(str4, Integer.valueOf(this.p));
            com.mbridge.msdk.preload.listenter.a aVar3 = (!map.containsKey(MBridgeConstans.PRELOAD_RESULT_LISTENER) || (obj = map.get(MBridgeConstans.PRELOAD_RESULT_LISTENER)) == null) ? null : new com.mbridge.msdk.preload.listenter.a((PreloadListener) obj);
            String b2 = com.mbridge.msdk.foundation.controller.c.n().b();
            String c2 = com.mbridge.msdk.foundation.controller.c.n().c();
            if (map.containsKey(MBridgeConstans.APP_ID) && map.containsKey("app_key") && map.containsKey(MBridgeConstans.KEY_WORD)) {
                b2 = (String) map.get(MBridgeConstans.APP_ID);
                c2 = (String) map.get("app_key");
            }
            a(b2, c2, str4);
            m e = i.b().e(b2, str4);
            this.d = e;
            if (e == null) {
                this.d = m.i(str4);
            }
            if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                str = (String) map.get(MBridgeConstans.PLACEMENT_ID);
            }
            str = "";
            String str5 = str;
            this.j = this.d.b();
            this.k = this.d.c();
            this.l = this.d.c();
            List<Integer> list = this.j;
            if (list == null || list.size() <= 0) {
                com.mbridge.msdk.preload.listenter.a aVar4 = aVar3;
                if (aVar4 != null) {
                    aVar4.onPreloadFaild("do not have sorceList");
                    return;
                }
                return;
            }
            this.f = new LinkedList();
            Iterator<Integer> it = this.j.iterator();
            while (it.hasNext()) {
                this.f.add(it.next());
            }
            List<Integer> list2 = this.l;
            if (list2 != null && list2.size() > 0) {
                this.g = new LinkedList();
                Iterator<Integer> it2 = this.l.iterator();
                while (it2.hasNext()) {
                    this.g.add(Long.valueOf(it2.next().intValue() * 1000));
                }
            }
            try {
                if (this.j.contains(1) && i == 0) {
                    try {
                        str2 = str4;
                        aVar = aVar3;
                    } catch (Exception unused2) {
                    }
                    try {
                        a(1, this.k.get(this.j.indexOf(1)).intValue() * 1000, i, this.d, str2, str5, false, aVar);
                        str5 = str5;
                        i2 = 1;
                        try {
                            a2 = com.mbridge.msdk.mbnative.cache.c.a(1);
                        } catch (Exception unused3) {
                        }
                    } catch (Exception unused4) {
                        str5 = str5;
                        i2 = 1;
                        i3 = 0;
                        str3 = str2;
                        a(i, this.d, str3, str5, aVar);
                        m mVar = this.d;
                        d().put(str3, Integer.valueOf(mVar == null ? mVar.y() * this.p : i2));
                        int i4 = MBMediaView.p0;
                        e.a(com.mbridge.msdk.foundation.controller.c.n().d(), str3);
                        o0.a();
                        if (TextUtils.isEmpty(str3)) {
                        }
                    }
                    if (a2 != null) {
                        i3 = 0;
                        try {
                            List<Campaign> a3 = a2.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str2, 0);
                            if (a3 != null && a3.size() > 0) {
                                a(true, aVar, (String) null);
                            }
                        } catch (Exception unused5) {
                        }
                        str3 = str2;
                        a(i, this.d, str3, str5, aVar);
                        m mVar2 = this.d;
                        d().put(str3, Integer.valueOf(mVar2 == null ? mVar2.y() * this.p : i2));
                        int i42 = MBMediaView.p0;
                        e.a(com.mbridge.msdk.foundation.controller.c.n().d(), str3);
                        o0.a();
                        if (TextUtils.isEmpty(str3)) {
                            com.mbridge.msdk.foundation.db.e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d())).d();
                            int a4 = a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
                            if (a4 <= 0) {
                                a4 = this.p;
                            }
                            List<Campaign> a5 = a(str3, a4);
                            if (a5 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i5 = i3; i5 < a5.size(); i5++) {
                                    CampaignEx campaignEx = (CampaignEx) a5.get(i5);
                                    if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                        arrayList.add(campaignEx);
                                    }
                                }
                                if (arrayList.size() > 0) {
                                    Object invoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                                    com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(invoke, com.mbridge.msdk.foundation.controller.c.n().d(), str3, new CopyOnWriteArrayList(arrayList), 1, null);
                                    com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(invoke, str3);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    i3 = 0;
                    str3 = str2;
                    a(i, this.d, str3, str5, aVar);
                    m mVar22 = this.d;
                    d().put(str3, Integer.valueOf(mVar22 == null ? mVar22.y() * this.p : i2));
                    int i422 = MBMediaView.p0;
                    e.a(com.mbridge.msdk.foundation.controller.c.n().d(), str3);
                    o0.a();
                    if (TextUtils.isEmpty(str3)) {
                    }
                }
                int i4222 = MBMediaView.p0;
                e.a(com.mbridge.msdk.foundation.controller.c.n().d(), str3);
                o0.a();
                if (TextUtils.isEmpty(str3)) {
                }
            } catch (Throwable unused6) {
                q0.b(r, "init cam cache failed");
                return;
            }
            str2 = str4;
            i2 = 1;
            i3 = 0;
            aVar = aVar3;
            str3 = str2;
            a(i, this.d, str3, str5, aVar);
            m mVar222 = this.d;
            d().put(str3, Integer.valueOf(mVar222 == null ? mVar222.y() * this.p : i2));
        } catch (Exception e2) {
            q0.b(r, com.mbridge.msdk.mbnative.common.a.a(e2));
        }
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
            return 0;
        } catch (Exception e) {
            q0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
            return 0;
        }
    }

    public List<Campaign> a(String str, int i) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> a2;
        m e = i.b().e("", str);
        this.d = e;
        if (e == null) {
            e = m.i(str);
            this.d = e;
        }
        List<Integer> b2 = e.b();
        this.j = b2;
        if (b2 == null || b2.size() <= 0 || !this.j.contains(1) || (a2 = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return a2.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, i);
    }

    public void a(int i, m mVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar) {
        Queue<Integer> queue = this.f;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int intValue = this.f.poll().intValue();
            long j = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.g;
            if (queue2 != null && queue2.size() > 0) {
                j = this.g.poll().longValue();
            }
            q0.c(r, "preload start queue adsource = " + intValue);
            a(intValue, j, str, str2, this.i, i, mVar, aVar);
        } catch (Throwable unused) {
            q0.b(r, "queue poll exception");
        }
    }

    public void a(int i, long j, String str, String str2, Map<String, Object> map, int i2, m mVar, com.mbridge.msdk.preload.listenter.a aVar) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> a2;
        List<Campaign> a3;
        if (i != 1 && (a2 = com.mbridge.msdk.mbnative.cache.c.a(i)) != null && (a3 = a2.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, this.p)) != null && a3.size() > 0) {
            a(true, aVar, (String) null);
            return;
        }
        if (i == 1) {
            a(i, j, i2, mVar, str, str2, true, aVar);
        } else if (i != 2) {
            a(i, j, i2, mVar, str, str2, aVar, false);
        } else {
            a(2, j, i2, mVar, str, str2, aVar, false);
        }
    }

    public static void a(int i, String str) {
        k kVar;
        if (u.containsKey(str)) {
            kVar = u.get(str);
        } else {
            kVar = new k();
        }
        int intValue = v.get(str).intValue();
        int intValue2 = d().containsKey(str) ? d().get(str).intValue() : 1;
        if (i == 1) {
            int a2 = kVar.a() + intValue;
            kVar.a(a2 <= intValue2 ? a2 : 0);
        } else if (i == 2) {
            int b2 = kVar.b() + intValue;
            kVar.b(b2 <= intValue2 ? b2 : 0);
        }
        u.put(str, kVar);
    }

    public void a(String str, int i, String str2, String str3, com.mbridge.msdk.preload.listenter.a aVar) {
        try {
            Queue<Integer> queue = this.f;
            if ((queue != null && queue.size() <= 0) || this.f == null) {
                a(false, aVar, str);
            } else {
                a(i, this.d, str2, str3, aVar);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3) {
        com.mbridge.msdk.setting.k kVar = this.b;
        if (kVar == null) {
            kVar = new com.mbridge.msdk.setting.k();
            this.b = kVar;
        }
        kVar.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, str3);
    }

    public void a(boolean z2, com.mbridge.msdk.preload.listenter.a aVar, String str) {
        if (z2) {
            if (aVar == null || aVar.a()) {
                return;
            }
            aVar.a(true);
            aVar.onPreloadSucceed();
            return;
        }
        if (aVar == null || aVar.a()) {
            return;
        }
        aVar.a(true);
        aVar.onPreloadFaild(str);
    }

    public void a(boolean z2, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z2 && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z2 && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    public void a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<CampaignEx> list, String str) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i = MBMediaView.p0;
                        Object invoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                        if (invoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(invoke, com.mbridge.msdk.foundation.controller.c.n().d(), str, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(invoke, str);
                        }
                    } catch (Exception unused) {
                        q0.b(r, "please import the videocommon aar");
                    }
                }
            } catch (Exception e) {
                q0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
            }
        }
    }
}
