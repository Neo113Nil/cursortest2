package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public final class fu extends gc {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2121 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f2122 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2123 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2124 = -548604956;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static byte[] f2125 = {-111, -108, -20, -98, -31, -110, -49, -111, -107, 118, -83, -62, -62};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2126 = -559498971;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2127 = 112;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final gb f2128;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final ef f2129;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final gb f2130;

    public fu(ef efVar, gb gbVar, gb gbVar2, byte b) {
        super(b);
        this.f2129 = efVar;
        this.f2130 = gbVar;
        this.f2128 = gbVar2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public final ea mo7776(ee eeVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f2121 + 75;
        f2123 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.f2129.m7721(eeVar, clVar).m7682()) {
            if (this.f2128 != null) {
                eeVar.m7712(this);
                return this.f2128.m7788(eeVar, clVar);
            }
            return new ea(Boolean.FALSE);
        }
        int i4 = f2123 + 101;
        f2121 = i4 % 128;
        int i5 = i4 % 2;
        return this.f2130.m7788(eeVar, clVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﻛ */
    public final int mo7775(ee eeVar) {
        int i = 2 % 2;
        int i2 = f2121 + 13;
        f2123 = i2 % 128;
        int i3 = i2 % 2;
        if (!eeVar.m7718(this)) {
            int length = this.f2130.toString().split(m7777((short) (Color.argb(0, 0, 0, 0) - 128), 548604966 - View.getDefaultSize(0, 0), (-113) - (ViewConfiguration.getFadingEdgeLength() >> 16), Color.red(0) + 559498971, (byte) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern()).length;
            if (!(this.f2128 instanceof ft)) {
                return length - 1;
            }
            int i4 = f2121 + 69;
            f2123 = i4 % 128;
            int i5 = i4 % 2;
            return length;
        }
        int i6 = f2123 + 11;
        int i7 = i6 % 128;
        f2121 = i7;
        if (i6 % 2 != 0) {
            if (!(this.f2130 instanceof ft)) {
                return 0;
            }
            int i8 = i7 + 97;
            f2123 = i8 % 128;
            int i9 = i8 % 2;
            return 1;
        }
        boolean z = this.f2130 instanceof ft;
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m7777((short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 28), 548605061 - (Process.myPid() >> 22), (-113) - TextUtils.getOffsetAfter("", 0), 559498973 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) ((-1) - TextUtils.lastIndexOf("", '0'))).intern());
        sb.append(this.f2129);
        sb.append(m7777((short) (39 - TextUtils.indexOf((CharSequence) "", '0', 0)), 548604997 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "", 0, 0) - 113, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 559498976, (byte) ExpandableListView.getPackedPositionGroup(0L)).intern());
        sb.append(this.f2130);
        if (this.f2128 != null) {
            if (this.f2130 instanceof ft) {
                int i2 = f2121 + 7;
                f2123 = i2 % 128;
                int i3 = i2 % 2;
                sb.append(m7777((short) (KeyEvent.keyCodeFromString("") + 77), 548604988 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-113) - Color.blue(0), 559498978 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern());
            } else {
                sb.append(m7777((short) (Gravity.getAbsoluteGravity(0, 0) - 128), (KeyEvent.getMaxKeyCode() >> 16) + 548604966, (-113) - View.MeasureSpec.makeMeasureSpec(0, 0), Gravity.getAbsoluteGravity(0, 0) + 559498971, (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern());
                m7791(sb);
                int i4 = f2121 + 39;
                f2123 = i4 % 128;
                int i5 = i4 % 2;
            }
            sb.append(m7777((short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 68), TextUtils.lastIndexOf("", '0', 0, 0) + 548605058, (-113) - TextUtils.getTrimmedLength(""), KeyEvent.normalizeMetaState(0) + 559498979, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern());
            sb.append(this.f2128);
        }
        String obj = sb.toString();
        int i6 = f2121 + 73;
        f2123 = i6 % 128;
        int i7 = i6 % 2;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r3.equals(r7.f2129) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r3 = r6.f2130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r3.equals(r7.f2130) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.fu.f2121 + 1;
        com.ironsource.adqualitysdk.sdk.i.fu.f2123 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        r3 = r6.f2128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.fu.f2123 + 13;
        com.ironsource.adqualitysdk.sdk.i.fu.f2121 = r1 % 128;
        r1 = r1 % 2;
        r7 = r7.f2128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r1 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        return r3.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        r3.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r7.f2128 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.fu.f2123 + 3;
        com.ironsource.adqualitysdk.sdk.i.fu.f2121 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.fu.f2123 + 23;
        com.ironsource.adqualitysdk.sdk.i.fu.f2121 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if ((r7 % 2) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        if (r7.f2130 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0042, code lost:
    
        if (r3.equals(r7.f2129) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0047, code lost:
    
        if (r7.f2129 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2121 + 33;
            f2123 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fu fuVar = (fu) obj;
        ef efVar = this.f2129;
        if (efVar != null) {
            int i4 = f2121 + 5;
            f2123 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 25 / 0;
            }
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = f2123;
        int i5 = i4 + 23;
        int i6 = i5 % 128;
        f2121 = i6;
        int i7 = i5 % 2;
        ef efVar = this.f2129;
        if (efVar != null) {
            int i8 = i6 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f2123 = i8 % 128;
            if (i8 % 2 != 0) {
                efVar.hashCode();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            i = efVar.hashCode();
        } else {
            int i9 = i4 + 33;
            f2121 = i9 % 128;
            int i10 = i9 % 2;
            i = 0;
        }
        int i11 = i * 31;
        gb gbVar = this.f2130;
        if (gbVar != null) {
            i2 = gbVar.hashCode();
            int i12 = f2121 + 55;
            f2123 = i12 % 128;
            int i13 = i12 % 2;
        } else {
            i2 = 0;
        }
        int i14 = (i11 + i2) * 31;
        gb gbVar2 = this.f2128;
        return i14 + (gbVar2 != null ? gbVar2.hashCode() : 0);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7777(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2127;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2125;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2126 + i3] + i4);
                } else {
                    i5 = (short) (f2122[f2126 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f2126 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f2124);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f2125;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f2122;
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
}
