package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class h8e {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        mfj[] mfjVarArr = lfj.b;
        a = lfj.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0033, code lost:
    
        if (defpackage.lfj.a(r3, r17.c) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final g8e a(g8e g8eVar, int i, int i2, long j, bdj bdjVar, aje ajeVar, r7b r7bVar, int i3, int i4, lej lejVar) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        bdj bdjVar2 = bdjVar;
        aje ajeVar2 = ajeVar;
        r7b r7bVar2 = r7bVar;
        int i7 = i3;
        int i8 = i4;
        lej lejVar2 = lejVar;
        if (i5 == 0 || i5 == g8eVar.a) {
            mfj[] mfjVarArr = lfj.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
            }
            if ((bdjVar2 == null || bdjVar2.equals(g8eVar.d)) && ((i6 == 0 || i6 == g8eVar.b) && ((ajeVar2 == null || ajeVar2.equals(g8eVar.e)) && ((r7bVar2 == null || r7bVar2.equals(g8eVar.f)) && ((i7 == 0 || i7 == g8eVar.g) && ((i8 == 0 || i8 == g8eVar.h) && (lejVar2 == null || lejVar2.equals(g8eVar.i)))))))) {
                return g8eVar;
            }
        } else {
            j2 = 0;
        }
        mfj[] mfjVarArr2 = lfj.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = g8eVar.c;
        }
        if (bdjVar2 == null) {
            bdjVar2 = g8eVar.d;
        }
        if (i5 == 0) {
            i5 = g8eVar.a;
        }
        if (i6 == 0) {
            i6 = g8eVar.b;
        }
        aje ajeVar3 = g8eVar.e;
        if (ajeVar3 != null && ajeVar2 == null) {
            ajeVar2 = ajeVar3;
        }
        if (r7bVar2 == null) {
            r7bVar2 = g8eVar.f;
        }
        if (i7 == 0) {
            i7 = g8eVar.g;
        }
        if (i8 == 0) {
            i8 = g8eVar.h;
        }
        if (lejVar2 == null) {
            lejVar2 = g8eVar.i;
        }
        return new g8e(i5, i6, j3, bdjVar2, ajeVar2, r7bVar2, i7, i8, lejVar2);
    }
}
