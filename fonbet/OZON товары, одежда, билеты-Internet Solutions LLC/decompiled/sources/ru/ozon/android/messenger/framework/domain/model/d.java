package ru.ozon.android.messenger.framework.domain.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class d {
    public static final int a(@NotNull List<q> list, @NotNull List<q> items, @NotNull c position) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(position, "position");
        int a11 = position.a(list);
        list.addAll(a11, items);
        return a11;
    }
}
