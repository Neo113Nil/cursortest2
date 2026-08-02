package defpackage;

import com.sofascore.model.database.MediaReactionType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x43 {
    public final MediaReactionType a;
    public final int b;
    public final int c;
    public final int d;
    public final Boolean e;

    public /* synthetic */ x43(MediaReactionType mediaReactionType, int i, int i2, Boolean bool, int i3) {
        this((i3 & 1) != 0 ? null : mediaReactionType, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, 0, (i3 & 16) != 0 ? Boolean.FALSE : bool);
    }

    public static x43 a(x43 x43Var, MediaReactionType mediaReactionType, int i, int i2, Boolean bool, int i3) {
        if ((i3 & 1) != 0) {
            mediaReactionType = x43Var.a;
        }
        MediaReactionType mediaReactionType2 = mediaReactionType;
        if ((i3 & 2) != 0) {
            i = x43Var.b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = x43Var.c;
        }
        int i5 = i2;
        int i6 = x43Var.d;
        if ((i3 & 16) != 0) {
            bool = x43Var.e;
        }
        return new x43(mediaReactionType2, i4, i5, i6, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x43)) {
            return false;
        }
        x43 x43Var = (x43) obj;
        return this.a == x43Var.a && this.b == x43Var.b && this.c == x43Var.c && this.d == x43Var.d && Intrinsics.c(this.e, x43Var.e);
    }

    public final int hashCode() {
        MediaReactionType mediaReactionType = this.a;
        int a = wv8.a(this.d, wv8.a(this.c, wv8.a(this.b, (mediaReactionType == null ? 0 : mediaReactionType.hashCode()) * 31, 31), 31), 31);
        Boolean bool = this.e;
        return a + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonFeedCardDataModel(userReaction=");
        sb.append(this.a);
        sb.append(", reactionCount=");
        sb.append(this.b);
        sb.append(", shareCount=");
        me4.q(sb, this.c, ", listPosition=", this.d, ", feedbackSent=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public x43(MediaReactionType mediaReactionType, int i, int i2, int i3, Boolean bool) {
        this.a = mediaReactionType;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bool;
    }
}
