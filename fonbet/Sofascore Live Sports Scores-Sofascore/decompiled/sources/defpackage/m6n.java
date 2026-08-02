package defpackage;

import com.google.android.gms.internal.ads.zzinn;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m6n implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ AbstractCollection c;

    public /* synthetic */ m6n(AbstractCollection abstractCollection, int i) {
        this.a = i;
        this.c = abstractCollection;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractCollection abstractCollection = this.c;
        switch (i) {
            case 0:
                p6n p6nVar = (p6n) abstractCollection;
                if (this.b < p6nVar.d() - p6nVar.c()) {
                    break;
                }
                break;
            case 1:
                if (this.b < ((s6n) ((yg0) abstractCollection).b).c[0]) {
                    break;
                }
                break;
            case 2:
                zzinn zzinnVar = (zzinn) abstractCollection;
                if (this.b < zzinnVar.a.size() || zzinnVar.b.hasNext()) {
                    break;
                }
                break;
            case 3:
                if (this.b < ((s6n) ((yg0) abstractCollection).b).c[0]) {
                    break;
                }
                break;
            default:
                if (this.b < ((mgp) ((yg0) abstractCollection).b).e) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractCollection abstractCollection = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                p6n p6nVar = (p6n) abstractCollection;
                if (i2 >= p6nVar.d() - p6nVar.c()) {
                    yhk.d();
                    return null;
                }
                s6n s6nVar = p6nVar.b;
                Object obj = s6nVar.b[p6nVar.c() + i2];
                this.b = i2 + 1;
                return obj;
            case 1:
                int i3 = this.b;
                s6n s6nVar2 = (s6n) ((yg0) abstractCollection).b;
                if (i3 >= s6nVar2.c[0]) {
                    yhk.d();
                    return null;
                }
                Object obj2 = s6nVar2.b[i3];
                this.b = i3 + 1;
                return obj2;
            case 2:
                int i4 = this.b;
                zzinn zzinnVar = (zzinn) abstractCollection;
                List list = zzinnVar.a;
                if (i4 >= list.size()) {
                    list.add(zzinnVar.b.next());
                    return next();
                }
                int i5 = this.b;
                this.b = i5 + 1;
                return list.get(i5);
            case 3:
                int i6 = this.b;
                s6n s6nVar3 = (s6n) ((yg0) abstractCollection).b;
                if (i6 >= s6nVar3.c[0]) {
                    yhk.d();
                    return null;
                }
                Object obj3 = s6nVar3.b[i6];
                this.b = i6 + 1;
                return obj3;
            default:
                int i7 = this.b;
                this.b = i7 + 1;
                mgp mgpVar = (mgp) ((yg0) abstractCollection).b;
                return mgpVar.d(mgpVar.d[i7] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
