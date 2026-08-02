package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hy5 {
    public final EventSuggest a;

    public hy5(EventSuggest eventSuggest) {
        this.a = eventSuggest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy5) && Intrinsics.c(this.a, ((hy5) obj).a);
    }

    public final int hashCode() {
        EventSuggest eventSuggest = this.a;
        if (eventSuggest == null) {
            return 0;
        }
        return eventSuggest.hashCode();
    }

    public final String toString() {
        return "EditorCommunityCornerWrapper(latestCrowdsourcingSuggest=" + this.a + ")";
    }
}
