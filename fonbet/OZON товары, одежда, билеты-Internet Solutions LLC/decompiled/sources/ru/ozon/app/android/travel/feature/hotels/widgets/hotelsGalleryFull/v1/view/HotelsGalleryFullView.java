package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view;

import Am.C2438a;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.pager.HotelsGalleryFullPagerAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.preview.HotelsGalleryFullPreviewAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.preview.HotelsGalleryFullPreviewItemDecoration;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ-\u0010\u0014\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\bJ)\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010#\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001a¢\u0006\u0004\b/\u0010\u001cR\u0014\u00100\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00103\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00104\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u0018\u00105\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/view/HotelsGalleryFullView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "setupConstraints", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$ButtonPosition;", "position", "setNavButtonConstraints", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$ButtonPosition;)V", "setPageCounterBottomConstraint", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$NavigationButton;", "navigationButton", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindNavButton", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$NavigationButton;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "bindPageCounter", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "updatePageCounter", "(I)V", "onDetachedFromWindow", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/pager/HotelsGalleryFullPagerAdapter;", "adapter", "Landroidx/viewpager2/widget/ViewPager2$g;", "callback", "setupViewPager", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/pager/HotelsGalleryFullPagerAdapter;Landroidx/viewpager2/widget/ViewPager2$g;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/preview/HotelsGalleryFullPreviewAdapter;", "setupPreviewAdapter", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/preview/HotelsGalleryFullPreviewAdapter;)V", "", "isSmoothScroll", "setSelectedFullItem", "(IZ)V", "setSelectedPreviewItem", "dp4", "I", "dp6", "dp16", "dp24", "syncPositionCallback", "Landroidx/viewpager2/widget/ViewPager2$g;", "Landroidx/viewpager2/widget/ViewPager2;", "fullViewVp", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/recyclerview/widget/RecyclerView;", "previewRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "pageCounterTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getPageCounterTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "pageCounterTav", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "navButton$delegate", "getNavButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "navButton", "Landroidx/constraintlayout/widget/Guideline;", "guideline", "Landroidx/constraintlayout/widget/Guideline;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsGalleryFullView.class, "pageCounterTav", "getPageCounterTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsGalleryFullView.class, "navButton", "getNavButton()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0)};
    public static final int $stable = 8;
    private final int dp16;
    private final int dp24;
    private final int dp4;
    private final int dp6;

    @NotNull
    private final ViewPager2 fullViewVp;

    @NotNull
    private final Guideline guideline;

    /* renamed from: navButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate navButton;

    /* renamed from: pageCounterTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate pageCounterTav;

    @NotNull
    private final RecyclerView previewRv;
    private ViewPager2.g syncPositionCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFullView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        this.dp6 = ResourceExtKt.toPx(6, context);
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        int px3 = ResourceExtKt.toPx(24, context);
        this.dp24 = px3;
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setId(View.generateViewId());
        viewPager2.setLayoutParams(new ConstraintLayout.b(0, 0));
        viewPager2.v(-1);
        this.fullViewVp = viewPager2;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutParams(bVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(new HotelsGalleryFullPreviewItemDecoration(context));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setPadding(px2, px2, px2, px3);
        this.previewRv = recyclerView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.pageCounterTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new HotelsGalleryFullView$special$$inlined$preCreationViewPool$default$1(this), new HotelsGalleryFullView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.navButton = new PreCreationViewPoolDelegate(context3, N.b(IconButtonV3View.class), new HotelsGalleryFullView$special$$inlined$preCreationViewPool$default$3(this), new HotelsGalleryFullView$special$$inlined$preCreationViewPool$default$4());
        Guideline guideline = new Guideline(context);
        guideline.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41620a = px;
        bVar2.f41615V = 0;
        guideline.setLayoutParams(bVar2);
        this.guideline = guideline;
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(this.fullViewVp);
        addView(this.previewRv);
        addView(getPageCounterTav());
        addView(getNavButton());
        addView(this.guideline);
    }

    private final void bindNavButton(HotelsGalleryFullVI.NavigationButton navigationButton, Function1<? super AtomAction, Unit> onAction) {
        HotelsGalleryFullVI.ButtonPosition position;
        IconButtonV3HolderKt.bindOrGone(getNavButton(), navigationButton != null ? navigationButton.getButton() : null, onAction);
        if (navigationButton == null || (position = navigationButton.getPosition()) == null) {
            return;
        }
        setNavButtonConstraints(position);
    }

    private final void bindPageCounter(TextDTO text) {
        setPageCounterBottomConstraint();
        TextHolderKt.bind$default(getPageCounterTav(), text, null, 2, null);
        updatePageCounter(this.fullViewVp.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconButtonV3View getNavButton() {
        return (IconButtonV3View) this.navButton.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getPageCounterTav() {
        return (TextAtomV2View) this.pageCounterTav.getValue(this, $$delegatedProperties[0]);
    }

    private final void setNavButtonConstraints(HotelsGalleryFullVI.ButtonPosition position) {
        ConstraintLayoutExtKt.updateConstraints(this, new HotelsGalleryFullView$setNavButtonConstraints$1(this, position));
    }

    private final void setPageCounterBottomConstraint() {
        ConstraintLayoutExtKt.updateConstraints(this, new HotelsGalleryFullView$setPageCounterBottomConstraint$1(this));
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new HotelsGalleryFullView$setupConstraints$1(this));
    }

    private final void updatePageCounter(int position) {
        RecyclerView.g e11 = this.fullViewVp.e();
        if (e11 != null) {
            getPageCounterTav().setText((position + 1) + "/" + e11.getCardsCount());
        }
    }

    public final void bind(@NotNull HotelsGalleryFullVI item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        bindNavButton(item.getNavigationButton(), onAction);
        bindPageCounter(item.getText());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewPager2.g gVar = this.syncPositionCallback;
        if (gVar != null) {
            this.fullViewVp.A(gVar);
        }
        this.syncPositionCallback = null;
        super.onDetachedFromWindow();
    }

    public final void setSelectedFullItem(int position, boolean isSmoothScroll) {
        this.fullViewVp.t(position, isSmoothScroll);
    }

    public final void setSelectedPreviewItem(int position) {
        RecyclerView.g adapter = this.previewRv.getAdapter();
        HotelsGalleryFullPreviewAdapter hotelsGalleryFullPreviewAdapter = adapter instanceof HotelsGalleryFullPreviewAdapter ? (HotelsGalleryFullPreviewAdapter) adapter : null;
        if (hotelsGalleryFullPreviewAdapter == null) {
            return;
        }
        int selectedItem = hotelsGalleryFullPreviewAdapter.getSelectedItem();
        hotelsGalleryFullPreviewAdapter.setSelectedItem(position);
        if (selectedItem != -1) {
            hotelsGalleryFullPreviewAdapter.notifyItemChanged(selectedItem, "payload_selection_changed");
        }
        hotelsGalleryFullPreviewAdapter.notifyItemChanged(position, "payload_selection_changed");
        this.previewRv.scrollToPosition(position);
        updatePageCounter(position);
    }

    public final void setupPreviewAdapter(@NotNull HotelsGalleryFullPreviewAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.previewRv.setAdapter(adapter);
    }

    public final void setupViewPager(@NotNull HotelsGalleryFullPagerAdapter adapter, @NotNull ViewPager2.g callback) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.fullViewVp.s(adapter);
        this.syncPositionCallback = callback;
        this.fullViewVp.p(callback);
    }
}
