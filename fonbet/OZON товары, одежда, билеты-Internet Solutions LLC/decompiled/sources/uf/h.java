package uf;

/* loaded from: classes6.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private int f100706a;

    /* renamed from: b, reason: collision with root package name */
    int[] f100707b;

    /* renamed from: c, reason: collision with root package name */
    int[] f100708c;

    static void a(h hVar, C10054a c10054a) {
        int length = hVar.f100708c.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            hVar.f100708c[i12] = i11;
            e.e(hVar.f100706a, hVar.f100707b, i11, c10054a);
            i11 += 1080;
        }
    }

    static void b(h hVar, int i11, int i12) {
        hVar.f100706a = i11;
        hVar.f100707b = new int[i12 * 1080];
        hVar.f100708c = new int[i12];
    }
}
