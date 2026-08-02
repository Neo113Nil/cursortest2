package ru.ozon.android.messenger.blocks.useristyping;

import B5.B;
import B5.v;
import H5.e;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.databinding.MBlockUserTypingBinding;

/* loaded from: classes10.dex */
public final class c extends q<b, MBlockUserTypingBinding> {
    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(b bVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        b block = bVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        LottieAnimationView constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        String a11 = block.a();
        if (a11 == null) {
            a11 = "m_user_typing.json";
        }
        constraintLayout.setAnimation(a11);
        constraintLayout.setRepeatCount(-1);
        B b11 = new B(androidx.core.content.a.getColor(constraintLayout.getContext(), R$color.graphic_tertiary));
        constraintLayout.addValueCallback(new e("**"), (e) v.f2780F, (P5.c<e>) new P5.c(b11));
        constraintLayout.playAnimation();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void onRecycle() {
        super.onRecycle();
        getBinding().getConstraintLayout().cancelAnimation();
    }
}
