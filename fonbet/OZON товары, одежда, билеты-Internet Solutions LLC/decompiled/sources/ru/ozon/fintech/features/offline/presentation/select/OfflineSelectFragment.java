package ru.ozon.fintech.features.offline.presentation.select;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Ae.x0;
import Q9.a;
import Sc.C4005g;
import Sc.InterfaceC4008j;
import Sc.s;
import android.content.Context;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.appcompat.widget.AppCompatImageView;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b70.C5580h;
import c70.InterfaceC5760b;
import com.detmir.recycli.adapters.RecyclerAction;
import com.detmir.recycli.adapters.RecyclerAdapter;
import f3.AbstractC6409a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k70.C7600a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l70.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;
import ru.ozon.fintech.ui.input.InfoAction;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import s90.InterfaceC9636e;
import t90.AbstractC9781a;
import u90.C9987a;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/offline/presentation/select/OfflineSelectFragment;", "LE30/c;", "<init>", "()V", "a", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfflineSelectFragment extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f95687a;

    /* renamed from: b, reason: collision with root package name */
    private C5580h f95688b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private a f95689c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f95690d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private b f95691e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f95692f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private d f95693g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private c f95694h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a RUS_NUMBER;
        public static final a TEXT;

        static {
            a aVar = new a("RUS_NUMBER", 0);
            RUS_NUMBER = aVar;
            a aVar2 = new a("TEXT", 1);
            TEXT = aVar2;
            a[] aVarArr = {aVar, aVar2};
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

    public static final class b extends C {
        b() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            OfflineSelectFragment offlineSelectFragment = OfflineSelectFragment.this;
            C5580h c5580h = offlineSelectFragment.f95688b;
            if (c5580h == null || !c5580h.f55650f.close()) {
                offlineSelectFragment.A().A0(false);
            }
        }
    }

    public static final class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            OfflineSelectFragment.this.A().B0(String.valueOf(charSequence));
        }
    }

    public static final class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            C5580h c5580h;
            OzonTextInput inputTextView;
            Editable text;
            OzonTextInput inputTextView2;
            Editable text2;
            OfflineSelectFragment offlineSelectFragment = OfflineSelectFragment.this;
            if (offlineSelectFragment.getF95690d()) {
                return;
            }
            String valueOf = String.valueOf(charSequence);
            a f95689c = offlineSelectFragment.getF95689c();
            a aVar = a.RUS_NUMBER;
            if (f95689c == aVar && valueOf.length() == 0) {
                offlineSelectFragment.D(false);
                return;
            }
            if (offlineSelectFragment.getF95689c() == aVar && valueOf.equals("+")) {
                offlineSelectFragment.D(false);
                return;
            }
            a f95689c2 = offlineSelectFragment.getF95689c();
            a aVar2 = a.TEXT;
            if (f95689c2 == aVar2 && kotlin.text.h.e0(valueOf, "7", false) && valueOf.length() <= 11) {
                offlineSelectFragment.C();
                return;
            }
            if (offlineSelectFragment.getF95689c() == aVar2 && kotlin.text.h.e0(valueOf, "+7", false) && valueOf.length() <= 12) {
                offlineSelectFragment.C();
                return;
            }
            if (offlineSelectFragment.getF95689c() != aVar2 || !kotlin.text.h.e0(valueOf, "8", false) || valueOf.length() > 11) {
                if (offlineSelectFragment.getF95689c() == aVar2 && kotlin.text.h.e0(valueOf, "9", false) && valueOf.length() <= 10) {
                    offlineSelectFragment.C();
                    return;
                }
                return;
            }
            offlineSelectFragment.C();
            offlineSelectFragment.B(true);
            C5580h c5580h2 = offlineSelectFragment.f95688b;
            int length = (c5580h2 == null || (inputTextView2 = c5580h2.f55647c.getInputTextView()) == null || (text2 = inputTextView2.getText()) == null) ? 0 : text2.length();
            if (length > 0 && (c5580h = offlineSelectFragment.f95688b) != null && (inputTextView = c5580h.f55647c.getInputTextView()) != null && (text = inputTextView.getText()) != null) {
                text.delete(length - 1, length);
            }
            offlineSelectFragment.B(false);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$onViewCreated$$inlined$observe$1", f = "OfflineSelectFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95698d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95699e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95701g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OfflineSelectFragment f95702h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$onViewCreated$$inlined$observe$1$1", f = "OfflineSelectFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95703d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95704e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OfflineSelectFragment f95705f;

            /* renamed from: ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$e$a$a, reason: collision with other inner class name */
            public static final class C2038a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OfflineSelectFragment f95706a;

                public C2038a(OfflineSelectFragment offlineSelectFragment) {
                    this.f95706a = offlineSelectFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    AbstractC9781a abstractC9781a = (AbstractC9781a) t2;
                    OfflineSelectFragment offlineSelectFragment = this.f95706a;
                    if (abstractC9781a != null) {
                        if (abstractC9781a instanceof AbstractC9781a.b) {
                            List<InterfaceC9636e> a11 = ((AbstractC9781a.b) abstractC9781a).a();
                            ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
                            Iterator<T> it = a11.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((InterfaceC9636e) it.next()).a());
                            }
                            offlineSelectFragment.requestPermissions((String[]) arrayList.toArray(new String[0]), 9314);
                        } else if (abstractC9781a instanceof AbstractC9781a.C2181a) {
                            offlineSelectFragment.requireContext().startActivity(((AbstractC9781a.C2181a) abstractC9781a).a());
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, OfflineSelectFragment offlineSelectFragment) {
                super(2, dVar);
                this.f95704e = c02;
                this.f95705f = offlineSelectFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95704e, dVar, this.f95705f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95703d;
                if (i11 == 0) {
                    s.b(obj);
                    C2038a c2038a = new C2038a(this.f95705f);
                    this.f95703d = 1;
                    if (this.f95704e.collect(c2038a, this) == aVar) {
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
        public e(C0 c02, kotlin.coroutines.d dVar, OfflineSelectFragment offlineSelectFragment) {
            super(2, dVar);
            this.f95701g = c02;
            this.f95702h = offlineSelectFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = OfflineSelectFragment.this.new e(this.f95701g, dVar, this.f95702h);
            eVar.f95699e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95698d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95699e)) {
                    J viewLifecycleOwner = OfflineSelectFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95701g, null, this.f95702h);
                    this.f95698d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$onViewCreated$$inlined$observe$2", f = "OfflineSelectFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95707d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95708e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95710g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OfflineSelectFragment f95711h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$onViewCreated$$inlined$observe$2$1", f = "OfflineSelectFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95712d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95713e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OfflineSelectFragment f95714f;

            /* renamed from: ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$f$a$a, reason: collision with other inner class name */
            public static final class C2039a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OfflineSelectFragment f95715a;

                public C2039a(OfflineSelectFragment offlineSelectFragment) {
                    this.f95715a = offlineSelectFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    OfflineSelectFragment.x(this.f95715a, (C9987a) t2);
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OfflineSelectFragment offlineSelectFragment) {
                super(2, dVar);
                this.f95713e = interfaceC2395h;
                this.f95714f = offlineSelectFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95713e, dVar, this.f95714f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95712d;
                if (i11 == 0) {
                    s.b(obj);
                    C2039a c2039a = new C2039a(this.f95714f);
                    this.f95712d = 1;
                    if (this.f95713e.collect(c2039a, this) == aVar) {
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
        public f(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OfflineSelectFragment offlineSelectFragment) {
            super(2, dVar);
            this.f95710g = interfaceC2395h;
            this.f95711h = offlineSelectFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = OfflineSelectFragment.this.new f(this.f95710g, dVar, this.f95711h);
            fVar.f95708e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95707d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95708e)) {
                    J viewLifecycleOwner = OfflineSelectFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95710g, null, this.f95711h);
                    this.f95707d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$onViewCreated$$inlined$observe$3", f = "OfflineSelectFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95716d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95717e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95719g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OfflineSelectFragment f95720h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$onViewCreated$$inlined$observe$3$1", f = "OfflineSelectFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95721d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95722e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OfflineSelectFragment f95723f;

            /* renamed from: ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$g$a$a, reason: collision with other inner class name */
            public static final class C2040a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OfflineSelectFragment f95724a;

                public C2040a(OfflineSelectFragment offlineSelectFragment) {
                    this.f95724a = offlineSelectFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    AppCompatImageView firstIconView;
                    l70.c cVar = (l70.c) t2;
                    if (cVar != null) {
                        OfflineSelectFragment offlineSelectFragment = this.f95724a;
                        C5580h c5580h = offlineSelectFragment.f95688b;
                        if (c5580h != null) {
                            c5580h.f55655k.bindState(cVar.c());
                        }
                        C5580h c5580h2 = offlineSelectFragment.f95688b;
                        if (c5580h2 != null) {
                            c5580h2.f55649e.bindState(cVar.a());
                        }
                        C5580h c5580h3 = offlineSelectFragment.f95688b;
                        if (c5580h3 != null) {
                            c5580h3.f55652h.bindState(cVar.b());
                        }
                        C5580h c5580h4 = offlineSelectFragment.f95688b;
                        if (c5580h4 != null) {
                            com.detmir.recycli.adapters.d.a(c5580h4.f55651g, cVar.e());
                        }
                        l70.b d11 = cVar.d();
                        if (d11 instanceof b.C1219b) {
                            C5580h c5580h5 = offlineSelectFragment.f95688b;
                            if (c5580h5 != null) {
                                c5580h5.f55647c.setVisibility(0);
                            }
                            C5580h c5580h6 = offlineSelectFragment.f95688b;
                            if (c5580h6 != null) {
                                c5580h6.f55646b.setVisibility(8);
                            }
                            C5580h c5580h7 = offlineSelectFragment.f95688b;
                            if (c5580h7 != null) {
                                c5580h7.f55654j.setVisibility(8);
                            }
                            C5580h c5580h8 = offlineSelectFragment.f95688b;
                            if (c5580h8 != null) {
                                c5580h8.f55647c.setSecondIconToken(((b.C1219b) cVar.d()).a() ? new Integer(R.drawable.ic_m_phone_scanner_filled) : null);
                            }
                            C5580h c5580h9 = offlineSelectFragment.f95688b;
                            if (c5580h9 != null) {
                                c5580h9.f55647c.setFirstIconToken(null);
                            }
                            C5580h c5580h10 = offlineSelectFragment.f95688b;
                            if (c5580h10 != null) {
                                c5580h10.f55647c.setLabel(((b.C1219b) cVar.d()).b());
                            }
                        } else if (d11 instanceof b.c) {
                            C5580h c5580h11 = offlineSelectFragment.f95688b;
                            if (c5580h11 != null) {
                                c5580h11.f55647c.setVisibility(0);
                            }
                            C5580h c5580h12 = offlineSelectFragment.f95688b;
                            if (c5580h12 != null) {
                                c5580h12.f55646b.setVisibility(8);
                            }
                            C5580h c5580h13 = offlineSelectFragment.f95688b;
                            if (c5580h13 != null) {
                                c5580h13.f55654j.setVisibility(0);
                            }
                            C5580h c5580h14 = offlineSelectFragment.f95688b;
                            if (c5580h14 != null) {
                                c5580h14.f55647c.setInputText(((b.c) cVar.d()).c());
                            }
                            C5580h c5580h15 = offlineSelectFragment.f95688b;
                            if (c5580h15 != null) {
                                c5580h15.f55647c.setLabel(((b.c) cVar.d()).b());
                            }
                            C5580h c5580h16 = offlineSelectFragment.f95688b;
                            if (c5580h16 != null) {
                                c5580h16.f55647c.setSecondIconToken(null);
                            }
                            C5580h c5580h17 = offlineSelectFragment.f95688b;
                            if (c5580h17 != null) {
                                c5580h17.f55647c.setFirstIconToken(((b.c) cVar.d()).a());
                            }
                            C5580h c5580h18 = offlineSelectFragment.f95688b;
                            if (c5580h18 != null && (firstIconView = c5580h18.f55647c.getFirstIconView()) != null) {
                                firstIconView.setColorFilter((ColorFilter) null);
                            }
                        } else if (d11 instanceof b.a) {
                            C5580h c5580h19 = offlineSelectFragment.f95688b;
                            if (c5580h19 != null) {
                                c5580h19.f55647c.setVisibility(8);
                            }
                            C5580h c5580h20 = offlineSelectFragment.f95688b;
                            if (c5580h20 != null) {
                                c5580h20.f55646b.setVisibility(0);
                            }
                            C5580h c5580h21 = offlineSelectFragment.f95688b;
                            if (c5580h21 != null) {
                                c5580h21.f55654j.setVisibility(0);
                            }
                            C5580h c5580h22 = offlineSelectFragment.f95688b;
                            if (c5580h22 != null) {
                                c5580h22.f55646b.setLabel(((b.a) cVar.d()).a());
                            }
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OfflineSelectFragment offlineSelectFragment) {
                super(2, dVar);
                this.f95722e = interfaceC2395h;
                this.f95723f = offlineSelectFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95722e, dVar, this.f95723f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95721d;
                if (i11 == 0) {
                    s.b(obj);
                    C2040a c2040a = new C2040a(this.f95723f);
                    this.f95721d = 1;
                    if (this.f95722e.collect(c2040a, this) == aVar) {
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
        public g(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OfflineSelectFragment offlineSelectFragment) {
            super(2, dVar);
            this.f95719g = interfaceC2395h;
            this.f95720h = offlineSelectFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = OfflineSelectFragment.this.new g(this.f95719g, dVar, this.f95720h);
            gVar.f95717e = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95716d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95717e)) {
                    J viewLifecycleOwner = OfflineSelectFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95719g, null, this.f95720h);
                    this.f95716d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$onViewCreated$$inlined$observe$4", f = "OfflineSelectFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95725d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95726e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95728g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OfflineSelectFragment f95729h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$onViewCreated$$inlined$observe$4$1", f = "OfflineSelectFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95730d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95731e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OfflineSelectFragment f95732f;

            /* renamed from: ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$h$a$a, reason: collision with other inner class name */
            public static final class C2041a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OfflineSelectFragment f95733a;

                public C2041a(OfflineSelectFragment offlineSelectFragment) {
                    this.f95733a = offlineSelectFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ((Boolean) t2).getClass();
                    C5580h c5580h = this.f95733a.f95688b;
                    RecyclerView.g adapter = c5580h != null ? c5580h.f55651g.getAdapter() : null;
                    Intrinsics.g(adapter, "null cannot be cast to non-null type com.detmir.recycli.adapters.RecyclerAdapter");
                    ((RecyclerAdapter) adapter).bindAction(new RecyclerAction.b(false));
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, OfflineSelectFragment offlineSelectFragment) {
                super(2, dVar);
                this.f95731e = c02;
                this.f95732f = offlineSelectFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95731e, dVar, this.f95732f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95730d;
                if (i11 == 0) {
                    s.b(obj);
                    C2041a c2041a = new C2041a(this.f95732f);
                    this.f95730d = 1;
                    if (this.f95731e.collect(c2041a, this) == aVar) {
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
        public h(C0 c02, kotlin.coroutines.d dVar, OfflineSelectFragment offlineSelectFragment) {
            super(2, dVar);
            this.f95728g = c02;
            this.f95729h = offlineSelectFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = OfflineSelectFragment.this.new h(this.f95728g, dVar, this.f95729h);
            hVar.f95726e = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95725d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95726e)) {
                    J viewLifecycleOwner = OfflineSelectFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95728g, null, this.f95729h);
                    this.f95725d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$onViewCreated$$inlined$observe$5", f = "OfflineSelectFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95734d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95735e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95737g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OfflineSelectFragment f95738h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$onViewCreated$$inlined$observe$5$1", f = "OfflineSelectFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95739d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95740e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OfflineSelectFragment f95741f;

            /* renamed from: ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$i$a$a, reason: collision with other inner class name */
            public static final class C2042a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OfflineSelectFragment f95742a;

                public C2042a(OfflineSelectFragment offlineSelectFragment) {
                    this.f95742a = offlineSelectFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    OzonTextInput inputTextView;
                    ((Boolean) t2).getClass();
                    OfflineSelectFragment offlineSelectFragment = this.f95742a;
                    C5580h c5580h = offlineSelectFragment.f95688b;
                    if (c5580h != null && (inputTextView = c5580h.f55646b.getInputTextView()) != null) {
                        inputTextView.requestFocus();
                    }
                    r activity = offlineSelectFragment.getActivity();
                    androidx.appcompat.app.g gVar = activity instanceof androidx.appcompat.app.g ? (androidx.appcompat.app.g) activity : null;
                    if (gVar != null) {
                        H30.m.c(gVar);
                    }
                    H30.k.a(k.f95746a);
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, OfflineSelectFragment offlineSelectFragment) {
                super(2, dVar);
                this.f95740e = c02;
                this.f95741f = offlineSelectFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95740e, dVar, this.f95741f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95739d;
                if (i11 == 0) {
                    s.b(obj);
                    C2042a c2042a = new C2042a(this.f95741f);
                    this.f95739d = 1;
                    if (this.f95740e.collect(c2042a, this) == aVar) {
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
        public i(C0 c02, kotlin.coroutines.d dVar, OfflineSelectFragment offlineSelectFragment) {
            super(2, dVar);
            this.f95737g = c02;
            this.f95738h = offlineSelectFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = OfflineSelectFragment.this.new i(this.f95737g, dVar, this.f95738h);
            iVar.f95735e = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95734d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95735e)) {
                    J viewLifecycleOwner = OfflineSelectFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95737g, null, this.f95738h);
                    this.f95734d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment$onViewCreated$1", f = "OfflineSelectFragment.kt", l = {183}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95743d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OfflineSelectFragment f95745a;

            a(OfflineSelectFragment offlineSelectFragment) {
                this.f95745a = offlineSelectFragment;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                OzonTextInput inputTextView;
                String str = (String) obj;
                OfflineSelectFragment offlineSelectFragment = this.f95745a;
                C5580h c5580h = offlineSelectFragment.f95688b;
                if (c5580h != null) {
                    c5580h.f55647c.setInputText(str);
                }
                C5580h c5580h2 = offlineSelectFragment.f95688b;
                if (c5580h2 != null && (inputTextView = c5580h2.f55647c.getInputTextView()) != null) {
                    inputTextView.requestFocus();
                }
                return Unit.f71690a;
            }
        }

        j(kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return OfflineSelectFragment.this.new j(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95743d;
            if (i11 == 0) {
                s.b(obj);
                OfflineSelectFragment offlineSelectFragment = OfflineSelectFragment.this;
                C0 w02 = offlineSelectFragment.A().w0();
                a aVar2 = new a(offlineSelectFragment);
                this.f95743d = 1;
                if (w02.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }
    }

    static final class k implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f95746a = new k();

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.f71690a;
        }
    }

    public static final class l implements a.InterfaceC0452a {
        l() {
        }

        @Override // Q9.a.InterfaceC0452a
        public final void a(String extractedValue, String formattedValue, String tailPlaceholder) {
            Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
            Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
            Intrinsics.checkNotNullParameter(tailPlaceholder, "tailPlaceholder");
            OfflineSelectFragment offlineSelectFragment = OfflineSelectFragment.this;
            if (offlineSelectFragment.getF95690d()) {
                return;
            }
            Intrinsics.checkNotNullParameter(extractedValue, "<set-?>");
            Intrinsics.checkNotNullParameter(formattedValue, "<set-?>");
            Intrinsics.checkNotNullParameter(tailPlaceholder, "<set-?>");
            offlineSelectFragment.A().C0(extractedValue, formattedValue, offlineSelectFragment.getF95689c());
        }
    }

    public static final class m extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return OfflineSelectFragment.this;
        }
    }

    public static final class n extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f95749b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.f95749b = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95749b.invoke();
        }
    }

    public static final class o extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95750b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95750b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95750b.getValue()).getViewModelStore();
        }
    }

    public static final class p extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95751b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95751b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95751b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public OfflineSelectFragment() {
        D90.a aVar = new D90.a(this, 3);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new n(new m()));
        this.f95687a = b0.b(this, kotlin.jvm.internal.N.b(ru.ozon.fintech.features.offline.presentation.select.a.class), new o(a11), new p(a11), aVar);
        this.f95689c = a.TEXT;
        this.f95691e = new b();
        this.f95692f = "OfflineSelectFragment";
        this.f95693g = new d();
        this.f95694h = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.ozon.fintech.features.offline.presentation.select.a A() {
        return (ru.ozon.fintech.features.offline.presentation.select.a) this.f95687a.getValue();
    }

    public static Unit t(OfflineSelectFragment offlineSelectFragment) {
        offlineSelectFragment.A().z0();
        return Unit.f71690a;
    }

    public static Unit u(OfflineSelectFragment offlineSelectFragment, InfoAction it) {
        OzonTextInput inputTextView;
        Intrinsics.checkNotNullParameter(it, "it");
        C5580h c5580h = offlineSelectFragment.f95688b;
        if (c5580h != null && (inputTextView = c5580h.f55647c.getInputTextView()) != null) {
            inputTextView.requestFocus();
        }
        r activity = offlineSelectFragment.getActivity();
        androidx.appcompat.app.g gVar = activity instanceof androidx.appcompat.app.g ? (androidx.appcompat.app.g) activity : null;
        if (gVar != null) {
            H30.m.c(gVar);
        }
        return Unit.f71690a;
    }

    public static final void x(OfflineSelectFragment offlineSelectFragment, C9987a c9987a) {
        C5580h c5580h = offlineSelectFragment.f95688b;
        if (c5580h != null) {
            PermissionsScreenStateView permissionsScreenStateView = c5580h.f55650f;
            permissionsScreenStateView.setVisibility(c9987a != null ? 0 : 8);
            if (c9987a == null) {
                permissionsScreenStateView.close();
            } else {
                permissionsScreenStateView.c(c9987a);
                permissionsScreenStateView.expand();
            }
        }
    }

    public final void B(boolean z11) {
        this.f95690d = z11;
    }

    public final void C() {
        InputView inputView;
        a aVar = this.f95689c;
        a aVar2 = a.RUS_NUMBER;
        if (aVar != aVar2) {
            this.f95689c = aVar2;
            C5580h c5580h = this.f95688b;
            if (c5580h == null || (inputView = c5580h.f55647c) == null) {
                return;
            }
            inputView.setInputMask("+7 ([000]) [000] [00] [00]");
        }
    }

    public final void D(boolean z11) {
        a aVar = this.f95689c;
        a aVar2 = a.TEXT;
        if (aVar != aVar2 || z11) {
            this.f95689c = aVar2;
            C5580h c5580h = this.f95688b;
            if (c5580h != null) {
                c5580h.f55647c.setInputMask("[F…]");
            }
        }
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF95676e() {
        return this.f95692f;
    }

    @Override // E30.c
    /* renamed from: isNeedSendOnCreateAnalytic */
    public final boolean getIsNeedSendOnCreateAnalytic() {
        return false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((InterfaceC5760b) O30.a.a(O30.c.a(requireActivity)).a(U60.a.class)).v1(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            A().D0(getUniqueUuid());
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C5580h b11 = C5580h.b(inflater, viewGroup);
        b11.f55646b.getInputTextView().setSaveEnabled(false);
        b11.f55647c.getInputTextView().setSaveEnabled(false);
        this.f95688b = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f95691e.remove();
        this.f95688b = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        ru.ozon.fintech.features.offline.presentation.select.a A11 = A();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        A11.onPermissionResumeOrResult(requireActivity);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        A().onStart();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        A().onStop();
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        OzonTextInput inputTextView;
        OzonTextInput inputTextView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new j(null), 3);
        C5580h c5580h = this.f95688b;
        if (c5580h != null) {
            c5580h.f55647c.setAllowInputClearWhenInactive(true);
        }
        C5580h c5580h2 = this.f95688b;
        if (c5580h2 != null) {
            c5580h2.f55647c.setInfoActionClickListener(new A90.f(this, 1));
        }
        C5580h c5580h3 = this.f95688b;
        if (c5580h3 != null) {
            c5580h3.f55651g.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        C5580h c5580h4 = this.f95688b;
        if (c5580h4 != null) {
            H30.r.a(c5580h4.f55651g);
        }
        w0<AbstractC9781a> permissionAction = A().getPermissionAction();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new e((C0) permissionAction, null, this), 3);
        x0<C9987a> permissionScreenState = A().getPermissionScreenState();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new f(permissionScreenState, null, this), 3);
        x0<l70.c> v02 = A().v0();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new g(v02, null, this), 3);
        C0 y02 = A().y0();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new h(y02, null, this), 3);
        C0 x02 = A().x0();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner6), null, null, new i(x02, null, this), 3);
        C5580h c5580h5 = this.f95688b;
        if (c5580h5 != null) {
            c5580h5.f55647c.setMaskValueListener(new l());
        }
        C5580h c5580h6 = this.f95688b;
        if (c5580h6 != null && (inputTextView2 = c5580h6.f55647c.getInputTextView()) != null) {
            inputTextView2.addTextChangedListener(this.f95693g);
        }
        C5580h c5580h7 = this.f95688b;
        if (c5580h7 != null) {
            c5580h7.f55647c.setLabelPosition(InputView.LabelPosition.INSIDE);
        }
        C5580h c5580h8 = this.f95688b;
        if (c5580h8 != null) {
            c5580h8.f55647c.setSecondIconClickListener(new C7600a(this, 0));
        }
        C5580h c5580h9 = this.f95688b;
        if (c5580h9 != null && (inputTextView = c5580h9.f55646b.getInputTextView()) != null) {
            inputTextView.addTextChangedListener(this.f95694h);
        }
        C5580h c5580h10 = this.f95688b;
        if (c5580h10 != null) {
            c5580h10.f55646b.setLabelPosition(InputView.LabelPosition.INSIDE);
        }
        D(true);
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner7, this.f95691e);
        A().E0();
    }

    @NotNull
    /* renamed from: y, reason: from getter */
    public final a getF95689c() {
        return this.f95689c;
    }

    /* renamed from: z, reason: from getter */
    public final boolean getF95690d() {
        return this.f95690d;
    }
}
