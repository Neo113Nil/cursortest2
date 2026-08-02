package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation;

import GS.a;
import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.G;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.UtilsKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0019\u0018\u0000 52\u00020\u0001:\u00015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u000e\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isVertical", "", "width", "height", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "tileType", "", "setFreshTileLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;ZLjava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "tileModel", "Lkotlin/Function0;", "onClick", "bind", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;Lkotlin/jvm/functions/Function0;)V", "", "defaultAutomatizationId", "Ljava/lang/String;", "ru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileView$rvItemClickInterceptor$1", "rvItemClickInterceptor", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileView$rvItemClickInterceptor$1;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;", "productMediaView", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;", "getProductMediaView", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;", "Landroidx/recyclerview/widget/RecyclerView;", "indicatorListView", "Landroidx/recyclerview/widget/RecyclerView;", "atomListContainer", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView;", "actionBarView", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView;", "getActionBarView", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/IndicatorListAdapter;", "indicatorListAdapter$delegate", "LSc/j;", "getIndicatorListAdapter", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/IndicatorListAdapter;", "indicatorListAdapter", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter;", "atomListAdapter$delegate", "getAtomListAdapter", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter;", "atomListAdapter", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTileView extends ConstraintLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int atomListHorizontalPaddingBig;
    private static final int atomListHorizontalPaddingSmall;
    private static final int indicatorListHorizontalPaddingMediumMax;
    private static final int indicatorListHorizontalPaddingMini;
    private static final int indicatorListVerticalPaddingMediumMax;
    private static final int indicatorListVerticalPaddingMini;

    @NotNull
    private final ProductActionBarView actionBarView;

    /* renamed from: atomListAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j atomListAdapter;

    @NotNull
    private final RecyclerView atomListContainer;
    private String defaultAutomatizationId;

    /* renamed from: indicatorListAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j indicatorListAdapter;

    @NotNull
    private final RecyclerView indicatorListView;

    @NotNull
    private final ProductMediaView productMediaView;

    @NotNull
    private final FreshTileView$rvItemClickInterceptor$1 rvItemClickInterceptor;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileView$Companion;", "", "<init>", "()V", "indicatorListVerticalPaddingMini", "", "indicatorListHorizontalPaddingMini", "indicatorListVerticalPaddingMediumMax", "indicatorListHorizontalPaddingMediumMax", "atomListHorizontalPaddingSmall", "atomListHorizontalPaddingBig", "createVertical", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileView;", "context", "Landroid/content/Context;", "width", "height", "tileType", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "defaultAutomatizationId", "", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;Ljava/lang/String;)Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileView;", "createHorizontal", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ FreshTileView createHorizontal$default(Companion companion, Context context, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            return companion.createHorizontal(context, str);
        }

        public static /* synthetic */ FreshTileView createVertical$default(Companion companion, Context context, Integer num, Integer num2, FreshTileType freshTileType, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                num = null;
            }
            if ((i11 & 4) != 0) {
                num2 = null;
            }
            if ((i11 & 8) != 0) {
                freshTileType = FreshTileType.MINI;
            }
            if ((i11 & 16) != 0) {
                str = null;
            }
            return companion.createVertical(context, num, num2, freshTileType, str);
        }

        @NotNull
        public final FreshTileView createHorizontal(@NotNull Context context, String defaultAutomatizationId) {
            Intrinsics.checkNotNullParameter(context, "context");
            FreshTileView freshTileView = new FreshTileView(context, null);
            freshTileView.defaultAutomatizationId = defaultAutomatizationId;
            FreshTileView.setFreshTileLayout$default(freshTileView, freshTileView, false, null, null, FreshTileType.MAX, 6, null);
            return freshTileView;
        }

        @NotNull
        public final FreshTileView createVertical(@NotNull Context context, Integer width, Integer height, @NotNull FreshTileType tileType, String defaultAutomatizationId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(tileType, "tileType");
            FreshTileView freshTileView = new FreshTileView(context, null);
            freshTileView.defaultAutomatizationId = defaultAutomatizationId;
            freshTileView.setFreshTileLayout(freshTileView, true, width, height, tileType);
            return freshTileView;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FreshTileType.values().length];
            try {
                iArr[FreshTileType.MINI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FreshTileType.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FreshTileType.MAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Paddings paddings = Paddings.PADDING_350;
        indicatorListVerticalPaddingMini = UiExtKt.toPx(paddings.getPx());
        indicatorListHorizontalPaddingMini = UiExtKt.toPx(paddings.getPx());
        Paddings paddings2 = Paddings.PADDING_450;
        indicatorListVerticalPaddingMediumMax = UiExtKt.toPx(paddings2.getPx());
        indicatorListHorizontalPaddingMediumMax = UiExtKt.toPx(paddings2.getPx());
        atomListHorizontalPaddingSmall = UiExtKt.toPx(Paddings.PADDING_250.getPx());
        atomListHorizontalPaddingBig = UiExtKt.toPx(Paddings.PADDING_400.getPx());
    }

    public /* synthetic */ FreshTileView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final AtomListAdapter getAtomListAdapter() {
        return (AtomListAdapter) this.atomListAdapter.getValue();
    }

    private final IndicatorListAdapter getIndicatorListAdapter() {
        return (IndicatorListAdapter) this.indicatorListAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFreshTileLayout(ConstraintLayout constraintLayout, boolean z11, Integer num, Integer num2, FreshTileType freshTileType) {
        int i11;
        int i12;
        constraintLayout.setLayoutParams(new ConstraintLayout.b(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -2));
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i13 = iArr[freshTileType.ordinal()];
        if (i13 == 1) {
            i11 = indicatorListVerticalPaddingMini;
        } else {
            if (i13 != 2 && i13 != 3) {
                throw new o();
            }
            i11 = indicatorListVerticalPaddingMediumMax;
        }
        int i14 = iArr[freshTileType.ordinal()];
        if (i14 == 1) {
            i12 = indicatorListHorizontalPaddingMini;
        } else {
            if (i14 != 2 && i14 != 3) {
                throw new o();
            }
            i12 = indicatorListHorizontalPaddingMediumMax;
        }
        this.indicatorListView.setPadding(i12, i11, i12, i11);
        ProductMediaView productMediaView = this.productMediaView;
        ViewGroup.LayoutParams layoutParams = productMediaView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        if (z11) {
            bVar.f41640k = this.atomListContainer.getId();
            bVar.f41658v = 0;
            bVar.f41604K = 2;
            bVar.f41599F = 0.0f;
        } else {
            bVar.f41642l = 0;
            bVar.f41657u = this.atomListContainer.getId();
            bVar.f41603J = 2;
            bVar.f41601H = 1.0f;
        }
        productMediaView.setLayoutParams(bVar);
        RecyclerView recyclerView = this.atomListContainer;
        ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        if (z11) {
            bVar2.f41638j = this.productMediaView.getId();
            bVar2.f41656t = 0;
        } else {
            bVar2.f41636i = 0;
            bVar2.f41655s = this.productMediaView.getId();
            bVar2.f41601H = 1.0f;
        }
        recyclerView.setLayoutParams(bVar2);
        int i15 = z11 ? atomListHorizontalPaddingSmall : atomListHorizontalPaddingBig;
        this.atomListContainer.setPadding(i15, 0, i15, 0);
    }

    static /* synthetic */ void setFreshTileLayout$default(FreshTileView freshTileView, ConstraintLayout constraintLayout, boolean z11, Integer num, Integer num2, FreshTileType freshTileType, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            num2 = null;
        }
        if ((i11 & 8) != 0) {
            freshTileType = FreshTileType.MINI;
        }
        freshTileView.setFreshTileLayout(constraintLayout, z11, num, num2, freshTileType);
    }

    public final void bind(@NotNull final FreshTileModel tileModel, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(tileModel, "tileModel");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.productMediaView.bind(tileModel.getProductMedia());
        getIndicatorListAdapter().submit(tileModel.getBadgeList());
        getAtomListAdapter().submit(tileModel.getAtomList());
        setPadding(tileModel.getPaddings().getLeft(), tileModel.getPaddings().getTop(), tileModel.getPaddings().getRight(), tileModel.getPaddings().getBottom());
        this.rvItemClickInterceptor.setOnClick(onClick);
        setOnClickListener(new a(onClick, 7));
        G.a(this, new Runnable() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileView$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                FreshTileView freshTileView = this;
                String automatizationId = tileModel.getAutomatizationId();
                if (automatizationId == null) {
                    automatizationId = this.defaultAutomatizationId;
                }
                freshTileView.setContentDescription(automatizationId);
            }
        });
    }

    @NotNull
    public final ProductActionBarView getActionBarView() {
        return this.actionBarView;
    }

    @NotNull
    public final ProductMediaView getProductMediaView() {
        return this.productMediaView;
    }

    private FreshTileView(Context context) {
        super(context, null, 0, 0);
        FreshTileView$rvItemClickInterceptor$1 freshTileView$rvItemClickInterceptor$1 = new FreshTileView$rvItemClickInterceptor$1();
        this.rvItemClickInterceptor = freshTileView$rvItemClickInterceptor$1;
        ProductMediaView productMediaView = new ProductMediaView(context, null, 0, 6, null);
        productMediaView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        productMediaView.setLayoutParams(bVar);
        addView(productMediaView);
        this.productMediaView = productMediaView;
        RecyclerView recyclerView = new RecyclerView(context);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41636i = productMediaView.getId();
        bVar2.f41656t = productMediaView.getId();
        bVar2.f41658v = productMediaView.getId();
        recyclerView.setLayoutParams(bVar2);
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addOnItemTouchListener(freshTileView$rvItemClickInterceptor$1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        addView(recyclerView);
        this.indicatorListView = recyclerView;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41658v = 0;
        bVar3.f41642l = 0;
        recyclerView2.setLayoutParams(bVar3);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context);
        linearLayoutManager2.setOrientation(1);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setItemAnimator(null);
        recyclerView2.addOnItemTouchListener(freshTileView$rvItemClickInterceptor$1);
        addView(recyclerView2);
        this.atomListContainer = recyclerView2;
        ProductActionBarView productActionBarView = new ProductActionBarView(context, null, 0, 6, null);
        productActionBarView.setId(View.generateViewId());
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, -2);
        bVar4.f41642l = productMediaView.getId();
        bVar4.f41656t = productMediaView.getId();
        bVar4.f41658v = productMediaView.getId();
        ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = -((int) ProductActionBarView.INSTANCE.getElevationLevel());
        productActionBarView.setLayoutParams(bVar4);
        productActionBarView.setVisibility(8);
        addView(productActionBarView);
        this.actionBarView = productActionBarView;
        this.indicatorListAdapter = UtilsKt.unsafeLazy(new FreshTileView$indicatorListAdapter$2(this));
        this.atomListAdapter = UtilsKt.unsafeLazy(new FreshTileView$atomListAdapter$2(this));
        setBackgroundResource(UniColors.LAYER_FLOOR_1.getResId());
    }
}
