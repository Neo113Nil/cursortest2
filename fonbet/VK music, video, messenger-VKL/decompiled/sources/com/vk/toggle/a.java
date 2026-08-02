package com.vk.toggle;

import com.vk.toggle.b;
import xsna.bpn0;
import xsna.j55;
import xsna.k55;
import xsna.knf;
import xsna.lnf;
import xsna.r12;
import xsna.s12;
import xsna.tog;
import xsna.u94;
import xsna.v94;
import xsna.w94;

/* compiled from: DefaultNetworkTogglesProvider.kt */
/* loaded from: classes11.dex */
public final class a implements f {
    public final bpn0 a = new bpn0(new knf(4));
    public final bpn0 b = new bpn0(new lnf(3));
    public final bpn0 c = new bpn0(new r12(4));
    public final bpn0 d = new bpn0(new s12(3));
    public final bpn0 e = new bpn0(new tog(3));
    public final bpn0 f = new bpn0(new j55(5));
    public final bpn0 g = new bpn0(new k55(4));
    public final bpn0 h = new bpn0(new u94(5));
    public final bpn0 i = new bpn0(new v94(5));
    public final bpn0 j = new bpn0(new w94(6));

    @Override // com.vk.toggle.f
    public final b.d a() {
        return (b.d) this.j.getValue();
    }

    @Override // com.vk.toggle.f
    public final b.d b() {
        return (b.d) this.e.getValue();
    }

    @Override // com.vk.toggle.f
    public final b.d c() {
        return (b.d) this.a.getValue();
    }

    @Override // com.vk.toggle.f
    public final b.d d() {
        return (b.d) this.c.getValue();
    }

    @Override // com.vk.toggle.f
    public final b.d e() {
        return (b.d) this.h.getValue();
    }

    @Override // com.vk.toggle.f
    public final b.d f() {
        return (b.d) this.i.getValue();
    }

    @Override // com.vk.toggle.f
    public final b.d g() {
        return (b.d) this.b.getValue();
    }

    @Override // com.vk.toggle.f
    public final b.d getApiConfig() {
        return (b.d) this.d.getValue();
    }

    @Override // com.vk.toggle.f
    public final b.d getNetworkType() {
        return (b.d) this.f.getValue();
    }

    @Override // com.vk.toggle.f
    public final b.d h() {
        return (b.d) this.g.getValue();
    }
}
