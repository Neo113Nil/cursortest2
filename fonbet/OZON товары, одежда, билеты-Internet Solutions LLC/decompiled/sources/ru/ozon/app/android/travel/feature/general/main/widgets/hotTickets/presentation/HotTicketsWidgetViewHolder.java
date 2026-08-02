package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation;

import B90.f0;
import Lm0.a;
import Sc.o;
import Vg.d;
import WZ.l;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.main.databinding.WidgetHotTicketsBinding;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.adapter.HotTicketsDecoration;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.adapter.HotTicketsItemAdapter;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.adapter.HotTicketsSingleDecoration;
import ru.ozon.app.android.travel.molecules.extensions.ThemeImageExtKt;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000ó\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001_\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJI\u0010(\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u001e2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0012H\u0002¢\u0006\u0004\b*\u0010\u0014J#\u0010.\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010-\u001a\u00060+j\u0002`,H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u000200H\u0014¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\u00122\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000504H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0012H\u0016¢\u0006\u0004\b<\u0010\u0014J\u000f\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b=\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010?R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00120D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010JR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010JR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010e\u001a\u0004\u0018\u00010b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$State;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;LWZ/l;)V", "", "startAutoSwipe", "()V", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$LoadedState;", "item", "bindLoadedState", "(Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$LoadedState;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$SkeletonState;", "", "asyncData", "bindSkeletonStateAndFetch", "(Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$SkeletonState;Ljava/lang/String;)V", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "backgroundImage", "widgetBorderColor", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "titleImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "image", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "bindNewState", "(Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "removeWidget", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/d;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/main/databinding/WidgetHotTicketsBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/main/databinding/WidgetHotTicketsBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "currentItemPosition", "I", "Lxe/B0;", "autoSwipeJob", "Lxe/B0;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/adapter/HotTicketsItemAdapter;", "hotTicketsAdapter", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/adapter/HotTicketsItemAdapter;", "scrollOffsetCarousel", "", "dpf24", "F", "borderWidth", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/adapter/HotTicketsDecoration;", "carouselDecorator", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/adapter/HotTicketsDecoration;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/adapter/HotTicketsSingleDecoration;", "singleDecorator", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/adapter/HotTicketsSingleDecoration;", "Landroid/graphics/drawable/GradientDrawable;", "widgetForeground", "Landroid/graphics/drawable/GradientDrawable;", "ru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsWidgetViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsWidgetViewHolder$scrollListener$1;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsWidgetViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsWidgetViewModel;", "viewModel", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotTicketsWidgetViewHolder extends k<HotTicketsVO> implements AsyncWidgetCallbacks<HotTicketsVO.State> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private B0 autoSwipeJob;

    @NotNull
    private final WidgetHotTicketsBinding binding;
    private final int borderWidth;

    @NotNull
    private final HotTicketsDecoration carouselDecorator;
    private int currentItemPosition;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private final float dpf24;

    @NotNull
    private final HotTicketsItemAdapter hotTicketsAdapter;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final HotTicketsWidgetViewHolder$scrollListener$1 scrollListener;
    private final int scrollOffsetCarousel;

    @NotNull
    private final HotTicketsSingleDecoration singleDecorator;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final GradientDrawable widgetForeground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.recyclerview.widget.RecyclerView$t, ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsWidgetViewHolder$scrollListener$1] */
    public HotTicketsWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetHotTicketsBinding bind = WidgetHotTicketsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new HotTicketsWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        HotTicketsItemAdapter hotTicketsItemAdapter = new HotTicketsItemAdapter(buildHandler);
        this.hotTicketsAdapter = hotTicketsItemAdapter;
        int px = ((getContext().getResources().getDisplayMetrics().widthPixels - UiExtKt.toPx(320, getContext())) / 2) - UiExtKt.toPx(4, getContext());
        this.scrollOffsetCarousel = px;
        float pxF = ResourceExtKt.toPxF(24, getContext());
        this.dpf24 = pxF;
        this.borderWidth = UiExtKt.toPx(1, getContext());
        this.carouselDecorator = new HotTicketsDecoration(getContext());
        this.singleDecorator = new HotTicketsSingleDecoration(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(pxF);
        this.widgetForeground = gradientDrawable;
        ?? r02 = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsWidgetViewHolder$scrollListener$1
            private int lastSeenItemPosition;

            /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
            
                r2 = r1.this$0.autoSwipeJob;
             */
            @Override // androidx.recyclerview.widget.RecyclerView.t
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                B0 b02;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState != 1 || b02 == null) {
                    return;
                }
                b02.j(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                HotTicketsItemAdapter hotTicketsItemAdapter2;
                final Map<String, TokenizedTrackingInfo> trackingInfo;
                Function1 function1;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null) {
                    return;
                }
                int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                int i11 = this.lastSeenItemPosition;
                if (i11 <= findLastCompletelyVisibleItemPosition) {
                    while (true) {
                        hotTicketsItemAdapter2 = HotTicketsWidgetViewHolder.this.hotTicketsAdapter;
                        List<HotTicketsListItemVO> items = hotTicketsItemAdapter2.getItems();
                        HotTicketsListItemVO hotTicketsListItemVO = items != null ? (HotTicketsListItemVO) C7714v.Q(i11, items) : null;
                        TicketVO ticketVO = hotTicketsListItemVO instanceof TicketVO ? (TicketVO) hotTicketsListItemVO : null;
                        if (ticketVO != null && (trackingInfo = ticketVO.getTrackingInfo()) != null) {
                            final AbstractC5434v lifecycle = HotTicketsWidgetViewHolder.this.getLifecycle();
                            final HotTicketsWidgetViewHolder hotTicketsWidgetViewHolder = HotTicketsWidgetViewHolder.this;
                            if (lifecycle.b().a(AbstractC5434v.b.RESUMED)) {
                                function1 = hotTicketsWidgetViewHolder.actionHandler;
                                function1.invoke(new AtomAction.ViewAction(trackingInfo, null, 2, null));
                            } else {
                                lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsWidgetViewHolder$scrollListener$1$onScrolled$$inlined$whenResumed$1
                                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                                    public void onDestroy(J owner) {
                                        Intrinsics.checkNotNullParameter(owner, "owner");
                                        AbstractC5434v.this.e(this);
                                    }

                                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                                    public void onResume(J owner) {
                                        Function1 function12;
                                        Intrinsics.checkNotNullParameter(owner, "owner");
                                        function12 = hotTicketsWidgetViewHolder.actionHandler;
                                        function12.invoke(new AtomAction.ViewAction(trackingInfo, null, 2, null));
                                        AbstractC5434v.this.e(this);
                                    }
                                });
                            }
                        }
                        if (i11 == findLastCompletelyVisibleItemPosition) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (findLastCompletelyVisibleItemPosition > this.lastSeenItemPosition) {
                    this.lastSeenItemPosition = findLastCompletelyVisibleItemPosition;
                }
            }
        };
        this.scrollListener = r02;
        RecyclerView recyclerView = bind.hotTicketsFlightsRV;
        new x().attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(hotTicketsItemAdapter);
        recyclerView.addOnScrollListener(r02);
        recyclerView.setPadding(px, 0, px, 0);
        containerView.setForeground(gradientDrawable);
    }

    private final void bindLoadedState(HotTicketsVO.LoadedState item) {
        bindNewState(item.getBackgroundImage(), item.getWidgetBorderColor(), item.getTitleImage(), item.getTitle(), item.getImage(), item.getButton());
        if (!item.getIsSingle()) {
            this.binding.hotTicketsFlightsRV.addItemDecoration(this.carouselDecorator);
            item.getTickets();
            this.hotTicketsAdapter.setItems(item.getTickets(), new f0(this, 7));
        } else {
            List<TicketVO> tickets = item.getTickets();
            this.binding.hotTicketsFlightsRV.setPadding(0, 0, 0, 0);
            this.binding.hotTicketsFlightsRV.addItemDecoration(this.singleDecorator);
            this.hotTicketsAdapter.setItems(tickets);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindLoadedState$lambda$6$lambda$5$lambda$4(HotTicketsWidgetViewHolder hotTicketsWidgetViewHolder) {
        B0 b02 = hotTicketsWidgetViewHolder.autoSwipeJob;
        if (b02 == null || !(b02 == null || b02.isActive())) {
            hotTicketsWidgetViewHolder.startAutoSwipe();
        }
    }

    private final void bindNewState(ThemeImageV1VO backgroundImage, String widgetBorderColor, ImageDTO titleImage, TextDTO title, ThemeImageV1VO image, ButtonV3DTO button) {
        ShapeableImageView hotTicketsBackgroundImageIV = this.binding.hotTicketsBackgroundImageIV;
        Intrinsics.checkNotNullExpressionValue(hotTicketsBackgroundImageIV, "hotTicketsBackgroundImageIV");
        ImageViewExtKt.loadImageOrGone(hotTicketsBackgroundImageIV, backgroundImage != null ? ThemeImageExtKt.getUrlForTheme(backgroundImage, getContext()) : null);
        if (widgetBorderColor != null) {
            GradientDrawable gradientDrawable = this.widgetForeground;
            int i11 = this.borderWidth;
            Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), widgetBorderColor);
            gradientDrawable.setStroke(i11, parseColor != null ? parseColor.intValue() : 0);
        }
        Image hotTicketsTitleImageIV = this.binding.hotTicketsTitleImageIV;
        Intrinsics.checkNotNullExpressionValue(hotTicketsTitleImageIV, "hotTicketsTitleImageIV");
        ImageHolderKt.bindOrGone(hotTicketsTitleImageIV, titleImage, this.actionHandler);
        TextAtomV2View hotTicketsTitleTAV = this.binding.hotTicketsTitleTAV;
        Intrinsics.checkNotNullExpressionValue(hotTicketsTitleTAV, "hotTicketsTitleTAV");
        TextHolderKt.bind$default(hotTicketsTitleTAV, title, null, 2, null);
        ShapeableImageView hotTicketsImageIV = this.binding.hotTicketsImageIV;
        Intrinsics.checkNotNullExpressionValue(hotTicketsImageIV, "hotTicketsImageIV");
        ImageViewExtKt.loadImageOrGone(hotTicketsImageIV, image != null ? ThemeImageExtKt.getUrlForTheme(image, getContext()) : null);
        ButtonV3View hotTicketsButtonBV = this.binding.hotTicketsButtonBV;
        Intrinsics.checkNotNullExpressionValue(hotTicketsButtonBV, "hotTicketsButtonBV");
        ButtonV3HolderKt.bindOrGone(hotTicketsButtonBV, button, this.actionHandler);
    }

    private final void bindSkeletonStateAndFetch(HotTicketsVO.SkeletonState item, String asyncData) {
        HotTicketsWidgetViewModel viewModel;
        this.binding.hotTicketsFlightsRV.addItemDecoration(this.carouselDecorator);
        bindNewState(item.getBackgroundImage(), item.getWidgetBorderColor(), item.getTitleImage(), item.getTitle(), item.getImage(), item.getButton());
        RecyclerView recyclerView = this.binding.hotTicketsFlightsRV;
        Intrinsics.f(recyclerView);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i11 = this.scrollOffsetCarousel;
        recyclerView.setPadding(i11, 0, i11, 0);
        recyclerView.setLayoutParams(layoutParams);
        List<HotTicketSkeleton> skeletons = item.getSkeletons();
        if (skeletons != null) {
            this.hotTicketsAdapter.setItems(skeletons);
        }
        if (asyncData == null || (viewModel = getViewModel()) == null) {
            return;
        }
        viewModel.fetchWidgetWithParams(asyncData, item.getAsyncParams());
    }

    private final HotTicketsWidgetViewModel getViewModel() {
        return (HotTicketsWidgetViewModel) getWidgetViewModel();
    }

    private final void removeWidget() {
        HotTicketsVO boundData = getBoundData();
        if (boundData != null) {
            this.references.getController().m(boundData.getId());
        }
    }

    private final void startAutoSwipe() {
        B0 b02 = this.autoSwipeJob;
        if (b02 != null) {
            b02.j(null);
        }
        RecyclerView.o layoutManager = this.binding.hotTicketsFlightsRV.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        this.currentItemPosition = findFirstCompletelyVisibleItemPosition;
        if (findFirstCompletelyVisibleItemPosition == -1) {
            return;
        }
        this.autoSwipeJob = C10727i.c(K.a(this), null, null, new HotTicketsWidgetViewHolder$startAutoSwipe$1$1(this, linearLayoutManager, null), 3);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<HotTicketsVO.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.references.getController().update(new HotTicketsUpdateEvent(fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a.f17149a.e(throwable);
        removeWidget();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        HotTicketsWidgetViewModel viewModel = getViewModel();
        if (viewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(viewModel, lifecycle, this, null, 4, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        HotTicketsVO boundData = getBoundData();
        if (boundData != null && (boundData.getState() instanceof HotTicketsVO.LoadedState) && ((HotTicketsVO.LoadedState) boundData.getState()).getTickets().size() > 1) {
            startAutoSwipe();
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        B0 b02 = this.autoSwipeJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.autoSwipeJob = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotTicketsVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.hotTicketsFlightsRV.removeItemDecoration(this.carouselDecorator);
        this.binding.hotTicketsFlightsRV.removeItemDecoration(this.singleDecorator);
        HotTicketsVO.State state = item.getState();
        if (state instanceof HotTicketsVO.LoadedState) {
            bindLoadedState((HotTicketsVO.LoadedState) item.getState());
        } else {
            if (!(state instanceof HotTicketsVO.SkeletonState)) {
                throw new o();
            }
            bindSkeletonStateAndFetch((HotTicketsVO.SkeletonState) item.getState(), item.getAsyncData());
        }
    }
}
