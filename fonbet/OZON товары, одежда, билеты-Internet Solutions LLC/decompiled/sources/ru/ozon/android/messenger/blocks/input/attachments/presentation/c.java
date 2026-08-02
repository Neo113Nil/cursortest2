package ru.ozon.android.messenger.blocks.input.attachments.presentation;

import Ve.C4636t5;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.databinding.MAttachmentItemBinding;

/* loaded from: classes10.dex */
public final class c extends t<b, ru.ozon.android.messenger.blocks.input.attachments.presentation.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<UUID, Unit> f85490a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<UUID, Unit> f85491b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<UUID, Unit> f85492c;

    private static final class a extends i.d<b> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f85493a = new a();

        @Override // androidx.recyclerview.widget.i.d
        public final boolean areContentsTheSame(b bVar, b bVar2) {
            b oldItem = bVar;
            b newItem = bVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public final boolean areItemsTheSame(b bVar, b bVar2) {
            b oldItem = bVar;
            b newItem = bVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.b(), newItem.b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Function1 onRetryLoadAttachmentClick, @NotNull Function1 onCancelLoadingAttachment, @NotNull Function1 onRemoveAttachmentClick) {
        super(a.f85493a);
        Intrinsics.checkNotNullParameter(onRetryLoadAttachmentClick, "onRetryLoadAttachmentClick");
        Intrinsics.checkNotNullParameter(onCancelLoadingAttachment, "onCancelLoadingAttachment");
        Intrinsics.checkNotNullParameter(onRemoveAttachmentClick, "onRemoveAttachmentClick");
        this.f85490a = onRetryLoadAttachmentClick;
        this.f85491b = onCancelLoadingAttachment;
        this.f85492c = onRemoveAttachmentClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.C c11, int i11) {
        ru.ozon.android.messenger.blocks.input.attachments.presentation.a holder = (ru.ozon.android.messenger.blocks.input.attachments.presentation.a) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        b item = getItem(i11);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.h(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i11) {
        MAttachmentItemBinding inflate = MAttachmentItemBinding.inflate(C4636t5.a(viewGroup, "parent"), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ru.ozon.android.messenger.blocks.input.attachments.presentation.a(inflate, this.f85490a, this.f85491b, this.f85492c);
    }

    @Override // androidx.recyclerview.widget.t
    public final void onCurrentListChanged(@NotNull List<b> previousList, @NotNull List<b> currentList) {
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        Intrinsics.checkNotNullParameter(currentList, "currentList");
    }
}
