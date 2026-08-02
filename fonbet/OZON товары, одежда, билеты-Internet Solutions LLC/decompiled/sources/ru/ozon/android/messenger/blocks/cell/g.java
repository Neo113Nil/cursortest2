package ru.ozon.android.messenger.blocks.cell;

import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.app.android.messenger.databinding.MOnlyNewBlockCellBinding;
import ru.ozon.uni.android.controls.chip.ChipView;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;

/* loaded from: classes10.dex */
public final class g extends q<c, MOnlyNewBlockCellBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f84476a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull MOnlyNewBlockCellBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f84476a = references;
    }

    public static final void b(g gVar, boolean z11) {
        gVar.f84476a.c().o(U.i(new Pair("hideRead", Boolean.valueOf(z11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(ChipView chipView, boolean z11) {
        if (z11) {
            chipView.setChipState(ChipState.SELECTED);
            chipView.setEnabled(false);
        } else {
            chipView.setChipState(ChipState.ENABLED);
            chipView.setEnabled(true);
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(c cVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        c block = cVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        MOnlyNewBlockCellBinding binding = getBinding();
        ChipView chipView = binding.allChats;
        chipView.setUnselectByClick(false);
        d(chipView, !getContext().getSharedPreferences("PREFERENCES_FILTER_STATES", 0).getBoolean("PREFERENCES_HIDE_READ_KEY", false));
        ChipView chipView2 = binding.onlyNewChats;
        chipView2.setUnselectByClick(false);
        d(chipView2, getContext().getSharedPreferences("PREFERENCES_FILTER_STATES", 0).getBoolean("PREFERENCES_HIDE_READ_KEY", false));
        binding.allChats.setOnSelect(new e(this, binding));
        binding.onlyNewChats.setOnSelect(new f(this, binding));
    }
}
