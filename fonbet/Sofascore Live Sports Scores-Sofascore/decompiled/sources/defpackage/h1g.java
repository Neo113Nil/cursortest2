package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h1g implements e23 {
    public final int a;

    public h1g(int i) {
        this.a = i;
    }

    @Override // defpackage.e23
    public final long a(Context context) {
        return hkg.b(f23.a.a(context, this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1g) && this.a == ((h1g) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wv8.j(new StringBuilder("ResourceColorProvider(resId="), this.a, ')');
    }
}
