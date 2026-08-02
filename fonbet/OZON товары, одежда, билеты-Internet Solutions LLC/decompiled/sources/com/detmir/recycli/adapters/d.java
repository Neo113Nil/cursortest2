package com.detmir.recycli.adapters;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d {
    public static final void a(@NotNull RecyclerView recyclerView, @NotNull List<? extends RecyclerItem> items) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new RecyclerAdapter());
        }
        RecyclerView.g adapter = recyclerView.getAdapter();
        RecyclerAdapter recyclerAdapter = adapter instanceof RecyclerAdapter ? (RecyclerAdapter) adapter : null;
        if (recyclerAdapter != null) {
            recyclerAdapter.bindState(items);
        }
    }
}
