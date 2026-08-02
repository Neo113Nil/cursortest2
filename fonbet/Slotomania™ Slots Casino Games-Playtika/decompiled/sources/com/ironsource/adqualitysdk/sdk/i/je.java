package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: classes5.dex */
public abstract class je implements Runnable {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2687 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2688;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2689 = {-1211171442, 309563468, -788271997, 498475442, 1897034709, -934456969, -258755612, 1262137417, 225503885, -288797579, 2051229325, -1055001262, -2135510996, 722892229, -2039053008, 305897355, -684063234, -1705457734};

    /* renamed from: ｋ */
    public abstract void mo5828() throws Exception;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = f2687 + 63;
        f2688 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                mo5828();
                return;
            }
            mo5828();
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            try {
                mo6217(th);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ﻐ */
    public void mo6217(Throwable th) {
        int i = 2 % 2;
        kl.m8450(m8133(new int[]{-148744506, 703408230, 1625900336, -250744277, 86413855, -1348002512, 135765787, -1753553925}, 14 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), new StringBuilder().append(m8133(new int[]{-719113574, -381212070, -777622711, 1588348299, -1325096675, -640628722, -197075195, 854518501}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15).intern()).append(getClass().getName()).toString(), new StringBuilder().append(m8133(new int[]{-786987398, 1035666282, -451675294, -817807577}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 6).intern()).append(getClass().getName()).append(m8133(new int[]{-2089720855, -639147175}, KeyEvent.normalizeMetaState(0) + 1).intern()).toString(), th);
        m.m8527(m8133(new int[]{-148744506, 703408230, 1625900336, -250744277, 86413855, -1348002512, 135765787, -1753553925}, TextUtils.indexOf((CharSequence) "", '0', 0) + 15).intern(), new StringBuilder().append(m8133(new int[]{-719113574, -381212070, -777622711, 1588348299, -1325096675, -640628722, -197075195, 854518501}, (ViewConfiguration.getTouchSlop() >> 8) + 15).intern()).append(getClass().getName()).toString());
        m.m8535(m8133(new int[]{-148744506, 703408230, 1625900336, -250744277, 86413855, -1348002512, 135765787, -1753553925}, (Process.myTid() >> 22) + 14).intern(), m8133(new int[]{611256659, -1994052168, -1801858884, 1652391618}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7).intern(), th);
        int i2 = f2687 + 17;
        f2688 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m8133(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2689.clone();
            a.f83 = 0;
            while (a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[a.f83] >> 16);
                cArr[1] = (char) iArr[a.f83];
                cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[a.f83 + 1];
                a.f84 = (cArr[0] << 16) + cArr[1];
                a.f85 = (cArr[2] << 16) + cArr[3];
                a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = a.f84 ^ iArr2[i2];
                    a.f84 = i3;
                    a.f85 = a.m5774(i3) ^ a.f85;
                    int i4 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i4;
                }
                int i5 = a.f84;
                a.f84 = a.f85;
                a.f85 = i5;
                a.f85 = i5 ^ iArr2[16];
                a.f84 ^= iArr2[17];
                int i6 = a.f84;
                int i7 = a.f85;
                cArr[0] = (char) (a.f84 >>> 16);
                cArr[1] = (char) a.f84;
                cArr[2] = (char) (a.f85 >>> 16);
                cArr[3] = (char) a.f85;
                a.m5773(iArr2);
                cArr2[a.f83 << 1] = cArr[0];
                cArr2[(a.f83 << 1) + 1] = cArr[1];
                cArr2[(a.f83 << 1) + 2] = cArr[2];
                cArr2[(a.f83 << 1) + 3] = cArr[3];
                a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
