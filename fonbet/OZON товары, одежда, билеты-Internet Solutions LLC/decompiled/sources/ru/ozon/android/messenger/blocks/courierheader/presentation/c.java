package ru.ozon.android.messenger.blocks.courierheader.presentation;

import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.courierheader.presentation.a;

/* loaded from: classes10.dex */
public final class c extends i.d<a.C1486a> {
    @Override // androidx.recyclerview.widget.i.d
    public final boolean areContentsTheSame(a.C1486a c1486a, a.C1486a c1486a2) {
        a.C1486a oldItem = c1486a;
        a.C1486a newItem = c1486a2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public final boolean areItemsTheSame(a.C1486a c1486a, a.C1486a c1486a2) {
        a.C1486a oldItem = c1486a;
        a.C1486a newItem = c1486a2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }
}
