package defpackage;

import com.google.android.gms.internal.play_billing.zzcs;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nsn extends zzcs {
    public final Object a;
    public boolean b;

    public nsn(Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            yhk.d();
            return null;
        }
        this.b = true;
        return this.a;
    }
}
