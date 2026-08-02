package com.bytedance.sdk.openadsdk.core.gbb.gm;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.bf3;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private static boolean oo = false;
    private static SimpleDateFormat pcc;

    @NonNull
    private final Map<sf, String> gm;

    @NonNull
    private final List<String> sf;

    public gm(@NonNull List<String> list, of ofVar) {
        int hh;
        this.sf = list;
        HashMap hashMap = new HashMap();
        this.gm = hashMap;
        hashMap.put(sf.CACHEBUSTING, gm());
        hashMap.put(sf.TIMESTAMP, sf());
        hashMap.put(sf.APPBUNDLE, lu.pcc().getPackageName());
        sf sfVar = sf.PLAYERSTATE;
        hashMap.put(sfVar, "");
        if (ofVar != null && ((hh = ofVar.hh()) == 3 || hh == 7 || hh == 8)) {
            hashMap.put(sfVar, "fullscreen");
        }
        hashMap.put(sf.SERVERSIDE, "0");
    }

    @NonNull
    private String gm() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    private String sf() {
        SimpleDateFormat simpleDateFormat = pcc;
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
            pcc = simpleDateFormat;
        }
        String format = simpleDateFormat.format(new Date());
        if (!oo) {
            return format;
        }
        int jsj = kun.jsj();
        if (jsj < 0) {
            if (jsj > -10) {
                StringBuilder p = bf3.p(format, "-0");
                p.append(-jsj);
                return p.toString();
            }
            return format + jsj;
        }
        if (jsj < 10) {
            return format + "+0" + jsj;
        }
        return format + "+" + jsj;
    }

    @NonNull
    public List<String> pcc() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.sf) {
            if (!TextUtils.isEmpty(str)) {
                for (sf sfVar : sf.values()) {
                    String str2 = this.gm.get(sfVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = sfVar == sf.__MRC_IMPRESSION_ID__ ? str.replaceAll(sfVar.name(), str2) : str.replaceAll("\\[" + sfVar.name() + "\\]", str2);
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @NonNull
    public gm pcc(@Nullable com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc pccVar) {
        if (pccVar != null) {
            this.gm.put(sf.ERRORCODE, pccVar.pcc());
        }
        return this;
    }

    @NonNull
    public gm pcc(@Nullable long j) {
        if (j >= 0) {
            String sf = sf(j);
            if (!TextUtils.isEmpty(sf)) {
                this.gm.put(sf.CONTENTPLAYHEAD, sf);
            }
        }
        return this;
    }

    public gm pcc(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.gm.put(sf.__MRC_IMPRESSION_ID__, str);
        }
        return this;
    }

    @NonNull
    public gm sf(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, C.UTF8_NAME);
            } catch (Throwable unused) {
            }
            this.gm.put(sf.ASSETURI, str);
        }
        return this;
    }

    @NonNull
    private String sf(long j) {
        return String.format(Locale.getDefault(), "%02d:%02d:%02d.%03d", Long.valueOf(j / 3600000), Long.valueOf((j / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) % 60), Long.valueOf((j / 1000) % 60), Long.valueOf(j % 1000));
    }
}
