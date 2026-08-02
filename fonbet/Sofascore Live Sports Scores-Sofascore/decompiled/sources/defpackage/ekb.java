package defpackage;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class ekb implements Iterable, eia {

    @NotNull
    public static final dkb c = new dkb(null);
    public final long a;
    public final long b;

    public ekb(long j, long j2) {
        this.a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.b = j2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new fkb(this.a, this.b);
    }
}
