package ru.ozon.android.messenger.blocks.messagetext;

import Sc.InterfaceC4008j;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C9467e;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.U;
import ru.ozon.android.messenger.framework.presentation.models.responses.d;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MExternalTransitionModalBlockBinding;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/blocks/messagetext/b;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends com.google.android.material.bottomsheet.b {

    /* renamed from: a, reason: collision with root package name */
    public U f85810a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f85811b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f85812c;

    /* renamed from: d, reason: collision with root package name */
    private MExternalTransitionModalBlockBinding f85813d;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.presentation.models.responses.d> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.framework.presentation.models.responses.d invoke() {
            return (ru.ozon.android.messenger.framework.presentation.models.responses.d) ru.ozon.android.messenger.utils.g.c(b.this, "EXTERNAL_TRANSITION_MODAL_ARG_KEY", ru.ozon.android.messenger.framework.presentation.models.responses.d.class);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.messagetext.b$b, reason: collision with other inner class name */
    public static final class C1513b extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f85815b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1513b(Function0 function0) {
            super(0);
            this.f85815b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f85815b.invoke();
        }
    }

    public static final class c extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f85816b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f85816b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f85816b.getValue()).getViewModelStore();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f85817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f85817b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f85817b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    static final class e extends AbstractC7737t implements Function0<B0> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            ComponentCallbacksC5392m requireParentFragment = b.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
            return requireParentFragment;
        }
    }

    static final class f extends AbstractC7737t implements Function0<z0.b> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            U u11 = b.this.f85810a;
            if (u11 != null) {
                return u11;
            }
            Intrinsics.n("viewModelFactory");
            throw null;
        }
    }

    public b() {
        e eVar = new e();
        f fVar = new f();
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new C1513b(eVar));
        this.f85811b = b0.b(this, N.b(C9467e.class), new c(a11), new d(a11), fVar);
        this.f85812c = Sc.k.b(new a());
    }

    public static final MExternalTransitionModalBlockBinding t(b bVar) {
        MExternalTransitionModalBlockBinding mExternalTransitionModalBlockBinding = bVar.f85813d;
        Intrinsics.f(mExternalTransitionModalBlockBinding);
        return mExternalTransitionModalBlockBinding;
    }

    public static final InterfaceC9460a u(b bVar) {
        return (InterfaceC9460a) bVar.f85811b.getValue();
    }

    private final ru.ozon.android.messenger.framework.presentation.models.responses.d v() {
        return (ru.ozon.android.messenger.framework.presentation.models.responses.d) this.f85812c.getValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        ru.ozon.android.messenger.utils.g.d(this).g(this);
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
        MExternalTransitionModalBlockBinding inflate = MExternalTransitionModalBlockBinding.inflate(inflater, viewGroup, false);
        this.f85813d = inflate;
        Intrinsics.f(inflate);
        LinearLayoutCompat root = inflate.root;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        return root;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f85813d = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        TextDTO copy$default;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        MExternalTransitionModalBlockBinding mExternalTransitionModalBlockBinding = this.f85813d;
        Intrinsics.f(mExternalTransitionModalBlockBinding);
        Image warningIv = mExternalTransitionModalBlockBinding.warningIv;
        Intrinsics.checkNotNullExpressionValue(warningIv, "warningIv");
        ImageHolderKt.bindOrGone$default(warningIv, v().c(), null, 2, null);
        TextAtomV2View titleTv = mExternalTransitionModalBlockBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextHolderKt.bindOrGone$default(titleTv, v().f(), null, 2, null);
        TextAtomV2View subtitleTv = mExternalTransitionModalBlockBinding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        TextHolderKt.bindOrGone$default(subtitleTv, v().e(), null, 2, null);
        MExternalTransitionModalBlockBinding mExternalTransitionModalBlockBinding2 = this.f85813d;
        Intrinsics.f(mExternalTransitionModalBlockBinding2);
        TextAtomV2View textAtomV2View = mExternalTransitionModalBlockBinding2.linkTv;
        Intrinsics.f(textAtomV2View);
        d.b d11 = v().d();
        Context context = textAtomV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (d11 == null) {
            copy$default = null;
        } else {
            OzonSpannableString ozonSpannableString = new OzonSpannableString(d11.a().getText());
            ru.ozon.android.messenger.utils.spans.a aVar = new ru.ozon.android.messenger.utils.spans.a(null, d11.b(), context, null);
            aVar.b(new ru.ozon.android.messenger.blocks.messagetext.d(this));
            ozonSpannableString.setSpan(aVar, 0, ozonSpannableString.length(), 33);
            copy$default = TextDTO.copy$default(d11.a(), ozonSpannableString, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516094, null);
        }
        TextHolderKt.bindOrGone$default(textAtomV2View, copy$default, null, 2, null);
        textAtomV2View.setMovementMethod(new ru.ozon.android.messenger.blocks.messagetext.c(this));
        DisclaimerView disclaimer = mExternalTransitionModalBlockBinding.disclaimer;
        Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
        DSDisclaimerHolderKt.bindOrGone$default(disclaimer, v().b(), null, 2, null);
        ButtonV3View stayBtn = mExternalTransitionModalBlockBinding.stayBtn;
        Intrinsics.checkNotNullExpressionValue(stayBtn, "stayBtn");
        ButtonV3HolderKt.bindOrGone$default(stayBtn, v().a(), null, 2, null);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (ru.ozon.android.messenger.utils.h.b(context2)) {
            mExternalTransitionModalBlockBinding.stayBtn.setBackground(C7232a.a(view.getContext(), R$drawable.m_bg_button_rounded));
            mExternalTransitionModalBlockBinding.stayBtn.setTitleColor(view.getContext().getColor(R$color.text_primary_inverted));
        }
        mExternalTransitionModalBlockBinding.stayBtn.setOnClickListener(new CC.a(this, 14));
    }
}
