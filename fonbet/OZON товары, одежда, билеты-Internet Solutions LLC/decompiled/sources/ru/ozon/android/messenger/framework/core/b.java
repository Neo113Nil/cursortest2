package ru.ozon.android.messenger.framework.core;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {
    public static final void a(@NotNull ru.ozon.android.messenger.framework.presentation.common.viewmodel.b bVar, @NotNull String key, @NotNull RecyclerView recyclerView) {
        Parcelable onSaveInstanceState;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (onSaveInstanceState = layoutManager.onSaveInstanceState()) == null) {
            return;
        }
        bVar.a(onSaveInstanceState, "recycler_view_state:" + key);
    }
}
