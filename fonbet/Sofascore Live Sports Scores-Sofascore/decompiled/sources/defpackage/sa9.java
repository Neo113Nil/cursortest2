package defpackage;

import com.sofascore.model.newNetwork.WSCStory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sa9 implements ua9 {
    public final WSCStory a;

    public sa9(WSCStory wSCStory) {
        this.a = wSCStory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa9) && this.a.equals(((sa9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WscStoryUiModel(wscStory=" + this.a + ")";
    }
}
