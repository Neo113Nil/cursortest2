package ru.ozon.app.android.tabbar.ui;

import M4.c;
import NZ.c;
import aM.RunnableC4975a;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.Window;
import androidx.core.content.a;
import androidx.core.view.Q0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.tabbar.NavigationItemListener;
import ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.TabsSource;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;
import ru.ozon.app.android.tabbar.ui.controller.DefaultTabUiController;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiController;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabsUiControllerFactoryMapKt;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.tabbar.ui.model.TabIconColor;
import ru.ozon.app.android.uikit.R$bool;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u0080\u00012\u00020\u0001:\u0006\u0080\u0001\u0081\u0001\u0082\u0001BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0013¢\u0006\u0004\b#\u0010\u001bJ\r\u0010$\u001a\u00020\u0013¢\u0006\u0004\b$\u0010\u001bJ\u0015\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001d¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001d¢\u0006\u0004\b(\u0010'J\u0015\u0010)\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001d¢\u0006\u0004\b)\u0010'J\u0015\u0010*\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001d¢\u0006\u0004\b*\u0010'J%\u00100\u001a\u00020\u00132\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\b\b\u0002\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J!\u00106\u001a\u00020\u00132\u0006\u00103\u001a\u0002022\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u00132\u0006\u0010 \u001a\u000208¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00132\u0006\u0010 \u001a\u000208¢\u0006\u0004\b;\u0010:J\u0015\u0010<\u001a\u00020\u00132\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b<\u0010=J\u001f\u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010BJ%\u0010D\u001a\u00020\u00132\f\u0010C\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\bD\u00101J\u001f\u0010H\u001a\u00020\u00132\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020,H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\u0011H\u0002¢\u0006\u0004\bK\u0010\u0015J\u0017\u0010O\u001a\u00020N2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020R2\u0006\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bS\u0010TR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010UR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010VR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010WR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R \u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020`0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u0002080j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR*\u0010n\u001a\u00020L2\u0006\u0010m\u001a\u00020L8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR*\u0010t\u001a\u00020\u00112\u0006\u0010m\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010\u0015R0\u0010z\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0018\u00010y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f¨\u0006\u0083\u0001"}, d2 = {"Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "LNZ/c;", "Landroidx/fragment/app/m;", "fragment", "", "Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel$Key;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiControllerFactory;", "Lru/ozon/app/android/tabbar/ui/controller/TabsUiControllerFactoryMap;", "factories", "Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalytics;", "tabBarAnalytics", "Lru/ozon/app/android/tabbar/ui/TabbarDeeplinksResolver;", "tabbarDeeplinksResolver", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Landroidx/fragment/app/m;Ljava/util/Map;Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalytics;Lru/ozon/app/android/tabbar/ui/TabbarDeeplinksResolver;Lru/ozon/app/android/utils/AppType;)V", "", "tabId", "", "onTabChanged", "(I)V", "Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;", "bottomNavigationView", "configureBottomView", "(Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;)V", "init", "()V", "unbind", "", "throttleTime", "Lru/ozon/app/android/tabbar/OnBottomNavigationItemSelectedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnNavigationItemSelectedListener", "(JLru/ozon/app/android/tabbar/OnBottomNavigationItemSelectedListener;)V", "show", "gone", "duration", "showWithAnimation", "(J)V", "hideWithAnimation", "showWithTranslationAnimation", "hideWithTranslationAnimation", "", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "allItems", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationConfig;", "config", "setItems", "(Ljava/util/List;Lru/ozon/app/android/tabbar/ui/model/BottomNavigationConfig;)V", "Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "activeTabColors", "Lru/ozon/app/android/tabbar/ui/InactiveColorsConfig;", "inactiveTabColors", "setItemColors", "(Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;Lru/ozon/app/android/tabbar/ui/InactiveColorsConfig;)V", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "updateNavigationBarBackgroundColor", "(Lru/ozon/app/android/tabbar/ui/model/BottomNavigationConfig;)V", "tintColor", "defaultColor", "Landroid/content/res/ColorStateList;", "createItemColor", "(II)Landroid/content/res/ColorStateList;", "items", "fillMenu", "Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationMenu;", "menu", "item", "addMenuItem", "(Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationMenu;Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;)V", "tabsCount", "updateTitleVisibility", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "targetState", "", "isTranslationAnimationAllowed", "(Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;)Z", "id", "Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "getLocalTabBehaviour", "(I)Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalytics;", "Lru/ozon/app/android/tabbar/ui/TabbarDeeplinksResolver;", "Lru/ozon/app/android/utils/AppType;", "Landroidx/fragment/app/r;", "activity", "Landroidx/fragment/app/r;", "", "Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;", DynamicElementDTO.TABS, "Ljava/util/List;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "tabUiControllers", "Ljava/util/Map;", "Lru/ozon/app/android/tabbar/ui/controller/DefaultTabUiController;", "defaultTabUiController", "Lru/ozon/app/android/tabbar/ui/controller/DefaultTabUiController;", "isTablet", "Z", "bottomNavigation", "Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;", "", "animationStateListeners", "Ljava/util/Set;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "translateAnimationState", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getTranslateAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "setTranslateAnimationState", "(Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;)V", "selectedItemId", "I", "getSelectedItemId", "()I", "setSelectedItemId", "Lkotlin/Function1;", "onSelectedItemIdChanged", "Lkotlin/jvm/functions/Function1;", "getOnSelectedItemIdChanged", "()Lkotlin/jvm/functions/Function1;", "setOnSelectedItemIdChanged", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "Factory", "WrapperOnNavigationItemSelectedListener", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BottomNavigationController implements c {

    @NotNull
    private final r activity;

    @NotNull
    private final Set<BottomNavigationAnimationStateListener> animationStateListeners;

    @NotNull
    private final AppType appType;
    private OzonBottomNavigationView bottomNavigation;

    @NotNull
    private final DefaultTabUiController defaultTabUiController;

    @NotNull
    private final ComponentCallbacksC5392m fragment;
    private final boolean isTablet;
    private Function1<? super Integer, Unit> onSelectedItemIdChanged;
    private int selectedItemId;

    @NotNull
    private final TabBarAnalytics tabBarAnalytics;

    @NotNull
    private final Map<Integer, TabUiController> tabUiControllers;

    @NotNull
    private final TabbarDeeplinksResolver tabbarDeeplinksResolver;

    @NotNull
    private final List<BottomMenuItem> tabs;

    @NotNull
    private TranslateAnimationState translateAnimationState;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ru/ozon/app/android/tabbar/ui/BottomNavigationController$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "onDestroy", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.tabbar.ui.BottomNavigationController$1, reason: invalid class name */
    public static final class AnonymousClass1 implements DefaultLifecycleObserver {
        AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bundle onCreate$lambda$1(BottomNavigationController bottomNavigationController) {
            Bundle bundle = new Bundle();
            bundle.putInt("ru.ozon.app.android.tabs.ui.EXTRA_SELECTED_ITEM_ID", bottomNavigationController.getSelectedItemId());
            return bundle;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onCreate(owner);
            Bundle b11 = BottomNavigationController.this.fragment.getSavedStateRegistry().b("ru.ozon.app.android.tabs.ui.EXTRA_BOTTOM_NAVIGATION");
            if (b11 != null) {
                BottomNavigationController.this.setSelectedItemId(b11.getInt("ru.ozon.app.android.tabs.ui.EXTRA_SELECTED_ITEM_ID", -1));
            }
            BottomNavigationController.this.fragment.getSavedStateRegistry().i("ru.ozon.app.android.tabs.ui.EXTRA_BOTTOM_NAVIGATION");
            M4.c savedStateRegistry = BottomNavigationController.this.fragment.getSavedStateRegistry();
            final BottomNavigationController bottomNavigationController = BottomNavigationController.this;
            savedStateRegistry.g("ru.ozon.app.android.tabs.ui.EXTRA_BOTTOM_NAVIGATION", new c.b() { // from class: aM.b
                @Override // M4.c.b
                public final Bundle saveState() {
                    Bundle onCreate$lambda$1;
                    onCreate$lambda$1 = BottomNavigationController.AnonymousClass1.onCreate$lambda$1(BottomNavigationController.this);
                    return onCreate$lambda$1;
                }
            });
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onDestroy(owner);
            BottomNavigationController.this.fragment.getSavedStateRegistry().i("ru.ozon.app.android.tabs.ui.EXTRA_BOTTOM_NAVIGATION");
            BottomNavigationController.this.fragment.getLifecycle().e(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "create", "(Landroidx/fragment/app/m;)Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        BottomNavigationController create(@NotNull ComponentCallbacksC5392m fragment);
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/tabbar/ui/BottomNavigationController$WrapperOnNavigationItemSelectedListener;", "Lru/ozon/app/android/tabbar/NavigationItemListener;", "throttleTime", "", "bottomNavigationView", "Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;", "onNavigationItemViewSelectedListener", "Lru/ozon/app/android/tabbar/OnBottomNavigationItemSelectedListener;", "tabBarAnalytics", "Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalytics;", "bottomNavigationController", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "tabUiControllers", "", "", "Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "defaultTabUiController", "Lru/ozon/app/android/tabbar/ui/controller/DefaultTabUiController;", "<init>", "(JLru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;Lru/ozon/app/android/tabbar/OnBottomNavigationItemSelectedListener;Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalytics;Lru/ozon/app/android/tabbar/ui/BottomNavigationController;Ljava/util/Map;Lru/ozon/app/android/tabbar/ui/controller/DefaultTabUiController;)V", "lastClickTime", "onNavigationItemSelected", "", "item", "Landroid/view/MenuItem;", "badge", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class WrapperOnNavigationItemSelectedListener implements NavigationItemListener {

        @NotNull
        private final BottomNavigationController bottomNavigationController;

        @NotNull
        private final OzonBottomNavigationView bottomNavigationView;

        @NotNull
        private final DefaultTabUiController defaultTabUiController;
        private long lastClickTime;

        @NotNull
        private final OnBottomNavigationItemSelectedListener onNavigationItemViewSelectedListener;

        @NotNull
        private final TabBarAnalytics tabBarAnalytics;

        @NotNull
        private final Map<Integer, TabUiController> tabUiControllers;
        private final long throttleTime;

        /* JADX WARN: Multi-variable type inference failed */
        public WrapperOnNavigationItemSelectedListener(long j11, @NotNull OzonBottomNavigationView bottomNavigationView, @NotNull OnBottomNavigationItemSelectedListener onNavigationItemViewSelectedListener, @NotNull TabBarAnalytics tabBarAnalytics, @NotNull BottomNavigationController bottomNavigationController, @NotNull Map<Integer, ? extends TabUiController> tabUiControllers, @NotNull DefaultTabUiController defaultTabUiController) {
            Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
            Intrinsics.checkNotNullParameter(onNavigationItemViewSelectedListener, "onNavigationItemViewSelectedListener");
            Intrinsics.checkNotNullParameter(tabBarAnalytics, "tabBarAnalytics");
            Intrinsics.checkNotNullParameter(bottomNavigationController, "bottomNavigationController");
            Intrinsics.checkNotNullParameter(tabUiControllers, "tabUiControllers");
            Intrinsics.checkNotNullParameter(defaultTabUiController, "defaultTabUiController");
            this.throttleTime = j11;
            this.bottomNavigationView = bottomNavigationView;
            this.onNavigationItemViewSelectedListener = onNavigationItemViewSelectedListener;
            this.tabBarAnalytics = tabBarAnalytics;
            this.bottomNavigationController = bottomNavigationController;
            this.tabUiControllers = tabUiControllers;
            this.defaultTabUiController = defaultTabUiController;
        }

        @Override // ru.ozon.app.android.tabbar.NavigationItemListener
        public boolean onNavigationItemSelected(@NotNull MenuItem item, IndicatorDTO badge) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.getItemId() != this.bottomNavigationController.getSelectedItemId()) {
                if (SystemClock.elapsedRealtime() - this.lastClickTime < this.throttleTime) {
                    return false;
                }
                this.lastClickTime = SystemClock.elapsedRealtime();
            }
            List list = this.bottomNavigationController.tabs;
            Iterator it = list.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (((BottomMenuItem) it.next()).getId() == this.bottomNavigationController.getSelectedItemId()) {
                    break;
                }
                i11++;
            }
            BottomMenuItem nONE_ITEM$tabbar_prodGoogleAllVendorsRelease = i11 >= 0 ? (BottomMenuItem) list.get(i11) : BottomMenuItem.INSTANCE.getNONE_ITEM$tabbar_prodGoogleAllVendorsRelease();
            int menuItemPosition = this.bottomNavigationView.getMenuItemPosition(item);
            this.tabBarAnalytics.sendClickEvent(item, menuItemPosition, badge);
            BottomMenuItem bottomMenuItem = (BottomMenuItem) list.get(menuItemPosition);
            boolean onItemSelectedItem = this.onNavigationItemViewSelectedListener.onItemSelectedItem(bottomMenuItem, nONE_ITEM$tabbar_prodGoogleAllVendorsRelease);
            TabUiController tabUiController = this.tabUiControllers.get(Integer.valueOf(bottomMenuItem.getId()));
            if (tabUiController == null) {
                tabUiController = this.defaultTabUiController;
            }
            tabUiController.onTabSelected(bottomMenuItem.getId() == nONE_ITEM$tabbar_prodGoogleAllVendorsRelease.getId());
            return onItemSelectedItem;
        }
    }

    public BottomNavigationController(@NotNull ComponentCallbacksC5392m fragment, @NotNull Map<TabControllerRegistryModel.Key, TabUiControllerFactory> factories, @NotNull TabBarAnalytics tabBarAnalytics, @NotNull TabbarDeeplinksResolver tabbarDeeplinksResolver, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(factories, "factories");
        Intrinsics.checkNotNullParameter(tabBarAnalytics, "tabBarAnalytics");
        Intrinsics.checkNotNullParameter(tabbarDeeplinksResolver, "tabbarDeeplinksResolver");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.fragment = fragment;
        this.tabBarAnalytics = tabBarAnalytics;
        this.tabbarDeeplinksResolver = tabbarDeeplinksResolver;
        this.appType = appType;
        r requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.activity = requireActivity;
        this.tabs = new ArrayList();
        String miniAppName = MiniAppExtKt.getMiniAppName(requireActivity);
        this.tabUiControllers = TabsUiControllerFactoryMapKt.controllersByMiniApp(factories, fragment, miniAppName == null ? "main" : miniAppName);
        this.defaultTabUiController = new DefaultTabUiController(fragment);
        this.isTablet = requireActivity.getResources().getBoolean(R$bool.isTablet);
        this.animationStateListeners = new LinkedHashSet();
        this.translateAnimationState = TranslateAnimationState.NONE;
        this.selectedItemId = -1;
        fragment.getLifecycle().a(new AnonymousClass1());
    }

    private final void addMenuItem(OzonBottomNavigationMenu menu, BottomNavigationItem item) {
        MenuItem add = menu.add(0, item.getId(), 0, item.getTitle(), item.getAnimation());
        Drawable loadDrawableByName = ContextExtKt.loadDrawableByName(this.activity, item.getIcon());
        if (loadDrawableByName == null) {
            loadDrawableByName = a.getDrawable(this.activity, R$drawable.ic_m_ozon_circle_filled);
        }
        add.setIcon(loadDrawableByName);
        add.setChecked(item.getId() == this.selectedItemId);
    }

    private final ColorStateList createItemColor(int tintColor, int defaultColor) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}, new int[0]}, new int[]{tintColor, defaultColor, defaultColor});
    }

    private final void fillMenu(List<BottomNavigationItem> items, BottomNavigationConfig config) {
        OzonBottomNavigationView ozonBottomNavigationView = this.bottomNavigation;
        if (ozonBottomNavigationView == null) {
            return;
        }
        OzonBottomNavigationMenu menu = ozonBottomNavigationView.getMenu();
        Iterator<T> it = this.tabUiControllers.values().iterator();
        while (it.hasNext()) {
            ((TabUiController) it.next()).dispatchTabViewRecycled$tabbar_prodGoogleAllVendorsRelease();
        }
        menu.clear();
        menu.setGroupCheckable(0, true, false);
        Iterator<T> it2 = items.iterator();
        while (it2.hasNext()) {
            addMenuItem(menu, (BottomNavigationItem) it2.next());
        }
        menu.setGroupCheckable(0, true, true);
        ozonBottomNavigationView.initForMenu(config);
        for (BottomNavigationItem bottomNavigationItem : items) {
            int id2 = bottomNavigationItem.getId();
            BaseOzonBottomTabView findItemView$tabbar_prodGoogleAllVendorsRelease = ozonBottomNavigationView.findItemView$tabbar_prodGoogleAllVendorsRelease(id2);
            if (findItemView$tabbar_prodGoogleAllVendorsRelease != null) {
                TabUiController tabUiController = this.tabUiControllers.get(Integer.valueOf(id2));
                if (tabUiController == null) {
                    tabUiController = this.defaultTabUiController;
                }
                tabUiController.dispatchUpdate$tabbar_prodGoogleAllVendorsRelease(findItemView$tabbar_prodGoogleAllVendorsRelease, bottomNavigationItem);
            }
        }
    }

    private final BottomNavigationBehavior getLocalTabBehaviour(int id2) {
        return (id2 == ru.ozon.app.android.tabbar.R$id.menu_express || id2 == ru.ozon.app.android.tabbar.R$id.menu_bank) ? BottomNavigationBehavior.BEHAVIOR_TYPE_REDIRECT : BottomNavigationBehavior.BEHAVIOR_TYPE_SELECT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideWithAnimation$lambda$7(BottomNavigationController bottomNavigationController, OzonBottomNavigationView ozonBottomNavigationView) {
        bottomNavigationController.setTranslateAnimationState(TranslateAnimationState.HIDDEN);
        ViewExtKt.gone(ozonBottomNavigationView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideWithTranslationAnimation$lambda$9(BottomNavigationController bottomNavigationController) {
        bottomNavigationController.setTranslateAnimationState(TranslateAnimationState.HIDDEN);
    }

    private final boolean isTranslationAnimationAllowed(TranslateAnimationState targetState) {
        OzonBottomNavigationView ozonBottomNavigationView;
        return (this.translateAnimationState == targetState || (ozonBottomNavigationView = this.bottomNavigation) == null || !ViewExtKt.isVisible(ozonBottomNavigationView)) ? false : true;
    }

    public static /* synthetic */ void setItemColors$default(BottomNavigationController bottomNavigationController, ActiveColorsConfig activeColorsConfig, InactiveColorsConfig inactiveColorsConfig, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            inactiveColorsConfig = null;
        }
        bottomNavigationController.setItemColors(activeColorsConfig, inactiveColorsConfig);
    }

    public static /* synthetic */ void setItems$default(BottomNavigationController bottomNavigationController, List list, BottomNavigationConfig bottomNavigationConfig, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bottomNavigationConfig = BottomNavigationConfig.DEFAULT;
        }
        bottomNavigationController.setItems(list, bottomNavigationConfig);
    }

    public static /* synthetic */ void setOnNavigationItemSelectedListener$default(BottomNavigationController bottomNavigationController, long j11, OnBottomNavigationItemSelectedListener onBottomNavigationItemSelectedListener, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 300;
        }
        bottomNavigationController.setOnNavigationItemSelectedListener(j11, onBottomNavigationItemSelectedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedItemId(int i11) {
        this.selectedItemId = i11;
        Function1<? super Integer, Unit> function1 = this.onSelectedItemIdChanged;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i11));
        }
    }

    private final void setTranslateAnimationState(TranslateAnimationState translateAnimationState) {
        if (this.translateAnimationState == translateAnimationState) {
            return;
        }
        this.translateAnimationState = translateAnimationState;
        Iterator<T> it = this.animationStateListeners.iterator();
        while (it.hasNext()) {
            ((BottomNavigationAnimationStateListener) it.next()).onBottomNavigationAnimationChanged(translateAnimationState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithAnimation$lambda$6(BottomNavigationController bottomNavigationController) {
        bottomNavigationController.setTranslateAnimationState(TranslateAnimationState.SHOWN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithTranslationAnimation$lambda$8(BottomNavigationController bottomNavigationController) {
        bottomNavigationController.setTranslateAnimationState(TranslateAnimationState.SHOWN);
    }

    private final void updateTitleVisibility(int tabsCount) {
        boolean z11 = tabsCount < 6 || this.isTablet;
        OzonBottomNavigationView ozonBottomNavigationView = this.bottomNavigation;
        if (ozonBottomNavigationView != null) {
            ozonBottomNavigationView.setLabelVisibilityMode(z11 ? 1 : 2);
        }
    }

    public final void addListener(@NotNull BottomNavigationAnimationStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.animationStateListeners.add(listener);
    }

    public final void configureBottomView(@NotNull OzonBottomNavigationView bottomNavigationView) {
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        this.bottomNavigation = bottomNavigationView;
        bottomNavigationView.setLabelVisibilityMode(2);
        if (this.tabs.isEmpty()) {
            int size = bottomNavigationView.getMenu().size();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = bottomNavigationView.getMenu().getItem(i11);
                this.tabs.add(new BottomMenuItem(item.getItemId(), getLocalTabBehaviour(item.getItemId())));
            }
        }
    }

    public final int getSelectedItemId() {
        return this.selectedItemId;
    }

    @NotNull
    public final TranslateAnimationState getTranslateAnimationState() {
        return this.translateAnimationState;
    }

    public final void gone() {
        setTranslateAnimationState(TranslateAnimationState.HIDDEN);
        OzonBottomNavigationView ozonBottomNavigationView = this.bottomNavigation;
        if (ozonBottomNavigationView != null) {
            ViewExtKt.gone(ozonBottomNavigationView);
        }
    }

    public final void hideWithAnimation(long duration) {
        OzonBottomNavigationView ozonBottomNavigationView = this.bottomNavigation;
        if (ozonBottomNavigationView == null) {
            return;
        }
        setTranslateAnimationState(TranslateAnimationState.HIDING);
        ozonBottomNavigationView.setAlpha(1.0f);
        ViewExtKt.show(ozonBottomNavigationView);
        ozonBottomNavigationView.animate().setDuration(duration).alpha(0.0f).withEndAction(new RunnableC4975a(0, this, ozonBottomNavigationView)).start();
    }

    public final void hideWithTranslationAnimation(long duration) {
        OzonBottomNavigationView ozonBottomNavigationView;
        TranslateAnimationState translateAnimationState = TranslateAnimationState.HIDING;
        if (isTranslationAnimationAllowed(translateAnimationState) && (ozonBottomNavigationView = this.bottomNavigation) != null) {
            setTranslateAnimationState(translateAnimationState);
            ozonBottomNavigationView.animate().setDuration(duration).translationY(ozonBottomNavigationView.getMeasuredHeight()).withEndAction(new N9.c(this, 1)).start();
        }
    }

    public final void init() {
        Iterator<T> it = this.tabUiControllers.values().iterator();
        while (it.hasNext()) {
            ((TabUiController) it.next()).onInit();
        }
        this.defaultTabUiController.onInit();
    }

    @Override // NZ.c
    public void onTabChanged(int tabId) {
        OzonBottomNavigationView ozonBottomNavigationView = this.bottomNavigation;
        if (ozonBottomNavigationView == null) {
            return;
        }
        Iterator<BottomMenuItem> it = this.tabs.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getId() == tabId) {
                break;
            } else {
                i11++;
            }
        }
        MenuItem item = i11 >= 0 ? ozonBottomNavigationView.getMenu().getItem(i11) : null;
        if (item != null) {
            ozonBottomNavigationView.getMenu().setGroupCheckable(0, true, true);
            item.setChecked(true);
        } else {
            ozonBottomNavigationView.getMenu().setGroupCheckable(0, true, false);
            OzonBottomNavigationMenu menu = ozonBottomNavigationView.getMenu();
            int size = menu.size();
            for (int i12 = 0; i12 < size; i12++) {
                MenuItem item2 = menu.getItem(i12);
                Intrinsics.checkNotNullExpressionValue(item2, "getItem(...)");
                item2.setChecked(false);
            }
        }
        setSelectedItemId(tabId);
    }

    public final void removeListener(@NotNull BottomNavigationAnimationStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.animationStateListeners.remove(listener);
    }

    public final void setItemColors(@NotNull ActiveColorsConfig activeTabColors, InactiveColorsConfig inactiveTabColors) {
        Intrinsics.checkNotNullParameter(activeTabColors, "activeTabColors");
        String iconColor = activeTabColors.getIconColor();
        String titleColor = activeTabColors.getTitleColor();
        if (iconColor == null && titleColor == null) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        r rVar = this.activity;
        Integer iconAltColor = activeTabColors.getIconAltColor();
        int parseColor = styleParser.parseColor(rVar, iconColor, iconAltColor != null ? iconAltColor.intValue() : UniColors.GRAPHIC_KEY.getResId());
        r rVar2 = this.activity;
        Integer titleAltColor = activeTabColors.getTitleAltColor();
        int parseColor2 = styleParser.parseColor(rVar2, titleColor, titleAltColor != null ? titleAltColor.intValue() : UniColors.TEXT_PRIMARY.getResId());
        int parseColor3 = styleParser.parseColor(this.activity, inactiveTabColors != null ? inactiveTabColors.getIconColor() : null, UniColors.GRAPHIC_TABBAR_ICON_SECONDARY.getResId());
        int parseColor4 = styleParser.parseColor(this.activity, inactiveTabColors != null ? inactiveTabColors.getTitleColor() : null, UniColors.TEXT_SECONDARY.getResId());
        OzonBottomNavigationView ozonBottomNavigationView = this.bottomNavigation;
        if (ozonBottomNavigationView != null) {
            ozonBottomNavigationView.setIconTabColor$tabbar_prodGoogleAllVendorsRelease(new TabIconColor(createItemColor(parseColor, parseColor3)));
        }
        OzonBottomNavigationView ozonBottomNavigationView2 = this.bottomNavigation;
        if (ozonBottomNavigationView2 != null) {
            ozonBottomNavigationView2.setItemTextColor(createItemColor(parseColor2, parseColor4));
        }
    }

    public final void setItems(@NotNull List<BottomNavigationItem> allItems, @NotNull BottomNavigationConfig config) {
        Intrinsics.checkNotNullParameter(allItems, "allItems");
        Intrinsics.checkNotNullParameter(config, "config");
        this.tabbarDeeplinksResolver.resolveDeeplinkHandlersForTabs(new TabsSource.Items(allItems));
        List<BottomNavigationItem> K02 = C7714v.K0(allItems, 6);
        updateTitleVisibility(K02.size());
        List<BottomNavigationItem> list = K02;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (BottomNavigationItem bottomNavigationItem : list) {
            arrayList.add(new BottomMenuItem(bottomNavigationItem.getId(), bottomNavigationItem.getBehavior()));
        }
        this.tabs.clear();
        this.tabs.addAll(arrayList);
        fillMenu(K02, config);
        OzonBottomNavigationView ozonBottomNavigationView = this.bottomNavigation;
        boolean z11 = false;
        if (ozonBottomNavigationView != null && ViewExtKt.isVisible(ozonBottomNavigationView)) {
            z11 = true;
        }
        if (this.appType == AppType.f94580BX && z11) {
            updateNavigationBarBackgroundColor(config);
        }
    }

    public final void setOnNavigationItemSelectedListener(long throttleTime, @NotNull OnBottomNavigationItemSelectedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        OzonBottomNavigationView ozonBottomNavigationView = this.bottomNavigation;
        if (ozonBottomNavigationView == null) {
            return;
        }
        ozonBottomNavigationView.setNavigationItemListener(new WrapperOnNavigationItemSelectedListener(throttleTime, ozonBottomNavigationView, listener, this.tabBarAnalytics, this, this.tabUiControllers, this.defaultTabUiController));
    }

    public final void setOnSelectedItemIdChanged(Function1<? super Integer, Unit> function1) {
        this.onSelectedItemIdChanged = function1;
    }

    public final void show() {
        setTranslateAnimationState(TranslateAnimationState.SHOWN);
        OzonBottomNavigationView ozonBottomNavigationView = this.bottomNavigation;
        if (ozonBottomNavigationView != null) {
            ozonBottomNavigationView.setAlpha(1.0f);
        }
        OzonBottomNavigationView ozonBottomNavigationView2 = this.bottomNavigation;
        if (ozonBottomNavigationView2 != null) {
            ViewExtKt.show(ozonBottomNavigationView2);
        }
    }

    public final void showWithAnimation(long duration) {
        OzonBottomNavigationView ozonBottomNavigationView = this.bottomNavigation;
        if (ozonBottomNavigationView == null) {
            return;
        }
        setTranslateAnimationState(TranslateAnimationState.SHOWING);
        ozonBottomNavigationView.setAlpha(0.0f);
        ViewExtKt.show(ozonBottomNavigationView);
        ozonBottomNavigationView.animate().setDuration(duration).alpha(1.0f).withEndAction(new JD.a(this, 1)).start();
    }

    public final void showWithTranslationAnimation(long duration) {
        OzonBottomNavigationView ozonBottomNavigationView;
        TranslateAnimationState translateAnimationState = TranslateAnimationState.SHOWING;
        if (isTranslationAnimationAllowed(translateAnimationState) && (ozonBottomNavigationView = this.bottomNavigation) != null) {
            setTranslateAnimationState(translateAnimationState);
            ozonBottomNavigationView.animate().setDuration(duration).translationY(0.0f).withEndAction(new T10.a(this, 1)).start();
        }
    }

    public final void unbind() {
        Iterator<T> it = this.tabUiControllers.values().iterator();
        while (it.hasNext()) {
            ((TabUiController) it.next()).dispatchDestroy$tabbar_prodGoogleAllVendorsRelease();
        }
        this.defaultTabUiController.dispatchDestroy$tabbar_prodGoogleAllVendorsRelease();
        this.bottomNavigation = null;
    }

    public final void updateNavigationBarBackgroundColor(@NotNull BottomNavigationConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Window window = this.activity.getWindow();
        window.setNavigationBarColor(ThemeExtKt.themeColor(this.activity, config.getBackgroundColor()));
        new Q0(window.getDecorView(), window).d(config == BottomNavigationConfig.DEFAULT && !ThemeExtKt.isDarkThemeActive(this.activity));
    }
}
