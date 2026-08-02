package ru.ozon.android.messenger.framework.navigation.action;

import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
public final class b {
    public static final Object a(@NotNull String key, @NotNull Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return map.get(key);
    }

    public static final Object b(@NotNull String key, @NotNull Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = map.get(key);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final a c(AtomActionDTO atomActionDTO) {
        return new a(atomActionDTO, null, 0 == true ? 1 : 0, 6);
    }

    @NotNull
    public static final a d(AtomActionDTO atomActionDTO, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new a(atomActionDTO, null, params, 2);
    }

    public static a e(AtomAction atomAction, AtomActionDTO atomActionDTO, int i11) {
        if ((i11 & 1) != 0) {
            atomActionDTO = null;
        }
        Map params = U.c();
        Intrinsics.checkNotNullParameter(atomAction, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        return new a(atomActionDTO, atomAction, params);
    }
}
