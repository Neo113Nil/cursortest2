package defpackage;

import android.content.Context;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rwm {
    public final Context a;
    public final nem b;
    public final File d;
    public final File e;
    public volatile boolean c = false;
    public final ArrayList f = new ArrayList();
    public volatile boolean g = false;

    public rwm(Context context, nem nemVar) {
        this.d = null;
        this.e = null;
        this.a = context;
        this.b = nemVar;
        this.d = cga.R(nemVar.vj(), nemVar.nac());
        this.e = cga.C(nemVar.vj(), nemVar.nac());
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public final void a(nem nemVar, int i) {
        synchronized (etm.class) {
            try {
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    etm etmVar = (etm) it.next();
                    if (etmVar != null) {
                        etmVar.pcc(nemVar, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(nem nemVar, int i, String str) {
        synchronized (etm.class) {
            try {
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    etm etmVar = (etm) it.next();
                    if (etmVar != null) {
                        etmVar.pcc(nemVar, i, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(etm etmVar) {
        if (this.g) {
            synchronized (etm.class) {
                this.f.add(etmVar);
            }
            return;
        }
        this.f.add(etmVar);
        File file = this.d;
        nem nemVar = this.b;
        boolean z = true;
        if (this.e.exists() || (!nemVar.hc() && (file.length() >= nemVar.wh() || (nemVar.oo() > 0 && file.length() >= nemVar.oo())))) {
            this.b.kj(1);
            a(this.b, 200);
            rem.a(this.b);
            return;
        }
        this.g = true;
        this.b.kj(0);
        nem nemVar2 = this.b;
        vh.pcc gm = tem.a() != null ? tem.a().gm() : new vh.pcc("v_preload");
        long gpj = nemVar2.gpj();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gm.pcc(gpj, timeUnit).sf(nemVar2.lo(), timeUnit).gm(nemVar2.fum(), timeUnit);
        vh pcc = gm.pcc();
        tmg.pcc pccVar = new tmg.pcc();
        long length = this.d.length();
        int wh = nemVar2.wh();
        boolean hc = nemVar2.hc();
        int oo = nemVar2.oo();
        if (oo <= 0) {
            z = hc;
        } else if (oo < nemVar2.tmg()) {
            z = hc;
            wh = oo;
        }
        pccVar.pcc("videoPreload").pcc(6);
        if (z) {
            pccVar.pcc("RANGE", vxd.m("bytes=", length, "-")).sf(nemVar2.dax()).pcc().sf();
        } else {
            pccVar.pcc("RANGE", "bytes=" + length + "-" + wh).sf(nemVar2.dax()).pcc().sf();
        }
        pcc.pcc(pccVar.sf()).pcc(new am0(this, length, 11));
    }

    public final void e() {
        File file = this.e;
        File file2 = this.d;
        try {
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Error renaming file " + file2 + " to " + file + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
