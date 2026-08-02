package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class tc5 implements Sequence, yc5 {
    public final /* synthetic */ int a;
    public final Sequence b;
    public final int c;

    public tc5(Sequence sequence, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = sequence;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                ogj.h(lnb.n("count must be non-negative, but was ", i, '.'));
                throw null;
            default:
                sequence.getClass();
                this.b = sequence;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                ogj.h(lnb.n("count must be non-negative, but was ", i, '.'));
                throw null;
        }
    }

    @Override // defpackage.yc5
    public final Sequence a(int i) {
        int i2 = this.a;
        Sequence sequence = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new tc5(this, i, 0) : new tc5(sequence, i4, 0);
            default:
                return i >= i3 ? qm5.a : new tji(sequence, i, i3);
        }
    }

    @Override // defpackage.yc5
    public final Sequence b(int i) {
        int i2 = this.a;
        Sequence sequence = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new tc5(this, i, 1) : new tji(sequence, i3, i4);
            default:
                return i >= i3 ? this : new tc5(sequence, i, 1);
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new sc5(this);
            default:
                return new sc5(this, (byte) 0);
        }
    }
}
