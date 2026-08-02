package i1;

import e1.AbstractC4134a;
import e1.Z;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class s extends i {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f48013g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f48014h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f48015i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public s(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    public static s e(File file, long j10, long j11, k kVar) {
        String i10;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            file = j(file, kVar);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = f48015i.matcher(name);
        if (!matcher.matches() || (i10 = kVar.i(Integer.parseInt((String) AbstractC4134a.e(matcher.group(1))))) == null) {
            return null;
        }
        if (j10 == -1) {
            j10 = file2.length();
        }
        long j12 = j10;
        if (j12 == 0) {
            return null;
        }
        return new s(i10, Long.parseLong((String) AbstractC4134a.e(matcher.group(2))), j12, j11 == -9223372036854775807L ? Long.parseLong((String) AbstractC4134a.e(matcher.group(3))) : j11, file2);
    }

    public static s f(File file, long j10, k kVar) {
        return e(file, j10, -9223372036854775807L, kVar);
    }

    public static s g(String str, long j10, long j11) {
        return new s(str, j10, j11, -9223372036854775807L, null);
    }

    public static s h(String str, long j10) {
        return new s(str, j10, -1L, -9223372036854775807L, null);
    }

    public static File i(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + ".v3.exo");
    }

    public static File j(File file, k kVar) {
        String str;
        String name = file.getName();
        Matcher matcher = f48014h.matcher(name);
        if (matcher.matches()) {
            str = Z.I1((String) AbstractC4134a.e(matcher.group(1)));
        } else {
            matcher = f48013g.matcher(name);
            str = matcher.matches() ? (String) AbstractC4134a.e(matcher.group(1)) : null;
        }
        if (str == null) {
            return null;
        }
        File i10 = i((File) AbstractC4134a.i(file.getParentFile()), kVar.e(str), Long.parseLong((String) AbstractC4134a.e(matcher.group(2))), Long.parseLong((String) AbstractC4134a.e(matcher.group(3))));
        if (file.renameTo(i10)) {
            return i10;
        }
        return null;
    }

    public s d(File file, long j10) {
        AbstractC4134a.g(this.f47963d);
        return new s(this.f47960a, this.f47961b, this.f47962c, j10, file);
    }
}
