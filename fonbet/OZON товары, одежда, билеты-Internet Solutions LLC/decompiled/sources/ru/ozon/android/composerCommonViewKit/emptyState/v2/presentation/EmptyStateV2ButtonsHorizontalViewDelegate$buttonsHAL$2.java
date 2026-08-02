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
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class EmptyStateV2ButtonsHorizontalViewDelegate$buttonsHAL$2 extends AbstractC7737t implements Function0<HorizontalFlexAtomsLayout> {
    final /* synthetic */ EmptyStateV2ButtonsHorizontalViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateV2ButtonsHorizontalViewDelegate$buttonsHAL$2(EmptyStateV2ButtonsHorizontalViewDelegate emptyStateV2ButtonsHorizontalViewDelegate) {
        super(0);
        this.this$0 = emptyStateV2ButtonsHorizontalViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HorizontalFlexAtomsLayout invoke() {
        View view;
        int i11;
        int i12;
        AtomsAdapter atomsAdapter;
        view = this.this$0.view;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = new HorizontalFlexAtomsLayout(context, null, 0, 6, null);
        EmptyStateV2ButtonsHorizontalViewDelegate emptyStateV2ButtonsHorizontalViewDelegate = this.this$0;
        horizontalFlexAtomsLayout.setId(R$id.emptyStateActionButtonsContainerHAL);
        horizontalFlexAtomsLayout.setMaxLine(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        horizontalFlexAtomsLayout.setForegroundGravity(17);
        i11 = emptyStateV2ButtonsHorizontalViewDelegate.dp16;
        i12 = emptyStateV2ButtonsHorizontalViewDelegate.dp16;
        layoutParams.setMargins(i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, i12, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        horizontalFlexAtomsLayout.setLayoutParams(layoutParams);
        atomsAdapter = emptyStateV2ButtonsHorizontalViewDelegate.horizontalItemsAdapter;
        horizontalFlexAtomsLayout.setAdapter(atomsAdapter);
        return horizontalFlexAtomsLayout;
    }
}
