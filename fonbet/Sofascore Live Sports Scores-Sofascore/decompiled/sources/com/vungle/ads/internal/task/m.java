package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.ypa;
import defpackage.ysa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m implements d {
    public final Context a;

    public m(Context context, PathProvider pathProvider) {
        context.getClass();
        pathProvider.getClass();
        this.a = context;
    }

    @Override // com.vungle.ads.internal.task.d
    public final int a(Bundle bundle, h hVar) {
        bundle.getClass();
        hVar.getClass();
        ((com.vungle.ads.internal.network.r) ypa.a(ysa.a, new l(this.a)).getValue()).b();
        return 0;
    }
}
