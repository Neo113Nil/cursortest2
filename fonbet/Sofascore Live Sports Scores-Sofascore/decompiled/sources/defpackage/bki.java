package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class bki extends qhh {
    public static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder m = new StringBuilder();
    public final ArrayList n = new ArrayList();

    public static long e(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x014e, code lost:
    
        if (r9.equals("{\\an4}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0155, code lost:
    
        if (r9.equals("{\\an3}") != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0162, code lost:
    
        if (r9.equals("{\\an1}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0221, code lost:
    
        return new defpackage.y3g(20, (defpackage.l74[]) r1.toArray(new defpackage.l74[r4]), java.util.Arrays.copyOf(r2, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012f, code lost:
    
        if (r9.equals("{\\an9}") != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0157, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0173, code lost:
    
        if (r9.equals("{\\an9}") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0183, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017a, code lost:
    
        if (r9.equals("{\\an8}") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0181, code lost:
    
        if (r9.equals("{\\an7}") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0198, code lost:
    
        if (r9.equals("{\\an3}") != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a8, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
    
        if (r9.equals("{\\an2}") != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a6, code lost:
    
        if (r9.equals("{\\an1}") != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013b, code lost:
    
        if (r9.equals("{\\an7}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0164, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0142, code lost:
    
        if (r9.equals("{\\an6}") != false) goto L62;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.qhh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kli b(byte[] bArr, int i, boolean z) {
        String g;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        l74 l74Var;
        bki bkiVar = this;
        ArrayList arrayList = new ArrayList();
        long[] jArr = new long[32];
        nkk nkkVar = new nkk(bArr, i);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            String g2 = nkkVar.g();
            if (g2 != null) {
                if (g2.length() != 0) {
                    try {
                        Integer.parseInt(g2);
                        g = nkkVar.g();
                    } catch (NumberFormatException unused) {
                        "Skipping invalid index: ".concat(g2);
                        m6k.f0();
                    }
                    if (g == null) {
                        m6k.f0();
                    } else {
                        Matcher matcher = o.matcher(g);
                        if (matcher.matches()) {
                            long e = e(matcher, 1);
                            if (i7 == jArr.length) {
                                jArr = Arrays.copyOf(jArr, i7 * 2);
                            }
                            long[] jArr2 = jArr;
                            int i8 = i7 + 1;
                            jArr[i7] = e;
                            long e2 = e(matcher, 6);
                            if (i8 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i8 * 2);
                            }
                            jArr = jArr2;
                            i7 += 2;
                            jArr2[i8] = e2;
                            StringBuilder sb = bkiVar.m;
                            sb.setLength(i6);
                            ArrayList arrayList2 = bkiVar.n;
                            arrayList2.clear();
                            for (String g3 = nkkVar.g(); !TextUtils.isEmpty(g3); g3 = nkkVar.g()) {
                                if (sb.length() > 0) {
                                    sb.append("<br>");
                                }
                                String trim = g3.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = p.matcher(trim);
                                int i9 = i6;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i9;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i9 += length;
                                }
                                sb.append(sb2.toString());
                            }
                            Spanned fromHtml = Html.fromHtml(sb.toString());
                            int i10 = i6;
                            while (true) {
                                if (i10 < arrayList2.size()) {
                                    str = (String) arrayList2.get(i10);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i10++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            if (str == null) {
                                l74Var = new l74(fromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            } else {
                                switch (str.hashCode()) {
                                    case -685620710:
                                        break;
                                    case -685620679:
                                        str.equals("{\\an2}");
                                        i2 = 1;
                                        break;
                                    case -685620648:
                                        break;
                                    case -685620617:
                                        break;
                                    case -685620586:
                                        str.equals("{\\an5}");
                                        i2 = 1;
                                        break;
                                    case -685620555:
                                        break;
                                    case -685620524:
                                        break;
                                    case -685620493:
                                        str.equals("{\\an8}");
                                        i2 = 1;
                                        break;
                                    case -685620462:
                                        break;
                                    default:
                                        i2 = 1;
                                        break;
                                }
                                switch (str.hashCode()) {
                                    case -685620710:
                                        break;
                                    case -685620679:
                                        break;
                                    case -685620648:
                                        break;
                                    case -685620617:
                                        str.equals("{\\an4}");
                                        i3 = 1;
                                        break;
                                    case -685620586:
                                        str.equals("{\\an5}");
                                        i3 = 1;
                                        break;
                                    case -685620555:
                                        str.equals("{\\an6}");
                                        i3 = 1;
                                        break;
                                    case -685620524:
                                        break;
                                    case -685620493:
                                        break;
                                    case -685620462:
                                        break;
                                    default:
                                        i3 = 1;
                                        break;
                                }
                                if (i2 != 0) {
                                    i4 = 1;
                                    if (i2 != 1) {
                                        i5 = 2;
                                        if (i2 != 2) {
                                            ilg.c();
                                            return null;
                                        }
                                        f = 0.92f;
                                    } else {
                                        i5 = 2;
                                        f = 0.5f;
                                    }
                                } else {
                                    i4 = 1;
                                    i5 = 2;
                                    f = 0.08f;
                                }
                                if (i3 == 0) {
                                    f2 = 0.08f;
                                } else if (i3 == i4) {
                                    f2 = 0.5f;
                                } else {
                                    if (i3 != i5) {
                                        ilg.c();
                                        return null;
                                    }
                                    f2 = 0.92f;
                                }
                                l74Var = new l74(fromHtml, null, null, null, f2, 0, i3, f, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            }
                            arrayList.add(l74Var);
                            arrayList.add(l74.r);
                        } else {
                            "Skipping invalid timing: ".concat(g);
                            m6k.f0();
                        }
                        bkiVar = this;
                        i6 = 0;
                    }
                }
            }
        }
    }
}
