package ru.ozon.android.messenger.framework.composer.screen.bottomsheet;

import B0.A0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.C;
import androidx.activity.L;
import androidx.activity.M;
import androidx.activity.s;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.Q;
import androidx.lifecycle.InterfaceC5431s;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.navigation.router.c;
import ru.ozon.android.messenger.framework.composer.screen.b;
import ru.ozon.android.messenger.framework.composer.screen.e;
import ru.ozon.android.messenger.utils.g;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/framework/composer/screen/bottomsheet/a;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public class a extends com.google.android.material.bottomsheet.b {

    /* renamed from: a, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.composer.navigation.config.a f86769a;

    /* renamed from: b, reason: collision with root package name */
    private e f86770b;

    /* renamed from: c, reason: collision with root package name */
    private c f86771c;

    /* renamed from: ru.ozon.android.messenger.framework.composer.screen.bottomsheet.a$a, reason: collision with other inner class name */
    public static final class C1551a extends AbstractC7737t implements Function1<C, Unit> {
        public C1551a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C c11) {
            C addCallback = c11;
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            c cVar = a.this.f86771c;
            if (cVar != null) {
                cVar.b(new ru.ozon.android.messenger.framework.composer.navigation.a());
                return Unit.f71690a;
            }
            Intrinsics.n("router");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onActivityResult(int i11, int i12, Intent intent) {
        ComponentCallbacksC5392m targetFragment = getTargetFragment();
        if (targetFragment != null) {
            Integer valueOf = Integer.valueOf(i11);
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            targetFragment.onActivityResult(valueOf != null ? valueOf.intValue() : getTargetRequestCode(), i12, intent);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        c cVar = this.f86771c;
        if (cVar != null) {
            cVar.b(new ru.ozon.android.messenger.framework.composer.navigation.a());
        } else {
            Intrinsics.n("router");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("ARG_DISPLAY_MODE") : null;
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        b.a valueOf = b.a.valueOf(string);
        C6740b dependencyStorage = g.a(this).getDependencyStorage();
        if (ru.ozon.android.messenger.framework.composer.di.component.b.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", ru.ozon.android.messenger.framework.composer.di.component.b.class.getSimpleName(), " is not DiComponent"));
        }
        ru.ozon.android.messenger.framework.composer.di.component.b bVar = (ru.ozon.android.messenger.framework.composer.di.component.b) dependencyStorage.b(ru.ozon.android.messenger.framework.composer.di.component.b.class);
        this.f86771c = bVar.F();
        Bundle arguments2 = getArguments();
        ru.ozon.android.messenger.framework.composer.navigation.config.a aVar = arguments2 != null ? (ru.ozon.android.messenger.framework.composer.navigation.config.a) arguments2.getParcelable("COMPOSER_PAGE") : null;
        if (aVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f86769a = aVar;
        ru.ozon.android.messenger.framework.composer.navigation.config.c p11 = bVar.p();
        ru.ozon.android.messenger.framework.composer.navigation.config.a aVar2 = this.f86769a;
        if (aVar2 == null) {
            Intrinsics.n("composerPage");
            throw null;
        }
        e a11 = p11.a(aVar2);
        e.a d11 = a11.d();
        if (d11 == null) {
            a11 = e.a(a11, new e.a(valueOf, null, 0, 2046));
        } else if (d11.c() != valueOf) {
            a11 = e.a(a11, e.a.a(d11, valueOf));
        }
        e.a d12 = a11.d();
        if (d12 == null) {
            d12 = new e.a(null, null, 0, 2047);
        }
        e eVar = Intrinsics.d(a11.d(), d12) ? a11 : null;
        if (eVar == null) {
            eVar = e.a(a11, d12);
        }
        this.f86770b = eVar;
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public final Dialog onCreateDialog(Bundle bundle) {
        SheetSoftInputMode sheetSoftInputMode;
        e eVar = this.f86770b;
        if (eVar == null) {
            Intrinsics.n("screenConfig");
            throw null;
        }
        e.a d11 = eVar.d();
        boolean b11 = d11 != null ? d11.b() : true;
        setCancelable(b11);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        if (d11 == null || (sheetSoftInputMode = d11.g()) == null) {
            sheetSoftInputMode = SheetSoftInputMode.UNSPECIFIED;
        }
        SheetSoftInputMode sheetSoftInputMode2 = sheetSoftInputMode;
        return new SheetDialog(requireContext, 0, false, 0, (d11 != null ? d11.c() : null) == b.a.BOTTOM_SHEET_WRAP, d11 != null ? d11.e() : false, null, null, d11 != null ? d11.f() : true, false, null, false, 0, b11, sheetSoftInputMode2, 7886, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(requireContext);
        fragmentContainerView.setId(R$id.m_fragmentContainer);
        fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        fragmentContainerView.setFitsSystemWindows(true);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        InterfaceC5431s parentFragment = getParentFragment();
        b bVar = parentFragment instanceof b ? (b) parentFragment : null;
        if (bVar != null) {
            bVar.onBottomSheetDismiss();
        } else {
            M activity = getActivity();
            b bVar2 = activity instanceof b ? (b) activity : null;
            if (bVar2 != null) {
                bVar2.onBottomSheetDismiss();
            }
        }
        if (this.f86770b == null) {
            Intrinsics.n("screenConfig");
            throw null;
        }
        c cVar = this.f86771c;
        if (cVar == null) {
            Intrinsics.n("router");
            throw null;
        }
        if (equals(cVar.getCurrentFragment()) && !getParentFragmentManager().H0() && !getParentFragmentManager().C0()) {
            getParentFragmentManager().S0();
        }
        View view = getView();
        if (view != null) {
            ViewExtKt.hideKeyboard(view);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(-1);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        b.a aVar;
        super.onStart();
        if (getChildFragmentManager().f0(R$id.m_fragmentContainer) == null) {
            ru.ozon.android.messenger.framework.composer.navigation.config.a composerPage = this.f86769a;
            if (composerPage == null) {
                Intrinsics.n("composerPage");
                throw null;
            }
            e eVar = this.f86770b;
            if (eVar == null) {
                Intrinsics.n("screenConfig");
                throw null;
            }
            e.a d11 = eVar.d();
            if (d11 == null || (aVar = d11.c()) == null) {
                aVar = b.a.REGULAR;
            }
            Intrinsics.checkNotNullParameter(composerPage, "composerPage");
            ru.ozon.android.messenger.framework.composer.screen.b bVar = new ru.ozon.android.messenger.framework.composer.screen.b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("COMPOSER_PAGE", composerPage);
            bundle.putSerializable("ARG_DISPLAY_MODE", aVar);
            bVar.setArguments(bundle);
            Q p11 = getChildFragmentManager().p();
            Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction(...)");
            p11.r(R$id.m_fragmentContainer, bVar, null);
            p11.i();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        Intrinsics.g(dialog, "null cannot be cast to non-null type androidx.activity.ComponentDialog");
        L.a(((s) dialog).getOnBackPressedDispatcher(), this, new C1551a(), 2);
    }
}
