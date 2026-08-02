package ru.ozon.fintech.preferences.presentation.logcat;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Sc.InterfaceC4008j;
import Sc.n;
import Sc.s;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import h3.C6788a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import s90.InterfaceC9636e;
import t90.AbstractC9781a;
import u90.C9987a;
import v90.k;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/preferences/presentation/logcat/FintechLogCatFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechLogCatFragment extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private k f96770a;

    /* renamed from: b, reason: collision with root package name */
    public z0.b f96771b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f96772c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private a f96773d;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            FintechLogCatFragment fintechLogCatFragment = FintechLogCatFragment.this;
            k kVar = fintechLogCatFragment.f96770a;
            if (kVar == null || !kVar.f102694c.close()) {
                fintechLogCatFragment.y().l0();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$onViewCreated$$inlined$observe$1", f = "FintechLogCatFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96775d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96776e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96778g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechLogCatFragment f96779h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$onViewCreated$$inlined$observe$1$1", f = "FintechLogCatFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96780d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96781e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechLogCatFragment f96782f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2113a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechLogCatFragment f96783a;

                public C2113a(FintechLogCatFragment fintechLogCatFragment) {
                    this.f96783a = fintechLogCatFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    FintechLogCatFragment fintechLogCatFragment = this.f96783a;
                    fintechLogCatFragment.startActivity(Intent.createChooser((Intent) t2, fintechLogCatFragment.requireContext().getString(R.string.fintech_preference_share_chooser_text)));
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, FintechLogCatFragment fintechLogCatFragment) {
                super(2, dVar);
                this.f96781e = c02;
                this.f96782f = fintechLogCatFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96781e, dVar, this.f96782f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96780d;
                if (i11 == 0) {
                    s.b(obj);
                    C2113a c2113a = new C2113a(this.f96782f);
                    this.f96780d = 1;
                    if (this.f96781e.collect(c2113a, this) == aVar) {
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
        public b(C0 c02, kotlin.coroutines.d dVar, FintechLogCatFragment fintechLogCatFragment) {
            super(2, dVar);
            this.f96778g = c02;
            this.f96779h = fintechLogCatFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = FintechLogCatFragment.this.new b(this.f96778g, dVar, this.f96779h);
            bVar.f96776e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96775d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96776e)) {
                    J viewLifecycleOwner = FintechLogCatFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96778g, null, this.f96779h);
                    this.f96775d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$onViewCreated$$inlined$observe$2", f = "FintechLogCatFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96784d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96785e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96787g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechLogCatFragment f96788h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$onViewCreated$$inlined$observe$2$1", f = "FintechLogCatFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96789d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96790e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechLogCatFragment f96791f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2114a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechLogCatFragment f96792a;

                public C2114a(FintechLogCatFragment fintechLogCatFragment) {
                    this.f96792a = fintechLogCatFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    k kVar;
                    String str = (String) t2;
                    if (str != null && str.length() != 0 && (kVar = this.f96792a.f96770a) != null) {
                        kVar.f102698g.setText(str);
                        kVar.f102696e.setRefreshing(false);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechLogCatFragment fintechLogCatFragment) {
                super(2, dVar);
                this.f96790e = interfaceC2395h;
                this.f96791f = fintechLogCatFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96790e, dVar, this.f96791f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96789d;
                if (i11 == 0) {
                    s.b(obj);
                    C2114a c2114a = new C2114a(this.f96791f);
                    this.f96789d = 1;
                    if (this.f96790e.collect(c2114a, this) == aVar) {
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
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechLogCatFragment fintechLogCatFragment) {
            super(2, dVar);
            this.f96787g = interfaceC2395h;
            this.f96788h = fintechLogCatFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = FintechLogCatFragment.this.new c(this.f96787g, dVar, this.f96788h);
            cVar.f96785e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96784d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96785e)) {
                    J viewLifecycleOwner = FintechLogCatFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96787g, null, this.f96788h);
                    this.f96784d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$onViewCreated$$inlined$observe$3", f = "FintechLogCatFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96793d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96794e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96796g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechLogCatFragment f96797h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$onViewCreated$$inlined$observe$3$1", f = "FintechLogCatFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96798d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96799e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechLogCatFragment f96800f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$d$a$a, reason: collision with other inner class name */
            public static final class C2115a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechLogCatFragment f96801a;

                public C2115a(FintechLogCatFragment fintechLogCatFragment) {
                    this.f96801a = fintechLogCatFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C9987a c9987a = (C9987a) t2;
                    k kVar = this.f96801a.f96770a;
                    if (kVar != null) {
                        PermissionsScreenStateView permissionsScreenStateView = kVar.f102694c;
                        permissionsScreenStateView.setVisibility(c9987a != null ? 0 : 8);
                        if (c9987a != null) {
                            permissionsScreenStateView.c(c9987a);
                        } else {
                            permissionsScreenStateView.close();
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechLogCatFragment fintechLogCatFragment) {
                super(2, dVar);
                this.f96799e = interfaceC2395h;
                this.f96800f = fintechLogCatFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96799e, dVar, this.f96800f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96798d;
                if (i11 == 0) {
                    s.b(obj);
                    C2115a c2115a = new C2115a(this.f96800f);
                    this.f96798d = 1;
                    if (this.f96799e.collect(c2115a, this) == aVar) {
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
        public d(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechLogCatFragment fintechLogCatFragment) {
            super(2, dVar);
            this.f96796g = interfaceC2395h;
            this.f96797h = fintechLogCatFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = FintechLogCatFragment.this.new d(this.f96796g, dVar, this.f96797h);
            dVar2.f96794e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96793d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96794e)) {
                    J viewLifecycleOwner = FintechLogCatFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96796g, null, this.f96797h);
                    this.f96793d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$onViewCreated$$inlined$observe$4", f = "FintechLogCatFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96802d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96803e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96805g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechLogCatFragment f96806h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$onViewCreated$$inlined$observe$4$1", f = "FintechLogCatFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96807d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96808e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechLogCatFragment f96809f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$e$a$a, reason: collision with other inner class name */
            public static final class C2116a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechLogCatFragment f96810a;

                public C2116a(FintechLogCatFragment fintechLogCatFragment) {
                    this.f96810a = fintechLogCatFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    AbstractC9781a abstractC9781a = (AbstractC9781a) t2;
                    if (abstractC9781a != null) {
                        boolean z11 = abstractC9781a instanceof AbstractC9781a.b;
                        FintechLogCatFragment fintechLogCatFragment = this.f96810a;
                        if (z11) {
                            List<InterfaceC9636e> a11 = ((AbstractC9781a.b) abstractC9781a).a();
                            ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
                            Iterator<T> it = a11.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((InterfaceC9636e) it.next()).a());
                            }
                            fintechLogCatFragment.requestPermissions((String[]) arrayList.toArray(new String[0]), 9314);
                        } else if (abstractC9781a instanceof AbstractC9781a.C2181a) {
                            fintechLogCatFragment.requireContext().startActivity(((AbstractC9781a.C2181a) abstractC9781a).a());
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, FintechLogCatFragment fintechLogCatFragment) {
                super(2, dVar);
                this.f96808e = c02;
                this.f96809f = fintechLogCatFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96808e, dVar, this.f96809f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96807d;
                if (i11 == 0) {
                    s.b(obj);
                    C2116a c2116a = new C2116a(this.f96809f);
                    this.f96807d = 1;
                    if (this.f96808e.collect(c2116a, this) == aVar) {
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
        public e(C0 c02, kotlin.coroutines.d dVar, FintechLogCatFragment fintechLogCatFragment) {
            super(2, dVar);
            this.f96805g = c02;
            this.f96806h = fintechLogCatFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = FintechLogCatFragment.this.new e(this.f96805g, dVar, this.f96806h);
            eVar.f96803e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96802d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96803e)) {
                    J viewLifecycleOwner = FintechLogCatFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96805g, null, this.f96806h);
                    this.f96802d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$onViewCreated$$inlined$observe$5", f = "FintechLogCatFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96811d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96812e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96814g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechLogCatFragment f96815h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$onViewCreated$$inlined$observe$5$1", f = "FintechLogCatFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96816d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96817e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechLogCatFragment f96818f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment$f$a$a, reason: collision with other inner class name */
            public static final class C2117a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechLogCatFragment f96819a;

                public C2117a(FintechLogCatFragment fintechLogCatFragment) {
                    this.f96819a = fintechLogCatFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    k kVar;
                    ScreenState screenState = (ScreenState) t2;
                    FintechLogCatFragment fintechLogCatFragment = this.f96819a;
                    k kVar2 = fintechLogCatFragment.f96770a;
                    if (kVar2 != null) {
                        kVar2.f102695d.setVisibility(screenState != null ? 0 : 8);
                    }
                    if (screenState != null && (kVar = fintechLogCatFragment.f96770a) != null) {
                        kVar.f102695d.bindState(screenState);
                    }
                    k kVar3 = fintechLogCatFragment.f96770a;
                    if (kVar3 != null) {
                        kVar3.f102696e.setRefreshing(screenState instanceof ScreenState.Progress);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechLogCatFragment fintechLogCatFragment) {
                super(2, dVar);
                this.f96817e = interfaceC2395h;
                this.f96818f = fintechLogCatFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96817e, dVar, this.f96818f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96816d;
                if (i11 == 0) {
                    s.b(obj);
                    C2117a c2117a = new C2117a(this.f96818f);
                    this.f96816d = 1;
                    if (this.f96817e.collect(c2117a, this) == aVar) {
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
        public f(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechLogCatFragment fintechLogCatFragment) {
            super(2, dVar);
            this.f96814g = interfaceC2395h;
            this.f96815h = fintechLogCatFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = FintechLogCatFragment.this.new f(this.f96814g, dVar, this.f96815h);
            fVar.f96812e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96811d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96812e)) {
                    J viewLifecycleOwner = FintechLogCatFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96814g, null, this.f96815h);
                    this.f96811d = 1;
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

    public static final class g extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return FintechLogCatFragment.this;
        }
    }

    public static final class h extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f96821b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f96821b = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96821b.invoke();
        }
    }

    public static final class i extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96822b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96822b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96822b.getValue()).getViewModelStore();
        }
    }

    public static final class j extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96823b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96823b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96823b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public FintechLogCatFragment() {
        C90.a aVar = new C90.a(this, 0);
        InterfaceC4008j a11 = Sc.k.a(n.NONE, new h(new g()));
        this.f96772c = b0.b(this, kotlin.jvm.internal.N.b(ru.ozon.fintech.preferences.presentation.logcat.b.class), new i(a11), new j(a11), aVar);
        this.f96773d = new a();
    }

    public static Unit t(FintechLogCatFragment fintechLogCatFragment, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.download_item) {
            ru.ozon.fintech.preferences.presentation.logcat.b y11 = fintechLogCatFragment.y();
            r requireActivity = fintechLogCatFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            y11.h0(requireActivity);
        } else if (itemId == R.id.share_item) {
            fintechLogCatFragment.y().m0();
        }
        return Unit.f71690a;
    }

    public static void u(FintechLogCatFragment fintechLogCatFragment) {
        ru.ozon.fintech.preferences.presentation.logcat.b y11 = fintechLogCatFragment.y();
        y11.getClass();
        C6788a a11 = x0.a(y11);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new ru.ozon.fintech.preferences.presentation.logcat.d(y11, null), 2);
    }

    public static Unit v(FintechLogCatFragment fintechLogCatFragment) {
        fintechLogCatFragment.y().getClass();
        L80.c d11 = L80.a.d();
        if (d11 != null) {
            d11.e();
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.ozon.fintech.preferences.presentation.logcat.b y() {
        return (ru.ozon.fintech.preferences.presentation.logcat.b) this.f96772c.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((w90.b) O30.a.a(O30.c.a(requireActivity)).a(w90.b.class)).v(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getResources().getInteger(android.R.integer.config_shortAnimTime);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        k b11 = k.b(inflater, viewGroup);
        this.f96770a = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onRequestPermissionsResult(int i11, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (permissions.length == 0) {
            return;
        }
        ru.ozon.fintech.preferences.presentation.logcat.b y11 = y();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        y11.onPermissionResumeOrResult(requireActivity);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        ru.ozon.fintech.preferences.presentation.logcat.b y11 = y();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        y11.onPermissionResumeOrResult(requireActivity);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.f96773d);
        k kVar = this.f96770a;
        if (kVar != null) {
            FinLargeButtonView finLargeButtonView = kVar.f102693b;
            String string = finLargeButtonView.getResources().getString(R.string.fintech_preference_clear_button_text);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            finLargeButtonView.bindState(new FinLargeButtonState("clear_logs", string, new C90.b(this, 0), null, null, null, null, null, null, 504, null));
            kVar.f102696e.setOnRefreshListener(new C90.c(this));
            String string2 = getString(R.string.fintech_ui_log_toolbar_title);
            y().getClass();
            kVar.f102697f.bindState(new FinToolbarState(string2, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(!Intrinsics.d(Build.MANUFACTURER, "Xiaomi") ? R.menu.download_menu : R.menu.share_menu), null, null, new C90.d(this, 0), 17, 28670, null));
        }
        C0 k02 = y().k0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(k02, null, this), 3);
        Ae.x0<String> i02 = y().i0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new c(i02, null, this), 3);
        Ae.x0<C9987a> permissionScreenState = y().getPermissionScreenState();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new d(permissionScreenState, null, this), 3);
        w0<AbstractC9781a> permissionAction = y().getPermissionAction();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new e((C0) permissionAction, null, this), 3);
        Ae.x0<ScreenState> j02 = y().j0();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner6), null, null, new f(j02, null, this), 3);
    }
}
