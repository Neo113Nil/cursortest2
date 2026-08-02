package ru.ozon.android.messenger.blocks.courierheader.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.app.android.messenger.databinding.MCourierHeaderBlockBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class b extends q<a, MCourierHeaderBlockBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f84958a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull MCourierHeaderBlockBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        e eVar = new e(references.c());
        this.f84958a = eVar;
        RecyclerView recyclerView = binding.ordersRv;
        recyclerView.setAdapter(eVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        i11 = ru.ozon.android.messenger.utils.e.f91911h;
        i12 = ru.ozon.android.messenger.utils.e.f91907d;
        recyclerView.addItemDecoration(new f(i11, i12));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(a aVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        a block = aVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        TextAtomV2View titleTv = getBinding().titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextHolderKt.bindOrGone$default(titleTv, block.b(), null, 2, null);
        this.f84958a.submitList(block.a());
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void onRecycle() {
        super.onRecycle();
        this.f84958a.f();
    }
}
