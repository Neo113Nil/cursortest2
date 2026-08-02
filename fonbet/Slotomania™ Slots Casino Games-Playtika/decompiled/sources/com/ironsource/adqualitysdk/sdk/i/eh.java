package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class eh extends ef {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1961 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f1962 = -7037457903574574647L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1963 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final Map<String, ef> f1964 = new HashMap();

    public eh(Map<String, ef> map) {
        for (String str : map.keySet()) {
            this.f1964.put(eb.m7685(str), map.get(str));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (String str : this.f1964.keySet()) {
            int i2 = f1963 + 7;
            f1961 = i2 % 128;
            int i3 = i2 % 2;
            ea m7721 = this.f1964.get(str).m7721(eeVar, clVar);
            try {
                jsonObjectInit.put(str, m7721.m7684());
                int i4 = f1961 + 31;
                f1963 = i4 % 128;
                int i5 = i4 % 2;
            } catch (JSONException unused) {
                new dr(clVar, eeVar, new StringBuilder().append(m7724("ᦌ銶ྡ뢁㖏꺨寴퓷䇕靖眢\ue028鴲ᙀ茕㱹ꥶ≺\udf03䡈쒬熴\ueaa2枇ბ", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35597).intern()).append(m7721.m7684()).append(m7724("᧩꾆痴㯀셍靯嵚\ue2afꢡ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46633).intern()).append(str).toString()).m7593(clVar.m7203());
            }
        }
        return new ea(jsonObjectInit);
    }

    public final String toString() {
        int i = 2 % 2;
        if (this.f1964.isEmpty()) {
            return m7724("ᦲ蜉", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40637).intern();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m7724("ᦲ㔖", 11519 - TextUtils.getOffsetBefore("", 0)).intern());
        Iterator<String> it = this.f1964.keySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            int i2 = f1963 + 9;
            f1961 = i2 % 128;
            if (i2 % 2 == 0) {
                String next = it.next();
                if (!z) {
                    int i3 = f1963 + 107;
                    f1961 = i3 % 128;
                    sb.append(m7724("᧥嫶", i3 % 2 != 0 ? 10056 << (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) : (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17183).intern());
                }
                sb.append(m7724("᧫", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45523).intern());
                sb.append(next);
                sb.append(m7724("᧫鑶ˣ", TextUtils.lastIndexOf("", '0', 0) + 36230).intern());
                sb.append(this.f1964.get(next));
                z = false;
            } else {
                it.next();
                throw null;
            }
        }
        sb.append(m7724("᧩詣", Color.rgb(0, 0, 0) + 16815063).intern());
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f1963;
        int i3 = i2 + 39;
        int i4 = i3 % 128;
        f1961 = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 47;
            f1961 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj != null) {
            int i8 = i4 + 25;
            f1963 = i8 % 128;
            int i9 = i8 % 2;
            if (getClass() == obj.getClass()) {
                eh ehVar = (eh) obj;
                Map<String, ef> map = this.f1964;
                if (map != null) {
                    int i10 = f1961 + 95;
                    f1963 = i10 % 128;
                    int i11 = i10 % 2;
                    boolean equals = map.equals(ehVar.f1964);
                    if (i11 == 0) {
                        int i12 = 78 / 0;
                    }
                    return equals;
                }
                if (ehVar.f1964 == null) {
                    int i13 = f1961 + 55;
                    f1963 = i13 % 128;
                    int i14 = i13 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f1961;
        int i3 = i2 + 113;
        f1963 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, ef> map = this.f1964;
        if (map != null) {
            return map.hashCode();
        }
        int i5 = i2 + 105;
        f1963 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7724(String str, int i) {
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
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f1962);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
