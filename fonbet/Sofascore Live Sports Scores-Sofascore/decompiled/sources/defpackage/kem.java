package defpackage;

import com.ironsource.Ua;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class kem {
    private final String gm;
    private boolean kj;
    private boolean oo;
    private bem qf;
    private boolean tmg;
    private eem vj;
    private boolean wh;
    private final HashMap<Class<? extends itm>, iwm> pcc = new HashMap<>();
    private final HashSet<String> sf = new HashSet<>();
    private long vy = Ua.C;
    private int ork = 2;
    private boolean vh = false;

    public kem(String str) {
        this.gm = str;
    }

    public final kem gm(boolean z) {
        if (this.oo) {
            return this;
        }
        this.kj = z;
        return this;
    }

    public int kj() {
        return this.ork;
    }

    public void oo(boolean z) {
        if (this.oo) {
            return;
        }
        this.vh = z;
    }

    public boolean ork() {
        return this.tmg;
    }

    public final kem pcc(Class<? extends itm> cls, iwm iwmVar) {
        if (!this.oo && cls != null && iwmVar != null) {
            String oo = iwmVar.oo();
            if (!this.sf.contains(oo)) {
                this.sf.add(oo);
                this.pcc.put(cls, iwmVar);
            }
        }
        return this;
    }

    public abstract boolean pcc();

    public long qf() {
        return this.vy;
    }

    public bem sf() {
        return this.qf;
    }

    public kem vj(boolean z) {
        if (this.oo) {
            return this;
        }
        this.tmg = z;
        return this;
    }

    public boolean vy() {
        return this.vh;
    }

    public final boolean wh() {
        return this.wh;
    }

    public final void sf(boolean z) {
        this.oo = z;
    }

    public final String gm() {
        return this.gm;
    }

    public final eem oo() {
        return this.vj;
    }

    public final HashMap<Class<? extends itm>, iwm> vj() {
        return this.pcc;
    }

    public final kem pcc(bem bemVar) {
        if (this.oo) {
            return this;
        }
        this.qf = bemVar;
        return this;
    }

    public final kem pcc(eem eemVar) {
        if (this.oo) {
            return this;
        }
        this.vj = eemVar;
        return this;
    }

    public final kem pcc(boolean z) {
        if (this.oo) {
            return this;
        }
        this.wh = z;
        return this;
    }

    public kem pcc(long j) {
        if (this.oo) {
            return this;
        }
        this.vy = j;
        return this;
    }

    public kem pcc(int i) {
        if (this.oo) {
            return this;
        }
        this.ork = i;
        return this;
    }
}
