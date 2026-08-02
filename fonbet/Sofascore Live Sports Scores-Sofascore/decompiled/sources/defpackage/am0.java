package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.gm;
import com.bytedance.sdk.component.sf.pcc.jr;
import com.bytedance.sdk.component.sf.pcc.sf;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.zzav;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzekf;
import com.google.android.gms.internal.ads.zzekm;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.tasks.OnFailureListener;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class am0 implements jd4, kli, ml6, nl6, ol6, pl6, gm, OnFailureListener, zzfpi {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public am0(int i) {
        this.a = i;
        switch (i) {
            case 3:
                break;
            case 14:
                this.c = new ArrayList();
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    public void A(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Exception exc2 = (Exception) this.c;
        if (exc2 == null) {
            this.c = exc;
            this.b = 100 + elapsedRealtime;
            exc2 = exc;
        }
        if (elapsedRealtime >= this.b) {
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.c;
            this.c = null;
            throw exc3;
        }
    }

    @Override // defpackage.ml6, defpackage.nl6
    public int a(int i, int i2, byte[] bArr) {
        switch (this.a) {
            case 6:
                return ((ml6) this.c).a(i, i2, bArr);
            default:
                return ((nl6) this.c).a(i, i2, bArr);
        }
    }

    @Override // defpackage.ml6, defpackage.nl6
    public void advancePeekPosition(int i) {
        switch (this.a) {
            case 6:
                ((ml6) this.c).advancePeekPosition(i);
                break;
            default:
                ((nl6) this.c).advancePeekPosition(i);
                break;
        }
    }

    @Override // defpackage.ol6
    public void d(a0h a0hVar) {
        ((ol6) this.c).d(new aci(this, a0hVar));
    }

    @Override // defpackage.jd4
    public long e(long j, long j2) {
        return ((ou2) this.c).d[(int) j];
    }

    @Override // defpackage.ol6, defpackage.pl6
    public void endTracks() {
        switch (this.a) {
            case 8:
                ((ol6) this.c).endTracks();
                break;
            default:
                ((pl6) this.c).endTracks();
                break;
        }
    }

    @Override // defpackage.jd4
    public long g(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.kli
    public List getCues(long j) {
        if (j >= this.b) {
            return (hv9) this.c;
        }
        av9 av9Var = hv9.b;
        return vvf.e;
    }

    @Override // defpackage.kli
    public long getEventTime(int i) {
        qx9.r(i == 0);
        return this.b;
    }

    @Override // defpackage.kli
    public int getEventTimeCount() {
        return 1;
    }

    @Override // defpackage.ml6, defpackage.nl6
    public long getLength() {
        long length;
        long j;
        switch (this.a) {
            case 6:
                length = ((ml6) this.c).getLength();
                j = this.b;
                break;
            default:
                length = ((nl6) this.c).getLength();
                j = this.b;
                break;
        }
        return length - j;
    }

    @Override // defpackage.kli
    public int getNextEventTimeIndex(long j) {
        return this.b > j ? 0 : -1;
    }

    @Override // defpackage.ml6, defpackage.nl6
    public long getPeekPosition() {
        long peekPosition;
        long j;
        switch (this.a) {
            case 6:
                peekPosition = ((ml6) this.c).getPeekPosition();
                j = this.b;
                break;
            default:
                peekPosition = ((nl6) this.c).getPeekPosition();
                j = this.b;
                break;
        }
        return peekPosition - j;
    }

    @Override // defpackage.ml6, defpackage.nl6
    public long getPosition() {
        long position;
        long j;
        switch (this.a) {
            case 6:
                position = ((ml6) this.c).getPosition();
                j = this.b;
                break;
            default:
                position = ((nl6) this.c).getPosition();
                j = this.b;
                break;
        }
        return position - j;
    }

    @Override // defpackage.jd4
    public long getTimeUs(long j) {
        return ((ou2) this.c).e[(int) j] - this.b;
    }

    @Override // defpackage.jd4
    public long h(long j, long j2) {
        return C.TIME_UNSET;
    }

    @Override // defpackage.jd4
    public jlf i(long j) {
        return new jlf(null, ((ou2) this.c).c[(int) j], r6.b[r7]);
    }

    @Override // defpackage.jd4
    public long j(long j, long j2) {
        ou2 ou2Var = (ou2) this.c;
        return nik.f(ou2Var.e, j + this.b, true);
    }

    @Override // defpackage.jd4
    public long l(long j) {
        return ((ou2) this.c).a;
    }

    @Override // defpackage.pl6
    public void m(b0h b0hVar) {
        ((pl6) this.c).m(new bci(this, b0hVar, b0hVar));
    }

    @Override // defpackage.jd4
    public boolean n() {
        return true;
    }

    public void o(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        am0 am0Var = (am0) this.c;
        if (am0Var != null) {
            am0Var.o(i - 64);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 13:
                int i = exc instanceof ApiException ? ((ApiException) exc).a.a : 13;
                long j = this.b;
                Iterator it = ((RemoteMediaClient) ((sx2) this.c).c).c.d.iterator();
                while (it.hasNext()) {
                    ((zzav) it.next()).d(j, i, null);
                }
                break;
            default:
                ((zzgq) this.c).c.set(this.b);
                break;
        }
    }

    @Override // defpackage.jd4
    public long p() {
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00d8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ab, code lost:
    
        r0 = (defpackage.rwm) r19.c;
        r2 = r0.b;
        r3 = r21.gm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00b7, code lost:
    
        monitor-enter(defpackage.etm.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b8, code lost:
    
        r0 = r0.f.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00be, code lost:
    
        r5 = r0.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00c2, code lost:
    
        if (r5 == 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c4, code lost:
    
        r5 = (defpackage.etm) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ca, code lost:
    
        if (r5 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00cc, code lost:
    
        r5.sf(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00d2, code lost:
    
        monitor-exit(defpackage.etm.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00d3, code lost:
    
        defpackage.rwm.c(r12);
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00d0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0167 A[Catch: all -> 0x016c, TryCatch #5 {all -> 0x016c, blocks: (B:20:0x0151, B:23:0x015f, B:25:0x0167, B:26:0x016e), top: B:19:0x0151 }] */
    @Override // com.bytedance.sdk.component.sf.pcc.gm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(sf sfVar, gbb gbbVar) {
        InputStream inputStream;
        RandomAccessFile randomAccessFile;
        boolean oo;
        jr wh;
        long j;
        int i;
        long j2 = this.b;
        jr jrVar = null;
        RandomAccessFile randomAccessFile2 = null;
        jrVar = null;
        r5 = null;
        RandomAccessFile randomAccessFile3 = null;
        if (gbbVar != null) {
            try {
                oo = gbbVar.oo();
            } catch (Throwable th) {
                th = th;
                inputStream = null;
                randomAccessFile = null;
                i = 601;
                try {
                    rwm rwmVar = (rwm) this.c;
                    try {
                        rwmVar.e.delete();
                        rwmVar.d.delete();
                    } catch (Throwable unused) {
                    }
                    rwm rwmVar2 = (rwm) this.c;
                    nem nemVar = rwmVar2.b;
                    if (gbbVar != null) {
                    }
                    rwmVar2.b(nemVar, i, th.getMessage());
                    rwm.c(randomAccessFile);
                    rwm.c(inputStream);
                    rwm.c(jrVar);
                    rwm.c(gbbVar);
                    ((rwm) this.c).b.dax();
                    ((rwm) this.c).b.wh();
                    rem.a(((rwm) this.c).b);
                } catch (Throwable th2) {
                    rwm.c(randomAccessFile);
                    rwm.c(inputStream);
                    rwm.c(jrVar);
                    rwm.c(gbbVar);
                    ((rwm) this.c).b.dax();
                    ((rwm) this.c).b.wh();
                    rem.a(((rwm) this.c).b);
                    throw th2;
                }
            }
            if (!oo) {
                rwm rwmVar3 = (rwm) this.c;
                rwmVar3.b(rwmVar3.b, gbbVar.gm(), gbbVar.vj());
                rwm.c(gbbVar);
                ((rwm) this.c).b.dax();
                ((rwm) this.c).b.wh();
                rem.a(((rwm) this.c).b);
            }
            wh = gbbVar.wh();
            try {
                wh = gbbVar.wh();
                if (!oo || wh == null) {
                    inputStream = null;
                    j = 0;
                } else {
                    j = this.b + wh.pcc();
                    inputStream = wh.gm();
                }
                try {
                    if (inputStream == null) {
                        rwm rwmVar4 = (rwm) this.c;
                        rwmVar4.b(rwmVar4.b, gbbVar.gm(), gbbVar.vj());
                    } else {
                        randomAccessFile = new RandomAccessFile(((rwm) this.c).d, "rw");
                        try {
                            int i2 = sea.t;
                            byte[] bArr = new byte[i2];
                            int i3 = 0;
                            long j3 = 0;
                            while (true) {
                                int read = inputStream.read(bArr, i3, i2 - i3);
                                rwm rwmVar5 = (rwm) this.c;
                                if (read == -1) {
                                    if (rwmVar5.b.hc() && j == ((rwm) this.c).d.length()) {
                                        ((rwm) this.c).e();
                                    }
                                    rwm rwmVar6 = (rwm) this.c;
                                    rwmVar6.a(rwmVar6.b, gbbVar.gm());
                                    randomAccessFile2 = randomAccessFile;
                                } else {
                                    if (rwmVar5.c) {
                                        break;
                                    }
                                    i3 += read;
                                    j3 += read;
                                    if (j3 % i2 == 0 || j3 == j - this.b) {
                                        int intValue = Long.valueOf(j2).intValue();
                                        ((rwm) this.c).b.nac();
                                        try {
                                            randomAccessFile.seek(intValue);
                                            randomAccessFile.write(bArr, 0, i3);
                                        } catch (Throwable unused2) {
                                        }
                                        j2 += i3;
                                        i3 = 0;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            jrVar = wh;
                            i = 601;
                            rwm rwmVar7 = (rwm) this.c;
                            rwmVar7.e.delete();
                            rwmVar7.d.delete();
                            rwm rwmVar22 = (rwm) this.c;
                            nem nemVar2 = rwmVar22.b;
                            if (gbbVar != null) {
                            }
                            rwmVar22.b(nemVar2, i, th.getMessage());
                            rwm.c(randomAccessFile);
                            rwm.c(inputStream);
                            rwm.c(jrVar);
                            rwm.c(gbbVar);
                            ((rwm) this.c).b.dax();
                            ((rwm) this.c).b.wh();
                            rem.a(((rwm) this.c).b);
                        }
                    }
                    rwm.c(inputStream);
                    rwm.c(wh);
                } catch (Throwable th4) {
                    th = th4;
                    randomAccessFile = randomAccessFile3;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                randomAccessFile = null;
            }
            rwm.c(gbbVar);
            ((rwm) this.c).b.dax();
            ((rwm) this.c).b.wh();
            rem.a(((rwm) this.c).b);
        }
        try {
            rwm rwmVar8 = (rwm) this.c;
            i = 601;
            try {
                rwmVar8.b(rwmVar8.b, 601, "Network link failed.");
                wh = null;
                inputStream = null;
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
                randomAccessFile = null;
                rwm rwmVar72 = (rwm) this.c;
                rwmVar72.e.delete();
                rwmVar72.d.delete();
                rwm rwmVar222 = (rwm) this.c;
                nem nemVar22 = rwmVar222.b;
                if (gbbVar != null) {
                    i = gbbVar.gm();
                }
                rwmVar222.b(nemVar22, i, th.getMessage());
                rwm.c(randomAccessFile);
                rwm.c(inputStream);
                rwm.c(jrVar);
                rwm.c(gbbVar);
                ((rwm) this.c).b.dax();
                ((rwm) this.c).b.wh();
                rem.a(((rwm) this.c).b);
            }
        } catch (Throwable th7) {
            th = th7;
            i = 601;
        }
        rwm.c(randomAccessFile2);
        randomAccessFile3 = randomAccessFile2;
        rwm.c(inputStream);
        rwm.c(wh);
        rwm.c(gbbVar);
        ((rwm) this.c).b.dax();
        ((rwm) this.c).b.wh();
        rem.a(((rwm) this.c).b);
    }

    @Override // defpackage.ml6, defpackage.nl6
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) {
        switch (this.a) {
            case 6:
                return ((ml6) this.c).peekFully(bArr, 0, i2, z);
            default:
                return ((nl6) this.c).peekFully(bArr, i, i2, z);
        }
    }

    @Override // defpackage.jd4
    public long q(long j, long j2) {
        return ((ou2) this.c).a;
    }

    public int r(int i) {
        am0 am0Var = (am0) this.c;
        if (am0Var == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + am0Var.r(i - 64);
    }

    @Override // defpackage.fe4, defpackage.ge4
    public int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 6:
                return ((ml6) this.c).read(bArr, i, i2);
            default:
                return ((nl6) this.c).read(bArr, i, i2);
        }
    }

    @Override // defpackage.ml6, defpackage.nl6
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) {
        switch (this.a) {
            case 6:
                return ((ml6) this.c).readFully(bArr, 0, i2, z);
            default:
                return ((nl6) this.c).readFully(bArr, 0, i2, z);
        }
    }

    @Override // defpackage.ml6, defpackage.nl6
    public void resetPeekPosition() {
        switch (this.a) {
            case 6:
                ((ml6) this.c).resetPeekPosition();
                break;
            default:
                ((nl6) this.c).resetPeekPosition();
                break;
        }
    }

    public void s() {
        if (((am0) this.c) == null) {
            this.c = new am0(1);
        }
    }

    @Override // defpackage.ml6, defpackage.nl6
    public int skip(int i) {
        switch (this.a) {
            case 6:
                return ((ml6) this.c).skip(i);
            default:
                return ((nl6) this.c).skip(i);
        }
    }

    @Override // defpackage.ml6, defpackage.nl6
    public void skipFully(int i) {
        switch (this.a) {
            case 6:
                ((ml6) this.c).skipFully(i);
                break;
            default:
                ((nl6) this.c).skipFully(i);
                break;
        }
    }

    public boolean t(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        s();
        return ((am0) this.c).t(i - 64);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                if (((am0) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((am0) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ol6
    public usj track(int i, int i2) {
        return ((ol6) this.c).track(i, i2);
    }

    public long u(long j, float f, boolean z) {
        long i;
        long j2 = this.b;
        if (z) {
            i = dnd.i(j2, j);
            this.b = i;
        } else {
            i = dnd.i(j2, j);
        }
        if ((((ewd) this.c) == null ? dnd.d(i) : Math.abs(w(i))) < f) {
            return 9205357640488583168L;
        }
        ewd ewdVar = (ewd) this.c;
        long j3 = this.b;
        if (ewdVar == null) {
            return dnd.h(this.b, dnd.j(dnd.b(j3, dnd.d(j3)), f));
        }
        float w = w(j3) - (Math.signum(w(this.b)) * f);
        long j4 = this.b;
        ewd ewdVar2 = (ewd) this.c;
        ewd ewdVar3 = ewd.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (ewdVar2 == ewdVar3 ? j4 & 4294967295L : j4 >> 32));
        if (((ewd) this.c) == ewdVar3) {
            return (Float.floatToRawIntBits(w) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        return (Float.floatToRawIntBits(w) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public void v(int i, boolean z) {
        if (i >= 64) {
            s();
            ((am0) this.c).v(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            z(i);
        } else {
            o(i);
        }
        if (z2 || ((am0) this.c) != null) {
            s();
            ((am0) this.c).v(0, z2);
        }
    }

    public float w(long j) {
        return Float.intBitsToFloat((int) (((ewd) this.c) == ewd.b ? j >> 32 : j & 4294967295L));
    }

    public boolean x(int i) {
        if (i >= 64) {
            s();
            return ((am0) this.c).x(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        am0 am0Var = (am0) this.c;
        if (am0Var != null) {
            if (am0Var.t(0)) {
                z(63);
            }
            ((am0) this.c).x(0);
        }
        return z;
    }

    public void y() {
        this.b = 0L;
        am0 am0Var = (am0) this.c;
        if (am0Var != null) {
            am0Var.y();
        }
    }

    public void z(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            s();
            ((am0) this.c).z(i - 64);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public Object zza(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((zzekf) this.c).a.zzx()) {
            return null;
        }
        long j = this.b;
        zzbil.zzaf.zza.C0135zza V = zzbil.zzaf.zza.V();
        V.n();
        ((zzbil.zzaf.zza) V.b).R(j);
        byte[] d = ((zzbil.zzaf.zza) V.o()).d();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        zzekm.b(sQLiteDatabase, j, d);
        return null;
    }

    @Override // defpackage.pl6
    /* renamed from: track, reason: collision with other method in class */
    public vsj mo2track(int i, int i2) {
        return ((pl6) this.c).mo2track(i, i2);
    }

    @Override // defpackage.nl6
    public boolean skipFully(int i, boolean z) {
        return ((nl6) this.c).skipFully(i, true);
    }

    @Override // defpackage.ml6, defpackage.nl6
    public void peekFully(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 6:
                ((ml6) this.c).peekFully(bArr, i, i2);
                break;
            default:
                ((nl6) this.c).peekFully(bArr, i, i2);
                break;
        }
    }

    @Override // defpackage.ml6, defpackage.nl6
    public void readFully(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 6:
                ((ml6) this.c).readFully(bArr, i, i2);
                break;
            default:
                ((nl6) this.c).readFully(bArr, i, i2);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public am0(ewd ewdVar) {
        this(ewdVar, 0L, 10);
        this.a = 10;
    }

    public /* synthetic */ am0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public am0(Clock clock) {
        this.a = 17;
        Preconditions.i(clock);
        this.c = clock;
    }

    public am0(ml6 ml6Var, long j) {
        this.a = 6;
        this.c = ml6Var;
        qx9.r(ml6Var.getPosition() >= j);
        this.b = j;
    }

    public am0(lof lofVar) {
        this.a = 5;
        this.c = lofVar;
        this.b = 262144L;
    }

    public am0(nl6 nl6Var, long j) {
        this.a = 7;
        this.c = nl6Var;
        z1a.s(nl6Var.getPosition() >= j);
        this.b = j;
    }

    public /* synthetic */ am0(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.gm
    public void pcc(sf sfVar, IOException iOException) {
        rwm rwmVar = (rwm) this.c;
        nem nemVar = rwmVar.b;
        rwmVar.b(nemVar, 601, iOException.getMessage());
        rem.a(nemVar);
    }
}
