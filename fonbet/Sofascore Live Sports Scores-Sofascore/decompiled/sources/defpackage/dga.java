package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class dga extends d {
    public final boolean a;
    public final SerialDescriptor b;
    public final String c;

    public dga(Object obj, boolean z, SerialDescriptor serialDescriptor) {
        obj.getClass();
        this.a = z;
        this.b = serialDescriptor;
        this.c = obj.toString();
        if (serialDescriptor == null || serialDescriptor.isInline()) {
            return;
        }
        a70.p("Failed requirement.");
        throw null;
    }

    @Override // kotlinx.serialization.json.d
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dga.class != obj.getClass()) {
            return false;
        }
        dga dgaVar = (dga) obj;
        return this.a == dgaVar.a && Intrinsics.c(this.c, dgaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // kotlinx.serialization.json.d
    public final String toString() {
        boolean z = this.a;
        String str = this.c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        thi.a(str, sb);
        return sb.toString();
    }
}
