package defpackage;

import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzj;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kgp implements Iterator {
    public final zzyl a;
    public int b;
    public int c;
    public final /* synthetic */ mgp d;

    public /* synthetic */ kgp(mgp mgpVar, zzyl zzylVar, int i) {
        this.d = mgpVar;
        this.a = zzylVar;
        int i2 = i & 31;
        this.b = i2;
        this.c = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        mgp mgpVar = this.d;
        zzzj zzzjVar = mgpVar.b;
        int a = zzzjVar.a();
        Object cast = this.a.b.cast(i >= a ? mgpVar.c.c(i - a) : zzzjVar.c(i));
        int i2 = this.c;
        if (i2 == 0) {
            this.b = -1;
            return cast;
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.c >>>= numberOfTrailingZeros;
        this.b += numberOfTrailingZeros;
        return cast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
