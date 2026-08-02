package com.bytedance.sdk.component.wh.pcc.wh;

import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    private final boolean gm;
    private String kj;
    private final String pcc;
    private String qf;
    private final String sf;
    private boolean tmg;
    private boolean vh;
    private final int vj;
    private final String wh;
    private int oo = -1;
    private int vy = 0;
    private String ork = null;

    public oo(String str, String str2, boolean z, int i, String str3) {
        this.pcc = str;
        this.sf = str2;
        this.gm = z;
        this.vj = i;
        this.wh = str3;
    }

    public void gm(String str) {
        this.ork = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.kj)) {
            this.kj = String.valueOf(this.ork);
            return;
        }
        this.kj += BlazeDataSourcePersonalizedType.STRING_SEPARATOR + this.ork;
    }

    public int kj() {
        return this.vy;
    }

    public int oo() {
        return this.oo;
    }

    public boolean ork() {
        return this.vh;
    }

    public Runnable pcc(String str, Map<String, String> map) {
        return pcc.pcc().pcc(this, str, map);
    }

    public String qf() {
        return this.qf;
    }

    public void sf(int i) {
        this.vy = i;
        if (i == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.qf)) {
            this.qf = String.valueOf(this.vy);
            return;
        }
        this.qf += BlazeDataSourcePersonalizedType.STRING_SEPARATOR + this.vy;
    }

    public boolean tmg() {
        return this.tmg;
    }

    public boolean vh() {
        return this.oo == -1;
    }

    public int vj() {
        return this.vj;
    }

    public String vy() {
        return this.kj;
    }

    public String wh() {
        return this.wh;
    }

    public void pcc(int i) {
        this.oo = i;
    }

    public void pcc(String str) {
        this.qf = str;
    }

    public void pcc(boolean z) {
        this.vh = z;
    }

    public String pcc() {
        return this.pcc;
    }

    public String sf() {
        return this.sf;
    }

    public void sf(String str) {
        this.kj = str;
    }

    public void sf(boolean z) {
        this.tmg = z;
    }

    public boolean gm() {
        return this.gm;
    }
}
