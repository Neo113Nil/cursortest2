package t2;

import android.content.Context;
import android.hardware.DataSpace;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaItemInfo;
import android.media.metrics.MediaMetricsManager;
import android.util.Size;
import android.util.SparseIntArray;
import b1.AbstractC2335D;
import b1.C2357k;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4156x;
import e1.InterfaceC4143j;
import java.util.ArrayList;
import java.util.List;
import n1.s1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t2.C6429x0;

/* renamed from: t2.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6396g0 {

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f65319e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f65320f;

    /* renamed from: g, reason: collision with root package name */
    public static final SparseIntArray f65321g;

    /* renamed from: h, reason: collision with root package name */
    public static final SparseIntArray f65322h;

    /* renamed from: a, reason: collision with root package name */
    public final long f65323a = InterfaceC4143j.f45530a.b();

    /* renamed from: b, reason: collision with root package name */
    public final String f65324b;

    /* renamed from: c, reason: collision with root package name */
    public final String f65325c;

    /* renamed from: d, reason: collision with root package name */
    public final c f65326d;

    /* renamed from: t2.g0$b */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public EditingSession f65327a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f65328b;

        /* renamed from: t2.g0$b$a */
        public static final class a implements c.a {

            /* renamed from: a, reason: collision with root package name */
            public final Context f65329a;

            public a(Context context) {
                this.f65329a = context;
            }

            @Override // t2.C6396g0.c.a
            public c create() {
                return new b(this.f65329a);
            }
        }

        @Override // t2.C6396g0.c
        public void L1(EditingEndedEvent editingEndedEvent) {
            EditingSession editingSession;
            if (this.f65328b || (editingSession = this.f65327a) == null) {
                return;
            }
            editingSession.reportEditingEndedEvent(editingEndedEvent);
            this.f65328b = true;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            EditingSession editingSession = this.f65327a;
            if (editingSession != null) {
                editingSession.close();
                this.f65327a = null;
            }
        }

        public LogSessionId d() {
            LogSessionId sessionId;
            EditingSession editingSession = this.f65327a;
            if (editingSession == null) {
                return null;
            }
            sessionId = editingSession.getSessionId();
            return sessionId;
        }

        public b(Context context) {
            EditingSession createEditingSession;
            MediaMetricsManager a10 = s1.a(context.getSystemService("media_metrics"));
            if (a10 != null) {
                createEditingSession = a10.createEditingSession();
                this.f65327a = createEditingSession;
            }
        }
    }

    /* renamed from: t2.g0$c */
    public interface c extends AutoCloseable {

        /* renamed from: t2.g0$c$a */
        public interface a {
            c create();
        }

        void L1(EditingEndedEvent editingEndedEvent);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f65319e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f65320f = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f65321g = sparseIntArray3;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        f65322h = sparseIntArray4;
        sparseIntArray.put(1000, 1);
        sparseIntArray.put(1001, 2);
        sparseIntArray.put(2000, 3);
        sparseIntArray.put(2001, 4);
        sparseIntArray.put(2002, 5);
        sparseIntArray.put(2003, 3);
        sparseIntArray.put(2004, 6);
        sparseIntArray.put(2005, 7);
        sparseIntArray.put(2006, 8);
        sparseIntArray.put(2007, 9);
        sparseIntArray.put(2008, 10);
        sparseIntArray.put(3001, 11);
        sparseIntArray.put(3002, 12);
        sparseIntArray.put(3003, 13);
        sparseIntArray.put(4001, 14);
        sparseIntArray.put(4002, 15);
        sparseIntArray.put(4003, 16);
        sparseIntArray.put(5001, 17);
        sparseIntArray.put(6001, 18);
        sparseIntArray.put(7001, 19);
        sparseIntArray.put(7002, 2);
        sparseIntArray2.put(-1, 0);
        sparseIntArray2.put(2, PKIFailureInfo.unsupportedVersion);
        sparseIntArray2.put(1, PKIFailureInfo.notAuthorized);
        sparseIntArray2.put(6, 393216);
        sparseIntArray3.put(-1, 0);
        sparseIntArray3.put(2, 268435456);
        sparseIntArray3.put(1, 134217728);
        sparseIntArray4.put(-1, 0);
        sparseIntArray4.put(1, 4194304);
        sparseIntArray4.put(3, 12582912);
        sparseIntArray4.put(2, 8388608);
        sparseIntArray4.put(10, 16777216);
        sparseIntArray4.put(6, 29360128);
        sparseIntArray4.put(7, 33554432);
    }

    public C6396g0(c cVar, String str, String str2) {
        this.f65326d = cVar;
        this.f65324b = str;
        this.f65325c = str2;
    }

    public static long b(String str) {
        long j10 = AbstractC2335D.o(str) ? 4L : 0L;
        if (AbstractC2335D.t(str)) {
            j10 |= 2;
        }
        return AbstractC2335D.q(str) ? j10 | 1 : j10;
    }

    public static int c(int i10) {
        return f65319e.get(i10, 1);
    }

    public static List d(AbstractC3445z abstractC3445z) {
        MediaItemInfo build;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < abstractC3445z.size(); i10++) {
            C6429x0.c cVar = (C6429x0.c) abstractC3445z.get(i10);
            MediaItemInfo.Builder a10 = G.a();
            a10.setClipDurationMillis(e1.Z.J1(cVar.f65648b));
            String str = cVar.f65652f;
            if (str != null) {
                a10.addCodecName(str);
            }
            String str2 = cVar.f65651e;
            if (str2 != null) {
                a10.addCodecName(str2);
            }
            androidx.media3.common.a aVar = cVar.f65650d;
            if (aVar != null) {
                String str3 = aVar.f20542n;
                if (str3 != null) {
                    a10.setContainerMimeType(str3);
                }
                String str4 = aVar.f20543o;
                if (str4 != null) {
                    a10.addSampleMimeType(str4);
                    a10.addDataType(b(aVar.f20543o));
                }
                float f10 = aVar.f20554z;
                if (f10 != -1.0f) {
                    a10.setVideoFrameRate(f10);
                }
                int i11 = aVar.f20550v;
                if (i11 == -1) {
                    i11 = -1;
                }
                int i12 = aVar.f20551w;
                if (i12 == -1) {
                    i12 = -1;
                }
                a10.setVideoSize(new Size(i11, i12));
                C2357k c2357k = aVar.f20516D;
                if (c2357k != null) {
                    a10.setVideoDataSpace(f(c2357k));
                }
            }
            androidx.media3.common.a aVar2 = cVar.f65649c;
            if (aVar2 != null) {
                String str5 = aVar2.f20543o;
                if (str5 != null) {
                    a10.addSampleMimeType(str5);
                    a10.addDataType(b(aVar2.f20543o));
                }
                int i13 = aVar2.f20518F;
                if (i13 != -1) {
                    a10.setAudioChannelCount(i13);
                }
                int i14 = aVar2.f20519G;
                if (i14 != -1) {
                    a10.setAudioSampleRateHz(i14);
                }
            }
            build = a10.build();
            arrayList.add(build);
        }
        return arrayList;
    }

    public static MediaItemInfo e(C6429x0 c6429x0) {
        MediaItemInfo build;
        MediaItemInfo.Builder a10 = G.a();
        long j10 = c6429x0.f65611a;
        if (j10 != -9223372036854775807L) {
            a10.setDurationMillis(j10);
        }
        String str = c6429x0.f65617g;
        if (str != null) {
            a10.addSampleMimeType(str);
            a10.addDataType(b(c6429x0.f65617g));
        }
        String str2 = c6429x0.f65624n;
        if (str2 != null) {
            a10.addSampleMimeType(str2);
            a10.addDataType(b(c6429x0.f65624n));
        }
        int i10 = c6429x0.f65614d;
        if (i10 != -1) {
            a10.setAudioChannelCount(i10);
        }
        int i11 = c6429x0.f65615e;
        if (i11 != -2147483647) {
            a10.setAudioSampleRateHz(i11);
        }
        String str3 = c6429x0.f65616f;
        if (str3 != null) {
            a10.addCodecName(str3);
        }
        String str4 = c6429x0.f65623m;
        if (str4 != null) {
            a10.addCodecName(str4);
        }
        a10.setVideoSampleCount(c6429x0.f65622l);
        int i12 = c6429x0.f65621k;
        if (i12 == -1) {
            i12 = -1;
        }
        int i13 = c6429x0.f65620j;
        a10.setVideoSize(new Size(i12, i13 != -1 ? i13 : -1));
        C2357k c2357k = c6429x0.f65619i;
        if (c2357k != null) {
            a10.setVideoDataSpace(f(c2357k));
        }
        build = a10.build();
        return build;
    }

    public static int f(C2357k c2357k) {
        int pack;
        pack = DataSpace.pack(f65320f.get(c2357k.f24604a, 0), f65322h.get(c2357k.f24606c, 0), f65321g.get(c2357k.f24605b, 0));
        return pack;
    }

    public final EditingEndedEvent.Builder a(int i10) {
        EditingEndedEvent.Builder timeSinceCreatedMillis;
        EditingEndedEvent.Builder exporterName;
        timeSinceCreatedMillis = S.a(i10).setTimeSinceCreatedMillis(InterfaceC4143j.f45530a.b() - this.f65323a);
        exporterName = timeSinceCreatedMillis.setExporterName(this.f65324b);
        String str = this.f65325c;
        if (str != null) {
            exporterName.setMuxerName(str);
        }
        return exporterName;
    }

    public void g(int i10) {
        EditingEndedEvent build;
        EditingEndedEvent.Builder a10 = a(2);
        if (i10 != -1) {
            a10.setFinalProgressPercent(i10);
        }
        c cVar = this.f65326d;
        build = a10.build();
        cVar.L1(build);
        try {
            androidx.core.content.res.e.a(this.f65326d);
        } catch (Exception e10) {
            AbstractC4156x.e("EditingMetricsCollector", "error while closing the metrics reporter", e10);
        }
    }

    public void h(int i10, C6427w0 c6427w0, C6429x0 c6429x0) {
        EditingEndedEvent.Builder errorCode;
        EditingEndedEvent build;
        errorCode = a(3).setErrorCode(c(c6427w0.f65602a));
        if (i10 != -1) {
            errorCode.setFinalProgressPercent(i10);
        }
        List d10 = d(c6429x0.f65629s);
        for (int i11 = 0; i11 < d10.size(); i11++) {
            errorCode.addInputMediaItemInfo(AbstractC6392e0.a(d10.get(i11)));
        }
        errorCode.setOutputMediaItemInfo(e(c6429x0));
        c cVar = this.f65326d;
        build = errorCode.build();
        cVar.L1(build);
        try {
            androidx.core.content.res.e.a(this.f65326d);
        } catch (Exception e10) {
            AbstractC4156x.e("EditingMetricsCollector", "error while closing the metrics reporter", e10);
        }
    }

    public void i(C6429x0 c6429x0) {
        EditingEndedEvent.Builder finalProgressPercent;
        EditingEndedEvent build;
        finalProgressPercent = a(1).setFinalProgressPercent(100.0f);
        List d10 = d(c6429x0.f65629s);
        for (int i10 = 0; i10 < d10.size(); i10++) {
            finalProgressPercent.addInputMediaItemInfo(AbstractC6392e0.a(d10.get(i10)));
        }
        finalProgressPercent.setOutputMediaItemInfo(e(c6429x0));
        c cVar = this.f65326d;
        build = finalProgressPercent.build();
        cVar.L1(build);
        try {
            androidx.core.content.res.e.a(this.f65326d);
        } catch (Exception e10) {
            AbstractC4156x.e("EditingMetricsCollector", "error while closing the metrics reporter", e10);
        }
    }
}
