package defpackage;

import com.sofascore.model.mvvm.model.ESportsEvent;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kq5 implements Serializable {
    public final ESportsEvent a;

    public kq5(ESportsEvent eSportsEvent) {
        this.a = eSportsEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kq5) && this.a.equals(((kq5) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EsportsCSGOAdvantageRowData(event=" + this.a + ", isLast=true)";
    }
}
