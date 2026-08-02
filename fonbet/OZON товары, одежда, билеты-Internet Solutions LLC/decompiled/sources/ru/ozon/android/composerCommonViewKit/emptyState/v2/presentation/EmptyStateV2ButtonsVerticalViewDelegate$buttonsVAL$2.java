package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.R$id;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class EmptyStateV2ButtonsVerticalViewDelegate$buttonsVAL$2 extends AbstractC7737t implements Function0<VerticalAtomsLayout> {
    final /* synthetic */ EmptyStateV2ButtonsVerticalViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateV2ButtonsVerticalViewDelegate$buttonsVAL$2(EmptyStateV2ButtonsVerticalViewDelegate emptyStateV2ButtonsVerticalViewDelegate) {
        super(0);
        this.this$0 = emptyStateV2ButtonsVerticalViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final VerticalAtomsLayout invoke() {
        View view;
        int i11;
        int i12;
        AtomsAdapter atomsAdapter;
        view = this.this$0.view;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        EmptyStateV2ButtonsVerticalViewDelegate emptyStateV2ButtonsVerticalViewDelegate = this.this$0;
        verticalAtomsLayout.setId(R$id.emptyStateActionButtonsContainerVAL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        i11 = emptyStateV2ButtonsVerticalViewDelegate.dp16;
        i12 = emptyStateV2ButtonsVerticalViewDelegate.dp16;
        layoutParams.setMargins(i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, i12, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        verticalAtomsLayout.setLayoutParams(layoutParams);
        atomsAdapter = emptyStateV2ButtonsVerticalViewDelegate.verticalItemsAdapter;
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setGravity(17);
        return verticalAtomsLayout;
    }
}
