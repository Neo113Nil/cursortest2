package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Objects;
import com.ironsource.U3;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i2n {
    public final ApiKey a;
    public final Feature b;

    public /* synthetic */ i2n(ApiKey apiKey, Feature feature) {
        this.a = apiKey;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i2n)) {
            return false;
        }
        i2n i2nVar = (i2n) obj;
        return Objects.a(this.a, i2nVar.a) && Objects.a(this.b, i2nVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.a, U3.i.W);
        toStringHelper.a(this.b, "feature");
        return toStringHelper.toString();
    }
}
