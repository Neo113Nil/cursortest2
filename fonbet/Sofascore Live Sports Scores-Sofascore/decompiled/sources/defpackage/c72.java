package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c72 implements g72 {
    public final ArrayList a;

    @Override // defpackage.g72
    public final void a(Bundle bundle, String str) {
        bundle.putParcelableArrayList(str, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c72) {
            return this.a.equals(((c72) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ParcelableListVal(value=" + this.a + ")";
    }
}
