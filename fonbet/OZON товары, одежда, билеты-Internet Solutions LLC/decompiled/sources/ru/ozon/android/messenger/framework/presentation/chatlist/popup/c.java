package ru.ozon.android.messenger.framework.presentation.chatlist.popup;

import Ae.InterfaceC2395h;
import Ae.M0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f3.AbstractC6409a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ratemessenger.i;
import ru.ozon.android.messenger.framework.presentation.chatlist.popup.f;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.C9509v;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.U;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.b;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.C9513d;
import ru.ozon.app.android.messenger.databinding.MBlockAlertBinding;
import ru.ozon.app.android.messenger.databinding.MMessengerPopUpBinding;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/chatlist/popup/c;", "Lcom/google/android/material/bottomsheet/b;", "Lru/ozon/android/messenger/framework/presentation/chatlist/popup/d;", "<init>", "()V", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends com.google.android.material.bottomsheet.b implements ru.ozon.android.messenger.framework.presentation.chatlist.popup.d {

    /* renamed from: a, reason: collision with root package name */
    public Jb.f f90517a;

    /* renamed from: b, reason: collision with root package name */
    public U f90518b;

    /* renamed from: c, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.core.initialization.d f90519c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final y0 f90520d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f90521e;

    /* renamed from: f, reason: collision with root package name */
    private b.a f90522f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.keyboard.e f90523g;

    /* renamed from: h, reason: collision with root package name */
    private BottomSheetBehavior<ConstraintLayout> f90524h;

    /* renamed from: i, reason: collision with root package name */
    private MMessengerPopUpBinding f90525i;

    /* renamed from: j, reason: collision with root package name */
    private Function0<Unit> f90526j;

    private static final class a extends ru.ozon.android.messenger.framework.presentation.common.screen.g {
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0 function0 = c.this.f90526j;
            if (function0 == null) {
                return null;
            }
            function0.invoke();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.popup.MessengerPopUp$onViewCreated$lambda$10$$inlined$observe$1", f = "MessengerPopUp.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.popup.c$c, reason: collision with other inner class name */
    public static final class C1679c extends j implements Function2<ru.ozon.android.messenger.framework.presentation.chatlist.f, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f90528d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f90529e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C9513d f90530f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1679c(kotlin.coroutines.d dVar, c cVar, C9513d c9513d) {
            super(2, dVar);
            this.f90529e = cVar;
            this.f90530f = c9513d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C1679c c1679c = new C1679c(dVar, this.f90529e, this.f90530f);
            c1679c.f90528d = obj;
            return c1679c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1679c) create(fVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            ru.ozon.android.messenger.framework.presentation.chatlist.f fVar = (ru.ozon.android.messenger.framework.presentation.chatlist.f) this.f90528d;
            this.f90529e.f90521e.clear();
            this.f90530f.submitList(ru.ozon.android.messenger.framework.presentation.models.f.a(fVar.h()));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.popup.MessengerPopUp$onViewCreated$lambda$10$$inlined$observe$2", f = "MessengerPopUp.kt", l = {}, m = "invokeSuspend")
    public static final class d extends j implements Function2<ru.ozon.android.messenger.framework.presentation.chatlist.popup.f, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f90531d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f90532e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.coroutines.d dVar, c cVar) {
            super(2, dVar);
            this.f90532e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(dVar, this.f90532e);
            dVar2.f90531d = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ru.ozon.android.messenger.framework.presentation.chatlist.popup.f fVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(fVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            ru.ozon.android.messenger.framework.presentation.chatlist.popup.f fVar = (ru.ozon.android.messenger.framework.presentation.chatlist.popup.f) this.f90531d;
            boolean z11 = fVar instanceof f.c;
            c cVar = this.f90532e;
            if (z11) {
                cVar.dismiss();
            } else if (fVar instanceof f.a) {
                cVar.f90521e.add(((f.a) fVar).a());
            } else if (fVar instanceof f.b) {
                cVar.f90521e.clear();
            } else if (fVar instanceof f.d) {
                DisclaimerView constraintLayout = c.v(cVar).messengerPopUpAlert.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                ru.ozon.android.messenger.utils.view.s.a(constraintLayout);
            } else if (fVar instanceof f.e) {
                MBlockAlertBinding mBlockAlertBinding = c.v(cVar).messengerPopUpAlert;
                ru.ozon.android.messenger.framework.presentation.common.keyboard.b bVar = cVar.f90522f;
                if (bVar != null) {
                    ((b.a) bVar).c(false);
                }
                DisclaimerView disclaimer = mBlockAlertBinding.disclaimer;
                Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
                DSDisclaimerHolderKt.bind$default(disclaimer, new DisclaimerDTO(OzonSpannableStringKt.toOzonSpannableString(((f.e) fVar).a()), null, null, null, "m_ic_disclaimer", null, null, null, null, null, false, null, null, 8174, null), null, 2, null);
                DisclaimerView constraintLayout2 = mBlockAlertBinding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int i12 = ru.ozon.android.messenger.blocks.chat.a.f84478c;
                i11 = ru.ozon.android.messenger.utils.e.f91920q;
                layoutParams.height = i11;
                constraintLayout2.setLayoutParams(layoutParams);
                DisclaimerView constraintLayout3 = mBlockAlertBinding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "getRoot(...)");
                ru.ozon.android.messenger.utils.view.s.d(constraintLayout3);
            }
            return Unit.f71690a;
        }
    }

    public static final class e extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f90533b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0) {
            super(0);
            this.f90533b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f90533b.invoke();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f90534b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f90534b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f90534b.getValue()).getViewModelStore();
        }
    }

    public static final class g extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f90535b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f90535b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f90535b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    static final class h extends AbstractC7737t implements Function0<B0> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            ComponentCallbacksC5392m parentFragment = c.this.getParentFragment();
            Intrinsics.g(parentFragment, "null cannot be cast to non-null type ru.ozon.android.messenger.framework.presentation.common.screen.BaseFragment<*>");
            return (ru.ozon.android.messenger.framework.presentation.common.screen.i) parentFragment;
        }
    }

    static final class i extends AbstractC7737t implements Function0<z0.b> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            U u11 = c.this.f90518b;
            if (u11 != null) {
                return u11;
            }
            Intrinsics.n("chatListVmFactory");
            throw null;
        }
    }

    public c() {
        h hVar = new h();
        i iVar = new i();
        InterfaceC4008j a11 = k.a(n.NONE, new e(hVar));
        this.f90520d = b0.b(this, N.b(C9509v.class), new f(a11), new g(a11), iVar);
        this.f90521e = new LinkedHashSet();
        this.f90523g = ru.ozon.android.messenger.framework.presentation.common.keyboard.e.f90775a;
    }

    public static void t(c cVar, ru.ozon.android.messenger.framework.core.d dVar) {
        ru.ozon.android.messenger.framework.navigation.controller.a c11;
        b.a aVar = cVar.f90522f;
        if (aVar != null) {
            aVar.c(false);
        }
        ru.ozon.android.messenger.framework.presentation.common.keyboard.e eVar = cVar.f90523g;
        eVar.getClass();
        eVar.a(b.c.a.f90771a);
        LinkedHashSet<ru.ozon.android.messenger.framework.navigation.action.a> linkedHashSet = cVar.f90521e;
        for (ru.ozon.android.messenger.framework.navigation.action.a aVar2 : linkedHashSet) {
            ru.ozon.android.messenger.framework.core.d c12 = ru.ozon.android.messenger.framework.core.e.c();
            if (c12 != null && (c11 = c12.c()) != null) {
                c11.q(aVar2);
            }
        }
        linkedHashSet.clear();
        dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(ru.ozon.android.messenger.utils.a.a(ru.ozon.android.messenger.framework.navigation.action.g.REMOVE_POP_UP_BLOCKS)));
        cVar.dismiss();
    }

    public static void u(Function0 function0, c cVar, ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        ru.ozon.android.messenger.framework.navigation.controller.a c11;
        ru.ozon.android.messenger.framework.core.d c12 = ru.ozon.android.messenger.framework.core.e.c();
        if (c12 != null && (c11 = c12.c()) != null) {
            cVar.f90521e.clear();
            c11.q(aVar);
        }
        function0.invoke();
    }

    public static final MMessengerPopUpBinding v(c cVar) {
        MMessengerPopUpBinding mMessengerPopUpBinding = cVar.f90525i;
        Intrinsics.f(mMessengerPopUpBinding);
        return mMessengerPopUpBinding;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.popup.d
    public final boolean c() {
        MMessengerPopUpBinding mMessengerPopUpBinding = this.f90525i;
        Intrinsics.f(mMessengerPopUpBinding);
        LargeButtonView messengerPopUpSendButton = mMessengerPopUpBinding.messengerPopUpSendButton;
        Intrinsics.checkNotNullExpressionValue(messengerPopUpSendButton, "messengerPopUpSendButton");
        return messengerPopUpSendButton.getVisibility() == 0;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.popup.d
    public final void j() {
        MMessengerPopUpBinding mMessengerPopUpBinding = this.f90525i;
        Intrinsics.f(mMessengerPopUpBinding);
        LargeButtonView messengerPopUpSendButton = mMessengerPopUpBinding.messengerPopUpSendButton;
        Intrinsics.checkNotNullExpressionValue(messengerPopUpSendButton, "messengerPopUpSendButton");
        Intrinsics.checkNotNullParameter(messengerPopUpSendButton, "<this>");
        messengerPopUpSendButton.setEnabled(true);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.popup.d
    public final void k(@NotNull ButtonV3Atom.LargeButton largeButton, final ru.ozon.android.messenger.framework.navigation.action.a aVar, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(largeButton, "largeButton");
        MMessengerPopUpBinding mMessengerPopUpBinding = this.f90525i;
        Intrinsics.f(mMessengerPopUpBinding);
        LargeButtonView messengerPopUpSendButton = mMessengerPopUpBinding.messengerPopUpSendButton;
        Intrinsics.checkNotNullExpressionValue(messengerPopUpSendButton, "messengerPopUpSendButton");
        LargeButtonHolderKt.bind$default(messengerPopUpSendButton, largeButton, null, 2, null);
        MMessengerPopUpBinding mMessengerPopUpBinding2 = this.f90525i;
        Intrinsics.f(mMessengerPopUpBinding2);
        mMessengerPopUpBinding2.messengerPopUpSendButton.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.android.messenger.framework.presentation.chatlist.popup.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.u(Function0.this, this, aVar);
            }
        });
        MMessengerPopUpBinding mMessengerPopUpBinding3 = this.f90525i;
        Intrinsics.f(mMessengerPopUpBinding3);
        LargeButtonView messengerPopUpSendButton2 = mMessengerPopUpBinding3.messengerPopUpSendButton;
        Intrinsics.checkNotNullExpressionValue(messengerPopUpSendButton2, "messengerPopUpSendButton");
        ru.ozon.android.messenger.utils.view.s.d(messengerPopUpSendButton2);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.popup.d
    public final void l(Function0<Unit> function0) {
        this.f90526j = function0;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.popup.d
    public final void m() {
        MMessengerPopUpBinding mMessengerPopUpBinding = this.f90525i;
        Intrinsics.f(mMessengerPopUpBinding);
        LargeButtonView messengerPopUpSendButton = mMessengerPopUpBinding.messengerPopUpSendButton;
        Intrinsics.checkNotNullExpressionValue(messengerPopUpSendButton, "messengerPopUpSendButton");
        Intrinsics.checkNotNullParameter(messengerPopUpSendButton, "<this>");
        messengerPopUpSendButton.setEnabled(false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        ru.ozon.android.messenger.utils.g.d(this).d(this);
        super.onCreate(bundle);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        SheetDialog sheetDialog = new SheetDialog(requireContext, 0, true, 0, true, true, null, null, false, false, null, false, 0, false, null, 32714, null);
        sheetDialog.setOnDismiss(new b());
        this.f90524h = sheetDialog.getBehavior();
        return sheetDialog;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        MMessengerPopUpBinding inflate = MMessengerPopUpBinding.inflate(inflater, viewGroup, false);
        this.f90525i = inflate;
        Intrinsics.f(inflate);
        ConstraintLayout constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f90524h = null;
        this.f90522f = null;
        this.f90525i = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        super.onPause();
        b.a aVar = this.f90522f;
        this.f90523g.a(aVar != null ? aVar.d() : null);
        b.a aVar2 = this.f90522f;
        if (aVar2 != null) {
            aVar2.c(false);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        ru.ozon.android.messenger.framework.navigation.controller.a c11;
        super.onResume();
        ru.ozon.android.messenger.framework.core.d c12 = ru.ozon.android.messenger.framework.core.e.c();
        if (c12 == null || (c11 = c12.c()) == null) {
            return;
        }
        c11.v(new i.a(this.f90523g.c()));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Object obj;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        MMessengerPopUpBinding mMessengerPopUpBinding = this.f90525i;
        Intrinsics.f(mMessengerPopUpBinding);
        ConstraintLayout constraintLayout = mMessengerPopUpBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        b.a aVar = new b.a(constraintLayout, K.a(this));
        this.f90522f = aVar;
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this.f90524h;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new a(new ru.ozon.android.messenger.framework.presentation.chatlist.popup.b(aVar)));
        }
        ru.ozon.android.messenger.framework.core.d c11 = ru.ozon.android.messenger.framework.core.e.c();
        if (c11 != null) {
            Jb.f fVar = this.f90517a;
            if (fVar == null) {
                Intrinsics.n("nonFatalLoggerProvider");
                throw null;
            }
            C9513d c9513d = new C9513d(c11, (ru.ozon.android.messenger.framework.logger.b) fVar.get(), null);
            MMessengerPopUpBinding mMessengerPopUpBinding2 = this.f90525i;
            Intrinsics.f(mMessengerPopUpBinding2);
            ViewParent parent = mMessengerPopUpBinding2.getConstraintLayout().getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            Iterator<View> it = C5316f0.b((ConstraintLayout) parent).iterator();
            while (true) {
                C5314e0 c5314e0 = (C5314e0) it;
                if (!c5314e0.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = c5314e0.next();
                    if (((View) obj) instanceof IconButtonV3View) {
                        break;
                    }
                }
            }
            View view2 = (View) obj;
            MMessengerPopUpBinding mMessengerPopUpBinding3 = this.f90525i;
            Intrinsics.f(mMessengerPopUpBinding3);
            mMessengerPopUpBinding3.messengerPopUpRecyclerView.setAdapter(c9513d);
            if (view2 != null) {
                view2.setOnClickListener(new GD.a(6, this, c11));
            }
            y0 y0Var = this.f90520d;
            M0<ru.ozon.android.messenger.framework.presentation.chatlist.f> uiState = ((InterfaceC9506s) y0Var.getValue()).getUiState();
            J viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner, uiState, new C1679c(null, this, c9513d));
            InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatlist.popup.f> j11 = ((InterfaceC9506s) y0Var.getValue()).j();
            J viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner2, j11, new d(null, this));
        }
    }
}
