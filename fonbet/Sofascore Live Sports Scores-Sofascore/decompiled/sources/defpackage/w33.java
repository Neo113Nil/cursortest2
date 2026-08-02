package defpackage;

import com.sofascore.model.newNetwork.commentary.Comment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w33 implements y33 {
    public final Comment a;

    public w33(Comment comment) {
        comment.getClass();
        this.a = comment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w33) && Intrinsics.c(this.a, ((w33) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IncidentClicked(comment=" + this.a + ")";
    }
}
