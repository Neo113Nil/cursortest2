package defpackage;

import com.google.android.gms.internal.measurement.zzabe;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p6n extends AbstractSet {
    public final int a;
    public final /* synthetic */ s6n b;

    public p6n(s6n s6nVar, int i) {
        this.b = s6nVar;
        this.a = i;
    }

    public final int c() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.b.b, c(), d(), obj, this.a == -1 ? s6n.g : zzabe.b) >= 0;
    }

    public final int d() {
        return this.b.c[this.a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new m6n(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return d() - c();
    }
}
