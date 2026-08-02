package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers;

import Sc.InterfaceC4008j;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.BackgroundConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FirstFloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.ScrollFloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.SecondCollapsedFloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.SecondFloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.ThirdFloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.ZeroFloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.placeholder.ShellNavBarStateListener;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers.BackgroundScrollController;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers.FirstFloorScrollController;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers.ScrollFloorScrollController;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers.SecondCollapsedFloorScrollController;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers.SecondFloorScrollController;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers.ThirdFloorScrollController;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers.ZeroFloorScrollController;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views.ShellNavBarBgView;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views.ShellNavBarScrollFloorView;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010!J)\u0010%\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b*\u0010+J+\u0010,\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00103R\u001b\u00108\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010>R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010?R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00105\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00105\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u00105\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u00105\u001a\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u00105\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u00105\u001a\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u00105\u001a\u0004\be\u0010fR\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u00105\u001a\u0004\bj\u0010kR\u001b\u0010q\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u00105\u001a\u0004\bo\u0010pR\u001b\u0010v\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u00105\u001a\u0004\bt\u0010uR\u001b\u0010{\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u00105\u001a\u0004\by\u0010zR\u001c\u0010\u0080\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u00105\u001a\u0004\b~\u0010\u007fR \u0010\u0085\u0001\u001a\u00030\u0081\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0082\u0001\u00105\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R<\u0010\u0087\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u0086\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u008d\u0001"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarFloorManager;", "", "Ll10/i;", "container", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbar", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarStateListener;", "placeholderListener", "<init>", "(Ll10/i;Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarStateListener;)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "navBarVO", "", "statusBarHeight", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView;", "bgView", "Landroid/view/View;", "thirdFloorView", "prevOffset", "", "configViews", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;ILru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView;Landroid/view/View;I)V", "backgroundView", "onInsetsUpdated", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;ILru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView;)V", "onViewDetached", "()V", "offset", "onNavbarOffsetChanged", "(I)V", "configZeroFloorIfExist", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;)V", "configFirstFloorIfExist", "configScrollFloorIfExist", "firstFloorInsetsUpdated", "configSecondFloor", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;Landroid/view/View;I)V", "thirdFloor", "configThirdFloor", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;Landroid/view/View;)V", "updateCollapsingToolbarLayoutParams", "(Landroid/view/View;)V", "configureBackgroundView", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView;Ljava/lang/Integer;)V", "Ll10/i;", "getContainer", "()Ll10/i;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Landroidx/appcompat/widget/Toolbar;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarStateListener;", "toolbarDefaultHeight$delegate", "LSc/j;", "getToolbarDefaultHeight", "()I", "toolbarDefaultHeight", "", "", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator;", "configurators", "Ljava/util/Map;", "Landroid/view/View;", "I", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/ZeroFloorScrollController;", "zeroScrollController$delegate", "getZeroScrollController", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/ZeroFloorScrollController;", "zeroScrollController", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/FirstFloorScrollController;", "firstScrollController$delegate", "getFirstScrollController", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/FirstFloorScrollController;", "firstScrollController", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/SecondFloorScrollController;", "secondScrollController$delegate", "getSecondScrollController", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/SecondFloorScrollController;", "secondScrollController", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/SecondCollapsedFloorScrollController;", "secondCollapsedScrollController$delegate", "getSecondCollapsedScrollController", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/SecondCollapsedFloorScrollController;", "secondCollapsedScrollController", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/ThirdFloorScrollController;", "thirdScrollController$delegate", "getThirdScrollController", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/ThirdFloorScrollController;", "thirdScrollController", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/BackgroundScrollController;", "backgroundScrollController$delegate", "getBackgroundScrollController", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/BackgroundScrollController;", "backgroundScrollController", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/ScrollFloorScrollController;", "scrollFloorScrollController$delegate", "getScrollFloorScrollController", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/ScrollFloorScrollController;", "scrollFloorScrollController", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/ZeroFloorConfigurator;", "zeroFloorConfigurator$delegate", "getZeroFloorConfigurator", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/ZeroFloorConfigurator;", "zeroFloorConfigurator", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FirstFloorConfigurator;", "firstFloorConfigurator$delegate", "getFirstFloorConfigurator", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FirstFloorConfigurator;", "firstFloorConfigurator", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/SecondFloorConfigurator;", "secondFloorConfigurator$delegate", "getSecondFloorConfigurator", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/SecondFloorConfigurator;", "secondFloorConfigurator", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/SecondCollapsedFloorConfigurator;", "secondCollapsedFloorConfigurator$delegate", "getSecondCollapsedFloorConfigurator", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/SecondCollapsedFloorConfigurator;", "secondCollapsedFloorConfigurator", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/ThirdFloorConfigurator;", "thirdFloorConfigurator$delegate", "getThirdFloorConfigurator", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/ThirdFloorConfigurator;", "thirdFloorConfigurator", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/BackgroundConfigurator;", "backgroundConfigurator$delegate", "getBackgroundConfigurator", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/BackgroundConfigurator;", "backgroundConfigurator", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/ScrollFloorConfigurator;", "scrollFloorConfigurator$delegate", "getScrollFloorConfigurator", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/ScrollFloorConfigurator;", "scrollFloorConfigurator", "Lkotlin/Function2;", "onHeightUpdated", "Lkotlin/jvm/functions/Function2;", "getOnHeightUpdated", "()Lkotlin/jvm/functions/Function2;", "setOnHeightUpdated", "(Lkotlin/jvm/functions/Function2;)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarFloorManager {

    /* renamed from: backgroundConfigurator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundConfigurator;

    /* renamed from: backgroundScrollController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundScrollController;

    @NotNull
    private final CollapsingToolbarLayout collapsingToolbar;

    @NotNull
    private final Map<String, FloorConfigurator> configurators;

    @NotNull
    private final i container;

    /* renamed from: firstFloorConfigurator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j firstFloorConfigurator;

    /* renamed from: firstScrollController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j firstScrollController;

    @NotNull
    private Function2<? super Integer, ? super Integer, Unit> onHeightUpdated;

    @NotNull
    private ShellNavBarStateListener placeholderListener;

    /* renamed from: scrollFloorConfigurator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scrollFloorConfigurator;

    /* renamed from: scrollFloorScrollController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scrollFloorScrollController;

    /* renamed from: secondCollapsedFloorConfigurator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j secondCollapsedFloorConfigurator;

    /* renamed from: secondCollapsedScrollController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j secondCollapsedScrollController;

    /* renamed from: secondFloorConfigurator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j secondFloorConfigurator;

    /* renamed from: secondScrollController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j secondScrollController;
    private int statusBarHeight;

    /* renamed from: thirdFloorConfigurator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j thirdFloorConfigurator;
    private View thirdFloorView;

    /* renamed from: thirdScrollController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j thirdScrollController;

    @NotNull
    private final Toolbar toolbar;

    /* renamed from: toolbarDefaultHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j toolbarDefaultHeight;

    /* renamed from: zeroFloorConfigurator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j zeroFloorConfigurator;

    /* renamed from: zeroScrollController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j zeroScrollController;

    public ShellNavBarFloorManager(@NotNull i container, @NotNull CollapsingToolbarLayout collapsingToolbar, @NotNull Toolbar toolbar, @NotNull ShellNavBarStateListener placeholderListener) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(collapsingToolbar, "collapsingToolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(placeholderListener, "placeholderListener");
        this.container = container;
        this.collapsingToolbar = collapsingToolbar;
        this.toolbar = toolbar;
        this.placeholderListener = placeholderListener;
        this.toolbarDefaultHeight = LazyUtilsKt.unsafeLazy(ShellNavBarFloorManager$toolbarDefaultHeight$2.INSTANCE);
        this.configurators = new LinkedHashMap();
        this.zeroScrollController = LazyUtilsKt.unsafeLazy(ShellNavBarFloorManager$zeroScrollController$2.INSTANCE);
        this.firstScrollController = LazyUtilsKt.unsafeLazy(ShellNavBarFloorManager$firstScrollController$2.INSTANCE);
        this.secondScrollController = LazyUtilsKt.unsafeLazy(ShellNavBarFloorManager$secondScrollController$2.INSTANCE);
        this.secondCollapsedScrollController = LazyUtilsKt.unsafeLazy(ShellNavBarFloorManager$secondCollapsedScrollController$2.INSTANCE);
        this.thirdScrollController = LazyUtilsKt.unsafeLazy(new ShellNavBarFloorManager$thirdScrollController$2(this));
        this.backgroundScrollController = LazyUtilsKt.unsafeLazy(ShellNavBarFloorManager$backgroundScrollController$2.INSTANCE);
        this.scrollFloorScrollController = LazyUtilsKt.unsafeLazy(new ShellNavBarFloorManager$scrollFloorScrollController$2(this));
        this.zeroFloorConfigurator = LazyUtilsKt.unsafeLazy(new ShellNavBarFloorManager$zeroFloorConfigurator$2(this));
        this.firstFloorConfigurator = LazyUtilsKt.unsafeLazy(new ShellNavBarFloorManager$firstFloorConfigurator$2(this));
        this.secondFloorConfigurator = LazyUtilsKt.unsafeLazy(new ShellNavBarFloorManager$secondFloorConfigurator$2(this));
        this.secondCollapsedFloorConfigurator = LazyUtilsKt.unsafeLazy(new ShellNavBarFloorManager$secondCollapsedFloorConfigurator$2(this));
        this.thirdFloorConfigurator = LazyUtilsKt.unsafeLazy(new ShellNavBarFloorManager$thirdFloorConfigurator$2(this));
        this.backgroundConfigurator = LazyUtilsKt.unsafeLazy(ShellNavBarFloorManager$backgroundConfigurator$2.INSTANCE);
        this.scrollFloorConfigurator = LazyUtilsKt.unsafeLazy(new ShellNavBarFloorManager$scrollFloorConfigurator$2(this));
        this.onHeightUpdated = ShellNavBarFloorManager$onHeightUpdated$1.INSTANCE;
    }

    private final void configFirstFloorIfExist(ShellNavBarVO navBarVO) {
        ViewGroup viewGroup;
        Map<String, ViewGroup> floorContainers = navBarVO.getFloorContainers();
        if (floorContainers == null || (viewGroup = floorContainers.get("top")) == null) {
            return;
        }
        Map<String, ViewGroup> floorContainers2 = navBarVO.getFloorContainers();
        getFirstFloorConfigurator().configFloor(navBarVO, viewGroup, this.statusBarHeight, (floorContainers2 == null || floorContainers2.get("zero") == null) ? null : getZeroFloorConfigurator().getFloorConfig(), new ShellNavBarFloorManager$configFirstFloorIfExist$1(getFirstScrollController()));
    }

    private final void configScrollFloorIfExist(ShellNavBarVO navBarVO) {
        ViewGroup viewGroup;
        Map<String, ViewGroup> floorContainers = navBarVO.getFloorContainers();
        if (floorContainers == null || (viewGroup = floorContainers.get("scroll")) == null) {
            return;
        }
        getScrollFloorConfigurator().configFloor((ShellNavBarScrollFloorView) viewGroup, navBarVO, new ShellNavBarFloorManager$configScrollFloorIfExist$1(getScrollFloorScrollController()));
    }

    private final void configSecondFloor(ShellNavBarVO navBarVO, View thirdFloorView, int prevOffset) {
        ViewGroup viewGroup;
        Map<String, ViewGroup> floorContainers = navBarVO.getFloorContainers();
        if (floorContainers == null || (viewGroup = floorContainers.get("second")) == null) {
            return;
        }
        Map<String, ViewGroup> floorContainers2 = navBarVO.getFloorContainers();
        FloorConfigurator.FloorConfigurationParam floorConfig = (floorContainers2 == null || floorContainers2.get("zero") == null) ? null : getZeroFloorConfigurator().getFloorConfig();
        Map<String, ViewGroup> floorContainers3 = navBarVO.getFloorContainers();
        FloorConfigurator.FloorConfigurationParam floorConfig2 = (floorContainers3 == null || floorContainers3.get("top") == null) ? null : getFirstFloorConfigurator().getFloorConfig();
        getSecondFloorConfigurator().configFloor(navBarVO, viewGroup, thirdFloorView != null ? thirdFloorView.getMeasuredHeight() : 0, this.statusBarHeight, floorConfig2 == null ? floorConfig : floorConfig2, navBarVO.getTeeth(), prevOffset, new ShellNavBarFloorManager$configSecondFloor$1(getSecondScrollController()));
        Map<String, ViewGroup> floorContainers4 = navBarVO.getFloorContainers();
        ViewGroup viewGroup2 = floorContainers4 != null ? floorContainers4.get("secondCollapsed") : null;
        if (viewGroup2 == null || getSecondFloorConfigurator().getFloorConfig() == null) {
            getSecondCollapsedScrollController().clear(viewGroup);
            return;
        }
        SecondCollapsedFloorConfigurator secondCollapsedFloorConfigurator = getSecondCollapsedFloorConfigurator();
        FloorConfigurator.FloorConfigurationParam floorConfig3 = getSecondFloorConfigurator().getFloorConfig();
        Intrinsics.f(floorConfig3);
        secondCollapsedFloorConfigurator.configFloor(viewGroup2, floorConfig3, new ShellNavBarFloorManager$configSecondFloor$2(getSecondCollapsedScrollController()));
        getSecondCollapsedScrollController().onOffsetChanged(prevOffset);
    }

    private final void configThirdFloor(ShellNavBarVO navBarVO, View thirdFloor) {
        if (thirdFloor == null) {
            return;
        }
        ThirdFloorConfigurator thirdFloorConfigurator = getThirdFloorConfigurator();
        FloorConfigurator.FloorConfigurationParam floorConfig = getSecondFloorConfigurator().getFloorConfig();
        if (floorConfig == null) {
            return;
        }
        thirdFloorConfigurator.configFloor(thirdFloor, floorConfig, navBarVO.getTeeth(), new ShellNavBarFloorManager$configThirdFloor$1(getThirdScrollController()));
    }

    private final void configZeroFloorIfExist(ShellNavBarVO navBarVO) {
        ViewGroup viewGroup;
        Map<String, ViewGroup> floorContainers = navBarVO.getFloorContainers();
        if (floorContainers == null || (viewGroup = floorContainers.get("zero")) == null) {
            return;
        }
        getZeroFloorConfigurator().configFloor(navBarVO, viewGroup, this.statusBarHeight, new ShellNavBarFloorManager$configZeroFloorIfExist$1$1(getZeroScrollController()));
    }

    private final void configureBackgroundView(ShellNavBarVO navBarVO, ShellNavBarBgView backgroundView, Integer prevOffset) {
        getBackgroundConfigurator().configBackground(backgroundView, navBarVO, this.configurators, prevOffset, new ShellNavBarFloorManager$configureBackgroundView$1(getBackgroundScrollController()));
    }

    static /* synthetic */ void configureBackgroundView$default(ShellNavBarFloorManager shellNavBarFloorManager, ShellNavBarVO shellNavBarVO, ShellNavBarBgView shellNavBarBgView, Integer num, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        shellNavBarFloorManager.configureBackgroundView(shellNavBarVO, shellNavBarBgView, num);
    }

    private final void firstFloorInsetsUpdated(ShellNavBarVO navBarVO) {
        Map<String, ViewGroup> floorContainers = navBarVO.getFloorContainers();
        if (floorContainers == null || floorContainers.get("top") == null) {
            return;
        }
        Map<String, ViewGroup> floorContainers2 = navBarVO.getFloorContainers();
        getFirstFloorConfigurator().onInsetsUpdated(this.statusBarHeight, (floorContainers2 == null || floorContainers2.get("zero") == null) ? null : getZeroFloorConfigurator().getFloorConfig(), new ShellNavBarFloorManager$firstFloorInsetsUpdated$1(getFirstScrollController()));
    }

    private final BackgroundConfigurator getBackgroundConfigurator() {
        return (BackgroundConfigurator) this.backgroundConfigurator.getValue();
    }

    private final BackgroundScrollController getBackgroundScrollController() {
        return (BackgroundScrollController) this.backgroundScrollController.getValue();
    }

    private final FirstFloorConfigurator getFirstFloorConfigurator() {
        return (FirstFloorConfigurator) this.firstFloorConfigurator.getValue();
    }

    private final FirstFloorScrollController getFirstScrollController() {
        return (FirstFloorScrollController) this.firstScrollController.getValue();
    }

    private final ScrollFloorConfigurator getScrollFloorConfigurator() {
        return (ScrollFloorConfigurator) this.scrollFloorConfigurator.getValue();
    }

    private final ScrollFloorScrollController getScrollFloorScrollController() {
        return (ScrollFloorScrollController) this.scrollFloorScrollController.getValue();
    }

    private final SecondCollapsedFloorConfigurator getSecondCollapsedFloorConfigurator() {
        return (SecondCollapsedFloorConfigurator) this.secondCollapsedFloorConfigurator.getValue();
    }

    private final SecondCollapsedFloorScrollController getSecondCollapsedScrollController() {
        return (SecondCollapsedFloorScrollController) this.secondCollapsedScrollController.getValue();
    }

    private final SecondFloorConfigurator getSecondFloorConfigurator() {
        return (SecondFloorConfigurator) this.secondFloorConfigurator.getValue();
    }

    private final SecondFloorScrollController getSecondScrollController() {
        return (SecondFloorScrollController) this.secondScrollController.getValue();
    }

    private final ThirdFloorConfigurator getThirdFloorConfigurator() {
        return (ThirdFloorConfigurator) this.thirdFloorConfigurator.getValue();
    }

    private final ThirdFloorScrollController getThirdScrollController() {
        return (ThirdFloorScrollController) this.thirdScrollController.getValue();
    }

    private final int getToolbarDefaultHeight() {
        return ((Number) this.toolbarDefaultHeight.getValue()).intValue();
    }

    private final ZeroFloorConfigurator getZeroFloorConfigurator() {
        return (ZeroFloorConfigurator) this.zeroFloorConfigurator.getValue();
    }

    private final ZeroFloorScrollController getZeroScrollController() {
        return (ZeroFloorScrollController) this.zeroScrollController.getValue();
    }

    private final void updateCollapsingToolbarLayoutParams(View thirdFloorView) {
        View floorView;
        ViewGroup.LayoutParams layoutParams = this.collapsingToolbar.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = null;
        }
        if (layoutParams == null) {
            return;
        }
        FloorConfigurator.FloorConfigurationParam floorConfig = getSecondFloorConfigurator().getFloorConfig();
        Integer valueOf = floorConfig != null ? Integer.valueOf(floorConfig.getMinBottomMargin()) : null;
        FloorConfigurator.FloorConfigurationParam floorConfig2 = getSecondFloorConfigurator().getFloorConfig();
        int measuredHeight = (Intrinsics.d(valueOf, floorConfig2 != null ? Integer.valueOf(floorConfig2.getDefaultBottomMargin()) : null) || thirdFloorView == null) ? 0 : thirdFloorView.getMeasuredHeight();
        FloorConfigurator.FloorConfigurationParam config = getBackgroundConfigurator().getConfig();
        int defaultBottomMargin = config != null ? config.getDefaultBottomMargin() : 0;
        FloorConfigurator.FloorConfigurationParam config2 = getBackgroundConfigurator().getConfig();
        int minBottomMargin = config2 != null ? config2.getMinBottomMargin() : 0;
        FloorConfigurator.FloorConfigurationParam floorConfig3 = getSecondFloorConfigurator().getFloorConfig();
        int defaultTopMargin = floorConfig3 != null ? floorConfig3.getDefaultTopMargin() : 0;
        FloorConfigurator.FloorConfigurationParam floorConfig4 = getSecondFloorConfigurator().getFloorConfig();
        int measuredHeight2 = defaultTopMargin + ((floorConfig4 == null || (floorView = floorConfig4.getFloorView()) == null) ? 0 : floorView.getMeasuredHeight());
        FloorConfigurator.FloorConfigurationParam floorConfig5 = getSecondFloorConfigurator().getFloorConfig();
        int minBottomMargin2 = measuredHeight2 + (floorConfig5 != null ? floorConfig5.getMinBottomMargin() : 0) + measuredHeight + defaultBottomMargin;
        if (layoutParams.height == minBottomMargin2) {
            return;
        }
        layoutParams.height = minBottomMargin2;
        this.collapsingToolbar.setLayoutParams(layoutParams);
        this.onHeightUpdated.invoke(Integer.valueOf(minBottomMargin2), Integer.valueOf(minBottomMargin));
    }

    public final void configViews(@NotNull ShellNavBarVO navBarVO, int statusBarHeight, @NotNull ShellNavBarBgView bgView, View thirdFloorView, int prevOffset) {
        Intrinsics.checkNotNullParameter(navBarVO, "navBarVO");
        Intrinsics.checkNotNullParameter(bgView, "bgView");
        this.statusBarHeight = statusBarHeight;
        this.thirdFloorView = thirdFloorView;
        configZeroFloorIfExist(navBarVO);
        configFirstFloorIfExist(navBarVO);
        configSecondFloor(navBarVO, thirdFloorView, prevOffset);
        configScrollFloorIfExist(navBarVO);
        configThirdFloor(navBarVO, thirdFloorView);
        getThirdScrollController().onOffsetChanged(prevOffset);
        configureBackgroundView(navBarVO, bgView, Integer.valueOf(prevOffset));
        updateCollapsingToolbarLayoutParams(thirdFloorView);
        this.placeholderListener.onNavbarConfigured();
    }

    public final void onInsetsUpdated(ShellNavBarVO navBarVO, int statusBarHeight, @NotNull ShellNavBarBgView backgroundView) {
        Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
        if (navBarVO == null || this.statusBarHeight == statusBarHeight) {
            return;
        }
        configZeroFloorIfExist(navBarVO);
        firstFloorInsetsUpdated(navBarVO);
        configureBackgroundView$default(this, navBarVO, backgroundView, null, 4, null);
        updateCollapsingToolbarLayoutParams(this.thirdFloorView);
    }

    public final void onNavbarOffsetChanged(int offset) {
        getZeroScrollController().onOffsetChanged(offset);
        getFirstScrollController().onOffsetChanged(offset);
        getSecondScrollController().onOffsetChanged(offset);
        getSecondCollapsedScrollController().onOffsetChanged(offset);
        getScrollFloorScrollController().onOffsetChanged(offset);
        getThirdScrollController().onOffsetChanged(offset);
        getBackgroundScrollController().onOffsetChanged(offset);
        updateCollapsingToolbarLayoutParams(this.thirdFloorView);
    }

    public final void onViewDetached() {
        Toolbar toolbar = this.toolbar;
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        toolbar.setLayoutParams(marginLayoutParams);
        Toolbar toolbar2 = this.toolbar;
        ViewGroup.LayoutParams layoutParams2 = toolbar2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = getToolbarDefaultHeight();
        toolbar2.setLayoutParams(layoutParams2);
        this.toolbar.setTranslationY(0.0f);
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbar;
        collapsingToolbarLayout.setClipToOutline(false);
        ViewGroup.LayoutParams layoutParams3 = collapsingToolbarLayout.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.height = getToolbarDefaultHeight();
        collapsingToolbarLayout.setLayoutParams(layoutParams3);
    }

    public final void setOnHeightUpdated(@NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onHeightUpdated = function2;
    }
}
