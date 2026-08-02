package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.bm2;
import defpackage.ilg;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzaot implements zzanz {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final zzeu c = new zzeu();

    public static long b(Matcher matcher, int i) {
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
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0105, code lost:
    
        if (r9.equals("{\\an6}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x010e, code lost:
    
        if (r9.equals("{\\an4}") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0115, code lost:
    
        if (r9.equals("{\\an3}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x011e, code lost:
    
        if (r9.equals("{\\an1}") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0133, code lost:
    
        if (r9.equals("{\\an9}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0147, code lost:
    
        r4.g = 0;
        r2 = 1;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013d, code lost:
    
        if (r9.equals("{\\an8}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0144, code lost:
    
        if (r9.equals("{\\an7}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0150, code lost:
    
        if (r9.equals("{\\an3}") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0162, code lost:
    
        r4.g = 2;
        r9 = 2;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0159, code lost:
    
        if (r9.equals("{\\an2}") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
    
        if (r9.equals("{\\an1}") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00f4, code lost:
    
        if (r9.equals("{\\an9}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0117, code lost:
    
        r4.i = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00fb, code lost:
    
        if (r9.equals("{\\an7}") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0121, code lost:
    
        r4.i = 0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.ads.zzanz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, int i2, bm2 bm2Var, byte[] bArr) {
        String str;
        int i3;
        int i4;
        float f;
        zzcy b;
        zzeu zzeuVar = this.c;
        zzeuVar.z(i + i2, bArr);
        zzeuVar.D(i);
        Charset q = zzeuVar.q();
        if (q == null) {
            q = StandardCharsets.UTF_8;
        }
        while (true) {
            String n = zzeuVar.n(q);
            if (n == null) {
                return;
            }
            if (!n.isEmpty()) {
                try {
                    Integer.parseInt(n);
                    String n2 = zzeuVar.n(q);
                    if (n2 == null) {
                        zzeh.c("Unexpected end");
                        return;
                    }
                    Matcher matcher = d.matcher(n2);
                    if (matcher.matches()) {
                        long b2 = b(matcher, 1);
                        long b3 = b(matcher, 6);
                        StringBuilder sb = this.a;
                        int i5 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = this.b;
                        arrayList.clear();
                        String n3 = zzeuVar.n(q);
                        while (!TextUtils.isEmpty(n3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String trim = n3.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = e.matcher(trim);
                            int i6 = i5;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i6;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i6 += length;
                            }
                            sb.append(sb2.toString());
                            n3 = zzeuVar.n(q);
                            i5 = 0;
                        }
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        int i7 = 0;
                        while (true) {
                            if (i7 < arrayList.size()) {
                                str = (String) arrayList.get(i7);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i7++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcx zzcxVar = new zzcx();
                        zzcxVar.a(fromHtml);
                        if (str == null) {
                            b = zzcxVar.b();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    break;
                                case -685620648:
                                    break;
                                case -685620617:
                                    break;
                                case -685620555:
                                    break;
                                case -685620524:
                                    break;
                                case -685620462:
                                    break;
                                default:
                                    zzcxVar.i = 1;
                                    break;
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    break;
                                case -685620679:
                                    break;
                                case -685620648:
                                    break;
                                case -685620524:
                                    break;
                                case -685620493:
                                    break;
                                case -685620462:
                                    break;
                                default:
                                    i4 = 1;
                                    zzcxVar.g = 1;
                                    i3 = 1;
                                    break;
                            }
                            int i8 = zzcxVar.i;
                            float f2 = 0.08f;
                            if (i8 == 0) {
                                f = 0.08f;
                            } else if (i8 == i4) {
                                f = 0.5f;
                            } else {
                                if (i8 != 2) {
                                    ilg.c();
                                    return;
                                }
                                f = 0.92f;
                            }
                            zzcxVar.h = f;
                            if (i3 != 0) {
                                if (i3 == i4) {
                                    f2 = 0.5f;
                                } else {
                                    if (i3 != 2) {
                                        ilg.c();
                                        return;
                                    }
                                    f2 = 0.92f;
                                }
                            }
                            zzcxVar.e = f2;
                            zzcxVar.f = 0;
                            b = zzcxVar.b();
                        }
                        bm2Var.mo13zza(new zzanr(zzgxm.t(b), b2, b3 - b2));
                    } else {
                        zzeh.c("Skipping invalid timing: ".concat(n2));
                    }
                } catch (NumberFormatException unused) {
                    zzeh.c("Skipping invalid index: ".concat(n));
                }
            }
        }
    }
}
