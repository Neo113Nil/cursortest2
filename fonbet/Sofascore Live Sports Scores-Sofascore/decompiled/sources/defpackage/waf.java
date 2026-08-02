package defpackage;

import java.time.LocalDate;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class waf implements yaf {
    public final LocalDate a;

    public waf(LocalDate localDate) {
        this.a = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof waf) && this.a.equals(((waf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DateSeparator(timestamp=" + this.a + ")";
    }
}
