package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.e1d;
import defpackage.n55;
import defpackage.yda;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c implements n55 {
    public final /* synthetic */ List a;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j b;
    public final /* synthetic */ e1d c;

    public c(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j jVar, e1d e1dVar) {
        this.a = list;
        this.b = jVar;
        this.c = e1dVar;
    }

    @Override // defpackage.n55
    public final void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yda) it.next()).e(null);
        }
        this.b.destroy();
        ((Function1) this.c.getValue()).invoke(Boolean.FALSE);
    }
}
