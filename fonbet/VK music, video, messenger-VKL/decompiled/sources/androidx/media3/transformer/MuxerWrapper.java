package androidx.media3.transformer;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.muxer.MuxerException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import xsna.a7l;
import xsna.ahn;
import xsna.bdx0;
import xsna.dj50;
import xsna.dm8;
import xsna.fi20;
import xsna.fxc0;
import xsna.gv2;
import xsna.io20;
import xsna.rt50;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class MuxerWrapper {
    public static final long t = y2r0.S(500);
    public final String a;
    public final dj50.a b;
    public final a c;
    public final SparseArray<b> d;

    @Nullable
    public final androidx.media3.common.a e;
    public boolean f;
    public boolean g;
    public int h;
    public long i;
    public long j;
    public long k;
    public dj50 l;
    public int m;
    public boolean n;
    public boolean o;
    public long p;
    public long q;
    public volatile int r;
    public volatile int s;

    public static final class AppendTrackFormatException extends Exception {
    }

    public interface a {
    }

    public static final class b {
        public final androidx.media3.common.a a;
        public final int b;
        public long c;
        public long d;
        public int e;
        public long f;

        public b(int i, androidx.media3.common.a aVar) {
            this.a = aVar;
            this.b = i;
        }
    }

    public MuxerWrapper(String str, dj50.a aVar, a aVar2, int i, @Nullable androidx.media3.common.a aVar3) {
        this.a = str;
        this.b = aVar;
        this.c = aVar2;
        boolean z = false;
        fxc0.p(i == 0 || i == 1);
        this.m = i;
        if ((i == 0 && aVar3 == null) || (i == 1 && aVar3 != null)) {
            z = true;
        }
        fxc0.q(z, "appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.");
        this.e = aVar3;
        this.d = new SparseArray<>();
        this.h = -2;
        this.p = C.TIME_UNSET;
        this.j = Long.MAX_VALUE;
    }

    @Nullable
    public static b c(SparseArray<b> sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        b valueAt = sparseArray.valueAt(0);
        for (int i = 1; i < sparseArray.size(); i++) {
            b valueAt2 = sparseArray.valueAt(i);
            if (valueAt2.f < valueAt.f) {
                valueAt = valueAt2;
            }
        }
        return valueAt;
    }

    public final void a(androidx.media3.common.a aVar) throws AppendTrackFormatException, MuxerException {
        int i;
        String str = aVar.n;
        int i2 = io20.i(str);
        int i3 = 0;
        fxc0.o(str, "Unsupported track format: %s", i2 == 1 || i2 == 2);
        if (i2 == 2) {
            a.C0043a a2 = aVar.a();
            a2.y = (aVar.z + this.r) % 360;
            aVar = new androidx.media3.common.a(a2);
            if (this.m == 1) {
                androidx.media3.common.a aVar2 = this.e;
                aVar2.getClass();
                boolean c = aVar.c(aVar2);
                List<byte[]> list = aVar.q;
                List<byte[]> list2 = aVar2.q;
                if (!c) {
                    if (Objects.equals(aVar2.n, "video/avc") && Objects.equals(aVar.n, "video/avc") && list2.size() == 2 && list.size() == 2 && Arrays.equals(list2.get(1), list.get(1))) {
                        byte[] bArr = list2.get(0);
                        byte[] bArr2 = list.get(0);
                        if (7 < bArr.length && bArr.length == bArr2.length) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= bArr.length) {
                                    int i5 = 0;
                                    while (true) {
                                        byte[] bArr3 = rt50.a;
                                        if (i5 < 4) {
                                            if (bArr[i5] != bArr3[i5]) {
                                                break;
                                            } else {
                                                i5++;
                                            }
                                        } else if ((bArr[4] & 31) == 7 && bArr[5] != 0) {
                                            if (bArr2[7] < bArr[7]) {
                                                list = list2;
                                            }
                                        }
                                    }
                                } else if (i4 != 7 && bArr[i4] != bArr2[i4]) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                    list = null;
                }
                if (list == null) {
                    throw new AppendTrackFormatException("Switching to MUXER_MODE_APPEND will fail.");
                }
                a.C0043a a3 = aVar.a();
                a3.p = list;
                aVar = new androidx.media3.common.a(a3);
            }
        }
        if (this.m != 2) {
            int i6 = this.s;
            fxc0.A(i6 > 0, "The track count should be set before the formats are added.");
            fxc0.A(this.d.size() < i6, "All track formats have already been added.");
            fxc0.x(i2, "There is already a track of type %s", !y2r0.l(this.d, i2));
            if (this.l == null) {
                this.l = this.b.a(this.a);
            }
            b bVar = new b(this.l.N0(aVar), aVar);
            if (i2 == 1 && (i = aVar.I) > 0) {
                this.q = y2r0.d0(i, 1000000L, aVar.G, RoundingMode.FLOOR);
            }
            this.d.put(i2, bVar);
            y2r0.H(i2);
            LinkedHashMap linkedHashMap = a7l.a;
            synchronized (a7l.class) {
            }
            if (aVar.l != null) {
                while (true) {
                    fi20.a[] aVarArr = aVar.l.a;
                    if (i3 >= aVarArr.length) {
                        break;
                    }
                    this.l.X1(aVarArr[i3]);
                    i3++;
                }
            }
            if (this.d.size() == i6) {
                this.f = true;
                return;
            }
            return;
        }
        if (i2 != 2) {
            if (i2 == 1) {
                fxc0.z(y2r0.l(this.d, 1));
                androidx.media3.common.a aVar3 = this.d.get(1).a;
                if (!Objects.equals(aVar3.n, aVar.n)) {
                    throw new AppendTrackFormatException("Audio format mismatch - sampleMimeType: " + aVar3.n + " != " + aVar.n);
                }
                if (aVar3.F != aVar.F) {
                    throw new AppendTrackFormatException("Audio format mismatch - channelCount: " + aVar3.F + " != " + aVar.F);
                }
                if (aVar3.G == aVar.G) {
                    if (!aVar3.c(aVar)) {
                        throw new AppendTrackFormatException("Audio format mismatch - initializationData.");
                    }
                    return;
                } else {
                    throw new AppendTrackFormatException("Audio format mismatch - sampleRate: " + aVar3.G + " != " + aVar.G);
                }
            }
            return;
        }
        fxc0.z(y2r0.l(this.d, 2));
        androidx.media3.common.a aVar4 = this.d.get(2).a;
        if (!Objects.equals(aVar4.n, aVar.n)) {
            throw new AppendTrackFormatException("Video format mismatch - sampleMimeType: " + aVar4.n + " != " + aVar.n);
        }
        if (aVar4.u != aVar.u) {
            throw new AppendTrackFormatException("Video format mismatch - width: " + aVar4.u + " != " + aVar.u);
        }
        if (aVar4.v != aVar.v) {
            throw new AppendTrackFormatException("Video format mismatch - height: " + aVar4.v + " != " + aVar.v);
        }
        if (aVar4.z == aVar.z) {
            androidx.media3.common.a aVar5 = this.e;
            aVar5.getClass();
            if (!aVar.c(aVar5)) {
                throw new AppendTrackFormatException("The initialization data of the newly added track format doesn't match appendVideoFormat.");
            }
            return;
        }
        throw new AppendTrackFormatException("Video format mismatch - rotationDegrees: " + aVar4.z + " != " + aVar.z);
    }

    public final void b(int i) throws MuxerException {
        if (i == 0 && this.m == 1) {
            return;
        }
        this.f = false;
        dj50 dj50Var = this.l;
        if (dj50Var != null) {
            try {
                dj50Var.close();
            } catch (MuxerException e) {
                if (i == 1) {
                    String message = e.getMessage();
                    message.getClass();
                    if (message.equals("Failed to stop the MediaMuxer")) {
                        return;
                    }
                }
                throw e;
            }
        }
    }

    public final boolean d(@Nullable String str) {
        return this.b.b(io20.i(str)).contains(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0042, code lost:
    
        if (xsna.io20.i(r2.a.n) == r10) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005a, code lost:
    
        if ((r13 - r9.i) <= r7) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0065 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(int i, ByteBuffer byteBuffer, boolean z, long j) throws MuxerException {
        Object[] objArr;
        fxc0.p(y2r0.l(this.d, i));
        b bVar = this.d.get(i);
        SparseArray<b> sparseArray = this.d;
        if (this.f) {
            if (sparseArray.size() != 1) {
                long j2 = j - sparseArray.get(i).f;
                long j3 = t;
                if (j2 > j3) {
                    b c = c(sparseArray);
                    c.getClass();
                }
                if (i != this.h) {
                    b c2 = c(sparseArray);
                    c2.getClass();
                    this.i = c2.f;
                }
            }
            objArr = true;
            y2r0.H(i);
            LinkedHashMap linkedHashMap = a7l.a;
            synchronized (a7l.class) {
            }
            if (i == 2) {
                if (this.p == C.TIME_UNSET) {
                    this.p = j;
                }
            } else if (i == 1) {
                j -= this.q;
            }
            if (objArr != true) {
                return false;
            }
            if (bVar.e == 0) {
                if (i == 2 && y2r0.l(this.d, 1) && j > 0) {
                    fxc0.z(this.p != C.TIME_UNSET);
                    ahn.F("Shifting first video timestamp from " + j + " to zero.");
                    j = 0L;
                }
                bVar.c = j;
            }
            bVar.e++;
            bVar.d += byteBuffer.remaining();
            bVar.f = Math.max(bVar.f, j);
            a0 a0Var = a0.this;
            bdx0 bdx0Var = a0Var.B;
            if (bdx0Var != null) {
                ScheduledFuture<?> scheduledFuture = bdx0Var.d;
                scheduledFuture.getClass();
                scheduledFuture.cancel(false);
                bdx0Var.d = bdx0Var.c.schedule(new gv2(bdx0Var.b, 20), bdx0Var.a, TimeUnit.MILLISECONDS);
            } else {
                fxc0.z(a0Var.g == C.TIME_UNSET);
            }
            this.l.getClass();
            this.l.f(bVar.b, byteBuffer, new dm8(j, byteBuffer.remaining(), z ? 1 : 0));
            y2r0.H(i);
            synchronized (a7l.class) {
            }
            this.h = i;
            return true;
        }
        objArr = false;
        y2r0.H(i);
        LinkedHashMap linkedHashMap2 = a7l.a;
        synchronized (a7l.class) {
        }
    }
}
