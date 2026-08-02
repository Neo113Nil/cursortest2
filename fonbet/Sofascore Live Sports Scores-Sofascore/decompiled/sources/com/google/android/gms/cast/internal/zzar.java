package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.Ua;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.bhn;
import defpackage.x5n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzar extends zzd {
    public static final String z;
    public long e;
    public MediaStatus f;
    public Long g;
    public zzao h;
    public int i;
    public final zzav j;
    public final zzav k;
    public final zzav l;
    public final zzav m;
    public final zzav n;
    public final zzav o;
    public final zzav p;
    public final zzav q;
    public final zzav r;
    public final zzav s;
    public final zzav t;
    public final zzav u;
    public final zzav v;
    public final zzav w;
    public final zzav x;
    public final zzav y;

    static {
        Pattern pattern = CastUtils.a;
        z = "urn:x-cast:com.google.cast.media";
    }

    public zzar() {
        super(z);
        this.i = -1;
        zzav zzavVar = new zzav(86400000L, "load");
        this.j = zzavVar;
        zzav zzavVar2 = new zzav(86400000L, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.k = zzavVar2;
        zzav zzavVar3 = new zzav(86400000L, "play");
        this.l = zzavVar3;
        zzav zzavVar4 = new zzav(86400000L, "stop");
        this.m = zzavVar4;
        zzav zzavVar5 = new zzav(Ua.s, "seek");
        this.n = zzavVar5;
        zzav zzavVar6 = new zzav(86400000L, "volume");
        this.o = zzavVar6;
        zzav zzavVar7 = new zzav(86400000L, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        this.p = zzavVar7;
        zzav zzavVar8 = new zzav(86400000L, "status");
        this.q = zzavVar8;
        zzav zzavVar9 = new zzav(86400000L, "activeTracks");
        this.r = zzavVar9;
        zzav zzavVar10 = new zzav(86400000L, "trackStyle");
        zzav zzavVar11 = new zzav(86400000L, "queueInsert");
        zzav zzavVar12 = new zzav(86400000L, "queueUpdate");
        this.s = zzavVar12;
        zzav zzavVar13 = new zzav(86400000L, "queueRemove");
        this.t = zzavVar13;
        zzav zzavVar14 = new zzav(86400000L, "queueReorder");
        zzav zzavVar15 = new zzav(86400000L, "queueFetchItemIds");
        this.u = zzavVar15;
        zzav zzavVar16 = new zzav(86400000L, "queueFetchItemRange");
        this.w = zzavVar16;
        this.v = new zzav(86400000L, "queueFetchItems");
        zzav zzavVar17 = new zzav(86400000L, "setPlaybackRate");
        this.x = zzavVar17;
        zzav zzavVar18 = new zzav(86400000L, "skipAd");
        this.y = zzavVar18;
        c(zzavVar);
        c(zzavVar2);
        c(zzavVar3);
        c(zzavVar4);
        c(zzavVar5);
        c(zzavVar6);
        c(zzavVar7);
        c(zzavVar8);
        c(zzavVar9);
        c(zzavVar10);
        c(zzavVar11);
        c(zzavVar12);
        c(zzavVar13);
        c(zzavVar14);
        c(zzavVar15);
        c(zzavVar16);
        c(zzavVar16);
        c(zzavVar17);
        c(zzavVar18);
        j();
    }

    public static int[] i(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public static zzaq k(JSONObject jSONObject) {
        MediaError.Y0(jSONObject);
        zzaq zzaqVar = new zzaq();
        Pattern pattern = CastUtils.a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return zzaqVar;
    }

    public final void d(zzat zzatVar, int i, long j, int i2, Integer num) {
        if (j != -1 && j < 0) {
            a70.p(x5n.m(j, "playPosition cannot be negative: ", new StringBuilder(String.valueOf(j).length() + 33)));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        long b = b();
        try {
            jSONObject.put("requestId", b);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", f());
            if (i != 0) {
                jSONObject.put("currentItemId", i);
            }
            if (i2 != 0) {
                jSONObject.put("jump", i2);
            }
            String b2 = MediaCommon.b(num);
            if (b2 != null) {
                jSONObject.put("repeatMode", b2);
            }
            if (j != -1) {
                Pattern pattern = CastUtils.a;
                jSONObject.put("currentTime", j / 1000.0d);
            }
            int i3 = this.i;
            if (i3 != -1) {
                jSONObject.put("sequenceNumber", i3);
            }
        } catch (JSONException unused) {
        }
        a(b, jSONObject.toString());
        this.s.a(b, new bhn(this, zzatVar, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0147, code lost:
    
        if (r9 != false) goto L74;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[Catch: JSONException -> 0x005b, TryCatch #0 {JSONException -> 0x005b, blocks: (B:3:0x0011, B:8:0x003f, B:10:0x004b, B:12:0x0055, B:20:0x0066, B:22:0x0072, B:24:0x0083, B:29:0x009e, B:32:0x00a3, B:33:0x00e4, B:35:0x00e8, B:36:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0104, B:42:0x010a, B:44:0x010e, B:46:0x0112, B:47:0x0115, B:49:0x0119, B:51:0x011d, B:52:0x0120, B:54:0x0124, B:56:0x0128, B:57:0x012b, B:59:0x012f, B:61:0x0139, B:62:0x013c, B:64:0x0140, B:65:0x0149, B:67:0x014d, B:68:0x016f, B:69:0x0173, B:71:0x0179, B:77:0x00a8, B:78:0x008c, B:80:0x0094, B:84:0x0151, B:86:0x0157, B:87:0x015a, B:89:0x015e, B:90:0x0161, B:92:0x0165, B:93:0x0168, B:95:0x016c, B:99:0x018b, B:100:0x0196, B:102:0x019c, B:108:0x01b2, B:110:0x01be, B:112:0x01d2, B:116:0x01e3, B:121:0x01f1, B:123:0x0206, B:125:0x021f, B:130:0x022d, B:135:0x023b, B:144:0x0249, B:145:0x024d, B:147:0x0253, B:149:0x0261, B:151:0x0265, B:157:0x0276, B:162:0x0286, B:163:0x0291, B:165:0x0297, B:171:0x02af, B:175:0x02bc, B:176:0x02c8, B:178:0x02ce, B:180:0x02e0, B:185:0x02ee), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8 A[Catch: JSONException -> 0x005b, TryCatch #0 {JSONException -> 0x005b, blocks: (B:3:0x0011, B:8:0x003f, B:10:0x004b, B:12:0x0055, B:20:0x0066, B:22:0x0072, B:24:0x0083, B:29:0x009e, B:32:0x00a3, B:33:0x00e4, B:35:0x00e8, B:36:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0104, B:42:0x010a, B:44:0x010e, B:46:0x0112, B:47:0x0115, B:49:0x0119, B:51:0x011d, B:52:0x0120, B:54:0x0124, B:56:0x0128, B:57:0x012b, B:59:0x012f, B:61:0x0139, B:62:0x013c, B:64:0x0140, B:65:0x0149, B:67:0x014d, B:68:0x016f, B:69:0x0173, B:71:0x0179, B:77:0x00a8, B:78:0x008c, B:80:0x0094, B:84:0x0151, B:86:0x0157, B:87:0x015a, B:89:0x015e, B:90:0x0161, B:92:0x0165, B:93:0x0168, B:95:0x016c, B:99:0x018b, B:100:0x0196, B:102:0x019c, B:108:0x01b2, B:110:0x01be, B:112:0x01d2, B:116:0x01e3, B:121:0x01f1, B:123:0x0206, B:125:0x021f, B:130:0x022d, B:135:0x023b, B:144:0x0249, B:145:0x024d, B:147:0x0253, B:149:0x0261, B:151:0x0265, B:157:0x0276, B:162:0x0286, B:163:0x0291, B:165:0x0297, B:171:0x02af, B:175:0x02bc, B:176:0x02c8, B:178:0x02ce, B:180:0x02e0, B:185:0x02ee), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8 A[Catch: JSONException -> 0x005b, TryCatch #0 {JSONException -> 0x005b, blocks: (B:3:0x0011, B:8:0x003f, B:10:0x004b, B:12:0x0055, B:20:0x0066, B:22:0x0072, B:24:0x0083, B:29:0x009e, B:32:0x00a3, B:33:0x00e4, B:35:0x00e8, B:36:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0104, B:42:0x010a, B:44:0x010e, B:46:0x0112, B:47:0x0115, B:49:0x0119, B:51:0x011d, B:52:0x0120, B:54:0x0124, B:56:0x0128, B:57:0x012b, B:59:0x012f, B:61:0x0139, B:62:0x013c, B:64:0x0140, B:65:0x0149, B:67:0x014d, B:68:0x016f, B:69:0x0173, B:71:0x0179, B:77:0x00a8, B:78:0x008c, B:80:0x0094, B:84:0x0151, B:86:0x0157, B:87:0x015a, B:89:0x015e, B:90:0x0161, B:92:0x0165, B:93:0x0168, B:95:0x016c, B:99:0x018b, B:100:0x0196, B:102:0x019c, B:108:0x01b2, B:110:0x01be, B:112:0x01d2, B:116:0x01e3, B:121:0x01f1, B:123:0x0206, B:125:0x021f, B:130:0x022d, B:135:0x023b, B:144:0x0249, B:145:0x024d, B:147:0x0253, B:149:0x0261, B:151:0x0265, B:157:0x0276, B:162:0x0286, B:163:0x0291, B:165:0x0297, B:171:0x02af, B:175:0x02bc, B:176:0x02c8, B:178:0x02ce, B:180:0x02e0, B:185:0x02ee), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104 A[Catch: JSONException -> 0x005b, TryCatch #0 {JSONException -> 0x005b, blocks: (B:3:0x0011, B:8:0x003f, B:10:0x004b, B:12:0x0055, B:20:0x0066, B:22:0x0072, B:24:0x0083, B:29:0x009e, B:32:0x00a3, B:33:0x00e4, B:35:0x00e8, B:36:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0104, B:42:0x010a, B:44:0x010e, B:46:0x0112, B:47:0x0115, B:49:0x0119, B:51:0x011d, B:52:0x0120, B:54:0x0124, B:56:0x0128, B:57:0x012b, B:59:0x012f, B:61:0x0139, B:62:0x013c, B:64:0x0140, B:65:0x0149, B:67:0x014d, B:68:0x016f, B:69:0x0173, B:71:0x0179, B:77:0x00a8, B:78:0x008c, B:80:0x0094, B:84:0x0151, B:86:0x0157, B:87:0x015a, B:89:0x015e, B:90:0x0161, B:92:0x0165, B:93:0x0168, B:95:0x016c, B:99:0x018b, B:100:0x0196, B:102:0x019c, B:108:0x01b2, B:110:0x01be, B:112:0x01d2, B:116:0x01e3, B:121:0x01f1, B:123:0x0206, B:125:0x021f, B:130:0x022d, B:135:0x023b, B:144:0x0249, B:145:0x024d, B:147:0x0253, B:149:0x0261, B:151:0x0265, B:157:0x0276, B:162:0x0286, B:163:0x0291, B:165:0x0297, B:171:0x02af, B:175:0x02bc, B:176:0x02c8, B:178:0x02ce, B:180:0x02e0, B:185:0x02ee), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e A[Catch: JSONException -> 0x005b, TryCatch #0 {JSONException -> 0x005b, blocks: (B:3:0x0011, B:8:0x003f, B:10:0x004b, B:12:0x0055, B:20:0x0066, B:22:0x0072, B:24:0x0083, B:29:0x009e, B:32:0x00a3, B:33:0x00e4, B:35:0x00e8, B:36:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0104, B:42:0x010a, B:44:0x010e, B:46:0x0112, B:47:0x0115, B:49:0x0119, B:51:0x011d, B:52:0x0120, B:54:0x0124, B:56:0x0128, B:57:0x012b, B:59:0x012f, B:61:0x0139, B:62:0x013c, B:64:0x0140, B:65:0x0149, B:67:0x014d, B:68:0x016f, B:69:0x0173, B:71:0x0179, B:77:0x00a8, B:78:0x008c, B:80:0x0094, B:84:0x0151, B:86:0x0157, B:87:0x015a, B:89:0x015e, B:90:0x0161, B:92:0x0165, B:93:0x0168, B:95:0x016c, B:99:0x018b, B:100:0x0196, B:102:0x019c, B:108:0x01b2, B:110:0x01be, B:112:0x01d2, B:116:0x01e3, B:121:0x01f1, B:123:0x0206, B:125:0x021f, B:130:0x022d, B:135:0x023b, B:144:0x0249, B:145:0x024d, B:147:0x0253, B:149:0x0261, B:151:0x0265, B:157:0x0276, B:162:0x0286, B:163:0x0291, B:165:0x0297, B:171:0x02af, B:175:0x02bc, B:176:0x02c8, B:178:0x02ce, B:180:0x02e0, B:185:0x02ee), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119 A[Catch: JSONException -> 0x005b, TryCatch #0 {JSONException -> 0x005b, blocks: (B:3:0x0011, B:8:0x003f, B:10:0x004b, B:12:0x0055, B:20:0x0066, B:22:0x0072, B:24:0x0083, B:29:0x009e, B:32:0x00a3, B:33:0x00e4, B:35:0x00e8, B:36:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0104, B:42:0x010a, B:44:0x010e, B:46:0x0112, B:47:0x0115, B:49:0x0119, B:51:0x011d, B:52:0x0120, B:54:0x0124, B:56:0x0128, B:57:0x012b, B:59:0x012f, B:61:0x0139, B:62:0x013c, B:64:0x0140, B:65:0x0149, B:67:0x014d, B:68:0x016f, B:69:0x0173, B:71:0x0179, B:77:0x00a8, B:78:0x008c, B:80:0x0094, B:84:0x0151, B:86:0x0157, B:87:0x015a, B:89:0x015e, B:90:0x0161, B:92:0x0165, B:93:0x0168, B:95:0x016c, B:99:0x018b, B:100:0x0196, B:102:0x019c, B:108:0x01b2, B:110:0x01be, B:112:0x01d2, B:116:0x01e3, B:121:0x01f1, B:123:0x0206, B:125:0x021f, B:130:0x022d, B:135:0x023b, B:144:0x0249, B:145:0x024d, B:147:0x0253, B:149:0x0261, B:151:0x0265, B:157:0x0276, B:162:0x0286, B:163:0x0291, B:165:0x0297, B:171:0x02af, B:175:0x02bc, B:176:0x02c8, B:178:0x02ce, B:180:0x02e0, B:185:0x02ee), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124 A[Catch: JSONException -> 0x005b, TryCatch #0 {JSONException -> 0x005b, blocks: (B:3:0x0011, B:8:0x003f, B:10:0x004b, B:12:0x0055, B:20:0x0066, B:22:0x0072, B:24:0x0083, B:29:0x009e, B:32:0x00a3, B:33:0x00e4, B:35:0x00e8, B:36:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0104, B:42:0x010a, B:44:0x010e, B:46:0x0112, B:47:0x0115, B:49:0x0119, B:51:0x011d, B:52:0x0120, B:54:0x0124, B:56:0x0128, B:57:0x012b, B:59:0x012f, B:61:0x0139, B:62:0x013c, B:64:0x0140, B:65:0x0149, B:67:0x014d, B:68:0x016f, B:69:0x0173, B:71:0x0179, B:77:0x00a8, B:78:0x008c, B:80:0x0094, B:84:0x0151, B:86:0x0157, B:87:0x015a, B:89:0x015e, B:90:0x0161, B:92:0x0165, B:93:0x0168, B:95:0x016c, B:99:0x018b, B:100:0x0196, B:102:0x019c, B:108:0x01b2, B:110:0x01be, B:112:0x01d2, B:116:0x01e3, B:121:0x01f1, B:123:0x0206, B:125:0x021f, B:130:0x022d, B:135:0x023b, B:144:0x0249, B:145:0x024d, B:147:0x0253, B:149:0x0261, B:151:0x0265, B:157:0x0276, B:162:0x0286, B:163:0x0291, B:165:0x0297, B:171:0x02af, B:175:0x02bc, B:176:0x02c8, B:178:0x02ce, B:180:0x02e0, B:185:0x02ee), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012f A[Catch: JSONException -> 0x005b, TryCatch #0 {JSONException -> 0x005b, blocks: (B:3:0x0011, B:8:0x003f, B:10:0x004b, B:12:0x0055, B:20:0x0066, B:22:0x0072, B:24:0x0083, B:29:0x009e, B:32:0x00a3, B:33:0x00e4, B:35:0x00e8, B:36:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0104, B:42:0x010a, B:44:0x010e, B:46:0x0112, B:47:0x0115, B:49:0x0119, B:51:0x011d, B:52:0x0120, B:54:0x0124, B:56:0x0128, B:57:0x012b, B:59:0x012f, B:61:0x0139, B:62:0x013c, B:64:0x0140, B:65:0x0149, B:67:0x014d, B:68:0x016f, B:69:0x0173, B:71:0x0179, B:77:0x00a8, B:78:0x008c, B:80:0x0094, B:84:0x0151, B:86:0x0157, B:87:0x015a, B:89:0x015e, B:90:0x0161, B:92:0x0165, B:93:0x0168, B:95:0x016c, B:99:0x018b, B:100:0x0196, B:102:0x019c, B:108:0x01b2, B:110:0x01be, B:112:0x01d2, B:116:0x01e3, B:121:0x01f1, B:123:0x0206, B:125:0x021f, B:130:0x022d, B:135:0x023b, B:144:0x0249, B:145:0x024d, B:147:0x0253, B:149:0x0261, B:151:0x0265, B:157:0x0276, B:162:0x0286, B:163:0x0291, B:165:0x0297, B:171:0x02af, B:175:0x02bc, B:176:0x02c8, B:178:0x02ce, B:180:0x02e0, B:185:0x02ee), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140 A[Catch: JSONException -> 0x005b, TryCatch #0 {JSONException -> 0x005b, blocks: (B:3:0x0011, B:8:0x003f, B:10:0x004b, B:12:0x0055, B:20:0x0066, B:22:0x0072, B:24:0x0083, B:29:0x009e, B:32:0x00a3, B:33:0x00e4, B:35:0x00e8, B:36:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0104, B:42:0x010a, B:44:0x010e, B:46:0x0112, B:47:0x0115, B:49:0x0119, B:51:0x011d, B:52:0x0120, B:54:0x0124, B:56:0x0128, B:57:0x012b, B:59:0x012f, B:61:0x0139, B:62:0x013c, B:64:0x0140, B:65:0x0149, B:67:0x014d, B:68:0x016f, B:69:0x0173, B:71:0x0179, B:77:0x00a8, B:78:0x008c, B:80:0x0094, B:84:0x0151, B:86:0x0157, B:87:0x015a, B:89:0x015e, B:90:0x0161, B:92:0x0165, B:93:0x0168, B:95:0x016c, B:99:0x018b, B:100:0x0196, B:102:0x019c, B:108:0x01b2, B:110:0x01be, B:112:0x01d2, B:116:0x01e3, B:121:0x01f1, B:123:0x0206, B:125:0x021f, B:130:0x022d, B:135:0x023b, B:144:0x0249, B:145:0x024d, B:147:0x0253, B:149:0x0261, B:151:0x0265, B:157:0x0276, B:162:0x0286, B:163:0x0291, B:165:0x0297, B:171:0x02af, B:175:0x02bc, B:176:0x02c8, B:178:0x02ce, B:180:0x02e0, B:185:0x02ee), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014d A[Catch: JSONException -> 0x005b, TryCatch #0 {JSONException -> 0x005b, blocks: (B:3:0x0011, B:8:0x003f, B:10:0x004b, B:12:0x0055, B:20:0x0066, B:22:0x0072, B:24:0x0083, B:29:0x009e, B:32:0x00a3, B:33:0x00e4, B:35:0x00e8, B:36:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0104, B:42:0x010a, B:44:0x010e, B:46:0x0112, B:47:0x0115, B:49:0x0119, B:51:0x011d, B:52:0x0120, B:54:0x0124, B:56:0x0128, B:57:0x012b, B:59:0x012f, B:61:0x0139, B:62:0x013c, B:64:0x0140, B:65:0x0149, B:67:0x014d, B:68:0x016f, B:69:0x0173, B:71:0x0179, B:77:0x00a8, B:78:0x008c, B:80:0x0094, B:84:0x0151, B:86:0x0157, B:87:0x015a, B:89:0x015e, B:90:0x0161, B:92:0x0165, B:93:0x0168, B:95:0x016c, B:99:0x018b, B:100:0x0196, B:102:0x019c, B:108:0x01b2, B:110:0x01be, B:112:0x01d2, B:116:0x01e3, B:121:0x01f1, B:123:0x0206, B:125:0x021f, B:130:0x022d, B:135:0x023b, B:144:0x0249, B:145:0x024d, B:147:0x0253, B:149:0x0261, B:151:0x0265, B:157:0x0276, B:162:0x0286, B:163:0x0291, B:165:0x0297, B:171:0x02af, B:175:0x02bc, B:176:0x02c8, B:178:0x02ce, B:180:0x02e0, B:185:0x02ee), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(String str) {
        int i;
        int i2;
        boolean z2;
        zzao zzaoVar;
        zzao zzaoVar2;
        zzao zzaoVar3;
        zzao zzaoVar4;
        MediaStatus mediaStatus;
        int[] i3;
        Logger logger = this.a;
        logger.a("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1L);
            int hashCode = string.hashCode();
            zzav zzavVar = this.j;
            List list = this.d;
            switch (hashCode) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        zzavVar.d(optLong, 2101, k(jSONObject));
                        break;
                    }
                    break;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        this.v.d(optLong, 0, null);
                        h("QUEUE_ITEMS", jSONObject);
                        if (this.h == null) {
                            break;
                        } else {
                            JSONArray jSONArray = jSONObject.getJSONArray("items");
                            MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[jSONArray.length()];
                            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                mediaQueueItemArr[i4] = new MediaQueueItem.Builder(jSONArray.getJSONObject(i4)).a();
                            }
                            this.h.d(mediaQueueItemArr);
                            break;
                        }
                    }
                    break;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        logger.c("received unexpected error: Invalid Request.", new Object[0]);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((zzav) it.next()).d(optLong, 2001, k(jSONObject));
                        }
                        break;
                    }
                    break;
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        zzavVar.d(optLong, 2100, k(jSONObject));
                        break;
                    }
                    break;
                case 66247144:
                    if (string.equals("ERROR")) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((zzav) it2.next()).d(optLong, 2100, k(jSONObject));
                        }
                        if (this.h != null) {
                            MediaError.Y0(jSONObject);
                            this.h.zzf();
                            break;
                        }
                    }
                    break;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        this.w.d(optLong, 0, null);
                        h("QUEUE_CHANGE", jSONObject);
                        if (this.h != null) {
                            String string2 = jSONObject.getString("changeType");
                            int[] i5 = i(jSONObject.getJSONArray("itemIds"));
                            int optInt = jSONObject.optInt("insertBefore", 0);
                            if (i5 != null) {
                                switch (string2.hashCode()) {
                                    case -2130463047:
                                        if (string2.equals("INSERT")) {
                                            this.h.j(optInt, i5);
                                            break;
                                        }
                                        break;
                                    case -1881281404:
                                        if (string2.equals("REMOVE")) {
                                            this.h.m(i5);
                                            break;
                                        }
                                        break;
                                    case -1785516855:
                                        if (string2.equals("UPDATE")) {
                                            int[] i6 = i(jSONObject.getJSONArray("itemIds"));
                                            Preconditions.j(i6, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                            JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                            if (optJSONArray != null) {
                                                ArrayList e = CastUtils.e(i6);
                                                int optInt2 = jSONObject.optInt("insertBefore", 0);
                                                int[] i7 = i(optJSONArray);
                                                Preconditions.i(i7);
                                                this.h.e(optInt2, e, CastUtils.e(i7));
                                                break;
                                            } else {
                                                this.h.c(i6);
                                                break;
                                            }
                                        }
                                        break;
                                    case 1122976047:
                                        if (string2.equals("ITEMS_CHANGE")) {
                                            this.h.k(i5);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    break;
                case 431600379:
                    if (string.equals("INVALID_PLAYER_STATE")) {
                        logger.c("received unexpected error: Invalid Player State.", new Object[0]);
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((zzav) it3.next()).d(optLong, 2100, k(jSONObject));
                        }
                        break;
                    }
                    break;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                        if (jSONArray2.length() > 0) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                            boolean c = zzavVar.c(optLong);
                            zzav zzavVar2 = this.o;
                            boolean z3 = true;
                            if (zzavVar2.b()) {
                                if (zzavVar2.c(optLong)) {
                                }
                                i = 1;
                                if (!c && (mediaStatus = this.f) != null) {
                                    i2 = mediaStatus.b1(jSONObject2, i);
                                    if ((i2 & 1) != 0) {
                                        this.e = SystemClock.elapsedRealtime();
                                        this.i = -1;
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if ((i2 & 2) != 0) {
                                        this.e = SystemClock.elapsedRealtime();
                                    } else {
                                        z3 = z2;
                                    }
                                    if ((i2 & 128) != 0) {
                                        this.e = SystemClock.elapsedRealtime();
                                    }
                                    if ((i2 & 4) != 0 && (zzaoVar4 = this.h) != null) {
                                        zzaoVar4.zzb();
                                    }
                                    if ((i2 & 8) != 0 && (zzaoVar3 = this.h) != null) {
                                        zzaoVar3.zzc();
                                    }
                                    if ((i2 & 16) != 0 && (zzaoVar2 = this.h) != null) {
                                        zzaoVar2.zzd();
                                    }
                                    if ((i2 & 32) != 0) {
                                        this.e = SystemClock.elapsedRealtime();
                                        zzao zzaoVar5 = this.h;
                                        if (zzaoVar5 != null) {
                                            zzaoVar5.zze();
                                        }
                                    }
                                    if ((i2 & 64) != 0) {
                                        this.e = SystemClock.elapsedRealtime();
                                    }
                                    zzaoVar = this.h;
                                    if (zzaoVar != null) {
                                        zzaoVar.zza();
                                    }
                                }
                                MediaStatus mediaStatus2 = new MediaStatus(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                mediaStatus2.b1(jSONObject2, 0);
                                this.f = mediaStatus2;
                                this.e = SystemClock.elapsedRealtime();
                                i2 = Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                                if ((i2 & 1) != 0) {
                                }
                                if ((i2 & 2) != 0) {
                                }
                                if ((i2 & 128) != 0) {
                                }
                                if ((i2 & 4) != 0) {
                                    zzaoVar4.zzb();
                                }
                                if ((i2 & 8) != 0) {
                                    zzaoVar3.zzc();
                                }
                                if ((i2 & 16) != 0) {
                                    zzaoVar2.zzd();
                                }
                                if ((i2 & 32) != 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                                zzaoVar = this.h;
                                if (zzaoVar != null) {
                                }
                            }
                            zzav zzavVar3 = this.p;
                            if (!zzavVar3.b() || zzavVar3.c(optLong)) {
                                i = 0;
                                if (!c) {
                                    i2 = mediaStatus.b1(jSONObject2, i);
                                    if ((i2 & 1) != 0) {
                                    }
                                    if ((i2 & 2) != 0) {
                                    }
                                    if ((i2 & 128) != 0) {
                                    }
                                    if ((i2 & 4) != 0) {
                                    }
                                    if ((i2 & 8) != 0) {
                                    }
                                    if ((i2 & 16) != 0) {
                                    }
                                    if ((i2 & 32) != 0) {
                                    }
                                    if ((i2 & 64) != 0) {
                                    }
                                    zzaoVar = this.h;
                                    if (zzaoVar != null) {
                                    }
                                }
                                MediaStatus mediaStatus22 = new MediaStatus(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                mediaStatus22.b1(jSONObject2, 0);
                                this.f = mediaStatus22;
                                this.e = SystemClock.elapsedRealtime();
                                i2 = Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                                if ((i2 & 1) != 0) {
                                }
                                if ((i2 & 2) != 0) {
                                }
                                if ((i2 & 128) != 0) {
                                }
                                if ((i2 & 4) != 0) {
                                }
                                if ((i2 & 8) != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if ((i2 & 32) != 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                                zzaoVar = this.h;
                                if (zzaoVar != null) {
                                }
                            } else {
                                i = 1;
                                if (!c) {
                                }
                                MediaStatus mediaStatus222 = new MediaStatus(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                mediaStatus222.b1(jSONObject2, 0);
                                this.f = mediaStatus222;
                                this.e = SystemClock.elapsedRealtime();
                                i2 = Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                                if ((i2 & 1) != 0) {
                                }
                                if ((i2 & 2) != 0) {
                                }
                                if ((i2 & 128) != 0) {
                                }
                                if ((i2 & 4) != 0) {
                                }
                                if ((i2 & 8) != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if ((i2 & 32) != 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                                zzaoVar = this.h;
                                if (zzaoVar != null) {
                                }
                            }
                        } else {
                            this.f = null;
                            zzao zzaoVar6 = this.h;
                            if (zzaoVar6 != null) {
                                zzaoVar6.zza();
                            }
                            zzao zzaoVar7 = this.h;
                            if (zzaoVar7 != null) {
                                zzaoVar7.zzb();
                            }
                            zzao zzaoVar8 = this.h;
                            if (zzaoVar8 != null) {
                                zzaoVar8.zzc();
                            }
                            zzao zzaoVar9 = this.h;
                            if (zzaoVar9 != null) {
                                zzaoVar9.zzd();
                            }
                        }
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            ((zzav) it4.next()).d(optLong, 0, null);
                        }
                        break;
                    }
                    break;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        this.u.d(optLong, 0, null);
                        h("QUEUE_ITEM_IDS", jSONObject);
                        if (this.h != null && (i3 = i(jSONObject.getJSONArray("itemIds"))) != null) {
                            this.h.c(i3);
                            break;
                        }
                    }
                    break;
            }
        } catch (JSONException e2) {
            logger.c("Message is malformed (%s); ignoring: %s", e2.getMessage(), str);
        }
    }

    public final long f() {
        MediaStatus mediaStatus = this.f;
        if (mediaStatus != null) {
            return mediaStatus.b;
        }
        throw new zzap();
    }

    public final long g(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (elapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.a.c(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    public final void j() {
        this.e = 0L;
        this.f = null;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((zzav) it.next()).e(2002);
        }
    }

    public final long l() {
        MediaLiveSeekableRange mediaLiveSeekableRange;
        MediaStatus mediaStatus = this.f;
        MediaInfo mediaInfo = mediaStatus == null ? null : mediaStatus.a;
        if (mediaInfo != null && mediaStatus != null) {
            Long l = this.g;
            if (l != null) {
                if (l.equals(4294967296000L)) {
                    MediaStatus mediaStatus2 = this.f;
                    if (mediaStatus2.u != null) {
                        long longValue = l.longValue();
                        MediaStatus mediaStatus3 = this.f;
                        if (mediaStatus3 != null && (mediaLiveSeekableRange = mediaStatus3.u) != null) {
                            long j = mediaLiveSeekableRange.b;
                            r3 = !mediaLiveSeekableRange.d ? g(1.0d, j, -1L) : j;
                        }
                        return Math.min(longValue, r3);
                    }
                    MediaInfo mediaInfo2 = mediaStatus2 == null ? null : mediaStatus2.a;
                    if ((mediaInfo2 != null ? mediaInfo2.e : 0L) >= 0) {
                        long longValue2 = l.longValue();
                        MediaStatus mediaStatus4 = this.f;
                        MediaInfo mediaInfo3 = mediaStatus4 != null ? mediaStatus4.a : null;
                        return Math.min(longValue2, mediaInfo3 != null ? mediaInfo3.e : 0L);
                    }
                }
                return l.longValue();
            }
            if (this.e != 0) {
                double d = mediaStatus.d;
                long j2 = mediaStatus.g;
                return (d == 0.0d || mediaStatus.e != 2) ? j2 : g(d, j2, mediaInfo.e);
            }
        }
        return 0L;
    }
}
