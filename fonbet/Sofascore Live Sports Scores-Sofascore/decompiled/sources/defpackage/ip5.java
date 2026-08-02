package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ip5 extends uye {
    public final p5h m;
    public final mqi n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip5(String str, int i) {
        super(str, null, i);
        str.getClass();
        this.m = p5h.f;
        this.n = ypa.b(new hp5(i, str, this));
    }

    @Override // defpackage.uye
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.getKind() == p5h.f && Intrinsics.c(this.a, serialDescriptor.h()) && Intrinsics.c(s9a.m(this), s9a.m(serialDescriptor));
    }

    @Override // defpackage.uye, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i) {
        return ((SerialDescriptor[]) this.n.getValue())[i];
    }

    @Override // defpackage.uye, kotlinx.serialization.descriptors.SerialDescriptor
    public final mha getKind() {
        return this.m;
    }

    @Override // defpackage.uye
    public final int hashCode() {
        int hashCode = this.a.hashCode();
        r4 r4Var = new r4(this);
        int i = 1;
        while (r4Var.hasNext()) {
            int i2 = i * 31;
            String str = (String) r4Var.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // defpackage.uye
    public final String toString() {
        return CollectionsKt.f0(new nh0(this, 4), ", ", lnb.q(new StringBuilder(), this.a, '('), ")", null, 56);
    }
}
