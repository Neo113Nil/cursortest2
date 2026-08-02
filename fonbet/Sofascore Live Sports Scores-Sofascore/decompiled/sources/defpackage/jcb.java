package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class jcb implements SerialDescriptor {
    public final SerialDescriptor a;

    public jcb(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        a70.p(dmi.y(str, " is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcb)) {
            return false;
        }
        jcb jcbVar = (jcb) obj;
        return Intrinsics.c(this.a, jcbVar.a) && Intrinsics.c(h(), jcbVar.h());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i) {
        if (i >= 0) {
            return km5.a;
        }
        i3c.o(lnb.t(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i) {
        if (i >= 0) {
            return this.a;
        }
        i3c.o(lnb.t(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final mha getKind() {
        return nii.g;
    }

    public final int hashCode() {
        return h().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        i3c.o(lnb.t(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return h() + '(' + this.a + ')';
    }
}
