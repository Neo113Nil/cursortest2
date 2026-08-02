package com.bumptech.glide.gifdecoder;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f29598a;

    /* renamed from: b, reason: collision with root package name */
    public c f29599b;
    private final byte[] block = new byte[256];

    /* renamed from: c, reason: collision with root package name */
    public int f29600c = 0;

    public void a() {
        this.f29598a = null;
        this.f29599b = null;
    }

    public final boolean b() {
        return this.f29599b.f29586a != 0;
    }

    public c c() {
        if (this.f29598a == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f29599b;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f29599b;
            if (cVar.f29587b < 0) {
                cVar.f29586a = 1;
            }
        }
        return this.f29599b;
    }

    public final int d() {
        try {
            return this.f29598a.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.f29599b.f29586a = 1;
            return 0;
        }
    }

    public final void e() {
        this.f29599b.f29588c.f29576a = n();
        this.f29599b.f29588c.f29577b = n();
        this.f29599b.f29588c.f29578c = n();
        this.f29599b.f29588c.f29579d = n();
        int d10 = d();
        boolean z10 = (d10 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (d10 & 7) + 1);
        b bVar = this.f29599b.f29588c;
        bVar.f29580e = (d10 & 64) != 0;
        if (z10) {
            bVar.lct = g(pow);
        } else {
            bVar.lct = null;
        }
        this.f29599b.f29588c.f29585j = this.f29598a.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f29599b;
        cVar.f29587b++;
        cVar.f29589d.add(cVar.f29588c);
    }

    public final void f() {
        int d10 = d();
        this.f29600c = d10;
        if (d10 <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                int i11 = this.f29600c;
                if (i10 >= i11) {
                    return;
                }
                int i12 = i11 - i10;
                this.f29598a.get(this.block, i10, i12);
                i10 += i12;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f29599b.f29586a = 1;
                return;
            }
        }
    }

    public final int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f29598a.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & UByte.MAX_VALUE;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & UByte.MAX_VALUE;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & UByte.MAX_VALUE);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f29599b.f29586a = 1;
            return iArr;
        }
    }

    public final void h() {
        i(Integer.MAX_VALUE);
    }

    public final void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f29599b.f29587b <= i10) {
            int d10 = d();
            if (d10 == 33) {
                int d11 = d();
                if (d11 == 1) {
                    q();
                } else if (d11 == 249) {
                    this.f29599b.f29588c = new b();
                    j();
                } else if (d11 == 254) {
                    q();
                } else if (d11 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.block[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d10 == 44) {
                c cVar = this.f29599b;
                if (cVar.f29588c == null) {
                    cVar.f29588c = new b();
                }
                e();
            } else if (d10 != 59) {
                this.f29599b.f29586a = 1;
            } else {
                z10 = true;
            }
        }
    }

    public final void j() {
        d();
        int d10 = d();
        b bVar = this.f29599b.f29588c;
        int i10 = (d10 & 28) >> 2;
        bVar.f29582g = i10;
        if (i10 == 0) {
            bVar.f29582g = 1;
        }
        bVar.f29581f = (d10 & 1) != 0;
        int n10 = n();
        if (n10 < 2) {
            n10 = 10;
        }
        b bVar2 = this.f29599b.f29588c;
        bVar2.f29584i = n10 * 10;
        bVar2.f29583h = d();
        d();
    }

    public final void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f29599b.f29586a = 1;
            return;
        }
        l();
        if (!this.f29599b.f29592g || b()) {
            return;
        }
        c cVar = this.f29599b;
        cVar.gct = g(cVar.f29593h);
        c cVar2 = this.f29599b;
        cVar2.f29596k = cVar2.gct[cVar2.f29594i];
    }

    public final void l() {
        this.f29599b.f29590e = n();
        this.f29599b.f29591f = n();
        int d10 = d();
        c cVar = this.f29599b;
        cVar.f29592g = (d10 & 128) != 0;
        cVar.f29593h = (int) Math.pow(2.0d, (d10 & 7) + 1);
        this.f29599b.f29594i = d();
        this.f29599b.f29595j = d();
    }

    public final void m() {
        do {
            f();
            byte[] bArr = this.block;
            if (bArr[0] == 1) {
                this.f29599b.f29597l = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
            }
            if (this.f29600c <= 0) {
                return;
            }
        } while (!b());
    }

    public final int n() {
        return this.f29598a.getShort();
    }

    public final void o() {
        this.f29598a = null;
        Arrays.fill(this.block, (byte) 0);
        this.f29599b = new c();
        this.f29600c = 0;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f29598a = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f29598a.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public final void q() {
        int d10;
        do {
            d10 = d();
            this.f29598a.position(Math.min(this.f29598a.position() + d10, this.f29598a.limit()));
        } while (d10 > 0);
    }

    public final void r() {
        d();
        q();
    }
}
