package rh;

import kotlin.UByte;
import ph.AbstractC6076g;

/* renamed from: rh.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6288f implements InterfaceC6297o {
    private static final C6288f[] INSTANCES = d();

    /* renamed from: c, reason: collision with root package name */
    public static final C6288f f64395c = e((byte) 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C6288f f64396d = e((byte) 1);

    /* renamed from: a, reason: collision with root package name */
    public final String f64397a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f64398b;

    public C6288f(byte b10) {
        char[] cArr = new char[2];
        AbstractC6076g.d(b10, cArr, 0);
        this.f64397a = new String(cArr);
        this.f64398b = b10;
    }

    public static C6288f[] d() {
        C6288f[] c6288fArr = new C6288f[256];
        for (int i10 = 0; i10 < 256; i10++) {
            c6288fArr[i10] = new C6288f((byte) i10);
        }
        return c6288fArr;
    }

    public static C6288f e(byte b10) {
        return INSTANCES[b10 & UByte.MAX_VALUE];
    }

    @Override // rh.InterfaceC6297o
    public String a() {
        return this.f64397a;
    }

    @Override // rh.InterfaceC6297o
    public boolean b() {
        return (this.f64398b & 1) != 0;
    }

    public String toString() {
        return a();
    }
}
