package ru.ozon.app.android.ui.widgets.textWidget.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslLayoutContainerListAdapterDelegate;
import ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¨\u0006\n"}, d2 = {"expandableTextAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "changeExpandedState", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextExpandableVO;", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExpandableTextAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<TextWidgetVO.TextWidgetItemVO>> expandableTextAdapterDelegate(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super TextWidgetVO.TextWidgetItemVO.TextExpandableVO, Unit> changeExpandedState) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(changeExpandedState, "changeExpandedState");
        ExpandableTextAdapterDelegateKt$expandableTextAdapterDelegate$1 expandableTextAdapterDelegateKt$expandableTextAdapterDelegate$1 = ExpandableTextAdapterDelegateKt$expandableTextAdapterDelegate$1.INSTANCE;
        return new DslLayoutContainerListAdapterDelegate(0, ExpandableTextAdapterDelegateKt$expandableTextAdapterDelegate$$inlined$adapterDelegateLayoutContainer$default$1.INSTANCE, new ExpandableTextAdapterDelegateKt$expandableTextAdapterDelegate$2(actionHandler, changeExpandedState), expandableTextAdapterDelegateKt$expandableTextAdapterDelegate$1);
    }
}
