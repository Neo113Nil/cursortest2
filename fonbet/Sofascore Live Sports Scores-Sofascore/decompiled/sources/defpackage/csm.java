package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.bytedance.sdk.component.kj.pcc.pcc;
import com.bytedance.sdk.component.utils.fum;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.core.jr.oo.gm;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class csm implements stm, xdm, aem, dem, gem, hem, lem, mem, tsz.pcc {
    private static final SparseIntArray pcc = new SparseIntArray();
    private tsz dax;
    private boolean hc;
    private final Runnable kun;
    private volatile boolean lrr;
    private volatile boolean mu;
    private boolean of;
    private final asm oo;
    private int qy;
    private boolean rj;
    private boolean tmg;
    private boolean tsx;
    private boolean tsz;
    private SurfaceTexture vj;
    private SurfaceHolder wh;
    private ArrayList<Runnable> yt;
    private final boolean sf = false;
    private final List<WeakReference<gtm>> gm = new CopyOnWriteArrayList();
    private int qf = 0;
    private int kj = 3;
    private boolean vy = false;
    private volatile qem ork = null;
    private boolean vh = false;
    private volatile int gbb = 201;
    private long jr = -1;
    private boolean nac = false;
    private long lu = 0;
    private long gpj = Long.MIN_VALUE;
    private long lo = 0;
    private long fum = 0;
    private long tz = 0;
    private String jsj = "0";
    private nem mk = null;
    private boolean atb = false;
    private CountDownLatch ye = new CountDownLatch(1);
    private volatile int lq = 200;
    private AtomicBoolean zti = new AtomicBoolean(false);
    private Surface pq = null;
    private long nn = 0;
    private long rnn = 0;

    public csm() {
        int i = 0;
        gm gmVar = (gm) this;
        this.oo = new asm(gmVar);
        this.qy = 0;
        this.tsx = false;
        this.kun = new kac(gmVar, 28);
        this.qy = 0;
        tsz pcc2 = pcc.pcc().pcc(this, "csj_".concat("SSMediaPlayerWrapper"));
        this.dax = pcc2;
        this.tsx = true;
        if (pcc2 != null) {
            pcc2.post(new yrm(this, i));
        }
    }

    public final void a(nem nemVar) {
        nemVar.dax();
        pwm pwmVar = (pwm) this.ork;
        synchronized (pwmVar) {
            htm htmVar = new htm(tem.a, nemVar);
            htm.e.put(nemVar.nac(), htmVar);
            pwmVar.k = htmVar;
            rem.a(nemVar);
            pwmVar.i.setDataSource(pwmVar.k);
        }
        nemVar.dax();
    }

    public final void b(nem nemVar, File file) {
        if (!nemVar.pcc()) {
            c(file);
            return;
        }
        try {
            String D = qea.D(file);
            if (nemVar.nac().equals(D)) {
                c(file);
                return;
            }
            JSONObject gm = nemVar.gm();
            boolean sf = nemVar.sf();
            if (gm != null) {
                gm.put("file_hash", nemVar.nac());
                gm.put("file_real_hash", D);
                gm.put("is_change_play_type", sf ? 1 : 0);
                gm.put("error_real_code", Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE);
                gm.put("error_real_msg", "md5_not_match");
            }
            if (sf) {
                boolean delete = file.delete();
                if (gm != null) {
                    gm.put("delete_cache_file", delete ? 1 : 0);
                }
                if (delete) {
                    a(nemVar);
                    return;
                }
            }
            c(file);
        } catch (Throwable unused) {
        }
    }

    public final void c(File file) {
        file.getAbsolutePath();
        try {
            if (fum.pcc(tem.a)) {
                ((pwm) this.ork).c(file.getAbsolutePath());
            } else {
                FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
                qem qemVar = this.ork;
                ((pwm) qemVar).i.setDataSource(fileInputStream.getFD());
                fileInputStream.close();
            }
        } catch (Throwable unused) {
        }
    }

    public final void d(Runnable runnable) {
        try {
            ArrayList<Runnable> arrayList = this.yt;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.yt = arrayList;
            }
            arrayList.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public int dax() {
        return this.qf;
    }

    public final void e() {
        tsz tszVar = this.dax;
        if (tszVar == null || tszVar.getLooper() == null) {
            return;
        }
        try {
            this.dax.post(new yrm(this, 5));
        } catch (Throwable unused) {
        }
    }

    public final void f(int i) {
        if (i == 701) {
            this.nn = SystemClock.elapsedRealtime();
            this.qf++;
            for (WeakReference<gtm> weakReference : this.gm) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().pcc(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i != 702) {
            if (this.tsx && i == 3) {
                j();
                i();
                sf(this.atb);
                return;
            } else {
                if (i == 805) {
                    this.rj = true;
                    return;
                }
                return;
            }
        }
        if (this.nn > 0) {
            this.rnn = (SystemClock.elapsedRealtime() - this.nn) + this.rnn;
            this.nn = 0L;
        }
        for (WeakReference<gtm> weakReference2 : this.gm) {
            if (weakReference2 != null && weakReference2.get() != null) {
                weakReference2.get().pcc((stm) this, Integer.MAX_VALUE);
            }
        }
    }

    public final void g(long j) {
        asm asmVar = this.oo;
        asmVar.a = j;
        if (this.tsz) {
            h(asmVar);
            return;
        }
        nem nemVar = this.mk;
        boolean z = nemVar != null && nemVar.qf();
        Runnable runnable = this.oo;
        if (z) {
            h(runnable);
        } else {
            d(runnable);
        }
    }

    public boolean gbb() {
        return this.rj;
    }

    @Override // defpackage.mem
    public void gm(qem qemVar) {
        for (WeakReference<gtm> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pcc((stm) this, true);
            }
        }
    }

    public SurfaceHolder gpj() {
        return this.wh;
    }

    public final void h(Runnable runnable) {
        if (runnable == null || kj()) {
            return;
        }
        if (this.hc) {
            d(runnable);
        } else {
            runnable.run();
        }
    }

    public boolean hc() {
        return this.gbb == 205;
    }

    public final void i() {
        this.lrr = true;
        this.vy = true;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.tz;
        for (WeakReference<gtm> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pcc(this, elapsedRealtime);
            }
        }
    }

    public final void j() {
        ArrayList<Runnable> arrayList = this.yt;
        if (arrayList == null || arrayList.isEmpty() || this.tmg) {
            return;
        }
        this.tmg = true;
        Iterator it = new ArrayList(this.yt).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.yt.clear();
        this.tmg = false;
    }

    public long jr() {
        if (this.nac) {
            long j = this.lo;
            if (j > 0) {
                return this.lu + j;
            }
        }
        return this.lu;
    }

    public final void k() {
        if (this.ork == null) {
            return;
        }
        try {
            pwm pwmVar = (pwm) this.ork;
            pwmVar.getClass();
            try {
                pwmVar.i.reset();
            } catch (Throwable unused) {
            }
            htm htmVar = pwmVar.k;
            if (htmVar != null) {
                try {
                    htmVar.close();
                } catch (Throwable unused2) {
                }
                pwmVar.k = null;
            }
            pwmVar.d();
            pwmVar.a();
        } catch (Throwable unused3) {
        }
        ((pwm) this.ork).b = null;
        ((pwm) this.ork).e = null;
        ((pwm) this.ork).c = null;
        ((pwm) this.ork).g = null;
        ((pwm) this.ork).f = null;
        ((pwm) this.ork).a = null;
        ((pwm) this.ork).d = null;
        try {
            pwm pwmVar2 = (pwm) this.ork;
            synchronized (pwmVar2.m) {
                try {
                    if (!pwmVar2.n) {
                        pwmVar2.i.release();
                        pwmVar2.n = true;
                        try {
                            Surface surface = pwmVar2.l;
                            if (surface != null) {
                                surface.release();
                                pwmVar2.l = null;
                            }
                        } catch (Throwable unused4) {
                        }
                        htm htmVar2 = pwmVar2.k;
                        if (htmVar2 != null) {
                            try {
                                htmVar2.close();
                            } catch (Throwable unused5) {
                            }
                            pwmVar2.k = null;
                        }
                        pwmVar2.d();
                        pwmVar2.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused6) {
        }
    }

    public SurfaceTexture lo() {
        return this.vj;
    }

    public long lu() {
        if (kj()) {
            return 0L;
        }
        if (this.gbb != 206 && this.gbb != 207) {
            return 0L;
        }
        try {
            ((pwm) this.ork).getClass();
            return r4.i.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public long nac() {
        long j = this.fum;
        long j2 = 0;
        if (j != 0) {
            return j;
        }
        if (this.gbb == 206 || this.gbb == 207) {
            try {
                pwm pwmVar = (pwm) this.ork;
                pwmVar.getClass();
                try {
                    j2 = pwmVar.i.getDuration();
                } catch (Throwable unused) {
                }
                this.fum = j2;
            } catch (Throwable unused2) {
            }
        }
        return this.fum;
    }

    @Override // defpackage.stm
    public int oo() {
        MediaPlayer mediaPlayer;
        if (this.ork == null || kj() || (mediaPlayer = ((pwm) this.ork).i) == null) {
            return 0;
        }
        return mediaPlayer.getVideoWidth();
    }

    public void ork() {
        if (kj() || this.dax == null) {
            return;
        }
        this.zti.set(true);
        this.dax.post(new yrm(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(Message message) {
        int i = this.gbb;
        int i2 = message.what;
        if (this.ork != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.gbb == 205 || this.gbb == 207 || this.gbb == 209) {
                            ((pwm) this.ork).i.start();
                            this.tz = SystemClock.elapsedRealtime();
                            this.gbb = 206;
                            if (this.jr > 0) {
                                ((pwm) this.ork).b(this.jr, this.kj);
                                this.jr = -1L;
                            }
                            if (this.mk != null) {
                                sf(this.atb);
                                return;
                            }
                            return;
                        }
                        this.gbb = 200;
                        if (this.vh) {
                            ltm ltmVar = new ltm(Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, i2);
                            ltmVar.c = fc6.g(i, i2, BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                            for (WeakReference<gtm> weakReference : this.gm) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().pcc(this, ltmVar);
                                }
                            }
                            this.vh = true;
                            return;
                        }
                        return;
                    case 101:
                        if (this.nac) {
                            this.lu += this.lo;
                        }
                        this.nac = false;
                        this.lo = 0L;
                        this.gpj = Long.MIN_VALUE;
                        if (this.gbb == 206 || this.gbb == 207 || this.gbb == 209) {
                            ((pwm) this.ork).i.pause();
                            this.gbb = 207;
                            this.mu = false;
                            for (WeakReference<gtm> weakReference2 : this.gm) {
                                if (weakReference2 != null && weakReference2.get() != null) {
                                    weakReference2.get().oo(this);
                                }
                            }
                            return;
                        }
                        this.gbb = 200;
                        if (this.vh) {
                        }
                        break;
                    case 102:
                        pwm pwmVar = (pwm) this.ork;
                        pwmVar.getClass();
                        try {
                            pwmVar.i.reset();
                        } catch (Throwable unused) {
                        }
                        htm htmVar = pwmVar.k;
                        if (htmVar != null) {
                            try {
                                htmVar.close();
                            } catch (Throwable unused2) {
                            }
                            pwmVar.k = null;
                        }
                        pwmVar.d();
                        pwmVar.a();
                        this.gbb = 201;
                        return;
                    case 103:
                        try {
                            k();
                        } catch (Throwable unused3) {
                        }
                        for (WeakReference<gtm> weakReference3 : this.gm) {
                            if (weakReference3 != null && weakReference3.get() != null) {
                                weakReference3.get().gm(this);
                            }
                        }
                        this.gbb = 203;
                        return;
                    case 104:
                        if (this.gbb == 202 || this.gbb == 208) {
                            MediaPlayer mediaPlayer = ((pwm) this.ork).i;
                            if (mediaPlayer != null) {
                                mediaPlayer.prepareAsync();
                                return;
                            }
                            return;
                        }
                        this.gbb = 200;
                        if (this.vh) {
                        }
                        break;
                    case 105:
                        if (this.gbb == 205 || this.gbb == 206 || this.gbb == 208 || this.gbb == 207 || this.gbb == 209) {
                            ((pwm) this.ork).i.stop();
                            this.gbb = Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE;
                            return;
                        }
                        this.gbb = 200;
                        if (this.vh) {
                        }
                        break;
                    case 106:
                        if (this.gbb == 206 || this.gbb == 207 || this.gbb == 209) {
                            ((pwm) this.ork).b(((Long) message.obj).longValue(), this.kj);
                            return;
                        }
                        this.gbb = 200;
                        if (this.vh) {
                        }
                        break;
                    case 107:
                        this.lu = 0L;
                        this.qf = 0;
                        this.lo = 0L;
                        this.nac = false;
                        this.gpj = Long.MIN_VALUE;
                        if (this.gbb == 201 || this.gbb == 203) {
                            nem nemVar = (nem) message.obj;
                            if (TextUtils.isEmpty(nemVar.vj())) {
                                if (TextUtils.isEmpty(tem.b)) {
                                    try {
                                        File file = new File(tem.a.getFilesDir(), "ttad_dir");
                                        if (!file.exists()) {
                                            file.mkdirs();
                                        }
                                        tem.b = file.getAbsolutePath();
                                    } catch (Throwable unused4) {
                                    }
                                }
                                nemVar.pcc(tem.b);
                            }
                            if (nemVar.qy()) {
                                ((pwm) this.ork).c(nemVar.dax());
                                nemVar.dax();
                            } else {
                                File file2 = new File(nemVar.vj(), nemVar.nac());
                                if (file2.exists()) {
                                    b(nemVar, file2);
                                } else {
                                    a(nemVar);
                                }
                            }
                            this.gbb = 202;
                            return;
                        }
                        this.gbb = 200;
                        if (this.vh) {
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        SurfaceHolder surfaceHolder = (SurfaceHolder) message.obj;
                        pwm pwmVar2 = (pwm) this.ork;
                        synchronized (pwmVar2.m) {
                            try {
                                if (!pwmVar2.n && surfaceHolder != null && surfaceHolder.getSurface() != null && pwmVar2.h) {
                                    pwmVar2.i.setDisplay(surfaceHolder);
                                }
                            } catch (Throwable unused5) {
                            }
                        }
                        ((pwm) this.ork).i.setScreenOnWhilePlaying(true);
                        this.ye.await(1L, TimeUnit.SECONDS);
                        j();
                        return;
                    case 111:
                        this.pq = new Surface((SurfaceTexture) message.obj);
                        qem qemVar = this.ork;
                        Surface surface = this.pq;
                        pwm pwmVar3 = (pwm) qemVar;
                        pwmVar3.getClass();
                        try {
                            Surface surface2 = pwmVar3.l;
                            if (surface2 != null) {
                                surface2.release();
                                pwmVar3.l = null;
                            }
                        } catch (Throwable unused6) {
                        }
                        pwmVar3.l = surface;
                        pwmVar3.i.setSurface(surface);
                        ((pwm) this.ork).i.setScreenOnWhilePlaying(true);
                        this.ye.await(1L, TimeUnit.SECONDS);
                        j();
                        return;
                }
            } catch (Throwable unused7) {
            }
        }
    }

    @Override // defpackage.stm
    public boolean qf() {
        tsz tszVar;
        return ((this.gbb != 207 && !this.mu) || (tszVar = this.dax) == null || tszVar.hasMessages(100)) ? false : true;
    }

    @Override // defpackage.lem
    public void sf(qem qemVar) {
        if (kj()) {
            return;
        }
        this.gbb = 205;
        try {
            nem nemVar = this.mk;
            if (nemVar != null) {
                float jr = nemVar.jr();
                if (jr > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    MediaPlayer mediaPlayer = ((pwm) this.ork).i;
                    mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(jr));
                }
            }
        } catch (Throwable unused) {
        }
        if (this.dax != null) {
            boolean z = this.mu;
            tsz tszVar = this.dax;
            if (!z) {
                tszVar.sendMessage(tszVar.obtainMessage(100, -1, -1));
            } else if (tszVar != null) {
                tszVar.post(new yrm(this, 6));
            }
        }
        pcc.delete(this.qy);
        boolean z2 = this.tsx;
        boolean z3 = this.of;
        if (!z2 && !z3) {
            i();
            this.of = true;
        }
        for (WeakReference<gtm> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().sf(this);
            }
        }
    }

    public void tmg() {
        if (kj()) {
            return;
        }
        this.hc = true;
        ArrayList<Runnable> arrayList = this.yt;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.yt.clear();
        }
        tsz tszVar = this.dax;
        if (tszVar != null) {
            try {
                tszVar.removeCallbacksAndMessages(null);
                if (this.ork != null) {
                    this.dax.sendEmptyMessage(103);
                }
                e();
            } catch (Throwable unused) {
                e();
            }
        }
    }

    public void vh() {
        tsz tszVar;
        nem nemVar;
        nem nemVar2;
        if (kj() || (tszVar = this.dax) == null) {
            return;
        }
        tszVar.removeMessages(100);
        this.mu = true;
        if (this.tsx) {
            if (!this.vy && ((nemVar = this.mk) == null || !nemVar.qf())) {
                d(new yrm(this, 3));
                return;
            }
            tsz tszVar2 = this.dax;
            if (tszVar2 != null) {
                tszVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.of && ((nemVar2 = this.mk) == null || !nemVar2.qf())) {
            d(new yrm(this, 2));
            return;
        }
        tsz tszVar3 = this.dax;
        if (tszVar3 != null) {
            tszVar3.sendEmptyMessage(101);
        }
    }

    @Override // defpackage.stm
    public int vj() {
        MediaPlayer mediaPlayer;
        if (this.ork == null || kj() || (mediaPlayer = ((pwm) this.ork).i) == null) {
            return 0;
        }
        return mediaPlayer.getVideoHeight();
    }

    public void vy() {
        if (kj() || this.ork == null) {
            return;
        }
        this.zti.set(true);
        if (this.gbb != 206) {
            this.lu = 0L;
            this.qf = 0;
            this.lo = 0L;
            this.nac = false;
            this.gpj = Long.MIN_VALUE;
            this.mu = false;
            this.oo.b = true;
            g(0L);
            tsz tszVar = this.dax;
            if (tszVar != null) {
                tszVar.removeCallbacks(this.kun);
                this.dax.postDelayed(this.kun, this.lq);
            }
        }
        this.ye.countDown();
    }

    @Override // defpackage.stm
    public boolean wh() {
        tsz tszVar;
        return (this.gbb == 206 || ((tszVar = this.dax) != null && tszVar.hasMessages(100))) && !this.mu;
    }

    @Override // defpackage.stm
    public boolean kj() {
        return this.hc;
    }

    public static void ork(csm csmVar) {
        tsz tszVar = csmVar.dax;
        if (tszVar != null) {
            tszVar.post(new yrm(csmVar, 0));
        }
    }

    @Override // defpackage.stm
    public boolean gm() {
        return hc() || wh() || qf();
    }

    @Override // defpackage.stm
    public boolean sf() {
        return this.gbb == 209;
    }

    @Override // defpackage.aem
    public boolean sf(qem qemVar, int i, int i2) {
        if (this.ork != qemVar) {
            return false;
        }
        if (i2 == -1004) {
            ltm ltmVar = new ltm(i, i2);
            for (WeakReference<gtm> weakReference : this.gm) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().pcc(this, ltmVar);
                }
            }
        }
        f(i);
        return false;
    }

    public void sf(boolean z) {
        tsz tszVar;
        if (kj() || (tszVar = this.dax) == null) {
            return;
        }
        tszVar.post(new zrm(this, z, 0));
    }

    public void sf(int i) {
        this.kj = i;
    }

    public static void pcc(csm csmVar, long j, long j2) {
        csm csmVar2;
        long j3;
        long j4;
        if (!csmVar.lrr) {
            csmVar.i();
        }
        for (WeakReference<gtm> weakReference : csmVar.gm) {
            if (weakReference == null || weakReference.get() == null) {
                csmVar2 = csmVar;
                j3 = j;
                j4 = j2;
            } else {
                csmVar2 = csmVar;
                j3 = j;
                j4 = j2;
                weakReference.get().pcc(csmVar2, j3, j4);
            }
            csmVar = csmVar2;
            j = j3;
            j2 = j4;
        }
    }

    public void pcc(boolean z) {
        if (kj()) {
            return;
        }
        this.tsz = z;
        if (this.ork != null) {
            ((pwm) this.ork).h = z;
            return;
        }
        tsz tszVar = this.dax;
        if (tszVar != null) {
            tszVar.post(new zrm(this, z, 1));
        }
    }

    public void pcc(boolean z, long j, boolean z2) {
        if (kj()) {
            return;
        }
        tsz tszVar = this.dax;
        int i = 0;
        if (tszVar != null) {
            tszVar.post(new yrm(this, i));
        }
        this.atb = z2;
        this.zti.set(true);
        this.mu = false;
        sf(z2);
        if (z) {
            this.jr = j;
            h(new yrm(this, 4));
        } else {
            g(j);
        }
        tsz tszVar2 = this.dax;
        if (tszVar2 != null) {
            tszVar2.removeCallbacks(this.kun);
            this.dax.postDelayed(this.kun, this.lq);
        }
        this.ye.countDown();
    }

    public void pcc(long j) {
        if (kj()) {
            return;
        }
        if (this.gbb == 207 || this.gbb == 206 || this.gbb == 209) {
            h(new dx2(this, j, 1));
        }
    }

    @Override // defpackage.stm
    public boolean pcc() {
        return this.vy;
    }

    public void pcc(SurfaceTexture surfaceTexture) {
        if (kj()) {
            return;
        }
        this.vj = surfaceTexture;
        pcc(true);
        h(new vlo(this, surfaceTexture, false, 25));
    }

    public void pcc(SurfaceHolder surfaceHolder) {
        if (kj()) {
            return;
        }
        this.wh = surfaceHolder;
        pcc(true);
        h(new a8p(this, surfaceHolder, false, 25));
    }

    public void pcc(nem nemVar) {
        if (kj()) {
            return;
        }
        this.mk = nemVar;
        boolean z = false;
        if (nemVar != null) {
            this.tsx = this.tsx && !nemVar.qf();
        }
        h(new pyn(this, nemVar, z, 24));
    }

    @Override // defpackage.dem
    public void pcc(qem qemVar, int i) {
        if (this.ork != qemVar) {
            return;
        }
        for (WeakReference<gtm> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().sf(this, i);
            }
        }
    }

    @Override // defpackage.xdm
    public boolean pcc(qem qemVar, int i, int i2) {
        SparseIntArray sparseIntArray = pcc;
        sparseIntArray.put(this.qy, sparseIntArray.get(this.qy) + 1);
        this.gbb = 200;
        tsz tszVar = this.dax;
        if (tszVar != null) {
            tszVar.removeCallbacks(this.kun);
        }
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            z = true;
        }
        if (z) {
            e();
        }
        if (!this.zti.get()) {
            return true;
        }
        this.zti.set(false);
        ltm ltmVar = new ltm(i, i2);
        for (WeakReference<gtm> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pcc(this, ltmVar);
            }
        }
        return true;
    }

    @Override // defpackage.hem
    public void pcc(qem qemVar) {
        this.gbb = Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE;
        pcc.delete(this.qy);
        tsz tszVar = this.dax;
        if (tszVar != null) {
            tszVar.removeCallbacks(this.kun);
        }
        for (WeakReference<gtm> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pcc(this);
            }
        }
    }

    @Override // defpackage.gem
    public void pcc(qem qemVar, int i, int i2, int i3, int i4) {
        for (WeakReference<gtm> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pcc((stm) this, i, i2);
            }
        }
    }

    public void pcc(gtm gtmVar) {
        if (gtmVar == null) {
            return;
        }
        for (WeakReference<gtm> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() == gtmVar) {
                return;
            }
        }
        this.gm.add(new WeakReference<>(gtmVar));
    }

    public void pcc(int i) {
        if (kj()) {
            return;
        }
        this.lq = i;
    }

    public boolean pcc(float f) {
        PlaybackParams playbackParams;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        try {
            if (this.ork == null || !gm()) {
                return false;
            }
            try {
                playbackParams = ((pwm) this.ork).i.getPlaybackParams();
            } catch (Throwable th) {
                lo.gm("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th.getMessage());
                playbackParams = null;
            }
            if (playbackParams != null) {
                f2 = playbackParams.getSpeed();
            }
            if (f2 == f) {
                return true;
            }
            MediaPlayer mediaPlayer = ((pwm) this.ork).i;
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f));
            return true;
        } catch (Throwable th2) {
            lo.pcc("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th2);
            return false;
        }
    }
}
