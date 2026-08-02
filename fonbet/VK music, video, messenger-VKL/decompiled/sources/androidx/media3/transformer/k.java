package androidx.media3.transformer;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.util.Size;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.transformer.ExportException;
import androidx.media3.transformer.c0;
import androidx.media3.transformer.e;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import xsna.cjs0;
import xsna.efz;
import xsna.fel;
import xsna.fxc0;
import xsna.gjp;
import xsna.hel;
import xsna.hjp;
import xsna.hr10;
import xsna.io20;
import xsna.ipx;
import xsna.iwx;
import xsna.jxc0;
import xsna.kn4;
import xsna.l4;
import xsna.lhg;
import xsna.m6g;
import xsna.ve;

/* compiled from: DefaultEncoderFactory.java */
/* loaded from: classes12.dex */
public final class k implements e.b {
    public final Context a;
    public final l4 b;
    public final cjs0 c;
    public final kn4 d;
    public final boolean e;
    public final int f;

    /* compiled from: DefaultEncoderFactory.java */
    public static final class a {
        public final Context a;
        public final l4 b = gjp.n7;
        public final cjs0 c = cjs0.l;
        public final kn4 d = kn4.b;
        public final boolean e = true;
        public final int f = -2000;

        public a(Context context) {
            this.a = context.getApplicationContext();
        }
    }

    /* compiled from: DefaultEncoderFactory.java */
    public interface b {
        int b(MediaCodecInfo mediaCodecInfo);
    }

    /* compiled from: DefaultEncoderFactory.java */
    public static class c {
        public final MediaCodecInfo a;
        public final androidx.media3.common.a b;

        public c(MediaCodecInfo mediaCodecInfo, androidx.media3.common.a aVar) {
            this.a = mediaCodecInfo;
            this.b = aVar;
        }
    }

    /* compiled from: DefaultEncoderFactory.java */
    public static final class d extends c {
        public final cjs0 c;

        public d(MediaCodecInfo mediaCodecInfo, androidx.media3.common.a aVar, cjs0 cjs0Var) {
            super(mediaCodecInfo, aVar);
            this.c = cjs0Var;
        }
    }

    public k(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    public static ExportException e(androidx.media3.common.a aVar, String str) {
        return ExportException.c(new IllegalArgumentException(str), 4003, new ExportException.a(aVar.toString(), null, io20.p(aVar.n), false));
    }

    public static ExportException f(androidx.media3.common.a aVar, boolean z) {
        String str;
        m6g m6gVar = aVar.D;
        if (z && m6g.h(m6gVar)) {
            str = "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: " + m6gVar;
        } else {
            str = "No MIME type is supported by both encoder and muxer.";
        }
        return ExportException.c(new IllegalArgumentException(str), 4003, new ExportException.a(aVar.toString(), null, z, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ImmutableList g(ImmutableList immutableList, b bVar) {
        ArrayList arrayList = new ArrayList(immutableList.size());
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) immutableList.get(i2);
            int b2 = bVar.b(mediaCodecInfo);
            if (b2 != Integer.MAX_VALUE) {
                if (b2 < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = b2;
                } else if (b2 == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return ImmutableList.m(arrayList);
    }

    @Override // androidx.media3.transformer.e.b
    public final boolean a() {
        return !this.c.equals(cjs0.l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0364, code lost:
    
        if (r1.equals("T603") != false) goto L151;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e8  */
    @Override // androidx.media3.transformer.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i b(androidx.media3.common.a aVar, @Nullable LogSessionId logSessionId) throws ExportException {
        ImmutableList<MediaCodecInfo> g;
        double d2;
        int i;
        int i2;
        d dVar;
        int i3;
        String a2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        androidx.media3.common.a aVar2 = aVar;
        if (aVar2.y == -1.0f || (Build.VERSION.SDK_INT < 30 && Build.DEVICE.equals("joyeuse"))) {
            a.C0043a a3 = aVar2.a();
            a3.x = 30.0f;
            aVar2 = new androidx.media3.common.a(a3);
        }
        final int i4 = aVar2.v;
        final int i5 = aVar2.u;
        final String str8 = aVar2.n;
        m6g m6gVar = aVar2.D;
        if (str8 == null) {
            throw f(aVar2, true);
        }
        fxc0.p(i5 != -1);
        fxc0.p(i4 != -1);
        fxc0.p(aVar2.z == 0);
        this.b.getClass();
        ImmutableList<MediaCodecInfo> e = hjp.e(str8);
        jxc0 jxc0Var = new jxc0() { // from class: xsna.fjp
            @Override // xsna.jxc0
            public final boolean apply(Object obj) {
                boolean z;
                boolean isHardwareAccelerated;
                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
                ArrayListMultimap<String, MediaCodecInfo> arrayListMultimap = hjp.a;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 29) {
                    isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                    return isHardwareAccelerated;
                }
                if (i6 >= 29) {
                    z = mediaCodecInfo.isSoftwareOnly();
                } else {
                    if (!io20.l(str8)) {
                        String u = o19.u(mediaCodecInfo.getName());
                        if (u.startsWith("arc.") || (!u.startsWith("omx.google.") && !u.startsWith("omx.ffmpeg.") && ((!u.startsWith("omx.sec.") || !u.contains(".sw.")) && !u.equals("omx.qcom.video.decoder.hevcswvdec") && !u.startsWith("c2.android.") && !u.startsWith("c2.google.") && (u.startsWith("omx.") || u.startsWith("c2."))))) {
                            z = false;
                        }
                    }
                    z = true;
                }
                return !z;
            }
        };
        e.getClass();
        Iterable iwxVar = new iwx(e, jxc0Var);
        if (iwxVar instanceof Collection) {
            g = ImmutableList.m((Collection) iwxVar);
        } else {
            ve veVar = (ve) iwxVar.iterator();
            if (veVar.hasNext()) {
                Object next = veVar.next();
                if (veVar.hasNext()) {
                    ImmutableList.a aVar3 = new ImmutableList.a();
                    aVar3.c(next);
                    while (veVar.hasNext()) {
                        aVar3.c(veVar.next());
                    }
                    g = aVar3.g();
                } else {
                    g = ImmutableList.p(next);
                }
            } else {
                g = com.google.common.collect.g.f;
            }
        }
        if (!g.isEmpty()) {
            e = g;
        }
        boolean isEmpty = e.isEmpty();
        boolean z = this.e;
        if (isEmpty) {
            dVar = null;
        } else {
            cjs0 cjs0Var = this.c;
            if (z) {
                d2 = 0.07d;
                ImmutableList m = (Build.VERSION.SDK_INT < 33 || !m6g.h(m6gVar)) ? ImmutableList.m(e) : g(e, new hel(str8, m6gVar));
                if (!m.isEmpty()) {
                    ImmutableList g2 = g(m, new b() { // from class: xsna.iel
                        @Override // androidx.media3.transformer.k.b
                        public final int b(MediaCodecInfo mediaCodecInfo) {
                            String str9 = str8;
                            int i6 = i5;
                            int i7 = i4;
                            Size g3 = hjp.g(mediaCodecInfo, str9, i6, i7);
                            if (g3 == null) {
                                return Integer.MAX_VALUE;
                            }
                            return Math.abs((i6 * i7) - (g3.getHeight() * g3.getWidth()));
                        }
                    });
                    if (!g2.isEmpty()) {
                        Size g3 = hjp.g((MediaCodecInfo) g2.get(0), str8, i5, i4);
                        g3.getClass();
                        int i6 = cjs0Var.a;
                        int i7 = cjs0Var.d;
                        int i8 = cjs0Var.c;
                        if (i6 == -1 && (i6 = aVar2.h) == -1) {
                            i6 = (int) (g3.getWidth() * g3.getHeight() * aVar2.y * 0.07d * 2.0d);
                        }
                        ImmutableList g4 = g(g2, new fel(str8, i6));
                        if (!g4.isEmpty()) {
                            final int i9 = cjs0Var.b;
                            ImmutableList g5 = g(g4, new b() { // from class: xsna.gel
                                @Override // androidx.media3.transformer.k.b
                                public final int b(MediaCodecInfo mediaCodecInfo) {
                                    ArrayListMultimap<String, MediaCodecInfo> arrayListMultimap = hjp.a;
                                    MediaCodecInfo.EncoderCapabilities encoderCapabilities = mediaCodecInfo.getCapabilitiesForType(str8).getEncoderCapabilities();
                                    encoderCapabilities.getClass();
                                    return encoderCapabilities.isBitrateModeSupported(i9) ? 0 : Integer.MAX_VALUE;
                                }
                            });
                            if (!g5.isEmpty()) {
                                int i10 = cjs0Var.b;
                                float f = cjs0Var.e;
                                int i11 = cjs0Var.f;
                                int i12 = cjs0Var.g;
                                int i13 = i6;
                                long j = cjs0Var.h;
                                int i14 = cjs0Var.i;
                                int i15 = cjs0Var.j;
                                int i16 = cjs0Var.k;
                                a.C0043a a4 = aVar2.a();
                                a4.m = io20.q(str8);
                                a4.t = g3.getWidth();
                                a4.u = g3.getHeight();
                                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) g5.get(0);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str8).getVideoCapabilities();
                                videoCapabilities.getClass();
                                int intValue = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(i13)).intValue();
                                a4.h = intValue;
                                if (i8 == -1 || i7 == -1 || i7 > hjp.b(mediaCodecInfo, str8, i8)) {
                                    i = -1;
                                    i2 = -1;
                                } else {
                                    i2 = i7;
                                    i = i8;
                                }
                                dVar = new d(mediaCodecInfo, new androidx.media3.common.a(a4), new cjs0(intValue, i10, i, i2, f, i11, i12, j, i14, i15, i16));
                                if (dVar == null) {
                                    throw e(aVar2, "The requested video encoding format is not supported.");
                                }
                                MediaCodecInfo mediaCodecInfo2 = dVar.a;
                                androidx.media3.common.a aVar4 = dVar.b;
                                cjs0 cjs0Var2 = dVar.c;
                                String str9 = aVar4.n;
                                str9.getClass();
                                if (z) {
                                    i3 = cjs0Var2.a;
                                } else {
                                    i3 = cjs0Var2.a;
                                    if (i3 == -1 && (i3 = aVar4.h) == -1) {
                                        i3 = (int) (aVar4.u * aVar4.v * aVar4.y * d2 * 2.0d);
                                    }
                                }
                                a.C0043a a5 = aVar4.a();
                                a5.h = i3;
                                androidx.media3.common.a aVar5 = new androidx.media3.common.a(a5);
                                MediaFormat a6 = hr10.a(aVar5);
                                int i17 = cjs0Var2.b;
                                int i18 = cjs0Var2.d;
                                a6.setInteger("bitrate-mode", i17);
                                a6.setInteger("frame-rate", Math.round(aVar5.y));
                                int i19 = cjs0Var2.c;
                                if (i19 != -1 && i18 != -1) {
                                    a6.setInteger(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, i19);
                                    a6.setInteger("level", i18);
                                } else if (m6g.h(m6gVar)) {
                                    m6gVar.getClass();
                                    a6.setInteger(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, ((Integer) hjp.d(m6gVar.c, str9).get(0)).intValue());
                                }
                                if (str9.equals("video/avc")) {
                                    int i20 = 8;
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        if (m6gVar != null) {
                                            com.google.common.collect.g d3 = hjp.d(m6gVar.c, "video/avc");
                                            if (!d3.isEmpty()) {
                                                i20 = ((Integer) d3.get(0)).intValue();
                                            }
                                        }
                                        int b2 = hjp.b(mediaCodecInfo2, "video/avc", i20);
                                        if (b2 != -1) {
                                            a6.setInteger(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, i20);
                                            if (!a6.containsKey("level")) {
                                                a6.setInteger("level", b2);
                                            }
                                        }
                                    } else {
                                        int b3 = hjp.b(mediaCodecInfo2, "video/avc", 8);
                                        if (b3 != -1) {
                                            a6.setInteger(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, 8);
                                            if (!a6.containsKey("level")) {
                                                a6.setInteger("level", b3);
                                            }
                                            a6.setInteger("latency", 1);
                                        }
                                    }
                                }
                                int i21 = Build.VERSION.SDK_INT;
                                if (i21 < 31 || !m6g.h(m6gVar)) {
                                    a6.setInteger("color-format", 2130708361);
                                } else {
                                    if (!ImmutableList.m(ipx.r(mediaCodecInfo2.getCapabilitiesForType(str9).colorFormats)).contains(2130750114)) {
                                        throw e(aVar2, "Encoding HDR is not supported on this device.");
                                    }
                                    a6.setInteger("color-format", 2130750114);
                                }
                                a6.setFloat("i-frame-interval", cjs0Var2.e);
                                int i22 = cjs0Var2.f;
                                int i23 = cjs0Var2.g;
                                if (i22 == -1 && i23 == -1) {
                                    a6.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 1);
                                    if (i21 >= 31 && i21 <= 34) {
                                        str = Build.SOC_MODEL;
                                        if (!str.equals("SM8550")) {
                                            str2 = Build.SOC_MODEL;
                                            if (!str2.equals("SM7450")) {
                                                str3 = Build.SOC_MODEL;
                                                if (!str3.equals("SM6450")) {
                                                    str4 = Build.SOC_MODEL;
                                                    if (!str4.equals("SC9863A")) {
                                                        str5 = Build.SOC_MODEL;
                                                        if (!str5.equals("T612")) {
                                                            str6 = Build.SOC_MODEL;
                                                            if (!str6.equals("T606")) {
                                                                str7 = Build.SOC_MODEL;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        a6.setInteger("operating-rate", 1000);
                                    }
                                    a6.setInteger("operating-rate", Integer.MAX_VALUE);
                                } else {
                                    if (i22 != -2) {
                                        a6.setInteger("operating-rate", i22);
                                    }
                                    if (i23 != -2) {
                                        a6.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, i23);
                                    }
                                }
                                long j2 = cjs0Var2.h;
                                if (j2 != -1) {
                                    a6.setLong("repeat-previous-frame-after", j2);
                                }
                                if (i21 >= 35) {
                                    a6.setInteger("importance", Math.max(0, -this.f));
                                    if (logSessionId != null) {
                                        c0.a.a(a6, logSessionId);
                                    }
                                }
                                int i24 = cjs0Var2.i;
                                if (i21 >= 29 && i24 != -1) {
                                    a6.setInteger("max-bframes", i24);
                                }
                                int i25 = cjs0Var2.j;
                                int i26 = cjs0Var2.k;
                                if (i21 >= 29 && i25 >= 0) {
                                    if (i25 == 0) {
                                        a2 = "none";
                                    } else if (i26 > 0) {
                                        Locale locale = Locale.ROOT;
                                        a2 = efz.a(i25, i26, "android.generic.", "+");
                                    } else {
                                        Locale locale2 = Locale.ROOT;
                                        a2 = lhg.a(i25, "android.generic.");
                                    }
                                    a6.setString("ts-schema", a2);
                                }
                                return new i(this.a, aVar5, a6, mediaCodecInfo2.getName(), false, null);
                            }
                        }
                    }
                }
                dVar = null;
                if (dVar == null) {
                }
            } else {
                dVar = new d(e.get(0), aVar2, cjs0Var);
            }
        }
        d2 = 0.07d;
        if (dVar == null) {
        }
    }

    @Override // androidx.media3.transformer.e.b
    public final boolean c() {
        return !this.d.equals(kn4.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.transformer.e.b
    public final i d(androidx.media3.common.a aVar, @Nullable LogSessionId logSessionId) throws ExportException {
        c cVar;
        if (aVar.j == -1) {
            a.C0043a a2 = aVar.a();
            a2.h = 131072;
            aVar = new androidx.media3.common.a(a2);
        }
        String str = aVar.n;
        if (str == null) {
            throw f(aVar, false);
        }
        MediaFormat a3 = hr10.a(aVar);
        ImmutableList<MediaCodecInfo> e = hjp.e(str);
        if (e.isEmpty()) {
            throw e(aVar, "No audio media codec found");
        }
        MediaCodecInfo mediaCodecInfo = e.get(0);
        this.d.getClass();
        if (this.e) {
            int i = aVar.G;
            if (e.isEmpty()) {
                cVar = null;
            } else {
                ArrayList arrayList = new ArrayList(e.size());
                int i2 = Integer.MAX_VALUE;
                for (int i3 = 0; i3 < e.size(); i3++) {
                    MediaCodecInfo mediaCodecInfo2 = e.get(i3);
                    int abs = Math.abs(hjp.c(mediaCodecInfo2, str, i) - i);
                    if (abs != Integer.MAX_VALUE) {
                        if (abs < i2) {
                            arrayList.clear();
                            arrayList.add(mediaCodecInfo2);
                            i2 = abs;
                        } else if (abs == i2) {
                            arrayList.add(mediaCodecInfo2);
                        }
                    }
                }
                MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) ImmutableList.m(arrayList).get(0);
                int c2 = hjp.c(mediaCodecInfo3, str, i);
                a.C0043a a4 = aVar.a();
                a4.F = c2;
                cVar = new c(mediaCodecInfo3, new androidx.media3.common.a(a4));
            }
            if (cVar != null) {
                mediaCodecInfo = cVar.a;
                aVar = cVar.b;
                a3 = hr10.a(aVar);
            }
        }
        androidx.media3.common.a aVar2 = aVar;
        MediaFormat mediaFormat = a3;
        if (Build.VERSION.SDK_INT >= 35 && logSessionId != null) {
            c0.a.a(mediaFormat, logSessionId);
        }
        return new i(this.a, aVar2, mediaFormat, mediaCodecInfo.getName(), false, null);
    }
}
