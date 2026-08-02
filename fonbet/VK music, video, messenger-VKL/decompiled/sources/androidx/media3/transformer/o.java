package androidx.media3.transformer;

import android.content.Context;
import android.hardware.DataSpace;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.media.metrics.MediaItemInfo;
import android.media.metrics.MediaMetricsManager;
import android.os.SystemClock;
import android.util.Size;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.transformer.t;
import com.google.common.collect.ImmutableList;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import xsna.ahn;
import xsna.ar;
import xsna.d2p;
import xsna.g3p;
import xsna.h3p;
import xsna.io20;
import xsna.lc9;
import xsna.m6g;
import xsna.n2p;
import xsna.sd9;
import xsna.y2r0;

/* compiled from: EditingMetricsCollector.java */
/* loaded from: classes12.dex */
public final class o {
    public static final SparseIntArray f;
    public static final SparseIntArray g;
    public static final SparseIntArray h;
    public static final SparseIntArray i;
    public final long a = SystemClock.elapsedRealtime();
    public final boolean b;
    public final boolean c;

    @Nullable
    public final String d;
    public final b e;

    /* compiled from: EditingMetricsCollector.java */
    public static final class a implements b {

        @Nullable
        public EditingSession b;
        public boolean c;

        /* compiled from: EditingMetricsCollector.java */
        /* renamed from: androidx.media3.transformer.o$a$a, reason: collision with other inner class name */
        public static final class C0072a implements b.a {
            public final Context a;

            public C0072a(Context context) {
                this.a = context;
            }

            @Override // androidx.media3.transformer.o.b.a
            public final a create() {
                EditingSession createEditingSession;
                a aVar = new a();
                MediaMetricsManager a = lc9.a(this.a.getSystemService("media_metrics"));
                if (a != null) {
                    createEditingSession = a.createEditingSession();
                    aVar.b = createEditingSession;
                }
                return aVar;
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            EditingSession editingSession = this.b;
            if (editingSession != null) {
                editingSession.close();
                this.b = null;
            }
        }
    }

    /* compiled from: EditingMetricsCollector.java */
    public interface b extends AutoCloseable {

        /* compiled from: EditingMetricsCollector.java */
        public interface a {
            a create();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        g = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        h = sparseIntArray3;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        i = sparseIntArray4;
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
        sparseIntArray.put(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE, 13);
        sparseIntArray.put(4001, 14);
        sparseIntArray.put(4002, 15);
        sparseIntArray.put(4003, 16);
        sparseIntArray.put(IronSourceConstants.errorCode_biddingDataException, 17);
        sparseIntArray.put(AuthCode.StatusCode.WAITING_CONNECT, 18);
        sparseIntArray.put(7001, 19);
        sparseIntArray.put(7002, 2);
        sparseIntArray2.put(-1, 0);
        sparseIntArray2.put(2, 131072);
        sparseIntArray2.put(1, 65536);
        sparseIntArray2.put(6, 393216);
        sparseIntArray3.put(-1, 0);
        sparseIntArray3.put(2, 268435456);
        sparseIntArray3.put(1, 134217728);
        sparseIntArray4.put(-1, 0);
        sparseIntArray4.put(1, 4194304);
        sparseIntArray4.put(3, 12582912);
        sparseIntArray4.put(2, 8388608);
        sparseIntArray4.put(10, C.DEFAULT_MUXED_BUFFER_SIZE);
        sparseIntArray4.put(6, 29360128);
        sparseIntArray4.put(7, 33554432);
    }

    public o(b bVar, @Nullable String str, boolean z, boolean z2) {
        this.e = bVar;
        this.d = str;
        this.b = z;
        this.c = z2;
    }

    public static long b(@Nullable String str) {
        long j = io20.l(str) ? 4L : 0L;
        if (io20.p(str)) {
            j |= 2;
        }
        return io20.n(str) ? j | 1 : j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList c(ImmutableList immutableList) {
        MediaItemInfo build;
        int pack;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            t.b bVar = (t.b) immutableList.get(i2);
            MediaItemInfo.Builder a2 = n2p.a();
            a2.setClipDurationMillis(y2r0.j0(bVar.a));
            String str = bVar.e;
            if (str != null) {
                a2.addCodecName(str);
            }
            String str2 = bVar.d;
            if (str2 != null) {
                a2.addCodecName(str2);
            }
            androidx.media3.common.a aVar = bVar.c;
            if (aVar != null) {
                String str3 = aVar.n;
                String str4 = aVar.m;
                if (str4 != null) {
                    a2.setContainerMimeType(str4);
                }
                if (str3 != null) {
                    a2.addSampleMimeType(str3);
                    a2.addDataType(b(str3));
                }
                float f2 = aVar.y;
                if (f2 != -1.0f) {
                    a2.setVideoFrameRate(f2);
                }
                int i3 = aVar.u;
                if (i3 == -1) {
                    i3 = -1;
                }
                int i4 = aVar.v;
                if (i4 == -1) {
                    i4 = -1;
                }
                a2.setVideoSize(new Size(i3, i4));
                m6g m6gVar = aVar.D;
                if (m6gVar != null) {
                    pack = DataSpace.pack(g.get(m6gVar.a, 0), i.get(m6gVar.c, 0), h.get(m6gVar.b, 0));
                    a2.setVideoDataSpace(pack);
                }
            }
            androidx.media3.common.a aVar2 = bVar.b;
            if (aVar2 != null) {
                String str5 = aVar2.n;
                if (str5 != null) {
                    a2.addSampleMimeType(str5);
                    a2.addDataType(b(str5));
                }
                int i5 = aVar2.F;
                if (i5 != -1) {
                    a2.setAudioChannelCount(i5);
                }
                int i6 = aVar2.G;
                if (i6 != -1) {
                    a2.setAudioSampleRateHz(i6);
                }
            }
            build = a2.build();
            arrayList.add(build);
        }
        return arrayList;
    }

    public static MediaItemInfo d(t tVar) {
        MediaItemInfo build;
        int pack;
        MediaItemInfo.Builder a2 = n2p.a();
        long j = tVar.a;
        String str = tVar.n;
        String str2 = tVar.g;
        if (j != C.TIME_UNSET) {
            a2.setDurationMillis(j);
        }
        if (str2 != null) {
            a2.addSampleMimeType(str2);
            a2.addDataType(b(str2));
        }
        if (str != null) {
            a2.addSampleMimeType(str);
            a2.addDataType(b(str));
        }
        int i2 = tVar.d;
        if (i2 != -1) {
            a2.setAudioChannelCount(i2);
        }
        int i3 = tVar.e;
        if (i3 != -2147483647) {
            a2.setAudioSampleRateHz(i3);
        }
        String str3 = tVar.f;
        if (str3 != null) {
            a2.addCodecName(str3);
        }
        String str4 = tVar.m;
        if (str4 != null) {
            a2.addCodecName(str4);
        }
        a2.setVideoSampleCount(tVar.l);
        int i4 = tVar.k;
        if (i4 == -1) {
            i4 = -1;
        }
        int i5 = tVar.j;
        a2.setVideoSize(new Size(i4, i5 != -1 ? i5 : -1));
        m6g m6gVar = tVar.i;
        if (m6gVar != null) {
            pack = DataSpace.pack(g.get(m6gVar.a, 0), i.get(m6gVar.c, 0), h.get(m6gVar.b, 0));
            a2.setVideoDataSpace(pack);
        }
        build = a2.build();
        return build;
    }

    public final EditingEndedEvent.Builder a(int i2) {
        EditingEndedEvent.Builder timeSinceCreatedMillis;
        EditingEndedEvent.Builder exporterName;
        timeSinceCreatedMillis = d2p.a(i2).setTimeSinceCreatedMillis(SystemClock.elapsedRealtime() - this.a);
        exporterName = timeSinceCreatedMillis.setExporterName("androidx.media3:media3-transformer:1.9.3");
        String str = this.d;
        if (str != null) {
            exporterName.setMuxerName(str);
        }
        return exporterName;
    }

    public final void e(int i2) {
        EditingEndedEvent build;
        EditingSession editingSession;
        EditingEndedEvent.Builder a2 = a(2);
        if (i2 != -1) {
            a2.setFinalProgressPercent(i2);
        }
        if (this.b) {
            a2.addOperationType(8L);
        }
        if (this.c) {
            a2.addOperationType(4L);
        }
        build = a2.build();
        b bVar = this.e;
        a aVar = (a) bVar;
        if (!aVar.c && (editingSession = aVar.b) != null) {
            editingSession.reportEditingEndedEvent(build);
            aVar.c = true;
        }
        try {
            ar.d(bVar);
        } catch (Exception e) {
            ahn.o("EditingMetricsCollector", "error while closing the metrics reporter", e);
        }
    }

    public final void f(EditingEndedEvent.Builder builder, t tVar, boolean z) {
        ImmutableList<t.b> immutableList = tVar.q;
        if (z) {
            builder.addOperationType(128L);
        }
        boolean e = sd9.e(immutableList, new g3p());
        boolean e2 = sd9.e(immutableList, new h3p());
        if (e) {
            if (tVar.f != null) {
                builder.addOperationType(2L);
            } else {
                builder.addOperationType(32L);
            }
        }
        if (e2) {
            if (tVar.m != null) {
                builder.addOperationType(1L);
            } else {
                builder.addOperationType(16L);
            }
        }
        if (this.b) {
            builder.addOperationType(8L);
        }
        if (this.c) {
            builder.addOperationType(4L);
        }
    }
}
