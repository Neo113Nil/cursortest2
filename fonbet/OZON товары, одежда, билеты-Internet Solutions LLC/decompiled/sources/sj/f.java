package sj;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class f {
    @NotNull
    public static final xj.a a(@NotNull Map fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new xj.a(fields);
    }

    @NotNull
    public static final xj.a b(@NotNull Pair... fieldPairs) {
        Map map;
        Intrinsics.checkNotNullParameter(fieldPairs, "fieldPairs");
        Intrinsics.checkNotNullParameter(fieldPairs, "<this>");
        int length = fieldPairs.length;
        if (length == 0) {
            map = U.c();
        } else if (length != 1) {
            LinkedHashMap destination = new LinkedHashMap(U.h(fieldPairs.length));
            Intrinsics.checkNotNullParameter(fieldPairs, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            U.o(destination, fieldPairs);
            map = destination;
        } else {
            map = U.i(fieldPairs[0]);
        }
        return new xj.a(map);
    }
}
