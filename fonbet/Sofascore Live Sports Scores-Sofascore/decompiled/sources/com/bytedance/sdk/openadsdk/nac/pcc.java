package com.bytedance.sdk.openadsdk.nac;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc implements Comparable<pcc> {
    private long gbb;
    private int gm;
    private int qf;
    private final String sf;
    private int vj;
    private final ArrayList<Long> pcc = new ArrayList<>();
    private final ArrayList<Long> oo = new ArrayList<>();
    private final ArrayList<Long> wh = new ArrayList<>();
    private final ArrayList<Long> kj = new ArrayList<>();
    private final HashMap<String, sf> vy = new HashMap<>();
    private int ork = 0;
    private int vh = 0;
    private final HashMap<String, sf> tmg = new HashMap<>();
    private int hc = 0;
    private final ArrayList<String> jr = new ArrayList<>();

    public pcc(String str) {
        this.sf = str;
    }

    private void sf(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        int[] iArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] tmg = com.bytedance.sdk.openadsdk.wh.pcc.pcc().tmg();
        if (tmg != null) {
            int i4 = 0;
            while (i4 < tmg.length) {
                int i5 = tmg[i4];
                long j = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                long j2 = elapsedRealtime - (i5 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                Iterator<String> it = this.tmg.keySet().iterator();
                long j3 = 0;
                while (it.hasNext()) {
                    long j4 = j;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    sf sfVar = this.tmg.get(next);
                    if (sfVar != null) {
                        long pcc = sfVar.pcc(j2, elapsedRealtime);
                        j3 += pcc;
                        if (pcc <= 0 && i4 == tmg.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j = j4;
                }
                if (j3 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i5)), j3);
                    iArr = tmg;
                    long optInt = jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i5))) + j3;
                    if (optInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i5)), optInt);
                    }
                } else {
                    iArr = tmg;
                }
                i4++;
                tmg = iArr;
            }
        }
        int[] hc = com.bytedance.sdk.openadsdk.wh.pcc.pcc().hc();
        if (hc != null) {
            int i6 = 0;
            while (i6 < hc.length) {
                int i7 = hc[i6];
                long j5 = elapsedRealtime - (i7 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                long j6 = 0;
                int i8 = 0;
                for (String str : this.vy.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i9 = i7;
                    sf sfVar2 = this.vy.get(str);
                    if (sfVar2 != null) {
                        long pcc2 = sfVar2.pcc(j5, elapsedRealtime);
                        j6 += pcc2;
                        if (pcc2 > 20000) {
                            i8++;
                        }
                        if (pcc2 <= 0 && i6 == hc.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i7 = i9;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i10 = i7;
                if (j6 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i10)), j6);
                    long optInt2 = jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i10))) + j6;
                    if (optInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i10)), optInt2);
                    }
                }
                if (i8 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i10)), i8);
                    int optInt3 = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i10))) + i8;
                    if (optInt3 != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i10)), optInt3);
                    }
                }
                i6++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.tmg.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.vy.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.wh.pcc.pcc().jr() && (i3 = this.ork) != 0) {
            jSONObject.put("v_stay_t_s", i3);
            int optInt4 = jSONObject2.optInt("v_stay_t_s") + this.ork;
            if (optInt4 != 0) {
                jSONObject2.put("v_stay_t_s", optInt4);
            }
        }
        if (com.bytedance.sdk.openadsdk.wh.pcc.pcc().gbb() && (i2 = this.hc) != 0) {
            jSONObject.put("lp_stay_t_s", i2);
            int optInt5 = jSONObject2.optInt("lp_stay_t_s") + this.hc;
            if (optInt5 != 0) {
                jSONObject2.put("lp_stay_t_s", optInt5);
            }
        }
        if (!com.bytedance.sdk.openadsdk.wh.pcc.pcc().nac() || (i = this.vh) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i);
        int optInt6 = jSONObject2.optInt("v_30p_play_c_s") + this.vh;
        if (optInt6 != 0) {
            jSONObject2.put("v_30p_play_c_s", optInt6);
        }
    }

    public void pcc(@NonNull String str, @Nullable String str2) {
        sf sfVar;
        sf sfVar2;
        sf sfVar3;
        sf sfVar4;
        sf sfVar5;
        sf sfVar6;
        str.getClass();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (sfVar = this.tmg.get(str2)) != null) {
                    sfVar.oo(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (sfVar2 = this.tmg.get(str2)) != null) {
                    sfVar2.gm(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.tmg.get(str2) == null) {
                    sf sfVar7 = new sf();
                    this.tmg.put(str2, sfVar7);
                    sfVar7.pcc(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (sfVar3 = this.vy.get(str2)) != null && sfVar3.pcc() != sf.vj) {
                    sfVar3.sf(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.wh.pcc.pcc().jr()) {
                        this.ork = (int) (sfVar3.pcc(this.gbb, SystemClock.elapsedRealtime()) + this.ork);
                        break;
                    }
                }
                break;
            case "feed_play":
                this.wh.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.wh.pcc.pcc().kj()) {
                    this.qf++;
                }
                if (!TextUtils.isEmpty(str2) && this.vy.get(str2) == null) {
                    sf sfVar8 = new sf();
                    this.vy.put(str2, sfVar8);
                    sfVar8.pcc(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.pcc.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.wh.pcc.pcc().wh()) {
                    this.gm++;
                    break;
                }
                break;
            case "click":
                if (!this.jr.contains(str2)) {
                    if (this.jr.size() > 50) {
                        this.jr.subList(0, 25).clear();
                    }
                    this.jr.add(str2);
                    this.oo.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.wh.pcc.pcc().qf()) {
                        this.vj++;
                        break;
                    }
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (sfVar4 = this.vy.get(str2)) != null) {
                    sfVar4.oo(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (sfVar5 = this.vy.get(str2)) != null) {
                    sfVar5.gm(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (sfVar6 = this.tmg.get(str2)) != null && sfVar6.pcc() != sf.vj) {
                    sfVar6.sf(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.wh.pcc.pcc().gbb()) {
                        this.hc = (int) (sfVar6.pcc(this.gbb, SystemClock.elapsedRealtime()) + this.hc);
                        break;
                    }
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.wh.pcc.pcc().nac()) {
                    this.vh++;
                    break;
                }
                break;
            case "dislike":
                this.kj.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public String sf() {
        return this.sf;
    }

    public JSONObject pcc(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            pcc(jSONObject2, jSONObject);
            sf(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th) {
            lo.gm(th.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    private void pcc(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i = 0;
        for (int i2 : iArr) {
            long j2 = j - (i2 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            while (size >= 0 && arrayList.get(size).longValue() >= j2) {
                i++;
                size--;
            }
            if (i != 0) {
                jSONObject.put(str + i2, i);
                int optInt = jSONObject2.optInt(str + i2) + i;
                if (optInt != 0) {
                    jSONObject2.put(str + i2, optInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void pcc(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        pcc("show_c_", jSONObject, this.pcc, com.bytedance.sdk.openadsdk.wh.pcc.pcc().vy(), elapsedRealtime, jSONObject2);
        pcc("click_c_", jSONObject, this.oo, com.bytedance.sdk.openadsdk.wh.pcc.pcc().ork(), elapsedRealtime, jSONObject2);
        pcc("v_play_c_", jSONObject, this.wh, com.bytedance.sdk.openadsdk.wh.pcc.pcc().vh(), elapsedRealtime, jSONObject2);
        pcc("dislike_c_", jSONObject, this.kj, com.bytedance.sdk.openadsdk.wh.pcc.pcc().dax(), elapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.wh.pcc.pcc().wh() && (i3 = this.gm) != 0) {
            jSONObject.put("show_c_s", i3);
            int optInt = jSONObject2.optInt("show_c_s") + this.gm;
            if (optInt != 0) {
                jSONObject2.put("show_c_s", optInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.wh.pcc.pcc().qf() && (i2 = this.vj) != 0) {
            jSONObject.put("click_c_s", i2);
            int optInt2 = jSONObject2.optInt("click_c_s") + this.vj;
            if (optInt2 != 0) {
                jSONObject2.put("click_c_s", optInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.wh.pcc.pcc().kj() || (i = this.qf) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i);
        int optInt3 = jSONObject2.optInt("v_play_c_s") + this.qf;
        if (optInt3 != 0) {
            jSONObject2.put("v_play_c_s", optInt3);
        }
    }

    public void pcc() {
        this.gbb = SystemClock.elapsedRealtime();
        this.vh = 0;
        this.vj = 0;
        this.gm = 0;
        this.hc = 0;
        this.ork = 0;
        this.qf = 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public int compareTo(pcc pccVar) {
        return pccVar.gm - this.gm;
    }
}
