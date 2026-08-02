package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.q0;
import xsna.cgn;
import xsna.odj;

/* compiled from: DefaultJSContainerModule.java */
/* loaded from: classes14.dex */
public class e implements com.mbridge.msdk.video.signal.f, com.mbridge.msdk.video.signal.h {
    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        q0.a("DefaultJSContainerModule", "endCardShowing");
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        q0.a("DefaultJSContainerModule", "hideAlertWebview ,msg=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        q0.a("DefaultJSContainerModule", "ivRewardAdsWithoutVideo,params=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        q0.a("DefaultJSContainerModule", "miniCardShowing");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i) {
        q0.a("DefaultJSContainerModule", "readyStatus:isReady=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i, int i2, int i3) {
        StringBuilder a = odj.a(i, i2, "showMiniCard width = ", " height = ", " radius = ");
        a.append(i3);
        q0.a("DefaultJSContainerModule", a.toString());
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        q0.a("DefaultJSContainerModule", "showAlertWebView ,msg=");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i) {
        q0.a("DefaultJSContainerModule", "showEndcard,type=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        StringBuilder a = odj.a(i, i2, "showMiniCard top = ", " left = ", " width = ");
        cgn.a(i3, i4, " height = ", " radius = ", a);
        a.append(i5);
        q0.a("DefaultJSContainerModule", a.toString());
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i) {
        q0.a("DefaultJSContainerModule", "showVideoClickView:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        q0.a("DefaultJSContainerModule", "showVideoEndCover");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i, int i2, int i3) {
    }
}
