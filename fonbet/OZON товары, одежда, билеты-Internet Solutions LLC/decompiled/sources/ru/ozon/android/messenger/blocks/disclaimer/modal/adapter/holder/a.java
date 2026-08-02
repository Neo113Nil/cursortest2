package ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.holder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class a extends RecyclerView.C {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
    }

    public abstract void e(@NotNull ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c cVar);
}
