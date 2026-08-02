package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes5.dex */
public final class iu {

    /* renamed from: 爫, reason: contains not printable characters */
    private static int f2642 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f2643;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static char f2644;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static char f2645;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static long f2646;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static char[] f2647;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f2648;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f2649;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static iu f2650;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static final Object f2651;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final Handler f2652;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final Context f2655;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2653 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f2654 = new HashMap<>();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final HashMap<String, ArrayList<a>> f2656 = new HashMap<>();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final ArrayList<c> f2657 = new ArrayList<>();

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m8118() {
        f2645 = (char) 3283;
        f2649 = (char) 25724;
        f2644 = (char) 26274;
        f2648 = (char) 14251;
        f2647 = new char[]{'R', 4413, 8899, 13415, 17676, 22222, 26745, 30982, 35495, 39992, 44292, 48817, 53328, 57629, 62192, 24233, 20386, 31834, 27369, 7052, 2140, 14076, 10177, ' ', 4472, 8950, 13409, 17676, 22220, 26741, 31002, 35559, 40043, 44368, 48828, 53313, 57610, 62135, 1101, 5620, 9976, 14417, 18916, 23186, 27741, 32241, 36492, 41017, 45496, 49809, 54316, 58820, 63133, 2100, ' ', 4472, 8950, 13409, 17676, 22220, 26741, 31002, 35552, 40053, 44305, 48828, 53315, 57616, 62133, 1100, 5537, 9976, 14352, 18917, 23169, 27724, 32243, 36480, 41085, 45480, 49800, GMTDateParser.DAY_OF_MONTH, 4409, 8900, 13417, 18366, 22269, 25872, 29613, 708, 4356, 12213, 16003, 52601, 56246, 60122, 63856, 38788, 42717};
        f2646 = -8298303243831602856L;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m8117(iu iuVar) {
        int i = 2 % 2;
        int i2 = f2643 + 5;
        f2642 = i2 % 128;
        int i3 = i2 % 2;
        iuVar.m8113();
        if (i3 == 0) {
            throw null;
        }
        int i4 = f2642 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2643 = i4 % 128;
        int i5 = i4 % 2;
    }

    static class a {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f2659 = 1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2660 = 0;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2661 = 9;

        /* renamed from: ﻐ, reason: contains not printable characters */
        final BroadcastReceiver f2662;

        /* renamed from: ｋ, reason: contains not printable characters */
        final IntentFilter f2663;

        /* renamed from: ﾇ, reason: contains not printable characters */
        boolean f2664;

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder(128);
            sb.append(m8123(TextUtils.lastIndexOf("", '0') + 10, false, Drawable.resolveOpacity(0, 0) + 113, "\u0001\u000e�\n\u0013￪�\ufffb�", 5 - View.combineMeasuredStates(0, 0)).intern());
            sb.append(this.f2662);
            sb.append(m8123((ViewConfiguration.getScrollDefaultDelay() >> 16) + 8, true, 101 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "￡\u0016\t\u0018\u0010\r\nￄ", 8 - View.combineMeasuredStates(0, 0)).intern());
            sb.append(this.f2663);
            sb.append(m8123(View.MeasureSpec.getMode(0) + 1, false, Color.blue(0) + 134, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - View.MeasureSpec.getSize(0)).intern());
            String obj = sb.toString();
            int i2 = f2660 + 105;
            f2659 = i2 % 128;
            int i3 = i2 % 2;
            return obj;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m8123(int i, boolean z, int i2, String str, int i3) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (d.f1644) {
                char[] cArr3 = new char[i];
                d.f1641 = 0;
                while (d.f1641 < i) {
                    d.f1643 = cArr2[d.f1641];
                    cArr3[d.f1641] = (char) (d.f1643 + i2);
                    int i4 = d.f1641;
                    cArr3[i4] = (char) (cArr3[i4] - f2661);
                    d.f1641++;
                }
                if (i3 > 0) {
                    d.f1642 = i3;
                    char[] cArr4 = new char[i];
                    System.arraycopy(cArr3, 0, cArr4, 0, i);
                    System.arraycopy(cArr4, 0, cArr3, i - d.f1642, d.f1642);
                    System.arraycopy(cArr4, d.f1642, cArr3, 0, i - d.f1642);
                }
                if (z) {
                    char[] cArr5 = new char[i];
                    d.f1641 = 0;
                    while (d.f1641 < i) {
                        cArr5[d.f1641] = cArr3[(i - d.f1641) - 1];
                        d.f1641++;
                    }
                    cArr3 = cArr5;
                }
                str2 = new String(cArr3);
            }
            return str2;
        }
    }

    static class c {

        /* renamed from: ﻛ, reason: contains not printable characters */
        final Intent f2665;

        /* renamed from: ﾇ, reason: contains not printable characters */
        final ArrayList<a> f2666;

        c(Intent intent, ArrayList<a> arrayList) {
            this.f2665 = intent;
            this.f2666 = arrayList;
        }
    }

    static {
        m8118();
        f2651 = new Object();
        int i = f2643 + 97;
        f2642 = i % 128;
        int i2 = i % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static iu m8114(Context context) {
        iu iuVar;
        synchronized (f2651) {
            if (f2650 == null) {
                f2650 = new iu(context.getApplicationContext());
            }
            iuVar = f2650;
        }
        return iuVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m8122() {
        int i = 2 % 2;
        int i2 = f2643;
        int i3 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2642 = i3 % 128;
        int i4 = i3 % 2;
        this.f2653 = true;
        int i5 = i2 + 31;
        f2642 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m8121() {
        int i = 2 % 2;
        int i2 = f2643 + 65;
        f2642 = i2 % 128;
        int i3 = i2 % 2;
        this.f2653 = false;
        m8112();
        int i4 = f2643 + 79;
        f2642 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    private iu(Context context) {
        this.f2655 = context;
        this.f2652 = new Handler(context.getMainLooper()) { // from class: com.ironsource.adqualitysdk.sdk.i.iu.5
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    iu.m8117(iu.this);
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m8119(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2654) {
            ArrayList<IntentFilter> remove = this.f2654.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int i = 0; i < remove.size(); i++) {
                IntentFilter intentFilter = remove.get(i);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList<a> arrayList = this.f2656.get(action);
                    if (arrayList != null) {
                        int i3 = 0;
                        while (i3 < arrayList.size()) {
                            if (arrayList.get(i3).f2662 == broadcastReceiver) {
                                arrayList.remove(i3);
                                i3--;
                            }
                            i3++;
                        }
                        if (arrayList.size() <= 0) {
                            this.f2656.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m8112() {
        synchronized (this.f2654) {
            Iterator it = new HashMap(this.f2654).keySet().iterator();
            while (it.hasNext()) {
                m8119((BroadcastReceiver) it.next());
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m8120(Intent intent) {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Uri uri;
        Set<String> set;
        String intern;
        String intern2 = m8116("࣑㶅뚝\ue55b㤲ࣰ掆ﵢὲ읈뚝\ue55b㍰ၪ杻헞\ued75癰뉐嶍阹䇞", 21 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
        if (!this.f2653) {
            return false;
        }
        synchronized (this.f2654) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2655.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                j = 0;
                Log.v(intern2, new StringBuilder().append(m8115((char) TextUtils.getOffsetBefore("", 0), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 15 - TextUtils.indexOf("", "", 0)).intern()).append(resolveTypeIfNeeded).append(m8115((char) (24201 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, (ViewConfiguration.getJumpTapTimeout() >> 16) + 8).intern()).append(scheme).append(m8116("ȅ᳹ᯡ㖡\ud897ફ没ੇ⮒䴘\ued7a⏽", TextUtils.indexOf("", "", 0, 0) + 11).intern()).append(intent).toString());
            } else {
                j = 0;
            }
            ArrayList<a> arrayList = this.f2656.get(intent.getAction());
            if (arrayList != null) {
                if (z) {
                    Log.v(intern2, new StringBuilder().append(m8116("蕯\udc24罺䈺襷䈱\uf514⥮霗屝묓㤤\ued7a⏽", 12 - ExpandableListView.getPackedPositionChild(j)).intern()).append(arrayList).toString());
                }
                ArrayList arrayList2 = null;
                int i = 0;
                while (i < arrayList.size()) {
                    a aVar = arrayList.get(i);
                    if (z) {
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        Log.v(intern2, new StringBuilder().append(m8116("杻헞㐛\u1ae3{늽\uf5b8秱⒟Ȍ\udb0d迍\ud897ફ㍰ၪ㒹彞떪쇞没ੇꡃퟰ", 24 - TextUtils.getCapsMode("", 0, 0)).intern()).append(aVar.f2663).toString());
                    } else {
                        str = action;
                        str2 = resolveTypeIfNeeded;
                    }
                    if (aVar.f2664) {
                        if (z) {
                            Log.v(intern2, m8115((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), KeyEvent.getDeadChar(0, 0) + 23, (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 30).intern());
                        }
                        str5 = scheme;
                        uri = data;
                        set = categories;
                        str4 = str2;
                        str3 = str;
                    } else {
                        String str6 = str;
                        String str7 = str2;
                        int match = aVar.f2663.match(str6, str7, scheme, data, categories, intern2);
                        if (match >= 0) {
                            if (z) {
                                str3 = str6;
                                str4 = str7;
                                str5 = scheme;
                                uri = data;
                                set = categories;
                                Log.v(intern2, new StringBuilder().append(m8115((char) TextUtils.indexOf("", "", 0), MotionEvent.axisFromString("") + 55, 26 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern()).append(Integer.toHexString(match)).toString());
                            } else {
                                str3 = str6;
                                str4 = str7;
                                str5 = scheme;
                                uri = data;
                                set = categories;
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(aVar);
                            aVar.f2664 = true;
                        } else {
                            str3 = str6;
                            str4 = str7;
                            str5 = scheme;
                            uri = data;
                            set = categories;
                            if (z) {
                                if (match == -4) {
                                    intern = m8116("뚝\ue55b没ੇ춍ꖰ닡仁", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8).intern();
                                } else if (match == -3) {
                                    intern = m8116("厌澤罺䈺襷䈱", (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 5).intern();
                                } else if (match == -2) {
                                    intern = m8115((char) (ViewConfiguration.getLongPressTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 81, ((byte) KeyEvent.getModifierMetaStateMask()) + 5).intern();
                                } else if (match == -1) {
                                    intern = m8116("퀉ጩও\ue3ab", 5 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))).intern();
                                } else {
                                    intern = m8115((char) (18379 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Drawable.resolveOpacity(0, 0) + 85, 13 - TextUtils.lastIndexOf("", '0')).intern();
                                }
                                Log.v(intern2, new StringBuilder().append(m8116("溴뉓㓈ۭ步ᐦꚬ\uf1e5⋕顈\uf2d9絓\uf1e9沷\uf40cᗄ＾岣溼䚖ⴇ賈堨콶", Color.argb(0, 0, 0, 0) + 24).intern()).append(intern).toString());
                            }
                        }
                    }
                    i++;
                    action = str3;
                    resolveTypeIfNeeded = str4;
                    scheme = str5;
                    data = uri;
                    categories = set;
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((a) arrayList2.get(i2)).f2664 = false;
                    }
                    this.f2657.add(new c(intent, arrayList2));
                    if (!this.f2652.hasMessages(1)) {
                        this.f2652.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m8113() {
        int size;
        c[] cVarArr;
        while (true) {
            synchronized (this.f2654) {
                size = this.f2657.size();
                if (size <= 0) {
                    return;
                }
                cVarArr = new c[size];
                this.f2657.toArray(cVarArr);
                this.f2657.clear();
            }
            for (int i = 0; i < size; i++) {
                c cVar = cVarArr[i];
                for (int i2 = 0; i2 < cVar.f2666.size(); i2++) {
                    cVar.f2666.get(i2).f2662.onReceive(this.f2655, cVar.f2665);
                }
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m8116(String str, int i) {
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
                    char c2 = cArr4[1];
                    char c3 = cArr4[0];
                    char c4 = (char) (c2 - (((c3 + i2) ^ ((c3 << 4) + f2645)) ^ ((c3 >>> 5) + f2644)));
                    cArr4[1] = c4;
                    cArr4[0] = (char) (c3 - (((c4 >>> 5) + f2649) ^ ((c4 + i2) ^ ((c4 << 4) + f2648))));
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

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m8115(char c2, int i, int i2) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1197) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1198 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1198 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1198] = (char) ((f2647[com.ironsource.adqualitysdk.sdk.i.c.f1198 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1198 * f2646)) ^ c2);
                com.ironsource.adqualitysdk.sdk.i.c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
