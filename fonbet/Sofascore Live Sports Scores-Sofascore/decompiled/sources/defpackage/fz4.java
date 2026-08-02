package defpackage;

import com.sofascore.model.Country;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fz4 implements oz4 {
    public final Country a;

    public fz4(Country country) {
        this.a = country;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz4) && this.a.equals(((fz4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetCountryMcc(country=" + this.a + ")";
    }
}
