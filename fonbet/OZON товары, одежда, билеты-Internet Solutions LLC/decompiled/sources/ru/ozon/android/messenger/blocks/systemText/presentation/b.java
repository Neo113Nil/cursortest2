package ru.ozon.android.messenger.blocks.systemText.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.d;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.utils.e;
import ru.ozon.app.android.messenger.databinding.MBlockSystemTextBinding;
import ru.ozon.app.android.messenger.databinding.MNoTypeLayoutBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class b extends q<a, MBlockSystemTextBinding> {
    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(a aVar, p itemInfo, d blockInfo, Object obj) {
        LinearLayout constraintLayout;
        int i11;
        a block = aVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        View separatorTop = getBinding().separatorTop;
        Intrinsics.checkNotNullExpressionValue(separatorTop, "separatorTop");
        Boolean b11 = block.b();
        Boolean bool = Boolean.TRUE;
        separatorTop.setVisibility(Intrinsics.d(b11, bool) ? 0 : 8);
        View separatorBottom = getBinding().separatorBottom;
        Intrinsics.checkNotNullExpressionValue(separatorBottom, "separatorBottom");
        separatorBottom.setVisibility(Intrinsics.d(block.a(), bool) ? 0 : 8);
        TextAtomV2View systemText = getBinding().systemText;
        Intrinsics.checkNotNullExpressionValue(systemText, "systemText");
        TextHolderKt.bindOrGone$default(systemText, block.c(), null, 2, null);
        MNoTypeLayoutBinding noTypeContainerBindingOrNull = getNoTypeContainerBindingOrNull();
        if (noTypeContainerBindingOrNull == null || (constraintLayout = noTypeContainerBindingOrNull.getConstraintLayout()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        i11 = e.f91911h;
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.bottomMargin = 0;
        constraintLayout.setLayoutParams(marginLayoutParams);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void onRecycle() {
        super.onRecycle();
        getBinding().systemText.setText((CharSequence) null);
    }
}
