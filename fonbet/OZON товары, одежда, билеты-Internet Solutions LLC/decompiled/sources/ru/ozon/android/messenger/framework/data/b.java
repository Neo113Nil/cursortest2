package ru.ozon.android.messenger.framework.data;

import C.o0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface b {

    public static final class a {
        @NotNull
        public static String a(@NotNull String vertical, @NotNull String name) {
            Intrinsics.checkNotNullParameter(vertical, "vertical");
            Intrinsics.checkNotNullParameter(name, "name");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(vertical);
            return o0.c(sb2, ".", name);
        }
    }

    int a(List<? extends ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> list);

    List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> b(int i11);

    List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c(@NotNull String str);
}
