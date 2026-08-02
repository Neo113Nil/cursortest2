package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class voa implements hqa {
    public final qpa a;

    public voa(qpa qpaVar) {
        this.a = qpaVar;
    }

    @Override // defpackage.hqa
    public final int a() {
        int i;
        qpa qpaVar = this.a;
        int i2 = 0;
        if (qpaVar.h().m.isEmpty()) {
            return 0;
        }
        fpa h = qpaVar.h();
        ewd ewdVar = h.q;
        ewd ewdVar2 = ewd.a;
        int e = (int) (ewdVar == ewdVar2 ? h.e() & 4294967295L : h.e() >> 32);
        fpa h2 = qpaVar.h();
        ewd ewdVar3 = h2.q;
        List list = h2.m;
        boolean z = ewdVar3 == ewdVar2;
        if (!list.isEmpty()) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < list.size()) {
                gpa gpaVar = (gpa) list.get(i3);
                int i6 = z ? gpaVar.u : gpaVar.v;
                if (i6 == -1) {
                    i3++;
                } else {
                    int i7 = 0;
                    while (i3 < list.size()) {
                        gpa gpaVar2 = (gpa) list.get(i3);
                        if ((z ? gpaVar2.u : gpaVar2.v) != i6) {
                            break;
                        }
                        i7 = Math.max(i7, (int) (z ? ((gpa) list.get(i3)).s & 4294967295L : ((gpa) list.get(i3)).s >> 32));
                        i3++;
                    }
                    i4 += i7;
                    i5++;
                }
            }
            i2 = (i4 / i5) + h2.s;
        }
        if (i2 != 0 && (i = e / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.hqa
    public final boolean b() {
        return !this.a.h().m.isEmpty();
    }

    @Override // defpackage.hqa
    public final int c() {
        return this.a.g();
    }

    @Override // defpackage.hqa
    public final int d() {
        return ((gpa) CollectionsKt.h0(this.a.h().m)).a;
    }

    @Override // defpackage.hqa
    public final int getItemCount() {
        return this.a.h().p;
    }
}
