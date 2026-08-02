package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.o;
import Tl.a;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.content.Context;
import android.content.IntentSender;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.C;
import androidx.activity.J;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.res.g;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.B;
import ce0.InterfaceC5817a;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.permission.extension.FragmentsKt;
import ru.ozon.app.android.travel.feature.hotels.map.R$drawable;
import ru.ozon.app.android.travel.feature.hotels.map.R$id;
import ru.ozon.app.android.travel.feature.hotels.map.databinding.WidgetHotelsMapInfoBinding;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.BoundingBox;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.Coordinate;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.PageModifier;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.ThrowableExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonVO;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonView;
import ru.ozon.mapsdk.OzonMapView;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import uZ.C9992d;
import ve0.b;
import we0.C10551g;
import we0.h;
import we0.i;
import we0.m;
import we0.n;

@Metadata(d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 «\u00012\u00020\u0001:\u0004«\u0001¬\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010!\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0016¢\u0006\u0004\b/\u0010\u001bJ\u0017\u00100\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0016H\u0002¢\u0006\u0004\b2\u0010\u001bJ\u000f\u00103\u001a\u00020\u0016H\u0002¢\u0006\u0004\b3\u0010\u001bJ\u000f\u00104\u001a\u00020\u0016H\u0002¢\u0006\u0004\b4\u0010\u001bJ'\u0010:\u001a\u00020\u00162\u0006\u00106\u001a\u0002052\u000e\u00109\u001a\n\u0018\u000107j\u0004\u0018\u0001`8H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00162\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J#\u0010C\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u001f2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\bE\u0010*J\u0017\u0010F\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\bF\u0010*J\u0017\u0010G\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\bG\u0010*J\u000f\u0010H\u001a\u00020\u0016H\u0002¢\u0006\u0004\bH\u0010\u001bJ\u0017\u0010I\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\bI\u0010*J\u0017\u0010L\u001a\u00020\u00162\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ%\u0010R\u001a\u00020\u00162\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N2\u0006\u0010Q\u001a\u00020\u001fH\u0002¢\u0006\u0004\bR\u0010SJ\u001d\u0010W\u001a\u00020\u0016*\u00020T2\b\u0010V\u001a\u0004\u0018\u00010UH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\u00162\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0016H\u0002¢\u0006\u0004\b]\u0010\u001bJ\u000f\u0010^\u001a\u00020\u0016H\u0002¢\u0006\u0004\b^\u0010\u001bJ\u0013\u0010`\u001a\u00020\u001f*\u00020_H\u0002¢\u0006\u0004\b`\u0010aR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010eR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010gR*\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0017\u0010q\u001a\u00020p8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u001c\u0010w\u001a\n v*\u0004\u0018\u00010u0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010z\u001a\u0004\u0018\u00010y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010}\u001a\u0004\u0018\u00010|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001f\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008b\u0001R\u0019\u0010Q\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bQ\u0010\u008d\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0091\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0091\u0001R\u0019\u0010\u0097\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0091\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R%\u0010¡\u0001\u001a\u0010\u0012\u0005\u0012\u00030 \u0001\u0012\u0004\u0012\u00020\u00160\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R$\u0010£\u0001\u001a\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00160\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¢\u0001R<\u0010¥\u0001\u001a'\u0012\u0006\u0012\u0004\u0018\u00010A\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\f\u0012\n\u0018\u000107j\u0004\u0018\u0001`8\u0012\u0004\u0012\u00020\u00160¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R$\u0010§\u0001\u001a\u000f\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00160\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¢\u0001R\u0017\u0010ª\u0001\u001a\u00020_8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2;", "", "Lru/ozon/app/android/action/ActionHandler$Builder;", "actionBuilder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "La00/f;", "composerContainer", "Ll10/b;", "composerController", "Lru/ozon/app/android/travel/feature/hotels/map/databinding/WidgetHotelsMapInfoBinding;", "binding", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "<init>", "(Lru/ozon/app/android/action/ActionHandler$Builder;LWZ/l;La00/f;Ll10/b;Lru/ozon/app/android/travel/feature/hotels/map/databinding/WidgetHotelsMapInfoBinding;Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerNavigator;)V", "Landroidx/lifecycle/B;", "lifecycleScope", "Lkotlin/Function0;", "", "onMapControllerReady", "setupMap", "(Landroidx/lifecycle/B;Lkotlin/jvm/functions/Function0;)V", "onStart", "()V", "onStop", "attachToContainer", "removeFromContainer", "", "isRationaleNeeded", "requestLocationPermission", "(Z)V", "Lcom/google/android/gms/common/api/ResolvableApiException;", "exception", "showLocationDisabledRestriction", "(Lcom/google/android/gms/common/api/ResolvableApiException;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO;)V", "Lwe0/m;", "location", "moveToUserLocation", "(Lwe0/m;)V", "fitVisibleSpace", "observeActions", "(Landroidx/lifecycle/B;)V", "showPermissionRationalErrorRestriction", "onZoomInControlClicked", "onZoomOutControlClicked", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "clickEvent", "processFiltersAction", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "backButtonAction", "addOnBackPressedCallback", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "isSelection", "", "pinId", "updateMap", "(ZLjava/lang/String;)V", "bindMap", "bindControls", "addOnBackPressedHandler", "removeOnBackPressedCallback", "moveToPoint", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;", "pin", "showUserPin", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;)V", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin;", "pins", "isSerpPage", "showPins", "(Ljava/util/List;Z)V", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "atom", "bindWithBackground", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "Landroid/view/View;", "bottomWidget", "showLocationButton", "(Landroid/view/View;)V", "requestLocationSuccess", "updateZoomButtons", "Lve0/b;", "performZoom", "(Lve0/b;)Z", "LWZ/l;", "La00/f;", "Ll10/b;", "Lru/ozon/app/android/travel/feature/hotels/map/databinding/WidgetHotelsMapInfoBinding;", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/composer/ComposerNavigator;", "onCurrentLocationAction", "Lkotlin/jvm/functions/Function0;", "getOnCurrentLocationAction", "()Lkotlin/jvm/functions/Function0;", "setOnCurrentLocationAction", "(Lkotlin/jvm/functions/Function0;)V", "_controller", "Lve0/b;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/BottomCardController;", "bottomCardController", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/BottomCardController;", "getBottomCardController", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/BottomCardController;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroidx/fragment/app/r;", "activity", "Landroidx/fragment/app/r;", "Landroidx/activity/J;", "onBackPressedDispatcher", "Landroidx/activity/J;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/PageModifier;", "pageModifier", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/PageModifier;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/MapIconProviderV2;", "iconProvider", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/MapIconProviderV2;", "Lkotlin/collections/k;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2$ZoomAction;", "zoomActionsQueue", "Lkotlin/collections/k;", "", "cardEdgeTopOffset", "I", "minLocalButtonMargin", "Ljava/lang/Boolean;", "previousClickedPinId", "Ljava/lang/String;", "isMoveToUserLocation", "Z", "previousClickedPinSelection", "", "initialZoom", "Ljava/lang/Float;", "isZoomingInProcess", "isZoomingByZoomControls", "Landroidx/activity/C;", "onBackPressedCallback", "Landroidx/activity/C;", "hotelsMapInfoVO", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO;", "userLocationPin", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;", "Lkotlin/Function1;", "Lwe0/h;", "cameraChangeListener", "Lkotlin/jvm/functions/Function1;", "onMapClickListener", "Lkotlin/Function3;", "onPinTapListener", "Lfd/n;", "actionHandler", "getController", "()Lve0/b;", "controller", "Companion", "ZoomAction", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapViewV2 {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private b _controller;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final r activity;

    @NotNull
    private final WidgetHotelsMapInfoBinding binding;

    @NotNull
    private final BottomCardController bottomCardController;

    @NotNull
    private final Function1<h, Unit> cameraChangeListener;
    private final int cardEdgeTopOffset;

    @NotNull
    private final C4911f composerContainer;

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final ComposerNavigator composerNavigator;

    @NotNull
    private final ViewGroup composerRootView;
    private final Context context;
    private HotelsMapInfoV2VO hotelsMapInfoVO;

    @NotNull
    private final MapIconProviderV2 iconProvider;
    private Float initialZoom;
    private boolean isMoveToUserLocation;
    private Boolean isSerpPage;
    private boolean isZoomingByZoomControls;
    private boolean isZoomingInProcess;
    private final int minLocalButtonMargin;
    private C onBackPressedCallback;
    private final J onBackPressedDispatcher;
    private Function0<Unit> onCurrentLocationAction;

    @NotNull
    private final Function1<m, Unit> onMapClickListener;

    @NotNull
    private final InterfaceC6511n<String, Boolean, t, Unit> onPinTapListener;

    @NotNull
    private final PageModifier pageModifier;
    private String previousClickedPinId;
    private boolean previousClickedPinSelection;

    @NotNull
    private final l tokenizedAnalytics;
    private HotelsMapInfoV2VO.Pin.UserPin userLocationPin;

    @NotNull
    private final C7704k<ZoomAction> zoomActionsQueue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2$Companion;", "", "<init>", "()V", "USER_LOCATION_ZOOM", "", "PARAMS_KEY_HOTEL_ID", "", "PARAMS_KEY_EMPTY_HOTEL_ID", "PARAMS_KEY_VISIBLE_REGION", "PARAMS_KEY_IS_ZOOM_CHANGED", "PARAMS_KEY_IS_MAX_ZOOM_REACHED", "PARAMS_KEY_IS_SELECTION", "CLUSTER_ID_PART", "ACTION_ID_OPEN_SETTINGS", "ACTION_ID_GEOLOCATION", "ACTION_ID_ZOOM_IN", "ACTION_ID_ZOOM_OUT", "ALPHA_ENABLED", "ALPHA_DISABLED", "MIN_ZOOM", "MAX_ZOOM", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2$ZoomAction;", "", "ZoomIn", "ZoomOut", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2$ZoomAction$ZoomIn;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2$ZoomAction$ZoomOut;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private interface ZoomAction {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2$ZoomAction$ZoomIn;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2$ZoomAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ZoomIn implements ZoomAction {

            @NotNull
            public static final ZoomIn INSTANCE = new ZoomIn();

            private ZoomIn() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ZoomIn);
            }

            public int hashCode() {
                return 2015998511;
            }

            @NotNull
            public String toString() {
                return "ZoomIn";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2$ZoomAction$ZoomOut;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapViewV2$ZoomAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ZoomOut implements ZoomAction {

            @NotNull
            public static final ZoomOut INSTANCE = new ZoomOut();

            private ZoomOut() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ZoomOut);
            }

            public int hashCode() {
                return -1928549500;
            }

            @NotNull
            public String toString() {
                return "ZoomOut";
            }
        }
    }

    public HotelsMapViewV2(@NotNull ActionHandler.Builder actionBuilder, @NotNull l tokenizedAnalytics, @NotNull C4911f composerContainer, @NotNull InterfaceC7851b composerController, @NotNull WidgetHotelsMapInfoBinding binding, @NotNull ViewGroup composerRootView, @NotNull ComposerNavigator composerNavigator) {
        Intrinsics.checkNotNullParameter(actionBuilder, "actionBuilder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(composerContainer, "composerContainer");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.composerContainer = composerContainer;
        this.composerController = composerController;
        this.binding = binding;
        this.composerRootView = composerRootView;
        this.composerNavigator = composerNavigator;
        LinearLayout composerBottomContainer = ComposerViewExtensionKt.composerBottomContainer(composerRootView);
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.bottomCardController = new BottomCardController(composerBottomContainer, constraintLayout, new HotelsMapViewV2$bottomCardController$1(this));
        Context context = binding.getConstraintLayout().getContext();
        this.context = context;
        r a11 = composerContainer.a();
        this.activity = a11;
        this.onBackPressedDispatcher = a11 != null ? a11.getOnBackPressedDispatcher() : null;
        ConstraintLayout constraintLayout2 = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        this.pageModifier = new PageModifier(constraintLayout2);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.iconProvider = new MapIconProviderV2(context);
        this.zoomActionsQueue = new C7704k<>();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.cardEdgeTopOffset = ResourceExtKt.toPx(18, context);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.minLocalButtonMargin = ResourceExtKt.toPx(54, context);
        this.cameraChangeListener = new HotelsMapViewV2$cameraChangeListener$1(this);
        this.onMapClickListener = new HotelsMapViewV2$onMapClickListener$1(this);
        this.onPinTapListener = new HotelsMapViewV2$onPinTapListener$1(this);
        this.actionHandler = actionBuilder.onClick(new HotelsMapViewV2$actionHandler$1(this)).buildHandler();
    }

    private final void addOnBackPressedCallback(final AtomActionDTO backButtonAction) {
        C c11 = new C() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapViewV2$addOnBackPressedCallback$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                Function1 function1;
                function1 = HotelsMapViewV2.this.actionHandler;
                function1.invoke(AtomActionMapperKt.toAtomAction(backButtonAction, null));
                setEnabled(false);
            }
        };
        this.onBackPressedCallback = c11;
        J j11 = this.onBackPressedDispatcher;
        if (j11 != null) {
            j11.h(this.composerContainer.g(), c11);
        }
    }

    private final void addOnBackPressedHandler(HotelsMapInfoV2VO item) {
        removeOnBackPressedCallback();
        AtomActionDTO action = item.getBackButton().getAction();
        if (action != null) {
            addOnBackPressedCallback(action);
        }
    }

    private final void bindControls(HotelsMapInfoV2VO item) {
        SmallIconButtonView hotelsMapInfoBackButtonSibv = this.binding.hotelsMapInfoBackButtonSibv;
        Intrinsics.checkNotNullExpressionValue(hotelsMapInfoBackButtonSibv, "hotelsMapInfoBackButtonSibv");
        bindWithBackground(hotelsMapInfoBackButtonSibv, item.getBackButton());
        SmallIconButtonView hotelsMapInfoZoomInLocationButtonSibv = this.binding.hotelsMapInfoZoomInLocationButtonSibv;
        Intrinsics.checkNotNullExpressionValue(hotelsMapInfoZoomInLocationButtonSibv, "hotelsMapInfoZoomInLocationButtonSibv");
        bindWithBackground(hotelsMapInfoZoomInLocationButtonSibv, item.getZoomInButton());
        SmallIconButtonView hotelsMapInfoZoomOutButtonSibv = this.binding.hotelsMapInfoZoomOutButtonSibv;
        Intrinsics.checkNotNullExpressionValue(hotelsMapInfoZoomOutButtonSibv, "hotelsMapInfoZoomOutButtonSibv");
        bindWithBackground(hotelsMapInfoZoomOutButtonSibv, item.getZoomOutButton());
        SmallIconButtonView hotelsMapInfoLocationButtonSibv = this.binding.hotelsMapInfoLocationButtonSibv;
        Intrinsics.checkNotNullExpressionValue(hotelsMapInfoLocationButtonSibv, "hotelsMapInfoLocationButtonSibv");
        bindWithBackground(hotelsMapInfoLocationButtonSibv, item.getGeolocationButton());
        TravelFiltersButtonView travelFiltersButtonView = this.binding.hotelsMapInfoFiltersButtonTfbv;
        Intrinsics.f(travelFiltersButtonView);
        travelFiltersButtonView.setVisibility(item.getIsFiltersButtonVisible() ? 0 : 8);
        TravelFiltersButtonVO filtersButton = item.getFiltersButton();
        if (filtersButton != null) {
            travelFiltersButtonView.bind(filtersButton, new HotelsMapViewV2$bindControls$1$1$1(this));
        }
    }

    private final void bindMap(HotelsMapInfoV2VO item) {
        this.isSerpPage = Boolean.valueOf(item.getIsSerpPage());
        moveToPoint(item);
    }

    private final void bindWithBackground(SmallIconButtonView smallIconButtonView, ButtonV3Atom.SmallIconButton smallIconButton) {
        WrappedIconButtonHolderKt.bindOrGone(smallIconButtonView, smallIconButton, this.actionHandler);
        if (smallIconButton == null) {
            return;
        }
        smallIconButtonView.setBackground(g.d(smallIconButtonView.getContext().getResources(), R$drawable.bg_rounded_secondary_ripple_20, smallIconButtonView.getContext().getTheme()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b getController() {
        b bVar = this._controller;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("You must call setupMap before using");
    }

    private final void moveToPoint(final HotelsMapInfoV2VO item) {
        final b controller = getController();
        OzonMapView hotelsMapInfoMap = this.binding.hotelsMapInfoMap;
        Intrinsics.checkNotNullExpressionValue(hotelsMapInfoMap, "hotelsMapInfoMap");
        int i11 = Y.f42258g;
        if (!hotelsMapInfoMap.isLaidOut() || hotelsMapInfoMap.isLayoutRequested()) {
            hotelsMapInfoMap.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapViewV2$moveToPoint$lambda$13$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    n visibleRegion = HotelsMapInfoV2VO.this.getVisibleRegion();
                    if (visibleRegion != null) {
                        OzonMapView hotelsMapInfoMap2 = this.binding.hotelsMapInfoMap;
                        Intrinsics.checkNotNullExpressionValue(hotelsMapInfoMap2, "hotelsMapInfoMap");
                        MapExtKt.updateActiveZone(hotelsMapInfoMap2, controller);
                        C10551g c11 = controller.g().c(visibleRegion);
                        this.initialZoom = Float.valueOf(c11.e());
                        InterfaceC5817a.C0864a.a(this.getController().g(), c11, null, 6);
                    }
                }
            });
        } else {
            n visibleRegion = item.getVisibleRegion();
            if (visibleRegion != null) {
                OzonMapView hotelsMapInfoMap2 = this.binding.hotelsMapInfoMap;
                Intrinsics.checkNotNullExpressionValue(hotelsMapInfoMap2, "hotelsMapInfoMap");
                MapExtKt.updateActiveZone(hotelsMapInfoMap2, controller);
                C10551g c11 = controller.g().c(visibleRegion);
                this.initialZoom = Float.valueOf(c11.e());
                InterfaceC5817a.C0864a.a(getController().g(), c11, null, 6);
            }
        }
        getController().b().clear();
        showPins(item.getPins(), item.getIsSerpPage());
        HotelsMapInfoV2VO.Pin.UserPin userPin = this.userLocationPin;
        if (userPin != null) {
            showUserPin(userPin);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeActions(B lifecycleScope) {
        C2399j.C(new Ae.C(new C2408n0(getController().g().e(), new HotelsMapViewV2$observeActions$1(this, null)), new HotelsMapViewV2$observeActions$2(null)), lifecycleScope);
        C2399j.C(new Ae.C(new C2408n0(getController().d().e(), new HotelsMapViewV2$observeActions$3(this, null)), new HotelsMapViewV2$observeActions$4(null)), lifecycleScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onZoomInControlClicked() {
        this.zoomActionsQueue.addLast(ZoomAction.ZoomIn.INSTANCE);
        performZoom(getController());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onZoomOutControlClicked() {
        this.zoomActionsQueue.addLast(ZoomAction.ZoomOut.INSTANCE);
        performZoom(getController());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean performZoom(b bVar) {
        C10551g a11;
        if (this.isZoomingInProcess || this.zoomActionsQueue.isEmpty()) {
            return false;
        }
        C10551g currentPosition = getController().g().getCurrentPosition();
        float e11 = currentPosition.e();
        ZoomAction removeFirst = this.zoomActionsQueue.removeFirst();
        if (((removeFirst instanceof ZoomAction.ZoomOut) && e11 <= 2.0f) || ((removeFirst instanceof ZoomAction.ZoomIn) && e11 >= 21.0f)) {
            return performZoom(bVar);
        }
        if (Intrinsics.d(removeFirst, ZoomAction.ZoomIn.INSTANCE)) {
            a11 = C10551g.a(currentPosition, null, Math.min(21.0f, e11 + 1), 13);
        } else {
            if (!Intrinsics.d(removeFirst, ZoomAction.ZoomOut.INSTANCE)) {
                throw new o();
            }
            a11 = C10551g.a(currentPosition, null, Math.max(2.0f, e11 - 1), 13);
        }
        this.isZoomingInProcess = true;
        this.isZoomingByZoomControls = true;
        InterfaceC5817a.C0864a.a(getController().g(), a11, null, 6);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processFiltersAction(AtomAction atomAction, t clickEvent) {
        String link;
        AtomAction.OpenComposerNestedPage openComposerNestedPage = atomAction instanceof AtomAction.OpenComposerNestedPage ? (AtomAction.OpenComposerNestedPage) atomAction : null;
        if (openComposerNestedPage == null || (link = openComposerNestedPage.getLink()) == null) {
            return;
        }
        ComposerNavigator.DefaultImpls.openDeeplinkInBottomSheet$default(this.composerNavigator, link, link, 9001, new C9992d.b.C2202b(FlowTag.FILTER_VALUES), null, 16, null);
        if (clickEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, clickEvent, null, 2, null);
        }
    }

    private final void removeOnBackPressedCallback() {
        C c11 = this.onBackPressedCallback;
        if (c11 != null) {
            c11.remove();
        }
        this.onBackPressedCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestLocationSuccess() {
        Function0<Unit> function0 = this.onCurrentLocationAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLocationButton(View bottomWidget) {
        SmallIconButtonView hotelsMapInfoLocationButtonSibv = this.binding.hotelsMapInfoLocationButtonSibv;
        Intrinsics.checkNotNullExpressionValue(hotelsMapInfoLocationButtonSibv, "hotelsMapInfoLocationButtonSibv");
        ViewGroup.LayoutParams layoutParams = hotelsMapInfoLocationButtonSibv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = Math.max(bottomWidget.getHeight() - ((int) bottomWidget.getTranslationY()), this.minLocalButtonMargin);
        hotelsMapInfoLocationButtonSibv.setLayoutParams(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPermissionRationalErrorRestriction() {
        Restriction locationDeniedAlert;
        ViewGroup rootView;
        HotelsMapInfoV2VO hotelsMapInfoV2VO = this.hotelsMapInfoVO;
        if (hotelsMapInfoV2VO == null || (locationDeniedAlert = hotelsMapInfoV2VO.getLocationDeniedAlert()) == null || (rootView = ContextExtKt.getRootView(this.composerContainer.c())) == null) {
            return;
        }
        RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, rootView, C7714v.m0(locationDeniedAlert), this.composerContainer.f(), null, this.actionHandler, null, null, null, 232, null);
    }

    private final void showPins(List<? extends HotelsMapInfoV2VO.Pin> pins, boolean isSerpPage) {
        for (HotelsMapInfoV2VO.Pin pin : pins) {
            MapIconProviderV2 mapIconProviderV2 = this.iconProvider;
            b controller = getController();
            HotelsMapViewV2$showPins$1$1 hotelsMapViewV2$showPins$1$1 = new HotelsMapViewV2$showPins$1$1(this, pin);
            if (!isSerpPage) {
                hotelsMapViewV2$showPins$1$1 = null;
            }
            mapIconProviderV2.createPinMarker(controller, pin, hotelsMapViewV2$showPins$1$1);
        }
    }

    private final void showUserPin(HotelsMapInfoV2VO.Pin.UserPin pin) {
        this.iconProvider.createUserPinMarker(getController(), pin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMap(boolean isSelection, String pinId) {
        String str;
        HotelsMapInfoV2VO hotelsMapInfoV2VO;
        String currentUrl;
        Uri parse;
        Uri build;
        getController();
        C10551g currentPosition = getController().g().getCurrentPosition();
        i visibleArea = getController().g().getVisibleArea();
        boolean z11 = !Intrinsics.b(this.initialZoom, currentPosition.e());
        boolean z12 = currentPosition.e() == 21.0f;
        BoundingBox boundingBox = new BoundingBox(new Coordinate(visibleArea.d().getLatitude(), visibleArea.d().getLongitude()), new Coordinate(visibleArea.g().getLatitude(), visibleArea.g().getLongitude()));
        if (pinId != null && (hotelsMapInfoV2VO = this.hotelsMapInfoVO) != null && (currentUrl = hotelsMapInfoV2VO.getCurrentUrl()) != null && (parse = Uri.parse(currentUrl)) != null) {
            if (!isSelection) {
                pinId = "";
            }
            Uri.Builder replaceQueryParameter = UriExtKt.replaceQueryParameter(parse, "hotelId", pinId);
            if (replaceQueryParameter != null && (build = replaceQueryParameter.build()) != null) {
                str = build.toString();
                this.previousClickedPinSelection = isSelection;
                InterfaceC7851b.a.e(this.composerController, str, U.j(new Pair("visibleRegion", boundingBox), new Pair("isSelection", Boolean.valueOf(isSelection)), new Pair("isZoomChanged", Boolean.valueOf(z11)), new Pair("isMaxZoomReached", Boolean.valueOf(z12))), null, 4);
            }
        }
        str = null;
        this.previousClickedPinSelection = isSelection;
        InterfaceC7851b.a.e(this.composerController, str, U.j(new Pair("visibleRegion", boundingBox), new Pair("isSelection", Boolean.valueOf(isSelection)), new Pair("isZoomChanged", Boolean.valueOf(z11)), new Pair("isMaxZoomReached", Boolean.valueOf(z12))), null, 4);
    }

    static /* synthetic */ void updateMap$default(HotelsMapViewV2 hotelsMapViewV2, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        hotelsMapViewV2.updateMap(z11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateZoomButtons() {
        getController();
        C10551g currentPosition = getController().g().getCurrentPosition();
        if (currentPosition.e() >= 21.0f) {
            this.binding.hotelsMapInfoZoomInLocationButtonSibv.setAlpha(0.5f);
        } else {
            this.binding.hotelsMapInfoZoomInLocationButtonSibv.setAlpha(1.0f);
        }
        if (currentPosition.e() <= 2.0f) {
            this.binding.hotelsMapInfoZoomOutButtonSibv.setAlpha(0.5f);
        } else {
            this.binding.hotelsMapInfoZoomOutButtonSibv.setAlpha(1.0f);
        }
    }

    public final void attachToContainer() {
        this.pageModifier.attachToPage(this.composerRootView);
    }

    public final void bind(@NotNull HotelsMapInfoV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.hotelsMapInfoVO = item;
        bindMap(item);
        bindControls(item);
        addOnBackPressedHandler(item);
    }

    public final void fitVisibleSpace() {
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        d d11 = a.d(constraintLayout, "getRoot(...)", constraintLayout);
        ConstraintSetExtKt.clearBottom(d11, R$id.hotelsMapInfoMap);
        d11.f(constraintLayout);
        OzonMapView hotelsMapInfoMap = this.binding.hotelsMapInfoMap;
        Intrinsics.checkNotNullExpressionValue(hotelsMapInfoMap, "hotelsMapInfoMap");
        ViewGroup.LayoutParams layoutParams = hotelsMapInfoMap.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = this.bottomCardController.getBottomContainerTop() + this.cardEdgeTopOffset;
        hotelsMapInfoMap.setLayoutParams(layoutParams);
    }

    @NotNull
    public final BottomCardController getBottomCardController() {
        return this.bottomCardController;
    }

    public final Function0<Unit> getOnCurrentLocationAction() {
        return this.onCurrentLocationAction;
    }

    public final void moveToUserLocation(@NotNull m location) {
        HotelsMapInfoV2VO.Pin.UserPin userPin;
        HotelsMapInfoV2VO hotelsMapInfoV2VO;
        HotelsMapInfoV2VO.Pin.UserPin userLocationPin;
        Intrinsics.checkNotNullParameter(location, "location");
        HotelsMapInfoV2VO hotelsMapInfoV2VO2 = this.hotelsMapInfoVO;
        HotelsMapInfoV2VO.Pin.UserPin copy$default = (hotelsMapInfoV2VO2 == null || (userLocationPin = hotelsMapInfoV2VO2.getUserLocationPin()) == null) ? null : HotelsMapInfoV2VO.Pin.UserPin.copy$default(userLocationPin, null, 0, location, null, null, null, null, null, null, 507, null);
        this.userLocationPin = copy$default;
        if (copy$default != null) {
            HotelsMapInfoV2VO hotelsMapInfoV2VO3 = this.hotelsMapInfoVO;
            if (hotelsMapInfoV2VO3 != null) {
                HotelsMapInfoV2VO.Pin.UserPin userPin2 = copy$default;
                hotelsMapInfoV2VO = hotelsMapInfoV2VO3.copy((r35 & 1) != 0 ? hotelsMapInfoV2VO3.id : 0L, (r35 & 2) != 0 ? hotelsMapInfoV2VO3.visibleRegion : null, (r35 & 4) != 0 ? hotelsMapInfoV2VO3.pins : null, (r35 & 8) != 0 ? hotelsMapInfoV2VO3.userLocationPin : userPin2, (r35 & 16) != 0 ? hotelsMapInfoV2VO3.backButton : null, (r35 & 32) != 0 ? hotelsMapInfoV2VO3.locationDeniedAlert : null, (r35 & 64) != 0 ? hotelsMapInfoV2VO3.currentUrl : null, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hotelsMapInfoV2VO3.isBottomWidgetShow : false, (r35 & 256) != 0 ? hotelsMapInfoV2VO3.isSerpPage : false, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? hotelsMapInfoV2VO3.isFiltersButtonVisible : false, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? hotelsMapInfoV2VO3.filtersButton : null, (r35 & 2048) != 0 ? hotelsMapInfoV2VO3.zoomInButton : null, (r35 & 4096) != 0 ? hotelsMapInfoV2VO3.zoomOutButton : null, (r35 & 8192) != 0 ? hotelsMapInfoV2VO3.geolocationButton : null, (r35 & 16384) != 0 ? hotelsMapInfoV2VO3.locationPoint : null);
                userPin = userPin2;
            } else {
                userPin = copy$default;
                hotelsMapInfoV2VO = null;
            }
            this.hotelsMapInfoVO = hotelsMapInfoV2VO;
            getController();
            C10551g a11 = C10551g.a(getController().g().getCurrentPosition(), location, 16.0f, 12);
            this.isMoveToUserLocation = true;
            InterfaceC5817a.C0864a.a(getController().g(), a11, null, 6);
            showUserPin(userPin);
        }
    }

    public final void onStart() {
        getController().onStart();
    }

    public final void onStop() {
        getController().onStop();
    }

    public final void removeFromContainer() {
        this.bottomCardController.cancelAnimation();
        this.pageModifier.detachFromPage(this.composerRootView);
        removeOnBackPressedCallback();
    }

    public final void requestLocationPermission(boolean isRationaleNeeded) {
        ComponentCallbacksC5392m c11 = this.composerContainer.c();
        if (c11 != null) {
            FragmentsKt.requestPermission(c11, new HotelsMapViewV2$requestLocationPermission$1(this, isRationaleNeeded));
        }
    }

    public final void setOnCurrentLocationAction(Function0<Unit> function0) {
        this.onCurrentLocationAction = function0;
    }

    public final void setupMap(@NotNull B lifecycleScope, @NotNull Function0<Unit> onMapControllerReady) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(onMapControllerReady, "onMapControllerReady");
        C2399j.C(new Ae.C(new C2408n0(this.binding.hotelsMapInfoMap.h(), new HotelsMapViewV2$setupMap$1(this, onMapControllerReady, lifecycleScope, null)), new HotelsMapViewV2$setupMap$2(null)), lifecycleScope);
    }

    public final void showLocationDisabledRestriction(@NotNull ResolvableApiException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        try {
            r rVar = this.activity;
            if (rVar != null) {
                exception.startResolutionForResult(rVar, 876);
            }
        } catch (IntentSender.SendIntentException e11) {
            ThrowableExtKt.log(e11, "HotelsMapViewV2_showLocationDisabledRestriction");
        }
    }
}
