package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.e;
import com.mbridge.msdk.video.signal.impl.h;
import com.mbridge.msdk.video.signal.j;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a implements IJSFactory {
    protected com.mbridge.msdk.video.signal.b a;
    protected d b;
    protected j c;
    protected g d;
    protected f e;
    protected i f;
    protected c g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        com.mbridge.msdk.video.signal.b bVar = this.a;
        if (bVar != null) {
            return bVar;
        }
        com.mbridge.msdk.video.signal.impl.b bVar2 = new com.mbridge.msdk.video.signal.impl.b();
        this.a = bVar2;
        return bVar2;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        i iVar = this.f;
        if (iVar != null) {
            return iVar;
        }
        com.mbridge.msdk.video.signal.impl.g gVar = new com.mbridge.msdk.video.signal.impl.g();
        this.f = gVar;
        return gVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar;
        }
        com.mbridge.msdk.video.signal.impl.c cVar2 = new com.mbridge.msdk.video.signal.impl.c();
        this.g = cVar2;
        return cVar2;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        d dVar = this.b;
        if (dVar != null) {
            return dVar;
        }
        com.mbridge.msdk.video.signal.impl.d dVar2 = new com.mbridge.msdk.video.signal.impl.d();
        this.b = dVar2;
        return dVar2;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e();
        this.e = eVar;
        return eVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        g gVar = this.d;
        if (gVar != null) {
            return gVar;
        }
        com.mbridge.msdk.video.signal.impl.f fVar = new com.mbridge.msdk.video.signal.impl.f();
        this.d = fVar;
        return fVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        j jVar = this.c;
        if (jVar != null) {
            return jVar;
        }
        h hVar = new h();
        this.c = hVar;
        return hVar;
    }
}
