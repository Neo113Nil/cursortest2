package defpackage;

import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.bytedance.sdk.component.utils.lo;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qwm {
    public final boolean a;
    public final File d;
    public final File e;
    public final long f;
    public RandomAccessFile j;
    public final nem k;
    public volatile long l;
    public volatile long b = -2147483648L;
    public final Object c = new Object();
    public volatile int g = -100;
    public volatile boolean h = false;
    public volatile boolean i = false;

    public qwm(nem nemVar) {
        this.f = 0L;
        this.j = null;
        this.k = nemVar;
        try {
            String vj = nemVar.vj();
            String nac = nemVar.nac();
            File R = cga.R(vj, nac);
            this.d = R;
            File C = cga.C(vj, nac);
            this.e = C;
            if (C.exists()) {
                this.j = new RandomAccessFile(C, "r");
            } else {
                this.j = new RandomAccessFile(R, "rw");
            }
            if (!C.exists()) {
                this.f = R.length();
                a();
            }
            this.a = sea.s == 2;
        } catch (Throwable unused) {
            nemVar.dax();
        }
    }

    public final void a() {
        vh.pcc gm = tem.a() != null ? tem.a().gm() : new vh.pcc("v_cache");
        nem nemVar = this.k;
        long gpj = nemVar.gpj();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gm.pcc(gpj, timeUnit).sf(nemVar.lo(), timeUnit).gm(nemVar.fum(), timeUnit);
        vh pcc = gm.pcc();
        nemVar.nac();
        pcc.pcc(new tmg.pcc().pcc("RANGE", lnb.l(this.f, "-", new StringBuilder("bytes="))).sf(nemVar.dax()).pcc().pcc("videoLoadWhenPlaying").pcc(9).sf()).pcc(new ewm(this, 0));
    }

    public final void b(int i, String str) {
        JSONObject gm;
        this.i = false;
        this.g = i;
        this.b = -1L;
        lo.sf("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i), " ", str);
        if (!this.k.pcc() || (gm = this.k.gm()) == null) {
            return;
        }
        try {
            gm.put("error_real_code", i);
            gm.put("error_real_msg", str);
        } catch (Throwable th) {
            lo.pcc("CSJ_MediaDLPlay", "handleFailResponse: ", th);
        }
    }

    public final void c() {
        synchronized (this.c) {
            if (this.e.exists()) {
                this.k.dax();
                this.k.nac();
                return;
            }
            try {
            } finally {
            }
            if (!this.d.renameTo(this.e)) {
                throw new IOException("Error renaming file " + this.d + " to " + this.e + " for completion!");
            }
            RandomAccessFile randomAccessFile = this.j;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.j = new RandomAccessFile(this.e, "rw");
            this.k.nac();
            this.k.dax();
        }
    }
}
