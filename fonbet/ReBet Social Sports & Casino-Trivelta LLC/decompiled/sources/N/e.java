package N;

import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7800a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final long f7801b = f.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f7802c = f.c(4282664004L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f7803d = f.c(4287137928L);

    /* renamed from: e, reason: collision with root package name */
    public static final long f7804e = f.c(4291611852L);

    /* renamed from: f, reason: collision with root package name */
    public static final long f7805f = f.c(BodyPartID.bodyIdMax);

    /* renamed from: g, reason: collision with root package name */
    public static final long f7806g = f.c(4294901760L);

    /* renamed from: h, reason: collision with root package name */
    public static final long f7807h = f.c(4278255360L);

    /* renamed from: i, reason: collision with root package name */
    public static final long f7808i = f.c(4278190335L);

    /* renamed from: j, reason: collision with root package name */
    public static final long f7809j = f.c(4294967040L);

    /* renamed from: k, reason: collision with root package name */
    public static final long f7810k = f.c(4278255615L);

    /* renamed from: l, reason: collision with root package name */
    public static final long f7811l = f.c(4294902015L);

    /* renamed from: m, reason: collision with root package name */
    public static final long f7812m = f.b(0);

    /* renamed from: n, reason: collision with root package name */
    public static final long f7813n = f.a(0.0f, 0.0f, 0.0f, 0.0f, O.g.f8158a.j());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return e.f7801b;
        }

        public final long b() {
            return e.f7806g;
        }

        public a() {
        }
    }

    public static final long d(long j10, O.c colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        O.c g10 = g(j10);
        return Intrinsics.areEqual(colorSpace, g10) ? j10 : O.d.i(g10, colorSpace, 0, 2, null).e(i(j10), h(j10), f(j10), e(j10));
    }

    public static final float e(long j10) {
        float ulongToDouble;
        float f10;
        if (ULong.m321constructorimpl(63 & j10) == 0) {
            ulongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m321constructorimpl(ULong.m321constructorimpl(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            ulongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m321constructorimpl(ULong.m321constructorimpl(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return ulongToDouble / f10;
    }

    public static final float f(long j10) {
        return ULong.m321constructorimpl(63 & j10) == 0 ? ((float) UnsignedKt.ulongToDouble(ULong.m321constructorimpl(ULong.m321constructorimpl(j10 >>> 32) & 255))) / 255.0f : h.c(h.b((short) ULong.m321constructorimpl(ULong.m321constructorimpl(j10 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static final O.c g(long j10) {
        O.g gVar = O.g.f8158a;
        return gVar.e()[(int) ULong.m321constructorimpl(j10 & 63)];
    }

    public static final float h(long j10) {
        return ULong.m321constructorimpl(63 & j10) == 0 ? ((float) UnsignedKt.ulongToDouble(ULong.m321constructorimpl(ULong.m321constructorimpl(j10 >>> 40) & 255))) / 255.0f : h.c(h.b((short) ULong.m321constructorimpl(ULong.m321constructorimpl(j10 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static final float i(long j10) {
        return ULong.m321constructorimpl(63 & j10) == 0 ? ((float) UnsignedKt.ulongToDouble(ULong.m321constructorimpl(ULong.m321constructorimpl(j10 >>> 48) & 255))) / 255.0f : h.c(h.b((short) ULong.m321constructorimpl(ULong.m321constructorimpl(j10 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static long c(long j10) {
        return j10;
    }
}
