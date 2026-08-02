package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r6d implements Comparable {
    public final s6d a;
    public final Bundle b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final int f;

    public r6d(s6d s6dVar, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.a = s6dVar;
        this.b = bundle;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(r6d r6dVar) {
        r6dVar.getClass();
        boolean z = this.c;
        if (z && !r6dVar.c) {
            return 1;
        }
        if (!z && r6dVar.c) {
            return -1;
        }
        int i = r6dVar.d;
        boolean z2 = r6dVar.e;
        Bundle bundle = r6dVar.b;
        int i2 = this.d - i;
        if (i2 > 0) {
            return 1;
        }
        if (i2 < 0) {
            return -1;
        }
        Bundle bundle2 = this.b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            bundle2.getClass();
            int size = bundle2.size();
            bundle.getClass();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z3 = this.e;
        if (z3 && !z2) {
            return 1;
        }
        if (z3 || !z2) {
            return this.f - r6dVar.f;
        }
        return -1;
    }
}
