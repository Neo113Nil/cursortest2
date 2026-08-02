package ru.ozon.app.android.search.widgets.expandableCells.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import I0.C3173b;
import I00.a;
import Kk.c;
import T00.j;
import T00.m;
import WZ.t;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j10.InterfaceC7238a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.TileGrid2Mapper;
import ru.ozon.app.android.search.widgets.expandableCells.data.ExpandableCellsDTO;
import ru.ozon.app.android.search.widgets.expandableCells.data.api.GetWarlockSectionRequest;
import ru.ozon.app.android.search.widgets.expandableCells.data.api.GetWarlockSectionResponse;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.ExpandableCellViewHolder;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.SkeletonVO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.storefront.data.tiles.tilescroll.TileScrollDTO;
import ru.ozon.app.android.widgets.buttonWidget.ButtonWidgetDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;
import xe.B0;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 `2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001`BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b&\u0010 J\u0017\u0010'\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010(J)\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0.*\u00020+2\u0006\u0010-\u001a\u00020,2\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100J)\u00103\u001a\b\u0012\u0004\u0012\u00020\b0.*\u00020+2\u0006\u00102\u001a\u0002012\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b3\u00104J+\u00107\u001a\b\u0012\u0004\u0012\u00020\b0.*\u00020+2\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b9\u0010(J\u0017\u0010;\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u0002H\u0002¢\u0006\u0004\b;\u0010(J\u001b\u0010<\u001a\u00020\u0016*\u00020+2\u0006\u0010:\u001a\u00020\u0002H\u0002¢\u0006\u0004\b<\u0010=J\u001b\u0010>\u001a\u00020\u0016*\u00020+2\u0006\u0010:\u001a\u00020\u0002H\u0002¢\u0006\u0004\b>\u0010=J+\u0010C\u001a\u00020\u0016*\u00020+2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\bE\u0010(J\u0017\u0010F\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\bF\u0010(J%\u0010J\u001a\u00020\u00162\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\b0.2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\bL\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010MR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010NR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010OR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010QR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010RR\u001e\u0010S\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR \u0010]\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u00160[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R \u0010_\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u00160[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010^¨\u0006a"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellView;", "containerView", "Ll10/i;", "screenContainer", "Lj10/a;", "Lru/ozon/composer/ui/widget/l;", "composerStore", "LI00/a;", "composerUpdateMapper", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2Mapper;", "tileGrid2Mapper", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/GetWarlockSectionViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellView;Ll10/i;Lj10/a;LI00/a;Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2Mapper;Lru/ozon/app/android/search/widgets/expandableCells/presentation/GetWarlockSectionViewModel;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "observeWarlock", "()V", "Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionResponse;", "response", "savedItem", "showSectionData", "(Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionResponse;Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;)V", "clearWarlockJob", "expandCell", "(Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;)V", "collapseCell", "callWarlockAction", "LT00/a;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO;", "tileGrid2DTO", "", "createTileGrid2Widget", "(LT00/a;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO;Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;)Ljava/util/List;", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO;", "tileScrollDTO", "createTileScrollWidget", "(LT00/a;Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO;Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;)Ljava/util/List;", "Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;", "buttonDTO", "createButtonWidget", "(LT00/a;Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;)Ljava/util/List;", "updateChevron", "vo", "showSkeletonsDelayed", "addTileScrollSkeletons", "(LT00/a;Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;)V", "addTileGrid2Skeletons", "", "dto", "", "stateId", "insertSkeleton", "(LT00/a;Ljava/lang/Object;Ljava/lang/String;Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;)V", "hideSkeletons", "hideWidgets", "widgets", "", "afterId", "insertWidgets", "(Ljava/util/List;J)V", "showNotification", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellView;", "Ll10/i;", "Lj10/a;", "LI00/a;", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2Mapper;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/GetWarlockSectionViewModel;", "widgetInfo", "Ll20/d;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "Lxe/B0;", "job", "Lxe/B0;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "notificationActionHandler", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExpandableCellViewHolder extends k<ExpandableCellVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InterfaceC7238a<l> composerStore;

    @NotNull
    private final a<l> composerUpdateMapper;

    @NotNull
    private final ExpandableCellView containerView;
    private B0 job;

    @NotNull
    private final Handler mHandler;

    @NotNull
    private final Function1<AtomAction, Unit> notificationActionHandler;

    @NotNull
    private final i screenContainer;

    @NotNull
    private final TileGrid2Mapper tileGrid2Mapper;

    @NotNull
    private final GetWarlockSectionViewModel viewModel;
    private d widgetInfo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellViewHolder$Companion;", "", "<init>", "()V", "TILE_GRID_2_SKELETON_STATE_ID", "", "TILE_SCROLL_SKELETON_STATE_ID", "LEFT", "RIGHT", "VERSION_1", "", "DASH", "EXPANDED_ICON", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableCellViewHolder(@NotNull ExpandableCellView containerView, @NotNull i screenContainer, @NotNull InterfaceC7238a<l> composerStore, @NotNull a<l> composerUpdateMapper, @NotNull TileGrid2Mapper tileGrid2Mapper, @NotNull GetWarlockSectionViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(screenContainer, "screenContainer");
        Intrinsics.checkNotNullParameter(composerStore, "composerStore");
        Intrinsics.checkNotNullParameter(composerUpdateMapper, "composerUpdateMapper");
        Intrinsics.checkNotNullParameter(tileGrid2Mapper, "tileGrid2Mapper");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.screenContainer = screenContainer;
        this.composerStore = composerStore;
        this.composerUpdateMapper = composerUpdateMapper;
        this.tileGrid2Mapper = tileGrid2Mapper;
        this.viewModel = viewModel;
        this.mHandler = new Handler(Looper.getMainLooper());
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(screenContainer, this).onClick(new ExpandableCellViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.notificationActionHandler = new ActionHandler.Builder(screenContainer, this).onClick(new ExpandableCellViewHolder$notificationActionHandler$1(this)).buildHandler();
        containerView.setOnAction(buildHandler);
        observeWarlock();
        final AbstractC5434v lifecycle = screenContainer.K().f().getLifecycle();
        if (lifecycle.b() != AbstractC5434v.b.DESTROYED) {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.search.widgets.expandableCells.presentation.ExpandableCellViewHolder$special$$inlined$whenDestroyed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    this.clearWarlockJob();
                    this.mHandler.removeCallbacksAndMessages(null);
                    AbstractC5434v.this.e(this);
                }
            });
        } else {
            clearWarlockJob();
            this.mHandler.removeCallbacksAndMessages(null);
        }
    }

    private final void addTileGrid2Skeletons(T00.a aVar, ExpandableCellVO expandableCellVO) {
        String b11 = C3173b.b(expandableCellVO.getId(), "tile-grid-2-skeleton-");
        long a11 = c.a(b11, "-left");
        ExpandableCellsDTO.TilesType tilesType = ExpandableCellsDTO.TilesType.TILE_GRID_2;
        insertSkeleton(aVar, C7714v.b0(new SkeletonVO(a11, tilesType), new SkeletonVO(c.a(b11, "-right"), tilesType)), b11, expandableCellVO);
    }

    private final void addTileScrollSkeletons(T00.a aVar, ExpandableCellVO expandableCellVO) {
        insertSkeleton(aVar, new SkeletonVO(r0.hashCode(), ExpandableCellsDTO.TilesType.TILE_SCROLL), C3173b.b(expandableCellVO.getId(), "tile-scroll-skeleton-"), expandableCellVO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callWarlockAction(ExpandableCellVO item) {
        item.setState(CellState.LOADING);
        this.viewModel.getWarlockSection("getWarlockSectionAction", new GetWarlockSectionRequest(item.getCell().getCellId(), item.getBaseLink()), item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearWarlockJob() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void collapseCell(ExpandableCellVO item) {
        this.containerView.bindCell(item.getCell().getCell());
        item.setState(CellState.COLLAPSED);
        this.containerView.showTextOrGone(false);
        hideSkeletons(item);
        hideWidgets(item);
    }

    private final List<l> createButtonWidget(T00.a aVar, ButtonWidgetDTO buttonWidgetDTO, ExpandableCellVO expandableCellVO) {
        m c11;
        if (buttonWidgetDTO == null) {
            return K.f71697a;
        }
        expandableCellVO.setButtonWidgetStateId("buttonWidget-" + expandableCellVO.getId());
        String buttonWidgetStateId = expandableCellVO.getButtonWidgetStateId();
        d dVar = this.widgetInfo;
        return this.composerUpdateMapper.a(new j(new m("common", "buttonWidget", buttonWidgetStateId, (dVar == null || (c11 = dVar.c()) == null) ? null : c11.j()), buttonWidgetDTO), aVar);
    }

    private final List<l> createTileGrid2Widget(T00.a aVar, TileGrid2DTO tileGrid2DTO, ExpandableCellVO expandableCellVO) {
        m c11;
        List<Object> map = this.tileGrid2Mapper.map(tileGrid2DTO);
        expandableCellVO.setTileGrid2StateId("products-" + expandableCellVO.getId());
        String tileGrid2StateId = expandableCellVO.getTileGrid2StateId();
        d dVar = this.widgetInfo;
        return this.composerUpdateMapper.a(new j(new m("products", "tileGrid2", tileGrid2StateId, (dVar == null || (c11 = dVar.c()) == null) ? null : c11.j()), map), aVar);
    }

    private final List<l> createTileScrollWidget(T00.a aVar, TileScrollDTO tileScrollDTO, ExpandableCellVO expandableCellVO) {
        m c11;
        expandableCellVO.setTileScrollStateId("tileScroll-" + expandableCellVO.getId());
        String tileScrollStateId = expandableCellVO.getTileScrollStateId();
        d dVar = this.widgetInfo;
        return this.composerUpdateMapper.a(new j(new m("products", "tileScroll", tileScrollStateId, (dVar == null || (c11 = dVar.c()) == null) ? null : c11.j()), tileScrollDTO), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void expandCell(ExpandableCellVO item) {
        updateChevron(item);
        this.containerView.showTextOrGone(true);
        showSkeletonsDelayed(item);
    }

    private final void hideSkeletons(ExpandableCellVO savedItem) {
        String skeletonStateId = savedItem.getSkeletonStateId();
        if (skeletonStateId != null) {
            this.screenContainer.M().p(skeletonStateId);
        }
    }

    private final void hideWidgets(ExpandableCellVO item) {
        String tileGrid2StateId = item.getTileGrid2StateId();
        if (tileGrid2StateId != null) {
            this.screenContainer.M().p(tileGrid2StateId);
        }
        String tileScrollStateId = item.getTileScrollStateId();
        if (tileScrollStateId != null) {
            this.screenContainer.M().p(tileScrollStateId);
        }
        String buttonWidgetStateId = item.getButtonWidgetStateId();
        if (buttonWidgetStateId != null) {
            this.screenContainer.M().p(buttonWidgetStateId);
        }
    }

    private final void insertSkeleton(T00.a aVar, Object obj, String str, ExpandableCellVO expandableCellVO) {
        expandableCellVO.setSkeletonStateId(str);
        insertWidgets(this.composerUpdateMapper.a(new j(new m(1L, "catalog", "expandableCells", str), obj), aVar), expandableCellVO.getId());
    }

    private final void insertWidgets(List<l> widgets, long afterId) {
        a.C2371l.C0009a c0009a = new a.C2371l.C0009a();
        c0009a.a(afterId);
        c0009a.e(widgets);
        this.composerStore.c(c0009a.c());
    }

    private final void observeWarlock() {
        clearWarlockJob();
        this.job = C2399j.C(new C2408n0(C5427n.a(this.viewModel.observeResultFlow(), this.screenContainer.K().f().getLifecycle(), AbstractC5434v.b.STARTED), new ExpandableCellViewHolder$observeWarlock$1(this, null)), androidx.lifecycle.K.a(this.screenContainer.K().f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(final ExpandableCellVO savedItem) {
        NotificationDTO errorNotification = savedItem.getErrorNotification();
        if (errorNotification == null) {
            return;
        }
        ComponentCallbacksC5392m b11 = this.screenContainer.K().b();
        View view = b11 != null ? b11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(errorNotification));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar make = NotificationBar.INSTANCE.make(asNotificationLayoutManager, errorNotification, this.screenContainer.K().f(), this.notificationActionHandler);
        make.addCallback(new NotificationBar.Callback() { // from class: ru.ozon.app.android.search.widgets.expandableCells.presentation.ExpandableCellViewHolder$showNotification$1
            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onDismissed(NotificationBar notificationBar, NotificationBar.DismissReason reason) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                Intrinsics.checkNotNullParameter(reason, "reason");
                if (reason == NotificationBar.DismissReason.TIMEOUT || reason == NotificationBar.DismissReason.SWIPE || reason == NotificationBar.DismissReason.CONSECUTIVE) {
                    ExpandableCellViewHolder.this.collapseCell(savedItem);
                }
                notificationBar.removeCallback(this);
            }

            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onShown(NotificationBar notificationBar) {
                NotificationBar.Callback.DefaultImpls.onShown(this, notificationBar);
            }
        });
        make.dismiss();
        make.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSectionData(GetWarlockSectionResponse response, ExpandableCellVO savedItem) {
        T00.a b11;
        hideSkeletons(savedItem);
        d dVar = this.widgetInfo;
        if (dVar == null || (b11 = dVar.b()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object tiles = response.getTiles();
        if (tiles instanceof TileGrid2DTO) {
            arrayList.addAll(createTileGrid2Widget(b11, (TileGrid2DTO) tiles, savedItem));
        } else if (tiles instanceof TileScrollDTO) {
            arrayList.addAll(createTileScrollWidget(b11, (TileScrollDTO) tiles, savedItem));
        }
        arrayList.addAll(createButtonWidget(b11, response.getButton(), savedItem));
        insertWidgets(arrayList, savedItem.getId());
        savedItem.setState(CellState.EXPANDED);
    }

    private final void showSkeletonsDelayed(final ExpandableCellVO vo) {
        final T00.a b11;
        d dVar = this.widgetInfo;
        if (dVar == null || (b11 = dVar.b()) == null) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: rI.a
            @Override // java.lang.Runnable
            public final void run() {
                ExpandableCellViewHolder.showSkeletonsDelayed$lambda$6(T00.a.this, vo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSkeletonsDelayed$lambda$6(T00.a aVar, ExpandableCellVO expandableCellVO, ExpandableCellViewHolder expandableCellViewHolder) {
        if (expandableCellVO.getCell().getTilesType() == ExpandableCellsDTO.TilesType.TILE_GRID_2) {
            expandableCellViewHolder.addTileGrid2Skeletons(aVar, expandableCellVO);
        } else {
            expandableCellViewHolder.addTileScrollSkeletons(aVar, expandableCellVO);
        }
    }

    private final void updateChevron(ExpandableCellVO item) {
        ExpandableCellView expandableCellView;
        IconDTO iconDTO;
        IconDTO copy;
        CommonAtomIconDTO icon;
        CellDTO cell = item.getCell().getCell();
        CellDTO.RightBlock rightBlock = cell.getRightBlock();
        CellDTO.RightBlock rightBlock2 = null;
        IconDTO icon2 = rightBlock != null ? rightBlock.getIcon() : null;
        CommonAtomIconDTO copy$default = (icon2 == null || (icon = icon2.getIcon()) == null) ? null : CommonAtomIconDTO.copy$default(icon, "ic_m_chevron_up_filled", null, 2, null);
        ExpandableCellView expandableCellView2 = this.containerView;
        CellDTO.RightBlock rightBlock3 = cell.getRightBlock();
        if (rightBlock3 != null) {
            if (icon2 != null) {
                copy = icon2.copy((r34 & 1) != 0 ? icon2.size : null, (r34 & 2) != 0 ? icon2.hasShape : null, (r34 & 4) != 0 ? icon2.shape : null, (r34 & 8) != 0 ? icon2.text : null, (r34 & 16) != 0 ? icon2.icon : copy$default, (r34 & 32) != 0 ? icon2.backgroundImage : null, (r34 & 64) != 0 ? icon2.backgroundColor : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? icon2.textColor : null, (r34 & 256) != 0 ? icon2.textStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? icon2.borderColor : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? icon2.borderWidth : null, (r34 & 2048) != 0 ? icon2.isBorderInside : null, (r34 & 4096) != 0 ? icon2.hasParanja : null, (r34 & 8192) != 0 ? icon2.getContext() : null, (r34 & 16384) != 0 ? icon2.getTestInfo() : null, (r34 & 32768) != 0 ? icon2.getTrackingInfo() : null);
                iconDTO = copy;
                expandableCellView = expandableCellView2;
            } else {
                expandableCellView = expandableCellView2;
                iconDTO = null;
            }
            rightBlock2 = CellDTO.RightBlock.copy$default(rightBlock3, null, null, null, null, null, null, null, iconDTO, null, null, null, null, 3967, null);
        } else {
            expandableCellView = expandableCellView2;
        }
        expandableCellView.bindCell(CellDTO.copy$default(cell, null, null, null, rightBlock2, null, 23, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ExpandableCellVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.widgetInfo = info;
        ExpandableCellView expandableCellView = this.containerView;
        expandableCellView.bindCell(item.getCell().getCell());
        CellState state = item.getState();
        CellState cellState = CellState.EXPANDED;
        if (state == cellState || item.getState() == CellState.LOADING) {
            updateChevron(item);
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = expandableCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        expandableCellView.setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        expandableCellView.bindTextOrGone(item.getCell().getText());
        expandableCellView.showTextOrGone(item.getState() == cellState);
        if (item.getAutoExpand()) {
            item.setAutoExpand(false);
            GetWarlockSectionResponse warlockSectionResponse = item.getWarlockSectionResponse();
            if (warlockSectionResponse != null) {
                updateChevron(item);
                this.containerView.showTextOrGone(true);
                showSectionData(warlockSectionResponse, item);
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ExpandableCellVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t widgetTokenizedEvent = item.getWidgetTokenizedEvent();
        if (widgetTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.screenContainer.X(), widgetTokenizedEvent, null, 2, null);
        }
    }
}
