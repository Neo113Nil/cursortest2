package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xxm {
    public final qym a;
    public final jzm b;

    public xxm(@NotNull qym qymVar, @NotNull jzm jzmVar) {
        qymVar.getClass();
        jzmVar.getClass();
        this.a = qymVar;
        this.b = jzmVar;
    }

    public static xxm copy$default(xxm xxmVar, qym qymVar, jzm jzmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            qymVar = xxmVar.a;
        }
        if ((i & 2) != 0) {
            jzmVar = xxmVar.b;
        }
        xxmVar.getClass();
        qymVar.getClass();
        jzmVar.getClass();
        return new xxm(qymVar, jzmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxm)) {
            return false;
        }
        xxm xxmVar = (xxm) obj;
        return Intrinsics.c(this.a, xxmVar.a) && Intrinsics.c(this.b, xxmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WidgetInfo(requestData=" + this.a + ", responseData=" + this.b + ')';
    }
}
