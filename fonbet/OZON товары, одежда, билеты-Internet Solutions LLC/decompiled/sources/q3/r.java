package q3;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.N;

/* loaded from: classes.dex */
final class r extends h {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f81494g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f81495h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f81496i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r16.renameTo(r1) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r b(File file, long j11, long j12, k kVar) {
        File file2;
        long j13;
        String str;
        File c11;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = f81495h.matcher(name2);
            if (matcher.matches()) {
                String group = matcher.group(1);
                group.getClass();
                str = N.f0(group);
            } else {
                matcher = f81494g.matcher(name2);
                if (matcher.matches()) {
                    str = matcher.group(1);
                    str.getClass();
                } else {
                    str = null;
                }
            }
            if (str != null) {
                File parentFile = file.getParentFile();
                G10.a.i(parentFile);
                j g10 = kVar.g(str);
                String group2 = matcher.group(2);
                group2.getClass();
                long parseLong = Long.parseLong(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                c11 = c(parentFile, g10.f81450a, parseLong, Long.parseLong(group3));
            }
            c11 = null;
            if (c11 != null) {
                file2 = c11;
                name = c11.getName();
            }
            return null;
        }
        file2 = file;
        Matcher matcher2 = f81496i.matcher(name);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            String f7 = kVar.f(Integer.parseInt(group4));
            if (f7 != null) {
                long length = j11 == -1 ? file2.length() : j11;
                if (length != 0) {
                    String group5 = matcher2.group(2);
                    group5.getClass();
                    long parseLong2 = Long.parseLong(group5);
                    if (j12 == -9223372036854775807L) {
                        String group6 = matcher2.group(3);
                        group6.getClass();
                        j13 = Long.parseLong(group6);
                    } else {
                        j13 = j12;
                    }
                    return new r(f7, parseLong2, length, j13, file2);
                }
            }
        }
        return null;
    }

    public static File c(File file, int i11, long j11, long j12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append(".");
        sb2.append(j11);
        sb2.append(".");
        return new File(file, P4.f.a(j12, ".v3.exo", sb2));
    }
}
