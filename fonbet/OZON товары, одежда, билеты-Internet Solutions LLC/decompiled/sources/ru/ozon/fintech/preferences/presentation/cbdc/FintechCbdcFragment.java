package ru.ozon.fintech.preferences.presentation.cbdc;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.C;
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
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import g.AbstractC6592d;
import g.InterfaceC6590b;
import h.C6757c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment;
import ru.ozon.fintech.preferences.presentation.cbdc.a;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/preferences/presentation/cbdc/FintechCbdcFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechCbdcFragment extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private v90.c f96680a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC6592d<String[]> f96681b;

    /* renamed from: c, reason: collision with root package name */
    public z0.b f96682c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final y0 f96683d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private a f96684e;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            FintechCbdcFragment.this.y().m0();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment$onViewCreated$$inlined$observe$1", f = "FintechCbdcFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96686d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96687e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96689g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechCbdcFragment f96690h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment$onViewCreated$$inlined$observe$1$1", f = "FintechCbdcFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96691d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96692e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechCbdcFragment f96693f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2107a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechCbdcFragment f96694a;

                public C2107a(FintechCbdcFragment fintechCbdcFragment) {
                    this.f96694a = fintechCbdcFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    Toast.makeText(this.f96694a.requireActivity().getApplicationContext(), (String) t2, 1).show();
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, FintechCbdcFragment fintechCbdcFragment) {
                super(2, dVar);
                this.f96692e = c02;
                this.f96693f = fintechCbdcFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96692e, dVar, this.f96693f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96691d;
                if (i11 == 0) {
                    s.b(obj);
                    C2107a c2107a = new C2107a(this.f96693f);
                    this.f96691d = 1;
                    if (this.f96692e.collect(c2107a, this) == aVar) {
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
        public b(C0 c02, kotlin.coroutines.d dVar, FintechCbdcFragment fintechCbdcFragment) {
            super(2, dVar);
            this.f96689g = c02;
            this.f96690h = fintechCbdcFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = FintechCbdcFragment.this.new b(this.f96689g, dVar, this.f96690h);
            bVar.f96687e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96686d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96687e)) {
                    J viewLifecycleOwner = FintechCbdcFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96689g, null, this.f96690h);
                    this.f96686d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment$onViewCreated$$inlined$observe$2", f = "FintechCbdcFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96695d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96696e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96698g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechCbdcFragment f96699h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment$onViewCreated$$inlined$observe$2$1", f = "FintechCbdcFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96700d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96701e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechCbdcFragment f96702f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2108a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechCbdcFragment f96703a;

                public C2108a(FintechCbdcFragment fintechCbdcFragment) {
                    this.f96703a = fintechCbdcFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    String str = (String) t2;
                    AbstractC6592d abstractC6592d = this.f96703a.f96681b;
                    if (abstractC6592d != null) {
                        abstractC6592d.a(new String[]{str});
                        return Unit.f71690a;
                    }
                    Intrinsics.n("filePickerLauncher");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, FintechCbdcFragment fintechCbdcFragment) {
                super(2, dVar);
                this.f96701e = c02;
                this.f96702f = fintechCbdcFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96701e, dVar, this.f96702f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96700d;
                if (i11 == 0) {
                    s.b(obj);
                    C2108a c2108a = new C2108a(this.f96702f);
                    this.f96700d = 1;
                    if (this.f96701e.collect(c2108a, this) == aVar) {
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
        public c(C0 c02, kotlin.coroutines.d dVar, FintechCbdcFragment fintechCbdcFragment) {
            super(2, dVar);
            this.f96698g = c02;
            this.f96699h = fintechCbdcFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = FintechCbdcFragment.this.new c(this.f96698g, dVar, this.f96699h);
            cVar.f96696e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96695d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96696e)) {
                    J viewLifecycleOwner = FintechCbdcFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96698g, null, this.f96699h);
                    this.f96695d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment$onViewCreated$$inlined$observe$3", f = "FintechCbdcFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96704d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96705e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96707g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechCbdcFragment f96708h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment$onViewCreated$$inlined$observe$3$1", f = "FintechCbdcFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96709d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96710e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechCbdcFragment f96711f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment$d$a$a, reason: collision with other inner class name */
            public static final class C2109a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechCbdcFragment f96712a;

                public C2109a(FintechCbdcFragment fintechCbdcFragment) {
                    this.f96712a = fintechCbdcFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    a.b bVar = (a.b) t2;
                    if (bVar != null) {
                        FintechCbdcFragment fintechCbdcFragment = this.f96712a;
                        v90.c cVar = fintechCbdcFragment.f96680a;
                        if (cVar != null) {
                            cVar.f102596d.bindState(bVar.a());
                        }
                        v90.c cVar2 = fintechCbdcFragment.f96680a;
                        if (cVar2 != null) {
                            cVar2.f102597e.bindState(bVar.b());
                        }
                        v90.c cVar3 = fintechCbdcFragment.f96680a;
                        if (cVar3 != null) {
                            cVar3.f102598f.bindState(bVar.c());
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechCbdcFragment fintechCbdcFragment) {
                super(2, dVar);
                this.f96710e = interfaceC2395h;
                this.f96711f = fintechCbdcFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96710e, dVar, this.f96711f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96709d;
                if (i11 == 0) {
                    s.b(obj);
                    C2109a c2109a = new C2109a(this.f96711f);
                    this.f96709d = 1;
                    if (this.f96710e.collect(c2109a, this) == aVar) {
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
        public d(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechCbdcFragment fintechCbdcFragment) {
            super(2, dVar);
            this.f96707g = interfaceC2395h;
            this.f96708h = fintechCbdcFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = FintechCbdcFragment.this.new d(this.f96707g, dVar, this.f96708h);
            dVar2.f96705e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96704d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96705e)) {
                    J viewLifecycleOwner = FintechCbdcFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96707g, null, this.f96708h);
                    this.f96704d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment$onViewCreated$$inlined$observe$4", f = "FintechCbdcFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96713d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96714e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96716g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechCbdcFragment f96717h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment$onViewCreated$$inlined$observe$4$1", f = "FintechCbdcFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96718d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96719e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechCbdcFragment f96720f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment$e$a$a, reason: collision with other inner class name */
            public static final class C2110a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechCbdcFragment f96721a;

                public C2110a(FintechCbdcFragment fintechCbdcFragment) {
                    this.f96721a = fintechCbdcFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    a.C2111a c2111a = (a.C2111a) t2;
                    v90.c cVar = this.f96721a.f96680a;
                    if (cVar != null) {
                        ConstraintLayout downloadContainer = cVar.f102595c;
                        Intrinsics.checkNotNullExpressionValue(downloadContainer, "downloadContainer");
                        downloadContainer.setVisibility(c2111a != null ? 0 : 8);
                        if (c2111a != null) {
                            cVar.f102599g.setText(c2111a.b());
                            cVar.f102594b.bindState(c2111a.a());
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechCbdcFragment fintechCbdcFragment) {
                super(2, dVar);
                this.f96719e = interfaceC2395h;
                this.f96720f = fintechCbdcFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96719e, dVar, this.f96720f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96718d;
                if (i11 == 0) {
                    s.b(obj);
                    C2110a c2110a = new C2110a(this.f96720f);
                    this.f96718d = 1;
                    if (this.f96719e.collect(c2110a, this) == aVar) {
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
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechCbdcFragment fintechCbdcFragment) {
            super(2, dVar);
            this.f96716g = interfaceC2395h;
            this.f96717h = fintechCbdcFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = FintechCbdcFragment.this.new e(this.f96716g, dVar, this.f96717h);
            eVar.f96714e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96713d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96714e)) {
                    J viewLifecycleOwner = FintechCbdcFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96716g, null, this.f96717h);
                    this.f96713d = 1;
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

    public static final class f extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return FintechCbdcFragment.this;
        }
    }

    public static final class g extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f96723b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f96723b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96723b.invoke();
        }
    }

    public static final class h extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96724b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96724b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96724b.getValue()).getViewModelStore();
        }
    }

    public static final class i extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96725b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96725b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96725b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public FintechCbdcFragment() {
        A90.b bVar = new A90.b(this, 0);
        InterfaceC4008j a11 = k.a(n.NONE, new g(new f()));
        this.f96683d = b0.b(this, kotlin.jvm.internal.N.b(ru.ozon.fintech.preferences.presentation.cbdc.a.class), new h(a11), new i(a11), bVar);
        this.f96684e = new a();
    }

    public static Unit t(FintechCbdcFragment fintechCbdcFragment) {
        fintechCbdcFragment.y().m0();
        return Unit.f71690a;
    }

    public static void u(FintechCbdcFragment fintechCbdcFragment, Uri uri) {
        if (uri != null) {
            fintechCbdcFragment.y().p0(uri);
        } else {
            Toast.makeText(fintechCbdcFragment.requireContext(), "Файл не выбран", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.ozon.fintech.preferences.presentation.cbdc.a y() {
        return (ru.ozon.fintech.preferences.presentation.cbdc.a) this.f96683d.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((w90.b) O30.a.a(O30.c.a(requireActivity)).a(w90.b.class)).Z0(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y().n0();
        this.f96681b = registerForActivityResult(new C6757c(), new InterfaceC6590b() { // from class: A90.a
            @Override // g.InterfaceC6590b
            public final void onActivityResult(Object obj) {
                FintechCbdcFragment.u(FintechCbdcFragment.this, (Uri) obj);
            }
        });
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        v90.c b11 = v90.c.b(inflater, viewGroup);
        this.f96680a = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f96680a = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.f96684e);
        C0 l02 = y().l0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(l02, null, this), 3);
        C0 j02 = y().j0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new c(j02, null, this), 3);
        v90.c cVar = this.f96680a;
        if (cVar != null) {
            cVar.f102600h.bindState(new FinToolbarState(getString(R.string.fintech_cbdc_debug_mfe_script_source_title), null, null, null, null, null, null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new A90.c(this, 0), null, null, null, null, 17, 61950, null));
        }
        x0<a.b> k02 = y().k0();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new d(k02, null, this), 3);
        x0<a.C2111a> i02 = y().i0();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new e(i02, null, this), 3);
    }
}
