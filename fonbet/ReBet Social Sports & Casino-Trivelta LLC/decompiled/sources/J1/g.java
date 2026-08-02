package J1;

import androidx.media3.common.a;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4156x;
import e1.J;
import e1.Z;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.a f5922a;

    public g(androidx.media3.common.a aVar) {
        this.f5922a = aVar;
    }

    public static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    public static String b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    public static a c(J j10) {
        j10.c0(4);
        int z10 = j10.z();
        int z11 = j10.z();
        j10.c0(4);
        int z12 = j10.z();
        String a10 = a(z12);
        if (a10 != null) {
            a.b bVar = new a.b();
            bVar.F0(z10).h0(z11).y0(a10);
            return new g(bVar.P());
        }
        AbstractC4156x.i("StreamFormatChunk", "Ignoring track with unsupported compression " + z12);
        return null;
    }

    public static a d(int i10, J j10) {
        if (i10 == 2) {
            return c(j10);
        }
        if (i10 == 1) {
            return e(j10);
        }
        AbstractC4156x.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + Z.z0(i10));
        return null;
    }

    public static a e(J j10) {
        int E10 = j10.E();
        String b10 = b(E10);
        if (b10 == null) {
            AbstractC4156x.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + E10);
            return null;
        }
        int E11 = j10.E();
        int z10 = j10.z();
        j10.c0(6);
        int n02 = Z.n0(j10.E());
        int E12 = j10.a() > 0 ? j10.E() : 0;
        a.b bVar = new a.b();
        bVar.y0(b10).T(E11).z0(z10);
        if (b10.equals("audio/raw") && n02 != 0) {
            bVar.s0(n02);
        }
        if (b10.equals("audio/mp4a-latm") && E12 > 0) {
            byte[] bArr = new byte[E12];
            j10.q(bArr, 0, E12);
            bVar.k0(AbstractC3445z.u(bArr));
        }
        return new g(bVar.P());
    }

    @Override // J1.a
    public int getType() {
        return 1718776947;
    }
}
