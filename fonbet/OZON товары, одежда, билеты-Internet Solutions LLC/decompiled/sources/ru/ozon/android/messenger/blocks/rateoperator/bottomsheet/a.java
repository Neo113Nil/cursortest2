package ru.ozon.android.messenger.blocks.rateoperator.bottomsheet;

import Ae.M0;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.o;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.b0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.n;
import ru.ozon.android.messenger.blocks.rateoperator.d;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.b;
import ru.ozon.android.messenger.framework.presentation.common.notification.g;
import ru.ozon.android.messenger.utils.p;
import ru.ozon.android.messenger.utils.q;
import ru.ozon.android.messenger.utils.r;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.app.android.messenger.databinding.MFragmentBottomSheetRateOperatorBinding;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.atom.labelRating.LabelRatingView;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;
import xe.C10727i;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/android/messenger/blocks/rateoperator/bottomsheet/a;", "Lru/ozon/android/messenger/framework/presentation/common/screen/h;", "Lru/ozon/app/android/messenger/databinding/MFragmentBottomSheetRateOperatorBinding;", "Lru/ozon/android/messenger/blocks/rateoperator/b;", "", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends ru.ozon.android.messenger.framework.presentation.common.screen.h<MFragmentBottomSheetRateOperatorBinding, ru.ozon.android.messenger.blocks.rateoperator.b> {

    /* renamed from: g, reason: collision with root package name */
    public z0.b f86178g;

    /* renamed from: h, reason: collision with root package name */
    public g.a f86179h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ArrayList f86180i;

    /* renamed from: j, reason: collision with root package name */
    private b.a f86181j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.keyboard.e f86182k;

    /* renamed from: l, reason: collision with root package name */
    private ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.h f86183l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f86184m;

    /* renamed from: n, reason: collision with root package name */
    private AtomActionDTO f86185n;

    /* renamed from: o, reason: collision with root package name */
    private String f86186o;

    /* renamed from: p, reason: collision with root package name */
    private ru.ozon.android.messenger.blocks.rateoperator.b f86187p;

    /* renamed from: ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.a$a, reason: collision with other inner class name */
    /* synthetic */ class C1522a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MFragmentBottomSheetRateOperatorBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1522a f86188a = new C1522a(3, MFragmentBottomSheetRateOperatorBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MFragmentBottomSheetRateOperatorBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MFragmentBottomSheetRateOperatorBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MFragmentBottomSheetRateOperatorBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function1<MFragmentBottomSheetRateOperatorBinding, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.rateoperator.b f86189b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f86190c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ru.ozon.android.messenger.blocks.rateoperator.b bVar, a aVar) {
            super(1);
            this.f86189b = bVar;
            this.f86190c = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MFragmentBottomSheetRateOperatorBinding mFragmentBottomSheetRateOperatorBinding) {
            MFragmentBottomSheetRateOperatorBinding updateView = mFragmentBottomSheetRateOperatorBinding;
            Intrinsics.checkNotNullParameter(updateView, "$this$updateView");
            TextInputLayout textInputLayout = updateView.rateCommentMsgLayout;
            final a aVar = this.f86190c;
            textInputLayout.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.b
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    h hVar;
                    hVar = a.this.f86183l;
                    if (hVar != null) {
                        hVar.i0(z11);
                    }
                }
            });
            textInputLayout.O(0);
            textInputLayout.P(0);
            ru.ozon.android.messenger.blocks.rateoperator.b bVar = this.f86189b;
            textInputLayout.d0(bVar.b());
            updateView.rateOperatorTitleTv.setText(bVar.getTitle());
            RatingView mainView = updateView.rateOperatorRatingVrb.getMainView();
            mainView.setRatingSize(RatingDTO.RatingSize.SIZE_600);
            mainView.setClickable(true);
            updateView.rateOperatorRatingVrb.setTotalRating(bVar.f());
            updateView.rateOperatorRatingVrb.setContentDescription("rateOperatorRatingVrb_" + bVar.f());
            LargeButtonView rateSendButton = updateView.rateSendButton;
            Intrinsics.checkNotNullExpressionValue(rateSendButton, "rateSendButton");
            LargeButtonHolderKt.bind(rateSendButton, bVar.d(), new ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.c(1, aVar, a.class, "onSendButtonClick", "onSendButtonClick(Lru/ozon/uni/atoms/af/AtomAction;)V", 0));
            a.F(aVar, (ru.ozon.android.messenger.blocks.rateoperator.d) ((ArrayList) bVar.c()).get(bVar.f() - 1));
            LabelRatingView rateOperatorRatingVrb = updateView.rateOperatorRatingVrb;
            Intrinsics.checkNotNullExpressionValue(rateOperatorRatingVrb, "rateOperatorRatingVrb");
            ru.ozon.android.messenger.utils.view.j.a(rateOperatorRatingVrb, new ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.d(aVar, bVar, updateView));
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<MFragmentBottomSheetRateOperatorBinding, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MFragmentBottomSheetRateOperatorBinding mFragmentBottomSheetRateOperatorBinding) {
            MFragmentBottomSheetRateOperatorBinding updateView = mFragmentBottomSheetRateOperatorBinding;
            Intrinsics.checkNotNullParameter(updateView, "$this$updateView");
            DisclaimerView constraintLayout = updateView.rateErrorCl.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            s.a(constraintLayout);
            NestedScrollView rateOperatorSv = updateView.rateOperatorSv;
            Intrinsics.checkNotNullExpressionValue(rateOperatorSv, "rateOperatorSv");
            a.this.getClass();
            s.g(rateOperatorSv, 0, 0, 0, 0, 7);
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<MFragmentBottomSheetRateOperatorBinding, Unit> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MFragmentBottomSheetRateOperatorBinding mFragmentBottomSheetRateOperatorBinding) {
            MFragmentBottomSheetRateOperatorBinding updateView = mFragmentBottomSheetRateOperatorBinding;
            Intrinsics.checkNotNullParameter(updateView, "$this$updateView");
            updateView.rateReasonsRv.setLayoutManager(new FlexboxLayoutManager(a.this.requireContext()));
            updateView.rateReasonsRv.addItemDecoration(new k());
            return Unit.f71690a;
        }
    }

    public static final class e extends BottomSheetBehavior.f {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void onSlide(View bottomSheet, float f7) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void onStateChanged(View bottomSheet, int i11) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i11 == 1) {
                a aVar = a.this;
                a.z(aVar).rateCommentMsgLayout.clearFocus();
                ru.ozon.android.messenger.framework.presentation.common.keyboard.b bVar = aVar.f86181j;
                if (bVar != null) {
                    ((b.a) bVar).c(false);
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.RateOperatorBottomSheetFragment$renderState$1", f = "RateOperatorBottomSheetFragment.kt", l = {251}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f86194d;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f86194d;
            a aVar2 = a.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                ru.ozon.android.messenger.framework.presentation.common.keyboard.b bVar = aVar2.f86181j;
                if (bVar != null) {
                    ((b.a) bVar).c(false);
                }
                this.f86194d = 1;
                if (Y.b(50L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            aVar2.v();
            return Unit.f71690a;
        }
    }

    static final class g extends AbstractC7737t implements Function1<MFragmentBottomSheetRateOperatorBinding, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f86196b = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MFragmentBottomSheetRateOperatorBinding mFragmentBottomSheetRateOperatorBinding) {
            MFragmentBottomSheetRateOperatorBinding updateView = mFragmentBottomSheetRateOperatorBinding;
            Intrinsics.checkNotNullParameter(updateView, "$this$updateView");
            updateView.rateSendButton.setEnabled(false);
            updateView.rateCommentMsgLayout.clearFocus();
            return Unit.f71690a;
        }
    }

    static final class h extends AbstractC7737t implements Function1<MFragmentBottomSheetRateOperatorBinding, Unit> {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MFragmentBottomSheetRateOperatorBinding mFragmentBottomSheetRateOperatorBinding) {
            int i11;
            MFragmentBottomSheetRateOperatorBinding updateView = mFragmentBottomSheetRateOperatorBinding;
            Intrinsics.checkNotNullParameter(updateView, "$this$updateView");
            NestedScrollView rateOperatorSv = updateView.rateOperatorSv;
            Intrinsics.checkNotNullExpressionValue(rateOperatorSv, "rateOperatorSv");
            a aVar = a.this;
            aVar.getClass();
            i11 = ru.ozon.android.messenger.utils.e.f91921r;
            s.g(rateOperatorSv, 0, 0, 0, i11, 7);
            DisclaimerView constraintLayout = updateView.rateErrorCl.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            s.d(constraintLayout);
            DisclaimerView disclaimer = updateView.rateErrorCl.disclaimer;
            Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
            String string = aVar.getString(R$string.messenger_error_rate_operator);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            DSDisclaimerHolderKt.bind$default(disclaimer, new DisclaimerDTO(OzonSpannableStringKt.toOzonSpannableString(string), null, DisclaimerDTO.Theme.NEGATIVE, null, "m_ic_disclaimer", null, null, null, null, null, false, null, null, 8170, null), null, 2, null);
            return Unit.f71690a;
        }
    }

    public a() {
        super(C1522a.f86188a);
        this.f86180i = new ArrayList();
        this.f86182k = ru.ozon.android.messenger.framework.presentation.common.keyboard.e.f90775a;
    }

    public static final /* synthetic */ Unit D(a aVar, n nVar) {
        aVar.J(nVar);
        return Unit.f71690a;
    }

    public static final void E(a aVar, AtomAction atomAction) {
        aVar.getClass();
        String a11 = ru.ozon.android.messenger.framework.navigation.action.d.ON_SEND_RATE_OPERATOR.a();
        AtomActionDTO atomActionDTO = aVar.f86185n;
        Unit unit = null;
        if (Intrinsics.d(a11, atomActionDTO != null ? atomActionDTO.getId() : null)) {
            AtomActionDTO atomActionDTO2 = aVar.f86185n;
            if (Intrinsics.d(atomActionDTO2 != null ? atomActionDTO2.getId() : null, atomAction.getId())) {
                String valueOf = String.valueOf(aVar.getBinding().rateCommentMsgEt.getText());
                Integer num = aVar.f86184m;
                if (num != null) {
                    int intValue = num.intValue();
                    ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.h hVar = aVar.f86183l;
                    if (hVar != null) {
                        hVar.k0(aVar.f86185n, valueOf, intValue, aVar.f86180i, aVar.f86186o);
                        unit = Unit.f71690a;
                    }
                    if (unit != null) {
                        return;
                    }
                }
                aVar.K();
                return;
            }
        }
        ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.h hVar2 = aVar.f86183l;
        if (hVar2 != null) {
            hVar2.handleAction(atomAction);
        }
    }

    public static final void F(a aVar, ru.ozon.android.messenger.blocks.rateoperator.d dVar) {
        aVar.getClass();
        aVar.f86184m = Integer.valueOf(dVar.a());
        aVar.getBinding().rateDescriptionTv.setText(dVar.getName());
        List<d.b> b11 = dVar.b();
        m mVar = new m(aVar.f86180i);
        if (b11 != null) {
            mVar.g(b11);
        }
        aVar.getBinding().rateReasonsRv.setAdapter(mVar);
    }

    private final void H() {
        x(new c());
    }

    private final void I() {
        x(new d());
    }

    private final void J(n nVar) {
        if (Intrinsics.d(nVar, n.d.f86232a)) {
            C10727i.c(K.a(this), null, null, new f(null), 3);
            return;
        }
        if (Intrinsics.d(nVar, n.b.f86230a)) {
            x(g.f86196b);
            return;
        }
        if (Intrinsics.d(nVar, n.c.f86231a)) {
            getBinding().rateSendButton.setEnabled(true);
            b.a aVar = this.f86181j;
            if (aVar != null) {
                aVar.c(false);
            }
            K();
            return;
        }
        if (!Intrinsics.d(nVar, n.a.f86229a)) {
            if (nVar != null) {
                throw new o();
            }
            return;
        }
        H();
        b.a aVar2 = this.f86181j;
        if (aVar2 != null) {
            aVar2.c(false);
        }
    }

    private final void K() {
        x(new h());
    }

    public static final /* synthetic */ MFragmentBottomSheetRateOperatorBinding z(a aVar) {
        return aVar.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.android.messenger.framework.presentation.common.screen.h
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void u(ru.ozon.android.messenger.blocks.rateoperator.b bVar) {
        x0 f91308a;
        this.f86187p = bVar;
        if (bVar != null) {
            this.f86187p = bVar;
            this.f86186o = bVar.getBlockId().toString();
            this.f86185n = bVar.d().getAction();
            I();
            z0.b bVar2 = this.f86178g;
            if (bVar2 == null) {
                Intrinsics.n("viewModelFactory");
                throw null;
            }
            ru.ozon.android.messenger.utils.s sVar = new ru.ozon.android.messenger.utils.s(bVar2);
            InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new p(new ru.ozon.android.messenger.utils.o(this)));
            ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.h hVar = (ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.h) ((w0) b0.b(this, N.b(ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.h.class), new q(a11), new r(a11), sVar).getValue());
            this.f86183l = hVar;
            if (hVar != null && (f91308a = hVar.getF91308a()) != null) {
                J viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner, f91308a, new ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.e(2, this, a.class, "renderState", "renderState(Lru/ozon/android/messenger/blocks/rateoperator/bottomsheet/RateOperatorState;)V", 4));
            }
            x(new b(bVar, this));
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.screen.h, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        ru.ozon.android.messenger.utils.g.d(this).l(this);
        super.onCreate(bundle);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.screen.h, com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public final Dialog onCreateDialog(Bundle bundle) {
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) super.onCreateDialog(bundle);
        aVar.getBehavior().addBottomSheetCallback(new e());
        return aVar;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.screen.h, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f86187p = null;
        this.f86181j = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        super.onPause();
        b.a aVar = this.f86181j;
        this.f86182k.a(aVar != null ? aVar.d() : null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        M0<NetworkInfo> j02;
        super.onResume();
        ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.h hVar = this.f86183l;
        if (hVar != null && (j02 = hVar.j0()) != null) {
            J viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner, j02, new ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.f(this, null));
        }
        b.a aVar = this.f86181j;
        if (aVar != null) {
            aVar.a(this.f86182k.c(), ru.ozon.android.messenger.framework.presentation.common.keyboard.c.f90773b, ru.ozon.android.messenger.framework.presentation.common.keyboard.d.f90774b);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        b.a aVar = this.f86181j;
        b.c d11 = aVar != null ? aVar.d() : null;
        this.f86182k.getClass();
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putParcelable("KEYBOARD_STATE_BUNDLE_KEY", d11);
        outState.putParcelable("RATE_OPERATOR_VO_SAVE_STATE_KEY", this.f86187p);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.h hVar = this.f86183l;
        if (hVar != null) {
            hVar.l0(this.f86186o);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        TextInputLayout rateCommentMsgLayout = getBinding().rateCommentMsgLayout;
        Intrinsics.checkNotNullExpressionValue(rateCommentMsgLayout, "rateCommentMsgLayout");
        this.f86181j = new b.a(rateCommentMsgLayout, K.a(this));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.f86182k.b(bundle);
        if (bundle == null || !bundle.containsKey("RATE_OPERATOR_VO_SAVE_STATE_KEY")) {
            return;
        }
        ru.ozon.android.messenger.blocks.rateoperator.b bVar = (ru.ozon.android.messenger.blocks.rateoperator.b) ru.ozon.android.messenger.utils.f.a(bundle, "RATE_OPERATOR_VO_SAVE_STATE_KEY", ru.ozon.android.messenger.blocks.rateoperator.b.class);
        this.f86187p = bVar;
        u(bVar);
    }
}
