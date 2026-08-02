package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oll {
    public final Integer a;
    public final Bitmap b;
    public final jfj c;
    public final boolean d;

    public oll(Integer num, Bitmap bitmap, jfj jfjVar, boolean z) {
        this.a = num;
        this.b = bitmap;
        this.c = jfjVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oll)) {
            return false;
        }
        oll ollVar = (oll) obj;
        return Intrinsics.c(this.a, ollVar.a) && Intrinsics.c(this.b, ollVar.b) && Intrinsics.c(this.c, ollVar.c) && this.d == ollVar.d;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Bitmap bitmap = this.b;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        jfj jfjVar = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (jfjVar != null ? jfjVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "WorldCupWidgetPlayerCardUiModel(playerId=" + this.a + ", playerImage=" + this.b + ", playerRating=" + this.c + ", openSeasonTab=" + this.d + ")";
    }
}
