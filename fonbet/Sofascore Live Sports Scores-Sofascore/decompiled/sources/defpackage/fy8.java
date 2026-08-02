package defpackage;

import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fy8 {
    public ByteBuffer b;
    public ey8 c;
    public final byte[] a = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
    public int d = 0;

    public final boolean a() {
        return this.c.b != 0;
    }

    public final ey8 b() {
        byte[] bArr;
        if (this.b == null) {
            a70.r("You must call setData() before parseHeader()");
            return null;
        }
        if (a()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        boolean startsWith = sb.toString().startsWith("GIF");
        ey8 ey8Var = this.c;
        if (startsWith) {
            ey8Var.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int c = c();
            ey8 ey8Var2 = this.c;
            ey8Var2.h = (c & 128) != 0;
            ey8Var2.i = (int) Math.pow(2.0d, (c & 7) + 1);
            this.c.j = c();
            ey8 ey8Var3 = this.c;
            c();
            ey8Var3.getClass();
            if (this.c.h && !a()) {
                ey8 ey8Var4 = this.c;
                ey8Var4.a = e(ey8Var4.i);
                ey8 ey8Var5 = this.c;
                ey8Var5.k = ey8Var5.a[ey8Var5.j];
            }
        } else {
            ey8Var.b = 1;
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int c2 = c();
                if (c2 == 33) {
                    int c3 = c();
                    if (c3 == 1) {
                        f();
                    } else if (c3 == 249) {
                        this.c.d = new ay8();
                        c();
                        int c4 = c();
                        ay8 ay8Var = this.c.d;
                        int i2 = (c4 & 28) >> 2;
                        ay8Var.g = i2;
                        if (i2 == 0) {
                            ay8Var.g = 1;
                        }
                        ay8Var.f = (c4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        ay8 ay8Var2 = this.c.d;
                        ay8Var2.i = s * 10;
                        ay8Var2.h = c();
                        c();
                    } else if (c3 == 254) {
                        f();
                    } else if (c3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.c.getClass();
                                }
                                if (this.d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (c2 == 44) {
                    ey8 ey8Var6 = this.c;
                    ay8 ay8Var3 = ey8Var6.d;
                    if (ay8Var3 == null) {
                        ay8Var3 = new ay8();
                        ey8Var6.d = ay8Var3;
                    }
                    ay8Var3.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int c5 = c();
                    boolean z2 = (c5 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (c5 & 7) + 1);
                    ay8 ay8Var4 = this.c.d;
                    ay8Var4.e = (c5 & 64) != 0;
                    if (z2) {
                        ay8Var4.k = e(pow);
                    } else {
                        ay8Var4.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        ey8 ey8Var7 = this.c;
                        ey8Var7.c++;
                        ey8Var7.e.add(ey8Var7.d);
                    }
                } else if (c2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            ey8 ey8Var8 = this.c;
            if (ey8Var8.c < 0) {
                ey8Var8.b = 1;
            }
        }
        return this.c;
    }

    public final int c() {
        try {
            return this.b.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int c = c();
        this.d = c;
        if (c <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.b.get(this.a, i, i3);
                i += i3;
            } catch (Exception unused) {
                this.c.b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            this.c.b = 1;
            return iArr;
        }
    }

    public final void f() {
        int c;
        do {
            c = c();
            this.b.position(Math.min(this.b.position() + c, this.b.limit()));
        } while (c > 0);
    }
}
