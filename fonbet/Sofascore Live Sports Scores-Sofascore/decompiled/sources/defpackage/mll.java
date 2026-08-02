package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mll {
    public final int a;
    public final p7l b;
    public final Bitmap c;
    public final Bitmap d;
    public final jfj e;
    public final jfj f;
    public final jfj g;
    public final jfj h;

    public mll(int i, p7l p7lVar, Bitmap bitmap, Bitmap bitmap2, jfj jfjVar, jfj jfjVar2, jfj jfjVar3, jfj jfjVar4) {
        this.a = i;
        this.b = p7lVar;
        this.c = bitmap;
        this.d = bitmap2;
        this.e = jfjVar;
        this.f = jfjVar2;
        this.g = jfjVar3;
        this.h = jfjVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mll)) {
            return false;
        }
        mll mllVar = (mll) obj;
        return this.a == mllVar.a && this.b == mllVar.b && Intrinsics.c(this.c, mllVar.c) && Intrinsics.c(this.d, mllVar.d) && this.e.equals(mllVar.e) && Intrinsics.c(this.f, mllVar.f) && this.g.equals(mllVar.g) && Intrinsics.c(this.h, mllVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        Bitmap bitmap = this.c;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Bitmap bitmap2 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31)) * 31;
        jfj jfjVar = this.f;
        int hashCode4 = (this.g.hashCode() + ((hashCode3 + (jfjVar == null ? 0 : jfjVar.hashCode())) * 31)) * 31;
        jfj jfjVar2 = this.h;
        return hashCode4 + (jfjVar2 != null ? jfjVar2.hashCode() : 0);
    }

    public final String toString() {
        return "WorldCupWidgetMatchCardUiModel(eventId=" + this.a + ", statusType=" + this.b + ", firstTeamImage=" + this.c + ", secondTeamImage=" + this.d + ", textUpperFirst=" + this.e + ", textUpperSecond=" + this.f + ", textLowerFirst=" + this.g + ", textLowerSecond=" + this.h + ")";
    }
}
