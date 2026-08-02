package uZ;

import EZ.f;
import EZ.g;
import androidx.activity.C;
import androidx.activity.L;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8883d;
import ru.ozon.app.android.R;
import sZ.AbstractC9643a;
import tZ.C9786a;
import uZ.C9992d;

/* loaded from: classes3.dex */
public class e extends g {

    @NotNull
    public static final b Companion = new b();

    @NotNull
    private final DialogInterfaceOnCancelListenerC5390k fragment;
    private boolean isClosing;
    private boolean keepInBackStackOnTabNavigation;

    @NotNull
    private final C9992d.b navigationMode;

    @NotNull
    private final sZ.c<?> rootDestination;

    @NotNull
    private final String rootPath;

    static final class a extends AbstractC7737t implements Function1<C, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C c11) {
            C addCallback = c11;
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            g.navigate$default(e.this, f.a(new C9786a()), 0, 2, null);
            return Unit.f71690a;
        }
    }

    public static final class b {
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            e.this.getFragmentManager().S0();
            return Unit.f71690a;
        }
    }

    public static final class d implements W<J> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DialogInterfaceOnCancelListenerC5390k f100442a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f100443b;

        public d(DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k, e eVar) {
            this.f100442a = dialogInterfaceOnCancelListenerC5390k;
            this.f100443b = eVar;
        }

        @Override // androidx.lifecycle.W
        public final void onChanged(J j11) {
            J j12 = j11;
            if (j12 != null) {
                e eVar = this.f100443b;
                L.a(eVar.fragment.requireComponentDialog().getOnBackPressedDispatcher(), j12, eVar.new a(), 2);
                this.f100442a.getViewLifecycleOwnerLiveData().removeObserver(this);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(int i11, @NotNull DialogInterfaceOnCancelListenerC5390k fragment, @NotNull C9992d.b navigationMode, @NotNull sZ.c<?> rootDestination) {
        super(r0, r4, r1, fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(navigationMode, "navigationMode");
        Intrinsics.checkNotNullParameter(rootDestination, "rootDestination");
        r requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Integer valueOf = Integer.valueOf(i11);
        G childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.fragment = fragment;
        this.navigationMode = navigationMode;
        this.rootDestination = rootDestination;
        this.rootPath = rootDestination.getPath();
        J value = fragment.getViewLifecycleOwnerLiveData().getValue();
        if (value == null || !value.getLifecycle().b().a(AbstractC5434v.b.INITIALIZED)) {
            fragment.getViewLifecycleOwnerLiveData().observeForever(new d(fragment, this));
        } else {
            L.a(this.fragment.requireComponentDialog().getOnBackPressedDispatcher(), value, new a(), 2);
        }
    }

    private final boolean areFlowTheSame(C9992d.b bVar, C9992d.b bVar2) {
        return (bVar instanceof C9992d.b.C2202b) && (bVar2 instanceof C9992d.b.C2202b) && Intrinsics.d(((C9992d.b.C2202b) bVar).a(), ((C9992d.b.C2202b) bVar2).a());
    }

    private final boolean areNestedContextTheSame(C9992d.b bVar, C9992d.b bVar2) {
        return (bVar instanceof C9992d.b.C2203d) && (bVar2 instanceof C9992d.b.C2203d) && Intrinsics.d(((C9992d.b.C2203d) bVar).a(), ((C9992d.b.C2203d) bVar2).a());
    }

    private final void dismissAndNext(EZ.e<?> eVar, int i11) {
        if (this.fragment.isAdded()) {
            safeDismiss(this.fragment);
        }
        next(eVar, i11);
    }

    private final void safeDismiss(DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k) {
        dialogInterfaceOnCancelListenerC5390k.dismiss();
        this.isClosing = true;
    }

    @Override // EZ.g
    protected void attachToHolder() {
        if (getFragmentManager().f0(R.id.fragmentContainer) != null) {
            return;
        }
        navigateInternal(f.a(this.rootDestination), 0);
    }

    @NotNull
    protected sZ.c<? extends ComponentCallbacksC5392m> getDestinationOnSameNestedContext(@NotNull C9992d destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new sZ.c<>(destination.getFragmentDestination().getTag(), destination.getFragmentDestination().getFragment(), destination.getFragmentDestination().getRequestCode(), false, false, null, false, false, false, 504, null);
    }

    @Override // EZ.g
    public void navigate(@NotNull EZ.e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object b11 = response.b();
        if (b11 instanceof pZ.g) {
            super.navigate(response, i11);
            return;
        }
        boolean z11 = b11 instanceof C9992d;
        if (z11) {
            C9992d c9992d = (C9992d) b11;
            if (areNestedContextTheSame(this.navigationMode, c9992d.getNavigationMode())) {
                super.navigate(response.e(getDestinationOnSameNestedContext(c9992d)), i11);
                return;
            }
        }
        if (z11) {
            if (!this.fragment.isAdded()) {
                next(response, i11);
                return;
            }
            C9992d c9992d2 = (C9992d) b11;
            if (Intrinsics.d(c9992d2.getNavigationMode(), C9992d.b.c.f100438a)) {
                if (c9992d2.getFragment().getTargetFragment() == null && !this.isClosing) {
                    c9992d2.getFragment().setTargetFragment(this.fragment, 9002);
                    i11 = 0;
                }
                next(response, i11);
                return;
            }
            if (Intrinsics.d(c9992d2.getFragmentDestination().getPath(), this.rootPath) && c9992d2.getFragmentDestination().isAnchor()) {
                super.navigate(response.e(c9992d2.getFragmentDestination()), i11);
                return;
            }
            if (!areFlowTheSame(this.navigationMode, c9992d2.getNavigationMode())) {
                safeDismiss(this.fragment);
            }
            next(response, i11);
            return;
        }
        if (b11 instanceof AbstractC9643a) {
            dismissAndNext(response, i11);
            return;
        }
        if ((b11 instanceof OZ.g) && !this.keepInBackStackOnTabNavigation) {
            dismissAndNext(response, i11);
            return;
        }
        if (!(b11 instanceof C9786a)) {
            if (b11 instanceof C8883d) {
                dismissAndNext(response, i11);
                return;
            } else {
                next(response, i11);
                return;
            }
        }
        if (getFragmentManager().l0() > 1) {
            safeTransaction(new c());
            return;
        }
        if (getFragmentManager().l0() == 1 && this.fragment.isAdded()) {
            safeDismiss(this.fragment);
        } else if (this.fragment.isAdded()) {
            safeDismiss(this.fragment);
        }
    }

    public final void setKeepInBackStackOnTabNavigation(boolean z11) {
        this.keepInBackStackOnTabNavigation = z11;
    }
}
