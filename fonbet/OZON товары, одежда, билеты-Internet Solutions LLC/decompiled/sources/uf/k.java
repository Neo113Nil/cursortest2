package uf;

import java.io.InputStream;

/* loaded from: classes6.dex */
final class k {

    /* renamed from: A, reason: collision with root package name */
    int f100719A;

    /* renamed from: B, reason: collision with root package name */
    int f100720B;

    /* renamed from: C, reason: collision with root package name */
    int f100721C;

    /* renamed from: D, reason: collision with root package name */
    int f100722D;

    /* renamed from: E, reason: collision with root package name */
    int f100723E;

    /* renamed from: F, reason: collision with root package name */
    int f100724F;

    /* renamed from: G, reason: collision with root package name */
    byte[] f100725G;

    /* renamed from: H, reason: collision with root package name */
    int f100726H;

    /* renamed from: I, reason: collision with root package name */
    int f100727I;

    /* renamed from: J, reason: collision with root package name */
    int f100728J;

    /* renamed from: K, reason: collision with root package name */
    int f100729K;

    /* renamed from: L, reason: collision with root package name */
    int f100730L;

    /* renamed from: M, reason: collision with root package name */
    int f100731M;

    /* renamed from: N, reason: collision with root package name */
    int f100732N;

    /* renamed from: O, reason: collision with root package name */
    int f100733O;

    /* renamed from: T, reason: collision with root package name */
    int f100738T;

    /* renamed from: U, reason: collision with root package name */
    int f100739U;

    /* renamed from: V, reason: collision with root package name */
    int f100740V;

    /* renamed from: W, reason: collision with root package name */
    int f100741W;

    /* renamed from: X, reason: collision with root package name */
    int f100742X;

    /* renamed from: Y, reason: collision with root package name */
    byte[] f100743Y;

    /* renamed from: b, reason: collision with root package name */
    int f100745b;

    /* renamed from: d, reason: collision with root package name */
    byte[] f100747d;

    /* renamed from: g, reason: collision with root package name */
    int f100750g;

    /* renamed from: h, reason: collision with root package name */
    boolean f100751h;

    /* renamed from: i, reason: collision with root package name */
    boolean f100752i;

    /* renamed from: j, reason: collision with root package name */
    boolean f100753j;

    /* renamed from: v, reason: collision with root package name */
    int f100765v;

    /* renamed from: w, reason: collision with root package name */
    int f100766w;

    /* renamed from: x, reason: collision with root package name */
    int f100767x;

    /* renamed from: y, reason: collision with root package name */
    byte[] f100768y;

    /* renamed from: z, reason: collision with root package name */
    byte[] f100769z;

    /* renamed from: a, reason: collision with root package name */
    int f100744a = 0;

    /* renamed from: c, reason: collision with root package name */
    final C10054a f100746c = new C10054a();

    /* renamed from: e, reason: collision with root package name */
    final int[] f100748e = new int[3240];

    /* renamed from: f, reason: collision with root package name */
    final int[] f100749f = new int[3240];

    /* renamed from: k, reason: collision with root package name */
    final h f100754k = new h();

    /* renamed from: l, reason: collision with root package name */
    final h f100755l = new h();

    /* renamed from: m, reason: collision with root package name */
    final h f100756m = new h();

    /* renamed from: n, reason: collision with root package name */
    final int[] f100757n = new int[3];

    /* renamed from: o, reason: collision with root package name */
    final int[] f100758o = new int[3];

    /* renamed from: p, reason: collision with root package name */
    final int[] f100759p = new int[6];

    /* renamed from: q, reason: collision with root package name */
    final int[] f100760q = {16, 15, 11, 4};

    /* renamed from: r, reason: collision with root package name */
    int f100761r = 0;

    /* renamed from: s, reason: collision with root package name */
    int f100762s = 0;

    /* renamed from: t, reason: collision with root package name */
    int f100763t = 0;

    /* renamed from: u, reason: collision with root package name */
    boolean f100764u = false;

    /* renamed from: P, reason: collision with root package name */
    int f100734P = 0;

    /* renamed from: Q, reason: collision with root package name */
    long f100735Q = 0;

    /* renamed from: R, reason: collision with root package name */
    byte[] f100736R = new byte[0];

    /* renamed from: S, reason: collision with root package name */
    int f100737S = 0;

    k() {
    }

    static void a(k kVar, InputStream inputStream) {
        int i11;
        if (kVar.f100744a != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        C10054a c10054a = kVar.f100746c;
        C10054a.e(c10054a, inputStream);
        if (C10054a.g(c10054a, 1) == 0) {
            i11 = 16;
        } else {
            int g10 = C10054a.g(c10054a, 3);
            i11 = 17;
            if (g10 != 0) {
                i11 = 17 + g10;
            } else {
                int g11 = C10054a.g(c10054a, 3);
                if (g11 != 0) {
                    i11 = g11 + 8;
                }
            }
        }
        if (i11 == 9) {
            throw new c("Invalid 'windowBits' code");
        }
        int i12 = 1 << i11;
        kVar.f100733O = i12;
        kVar.f100732N = i12 - 16;
        kVar.f100744a = 1;
    }
}
