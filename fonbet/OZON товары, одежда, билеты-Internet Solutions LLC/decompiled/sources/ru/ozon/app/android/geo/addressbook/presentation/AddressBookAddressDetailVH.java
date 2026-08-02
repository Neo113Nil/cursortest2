package ru.ozon.app.android.geo.addressbook.presentation;

import BC.a;
import Tv.c;
import Vg.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListPopupWindow;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipHelper;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.geo.R$string;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookAddressDetailVH;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookVO;
import ru.ozon.app.android.geo.databinding.WidgetItemAddressBookDetailBinding;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.ButtonIconAtom;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonIcon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000¥\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u00019\b\u0000\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001PB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010&J\u001f\u0010+\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0015¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010A\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookAddressDetailVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address;", "Lru/ozon/app/android/geo/databinding/WidgetItemAddressBookDetailBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "LVg/d;", "customActionHandlerFactory", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "<init>", "(Lru/ozon/app/android/geo/databinding/WidgetItemAddressBookDetailBinding;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;)V", "", "text", "", "showDialog", "(Ljava/lang/String;)V", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls;", "controls", "Landroid/widget/ListPopupWindow;", "onControlAction", "(Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls;)Landroid/widget/ListPopupWindow;", "deleteUrl", "showConfirmDeleteDialog", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoarding", "initDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$RadioItem;", "radioItem", "configureRadio", "(Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$RadioItem;)V", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ$Tooltip;", "cartTooltip", "showTooltip", "(Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ$Tooltip;)V", "subscribeToDismissEvents", "()V", "dismissTooltip", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address;Ll20/d;)V", "onDetach", "Lru/ozon/app/android/geo/databinding/WidgetItemAddressBookDetailBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/d;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "handler", "Lkotlin/jvm/functions/Function1;", "Landroid/os/Handler;", "tooltipHandler", "Landroid/os/Handler;", "ru/ozon/app/android/geo/addressbook/presentation/AddressBookAddressDetailVH$scrollListener$1", "scrollListener", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookAddressDetailVH$scrollListener$1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "badgesAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "controlsAdapter", "elementsAdapter", "bottomElementsAdapter", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "tooltipHelper", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "currentMenuPopup", "Landroid/widget/ListPopupWindow;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Ljava/lang/Runnable;", "showTooltipRunnable", "Ljava/lang/Runnable;", "", "tooltipShowed", "Z", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookAddressDetailVH extends k<AddressBookVO.Address> {

    @NotNull
    private final AtomsAdapter badgesAdapter;

    @NotNull
    private final WidgetItemAddressBookDetailBinding binding;

    @NotNull
    private final AtomsAdapter bottomElementsAdapter;

    @NotNull
    private final AtomsAdapter controlsAdapter;
    private ListPopupWindow currentMenuPopup;

    @NotNull
    private final d customActionHandlerFactory;

    @NotNull
    private final AtomsAdapter elementsAdapter;

    @NotNull
    private final Function1<AtomAction, Unit> handler;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final AddressBookAddressDetailVH$scrollListener$1 scrollListener;
    private Runnable showTooltipRunnable;

    @NotNull
    private final Handler tooltipHandler;

    @NotNull
    private final CartTooltipHelper tooltipHelper;
    private boolean tooltipShowed;
    private static final int widthPopup = UiExtKt.toPx(210);
    private static final int popupOffset = UiExtKt.toPx(-8);
    private static final int onBoardingMargin = UiExtKt.toPx(8);
    private static final float onBoardingCornerRadius = UiExtKt.toPxF(16);
    private static final int numberPVZMargin = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.geo.addressbook.presentation.AddressBookAddressDetailVH$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AtomAction, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AddressBookVO.Address boundedData = AddressBookAddressDetailVH.this.getBoundedData();
            if (boundedData != null) {
                AddressBookAddressDetailVH addressBookAddressDetailVH = AddressBookAddressDetailVH.this;
                AddressBookVO.Address.Controls controls = boundedData.getControls();
                addressBookAddressDetailVH.currentMenuPopup = controls != null ? addressBookAddressDetailVH.onControlAction(controls) : null;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [ru.ozon.app.android.geo.addressbook.presentation.AddressBookAddressDetailVH$scrollListener$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddressBookAddressDetailVH(@NotNull WidgetItemAddressBookDetailBinding binding, @NotNull ComposerReferences ref, @NotNull d customActionHandlerFactory, @NotNull BaseOnBoardingViewModel onBoardingViewModel) {
        super(r5);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(customActionHandlerFactory, "customActionHandlerFactory");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.ref = ref;
        this.customActionHandlerFactory = customActionHandlerFactory;
        this.onBoardingViewModel = onBoardingViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new AddressBookAddressDetailVH$handler$1(this)).onClick(new AddressBookAddressDetailVH$handler$2(this)).buildHandler();
        this.handler = buildHandler;
        this.tooltipHandler = new Handler(Looper.getMainLooper());
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.geo.addressbook.presentation.AddressBookAddressDetailVH$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Handler handler;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                handler = AddressBookAddressDetailVH.this.tooltipHandler;
                handler.removeCallbacksAndMessages(null);
                AddressBookAddressDetailVH.this.dismissTooltip();
            }
        };
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.badgesAdapter = atomsAdapter;
        int i11 = 2;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        Map map = null;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(ButtonIcon.class, null, i11, 0 == true ? 1 : 0), new ButtonIconAtom.Configuration(i12, i13, i14, 0, 0, Integer.valueOf(R$drawable.ic_kebab), 31, null))), map, null, null, 14, null);
        this.controlsAdapter = atomsAdapter2;
        Class<CommonText.TextSmall> cls = CommonText.TextSmall.class;
        Class<CommonText.TextMedium> cls2 = CommonText.TextMedium.class;
        Map map2 = null;
        AtomsAdapter atomsAdapter3 = new AtomsAdapter(U.j(new Pair(new Atom.ConfCondition(cls, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0), new TextAtom.Configuration(52, 48, 0, 0, 0, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 522228, null)), new Pair(new Atom.ConfCondition(cls2, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0), new TextAtom.Configuration(52, 48, 0, 0, 0, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 522228, null))), map2, null, null, 14, null);
        this.elementsAdapter = atomsAdapter3;
        Map map3 = null;
        AtomsAdapter atomsAdapter4 = new AtomsAdapter(U.j(new Pair(new Atom.ConfCondition(cls, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0), new TextAtom.Configuration(52, 48, 0, 8, 0, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 522228, null)), new Pair(new Atom.ConfCondition(cls2, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0), new TextAtom.Configuration(52, 48, 0, 8, 0, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 522228, null))), map3, null, null, 14, null);
        this.bottomElementsAdapter = atomsAdapter4;
        this.tooltipHelper = new CartTooltipHelper(ref.getContainer().j());
        ref.getContainer().f().getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.geo.addressbook.presentation.AddressBookAddressDetailVH.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                ListPopupWindow listPopupWindow = AddressBookAddressDetailVH.this.currentMenuPopup;
                if (listPopupWindow != null) {
                    listPopupWindow.dismiss();
                }
            }
        });
        atomsAdapter.setOnAction(buildHandler);
        atomsAdapter2.setOnAction(new AnonymousClass2());
        atomsAdapter3.setOnAction(buildHandler);
        atomsAdapter4.setOnAction(buildHandler);
        binding.getConstraintLayout().setOnClickListener(new a(this, 12));
        binding.badgesHAL.setAdapter(atomsAdapter);
        binding.controlsFAL.setAdapter(atomsAdapter2);
        binding.elementsVAL.setAdapter(atomsAdapter3);
        binding.bottomElementsVAL.setAdapter(atomsAdapter4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(AddressBookAddressDetailVH addressBookAddressDetailVH, View view) {
        String str;
        AddressBookVO.Address boundedData = addressBookAddressDetailVH.getBoundedData();
        if (boundedData != null) {
            if (boundedData.getIsEnabled()) {
                addressBookAddressDetailVH.handler.invoke(AtomActionMapperKt.toAtomAction(boundedData.getAction(), boundedData.getTrackingInfo()));
                return;
            }
            Map<String, String> params = boundedData.getAction().getParams();
            if (params == null || (str = params.get("textError")) == null) {
                return;
            }
            addressBookAddressDetailVH.showDialog(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$8$lambda$4(AddressBookVO.Address address, AddressBookAddressDetailVH addressBookAddressDetailVH, View view, MotionEvent motionEvent) {
        AddressBookVO.Address.NumberPVZ numberPVZ;
        AtomAction action;
        if (motionEvent.getAction() != 1 || (numberPVZ = address.getNumberPVZ()) == null || (action = numberPVZ.getAction()) == null) {
            return false;
        }
        addressBookAddressDetailVH.handler.invoke(action);
        return false;
    }

    private final void configureRadio(AddressBookVO.Address.RadioItem radioItem) {
        AppCompatImageView appCompatImageView = this.binding.radioIV;
        appCompatImageView.setSelected(radioItem.getIsChecked());
        appCompatImageView.setEnabled(radioItem.getIsEnabled());
        AppCompatTextView appCompatTextView = this.binding.radioTitleTv;
        appCompatTextView.setText(radioItem.getText());
        appCompatTextView.setSelected(radioItem.getIsChecked());
        appCompatTextView.setEnabled(radioItem.getIsEnabled());
        appCompatTextView.setVisibility(radioItem.getText() != null ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissTooltip() {
        View view;
        RecyclerView composerRecyclerView;
        this.tooltipHelper.onDismissTooltip();
        ComponentCallbacksC5392m c11 = this.ref.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.removeOnScrollListener(this.scrollListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl("address_book_on_boarding_is_shown", this.ref, this.binding.getConstraintLayout(), onBoarding, this, this.onBoardingViewModel, null, 0.0f, 192, null);
        onBoardingDelegateImpl.setOnShownListener(new AddressBookAddressDetailVH$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListPopupWindow onControlAction(final AddressBookVO.Address.Controls controls) {
        final ListPopupWindow listPopupWindow = new ListPopupWindow(this.binding.controlsFAL.getContext());
        listPopupWindow.setAnchorView(this.binding.controlsFAL);
        listPopupWindow.setHorizontalOffset(popupOffset);
        listPopupWindow.setDropDownGravity(8388613);
        listPopupWindow.setModal(true);
        listPopupWindow.setWidth(widthPopup);
        Context context = this.binding.controlsFAL.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        listPopupWindow.setAdapter(new ListPopupWindowAdapter(context, controls.getItems()));
        listPopupWindow.setBackgroundDrawable(androidx.core.content.a.getDrawable(getContext(), ru.ozon.app.android.geo.R$drawable.bg_address_book_menu));
        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: qy.a
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                AddressBookAddressDetailVH.onControlAction$lambda$12$lambda$11(AddressBookVO.Address.Controls.this, listPopupWindow, this, adapterView, view, i11, j11);
            }
        });
        listPopupWindow.show();
        return listPopupWindow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onControlAction$lambda$12$lambda$11(AddressBookVO.Address.Controls controls, ListPopupWindow listPopupWindow, AddressBookAddressDetailVH addressBookAddressDetailVH, AdapterView adapterView, View view, int i11, long j11) {
        AtomAction atomAction;
        AddressBookVO.Address.Controls.Control control = (AddressBookVO.Address.Controls.Control) C7714v.Q(i11, controls.getItems());
        if (control != null) {
            AtomActionDTO action = control.getAction();
            if (Intrinsics.d(action != null ? action.getId() : null, "copyText")) {
                Y.v(addressBookAddressDetailVH.binding.controlsFAL);
            }
            AtomActionDTO action2 = control.getAction();
            if (action2 != null && (atomAction = AtomActionMapperKt.toAtomAction(action2, control.getTrackingInfo())) != null) {
                addressBookAddressDetailVH.handler.invoke(atomAction);
            }
        }
        listPopupWindow.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfirmDeleteDialog(String deleteUrl) {
        AlertDialogFragment.Companion companion = AlertDialogFragment.INSTANCE;
        int i11 = R$string.address_book_remove_address_alert_title;
        int i12 = R$string.address_book_remove_address_alert_message;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i13 = 0;
        AlertDialogFragment.Params params = new AlertDialogFragment.Params(Integer.valueOf(i12), str, Integer.valueOf(i11), str2, ru.ozon.app.android.uikit.R$string.common_button_delete, str3, Integer.valueOf(ru.ozon.app.android.uikit.R$string.common_button_cancel), i13, 170, null);
        Intent intent = new Intent();
        intent.putExtra("EXTRA_DELETE_DEEPLINK", deleteUrl);
        Unit unit = Unit.f71690a;
        AlertDialogFragment newInstanceForFragmentResult = companion.newInstanceForFragmentResult(params, intent);
        newInstanceForFragmentResult.setTargetFragment(this.ref.getContainer().c(), 9010);
        newInstanceForFragmentResult.show(this.ref.getContainer().k(), (String) null);
    }

    private final void showDialog(String text) {
        AlertDialogFragment.INSTANCE.newInstanceSkipResult(new AlertDialogFragment.Params(null, text, Integer.valueOf(R$string.address_book_unavailable_address_alert_title), null, ru.ozon.app.android.uikit.R$string.common_action_close, null, null, 0, 232, null)).show(this.ref.getContainer().k(), (String) null);
    }

    private final void showTooltip(final AddressBookVO.Address.NumberPVZ.Tooltip cartTooltip) {
        if (this.tooltipShowed) {
            return;
        }
        Long delayTime = cartTooltip.getDelayTime();
        long longValue = delayTime != null ? delayTime.longValue() : 500L;
        Long displayTime = cartTooltip.getDisplayTime();
        final long longValue2 = displayTime != null ? displayTime.longValue() : 5000L;
        cartTooltip.getTooltip().setHideByTouchOutside(true);
        Runnable runnable = new Runnable() { // from class: qy.b
            @Override // java.lang.Runnable
            public final void run() {
                AddressBookAddressDetailVH.showTooltip$lambda$18(AddressBookAddressDetailVH.this, cartTooltip, longValue2);
            }
        };
        this.tooltipHandler.postDelayed(runnable, longValue);
        this.showTooltipRunnable = runnable;
        subscribeToDismissEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTooltip$lambda$18(AddressBookAddressDetailVH addressBookAddressDetailVH, AddressBookVO.Address.NumberPVZ.Tooltip tooltip, long j11) {
        CartTooltipHelper cartTooltipHelper = addressBookAddressDetailVH.tooltipHelper;
        CartTooltipVO tooltip2 = tooltip.getTooltip();
        TextAtomV2View numberPVZ = addressBookAddressDetailVH.binding.numberPVZ;
        Intrinsics.checkNotNullExpressionValue(numberPVZ, "numberPVZ");
        CartTooltipHelper.onShowTooltip$default(cartTooltipHelper, tooltip2, numberPVZ, 0, true, Long.valueOf(j11), null, 36, null);
        addressBookAddressDetailVH.tooltipShowed = true;
    }

    private final void subscribeToDismissEvents() {
        View view;
        RecyclerView composerRecyclerView;
        ComponentCallbacksC5392m c11 = this.ref.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.addOnScrollListener(this.scrollListener);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.tooltipHandler.removeCallbacksAndMessages(null);
        this.showTooltipRunnable = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    @SuppressLint({"ClickableViewAccessibility"})
    public void bind(@NotNull final AddressBookVO.Address item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetItemAddressBookDetailBinding widgetItemAddressBookDetailBinding = this.binding;
        View bottomSeparatorV = widgetItemAddressBookDetailBinding.bottomSeparatorV;
        Intrinsics.checkNotNullExpressionValue(bottomSeparatorV, "bottomSeparatorV");
        ViewExtKt.showOrGone(bottomSeparatorV, Boolean.valueOf(item.getBottomSeparator()));
        AtomsAdapter atomsAdapter = this.badgesAdapter;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        List<BadgeDTO> badges = item.getBadges();
        if (badges == null) {
            badges = K.f71697a;
        }
        atomsAdapter.bind(context, badges);
        TextAtomV2View numberPVZ = widgetItemAddressBookDetailBinding.numberPVZ;
        Intrinsics.checkNotNullExpressionValue(numberPVZ, "numberPVZ");
        AddressBookVO.Address.NumberPVZ numberPVZ2 = item.getNumberPVZ();
        TextHolderKt.bindOrGone$default(numberPVZ, numberPVZ2 != null ? numberPVZ2.getNumber() : null, null, 2, null);
        widgetItemAddressBookDetailBinding.numberPVZ.setOnTouchListener(new c(1, item, this));
        TextAtomV2View numberPVZ3 = widgetItemAddressBookDetailBinding.numberPVZ;
        Intrinsics.checkNotNullExpressionValue(numberPVZ3, "numberPVZ");
        ViewGroup.LayoutParams layoutParams = numberPVZ3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.rightMargin = item.getControls() == null ? numberPVZMargin : 0;
        numberPVZ3.setLayoutParams(marginLayoutParams);
        FrameAtomsLayout controlsFAL = widgetItemAddressBookDetailBinding.controlsFAL;
        Intrinsics.checkNotNullExpressionValue(controlsFAL, "controlsFAL");
        ViewExtKt.showOrGone(controlsFAL, Boolean.valueOf(item.getControls() != null));
        AddressBookVO.Address.Controls controls = item.getControls();
        if (controls != null) {
            AtomsAdapter atomsAdapter2 = this.controlsAdapter;
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            atomsAdapter2.bind(context2, C7714v.a0(controls.getIconButton()));
        }
        AtomsAdapter atomsAdapter3 = this.elementsAdapter;
        Context context3 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        List<AtomDTO> details = item.getDetails();
        if (details == null) {
            details = K.f71697a;
        }
        atomsAdapter3.bind(context3, details);
        AtomsAdapter atomsAdapter4 = this.bottomElementsAdapter;
        Context context4 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        List<AtomDTO> bottomDetails = item.getBottomDetails();
        if (bottomDetails == null) {
            bottomDetails = K.f71697a;
        }
        atomsAdapter4.bind(context4, bottomDetails);
        configureRadio(item.getAddress());
        AddressBookVO.Address.NumberPVZ numberPVZ4 = item.getNumberPVZ();
        if ((numberPVZ4 != null ? numberPVZ4.getTooltip() : null) != null) {
            showTooltip(item.getNumberPVZ().getTooltip());
        } else if (item.getOnboarding() != null) {
            final FrameAtomsLayout controlsFAL2 = this.binding.controlsFAL;
            Intrinsics.checkNotNullExpressionValue(controlsFAL2, "controlsFAL");
            controlsFAL2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.geo.addressbook.presentation.AddressBookAddressDetailVH$bind$lambda$8$$inlined$afterMeasured$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    OnBoardingDelegate onBoardingDelegate;
                    OnBoardingDelegate onBoardingDelegate2;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    float f7;
                    if (controlsFAL2.getMeasuredWidth() <= 0 || controlsFAL2.getMeasuredHeight() <= 0) {
                        return;
                    }
                    controlsFAL2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    onBoardingDelegate = this.onBoardingDelegate;
                    if (onBoardingDelegate == null) {
                        this.initDelegate(item.getOnboarding());
                    }
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    onBoardingDelegate2 = this.onBoardingDelegate;
                    if (onBoardingDelegate2 != null) {
                        AddressBookAddressDetailVH addressBookAddressDetailVH = this;
                        int top = controlsFAL2.getTop();
                        i11 = AddressBookAddressDetailVH.onBoardingMargin;
                        int i15 = i11 + top;
                        int left = controlsFAL2.getLeft();
                        i12 = AddressBookAddressDetailVH.onBoardingMargin;
                        int i16 = i12 + left;
                        i13 = AddressBookAddressDetailVH.onBoardingMargin;
                        int height = (itemView.getHeight() - controlsFAL2.getHeight()) - controlsFAL2.getTop();
                        i14 = AddressBookAddressDetailVH.onBoardingMargin;
                        int i17 = i14 + height;
                        f7 = AddressBookAddressDetailVH.onBoardingCornerRadius;
                        onBoardingDelegate2.bind(addressBookAddressDetailVH, new OnBoardingCutConfig(Integer.valueOf(i16), Integer.valueOf(i13), Integer.valueOf(i15), Integer.valueOf(i17), null, null, Float.valueOf(f7), false, 48, null), new AddressBookAddressDetailVH$bind$1$4$1(this));
                    }
                }
            });
        }
    }
}
