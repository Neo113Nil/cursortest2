package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class tji implements Sequence, yc5 {
    public final Sequence a;
    public final int b;
    public final int c;

    public tji(Sequence sequence, int i, int i2) {
        sequence.getClass();
        this.a = sequence;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            ogj.h(ljg.j(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            ogj.h(ljg.j(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        ogj.h(dmi.k(i2, i, "endIndex should be not less than startIndex, but was ", " < "));
        throw null;
    }

    @Override // defpackage.yc5
    public final Sequence a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? qm5.a : new tji(this.a, i3 + i, i2);
    }

    @Override // defpackage.yc5
    public final Sequence b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new tji(this.a, i3, i + i3);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new kw8(this);
    }
}
