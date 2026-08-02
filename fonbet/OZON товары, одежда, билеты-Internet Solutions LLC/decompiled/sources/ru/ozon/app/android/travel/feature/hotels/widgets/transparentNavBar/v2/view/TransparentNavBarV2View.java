package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.view;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Bl.b;
import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import gk0.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2AnimationManager;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2VO;
import ru.ozon.app.android.travel.utils.placeholder.NestedWidgetsManager;
import ru.ozon.app.android.travel.utils.placeholder.Placeholder;
import ru.ozon.app.android.travel.utils.placeholder.PlaceholderParser;
import ru.ozon.app.android.travel.utils.viewGroup.TouchEventsThiefFrameLayout;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JY\u0010\u0014\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0017\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J1\u0010#\u001a\u00020\u001d*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0014¢\u0006\u0004\b,\u0010-J7\u00104\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001dH\u0014¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u000e¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u000e¢\u0006\u0004\b8\u00107J\u0015\u0010;\u001a\u00020\u000e2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u001f\u0010A\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\bC\u0010+J\r\u0010D\u001a\u00020\u000e¢\u0006\u0004\bD\u00107J\u0015\u0010F\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020.¢\u0006\u0004\bF\u0010GJU\u0010M\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010J2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010L\u001a\u00020.2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020.¢\u0006\u0004\bP\u0010GR`\u0010W\u001aN\u0012\u0004\u0012\u00020\u001d\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060Sj\u0002`T0Rj\f\u0012\b\u0012\u00060Sj\u0002`T`U0Qj&\u0012\u0004\u0012\u00020\u001d\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060Sj\u0002`T0Rj\f\u0012\b\u0012\u00060Sj\u0002`T`U`V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010hR\u0014\u0010j\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010hR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR \u0010}\u001a\u000e\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020|0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010hR!\u0010\u0085\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b>\u0010\u0086\u0001R\u0019\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008a\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/view/TransparentNavBarV2View;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO$Button;", "buttons", "", "Landroid/view/View;", "viewSide", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lkotlin/Function2;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "onFavoriteButtonBind", "bindButtons", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "button", "bindIconButton", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "viewsSide", "bindFavoriteButton", "(Ljava/util/List;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lkotlin/jvm/functions/Function2;)V", "", "widthMeasureSpec", "heightMeasureSpec", "measureChild", "(II)I", "availableWidth", "measure", "(Ljava/util/List;III)I", "Landroid/view/ViewGroup$LayoutParams;", "provideButtonLp", "()Landroid/view/ViewGroup$LayoutParams;", "Landroidx/lifecycle/J;", "lifecycleOwner", "subscribeToFavoriteFeature", "(Landroidx/lifecycle/J;)V", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "disableRoundedCorners", "()V", "enableRoundedCorners", "Ll10/i;", "container", "setupNestedWidgetManager", "(Ll10/i;)V", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "favoritesForAuthorizedFeatureActivator", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "favoriteUnauthorizedClickDelegate", "setUpDependencies", "(Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;)V", "onWidgetCreated", "onWidgetDestroyed", "isPlaceholderVisible", "updateNavbar", "(Z)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO;", "item", "Lru/ozon/composer/ui/widget/l;", "viewItem", "previousIsPlaceholderVisible", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO;Lru/ozon/composer/ui/widget/l;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function2;)V", "isFavorite", "updateFavInfo", "Ljava/util/HashMap;", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lkotlin/collections/HashMap;", "currentViewHolders", "Ljava/util/HashMap;", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "placeholderParser", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "currentPlaceholder", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "nestedWidgetsManager", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "Landroid/widget/FrameLayout;", HammersV3BodyDTO.PLACEHOLDER, "Landroid/widget/FrameLayout;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "dp8", "I", "dp12", "dp16", "", "dp24", "F", "", "cornerRadii", "[F", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "leftViews", "Ljava/util/List;", "rightViews", "Lru/ozon/app/android/travel/utils/viewGroup/TouchEventsThiefFrameLayout;", "cachedFavoriteButtonWrapper", "Lru/ozon/app/android/travel/utils/viewGroup/TouchEventsThiefFrameLayout;", "", "", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonPool", "Ljava/util/Map;", "maxHeight", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2AnimationManager;", "animationManager$delegate", "LSc/j;", "getAnimationManager", "()Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2AnimationManager;", "animationManager", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "isThiefActivated", "Z", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransparentNavBarV2View extends ViewGroup {
    private Function1<? super AtomAction, Unit> actionHandler;

    /* renamed from: animationManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animationManager;
    private TouchEventsThiefFrameLayout cachedFavoriteButtonWrapper;

    @NotNull
    private final float[] cornerRadii;

    @NotNull
    private Placeholder currentPlaceholder;

    @NotNull
    private final HashMap<Integer, k<c>> currentViewHolders;
    private final int dp12;
    private final int dp16;
    private final float dp24;
    private final int dp8;
    private HotelFavoriteUnauthorizedClickDelegate favoriteUnauthorizedClickDelegate;
    private HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator;

    @NotNull
    private final GradientDrawable gradientDrawable;

    @NotNull
    private final Map<String, IconButtonV3View> iconButtonPool;
    private boolean isThiefActivated;

    @NotNull
    private final List<View> leftViews;
    private int maxHeight;
    private NestedWidgetsManager nestedWidgetsManager;

    @NotNull
    private final FrameLayout placeholder;

    @NotNull
    private final PlaceholderParser placeholderParser;

    @NotNull
    private final List<View> rightViews;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransparentNavBarV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentViewHolders = new HashMap<>();
        this.placeholderParser = new PlaceholderParser("content");
        this.currentPlaceholder = Placeholder.INSTANCE.getEMPTY();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.placeholder = frameLayout;
        int px = UiExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = UiExtKt.toPx(12, context);
        this.dp12 = px2;
        this.dp16 = UiExtKt.toPx(16, context);
        float pxF = ResourceExtKt.toPxF(24, context);
        this.dp24 = pxF;
        this.cornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, pxF, pxF, pxF, pxF};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        this.gradientDrawable = gradientDrawable;
        this.leftViews = new ArrayList();
        this.rightViews = new ArrayList();
        this.iconButtonPool = new LinkedHashMap();
        this.animationManager = LazyUtilsKt.unsafeLazy(TransparentNavBarV2View$animationManager$2.INSTANCE);
        setPadding(px2, 0, px2, px);
        setBackground(gradientDrawable);
    }

    private final void bindButtons(List<? extends TransparentNavBarV2VO.Button> buttons, List<View> viewSide, Function1<? super AtomAction, Unit> onAction, Function2<? super ProductFavoriteMoleculeV4ButtonView, ? super FavoriteProductModel, Unit> onFavoriteButtonBind) {
        for (TransparentNavBarV2VO.Button button : buttons) {
            if (button instanceof TransparentNavBarV2VO.FavoriteButton) {
                bindFavoriteButton(viewSide, ((TransparentNavBarV2VO.FavoriteButton) button).getButton(), onFavoriteButtonBind);
            } else {
                if (!(button instanceof TransparentNavBarV2VO.IconButton)) {
                    throw new o();
                }
                bindIconButton(viewSide, ((TransparentNavBarV2VO.IconButton) button).getButton(), onAction);
            }
        }
    }

    private final void bindFavoriteButton(List<View> viewsSide, FavoriteProductModel button, Function2<? super ProductFavoriteMoleculeV4ButtonView, ? super FavoriteProductModel, Unit> onFavoriteButtonBind) {
        getAnimationManager().updateFavoriteInfo(button.getIsFavorite());
        TouchEventsThiefFrameLayout touchEventsThiefFrameLayout = this.cachedFavoriteButtonWrapper;
        if (touchEventsThiefFrameLayout == null) {
            ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView = (ProductFavoriteMoleculeV4ButtonView) b.a(ProductFavoriteMoleculeV4ButtonView.class, "type", q.f64554a, null);
            if (productFavoriteMoleculeV4ButtonView == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                productFavoriteMoleculeV4ButtonView = new ProductFavoriteMoleculeV4ButtonView(context, null, 0, 6, null);
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            TouchEventsThiefFrameLayout touchEventsThiefFrameLayout2 = new TouchEventsThiefFrameLayout(context2, null, 0, 0, 14, null);
            touchEventsThiefFrameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            touchEventsThiefFrameLayout2.addView(productFavoriteMoleculeV4ButtonView, provideButtonLp());
            touchEventsThiefFrameLayout = touchEventsThiefFrameLayout2;
        }
        View childAt = touchEventsThiefFrameLayout.getChildAt(0);
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView2 = childAt instanceof ProductFavoriteMoleculeV4ButtonView ? (ProductFavoriteMoleculeV4ButtonView) childAt : null;
        if (productFavoriteMoleculeV4ButtonView2 == null) {
            return;
        }
        touchEventsThiefFrameLayout.setThiefActivated(this.isThiefActivated);
        touchEventsThiefFrameLayout.setTouchEventOneTimePassEnabled(button.getIsFavorite());
        touchEventsThiefFrameLayout.setOnClickListener(this.favoriteUnauthorizedClickDelegate);
        onFavoriteButtonBind.invoke(productFavoriteMoleculeV4ButtonView2, button);
        viewsSide.add(touchEventsThiefFrameLayout);
        this.cachedFavoriteButtonWrapper = null;
        addViewInLayout(touchEventsThiefFrameLayout, -1, provideButtonLp(), false);
    }

    private final void bindIconButton(List<View> viewSide, IconButtonV3DTO button, Function1<? super AtomAction, Unit> onAction) {
        IconButtonV3View remove = this.iconButtonPool.remove(button.getIcon());
        if (remove == null && (remove = (IconButtonV3View) b.a(IconButtonV3View.class, "type", q.f64554a, null)) == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            remove = new IconButtonV3View(context, null, 0, 0, 14, null);
        }
        remove.setContentDescription(button.getIcon());
        IconButtonV3HolderKt.bind(remove, button, onAction);
        viewSide.add(remove);
        int i11 = this.dp16;
        remove.setPadding(i11, i11, i11, i11);
        addViewInLayout(remove, -1, provideButtonLp(), false);
    }

    private final TransparentNavBarV2AnimationManager getAnimationManager() {
        return (TransparentNavBarV2AnimationManager) this.animationManager.getValue();
    }

    private final int measure(List<View> list, int i11, int i12, int i13) {
        int i14 = 0;
        for (View view : list) {
            measureChild(view, i11, i12);
            if (view.getMeasuredWidth() + this.dp12 + i14 > i13) {
                ViewExtKt.gone(view);
            } else {
                ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(view);
                i14 = view.getMeasuredWidth() + this.dp12 + i14;
            }
            this.maxHeight = Math.max(this.maxHeight, view.getMeasuredHeight());
        }
        return i14;
    }

    private final int measureChild(int widthMeasureSpec, int heightMeasureSpec) {
        this.maxHeight = 0;
        int size = (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingRight()) - getPaddingLeft();
        int i11 = size / 2;
        this.placeholder.measure(View.MeasureSpec.makeMeasureSpec((size - measure(this.leftViews, widthMeasureSpec, heightMeasureSpec, i11)) - measure(this.rightViews, widthMeasureSpec, heightMeasureSpec, i11), 1073741824), heightMeasureSpec);
        int max = Math.max(this.maxHeight, this.placeholder.getMeasuredHeight());
        this.maxHeight = max;
        return max;
    }

    private final ViewGroup.LayoutParams provideButtonLp() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    private final void subscribeToFavoriteFeature(J lifecycleOwner) {
        InterfaceC2395h<Boolean> isFeatureActivatedFlow;
        HotelFavoritesForAuthorizedFeatureActivator hotelFavoritesForAuthorizedFeatureActivator = this.favoritesForAuthorizedFeatureActivator;
        if (hotelFavoritesForAuthorizedFeatureActivator == null || (isFeatureActivatedFlow = hotelFavoritesForAuthorizedFeatureActivator.isFeatureActivatedFlow()) == null) {
            return;
        }
        C2399j.C(new C(new C2408n0(C5427n.a(isFeatureActivatedFlow, lifecycleOwner.getLifecycle(), AbstractC5434v.b.STARTED), new TransparentNavBarV2View$subscribeToFavoriteFeature$1(this, null)), new TransparentNavBarV2View$subscribeToFavoriteFeature$2(null)), K.a(lifecycleOwner));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bind(@NotNull TransparentNavBarV2VO item, l viewItem, @NotNull Function1<? super AtomAction, Unit> onAction, boolean previousIsPlaceholderVisible, @NotNull Function2<? super ProductFavoriteMoleculeV4ButtonView, ? super FavoriteProductModel, Unit> onFavoriteButtonBind) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onFavoriteButtonBind, "onFavoriteButtonBind");
        this.actionHandler = onAction;
        TransparentNavBarV2AnimationManager animationManager = getAnimationManager();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        animationManager.bindColors(context, item.getButtonIconColors(), item.getButtonShapeColors());
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                break;
            }
            View view = (View) c5314e0.next();
            if (view instanceof IconButtonV3View) {
                this.iconButtonPool.put(((IconButtonV3View) view).getContentDescription().toString(), view);
            } else if (view instanceof TouchEventsThiefFrameLayout) {
                this.cachedFavoriteButtonWrapper = (TouchEventsThiefFrameLayout) view;
            }
        }
        removeAllViews();
        this.rightViews.clear();
        this.leftViews.clear();
        FrameLayout frameLayout = this.placeholder;
        addViewInLayout(frameLayout, -1, frameLayout.getLayoutParams(), false);
        Placeholder parsePlaceholders = this.placeholderParser.parsePlaceholders(viewItem, this.currentPlaceholder);
        this.currentPlaceholder = parsePlaceholders;
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        if (nestedWidgetsManager != null) {
            nestedWidgetsManager.addNestedWidgets(parsePlaceholders, this.currentViewHolders);
        }
        bindButtons(item.getLeftButtons(), this.leftViews, onAction, onFavoriteButtonBind);
        bindButtons(item.getRightButtons(), this.rightViews, onAction, onFavoriteButtonBind);
        if (!item.getIsDynamicAlpha() || item.getScrollAnchorId() == null || previousIsPlaceholderVisible) {
            getAnimationManager().setOpaqueButtonsMode(C5316f0.b(this));
            this.gradientDrawable.setAlpha(255);
            this.placeholder.setVisibility(0);
        } else {
            getAnimationManager().setTransparentButtonsMode(C5316f0.b(this));
            this.gradientDrawable.setAlpha(0);
            this.placeholder.setVisibility(8);
        }
        requestLayout();
    }

    public final void disableRoundedCorners() {
        this.gradientDrawable.setCornerRadius(0.0f);
    }

    public final void enableRoundedCorners() {
        this.gradientDrawable.setCornerRadii(this.cornerRadii);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int paddingTop = getPaddingTop() + (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
        for (View view : this.leftViews) {
            LayoutExtKt.layoutLeftTop(view, paddingLeft, paddingTop - (view.getMeasuredHeight() / 2));
            paddingLeft += view.getMeasuredWidth() + this.dp12;
        }
        for (View view2 : this.rightViews) {
            LayoutExtKt.layoutRightTop(view2, measuredWidth, paddingTop - (view2.getMeasuredHeight() / 2));
            measuredWidth -= view2.getMeasuredWidth() + this.dp12;
        }
        FrameLayout frameLayout = this.placeholder;
        frameLayout.layout(paddingLeft, paddingTop - (frameLayout.getMeasuredHeight() / 2), measuredWidth, this.placeholder.getMeasuredHeight() + (paddingTop - (this.placeholder.getMeasuredHeight() / 2)));
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + getPaddingBottom() + measureChild(widthMeasureSpec, heightMeasureSpec), 1073741824));
    }

    public final void onWidgetCreated(@NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        if (nestedWidgetsManager != null) {
            nestedWidgetsManager.setContainer(this.placeholder);
        }
        subscribeToFavoriteFeature(lifecycleOwner);
    }

    public final void onWidgetDestroyed() {
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        if (nestedWidgetsManager != null) {
            nestedWidgetsManager.detachNestedViewHolders(this.currentViewHolders);
        }
        this.nestedWidgetsManager = null;
        getAnimationManager().cancelAnimation();
    }

    public final void setUpDependencies(@NotNull HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator, HotelFavoriteUnauthorizedClickDelegate favoriteUnauthorizedClickDelegate) {
        Intrinsics.checkNotNullParameter(favoritesForAuthorizedFeatureActivator, "favoritesForAuthorizedFeatureActivator");
        this.favoritesForAuthorizedFeatureActivator = favoritesForAuthorizedFeatureActivator;
        this.favoriteUnauthorizedClickDelegate = favoriteUnauthorizedClickDelegate;
    }

    public final void setupNestedWidgetManager(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.nestedWidgetsManager = new NestedWidgetsManager(container, container.d0(), container.c0());
    }

    public final void updateFavInfo(boolean isFavorite) {
        getAnimationManager().updateFavoriteInfo(isFavorite);
    }

    public final void updateNavbar(boolean isPlaceholderVisible) {
        if (isPlaceholderVisible) {
            getAnimationManager().setOpaqueMode(C5316f0.b(this), this.placeholder, this.gradientDrawable);
        } else {
            getAnimationManager().setTransparentMode(C5316f0.b(this), this.placeholder, this.gradientDrawable);
        }
    }
}
