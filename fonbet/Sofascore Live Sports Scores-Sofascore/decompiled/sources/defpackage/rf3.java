package defpackage;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class rf3 extends fjg {
    public final boolean d;

    public rf3(yz1 yz1Var, boolean z) {
        super(yz1Var, (byte) 0);
        this.d = z;
    }

    @Override // defpackage.fjg
    public final void j(byte b) {
        if (this.d) {
            o7k o7kVar = p7k.b;
            q(String.valueOf(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        } else {
            o7k o7kVar2 = p7k.b;
            o(String.valueOf(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
    }

    @Override // defpackage.fjg
    public final void m(int i) {
        if (this.d) {
            x7k x7kVar = y7k.b;
            q(Integer.toUnsignedString(i));
        } else {
            x7k x7kVar2 = y7k.b;
            o(Integer.toUnsignedString(i));
        }
    }

    @Override // defpackage.fjg
    public final void n(long j) {
        if (this.d) {
            d8k d8kVar = e8k.b;
            q(Long.toUnsignedString(j));
        } else {
            d8k d8kVar2 = e8k.b;
            o(Long.toUnsignedString(j));
        }
    }

    @Override // defpackage.fjg
    public final void p(short s) {
        if (this.d) {
            p8k p8kVar = q8k.b;
            q(String.valueOf(s & 65535));
        } else {
            p8k p8kVar2 = q8k.b;
            o(String.valueOf(s & 65535));
        }
    }
}
