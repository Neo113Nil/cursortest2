package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.impl.i;
import com.mbridge.msdk.video.signal.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.impl.m;
import com.mbridge.msdk.video.signal.impl.n;
import com.mbridge.msdk.video.signal.impl.o;
import com.mbridge.msdk.video.signal.impl.q;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b extends a {
    private Activity h;
    private WebView i;
    private MBridgeVideoView j;
    private MBridgeContainerView k;
    private CampaignEx l;
    private MBridgeBTContainer m;
    private a.InterfaceC1336a n;
    private String o;
    private List<CampaignEx> p;

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC1336a interfaceC1336a) {
        this.h = activity;
        this.i = webView;
        this.j = mBridgeVideoView;
        this.k = mBridgeContainerView;
        this.l = campaignEx;
        this.n = interfaceC1336a;
        this.o = mBridgeVideoView.getUnitId();
    }

    public void a(k kVar) {
        this.b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        com.mbridge.msdk.video.signal.b bVar = this.a;
        if (bVar != null) {
            return bVar;
        }
        i iVar = new i(webView);
        this.a = iVar;
        return iVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.k;
        if (mBridgeContainerView == null || (activity = this.h) == null) {
            return super.getIJSRewardVideoV1();
        }
        com.mbridge.msdk.video.signal.i iVar = this.f;
        if (iVar != null) {
            return iVar;
        }
        o oVar = new o(activity, mBridgeContainerView);
        this.f = oVar;
        return oVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.h == null || this.m == null) {
            return super.getJSBTModule();
        }
        c cVar = this.g;
        if (cVar != null) {
            return cVar;
        }
        j jVar = new j(this.h, this.m);
        this.g = jVar;
        return jVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.h;
        if (activity == null || (campaignEx = this.l) == null) {
            return super.getJSCommon();
        }
        if (this.b == null) {
            this.b = new k(activity, campaignEx);
        }
        if (this.l.getDynamicTempCode() == 5 && (list = this.p) != null) {
            d dVar = this.b;
            if (dVar instanceof k) {
                ((k) dVar).a(list);
            }
        }
        this.b.setActivity(this.h);
        this.b.setUnitId(this.o);
        this.b.a(this.n);
        return this.b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        f fVar = this.e;
        if (fVar != null) {
            return fVar;
        }
        m mVar = new m(mBridgeContainerView);
        this.e = mVar;
        return mVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        g gVar = this.d;
        if (gVar != null) {
            return gVar;
        }
        n nVar = new n(webView);
        this.d = nVar;
        return nVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        com.mbridge.msdk.video.signal.j jVar = this.c;
        if (jVar != null) {
            return jVar;
        }
        q qVar = new q(mBridgeVideoView);
        this.c = qVar;
        return qVar;
    }

    public void a(List<CampaignEx> list) {
        this.p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.h = activity;
        this.m = mBridgeBTContainer;
        this.i = webView;
    }

    public b(Activity activity) {
        this.h = activity;
    }
}
