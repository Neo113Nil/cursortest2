package ru.ozon.fintech.features.cbottomstories.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import C.D;
import H30.u;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import Sc.s;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.ImageView;
import androidx.activity.C;
import androidx.annotation.Keep;
import androidx.appcompat.app.j;
import androidx.appcompat.view.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottombase.ui.CbottomUIScrollableView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import w40.InterfaceC10428a;
import xe.C10727i;
import xe.M;
import xe.N;
import y50.InterfaceC10839a;

@Keep
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001TB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b'\u0010(J3\u0010.\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010#2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020#H\u0016¢\u0006\u0004\b.\u0010/R\u001a\u00100\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010%R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010C\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0016X\u0096D¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010M\u001a\u00020G8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bL\u00108\u001a\u0004\bM\u0010KR\u001a\u0010O\u001a\u00020N8\u0016X\u0096D¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lru/ozon/fintech/features/cbottomstories/presentation/FullFragment;", "LE30/b;", "Lw40/a;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "onDestroy", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "", "provideId", "()Ljava/lang/String;", "parameterJson", "action", "(Ljava/lang/String;)V", "Landroid/os/Parcelable;", "parameterParcelable", "", "version", "uuid", "updateState", "(Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/String;)V", "fragmentName", "Ljava/lang/String;", "getFragmentName", "LL40/a;", "binding", "LL40/a;", "LB50/c;", "viewModel$delegate", "LSc/j;", "getViewModel", "()LB50/c;", "viewModel", "Landroidx/appcompat/app/j;", "delegate", "Landroidx/appcompat/app/j;", "Landroid/widget/ImageView;", "close", "Landroid/widget/ImageView;", "Landroidx/activity/C;", "onBackPressedCallback", "Landroidx/activity/C;", "getOnBackPressedCallback", "()Landroidx/activity/C;", "", "lightStatusBar", "Z", "getLightStatusBar", "()Z", "isStandaloneIntegration$delegate", "isStandaloneIntegration", "", "dimAmount", "F", "getDimAmount", "()F", "Companion", "a", "cbottom-full_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FullFragment extends E30.b implements InterfaceC10428a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String TAG = "FullFragment";
    private L40.a binding;
    private ImageView close;
    private j delegate;
    private final float dimAmount;

    @NotNull
    private final String fragmentName = TAG;

    /* renamed from: isStandaloneIntegration$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isStandaloneIntegration;
    private final boolean lightStatusBar;

    @NotNull
    private final C onBackPressedCallback;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.FullFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static Bundle a(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return androidx.core.os.d.b(new Pair("PARAMETER_JSON", str), new Pair("PARAMETER_PARCELABLE", parcelable), new Pair("PARAMETER_VERSION", Integer.valueOf(i11)), new Pair("PARAMETER_UUID", uuid));
        }
    }

    public static final class b extends C {
        b() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            FullFragment.this.getViewModel().onBackPressed();
        }
    }

    public static final class c implements androidx.appcompat.app.h {
        @Override // androidx.appcompat.app.h
        public final void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
        }

        @Override // androidx.appcompat.app.h
        public final void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
        }

        @Override // androidx.appcompat.app.h
        public final androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
            return null;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.FullFragment$onViewCreated$$inlined$observe$1", f = "FullFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95281d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95282e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95284g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FullFragment f95285h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.FullFragment$onViewCreated$$inlined$observe$1$1", f = "FullFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95286d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95287e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FullFragment f95288f;

            /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.FullFragment$d$a$a, reason: collision with other inner class name */
            public static final class C2018a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FullFragment f95289a;

                public C2018a(FullFragment fullFragment) {
                    this.f95289a = fullFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    j jVar;
                    Window window;
                    Window window2;
                    Window window3;
                    C50.c cVar = (C50.c) t2;
                    if (cVar != null) {
                        FullFragment fullFragment = this.f95289a;
                        L40.a aVar = fullFragment.binding;
                        if (aVar != null) {
                            aVar.f16556b.a(cVar.b());
                        }
                        if (Intrinsics.d(cVar.c(), Boolean.TRUE)) {
                            j jVar2 = fullFragment.delegate;
                            if (jVar2 != null) {
                                jVar2.M(1);
                            }
                            j jVar3 = fullFragment.delegate;
                            if (jVar3 != null) {
                                jVar3.g();
                            }
                        } else {
                            int i11 = fullFragment.getResources().getConfiguration().uiMode & 48;
                            if (i11 == 16) {
                                j jVar4 = fullFragment.delegate;
                                if (jVar4 != null) {
                                    jVar4.M(1);
                                }
                            } else if (i11 == 32 && (jVar = fullFragment.delegate) != null) {
                                jVar.M(2);
                            }
                            j jVar5 = fullFragment.delegate;
                            if (jVar5 != null) {
                                jVar5.g();
                            }
                        }
                        ImageView imageView = fullFragment.close;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                        ImageView imageView2 = fullFragment.close;
                        if (imageView2 != null) {
                            imageView2.setOnClickListener(fullFragment.new e());
                        }
                        if (cVar.e() == null) {
                            Dialog dialog = fullFragment.getDialog();
                            if (dialog != null && (window = dialog.getWindow()) != null) {
                                u.d(window);
                            }
                        } else if (cVar.e().booleanValue()) {
                            ImageView imageView3 = fullFragment.close;
                            if (imageView3 != null) {
                                ThemeExtKt.tint(imageView3, new Integer(androidx.core.content.a.getColor(fullFragment.requireContext(), R.color.oz_black)));
                            }
                            Dialog dialog2 = fullFragment.getDialog();
                            if (dialog2 != null && (window3 = dialog2.getWindow()) != null) {
                                u.f(window3);
                            }
                        } else {
                            ImageView imageView4 = fullFragment.close;
                            if (imageView4 != null) {
                                ThemeExtKt.tint(imageView4, new Integer(androidx.core.content.a.getColor(fullFragment.requireContext(), R.color.oz_white_1)));
                            }
                            Dialog dialog3 = fullFragment.getDialog();
                            if (dialog3 != null && (window2 = dialog3.getWindow()) != null) {
                                u.e(window2);
                            }
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FullFragment fullFragment) {
                super(2, dVar);
                this.f95287e = interfaceC2395h;
                this.f95288f = fullFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95287e, dVar, this.f95288f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95286d;
                if (i11 == 0) {
                    s.b(obj);
                    C2018a c2018a = new C2018a(this.f95288f);
                    this.f95286d = 1;
                    if (this.f95287e.collect(c2018a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FullFragment fullFragment) {
            super(2, dVar);
            this.f95284g = interfaceC2395h;
            this.f95285h = fullFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = FullFragment.this.new d(this.f95284g, dVar, this.f95285h);
            dVar2.f95282e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95281d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95282e)) {
                    J viewLifecycleOwner = FullFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95284g, null, this.f95285h);
                    this.f95281d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    static final class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FullFragment.this.getViewModel().onBackPressed();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return FullFragment.this;
        }
    }

    public static final class g extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f95292b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f95292b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95292b.invoke();
        }
    }

    public static final class h extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95293b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95293b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95293b.getValue()).getViewModelStore();
        }
    }

    public static final class i extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95294b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95294b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95294b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public FullFragment() {
        B50.a aVar = new B50.a(this, 0);
        InterfaceC4008j a11 = k.a(n.NONE, new g(new f()));
        this.viewModel = b0.b(this, kotlin.jvm.internal.N.b(B50.c.class), new h(a11), new i(a11), aVar);
        this.onBackPressedCallback = new b();
        this.isStandaloneIntegration = k.b(new B50.b(this, 0));
        this.dimAmount = 0.6f;
    }

    @NotNull
    public static final Bundle getBundle(String str, Parcelable parcelable, int i11, @NotNull String str2) {
        INSTANCE.getClass();
        return Companion.a(str, parcelable, i11, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B50.c getViewModel() {
        return (B50.c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isStandaloneIntegration_delegate$lambda$1(FullFragment fullFragment) {
        return fullFragment.getViewModel().l0();
    }

    @NotNull
    public static final FullFragment newInstance(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
        Companion companion = INSTANCE;
        companion.getClass();
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        FullFragment fullFragment = new FullFragment();
        companion.getClass();
        fullFragment.setArguments(Companion.a(str, parcelable, i11, uuid));
        return fullFragment;
    }

    @Override // w40.InterfaceC10428a
    public void action(String parameterJson) {
    }

    @Override // E30.b
    /* renamed from: getDimAmount, reason: from getter */
    public float getF95085f() {
        return this.dimAmount;
    }

    @Override // E30.b
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public String getF95080a() {
        return this.fragmentName;
    }

    @Override // E30.b
    public boolean getLightStatusBar() {
        return this.lightStatusBar;
    }

    @Override // E30.b
    @NotNull
    public C getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    @Override // E30.b
    /* renamed from: isStandaloneIntegration */
    public boolean getF96847d() {
        return ((Boolean) this.isStandaloneIntegration.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((InterfaceC10839a) O30.a.a(O30.c.a(requireActivity)).a(InterfaceC10839a.class)).Q(this);
        super.onAttach(context);
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        L80.a.a(TAG, "onCreate");
        setStyle(2, R.style.Base_Ozon_FullScreenDialog);
        B50.c viewModel = getViewModel();
        Bundle arguments = getArguments();
        String string2 = arguments != null ? arguments.getString("PARAMETER_JSON") : null;
        Bundle arguments2 = getArguments();
        Parcelable parcelable = arguments2 != null ? arguments2.getParcelable("PARAMETER_PARCELABLE") : null;
        Bundle arguments3 = getArguments();
        Integer valueOf = Integer.valueOf(arguments3 != null ? arguments3.getInt("PARAMETER_VERSION", 2) : 2);
        Bundle arguments4 = getArguments();
        viewModel.j0(string2, parcelable, valueOf, (arguments4 == null || (string = arguments4.getString("PARAMETER_UUID", "")) == null) ? "" : string, null);
        getViewModel().g0();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        this.delegate = j.i(onCreateDialog, new c());
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ConstraintLayout f10596e;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        L80.a.a(TAG, "onCreateView");
        L40.a b11 = L40.a.b(inflater, container);
        this.binding = b11;
        CbottomUIScrollableView a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        ImageView imageView = new ImageView(requireContext());
        this.close = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.close;
        if (imageView2 != null) {
            imageView2.setImageDrawable(androidx.core.content.a.getDrawable(requireContext(), R.drawable.ic_m_cross_filled));
        }
        ImageView imageView3 = this.close;
        if (imageView3 != null) {
            ThemeExtKt.tint(imageView3, Integer.valueOf(androidx.core.content.a.getColor(requireContext(), R.color.oz_gray_40)));
        }
        ImageView imageView4 = this.close;
        if (imageView4 != null) {
            ConstraintLayout.b bVar = new ConstraintLayout.b(D.c(64.0f), D.c(64.0f));
            bVar.f41658v = 0;
            bVar.f41636i = 0;
            imageView4.setLayoutParams(bVar);
        }
        ImageView imageView5 = this.close;
        if (imageView5 != null) {
            imageView5.setVisibility(8);
        }
        L40.a aVar = this.binding;
        if (aVar != null && (f10596e = aVar.f16556b.getF10596e()) != null) {
            f10596e.addView(this.close);
        }
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
        getViewModel().onDestroy();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        L80.a.a(TAG, "onDestroyView");
        boolean nightOnStart = getNightOnStart();
        if (nightOnStart) {
            j jVar = this.delegate;
            if (jVar != null) {
                jVar.M(2);
            }
        } else {
            if (nightOnStart) {
                throw new o();
            }
            j jVar2 = this.delegate;
            if (jVar2 != null) {
                jVar2.M(1);
            }
        }
        j jVar3 = this.delegate;
        if (jVar3 != null) {
            jVar3.g();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        getViewModel().m0();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        getViewModel().onStart();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        super.onStop();
        getViewModel().onStop();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        L80.a.a(TAG, "onViewCreated");
        L40.a aVar = this.binding;
        if (aVar != null) {
            aVar.f16556b.setAlpha(0.0f);
        }
        L40.a aVar2 = this.binding;
        if (aVar2 != null && (animate = aVar2.f16556b.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(400L)) != null) {
            duration.start();
        }
        x0<C50.c> k02 = getViewModel().k0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new d(k02, null, this), 3);
    }

    @Override // w40.InterfaceC10428a
    @NotNull
    public String provideId() {
        return getViewModel().i0();
    }

    @Override // w40.InterfaceC10428a
    public void updateState(String parameterJson, Parcelable parameterParcelable, int version, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        getViewModel().j0(parameterJson, parameterParcelable, Integer.valueOf(version), uuid, null);
    }
}
