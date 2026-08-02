package org.brotli.dec;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f62159a;
    int[] codes;
    int[] trees;

    public static void a(h hVar, a aVar) {
        int length = hVar.trees.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            hVar.trees[i11] = i10;
            e.n(hVar.f62159a, hVar.codes, i10, aVar);
            i10 += 1080;
        }
    }

    public static void b(h hVar, int i10, int i11) {
        hVar.f62159a = i10;
        hVar.codes = new int[i11 * 1080];
        hVar.trees = new int[i11];
    }
}
