package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public abstract class be extends cw implements ch {

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f779 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f781 = 0;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f783 = -1834722567;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f785 = null;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f787 = 105;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f788 = 2054949276;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f789;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, c> f790;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f791;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f792;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static byte[] f786 = {-88, -29, 108, -36, 105, 117, 115, -49, 107, 121, -53, 106, -37, -109, -72, 115, -40, -86, 108, Byte.MAX_VALUE, Ascii.SYN, Ascii.FS, 115, 35, 114, 110, 108, 8, 116, -126, Ascii.DC4, 113, 36, 76, SignedBytes.MAX_POWER_OF_TWO, 103, -98, Ascii.VT, 17, 0, 9, Ascii.ETB, 1, -83, -90, -26, 2, -14, -20, 17, -19, -38, Ascii.DLE, 66, -88, -26, 0, -2, -18, 84, -99, 0, -22, -1, Ascii.SUB, -104, -101, 108, 102, 82, -100, -1, -2, -6, -88, -99, 57, -106, -120, -31, -67, -95, Ascii.ESC, 34, -53, -46, -117, 117, -50, -54, -109, -96, 72, -103, -35, 68, -105, -111, -106, -63};

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static boolean f780 = true;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static boolean f782 = true;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f778 = 98;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f784 = {201, 199, 214, 165, 206, 195, 213, 130, 137, 144, 203, 208, 209, 198, Typography.times, 196, 200, 197, 202, 212, 216};

    interface c {
        /* renamed from: ﻐ */
        Object mo6359(List<Object> list, ck ckVar);
    }

    /* renamed from: ﻐ */
    abstract Class mo6356(String str);

    /* renamed from: ﻛ */
    abstract String mo6357();

    /* renamed from: ﾇ */
    abstract Map<String, c> mo6358();

    /* renamed from: ᓮ, reason: contains not printable characters */
    static /* synthetic */ Object m6371(List list, Class cls) {
        int i = 2 % 2;
        int i2 = f781 + 31;
        f779 = i2 % 128;
        return m7365(list, i2 % 2 == 0 ? 1 : 0, cls);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Class m6375(be beVar, String str) {
        int i = 2 % 2;
        int i2 = f781 + 73;
        f779 = i2 % 128;
        int i3 = i2 % 2;
        Class m6372 = beVar.m6372(str, false);
        int i4 = f781 + 23;
        f779 = i4 % 128;
        int i5 = i4 % 2;
        return m6372;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m6376(be beVar) {
        int i = 2 % 2;
        int i2 = f781;
        int i3 = i2 + 59;
        f779 = i3 % 128;
        int i4 = i3 % 2;
        String str = beVar.f792;
        int i5 = i2 + 79;
        f779 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public be(String str) {
        this.f791 = str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m6386() {
        int i = 2 % 2;
        Map<String, c> mo6358 = mo6358();
        this.f790 = mo6358;
        mo6358.put(m6374((short) (90 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 1834722682, (-106) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.MeasureSpec.getSize(0) - 2054949276, (byte) ((-61) - View.resolveSize(0, 0))).intern(), new c() { // from class: com.ironsource.adqualitysdk.sdk.i.be.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                be.this.m6385((String) be.m6371(list, String.class));
                return be.m6376(be.this);
            }
        });
        this.f790.put(m6374((short) (57 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 1834722672, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 106, (-2054949259) - (KeyEvent.getMaxKeyCode() >> 16), (byte) ((-86) - (ViewConfiguration.getScrollBarSize() >> 8))).intern(), new c() { // from class: com.ironsource.adqualitysdk.sdk.i.be.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Boolean.valueOf(be.this.m6377());
            }
        });
        this.f790.put(m6373((String) null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, (int[]) null, "\u0087\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new c() { // from class: com.ironsource.adqualitysdk.sdk.i.be.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return be.m6375(be.this, (String) list.get(0));
            }
        });
        int i2 = f781 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f779 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r9.f789.equals(m6374((short) (117 - android.view.View.MeasureSpec.getSize(0)), 1834722637 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), 65478 - android.text.AndroidCharacter.getMirror('0'), android.view.Gravity.getAbsoluteGravity(0, 0) - 2054949240, (byte) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 128)).intern()) != false) goto L9;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized String m6379() {
        int i = 2 % 2;
        int i2 = f779 + 93;
        f781 = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(this.f789)) {
            int i4 = f781 + 41;
            f779 = i4 % 128;
            int i5 = i4 % 2;
        }
        this.f789 = mo6357();
        int i6 = 2 % 2;
        String str = this.f789;
        int i7 = f779 + 51;
        f781 = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        int i8 = 87 / 0;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public String mo6384() {
        int i = 2 % 2;
        int i2 = f781 + 71;
        int i3 = i2 % 128;
        f779 = i3;
        int i4 = i2 % 2;
        String str = this.f792;
        if (str == null) {
            return m6379();
        }
        int i5 = i3 + 47;
        f781 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i3 + 19;
        f781 = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m6385(String str) {
        int i = 2 % 2;
        int i2 = f781;
        int i3 = i2 + 79;
        f779 = i3 % 128;
        int i4 = i3 % 2;
        this.f792 = str;
        if (i4 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 61;
        f779 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m6377() {
        int i = 2 % 2;
        int i2 = f779;
        int i3 = i2 + 101;
        int i4 = i3 % 128;
        f781 = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (this.f792 != null) {
            int i5 = i4 + 31;
            f779 = i5 % 128;
            return i5 % 2 != 0;
        }
        int i6 = i2 + 33;
        f781 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 68 / 0;
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Object mo6381(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        int i = 2 % 2;
        int i2 = f781 + 103;
        f779 = i2 % 128;
        int i3 = i2 % 2;
        c cVar = this.f790.get(str);
        try {
        } catch (Exception e) {
            cn.m7268(this.f791, new StringBuilder().append(m6374((short) (Color.red(0) - 118), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1834722635, (-106) - Color.alpha(0), (-2054949234) - TextUtils.lastIndexOf("", '0'), (byte) (AndroidCharacter.getMirror('0') - 167)).intern()).append(this.f791).append(m6373((String) null, 126 - Process.getGidForName(""), (int[]) null, "\u0089\u0088").intern()).append(str).append(m6374((short) (TextUtils.indexOf("", "", 0, 0) + Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), ((Process.getThreadPriority(0) + 20) >> 6) + 1834722606, Color.rgb(0, 0, 0) + 16777110, (-2054949211) - KeyEvent.normalizeMetaState(0), (byte) (47 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern()).toString(), e);
        }
        if (cVar == null) {
            new ds(clVar, eeVar, this.f791, str).m7593(this.f791);
            return null;
        }
        int i4 = f779 + 57;
        f781 = i4 % 128;
        if (i4 % 2 != 0) {
            Object mo6359 = cVar.mo6359(list, ckVar);
            int i5 = 92 / 0;
            return mo6359;
        }
        return cVar.mo6359(list, ckVar);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Class m6380(String str) {
        int i = 2 % 2;
        int i2 = f781 + 73;
        f779 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (!Prode.m5772()) {
                Class m6372 = m6372(str, false);
                int i4 = f779 + 35;
                f781 = i4 % 128;
                if (i4 % 2 == 0) {
                    return m6372;
                }
                throw null;
            }
            return mo6356(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m6383(String str) {
        int i = 2 % 2;
        int i2 = f779 + 107;
        f781 = i2 % 128;
        int i3 = i2 % 2;
        Class m6372 = m6372(str, true);
        int i4 = f781 + 87;
        f779 = i4 % 128;
        int i5 = i4 % 2;
        return m6372;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Class m6372(String str, boolean z) {
        int i = 2 % 2;
        int i2 = f779 + 27;
        f781 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            if (str.contains(m6373((String) null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (int[]) null, "\u008a").intern())) {
                return kk.m8433(str, z);
            }
            char c2 = 5;
            switch (str.hashCode()) {
                case -1325958191:
                    if (str.equals(m6373((String) null, 126 - ExpandableListView.getPackedPositionChild(0L), (int[]) null, "\u0082\u0085\u0090\u008f\u008d\u008e").intern())) {
                        int i4 = f781 + 5;
                        f779 = i4 % 128;
                        int i5 = i4 % 2;
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 104431:
                    if (str.equals(m6373((String) null, View.getDefaultSize(0, 0) + 127, (int[]) null, "\u0083\u008c\u008b").intern())) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3029738:
                    if (!(!str.equals(m6373((String) null, Color.rgb(0, 0, 0) + 16777343, (int[]) null, "\u0085\u008d\u008d\u0090").intern()))) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3039496:
                    if (str.equals(m6374((short) (View.MeasureSpec.getSize(0) - 84), View.combineMeasuredStates(0, 0) + 1834722665, (-106) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 2054949210, (byte) (TextUtils.indexOf("", "", 0) - 23)).intern())) {
                        int i6 = f781 + 65;
                        f779 = i6 % 128;
                        if (i6 % 2 != 0) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 'p';
                            break;
                        }
                    }
                    c2 = 65535;
                    break;
                case 3052374:
                    if (str.equals(m6373((String) null, Process.getGidForName("") + 128, (int[]) null, "\u0094\u0086\u0093\u0092").intern())) {
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3327612:
                    if (str.equals(m6373((String) null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, (int[]) null, "\u0081\u008c\u008d\u0085").intern())) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3625364:
                    if (str.equals(m6373((String) null, 127 - Color.argb(0, 0, 0, 0), (int[]) null, "\u008e\u008b\u008d\u0095").intern())) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 97526364:
                    if (str.equals(m6373((String) null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (int[]) null, "\u0083\u0086\u008d\u0085\u0091").intern())) {
                        int i7 = f781 + 29;
                        f779 = i7 % 128;
                        int i8 = i7 % 2;
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109413500:
                    if (str.equals(m6374((short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40), 1834722681 - MotionEvent.axisFromString(""), (-106) - View.getDefaultSize(0, 0), (-2054949207) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (37 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern())) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return Integer.TYPE;
                case 1:
                    return Long.TYPE;
                case 2:
                    Class cls = Double.TYPE;
                    int i9 = f781 + 33;
                    f779 = i9 % 128;
                    int i10 = i9 % 2;
                    return cls;
                case 3:
                    return Float.TYPE;
                case 4:
                    return Boolean.TYPE;
                case 5:
                    return Character.TYPE;
                case 6:
                    return Byte.TYPE;
                case 7:
                    Class cls2 = Void.TYPE;
                    int i11 = f779 + 1;
                    f781 = i11 % 128;
                    if (i11 % 2 == 0) {
                        return cls2;
                    }
                    super.hashCode();
                    throw null;
                case '\b':
                    return Short.TYPE;
                default:
                    return mo6356(str);
            }
        } catch (Throwable th) {
            if (z) {
                cn.m7268(this.f791, new StringBuilder().append(m6374((short) (63 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1834722634, (-106) - View.resolveSizeAndState(0, 0, 0), TextUtils.getOffsetAfter("", 0) - 2054949201, (byte) (Process.getGidForName("") - 42)).intern()).append(str).append(m6374((short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 119), 1834722599 - View.resolveSizeAndState(0, 0, 0), (-106) - Color.alpha(0), (-2054949194) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 82)).intern()).toString(), th);
            }
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final void m6382(hj hjVar, ck ckVar, String str, Object... objArr) {
        int i = 2 % 2;
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, hjVar);
            ckVar.mo7155(str, arrayList);
            int i2 = f779 + 89;
            f781 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            cn.m7268(this.f791, new StringBuilder().append(m6374((short) (View.MeasureSpec.getMode(0) - 21), ((Process.getThreadPriority(0) + 20) >> 6) + 1834722636, (-106) - View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) - 2054949185, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) - 127)).intern()).append(this).toString(), th);
        }
    }

    /* renamed from: ﻏ */
    public boolean mo6370() {
        int i = 2 % 2;
        int i2 = f781;
        int i3 = i2 + 35;
        f779 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        f779 = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public boolean mo6378() {
        int i = 2 % 2;
        int i2 = f779;
        int i3 = i2 + 21;
        f781 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        f781 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6374(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f787;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f786;
                if (bArr != null) {
                    i5 = (byte) (bArr[f788 + i3] + i4);
                } else {
                    i5 = (short) (f785[f788 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f788 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f783);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f786;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f785;
                        int i8 = n.f3090;
                        n.f3090 = i8 - 1;
                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                    }
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6373(String str, int i, int[] iArr, String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (k.f2956) {
            char[] cArr3 = f784;
            int i2 = f778;
            if (f782) {
                int length = bArr2.length;
                k.f2955 = length;
                char[] cArr4 = new char[length];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr4[k.f2957] = (char) (cArr3[bArr2[(k.f2955 - 1) - k.f2957] + i] - i2);
                    k.f2957++;
                }
                return new String(cArr4);
            }
            if (f780) {
                int length2 = cArr2.length;
                k.f2955 = length2;
                char[] cArr5 = new char[length2];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr5[k.f2957] = (char) (cArr3[cArr2[(k.f2955 - 1) - k.f2957] - i] - i2);
                    k.f2957++;
                }
                return new String(cArr5);
            }
            int length3 = iArr.length;
            k.f2955 = length3;
            char[] cArr6 = new char[length3];
            k.f2957 = 0;
            while (k.f2957 < k.f2955) {
                cArr6[k.f2957] = (char) (cArr3[iArr[(k.f2955 - 1) - k.f2957] - i] - i2);
                k.f2957++;
            }
            return new String(cArr6);
        }
    }
}
