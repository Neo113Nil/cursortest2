package m10;

import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: m10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8040b extends i.d<ru.ozon.composer.ui.widget.l> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.composer.ui.widget.a f74006a;

    public C8040b(@NotNull ru.ozon.composer.ui.widget.a widgetsFactory) {
        Intrinsics.checkNotNullParameter(widgetsFactory, "widgetsFactory");
        this.f74006a = widgetsFactory;
    }

    @Override // androidx.recyclerview.widget.i.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean areItemsTheSame(@NotNull ru.ozon.composer.ui.widget.l oldItem, @NotNull ru.ozon.composer.ui.widget.l newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.j() == newItem.j() && oldItem.d().getId() == newItem.d().getId();
    }

    @Override // androidx.recyclerview.widget.i.d
    public final boolean areContentsTheSame(ru.ozon.composer.ui.widget.l lVar, ru.ozon.composer.ui.widget.l lVar2) {
        ru.ozon.composer.ui.widget.l oldItem = lVar;
        ru.ozon.composer.ui.widget.l newItem = lVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object getChangePayload(@NotNull ru.ozon.composer.ui.widget.l oldItem, @NotNull ru.ozon.composer.ui.widget.l newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return this.f74006a.g(oldItem, newItem);
    }
}
