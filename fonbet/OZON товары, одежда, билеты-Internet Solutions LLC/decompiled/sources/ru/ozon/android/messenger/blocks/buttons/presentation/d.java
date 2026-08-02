package ru.ozon.android.messenger.blocks.buttons.presentation;

import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class d extends i.d<ru.ozon.android.messenger.blocks.buttons.a> {
    @Override // androidx.recyclerview.widget.i.d
    public final boolean areContentsTheSame(ru.ozon.android.messenger.blocks.buttons.a aVar, ru.ozon.android.messenger.blocks.buttons.a aVar2) {
        ru.ozon.android.messenger.blocks.buttons.a oldItem = aVar;
        ru.ozon.android.messenger.blocks.buttons.a newItem = aVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public final boolean areItemsTheSame(ru.ozon.android.messenger.blocks.buttons.a aVar, ru.ozon.android.messenger.blocks.buttons.a aVar2) {
        ru.ozon.android.messenger.blocks.buttons.a oldItem = aVar;
        ru.ozon.android.messenger.blocks.buttons.a newItem = aVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }
}
