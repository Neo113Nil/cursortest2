package defpackage;

import com.google.android.gms.internal.cast.zzxh;
import com.google.android.gms.internal.cast.zzxk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xbp implements zzxh {
    public int a = 0;
    public final int b;
    public final /* synthetic */ zzxk c;

    public xbp(zzxk zzxkVar) {
        this.c = zzxkVar;
        this.b = zzxkVar.m();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return Byte.valueOf(this.c.d(i));
        }
        yhk.d();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
