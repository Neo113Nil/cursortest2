package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RewardVideoCampaignState.java */
/* loaded from: classes14.dex */
public class d {
    private CopyOnWriteArrayList<CampaignEx> a;
    private CampaignEx b;
    private boolean c = false;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.a = copyOnWriteArrayList;
    }

    public CopyOnWriteArrayList<CampaignEx> b() {
        return this.a;
    }

    public int c() {
        return this.g;
    }

    public int d() {
        return this.f;
    }

    public boolean e() {
        return this.c;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.b = campaignEx;
            this.d = campaignEx.getSecondRequestIndex();
            this.e = campaignEx.getSecondShowIndex();
            this.f = campaignEx.getFilterCallBackState();
            this.h = campaignEx.getFilterAdsShowCallState();
            this.g = campaignEx.getFilterAdsVideoCallState();
        }
    }

    public boolean a() {
        return this.d == 1 && this.c;
    }
}
