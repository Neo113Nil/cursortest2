package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sog extends tog implements Iterator {
    public rog a;
    public boolean b = true;
    public final /* synthetic */ uog c;

    public sog(uog uogVar) {
        this.c = uogVar;
    }

    @Override // defpackage.tog
    public final void a(rog rogVar) {
        rog rogVar2 = this.a;
        if (rogVar == rogVar2) {
            rog rogVar3 = rogVar2.d;
            this.a = rogVar3;
            this.b = rogVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        rog rogVar = this.a;
        return (rogVar == null || rogVar.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            rog rogVar = this.c.a;
            this.a = rogVar;
            return rogVar;
        }
        rog rogVar2 = this.a;
        rog rogVar3 = rogVar2 != null ? rogVar2.c : null;
        this.a = rogVar3;
        return rogVar3;
    }
}
