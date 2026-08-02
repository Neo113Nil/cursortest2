package com.mbridge.msdk.video.module.listener.impl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class i extends f {
    protected com.mbridge.msdk.video.module.listener.a a;

    public i(com.mbridge.msdk.video.module.listener.a aVar) {
        this.a = aVar;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        com.mbridge.msdk.video.module.listener.a aVar = this.a;
        if (aVar != null) {
            aVar.a(i, obj);
        }
    }
}
