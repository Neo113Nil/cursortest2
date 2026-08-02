package defpackage;

import com.google.android.gms.internal.measurement.zzae;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gd2 implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public Iterable c;

    public gd2(zzae zzaeVar) {
        this.a = 1;
        this.c = zzaeVar;
        this.b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((hd2) this.c).e.size()) {
                    break;
                }
                break;
            default:
                if (this.b < ((zzae) this.c).m()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                ed2 ed2Var = (ed2) ((hd2) this.c).e.get(this.b);
                this.b++;
                return ed2Var;
            default:
                zzae zzaeVar = (zzae) this.c;
                int i = this.b;
                int m = zzaeVar.m();
                int i2 = this.b;
                if (i < m) {
                    this.b = i2 + 1;
                    return zzaeVar.n(i2);
                }
                ogj.m(me4.g(i2, "Out of bounds index: ", new StringBuilder(String.valueOf(i2).length() + 21)));
                return null;
        }
    }
}
