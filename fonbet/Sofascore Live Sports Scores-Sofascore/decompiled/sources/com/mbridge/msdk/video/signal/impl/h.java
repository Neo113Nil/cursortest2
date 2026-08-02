package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.q0;
import defpackage.lnb;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class h implements com.mbridge.msdk.video.signal.j {
    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        q0.a("DefaultJSVideoModule", "alertWebViewShowed:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i, int i2) {
        q0.a("DefaultJSVideoModule", "closeOperte:close=" + i + "closeViewVisible=" + i2);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        q0.a("DefaultJSVideoModule", "dismissAllAlert");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        q0.a("DefaultJSVideoModule", "getCurrentProgress");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i) {
        q0.a("DefaultJSVideoModule", "hideAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i) {
        q0.a("DefaultJSVideoModule", "notifyCloseBtn:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i) {
        q0.a("DefaultJSVideoModule", "progressBarOperate:progressViewVisible=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i, int i2) {
        q0.a("DefaultJSVideoModule", "progressOperate:progress=" + i + "progressViewVisible=" + i2);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z) {
        q0.a("DefaultJSVideoModule", "setCover:" + z);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z) {
        q0.a("DefaultJSVideoModule", "setMiniEndCardState");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i) {
        q0.a("DefaultJSVideoModule", "setScaleFitXY:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i) {
        q0.a("DefaultJSVideoModule", "setVisible:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        q0.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        q0.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        StringBuilder s = lnb.s(i, i2, "showVideoLocation:marginTop=", ",marginLeft=", ",width=");
        me4.q(s, i3, ",height=", i4, ",radius=");
        me4.q(s, i5, ",borderTop=", i6, ",borderTop=");
        me4.q(s, i6, ",borderLeft=", i7, ",borderWidth=");
        s.append(i8);
        s.append(",borderHeight=");
        s.append(i9);
        q0.a("DefaultJSVideoModule", s.toString());
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i, int i2) {
        q0.a("DefaultJSVideoModule", "soundOperate:mute=" + i + ",soundViewVisible=" + i2);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i) {
        q0.a("DefaultJSVideoModule", "videoOperate:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i, int i2, String str) {
        StringBuilder s = lnb.s(i, i2, "soundOperate:mute=", ",soundViewVisible=", ",pt=");
        s.append(str);
        q0.a("DefaultJSVideoModule", s.toString());
    }
}
