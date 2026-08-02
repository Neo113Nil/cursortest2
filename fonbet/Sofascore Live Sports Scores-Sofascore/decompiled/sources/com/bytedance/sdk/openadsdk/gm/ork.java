package com.bytedance.sdk.openadsdk.gm;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork {
    private int dax;
    private of gbb;
    private JSONObject hc;
    private int jr;
    private FilterWord nac;
    private String ork;
    private String tmg;
    private String vh;
    public static FilterWord pcc = new FilterWord("", "");
    public static int sf = 1;
    public static int gm = 2;
    public static int oo = 3;
    public static int vj = 4;
    private final Set<gm> wh = new HashSet();
    private final Set<sf> qf = new HashSet();
    private final Set<oo> kj = new HashSet();
    private final Set<pcc> vy = new HashSet();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface gm {
        void pcc(FilterWord filterWord);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface oo {
        void pcc(String str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(List<FilterWord> list);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void pcc(int i);
    }

    private void ork() {
        Iterator<gm> it = this.wh.iterator();
        while (it.hasNext()) {
            it.next().pcc(this.nac);
        }
    }

    public void gm(String str) {
        this.tmg = str;
        Iterator<oo> it = this.kj.iterator();
        while (it.hasNext()) {
            it.next().pcc(this.tmg);
        }
    }

    public int kj() {
        return this.jr;
    }

    public void oo() {
        of ofVar;
        if (!gm() && !TextUtils.isEmpty(this.tmg)) {
            this.nac = new FilterWord("0:00", this.tmg);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.nac);
        if (!TextUtils.isEmpty(this.ork)) {
            if (TextUtils.isEmpty(this.tmg)) {
                com.bytedance.sdk.openadsdk.gm.sf.pcc().pcc(this.ork, arrayList, this.vh);
            } else {
                if (this.hc == null && (ofVar = this.gbb) != null) {
                    this.hc = ofVar.hc(true);
                }
                com.bytedance.sdk.openadsdk.gm.sf.pcc().pcc(this.ork, arrayList, this.hc, this.tmg, this.vh);
            }
        }
        Iterator<sf> it = this.qf.iterator();
        while (it.hasNext()) {
            it.next().pcc(sf);
        }
        pcc(pcc);
        gm("");
    }

    public void pcc(List<FilterWord> list) {
        Iterator<pcc> it = this.vy.iterator();
        while (it.hasNext()) {
            it.next().pcc(list);
        }
    }

    public String qf() {
        return this.tmg;
    }

    public void sf(String str) {
        this.vh = str;
    }

    public void vj() {
        Iterator<sf> it = this.qf.iterator();
        while (it.hasNext()) {
            it.next().pcc(gm);
        }
    }

    public boolean vy() {
        return this.jr < this.dax;
    }

    public void wh() {
        Iterator<sf> it = this.qf.iterator();
        while (it.hasNext()) {
            it.next().pcc(vj);
        }
    }

    public FilterWord sf() {
        return this.nac;
    }

    public void pcc(String str) {
        this.ork = str;
    }

    public void pcc(FilterWord filterWord) {
        this.nac = filterWord;
        ork();
    }

    public void pcc(gm gmVar) {
        this.wh.add(gmVar);
    }

    public boolean gm() {
        FilterWord filterWord = this.nac;
        return (filterWord == null || filterWord.equals(pcc)) ? false : true;
    }

    public void pcc(sf sfVar) {
        this.qf.add(sfVar);
    }

    public void pcc(oo ooVar) {
        this.kj.add(ooVar);
    }

    public void pcc(pcc pccVar) {
        this.vy.add(pccVar);
    }

    public void pcc() {
        this.wh.clear();
        this.qf.clear();
        this.kj.clear();
        this.vy.clear();
    }

    public void pcc(of ofVar) {
        this.gbb = ofVar;
    }

    public void pcc(int i, int i2) {
        this.jr = i;
        this.dax = i2;
    }
}
