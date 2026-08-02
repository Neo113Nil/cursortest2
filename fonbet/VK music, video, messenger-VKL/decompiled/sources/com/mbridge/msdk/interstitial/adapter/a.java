package com.mbridge.msdk.interstitial.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.controller.a;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.m;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: IntersAdapter.java */
/* loaded from: classes13.dex */
public class a {
    private Context a;
    private String b;
    private String c;
    private int d;
    private boolean e;
    private int f;
    private String g;
    private a.b h;
    private m i;
    private Handler j;

    /* compiled from: IntersAdapter.java */
    /* renamed from: com.mbridge.msdk.interstitial.adapter.a$a, reason: collision with other inner class name */
    public class HandlerC0281a extends Handler {
        public HandlerC0281a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            Object obj2;
            try {
                int i = message.what;
                if (i == 3) {
                    if (a.this.h == null || (obj = message.obj) == null || !(obj instanceof String)) {
                        return;
                    }
                    a.this.h.b(a.this.e, (String) obj);
                    return;
                }
                if (i == 4 && a.this.h != null && (obj2 = message.obj) != null && (obj2 instanceof String)) {
                    a.this.h.a(a.this.e, (String) obj2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: IntersAdapter.java */
    public class b extends com.mbridge.msdk.interstitial.request.b {
        public b() {
        }

        @Override // com.mbridge.msdk.interstitial.request.b
        public void a(CampaignUnit campaignUnit) {
            try {
                a.this.a(campaignUnit);
            } catch (Exception e) {
                e.printStackTrace();
                a.this.b("can't show because unknow error");
                a.this.m();
            }
        }

        @Override // com.mbridge.msdk.interstitial.request.b
        public void b(int i, String str) {
            q0.b("IntersAdapter", str);
            a.this.b(str);
            a.this.m();
        }
    }

    /* compiled from: IntersAdapter.java */
    public class c extends c.a {
        final /* synthetic */ CampaignEx a;
        final /* synthetic */ Context b;

        public c(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.a = campaignEx;
            this.b = context;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(str, cVar, this.a, this.b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
    }

    /* compiled from: IntersAdapter.java */
    public class d implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ List b;

        public d(List list, List list2) {
            this.a = list;
            this.b = list2;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.a;
            if (list == null || list.size() <= 0) {
                a.this.b("no ads available");
            } else {
                a aVar = a.this;
                aVar.a(aVar.b, (List<CampaignEx>) a.this.a((List<CampaignEx>) this.a));
                CampaignEx campaignEx = (CampaignEx) this.a.get(0);
                a.this.c(campaignEx != null ? campaignEx.getRequestId() : "");
            }
            j.a(g.a(a.this.a)).d();
            List list2 = this.b;
            if (list2 == null || list2.size() <= 0) {
                return;
            }
            a.this.c((List<CampaignEx>) this.b);
        }
    }

    public a(Context context, String str, String str2, String str3, boolean z) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.g = str3;
        this.e = z;
        m e = i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str);
        this.i = e;
        if (e == null) {
            this.i = m.h(this.b);
        }
        i();
    }

    private int g() {
        try {
            Map<String, Integer> map = com.mbridge.msdk.interstitial.controller.a.q;
            int intValue = (TextUtils.isEmpty(this.b) || map == null || !map.containsKey(this.b)) ? 1 : map.get(this.b).intValue();
            if (intValue <= 0) {
                return 1;
            }
            return intValue;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    private String h() {
        try {
            return !TextUtils.isEmpty(com.mbridge.msdk.interstitial.controller.a.o) ? com.mbridge.msdk.interstitial.controller.a.o : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private void i() {
        this.j = new HandlerC0281a(Looper.getMainLooper());
    }

    private e l() {
        String b2 = com.mbridge.msdk.foundation.controller.c.n().b();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.n().b() + com.mbridge.msdk.foundation.controller.c.n().c());
        int i = this.e ? 3 : 2;
        this.f = 1;
        if (this.i.e() > 0) {
            this.f = this.i.e();
        }
        int f = this.i.f() > 0 ? this.i.f() : 1;
        String a = com.mbridge.msdk.foundation.same.buffer.b.a(this.b, "interstitial");
        this.d = b();
        String h = h();
        if (TextUtils.isEmpty(this.g)) {
            this.g = "0";
        }
        e eVar = new e();
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "app_id", b2);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
        if (!TextUtils.isEmpty(this.c)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.c);
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "category", this.g);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "req_type", i + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_num", f + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "tnum", this.f + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, e.g, a);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, e.h, c());
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, e.i, h);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_type", "279");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, SignalingProtocol.KEY_OFFSET, this.d + "");
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            if (TextUtils.isEmpty(this.b)) {
                return;
            }
            com.mbridge.msdk.interstitial.controller.a.a(this.b, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void n() {
        try {
            this.d += this.f;
            if (this.d > g()) {
                this.d = 0;
            }
            if (TextUtils.isEmpty(this.b)) {
                return;
            }
            com.mbridge.msdk.interstitial.controller.a.a(this.b, this.d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean f() {
        return this.e;
    }

    public void j() {
        if (this.a == null) {
            b("context is null");
            return;
        }
        if (TextUtils.isEmpty(this.b)) {
            b("unitid is null");
            return;
        }
        m mVar = this.i;
        if (mVar == null) {
            b("unitSetting is null please call load");
            return;
        }
        if (mVar.f() <= 0) {
            b("controller don't request ad");
            return;
        }
        a();
        List<CampaignEx> e = e();
        if (e == null || e.size() <= 0) {
            k();
        } else {
            CampaignEx campaignEx = e.get(0);
            c(campaignEx != null ? campaignEx.getRequestId() : "");
        }
    }

    public void k() {
        try {
            if (this.a == null) {
                b("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.b)) {
                b("unitid is null");
                return;
            }
            if (this.i == null) {
                b("unitSetting is null please call load");
                return;
            }
            e l = l();
            if (l == null) {
                b("request parameter is null");
                return;
            }
            String d2 = v0.d(this.b);
            if (!TextUtils.isEmpty(d2)) {
                l.a(com.mbridge.msdk.foundation.same.report.j.b, d2);
            }
            com.mbridge.msdk.interstitial.request.a aVar = new com.mbridge.msdk.interstitial.request.a(this.a);
            b bVar = new b();
            bVar.setUnitId(this.b);
            bVar.setPlacementId(this.c);
            bVar.setAdType(279);
            aVar.choiceV3OrV5BySetting(1, l, bVar, "", ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
        } catch (Exception e) {
            e.printStackTrace();
            b("can't show because unknow error");
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (this.j != null) {
            Message obtain = Message.obtain();
            obtain.obj = str;
            obtain.what = 3;
            this.j.sendMessage(obtain);
        }
    }

    private List<CampaignEx> e() {
        try {
            if (com.mbridge.msdk.interstitial.cache.a.a() != null) {
                return com.mbridge.msdk.interstitial.cache.a.a().a(this.b, 1);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public CampaignEx d() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(this.b)) {
            return null;
        }
        a();
        List<CampaignEx> e2 = e();
        if (e2 != null && e2.size() > 0) {
            for (int i = 0; i < e2.size(); i++) {
                CampaignEx campaignEx = e2.get(i);
                if (campaignEx != null && (!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || !TextUtils.isEmpty(campaignEx.getMraid()))) {
                    return campaignEx;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            if (this.j != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 4;
                this.j.sendMessage(obtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list) {
        if (com.mbridge.msdk.interstitial.cache.a.a() != null) {
            com.mbridge.msdk.interstitial.cache.a.a().a(str, list);
        }
    }

    private String c() {
        String str;
        str = "";
        try {
            JSONArray b2 = v0.b(this.a, this.b);
            str = b2.length() > 0 ? v0.a(b2) : "";
            q0.c("IntersAdapter", "get excludes:" + str);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private void a() {
        try {
            if (com.mbridge.msdk.interstitial.cache.a.a() != null) {
                com.mbridge.msdk.setting.g f = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (f == null) {
                    f = i.b().a();
                }
                com.mbridge.msdk.interstitial.cache.a.a().a(f.c0() * 1000, this.b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<CampaignEx> b(List<CampaignEx> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int e = this.i.e();
                    for (int i = 0; i < list.size() && i < this.f && arrayList.size() < e; i++) {
                        CampaignEx campaignEx = list.get(i);
                        int i2 = 1;
                        if ((campaignEx == null || campaignEx.getOfferType() != 1 || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) && campaignEx != null && ((!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || campaignEx.isMraid()) && campaignEx.getOfferType() != 99)) {
                            if (v0.c(campaignEx)) {
                                if (!v0.c(this.a, campaignEx.getPackageName())) {
                                    i2 = 2;
                                }
                                campaignEx.setRtinsType(i2);
                            }
                            if (com.mbridge.msdk.foundation.same.c.b(this.a, campaignEx)) {
                                arrayList.add(campaignEx);
                            } else {
                                v0.a(this.b, campaignEx, com.mbridge.msdk.foundation.same.a.x);
                            }
                            a(campaignEx, null, this.a, null);
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<CampaignEx> list) {
        if (this.a == null || list == null || list.size() == 0) {
            return;
        }
        j a = j.a(g.a(this.a));
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx = list.get(i);
            if (campaignEx != null && a != null && !a.a(campaignEx.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx.getId());
                gVar.b(campaignEx.getFca());
                gVar.c(campaignEx.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                a.b(gVar);
            }
        }
    }

    public void a(a.b bVar) {
        this.h = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit) {
        if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
            ArrayList<CampaignEx> ads = campaignUnit.getAds();
            List<CampaignEx> b2 = b(ads);
            a(campaignUnit.getSessionId());
            n();
            a(ads, b2);
            return;
        }
        b("no server ads available");
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.a, cVar, new c(campaignEx, context, aVar));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void a(List<CampaignEx> list, List<CampaignEx> list2) {
        new Thread(new d(list2, list)).start();
    }

    private int b() {
        int i = 0;
        try {
            int a = !TextUtils.isEmpty(this.b) ? com.mbridge.msdk.interstitial.controller.a.a(this.b) : 0;
            if (a <= g()) {
                i = a;
            }
            q0.c("IntersAdapter", "getCurrentOffset:" + i);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<CampaignEx> a(List<CampaignEx> list) {
        FileOutputStream fileOutputStream;
        File file;
        File file2;
        ArrayList arrayList = new ArrayList(list.size());
        for (CampaignEx campaignEx : list) {
            if (campaignEx.isMraid() && !TextUtils.isEmpty(campaignEx.getMraid())) {
                com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx, "", this.b, CampaignEx.CLICKMODE_ON);
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        String b2 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                        String md5 = SameMD5.getMD5(c1.b(campaignEx.getMraid()));
                        if (TextUtils.isEmpty(md5)) {
                            md5 = String.valueOf(System.currentTimeMillis());
                        }
                        file2 = new File(b2, md5.concat(".html"));
                        fileOutputStream = new FileOutputStream(file2);
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    String b3 = com.mbridge.msdk.setting.util.a.a().b();
                    if (!TextUtils.isEmpty(b3)) {
                        sb.append("<script>");
                        sb.append(b3);
                        sb.append("</script>");
                    }
                    sb.append(campaignEx.getMraid());
                    fileOutputStream.write(sb.toString().getBytes());
                    fileOutputStream.flush();
                    campaignEx.setMraid(file2.getAbsolutePath());
                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, "", this.b, CampaignEx.CLICKMODE_ON);
                    try {
                        fileOutputStream.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    campaignEx.setMraid("");
                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e.getMessage(), this.b, CampaignEx.CLICKMODE_ON);
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    file = new File(campaignEx.getMraid());
                    if (file.exists()) {
                    }
                    b("mraid resource write fail");
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
                file = new File(campaignEx.getMraid());
                if (file.exists() || !file.isFile() || !file.canRead()) {
                    b("mraid resource write fail");
                }
            }
            arrayList.add(campaignEx);
        }
        return arrayList;
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        q0.c("IntersAdapter", "onload sessionId:" + str);
        com.mbridge.msdk.interstitial.controller.a.o = str;
    }
}
