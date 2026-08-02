package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.C4331u;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vok implements iw8 {
    public static final vok a;
    private static final /* synthetic */ uye descriptor;

    static {
        vok vokVar = new vok();
        a = vokVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Video", vokVar, 22);
        uyeVar.j("bidfloor", true);
        uyeVar.j("mimes", true);
        uyeVar.j("minduration", true);
        uyeVar.j("maxduration", true);
        uyeVar.j("protocols", true);
        uyeVar.j("w", true);
        uyeVar.j(h.b, true);
        uyeVar.j("startdelay", true);
        uyeVar.j("placement", true);
        uyeVar.j("linearity", true);
        uyeVar.j("skip", true);
        uyeVar.j(C4331u.g, true);
        uyeVar.j("skipmin", true);
        uyeVar.j("skipafter", true);
        uyeVar.j("minbitrate", true);
        uyeVar.j("maxbitrate", true);
        uyeVar.j("pos", true);
        uyeVar.j("playbackmethod", true);
        uyeVar.j("api", true);
        uyeVar.j("companionad", true);
        uyeVar.j("companiontype", true);
        uyeVar.j("ext", true);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = xok.w;
        a7a a7aVar = a7a.a;
        w92 w92Var = w92.c;
        qb2 qb2Var = qb2.a;
        return new KSerializer[]{c88.a, l98.W((KSerializer) joaVarArr[1].getValue()), a7aVar, a7aVar, l98.W(w92Var), a7aVar, a7aVar, a7aVar, qb2Var, qb2Var, qb2Var, l98.W(w92Var), a7aVar, a7aVar, a7aVar, a7aVar, qb2Var, l98.W(w92Var), l98.W(w92Var), l98.W((KSerializer) joaVarArr[19].getValue()), l98.W(w92Var), joaVarArr[21].getValue()};
    }

    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30, types: [byte[], mz0[]] */
    /* JADX WARN: Type inference failed for: r1v35 */
    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        byte b;
        byte b2;
        ?? r1;
        int i;
        int i2;
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b3 = decoder.b(uyeVar);
        joa[] joaVarArr = xok.w;
        byte[] bArr = null;
        mz0[] mz0VarArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        Map map = null;
        int i3 = 0;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        String[] strArr = null;
        int i4 = 0;
        int i5 = 0;
        byte[] bArr5 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        byte b7 = 0;
        boolean z = true;
        while (z) {
            int o = b3.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                case 0:
                    i = i6;
                    i2 = i7;
                    i3 |= 1;
                    f = b3.s(uyeVar, 0);
                    i7 = i2;
                    i6 = i;
                case 1:
                    i = i6;
                    i2 = i7;
                    strArr = (String[]) b3.i(uyeVar, 1, (dy4) joaVarArr[1].getValue(), strArr);
                    i3 |= 2;
                    i7 = i2;
                    i6 = i;
                case 2:
                    i4 = b3.l(uyeVar, 2);
                    i3 |= 4;
                case 3:
                    i5 = b3.l(uyeVar, 3);
                    i3 |= 8;
                case 4:
                    i = i6;
                    i2 = i7;
                    bArr5 = (byte[]) b3.i(uyeVar, 4, w92.c, bArr5);
                    i3 |= 16;
                    i7 = i2;
                    i6 = i;
                case 5:
                    i6 = b3.l(uyeVar, 5);
                    i3 |= 32;
                case 6:
                    i = i6;
                    i7 = b3.l(uyeVar, 6);
                    i3 |= 64;
                    i6 = i;
                case 7:
                    i = i6;
                    i8 = b3.l(uyeVar, 7);
                    i3 |= 128;
                    i6 = i;
                case 8:
                    i = i6;
                    b4 = b3.A(uyeVar, 8);
                    i3 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    i6 = i;
                case 9:
                    i = i6;
                    b5 = b3.A(uyeVar, 9);
                    i3 |= 512;
                    i6 = i;
                case 10:
                    i = i6;
                    b6 = b3.A(uyeVar, 10);
                    i3 |= 1024;
                    i6 = i;
                case 11:
                    i = i6;
                    i2 = i7;
                    bArr4 = (byte[]) b3.i(uyeVar, 11, w92.c, bArr4);
                    i3 |= a.o;
                    i7 = i2;
                    i6 = i;
                case 12:
                    i = i6;
                    i9 = b3.l(uyeVar, 12);
                    i3 |= 4096;
                    i6 = i;
                case 13:
                    i = i6;
                    i10 = b3.l(uyeVar, 13);
                    i3 |= 8192;
                    i6 = i;
                case 14:
                    i = i6;
                    i11 = b3.l(uyeVar, 14);
                    i3 |= 16384;
                    i6 = i;
                case 15:
                    i = i6;
                    i12 = b3.l(uyeVar, 15);
                    i3 |= 32768;
                    i6 = i;
                case 16:
                    i = i6;
                    b7 = b3.A(uyeVar, 16);
                    i3 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i6 = i;
                case 17:
                    i = i6;
                    i2 = i7;
                    bArr3 = (byte[]) b3.i(uyeVar, 17, w92.c, bArr3);
                    i3 |= 131072;
                    i7 = i2;
                    i6 = i;
                case 18:
                    i = i6;
                    i2 = i7;
                    bArr2 = (byte[]) b3.i(uyeVar, 18, w92.c, bArr2);
                    i3 |= 262144;
                    i7 = i2;
                    i6 = i;
                case 19:
                    i = i6;
                    i2 = i7;
                    mz0VarArr = (mz0[]) b3.i(uyeVar, 19, (dy4) joaVarArr[19].getValue(), mz0VarArr);
                    i3 |= 524288;
                    i7 = i2;
                    i6 = i;
                case 20:
                    i = i6;
                    i2 = i7;
                    bArr = (byte[]) b3.i(uyeVar, 20, w92.c, bArr);
                    i3 |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i7 = i2;
                    i6 = i;
                case 21:
                    i2 = i7;
                    i = i6;
                    map = (Map) b3.w(uyeVar, 21, (dy4) joaVarArr[21].getValue(), map);
                    i3 |= 2097152;
                    i7 = i2;
                    i6 = i;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        int i13 = i6;
        int i14 = i7;
        b3.c(uyeVar);
        xok xokVar = new xok();
        if ((i3 & 1) == 0) {
            xokVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            xokVar.a = f;
        }
        if ((i3 & 2) == 0) {
            xokVar.b = null;
        } else {
            xokVar.b = strArr;
        }
        if ((i3 & 4) == 0) {
            xokVar.c = 0;
        } else {
            xokVar.c = i4;
        }
        if ((i3 & 8) == 0) {
            xokVar.d = 60;
        } else {
            xokVar.d = i5;
        }
        if ((i3 & 16) == 0) {
            xokVar.e = null;
        } else {
            xokVar.e = bArr5;
        }
        if ((i3 & 32) == 0) {
            b = 0;
            xokVar.f = 0;
        } else {
            b = 0;
            xokVar.f = i13;
        }
        if ((i3 & 64) == 0) {
            xokVar.g = b;
        } else {
            xokVar.g = i14;
        }
        if ((i3 & 128) == 0) {
            xokVar.h = b;
        } else {
            xokVar.h = i8;
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            xokVar.i = b;
        } else {
            xokVar.i = b4;
        }
        if ((i3 & 512) == 0) {
            xokVar.j = b;
        } else {
            xokVar.j = b5;
        }
        if ((i3 & 1024) == 0) {
            xokVar.k = b;
        } else {
            xokVar.k = b6;
        }
        if ((i3 & a.o) == 0) {
            xokVar.l = null;
        } else {
            xokVar.l = bArr4;
        }
        if ((i3 & 4096) == 0) {
            b2 = 0;
            xokVar.m = 0;
        } else {
            b2 = 0;
            xokVar.m = i9;
        }
        if ((i3 & 8192) == 0) {
            xokVar.n = b2;
        } else {
            xokVar.n = i10;
        }
        if ((i3 & 16384) == 0) {
            xokVar.o = b2;
        } else {
            xokVar.o = i11;
        }
        if ((i3 & 32768) == 0) {
            xokVar.p = b2;
        } else {
            xokVar.p = i12;
        }
        if ((i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0) {
            xokVar.q = b2;
        } else {
            xokVar.q = b7;
        }
        if ((i3 & 131072) == 0) {
            r1 = 0;
            xokVar.r = null;
        } else {
            r1 = 0;
            xokVar.r = bArr3;
        }
        if ((i3 & 262144) == 0) {
            xokVar.s = r1;
        } else {
            xokVar.s = bArr2;
        }
        if ((i3 & 524288) == 0) {
            xokVar.t = r1;
        } else {
            xokVar.t = mz0VarArr;
        }
        if ((i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            xokVar.u = r1;
        } else {
            xokVar.u = bArr;
        }
        if ((i3 & 2097152) == 0) {
            xokVar.v = tub.i(new Pair("is_rewarded", (byte) 0));
            return xokVar;
        }
        xokVar.v = map;
        return xokVar;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r3, defpackage.tub.i(new kotlin.Pair("is_rewarded", (byte) 0))) == false) goto L123;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        int i;
        Map map;
        xok xokVar = (xok) obj;
        encoder.getClass();
        xokVar.getClass();
        Map map2 = xokVar.v;
        byte[] bArr = xokVar.r;
        byte b = xokVar.q;
        int i2 = xokVar.p;
        int i3 = xokVar.o;
        int i4 = xokVar.n;
        int i5 = xokVar.m;
        byte[] bArr2 = xokVar.l;
        byte b2 = xokVar.k;
        byte b3 = xokVar.j;
        byte b4 = xokVar.i;
        int i6 = xokVar.h;
        int i7 = xokVar.d;
        int i8 = xokVar.c;
        float f = xokVar.a;
        uye uyeVar = descriptor;
        wf3 b5 = encoder.b(uyeVar);
        joa[] joaVarArr = xok.w;
        if (b5.o(uyeVar) || Float.compare(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0) {
            b5.t(uyeVar, 0, f);
        }
        if (!b5.o(uyeVar) && xokVar.b == null) {
            i = i2;
        } else {
            i = i2;
            b5.h(uyeVar, 1, (KSerializer) joaVarArr[1].getValue(), xokVar.b);
        }
        if (b5.o(uyeVar) || i8 != 0) {
            b5.u(2, i8, uyeVar);
        }
        if (b5.o(uyeVar) || i7 != 60) {
            b5.u(3, i7, uyeVar);
        }
        if (b5.o(uyeVar) || xokVar.e != null) {
            b5.h(uyeVar, 4, w92.c, xokVar.e);
        }
        if (b5.o(uyeVar) || xokVar.f != 0) {
            b5.u(5, xokVar.f, uyeVar);
        }
        if (b5.o(uyeVar) || xokVar.g != 0) {
            b5.u(6, xokVar.g, uyeVar);
        }
        if (b5.o(uyeVar) || i6 != 0) {
            b5.u(7, i6, uyeVar);
        }
        if (b5.o(uyeVar) || b4 != 0) {
            b5.q(uyeVar, 8, b4);
        }
        if (b5.o(uyeVar) || b3 != 0) {
            b5.q(uyeVar, 9, b3);
        }
        if (b5.o(uyeVar) || b2 != 0) {
            b5.q(uyeVar, 10, b2);
        }
        if (b5.o(uyeVar) || bArr2 != null) {
            b5.h(uyeVar, 11, w92.c, bArr2);
        }
        if (b5.o(uyeVar) || i5 != 0) {
            b5.u(12, i5, uyeVar);
        }
        if (b5.o(uyeVar) || i4 != 0) {
            b5.u(13, i4, uyeVar);
        }
        if (b5.o(uyeVar) || i3 != 0) {
            b5.u(14, i3, uyeVar);
        }
        if (b5.o(uyeVar) || i != 0) {
            b5.u(15, i, uyeVar);
        }
        if (b5.o(uyeVar) || b != 0) {
            b5.q(uyeVar, 16, b);
        }
        if (b5.o(uyeVar) || bArr != null) {
            b5.h(uyeVar, 17, w92.c, bArr);
        }
        if (b5.o(uyeVar) || xokVar.s != null) {
            b5.h(uyeVar, 18, w92.c, xokVar.s);
        }
        if (b5.o(uyeVar) || xokVar.t != null) {
            b5.h(uyeVar, 19, (KSerializer) joaVarArr[19].getValue(), xokVar.t);
        }
        if (b5.o(uyeVar) || xokVar.u != null) {
            b5.h(uyeVar, 20, w92.c, xokVar.u);
        }
        if (b5.o(uyeVar)) {
            map = map2;
        } else {
            map = map2;
        }
        b5.f(uyeVar, 21, (KSerializer) joaVarArr[21].getValue(), map);
        b5.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
