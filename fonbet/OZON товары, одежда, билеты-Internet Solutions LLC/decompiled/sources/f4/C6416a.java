package f4;

import N3.C3659j;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import j3.v;
import java.io.IOException;
import java.util.ArrayDeque;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6416a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f62599a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<C0989a> f62600b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final C6420e f62601c = new C6420e();

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6417b f62602d;

    /* renamed from: e, reason: collision with root package name */
    private int f62603e;

    /* renamed from: f, reason: collision with root package name */
    private int f62604f;

    /* renamed from: g, reason: collision with root package name */
    private long f62605g;

    /* renamed from: f4.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    private static final class C0989a {

        /* renamed from: a, reason: collision with root package name */
        private final int f62606a;

        /* renamed from: b, reason: collision with root package name */
        private final long f62607b;

        C0989a(int i11, long j11) {
            this.f62606a = i11;
            this.f62607b = j11;
        }
    }

    private long c(C3659j c3659j, int i11) throws IOException {
        c3659j.b(this.f62599a, 0, i11, false);
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 << 8) | (r0[i12] & 255);
        }
        return j11;
    }

    public final void a(InterfaceC6417b interfaceC6417b) {
        this.f62602d = interfaceC6417b;
    }

    public final boolean b(C3659j c3659j) throws IOException {
        int i11;
        String str;
        int c11;
        int a11;
        G10.a.i(this.f62602d);
        while (true) {
            ArrayDeque<C0989a> arrayDeque = this.f62600b;
            C0989a peek = arrayDeque.peek();
            if (peek != null && c3659j.getPosition() >= peek.f62607b) {
                C6418c.this.n(arrayDeque.pop().f62606a);
                return true;
            }
            int i12 = this.f62603e;
            C6420e c6420e = this.f62601c;
            if (i12 == 0) {
                long d11 = c6420e.d(c3659j, true, false, 4);
                if (d11 == -2) {
                    c3659j.e();
                    while (true) {
                        byte[] bArr = this.f62599a;
                        c3659j.d(bArr, 0, 4, false);
                        c11 = C6420e.c(bArr[0]);
                        if (c11 != -1 && c11 <= 4) {
                            a11 = (int) C6420e.a(bArr, c11, false);
                            C6418c.this.getClass();
                            if (a11 == 357149030 || a11 == 524531317 || a11 == 475249515 || a11 == 374648427) {
                            }
                        }
                        c3659j.m(1, false);
                    }
                    c3659j.m(c11, false);
                    d11 = a11;
                }
                if (d11 == -1) {
                    return false;
                }
                this.f62604f = (int) d11;
                this.f62603e = 1;
            }
            if (this.f62603e == 1) {
                this.f62605g = c6420e.d(c3659j, false, true, 8);
                this.f62603e = 2;
            }
            InterfaceC6417b interfaceC6417b = this.f62602d;
            int i13 = this.f62604f;
            C6418c.this.getClass();
            switch (i13) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case ModuleDescriptor.MODULE_VERSION /* 215 */:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i11 = 2;
                    break;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    i11 = 3;
                    break;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i11 = 1;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i11 = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i11 = 5;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            if (i11 != 0) {
                if (i11 == 1) {
                    long position = c3659j.getPosition();
                    arrayDeque.push(new C0989a(this.f62604f, this.f62605g + position));
                    C6418c.this.u(this.f62604f, position, this.f62605g);
                    this.f62603e = 0;
                    return true;
                }
                if (i11 == 2) {
                    long j11 = this.f62605g;
                    if (j11 > 8) {
                        throw v.a(null, "Invalid integer size: " + this.f62605g);
                    }
                    C6418c.this.q(this.f62604f, c(c3659j, (int) j11));
                    this.f62603e = 0;
                    return true;
                }
                if (i11 == 3) {
                    long j12 = this.f62605g;
                    if (j12 > 2147483647L) {
                        throw v.a(null, "String element size: " + this.f62605g);
                    }
                    InterfaceC6417b interfaceC6417b2 = this.f62602d;
                    int i14 = this.f62604f;
                    int i15 = (int) j12;
                    if (i15 == 0) {
                        str = "";
                    } else {
                        byte[] bArr2 = new byte[i15];
                        c3659j.b(bArr2, 0, i15, false);
                        while (i15 > 0 && bArr2[i15 - 1] == 0) {
                            i15--;
                        }
                        str = new String(bArr2, 0, i15);
                    }
                    C6418c.this.v(i14, str);
                    this.f62603e = 0;
                    return true;
                }
                if (i11 == 4) {
                    C6418c.this.l(this.f62604f, (int) this.f62605g, c3659j);
                    this.f62603e = 0;
                    return true;
                }
                if (i11 != 5) {
                    throw v.a(null, "Invalid element type " + i11);
                }
                long j13 = this.f62605g;
                if (j13 != 4 && j13 != 8) {
                    throw v.a(null, "Invalid float size: " + this.f62605g);
                }
                InterfaceC6417b interfaceC6417b3 = this.f62602d;
                int i16 = (int) j13;
                C6418c.this.o(this.f62604f, i16 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(c(c3659j, i16)));
                this.f62603e = 0;
                return true;
            }
            c3659j.m((int) this.f62605g, false);
            this.f62603e = 0;
        }
    }

    public final void d() {
        this.f62603e = 0;
        this.f62600b.clear();
        this.f62601c.e();
    }
}
