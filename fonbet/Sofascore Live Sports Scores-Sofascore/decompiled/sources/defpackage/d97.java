package defpackage;

import com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d97 implements h97 {
    public final FantasySectionedInfoType.CreateSquadInfo a;

    public d97(FantasySectionedInfoType.CreateSquadInfo createSquadInfo) {
        this.a = createSquadInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d97) && this.a.equals(((d97) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreateSquadInfo(infoType=" + this.a + ")";
    }
}
