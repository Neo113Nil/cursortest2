package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class du extends dy {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1832 = {56641, '-', 4914, 9933, 14749, 19754, 24816, 29573, 34627, 39655, 44459, 49412, 54289, 59327, 64370, 3584};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1833 = 7388672903279874897L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1834 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1835 = 1;

    public du(String str, String str2, ee eeVar) {
        super(str, str2);
        m7606(str, str2, eeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001f, code lost:
    
        r11 = r11.m7716().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        if (r11.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        r3 = r11.next();
        m7664(new com.ironsource.adqualitysdk.sdk.i.dw(new java.lang.StringBuilder().append(r9).append(m7605((char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 56687), android.view.View.MeasureSpec.getSize(0), (android.os.Process.myPid() >> 22) + 1).intern()).append(r10).toString(), r3.m7711().m7672(), r1, r3.m7714()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001d, code lost:
    
        if (r11 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r11 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x007a, code lost:
    
        m7664(new com.ironsource.adqualitysdk.sdk.i.dw(r9, r10, new java.lang.StringBuilder().append(r9).append(m7605((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), android.text.TextUtils.getOffsetAfter("", 0) + 15).intern()).toString()));
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m7606(String str, String str2, ee eeVar) {
        String m7665;
        int i = 2 % 2;
        int i2 = f1834 + 47;
        f1835 = i2 % 128;
        if (i2 % 2 == 0) {
            m7665 = m7665();
            int i3 = 33 / 0;
        } else {
            m7665 = m7665();
        }
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        ArrayList<StackTraceElement> arrayList = new ArrayList();
        String name = dz.class.getName();
        int i4 = f1835 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1834 = i4 % 128;
        int i5 = i4 % 2;
        for (int length = stackTrace.length - 1; length >= 0; length--) {
            StackTraceElement stackTraceElement = stackTrace[length];
            if (stackTraceElement.getClassName().equals(name)) {
                break;
            }
            arrayList.add(0, stackTraceElement);
        }
        for (StackTraceElement stackTraceElement2 : arrayList) {
            m7664(new dw(stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), stackTraceElement2.getFileName(), stackTraceElement2.getLineNumber()));
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7605(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1832[c.f1198 + i] ^ (c.f1198 * f1833)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
