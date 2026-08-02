package ru.ozon.android.messenger.framework.composer.screen;

import A00.a;
import B0.A0;
import B90.n0;
import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.z0;
import b00.b;
import gi.C6740b;
import gk0.q;
import hi.InterfaceC6958a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.f;
import l10.t;
import l10.v;
import l20.C7854a;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.di.component.a;
import ru.ozon.android.messenger.framework.composer.screen.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/android/messenger/framework/composer/screen/b;", "Landroidx/fragment/app/m;", "Lb00/b;", "", "<init>", "()V", "a", "b", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends ComponentCallbacksC5392m implements b00.b {

    /* renamed from: a, reason: collision with root package name */
    public Set<i> f86747a;

    /* renamed from: b, reason: collision with root package name */
    public List<ru.ozon.android.messenger.framework.composer.configuration.f> f86748b;

    /* renamed from: c, reason: collision with root package name */
    public E00.a f86749c;

    /* renamed from: d, reason: collision with root package name */
    public C00.a f86750d;

    /* renamed from: e, reason: collision with root package name */
    public Set<QZ.g> f86751e;

    /* renamed from: f, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.d f86752f;

    /* renamed from: i, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.composer.screen.e f86755i;

    /* renamed from: j, reason: collision with root package name */
    public a f86756j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f86757k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC1550b f86758l;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f86753g = k.b(d.f86761b);

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f86754h = k.b(new c());

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final n0 f86759m = new n0(this, 2);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BOTTOM_SHEET_FULL;
        public static final a BOTTOM_SHEET_WRAP;
        public static final a REGULAR;

        static {
            a aVar = new a("REGULAR", 0);
            REGULAR = aVar;
            a aVar2 = new a("BOTTOM_SHEET_WRAP", 1);
            BOTTOM_SHEET_WRAP = aVar2;
            a aVar3 = new a("BOTTOM_SHEET_FULL", 2);
            BOTTOM_SHEET_FULL = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.composer.screen.b$b, reason: collision with other inner class name */
    public interface InterfaceC1550b {
        void a();
    }

    static final class c extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.composer.screen.d> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.framework.composer.screen.d invoke() {
            b bVar = b.this;
            ru.ozon.android.messenger.framework.composer.screen.e eVar = bVar.f86755i;
            if (eVar == null) {
                Intrinsics.n("config");
                throw null;
            }
            t tVar = new t(bVar);
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            bVar.getParentFragment();
            r requireActivity = bVar.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            l10.r rVar = new l10.r(bVar, requireActivity, 4);
            Set<i> set = bVar.f86747a;
            if (set == null) {
                Intrinsics.n("widgets");
                throw null;
            }
            a aVar = bVar.f86756j;
            if (aVar == null) {
                Intrinsics.n("displayMode");
                throw null;
            }
            int ordinal = aVar.ordinal();
            f.e eVar2 = ordinal == a.BOTTOM_SHEET_FULL.ordinal() ? f.e.BOTTOM_SHEET_FULL : ordinal == a.BOTTOM_SHEET_WRAP.ordinal() ? f.e.BOTTOM_SHEET_WRAP : f.e.REGULAR;
            Set<QZ.g> set2 = bVar.f86751e;
            if (set2 == null) {
                Intrinsics.n("interceptors");
                throw null;
            }
            E00.a aVar2 = bVar.f86749c;
            if (aVar2 == null) {
                Intrinsics.n("errorStateFactory");
                throw null;
            }
            C00.a aVar3 = bVar.f86750d;
            if (aVar3 != null) {
                return new ru.ozon.android.messenger.framework.composer.screen.d(bVar, eVar, tVar, rVar, set, eVar2, set2, aVar2, aVar3);
            }
            Intrinsics.n("initialWidgetsProvider");
            throw null;
        }
    }

    static final class d extends AbstractC7737t implements Function0<Handler> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f86761b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final class e implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5434v f86762a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f86763b;

        public e(AbstractC5434v abstractC5434v, b bVar, int i11, int i12, Intent intent) {
            this.f86762a = abstractC5434v;
            this.f86763b = bVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f86762a.e(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Iterator<T> it = this.f86763b.getConfigurators().iterator();
            while (it.hasNext()) {
                ((ru.ozon.android.messenger.framework.composer.configuration.f) it.next()).getClass();
            }
            this.f86762a.e(this);
        }
    }

    public static final class f implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5434v f86764a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f86765b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String[] f86766c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int[] f86767d;

        public f(AbstractC5434v abstractC5434v, b bVar, int i11, String[] strArr, int[] iArr) {
            this.f86764a = abstractC5434v;
            this.f86765b = bVar;
            this.f86766c = strArr;
            this.f86767d = iArr;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f86764a.e(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Iterator<T> it = this.f86765b.getConfigurators().iterator();
            while (it.hasNext()) {
                ((ru.ozon.android.messenger.framework.composer.configuration.f) it.next()).getClass();
                String[] permissions = this.f86766c;
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                int[] grantResults = this.f86767d;
                Intrinsics.checkNotNullParameter(grantResults, "grantResults");
            }
            this.f86764a.e(this);
        }
    }

    public static final class g extends C {
        g() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            b currentFragment = b.this;
            if (currentFragment.f86752f == null) {
                Intrinsics.n("router");
                throw null;
            }
            Intrinsics.checkNotNullParameter(currentFragment, "currentFragment");
            if (currentFragment.isAdded()) {
                currentFragment.getParentFragmentManager().P0();
            }
        }
    }

    public static void t(b bVar) {
        if (bVar.isAdded() && !bVar.f86757k) {
            bVar.f86757k = true;
            bVar.u().e().c(a.u.C0013a.f242a);
        }
    }

    private final ru.ozon.android.messenger.framework.composer.screen.d u() {
        return (ru.ozon.android.messenger.framework.composer.screen.d) this.f86754h.getValue();
    }

    @Override // b00.b
    public final void ComposeWidgetWrapper(@NotNull C7854a c7854a, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
        b.a.a(this, c7854a, function2, interfaceC3967k, i11);
    }

    @NotNull
    public final List<ru.ozon.android.messenger.framework.composer.configuration.f> getConfigurators() {
        List<ru.ozon.android.messenger.framework.composer.configuration.f> list = this.f86748b;
        if (list != null) {
            return list;
        }
        Intrinsics.n("configurators");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onActivityResult(int i11, int i12, Intent intent) {
        AbstractC5434v lifecycle = getLifecycle();
        if (!lifecycle.b().a(AbstractC5434v.b.STARTED)) {
            lifecycle.a(new e(lifecycle, this, i11, i12, intent));
            return;
        }
        Iterator<T> it = getConfigurators().iterator();
        while (it.hasNext()) {
            ((ru.ozon.android.messenger.framework.composer.configuration.f) it.next()).getClass();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        if (r0 == null) goto L20;
     */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttach(@NotNull Context context) {
        a c11;
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle arguments = getArguments();
        C6740b dependencyStorage = ru.ozon.android.messenger.utils.g.a(this).getDependencyStorage();
        if (ru.ozon.android.messenger.framework.composer.di.component.b.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", ru.ozon.android.messenger.framework.composer.di.component.b.class.getSimpleName(), " is not DiComponent"));
        }
        ru.ozon.android.messenger.framework.composer.di.component.b bVar = (ru.ozon.android.messenger.framework.composer.di.component.b) dependencyStorage.b(ru.ozon.android.messenger.framework.composer.di.component.b.class);
        ru.ozon.android.messenger.framework.composer.navigation.config.c p11 = bVar.p();
        ru.ozon.android.messenger.framework.composer.navigation.config.a aVar = arguments != null ? (ru.ozon.android.messenger.framework.composer.navigation.config.a) arguments.getParcelable("COMPOSER_PAGE") : null;
        if (aVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ru.ozon.android.messenger.framework.composer.screen.e a11 = p11.a(aVar);
        Intrinsics.checkNotNullParameter(a11, "<set-?>");
        this.f86755i = a11;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = arguments.getSerializable("ARG_DISPLAY_MODE", a.class);
            } else {
                Object serializable = arguments.getSerializable("ARG_DISPLAY_MODE");
                if (!(serializable instanceof a)) {
                    serializable = null;
                }
                obj = (a) serializable;
            }
            c11 = (a) obj;
        }
        ru.ozon.android.messenger.framework.composer.screen.e eVar = this.f86755i;
        if (eVar == null) {
            Intrinsics.n("config");
            throw null;
        }
        e.a d11 = eVar.d();
        c11 = d11 != null ? d11.c() : a.REGULAR;
        Intrinsics.checkNotNullParameter(c11, "<set-?>");
        this.f86756j = c11;
        a.InterfaceC1541a a12 = ru.ozon.android.messenger.framework.composer.di.component.c.a();
        ru.ozon.android.messenger.framework.composer.screen.e eVar2 = this.f86755i;
        if (eVar2 == null) {
            Intrinsics.n("config");
            throw null;
        }
        a12.a(eVar2, bVar).a(this);
        super.onAttach(context);
        Object parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = getActivity();
        }
        this.f86758l = parentFragment instanceof InterfaceC1550b ? (InterfaceC1550b) parentFragment : null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<T> it = getConfigurators().iterator();
        while (it.hasNext()) {
            ((ru.ozon.android.messenger.framework.composer.configuration.f) it.next()).getClass();
            Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ru.ozon.android.messenger.framework.composer.screen.e eVar = this.f86755i;
        if (eVar == null) {
            Intrinsics.n("config");
            throw null;
        }
        Integer j11 = eVar.j();
        if (j11 != null) {
            ru.ozon.android.messenger.framework.composer.utils.b bVar = new ru.ozon.android.messenger.framework.composer.utils.b(j11.intValue());
            r requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            bVar.d(requireActivity, this);
        }
        ru.ozon.android.messenger.framework.composer.configuration.e eVar2 = new ru.ozon.android.messenger.framework.composer.configuration.e(u());
        for (ru.ozon.android.messenger.framework.composer.configuration.f fVar : getConfigurators()) {
            fVar.a(eVar2);
            v viewModelOwnerProvider = u().j();
            Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
            getLifecycle().a(fVar);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return u().b(inflater, viewGroup).Y();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDetach() {
        this.f86758l = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        super.onPause();
        ((Handler) this.f86753g.getValue()).removeCallbacks(this.f86759m);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onRequestPermissionsResult(int i11, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        AbstractC5434v lifecycle = getLifecycle();
        if (!lifecycle.b().a(AbstractC5434v.b.STARTED)) {
            lifecycle.a(new f(lifecycle, this, i11, permissions, grantResults));
            return;
        }
        Iterator<T> it = getConfigurators().iterator();
        while (it.hasNext()) {
            ((ru.ozon.android.messenger.framework.composer.configuration.f) it.next()).getClass();
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        ((Handler) this.f86753g.getValue()).post(this.f86759m);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        for (ru.ozon.android.messenger.framework.composer.configuration.f fVar : getConfigurators()) {
            v viewModelOwnerProvider = u().j();
            fVar.getClass();
            Intrinsics.checkNotNullParameter(outState, "outState");
            Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        }
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        q qVar = q.f64554a;
        String componentCallbacksC5392m = toString();
        Intrinsics.checkNotNullExpressionValue(componentCallbacksC5392m, "toString(...)");
        qVar.c(componentCallbacksC5392m);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        androidx.activity.J onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "view");
        ru.ozon.android.messenger.framework.composer.viewmodel.b bVar = (ru.ozon.android.messenger.framework.composer.viewmodel.b) new z0(this, new ru.ozon.android.messenger.framework.composer.viewmodel.a()).a(ru.ozon.android.messenger.framework.composer.viewmodel.b.class);
        if (bVar != null) {
            bVar.e0(u().d());
        }
        InterfaceC1550b interfaceC1550b = this.f86758l;
        if (interfaceC1550b != null) {
            u();
            interfaceC1550b.a();
        }
        Sg.b.a(u().c(), this);
        ((Handler) this.f86753g.getValue()).post(this.f86759m);
        r activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, new g());
    }
}
