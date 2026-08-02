package xZ;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.C9011c;
import rZ.C9237b;
import sZ.c;
import tZ.C9786a;

/* loaded from: classes3.dex */
public abstract class j extends EZ.g {

    @NotNull
    private final String hostName;

    @NotNull
    private final i rootFactory;

    @NotNull
    private final c.b transitionAnimations;

    public static final class a implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC5392m f105201a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f105202b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EZ.e f105203c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C9237b f105204d;

        public a(ComponentCallbacksC5392m componentCallbacksC5392m, j jVar, EZ.e eVar, C9237b c9237b) {
            this.f105201a = componentCallbacksC5392m;
            this.f105202b = jVar;
            this.f105203c = eVar;
            this.f105204d = c9237b;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f105201a.getLifecycle().e(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            EZ.g.redirect$default(this.f105202b, this.f105203c.e(this.f105204d.getRedirect()), 0, 2, null);
            this.f105201a.getLifecycle().e(this);
        }
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            j.this.getFragmentManager().S0();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull r activity, @NotNull G fragmentManager, @NotNull J lifecycleOwner, int i11, @NotNull String hostName, @NotNull i rootFactory, @NotNull c.b transitionAnimations) {
        super(activity, Integer.valueOf(i11), fragmentManager, lifecycleOwner);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(hostName, "hostName");
        Intrinsics.checkNotNullParameter(rootFactory, "rootFactory");
        Intrinsics.checkNotNullParameter(transitionAnimations, "transitionAnimations");
        this.hostName = hostName;
        this.rootFactory = rootFactory;
        this.transitionAnimations = transitionAnimations;
    }

    @Override // EZ.g
    protected void attachToHolder() {
        super.attachToHolder();
        if (getFragmentManager().g0(this.hostName) == null) {
            super.navigate(EZ.f.a(new sZ.c(this.hostName, this.rootFactory.create(), null, false, false, this.transitionAnimations, true, false, false, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, null)), 0);
        }
    }

    @NotNull
    public final String getHostName$compass_release() {
        return this.hostName;
    }

    @Override // EZ.g
    public void navigate(@NotNull EZ.e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object b11 = response.b();
        if (!(b11 instanceof C9237b)) {
            if (!(b11 instanceof C9786a)) {
                super.navigate(response, i11);
                return;
            } else if (getFragmentManager().l0() > 1) {
                safeTransaction(new b());
                return;
            } else {
                getActivity().finish();
                return;
            }
        }
        C9237b c9237b = (C9237b) b11;
        sZ.c<C9011c> root = c9237b.getRoot();
        EZ.e<?> e11 = response.e(root);
        Integer requestCode = c9237b.getRequestCode();
        if (requestCode != null) {
            i11 = requestCode.intValue();
        }
        super.navigate(e11, i11);
        C9011c fragment = root.getFragment();
        if (fragment.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            EZ.g.redirect$default(this, response.e(c9237b.getRedirect()), 0, 2, null);
        } else {
            fragment.getLifecycle().a(new a(fragment, this, response, (C9237b) b11));
        }
    }
}
