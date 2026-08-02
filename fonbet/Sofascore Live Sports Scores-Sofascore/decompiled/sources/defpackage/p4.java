package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class p4 extends k53 {
    public final /* synthetic */ int o = 1;
    public final /* synthetic */ tga p;
    public final /* synthetic */ String q;
    public final Object r;

    public p4(tga tgaVar, String str) {
        this.p = tgaVar;
        this.q = str;
        this.r = tgaVar.b.b;
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public void B(int i) {
        switch (this.o) {
            case 1:
                x7k x7kVar = y7k.b;
                C0(Integer.toUnsignedString(i));
                break;
            default:
                super.B(i);
                break;
        }
    }

    public void C0(String str) {
        str.getClass();
        this.p.N(this.q, new dga(str, false, null));
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public void F(String str) {
        switch (this.o) {
            case 0:
                str.getClass();
                this.p.N(this.q, new dga(str, false, (SerialDescriptor) this.r));
                break;
            default:
                super.F(str);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final p5c a() {
        switch (this.o) {
            case 0:
                return this.p.b.b;
            default:
                return (p5c) this.r;
        }
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public void g(byte b) {
        switch (this.o) {
            case 1:
                o7k o7kVar = p7k.b;
                C0(String.valueOf(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                break;
            default:
                super.g(b);
                break;
        }
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public void m(long j) {
        switch (this.o) {
            case 1:
                d8k d8kVar = e8k.b;
                C0(Long.toUnsignedString(j));
                break;
            default:
                super.m(j);
                break;
        }
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public void r(short s) {
        switch (this.o) {
            case 1:
                p8k p8kVar = q8k.b;
                C0(String.valueOf(s & 65535));
                break;
            default:
                super.r(s);
                break;
        }
    }

    public p4(tga tgaVar, String str, SerialDescriptor serialDescriptor) {
        this.p = tgaVar;
        this.q = str;
        this.r = serialDescriptor;
    }
}
