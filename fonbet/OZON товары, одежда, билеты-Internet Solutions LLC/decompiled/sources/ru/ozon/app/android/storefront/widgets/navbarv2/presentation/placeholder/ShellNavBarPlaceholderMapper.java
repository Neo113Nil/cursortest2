package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.placeholder;

import A00.a;
import Ej.b;
import I1.w;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.W;
import b20.C5521a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import gk0.q;
import id.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import kotlin.text.h;
import l10.i;
import l20.c;
import lk0.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.ui.buttonwidget.ButtonVO;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable;
import ru.ozon.app.android.storefront.navBar.v2.NavbarSaleUpdate;
import ru.ozon.app.android.storefront.widgets.navbarv2.data.ShellNavBarDTO;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.placeholder.ShellNavBarPlaceholderMapper;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views.ShellNavBarFloorViewGroup;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views.ShellNavBarScrollFloorView;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views.ThirdFloorView;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.RichPromoSettings;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarBackButtonVO;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarSpacings;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.ShellNavTitleVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0002¤\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0014J%\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010\u0014J7\u0010(\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180$2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u00182\b\u0010'\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b(\u0010)J9\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010,2\u0006\u0010*\u001a\u00020\u00182\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020/H\u0002¢\u0006\u0004\b3\u00101J\u000f\u00104\u001a\u00020/H\u0002¢\u0006\u0004\b4\u00101J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J7\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150$0\u0017*\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150$0\u0017H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0010H\u0002¢\u0006\u0004\b=\u0010\u0014J\u0017\u0010@\u001a\u00020\u00102\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ-\u0010D\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>2\u0006\u0010*\u001a\u00020\u00182\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0$H\u0002¢\u0006\u0004\bD\u0010EJ%\u0010H\u001a\u00020\u00102\f\u0010F\u001a\b\u0012\u0004\u0012\u00020B0$2\u0006\u0010G\u001a\u00020\u0018H\u0002¢\u0006\u0004\bH\u0010IJM\u0010W\u001a\u00020\u00102\u0010\u0010M\u001a\f\u0012\b\u0012\u00060Kj\u0002`L0J2\u0006\u0010O\u001a\u00020N2\n\u0010Q\u001a\u00060\u0015j\u0002`P2\u0006\u0010G\u001a\u00020\u00182\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020\u0019H\u0002¢\u0006\u0004\bU\u0010VJ)\u0010Z\u001a\u00020\u00062\u0010\u0010M\u001a\f\u0012\b\u0012\u00060Kj\u0002`L0J2\u0006\u0010G\u001a\u00020\u0018H\u0002¢\u0006\u0004\bX\u0010YJ)\u0010\\\u001a\u00020\u00062\u0010\u0010M\u001a\f\u0012\b\u0012\u00060Kj\u0002`L0J2\u0006\u0010G\u001a\u00020\u0018H\u0002¢\u0006\u0004\b[\u0010YJ-\u0010`\u001a\u00020B2\u0006\u0010]\u001a\u00020R2\b\u0010^\u001a\u0004\u0018\u00010B2\n\u0010_\u001a\u00060\u0015j\u0002`PH\u0002¢\u0006\u0004\b`\u0010aJ-\u0010c\u001a\u00020\u00102\u001c\u0010b\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0015j\u0002`P0$0\u0017H\u0002¢\u0006\u0004\bc\u0010dJ9\u0010h\u001a\u00020\u00102\u0006\u0010e\u001a\u00020R2\u0010\u0010f\u001a\f\u0012\b\u0012\u00060\u0015j\u0002`P0$2\u000e\u0010g\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010$H\u0002¢\u0006\u0004\bh\u0010iJ/\u0010j\u001a\u00020\u00062\u001e\u0010b\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0015j\u0002`P0$\u0018\u00010\u0017H\u0002¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u0006H\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020nH\u0002¢\u0006\u0004\bo\u0010pJ=\u0010t\u001a\u00020q2\u0006\u0010G\u001a\u00020\u00182\u0006\u0010r\u001a\u00020q2\n\u0010s\u001a\u00060Kj\u0002`L2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00192\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bt\u0010uJ'\u0010v\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\u00182\u0006\u0010r\u001a\u00020q2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bv\u0010wJ'\u0010z\u001a\u00020\u00102\u0006\u0010y\u001a\u00020x2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001fH\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020\u00102\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010~\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0019H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001c\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00192\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0082\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0083\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0084\u0001R\u0019\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0085\u0001R\u0015\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0084\u0001R%\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\by\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001RI\u0010\u0090\u0001\u001a4\u0012\u0004\u0012\u00020N\u0012\u000e\u0012\f\u0012\b\u0012\u00060Kj\u0002`L0J0\u008e\u0001j\u0019\u0012\u0004\u0012\u00020N\u0012\u000e\u0012\f\u0012\b\u0012\u00060Kj\u0002`L0J`\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001RC\u0010\u0092\u0001\u001a,\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0$0\u008e\u0001j\u0015\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0$`\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0091\u0001R)\u0010\u0095\u0001\u001a\u0014\u0012\u0004\u0012\u00020N0\u0093\u0001j\t\u0012\u0004\u0012\u00020N`\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u0097\u0001\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R2\u0010\u009f\u0001\u001a\u00020\u000e2\u0007\u0010\u0099\u0001\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0005\b\u009e\u0001\u0010\u0012R\u001f\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030¡\u00010 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001¨\u0006¥\u0001"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarPlaceholderMapper;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarStateListener;", "Ll10/i;", "container", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "parent", "", "hasBackButton", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewPond", "redesignedSearchBar", "<init>", "(Ll10/i;Lcom/google/android/material/appbar/CollapsingToolbarLayout;ZLru/ozon/composer/ui/widget/f;Z)V", "", "alpha", "", "onFloorAlphaChanged", "(F)V", "onNavbarConfigured", "()V", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "", "Landroid/view/ViewGroup;", "parsePlaceholders", "(Lru/ozon/composer/ui/widget/l;)Ljava/util/Map;", "detachNestedViewHolders", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "item", "Lkotlin/Function0;", "trackBackClick", "addPlaceholderWidgets", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;Lkotlin/jvm/functions/Function0;)V", "removeBusEventObserver", "", "floorsOrder", "expandedColor", "collapsedColor", "updateColors", "(Ljava/util/List;FLjava/lang/String;Ljava/lang/String;)V", "key", "currentMap", "Lkotlin/Pair;", "getOrCreateFloor", "(Ljava/lang/String;Ljava/util/Map;)Lkotlin/Pair;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarFloorViewGroup;", "createZeroFloor", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarFloorViewGroup;", "createFirstFloor", "createSecondFloor", "createFloor", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarScrollFloorView;", "createScrollFloor", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarScrollFloorView;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ThirdFloorView;", "createThirdFloor", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ThirdFloorView;", "filterPlaceholders", "(Ljava/util/Map;)Ljava/util/Map;", "observeComposerEvents", "LA00/a$J;", "event", "onEvent", "(LA00/a$J;)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarPlaceholderMapper$NavBarPlaceholder;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateCurrentPlaceholderOnEvent", "(LA00/a$J;Ljava/lang/String;Ljava/util/List;)Z", "placeholders", "placeholderKey", "addWidgetsIntoParent", "(Ljava/util/List;Ljava/lang/String;)V", "Lb20/a;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "holder", "", "hash", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "composerObject", "", "index", "viewParent", "onCreateViewHolder-8f5fQ8o", "(Lru/ozon/composer/ui/widget/k;JLru/ozon/composer/ui/widget/l;Ljava/lang/String;ILandroid/view/ViewGroup;)V", "onCreateViewHolder", "containsRepaintableWidgetAtCenterSecondFloor-IePB_f0", "(Lru/ozon/composer/ui/widget/k;Ljava/lang/String;)Z", "containsRepaintableWidgetAtCenterSecondFloor", "containsRepaintableWidgetAtScrollFloor-IePB_f0", "containsRepaintableWidgetAtScrollFloor", "placeHolderKeyHash", "currentObject", "remoteObject", "createNewPlaceholderObject", "(ILru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarPlaceholderMapper$NavBarPlaceholder;Lru/ozon/composer/ui/widget/l;)Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarPlaceholderMapper$NavBarPlaceholder;", "remotePlaceholders", "removeOldPlaceholders", "(Ljava/util/Map;)V", "placeholderKeyHash", "remoteObjects", "currentObjects", "removeOldPlaceholderPositions", "(ILjava/util/List;Ljava/util/List;)V", "containsSecondFloor", "(Ljava/util/Map;)Z", "containsSecondCollapsedFloor", "()Z", "Lru/ozon/app/android/storefront/navBar/v2/NavbarSaleUpdate;", "updateAddressVO", "(Lru/ozon/app/android/storefront/navBar/v2/NavbarSaleUpdate;)V", "Landroid/view/View;", "view", "vo", "updateHolderView", "(Ljava/lang/String;Landroid/view/View;Ll20/c;Landroid/view/ViewGroup;I)Landroid/view/View;", "setWidgetsId", "(Ljava/lang/String;Landroid/view/View;I)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarBackButtonVO;", "backButtonVO", "addBackIconIfNeeded", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarBackButtonVO;Lkotlin/jvm/functions/Function0;)V", "removeView", "(J)V", "removeParentIfEmpty", "(Landroid/view/ViewGroup;)V", "getHolderParent", "(Ljava/lang/String;)Landroid/view/ViewGroup;", "Ll10/i;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Z", "Lru/ozon/composer/ui/widget/f;", "floorContainers", "Ljava/util/Map;", "boundData", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarBackButtonVO;", "Lru/ozon/composer/ui/widget/a;", "widgetsFactory", "Lru/ozon/composer/ui/widget/a;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "currentViewHolders", "Ljava/util/HashMap;", "currentPlaceholders", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "repaintableVhHashSet", "Ljava/util/HashSet;", "dp44", "I", "<set-?>", "floorAlpha$delegate", "Lid/f;", "getFloorAlpha", "()F", "setFloorAlpha", "floorAlpha", "Landroidx/lifecycle/W;", "LA00/a;", "busObserver", "Landroidx/lifecycle/W;", "NavBarPlaceholder", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarPlaceholderMapper implements ShellNavBarStateListener {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {w.c(ShellNavBarPlaceholderMapper.class, "floorAlpha", "getFloorAlpha()F", 0)};
    public static final int $stable = 8;
    private ShellNavBarBackButtonVO backButtonVO;
    private ShellNavBarVO boundData;

    @NotNull
    private final W<a> busObserver;

    @NotNull
    private final i container;

    @NotNull
    private HashMap<String, List<NavBarPlaceholder>> currentPlaceholders;

    @NotNull
    private final HashMap<Long, C5521a<c>> currentViewHolders;
    private final int dp44;

    /* renamed from: floorAlpha$delegate, reason: from kotlin metadata */
    @NotNull
    private final f floorAlpha;

    @NotNull
    private Map<String, ? extends ViewGroup> floorContainers;
    private final boolean hasBackButton;

    @NotNull
    private final CollapsingToolbarLayout parent;
    private final boolean redesignedSearchBar;

    @NotNull
    private final HashSet<Long> repaintableVhHashSet;

    @NotNull
    private final ru.ozon.composer.ui.widget.f viewPond;

    @NotNull
    private final ru.ozon.composer.ui.widget.a widgetsFactory;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarPlaceholderMapper$NavBarPlaceholder;", "", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "viewObject", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "composerObject", "", "needRebind", "<init>", "(Ll20/c;Lru/ozon/composer/ui/widget/l;Z)V", "copy", "(Ll20/c;Lru/ozon/composer/ui/widget/l;Z)Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarPlaceholderMapper$NavBarPlaceholder;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ll20/c;", "getViewObject", "()Ll20/c;", "Lru/ozon/composer/ui/widget/l;", "getComposerObject", "()Lru/ozon/composer/ui/widget/l;", "Z", "getNeedRebind", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavBarPlaceholder {

        @NotNull
        private final l composerObject;
        private final boolean needRebind;

        @NotNull
        private final c viewObject;

        public NavBarPlaceholder(@NotNull c viewObject, @NotNull l composerObject, boolean z11) {
            Intrinsics.checkNotNullParameter(viewObject, "viewObject");
            Intrinsics.checkNotNullParameter(composerObject, "composerObject");
            this.viewObject = viewObject;
            this.composerObject = composerObject;
            this.needRebind = z11;
        }

        public static /* synthetic */ NavBarPlaceholder copy$default(NavBarPlaceholder navBarPlaceholder, c cVar, l lVar, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cVar = navBarPlaceholder.viewObject;
            }
            if ((i11 & 2) != 0) {
                lVar = navBarPlaceholder.composerObject;
            }
            if ((i11 & 4) != 0) {
                z11 = navBarPlaceholder.needRebind;
            }
            return navBarPlaceholder.copy(cVar, lVar, z11);
        }

        @NotNull
        public final NavBarPlaceholder copy(@NotNull c viewObject, @NotNull l composerObject, boolean needRebind) {
            Intrinsics.checkNotNullParameter(viewObject, "viewObject");
            Intrinsics.checkNotNullParameter(composerObject, "composerObject");
            return new NavBarPlaceholder(viewObject, composerObject, needRebind);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavBarPlaceholder)) {
                return false;
            }
            NavBarPlaceholder navBarPlaceholder = (NavBarPlaceholder) other;
            return Intrinsics.d(this.viewObject, navBarPlaceholder.viewObject) && Intrinsics.d(this.composerObject, navBarPlaceholder.composerObject) && this.needRebind == navBarPlaceholder.needRebind;
        }

        @NotNull
        public final l getComposerObject() {
            return this.composerObject;
        }

        public final boolean getNeedRebind() {
            return this.needRebind;
        }

        @NotNull
        public final c getViewObject() {
            return this.viewObject;
        }

        public int hashCode() {
            return Boolean.hashCode(this.needRebind) + ((this.composerObject.hashCode() + (this.viewObject.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            c cVar = this.viewObject;
            l lVar = this.composerObject;
            boolean z11 = this.needRebind;
            StringBuilder sb2 = new StringBuilder("NavBarPlaceholder(viewObject=");
            sb2.append(cVar);
            sb2.append(", composerObject=");
            sb2.append(lVar);
            sb2.append(", needRebind=");
            return Pk0.a.a(")", sb2, z11);
        }
    }

    public ShellNavBarPlaceholderMapper(@NotNull i container, @NotNull CollapsingToolbarLayout parent, boolean z11, @NotNull ru.ozon.composer.ui.widget.f viewPond, boolean z12) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(viewPond, "viewPond");
        this.container = container;
        this.parent = parent;
        this.hasBackButton = z11;
        this.viewPond = viewPond;
        this.redesignedSearchBar = z12;
        this.floorContainers = new HashMap();
        this.widgetsFactory = container.d0();
        this.currentViewHolders = new HashMap<>();
        this.currentPlaceholders = new HashMap<>();
        this.repaintableVhHashSet = new HashSet<>();
        this.dp44 = UiExtKt.toPx(44);
        final Float valueOf = Float.valueOf(1.0f);
        this.floorAlpha = new id.c<Float>(valueOf) { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.placeholder.ShellNavBarPlaceholderMapper$special$$inlined$observable$1
            @Override // id.c
            protected void afterChange(m<?> property, Float oldValue, Float newValue) {
                ShellNavBarBackButtonVO shellNavBarBackButtonVO;
                Intrinsics.checkNotNullParameter(property, "property");
                float floatValue = newValue.floatValue();
                if (oldValue.floatValue() == floatValue) {
                    return;
                }
                ShellNavBarPlaceholderMapper shellNavBarPlaceholderMapper = this;
                Iterator it = shellNavBarPlaceholderMapper.repaintableVhHashSet.iterator();
                while (it.hasNext()) {
                    C5521a c5521a = (C5521a) shellNavBarPlaceholderMapper.currentViewHolders.get(Long.valueOf(((Number) it.next()).longValue()));
                    k d11 = c5521a != null ? c5521a.d() : null;
                    if (d11 == null) {
                        d11 = null;
                    }
                    NavBarRepaintable navBarRepaintable = d11 instanceof NavBarRepaintable ? (NavBarRepaintable) d11 : null;
                    if (navBarRepaintable != null) {
                        navBarRepaintable.onFloorAlphaChanged(floatValue);
                    }
                }
                shellNavBarBackButtonVO = this.backButtonVO;
                if (shellNavBarBackButtonVO == null || shellNavBarBackButtonVO.getDynamicOnScrollColors() == null) {
                    return;
                }
                this.updateColors(shellNavBarBackButtonVO.getFloorsOrder(), floatValue, shellNavBarBackButtonVO.getDynamicOnScrollColors().getIconTintColorExpanded(), shellNavBarBackButtonVO.getDynamicOnScrollColors().getIconTintColorCollapsed());
            }
        };
        this.busObserver = new W() { // from class: iL.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                ShellNavBarPlaceholderMapper.busObserver$lambda$3(ShellNavBarPlaceholderMapper.this, (A00.a) obj);
            }
        };
        observeComposerEvents();
    }

    private final void addBackIconIfNeeded(ShellNavBarBackButtonVO backButtonVO, Function0<Unit> trackBackClick) {
        Object obj;
        Set h11;
        if (!this.hasBackButton) {
            Iterator<Map.Entry<String, ? extends ViewGroup>> it = this.floorContainers.entrySet().iterator();
            while (it.hasNext()) {
                ViewGroup value = it.next().getValue();
                ShellNavBarFloorViewGroup shellNavBarFloorViewGroup = value instanceof ShellNavBarFloorViewGroup ? (ShellNavBarFloorViewGroup) value : null;
                if (shellNavBarFloorViewGroup != null) {
                    ShellNavBarFloorViewGroup.setBackButtonView$default(shellNavBarFloorViewGroup, null, null, 2, null);
                }
            }
            return;
        }
        List<String> floorsOrder = (!containsSecondCollapsedFloor() || backButtonVO.getFloorsOrder().contains("secondCollapsed")) ? backButtonVO.getFloorsOrder() : C7714v.q0("secondCollapsed", backButtonVO.getFloorsOrder());
        if (!Intrinsics.d(floorsOrder, backButtonVO.getFloorsOrder())) {
            backButtonVO = ShellNavBarBackButtonVO.copy$default(backButtonVO, null, floorsOrder, null, 5, null);
        }
        Iterator<T> it2 = backButtonVO.getFloorsOrder().iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (this.floorContainers.containsKey((String) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (Intrinsics.d(str, "second") && containsSecondCollapsedFloor()) {
            String[] elements = {"second", "secondCollapsed"};
            Intrinsics.checkNotNullParameter(elements, "elements");
            h11 = C7705l.j0(elements);
        } else {
            h11 = str != null ? e0.h(str) : M.f71699a;
        }
        for (Map.Entry<String, ? extends ViewGroup> entry : this.floorContainers.entrySet()) {
            String key = entry.getKey();
            ViewGroup value2 = entry.getValue();
            ShellNavBarFloorViewGroup shellNavBarFloorViewGroup2 = value2 instanceof ShellNavBarFloorViewGroup ? (ShellNavBarFloorViewGroup) value2 : null;
            if (shellNavBarFloorViewGroup2 != null) {
                if (h11.contains(key)) {
                    shellNavBarFloorViewGroup2.setBackButtonView(backButtonVO.getBackButtonDTO(), trackBackClick);
                } else {
                    ShellNavBarFloorViewGroup.setBackButtonView$default(shellNavBarFloorViewGroup2, null, null, 2, null);
                }
            }
        }
        this.backButtonVO = backButtonVO;
    }

    private final void addWidgetsIntoParent(List<NavBarPlaceholder> placeholders, String placeholderKey) {
        String str;
        ShellNavBarPlaceholderMapper shellNavBarPlaceholderMapper;
        ViewGroup viewGroup;
        int i11 = 0;
        for (Object obj : placeholders) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            NavBarPlaceholder navBarPlaceholder = (NavBarPlaceholder) obj;
            l composerObject = navBarPlaceholder.getComposerObject();
            long id2 = composerObject.d().getId() + placeholderKey.hashCode();
            if (this.currentViewHolders.containsKey(Long.valueOf(id2))) {
                C5521a<c> c5521a = this.currentViewHolders.get(Long.valueOf(id2));
                k d11 = c5521a != null ? c5521a.d() : null;
                if (d11 != null) {
                    k d12 = C5521a.b(d11).d();
                    View itemView = d12.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    c viewObject = navBarPlaceholder.getViewObject();
                    ViewParent parent = d12.itemView.getParent();
                    if (parent instanceof ViewGroup) {
                        viewGroup = (ViewGroup) parent;
                        str = placeholderKey;
                        shellNavBarPlaceholderMapper = this;
                    } else {
                        viewGroup = null;
                        shellNavBarPlaceholderMapper = this;
                        str = placeholderKey;
                    }
                    shellNavBarPlaceholderMapper.updateHolderView(str, itemView, viewObject, viewGroup, i11);
                } else {
                    shellNavBarPlaceholderMapper = this;
                    str = placeholderKey;
                }
                if (navBarPlaceholder.getNeedRebind()) {
                    C5521a<c> c5521a2 = shellNavBarPlaceholderMapper.currentViewHolders.get(Long.valueOf(id2));
                    k d13 = c5521a2 != null ? c5521a2.d() : null;
                    if (d13 != null) {
                        C5521a.a(d13, composerObject, shellNavBarPlaceholderMapper.viewPond);
                    }
                }
            } else {
                str = placeholderKey;
                ViewGroup holderParent = getHolderParent(str);
                if (holderParent == null) {
                    return;
                }
                ru.ozon.composer.ui.widget.i iVar = new ru.ozon.composer.ui.widget.i(holderParent, this.container);
                this.widgetsFactory.c(iVar, composerObject);
                k<c> source = this.widgetsFactory.f(iVar, composerObject.j());
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    m1042onCreateViewHolder8f5fQ8o(source, id2, composerObject, str, i11, holderParent);
                    str = str;
                }
                removeParentIfEmpty(holderParent);
            }
            placeholderKey = str;
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void busObserver$lambda$3(ShellNavBarPlaceholderMapper shellNavBarPlaceholderMapper, a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.J) {
            shellNavBarPlaceholderMapper.onEvent((a.J) event);
        }
    }

    /* renamed from: containsRepaintableWidgetAtCenterSecondFloor-IePB_f0, reason: not valid java name */
    private final boolean m1040containsRepaintableWidgetAtCenterSecondFloorIePB_f0(k holder, String placeholderKey) {
        List<NavBarPlaceholder> list;
        NavBarPlaceholder navBarPlaceholder;
        l composerObject;
        if (holder instanceof NavBarRepaintable) {
            if (h.t(placeholderKey, "secondDefault", false)) {
                return true;
            }
            if (h.t(placeholderKey, "secondRight", false) && (list = this.currentPlaceholders.get("secondDefault")) != null && (navBarPlaceholder = (NavBarPlaceholder) C7714v.M(list)) != null && (composerObject = navBarPlaceholder.getComposerObject()) != null) {
                C5521a<c> c5521a = this.currentViewHolders.get(Long.valueOf(composerObject.f() - 1226506451));
                k d11 = c5521a != null ? c5521a.d() : null;
                if (d11 != null) {
                    return d11 instanceof NavBarRepaintable;
                }
            }
        }
        return false;
    }

    /* renamed from: containsRepaintableWidgetAtScrollFloor-IePB_f0, reason: not valid java name */
    private final boolean m1041containsRepaintableWidgetAtScrollFloorIePB_f0(k holder, String placeholderKey) {
        List<NavBarPlaceholder> list;
        NavBarPlaceholder navBarPlaceholder;
        l composerObject;
        if ((holder instanceof NavBarRepaintable) && h.t(placeholderKey, "scrollDefault", false) && (list = this.currentPlaceholders.get("scrollDefault")) != null && (navBarPlaceholder = (NavBarPlaceholder) C7714v.M(list)) != null && (composerObject = navBarPlaceholder.getComposerObject()) != null) {
            C5521a<c> c5521a = this.currentViewHolders.get(Long.valueOf(composerObject.f() + 2003351220));
            k d11 = c5521a != null ? c5521a.d() : null;
            if (d11 != null) {
                return d11 instanceof NavBarRepaintable;
            }
        }
        return false;
    }

    private final boolean containsSecondCollapsedFloor() {
        return this.currentPlaceholders.containsKey("secondCollapsedDefault");
    }

    private final boolean containsSecondFloor(Map<String, ? extends List<l>> remotePlaceholders) {
        String value = ShellNavBarDTO.NestedPlaceholders.NESTED_PLACEHOLDER_SECOND_DEFAULT.getValue();
        if (remotePlaceholders != null) {
            return remotePlaceholders.containsKey(value);
        }
        return false;
    }

    private final ShellNavBarFloorViewGroup createFirstFloor() {
        ShellNavBarSpacings spacings;
        ShellNavBarFloorViewGroup createFloor = createFloor();
        CollapsingToolbarLayout.a aVar = new CollapsingToolbarLayout.a(-2);
        aVar.a(2);
        aVar.b(1.0f);
        createFloor.setLayoutParams(aVar);
        createFloor.setMinimumHeight(this.dp44);
        ShellNavBarVO shellNavBarVO = this.boundData;
        createFloor.resolvePaddings((shellNavBarVO == null || (spacings = shellNavBarVO.getSpacings()) == null) ? null : spacings.getLevel1HorizontalPaddings());
        return createFloor;
    }

    private final ShellNavBarFloorViewGroup createFloor() {
        ShellNavBarFloorViewGroup shellNavBarFloorViewGroup = (ShellNavBarFloorViewGroup) q.f64554a.i(N.b(ShellNavBarFloorViewGroup.class), this.container.L());
        if (shellNavBarFloorViewGroup == null) {
            Context L11 = this.container.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            shellNavBarFloorViewGroup = new ShellNavBarFloorViewGroup(L11, null, 0, 6, null);
        }
        if (this.redesignedSearchBar) {
            shellNavBarFloorViewGroup.setRedesignedSearchBar();
        }
        return shellNavBarFloorViewGroup;
    }

    private final NavBarPlaceholder createNewPlaceholderObject(int placeHolderKeyHash, NavBarPlaceholder currentObject, l remoteObject) {
        if (currentObject != null && (remoteObject.j() != currentObject.getComposerObject().j() || remoteObject.d().getId() != currentObject.getViewObject().getId())) {
            removeView(currentObject.getComposerObject().d().getId() + placeHolderKeyHash);
        }
        return new NavBarPlaceholder(remoteObject.d(), remoteObject, !(Intrinsics.d(remoteObject.d(), currentObject != null ? currentObject.getViewObject() : null) && Intrinsics.d(remoteObject.g(), currentObject.getComposerObject().g())));
    }

    private final ShellNavBarScrollFloorView createScrollFloor() {
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        ShellNavBarScrollFloorView shellNavBarScrollFloorView = new ShellNavBarScrollFloorView(L11, null, 0, 6, null);
        shellNavBarScrollFloorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        shellNavBarScrollFloorView.setRecyclerComposer(ComposerViewExtensionKt.composerRecyclerView(this.container.Y()));
        return shellNavBarScrollFloorView;
    }

    private final ShellNavBarFloorViewGroup createSecondFloor() {
        ShellNavBarSpacings spacings;
        ShellNavBarFloorViewGroup createFloor = createFloor();
        createFloor.setMinimumHeight(this.dp44);
        ShellNavBarVO shellNavBarVO = this.boundData;
        createFloor.resolvePaddings((shellNavBarVO == null || (spacings = shellNavBarVO.getSpacings()) == null) ? null : spacings.getLevel2HorizontalPaddings());
        return createFloor;
    }

    private final ThirdFloorView createThirdFloor() {
        ShellNavBarSpacings spacings;
        ThirdFloorView thirdFloorView = (ThirdFloorView) q.f64554a.i(N.b(ThirdFloorView.class), this.container.L());
        if (thirdFloorView == null) {
            Context L11 = this.container.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            thirdFloorView = new ThirdFloorView(L11, null, 0, 6, null);
        }
        ShellNavBarVO shellNavBarVO = this.boundData;
        thirdFloorView.resolvePaddings((shellNavBarVO == null || (spacings = shellNavBarVO.getSpacings()) == null) ? null : spacings.getLevel3HorizontalPaddings());
        return thirdFloorView;
    }

    private final ShellNavBarFloorViewGroup createZeroFloor() {
        ShellNavBarFloorViewGroup createFloor = createFloor();
        CollapsingToolbarLayout.a aVar = new CollapsingToolbarLayout.a(-2);
        aVar.a(2);
        aVar.b(1.0f);
        createFloor.setLayoutParams(aVar);
        createFloor.setMinimumHeight(this.dp44);
        return createFloor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Map<String, List<l>> filterPlaceholders(Map<String, ? extends List<l>> map) {
        if (map.get("secondCollapsedDefault") != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!Intrinsics.d(entry.getKey(), "secondCollapsedRight")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float getFloorAlpha() {
        return ((Number) this.floorAlpha.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    private final ViewGroup getHolderParent(String key) {
        ViewGroup viewGroup;
        Iterator<Map.Entry<String, ? extends ViewGroup>> it = this.floorContainers.entrySet().iterator();
        do {
            viewGroup = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ? extends ViewGroup> next = it.next();
            if (h.t(key, next.getKey(), false)) {
                viewGroup = next.getValue();
            }
        } while (viewGroup == null);
        return viewGroup;
    }

    private final Pair<String, ViewGroup> getOrCreateFloor(String key, Map<String, ? extends ViewGroup> currentMap) {
        if (h.t(key, "zero", false)) {
            ViewGroup viewGroup = this.floorContainers.get("zero");
            if (viewGroup == null && (viewGroup = currentMap.get("zero")) == null) {
                viewGroup = createZeroFloor();
            }
            return new Pair<>("zero", viewGroup);
        }
        if (h.t(key, "top", false)) {
            ViewGroup viewGroup2 = this.floorContainers.get("top");
            if (viewGroup2 == null && (viewGroup2 = currentMap.get("top")) == null) {
                viewGroup2 = createFirstFloor();
            }
            return new Pair<>("top", viewGroup2);
        }
        if (h.t(key, "secondCollapsed", false)) {
            ViewGroup viewGroup3 = this.floorContainers.get("secondCollapsed");
            if (viewGroup3 == null && (viewGroup3 = currentMap.get("secondCollapsed")) == null) {
                viewGroup3 = createSecondFloor();
            }
            return new Pair<>("secondCollapsed", viewGroup3);
        }
        if (h.t(key, "second", false)) {
            ViewGroup viewGroup4 = this.floorContainers.get("second");
            if (viewGroup4 == null && (viewGroup4 = currentMap.get("second")) == null) {
                viewGroup4 = createSecondFloor();
            }
            return new Pair<>("second", viewGroup4);
        }
        if (h.t(key, "scroll", false)) {
            ViewGroup viewGroup5 = this.floorContainers.get("scroll");
            if (viewGroup5 == null && (viewGroup5 = currentMap.get("scroll")) == null) {
                viewGroup5 = createScrollFloor();
            }
            return new Pair<>("scroll", viewGroup5);
        }
        if (!h.t(key, "third", false)) {
            return null;
        }
        ViewGroup viewGroup6 = this.floorContainers.get("third");
        if (viewGroup6 == null && (viewGroup6 = currentMap.get("third")) == null) {
            viewGroup6 = createThirdFloor();
        }
        return new Pair<>("third", viewGroup6);
    }

    private final void observeComposerEvents() {
        this.container.M().getEvents().observe(this.container.K().f(), this.busObserver);
    }

    /* renamed from: onCreateViewHolder-8f5fQ8o, reason: not valid java name */
    private final void m1042onCreateViewHolder8f5fQ8o(k holder, long hash, l composerObject, String placeholderKey, int index, ViewGroup viewParent) {
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        updateHolderView(placeholderKey, itemView, composerObject.d(), viewParent, index);
        C5521a.c(holder, AbstractC5434v.b.CREATED);
        if (composerObject.d() instanceof NavbarSaleUpdate) {
            c d11 = composerObject.d();
            Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.storefront.navBar.v2.NavbarSaleUpdate");
            updateAddressVO((NavbarSaleUpdate) d11);
        }
        C5521a.a(holder, composerObject, this.viewPond);
        Intrinsics.checkNotNullParameter(composerObject, "widgetViewItem");
        holder.track(composerObject);
        C5521a.c(holder, AbstractC5434v.b.RESUMED);
        this.currentViewHolders.put(Long.valueOf(hash), C5521a.b(holder));
        if (m1040containsRepaintableWidgetAtCenterSecondFloorIePB_f0(holder, placeholderKey) || m1041containsRepaintableWidgetAtScrollFloorIePB_f0(holder, placeholderKey)) {
            this.repaintableVhHashSet.add(Long.valueOf(hash));
        }
        if (viewParent instanceof ThirdFloorView) {
            viewParent.addView(holder.itemView);
            return;
        }
        if (viewParent instanceof ShellNavBarFloorViewGroup) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            ((ShellNavBarFloorViewGroup) viewParent).setView(index, new ShellNavBarFloorViewGroup.ViewData(placeholderKey, itemView2, composerObject.d()));
        } else if (viewParent instanceof ShellNavBarScrollFloorView) {
            viewParent.addView(holder.itemView);
        }
    }

    private final void onEvent(a.J event) {
        for (Map.Entry<String, List<NavBarPlaceholder>> entry : this.currentPlaceholders.entrySet()) {
            updateCurrentPlaceholderOnEvent(event, entry.getKey(), entry.getValue());
        }
    }

    private final void removeOldPlaceholderPositions(int placeholderKeyHash, List<l> remoteObjects, List<NavBarPlaceholder> currentObjects) {
        NavBarPlaceholder navBarPlaceholder;
        l composerObject;
        c d11;
        if (remoteObjects.size() < (currentObjects != null ? currentObjects.size() : 0)) {
            int size = currentObjects != null ? currentObjects.size() : 0;
            for (int size2 = remoteObjects.size(); size2 < size; size2++) {
                removeView((currentObjects == null || (navBarPlaceholder = (NavBarPlaceholder) C7714v.Q(size2, currentObjects)) == null || (composerObject = navBarPlaceholder.getComposerObject()) == null || (d11 = composerObject.d()) == null) ? 0L : d11.getId() + placeholderKeyHash);
            }
        }
    }

    private final void removeOldPlaceholders(Map<String, ? extends List<l>> remotePlaceholders) {
        Unit unit;
        Set<String> keySet = this.currentPlaceholders.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        Set d11 = e0.d(keySet, remotePlaceholders.keySet());
        ArrayList arrayList = new ArrayList(C7714v.z(d11, 10));
        Iterator it = d11.iterator();
        while (it.hasNext()) {
            List<NavBarPlaceholder> list = this.currentPlaceholders.get((String) it.next());
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    removeView(((NavBarPlaceholder) it2.next()).getComposerObject().d().getId() + r1.hashCode());
                }
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
            arrayList.add(unit);
        }
    }

    private final void removeParentIfEmpty(ViewGroup parent) {
        if (parent.getChildCount() > 0) {
            return;
        }
        ViewParent parent2 = parent.getParent();
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.removeView(parent);
        }
    }

    private final void removeView(long hash) {
        View view;
        C5521a<c> c5521a = this.currentViewHolders.get(Long.valueOf(hash));
        k d11 = c5521a != null ? c5521a.d() : null;
        if (d11 != null) {
            C5521a.c(d11, AbstractC5434v.b.DESTROYED);
        }
        if (d11 != null && (view = d11.itemView) != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        this.repaintableVhHashSet.remove(Long.valueOf(hash));
        this.currentViewHolders.remove(Long.valueOf(hash));
    }

    private final void setFloorAlpha(float f7) {
        this.floorAlpha.setValue(this, $$delegatedProperties[0], Float.valueOf(f7));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r2.equals("topDefault") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r2.equals("zeroDefault") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r2.equals("secondDefault") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r2.equals("secondCollapsedDefault") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r2.equals("thirdDefault") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r2.equals("scrollDefault") == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setWidgetsId(String placeholderKey, View view, int index) {
        String str;
        switch (placeholderKey.hashCode()) {
            case -2059249958:
                str = "thirdDefault";
                break;
            case -1515111298:
                str = "secondCollapsedDefault";
                break;
            case -1226506451:
                str = "secondDefault";
                break;
            case -978346553:
                if (placeholderKey.equals("topRight")) {
                    str = b.a(index, "topRight");
                    break;
                }
                str = "";
                break;
            case -182928300:
                if (placeholderKey.equals("zeroRight")) {
                    str = b.a(index, "zeroRight");
                    break;
                }
                str = "";
                break;
            case 253113864:
                if (placeholderKey.equals("secondRight")) {
                    str = b.a(index, "secondRight");
                    break;
                }
                str = "";
                break;
            case 643768953:
                str = "zeroDefault";
                break;
            case 751006508:
                str = "topDefault";
                break;
            case 1942197145:
                if (placeholderKey.equals("secondCollapsedRight")) {
                    str = b.a(index, "secondCollapsedRight");
                    break;
                }
                str = "";
                break;
            case 2003351220:
                str = "scrollDefault";
                break;
            default:
                str = "";
                break;
        }
        view.setContentDescription(str);
    }

    private final void updateAddressVO(NavbarSaleUpdate item) {
        if (this.currentPlaceholders.containsKey(ShellNavBarDTO.NestedPlaceholders.NESTED_PLACEHOLDER_THIRD_DEFAULT.getValue())) {
            item.setSaleActive(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    private final boolean updateCurrentPlaceholderOnEvent(a.J event, String key, List<NavBarPlaceholder> value) {
        l lVar;
        if (getHolderParent(key) != null) {
            I00.a<l> s11 = this.container.J().s();
            a.J.InterfaceC0007a d11 = event.d();
            List<NavBarPlaceholder> list = value;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((NavBarPlaceholder) it.next()).getComposerObject());
            }
            ArrayList c11 = s11.c(d11, arrayList);
            if (c11 != null) {
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    NavBarPlaceholder navBarPlaceholder = (NavBarPlaceholder) obj;
                    Iterator it2 = c11.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            lVar = 0;
                            break;
                        }
                        lVar = it2.next();
                        if (((l) lVar).d().getId() == navBarPlaceholder.getComposerObject().d().getId()) {
                            break;
                        }
                    }
                    l widgetViewItem = lVar;
                    if (widgetViewItem != null) {
                        C5521a<c> c5521a = this.currentViewHolders.get(Long.valueOf(navBarPlaceholder.getComposerObject().d().getId() + key.hashCode()));
                        k d12 = c5521a != null ? c5521a.d() : null;
                        if (d12 != null) {
                            ru.ozon.composer.ui.widget.f viewedPond = this.viewPond;
                            Object g10 = this.widgetsFactory.g(navBarPlaceholder.getComposerObject(), widgetViewItem);
                            Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
                            Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
                            c d13 = widgetViewItem.d();
                            Intrinsics.g(d13, "null cannot be cast to non-null type I of ru.ozon.composer.ui.widget.nested.PlaceholderWidgetViewHolder");
                            d12.bind$composer_recycler_ui_release(widgetViewItem, d13, viewedPond, null, g10);
                        }
                        List<NavBarPlaceholder> list2 = this.currentPlaceholders.get(key);
                        if (list2 != null) {
                            ArrayList W02 = C7714v.W0(list2);
                            W02.set(i11, NavBarPlaceholder.copy$default((NavBarPlaceholder) W02.get(i11), widgetViewItem.d(), widgetViewItem, false, 4, null));
                            this.currentPlaceholders.put(key, W02);
                        }
                    }
                    i11 = i12;
                }
                return true;
            }
        }
        return false;
    }

    private final View updateHolderView(String placeholderKey, View view, c vo, ViewGroup parent, int index) {
        if (!(vo instanceof ButtonVO)) {
            view.setMinimumHeight(this.dp44);
            view.setMinimumWidth(this.dp44);
        }
        ShellNavBarFloorViewGroup.Gravity gravity = vo instanceof ShellNavTitleVO ? ShellNavBarFloorViewGroup.Gravity.CENTER : ShellNavBarFloorViewGroup.Gravity.START;
        if (Intrinsics.d(placeholderKey, "topDefault")) {
            view.setBackgroundColor(0);
        }
        setWidgetsId(placeholderKey, view, index);
        if (h.A(placeholderKey, "Default", false)) {
            ShellNavBarFloorViewGroup shellNavBarFloorViewGroup = parent instanceof ShellNavBarFloorViewGroup ? (ShellNavBarFloorViewGroup) parent : null;
            if (shellNavBarFloorViewGroup != null) {
                shellNavBarFloorViewGroup.setGravity(gravity);
            }
        }
        return view;
    }

    public final void addPlaceholderWidgets(@NotNull ShellNavBarVO item, Function0<Unit> trackBackClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        for (Map.Entry<String, List<NavBarPlaceholder>> entry : this.currentPlaceholders.entrySet()) {
            addWidgetsIntoParent(entry.getValue(), entry.getKey());
        }
        addBackIconIfNeeded(item.getBackIconVO(), trackBackClick);
    }

    public final void detachNestedViewHolders() {
        Collection<C5521a<c>> values = this.currentViewHolders.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.repaintableVhHashSet.clear();
                this.currentViewHolders.clear();
                this.backButtonVO = null;
                return;
            } else {
                k d11 = ((C5521a) it.next()).d();
                C5521a.c(d11, AbstractC5434v.b.DESTROYED);
                ViewParent parent = d11.itemView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(d11.itemView);
                }
            }
        }
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.placeholder.ShellNavBarStateListener
    public void onFloorAlphaChanged(float alpha) {
        setFloorAlpha(alpha);
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.placeholder.ShellNavBarStateListener
    public void onNavbarConfigured() {
        RichPromoSettings richPromoSettings;
        RichPromoSettings richPromoSettings2;
        ViewGroup viewGroup = this.floorContainers.get("third");
        boolean z11 = (viewGroup == null || viewGroup.getChildCount() == 0) ? false : true;
        boolean z12 = this.floorContainers.get("scroll") != null;
        ShellNavBarVO shellNavBarVO = this.boundData;
        boolean isRichPromoEnabled = (shellNavBarVO == null || (richPromoSettings2 = shellNavBarVO.getRichPromoSettings()) == null) ? false : richPromoSettings2.getIsRichPromoEnabled();
        ShellNavBarVO shellNavBarVO2 = this.boundData;
        boolean isPromoScrolled = (shellNavBarVO2 == null || (richPromoSettings = shellNavBarVO2.getRichPromoSettings()) == null) ? false : richPromoSettings.getIsPromoScrolled();
        float f7 = 1.0f;
        if (isRichPromoEnabled && isPromoScrolled) {
            Iterator it = this.repaintableVhHashSet.iterator();
            while (it.hasNext()) {
                C5521a c5521a = (C5521a) this.currentViewHolders.get(Long.valueOf(((Number) it.next()).longValue()));
                d d11 = c5521a != null ? c5521a.d() : null;
                if (d11 == null) {
                    d11 = null;
                }
                NavBarRepaintable navBarRepaintable = d11 instanceof NavBarRepaintable ? (NavBarRepaintable) d11 : null;
                if (navBarRepaintable != null) {
                    navBarRepaintable.onNavbarConfigured(true, 0.0f);
                }
            }
        } else if (isRichPromoEnabled) {
            Iterator it2 = this.repaintableVhHashSet.iterator();
            while (it2.hasNext()) {
                C5521a c5521a2 = (C5521a) this.currentViewHolders.get(Long.valueOf(((Number) it2.next()).longValue()));
                d d12 = c5521a2 != null ? c5521a2.d() : null;
                if (d12 == null) {
                    d12 = null;
                }
                NavBarRepaintable navBarRepaintable2 = d12 instanceof NavBarRepaintable ? (NavBarRepaintable) d12 : null;
                if (navBarRepaintable2 != null) {
                    navBarRepaintable2.onNavbarConfigured(true, 1.0f);
                }
            }
        } else {
            Iterator it3 = this.repaintableVhHashSet.iterator();
            while (it3.hasNext()) {
                C5521a c5521a3 = (C5521a) this.currentViewHolders.get(Long.valueOf(((Number) it3.next()).longValue()));
                d d13 = c5521a3 != null ? c5521a3.d() : null;
                if (d13 == null) {
                    d13 = null;
                }
                NavBarRepaintable navBarRepaintable3 = d13 instanceof NavBarRepaintable ? (NavBarRepaintable) d13 : null;
                if (navBarRepaintable3 != null) {
                    navBarRepaintable3.onNavbarConfigured(z11 || z12, getFloorAlpha());
                }
            }
        }
        if (isPromoScrolled) {
            f7 = 0.0f;
        } else if (z11) {
            f7 = getFloorAlpha();
        }
        ShellNavBarBackButtonVO shellNavBarBackButtonVO = this.backButtonVO;
        if (shellNavBarBackButtonVO == null || shellNavBarBackButtonVO.getDynamicOnScrollColors() == null) {
            return;
        }
        updateColors(shellNavBarBackButtonVO.getFloorsOrder(), f7, shellNavBarBackButtonVO.getDynamicOnScrollColors().getIconTintColorExpanded(), shellNavBarBackButtonVO.getDynamicOnScrollColors().getIconTintColorCollapsed());
    }

    @NotNull
    public final Map<String, ViewGroup> parsePlaceholders(@NotNull l viewItem) {
        Map<String, ? extends List<l>> g10;
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        if ((viewItem.d() instanceof ShellNavBarVO) && (g10 = viewItem.g()) != null) {
            c d11 = viewItem.d();
            Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO");
            this.boundData = (ShellNavBarVO) d11;
            Map<String, List<l>> filterPlaceholders = filterPlaceholders(g10);
            if (!containsSecondFloor(filterPlaceholders)) {
                return U.c();
            }
            HashMap<String, List<NavBarPlaceholder>> hashMap = new HashMap<>();
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, List<l>> entry : filterPlaceholders.entrySet()) {
                String key = entry.getKey();
                List<l> value = entry.getValue();
                List<NavBarPlaceholder> list = this.currentPlaceholders.get(key);
                ArrayList arrayList = new ArrayList();
                removeOldPlaceholderPositions(key.hashCode(), value, list);
                int i11 = 0;
                for (Object obj : value) {
                    int i12 = i11 + 1;
                    NavBarPlaceholder navBarPlaceholder = null;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    l lVar = (l) obj;
                    if (list != null) {
                        navBarPlaceholder = (NavBarPlaceholder) C7714v.Q(i11, list);
                    }
                    arrayList.add(i11, createNewPlaceholderObject(key.hashCode(), navBarPlaceholder, lVar));
                    i11 = i12;
                }
                hashMap.put(key, arrayList);
                Pair<String, ViewGroup> orCreateFloor = getOrCreateFloor(key, hashMap2);
                if (orCreateFloor != null) {
                    hashMap2.put(orCreateFloor.e(), orCreateFloor.f());
                }
            }
            removeOldPlaceholders(filterPlaceholders);
            this.currentPlaceholders = hashMap;
            this.floorContainers = hashMap2;
            return hashMap2;
        }
        return U.c();
    }

    public final void removeBusEventObserver() {
        this.container.M().getEvents().removeObserver(this.busObserver);
    }

    public final void updateColors(@NotNull List<String> floorsOrder, float alpha, String expandedColor, String collapsedColor) {
        Intrinsics.checkNotNullParameter(floorsOrder, "floorsOrder");
        if (this.hasBackButton) {
            for (String str : floorsOrder) {
                ViewGroup viewGroup = this.floorContainers.get(str);
                ShellNavBarFloorViewGroup shellNavBarFloorViewGroup = viewGroup instanceof ShellNavBarFloorViewGroup ? (ShellNavBarFloorViewGroup) viewGroup : null;
                if (Intrinsics.d(str, "secondCollapsed")) {
                    if (shellNavBarFloorViewGroup != null) {
                        shellNavBarFloorViewGroup.updateBackButtonOnScroll(alpha, collapsedColor, collapsedColor);
                    }
                } else if (shellNavBarFloorViewGroup != null) {
                    shellNavBarFloorViewGroup.updateBackButtonOnScroll(alpha, expandedColor, collapsedColor);
                }
            }
        }
    }
}
