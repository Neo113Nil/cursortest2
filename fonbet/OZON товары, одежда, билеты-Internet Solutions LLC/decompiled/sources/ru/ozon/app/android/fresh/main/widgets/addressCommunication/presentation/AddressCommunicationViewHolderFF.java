package ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import BQ.a;
import Sc.s;
import T7.E;
import WZ.l;
import WZ.t;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.common.flags.FreshAddressCommunicationKeepOnScrollFlag;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$style;
import ru.ozon.app.android.fresh.main.databinding.WidgetAddressCommunicationPopupBinding;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 c2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0002cdB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010#\u001a\u00060!j\u0002`\"H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u0010J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010\u0010J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010\u0010J\u000f\u0010)\u001a\u00020\u000eH\u0002¢\u0006\u0004\b)\u0010\u0010J\u000f\u0010*\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010\u0010J\u000f\u0010+\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010\u0010J\u000f\u0010,\u001a\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010\u0010J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00104\u001a\u0004\u0018\u0001032\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J\u0011\u00106\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH\u0002¢\u0006\u0004\b8\u0010\u0010J\u0011\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000eH\u0002¢\u0006\u0004\b<\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u000e0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000e0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0016\u0010_\u001a\u0004\u0018\u00010\\8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0016\u0010b\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "onAttach", "()V", "onDetach", "onViewOutOfVisibleBounds", "onViewInVisibleBounds", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationVO;Ll20/d;)V", "trackRefreshOnFragment", "updatePopupState", "hidePopup", "showPopup", "dismissPopup", "clearPopup", "createPopUp", "Lru/ozon/app/android/fresh/main/databinding/WidgetAddressCommunicationPopupBinding;", "binding", "bindPopupContent", "(Lru/ozon/app/android/fresh/main/databinding/WidgetAddressCommunicationPopupBinding;Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationVO;)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "atom", "", "getColorWithOpacity", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)Ljava/lang/Integer;", "setWidgetInvisible", "()Lkotlin/Unit;", "subscribeToVisualState", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewModel;", "viewModel", "()Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewModel;", "cancelHidePopupJob", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lkotlin/Function1;", "", "shouldShowObserver", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Landroid/widget/PopupWindow;", "popup", "Landroid/widget/PopupWindow;", "Lxe/B0;", "showPopupJob", "Lxe/B0;", "hidePopupJob", "refreshJob", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF$PopupState;", "popupState", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF$PopupState;", "popupBinding", "Lru/ozon/app/android/fresh/main/databinding/WidgetAddressCommunicationPopupBinding;", "isWidgetVisible", "Z", "isAppBarAtTop", "Lcom/google/android/material/appbar/AppBarLayout$f;", "offsetChangeListener", "Lcom/google/android/material/appbar/AppBarLayout$f;", "getKeepOnScroll", "()Z", "keepOnScroll", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getAppHeader", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "appHeader", "getComposerRootView", "()Landroid/view/View;", "composerRootView", "Companion", "PopupState", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressCommunicationViewHolderFF extends k<AddressCommunicationVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FeatureChecker featureChecker;
    private B0 hidePopupJob;
    private boolean isAppBarAtTop;
    private boolean isWidgetVisible;

    @NotNull
    private final AppBarLayout.f offsetChangeListener;
    private PopupWindow popup;
    private WidgetAddressCommunicationPopupBinding popupBinding;

    @NotNull
    private PopupState popupState;
    private B0 refreshJob;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final Function1<Boolean, Unit> shouldShowObserver;
    private B0 showPopupJob;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF$PopupState;", "", "<init>", "()V", "Hidden", "Visible", "Pending", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF$PopupState$Hidden;", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF$PopupState$Pending;", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF$PopupState$Visible;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static abstract class PopupState {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF$PopupState$Hidden;", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF$PopupState;", "<init>", "()V", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Hidden extends PopupState {

            @NotNull
            public static final Hidden INSTANCE = new Hidden();

            private Hidden() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF$PopupState$Pending;", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF$PopupState;", "", "itemHash", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getItemHash", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Pending extends PopupState {
            private final int itemHash;

            public Pending(int i11) {
                super(null);
                this.itemHash = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Pending) && this.itemHash == ((Pending) other).itemHash;
            }

            public final int getItemHash() {
                return this.itemHash;
            }

            public int hashCode() {
                return Integer.hashCode(this.itemHash);
            }

            @NotNull
            public String toString() {
                return E.a(this.itemHash, "Pending(itemHash=", ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF$PopupState$Visible;", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewHolderFF$PopupState;", "<init>", "()V", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Visible extends PopupState {

            @NotNull
            public static final Visible INSTANCE = new Visible();

            private Visible() {
                super(null);
            }
        }

        public /* synthetic */ PopupState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PopupState() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressCommunicationViewHolderFF(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull FeatureChecker featureChecker) {
        super(containerView);
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.featureChecker = featureChecker;
        this.shouldShowObserver = new AddressCommunicationViewHolderFF$shouldShowObserver$1(this);
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(new HandlersInhibitor()).onClick(new AddressCommunicationViewHolderFF$actionHandler$1(this)).buildHandler();
        this.popupState = PopupState.Hidden.INSTANCE;
        this.isAppBarAtTop = true;
        this.offsetChangeListener = new a(this, 1);
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 == null || (lifecycle = c11.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewHolderFF.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                AddressCommunicationViewHolderFF.this.subscribeToVisualState();
                AddressCommunicationViewHolderFF.this.trackRefreshOnFragment();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                AddressCommunicationViewHolderFF.this.cancelHidePopupJob();
                B0 b02 = AddressCommunicationViewHolderFF.this.refreshJob;
                if (b02 != null) {
                    b02.j(null);
                }
                AddressCommunicationViewHolderFF.this.refreshJob = null;
                AddressCommunicationViewHolderFF.this.clearPopup();
            }
        });
    }

    private final void bindPopupContent(WidgetAddressCommunicationPopupBinding binding, AddressCommunicationVO item) {
        TextAtomView tvTitle = binding.tvTitle;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        TextAtomHolderKt.bindOrGone$default(tvTitle, item.getTitle(), null, 2, null);
        TextAtomView tvSubtitle = binding.tvSubtitle;
        Intrinsics.checkNotNullExpressionValue(tvSubtitle, "tvSubtitle");
        TextAtomHolderKt.bindOrGone$default(tvSubtitle, item.getSubtitle(), null, 2, null);
        SmallButtonView btnNo = binding.btnNo;
        Intrinsics.checkNotNullExpressionValue(btnNo, "btnNo");
        WrappedButtonHolderKt.bindOrGone(btnNo, item.getNoButton(), new AddressCommunicationViewHolderFF$bindPopupContent$1$1(this, item));
        SmallButtonView btnYes = binding.btnYes;
        Intrinsics.checkNotNullExpressionValue(btnYes, "btnYes");
        WrappedButtonHolderKt.bindOrGone(btnYes, item.getYesButton(), this.actionHandler);
        Integer colorWithOpacity = getColorWithOpacity(item.getSubtitle());
        if (colorWithOpacity != null) {
            binding.tvSubtitle.setTextColor(colorWithOpacity.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelHidePopupJob() {
        B0 b02 = this.hidePopupJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.hidePopupJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPopup() {
        P<Boolean> shouldShow;
        this.popupState = PopupState.Hidden.INSTANCE;
        dismissPopup();
        AddressCommunicationViewModel viewModel = viewModel();
        if (viewModel == null || (shouldShow = viewModel.getShouldShow()) == null) {
            return;
        }
        shouldShow.removeObserver(new AddressCommunicationViewHolderFF$sam$androidx_lifecycle_Observer$0(this.shouldShowObserver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPopUp() {
        WidgetAddressCommunicationPopupBinding inflate = WidgetAddressCommunicationPopupBinding.inflate(LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.popupBinding = inflate;
        PopupWindow popupWindow = new PopupWindow(inflate.getConstraintLayout(), -2, -2);
        this.popup = popupWindow;
        popupWindow.setAnimationStyle(R$style.FadeInAnimationStyle);
        AddressCommunicationVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        bindPopupContent(inflate, boundData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissPopup() {
        B0 b02 = this.showPopupJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.showPopupJob = null;
        PopupWindow popupWindow = this.popup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.popup = null;
        this.popupBinding = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConstraintLayout getAppHeader() {
        View view;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return (ConstraintLayout) view.findViewById(R$id.miniappHeaderRootContainer);
    }

    private final Integer getColorWithOpacity(TextAtom atom) {
        StyleParser styleParser = StyleParser.INSTANCE;
        String parseOzColorToHex = styleParser.parseOzColorToHex(getContext(), atom.getTextColor());
        String substring = parseOzColorToHex.substring(1, parseOzColorToHex.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return styleParser.parseColor(getContext(), Nk.a.b("#99", substring));
    }

    private final View getComposerRootView() {
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 != null) {
            return c11.getView();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getKeepOnScroll() {
        return this.featureChecker.isEnabled(FreshAddressCommunicationKeepOnScrollFlag.INSTANCE);
    }

    private final void hidePopup() {
        if (!(this.popupState instanceof PopupState.Visible) || getKeepOnScroll() || this.isWidgetVisible) {
            this.popupState = PopupState.Hidden.INSTANCE;
            dismissPopup();
        } else {
            cancelHidePopupJob();
            ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
            this.hidePopupJob = c11 != null ? C10727i.c(K.a(c11), null, null, new AddressCommunicationViewHolderFF$hidePopup$1(this, null), 3) : null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offsetChangeListener$lambda$0(AddressCommunicationViewHolderFF addressCommunicationViewHolderFF, AppBarLayout appBarLayout, int i11) {
        Intrinsics.checkNotNullParameter(appBarLayout, "<unused var>");
        if (addressCommunicationViewHolderFF.getKeepOnScroll()) {
            return;
        }
        addressCommunicationViewHolderFF.isAppBarAtTop = i11 == 0;
        addressCommunicationViewHolderFF.updatePopupState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit setWidgetInvisible() {
        AddressCommunicationViewModel viewModel = viewModel();
        if (viewModel == null) {
            return null;
        }
        viewModel.setWidgetInvisible();
        return Unit.f71690a;
    }

    private final void showPopup() {
        PopupState popupState = this.popupState;
        PopupState.Pending pending = popupState instanceof PopupState.Pending ? (PopupState.Pending) popupState : null;
        if (pending != null) {
            int itemHash = pending.getItemHash();
            B0 b02 = this.showPopupJob;
            if (b02 != null) {
                b02.j(null);
            }
            ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
            this.showPopupJob = c11 != null ? C10727i.c(K.a(c11), null, null, new AddressCommunicationViewHolderFF$showPopup$1(itemHash, this, null), 3) : null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void subscribeToVisualState() {
        AddressCommunicationViewModel viewModel = viewModel();
        if (viewModel == null) {
            return;
        }
        viewModel.getShouldShow().removeObserver(new AddressCommunicationViewHolderFF$sam$androidx_lifecycle_Observer$0(this.shouldShowObserver));
        viewModel.getShouldShow().observeForever(new AddressCommunicationViewHolderFF$sam$androidx_lifecycle_Observer$0(this.shouldShowObserver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackRefreshOnFragment() {
        ComponentCallbacksC5392m c11;
        if (getKeepOnScroll() && (c11 = this.refs.getContainer().c()) != null) {
            final InterfaceC2395h<A00.a> eventsFlow = this.refs.getController().getEventsFlow();
            C2408n0 c2408n0 = new C2408n0(new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewHolderFF$trackRefreshOnFragment$$inlined$filterIsInstance$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewHolderFF$trackRefreshOnFragment$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewHolderFF$trackRefreshOnFragment$$inlined$filterIsInstance$1$2", f = "AddressCommunicationViewHolderFF.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewHolderFF$trackRefreshOnFragment$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                        this.$this_unsafeFlow = interfaceC2397i;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    if (obj instanceof a.u.b) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }, new AddressCommunicationViewHolderFF$trackRefreshOnFragment$1(this, null));
            J viewLifecycleOwner = c11.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            this.refreshJob = C2399j.C(c2408n0, K.a(viewLifecycleOwner));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePopupState() {
        P<Boolean> shouldShow;
        AddressCommunicationViewModel viewModel = viewModel();
        Boolean value = (viewModel == null || (shouldShow = viewModel.getShouldShow()) == null) ? null : shouldShow.getValue();
        boolean z11 = Intrinsics.d(value, Boolean.TRUE) && (getKeepOnScroll() || (this.isWidgetVisible && this.isAppBarAtTop));
        if (z11 && !(this.popupState instanceof PopupState.Visible)) {
            AddressCommunicationVO boundData = getBoundData();
            this.popupState = new PopupState.Pending(boundData != null ? boundData.hashCode() : 0);
            showPopup();
        } else {
            if (z11 || value == null || (this.popupState instanceof PopupState.Hidden)) {
                return;
            }
            hidePopup();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressCommunicationViewModel viewModel() {
        return (AddressCommunicationViewModel) getWidgetViewModel();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        View composerRootView;
        AppBarLayout composerAppbar;
        super.onAttach();
        if (getKeepOnScroll() || (composerRootView = getComposerRootView()) == null || (composerAppbar = ComposerViewExtensionKt.composerAppbar(composerRootView)) == null) {
            return;
        }
        composerAppbar.d(this.offsetChangeListener);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        subscribeToVisualState();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        AppBarLayout composerAppbar;
        super.onDetach();
        cancelHidePopupJob();
        if (getKeepOnScroll()) {
            return;
        }
        clearPopup();
        View composerRootView = getComposerRootView();
        if (composerRootView == null || (composerAppbar = ComposerViewExtensionKt.composerAppbar(composerRootView)) == null) {
            return;
        }
        composerAppbar.q(this.offsetChangeListener);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.isWidgetVisible = true;
        cancelHidePopupJob();
        if (this.isAppBarAtTop) {
            updatePopupState();
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        this.isWidgetVisible = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddressCommunicationVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetAddressCommunicationPopupBinding widgetAddressCommunicationPopupBinding = this.popupBinding;
        if (widgetAddressCommunicationPopupBinding != null) {
            bindPopupContent(widgetAddressCommunicationPopupBinding, item);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AddressCommunicationVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AddressCommunicationViewHolderFF) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
