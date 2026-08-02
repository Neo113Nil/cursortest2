package ru.ozon.app.android.search.widgets.feedbackTile.presentation;

import W10.c;
import WZ.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackAnalyticDelegate;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackSharedViewModel;
import ru.ozon.app.android.search.widgets.feedbackTile.presentation.adapter.FeedbackTileAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00110#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileView;", "view", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;", "feedbackSharedViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "feedbackAnalyticDelegate", "<init>", "(Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileView;Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;)V", "", "showNotification", "()V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileVO;Ll20/d;)V", "Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileView;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/search/widgets/feedbackTile/presentation/adapter/FeedbackTileAdapter;", "adapter", "Lru/ozon/app/android/search/widgets/feedbackTile/presentation/adapter/FeedbackTileAdapter;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackTileViewHolder extends k<FeedbackTileVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FeedbackTileAdapter adapter;

    @NotNull
    private final FeedbackAnalyticDelegate feedbackAnalyticDelegate;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final FeedbackTileView view;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.feedbackTile.presentation.FeedbackTileViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Unit, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            FeedbackTileVO boundData = FeedbackTileViewHolder.this.getBoundData();
            if (boundData != null) {
                FeedbackTileViewHolder.this.refs.getController().m(boundData.getId());
            }
            FeedbackTileViewHolder.this.showNotification();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackTileViewHolder(@NotNull FeedbackTileView view, @NotNull FeedbackSharedViewModel feedbackSharedViewModel, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull FeedbackAnalyticDelegate feedbackAnalyticDelegate) {
        super(view);
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(feedbackSharedViewModel, "feedbackSharedViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(feedbackAnalyticDelegate, "feedbackAnalyticDelegate");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        this.feedbackAnalyticDelegate = feedbackAnalyticDelegate;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onPreProcess(new FeedbackTileViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        FeedbackTileAdapter feedbackTileAdapter = new FeedbackTileAdapter(buildHandler);
        this.adapter = feedbackTileAdapter;
        view.getButtonsRv().setAdapter(feedbackTileAdapter);
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 != null && (view2 = c11.getView()) != null) {
            C10183a.i(view2).setBackgroundColor(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor0));
        }
        feedbackSharedViewModel.getHideFeedbackTile().observe(refs.getContainer().f(), new FeedbackTileViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification() {
        NotificationDTO notification;
        NotificationLayoutManager asNotificationLayoutManager$default;
        FeedbackTileVO boundData = getBoundData();
        if (boundData == null || (notification = boundData.getNotification()) == null) {
            return;
        }
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, this.refs.getContainer().g(), this.actionHandler).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FeedbackTileVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextHolderKt.bindOrGone$default(this.view.getTitleAtom(), item.getText(), null, 2, null);
        this.adapter.submitList(item.getButtons());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull FeedbackTileVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((FeedbackTileViewHolder) item, trackingData, viewedPond);
        this.feedbackAnalyticDelegate.sendViewAnalytics(this.tokenizedAnalytics, item.getTokenizedEvent());
    }
}
