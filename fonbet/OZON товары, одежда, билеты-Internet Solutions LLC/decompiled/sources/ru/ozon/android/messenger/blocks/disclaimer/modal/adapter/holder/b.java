package ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.holder;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c;
import ru.ozon.android.messenger.utils.e;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.databinding.MDisclaimerModalDescriptionItemBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MDisclaimerModalDescriptionItemBinding f85057a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(@NotNull MDisclaimerModalDescriptionItemBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        TextAtomV2View constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.f85057a = binding;
    }

    @Override // ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.holder.a
    public final void e(@NotNull ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomV2View textAtomV2View = this.f85057a.disclaimerModalItemDescription;
        if (!(item instanceof c.b)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Intrinsics.f(textAtomV2View);
        c.b bVar = (c.b) item;
        TextHolderKt.bind$default(textAtomV2View, bVar.b(), null, 2, null);
        s.g(textAtomV2View, 0, 0, 0, bVar.a() ? e.f91908e : e.f91906c, 5);
    }
}
