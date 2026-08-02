package ru.ozon.app.android.ugc.core.widgets.commentsListV3.core;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.SellerSubscribeUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorBaseKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.header.CommentsHeaderVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.header.CommentsHeaderView;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterStateUpdateKey;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00020\u0014j\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R2\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001a0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u001f0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R2\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040(0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001e¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/core/CommentsListHeaderV3ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/di/CommentsListComponent;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;", "viewModel", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommentsListHeaderV3ViewMapper extends WidgetViewMapper2<CommentsListComponent, CommentsListDTO, CommentsHeaderVO> {
    private CommentsViewModel viewModel;

    @NotNull
    private final Function2<CommentsListDTO, d, List<CommentsHeaderVO>> mapper = CommentsListHeaderV3ViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(SubscribeAuthorUpdateKey.class, UnsubscribeAuthorUpdateKey.class, SellerSubscribeUpdateKey.class, ActionsFooterStateUpdateKey.class, CommentsCountIncremented.class, CommentsCountDecremented.class);

    @NotNull
    private final Function2<View, ComposerReferences, k<CommentsHeaderVO>> holderProducer = new CommentsListHeaderV3ViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new CommentsHeaderView(context);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CommentsHeaderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CommentsListDTO, d, List<CommentsHeaderVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CommentsListComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CommentsListComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public CommentsHeaderVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CommentsHeaderVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof SubscribeAuthorBaseKey) {
            CommentsViewModel commentsViewModel = this.viewModel;
            if (commentsViewModel == null) {
                return null;
            }
            CommentsViewModel.DefaultImpls.updateCommentsSocialHeader$default(commentsViewModel, ((SubscribeAuthorBaseKey) update).getAuthorId(), null, null, 6, null);
            return null;
        }
        if (update instanceof SellerSubscribeUpdateKey) {
            CommentsViewModel commentsViewModel2 = this.viewModel;
            if (commentsViewModel2 == null) {
                return null;
            }
            SellerSubscribeUpdateKey sellerSubscribeUpdateKey = (SellerSubscribeUpdateKey) update;
            CommentsViewModel.DefaultImpls.updateCommentsSocialHeader$default(commentsViewModel2, null, sellerSubscribeUpdateKey.getSellerId(), Boolean.valueOf(sellerSubscribeUpdateKey.getIsSubscribed()), 1, null);
            return null;
        }
        if (!(update instanceof ActionsFooterStateUpdateKey)) {
            if (update instanceof CommentsCountIncremented) {
                return CommentsHeaderV3NoUiViewMapperKt.updateCount(oldItem, oldItem.getCount() + 1);
            }
            if (update instanceof CommentsCountDecremented) {
                return CommentsHeaderV3NoUiViewMapperKt.updateCount(oldItem, oldItem.getCount() - 1);
            }
            return null;
        }
        CommentsViewModel commentsViewModel3 = this.viewModel;
        if (commentsViewModel3 == null) {
            return null;
        }
        ActionsFooterStateUpdateKey actionsFooterStateUpdateKey = (ActionsFooterStateUpdateKey) update;
        commentsViewModel3.updateReactionState(actionsFooterStateUpdateKey.getReviewUuid(), actionsFooterStateUpdateKey.getIsSelected(), actionsFooterStateUpdateKey.getActionId());
        return null;
    }
}
