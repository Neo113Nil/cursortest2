package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class es extends ep {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2014 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2015 = 40172;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2016 = 40041;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2017 = 12701;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2018 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2019 = 46775;

    public es(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        Object m7684;
        int i = 2 % 2;
        int i2 = f2018 + 93;
        f2014 = i2 % 128;
        int i3 = i2 % 2;
        ea m7721 = m7744().m7721(eeVar, clVar);
        try {
            m7684 = m7743().m7721(eeVar, clVar).m7684();
        } catch (Exception e) {
            new dr(clVar, eeVar, new StringBuilder().append(m7749("᥅ﻄ\u0ea6댧ꠛ⨇접溞택\udeecᣦ獺蘆쿒扐\ue4b5탾귵ጳᓌ\uec16\udb47㝗깐妳㇚떵䈲ⱻ⫘\ue59c鎐ﴝ练銲ᲅꝤ㑶\ud868㪫\udf0d\u169d촉䮤", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43).intern()).append(this).append(m7749("촉䮤", Color.rgb(0, 0, 0) + 16777217).intern()).toString(), e).m7593(clVar.m7203());
        }
        if (m7684 instanceof JSONObject) {
            return new ea(((JSONObject) m7684).opt((String) m7721.m7684()));
        }
        if (m7684 instanceof JSONArray) {
            return new ea(((JSONArray) m7684).opt(m7721.m7680().intValue()));
        }
        if (m7684 instanceof Map) {
            return new ea(((Map) m7684).get(m7721.m7684()));
        }
        if (m7684 instanceof List) {
            ea eaVar = new ea(((List) m7684).get(m7721.m7680().intValue()));
            int i4 = f2014 + 87;
            f2018 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
            }
            return eaVar;
        }
        if (m7684.getClass().isArray()) {
            return new ea(((Object[]) m7684)[m7721.m7680().intValue()]);
        }
        new dr(clVar, eeVar, new StringBuilder().append(m7749("᥅ﻄ\u0ea6댧ꠛ⨇접溞택\udeecᣦ獺蘆쿒扐\ue4b5탾귵ጳᓌ\uec16\udb47㝗깐妳㇚떵䈲ⱻ⫘\ue59c鎐ﴝ练銲ᲅꝤ㑶\ud868㪫\udf0d\u169d촉䮤", (ViewConfiguration.getLongPressTimeout() >> 16) + 43).intern()).append(this).append(m7749("\uee88遮\ud876ㆳ\ued40\u1a9bҦ⎞飘ﻍᵆ㷄⻑퉡\ue104ꦨ胹荒❋Ꞧ백鈷鶶ﶳ\udf0d\u169d함ᣬ\uef8aⷖ팦보\u0bc3ユ嶩畴\udccf새垨Ꟶ⩚蚜뫦庸浺軧", TextUtils.indexOf("", "") + 45).intern()).append(m7684).toString()).m7593(clVar.m7203());
        Object obj = null;
        ea eaVar2 = new ea(null);
        int i6 = f2014 + 41;
        f2018 = i6 % 128;
        if (i6 % 2 == 0) {
            return eaVar2;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7749(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (o.f3094) {
            char[] cArr3 = new char[cArr2.length];
            o.f3095 = 0;
            char[] cArr4 = new char[2];
            while (o.f3095 < cArr2.length) {
                cArr4[0] = cArr2[o.f3095];
                cArr4[1] = cArr2[o.f3095 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2016)) ^ ((c2 >>> 5) + f2015)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2017) ^ ((c3 + i2) ^ ((c3 << 4) + f2019))));
                    i2 -= 40503;
                }
                cArr3[o.f3095] = cArr4[0];
                cArr3[o.f3095 + 1] = cArr4[1];
                o.f3095 += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }
}
