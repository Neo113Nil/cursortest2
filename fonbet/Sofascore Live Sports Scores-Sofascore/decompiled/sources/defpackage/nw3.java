package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nw3 {
    public final Context a;
    public final rd4 b;
    public final k1d c;
    public final long d;
    public z41 e;
    public z41 f;
    public jw3 g;
    public final ar9 h;
    public final r18 i;
    public final ku j;
    public final ku k;
    public final ew3 l;
    public final ow3 m;
    public final bka n;
    public final hcc o;

    public nw3(r38 r38Var, ar9 ar9Var, ow3 ow3Var, rd4 rd4Var, ku kuVar, ku kuVar2, r18 r18Var, ew3 ew3Var, bka bkaVar, hcc hccVar) {
        this.b = rd4Var;
        r38Var.a();
        this.a = r38Var.a;
        this.h = ar9Var;
        this.m = ow3Var;
        this.j = kuVar;
        this.k = kuVar2;
        this.i = r18Var;
        this.l = ew3Var;
        this.n = bkaVar;
        this.o = hccVar;
        this.d = System.currentTimeMillis();
        this.c = new k1d(5);
    }

    public final void a(ng2 ng2Var) {
        File file;
        hcc.K();
        hcc.K();
        z41 z41Var = this.e;
        z41Var.getClass();
        try {
            new File((File) ((r18) z41Var.c).c, (String) z41Var.b).createNewFile();
        } catch (IOException unused) {
        }
        try {
            try {
                try {
                    this.j.q(new mw3(this));
                    this.g.h();
                } catch (Exception unused2) {
                    return;
                }
            } finally {
                hcc.K();
                try {
                    z41 z41Var2 = this.e;
                    new File((File) ((r18) z41Var2.c).c, (String) z41Var2.b).delete();
                } catch (Exception unused3) {
                }
            }
        } catch (Exception unused4) {
            hcc.K();
            z41 z41Var3 = this.e;
            file = new File((File) ((r18) z41Var3.c).c, (String) z41Var3.b);
        }
        if (!ng2Var.g().b.a) {
            throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
        }
        jw3 jw3Var = this.g;
        jw3Var.getClass();
        hcc.K();
        wx3 wx3Var = jw3Var.n;
        if (!(wx3Var != null && wx3Var.e.get())) {
            try {
                jw3Var.a(true, ng2Var, true);
            } catch (Exception unused5) {
            }
        }
        this.g.i(((TaskCompletionSource) ((AtomicReference) ng2Var.h).get()).getTask());
        z41 z41Var4 = this.e;
        file = new File((File) ((r18) z41Var4.c).c, (String) z41Var4.b);
        file.delete();
    }
}
