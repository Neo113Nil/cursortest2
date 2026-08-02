package ru.ozon.uikit.recycler.delegate;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/uikit/recycler/delegate/ItemListLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "uikit-recycler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemListLayoutManager extends LinearLayoutManager {

    static final class a extends AbstractC7737t implements Function2<RecyclerView.g<RecyclerView.C>, RecyclerView.C, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f97899b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(RecyclerView.g<RecyclerView.C> gVar, RecyclerView.C c11) {
            RecyclerView.g<RecyclerView.C> adapter = gVar;
            RecyclerView.C viewHolder = c11;
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            adapter.onViewAttachedToWindow(viewHolder);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<RecyclerView.g<RecyclerView.C>, RecyclerView.C, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f97900b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(RecyclerView.g<RecyclerView.C> gVar, RecyclerView.C c11) {
            RecyclerView.g<RecyclerView.C> adapter = gVar;
            RecyclerView.C viewHolder = c11;
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            adapter.onViewDetachedFromWindow(viewHolder);
            adapter.onViewRecycled(viewHolder);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemListLayoutManager(@NotNull Context context) {
        super(context, 1, false);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAttachedToWindow(@NotNull RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAttachedToWindow(view);
        RecyclerView.g<RecyclerView.C> adapter = view.getAdapter();
        if (adapter == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RecyclerView.C findViewHolderForLayoutPosition = view.findViewHolderForLayoutPosition(i11);
            if (findViewHolderForLayoutPosition != null) {
                a.f97899b.invoke(adapter, findViewHolderForLayoutPosition);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onDetachedFromWindow(@NotNull RecyclerView view, @NotNull RecyclerView.v recycler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        super.onDetachedFromWindow(view, recycler);
        RecyclerView.g<RecyclerView.C> adapter = view.getAdapter();
        if (adapter == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RecyclerView.C findViewHolderForLayoutPosition = view.findViewHolderForLayoutPosition(i11);
            if (findViewHolderForLayoutPosition != null) {
                b.f97900b.invoke(adapter, findViewHolderForLayoutPosition);
            }
        }
    }
}
