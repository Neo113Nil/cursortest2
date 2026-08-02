package ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.MainTabsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a(\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¨\u0006\b"}, d2 = {"mainTabAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/MainTabsVO$Tab;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MainTabAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<MainTabsVO.Tab>> mainTabAdapterDelegate(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        return new DslViewBindingListAdapterDelegate(MainTabAdapterDelegateKt$mainTabAdapterDelegate$1.INSTANCE, MainTabAdapterDelegateKt$mainTabAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new MainTabAdapterDelegateKt$mainTabAdapterDelegate$2(actionHandler), MainTabAdapterDelegateKt$mainTabAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
