package ru.ozon.android.messenger.blocks.paginationerror;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.paginationerror.PaginationErrorDTO;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.utils.e;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.app.android.messenger.databinding.MBlockPaginationErrorBinding;

/* loaded from: classes10.dex */
public final class b extends q<a, MBlockPaginationErrorBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f86023a;

    /* renamed from: b, reason: collision with root package name */
    private final int f86024b;

    /* renamed from: c, reason: collision with root package name */
    private final int f86025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull MBlockPaginationErrorBinding binding, @NotNull d references) {
        super(binding, references);
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f86023a = references;
        i11 = e.f91914k;
        this.f86024b = i11;
        i12 = e.f91919p;
        this.f86025c = i12;
    }

    public static void b(a aVar, b bVar) {
        bVar.f86023a.c().r(U.i(new Pair("pagination", aVar.a())));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(a aVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        String string;
        int i11;
        a block = aVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        if (block.a() == PaginationErrorDTO.a.TOP) {
            string = getContext().getString(R$string.messenger_chat_screen_pagination_error_on_top);
            i11 = this.f86024b;
        } else {
            string = getContext().getString(R$string.messenger_chat_screen_pagination_error_on_bottom);
            i11 = this.f86025c;
        }
        MBlockPaginationErrorBinding binding = getBinding();
        binding.paginationErrorTv.setText(string);
        ViewGroup.LayoutParams layoutParams = binding.paginationErrorLl.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null) {
            LinearLayout paginationErrorLl = binding.paginationErrorLl;
            Intrinsics.checkNotNullExpressionValue(paginationErrorLl, "paginationErrorLl");
            ViewGroup.LayoutParams layoutParams2 = paginationErrorLl.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.bottomMargin = i11;
            paginationErrorLl.setLayoutParams(marginLayoutParams);
        }
        binding.paginationErrorBtn.setOnClickListener(new BP.a(8, block, this));
    }
}
