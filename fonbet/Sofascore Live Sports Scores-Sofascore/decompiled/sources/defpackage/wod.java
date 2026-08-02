package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wod implements xd4, qh2 {
    public final yg2 a;
    public final qz8 b;
    public cp3 c;
    public i2g d;
    public wd4 e;
    public volatile pof f;

    public wod(yg2 yg2Var, qz8 qz8Var) {
        this.a = yg2Var;
        this.b = qz8Var;
    }

    @Override // defpackage.xd4
    public final void a() {
        try {
            cp3 cp3Var = this.c;
            if (cp3Var != null) {
                cp3Var.close();
            }
        } catch (IOException unused) {
        }
        i2g i2gVar = this.d;
        if (i2gVar != null) {
            i2gVar.close();
        }
        this.e = null;
    }

    @Override // defpackage.xd4
    public final void b(k7f k7fVar, wd4 wd4Var) {
        pzf pzfVar = new pzf();
        pzfVar.f(this.b.d());
        for (Map.Entry entry : this.b.b.a().entrySet()) {
            pzfVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        qzf qzfVar = new qzf(pzfVar);
        this.e = wd4Var;
        jod jodVar = (jod) this.a;
        jodVar.getClass();
        this.f = new pof(jodVar, qzfVar);
        FirebasePerfOkHttpClient.enqueue(this.f, this);
    }

    @Override // defpackage.xd4
    public final Class c() {
        return InputStream.class;
    }

    @Override // defpackage.xd4
    public final void cancel() {
        pof pofVar = this.f;
        if (pofVar != null) {
            pofVar.cancel();
        }
    }

    @Override // defpackage.xd4
    public final int e() {
        return 2;
    }

    @Override // defpackage.qh2
    public final void onFailure(ah2 ah2Var, IOException iOException) {
        this.e.d(iOException);
    }

    @Override // defpackage.qh2
    public final void onResponse(ah2 ah2Var, d2g d2gVar) {
        i2g i2gVar = d2gVar.g;
        this.d = i2gVar;
        if (!d2gVar.q) {
            this.e.d(new jz2(d2gVar.d, (IOException) null, d2gVar.c));
        } else {
            w1a.m(i2gVar, "Argument must not be null");
            cp3 cp3Var = new cp3(i2gVar.contentLength(), this.d.byteStream());
            this.c = cp3Var;
            this.e.l(cp3Var);
        }
    }
}
