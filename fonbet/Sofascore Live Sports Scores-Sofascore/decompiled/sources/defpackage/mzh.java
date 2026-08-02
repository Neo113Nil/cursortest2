package defpackage;

import com.sofascore.model.Sports;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mzh implements nzh {
    public static final mzh a = new mzh();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mzh);
    }

    @Override // defpackage.nzh
    public final String getSportSlug() {
        return Sports.TRENDING;
    }

    public final int hashCode() {
        return 29852437;
    }

    public final String toString() {
        return "Trending";
    }
}
