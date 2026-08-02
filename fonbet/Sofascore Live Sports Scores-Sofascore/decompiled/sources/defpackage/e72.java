package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e72 implements g72 {
    public final Serializable a;

    @Override // defpackage.g72
    public final void a(Bundle bundle, String str) {
        bundle.putSerializable(str, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e72) {
            return Intrinsics.c(this.a, ((e72) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Serializable serializable = this.a;
        if (serializable == null) {
            return 0;
        }
        return serializable.hashCode();
    }

    public final String toString() {
        return "SerializableVal(value=" + this.a + ")";
    }
}
