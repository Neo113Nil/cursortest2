package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class sga extends o4 {
    public final b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sga(yea yeaVar, b bVar, String str) {
        super(yeaVar, str);
        yeaVar.getClass();
        bVar.getClass();
        this.f = bVar;
        this.a.add("primitive");
    }

    @Override // defpackage.o4
    public final b F(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f;
        }
        a70.p("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.o4
    public final b T() {
        return this.f;
    }

    @Override // defpackage.uf3
    public final int o(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return 0;
    }
}
