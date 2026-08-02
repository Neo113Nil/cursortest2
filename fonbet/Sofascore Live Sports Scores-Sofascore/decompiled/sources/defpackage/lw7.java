package defpackage;

import com.sofascore.model.database.MediaReactionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lw7 implements pw7 {
    public final int a;
    public final int b;
    public final MediaReactionType c;
    public final MediaReactionType d;
    public final String e;

    public lw7(int i, int i2, MediaReactionType mediaReactionType, MediaReactionType mediaReactionType2, String str) {
        this.a = i;
        this.b = i2;
        this.c = mediaReactionType;
        this.d = mediaReactionType2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw7)) {
            return false;
        }
        lw7 lw7Var = (lw7) obj;
        return this.a == lw7Var.a && this.b == lw7Var.b && this.c == lw7Var.c && this.d == lw7Var.d && this.e.equals(lw7Var.e);
    }

    public final int hashCode() {
        int a = wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
        MediaReactionType mediaReactionType = this.c;
        int hashCode = (a + (mediaReactionType == null ? 0 : mediaReactionType.hashCode())) * 31;
        MediaReactionType mediaReactionType2 = this.d;
        return this.e.hashCode() + ((hashCode + (mediaReactionType2 != null ? mediaReactionType2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "ReactionAction(postId=", ", reactionCount=", ", prevReaction=");
        s.append(this.c);
        s.append(", reaction=");
        s.append(this.d);
        s.append(", category=");
        return mz1.o(s, this.e, ")");
    }
}
