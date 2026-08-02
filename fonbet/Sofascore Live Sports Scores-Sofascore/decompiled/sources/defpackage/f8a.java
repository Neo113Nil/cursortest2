package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f8a {
    public static final AtomicLong d = new AtomicLong();
    public final String a;
    public final String b;
    public final long c;

    public f8a(String str, String str2, long j) {
        z1a.r("empty type", !str.isEmpty());
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static f8a a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new f8a(simpleName, str, d.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        sb.append("<");
        StringBuilder sb2 = new StringBuilder(lnb.l(this.c, ">", sb));
        String str = this.b;
        if (str != null) {
            sb2.append(": (");
            sb2.append(str);
            sb2.append(')');
        }
        return sb2.toString();
    }
}
