package ru.ozon.android.messenger.blocks.ratemessenger.sucessstate;

import Cz.ViewOnClickListenerC2788a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.c;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.C9509v;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.U;
import ru.ozon.android.messenger.utils.g;
import ru.ozon.app.android.messenger.databinding.MRateMessengerSuccessBlockBinding;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/blocks/ratemessenger/sucessstate/a;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends com.google.android.material.bottomsheet.b {

    /* renamed from: a, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.controller.b f86150a;

    /* renamed from: b, reason: collision with root package name */
    public U f86151b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f86152c;

    /* renamed from: d, reason: collision with root package name */
    private MRateMessengerSuccessBlockBinding f86153d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f86154e;

    /* renamed from: ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.a$a, reason: collision with other inner class name */
    public static final class C1519a extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f86155b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1519a(Function0 function0) {
            super(0);
            this.f86155b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f86155b.invoke();
        }
    }

    public static final class b extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f86156b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f86156b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f86156b.getValue()).getViewModelStore();
        }
    }

    public static final class c extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f86157b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f86157b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f86157b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    static final class d extends AbstractC7737t implements Function0<B0> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            ComponentCallbacksC5392m requireParentFragment = a.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
            return requireParentFragment;
        }
    }

    static final class e extends AbstractC7737t implements Function0<z0.b> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            U u11 = a.this.f86151b;
            if (u11 != null) {
                return u11;
            }
            Intrinsics.n("viewModelFactory");
            throw null;
        }
    }

    public a() {
        d dVar = new d();
        e eVar = new e();
        InterfaceC4008j a11 = k.a(n.NONE, new C1519a(dVar));
        this.f86152c = b0.b(this, N.b(C9509v.class), new b(a11), new c(a11), eVar);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        g.d(this).G(this);
        super.onCreate(bundle);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new SheetDialog(requireContext, 0, true, 0, true, true, null, null, false, false, null, false, 0, false, null, 32714, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        MRateMessengerSuccessBlockBinding inflate = MRateMessengerSuccessBlockBinding.inflate(inflater, viewGroup, false);
        this.f86153d = inflate;
        Intrinsics.f(inflate);
        LinearLayout constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        ((InterfaceC9506s) this.f86152c.getValue()).E().invoke();
        this.f86153d = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        if (this.f86154e) {
            return;
        }
        ru.ozon.android.messenger.framework.navigation.controller.b bVar = this.f86150a;
        if (bVar != null) {
            bVar.s(((c.b) g.c(this, "RATE_MESSENGER_SUCCESS_MODAL_KEY", c.b.class)).d());
        } else {
            Intrinsics.n("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean("AFTER_RECREATE_BUNDLE_KEY", true);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        MRateMessengerSuccessBlockBinding mRateMessengerSuccessBlockBinding = this.f86153d;
        Intrinsics.f(mRateMessengerSuccessBlockBinding);
        AppCompatImageView successImageView = mRateMessengerSuccessBlockBinding.successImageView;
        Intrinsics.checkNotNullExpressionValue(successImageView, "successImageView");
        ru.ozon.android.messenger.utils.image.c.a(successImageView, ((c.b) g.c(this, "RATE_MESSENGER_SUCCESS_MODAL_KEY", c.b.class)).c(), g.f(this));
        mRateMessengerSuccessBlockBinding.titleTextAtom.setText(((c.b) g.c(this, "RATE_MESSENGER_SUCCESS_MODAL_KEY", c.b.class)).getTitle());
        mRateMessengerSuccessBlockBinding.descriptionTextAtom.setText(((c.b) g.c(this, "RATE_MESSENGER_SUCCESS_MODAL_KEY", c.b.class)).b());
        LargeButtonView largeButtonView = mRateMessengerSuccessBlockBinding.closeButton;
        Intrinsics.f(largeButtonView);
        LargeButtonHolderKt.bind$default(largeButtonView, ButtonV3Atom.LargeButton.copy$default(((c.b) g.c(this, "RATE_MESSENGER_SUCCESS_MODAL_KEY", c.b.class)).a(), null, null, null, null, null, new AtomActionDTO(AtomActionDTO.Behavior.DISMISS, null, null, null, 14, null), null, null, null, 479, null), null, 2, null);
        largeButtonView.setOnClickListener(new ViewOnClickListenerC2788a(this, 11));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.f86154e = bundle != null ? bundle.getBoolean("AFTER_RECREATE_BUNDLE_KEY") : false;
        if (bundle != null) {
            bundle.clear();
        }
    }
}
