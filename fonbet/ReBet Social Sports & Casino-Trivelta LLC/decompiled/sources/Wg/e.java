package Wg;

import ah.C2020l;
import ah.K;
import ah.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class e {
    public static final C2020l a(r rVar, Function1 block) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        C2020l a10 = rVar.a();
        block.invoke(a10);
        return a10;
    }

    public static final boolean b(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.b();
        return false;
    }

    public static final void c(c cVar, String urlString) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        K.j(cVar.i(), urlString);
    }
}
