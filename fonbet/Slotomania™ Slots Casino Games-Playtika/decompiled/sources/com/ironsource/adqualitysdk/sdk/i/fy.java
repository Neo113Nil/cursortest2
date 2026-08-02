package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class fy extends gb {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2144 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2145;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final ft f2148;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final ft f2149;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final eq f2150;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2147 = {'\n', 't', 42286, 19137, 61492, ' ', 42303, 19161, 61536, 38163, 15012, 57352, 34220, ')', 42364};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2146 = 3196417587089745244L;

    public fy(ft ftVar, ft ftVar2, eq eqVar) {
        this.f2148 = ftVar;
        this.f2149 = ftVar2;
        this.f2150 = eqVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public final ea mo7776(ee eeVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f2144 + 17;
        f2145 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            ft ftVar = this.f2148;
            if (ftVar != null) {
                ea m7788 = ftVar.m7788(new ee(eeVar), clVar);
                int i4 = f2144 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f2145 = i4 % 128;
                if (i4 % 2 == 0) {
                    return m7788;
                }
                super.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            eeVar.m7715(this.f2148);
            if (this.f2149 != null) {
                eeVar.m7712(this);
                HashMap hashMap = new HashMap();
                eq eqVar = this.f2150;
                if (eqVar != null) {
                    hashMap.put(eb.m7685(eqVar.m7746()), th);
                }
                ea m77882 = this.f2149.m7788(new ee(hashMap, eeVar), clVar);
                int i5 = f2145 + 31;
                f2144 = i5 % 128;
                int i6 = i5 % 2;
                return m77882;
            }
        }
        return new ea(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﻛ */
    public final int mo7775(ee eeVar) {
        int i = 2 % 2;
        int i2 = f2145 + 113;
        f2144 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (!eeVar.m7718(this)) {
                return this.f2148.toString().split(m7782((char) Drawable.resolveOpacity(0, 0), KeyEvent.normalizeMetaState(0), View.getDefaultSize(0, 0) + 1).intern()).length;
            }
            int i3 = f2145 + 3;
            f2144 = i3 % 128;
            if (i3 % 2 != 0) {
                return 1;
            }
            throw null;
        }
        eeVar.m7718(this);
        super.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m7782((char) TextUtils.indexOf("", ""), -TextUtils.indexOf((CharSequence) "", '0', 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4).intern()).append(this.f2148).append(m7782((char) View.resolveSizeAndState(0, 0, 0), Color.argb(0, 0, 0, 0) + 5, 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()).append(this.f2150).append(m7782((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 13 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2).intern()).append(this.f2149).toString();
        int i2 = f2145 + 69;
        f2144 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r3.equals(r8.f2149) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r3 = r7.f2150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r3 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.fy.f2145 + 87;
        com.ironsource.adqualitysdk.sdk.i.fy.f2144 = r1 % 128;
        r1 = r1 % 2;
        r8 = r8.f2150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r1 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        return r3.equals(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        r3.equals(r8);
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r8.f2150 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r8 = com.ironsource.adqualitysdk.sdk.i.fy.f2144 + 27;
        com.ironsource.adqualitysdk.sdk.i.fy.f2145 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r8.f2149 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2144 + 63;
            f2145 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fy fyVar = (fy) obj;
            ft ftVar = this.f2148;
            if (ftVar == null ? fyVar.f2148 != null : !ftVar.equals(fyVar.f2148)) {
                return false;
            }
            ft ftVar2 = this.f2149;
            Object obj2 = null;
            if (ftVar2 != null) {
                int i4 = f2145 + 87;
                f2144 = i4 % 128;
                if (i4 % 2 == 0) {
                    ftVar2.equals(fyVar.f2149);
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = f2144 + 37;
        int i5 = i4 % 128;
        f2145 = i5;
        int i6 = i4 % 2;
        ft ftVar = this.f2148;
        int i7 = 0;
        if (ftVar != null) {
            i = ftVar.hashCode();
        } else {
            int i8 = i5 + 97;
            f2144 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 / 4;
            }
            i = 0;
        }
        int i10 = i * 31;
        ft ftVar2 = this.f2149;
        if (ftVar2 != null) {
            i2 = ftVar2.hashCode();
        } else {
            int i11 = f2145 + 107;
            f2144 = i11 % 128;
            int i12 = i11 % 2;
            i2 = 0;
        }
        int i13 = (i10 + i2) * 31;
        eq eqVar = this.f2150;
        if (eqVar != null) {
            int i14 = f2145 + 33;
            f2144 = i14 % 128;
            if (i14 % 2 == 0) {
                eqVar.hashCode();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            i7 = eqVar.hashCode();
        }
        return i13 + i7;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7782(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f2147[c.f1198 + i] ^ (c.f1198 * f2146)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
