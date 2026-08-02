package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f68 implements e23 {
    public final long a;

    public f68(long j) {
        this.a = j;
    }

    @Override // defpackage.e23
    public final long a(Context context) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f68)) {
            return false;
        }
        long j = ((f68) obj).a;
        int i = r13.j;
        return e8k.a(this.a, j);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) r13.i(this.a)) + ')';
    }
}
