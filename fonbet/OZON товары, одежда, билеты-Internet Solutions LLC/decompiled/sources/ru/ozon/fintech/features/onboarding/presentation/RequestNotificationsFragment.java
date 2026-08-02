package ru.ozon.fintech.features.onboarding.presentation;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.n;
import Sc.s;
import a50.C4949a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import f3.AbstractC6409a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import s90.InterfaceC9636e;
import t90.AbstractC9781a;
import u70.C9981c;
import v70.InterfaceC10268b;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/onboarding/presentation/RequestNotificationsFragment;", "LE30/c;", "", "<init>", "()V", "onboarding_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequestNotificationsFragment extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f95894a;

    /* renamed from: b, reason: collision with root package name */
    private C9981c f95895b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f95896c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private a f95897d;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            r activity = RequestNotificationsFragment.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$onViewCreated$$inlined$observe$1", f = "RequestNotificationsFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95899d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95900e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95902g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ RequestNotificationsFragment f95903h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$onViewCreated$$inlined$observe$1$1", f = "RequestNotificationsFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95904d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95905e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ RequestNotificationsFragment f95906f;

            /* renamed from: ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2051a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ RequestNotificationsFragment f95907a;

                public C2051a(RequestNotificationsFragment requestNotificationsFragment) {
                    this.f95907a = requestNotificationsFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    AbstractC9781a abstractC9781a = (AbstractC9781a) t2;
                    boolean z11 = abstractC9781a instanceof AbstractC9781a.C2181a;
                    RequestNotificationsFragment requestNotificationsFragment = this.f95907a;
                    if (z11) {
                        requestNotificationsFragment.requireContext().startActivity(((AbstractC9781a.C2181a) abstractC9781a).a());
                    } else if (abstractC9781a instanceof AbstractC9781a.b) {
                        List<InterfaceC9636e> a11 = ((AbstractC9781a.b) abstractC9781a).a();
                        ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
                        Iterator<T> it = a11.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((InterfaceC9636e) it.next()).a());
                        }
                        requestNotificationsFragment.requestPermissions((String[]) arrayList.toArray(new String[0]), 9314);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, RequestNotificationsFragment requestNotificationsFragment) {
                super(2, dVar);
                this.f95905e = c02;
                this.f95906f = requestNotificationsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95905e, dVar, this.f95906f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95904d;
                if (i11 == 0) {
                    s.b(obj);
                    C2051a c2051a = new C2051a(this.f95906f);
                    this.f95904d = 1;
                    if (this.f95905e.collect(c2051a, this) == aVar) {
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
        public b(C0 c02, kotlin.coroutines.d dVar, RequestNotificationsFragment requestNotificationsFragment) {
            super(2, dVar);
            this.f95902g = c02;
            this.f95903h = requestNotificationsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = RequestNotificationsFragment.this.new b(this.f95902g, dVar, this.f95903h);
            bVar.f95900e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95899d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95900e)) {
                    J viewLifecycleOwner = RequestNotificationsFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95902g, null, this.f95903h);
                    this.f95899d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$onViewCreated$$inlined$observe$2", f = "RequestNotificationsFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95908d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95909e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95911g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ RequestNotificationsFragment f95912h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$onViewCreated$$inlined$observe$2$1", f = "RequestNotificationsFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95913d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95914e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ RequestNotificationsFragment f95915f;

            /* renamed from: ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2052a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ RequestNotificationsFragment f95916a;

                public C2052a(RequestNotificationsFragment requestNotificationsFragment) {
                    this.f95916a = requestNotificationsFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C9981c c9981c;
                    String str = (String) t2;
                    if (str != null && (c9981c = this.f95916a.f95895b) != null) {
                        c9981c.f100365f.setText(str);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, RequestNotificationsFragment requestNotificationsFragment) {
                super(2, dVar);
                this.f95914e = interfaceC2395h;
                this.f95915f = requestNotificationsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95914e, dVar, this.f95915f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95913d;
                if (i11 == 0) {
                    s.b(obj);
                    C2052a c2052a = new C2052a(this.f95915f);
                    this.f95913d = 1;
                    if (this.f95914e.collect(c2052a, this) == aVar) {
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
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, RequestNotificationsFragment requestNotificationsFragment) {
            super(2, dVar);
            this.f95911g = interfaceC2395h;
            this.f95912h = requestNotificationsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = RequestNotificationsFragment.this.new c(this.f95911g, dVar, this.f95912h);
            cVar.f95909e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95908d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95909e)) {
                    J viewLifecycleOwner = RequestNotificationsFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95911g, null, this.f95912h);
                    this.f95908d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$onViewCreated$$inlined$observe$3", f = "RequestNotificationsFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95917d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95918e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95920g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ RequestNotificationsFragment f95921h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$onViewCreated$$inlined$observe$3$1", f = "RequestNotificationsFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95922d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95923e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ RequestNotificationsFragment f95924f;

            /* renamed from: ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$d$a$a, reason: collision with other inner class name */
            public static final class C2053a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ RequestNotificationsFragment f95925a;

                public C2053a(RequestNotificationsFragment requestNotificationsFragment) {
                    this.f95925a = requestNotificationsFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C9981c c9981c;
                    String str = (String) t2;
                    if (str != null && (c9981c = this.f95925a.f95895b) != null) {
                        c9981c.f100366g.setText(str);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, RequestNotificationsFragment requestNotificationsFragment) {
                super(2, dVar);
                this.f95923e = interfaceC2395h;
                this.f95924f = requestNotificationsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95923e, dVar, this.f95924f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95922d;
                if (i11 == 0) {
                    s.b(obj);
                    C2053a c2053a = new C2053a(this.f95924f);
                    this.f95922d = 1;
                    if (this.f95923e.collect(c2053a, this) == aVar) {
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
        public d(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, RequestNotificationsFragment requestNotificationsFragment) {
            super(2, dVar);
            this.f95920g = interfaceC2395h;
            this.f95921h = requestNotificationsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = RequestNotificationsFragment.this.new d(this.f95920g, dVar, this.f95921h);
            dVar2.f95918e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95917d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95918e)) {
                    J viewLifecycleOwner = RequestNotificationsFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95920g, null, this.f95921h);
                    this.f95917d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$onViewCreated$$inlined$observe$4", f = "RequestNotificationsFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95926d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95927e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95929g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ RequestNotificationsFragment f95930h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f95931i;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$onViewCreated$$inlined$observe$4$1", f = "RequestNotificationsFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95932d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95933e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ RequestNotificationsFragment f95934f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f95935g;

            /* renamed from: ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$e$a$a, reason: collision with other inner class name */
            public static final class C2054a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ RequestNotificationsFragment f95936a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f95937b;

                public C2054a(RequestNotificationsFragment requestNotificationsFragment, int i11) {
                    this.f95936a = requestNotificationsFragment;
                    this.f95937b = i11;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    String str = (String) t2;
                    if (str != null) {
                        RequestNotificationsFragment requestNotificationsFragment = this.f95936a;
                        C9981c c9981c = requestNotificationsFragment.f95895b;
                        if (c9981c != null) {
                            ImageView imageView = c9981c.f100363d;
                            Context requireContext = requestNotificationsFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            Integer iconResByToken = TokensExtKt.getIconResByToken(requireContext, str);
                            imageView.setImageResource(iconResByToken != null ? iconResByToken.intValue() : this.f95937b);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, RequestNotificationsFragment requestNotificationsFragment, int i11) {
                super(2, dVar);
                this.f95933e = interfaceC2395h;
                this.f95934f = requestNotificationsFragment;
                this.f95935g = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95933e, dVar, this.f95934f, this.f95935g);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95932d;
                if (i11 == 0) {
                    s.b(obj);
                    C2054a c2054a = new C2054a(this.f95934f, this.f95935g);
                    this.f95932d = 1;
                    if (this.f95933e.collect(c2054a, this) == aVar) {
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
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, RequestNotificationsFragment requestNotificationsFragment, int i11) {
            super(2, dVar);
            this.f95929g = interfaceC2395h;
            this.f95930h = requestNotificationsFragment;
            this.f95931i = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = RequestNotificationsFragment.this.new e(this.f95929g, dVar, this.f95930h, this.f95931i);
            eVar.f95927e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95926d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95927e)) {
                    J viewLifecycleOwner = RequestNotificationsFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95929g, null, this.f95930h, this.f95931i);
                    this.f95926d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$onViewCreated$$inlined$observe$5", f = "RequestNotificationsFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95938d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95939e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95941g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ RequestNotificationsFragment f95942h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$onViewCreated$$inlined$observe$5$1", f = "RequestNotificationsFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95943d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95944e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ RequestNotificationsFragment f95945f;

            /* renamed from: ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$f$a$a, reason: collision with other inner class name */
            public static final class C2055a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ RequestNotificationsFragment f95946a;

                public C2055a(RequestNotificationsFragment requestNotificationsFragment) {
                    this.f95946a = requestNotificationsFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C9981c c9981c;
                    ScreenState screenState = (ScreenState) t2;
                    RequestNotificationsFragment requestNotificationsFragment = this.f95946a;
                    C9981c c9981c2 = requestNotificationsFragment.f95895b;
                    if (c9981c2 != null) {
                        c9981c2.f100364e.setVisibility(screenState != null ? 0 : 8);
                    }
                    if (screenState != null && (c9981c = requestNotificationsFragment.f95895b) != null) {
                        c9981c.f100364e.bindState(screenState);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, RequestNotificationsFragment requestNotificationsFragment) {
                super(2, dVar);
                this.f95944e = interfaceC2395h;
                this.f95945f = requestNotificationsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95944e, dVar, this.f95945f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95943d;
                if (i11 == 0) {
                    s.b(obj);
                    C2055a c2055a = new C2055a(this.f95945f);
                    this.f95943d = 1;
                    if (this.f95944e.collect(c2055a, this) == aVar) {
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
        public f(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, RequestNotificationsFragment requestNotificationsFragment) {
            super(2, dVar);
            this.f95941g = interfaceC2395h;
            this.f95942h = requestNotificationsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = RequestNotificationsFragment.this.new f(this.f95941g, dVar, this.f95942h);
            fVar.f95939e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95938d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95939e)) {
                    J viewLifecycleOwner = RequestNotificationsFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95941g, null, this.f95942h);
                    this.f95938d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$onViewCreated$$inlined$observe$6", f = "RequestNotificationsFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95947d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95948e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95950g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ RequestNotificationsFragment f95951h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$onViewCreated$$inlined$observe$6$1", f = "RequestNotificationsFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95952d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95953e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ RequestNotificationsFragment f95954f;

            /* renamed from: ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment$g$a$a, reason: collision with other inner class name */
            public static final class C2056a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ RequestNotificationsFragment f95955a;

                public C2056a(RequestNotificationsFragment requestNotificationsFragment) {
                    this.f95955a = requestNotificationsFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C9981c c9981c;
                    Pair pair = (Pair) t2;
                    if (pair != null && (c9981c = this.f95955a.f95895b) != null) {
                        c9981c.f100362c.bindState((FinLargeButtonState) pair.e());
                        c9981c.f100361b.bindState((FinLargeButtonState) pair.f());
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, RequestNotificationsFragment requestNotificationsFragment) {
                super(2, dVar);
                this.f95953e = interfaceC2395h;
                this.f95954f = requestNotificationsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95953e, dVar, this.f95954f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95952d;
                if (i11 == 0) {
                    s.b(obj);
                    C2056a c2056a = new C2056a(this.f95954f);
                    this.f95952d = 1;
                    if (this.f95953e.collect(c2056a, this) == aVar) {
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
        public g(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, RequestNotificationsFragment requestNotificationsFragment) {
            super(2, dVar);
            this.f95950g = interfaceC2395h;
            this.f95951h = requestNotificationsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = RequestNotificationsFragment.this.new g(this.f95950g, dVar, this.f95951h);
            gVar.f95948e = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95947d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95948e)) {
                    J viewLifecycleOwner = RequestNotificationsFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95950g, null, this.f95951h);
                    this.f95947d = 1;
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

    public static final class h extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return RequestNotificationsFragment.this;
        }
    }

    public static final class i extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f95957b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f95957b = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95957b.invoke();
        }
    }

    public static final class j extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95958b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95958b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95958b.getValue()).getViewModelStore();
        }
    }

    public static final class k extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95959b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95959b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95959b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public RequestNotificationsFragment() {
        C4949a c4949a = new C4949a(this, 2);
        InterfaceC4008j a11 = Sc.k.a(n.NONE, new i(new h()));
        this.f95894a = b0.b(this, kotlin.jvm.internal.N.b(y70.j.class), new j(a11), new k(a11), c4949a);
        this.f95896c = "RequestNotificationsFragment";
        this.f95897d = new a();
    }

    private final y70.j u() {
        return (y70.j) this.f95894a.getValue();
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF96657c() {
        return this.f95896c;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((InterfaceC10268b) O30.a.a(O30.c.a(requireActivity)).a(InterfaceC10268b.class)).W0(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y70.j u11 = u();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("PARAMETER_ICON") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("PARAMETER_TITLE") : null;
        Bundle arguments3 = getArguments();
        u11.m0(requireActivity, string, string2, arguments3 != null ? arguments3.getString("PARAMETER_SUBTITLE") : null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C9981c b11 = C9981c.b(inflater, viewGroup);
        this.f95895b = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f95895b = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onRequestPermissionsResult(int i11, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (permissions.length == 0) {
            return;
        }
        y70.j u11 = u();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        u11.onPermissionResumeOrResult(requireActivity);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        y70.j u11 = u();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        u11.onPermissionResumeOrResult(requireActivity);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.f95897d);
        w0<AbstractC9781a> permissionAction = u().getPermissionAction();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b((C0) permissionAction, null, this), 3);
        x0<String> k02 = u().k0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new c(k02, null, this), 3);
        x0<String> l02 = u().l0();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new d(l02, null, this), 3);
        r activity = getActivity();
        int i11 = (activity != null ? O30.c.a(activity) : null) == O30.b.FINANCE ? R.drawable.fintech_bank_push_permission : R.drawable.fintech_rko_push_permission;
        C9981c c9981c = this.f95895b;
        if (c9981c != null) {
            c9981c.f100363d.setImageResource(i11);
        }
        x0<String> j02 = u().j0();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new e(j02, null, this, i11), 3);
        x0<ScreenState> screenStateFlow = u().getScreenStateFlow();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner6), null, null, new f(screenStateFlow, null, this), 3);
        x0<Pair<FinLargeButtonState, FinLargeButtonState>> i02 = u().i0();
        J viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner7), null, null, new g(i02, null, this), 3);
    }
}
