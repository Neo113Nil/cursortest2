package defpackage;

import com.google.android.gms.internal.measurement.zzas;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xin implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ zzas c;

    public /* synthetic */ xin(zzas zzasVar, int i) {
        this.a = i;
        this.c = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        zzas zzasVar = this.c;
        switch (i) {
            case 0:
                if (this.b < zzasVar.a.length()) {
                    break;
                }
                break;
            default:
                if (this.b < zzasVar.a.length()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.a;
        zzas zzasVar = this.c;
        switch (i) {
            case 0:
                String str = zzasVar.a;
                int i2 = this.b;
                if (i2 >= str.length()) {
                    yhk.d();
                    break;
                } else {
                    this.b = i2 + 1;
                    break;
                }
            default:
                String str2 = zzasVar.a;
                int i3 = this.b;
                if (i3 >= str2.length()) {
                    yhk.d();
                    break;
                } else {
                    this.b = i3 + 1;
                    break;
                }
        }
        return null;
    }
}
