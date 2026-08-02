package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gqa extends wtc implements oma {
    public static final eqa r = new eqa();
    public hqa o;
    public cqa p;
    public ewd q;

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        qhe J = g1cVar.J(j);
        return m1c.G0(m1cVar, J.a, J.b, new b3(J, 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001b, code lost:
    
        if (r4.q == defpackage.ewd.a) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x000d, code lost:
    
        if (r4.q == defpackage.ewd.b) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k1(bqa bqaVar, int i) {
        if (i != 5 && i != 6) {
            if (i != 3 && i != 4) {
                if (i != 1 && i != 2) {
                    a70.r("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
            }
            return !l1(i) ? bqaVar.a <= 0 : bqaVar.b >= this.o.getItemCount() - 1;
        }
    }

    public final boolean l1(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int ordinal = c6o.c0(this).z.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            zzl.b();
            return false;
        }
        if (i != 4) {
            a70.r("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int ordinal2 = c6o.c0(this).z.ordinal();
        if (ordinal2 == 0) {
            return true;
        }
        if (ordinal2 == 1) {
            return false;
        }
        zzl.b();
        return false;
    }
}
