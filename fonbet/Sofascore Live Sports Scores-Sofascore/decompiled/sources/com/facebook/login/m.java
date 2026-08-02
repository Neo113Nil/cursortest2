package com.facebook.login;

import defpackage.ne4;
import defpackage.qe4;
import defpackage.u53;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements ne4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ne4
    public qe4 createDataSource() {
        int i = this.a;
        Object obj = this.c;
        String str = (String) this.b;
        switch (i) {
            case 1:
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(str, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j) ((u53) obj).c);
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h) obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(str, hVar.c);
                hVar.q = fVar;
                return fVar;
        }
    }
}
