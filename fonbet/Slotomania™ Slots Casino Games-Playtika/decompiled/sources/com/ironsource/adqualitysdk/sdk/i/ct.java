package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class ct extends cw {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f1518 = -2313576284035903220L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1519 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1520 = 1;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[Catch: Exception -> 0x0085, TRY_LEAVE, TryCatch #0 {Exception -> 0x0085, blocks: (B:3:0x000c, B:6:0x0029, B:9:0x003a, B:13:0x0052, B:14:0x005c, B:15:0x0062, B:17:0x0068, B:23:0x0057), top: B:2:0x000c }] */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7322(cl clVar, List<Object> list) {
        cl clVar2;
        int i;
        int i2 = 2 % 2;
        List list2 = (List) m7365(list, 0, List.class);
        try {
            dz dzVar = (dz) m7365(list, 1, dz.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                int i3 = f1520 + 97;
                f1519 = i3 % 128;
                int i4 = i3 % 2;
                if (m7363(list, 2, cl.class)) {
                    int i5 = f1520 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    f1519 = i5 % 128;
                    int i6 = i5 % 2;
                    clVar2 = (cl) m7365(list, 2, cl.class);
                    if (list.size() > 3) {
                        int i7 = f1519 + 89;
                        f1520 = i7 % 128;
                        int i8 = i7 % 2;
                        arrayList = m7364(list, 3);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (i = 0; i < list2.size(); i++) {
                        arrayList.add(0, list2.get(i));
                        arrayList2.add(dzVar.m7671(clVar2.m7202(), clVar2, arrayList).m7684());
                        arrayList.remove(0);
                    }
                    return arrayList2;
                }
                arrayList = m7364(list, 2);
            }
            clVar2 = clVar;
            ArrayList arrayList22 = new ArrayList();
            while (i < list2.size()) {
            }
            return arrayList22;
        } catch (Exception e) {
            cn.m7268(clVar.m7203(), m7321("酉ꄙ\uf1b0V僢振댔쎨ቚ⋽畣蔏햿\ue417㓃䝤霌ꟴ\uf654ۆ奲椺릷젮ᣌ⬣笕访\uda68\ueacb㵷䴆鶘", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12391).intern(), e);
            return list2;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object m7324(cl clVar, List<Object> list) {
        int i = 2 % 2;
        int i2 = f1520 + 1;
        f1519 = i2 % 128;
        int i3 = i2 % 2;
        m7322(clVar, list);
        int i4 = f1520 + 83;
        f1519 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        if (r12.size() > 3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[Catch: Exception -> 0x00a6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a6, blocks: (B:3:0x000c, B:5:0x0020, B:9:0x0034, B:12:0x0052, B:13:0x005c, B:14:0x0062, B:16:0x0068, B:21:0x0089, B:23:0x0091, B:26:0x0099, B:27:0x009c, B:32:0x009f, B:36:0x0044, B:38:0x0057), top: B:2:0x000c }] */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7323(cl clVar, List<Object> list) {
        dz dzVar;
        List<Object> arrayList;
        cl clVar2;
        int i;
        int i2 = 2 % 2;
        List list2 = (List) m7365(list, 0, List.class);
        try {
            dzVar = (dz) m7365(list, 1, dz.class);
            arrayList = new ArrayList<>();
        } catch (Exception e) {
            cn.m7268(clVar.m7203(), m7321("酉\udffb\u0c74竬꭪ᦵ䙠듚\ue54a叏聗컕㽗淭\uda2cࢮ礰Ɬᐳ䊡덈\ue18a⸌鳟촘㮘棽\ud97f", 20100 - Process.getGidForName("")).intern(), e);
            return list2;
        }
        if (list.size() > 2) {
            if (!m7363(list, 2, cl.class)) {
                arrayList = m7364(list, 2);
            } else {
                int i3 = f1520 + 19;
                f1519 = i3 % 128;
                if (i3 % 2 != 0) {
                    clVar2 = (cl) m7365(list, 5, cl.class);
                    if (list.size() > 2) {
                        arrayList = m7364(list, 3);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (i = 0; i < list2.size(); i++) {
                        arrayList.add(0, list2.get(i));
                        if (!(!dzVar.m7671(clVar2.m7202(), clVar2, arrayList).m7682())) {
                            int i4 = f1519 + 31;
                            f1520 = i4 % 128;
                            if (i4 % 2 == 0) {
                                arrayList2.add(list2.get(i));
                                Object obj = null;
                                super.hashCode();
                                throw null;
                            }
                            arrayList2.add(list2.get(i));
                        }
                        arrayList.remove(0);
                    }
                    return arrayList2;
                }
                clVar2 = (cl) m7365(list, 2, cl.class);
                cn.m7268(clVar.m7203(), m7321("酉\udffb\u0c74竬꭪ᦵ䙠듚\ue54a叏聗컕㽗淭\uda2cࢮ礰Ɬᐳ䊡덈\ue18a⸌鳟촘㮘棽\ud97f", 20100 - Process.getGidForName("")).intern(), e);
                return list2;
            }
        }
        clVar2 = clVar;
        ArrayList arrayList22 = new ArrayList();
        while (i < list2.size()) {
        }
        return arrayList22;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7321(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (i.f2454) {
            i.f2455 = i;
            char[] cArr3 = new char[cArr2.length];
            i.f2453 = 0;
            while (i.f2453 < cArr2.length) {
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f1518);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
