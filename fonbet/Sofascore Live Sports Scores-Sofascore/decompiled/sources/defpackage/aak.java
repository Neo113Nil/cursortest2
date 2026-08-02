package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aak {
    public y3g a;
    public y3g b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[LOOP:0: B:24:0x0061->B:29:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:31:0x0076 BREAK  A[LOOP:0: B:24:0x0061->B:29:0x0071], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(wcj wcjVar) {
        y3g y3gVar;
        wcj wcjVar2;
        this.e = false;
        y3g y3gVar2 = this.a;
        if (Intrinsics.c(wcjVar, y3gVar2 != null ? (wcj) y3gVar2.c : null)) {
            return;
        }
        String str = wcjVar.a.b;
        y3g y3gVar3 = this.a;
        boolean c = Intrinsics.c(str, (y3gVar3 == null || (wcjVar2 = (wcj) y3gVar3.c) == null) ? null : wcjVar2.a.b);
        y3g y3gVar4 = this.a;
        if (c) {
            if (y3gVar4 != null) {
                y3gVar4.c = wcjVar;
                return;
            }
            return;
        }
        this.a = new y3g(27, y3gVar4, wcjVar);
        this.b = null;
        int length = wcjVar.a.b.length() + this.c;
        this.c = length;
        if (length > 100000) {
            y3g y3gVar5 = this.a;
            if ((y3gVar5 != null ? (y3g) y3gVar5.b : null) == null) {
                return;
            }
            while (true) {
                if (y3gVar5 != null) {
                    y3g y3gVar6 = (y3g) y3gVar5.b;
                    if (y3gVar6 != null) {
                        y3gVar = (y3g) y3gVar6.b;
                        if (y3gVar != null) {
                            break;
                        } else {
                            y3gVar5 = (y3g) y3gVar5.b;
                        }
                    }
                }
                y3gVar = null;
                if (y3gVar != null) {
                }
            }
            if (y3gVar5 != null) {
                y3gVar5.b = null;
            }
        }
    }
}
