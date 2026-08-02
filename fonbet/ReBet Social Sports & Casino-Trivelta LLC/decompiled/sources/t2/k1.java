package t2;

import android.content.Context;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.util.Pair;
import b1.AbstractC2335D;
import b1.C2334C;
import b1.C2357k;
import b1.InterfaceC2362p;
import b1.z;
import com.google.common.collect.AbstractC3445z;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Objects;
import l1.InterfaceC5390x0;
import t2.InterfaceC6399i;
import v1.AbstractC6610O;

/* loaded from: classes.dex */
public abstract class k1 {

    public static final class a {
        public static void a(MediaFormat mediaFormat, LogSessionId logSessionId) {
            LogSessionId logSessionId2;
            boolean equals;
            String stringId;
            logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
            equals = logSessionId.equals(logSessionId2);
            if (equals) {
                return;
            }
            stringId = logSessionId.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    public static boolean a(androidx.media3.common.a aVar) {
        C2334C c2334c = aVar.f20540l;
        if (c2334c == null) {
            return false;
        }
        for (int i10 = 0; i10 < c2334c.e(); i10++) {
            if (c2334c.d(i10) instanceof W1.c) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str) {
        str.getClass();
        switch (str) {
            case "arw":
            case "cr2":
            case "k25":
            case "raw":
                return "image/raw";
            case "bmp":
            case "dib":
                return "image/bmp";
            case "gif":
                return "image/gif";
            case "ico":
                return "image/x-icon";
            case "jfi":
            case "jif":
            case "jpe":
            case "jpg":
            case "jfif":
            case "jpeg":
                return ClipboardModule.MIMETYPE_JPEG;
            case "png":
                return ClipboardModule.MIMETYPE_PNG;
            case "svg":
            case "svgz":
                return "image/svg+xml";
            case "tif":
            case "tiff":
                return "image/tiff";
            case "avif":
                return "image/avif";
            case "heic":
                return ClipboardModule.MIMETYPE_HEIC;
            case "heif":
                return ClipboardModule.MIMETYPE_HEIF;
            case "webp":
                return ClipboardModule.MIMETYPE_WEBP;
            default:
                return null;
        }
    }

    public static C2357k c(C2357k c2357k, boolean z10) {
        return (z10 && C2357k.i(c2357k)) ? C2357k.f24596g : c2357k;
    }

    public static String d(Context context, b1.z zVar) {
        z.h hVar = zVar.f24655b;
        if (hVar == null) {
            return null;
        }
        String str = hVar.f24750b;
        if (str == null) {
            if (Objects.equals(hVar.f24749a.getScheme(), "content")) {
                return context.getContentResolver().getType(hVar.f24749a);
            }
            String path = hVar.f24749a.getPath();
            if (path == null) {
                return null;
            }
            int lastIndexOf = path.lastIndexOf(".");
            if (lastIndexOf >= 0 && lastIndexOf < path.length() - 1) {
                return b(Ra.c.e(path.substring(lastIndexOf + 1)));
            }
        }
        return str;
    }

    public static int e(int i10) {
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        return (i10 & 4) == 4 ? i11 | 4 : i11;
    }

    public static Pair f(int i10, String str, C2357k c2357k) {
        if (i10 == 0 && C2357k.i(c2357k) && AbstractC6416q0.i(str, c2357k).isEmpty()) {
            if (AbstractC6416q0.i("video/hevc", c2357k).isEmpty()) {
                i10 = 2;
            } else {
                str = "video/hevc";
            }
        }
        return Pair.create(str, Integer.valueOf(i10));
    }

    public static int g(String str) {
        int k10 = AbstractC2335D.k(str);
        if (k10 == 4) {
            return 2;
        }
        return k10;
    }

    public static C2357k h(C2357k c2357k) {
        return (c2357k == null || !c2357k.g()) ? C2357k.f24596g : c2357k;
    }

    public static boolean i(Context context, b1.z zVar) {
        String d10 = d(context, zVar);
        return d10 != null && AbstractC2335D.q(d10);
    }

    public static float j(AbstractC3445z abstractC3445z, androidx.media3.common.a aVar) {
        int i10 = aVar.f20513A;
        int i11 = i10 % 180 == 0 ? aVar.f20550v : aVar.f20551w;
        int i12 = i10 % 180 == 0 ? aVar.f20551w : aVar.f20550v;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < abstractC3445z.size(); i13++) {
            InterfaceC2362p interfaceC2362p = (InterfaceC2362p) abstractC3445z.get(i13);
            if (!(interfaceC2362p instanceof InterfaceC5390x0)) {
                return -1.0f;
            }
            InterfaceC5390x0 interfaceC5390x0 = (InterfaceC5390x0) interfaceC2362p;
            if (interfaceC2362p instanceof androidx.media3.effect.n) {
                androidx.media3.effect.n nVar = (androidx.media3.effect.n) interfaceC2362p;
                if (nVar.f20832a != 1.0f || nVar.f20833b != 1.0f) {
                    return -1.0f;
                }
                float f11 = nVar.f20834c;
                if (f11 % 90.0f != 0.0f) {
                    return -1.0f;
                }
                f10 += f11;
                float f12 = f10 % 180.0f;
                i11 = f12 == 0.0f ? aVar.f20550v : aVar.f20551w;
                i12 = f12 == 0.0f ? aVar.f20551w : aVar.f20550v;
            } else if (!interfaceC5390x0.f(i11, i12)) {
                return -1.0f;
            }
        }
        float f13 = f10 % 360.0f;
        if (f13 % 90.0f == 0.0f) {
            return f13;
        }
        return -1.0f;
    }

    public static void k(I0 i02, AbstractC3445z abstractC3445z, androidx.media3.common.a aVar) {
        float j10 = j(abstractC3445z, aVar);
        if (j10 == 90.0f || j10 == 180.0f || j10 == 270.0f) {
            i02.l(360 - Math.round(j10));
        }
    }

    public static boolean l(androidx.media3.common.a aVar, C6407m c6407m, int i10, V0 v02, InterfaceC6399i.b bVar, I0 i02) {
        if (c6407m.f65405a.size() > 1 || ((F) c6407m.f65405a.get(i10)).f65031a.size() > 1) {
            return !c6407m.f65409e;
        }
        if (c6407m.b() || bVar.c()) {
            return true;
        }
        String str = v02.f65179b;
        if (str != null && !str.equals(aVar.f20543o)) {
            return true;
        }
        if (v02.f65179b == null && !i02.n(aVar.f20543o)) {
            return true;
        }
        E e10 = (E) ((F) c6407m.f65405a.get(i10)).f65031a.get(0);
        return ((!e10.f65016d || !a(aVar)) && e10.f65019g.f65396a.isEmpty() && c6407m.f65407c.f65396a.isEmpty()) ? false : true;
    }

    public static boolean m(androidx.media3.common.a aVar, C6407m c6407m, int i10, V0 v02, InterfaceC6399i.b bVar, I0 i02) {
        if (c6407m.f65405a.size() > 1 || ((F) c6407m.f65405a.get(i10)).f65031a.size() > 1) {
            return !c6407m.f65410f;
        }
        if (bVar.a() || v02.f65181d != 0) {
            return true;
        }
        String str = v02.f65180c;
        if (str != null && !str.equals(aVar.f20543o) && !str.equals(AbstractC6610O.g(aVar))) {
            return true;
        }
        if ((str == null && !i02.n(aVar.f20543o) && !i02.n(AbstractC6610O.g(aVar))) || aVar.f20514B != 1.0f) {
            return true;
        }
        AbstractC3445z m10 = new AbstractC3445z.a().k(((E) ((F) c6407m.f65405a.get(i10)).f65031a.get(0)).f65019g.f65397b).k(c6407m.f65407c.f65397b).m();
        return !m10.isEmpty() && j(m10, aVar) == -1.0f;
    }
}
