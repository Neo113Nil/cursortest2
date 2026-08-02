package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x05 {
    public static final /* synthetic */ int e = 0;
    public final int a;
    public final int c;
    public final int b = 0;
    public final String d = null;

    static {
        new uif(0, 2).a();
        nik.N(0);
        nik.N(1);
        nik.N(2);
        nik.N(3);
    }

    public x05(uif uifVar) {
        this.a = uifVar.b;
        this.c = uifVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x05)) {
            return false;
        }
        x05 x05Var = (x05) obj;
        return this.a == x05Var.a && this.b == x05Var.b && this.c == x05Var.c && Objects.equals(this.d, x05Var.d);
    }

    public final int hashCode() {
        int i = (((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i + (str == null ? 0 : str.hashCode());
    }
}
