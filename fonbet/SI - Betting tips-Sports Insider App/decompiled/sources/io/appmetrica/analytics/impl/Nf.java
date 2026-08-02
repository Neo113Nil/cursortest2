package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Nf implements to {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    @Override // io.appmetrica.analytics.impl.to
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(N8 n82, C0285kh c0285kh) {
        C0359ng c0359ng;
        int ordinal;
        if (!TextUtils.isEmpty(n82.f12631b)) {
            try {
                byte[] decode = Base64.decode(n82.f12631b, 0);
                if (decode != null && decode.length != 0) {
                    c0359ng = new C0359ng(decode);
                    Vf vf2 = new Vf();
                    String str = c0359ng.f14361a;
                    vf2.f13062a = str != null ? new byte[0] : str.getBytes();
                    vf2.f13064c = c0359ng.f14362b;
                    vf2.f13063b = c0359ng.f14363c;
                    ordinal = c0359ng.f14364d.ordinal();
                    int i5 = 1;
                    if (ordinal != 1) {
                        i5 = 2;
                        if (ordinal != 2) {
                            i5 = 0;
                        }
                    }
                    vf2.f13065d = i5;
                    return MessageNano.toByteArray(vf2);
                }
                c0359ng = null;
                Vf vf22 = new Vf();
                String str2 = c0359ng.f14361a;
                vf22.f13062a = str2 != null ? new byte[0] : str2.getBytes();
                vf22.f13064c = c0359ng.f14362b;
                vf22.f13063b = c0359ng.f14363c;
                ordinal = c0359ng.f14364d.ordinal();
                int i52 = 1;
                if (ordinal != 1) {
                }
                vf22.f13065d = i52;
                return MessageNano.toByteArray(vf22);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
