package defpackage;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class km4 {
    public final String a;
    public final sm8 b;
    public final sm8 c;
    public final int d;
    public final int e;

    public km4(String str, sm8 sm8Var, sm8 sm8Var2, int i, int i2) {
        qx9.r(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            ilg.c();
            throw null;
        }
        this.a = str;
        sm8Var.getClass();
        this.b = sm8Var;
        sm8Var2.getClass();
        this.c = sm8Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && km4.class == obj.getClass()) {
            km4 km4Var = (km4) obj;
            if (this.d == km4Var.d && this.e == km4Var.e && this.a.equals(km4Var.a) && this.b.equals(km4Var.b) && this.c.equals(km4Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + dmi.c((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
