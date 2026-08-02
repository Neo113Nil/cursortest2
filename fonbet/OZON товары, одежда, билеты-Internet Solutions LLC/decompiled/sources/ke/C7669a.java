package ke;

import je.r0;
import ke.f;
import ke.h;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ke.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7669a {
    public static r0 a(boolean z11, f fVar, h.a aVar, int i11) {
        u typeSystemContext = u.f71512a;
        if ((i11 & 8) != 0) {
            fVar = f.a.f71487a;
        }
        f kotlinTypePreparator = fVar;
        if ((i11 & 16) != 0) {
            aVar = h.a.f71488a;
        }
        h.a kotlinTypeRefiner = aVar;
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new r0(z11, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }
}
