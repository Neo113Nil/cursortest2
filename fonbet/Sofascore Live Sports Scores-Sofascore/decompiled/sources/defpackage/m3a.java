package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class m3a extends uye {
    public final boolean m;

    public m3a(String str, n3a n3aVar) {
        super(str, n3aVar, 1);
        this.m = true;
    }

    @Override // defpackage.uye
    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof m3a) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.c(this.a, serialDescriptor.h())) {
                m3a m3aVar = (m3a) obj;
                if (m3aVar.m && Arrays.equals((SerialDescriptor[]) this.k.getValue(), (SerialDescriptor[]) m3aVar.k.getValue())) {
                    int d = serialDescriptor.d();
                    int i2 = this.c;
                    if (i2 == d) {
                        for (0; i < i2; i + 1) {
                            i = (Intrinsics.c(g(i).h(), serialDescriptor.g(i).h()) && Intrinsics.c(g(i).getKind(), serialDescriptor.g(i).getKind())) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.uye
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.m;
    }
}
