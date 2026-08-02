package org.brotli.dec;

import java.io.InputStream;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: A, reason: collision with root package name */
    public int f62160A;

    /* renamed from: B, reason: collision with root package name */
    public int f62161B;

    /* renamed from: C, reason: collision with root package name */
    public int f62162C;

    /* renamed from: D, reason: collision with root package name */
    public int f62163D;

    /* renamed from: E, reason: collision with root package name */
    public int f62164E;

    /* renamed from: F, reason: collision with root package name */
    public int f62165F;

    /* renamed from: J, reason: collision with root package name */
    public int f62169J;

    /* renamed from: K, reason: collision with root package name */
    public int f62170K;

    /* renamed from: L, reason: collision with root package name */
    public int f62171L;

    /* renamed from: M, reason: collision with root package name */
    public int f62172M;

    /* renamed from: N, reason: collision with root package name */
    public int f62173N;

    /* renamed from: b, reason: collision with root package name */
    public int f62175b;
    byte[] contextMap;
    byte[] contextModes;

    /* renamed from: d, reason: collision with root package name */
    public int f62177d;
    byte[] distContextMap;

    /* renamed from: e, reason: collision with root package name */
    public boolean f62178e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f62179f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f62180g;
    byte[] output;

    /* renamed from: p, reason: collision with root package name */
    public int f62189p;

    /* renamed from: q, reason: collision with root package name */
    public int f62190q;

    /* renamed from: r, reason: collision with root package name */
    public int f62191r;
    byte[] ringBuffer;

    /* renamed from: s, reason: collision with root package name */
    public int f62192s;

    /* renamed from: t, reason: collision with root package name */
    public int f62193t;

    /* renamed from: u, reason: collision with root package name */
    public int f62194u;

    /* renamed from: v, reason: collision with root package name */
    public int f62195v;

    /* renamed from: w, reason: collision with root package name */
    public int f62196w;

    /* renamed from: x, reason: collision with root package name */
    public int f62197x;

    /* renamed from: y, reason: collision with root package name */
    public int f62198y;

    /* renamed from: z, reason: collision with root package name */
    public int f62199z;

    /* renamed from: a, reason: collision with root package name */
    public int f62174a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final a f62176c = new a();
    final int[] blockTypeTrees = new int[3240];
    final int[] blockLenTrees = new int[3240];

    /* renamed from: h, reason: collision with root package name */
    public final h f62181h = new h();

    /* renamed from: i, reason: collision with root package name */
    public final h f62182i = new h();

    /* renamed from: j, reason: collision with root package name */
    public final h f62183j = new h();
    final int[] blockLength = new int[3];
    final int[] numBlockTypes = new int[3];
    final int[] blockTypeRb = new int[6];
    final int[] distRb = {16, 15, 11, 4};

    /* renamed from: k, reason: collision with root package name */
    public int f62184k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f62185l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f62186m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f62187n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f62188o = 0;

    /* renamed from: G, reason: collision with root package name */
    public int f62166G = 0;

    /* renamed from: H, reason: collision with root package name */
    public long f62167H = 0;
    byte[] customDictionary = new byte[0];

    /* renamed from: I, reason: collision with root package name */
    public int f62168I = 0;

    public static void a(k kVar) {
        int i10 = kVar.f62174a;
        if (i10 == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (i10 == 11) {
            return;
        }
        kVar.f62174a = 11;
        a.b(kVar.f62176c);
    }

    public static int b(a aVar) {
        if (a.i(aVar, 1) == 0) {
            return 16;
        }
        int i10 = a.i(aVar, 3);
        if (i10 != 0) {
            return i10 + 17;
        }
        int i11 = a.i(aVar, 3);
        if (i11 != 0) {
            return i11 + 8;
        }
        return 17;
    }

    public static void c(k kVar, InputStream inputStream) {
        if (kVar.f62174a != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        a.e(kVar.f62176c, inputStream);
        int b10 = b(kVar.f62176c);
        if (b10 == 9) {
            throw new c("Invalid 'windowBits' code");
        }
        int i10 = 1 << b10;
        kVar.f62165F = i10;
        kVar.f62164E = i10 - 16;
        kVar.f62174a = 1;
    }
}
