package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.zzl;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r {
    public final int a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;

    public r(int i) {
        this.a = i;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.e + i3;
            if (length < i4) {
                bArr2 = Arrays.copyOf(bArr2, i4 * 2);
                this.d = bArr2;
            }
            System.arraycopy(bArr, i, bArr2, this.e, i3);
            this.e += i3;
        }
    }

    public final void b(int i) {
        if (this.b) {
            zzl.s();
            return;
        }
        boolean z = i == this.a;
        this.b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }

    public final boolean a(int i) {
        if (!this.b) {
            return false;
        }
        this.e -= i;
        this.b = false;
        this.c = true;
        return true;
    }
}
