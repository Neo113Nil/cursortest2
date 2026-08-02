package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nw8 {
    public static final nw8 g = new nw8(4201, 4096, 1);
    public static final nw8 h = new nw8(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 1024, 1);
    public static final nw8 i = new nw8(67, 64, 1);
    public static final nw8 j = new nw8(19, 16, 1);
    public static final nw8 k = new nw8(285, NotificationCompat.FLAG_LOCAL_ONLY, 0);
    public static final nw8 l = new nw8(Sdk.SDKError.Reason.MRAID_ERROR_VALUE, NotificationCompat.FLAG_LOCAL_ONLY, 1);
    public final int[] a;
    public final int[] b;
    public final ow8 c;
    public final int d;
    public final int e;
    public final int f;

    public nw8(int i2, int i3, int i4) {
        this.e = i2;
        this.d = i3;
        this.f = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new ow8(this, new int[]{0});
    }

    public final int a(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i2] + iArr[i3]) % (this.d - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.e));
        sb.append(',');
        return wv8.j(sb, this.d, ')');
    }
}
