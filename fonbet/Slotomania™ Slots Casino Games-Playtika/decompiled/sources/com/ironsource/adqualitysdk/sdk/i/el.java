package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class el extends eo {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1979 = -8505703831577167465L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1980 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1981 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ef[] f1982;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final ef f1983;

    public el(ef efVar, String str, List<ef> list, List<ef> list2) {
        super(str, list2);
        this.f1983 = efVar;
        if (list != null) {
            ef[] efVarArr = new ef[list.size()];
            this.f1982 = efVarArr;
            list.toArray(efVarArr);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo, com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        Method m8442;
        List<Object> list = m7741(eeVar, clVar);
        ef efVar = this.f1983;
        if ((efVar instanceof eq) && ((eq) efVar).m7746().equals(m7730("\ude09ח\ue2bb\ude7a\ue768ﰵᇥை㠧", TextUtils.indexOf("", "") + 1).intern())) {
            return clVar.m7210().m7931().m7933(m7740()).m7671(eeVar, clVar, list).m7681(false);
        }
        Object m7684 = this.f1983.m7721(eeVar, clVar).m7684();
        if (m7684 instanceof ch) {
            return new ea(((ch) m7684).mo6381(clVar, m7740(), list, clVar.m7205(), eeVar));
        }
        if (m7684 instanceof cl) {
            synchronized (m7684) {
                cl clVar2 = (cl) m7684;
                dz m7209 = clVar2.m7209(m7740());
                if (m7209 != null) {
                    return m7209.m7671(clVar2.m7202(), clVar2, list).m7681(false);
                }
                cn.m7268(clVar.m7203(), new StringBuilder().append(m7730("궏ꦅ솇귊撱偠㋛蠛䮡癖ᡨ럨慒澩縔\uddb8ỲՀ枢רּ㒒㫧䵭\ue2ec투킂덝", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern()).append(m7740()).toString(), new NoSuchMethodException());
            }
        }
        try {
            ef[] efVarArr = this.f1982;
            if (efVarArr != null) {
                m8442 = kk.m8435(m7684, m7740(), m7731(efVarArr, eeVar, clVar));
            } else {
                m8442 = kk.m8442(m7684, m7740(), list);
            }
            if (m8442 == null) {
                list.add(0, m7684);
                return new ea(clVar.m7201().mo6381(clVar, m7740(), list, clVar.m7205(), eeVar));
            }
            return new ea(m8442.invoke(m7684, list.toArray()));
        } catch (IllegalAccessException e) {
            cn.m7268(clVar.m7203(), new StringBuilder().append(m7730("궏ꦅ솇귊撱偠㋛蠛䮡癖ᡨ럨慒澩縔\uddb8ỲՀ枢רּ㒒㫧䵭\ue2ec투킂덝", 1 - ExpandableListView.getPackedPositionType(0L)).intern()).append(this).toString(), e);
            return null;
        } catch (IllegalArgumentException e2) {
            cn.m7268(clVar.m7203(), new StringBuilder().append(m7730("궏ꦅ솇귊撱偠㋛蠛䮡癖ᡨ럨慒澩縔\uddb8ỲՀ枢רּ㒒㫧䵭\ue2ec투킂덝", (Process.myPid() >> 22) + 1).intern()).append(this).toString(), e2);
            return null;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List<Class> m7731(ef[] efVarArr, ee eeVar, cl clVar) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int length = efVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = f1980 + 107;
            f1981 = i3 % 128;
            if (i3 % 2 == 0) {
                arrayList.add((Class) efVarArr[i2].m7721(eeVar, clVar).m7684());
                i2 += 92;
            } else {
                arrayList.add((Class) efVarArr[i2].m7721(eeVar, clVar).m7684());
                i2++;
            }
        }
        int i4 = f1981 + 77;
        f1980 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo
    public final String toString() {
        int i = 2 % 2;
        int i2 = f1980 + 35;
        f1981 = i2 % 128;
        int i3 = i2 % 2;
        String mo7732 = mo7732(m7739());
        int i4 = f1980 + 67;
        f1981 = i4 % 128;
        if (i4 % 2 != 0) {
            return mo7732;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo
    /* renamed from: ﻐ, reason: contains not printable characters */
    final String mo7732(Object[] objArr) {
        int i = 2 % 2;
        String obj = new StringBuilder().append(this.f1983).append(m7730("༺\uf086\u181e༔轱", 1 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()).append(m7740()).append(m7729()).append(m7730("漩\uf030峦漁쇿", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()).append(m7720(objArr)).append(m7730("畣㊯ᵺ畊䒽", 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()).toString();
        int i2 = f1981 + 113;
        f1980 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
        return obj;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m7729() {
        int i = 2 % 2;
        int i2 = f1980 + 53;
        int i3 = i2 % 128;
        f1981 = i3;
        int i4 = i2 % 2;
        if (this.f1982 == null) {
            int i5 = i3 + 115;
            f1980 = i5 % 128;
            if (i5 % 2 == 0) {
                return "";
            }
            throw null;
        }
        String obj = new StringBuilder().append(m7730("㬺䡇\ued78㬆\udbdf", (ViewConfiguration.getTapTimeout() >> 16) + 1).intern()).append(m7720(this.f1982)).append(m7730("㒱凒ĉ㒏됧", 1 - (ViewConfiguration.getScrollBarSize() >> 8)).intern()).toString();
        int i6 = f1981 + 45;
        f1980 = i6 % 128;
        if (i6 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f1980 + 33;
        f1981 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (!super.equals(obj)) {
                int i3 = f1981 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f1980 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            el elVar = (el) obj;
            ef efVar = this.f1983;
            if (efVar == null ? elVar.f1983 != null : !efVar.equals(elVar.f1983)) {
                return false;
            }
            ef[] efVarArr = this.f1982;
            if (efVarArr != null) {
                int i5 = f1981 + 43;
                f1980 = i5 % 128;
                int i6 = i5 % 2;
                boolean equals = efVarArr.equals(elVar.f1982);
                int i7 = f1980 + 15;
                f1981 = i7 % 128;
                int i8 = i7 % 2;
                return equals;
            }
            if (elVar.f1982 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo
    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int hashCode = super.hashCode() * 31;
        ef efVar = this.f1983;
        int i3 = 0;
        if (efVar != null) {
            int i4 = f1981 + 39;
            f1980 = i4 % 128;
            int i5 = i4 % 2;
            i = efVar.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 31;
        ef[] efVarArr = this.f1982;
        if (efVarArr != null) {
            int i7 = f1981 + 61;
            f1980 = i7 % 128;
            if (i7 % 2 != 0) {
                efVarArr.hashCode();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            i3 = efVarArr.hashCode();
        }
        int i8 = i6 + i3;
        int i9 = f1981 + 95;
        f1980 = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7730(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f1979, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f1979));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
