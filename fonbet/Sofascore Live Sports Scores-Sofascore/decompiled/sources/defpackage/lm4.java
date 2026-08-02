package defpackage;

import android.text.TextUtils;
import androidx.media3.common.b;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lm4 {
    public final String a;
    public final b b;
    public final b c;
    public final int d;
    public final int e;

    public lm4(String str, b bVar, b bVar2, int i, int i2) {
        z1a.s(i == 0 || i2 == 0);
        z1a.s(true ^ TextUtils.isEmpty(str));
        this.a = str;
        bVar.getClass();
        this.b = bVar;
        bVar2.getClass();
        this.c = bVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lm4.class == obj.getClass()) {
            lm4 lm4Var = (lm4) obj;
            if (this.d == lm4Var.d && this.e == lm4Var.e && this.a.equals(lm4Var.a) && this.b.equals(lm4Var.b) && this.c.equals(lm4Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + dmi.c((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
