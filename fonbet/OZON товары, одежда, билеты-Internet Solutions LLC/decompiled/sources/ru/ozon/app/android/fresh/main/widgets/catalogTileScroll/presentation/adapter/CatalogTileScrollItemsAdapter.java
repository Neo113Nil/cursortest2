package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.adapter;

import Sc.o;
import WZ.l;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.J;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.GenericDiffUtil;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.CatalogTile;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view.CatalogScrollTileView;
import ru.ozon.app.android.fresh.main.widgets.header.presentation.IslandDrawable;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002'(BE\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\t\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileScrollItemsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileItemViewHolder;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function0;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfoProvider", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroidx/lifecycle/J;LWZ/l;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Landroid/view/View;", "createSeparatorView", "(Landroid/content/Context;)Landroid/view/View;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileItemViewHolder;I)V", "getItemViewType", "(I)I", "LWZ/l;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Companion", "TileType", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTileScrollItemsAdapter extends i<CatalogTile, CatalogTileItemViewHolder> {

    @NotNull
    private static final float[] separatorCorners;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final Function0<d> widgetInfoProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int tileHeight = ResourceExtKt.toPx(134);
    private static final int tileWidth = ResourceExtKt.toPx(100);
    private static final int separatorHeight = ResourceExtKt.toPx(24);
    private static final int separatorContainerWidth = ResourceExtKt.toPx(8);
    private static final int separatorWidth = ResourceExtKt.toPx(2);
    private static final float DP_100 = ResourceExtKt.toPxF(100);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileScrollItemsAdapter$Companion;", "", "<init>", "()V", "", "ZERO_PADDING", "F", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileScrollItemsAdapter$TileType;", "", "<init>", "(Ljava/lang/String;I)V", "TILE", "SEPARATOR", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class TileType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TileType[] $VALUES;
        public static final TileType TILE = new TileType("TILE", 0);
        public static final TileType SEPARATOR = new TileType("SEPARATOR", 1);

        private static final /* synthetic */ TileType[] $values() {
            return new TileType[]{TILE, SEPARATOR};
        }

        static {
            TileType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TileType(String str, int i11) {
        }

        @NotNull
        public static a<TileType> getEntries() {
            return $ENTRIES;
        }

        public static TileType valueOf(String str) {
            return (TileType) Enum.valueOf(TileType.class, str);
        }

        public static TileType[] values() {
            return (TileType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TileType.values().length];
            try {
                iArr[TileType.TILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileType.SEPARATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = DP_100;
        }
        separatorCorners = fArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CatalogTileScrollItemsAdapter(@NotNull J containerViewLifecycleOwner, @NotNull l tokenizedAnalytics, @NotNull Function0<d> widgetInfoProvider, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new GenericDiffUtil(), containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(widgetInfoProvider, "widgetInfoProvider");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.widgetInfoProvider = widgetInfoProvider;
        this.actionHandler = actionHandler;
    }

    private final View createSeparatorView(Context context) {
        View view = new View(context);
        view.setId(R$id.separator);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(separatorWidth, separatorHeight);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        view.setBackground(new IslandDrawable(0, androidx.core.content.a.getColor(context, UniColors.GRAPHIC_NEUTRAL.getResId()), separatorCorners, 0.0f, 0.0f, 0.0f, 0.0f));
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        CatalogTile item = getItem(position);
        if (item instanceof CatalogTile.TileItemVO) {
            return TileType.TILE.ordinal();
        }
        if (item instanceof CatalogTile.SeparatorVO) {
            return TileType.SEPARATOR.ordinal();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CatalogTileItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        d invoke = this.widgetInfoProvider.invoke();
        if (invoke != null) {
            int itemViewType = getItemViewType(position);
            if (itemViewType == TileType.TILE.ordinal()) {
                CatalogTileScrollItemViewHolder catalogTileScrollItemViewHolder = (CatalogTileScrollItemViewHolder) holder;
                CatalogTile item = getItem(position);
                Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
                k.bindItem$default(catalogTileScrollItemViewHolder, item, invoke, null, 4, null);
                return;
            }
            if (itemViewType == TileType.SEPARATOR.ordinal()) {
                SeparatorViewHolder separatorViewHolder = (SeparatorViewHolder) holder;
                CatalogTile item2 = getItem(position);
                Intrinsics.checkNotNullExpressionValue(item2, "getItem(...)");
                k.bindItem$default(separatorViewHolder, item2, invoke, null, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CatalogTileItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i11 = WhenMappings.$EnumSwitchMapping$0[((TileType) TileType.getEntries().get(viewType)).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new o();
            }
            FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(separatorContainerWidth, -1));
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            frameLayout.addView(createSeparatorView(context));
            return new SeparatorViewHolder(frameLayout);
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        CatalogScrollTileView catalogScrollTileView = new CatalogScrollTileView(context2, null, 0, 6, null);
        catalogScrollTileView.setId(R$id.tile);
        catalogScrollTileView.setLayoutParams(new ViewGroup.LayoutParams(tileWidth, tileHeight));
        return new CatalogTileScrollItemViewHolder(catalogScrollTileView, this.tokenizedAnalytics, this.actionHandler);
    }
}
