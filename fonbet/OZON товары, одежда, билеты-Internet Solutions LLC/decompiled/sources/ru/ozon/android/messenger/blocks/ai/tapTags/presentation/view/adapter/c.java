package ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.adapter;

import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b;

/* loaded from: classes10.dex */
public final class c extends i.d<ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b> {
    @Override // androidx.recyclerview.widget.i.d
    public final boolean areContentsTheSame(ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b bVar, ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b bVar2) {
        ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b oldItem = bVar;
        ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b newItem = bVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public final boolean areItemsTheSame(ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b bVar, ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b bVar2) {
        ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b oldItem = bVar;
        ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b newItem = bVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return ((oldItem instanceof b.a) && (newItem instanceof b.a)) ? ((b.a) oldItem).hashCode() == ((b.a) newItem).hashCode() : (oldItem instanceof b.C1465b) && (newItem instanceof b.C1465b) && ((b.C1465b) oldItem).getId() == ((b.C1465b) newItem).getId();
    }
}
