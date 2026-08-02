package ru.ozon.android.messenger.blocks.disclaimer.modal;

import Ae.M0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Ve.ViewOnClickListenerC4465n7;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.disclaimer.modal.e;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.C9509v;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.U;
import ru.ozon.app.android.R;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MDisclaimerModalBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/blocks/disclaimer/modal/c;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends com.google.android.material.bottomsheet.b {

    /* renamed from: a, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.controller.b f85061a;

    /* renamed from: b, reason: collision with root package name */
    public U f85062b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f85063c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f85064d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f85065e;

    /* renamed from: f, reason: collision with root package name */
    private MDisclaimerModalBinding f85066f;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.a> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.a invoke() {
            return new ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.a(new ru.ozon.android.messenger.blocks.disclaimer.modal.b(c.this));
        }
    }

    static final class b extends AbstractC7737t implements Function0<BottomSheetBehavior<FrameLayout>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BottomSheetBehavior<FrameLayout> invoke() {
            Dialog dialog = c.this.getDialog();
            Intrinsics.g(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
            return ((com.google.android.material.bottomsheet.a) dialog).getBehavior();
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.disclaimer.modal.c$c, reason: collision with other inner class name */
    public static final class C1494c extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f85069b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1494c(Function0 function0) {
            super(0);
            this.f85069b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f85069b.invoke();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f85070b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f85070b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f85070b.getValue()).getViewModelStore();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f85071b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f85071b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f85071b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    static final class f extends AbstractC7737t implements Function0<B0> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            ComponentCallbacksC5392m requireParentFragment = c.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
            return requireParentFragment;
        }
    }

    static final class g extends AbstractC7737t implements Function0<z0.b> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            U u11 = c.this.f85062b;
            if (u11 != null) {
                return u11;
            }
            Intrinsics.n("viewModelFactory");
            throw null;
        }
    }

    public c() {
        f fVar = new f();
        g gVar = new g();
        InterfaceC4008j a11 = k.a(n.NONE, new C1494c(fVar));
        this.f85063c = b0.b(this, N.b(C9509v.class), new d(a11), new e(a11), gVar);
        this.f85064d = ru.ozon.android.messenger.utils.f.b(new a());
        this.f85065e = ru.ozon.android.messenger.utils.f.b(new b());
    }

    public static final InterfaceC9506s t(c cVar) {
        return (InterfaceC9506s) cVar.f85063c.getValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        ru.ozon.android.messenger.utils.g.d(this).r(this);
        super.onCreate(bundle);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.g(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) onCreateDialog;
        aVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ru.ozon.android.messenger.blocks.disclaimer.modal.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View findViewById = com.google.android.material.bottomsheet.a.this.findViewById(R.id.design_bottom_sheet);
                if (findViewById == null) {
                    return;
                }
                findViewById.setBackgroundResource(R$drawable.m_bg_disclaimer_modal);
            }
        });
        return aVar;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        MDisclaimerModalBinding inflate = MDisclaimerModalBinding.inflate(inflater, viewGroup, false);
        this.f85066f = inflate;
        Intrinsics.f(inflate);
        NestedScrollView constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        ((InterfaceC9506s) this.f85063c.getValue()).U().invoke();
        this.f85066f = null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        CommonControlSettings common;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        MDisclaimerModalBinding mDisclaimerModalBinding = this.f85066f;
        Intrinsics.f(mDisclaimerModalBinding);
        ru.ozon.android.messenger.blocks.disclaimer.modal.e eVar = (ru.ozon.android.messenger.blocks.disclaimer.modal.e) ru.ozon.android.messenger.utils.g.c(this, "DISCLAIMER_MODAL_KEY", ru.ozon.android.messenger.blocks.disclaimer.modal.e.class);
        ?? r22 = this.f85064d;
        ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.a aVar = (ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.a) r22.getValue();
        TextAtomV2View disclaimerModalTitle = mDisclaimerModalBinding.disclaimerModalTitle;
        Intrinsics.checkNotNullExpressionValue(disclaimerModalTitle, "disclaimerModalTitle");
        e.b a11 = eVar.a();
        TextHolderKt.bindOrGone$default(disclaimerModalTitle, a11 != null ? a11.c() : null, null, 2, null);
        ButtonV3View disclaimerModalDoneButton = mDisclaimerModalBinding.disclaimerModalDoneButton;
        Intrinsics.checkNotNullExpressionValue(disclaimerModalDoneButton, "disclaimerModalDoneButton");
        e.b a12 = eVar.a();
        ButtonV3HolderKt.bindOrGone$default(disclaimerModalDoneButton, a12 != null ? a12.b() : null, null, 2, null);
        mDisclaimerModalBinding.disclaimerModalRecyclerView.setAdapter(aVar);
        e.b a13 = eVar.a();
        if (a13 != null) {
            ButtonV3DTO b11 = a13.b();
            ru.ozon.android.messenger.framework.navigation.action.a c11 = (b11 == null || (common = b11.getCommon()) == null || (action = common.getAction()) == null) ? null : ru.ozon.android.messenger.framework.navigation.action.b.c(action);
            if (c11 != null) {
                mDisclaimerModalBinding.disclaimerModalDoneButton.setOnClickListener(new ViewOnClickListenerC4465n7(5, this, c11));
            }
        }
        Object value = this.f85065e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((BottomSheetBehavior) value).setState(3);
        ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.a aVar2 = (ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.a) r22.getValue();
        e.b a14 = ((ru.ozon.android.messenger.blocks.disclaimer.modal.e) ru.ozon.android.messenger.utils.g.c(this, "DISCLAIMER_MODAL_KEY", ru.ozon.android.messenger.blocks.disclaimer.modal.e.class)).a();
        aVar2.submitList(a14 != null ? a14.a() : null);
        M0<ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a> M11 = ((InterfaceC9506s) this.f85063c.getValue()).M();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner, M11, new ru.ozon.android.messenger.blocks.disclaimer.modal.d(null, this));
    }
}
