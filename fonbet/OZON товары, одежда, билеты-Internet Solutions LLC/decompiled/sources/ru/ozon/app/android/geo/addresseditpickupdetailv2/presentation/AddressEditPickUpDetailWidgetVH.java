package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation;

import B0.C2454a;
import D3.f;
import GI.c;
import Sc.InterfaceC4008j;
import Vg.d;
import WZ.l;
import WZ.t;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.method.MovementMethod;
import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.af.holders.HeaderAtom;
import ru.ozon.app.android.atoms.af.holders.TextSubtextAtom;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.atoms.atom2.ImageCarouselAtom;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.Header;
import ru.ozon.app.android.atoms.data.deprecated.ImageCarousel;
import ru.ozon.app.android.atoms.data.deprecated.TextSubtext;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormBuilderFieldUpdate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailVO;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailViewMapper;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailWidgetVH;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.addressAdapter.AddressAdapter;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.decorator.AddressDecorator;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.decorator.AddressNameDecorator;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.decorator.DeliveryConditionsDecorator;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.decorator.PlaceDescriptionsDecorator;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.decorator.SeparatorDecorator;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.deliveryCondition.DeliveryConditionAdapter;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.inlineDate.InlineDateAdapter;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.inlineDate.InlineDateDecoration;
import ru.ozon.app.android.geo.common.UtilsKt;
import ru.ozon.app.android.geo.common.decorator.BadgesHorizontalOffsetDecorator;
import ru.ozon.app.android.geo.databinding.WidgetAddressEditPickupDetailV2Binding;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 y2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001yBC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010\u001bJ\u0017\u0010)\u001a\u00020\u00172\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J%\u0010/\u001a\u00020\u00172\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\"2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u0002012\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020#0\"*\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00172\u0006\u00107\u001a\u00020+H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b<\u0010;J\u0013\u0010>\u001a\u00020\u0017*\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020\u0017*\u00020=H\u0002¢\u0006\u0004\b@\u0010?J\u0013\u0010A\u001a\u00020\u0017*\u00020=H\u0002¢\u0006\u0004\bA\u0010?J\u0017\u0010D\u001a\u00020\u00172\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010I\u001a\u00020H*\u00020+2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bI\u0010JR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010KR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010LR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010MR\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010NR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010OR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010PR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0016\u0010V\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010TR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010TR\u0014\u0010c\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010TR\u0014\u0010d\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010TR\u0014\u0010e\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010TR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010TR\u0014\u0010j\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010TR\u0014\u0010k\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010TR\u0014\u0010l\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010TR\u0014\u0010m\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010TR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010nR \u0010p\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00170o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010tR\u0018\u0010w\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010x¨\u0006z"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO;", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditPickupDetailV2Binding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailRouter;", "router", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickupDetailOnBoardingViewModel;", "onBoardingViewModel", "", "isSelectApp", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/geo/databinding/WidgetAddressEditPickupDetailV2Binding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailRouter;LVg/d;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickupDetailOnBoardingViewModel;ZLWZ/l;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO;Ll20/d;)V", "onDetach", "()V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "prepareChips", "()Ljava/util/List;", "expand", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "atomAction", "processClickOnGallery", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "images", "", "currentPosition", "showGallery", "(Ljava/util/List;I)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "onAddressTagSelected", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO;)V", "addActions", "(Ljava/util/List;)Ljava/util/List;", "addressLabel", "updateAddressLabel", "(Ljava/lang/String;)V", "setupAddress", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO;)V", "setupDisclaimer", "Landroid/view/View;", "showKeyboardDelayed", "(Landroid/view/View;)V", "removeKeyboardCallbacks", "removeOnBoardingCallbacks", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoarding", "initDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "Landroid/content/Context;", "context", "", "underlineIfNeeded", "(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditPickupDetailV2Binding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailRouter;", "LVg/d;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickupDetailOnBoardingViewModel;", "Z", "LWZ/l;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "headerAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "addressNameChipsAdapter", "selectedChipPosition", "I", "addressAdapter", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/addressAdapter/AddressAdapter;", "newAddressAdapter", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/addressAdapter/AddressAdapter;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/deliveryCondition/DeliveryConditionAdapter;", "newDeliveryConditionAdapter", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/deliveryCondition/DeliveryConditionAdapter;", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "addressLabelWatcher", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "bannerInfoAdapter", "metroAdapter", "photosAdapter", "scheduleAdapter", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/inlineDate/InlineDateAdapter;", "scheduleInlineDateAdapter", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/inlineDate/InlineDateAdapter;", "deliveryConditionsAdapter", "placeHeaderAdapter", "placeDescriptionsAdapter", "controlsAdapter", "badgesAdapter", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/Runnable;", "keyboardShowRunnable", "Ljava/lang/Runnable;", "onBoardingShowRunnable", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditPickUpDetailWidgetVH extends k<AddressEditPickUpDetailVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter addressAdapter;

    @NotNull
    private final SimpleTextWatcher addressLabelWatcher;

    @NotNull
    private final AtomsAdapter addressNameChipsAdapter;

    @NotNull
    private final AtomsAdapter badgesAdapter;

    @NotNull
    private final AtomsAdapter bannerInfoAdapter;

    @NotNull
    private final WidgetAddressEditPickupDetailV2Binding binding;

    @NotNull
    private final AtomsAdapter controlsAdapter;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final AtomsAdapter deliveryConditionsAdapter;

    @NotNull
    private final AtomsAdapter headerAdapter;
    private final boolean isSelectApp;
    private AddressEditPickUpDetailVO item;
    private Runnable keyboardShowRunnable;

    @NotNull
    private final AtomsAdapter metroAdapter;

    @NotNull
    private final AddressAdapter newAddressAdapter;

    @NotNull
    private final DeliveryConditionAdapter newDeliveryConditionAdapter;
    private OnBoardingDelegate onBoardingDelegate;
    private Runnable onBoardingShowRunnable;

    @NotNull
    private final AddressEditPickupDetailOnBoardingViewModel onBoardingViewModel;

    @NotNull
    private final AtomsAdapter photosAdapter;

    @NotNull
    private final AtomsAdapter placeDescriptionsAdapter;

    @NotNull
    private final AtomsAdapter placeHeaderAdapter;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final AddressEditPickUpDetailRouter router;

    @NotNull
    private final AtomsAdapter scheduleAdapter;

    @NotNull
    private final InlineDateAdapter scheduleInlineDateAdapter;
    private int selectedChipPosition;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_8 = UiExtKt.toPx(8);
    private static final int DP_24 = UiExtKt.toPx(24);

    @NotNull
    private static final InterfaceC4008j<Float> onBoardingCornerRadius$delegate = Sc.k.b(AddressEditPickUpDetailWidgetVH$Companion$onBoardingCornerRadius$2.INSTANCE);

    @NotNull
    private static final InterfaceC4008j<Float> onBoardingCornerRadiusSelect$delegate = Sc.k.b(AddressEditPickUpDetailWidgetVH$Companion$onBoardingCornerRadiusSelect$2.INSTANCE);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailWidgetVH$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<AtomAction.Click, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, AddressEditPickUpDetailWidgetVH.class, "processClickOnGallery", "processClickOnGallery(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
            invoke2(click);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction.Click p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((AddressEditPickUpDetailWidgetVH) this.receiver).processClickOnGallery(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailWidgetVH$Companion;", "", "<init>", "()V", "", "DP_8", "I", "getDP_8", "()I", "DP_24", "getDP_24", "", "onBoardingCornerRadius$delegate", "LSc/j;", "getOnBoardingCornerRadius", "()F", "onBoardingCornerRadius", "onBoardingCornerRadiusSelect$delegate", "getOnBoardingCornerRadiusSelect", "onBoardingCornerRadiusSelect", "", "PARAM_POSITION", "Ljava/lang/String;", "ONBOARDING_KEY", "", "SHOW_KEYBOARD_DELAY", "J", "SHOW_ONBOARDING_DELAY", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDP_24() {
            return AddressEditPickUpDetailWidgetVH.DP_24;
        }

        public final int getDP_8() {
            return AddressEditPickUpDetailWidgetVH.DP_8;
        }

        public final float getOnBoardingCornerRadius() {
            return ((Number) AddressEditPickUpDetailWidgetVH.onBoardingCornerRadius$delegate.getValue()).floatValue();
        }

        public final float getOnBoardingCornerRadiusSelect() {
            return ((Number) AddressEditPickUpDetailWidgetVH.onBoardingCornerRadiusSelect$delegate.getValue()).floatValue();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddressEditPickUpDetailWidgetVH(@NotNull WidgetAddressEditPickupDetailV2Binding binding, @NotNull ComposerReferences ref, @NotNull AddressEditPickUpDetailRouter router, @NotNull d customActionHandlersStoreFactory, @NotNull AddressEditPickupDetailOnBoardingViewModel onBoardingViewModel, boolean z11, @NotNull l tokenizedAnalytics) {
        super(r7);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.ref = ref;
        this.router = router;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.onBoardingViewModel = onBoardingViewModel;
        this.isSelectApp = z11;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Class<Header> cls = Header.class;
        int i11 = 2;
        Map map = null;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(cls, null, i11, null == true ? 1 : 0), new HeaderAtom.Configuration(0, 0, 0, 8, null, null, Integer.valueOf(R$style.TextStyle_Head_M), 0, false, null, 819, null))), map, null, null, 14, null);
        this.headerAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(null, null, null, null, 15, null);
        this.addressNameChipsAdapter = atomsAdapter2;
        this.selectedChipPosition = -1;
        Class<CommonText.TextMedium> cls2 = CommonText.TextMedium.class;
        Map map2 = null;
        AtomsAdapter atomsAdapter3 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(cls2, null == true ? 1 : 0, i11, null == true ? 1 : 0), new TextAtom.Configuration(0, 0, 0, 0, 0, 0, 6, null, 0, false, false, 8, null, null, 0, 0, null, null, null, 522175, null))), map2, null, null, 14, null);
        this.addressAdapter = atomsAdapter3;
        AddressAdapter addressAdapter = new AddressAdapter();
        this.newAddressAdapter = addressAdapter;
        DeliveryConditionAdapter deliveryConditionAdapter = new DeliveryConditionAdapter();
        this.newDeliveryConditionAdapter = deliveryConditionAdapter;
        this.addressLabelWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailWidgetVH$addressLabelWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Intrinsics.checkNotNullParameter(editable, "editable");
                AddressEditPickUpDetailWidgetVH.this.updateAddressLabel(editable.toString());
            }
        };
        Map map3 = null;
        AtomsAdapter atomsAdapter4 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(cls2, null == true ? 1 : 0, i11, null == true ? 1 : 0), new TextAtom.Configuration(0, 0, 0, 0, 0, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 522234, null))), map3, null, null, 14, null);
        this.bannerInfoAdapter = atomsAdapter4;
        Map map4 = null;
        AtomsAdapter atomsAdapter5 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(CommonText.TextSmall.class, null == true ? 1 : 0, i11, null == true ? 1 : 0), new TextAtom.Configuration(0, 0, 4, 0, 0, 8, 5, null, 16, false, false, 0, null, null, 0, 0, null, null, null, 521883, null))), map4, null, null, 14, null);
        this.metroAdapter = atomsAdapter5;
        Map map5 = null;
        AtomsAdapter atomsAdapter6 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(ImageCarousel.class, null == true ? 1 : 0, i11, null == true ? 1 : 0), new ImageCarouselAtom.Configuration(0, 0, 0, 0, 225, 15, null))), map5, null, null, 14, null);
        this.photosAdapter = atomsAdapter6;
        Map map6 = null;
        AtomsAdapter atomsAdapter7 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(TextSubtext.class, null, i11, null == true ? 1 : 0), new TextSubtextAtom.Configuration(0, 0, 8, 8, null, null, 0, 0, false, 499, null))), map6, null, null, 14, null);
        this.scheduleAdapter = atomsAdapter7;
        InlineDateAdapter inlineDateAdapter = new InlineDateAdapter();
        this.scheduleInlineDateAdapter = inlineDateAdapter;
        Map map7 = null;
        AtomsAdapter atomsAdapter8 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(cls2, null, i11, null == true ? 1 : 0), new TextAtom.Configuration(0, 0, 0, 0, 0, 0, 10, null, 0, false, false, 12, null, null, 0, 0, null, null, null, 522175, null))), map7, null, null, 14, null);
        this.deliveryConditionsAdapter = atomsAdapter8;
        Map map8 = null;
        AtomsFactory atomsFactory = null;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Map map9 = null;
        AtomsAdapter atomsAdapter9 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(cls, null, i11, null == true ? 1 : 0), new HeaderAtom.Configuration(0, 0, 0, 0, null, null, null, 0, false, null, 883, null))), map9, map8, atomsFactory, 14, defaultConstructorMarker);
        this.placeHeaderAdapter = atomsAdapter9;
        int i12 = 15;
        Map map10 = null;
        AtomsAdapter atomsAdapter10 = new AtomsAdapter(map10, map9, map8, atomsFactory, i12, defaultConstructorMarker);
        this.placeDescriptionsAdapter = atomsAdapter10;
        AtomsAdapter atomsAdapter11 = new AtomsAdapter(map10, map9, map8, atomsFactory, i12, defaultConstructorMarker);
        this.controlsAdapter = atomsAdapter11;
        AtomsAdapter atomsAdapter12 = new AtomsAdapter(map10, map9, map8, atomsFactory, i12, defaultConstructorMarker);
        this.badgesAdapter = atomsAdapter12;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new AddressEditPickUpDetailWidgetVH$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        binding.addressNameChipsHAL.setAdapter(atomsAdapter2);
        binding.addressNameChipsHAL.setDecorator(new AddressNameDecorator(getContext()));
        binding.addressVAL.setAdapter(atomsAdapter3);
        binding.addressVAL.setDecorator(new AddressDecorator(getContext()));
        binding.deliveryConditionRv.setAdapter(deliveryConditionAdapter);
        binding.addressRv.setAdapter(addressAdapter);
        binding.headerVAL.setAdapter(atomsAdapter);
        binding.bannerInfoVal.setAdapter(atomsAdapter4);
        binding.badgesHAL.setAdapter(atomsAdapter12);
        binding.badgesHAL.setDecorator(new BadgesHorizontalOffsetDecorator(getContext()));
        MovementMethod movementMethod = null;
        Integer num = null;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        Integer num2 = null;
        int i21 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i22 = 0;
        Float f7 = null;
        int i23 = 0;
        int i24 = 0;
        binding.dueDateTA.setConfiguration(new TextAtom.Configuration(i13, i14, i15, i16, i17, i18, i19, num2, i21, z12, z13, i22, null, f7, i23, i24, 1, movementMethod, num, 458746, defaultConstructorMarker2));
        binding.marketingInfoTA.setConfiguration(new TextAtom.Configuration(i13, i14, i15, i16, i17, i18, i19, num2, i21, z12, z13, i22, TextAtom.Configuration.Alignment.END, f7, i23, i24, 1, movementMethod, num, 454649, defaultConstructorMarker2));
        binding.photosFAL.setAdapter(atomsAdapter6);
        binding.scheduleVAL.setAdapter(atomsAdapter7);
        binding.scheduleVAL.setDecorator(new SeparatorDecorator(getContext(), true));
        binding.scheduleRV.setAdapter(inlineDateAdapter);
        binding.scheduleRV.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.scheduleRV.addItemDecoration(new InlineDateDecoration(getContext()));
        binding.deliveryConditionsVAL.setAdapter(atomsAdapter8);
        binding.deliveryConditionsVAL.setDecorator(new DeliveryConditionsDecorator(getContext()));
        binding.placeHeaderFAL.setAdapter(atomsAdapter9);
        binding.metroVAL.setAdapter(atomsAdapter5);
        binding.placeDescriptionsVAL.setAdapter(atomsAdapter10);
        binding.placeDescriptionsVAL.setDecorator(new PlaceDescriptionsDecorator(getContext()));
        binding.controlsVAL.setAdapter(atomsAdapter11);
        binding.collapse.setOnClickListener(new c(this, 13));
        atomsAdapter3.setOnAction(buildHandler);
        addressAdapter.setOnAction(buildHandler);
        atomsAdapter8.setOnAction(buildHandler);
        atomsAdapter.setOnAction(buildHandler);
        atomsAdapter11.setOnAction(buildHandler);
        atomsAdapter6.setOnAction(new ActionHandler.Builder(ref, this).onClick(new AnonymousClass2(this)).buildHandler());
        atomsAdapter10.setOnAction(buildHandler);
        atomsAdapter12.setOnAction(buildHandler);
    }

    private final List<TagButtonDTO> addActions(List<TagButtonDTO> list) {
        TagButtonDTO copy;
        List<TagButtonDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TagButtonDTO tagButtonDTO = (TagButtonDTO) obj;
            CommonControlSettings common = tagButtonDTO.getCommon();
            copy = tagButtonDTO.copy((r34 & 1) != 0 ? tagButtonDTO.styleType : null, (r34 & 2) != 0 ? tagButtonDTO.size : null, (r34 & 4) != 0 ? tagButtonDTO.isSelected : null, (r34 & 8) != 0 ? tagButtonDTO.isDisabled : null, (r34 & 16) != 0 ? tagButtonDTO.isClosable : null, (r34 & 32) != 0 ? tagButtonDTO.icon : null, (r34 & 64) != 0 ? tagButtonDTO.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tagButtonDTO.indicator : null, (r34 & 256) != 0 ? tagButtonDTO.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tagButtonDTO.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tagButtonDTO.common : CommonControlSettings.copy$default(common == null ? new CommonControlSettings(null, null, null, 7, null) : common, new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, null, C2454a.b("position", String.valueOf(i11)), 6, null), null, null, 6, null), (r34 & 2048) != 0 ? tagButtonDTO.closeControlSettings : null, (r34 & 4096) != 0 ? tagButtonDTO.context : null, (r34 & 8192) != 0 ? tagButtonDTO.isStateChangeDisabled : null, (r34 & 16384) != 0 ? tagButtonDTO.image : null, (r34 & 32768) != 0 ? tagButtonDTO.round : null);
            arrayList.add(copy);
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$20$lambda$8(AddressEditPickUpDetailVO addressEditPickUpDetailVO, AddressEditPickUpDetailWidgetVH addressEditPickUpDetailWidgetVH, View view, MotionEvent motionEvent) {
        AddressEditPickUpDetailVO.NumberPVZ numberPVZ;
        AtomAction action;
        if (motionEvent.getAction() != 1 || (numberPVZ = addressEditPickUpDetailVO.getNumberPVZ()) == null || (action = numberPVZ.getAction()) == null) {
            return false;
        }
        addressEditPickUpDetailWidgetVH.actionHandler.invoke(action);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void expand() {
        this.ref.getController().update(new AddressEditPickUpDetailViewMapper.CollapsingState(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl("address_edit_pickup_details_on_boarding_is_shown", this.ref, null, onBoarding, this, this.onBoardingViewModel, null, 0.0f, 196, null);
        onBoardingDelegateImpl.setOnShownListener(new AddressEditPickUpDetailWidgetVH$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddressTagSelected(AtomAction action, AddressEditPickUpDetailVO item) {
        List<AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile> chipsMobile;
        AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile chipItemMobile;
        TagButtonDTO tagButton;
        List<AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile> chipsMobile2;
        AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile chipItemMobile2;
        List<AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile> chipsMobile3;
        TagButtonDTO copy;
        String str;
        if (action instanceof AtomAction.Click) {
            Map<String, String> params = ((AtomAction.Click) action).getParams();
            String str2 = null;
            Integer valueOf = (params == null || (str = params.get("position")) == null) ? null : Integer.valueOf(Integer.parseInt(str));
            int i11 = this.selectedChipPosition;
            int i12 = -1;
            if ((valueOf == null || valueOf.intValue() != i11) && valueOf != null) {
                i12 = valueOf.intValue();
            }
            this.selectedChipPosition = i12;
            AddressEditPickUpDetailVO.AddressLabel addressLabel = item.getAddressLabel();
            if (addressLabel != null && (chipsMobile3 = addressLabel.getChipsMobile()) != null) {
                List<AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile> list = chipsMobile3;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                int i13 = 0;
                for (Object obj : list) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile chipItemMobile3 = (AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile) obj;
                    copy = r9.copy((r34 & 1) != 0 ? r9.styleType : null, (r34 & 2) != 0 ? r9.size : null, (r34 & 4) != 0 ? r9.isSelected : Boolean.valueOf(i13 == this.selectedChipPosition), (r34 & 8) != 0 ? r9.isDisabled : null, (r34 & 16) != 0 ? r9.isClosable : null, (r34 & 32) != 0 ? r9.icon : null, (r34 & 64) != 0 ? r9.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r9.indicator : null, (r34 & 256) != 0 ? r9.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r9.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r9.common : null, (r34 & 2048) != 0 ? r9.closeControlSettings : null, (r34 & 4096) != 0 ? r9.context : null, (r34 & 8192) != 0 ? r9.isStateChangeDisabled : null, (r34 & 16384) != 0 ? r9.image : null, (r34 & 32768) != 0 ? chipItemMobile3.getTagButton().round : null);
                    arrayList.add(AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile.copy$default(chipItemMobile3, false, copy, 1, null));
                    i13 = i14;
                }
                AtomsAdapter atomsAdapter = this.addressNameChipsAdapter;
                Context context = getContext();
                List<TagButtonDTO> arrayList2 = new ArrayList<>(C7714v.z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile) it.next()).getTagButton());
                }
                atomsAdapter.bind(context, addActions(arrayList2));
            }
            TextInputEditText textInputEditText = this.binding.addressNameEt;
            AddressEditPickUpDetailVO.AddressLabel addressLabel2 = item.getAddressLabel();
            boolean hasTextField = (addressLabel2 == null || (chipsMobile2 = addressLabel2.getChipsMobile()) == null || (chipItemMobile2 = (AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile) C7714v.Q(this.selectedChipPosition, chipsMobile2)) == null) ? false : chipItemMobile2.getHasTextField();
            TextInputLayout addressNameTil = this.binding.addressNameTil;
            Intrinsics.checkNotNullExpressionValue(addressNameTil, "addressNameTil");
            addressNameTil.setVisibility(hasTextField ? 0 : 8);
            if (hasTextField) {
                Intrinsics.f(textInputEditText);
                showKeyboardDelayed(textInputEditText);
                updateAddressLabel(String.valueOf(textInputEditText.getText()));
                return;
            }
            textInputEditText.clearFocus();
            AddressEditPickUpDetailVO.AddressLabel addressLabel3 = item.getAddressLabel();
            if (addressLabel3 != null && (chipsMobile = addressLabel3.getChipsMobile()) != null && (chipItemMobile = (AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile) C7714v.Q(this.selectedChipPosition, chipsMobile)) != null && (tagButton = chipItemMobile.getTagButton()) != null) {
                str2 = tagButton.getText();
            }
            if (str2 == null) {
                str2 = "";
            }
            updateAddressLabel(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailWidgetVH] */
    private final List<TagButtonDTO> prepareChips() {
        AddressEditPickUpDetailVO.AddressLabel addressLabel;
        AddressEditPickUpDetailVO addressEditPickUpDetailVO = this.item;
        List<TagButtonDTO> list = null;
        ?? r12 = 0;
        list = null;
        if (addressEditPickUpDetailVO != null && (addressLabel = addressEditPickUpDetailVO.getAddressLabel()) != null) {
            this.binding.getConstraintLayout().post(new GI.d(4, this, addressLabel));
            List<AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile> chipsMobile = addressLabel.getChipsMobile();
            if (chipsMobile != null) {
                List<AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile> list2 = chipsMobile;
                r12 = new ArrayList(C7714v.z(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    r12.add(((AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile) it.next()).getTagButton());
                }
            }
            if (r12 == 0) {
                r12 = K.f71697a;
            }
            Iterator it2 = r12.iterator();
            int i11 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (Intrinsics.d(((TagButtonDTO) it2.next()).isSelected(), Boolean.TRUE)) {
                    break;
                }
                i11++;
            }
            this.selectedChipPosition = i11;
            list = addActions(r12);
        }
        return list == null ? K.f71697a : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareChips$lambda$25$lambda$22(AddressEditPickUpDetailWidgetVH addressEditPickUpDetailWidgetVH, AddressEditPickUpDetailVO.AddressLabel addressLabel) {
        String value = addressLabel.getValue();
        if (value == null) {
            value = "";
        }
        addressEditPickUpDetailWidgetVH.updateAddressLabel(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processClickOnGallery(AtomAction.Click atomAction) {
        Integer w02;
        AtomDTO dto = atomAction.getDto();
        ImageCarousel imageCarousel = dto instanceof ImageCarousel ? (ImageCarousel) dto : null;
        if (imageCarousel == null || imageCarousel.getImages().isEmpty()) {
            return;
        }
        List<String> images = imageCarousel.getImages();
        String link = atomAction.getLink();
        showGallery(images, (link == null || (w02 = h.w0(link)) == null) ? 0 : w02.intValue());
    }

    private final void removeKeyboardCallbacks(View view) {
        Runnable runnable = this.keyboardShowRunnable;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        this.keyboardShowRunnable = null;
    }

    private final void removeOnBoardingCallbacks(View view) {
        Runnable runnable = this.onBoardingShowRunnable;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        this.onBoardingShowRunnable = null;
    }

    private final void setupAddress(AddressEditPickUpDetailVO item) {
        List<AddressEditPickUpDetailVO.Address> newAddress = item.getNewAddress();
        if (newAddress == null || newAddress.isEmpty()) {
            this.addressAdapter.bind(getContext(), item.getAddress());
            RecyclerView addressRv = this.binding.addressRv;
            Intrinsics.checkNotNullExpressionValue(addressRv, "addressRv");
            ViewExtKt.gone(addressRv);
            VerticalAtomsLayout addressVAL = this.binding.addressVAL;
            Intrinsics.checkNotNullExpressionValue(addressVAL, "addressVAL");
            ViewExtKt.show(addressVAL);
            return;
        }
        this.newAddressAdapter.submitList(item.getNewAddress());
        VerticalAtomsLayout addressVAL2 = this.binding.addressVAL;
        Intrinsics.checkNotNullExpressionValue(addressVAL2, "addressVAL");
        ViewExtKt.gone(addressVAL2);
        RecyclerView addressRv2 = this.binding.addressRv;
        Intrinsics.checkNotNullExpressionValue(addressRv2, "addressRv");
        ViewExtKt.show(addressRv2);
    }

    private final void setupDisclaimer(AddressEditPickUpDetailVO item) {
        WidgetAddressEditPickupDetailV2Binding widgetAddressEditPickupDetailV2Binding = this.binding;
        DisclaimerDTO disclaimer = item.getDisclaimer();
        if (disclaimer != null) {
            DisclaimerContainer disclaimer2 = widgetAddressEditPickupDetailV2Binding.disclaimer;
            Intrinsics.checkNotNullExpressionValue(disclaimer2, "disclaimer");
            ViewExtKt.gone(disclaimer2);
            DisclaimerView disclaimerView = widgetAddressEditPickupDetailV2Binding.newDisclaimerView;
            Intrinsics.f(disclaimerView);
            ViewExtKt.show(disclaimerView);
            DSDisclaimerHolderKt.bind(disclaimerView, disclaimer, this.actionHandler);
            return;
        }
        DisclaimerAtom annotation = item.getAnnotation();
        if (annotation == null) {
            DisclaimerView newDisclaimerView = widgetAddressEditPickupDetailV2Binding.newDisclaimerView;
            Intrinsics.checkNotNullExpressionValue(newDisclaimerView, "newDisclaimerView");
            ViewExtKt.gone(newDisclaimerView);
            DisclaimerContainer disclaimer3 = widgetAddressEditPickupDetailV2Binding.disclaimer;
            Intrinsics.checkNotNullExpressionValue(disclaimer3, "disclaimer");
            ViewExtKt.gone(disclaimer3);
            return;
        }
        DisclaimerView newDisclaimerView2 = widgetAddressEditPickupDetailV2Binding.newDisclaimerView;
        Intrinsics.checkNotNullExpressionValue(newDisclaimerView2, "newDisclaimerView");
        ViewExtKt.gone(newDisclaimerView2);
        DisclaimerContainer disclaimerContainer = widgetAddressEditPickupDetailV2Binding.disclaimer;
        Intrinsics.f(disclaimerContainer);
        ViewExtKt.show(disclaimerContainer);
        DisclaimerHolderKt.bind(disclaimerContainer, annotation, this.actionHandler);
    }

    private final void showGallery(List<String> images, int currentPosition) {
        this.router.showGallery(getContext(), GalleryRequest.Companion.createFromImageUrls$default(GalleryRequest.INSTANCE, images, currentPosition, null, null, 12, null));
    }

    private final void showKeyboardDelayed(View view) {
        Runnable runnable = this.keyboardShowRunnable;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        f fVar = new f(3, this, view);
        this.keyboardShowRunnable = fVar;
        view.postDelayed(fVar, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showKeyboardDelayed$lambda$36(AddressEditPickUpDetailWidgetVH addressEditPickUpDetailWidgetVH, View view) {
        addressEditPickUpDetailWidgetVH.keyboardShowRunnable = null;
        view.requestFocus();
        KeyboardUtilsKt.showKeyboard(view);
    }

    private final CharSequence underlineIfNeeded(String str, Context context) {
        if (!UniGlobalConfigKt.getUnderlineLinksFlag(context)) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAddressLabel(String addressLabel) {
        this.ref.getController().d(new FormBuilderFieldUpdate.FormBuilderTextFieldUpdate("addressLabel", addressLabel));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        TextInputEditText addressNameEt = this.binding.addressNameEt;
        Intrinsics.checkNotNullExpressionValue(addressNameEt, "addressNameEt");
        removeKeyboardCallbacks(addressNameEt);
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        removeOnBoardingCallbacks(constraintLayout);
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    @SuppressLint({"ClickableViewAccessibility"})
    public void bind(@NotNull final AddressEditPickUpDetailVO item, @NotNull l20.d info) {
        List<? extends AtomDTO> list;
        List<AddressEditPickUpDetailVO.Schedule.InlineDate> inlineDatesToDisplay;
        AddressEditPickUpDetailVO.AddressLabel.TextField textField;
        int i11;
        List<AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile> chipsMobile;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        this.addressNameChipsAdapter.bind(getContext(), prepareChips());
        this.addressNameChipsAdapter.setOnAction(new AddressEditPickUpDetailWidgetVH$bind$1(this, item));
        this.headerAdapter.bind(getContext(), item.getHeader());
        WidgetAddressEditPickupDetailV2Binding widgetAddressEditPickupDetailV2Binding = this.binding;
        setupAddress(item);
        setupDisclaimer(item);
        HorizontalScrollView addressNameChipsHSV = widgetAddressEditPickupDetailV2Binding.addressNameChipsHSV;
        Intrinsics.checkNotNullExpressionValue(addressNameChipsHSV, "addressNameChipsHSV");
        AddressEditPickUpDetailVO.AddressLabel addressLabel = item.getAddressLabel();
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(addressNameChipsHSV, Boolean.valueOf((addressLabel == null || (chipsMobile = addressLabel.getChipsMobile()) == null) ? false : !chipsMobile.isEmpty()));
        AddressEditPickUpDetailVO.AddressLabel addressLabel2 = item.getAddressLabel();
        if (addressLabel2 != null && (textField = addressLabel2.getTextField()) != null) {
            TextInputEditText textInputEditText = widgetAddressEditPickupDetailV2Binding.addressNameEt;
            textInputEditText.removeTextChangedListener(this.addressLabelWatcher);
            TextInputEditText textInputEditText2 = widgetAddressEditPickupDetailV2Binding.addressNameEt;
            String value = textField.getValue();
            if (value == null) {
                value = "";
            }
            textInputEditText2.setText(value);
            textInputEditText.addTextChangedListener(this.addressLabelWatcher);
            TextInputLayout textInputLayout = widgetAddressEditPickupDetailV2Binding.addressNameTil;
            textInputLayout.e0();
            String placeholder = textField.getPlaceholder();
            textInputLayout.d0(placeholder != null ? placeholder : "");
            List<AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile> chipsMobile2 = item.getAddressLabel().getChipsMobile();
            if (chipsMobile2 != null) {
                List<AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile> list2 = chipsMobile2;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile chipItemMobile : list2) {
                        if (chipItemMobile.getHasTextField() && Intrinsics.d(chipItemMobile.getTagButton().isSelected(), Boolean.TRUE)) {
                            i11 = 0;
                            break;
                        }
                    }
                }
            }
            i11 = 8;
            textInputLayout.setVisibility(i11);
        }
        AddressEditPickUpDetailVO.Banner banner = item.getBanner();
        if (banner != null) {
            ConstraintLayout bannerLayout = widgetAddressEditPickupDetailV2Binding.bannerLayout;
            Intrinsics.checkNotNullExpressionValue(bannerLayout, "bannerLayout");
            ViewExtKt.show(bannerLayout);
            widgetAddressEditPickupDetailV2Binding.dueDateTA.bind(banner.getDueDate());
            widgetAddressEditPickupDetailV2Binding.marketingInfoTA.bind(banner.getMarketingInfo());
            this.bannerInfoAdapter.bind(getContext(), banner.getElements());
            ConstraintLayout constraintLayout = widgetAddressEditPickupDetailV2Binding.bannerLayout;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(a.getColor(getContext(), R.color.transparent));
            gradientDrawable.setCornerRadius(UiExtKt.toPx(2, getContext()));
            gradientDrawable.setStroke(UiExtKt.toPx(2, getContext()), StyleParser.INSTANCE.parseColor(getContext(), banner.getBorderColor(), UniColors.BG_EXPRESS_SECONDARY.getResId()));
            constraintLayout.setBackground(gradientDrawable);
            ImageView coverImageIV = widgetAddressEditPickupDetailV2Binding.coverImageIV;
            Intrinsics.checkNotNullExpressionValue(coverImageIV, "coverImageIV");
            ImageViewExtKt.loadAsBitmap$default(coverImageIV, banner.getCoverImage(), null, null, null, 14, null);
        } else {
            ConstraintLayout bannerLayout2 = widgetAddressEditPickupDetailV2Binding.bannerLayout;
            Intrinsics.checkNotNullExpressionValue(bannerLayout2, "bannerLayout");
            ViewExtKt.gone(bannerLayout2);
        }
        TextAtomV2View numberPVZ = widgetAddressEditPickupDetailV2Binding.numberPVZ;
        Intrinsics.checkNotNullExpressionValue(numberPVZ, "numberPVZ");
        AddressEditPickUpDetailVO.NumberPVZ numberPVZ2 = item.getNumberPVZ();
        TextHolderKt.bindOrGone$default(numberPVZ, numberPVZ2 != null ? numberPVZ2.getNumber() : null, null, 2, null);
        widgetAddressEditPickupDetailV2Binding.numberPVZ.setOnTouchListener(new View.OnTouchListener(this) { // from class: xy.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressEditPickUpDetailWidgetVH f105631b;

            {
                this.f105631b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean bind$lambda$20$lambda$8;
                bind$lambda$20$lambda$8 = AddressEditPickUpDetailWidgetVH.bind$lambda$20$lambda$8(item, this.f105631b, view, motionEvent);
                return bind$lambda$20$lambda$8;
            }
        });
        TextView textView = widgetAddressEditPickupDetailV2Binding.headerBadgesTV;
        AddressEditPickUpDetailVO.BadgesHeader badgesHeader = item.getBadgesHeader();
        textView.setText(badgesHeader != null ? badgesHeader.getRatingHeaderTitle() : null);
        AtomsAdapter adapter = widgetAddressEditPickupDetailV2Binding.badgesHAL.getAdapter();
        if (adapter != null) {
            Context context = getContext();
            AddressEditPickUpDetailVO.BadgesHeader badgesHeader2 = item.getBadgesHeader();
            List<BadgeDTO> badges = badgesHeader2 != null ? badgesHeader2.getBadges() : null;
            if (badges == null) {
                badges = K.f71697a;
            }
            adapter.bind(context, badges);
        }
        Group badgesGroup = widgetAddressEditPickupDetailV2Binding.badgesGroup;
        Intrinsics.checkNotNullExpressionValue(badgesGroup, "badgesGroup");
        AddressEditPickUpDetailVO.BadgesHeader badgesHeader3 = item.getBadgesHeader();
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(badgesGroup, Boolean.valueOf((badgesHeader3 != null ? badgesHeader3.getRatingHeaderTitle() : null) != null));
        FrameAtomsLayout photosFAL = widgetAddressEditPickupDetailV2Binding.photosFAL;
        Intrinsics.checkNotNullExpressionValue(photosFAL, "photosFAL");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(photosFAL, Boolean.valueOf(item.getPhotos() != null));
        AtomsAdapter atomsAdapter = this.photosAdapter;
        Context context2 = getContext();
        ImageCarousel photos = item.getPhotos();
        if (photos == null || (list = C7714v.a0(photos)) == null) {
            list = K.f71697a;
        }
        atomsAdapter.bind(context2, list);
        List<AddressEditPickUpDetailVO.DeliveryCondition> newDeliveryConditions = item.getNewDeliveryConditions();
        if (newDeliveryConditions != null) {
            if (item.getDeliveryConditionsOnTop()) {
                ConstraintLayout constraintLayout2 = this.binding.getConstraintLayout();
                androidx.constraintlayout.widget.d d11 = Tl.a.d(constraintLayout2, "getRoot(...)", constraintLayout2);
                RecyclerView deliveryConditionRv = widgetAddressEditPickupDetailV2Binding.deliveryConditionRv;
                Intrinsics.checkNotNullExpressionValue(deliveryConditionRv, "deliveryConditionRv");
                Barrier addressBarrier = widgetAddressEditPickupDetailV2Binding.addressBarrier;
                Intrinsics.checkNotNullExpressionValue(addressBarrier, "addressBarrier");
                ConstraintSetExtKt.layoutConstraintTopToBottomOf(d11, deliveryConditionRv, addressBarrier);
                RecyclerView scheduleRV = widgetAddressEditPickupDetailV2Binding.scheduleRV;
                Intrinsics.checkNotNullExpressionValue(scheduleRV, "scheduleRV");
                RecyclerView deliveryConditionRv2 = widgetAddressEditPickupDetailV2Binding.deliveryConditionRv;
                Intrinsics.checkNotNullExpressionValue(deliveryConditionRv2, "deliveryConditionRv");
                ConstraintSetExtKt.layoutConstraintTopToBottomOf(d11, scheduleRV, deliveryConditionRv2);
                FrameAtomsLayout placeHeaderFAL = widgetAddressEditPickupDetailV2Binding.placeHeaderFAL;
                Intrinsics.checkNotNullExpressionValue(placeHeaderFAL, "placeHeaderFAL");
                TextView collapse = widgetAddressEditPickupDetailV2Binding.collapse;
                Intrinsics.checkNotNullExpressionValue(collapse, "collapse");
                ConstraintSetExtKt.layoutConstraintTopToBottomOf(d11, placeHeaderFAL, collapse);
                d11.f(constraintLayout2);
            } else {
                ConstraintLayout constraintLayout3 = this.binding.getConstraintLayout();
                androidx.constraintlayout.widget.d d12 = Tl.a.d(constraintLayout3, "getRoot(...)", constraintLayout3);
                RecyclerView scheduleRV2 = widgetAddressEditPickupDetailV2Binding.scheduleRV;
                Intrinsics.checkNotNullExpressionValue(scheduleRV2, "scheduleRV");
                Barrier addressBarrier2 = widgetAddressEditPickupDetailV2Binding.addressBarrier;
                Intrinsics.checkNotNullExpressionValue(addressBarrier2, "addressBarrier");
                ConstraintSetExtKt.layoutConstraintTopToBottomOf(d12, scheduleRV2, addressBarrier2);
                RecyclerView deliveryConditionRv3 = widgetAddressEditPickupDetailV2Binding.deliveryConditionRv;
                Intrinsics.checkNotNullExpressionValue(deliveryConditionRv3, "deliveryConditionRv");
                TextView collapse2 = widgetAddressEditPickupDetailV2Binding.collapse;
                Intrinsics.checkNotNullExpressionValue(collapse2, "collapse");
                ConstraintSetExtKt.layoutConstraintTopToBottomOf(d12, deliveryConditionRv3, collapse2);
                FrameAtomsLayout placeHeaderFAL2 = widgetAddressEditPickupDetailV2Binding.placeHeaderFAL;
                Intrinsics.checkNotNullExpressionValue(placeHeaderFAL2, "placeHeaderFAL");
                Barrier deliveryConditionsBarrier = widgetAddressEditPickupDetailV2Binding.deliveryConditionsBarrier;
                Intrinsics.checkNotNullExpressionValue(deliveryConditionsBarrier, "deliveryConditionsBarrier");
                ConstraintSetExtKt.layoutConstraintTopToBottomOf(d12, placeHeaderFAL2, deliveryConditionsBarrier);
                d12.f(constraintLayout3);
            }
            this.newDeliveryConditionAdapter.submitList(newDeliveryConditions);
        }
        if (item.getSchedule() != null) {
            AddressEditPickUpDetailVO.Schedule schedule = item.getSchedule();
            List<AddressEditPickUpDetailVO.Schedule.InlineDate> inlineDatesToStore = schedule.getInlineDatesToStore();
            if (inlineDatesToStore == null || inlineDatesToStore.isEmpty() || (inlineDatesToDisplay = schedule.getInlineDatesToDisplay()) == null || inlineDatesToDisplay.isEmpty()) {
                List<AtomDTO> datesToStore = !schedule.getIsCollapsed() ? schedule.getDatesToStore() : schedule.getDatesToDisplay();
                if (datesToStore.isEmpty()) {
                    VerticalAtomsLayout scheduleVAL = widgetAddressEditPickupDetailV2Binding.scheduleVAL;
                    Intrinsics.checkNotNullExpressionValue(scheduleVAL, "scheduleVAL");
                    ViewExtKt.gone(scheduleVAL);
                } else {
                    VerticalAtomsLayout scheduleVAL2 = widgetAddressEditPickupDetailV2Binding.scheduleVAL;
                    Intrinsics.checkNotNullExpressionValue(scheduleVAL2, "scheduleVAL");
                    ViewExtKt.show(scheduleVAL2);
                    this.scheduleAdapter.bind(getContext(), datesToStore);
                }
                RecyclerView scheduleRV3 = widgetAddressEditPickupDetailV2Binding.scheduleRV;
                Intrinsics.checkNotNullExpressionValue(scheduleRV3, "scheduleRV");
                ViewExtKt.gone(scheduleRV3);
                ImageView scheduleIconIv = widgetAddressEditPickupDetailV2Binding.scheduleIconIv;
                Intrinsics.checkNotNullExpressionValue(scheduleIconIv, "scheduleIconIv");
                ViewExtKt.gone(scheduleIconIv);
            } else {
                VerticalAtomsLayout scheduleVAL3 = widgetAddressEditPickupDetailV2Binding.scheduleVAL;
                Intrinsics.checkNotNullExpressionValue(scheduleVAL3, "scheduleVAL");
                ViewExtKt.gone(scheduleVAL3);
                RecyclerView scheduleRV4 = widgetAddressEditPickupDetailV2Binding.scheduleRV;
                Intrinsics.checkNotNullExpressionValue(scheduleRV4, "scheduleRV");
                ViewExtKt.show(scheduleRV4);
                ImageView scheduleIconIv2 = widgetAddressEditPickupDetailV2Binding.scheduleIconIv;
                Intrinsics.checkNotNullExpressionValue(scheduleIconIv2, "scheduleIconIv");
                ViewExtKt.show(scheduleIconIv2);
                this.scheduleInlineDateAdapter.submitList(!schedule.getIsCollapsed() ? schedule.getInlineDatesToStore() : schedule.getInlineDatesToDisplay());
                ImageView scheduleIconIv3 = widgetAddressEditPickupDetailV2Binding.scheduleIconIv;
                Intrinsics.checkNotNullExpressionValue(scheduleIconIv3, "scheduleIconIv");
                ImageViewExtKt.load$default(scheduleIconIv3, schedule.getInlineDatesImage(), null, null, null, null, false, null, 126, null);
                ImageView scheduleIconIv4 = widgetAddressEditPickupDetailV2Binding.scheduleIconIv;
                Intrinsics.checkNotNullExpressionValue(scheduleIconIv4, "scheduleIconIv");
                ThemeExtKt.tint(scheduleIconIv4, StyleParser.INSTANCE.parseColor(getContext(), item.getSchedule().getImageTintColor()));
            }
            TextView textView2 = widgetAddressEditPickupDetailV2Binding.collapse;
            String handleExpandText = schedule.getHandleExpandText();
            Context context3 = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            textView2.setText(underlineIfNeeded(handleExpandText, context3));
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(textView2, Boolean.valueOf(schedule.getIsShowHandle() && schedule.getIsCollapsed()));
        } else {
            VerticalAtomsLayout scheduleVAL4 = widgetAddressEditPickupDetailV2Binding.scheduleVAL;
            Intrinsics.checkNotNullExpressionValue(scheduleVAL4, "scheduleVAL");
            ViewExtKt.gone(scheduleVAL4);
            RecyclerView scheduleRV5 = widgetAddressEditPickupDetailV2Binding.scheduleRV;
            Intrinsics.checkNotNullExpressionValue(scheduleRV5, "scheduleRV");
            ViewExtKt.gone(scheduleRV5);
            ImageView scheduleIconIv5 = widgetAddressEditPickupDetailV2Binding.scheduleIconIv;
            Intrinsics.checkNotNullExpressionValue(scheduleIconIv5, "scheduleIconIv");
            ViewExtKt.gone(scheduleIconIv5);
            TextView collapse3 = widgetAddressEditPickupDetailV2Binding.collapse;
            Intrinsics.checkNotNullExpressionValue(collapse3, "collapse");
            ViewExtKt.gone(collapse3);
        }
        if (item.getNewDeliveryConditions() != null) {
            VerticalAtomsLayout deliveryConditionsVAL = widgetAddressEditPickupDetailV2Binding.deliveryConditionsVAL;
            Intrinsics.checkNotNullExpressionValue(deliveryConditionsVAL, "deliveryConditionsVAL");
            ViewExtKt.gone(deliveryConditionsVAL);
        } else {
            VerticalAtomsLayout deliveryConditionsVAL2 = widgetAddressEditPickupDetailV2Binding.deliveryConditionsVAL;
            Intrinsics.checkNotNullExpressionValue(deliveryConditionsVAL2, "deliveryConditionsVAL");
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(deliveryConditionsVAL2, Boolean.valueOf(item.getDeliveryConditions() != null));
            List<AtomDTO> deliveryConditions = item.getDeliveryConditions();
            if (deliveryConditions != null) {
                this.deliveryConditionsAdapter.bind(getContext(), deliveryConditions);
            }
        }
        FrameAtomsLayout placeHeaderFAL3 = widgetAddressEditPickupDetailV2Binding.placeHeaderFAL;
        Intrinsics.checkNotNullExpressionValue(placeHeaderFAL3, "placeHeaderFAL");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(placeHeaderFAL3, Boolean.valueOf(item.getPlaceHeader() != null));
        AtomDTO placeHeader = item.getPlaceHeader();
        if (placeHeader != null) {
            this.placeHeaderAdapter.bind(getContext(), C7714v.a0(placeHeader));
        }
        VerticalAtomsLayout metroVAL = widgetAddressEditPickupDetailV2Binding.metroVAL;
        Intrinsics.checkNotNullExpressionValue(metroVAL, "metroVAL");
        List<AtomDTO> metro = item.getMetro();
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(metroVAL, Boolean.valueOf(!(metro == null || metro.isEmpty())));
        List<AtomDTO> metro2 = item.getMetro();
        if (metro2 != null) {
            this.metroAdapter.bind(getContext(), metro2);
        }
        VerticalAtomsLayout placeDescriptionsVAL = widgetAddressEditPickupDetailV2Binding.placeDescriptionsVAL;
        Intrinsics.checkNotNullExpressionValue(placeDescriptionsVAL, "placeDescriptionsVAL");
        List<AtomDTO> placeDescriptions = item.getPlaceDescriptions();
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(placeDescriptionsVAL, Boolean.valueOf(!(placeDescriptions == null || placeDescriptions.isEmpty())));
        List<AtomDTO> placeDescriptions2 = item.getPlaceDescriptions();
        if (placeDescriptions2 != null) {
            this.placeDescriptionsAdapter.bind(getContext(), placeDescriptions2);
        }
        VerticalAtomsLayout controlsVAL = widgetAddressEditPickupDetailV2Binding.controlsVAL;
        Intrinsics.checkNotNullExpressionValue(controlsVAL, "controlsVAL");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(controlsVAL, Boolean.valueOf(item.getControls() != null));
        List<AtomDTO> controls = item.getControls();
        if (controls != null) {
            this.controlsAdapter.bind(getContext(), controls);
        }
        if (item.getOnboarding() != null) {
            ConstraintLayout constraintLayout4 = this.binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "getRoot(...)");
            removeOnBoardingCallbacks(constraintLayout4);
            final View childAt = this.binding.addressNameChipsHAL.getChildAt(0);
            if (childAt == null) {
                return;
            }
            childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailWidgetVH$bind$lambda$20$$inlined$afterMeasured$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    OnBoardingDelegate onBoardingDelegate;
                    Runnable runnable;
                    if (childAt.getMeasuredWidth() <= 0 || childAt.getMeasuredHeight() <= 0) {
                        return;
                    }
                    childAt.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    onBoardingDelegate = this.onBoardingDelegate;
                    if (onBoardingDelegate == null) {
                        this.initDelegate(item.getOnboarding());
                    }
                    final View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    final int relativeTopPositionViewInRoot = UtilsKt.getRelativeTopPositionViewInRoot(itemView, childAt);
                    final AddressEditPickUpDetailWidgetVH addressEditPickUpDetailWidgetVH = this;
                    final View view = childAt;
                    addressEditPickUpDetailWidgetVH.onBoardingShowRunnable = new Runnable() { // from class: ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailWidgetVH$bind$2$12$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            OnBoardingDelegate onBoardingDelegate2;
                            AddressEditPickUpDetailWidgetVH.Companion companion;
                            AddressEditPickUpDetailWidgetVH.Companion companion2;
                            AddressEditPickUpDetailWidgetVH.Companion companion3;
                            AddressEditPickUpDetailWidgetVH.Companion companion4;
                            boolean z11;
                            AddressEditPickUpDetailWidgetVH.Companion companion5;
                            float onBoardingCornerRadius;
                            AddressEditPickUpDetailWidgetVH.Companion companion6;
                            onBoardingDelegate2 = AddressEditPickUpDetailWidgetVH.this.onBoardingDelegate;
                            if (onBoardingDelegate2 != null) {
                                AddressEditPickUpDetailWidgetVH addressEditPickUpDetailWidgetVH2 = AddressEditPickUpDetailWidgetVH.this;
                                int i12 = relativeTopPositionViewInRoot;
                                companion = AddressEditPickUpDetailWidgetVH.Companion;
                                int dp_8 = i12 - companion.getDP_8();
                                companion2 = AddressEditPickUpDetailWidgetVH.Companion;
                                int dp_82 = companion2.getDP_8();
                                int width = itemView.getWidth() - view.getWidth();
                                companion3 = AddressEditPickUpDetailWidgetVH.Companion;
                                int dp_24 = width - companion3.getDP_24();
                                int height = (itemView.getHeight() - view.getHeight()) - relativeTopPositionViewInRoot;
                                companion4 = AddressEditPickUpDetailWidgetVH.Companion;
                                int dp_83 = height - companion4.getDP_8();
                                z11 = AddressEditPickUpDetailWidgetVH.this.isSelectApp;
                                if (z11) {
                                    companion6 = AddressEditPickUpDetailWidgetVH.Companion;
                                    onBoardingCornerRadius = companion6.getOnBoardingCornerRadiusSelect();
                                } else {
                                    companion5 = AddressEditPickUpDetailWidgetVH.Companion;
                                    onBoardingCornerRadius = companion5.getOnBoardingCornerRadius();
                                }
                                OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, addressEditPickUpDetailWidgetVH2, new OnBoardingCutConfig(Integer.valueOf(dp_82), Integer.valueOf(dp_8), Integer.valueOf(dp_24), Integer.valueOf(dp_83), null, null, Float.valueOf(onBoardingCornerRadius), false, 48, null), null, 4, null);
                            }
                        }
                    };
                    runnable = this.onBoardingShowRunnable;
                    itemView.postDelayed(runnable, 250L);
                }
            });
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AddressEditPickUpDetailVO item, @NotNull W10.c trackingData, ru.ozon.composer.ui.widget.f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AddressEditPickUpDetailWidgetVH) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, tokenizedEvent);
        }
    }
}
