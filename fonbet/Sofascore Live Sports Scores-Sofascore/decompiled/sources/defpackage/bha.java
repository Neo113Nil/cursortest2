package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class bha extends o4 {
    public final a f;
    public final int g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bha(yea yeaVar, a aVar) {
        super(yeaVar, null);
        yeaVar.getClass();
        this.f = aVar;
        this.g = aVar.a.size();
        this.h = -1;
    }

    @Override // defpackage.o4
    public final b F(String str) {
        str.getClass();
        return (b) this.f.a.get(Integer.parseInt(str));
    }

    @Override // defpackage.o4
    public final String R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.o4
    public final b T() {
        return this.f;
    }

    @Override // defpackage.uf3
    public final int o(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
