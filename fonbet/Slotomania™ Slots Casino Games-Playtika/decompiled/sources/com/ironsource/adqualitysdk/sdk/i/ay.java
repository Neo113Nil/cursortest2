package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.go;
import com.ironsource.adqualitysdk.sdk.i.ha;
import com.ironsource.adqualitysdk.sdk.i.hb;
import com.ironsource.adqualitysdk.sdk.i.hh;
import com.ironsource.adqualitysdk.sdk.i.hl;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class ay {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f606 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f607 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f608 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f609 = null;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f610 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Map<String, List<? extends gt>> f611;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f612;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static List<String> f613;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f614;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f615;

    /* renamed from: ﱟ, reason: contains not printable characters */
    static void m6239() {
        f612 = (char) 827;
        f614 = (char) 53174;
        f607 = (char) 18506;
        f615 = (char) 31396;
        f606 = (char) 6;
        f609 = new char[]{'A', GMTDateParser.DAY_OF_MONTH, 'Q', 'S', GMTDateParser.HOURS, 'a', 'r', 'e', 'U', 't', 'i', 'l', GMTDateParser.SECONDS, 'J', 'n', 'y', GMTDateParser.MONTH, 'o', 'b', 'p', 'L', 'v', 'g', 'F', 'B', 'V', AbstractJsonLexerKt.UNICODE_ESC, 'c', 'I', 'T', 'j', 'O', GMTDateParser.MINUTES, 'w', 'C', 'D'};
    }

    static {
        m6239();
        f613 = Arrays.asList(m6247(14 - View.MeasureSpec.getSize(0), "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0002\u0007\n\u000b\u0006\u0011", (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 68)).intern(), m6247(TextUtils.getCapsMode("", 0, 0) + 11, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0007\u0013\u0097", (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 67)).intern(), m6245("쇃ᨼ\ufb11\ua48eЙ쁅䱄䋢핚춑䬆แ삧掯⣁\ue311", (Process.myTid() >> 22) + 15).intern());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(m6245("奐뙐Ỗ⡴ೠ栾砮\uf4a1\uf45c̎", Color.argb(0, 0, 0, 0) + 10).intern(), m6244(new gw()));
        linkedHashMap.put(m6247(7 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u000e\u0014\u000b\n\f\u0003\u0000\r", (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 44)).intern(), m6244(new hh(), new hh.d()));
        linkedHashMap.put(m6247(ImageFormat.getBitsPerPixel(0) + 6, "\u0001\u0002\u0011\f\u0085", (byte) (35 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern(), m6244(new gh()));
        linkedHashMap.put(m6247(9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0001\u0012\u0014\u0015\u000f\u0017\b\u0010", (byte) (33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern(), m6244(new gi()));
        linkedHashMap.put(m6245("\ue0ab\uef9b\uf45c̎灻ﰟ䱓理", ExpandableListView.getPackedPositionGroup(0L) + 8).intern(), m6244(new gq()));
        linkedHashMap.put(m6247(9 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0016\u0010\u000f\b\n\u0013\u000b\u0000Ò", (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 101)).intern(), m6244(new ha.d(), new ha.a()));
        linkedHashMap.put(m6247(7 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u001d\u000b\u000b\u0007\u001c\u0006\u0081", (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 29)).intern(), m6244(new gp()));
        linkedHashMap.put(m6245("㋚鞄\uf782襠佶\u200f뷿쀝\ue12b\uf737夓ി", 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), m6244(new gs()));
        linkedHashMap.put(m6247(6 - (ViewConfiguration.getScrollBarSize() >> 8), "\u001a\u001b\u0010\u0014\u0006\b", (byte) (40 - TextUtils.indexOf("", ""))).intern(), m6244(new hl.b(), new hl.a()));
        linkedHashMap.put(m6245("쯣\ue1e1阵䘩\udb43矤庚\uf287夓ി", 9 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), m6244(new go.d(), new go.c()));
        linkedHashMap.put(m6247(6 - (ViewConfiguration.getTouchSlop() >> 8), "\u0011\f\u0011\u0017\u001d\u000f", (byte) (123 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), m6244(new gx()));
        linkedHashMap.put(m6245("\ueeb3礝藓弉䋹濃뎟ᅤ鰬勒", 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m6244(new gr()));
        linkedHashMap.put(m6247(KeyEvent.keyCodeFromString("") + 6, "\u001a\u0010\u0011\f\u0016\u0006", (byte) (86 - Color.red(0))).intern(), m6244(new gu()));
        linkedHashMap.put(m6247((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5, "#\u000b\u0012\u001f\f\u0010", (byte) (70 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), m6244(new hf()));
        linkedHashMap.put(m6245("ꋱ䀍構\ue1b8Ỗ⡴陬ぼ옆\uf46a", 9 - KeyEvent.keyCodeFromString("")).intern(), m6244(new gm()));
        linkedHashMap.put(m6245("輧钺쐫镆ਲⱐⅽ\ue7b5\uf782襠", 10 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), m6244(new gl()));
        linkedHashMap.put(m6245("ᥴ娙뀡⊪쇃ᨼ", 5 - TextUtils.lastIndexOf("", '0')).intern(), m6244(new gn()));
        linkedHashMap.put(m6245("瀽첂뭔\ue7e0뮯竌", 5 - ExpandableListView.getPackedPositionChild(0L)).intern(), m6244(new gv()));
        linkedHashMap.put(m6247(4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0011\u0004\u000b\u0010", (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21)).intern(), m6244(new gy()));
        linkedHashMap.put(m6247(8 - TextUtils.getTrimmedLength(""), "\u0011\u0010#\u000b\n\u0012\b\n", (byte) (ExpandableListView.getPackedPositionGroup(0L) + 59)).intern(), m6244(new gz()));
        linkedHashMap.put(m6247(TextUtils.indexOf((CharSequence) "", '0') + 6, "\"\u0013\u0018\b©", (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 48)).intern(), m6244(new hb(), new hb.c()));
        linkedHashMap.put(m6245("礆ݓ⬢楏騑㛏\ue12b\uf737夓ി", '9' - AndroidCharacter.getMirror('0')).intern(), m6244(new hd()));
        linkedHashMap.put(m6247((ViewConfiguration.getScrollBarSize() >> 8) + 6, "\u0002!ØØ\u000b\u000f", (byte) (120 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), m6244(new he()));
        linkedHashMap.put(m6247((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, "\u0002\u001b\u0019\r\f\u0006\u001f\t\r\f\u001f\b", (byte) (22 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), m6244(new hc()));
        linkedHashMap.put(m6247(7 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0019\u000b\u000f\u001a\b\r×", (byte) (147 - AndroidCharacter.getMirror('0'))).intern(), m6244(new hg()));
        linkedHashMap.put(m6245("힝幆ꗪ쾍ࢇ髛", 6 - Drawable.resolveOpacity(0, 0)).intern(), m6244(new hk()));
        f611 = Collections.unmodifiableMap(linkedHashMap);
        int i = f610 + 67;
        f608 = i % 128;
        int i2 = i % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static List<? extends gt> m6244(gt... gtVarArr) {
        int i = 2 % 2;
        int i2 = f608 + 65;
        f610 = i2 % 128;
        int i3 = i2 % 2;
        List<? extends gt> asList = Arrays.asList(gtVarArr);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        int i5 = f610 + 87;
        f608 = i5 % 128;
        int i6 = i5 % 2;
        return asList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Map<String, List<gt>> m6246() {
        int i = 2 % 2;
        ArrayList<String> arrayList = new ArrayList(f611.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = f608 + 67;
        while (true) {
            f610 = i2 % 128;
            int i3 = i2 % 2;
            for (String str : arrayList) {
                List<? extends gt> list = f611.get(str);
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<? extends gt> it = list.iterator();
                    while (it.hasNext()) {
                        int i4 = f608 + 7;
                        f610 = i4 % 128;
                        if (i4 % 2 == 0) {
                            m6241(it.next());
                            throw null;
                        }
                        gt next = it.next();
                        if (m6241(next)) {
                            arrayList2.add(next);
                        }
                    }
                    linkedHashMap.put(str, arrayList2);
                    i2 = f608 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                }
            }
            return linkedHashMap;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static String m6240() {
        int i = 2 % 2;
        int i2 = f608 + 95;
        f610 = i2 % 128;
        String intern = m6245("쇃ᨼ\uea93獫鮨侫鄦謖漨╓Й쁅䱄䋢炃)", i2 % 2 == 0 ? 68 >>> View.resolveSizeAndState(1, 1, 0) : View.resolveSizeAndState(0, 0, 0) + 15).intern();
        int i3 = f608 + 107;
        f610 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 64 / 0;
        }
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static List<String> m6248() {
        int i = 2 % 2;
        int i2 = f608 + 85;
        int i3 = i2 % 128;
        f610 = i3;
        int i4 = i2 % 2;
        List<String> list = f613;
        int i5 = i3 + 1;
        f608 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static gt m6242() {
        int i = 2 % 2;
        gj gjVar = new gj();
        int i2 = f610 + 69;
        f608 = i2 % 128;
        if (i2 % 2 == 0) {
            return gjVar;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static List<gt> m6243() {
        int i = 2 % 2;
        List<gt> asList = Arrays.asList(new gk(), new gg(), new gf());
        int i2 = f610 + 91;
        f608 = i2 % 128;
        int i3 = i2 % 2;
        return asList;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m6241(gt gtVar) {
        int i = 2 % 2;
        int i2 = f608 + 79;
        f610 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Prode.m5772();
                throw null;
            }
            if (Prode.m5772()) {
                gtVar.mo7796();
            } else {
                Class.forName(gtVar.mo7798());
            }
            int i3 = f610 + 113;
            f608 = i3 % 128;
            if (i3 % 2 == 0) {
                return true;
            }
            throw null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6245(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f612)) ^ ((c2 >>> 5) + f607)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f614) ^ ((c3 + i2) ^ ((c3 << 4) + f615))));
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m6247(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f609;
            char c = f606;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                j.f2681 = 0;
                while (j.f2681 < i) {
                    j.f2680 = cArr2[j.f2681];
                    j.f2677 = cArr2[j.f2681 + 1];
                    if (j.f2680 == j.f2677) {
                        cArr4[j.f2681] = (char) (j.f2680 - b);
                        cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                    } else {
                        j.f2679 = j.f2680 / c;
                        j.f2676 = j.f2680 % c;
                        j.f2678 = j.f2677 / c;
                        j.f2675 = j.f2677 % c;
                        if (j.f2676 == j.f2675) {
                            j.f2679 = ((j.f2679 + c) - 1) % c;
                            j.f2678 = ((j.f2678 + c) - 1) % c;
                            int i2 = (j.f2679 * c) + j.f2676;
                            int i3 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i2];
                            cArr4[j.f2681 + 1] = cArr3[i3];
                        } else if (j.f2679 == j.f2678) {
                            j.f2676 = ((j.f2676 + c) - 1) % c;
                            j.f2675 = ((j.f2675 + c) - 1) % c;
                            int i4 = (j.f2679 * c) + j.f2676;
                            int i5 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i4];
                            cArr4[j.f2681 + 1] = cArr3[i5];
                        } else {
                            int i6 = (j.f2679 * c) + j.f2675;
                            int i7 = (j.f2678 * c) + j.f2676;
                            cArr4[j.f2681] = cArr3[i6];
                            cArr4[j.f2681 + 1] = cArr3[i7];
                        }
                    }
                    j.f2681 += 2;
                }
            }
            str2 = new String(cArr4);
        }
        return str2;
    }
}
