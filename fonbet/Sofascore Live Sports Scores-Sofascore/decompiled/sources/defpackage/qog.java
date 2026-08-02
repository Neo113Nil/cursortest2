package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qog extends tog implements Iterator {
    public rog a;
    public rog b;

    @Override // defpackage.tog
    public final void a(rog rogVar) {
        rog rogVar2 = this.a;
        rog rogVar3 = null;
        if (rogVar2 == rogVar && rogVar == this.b) {
            this.b = null;
            this.a = null;
            rogVar2 = null;
        }
        rog rogVar4 = rogVar2;
        if (rogVar2 == rogVar) {
            rogVar4 = rogVar2.d;
            this.a = rogVar4;
        }
        rog rogVar5 = this.b;
        if (rogVar5 == rogVar) {
            if (rogVar5 != rogVar4 && rogVar4 != null) {
                rogVar3 = rogVar5.c;
            }
            this.b = rogVar3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        rog rogVar = this.b;
        rog rogVar2 = this.a;
        this.b = (rogVar == rogVar2 || rogVar2 == null) ? null : rogVar.c;
        return rogVar;
    }
}
