package ru.ozon.app.android.tabbar.ui;

import Hj.C3143a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.R;
import ru.ozon.app.android.tabbar.NavigationItemListener;
import ru.ozon.app.android.tabbar.R$styleable;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.tabbar.ui.OzonMenuItem;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationConfig;
import ru.ozon.app.android.tabbar.ui.model.TabIconColor;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u000f\u0018\u0000 t2\u00020\u0001:\u0001tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001bJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b!\u0010\u0015J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0013H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b&\u0010'J/\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\n2\u0006\u00101\u001a\u00020\u000fH\u0002¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\b\u0012\u0004\u0012\u00020\u001304H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u0010\u0019R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010 \"\u0004\bC\u00103R$\u0010E\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR8\u0010M\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0006\u0012\u0004\u0018\u00010L\u0012\u0004\u0012\u00020,\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0017\u0010T\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR*\u0010Y\u001a\u00020X2\u0006\u0010?\u001a\u00020X8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R*\u0010`\u001a\u00020_2\u0006\u0010?\u001a\u00020_8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00130f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010AR\u0016\u0010j\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010AR\u001b\u0010m\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010;\u001a\u0004\bl\u0010 R\u001b\u0010p\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010;\u001a\u0004\bo\u0010 R\u001b\u0010s\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010;\u001a\u0004\br\u0010 ¨\u0006u"}, d2 = {"Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/os/Parcelable;", "state", "", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Landroid/view/MenuItem;", "item", "", "getMenuItemPosition", "(Landroid/view/MenuItem;)I", "menuItemId", "Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "getTabView", "(I)Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationConfig;", "config", "initForMenu", "(Lru/ozon/app/android/tabbar/ui/model/BottomNavigationConfig;)V", "onCheckChanged", "()V", "onItemChanged", "(Landroid/view/MenuItem;)V", "clear", "getFakeTabBarHeight", "()I", "findItemView$tabbar_prodGoogleAllVendorsRelease", "findItemView", "tabView", "addTabViewToPool", "(Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;)V", "getOrCreateTabViewFromViewPool", "()Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "Lru/ozon/app/android/tabbar/ui/OzonMenuItem;", "menuItem", "startMargin", "endMargin", "", "hapticEnabled", "Landroid/view/View;", "createTabView", "(Lru/ozon/app/android/tabbar/ui/OzonMenuItem;IIZ)Landroid/view/View;", "mode", "updateLabelVisibility", "(I)V", "", "getTabs", "()Ljava/lang/Iterable;", "configure", "LSc/j;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "islandView", "LSc/j;", "Landroid/widget/LinearLayout;", "tabsContainer", "Landroid/widget/LinearLayout;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "labelVisibilityMode", "I", "getLabelVisibilityMode", "setLabelVisibilityMode", "Lru/ozon/app/android/tabbar/NavigationItemListener;", "navigationItemListener", "Lru/ozon/app/android/tabbar/NavigationItemListener;", "getNavigationItemListener", "()Lru/ozon/app/android/tabbar/NavigationItemListener;", "setNavigationItemListener", "(Lru/ozon/app/android/tabbar/NavigationItemListener;)V", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "onNavigationItemLongClicked", "Lkotlin/jvm/functions/Function2;", "getOnNavigationItemLongClicked", "()Lkotlin/jvm/functions/Function2;", "setOnNavigationItemLongClicked", "(Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationMenu;", "menu", "Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationMenu;", "getMenu", "()Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationMenu;", "Landroid/content/res/ColorStateList;", "itemTextColor", "Landroid/content/res/ColorStateList;", "getItemTextColor", "()Landroid/content/res/ColorStateList;", "setItemTextColor", "(Landroid/content/res/ColorStateList;)V", "Lru/ozon/app/android/tabbar/ui/model/TabIconColor;", "iconTabColor", "Lru/ozon/app/android/tabbar/ui/model/TabIconColor;", "getIconTabColor$tabbar_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/tabbar/ui/model/TabIconColor;", "setIconTabColor$tabbar_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/tabbar/ui/model/TabIconColor;)V", "", "pool", "Ljava/util/List;", "itemTextAppearanceActive", "itemTextAppearanceInactive", "firstItemStartMargin$delegate", "getFirstItemStartMargin", "firstItemStartMargin", "lastItemEndMargin$delegate", "getLastItemEndMargin", "lastItemEndMargin", "spaceBetweenItems$delegate", "getSpaceBetweenItems", "spaceBetweenItems", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonBottomNavigationView extends FrameLayout {

    /* renamed from: firstItemStartMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j firstItemStartMargin;

    @NotNull
    private TabIconColor iconTabColor;

    @NotNull
    private final InterfaceC4008j<IslandSeparatorView> islandView;
    private int itemTextAppearanceActive;
    private int itemTextAppearanceInactive;

    @NotNull
    private ColorStateList itemTextColor;
    private int labelVisibilityMode;

    /* renamed from: lastItemEndMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j lastItemEndMargin;

    @NotNull
    private final OzonBottomNavigationMenu menu;
    private NavigationItemListener navigationItemListener;
    private Function2<? super OzonMenuItem, ? super IndicatorDTO, Boolean> onNavigationItemLongClicked;

    @NotNull
    private final List<BaseOzonBottomTabView> pool;

    /* renamed from: spaceBetweenItems$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j spaceBetweenItems;

    @NotNull
    private final LinearLayout tabsContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzonBottomNavigationView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.islandView = LazyUtilsKt.unsafeLazy(new OzonBottomNavigationView$islandView$1(this));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(ru.ozon.app.android.tabbar.R$id.bottomNavigationTabsContainer);
        BottomNavigationConfig bottomNavigationConfig = BottomNavigationConfig.DEFAULT;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, bottomNavigationConfig.getHeight());
        layoutParams.gravity = 80;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        addView(linearLayout);
        this.tabsContainer = linearLayout;
        this.labelVisibilityMode = 1;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        OzonBottomNavigationMenu ozonBottomNavigationMenu = new OzonBottomNavigationMenu(context2, this);
        this.menu = ozonBottomNavigationMenu;
        ColorStateList valueOf = ColorStateList.valueOf(-16777216);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        this.itemTextColor = valueOf;
        ColorStateList valueOf2 = ColorStateList.valueOf(-16777216);
        Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(...)");
        this.iconTabColor = new TabIconColor(valueOf2);
        this.pool = new ArrayList();
        int i11 = R$style.OzonTextAppearance_Body_300xsmall;
        this.itemTextAppearanceActive = i11;
        this.itemTextAppearanceInactive = i11;
        n nVar = n.NONE;
        this.firstItemStartMargin = k.a(nVar, new OzonBottomNavigationView$firstItemStartMargin$2(this));
        this.lastItemEndMargin = k.a(nVar, new OzonBottomNavigationView$lastItemEndMargin$2(this));
        this.spaceBetweenItems = k.a(nVar, new OzonBottomNavigationView$spaceBetweenItems$2(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.OzonBottomNavigationView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.OzonBottomNavigationView_menu, -1);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R$styleable.OzonBottomNavigationView_itemIconTint);
        if (colorStateList != null) {
            setIconTabColor$tabbar_prodGoogleAllVendorsRelease(new TabIconColor(colorStateList));
        }
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(R$styleable.OzonBottomNavigationView_itemTextColor);
        if (colorStateList2 != null) {
            setItemTextColor(colorStateList2);
        }
        this.itemTextAppearanceActive = obtainStyledAttributes.getResourceId(R$styleable.OzonBottomNavigationView_itemTextAppearanceActive, R.style.TextAppearance_AppCompat_Caption);
        this.itemTextAppearanceInactive = obtainStyledAttributes.getResourceId(R$styleable.OzonBottomNavigationView_itemTextAppearanceInactive, R.style.TextAppearance_AppCompat_Caption);
        if (obtainStyledAttributes.hasValue(R$styleable.OzonBottomNavigationView_elevation)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(R$styleable.OzonBottomNavigationView_elevation, 0));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.OzonBottomNavigationView_topCornerRadius)) {
            final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.OzonBottomNavigationView_topCornerRadius, 0);
            setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView.3
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    int f7 = C3143a.f(view, "view", outline, "outline");
                    int height = view.getHeight();
                    int i12 = dimensionPixelSize;
                    outline.setRoundRect(0, 0, f7, height + i12, i12);
                }
            });
            setClipToOutline(true);
        }
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            new MenuInflater(context).inflate(resourceId, ozonBottomNavigationMenu);
        }
        initForMenu(bottomNavigationConfig);
    }

    private final void addTabViewToPool(BaseOzonBottomTabView tabView) {
        if (this.pool.size() < 6) {
            this.pool.add(tabView);
        }
    }

    private final void configure(BottomNavigationConfig config) {
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, config.getHeight());
        fVar.f41884c = 80;
        setLayoutParams(fVar);
        LinearLayout linearLayout = this.tabsContainer;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        linearLayout.setBackgroundColor(ThemeExtKt.themeColor(context, config.getBackgroundColor()));
        if (this.islandView.isInitialized()) {
            this.islandView.getValue().setVisibility(config.getShowIsland() ? 0 : 8);
        } else if (config.getShowIsland()) {
            this.islandView.getValue().setVisibility(0);
        }
    }

    private final View createTabView(final OzonMenuItem menuItem, int startMargin, int endMargin, final boolean hapticEnabled) {
        final BaseOzonBottomTabView orCreateTabViewFromViewPool = getOrCreateTabViewFromViewPool();
        orCreateTabViewFromViewPool.setId(menuItem.getItemId());
        orCreateTabViewFromViewPool.setContentDescription(menuItem.getTitle());
        orCreateTabViewFromViewPool.setChecked(menuItem);
        orCreateTabViewFromViewPool.setLabel(menuItem.getTitle());
        if (menuItem.getIsChecked()) {
            orCreateTabViewFromViewPool.setLabelTextAppearance(this.itemTextAppearanceActive);
        } else {
            orCreateTabViewFromViewPool.setLabelTextAppearance(this.itemTextAppearanceInactive);
        }
        orCreateTabViewFromViewPool.setLabelColor(this.itemTextColor);
        orCreateTabViewFromViewPool.setLabelVisibility(this.labelVisibilityMode);
        orCreateTabViewFromViewPool.setIcon(menuItem.getIcon());
        orCreateTabViewFromViewPool.setIconColor(this.iconTabColor);
        orCreateTabViewFromViewPool.setAnimation(menuItem.getAnimation());
        ViewGroup.LayoutParams layoutParams = orCreateTabViewFromViewPool.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = startMargin;
        marginLayoutParams.rightMargin = endMargin;
        orCreateTabViewFromViewPool.setLayoutParams(marginLayoutParams);
        if (this.menu.getOzonMenuItems().size() > 5) {
            orCreateTabViewFromViewPool.setBadgeTopOffset(ResourceExtKt.toPx(4));
        }
        orCreateTabViewFromViewPool.setOnClickListener(new View.OnClickListener() { // from class: aM.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OzonBottomNavigationView ozonBottomNavigationView = this;
                OzonMenuItem ozonMenuItem = menuItem;
                OzonBottomNavigationView.createTabView$lambda$21$lambda$19(hapticEnabled, orCreateTabViewFromViewPool, ozonBottomNavigationView, ozonMenuItem, view);
            }
        });
        orCreateTabViewFromViewPool.setOnLongClickListener(new View.OnLongClickListener() { // from class: aM.d
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean createTabView$lambda$21$lambda$20;
                createTabView$lambda$21$lambda$20 = OzonBottomNavigationView.createTabView$lambda$21$lambda$20(OzonBottomNavigationView.this, menuItem, orCreateTabViewFromViewPool, view);
                return createTabView$lambda$21$lambda$20;
            }
        });
        return orCreateTabViewFromViewPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTabView$lambda$21$lambda$19(boolean z11, BaseOzonBottomTabView baseOzonBottomTabView, OzonBottomNavigationView ozonBottomNavigationView, OzonMenuItem ozonMenuItem, View view) {
        if (z11) {
            HapticVibrator.INSTANCE.vibrate(baseOzonBottomTabView, HapticToken.MEDIUM);
        }
        NavigationItemListener navigationItemListener = ozonBottomNavigationView.navigationItemListener;
        if (navigationItemListener != null) {
            boolean onNavigationItemSelected = navigationItemListener.onNavigationItemSelected(ozonMenuItem, baseOzonBottomTabView.getCurrentBadgeData());
            Boolean valueOf = Boolean.valueOf(onNavigationItemSelected);
            if (!onNavigationItemSelected) {
                valueOf = null;
            }
            if (valueOf != null) {
                ozonMenuItem.setChecked(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createTabView$lambda$21$lambda$20(OzonBottomNavigationView ozonBottomNavigationView, OzonMenuItem ozonMenuItem, BaseOzonBottomTabView baseOzonBottomTabView, View view) {
        Function2<? super OzonMenuItem, ? super IndicatorDTO, Boolean> function2 = ozonBottomNavigationView.onNavigationItemLongClicked;
        boolean booleanValue = function2 != null ? function2.invoke(ozonMenuItem, baseOzonBottomTabView.getCurrentBadgeData()).booleanValue() : false;
        if (booleanValue) {
            HapticVibrator.INSTANCE.vibrate(baseOzonBottomTabView, HapticToken.MEDIUM);
        }
        return booleanValue;
    }

    private final int getFirstItemStartMargin() {
        return ((Number) this.firstItemStartMargin.getValue()).intValue();
    }

    private final int getLastItemEndMargin() {
        return ((Number) this.lastItemEndMargin.getValue()).intValue();
    }

    private final BaseOzonBottomTabView getOrCreateTabViewFromViewPool() {
        if (!this.pool.isEmpty()) {
            List<BaseOzonBottomTabView> list = this.pool;
            return list.remove(C7714v.P(list));
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new OzonBottomTabView(context);
    }

    private final int getSpaceBetweenItems() {
        return ((Number) this.spaceBetweenItems.getValue()).intValue();
    }

    private final Iterable<BaseOzonBottomTabView> getTabs() {
        return new OzonBottomNavigationView$getTabs$1(this);
    }

    private final void updateLabelVisibility(int mode) {
        Iterator<BaseOzonBottomTabView> it = getTabs().iterator();
        while (it.hasNext()) {
            it.next().setLabelVisibility(mode);
        }
    }

    public final void clear() {
        for (BaseOzonBottomTabView baseOzonBottomTabView : getTabs()) {
            BaseOzonBottomTabView.removeBadge$default(baseOzonBottomTabView, null, 1, null);
            addTabViewToPool(baseOzonBottomTabView);
        }
        this.tabsContainer.removeAllViews();
    }

    public final BaseOzonBottomTabView findItemView$tabbar_prodGoogleAllVendorsRelease(int menuItemId) {
        BaseOzonBottomTabView baseOzonBottomTabView;
        Iterator<BaseOzonBottomTabView> it = getTabs().iterator();
        while (true) {
            if (!it.hasNext()) {
                baseOzonBottomTabView = null;
                break;
            }
            baseOzonBottomTabView = it.next();
            if (baseOzonBottomTabView.getId() == menuItemId) {
                break;
            }
        }
        return baseOzonBottomTabView;
    }

    public final int getFakeTabBarHeight() {
        int measuredHeight = this.tabsContainer.getMeasuredHeight() - ((int) Math.ceil(getTranslationY()));
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        Integer valueOf = Integer.valueOf(BottomNavigationConfig.DEFAULT.getHeight());
        if (valueOf.intValue() >= measuredHeight) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : measuredHeight;
    }

    @NotNull
    public final OzonBottomNavigationMenu getMenu() {
        return this.menu;
    }

    public final int getMenuItemPosition(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        OzonBottomNavigationMenu ozonBottomNavigationMenu = this.menu;
        int size = ozonBottomNavigationMenu.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (Intrinsics.d(ozonBottomNavigationMenu.getItem(i11), item)) {
                return i11;
            }
        }
        return -1;
    }

    public final BaseOzonBottomTabView getTabView(int menuItemId) {
        return findItemView$tabbar_prodGoogleAllVendorsRelease(menuItemId);
    }

    public final void initForMenu(@NotNull BottomNavigationConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        configure(config);
        int i11 = 0;
        for (Object obj : this.menu.getOzonMenuItems()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            this.tabsContainer.addView(createTabView((OzonMenuItem) obj, i11 == 0 ? getFirstItemStartMargin() : 0, i11 == C7714v.P(this.menu.getOzonMenuItems()) ? getLastItemEndMargin() : getSpaceBetweenItems(), config.getHapticEnabled()));
            i11 = i12;
        }
    }

    public final void onCheckChanged() {
        OzonBottomNavigationMenu ozonBottomNavigationMenu = this.menu;
        int size = ozonBottomNavigationMenu.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = ozonBottomNavigationMenu.getItem(i11);
            View childAt = this.tabsContainer.getChildAt(i11);
            BaseOzonBottomTabView baseOzonBottomTabView = childAt instanceof BaseOzonBottomTabView ? (BaseOzonBottomTabView) childAt : null;
            if (baseOzonBottomTabView == null || baseOzonBottomTabView.getId() != item.getItemId()) {
                throw new IllegalArgumentException("Structure inconsistency found");
            }
            baseOzonBottomTabView.setChecked(item);
        }
    }

    public final void onItemChanged(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        BaseOzonBottomTabView findItemView$tabbar_prodGoogleAllVendorsRelease = findItemView$tabbar_prodGoogleAllVendorsRelease(item.getItemId());
        if (findItemView$tabbar_prodGoogleAllVendorsRelease != null) {
            CharSequence title = item.getTitle();
            if (title == null) {
                title = "";
            }
            findItemView$tabbar_prodGoogleAllVendorsRelease.setLabel(title);
            findItemView$tabbar_prodGoogleAllVendorsRelease.setIcon(item.getIcon());
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Iterator<BaseOzonBottomTabView> it = getTabs().iterator();
        while (it.hasNext()) {
            it.next().cancelAnimation();
        }
        super.onRestoreInstanceState(state);
    }

    public final void setIconTabColor$tabbar_prodGoogleAllVendorsRelease(@NotNull TabIconColor value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.iconTabColor = value;
        Iterator<BaseOzonBottomTabView> it = getTabs().iterator();
        while (it.hasNext()) {
            it.next().setIconColor(value);
        }
    }

    public final void setItemTextColor(@NotNull ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.itemTextColor = value;
        Iterator<BaseOzonBottomTabView> it = getTabs().iterator();
        while (it.hasNext()) {
            it.next().setLabelColor(value);
        }
    }

    public final void setLabelVisibilityMode(int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Label visibility type is not supported");
        }
        this.labelVisibilityMode = i11;
        updateLabelVisibility(i11);
    }

    public final void setNavigationItemListener(NavigationItemListener navigationItemListener) {
        this.navigationItemListener = navigationItemListener;
    }

    public final void setOnNavigationItemLongClicked(Function2<? super OzonMenuItem, ? super IndicatorDTO, Boolean> function2) {
        this.onNavigationItemLongClicked = function2;
    }
}
