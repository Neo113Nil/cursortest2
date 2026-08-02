package defpackage;

import com.google.android.gms.internal.ads.zziei;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ipo extends jpo {
    public int a = 0;
    public final int b;
    public final /* synthetic */ zziei c;

    public ipo(zziei zzieiVar) {
        this.c = zzieiVar;
        this.b = zzieiVar.o();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final byte zza() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.n(i);
        }
        yhk.d();
        return (byte) 0;
    }
}
