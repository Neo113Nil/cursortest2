package ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.presentation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.SplitDynamicElementsAdapter;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/presentation/RfbsAddressInfoVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/presentation/RfbsAddressInfoVO;", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "yandexSearchSheetSharedViewModel", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/presentation/RfbsAddressInfoVO;Ll20/d;)V", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "rfbsActionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter;", "dynamicAdapter", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RfbsAddressInfoVH extends k<RfbsAddressInfoVO> {

    @NotNull
    private final SplitDynamicElementsAdapter dynamicAdapter;

    @NotNull
    private Function1<? super AtomAction, Unit> rfbsActionHandler;

    @NotNull
    private final YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RfbsAddressInfoVH(@NotNull RecyclerView containerView, @NotNull ComposerReferences ref, @NotNull HandlersInhibitor handlersInhibitor, @NotNull AppType appType, @NotNull YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(yandexSearchSheetSharedViewModel, "yandexSearchSheetSharedViewModel");
        this.yandexSearchSheetSharedViewModel = yandexSearchSheetSharedViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).onClick(new RfbsAddressInfoVH$rfbsActionHandler$1(ref)).buildHandler();
        this.rfbsActionHandler = buildHandler;
        SplitDynamicElementsAdapter splitDynamicElementsAdapter = new SplitDynamicElementsAdapter(this, ref, handlersInhibitor, appType, buildHandler, new RfbsAddressInfoVH$dynamicAdapter$1(this, ref), null, 64, null);
        this.dynamicAdapter = splitDynamicElementsAdapter;
        containerView.setItemAnimator(null);
        containerView.setAdapter(splitDynamicElementsAdapter);
        containerView.setRecycledViewPool(ref.getComposerViewPoolProvider().getViewPool());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RfbsAddressInfoVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.dynamicAdapter.submitList(item.getDynamicElementsVO());
    }
}
