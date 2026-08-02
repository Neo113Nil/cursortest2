package com.mbridge.msdk.mbnative.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.List;

/* compiled from: APICache.java */
/* loaded from: classes13.dex */
public class a extends b<String, List<Campaign>> {
    private e a = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
    private int b;

    /* compiled from: APICache.java */
    /* renamed from: com.mbridge.msdk.mbnative.cache.a$a, reason: collision with other inner class name */
    public class RunnableC0291a implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ String b;

        public RunnableC0291a(List list, String str) {
            this.a = list;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.a.size(); i++) {
                CampaignEx campaignEx = (CampaignEx) this.a.get(i);
                campaignEx.setCacheLevel(1);
                a.this.a.a(campaignEx, this.b, 1);
            }
        }
    }

    public a(int i) {
        this.b = i;
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public List<Campaign> b(String str, int i) {
        List<CampaignEx> a = this.a.a(str, i, 2, this.b);
        if (a == null) {
            return null;
        }
        if (a(a, 2)) {
            this.a.a(str, 2, this.b);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        return arrayList;
    }

    public void a(List<CampaignEx> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx = list.get(i);
            campaignEx.setCacheLevel(2);
            this.a.a(campaignEx, str, 1);
        }
    }

    public boolean a(List<CampaignEx> list, int i) {
        long a;
        if (list != null && list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long timestamp = list.get(0).getTimestamp();
            if (i != 1) {
                a = i != 2 ? 0L : b();
            } else {
                a = a();
            }
            if (currentTimeMillis - timestamp > a) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public void a(String str, List<Campaign> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        this.a.a(str, 1, this.b, false);
        this.a.a(str, 2, this.b, false);
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx = (CampaignEx) list.get(i);
            campaignEx.setCacheLevel(1);
            this.a.a(campaignEx, str, 1);
        }
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public void a(String str, List<Campaign> list, String str2) {
        boolean z = !TextUtils.isEmpty(str2);
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        this.a.a(str, 1, this.b, z);
        this.a.a(str, 2, this.b, z);
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0291a(list, str));
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public List<Campaign> a(String str, int i) {
        List<CampaignEx> a = this.a.a(str, i, 1, this.b);
        if (a == null) {
            return null;
        }
        if (a(a, 1)) {
            a(a, str);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        return arrayList;
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public void a(String str, Campaign campaign, String str2) {
        boolean z = !TextUtils.isEmpty(str2);
        if (campaign == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (this.a.a(campaignEx.getId(), campaignEx.getTab(), str, campaignEx.getCacheLevel(), campaignEx.getType(), z)) {
                this.a.a(campaignEx.getId(), str, campaignEx.getCacheLevel(), this.b, z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
