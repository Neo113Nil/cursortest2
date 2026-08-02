package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e4p extends b4p {
    public final /* synthetic */ f4p d;

    public e4p(f4p f4pVar) {
        this.d = f4pVar;
    }

    @Override // defpackage.j3p
    /* renamed from: d */
    public final q5p iterator() {
        return p().listIterator(0);
    }

    @Override // defpackage.c4p, defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return p().listIterator(0);
    }

    @Override // defpackage.c4p
    public final q3p v() {
        return new d4p(this);
    }

    @Override // defpackage.b4p
    public final f4p w() {
        return this.d;
    }
}
