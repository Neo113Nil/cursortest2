package ru.ozon.app.android.composer.network.util;

import L00.g;
import We.C4864f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002¨\u0006\u0005"}, d2 = {"LL00/g$a;", "forceNetwork", "(LL00/g$a;)LL00/g$a;", "forceCache", "prefetch", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerRequestsKt {
    @NotNull
    public static final g.a forceCache(@NotNull g.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.e("Cache-Control", C4864f.f33718o.toString());
        return aVar;
    }

    @NotNull
    public static final g.a forceNetwork(@NotNull g.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.e("Cache-Control", C4864f.f33717n.toString());
        return aVar;
    }

    @NotNull
    public static final g.a prefetch(@NotNull g.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.e("prefetch-for-caching", "true");
        return aVar;
    }
}
