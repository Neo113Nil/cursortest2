package t2;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.util.Size;
import androidx.media3.common.a;
import b1.AbstractC2335D;
import b1.C2357k;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.collect.AbstractC3445z;
import com.twilio.voice.EventKeys;
import e1.AbstractC4131A;
import e1.AbstractC4134a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t2.C6427w0;
import t2.InterfaceC6399i;
import t2.k1;
import t2.m1;

/* renamed from: t2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6382C implements InterfaceC6399i.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f64990a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6414p0 f64991b;

    /* renamed from: c, reason: collision with root package name */
    public final m1 f64992c;

    /* renamed from: d, reason: collision with root package name */
    public final C6385b f64993d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f64994e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f64995f;

    /* renamed from: g, reason: collision with root package name */
    public final int f64996g;

    /* renamed from: t2.C$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f64997a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC6414p0 f64998b = InterfaceC6414p0.f65490a;

        /* renamed from: c, reason: collision with root package name */
        public m1 f64999c = m1.f65432l;

        /* renamed from: d, reason: collision with root package name */
        public C6385b f65000d = C6385b.f65264c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f65001e = true;

        /* renamed from: f, reason: collision with root package name */
        public boolean f65002f = false;

        /* renamed from: g, reason: collision with root package name */
        public int f65003g = -2000;

        public b(Context context) {
            this.f64997a = context.getApplicationContext();
        }

        public C6382C h() {
            return new C6382C(this);
        }

        public b i(m1 m1Var) {
            this.f64999c = m1Var;
            return this;
        }
    }

    /* renamed from: t2.C$c */
    public interface c {
        int a(MediaCodecInfo mediaCodecInfo);
    }

    /* renamed from: t2.C$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final MediaCodecInfo f65004a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.a f65005b;

        public d(MediaCodecInfo mediaCodecInfo, androidx.media3.common.a aVar) {
            this.f65004a = mediaCodecInfo;
            this.f65005b = aVar;
        }
    }

    /* renamed from: t2.C$e */
    public static final class e extends d {

        /* renamed from: c, reason: collision with root package name */
        public final m1 f65006c;

        public e(MediaCodecInfo mediaCodecInfo, androidx.media3.common.a aVar, m1 m1Var) {
            super(mediaCodecInfo, aVar);
            this.f65006c = m1Var;
        }
    }

    public static int A(int i10, int i11, float f10) {
        return (int) (i10 * i11 * f10 * 0.07d * 2.0d);
    }

    public static /* synthetic */ int e(String str, int i10, MediaCodecInfo mediaCodecInfo) {
        return AbstractC6416q0.k(mediaCodecInfo, str, i10) ? 0 : Integer.MAX_VALUE;
    }

    public static /* synthetic */ int f(String str, C2357k c2357k, MediaCodecInfo mediaCodecInfo) {
        return AbstractC6416q0.n(mediaCodecInfo, str, (C2357k) AbstractC4134a.e(c2357k)) ? 0 : Integer.MAX_VALUE;
    }

    public static /* synthetic */ int g(String str, int i10, int i11, MediaCodecInfo mediaCodecInfo) {
        Size j10 = AbstractC6416q0.j(mediaCodecInfo, str, i10, i11);
        if (j10 == null) {
            return Integer.MAX_VALUE;
        }
        return Math.abs((i10 * i11) - (j10.getWidth() * j10.getHeight()));
    }

    public static void j(MediaFormat mediaFormat) {
        int i10 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger(EventKeys.PRIORITY, 1);
        if (i10 == 26) {
            mediaFormat.setInteger("operating-rate", 30);
        } else if (q()) {
            mediaFormat.setInteger("operating-rate", 1000);
        } else {
            mediaFormat.setInteger("operating-rate", Integer.MAX_VALUE);
        }
    }

    public static void k(C2357k c2357k, MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat) {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 8;
        if (i10 >= 29) {
            if (c2357k != null) {
                AbstractC3445z e10 = AbstractC6416q0.e("video/avc", c2357k.f24606c);
                if (!e10.isEmpty()) {
                    i11 = ((Integer) e10.get(0)).intValue();
                }
            }
            int b10 = AbstractC6416q0.b(mediaCodecInfo, "video/avc", i11);
            if (b10 != -1) {
                mediaFormat.setInteger("profile", i11);
                if (mediaFormat.containsKey("level")) {
                    return;
                }
                mediaFormat.setInteger("level", b10);
                return;
            }
            return;
        }
        if (i10 < 26 || r()) {
            int b11 = AbstractC6416q0.b(mediaCodecInfo, "video/avc", 1);
            AbstractC4134a.g(b11 != -1);
            mediaFormat.setInteger("profile", 1);
            if (mediaFormat.containsKey("level")) {
                return;
            }
            mediaFormat.setInteger("level", b11);
            return;
        }
        int b12 = AbstractC6416q0.b(mediaCodecInfo, "video/avc", 8);
        if (b12 != -1) {
            mediaFormat.setInteger("profile", 8);
            if (!mediaFormat.containsKey("level")) {
                mediaFormat.setInteger("level", b12);
            }
            mediaFormat.setInteger("latency", 1);
        }
    }

    public static C6427w0 l(androidx.media3.common.a aVar, String str) {
        return C6427w0.c(new IllegalArgumentException(str), 4003, new C6427w0.a(aVar.toString(), AbstractC2335D.t(aVar.f20543o), false, null));
    }

    public static C6427w0 o(androidx.media3.common.a aVar, boolean z10) {
        String str = "No MIME type is supported by both encoder and muxer.";
        if (z10 && C2357k.i(aVar.f20516D)) {
            str = "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: " + aVar.f20516D;
        }
        return C6427w0.c(new IllegalArgumentException(str), 4003, new C6427w0.a(aVar.toString(), z10, false, null));
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT < 30 && Build.DEVICE.equals("joyeuse");
    }

    public static boolean q() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 || i10 > 34) {
            return false;
        }
        str = Build.SOC_MODEL;
        if (str.equals("SM8550")) {
            return true;
        }
        str2 = Build.SOC_MODEL;
        if (str2.equals("SM7450")) {
            return true;
        }
        str3 = Build.SOC_MODEL;
        if (str3.equals("SM6450")) {
            return true;
        }
        str4 = Build.SOC_MODEL;
        if (str4.equals("SC9863A")) {
            return true;
        }
        str5 = Build.SOC_MODEL;
        if (str5.equals("T612")) {
            return true;
        }
        str6 = Build.SOC_MODEL;
        if (str6.equals("T606")) {
            return true;
        }
        str7 = Build.SOC_MODEL;
        return str7.equals("T603");
    }

    public static boolean r() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        String str = Build.DEVICE;
        return str.equals("ASUS_X00T_3") || str.equals("TC77");
    }

    public static AbstractC3445z s(List list, c cVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < list.size(); i11++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) list.get(i11);
            int a10 = cVar.a(mediaCodecInfo);
            if (a10 != Integer.MAX_VALUE) {
                if (a10 < i10) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i10 = a10;
                } else if (a10 == i10) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return AbstractC3445z.o(arrayList);
    }

    public static AbstractC3445z t(List list, final String str, final int i10) {
        return s(list, new c() { // from class: t2.x
            @Override // t2.C6382C.c
            public final int a(MediaCodecInfo mediaCodecInfo) {
                int abs;
                abs = Math.abs(((Integer) AbstractC6416q0.f(mediaCodecInfo, str).clamp(Integer.valueOf(r1))).intValue() - i10);
                return abs;
            }
        });
    }

    public static AbstractC3445z u(List list, final String str, final int i10) {
        return s(list, new c() { // from class: t2.y
            @Override // t2.C6382C.c
            public final int a(MediaCodecInfo mediaCodecInfo) {
                return C6382C.e(str, i10, mediaCodecInfo);
            }
        });
    }

    public static AbstractC3445z v(List list, final String str, final C2357k c2357k) {
        return (Build.VERSION.SDK_INT < 33 || !C2357k.i(c2357k)) ? AbstractC3445z.o(list) : s(list, new c() { // from class: t2.z
            @Override // t2.C6382C.c
            public final int a(MediaCodecInfo mediaCodecInfo) {
                return C6382C.f(str, c2357k, mediaCodecInfo);
            }
        });
    }

    public static AbstractC3445z w(List list, final String str, final int i10, final int i11) {
        return s(list, new c() { // from class: t2.A
            @Override // t2.C6382C.c
            public final int a(MediaCodecInfo mediaCodecInfo) {
                return C6382C.g(str, i10, i11, mediaCodecInfo);
            }
        });
    }

    public static AbstractC3445z x(List list, final String str, final int i10) {
        return s(list, new c() { // from class: t2.B
            @Override // t2.C6382C.c
            public final int a(MediaCodecInfo mediaCodecInfo) {
                int abs;
                abs = Math.abs(AbstractC6416q0.d(mediaCodecInfo, str, r1) - i10);
                return abs;
            }
        });
    }

    public static d y(androidx.media3.common.a aVar, AbstractC3445z abstractC3445z) {
        String str = (String) AbstractC4134a.e(aVar.f20543o);
        if (abstractC3445z.isEmpty()) {
            return null;
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) x(abstractC3445z, str, aVar.f20519G).get(0);
        return new d(mediaCodecInfo, aVar.b().z0(AbstractC6416q0.d(mediaCodecInfo, str, aVar.f20519G)).P());
    }

    public static e z(androidx.media3.common.a aVar, m1 m1Var, InterfaceC6414p0 interfaceC6414p0, boolean z10) {
        int i10;
        String str = (String) AbstractC4134a.e(aVar.f20543o);
        AbstractC3445z b10 = interfaceC6414p0.b(str);
        if (b10.isEmpty()) {
            return null;
        }
        if (!z10) {
            return new e((MediaCodecInfo) b10.get(0), aVar, m1Var);
        }
        AbstractC3445z v10 = v(b10, str, aVar.f20516D);
        if (v10.isEmpty()) {
            return null;
        }
        AbstractC3445z w10 = w(v10, str, aVar.f20550v, aVar.f20551w);
        if (w10.isEmpty()) {
            return null;
        }
        Size size = (Size) AbstractC4134a.e(AbstractC6416q0.j((MediaCodecInfo) w10.get(0), str, aVar.f20550v, aVar.f20551w));
        int i11 = m1Var.f65433a;
        if (i11 == -1 && (i11 = aVar.f20536h) == -1) {
            i11 = A(size.getWidth(), size.getHeight(), aVar.f20554z);
        }
        AbstractC3445z t10 = t(w10, str, i11);
        if (t10.isEmpty()) {
            return null;
        }
        AbstractC3445z u10 = u(t10, str, m1Var.f65434b);
        if (u10.isEmpty()) {
            return null;
        }
        m1.b a10 = m1Var.a();
        a.b h02 = aVar.b().y0(str).F0(size.getWidth()).h0(size.getHeight());
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) u10.get(0);
        int intValue = ((Integer) AbstractC6416q0.f(mediaCodecInfo, str).clamp(Integer.valueOf(i11))).intValue();
        a10.b(intValue);
        h02.S(intValue);
        int i12 = m1Var.f65435c;
        if (i12 == -1 || (i10 = m1Var.f65436d) == -1 || i10 > AbstractC6416q0.b(mediaCodecInfo, str, i12)) {
            a10.c(-1, -1);
        }
        return new e(mediaCodecInfo, h02.P(), a10.a());
    }

    @Override // t2.InterfaceC6399i.b
    public boolean a() {
        return !this.f64992c.equals(m1.f65432l);
    }

    @Override // t2.InterfaceC6399i.b
    public boolean c() {
        return !this.f64993d.equals(C6385b.f65264c);
    }

    @Override // t2.InterfaceC6399i.b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C6422u d(androidx.media3.common.a aVar, LogSessionId logSessionId) {
        d y10;
        if (aVar.f20538j == -1) {
            aVar = aVar.b().S(PKIFailureInfo.unsupportedVersion).P();
        }
        boolean z10 = false;
        if (aVar.f20543o == null) {
            throw o(aVar, false);
        }
        MediaFormat b10 = AbstractC4131A.b(aVar);
        AbstractC3445z h10 = AbstractC6416q0.h(aVar.f20543o);
        if (h10.isEmpty()) {
            throw l(aVar, "No audio media codec found");
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) h10.get(0);
        if (this.f64993d.f65265a != -1) {
            int i10 = 0;
            while (true) {
                if (i10 >= h10.size()) {
                    break;
                }
                MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) h10.get(i10);
                if (AbstractC6416q0.c(mediaCodecInfo2, aVar.f20543o).contains(Integer.valueOf(this.f64993d.f65265a))) {
                    if (aVar.f20543o.equals("audio/mp4a-latm")) {
                        b10.setInteger("aac-profile", this.f64993d.f65265a);
                    }
                    b10.setInteger("profile", this.f64993d.f65265a);
                    z10 = true;
                    mediaCodecInfo = mediaCodecInfo2;
                } else {
                    i10++;
                }
            }
        }
        if (!z10 && this.f64994e && (y10 = y(aVar, h10)) != null) {
            mediaCodecInfo = y10.f65004a;
            aVar = y10.f65005b;
            b10 = AbstractC4131A.b(aVar);
        }
        androidx.media3.common.a aVar2 = aVar;
        MediaFormat mediaFormat = b10;
        int i11 = this.f64993d.f65266b;
        if (i11 != -1) {
            mediaFormat.setInteger("bitrate", i11);
        }
        if (Build.VERSION.SDK_INT >= 35 && logSessionId != null) {
            k1.a.a(mediaFormat, logSessionId);
        }
        return new C6422u(this.f64990a, aVar2, mediaFormat, mediaCodecInfo.getName(), false, null);
    }

    @Override // t2.InterfaceC6399i.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C6422u b(androidx.media3.common.a aVar, LogSessionId logSessionId) {
        int i10;
        if (aVar.f20554z == -1.0f || p()) {
            aVar = aVar.b().f0(30.0f).P();
        }
        if (aVar.f20543o == null) {
            throw o(aVar, true);
        }
        AbstractC4134a.a(aVar.f20550v != -1);
        AbstractC4134a.a(aVar.f20551w != -1);
        AbstractC4134a.a(aVar.f20513A == 0);
        AbstractC4134a.i(this.f64991b);
        e z10 = z(aVar, this.f64992c, this.f64991b, this.f64994e);
        if (z10 == null) {
            throw l(aVar, "The requested video encoding format is not supported.");
        }
        MediaCodecInfo mediaCodecInfo = z10.f65004a;
        androidx.media3.common.a aVar2 = z10.f65005b;
        m1 m1Var = z10.f65006c;
        String str = (String) AbstractC4134a.e(aVar2.f20543o);
        if (this.f64995f) {
            m1 a10 = AbstractC6401j.a(aVar);
            m1.b a11 = m1Var.a();
            if (m1Var.f65441i == -1) {
                a11.d(a10.f65441i);
            }
            if (m1Var.f65442j == -1 && m1Var.f65443k == -1) {
                a11.e(a10.f65442j, a10.f65443k);
            }
            m1Var = a11.a();
        }
        if (this.f64994e) {
            i10 = m1Var.f65433a;
        } else {
            i10 = m1Var.f65433a;
            if (i10 == -1 && (i10 = aVar2.f20536h) == -1) {
                i10 = A(aVar2.f20550v, aVar2.f20551w, aVar2.f20554z);
            }
        }
        androidx.media3.common.a P10 = aVar2.b().S(i10).P();
        MediaFormat b10 = AbstractC4131A.b(P10);
        b10.setInteger("bitrate-mode", m1Var.f65434b);
        b10.setInteger("frame-rate", Math.round(P10.f20554z));
        int i11 = m1Var.f65435c;
        if (i11 != -1 && m1Var.f65436d != -1) {
            b10.setInteger("profile", i11);
            b10.setInteger("level", m1Var.f65436d);
        } else if (C2357k.i(aVar.f20516D)) {
            b10.setInteger("profile", ((Integer) AbstractC6416q0.e(str, ((C2357k) AbstractC4134a.e(aVar.f20516D)).f24606c).get(0)).intValue());
        }
        if (str.equals("video/avc")) {
            k(aVar.f20516D, mediaCodecInfo, b10);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 31 || !C2357k.i(aVar.f20516D)) {
            b10.setInteger("color-format", 2130708361);
        } else {
            if (!AbstractC6416q0.g(mediaCodecInfo, str).contains(2130750114)) {
                throw l(aVar, "Encoding HDR is not supported on this device.");
            }
            b10.setInteger("color-format", 2130750114);
        }
        b10.setFloat("i-frame-interval", m1Var.f65437e);
        int i13 = m1Var.f65438f;
        int i14 = m1Var.f65439g;
        if (i13 == -1 && i14 == -1) {
            j(b10);
        } else {
            if (i13 != -2) {
                b10.setInteger("operating-rate", i13);
            }
            if (i14 != -2) {
                b10.setInteger(EventKeys.PRIORITY, i14);
            }
        }
        long j10 = m1Var.f65440h;
        if (j10 != -1) {
            b10.setLong("repeat-previous-frame-after", j10);
        }
        if (i12 >= 35) {
            b10.setInteger("importance", Math.max(0, -this.f64996g));
            if (logSessionId != null) {
                k1.a.a(b10, logSessionId);
            }
        }
        int i15 = m1Var.f65441i;
        if (i12 >= 29 && i15 != -1) {
            b10.setInteger("max-bframes", i15);
        }
        int i16 = m1Var.f65442j;
        int i17 = m1Var.f65443k;
        if (i12 >= 29 && i16 >= 0) {
            b10.setString("ts-schema", i16 == 0 ? ViewProps.NONE : i17 > 0 ? String.format(Locale.ROOT, "android.generic.%d+%d", Integer.valueOf(i16), Integer.valueOf(i17)) : String.format(Locale.ROOT, "android.generic.%d", Integer.valueOf(i16)));
        }
        return new C6422u(this.f64990a, P10, b10, mediaCodecInfo.getName(), false, null);
    }

    public C6382C(b bVar) {
        this.f64990a = bVar.f64997a;
        this.f64991b = bVar.f64998b;
        this.f64992c = bVar.f64999c;
        this.f64993d = bVar.f65000d;
        this.f64994e = bVar.f65001e;
        this.f64995f = bVar.f65002f;
        this.f64996g = bVar.f65003g;
    }
}
