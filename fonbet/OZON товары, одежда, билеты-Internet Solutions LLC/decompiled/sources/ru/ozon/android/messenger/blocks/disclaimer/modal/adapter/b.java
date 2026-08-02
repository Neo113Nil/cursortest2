package ru.ozon.android.messenger.blocks.disclaimer.modal.adapter;

import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class b extends i.d<c> {
    @Override // androidx.recyclerview.widget.i.d
    public final boolean areContentsTheSame(c cVar, c cVar2) {
        c oldItem = cVar;
        c newItem = cVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return true;
    }

    @Override // androidx.recyclerview.widget.i.d
    public final boolean areItemsTheSame(c cVar, c cVar2) {
        c oldItem = cVar;
        c newItem = cVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }
}
