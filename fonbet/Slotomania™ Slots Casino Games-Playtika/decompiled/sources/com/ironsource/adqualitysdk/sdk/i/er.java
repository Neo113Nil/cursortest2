package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class er extends ep {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2009 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2011 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final ef f2013;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2010 = {'E', 45021, 24364, 3938, 48846, 28235, 7807, 52671, 32025, 11595, 56483, 36068, 15424, 60298, 39932, 19238, 64208, 43756, 23099, 2463, 47583, 26936, 6520, 51408, 30744, 10339, 55270, 34565, 14161, 59047, 38562, 18004, 62872, 42495, 21836, 1160, 46319, 25656, 5011, 50118, 29494, 8999, 53905, 59438, 18332, 46967, 59248, 22215, 34331, 63098, 9646, 38166, 50446, 13483, 25827, 54301, 927, 29672, 41773, 4825, 17101, 45594, 57812, 20938, 33084, 61731, 8401, 36879, 49214, 16314, 28434, 57182, 3759, 32507, 44616, 7558, 19956, 48451, 60545, 23793, 35938, 64412, 11202, 39739, 52075, 15068, 27160, 55869, '\'', ' ', 44946, 24446};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2012 = -5508836212279955537L;

    public er(ef efVar, ef efVar2, ef efVar3) {
        super(efVar, efVar2);
        this.f2013 = efVar3;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f2011 + 95;
        f2009 = i2 % 128;
        int i3 = i2 % 2;
        ea m7721 = m7744().m7721(eeVar, clVar);
        ea m77212 = m7748().m7721(eeVar, clVar);
        try {
            Object m7684 = m7743().m7721(eeVar, clVar).m7684();
            if (m7684 instanceof JSONObject) {
                ((JSONObject) m7684).put((String) m7721.m7684(), m77212.m7684());
                return m77212;
            }
            if (m7684 instanceof JSONArray) {
                ((JSONArray) m7684).put(m7721.m7680().intValue(), m77212.m7684());
                return m77212;
            }
            if (m7684 instanceof Map) {
                int i4 = f2011 + 59;
                f2009 = i4 % 128;
                if (i4 % 2 == 0) {
                    ((Map) m7684).put(m7721.m7684(), m77212.m7684());
                    return m77212;
                }
                ((Map) m7684).put(m7721.m7684(), m77212.m7684());
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (m7684 instanceof List) {
                int i5 = f2009 + 93;
                f2011 = i5 % 128;
                int i6 = i5 % 2;
                ((List) m7684).set(m7721.m7680().intValue(), m77212.m7684());
                return m77212;
            }
            if (!m7684.getClass().isArray()) {
                new dr(clVar, eeVar, new StringBuilder().append(m7747((char) Color.alpha(0), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 44).intern()).append(this).append(m7747((char) (AndroidCharacter.getMirror('0') + 59353), 43 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46).intern()).append(m7684).toString()).m7593(clVar.m7203());
                return m77212;
            }
            int i7 = f2009 + 19;
            f2011 = i7 % 128;
            int i8 = i7 % 2;
            ((Object[]) m7684)[m7721.m7680().intValue()] = m77212.m7684();
            return m77212;
        } catch (Exception e) {
            new dr(clVar, eeVar, new StringBuilder().append(m7747((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 43).intern()).append(this).append(m7747((char) View.resolveSize(0, 0), 87 - ImageFormat.getBitsPerPixel(0), TextUtils.getOffsetBefore("", 0) + 1).intern()).toString(), e).m7593(clVar.m7203());
            return m77212;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private ef m7748() {
        int i = 2 % 2;
        int i2 = f2009;
        int i3 = i2 + 45;
        f2011 = i3 % 128;
        int i4 = i3 % 2;
        ef efVar = this.f2013;
        int i5 = i2 + 91;
        f2011 = i5 % 128;
        if (i5 % 2 != 0) {
            return efVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    public final String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(super.toString()).append(m7747((char) Gravity.getAbsoluteGravity(0, 0), 88 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "", 0) + 3).intern()).append(m7748().toString()).toString();
        int i2 = f2011 + 79;
        f2009 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2011 + 93;
            f2009 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (!super.equals(obj)) {
                int i3 = f2009 + 79;
                f2011 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            ef efVar = this.f2013;
            ef efVar2 = ((er) obj).f2013;
            if (efVar != null) {
                return efVar.equals(efVar2);
            }
            if (efVar2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = f2009 + 65;
        f2011 = i3 % 128;
        int i4 = i3 % 2;
        int hashCode = super.hashCode() * 31;
        ef efVar = this.f2013;
        if (efVar != null) {
            i = efVar.hashCode();
            int i5 = f2009 + 11;
            f2011 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7747(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f2010[c.f1198 + i] ^ (c.f1198 * f2012)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
