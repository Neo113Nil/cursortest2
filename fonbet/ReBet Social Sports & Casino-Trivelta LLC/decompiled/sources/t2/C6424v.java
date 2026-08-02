package t2;

import android.content.Context;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.util.Pair;
import android.view.Surface;
import b1.AbstractC2335D;
import b1.C2357k;
import com.google.common.collect.AbstractC3445z;
import com.twilio.voice.EventKeys;
import e1.AbstractC4131A;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t2.C6424v;
import t2.C6427w0;
import t2.InterfaceC6399i;
import t2.k1;
import v1.AbstractC6610O;
import v1.InterfaceC6600E;

/* renamed from: t2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6424v implements InterfaceC6399i.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f65586a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65587b;

    /* renamed from: c, reason: collision with root package name */
    public final c f65588c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65589d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65590e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC6600E f65591f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f65592g;

    /* renamed from: t2.v$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f65593a;

        /* renamed from: c, reason: collision with root package name */
        public boolean f65595c;

        /* renamed from: g, reason: collision with root package name */
        public boolean f65599g;

        /* renamed from: b, reason: collision with root package name */
        public c f65594b = new c() { // from class: t2.w
            @Override // t2.C6424v.c
            public final void a(String str, List list) {
                C6424v.b.a(str, list);
            }
        };

        /* renamed from: d, reason: collision with root package name */
        public int f65596d = -2000;

        /* renamed from: e, reason: collision with root package name */
        public boolean f65597e = false;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC6600E f65598f = InterfaceC6600E.f66903a;

        public b(Context context) {
            this.f65593a = context.getApplicationContext();
        }

        public static /* synthetic */ void a(String str, List list) {
        }

        public C6424v i() {
            return new C6424v(this);
        }
    }

    /* renamed from: t2.v$c */
    public interface c {
        void a(String str, List list);
    }

    public static void c(MediaFormat mediaFormat) {
        if (m()) {
            mediaFormat.setInteger(EventKeys.PRIORITY, 1);
        }
        mediaFormat.setInteger("operating-rate", 10000);
    }

    public static C6422u e(Context context, List list, androidx.media3.common.a aVar, MediaFormat mediaFormat, Surface surface, List list2) {
        Context context2;
        androidx.media3.common.a aVar2;
        MediaFormat mediaFormat2;
        Surface surface2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v1.t tVar = (v1.t) it.next();
            mediaFormat.setString("mime", tVar.f66988c);
            try {
                context2 = context;
                aVar2 = aVar;
                mediaFormat2 = mediaFormat;
                surface2 = surface;
                try {
                    return new C6422u(context2, aVar2, mediaFormat2, tVar.f66986a, true, surface2);
                } catch (C6427w0 e10) {
                    e = e10;
                    list2.add(e);
                    context = context2;
                    aVar = aVar2;
                    mediaFormat = mediaFormat2;
                    surface = surface2;
                }
            } catch (C6427w0 e11) {
                e = e11;
                context2 = context;
                aVar2 = aVar;
                mediaFormat2 = mediaFormat;
                surface2 = surface;
            }
        }
        throw ((C6427w0) list2.get(0));
    }

    public static C6427w0 f(androidx.media3.common.a aVar, String str) {
        return C6427w0.c(new IllegalArgumentException(str), 3003, new C6427w0.a(aVar.toString(), AbstractC2335D.t((String) AbstractC4134a.e(aVar.f20543o)), true, null));
    }

    public static boolean i(Context context) {
        return Build.VERSION.SDK_INT >= 29 && context.getApplicationInfo().targetSdkVersion >= 29;
    }

    public static boolean j(androidx.media3.common.a aVar) {
        String str;
        if (Build.VERSION.SDK_INT >= 31 || aVar.f20550v < 7680 || aVar.f20551w < 4320 || (str = aVar.f20543o) == null || !str.equals("video/hevc")) {
            return false;
        }
        String str2 = Build.MODEL;
        return str2.equals("SM-F711U1") || str2.equals("SM-F926U1");
    }

    public static boolean k(int i10) {
        if (Build.MANUFACTURER.equals("Google") && Build.ID.startsWith("TP1A")) {
            return true;
        }
        if (i10 == 7) {
            String str = Build.MODEL;
            if (str.startsWith("SM-F936") || str.startsWith("SM-F916") || str.startsWith("SM-F721") || str.equals("SM-X900")) {
                return true;
            }
        }
        return Build.VERSION.SDK_INT < 34 && i10 == 6 && Build.MODEL.startsWith("SM-F936");
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT < 30 && Build.DEVICE.equals("joyeuse");
    }

    public static boolean m() {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        str = Build.SOC_MODEL;
        if (str.equals("s5e8835")) {
            return true;
        }
        str2 = Build.SOC_MODEL;
        return str2.equals("SA8155P");
    }

    public static boolean n(androidx.media3.common.a aVar) {
        if (aVar.f20550v * aVar.f20551w < 2073600) {
            return false;
        }
        String str = Build.MODEL;
        return Ra.c.a(str, "vivo 1906") || Ra.c.a(str, "redmi 7a") || Ra.c.a(str, "redmi 8");
    }

    public final C6422u d(MediaFormat mediaFormat, androidx.media3.common.a aVar, Surface surface, boolean z10, LogSessionId logSessionId) {
        AbstractC3445z.t();
        AbstractC4134a.e(aVar.f20543o);
        try {
            List p10 = AbstractC6610O.p(AbstractC6610O.n(this.f65591f, aVar, false, false), aVar);
            if (p10.isEmpty()) {
                throw f(aVar, "No decoders for format");
            }
            if (z10) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < p10.size(); i10++) {
                    v1.t tVar = (v1.t) p10.get(i10);
                    if (!tVar.f66993h) {
                        arrayList.add(tVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    p10 = arrayList;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31 && ((v1.t) p10.get(0)).f66988c.equals("video/dolby-vision")) {
                mediaFormat.setInteger("color-transfer-request", 7);
            }
            if (i11 >= 35 && logSessionId != null) {
                k1.a.a(mediaFormat, logSessionId);
            }
            ArrayList arrayList2 = new ArrayList();
            Context context = this.f65586a;
            if (!this.f65587b) {
                p10 = p10.subList(0, 1);
            }
            C6422u e10 = e(context, p10, aVar, mediaFormat, surface, arrayList2);
            this.f65588c.a(e10.getName(), arrayList2);
            return e10;
        } catch (AbstractC6610O.c e11) {
            AbstractC4156x.e("DefaultDecoderFactory", "Error querying decoders", e11);
            throw f(aVar, "Querying codecs failed");
        }
    }

    @Override // t2.InterfaceC6399i.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C6422u a(androidx.media3.common.a aVar, LogSessionId logSessionId) {
        return d(AbstractC4131A.b(aVar), aVar, null, false, logSessionId);
    }

    @Override // t2.InterfaceC6399i.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C6422u b(androidx.media3.common.a aVar, Surface surface, boolean z10, LogSessionId logSessionId) {
        if (C2357k.i(aVar.f20516D)) {
            if (z10 && (Build.VERSION.SDK_INT < 31 || k(((C2357k) AbstractC4134a.e(aVar.f20516D)).f24606c))) {
                throw f(aVar, "Tone-mapping HDR is not supported on this device.");
            }
            if (Build.VERSION.SDK_INT < 29) {
                throw f(aVar, "Decoding HDR is not supported on this device.");
            }
        }
        if (j(aVar)) {
            throw f(aVar, "Decoding 8k is not supported on this device.");
        }
        if (l()) {
            aVar = aVar.b().f0(-1.0f).P();
        }
        androidx.media3.common.a aVar2 = aVar;
        MediaFormat b10 = AbstractC4131A.b(aVar2);
        if (i(this.f65586a)) {
            b10.setInteger("allow-frame-drop", 0);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && z10) {
            b10.setInteger("color-transfer-request", 3);
        }
        Pair j10 = AbstractC6610O.j(aVar2);
        if (j10 != null) {
            AbstractC4131A.p(b10, "profile", ((Integer) j10.first).intValue());
            AbstractC4131A.p(b10, "level", ((Integer) j10.second).intValue());
        }
        if (i10 >= 35) {
            b10.setInteger("importance", Math.max(0, -this.f65589d));
        }
        if (this.f65590e) {
            c(b10);
        }
        return d(b10, aVar2, surface, n(aVar2), logSessionId);
    }

    public boolean o() {
        return this.f65592g;
    }

    public C6424v(b bVar) {
        this.f65586a = bVar.f65593a;
        this.f65587b = bVar.f65595c;
        this.f65588c = bVar.f65594b;
        this.f65589d = bVar.f65596d;
        this.f65590e = bVar.f65597e;
        this.f65591f = bVar.f65598f;
        this.f65592g = bVar.f65599g;
    }
}
