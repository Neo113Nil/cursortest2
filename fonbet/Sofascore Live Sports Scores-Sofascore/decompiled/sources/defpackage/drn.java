package defpackage;

import com.google.android.gms.internal.wearable.zzcd;
import com.google.android.gms.internal.wearable.zzcg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class drn implements zzcd {
    public int a = 0;
    public final int b;
    public final /* synthetic */ zzcg c;

    public drn(zzcg zzcgVar) {
        this.c = zzcgVar;
        this.b = zzcgVar.d();
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
            return Byte.valueOf(this.c.c(i));
        }
        yhk.d();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
