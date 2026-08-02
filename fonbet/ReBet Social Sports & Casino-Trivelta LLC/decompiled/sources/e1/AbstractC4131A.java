package e1;

import android.media.MediaFormat;
import androidx.media3.common.a;
import b1.C2357k;
import com.google.common.collect.AbstractC3445z;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* renamed from: e1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4131A {
    public static androidx.media3.common.a a(MediaFormat mediaFormat) {
        int i10 = 0;
        a.b s02 = new a.b().y0(mediaFormat.getString("mime")).n0(mediaFormat.getString("language")).t0(g(mediaFormat, "max-bitrate", -1)).S(g(mediaFormat, "bitrate", -1)).U(d(mediaFormat)).f0(f(mediaFormat, -1.0f)).F0(g(mediaFormat, "width", -1)).h0(g(mediaFormat, "height", -1)).u0(h(mediaFormat, 1.0f)).o0(g(mediaFormat, "max-input-size", -1)).x0(g(mediaFormat, "rotation-degrees", 0)).V(e(mediaFormat)).z0(g(mediaFormat, "sample-rate", -1)).T(g(mediaFormat, "channel-count", -1)).s0(g(mediaFormat, "pcm-encoding", -1));
        AbstractC3445z.a aVar = new AbstractC3445z.a();
        while (true) {
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-" + i10);
            if (byteBuffer == null) {
                break;
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            byteBuffer.rewind();
            aVar.a(bArr);
            i10++;
        }
        s02.k0(aVar.m());
        if (mediaFormat.containsKey("track-id")) {
            s02.i0(mediaFormat.getInteger("track-id"));
        }
        return s02.P();
    }

    public static MediaFormat b(androidx.media3.common.a aVar) {
        MediaFormat mediaFormat = new MediaFormat();
        p(mediaFormat, "bitrate", aVar.f20538j);
        p(mediaFormat, "max-bitrate", aVar.f20537i);
        p(mediaFormat, "channel-count", aVar.f20518F);
        n(mediaFormat, aVar.f20516D);
        s(mediaFormat, "mime", aVar.f20543o);
        s(mediaFormat, "codecs-string", aVar.f20539k);
        o(mediaFormat, "frame-rate", aVar.f20554z);
        p(mediaFormat, "width", aVar.f20550v);
        p(mediaFormat, "height", aVar.f20551w);
        u(mediaFormat, aVar.f20546r);
        q(mediaFormat, aVar.f20520H);
        s(mediaFormat, "language", aVar.f20532d);
        p(mediaFormat, "max-input-size", aVar.f20544p);
        p(mediaFormat, "sample-rate", aVar.f20519G);
        p(mediaFormat, "caption-service-number", aVar.f20523K);
        mediaFormat.setInteger("rotation-degrees", aVar.f20513A);
        int i10 = aVar.f20533e;
        t(mediaFormat, "is-autoselect", i10 & 4);
        t(mediaFormat, "is-default", i10 & 1);
        t(mediaFormat, "is-forced-subtitle", i10 & 2);
        mediaFormat.setInteger("encoder-delay", aVar.f20521I);
        mediaFormat.setInteger("encoder-padding", aVar.f20522J);
        r(mediaFormat, aVar.f20514B);
        String str = aVar.f20529a;
        if (str != null) {
            try {
                mediaFormat.setInteger("track-id", Integer.parseInt(str));
            } catch (NumberFormatException unused) {
            }
        }
        return mediaFormat;
    }

    public static byte[] c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static String d(MediaFormat mediaFormat) {
        return (Objects.equals(mediaFormat.getString("mime"), "video/3gpp") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) ? AbstractC4144k.i(mediaFormat.getInteger("profile"), mediaFormat.getInteger("level")) : (Objects.equals(mediaFormat.getString("mime"), "video/dolby-vision") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) ? AbstractC4144k.h(AbstractC4144k.o(mediaFormat.getInteger("profile")), AbstractC4144k.n(mediaFormat.getInteger("level"))) : i(mediaFormat, "codecs-string", null);
    }

    public static C2357k e(MediaFormat mediaFormat) {
        int g10 = g(mediaFormat, "color-standard", -1);
        int g11 = g(mediaFormat, "color-range", -1);
        int g12 = g(mediaFormat, "color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] c10 = byteBuffer != null ? c(byteBuffer) : null;
        if (!k(g10)) {
            g10 = -1;
        }
        if (!j(g11)) {
            g11 = -1;
        }
        if (!l(g12)) {
            g12 = -1;
        }
        if (g10 == -1 && g11 == -1 && g12 == -1 && c10 == null) {
            return null;
        }
        return new C2357k.b().d(g10).c(g11).e(g12).f(c10).a();
    }

    public static float f(MediaFormat mediaFormat, float f10) {
        if (!mediaFormat.containsKey("frame-rate")) {
            return f10;
        }
        try {
            return mediaFormat.getFloat("frame-rate");
        } catch (ClassCastException unused) {
            return mediaFormat.getInteger("frame-rate");
        }
    }

    public static int g(MediaFormat mediaFormat, String str, int i10) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i10;
    }

    public static float h(MediaFormat mediaFormat, float f10) {
        return (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : f10;
    }

    public static String i(MediaFormat mediaFormat, String str, String str2) {
        return mediaFormat.containsKey(str) ? mediaFormat.getString(str) : str2;
    }

    public static boolean j(int i10) {
        return i10 == 2 || i10 == 1 || i10 == -1;
    }

    public static boolean k(int i10) {
        return i10 == 2 || i10 == 1 || i10 == 6 || i10 == -1;
    }

    public static boolean l(int i10) {
        return i10 == 1 || i10 == 3 || i10 == 6 || i10 == 7 || i10 == -1;
    }

    public static void m(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void n(MediaFormat mediaFormat, C2357k c2357k) {
        if (c2357k != null) {
            p(mediaFormat, "color-transfer", c2357k.f24606c);
            p(mediaFormat, "color-standard", c2357k.f24604a);
            p(mediaFormat, "color-range", c2357k.f24605b);
            m(mediaFormat, "hdr-static-info", c2357k.hdrStaticInfo);
        }
    }

    public static void o(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void p(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void q(MediaFormat mediaFormat, int i10) {
        int i11;
        if (i10 == -1) {
            return;
        }
        p(mediaFormat, "exo-pcm-encoding-int", i10);
        if (i10 != 0) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        i11 = 21;
                        if (i10 != 21) {
                            i11 = 22;
                            if (i10 != 22) {
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            i11 = 0;
        }
        mediaFormat.setInteger("pcm-encoding", i11);
    }

    public static void r(MediaFormat mediaFormat, float f10) {
        int i10;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f10);
        int i11 = 1073741824;
        if (f10 < 1.0f) {
            i11 = (int) (f10 * 1073741824);
            i10 = 1073741824;
        } else if (f10 > 1.0f) {
            i10 = (int) (1073741824 / f10);
        } else {
            i11 = 1;
            i10 = 1;
        }
        mediaFormat.setInteger("sar-width", i11);
        mediaFormat.setInteger("sar-height", i10);
    }

    public static void s(MediaFormat mediaFormat, String str, String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    public static void t(MediaFormat mediaFormat, String str, int i10) {
        mediaFormat.setInteger(str, i10 != 0 ? 1 : 0);
    }

    public static void u(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }
}
