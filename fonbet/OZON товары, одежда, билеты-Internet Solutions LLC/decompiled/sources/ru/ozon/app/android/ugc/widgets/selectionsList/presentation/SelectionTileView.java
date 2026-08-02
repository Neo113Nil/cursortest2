package ru.ozon.app.android.ugc.widgets.selectionsList.presentation;

import B3.D;
import Dy.ViewOnClickListenerC2883a;
import LB.a;
import Sc.InterfaceC4008j;
import Sc.k;
import W10.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.SelectionTileView;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.footer.SelectionFooterAdapter;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.views.PassThroughRecyclerView;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.views.SelectionTileHeaderView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 R2\u00020\u0001:\u0001RB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J%\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0015H\u0002¢\u0006\u0004\b&\u0010'JG\u0010*\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00102\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00105\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010<\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bD\u0010ER\u001b\u0010I\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\bH\u00101R\u001b\u0010L\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010/\u001a\u0004\bK\u00101R\u001d\u0010Q\u001a\u0004\u0018\u00010M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010/\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/SelectionTileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/l;", "viewItem", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindHeader", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;LW10/c;Lru/ozon/composer/ui/widget/l;Lkotlin/jvm/functions/Function1;)V", "bindFooter", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;Lkotlin/jvm/functions/Function1;)V", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent;", "footerItems", "setFooterIcon", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background;", "background", "bindBackground", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background;)V", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;", "common", "bindOrGoneGradient", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;)V", "Landroid/view/View;", "view", "", "colors", "setGradient", "(Landroid/view/View;Ljava/util/List;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "favProductMoleculeDelegate", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;Lkotlin/jvm/functions/Function1;LW10/c;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;)V", "favoriteProductMoleculeDelegate", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "topGradientView$delegate", "LSc/j;", "getTopGradientView", "()Landroid/view/View;", "topGradientView", "bottomGradientView$delegate", "getBottomGradientView", "bottomGradientView", "Lru/ozon/uni/android/atom/image/Image;", "contentImage", "Lru/ozon/uni/android/atom/image/Image;", "backgroundImage$delegate", "getBackgroundImage", "()Lru/ozon/uni/android/atom/image/Image;", "backgroundImage", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/footer/SelectionFooterAdapter;", "footerAdapter$delegate", "getFooterAdapter", "()Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/footer/SelectionFooterAdapter;", "footerAdapter", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/views/PassThroughRecyclerView;", "footerRecycler$delegate", "getFooterRecycler", "()Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/views/PassThroughRecyclerView;", "footerRecycler", "kebabClickZone$delegate", "getKebabClickZone", "kebabClickZone", "topRightClickZone$delegate", "getTopRightClickZone", "topRightClickZone", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/views/SelectionTileHeaderView;", "headerView$delegate", "getHeaderView", "()Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/views/SelectionTileHeaderView;", "headerView", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionTileView extends ConstraintLayout {

    /* renamed from: backgroundImage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundImage;

    /* renamed from: bottomGradientView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomGradientView;

    @NotNull
    private final Image contentImage;
    private FavoriteProductDelegate favoriteProductMoleculeDelegate;

    /* renamed from: footerAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j footerAdapter;

    /* renamed from: footerRecycler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j footerRecycler;

    /* renamed from: headerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j headerView;

    /* renamed from: kebabClickZone$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j kebabClickZone;

    /* renamed from: topGradientView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topGradientView;

    /* renamed from: topRightClickZone$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topRightClickZone;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final float CORNER_RADIUS = Dimens.INSTANCE.getDPF_16();
    private static final int gradientHeight = ResourceExtKt.toPx(70);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/SelectionTileView$Companion;", "", "<init>", "()V", "CORNER_RADIUS", "", "getCORNER_RADIUS", "()F", "gradientHeight", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCORNER_RADIUS() {
            return SelectionTileView.CORNER_RADIUS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionTileView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.topGradientView = LazyUtilsKt.unsafeLazy(new SelectionTileView$topGradientView$2(context, this));
        this.bottomGradientView = LazyUtilsKt.unsafeLazy(new SelectionTileView$bottomGradientView$2(context, this));
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.selectionTileImage);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        image.setLayoutParams(bVar);
        image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        image.setZ(2.0f);
        addView(image);
        this.contentImage = image;
        this.backgroundImage = LazyUtilsKt.unsafeLazy(new SelectionTileView$backgroundImage$2(context, this));
        this.footerAdapter = k.b(SelectionTileView$footerAdapter$2.INSTANCE);
        this.footerRecycler = LazyUtilsKt.unsafeLazy(new SelectionTileView$footerRecycler$2(context, this));
        this.kebabClickZone = LazyUtilsKt.unsafeLazy(new SelectionTileView$kebabClickZone$2(context, this));
        this.topRightClickZone = LazyUtilsKt.unsafeLazy(new SelectionTileView$topRightClickZone$2(context, this));
        this.headerView = LazyUtilsKt.unsafeLazy(new SelectionTileView$headerView$2(this, context));
        GradientDrawable b11 = D.b(0);
        b11.setCornerRadius(CORNER_RADIUS);
        setBackground(b11);
        setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4(SelectionsListVI.SelectionsListItemVI.TileItem tileItem, Function1 function1, View view) {
        AtomAction action;
        SelectionsListVI.SelectionItemCommon selectionItemCommon = tileItem.getSelectionItemCommon();
        if (selectionItemCommon == null || (action = selectionItemCommon.getAction()) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void bindBackground(SelectionsListVI.Background background) {
        if (background instanceof SelectionsListVI.Background.ImageWrapper) {
            ImageHolderKt.bind$default(getBackgroundImage(), ((SelectionsListVI.Background.ImageWrapper) background).getImage(), null, 2, null);
            return;
        }
        if (background instanceof SelectionsListVI.Background.ColorWrapper) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, ((SelectionsListVI.Background.ColorWrapper) background).getColor());
            if (parseColor != null) {
                getBackgroundImage().setBackgroundColor(parseColor.intValue());
            }
        }
    }

    private final void bindFooter(SelectionsListVI.SelectionsListItemVI.TileItem item, Function1<? super AtomAction, Unit> actionHandler) {
        List<SelectionsListVI.TileFooterContent> footerItems = item.getFooterItems();
        List<SelectionsListVI.TileFooterContent> list = footerItems;
        if (list == null || list.isEmpty()) {
            ViewExtKt.gone(getFooterRecycler());
            return;
        }
        ViewExtKt.show(getFooterRecycler());
        getFooterRecycler().setAdapter(getFooterAdapter());
        getFooterAdapter().submit(footerItems);
        setFooterIcon(footerItems, actionHandler);
    }

    private final void bindHeader(final SelectionsListVI.SelectionsListItemVI.TileItem item, c trackingData, l viewItem, Function1<? super AtomAction, Unit> actionHandler) {
        c cVar;
        l lVar;
        final Function1<? super AtomAction, Unit> function1;
        if (item.getHeader() == null || viewItem == null) {
            cVar = trackingData;
            lVar = viewItem;
            function1 = actionHandler;
            SelectionTileHeaderView headerView = getHeaderView();
            if (headerView != null) {
                headerView.hideHeaderContent();
            }
        } else {
            SelectionTileHeaderView headerView2 = getHeaderView();
            if (headerView2 != null) {
                SelectionsListVI.HeaderVO header = item.getHeader();
                SelectionsListVI.SelectionItemCommon selectionItemCommon = item.getSelectionItemCommon();
                cVar = trackingData;
                lVar = viewItem;
                function1 = actionHandler;
                headerView2.bind(header, selectionItemCommon != null ? selectionItemCommon.getTopRightContent() : null, cVar, lVar, function1);
            } else {
                cVar = trackingData;
                lVar = viewItem;
                function1 = actionHandler;
            }
        }
        if (lVar == null) {
            ViewExtKt.gone(getTopRightClickZone());
            return;
        }
        SelectionTileHeaderView headerView3 = getHeaderView();
        if (headerView3 != null) {
            SelectionsListVI.SelectionItemCommon selectionItemCommon2 = item.getSelectionItemCommon();
            headerView3.bindTopContent(selectionItemCommon2 != null ? selectionItemCommon2.getTopRightContent() : null, cVar, lVar);
        }
        View topRightClickZone = getTopRightClickZone();
        topRightClickZone.setOnClickListener(new View.OnClickListener() { // from class: QW.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectionTileView.bindHeader$lambda$9$lambda$8(SelectionsListVI.SelectionsListItemVI.TileItem.this, this, function1, view);
            }
        });
        ViewExtKt.show(topRightClickZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindHeader$lambda$9$lambda$8(SelectionsListVI.SelectionsListItemVI.TileItem tileItem, SelectionTileView selectionTileView, Function1 function1, View view) {
        AtomAction action;
        SelectionsListVI.SelectionItemCommon selectionItemCommon = tileItem.getSelectionItemCommon();
        if ((selectionItemCommon != null ? selectionItemCommon.getTopRightContent() : null) instanceof SelectionsListVI.TopRightContent.FavoriteWrapper) {
            SelectionTileHeaderView headerView = selectionTileView.getHeaderView();
            if (headerView != null) {
                headerView.onFavoriteClick();
                return;
            }
            return;
        }
        SelectionsListVI.SelectionItemCommon selectionItemCommon2 = tileItem.getSelectionItemCommon();
        if (selectionItemCommon2 == null || (action = selectionItemCommon2.getAction()) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void bindOrGoneGradient(SelectionsListVI.SelectionItemCommon common) {
        List<String> topGradient = common.getTopGradient();
        if (topGradient == null || topGradient.isEmpty()) {
            ViewExtKt.gone(getTopGradientView());
        } else {
            setGradient(getTopGradientView(), common.getTopGradient());
            ViewExtKt.show(getTopGradientView());
        }
        List<String> bottomGradient = common.getBottomGradient();
        if (bottomGradient == null || bottomGradient.isEmpty()) {
            ViewExtKt.gone(getBottomGradientView());
        } else {
            setGradient(getBottomGradientView(), common.getBottomGradient());
            ViewExtKt.show(getBottomGradientView());
        }
    }

    private final Image getBackgroundImage() {
        return (Image) this.backgroundImage.getValue();
    }

    private final View getBottomGradientView() {
        return (View) this.bottomGradientView.getValue();
    }

    private final SelectionFooterAdapter getFooterAdapter() {
        return (SelectionFooterAdapter) this.footerAdapter.getValue();
    }

    private final PassThroughRecyclerView getFooterRecycler() {
        return (PassThroughRecyclerView) this.footerRecycler.getValue();
    }

    private final SelectionTileHeaderView getHeaderView() {
        return (SelectionTileHeaderView) this.headerView.getValue();
    }

    private final View getKebabClickZone() {
        return (View) this.kebabClickZone.getValue();
    }

    private final View getTopGradientView() {
        return (View) this.topGradientView.getValue();
    }

    private final View getTopRightClickZone() {
        return (View) this.topRightClickZone.getValue();
    }

    private final void setFooterIcon(List<? extends SelectionsListVI.TileFooterContent> footerItems, Function1<? super AtomAction, Unit> actionHandler) {
        Object obj;
        Iterator<T> it = footerItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (obj instanceof SelectionsListVI.TileFooterContent.SelectionItemFooter) {
                    break;
                }
            }
        }
        SelectionsListVI.TileFooterContent.SelectionItemFooter selectionItemFooter = (SelectionsListVI.TileFooterContent.SelectionItemFooter) obj;
        if ((selectionItemFooter != null ? selectionItemFooter.getAction() : null) == null || selectionItemFooter.getIcon() == null) {
            ViewExtKt.gone(getKebabClickZone());
            return;
        }
        View kebabClickZone = getKebabClickZone();
        kebabClickZone.setOnClickListener(new a(actionHandler, selectionItemFooter));
        ViewExtKt.show(kebabClickZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFooterIcon$lambda$11$lambda$10(Function1 function1, SelectionsListVI.TileFooterContent.SelectionItemFooter selectionItemFooter, View view) {
        function1.invoke(selectionItemFooter.getAction());
    }

    private final void setGradient(View view, List<String> colors) {
        List<String> list = colors;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (String str : list) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList.add(Integer.valueOf(styleParser.parseColorInt(context, str, -16777216)));
        }
        int[] T02 = C7714v.T0(arrayList);
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(T02);
        }
    }

    public final void bind(@NotNull SelectionsListVI.SelectionsListItemVI.TileItem item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull c trackingData, l viewItem, @NotNull FavoriteProductDelegate favProductMoleculeDelegate) {
        SelectionsListVI.Background background;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegate, "favProductMoleculeDelegate");
        this.favoriteProductMoleculeDelegate = favProductMoleculeDelegate;
        setOnClickListener(new ViewOnClickListenerC2883a(5, item, actionHandler));
        ImageHolderKt.bindOrGone$default(this.contentImage, item.getMediaContent().getImage(), null, 2, null);
        SelectionsListVI.SelectionItemCommon selectionItemCommon = item.getSelectionItemCommon();
        if (selectionItemCommon != null && (background = selectionItemCommon.getBackground()) != null) {
            bindBackground(background);
        }
        SelectionsListVI.SelectionItemCommon selectionItemCommon2 = item.getSelectionItemCommon();
        if (selectionItemCommon2 != null) {
            bindOrGoneGradient(selectionItemCommon2);
        }
        bindHeader(item, trackingData, viewItem, actionHandler);
        bindFooter(item, actionHandler);
    }
}
