package com.google.flatbuffers;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    ByteBuffer f59760a;

    /* renamed from: b, reason: collision with root package name */
    int f59761b;

    /* renamed from: c, reason: collision with root package name */
    int f59762c;

    /* renamed from: d, reason: collision with root package name */
    int[] f59763d;

    /* renamed from: e, reason: collision with root package name */
    int f59764e;

    /* renamed from: f, reason: collision with root package name */
    boolean f59765f;

    /* renamed from: g, reason: collision with root package name */
    boolean f59766g;

    /* renamed from: h, reason: collision with root package name */
    int f59767h;

    /* renamed from: i, reason: collision with root package name */
    int[] f59768i;

    /* renamed from: j, reason: collision with root package name */
    int f59769j;

    /* renamed from: k, reason: collision with root package name */
    int f59770k;

    /* renamed from: l, reason: collision with root package name */
    C0907b f59771l;

    public static abstract class a {
    }

    /* renamed from: com.google.flatbuffers.b$b, reason: collision with other inner class name */
    public static final class C0907b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0907b f59772a = new C0907b();
    }

    public b(int i11) {
        C0907b c0907b = C0907b.f59772a;
        e.b();
        this.f59762c = 1;
        this.f59763d = null;
        this.f59764e = 0;
        this.f59765f = false;
        this.f59766g = false;
        this.f59768i = new int[16];
        this.f59769j = 0;
        this.f59770k = 0;
        this.f59771l = c0907b;
        ByteBuffer order = ByteBuffer.allocate(UserVerificationMethods.USER_VERIFY_ALL).order(ByteOrder.LITTLE_ENDIAN);
        this.f59760a = order;
        this.f59761b = order.capacity();
    }

    public final void a(long j11) {
        j(8, 0);
        ByteBuffer byteBuffer = this.f59760a;
        int i11 = this.f59761b - 8;
        this.f59761b = i11;
        byteBuffer.putLong(i11, j11);
    }

    public final void b(int i11) {
        j(4, 0);
        int i12 = (i() - i11) + 4;
        ByteBuffer byteBuffer = this.f59760a;
        int i13 = this.f59761b - 4;
        this.f59761b = i13;
        byteBuffer.putInt(i13, i12);
    }

    public final void c(short s11) {
        j(2, 0);
        ByteBuffer byteBuffer = this.f59760a;
        int i11 = this.f59761b - 2;
        this.f59761b = i11;
        byteBuffer.putShort(i11, s11);
    }

    public final int d() {
        int i11;
        if (this.f59763d == null || !this.f59765f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        j(4, 0);
        ByteBuffer byteBuffer = this.f59760a;
        int i12 = this.f59761b - 4;
        this.f59761b = i12;
        byteBuffer.putInt(i12, 0);
        int i13 = i();
        int i14 = this.f59764e - 1;
        while (i14 >= 0 && this.f59763d[i14] == 0) {
            i14--;
        }
        for (int i15 = i14; i15 >= 0; i15--) {
            int i16 = this.f59763d[i15];
            c((short) (i16 != 0 ? i13 - i16 : 0));
        }
        c((short) (i13 - this.f59767h));
        c((short) ((i14 + 3) * 2));
        int i17 = 0;
        loop2: while (true) {
            if (i17 >= this.f59769j) {
                i11 = 0;
                break;
            }
            int capacity = this.f59760a.capacity() - this.f59768i[i17];
            int i18 = this.f59761b;
            short s11 = this.f59760a.getShort(capacity);
            if (s11 == this.f59760a.getShort(i18)) {
                for (int i19 = 2; i19 < s11; i19 += 2) {
                    if (this.f59760a.getShort(capacity + i19) != this.f59760a.getShort(i18 + i19)) {
                        break;
                    }
                }
                i11 = this.f59768i[i17];
                break loop2;
            }
            i17++;
        }
        if (i11 != 0) {
            int capacity2 = this.f59760a.capacity() - i13;
            this.f59761b = capacity2;
            this.f59760a.putInt(capacity2, i11 - i13);
        } else {
            int i21 = this.f59769j;
            int[] iArr = this.f59768i;
            if (i21 == iArr.length) {
                this.f59768i = Arrays.copyOf(iArr, i21 * 2);
            }
            int[] iArr2 = this.f59768i;
            int i22 = this.f59769j;
            this.f59769j = i22 + 1;
            iArr2[i22] = i();
            ByteBuffer byteBuffer2 = this.f59760a;
            byteBuffer2.putInt(byteBuffer2.capacity() - i13, i() - i13);
        }
        this.f59765f = false;
        return i13;
    }

    public final int e() {
        if (!this.f59765f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f59765f = false;
        int i11 = this.f59770k;
        ByteBuffer byteBuffer = this.f59760a;
        int i12 = this.f59761b - 4;
        this.f59761b = i12;
        byteBuffer.putInt(i12, i11);
        return i();
    }

    public final void f(int i11) {
        g(i11, false);
    }

    protected final void g(int i11, boolean z11) {
        j(this.f59762c, (z11 ? 4 : 0) + 4);
        b(i11);
        if (z11) {
            int capacity = this.f59760a.capacity() - this.f59761b;
            j(4, 0);
            ByteBuffer byteBuffer = this.f59760a;
            int i12 = this.f59761b - 4;
            this.f59761b = i12;
            byteBuffer.putInt(i12, capacity);
        }
        this.f59760a.position(this.f59761b);
        this.f59766g = true;
    }

    public final void h(int i11) {
        g(i11, true);
    }

    public final int i() {
        return this.f59760a.capacity() - this.f59761b;
    }

    public final void j(int i11, int i12) {
        int i13;
        if (i11 > this.f59762c) {
            this.f59762c = i11;
        }
        int i14 = ((~((this.f59760a.capacity() - this.f59761b) + i12)) + 1) & (i11 - 1);
        while (this.f59761b < i14 + i11 + i12) {
            int capacity = this.f59760a.capacity();
            ByteBuffer byteBuffer = this.f59760a;
            int capacity2 = byteBuffer.capacity();
            if (capacity2 == 0) {
                i13 = UserVerificationMethods.USER_VERIFY_ALL;
            } else {
                i13 = 2147483639;
                if (capacity2 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & capacity2) == 0) {
                    i13 = capacity2 << 1;
                }
            }
            byteBuffer.position(0);
            this.f59771l.getClass();
            ByteBuffer order = ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
            order.position(order.clear().capacity() - capacity2);
            order.put(byteBuffer);
            this.f59760a = order;
            this.f59761b = (order.capacity() - capacity) + this.f59761b;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            ByteBuffer byteBuffer2 = this.f59760a;
            int i16 = this.f59761b - 1;
            this.f59761b = i16;
            byteBuffer2.put(i16, (byte) 0);
        }
    }

    public final byte[] k() {
        int i11 = this.f59761b;
        int capacity = this.f59760a.capacity() - this.f59761b;
        if (!this.f59766g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[capacity];
        this.f59760a.position(i11);
        this.f59760a.get(bArr);
        return bArr;
    }

    public final void l(int i11) {
        this.f59763d[i11] = i();
    }

    public final void m(int i11) {
        if (this.f59765f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.f59763d;
        if (iArr == null || iArr.length < i11) {
            this.f59763d = new int[i11];
        }
        this.f59764e = i11;
        Arrays.fill(this.f59763d, 0, i11, 0);
        this.f59765f = true;
        this.f59767h = i();
    }

    public final void n(int i11, int i12, int i13) {
        if (this.f59765f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f59770k = i12;
        int i14 = i11 * i12;
        j(4, i14);
        j(i13, i14);
        this.f59765f = true;
    }
}
