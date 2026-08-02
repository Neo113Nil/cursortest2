package defpackage;

import com.sofascore.model.mvvm.model.Season;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ea1 implements fa1 {
    public final Season.SubSeasonType a;

    public ea1(Season.SubSeasonType subSeasonType) {
        this.a = subSeasonType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea1) && this.a == ((ea1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectSubSeason(subSeasonType=" + this.a + ")";
    }
}
