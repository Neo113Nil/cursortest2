package defpackage;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class nem implements Serializable {
    private int dax;
    private int fum;
    private String gbb;
    public int gm;
    private boolean gpj;
    private int jr;
    private String kj;
    private boolean lo;
    private long lu;
    private String nac;
    private boolean ork;
    private swm qf;
    public String sf;
    private int tsz;
    private int tz;
    private boolean vy;
    private swm wh;
    private int vh = 204800;
    private int tmg = 0;
    private int hc = 0;
    protected float pcc = -1.0f;
    public final HashMap<String, Object> oo = new HashMap<>();
    private int of = 10000;
    private int yt = 10000;
    private int qy = 10000;
    private int jsj = 0;
    public int vj = 1;
    private JSONObject mk = new JSONObject();

    public nem(String str, swm swmVar, swm swmVar2, int i, int i2) {
        this.fum = 0;
        this.tz = 0;
        this.kj = str;
        this.wh = swmVar;
        this.qf = swmVar2;
        this.fum = i;
        this.tz = i2;
    }

    public String dax() {
        if (gbb()) {
            return this.qf.g;
        }
        swm swmVar = this.wh;
        if (swmVar != null) {
            return swmVar.g;
        }
        return null;
    }

    public int fum() {
        return this.qy;
    }

    public boolean gbb() {
        swm swmVar;
        if (this.tz != 1 || (swmVar = this.qf) == null || TextUtils.isEmpty(swmVar.g)) {
            return false;
        }
        return tem.d == 2 || this.fum == 1;
    }

    public JSONObject gm() {
        return this.mk;
    }

    public int gpj() {
        return this.of;
    }

    public boolean hc() {
        if (gbb()) {
            return this.qf.o == 0;
        }
        swm swmVar = this.wh;
        return swmVar == null || swmVar.o == 0;
    }

    public float jr() {
        float f = this.pcc;
        if (f != -1.0f) {
            return f;
        }
        if (gbb()) {
            this.qf.getClass();
            return -1.0f;
        }
        swm swmVar = this.wh;
        if (swmVar != null) {
            swmVar.getClass();
        }
        return -1.0f;
    }

    public boolean jsj() {
        return this.ork;
    }

    public int kj() {
        return this.jr;
    }

    public int lo() {
        return this.yt;
    }

    public int lu() {
        return this.fum;
    }

    public String nac() {
        if (gbb()) {
            return this.qf.a();
        }
        swm swmVar = this.wh;
        if (swmVar != null) {
            return swmVar.a();
        }
        return null;
    }

    public swm of() {
        return this.wh;
    }

    public int oo() {
        return this.mk.optInt("pitaya_cache_size", 0);
    }

    public long ork() {
        return this.lu;
    }

    public boolean pcc() {
        int i = this.tsz;
        return i == 1 || i == 2;
    }

    public boolean qf() {
        return this.lo;
    }

    public boolean qy() {
        return this.vy;
    }

    public boolean sf() {
        return this.tsz == 2;
    }

    public long tmg() {
        if (gbb()) {
            return this.qf.c;
        }
        swm swmVar = this.wh;
        if (swmVar != null) {
            return swmVar.c;
        }
        return 0L;
    }

    public int tz() {
        return this.jsj;
    }

    public boolean vh() {
        return this.gpj;
    }

    public synchronized Object vj(String str) {
        return this.oo.get(str);
    }

    public int vy() {
        return this.dax;
    }

    public int wh() {
        if (gbb()) {
            return this.qf.b();
        }
        swm swmVar = this.wh;
        if (swmVar != null) {
            return swmVar.b();
        }
        return 0;
    }

    public swm yt() {
        return this.qf;
    }

    public void gm(int i) {
        this.dax = i;
    }

    public void kj(int i) {
        this.jsj = i;
    }

    public void qf(int i) {
        this.qy = i;
    }

    public void gm(String str) {
        this.nac = str;
    }

    public void gm(boolean z) {
        this.ork = z;
    }

    public void sf(String str) {
        this.gbb = str;
    }

    public void oo(String str) {
        this.sf = str;
    }

    public void sf(int i) {
        this.jr = i;
    }

    public void oo(int i) {
        this.gm = i;
    }

    public void sf(boolean z) {
        this.vy = z;
    }

    public void pcc(int i) {
        this.tsz = i;
    }

    public String vj() {
        return this.kj;
    }

    public void pcc(String str) {
        this.kj = str;
    }

    public void vj(int i) {
        this.of = i;
    }

    public void pcc(long j) {
        this.lu = j;
    }

    public void pcc(boolean z) {
        this.gpj = z;
    }

    public synchronized void pcc(String str, Object obj) {
        this.oo.put(str, obj);
    }

    public void wh(int i) {
        this.yt = i;
    }
}
