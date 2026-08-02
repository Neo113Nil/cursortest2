package ru.ozon.android.messenger.blocks.buttons.presentation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class b extends RecyclerView.C {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull X4.a view) {
        super(view.getConstraintLayout());
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public abstract void e(@NotNull ru.ozon.android.messenger.blocks.buttons.a aVar, boolean z11);
}
