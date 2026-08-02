package defpackage;

import android.util.SparseArray;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hhh implements Comparable {
    public static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public hhh(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
    
        if (r16.renameTo(r1) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hhh b(File file, long j, long j2, vng vngVar) {
        File file2;
        long j3;
        String group;
        File c;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = h.matcher(name2);
            if (!matcher.matches()) {
                matcher = g.matcher(name2);
                if (matcher.matches()) {
                    group = matcher.group(1);
                    group.getClass();
                    if (group != null) {
                    }
                    c = null;
                    if (c != null) {
                    }
                    return null;
                }
                group = null;
                if (group != null) {
                }
                c = null;
                if (c != null) {
                }
                return null;
            }
            group = matcher.group(1);
            group.getClass();
            String str = nik.a;
            int length = group.length();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (group.charAt(i4) == '%') {
                    i3++;
                }
            }
            if (i3 != 0) {
                int i5 = length - (i3 * 2);
                StringBuilder sb = new StringBuilder(i5);
                Matcher matcher2 = nik.f.matcher(group);
                while (i3 > 0 && matcher2.find()) {
                    String group2 = matcher2.group(1);
                    group2.getClass();
                    char parseInt = (char) Integer.parseInt(group2, 16);
                    sb.append((CharSequence) group, i2, matcher2.start());
                    sb.append(parseInt);
                    i2 = matcher2.end();
                    i3--;
                }
                if (i2 < length) {
                    sb.append((CharSequence) group, i2, length);
                }
                if (sb.length() == i5) {
                    group = sb.toString();
                }
                group = null;
            }
            if (group != null) {
                File parentFile = file.getParentFile();
                parentFile.getClass();
                int i6 = vngVar.M(group).a;
                String group3 = matcher.group(2);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                String group4 = matcher.group(3);
                group4.getClass();
                c = c(parentFile, i6, parseLong, Long.parseLong(group4));
            }
            c = null;
            if (c != null) {
                file2 = c;
                name = c.getName();
            }
            return null;
        }
        file2 = file;
        Matcher matcher3 = i.matcher(name);
        if (matcher3.matches()) {
            String group5 = matcher3.group(1);
            group5.getClass();
            String str2 = (String) ((SparseArray) vngVar.b).get(Integer.parseInt(group5));
            if (str2 != null) {
                long length2 = j == -1 ? file2.length() : j;
                if (length2 != 0) {
                    String group6 = matcher3.group(2);
                    group6.getClass();
                    long parseLong2 = Long.parseLong(group6);
                    if (j2 == C.TIME_UNSET) {
                        String group7 = matcher3.group(3);
                        group7.getClass();
                        j3 = Long.parseLong(group7);
                    } else {
                        j3 = j2;
                    }
                    return new hhh(str2, parseLong2, length2, j3, file2);
                }
            }
        }
        return null;
    }

    public static File c(File file, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, lnb.l(j2, ".v3.exo", sb));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(hhh hhhVar) {
        String str = hhhVar.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(hhhVar.a);
        }
        long j = this.b - hhhVar.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(U3.j.d);
        sb.append(this.b);
        sb.append(", ");
        return lnb.l(this.c, U3.j.e, sb);
    }
}
