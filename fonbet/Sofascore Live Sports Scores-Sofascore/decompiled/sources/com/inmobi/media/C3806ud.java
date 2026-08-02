package com.inmobi.media;

import android.content.ComponentName;
import android.content.Intent;
import defpackage.dmi;
import defpackage.fc6;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ud, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3806ud implements Ya {
    public final /* synthetic */ C3858wd a;

    public C3806ud(C3858wd c3858wd) {
        this.a = c3858wd;
    }

    @Override // com.inmobi.media.Ya
    public final void a() {
        InterfaceC3880x9 interfaceC3880x9 = this.a.a.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("PublisherViewClickHandler", "User left application");
        }
        AbstractC3456h abstractC3456h = (AbstractC3456h) this.a.a.f;
        abstractC3456h.getClass();
        Bj bj = ((Nc) abstractC3456h).c;
        Mi mi = bj instanceof Mi ? (Mi) bj : null;
        if (mi != null) {
            InterfaceC3880x9 l = mi.l();
            if (l != null) {
                ((C3906y9) l).a("AUM-RenderedState", "onUserLeftApplication");
            }
            X4.a(mi.k(), new Li(mi, null));
        }
    }

    @Override // com.inmobi.media.Ya
    public final void a(String str, Map map) {
        str.getClass();
        map.getClass();
    }

    @Override // com.inmobi.media.Ya
    public final void a(String str, String str2, String str3) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a.a.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("PublisherViewClickHandler", fc6.n("Landing page error: ", str2, " ", str3));
        }
    }

    @Override // com.inmobi.media.Ya
    public final void a(Intent intent) {
        intent.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a.a.g;
        if (interfaceC3880x9 != null) {
            ComponentName component = intent.getComponent();
            ((C3906y9) interfaceC3880x9).a("PublisherViewClickHandler", dmi.q("Starting activity: ", component != null ? component.getClassName() : null));
        }
        this.a.a(intent);
    }

    @Override // com.inmobi.media.Ya
    public final void b(String str, String str2, String str3) {
    }
}
