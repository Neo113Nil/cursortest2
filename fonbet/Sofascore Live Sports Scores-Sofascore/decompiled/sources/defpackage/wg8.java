package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wg8 implements Comparable {
    public static final wg8 b;
    public static final wg8 c;
    public static final wg8 d;
    public static final wg8 e;
    public static final wg8 f;
    public static final wg8 g;
    public static final wg8 h;
    public static final wg8 i;
    public static final wg8 j;
    public static final List k;
    public final int a;

    static {
        wg8 wg8Var = new wg8(100);
        wg8 wg8Var2 = new wg8(200);
        wg8 wg8Var3 = new wg8(300);
        wg8 wg8Var4 = new wg8(400);
        b = wg8Var4;
        wg8 wg8Var5 = new wg8(500);
        c = wg8Var5;
        wg8 wg8Var6 = new wg8(600);
        d = wg8Var6;
        wg8 wg8Var7 = new wg8(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
        e = wg8Var7;
        wg8 wg8Var8 = new wg8(800);
        wg8 wg8Var9 = new wg8(900);
        f = wg8Var3;
        g = wg8Var4;
        h = wg8Var5;
        i = wg8Var6;
        j = wg8Var7;
        k = b.j(wg8Var, wg8Var2, wg8Var3, wg8Var4, wg8Var5, wg8Var6, wg8Var7, wg8Var8, wg8Var9);
    }

    public wg8(int i2) {
        this.a = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        s3a.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(wg8 wg8Var) {
        return Intrinsics.d(this.a, wg8Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wg8) {
            return this.a == ((wg8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return wv8.j(new StringBuilder("FontWeight(weight="), this.a, ')');
    }
}
