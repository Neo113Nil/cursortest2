package v1;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b1.AbstractC2335D;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4144k;
import e1.AbstractC4156x;
import e1.Z;
import f1.AbstractC4230h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import v1.AbstractC6610O;

/* renamed from: v1.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6610O {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f66908a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static int f66909b = -1;

    /* renamed from: v1.O$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f66910a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f66911b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f66912c;

        public b(String str, boolean z10, boolean z11) {
            this.f66910a = str;
            this.f66911b = z10;
            this.f66912c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f66910a, bVar.f66910a) && this.f66911b == bVar.f66911b && this.f66912c == bVar.f66912c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f66910a.hashCode() + 31) * 31) + (this.f66911b ? 1231 : 1237)) * 31) + (this.f66912c ? 1231 : 1237);
        }
    }

    /* renamed from: v1.O$c */
    public static class c extends Exception {
        public c(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    /* renamed from: v1.O$d */
    public interface d {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* renamed from: v1.O$e */
    public static final class e implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f66913a;
        private MediaCodecInfo[] mediaCodecInfos;

        public e(boolean z10, boolean z11, boolean z12) {
            this.f66913a = (z10 || z11 || z12) ? 1 : 0;
        }

        @Override // v1.AbstractC6610O.d
        public MediaCodecInfo a(int i10) {
            f();
            return this.mediaCodecInfos[i10];
        }

        @Override // v1.AbstractC6610O.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // v1.AbstractC6610O.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // v1.AbstractC6610O.d
        public int d() {
            f();
            return this.mediaCodecInfos.length;
        }

        @Override // v1.AbstractC6610O.d
        public boolean e() {
            return true;
        }

        public final void f() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new MediaCodecList(this.f66913a).getCodecInfos();
            }
        }
    }

    /* renamed from: v1.O$f */
    public interface f {
        int a(Object obj);
    }

    public static boolean A(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return B(mediaCodecInfo);
        }
        String e10 = Ra.c.e(mediaCodecInfo.getName());
        return (e10.startsWith("omx.google.") || e10.startsWith("c2.android.") || e10.startsWith("c2.google.")) ? false : true;
    }

    public static boolean B(MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    public static void C(List list, final f fVar) {
        Collections.sort(list, new Comparator() { // from class: v1.K
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC6610O.a(AbstractC6610O.f.this, obj, obj2);
            }
        });
    }

    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static /* synthetic */ int b(t tVar) {
        return (tVar.f66994i ? 2 : 0) + (!tVar.f66995j ? 1 : 0);
    }

    public static /* synthetic */ int c(androidx.media3.common.a aVar, t tVar) {
        return tVar.o(aVar) ? 1 : 0;
    }

    public static /* synthetic */ int d(t tVar) {
        String str = tVar.f66986a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int e(androidx.media3.common.a aVar, t tVar) {
        try {
            return tVar.p(aVar) ? 1 : 0;
        } catch (c unused) {
            return -1;
        }
    }

    public static void f(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && ((t) list.get(0)).f66986a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(t.E("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            C(list, new f() { // from class: v1.J
                @Override // v1.AbstractC6610O.f
                public final int a(Object obj) {
                    return AbstractC6610O.d((t) obj);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((t) list.get(0)).f66986a)) {
            return;
        }
        list.add((t) list.remove(0));
    }

    public static String g(androidx.media3.common.a aVar) {
        Pair j10;
        if ("audio/eac3-joc".equals(aVar.f20543o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(aVar.f20543o) && (j10 = j(aVar)) != null) {
            int intValue = ((Integer) j10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(aVar.f20543o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List h(InterfaceC6600E interfaceC6600E, androidx.media3.common.a aVar, boolean z10, boolean z11) {
        String g10 = g(aVar);
        return g10 == null ? AbstractC3445z.t() : interfaceC6600E.b(g10, z10, z11);
    }

    public static String i(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static Pair j(androidx.media3.common.a aVar) {
        return AbstractC4144k.w(aVar);
    }

    public static t k(String str, boolean z10, boolean z11) {
        List l10 = l(str, z10, z11);
        if (l10.isEmpty()) {
            return null;
        }
        return (t) l10.get(0);
    }

    public static synchronized List l(String str, boolean z10, boolean z11) {
        synchronized (AbstractC6610O.class) {
            try {
                b bVar = new b(str, z10, z11);
                HashMap hashMap = f66908a;
                List list = (List) hashMap.get(bVar);
                if (list != null) {
                    return list;
                }
                ArrayList m10 = m(bVar, new e(z10, z11, str.equals("video/mv-hevc")));
                if (z10) {
                    m10.isEmpty();
                }
                f(str, m10);
                AbstractC3445z o10 = AbstractC3445z.o(m10);
                hashMap.put(bVar, o10);
                return o10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ArrayList m(b bVar, d dVar) {
        String i10;
        String str;
        int i11;
        d dVar2 = dVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = bVar.f66910a;
            int d10 = dVar2.d();
            boolean e10 = dVar2.e();
            int i12 = 0;
            while (i12 < d10) {
                MediaCodecInfo a10 = dVar2.a(i12);
                if (t(a10)) {
                    i11 = i12;
                } else {
                    int i13 = i12;
                    String name = a10.getName();
                    if (v(a10, name, e10, str2) && (i10 = i(a10, name, str2)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = a10.getCapabilitiesForType(i10);
                            boolean b10 = dVar2.b("tunneled-playback", i10, capabilitiesForType);
                            boolean c10 = dVar2.c("tunneled-playback", i10, capabilitiesForType);
                            boolean z10 = bVar.f66912c;
                            if ((z10 || !c10) && (!z10 || b10)) {
                                boolean b11 = dVar2.b("secure-playback", i10, capabilitiesForType);
                                boolean c11 = dVar2.c("secure-playback", i10, capabilitiesForType);
                                boolean z11 = bVar.f66911b;
                                if ((z11 || !c11) && (!z11 || b11)) {
                                    try {
                                        boolean w10 = w(a10, str2);
                                        boolean y10 = y(a10, str2);
                                        boolean A10 = A(a10);
                                        try {
                                            if (e10) {
                                                if (bVar.f66911b != b11) {
                                                }
                                                str = i10;
                                                i11 = i13;
                                                arrayList.add(t.E(name, str2, str, capabilitiesForType, w10, y10, A10, false, false));
                                            }
                                            arrayList.add(t.E(name, str2, str, capabilitiesForType, w10, y10, A10, false, false));
                                        } catch (Exception e11) {
                                            e = e11;
                                            AbstractC4156x.d("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                        if (e10 || bVar.f66911b) {
                                            str = i10;
                                            i11 = i13;
                                            if (!e10 && b11) {
                                                try {
                                                    try {
                                                        arrayList.add(t.E(name + ".secure", str2, str, capabilitiesForType, w10, y10, A10, false, true));
                                                        return arrayList;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        name = name;
                                                        AbstractC4156x.d("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                        throw e;
                                                    }
                                                } catch (Exception e13) {
                                                    e = e13;
                                                }
                                            }
                                        }
                                        str = i10;
                                        i11 = i13;
                                    } catch (Exception e14) {
                                        e = e14;
                                        str = i10;
                                    }
                                }
                            }
                            i11 = i13;
                        } catch (Exception e15) {
                            e = e15;
                            str = i10;
                        }
                    } else {
                        i11 = i13;
                    }
                }
                i12 = i11 + 1;
                dVar2 = dVar;
            }
            return arrayList;
        } catch (Exception e16) {
            throw new c(e16);
        }
    }

    public static List n(InterfaceC6600E interfaceC6600E, androidx.media3.common.a aVar, boolean z10, boolean z11) {
        List b10 = interfaceC6600E.b(aVar.f20543o, z10, z11);
        return AbstractC3445z.k().k(b10).k(h(interfaceC6600E, aVar, z10, z11)).m();
    }

    public static List o(List list, final androidx.media3.common.a aVar) {
        ArrayList arrayList = new ArrayList(list);
        C(arrayList, new f() { // from class: v1.M
            @Override // v1.AbstractC6610O.f
            public final int a(Object obj) {
                return AbstractC6610O.c(androidx.media3.common.a.this, (t) obj);
            }
        });
        return arrayList;
    }

    public static List p(List list, final androidx.media3.common.a aVar) {
        ArrayList arrayList = new ArrayList(list);
        C(arrayList, new f() { // from class: v1.N
            @Override // v1.AbstractC6610O.f
            public final int a(Object obj) {
                return AbstractC6610O.e(androidx.media3.common.a.this, (t) obj);
            }
        });
        return arrayList;
    }

    public static List q(List list) {
        ArrayList arrayList = new ArrayList(list);
        C(arrayList, new f() { // from class: v1.L
            @Override // v1.AbstractC6610O.f
            public final int a(Object obj) {
                return AbstractC6610O.b((t) obj);
            }
        });
        return AbstractC3445z.o(arrayList);
    }

    public static t r() {
        return k("audio/raw", false, false);
    }

    public static Pair s(androidx.media3.common.a aVar) {
        String h10 = AbstractC4230h.h(aVar.f20546r);
        if (h10 == null) {
            return null;
        }
        return AbstractC4144k.z(h10, Z.A1(h10.trim(), "\\."), aVar.f20516D);
    }

    public static boolean t(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 29 && u(mediaCodecInfo);
    }

    public static boolean u(MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    public static boolean v(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        return z10 || !str.endsWith(".secure");
    }

    public static boolean w(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? x(mediaCodecInfo) : !y(mediaCodecInfo, str);
    }

    public static boolean x(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    public static boolean y(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return z(mediaCodecInfo);
        }
        if (AbstractC2335D.o(str)) {
            return true;
        }
        String e10 = Ra.c.e(mediaCodecInfo.getName());
        if (e10.startsWith("arc.")) {
            return false;
        }
        return e10.startsWith("omx.google.") || e10.startsWith("omx.ffmpeg.") || (e10.startsWith("omx.sec.") && e10.contains(".sw.")) || e10.equals("omx.qcom.video.decoder.hevcswvdec") || e10.startsWith("c2.android.") || e10.startsWith("c2.google.") || !(e10.startsWith("omx.") || e10.startsWith("c2."));
    }

    public static boolean z(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }
}
