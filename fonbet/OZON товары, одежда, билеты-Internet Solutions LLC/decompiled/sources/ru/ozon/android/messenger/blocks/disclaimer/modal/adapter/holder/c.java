package ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.holder;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c;
import ru.ozon.app.android.messenger.databinding.MDisclaimerModalDisclosureItemBinding;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.DisclosureIconTitleSubtitleCellView;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureIconTitleSubtitleCellHolderKt;

/* loaded from: classes10.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MDisclaimerModalDisclosureItemBinding f85058a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<c.a, Unit> f85059b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(@NotNull MDisclaimerModalDisclosureItemBinding binding, @NotNull Function1<? super c.a, Unit> onItemClickListener) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        DisclosureIconTitleSubtitleCellView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.f85058a = binding;
        this.f85059b = onItemClickListener;
    }

    public static void f(c cVar, ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c cVar2) {
        cVar.f85059b.invoke(cVar2);
    }

    @Override // ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.holder.a
    public final void e(@NotNull ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView = this.f85058a.disclaimerModalItemDisclosure;
        if (!(item instanceof c.a.C1492a)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Intrinsics.f(disclosureIconTitleSubtitleCellView);
        DisclosureIconTitleSubtitleCellHolderKt.bind$default(disclosureIconTitleSubtitleCellView, ((c.a.C1492a) item).a(), null, 2, null);
        disclosureIconTitleSubtitleCellView.setOnClickListener(new XT.a(5, this, item));
    }
}
