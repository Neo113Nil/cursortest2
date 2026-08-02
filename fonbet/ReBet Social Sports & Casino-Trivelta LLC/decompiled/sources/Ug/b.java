package Ug;

import io.ktor.utils.io.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {
    public static final Og.b a(Og.b bVar, f content) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        return new a(bVar.c(), content, bVar);
    }
}
