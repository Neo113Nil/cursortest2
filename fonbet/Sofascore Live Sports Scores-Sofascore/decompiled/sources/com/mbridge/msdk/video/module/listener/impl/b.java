package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b extends d {
    private MBridgeVideoView n;
    private MBridgeContainerView o;

    public b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        this.n = mBridgeVideoView;
        this.o = mBridgeContainerView;
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.d, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i, Object obj) {
        if (this.a) {
            if (i == 8) {
                MBridgeContainerView mBridgeContainerView = this.o;
                if (mBridgeContainerView != null) {
                    boolean showAlertWebView = mBridgeContainerView.showAlertWebView();
                    MBridgeVideoView mBridgeVideoView = this.n;
                    if (showAlertWebView) {
                        if (mBridgeVideoView != null) {
                            mBridgeVideoView.alertWebViewShowed();
                        }
                    } else if (mBridgeVideoView != null) {
                        mBridgeVideoView.showAlertView();
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView2 = this.n;
                    if (mBridgeVideoView2 != null) {
                        mBridgeVideoView2.showAlertView();
                    }
                }
            } else if (i == 107) {
                this.o.showVideoClickView(-1);
                this.n.setCover(false);
                this.n.setMiniEndCardState(false);
                this.n.videoOperate(1);
            } else if (i == 112) {
                this.n.setCover(true);
                this.n.setMiniEndCardState(true);
                this.n.videoOperate(2);
            } else if (i == 115) {
                this.o.resizeMiniCard(this.n.getBorderViewWidth(), this.n.getBorderViewHeight(), this.n.getBorderViewRadius());
            }
        }
        super.a(i, obj);
    }
}
