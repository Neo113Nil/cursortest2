package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x4f {
    public final int a;
    public final int b;
    public final String c;

    public x4f(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.D;
        this.b = preference.E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x4f)) {
            return false;
        }
        x4f x4fVar = (x4f) obj;
        return this.a == x4fVar.a && this.b == x4fVar.b && TextUtils.equals(this.c, x4fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31) + this.b) * 31);
    }
}
