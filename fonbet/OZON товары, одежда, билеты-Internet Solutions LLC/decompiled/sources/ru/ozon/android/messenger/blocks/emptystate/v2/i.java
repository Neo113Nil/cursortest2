package ru.ozon.android.messenger.blocks.emptystate.v2;

import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.common.SquircleLinearLayout;
import ru.ozon.android.messenger.blocks.emptystate.g;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.databinding.MBlockEmptyStateV2Binding;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class i extends q<g, MBlockEmptyStateV2Binding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f85137a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull MBlockEmptyStateV2Binding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85137a = references;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(g gVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        int i11;
        int i12;
        g block = gVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        d.a f7 = ru.ozon.android.messenger.utils.g.f(this.f85137a.d());
        boolean z11 = block.c() instanceof g.a;
        MBlockEmptyStateV2Binding binding = getBinding();
        if (Intrinsics.d(block.i(), Boolean.FALSE)) {
            binding.getConstraintLayout().setLayoutParams(new LinearLayout.LayoutParams(binding.getConstraintLayout().getLayoutParams().width, -2));
        }
        SquircleLinearLayout blockEmptyStateLl = binding.blockEmptyStateLl;
        Intrinsics.checkNotNullExpressionValue(blockEmptyStateLl, "blockEmptyStateLl");
        if (z11) {
            i12 = 0;
        } else {
            i11 = ru.ozon.android.messenger.utils.e.f91908e;
            i12 = i11;
        }
        s.g(blockEmptyStateLl, i12, 0, 0, 0, 14);
        TextAtomV2View emptyStateTitleTv = binding.emptyStateTitleTv;
        Intrinsics.checkNotNullExpressionValue(emptyStateTitleTv, "emptyStateTitleTv");
        TextHolderKt.bindOrGone$default(emptyStateTitleTv, block.g(), null, 2, null);
        TextAtomV2View emptyStateDescriptionTv = binding.emptyStateDescriptionTv;
        Intrinsics.checkNotNullExpressionValue(emptyStateDescriptionTv, "emptyStateDescriptionTv");
        TextHolderKt.bindOrGone$default(emptyStateDescriptionTv, block.d(), null, 2, null);
        binding.emptyStateButtons.a(block.b(), new h(this));
        ImageDTO e11 = block.e();
        if (e11 != null) {
            Image emptyStateIv = binding.emptyStateIv;
            Intrinsics.checkNotNullExpressionValue(emptyStateIv, "emptyStateIv");
            ImageHolderKt.bind$default(emptyStateIv, e11, null, 2, null);
        }
        Image emptyStateIv2 = binding.emptyStateIv;
        Intrinsics.checkNotNullExpressionValue(emptyStateIv2, "emptyStateIv");
        ru.ozon.android.messenger.utils.image.c.d(emptyStateIv2, block.f(), f7);
        Image emptyStateIv3 = binding.emptyStateIv;
        Intrinsics.checkNotNullExpressionValue(emptyStateIv3, "emptyStateIv");
        s.e(emptyStateIv3, Boolean.valueOf(block.f() != null));
    }
}
