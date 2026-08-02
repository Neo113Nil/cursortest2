package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.socialHeader;

import Sc.InterfaceC4008j;
import Vg.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.utils.CellExtKt;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SelectionItemDescriptionScrollViewModel;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SelectionItemDescriptionScrollableVH;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR'\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/socialHeader/SelectionItemDescriptionSocialHeaderVH;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollableVH;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/socialHeader/SocialHeaderVO;", "Lru/ozon/uni/android/cell/CellView;", "headerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;", "scrollViewModel", "<init>", "(Lru/ozon/uni/android/cell/CellView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;LVg/d;Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;)V", "", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/socialHeader/SocialHeaderVO;Ll20/d;)V", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Ll10/b;", "getController", "()Ll10/b;", "controller", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionItemDescriptionSocialHeaderVH extends SelectionItemDescriptionScrollableVH<SocialHeaderVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final CellView headerView;

    @NotNull
    private final SubscribeAuthorsIdStorage subscribeAuthorsIdStorage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionItemDescriptionSocialHeaderVH(@NotNull CellView headerView, @NotNull ComposerReferences composerReferences, @NotNull SubscribeAuthorsIdStorage subscribeAuthorsIdStorage, @NotNull d customActionHandlersStoreFactory, @NotNull SelectionItemDescriptionScrollViewModel scrollViewModel) {
        super(headerView, composerReferences, scrollViewModel);
        Intrinsics.checkNotNullParameter(headerView, "headerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(subscribeAuthorsIdStorage, "subscribeAuthorsIdStorage");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(scrollViewModel, "scrollViewModel");
        this.headerView = headerView;
        this.composerReferences = composerReferences;
        this.subscribeAuthorsIdStorage = subscribeAuthorsIdStorage;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = LazyUtilsKt.unsafeLazy(new SelectionItemDescriptionSocialHeaderVH$actionHandler$2(this));
    }

    private final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final InterfaceC7851b getController() {
        return this.composerReferences.getController();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        String rightBlockParam;
        Boolean isAuthorSubscribed;
        super.onAttach();
        SocialHeaderVO socialHeaderVO = (SocialHeaderVO) getBoundData();
        if (socialHeaderVO == null || (isAuthorSubscribed = this.subscribeAuthorsIdStorage.isAuthorSubscribed((rightBlockParam = CellExtKt.getRightBlockParam(socialHeaderVO.getSubscribe(), "authorId")))) == null) {
            return;
        }
        boolean booleanValue = isAuthorSubscribed.booleanValue();
        if (booleanValue && socialHeaderVO.getIsSubscribed()) {
            getController().update(new SubscribeAuthorUpdateKey(rightBlockParam));
        } else {
            if (booleanValue || socialHeaderVO.getIsSubscribed()) {
                return;
            }
            getController().update(new UnsubscribeAuthorUpdateKey(rightBlockParam));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SocialHeaderVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        String rightBlockParam = CellExtKt.getRightBlockParam(item.getSubscribe(), "authorId");
        Boolean isAuthorSubscribed = this.subscribeAuthorsIdStorage.isAuthorSubscribed(rightBlockParam);
        if (isAuthorSubscribed != null ? isAuthorSubscribed.booleanValue() : item.getIsSubscribed()) {
            getController().update(new SubscribeAuthorUpdateKey(rightBlockParam));
            CellHolderKt.bind(this.headerView, item.getSubscribed(), getActionHandler());
        } else {
            getController().update(new UnsubscribeAuthorUpdateKey(rightBlockParam));
            CellHolderKt.bind(this.headerView, item.getSubscribe(), getActionHandler());
        }
    }
}
