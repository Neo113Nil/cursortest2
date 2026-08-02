package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgw {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgw(zzgv zzgvVar) {
        byte b;
        byte b2;
        byte b3;
        boolean z;
        int i = zzgvVar.a;
        ByteBuffer byteBuffer = zzgvVar.b;
        boolean z2 = false;
        zzguk.a(i == 1);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        zzet zzetVar = new zzet(bArr, remaining);
        this.g = zzetVar.h(3);
        zzetVar.e();
        boolean g = zzetVar.g();
        this.a = g;
        if (g) {
            zzetVar.h(5);
            this.b = false;
            this.h = false;
        } else {
            if (zzetVar.g()) {
                zzetVar.f(64);
                if (zzetVar.g()) {
                    int i2 = 0;
                    while (!zzetVar.g()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        zzetVar.f(i2);
                    }
                }
                boolean g2 = zzetVar.g();
                this.b = g2;
                if (g2) {
                    zzetVar.f(47);
                }
            } else {
                this.b = false;
            }
            this.h = zzetVar.g();
            int h = zzetVar.h(5);
            for (int i3 = 0; i3 <= h; i3++) {
                zzetVar.f(12);
                if (i3 == 0) {
                    if (zzetVar.h(5) > 7) {
                        zzetVar.g();
                    }
                } else if (zzetVar.h(5) > 7) {
                    zzetVar.e();
                }
                if (this.b) {
                    zzetVar.e();
                }
                if (this.h && zzetVar.g()) {
                    if (i3 == 0) {
                        zzetVar.h(4);
                    } else {
                        zzetVar.f(4);
                    }
                }
            }
        }
        int h2 = zzetVar.h(4);
        int h3 = zzetVar.h(4);
        zzetVar.f(h2 + 1);
        zzetVar.f(h3 + 1);
        if (this.a) {
            this.c = false;
        } else {
            boolean g3 = zzetVar.g();
            this.c = g3;
            if (g3) {
                zzetVar.f(4);
                zzetVar.f(3);
            }
        }
        zzetVar.f(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            zzetVar.f(4);
            boolean g4 = zzetVar.g();
            if (g4) {
                zzetVar.f(2);
            }
            if (zzetVar.g()) {
                this.d = true;
            } else {
                boolean g5 = zzetVar.g();
                this.d = g5;
                if (!g5) {
                    this.e = true;
                    if (g4) {
                        this.f = 0;
                    } else {
                        this.f = zzetVar.h(3) + 1;
                    }
                }
            }
            if (zzetVar.g()) {
                this.e = true;
            } else {
                this.e = zzetVar.g();
            }
            if (g4) {
            }
        }
        zzetVar.f(3);
        boolean g6 = (this.g == 2 && zzetVar.g()) ? zzetVar.g() : false;
        boolean g7 = this.g != 1 ? zzetVar.g() : false;
        if (zzetVar.g()) {
            b2 = (byte) zzetVar.h(8);
            b3 = (byte) zzetVar.h(8);
            b = (byte) zzetVar.h(8);
        } else {
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        if (g7) {
            zzetVar.e();
        } else if (b2 != 1 || b3 != 13 || b != 0) {
            zzetVar.e();
            int i4 = this.g;
            if (i4 == 0) {
                z = true;
                z2 = true;
            } else if (i4 == 1) {
                z = false;
            } else if (g6) {
                z = zzetVar.g();
                if (z) {
                    z2 = zzetVar.g();
                }
            } else {
                z = true;
            }
            if (z && z2) {
                zzetVar.h(2);
            }
        }
        zzetVar.e();
    }
}
