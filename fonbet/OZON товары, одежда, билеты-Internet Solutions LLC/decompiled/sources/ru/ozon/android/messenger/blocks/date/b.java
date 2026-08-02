package ru.ozon.android.messenger.blocks.date;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.app.android.messenger.R$dimen;
import ru.ozon.app.android.messenger.databinding.MBlockDateBinding;
import ru.ozon.app.android.messenger.databinding.MNoTypeLayoutBinding;

/* loaded from: classes10.dex */
public final class b extends q<a, MBlockDateBinding> {

    /* renamed from: a, reason: collision with root package name */
    private final int f85023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull MBlockDateBinding binding, @NotNull d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85023a = h.a(getContext(), R$dimen.m_date_block_offset);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(a aVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        LinearLayout constraintLayout;
        a block = aVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        getBinding().chatDateTv.setText(block.b());
        MNoTypeLayoutBinding noTypeContainerBindingOrNull = getNoTypeContainerBindingOrNull();
        if (noTypeContainerBindingOrNull == null || (constraintLayout = noTypeContainerBindingOrNull.getConstraintLayout()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = this.f85023a;
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.bottomMargin = i11;
        constraintLayout.setLayoutParams(marginLayoutParams);
    }
}
