package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class itm {
    private ftm gm;
    private int oo;
    private final long pcc = System.currentTimeMillis();
    private final String sf;
    private Object vj;
    private int wh;

    public itm(String str, ftm ftmVar) {
        this.sf = str;
        this.gm = ftmVar;
    }

    public Object gm() {
        ftm ftmVar;
        Object obj = this.vj;
        if (obj != null || (ftmVar = this.gm) == null) {
            return obj;
        }
        Object pcc = ftmVar.pcc();
        this.vj = pcc;
        return pcc;
    }

    public abstract byte[] oo();

    public long pcc() {
        return this.pcc;
    }

    public abstract int qf();

    public int sf() {
        return this.oo;
    }

    public String toString() {
        return super.toString();
    }

    public int vj() {
        return this.wh;
    }

    public String wh() {
        return this.sf;
    }

    public void pcc(int i) {
        this.oo = i;
    }

    public void sf(int i) {
        this.wh = i;
    }

    public itm(String str, Object obj) {
        this.sf = str;
        this.vj = obj;
    }
}
