package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface mma extends vtc {
    default int b(tkb tkbVar, g1c g1cVar, int i) {
        return k(new baa(tkbVar, tkbVar.getLayoutDirection()), new gq4(g1cVar, u1c.b, v1c.a, 1), cn3.b(0, 0, 0, i, 7)).getWidth();
    }

    default int e(tkb tkbVar, g1c g1cVar, int i) {
        return k(new baa(tkbVar, tkbVar.getLayoutDirection()), new gq4(g1cVar, u1c.b, v1c.b, 1), cn3.b(0, i, 0, 0, 13)).getHeight();
    }

    default int h(tkb tkbVar, g1c g1cVar, int i) {
        return k(new baa(tkbVar, tkbVar.getLayoutDirection()), new gq4(g1cVar, u1c.a, v1c.a, 1), cn3.b(0, 0, 0, i, 7)).getWidth();
    }

    l1c k(m1c m1cVar, g1c g1cVar, long j);

    default int m(tkb tkbVar, g1c g1cVar, int i) {
        return k(new baa(tkbVar, tkbVar.getLayoutDirection()), new gq4(g1cVar, u1c.a, v1c.b, 1), cn3.b(0, i, 0, 0, 13)).getHeight();
    }
}
