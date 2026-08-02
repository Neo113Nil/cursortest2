package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.view;

import Am.C2438a;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
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
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.pager.HotelsGalleryFullV2PagerAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.preview.HotelsGalleryFullV2PreviewAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.preview.HotelsGalleryFullV2PreviewItemDecoration;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001PB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u0010\u001a\u00020\t*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0012\u0010\rJ)\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J)\u0010)\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010:R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010KR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/view/HotelsGalleryFullV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "updateTitleBar", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "addViews", "()V", "setupConstraints", "Landroidx/constraintlayout/widget/d;", "setupCommonConstraints", "(Landroidx/constraintlayout/widget/d;)V", "onDetachedFromWindow", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/pager/HotelsGalleryFullV2PagerAdapter;", "adapter", "Landroidx/viewpager2/widget/ViewPager2$g;", "callback", "setupViewPager", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/pager/HotelsGalleryFullV2PagerAdapter;Landroidx/viewpager2/widget/ViewPager2$g;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/preview/HotelsGalleryFullV2PreviewAdapter;", "setupPreviewAdapter", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/preview/HotelsGalleryFullV2PreviewAdapter;)V", "", "position", "", "isSmoothScroll", "setSelectedFullItem", "(IZ)V", "setSelectedPreviewItem", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "ds", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "syncPositionCallback", "Landroidx/viewpager2/widget/ViewPager2$g;", "Landroidx/viewpager2/widget/ViewPager2;", "fullViewVp", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/recyclerview/widget/RecyclerView;", "previewRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "tagTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getTagTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "tagTav", "pageCounterTav$delegate", "getPageCounterTav", "pageCounterTav", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "backButton$delegate", "getBackButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "backButton", "Landroidx/constraintlayout/widget/Guideline;", "guideline", "Landroidx/constraintlayout/widget/Guideline;", "Landroidx/constraintlayout/widget/Barrier;", "barrier", "Landroidx/constraintlayout/widget/Barrier;", "constraintSetWithTitle", "Landroidx/constraintlayout/widget/d;", "constraintSetWithoutTitle", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/view/HotelsGalleryFullV2View$TitleState;", "currentConstraintState", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/view/HotelsGalleryFullV2View$TitleState;", "TitleState", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullV2View extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsGalleryFullV2View.class, "tagTav", "getTagTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsGalleryFullV2View.class, "pageCounterTav", "getPageCounterTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsGalleryFullV2View.class, "backButton", "getBackButton()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0)};
    public static final int $stable = 8;

    /* renamed from: backButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate backButton;

    @NotNull
    private final Barrier barrier;

    @NotNull
    private final d constraintSetWithTitle;

    @NotNull
    private final d constraintSetWithoutTitle;

    @NotNull
    private TitleState currentConstraintState;

    @NotNull
    private final DesignSystemDimensProvider ds;

    @NotNull
    private final ViewPager2 fullViewVp;

    @NotNull
    private final Guideline guideline;

    /* renamed from: pageCounterTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate pageCounterTav;

    @NotNull
    private final RecyclerView previewRv;
    private ViewPager2.g syncPositionCallback;

    /* renamed from: tagTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate tagTav;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/view/HotelsGalleryFullV2View$TitleState;", "", "<init>", "(Ljava/lang/String;I)V", "UNDEFINED", "WITH_TITLE", "WITHOUT_TITLE", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class TitleState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TitleState[] $VALUES;
        public static final TitleState UNDEFINED = new TitleState("UNDEFINED", 0);
        public static final TitleState WITH_TITLE = new TitleState("WITH_TITLE", 1);
        public static final TitleState WITHOUT_TITLE = new TitleState("WITHOUT_TITLE", 2);

        private static final /* synthetic */ TitleState[] $values() {
            return new TitleState[]{UNDEFINED, WITH_TITLE, WITHOUT_TITLE};
        }

        static {
            TitleState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TitleState(String str, int i11) {
        }

        public static TitleState valueOf(String str) {
            return (TitleState) Enum.valueOf(TitleState.class, str);
        }

        public static TitleState[] values() {
            return (TitleState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFullV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider designSystemDimensProvider = new DesignSystemDimensProvider(context, null, 2, null);
        this.ds = designSystemDimensProvider;
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
        recyclerView.addItemDecoration(new HotelsGalleryFullV2PreviewItemDecoration(designSystemDimensProvider.getMargin8()));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setPadding(designSystemDimensProvider.getMargin16(), designSystemDimensProvider.getMargin8(), designSystemDimensProvider.getMargin16(), designSystemDimensProvider.getMargin8());
        this.previewRv = recyclerView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.tagTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new HotelsGalleryFullV2View$special$$inlined$preCreationViewPool$default$1(this), new HotelsGalleryFullV2View$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.pageCounterTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new HotelsGalleryFullV2View$special$$inlined$preCreationViewPool$default$3(this), new HotelsGalleryFullV2View$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.backButton = new PreCreationViewPoolDelegate(context4, N.b(IconButtonV3View.class), new HotelsGalleryFullV2View$special$$inlined$preCreationViewPool$default$5(this), new HotelsGalleryFullV2View$special$$inlined$preCreationViewPool$default$6());
        Guideline guideline = new Guideline(context);
        guideline.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41620a = designSystemDimensProvider.getMargin4();
        bVar2.f41615V = 0;
        guideline.setLayoutParams(bVar2);
        this.guideline = guideline;
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        barrier.setReferencedIds(new int[]{getBackButton().getId(), getPageCounterTav().getId()});
        barrier.f(3);
        this.barrier = barrier;
        this.constraintSetWithTitle = new d();
        this.constraintSetWithoutTitle = new d();
        this.currentConstraintState = TitleState.UNDEFINED;
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(this.fullViewVp);
        addView(this.previewRv);
        addView(getTagTav());
        addView(getPageCounterTav());
        addView(getBackButton());
        addView(this.guideline);
        addView(this.barrier);
    }

    private final IconButtonV3View getBackButton() {
        return (IconButtonV3View) this.backButton.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getPageCounterTav() {
        return (TextAtomV2View) this.pageCounterTav.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomV2View getTagTav() {
        return (TextAtomV2View) this.tagTav.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupCommonConstraints(d dVar) {
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.fullViewVp, this.barrier, this.ds.getMargin24());
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.fullViewVp);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.fullViewVp);
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, this.fullViewVp, this.previewRv, this.ds.getMargin24());
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.previewRv);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.previewRv);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, this.previewRv);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getTagTav());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getTagTav());
        ConstraintLayoutExtensionsKt.topToTop(dVar, getTagTav(), this.guideline, this.ds.getMargin2());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getPageCounterTav());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getPageCounterTav());
        ConstraintLayoutExtensionsKt.topToTop(dVar, getBackButton(), this.guideline);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getBackButton(), this.ds.getMargin4());
    }

    private final void setupConstraints() {
        this.constraintSetWithTitle.p(this);
        d dVar = this.constraintSetWithTitle;
        setupCommonConstraints(dVar);
        dVar.o(getPageCounterTav().getId(), 3);
        dVar.o(getPageCounterTav().getId(), 4);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getPageCounterTav(), getTagTav());
        this.constraintSetWithoutTitle.p(this);
        d dVar2 = this.constraintSetWithoutTitle;
        setupCommonConstraints(dVar2);
        dVar2.o(getPageCounterTav().getId(), 3);
        ConstraintLayoutExtensionsKt.topToTop(dVar2, getPageCounterTav(), this.guideline);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar2, getPageCounterTav(), getBackButton());
    }

    private final void updateTitleBar(TextDTO title, TextDTO subtitle) {
        boolean z11 = title != null;
        TitleState titleState = z11 ? TitleState.WITH_TITLE : TitleState.WITHOUT_TITLE;
        if (this.currentConstraintState != titleState) {
            (z11 ? this.constraintSetWithTitle : this.constraintSetWithoutTitle).f(this);
            this.currentConstraintState = titleState;
        }
        TextHolderKt.bindOrGone$default(getPageCounterTav(), subtitle, null, 2, null);
        TextHolderKt.bindOrGone$default(getTagTav(), title, null, 2, null);
    }

    public final void bind(@NotNull HotelsGalleryFullV2VI item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        IconButtonV3HolderKt.bind(getBackButton(), item.getBackButton(), onAction);
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

    public final void setSelectedPreviewItem(int position, TextDTO title, TextDTO subtitle) {
        RecyclerView.g adapter = this.previewRv.getAdapter();
        HotelsGalleryFullV2PreviewAdapter hotelsGalleryFullV2PreviewAdapter = adapter instanceof HotelsGalleryFullV2PreviewAdapter ? (HotelsGalleryFullV2PreviewAdapter) adapter : null;
        if (hotelsGalleryFullV2PreviewAdapter == null) {
            return;
        }
        int selectedItem = hotelsGalleryFullV2PreviewAdapter.getSelectedItem();
        hotelsGalleryFullV2PreviewAdapter.setSelectedItem(position);
        if (selectedItem != position) {
            if (selectedItem != -1) {
                hotelsGalleryFullV2PreviewAdapter.notifyItemChanged(selectedItem, "payload_selection_changed");
            }
            hotelsGalleryFullV2PreviewAdapter.notifyItemChanged(position, "payload_selection_changed");
            this.previewRv.scrollToPosition(position);
        }
        updateTitleBar(title, subtitle);
    }

    public final void setupPreviewAdapter(@NotNull HotelsGalleryFullV2PreviewAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.previewRv.setAdapter(adapter);
    }

    public final void setupViewPager(@NotNull HotelsGalleryFullV2PagerAdapter adapter, @NotNull ViewPager2.g callback) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.fullViewVp.s(adapter);
        this.syncPositionCallback = callback;
        this.fullViewVp.p(callback);
    }
}
