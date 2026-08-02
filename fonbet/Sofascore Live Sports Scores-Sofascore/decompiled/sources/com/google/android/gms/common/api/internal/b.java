package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.base.zao;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b implements BackgroundDetector.BackgroundStateChangeListener {
    public final /* synthetic */ GoogleApiManager a;

    public b(GoogleApiManager googleApiManager) {
        this.a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        zao zaoVar = this.a.n;
        zaoVar.sendMessage(zaoVar.obtainMessage(1, valueOf));
    }
}
