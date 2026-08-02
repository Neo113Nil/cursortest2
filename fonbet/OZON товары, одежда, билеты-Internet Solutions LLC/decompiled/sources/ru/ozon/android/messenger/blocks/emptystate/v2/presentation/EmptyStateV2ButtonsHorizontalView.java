package ru.ozon.android.messenger.blocks.emptystate.v2.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.R$id;
import ru.ozon.android.messenger.utils.e;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/messenger/blocks/emptystate/v2/presentation/EmptyStateV2ButtonsHorizontalView;", "Landroid/widget/FrameLayout;", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateV2ButtonsHorizontalView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomsAdapter f85146a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateV2ButtonsHorizontalView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.f85146a = atomsAdapter;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = new HorizontalFlexAtomsLayout(context, null, 0, 6, null);
        horizontalFlexAtomsLayout.setId(R$id.emptyStateActionButtonsContainerHAL);
        horizontalFlexAtomsLayout.setMaxLine(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        horizontalFlexAtomsLayout.setForegroundGravity(17);
        i11 = e.f91911h;
        i12 = e.f91911h;
        layoutParams.setMargins(i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, i12, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        horizontalFlexAtomsLayout.setLayoutParams(layoutParams);
        horizontalFlexAtomsLayout.setAdapter(atomsAdapter);
        addView(horizontalFlexAtomsLayout);
    }

    public final void a(List<ButtonV3DTO> list, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        List<ButtonV3DTO> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AtomsAdapter atomsAdapter = this.f85146a;
        atomsAdapter.bind(context, list);
        atomsAdapter.setOnAction(onAction);
    }
}
