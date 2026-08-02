package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzanw {
    private static final Pattern zzc = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern zzd;
    private static final Pattern zze;
    private static final Pattern zzf;
    public final int zza;
    public final PointF zzb;

    static {
        String str = zzfk.zza;
        zzd = Pattern.compile(String.format(Locale.US, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zze = Pattern.compile(String.format(Locale.US, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zzf = Pattern.compile("\\\\an(\\d+)");
    }

    private zzanw(int i, PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a A[Catch: RuntimeException -> 0x000a, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:19:0x008e, B:21:0x009a, B:29:0x00a0, B:24:0x00a8), top: B:18:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzanw zza(String str) {
        Matcher matcher;
        int i;
        Matcher matcher2;
        Matcher matcher3;
        boolean find;
        boolean find2;
        PointF pointF;
        String group;
        String group2;
        Matcher matcher4 = zzc.matcher(str);
        PointF pointF2 = null;
        int i2 = -1;
        while (matcher4.find()) {
            String group3 = matcher4.group(1);
            group3.getClass();
            try {
                matcher2 = zzd.matcher(group3);
                matcher3 = zze.matcher(group3);
                find = matcher2.find();
                find2 = matcher3.find();
            } catch (RuntimeException unused) {
            }
            if (find) {
                if (find2) {
                    StringBuilder sb = new StringBuilder(group3.length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(group3);
                    sb.append("'");
                    zzef.zzb("SsaStyle.Overrides", sb.toString());
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            } else if (find2) {
                group = matcher3.group(1);
                group2 = matcher3.group(2);
            } else {
                pointF = null;
                if (pointF != null) {
                    pointF2 = pointF;
                }
                try {
                    matcher = zzf.matcher(group3);
                    if (matcher.find()) {
                        i = -1;
                    } else {
                        String group4 = matcher.group(1);
                        if (group4 == null) {
                            throw null;
                        }
                        String str2 = group4;
                        i = zzanx.zzd(group4);
                    }
                    if (i == -1) {
                        i2 = i;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            if (group == null) {
                throw null;
            }
            String str3 = group;
            float parseFloat = Float.parseFloat(group.trim());
            if (group2 == null) {
                throw null;
            }
            String str4 = group2;
            pointF = new PointF(parseFloat, Float.parseFloat(group2.trim()));
            if (pointF != null) {
            }
            matcher = zzf.matcher(group3);
            if (matcher.find()) {
            }
            if (i == -1) {
            }
        }
        return new zzanw(i2, pointF2);
    }

    public static String zzb(String str) {
        return zzc.matcher(str).replaceAll("");
    }
}
