package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.ma4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class CustomUiOptionsImpl implements ma4 {
    private boolean skippableSupport = false;
    private boolean aboutThisAdSupport = false;

    @Override // defpackage.ma4
    public boolean getAboutThisAdSupport() {
        return this.aboutThisAdSupport;
    }

    @Override // defpackage.ma4
    public boolean getSkippableSupport() {
        return this.skippableSupport;
    }

    public void setAboutThisAdSupport(boolean z) {
        this.aboutThisAdSupport = z;
    }

    public void setSkippableSupport(boolean z) {
        this.skippableSupport = z;
    }
}
