package com.vungle.ads.internal;

import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k2 extends w1 {
    public final /* synthetic */ ServiceLocator b;

    public k2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        return FilePreferences.d.a(((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.b.a(com.vungle.ads.internal.executor.a.class))).a, (PathProvider) this.b.a(PathProvider.class), "settings_vungle");
    }
}
