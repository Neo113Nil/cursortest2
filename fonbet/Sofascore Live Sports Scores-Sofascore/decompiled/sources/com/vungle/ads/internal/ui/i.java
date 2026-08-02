package com.vungle.ads.internal.ui;

import android.view.MotionEvent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i implements com.vungle.ads.internal.ui.view.h {
    public final /* synthetic */ l a;

    public i(l lVar) {
        this.a = lVar;
    }

    @Override // com.vungle.ads.internal.ui.view.h
    public final boolean onTouch(MotionEvent motionEvent) {
        com.vungle.ads.internal.presenter.r rVar = this.a.a;
        if (rVar == null) {
            return false;
        }
        rVar.a(motionEvent);
        return false;
    }
}
