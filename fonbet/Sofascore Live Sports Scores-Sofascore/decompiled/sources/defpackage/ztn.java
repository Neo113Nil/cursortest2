package defpackage;

import com.google.android.gms.internal.fido.zzdc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ztn extends zzdc {
    public static final Object b = new Object();
    public Object a;

    public ztn(Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.a;
        Object obj2 = b;
        if (obj != obj2) {
            this.a = obj2;
            return obj;
        }
        yhk.d();
        return null;
    }
}
