package androidx.media3.exoplayer.source;

import b1.AbstractC2346O;
import b1.z;

/* loaded from: classes.dex */
public final class k0 extends AbstractC2221w {

    /* renamed from: f, reason: collision with root package name */
    public final b1.z f21825f;

    public k0(AbstractC2346O abstractC2346O, b1.z zVar) {
        super(abstractC2346O);
        this.f21825f = zVar;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2221w, b1.AbstractC2346O
    public AbstractC2346O.c o(int i10, AbstractC2346O.c cVar, long j10) {
        super.o(i10, cVar, j10);
        b1.z zVar = this.f21825f;
        cVar.f24379c = zVar;
        z.h hVar = zVar.f24655b;
        cVar.f24378b = hVar != null ? hVar.f24757i : null;
        return cVar;
    }
}
