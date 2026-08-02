package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bl9 {
    public Long a = 0L;
    public Long b;
    public Long c;

    static {
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(bl9.class);
        try {
            duf.b(bl9.class);
        } catch (Throwable unused) {
        }
        orCreateKotlinClass.getClass();
        if (StringsKt.R("TimeoutConfiguration")) {
            a70.p("Name can't be blank");
        }
    }

    public bl9() {
        this.b = 0L;
        this.c = 0L;
        b(null);
        this.b = null;
        this.c = null;
    }

    public static void a(Long l) {
        if (l == null || l.longValue() > 0) {
            return;
        }
        a70.p("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS");
    }

    public final void b(Long l) {
        a(l);
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bl9.class != obj.getClass()) {
            return false;
        }
        bl9 bl9Var = (bl9) obj;
        return Intrinsics.c(this.a, bl9Var.a) && Intrinsics.c(this.b, bl9Var.b) && Intrinsics.c(this.c, bl9Var.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.c;
        return hashCode2 + (l3 != null ? l3.hashCode() : 0);
    }
}
