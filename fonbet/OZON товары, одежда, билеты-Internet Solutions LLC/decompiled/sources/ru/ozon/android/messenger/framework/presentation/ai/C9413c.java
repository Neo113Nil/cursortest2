package ru.ozon.android.messenger.framework.presentation.ai;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.C3969l;
import S0.InterfaceC3967k;
import Sc.C4005g;
import Sc.InterfaceC4008j;
import a1.C4912a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5336p0;
import androidx.core.view.C5353y0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.common.SquircleLinearLayout;
import ru.ozon.android.messenger.blocks.snackbar.SnackbarVO;
import ru.ozon.android.messenger.framework.di.InterfaceC9376a;
import ru.ozon.android.messenger.framework.presentation.ai.Y;
import ru.ozon.android.messenger.framework.presentation.ai.delegates.a;
import ru.ozon.android.messenger.framework.presentation.common.notification.g;
import ru.ozon.android.messenger.framework.presentation.common.notification.j;
import ru.ozon.android.messenger.utils.m;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.databinding.MFragmentAiAssistantBinding;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u0018\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/ai/c;", "Lru/ozon/android/messenger/framework/presentation/common/screen/i;", "Lru/ozon/app/android/messenger/databinding/MFragmentAiAssistantBinding;", "Lru/ozon/android/messenger/framework/presentation/ai/J0;", "<init>", "()V", "LZ1/h;", "topHeight", "bottomHeight", "Lkotlin/Pair;", "topToBottom", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9413c extends ru.ozon.android.messenger.framework.presentation.common.screen.i<MFragmentAiAssistantBinding> implements J0 {

    /* renamed from: c, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.data.b f89419c;

    /* renamed from: d, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.controller.a f89420d;

    /* renamed from: e, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.core.initialization.d f89421e;

    /* renamed from: f, reason: collision with root package name */
    public g.a f89422f;

    /* renamed from: g, reason: collision with root package name */
    public j.a f89423g;

    /* renamed from: h, reason: collision with root package name */
    private K0 f89424h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f89425i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.y0 f89426j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.y0 f89427k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.y0 f89428l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f89429m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private List<ru.ozon.android.messenger.framework.presentation.models.q> f89430n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f89431o;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$a */
    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MFragmentAiAssistantBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f89432a = new a(3, MFragmentAiAssistantBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MFragmentAiAssistantBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MFragmentAiAssistantBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MFragmentAiAssistantBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$b */
    static final class b extends AbstractC7737t implements Function0<androidx.lifecycle.B0> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.B0 invoke() {
            ComponentCallbacksC5392m requireParentFragment = C9413c.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
            return requireParentFragment;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantFragment$onViewCreated$1", f = "AiAssistantFragment.kt", l = {195}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$c, reason: collision with other inner class name */
    static final class C1648c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f89434d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantFragment$onViewCreated$1$1", f = "AiAssistantFragment.kt", l = {198}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f89436d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C9413c f89437e;

            /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$c$a$a, reason: collision with other inner class name */
            static final class C1649a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C9413c f89438a;

                C1649a(C9413c c9413c) {
                    this.f89438a = c9413c;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    FrameLayout constraintLayout = C9413c.y(this.f89438a).progressBar.getConstraintLayout();
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                    ru.ozon.android.messenger.utils.view.s.e(constraintLayout, Boolean.valueOf(((ru.ozon.android.messenger.framework.presentation.common.screen.l) obj).b()));
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C9413c c9413c, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f89437e = c9413c;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f89437e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f89436d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C9413c c9413c = this.f89437e;
                    InterfaceC2395h o11 = C2399j.o(C9413c.A(c9413c).getLoader());
                    C1649a c1649a = new C1649a(c9413c);
                    this.f89436d = 1;
                    if (o11.collect(c1649a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        C1648c(kotlin.coroutines.d<? super C1648c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9413c.this.new C1648c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1648c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f89434d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9413c c9413c = C9413c.this;
                androidx.lifecycle.J viewLifecycleOwner = c9413c.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(c9413c, null);
                this.f89434d = 1;
                if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantFragment$onViewCreated$2", f = "AiAssistantFragment.kt", l = {205}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$d */
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f89439d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89441f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantFragment$onViewCreated$2$1", f = "AiAssistantFragment.kt", l = {208}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f89442d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C9413c f89443e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89444f;

            /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$d$a$a, reason: collision with other inner class name */
            static final class C1650a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C9413c f89445a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89446b;

                C1650a(C9413c c9413c, ru.ozon.android.messenger.framework.core.d dVar) {
                    this.f89445a = c9413c;
                    this.f89446b = dVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    C9413c.B(this.f89445a, this.f89446b, (List) obj);
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C9413c c9413c, ru.ozon.android.messenger.framework.core.d dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(2, dVar2);
                this.f89443e = c9413c;
                this.f89444f = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f89443e, this.f89444f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f89442d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C9413c c9413c = this.f89443e;
                    Ae.M0<W> M02 = C9413c.A(c9413c).M0();
                    C1650a c1650a = new C1650a(c9413c, this.f89444f);
                    this.f89442d = 1;
                    Object collect = M02.collect(new C9427j(c1650a), this);
                    if (collect != obj2) {
                        collect = Unit.f71690a;
                    }
                    if (collect == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ru.ozon.android.messenger.framework.core.d dVar, kotlin.coroutines.d<? super d> dVar2) {
            super(2, dVar2);
            this.f89441f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9413c.this.new d(this.f89441f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f89439d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9413c c9413c = C9413c.this;
                androidx.lifecycle.J viewLifecycleOwner = c9413c.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(c9413c, this.f89441f, null);
                this.f89439d = 1;
                if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantFragment$onViewCreated$3", f = "AiAssistantFragment.kt", l = {218}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$e */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f89447d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89449f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantFragment$onViewCreated$3$1", f = "AiAssistantFragment.kt", l = {220}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$e$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f89450d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C9413c f89451e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89452f;

            /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$e$a$a, reason: collision with other inner class name */
            static final class C1651a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C9413c f89453a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89454b;

                C1651a(C9413c c9413c, ru.ozon.android.messenger.framework.core.d dVar) {
                    this.f89453a = c9413c;
                    this.f89454b = dVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    Y y11 = (Y) obj;
                    boolean d11 = Intrinsics.d(y11, Y.a.f89404a);
                    C9413c c9413c = this.f89453a;
                    if (d11) {
                        c9413c.requireActivity().getOnBackPressedDispatcher().l();
                    } else if (Intrinsics.d(y11, Y.c.f89406a)) {
                        C9413c.B(c9413c, this.f89454b, C9413c.A(c9413c).M0().getValue().c());
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C9413c c9413c, ru.ozon.android.messenger.framework.core.d dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(2, dVar2);
                this.f89451e = c9413c;
                this.f89452f = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f89451e, this.f89452f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f89450d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C9413c c9413c = this.f89451e;
                    InterfaceC2395h<Y> K02 = C9413c.A(c9413c).K0();
                    C1651a c1651a = new C1651a(c9413c, this.f89452f);
                    this.f89450d = 1;
                    if (K02.collect(c1651a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ru.ozon.android.messenger.framework.core.d dVar, kotlin.coroutines.d<? super e> dVar2) {
            super(2, dVar2);
            this.f89449f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9413c.this.new e(this.f89449f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f89447d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9413c c9413c = C9413c.this;
                androidx.lifecycle.J viewLifecycleOwner = c9413c.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(c9413c, this.f89449f, null);
                this.f89447d = 1;
                if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantFragment$onViewCreated$4", f = "AiAssistantFragment.kt", l = {239}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$f */
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f89455d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantFragment$onViewCreated$4$1", f = "AiAssistantFragment.kt", l = {241}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$f$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f89457d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C9413c f89458e;

            /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$f$a$a, reason: collision with other inner class name */
            static final class C1652a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C9413c f89459a;

                /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$f$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C1653a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f89460a;

                    static {
                        int[] iArr = new int[a.EnumC1654a.values().length];
                        try {
                            iArr[a.EnumC1654a.CONVERSATION.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[a.EnumC1654a.EMPTY_STATE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        f89460a = iArr;
                    }
                }

                C1652a(C9413c c9413c) {
                    this.f89459a = c9413c;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    int i11;
                    ru.ozon.android.messenger.framework.presentation.ai.delegates.a b11 = ((W) obj).b();
                    a.EnumC1654a a11 = b11 != null ? b11.a() : null;
                    int i12 = a11 == null ? -1 : C1653a.f89460a[a11.ordinal()];
                    C9413c c9413c = this.f89459a;
                    if (i12 != -1) {
                        if (i12 == 1) {
                            Context requireContext = c9413c.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            i11 = ThemeExtKt.themeColor(requireContext, R$attr.layerFloor1);
                            C9413c.z(c9413c).a(i11);
                            return Unit.f71690a;
                        }
                        if (i12 != 2) {
                            throw new Sc.o();
                        }
                    }
                    i11 = 0;
                    C9413c.z(c9413c).a(i11);
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C9413c c9413c, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f89458e = c9413c;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f89458e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f89457d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C9413c c9413c = this.f89458e;
                    Ae.M0<W> M02 = C9413c.A(c9413c).M0();
                    C1652a c1652a = new C1652a(c9413c);
                    this.f89457d = 1;
                    if (M02.collect(c1652a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                throw new C4005g();
            }
        }

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9413c.this.new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f89455d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9413c c9413c = C9413c.this;
                androidx.lifecycle.J viewLifecycleOwner = c9413c.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(c9413c, null);
                this.f89455d = 1;
                if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$g */
    static final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                C9413c.v(C9413c.this, interfaceC3967k2, 0);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$h */
    static final class h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89463c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ru.ozon.android.messenger.framework.core.d dVar) {
            super(2);
            this.f89463c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                ru.ozon.android.messenger.framework.presentation.common.screen.compose.t.a(null, a1.c.c(-903453131, new C9437o(C9413c.this, this.f89463c), interfaceC3967k2), interfaceC3967k2, 48);
            }
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$i */
    public static final class i extends AbstractC7737t implements Function0<androidx.lifecycle.G> {

        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$i$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f89465a;

            static {
                int[] iArr = new int[AbstractC5434v.a.values().length];
                try {
                    iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC5434v.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f89465a = iArr;
            }
        }

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.G invoke() {
            return new eu.a(C9413c.this, 1);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$j */
    public static final class j extends C5336p0.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MFragmentAiAssistantBinding f89466a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9413c f89467b;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$j$a */
        static final class a extends AbstractC7737t implements InterfaceC6511n<Integer, Integer, Boolean, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f89468b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ MFragmentAiAssistantBinding f89469c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11, MFragmentAiAssistantBinding mFragmentAiAssistantBinding) {
                super(3);
                this.f89468b = i11;
                this.f89469c = mFragmentAiAssistantBinding;
            }

            @Override // fd.InterfaceC6511n
            public final Unit invoke(Integer num, Integer num2, Boolean bool) {
                num.intValue();
                int intValue = num2.intValue();
                bool.getClass();
                int min = Math.min(intValue, this.f89468b);
                LinearLayout middleContainerLl = this.f89469c.middleContainerLl;
                Intrinsics.checkNotNullExpressionValue(middleContainerLl, "middleContainerLl");
                ru.ozon.android.messenger.utils.view.s.g(middleContainerLl, 0, 0, 0, min, 7);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MFragmentAiAssistantBinding mFragmentAiAssistantBinding, C9413c c9413c) {
            super(0);
            this.f89466a = mFragmentAiAssistantBinding;
            this.f89467b = c9413c;
        }

        @Override // androidx.core.view.C5336p0.b
        public final C5353y0 onProgress(C5353y0 insets, List<C5336p0> runningAnimations) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
            MFragmentAiAssistantBinding mFragmentAiAssistantBinding = this.f89466a;
            C5353y0 n11 = androidx.core.view.Y.n(mFragmentAiAssistantBinding.getConstraintLayout());
            if (n11 == null) {
                n11 = insets;
            }
            ConstraintLayout constraintLayout = mFragmentAiAssistantBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            C9413c c9413c = this.f89467b;
            c9413c.G(insets, new a(c9413c.E(constraintLayout, n11), mFragmentAiAssistantBinding));
            return insets;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$k */
    public static final class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MFragmentAiAssistantBinding f89470a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9413c f89471b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f89472c;

        public k(ConstraintLayout constraintLayout, MFragmentAiAssistantBinding mFragmentAiAssistantBinding, C9413c c9413c, int i11) {
            this.f89470a = mFragmentAiAssistantBinding;
            this.f89471b = c9413c;
            this.f89472c = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5353y0 n11 = androidx.core.view.Y.n(this.f89470a.getConstraintLayout());
            if (n11 == null) {
                return;
            }
            this.f89471b.D(n11, false, this.f89472c);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$l */
    public static final class l extends AbstractC7737t implements Function0<androidx.lifecycle.A0> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.A0 invoke() {
            return C9413c.this.requireActivity().getViewModelStore();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$m */
    public static final class m extends AbstractC7737t implements Function0<AbstractC6409a> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return C9413c.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$n */
    public static final class n extends AbstractC7737t implements Function0<z0.b> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return C9413c.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$o */
    public static final class o extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return C9413c.this;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$p */
    public static final class p extends AbstractC7737t implements Function0<androidx.lifecycle.B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f89477b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.f89477b = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.B0 invoke() {
            return (androidx.lifecycle.B0) this.f89477b.invoke();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$q */
    public static final class q extends AbstractC7737t implements Function0<androidx.lifecycle.A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f89478b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f89478b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.A0 invoke() {
            return ((androidx.lifecycle.B0) this.f89478b.getValue()).getViewModelStore();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$r */
    public static final class r extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f89479b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f89479b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            androidx.lifecycle.B0 b02 = (androidx.lifecycle.B0) this.f89479b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$s */
    public static final class s extends AbstractC7737t implements Function0<androidx.lifecycle.B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f89480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Function0 function0) {
            super(0);
            this.f89480b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.B0 invoke() {
            return (androidx.lifecycle.B0) this.f89480b.invoke();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$t */
    public static final class t extends AbstractC7737t implements Function0<androidx.lifecycle.A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f89481b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f89481b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.A0 invoke() {
            return ((androidx.lifecycle.B0) this.f89481b.getValue()).getViewModelStore();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$u */
    public static final class u extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f89482b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f89482b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            androidx.lifecycle.B0 b02 = (androidx.lifecycle.B0) this.f89482b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$v */
    public static final class v extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f89484c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f89484c = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            z0.b defaultViewModelProviderFactory;
            androidx.lifecycle.B0 b02 = (androidx.lifecycle.B0) this.f89484c.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return (interfaceC5431s == null || (defaultViewModelProviderFactory = interfaceC5431s.getDefaultViewModelProviderFactory()) == null) ? C9413c.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$w */
    static final class w extends AbstractC7737t implements Function0<ru.ozon.android.messenger.utils.view.m> {
        w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.utils.view.m invoke() {
            Window window = C9413c.this.requireActivity().getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            return new ru.ozon.android.messenger.utils.view.m(window);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c$x */
    static final class x extends AbstractC7737t implements Function0<z0.b> {
        x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            C9413c c9413c = C9413c.this;
            InterfaceC9376a.InterfaceC1633a m11 = ru.ozon.android.messenger.utils.g.d(c9413c).m();
            Bundle requireArguments = c9413c.requireArguments();
            Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
            return new H0(m11, (C9409a) ru.ozon.android.messenger.utils.f.a(requireArguments, "ARG_AI_ASSISTANT", C9409a.class));
        }
    }

    public C9413c() {
        super(a.f89432a);
        this.f89425i = Sc.k.b(new w());
        x xVar = new x();
        o oVar = new o();
        Sc.n nVar = Sc.n.NONE;
        InterfaceC4008j a11 = Sc.k.a(nVar, new p(oVar));
        this.f89426j = androidx.fragment.app.b0.b(this, kotlin.jvm.internal.N.b(C9414c0.class), new q(a11), new r(a11), xVar);
        InterfaceC4008j a12 = Sc.k.a(nVar, new s(new b()));
        this.f89427k = androidx.fragment.app.b0.b(this, kotlin.jvm.internal.N.b(ru.ozon.android.messenger.framework.presentation.messenger.l.class), new t(a12), new u(a12), new v(a12));
        this.f89428l = androidx.fragment.app.b0.b(this, kotlin.jvm.internal.N.b(ru.ozon.android.messenger.framework.presentation.messenger.b.class), new l(), new m(), new n());
        this.f89430n = kotlin.collections.K.f71697a;
        this.f89431o = ru.ozon.android.messenger.utils.f.b(new i());
    }

    public static final C9414c0 A(C9413c c9413c) {
        return (C9414c0) c9413c.f89426j.getValue();
    }

    public static final void B(C9413c c9413c, ru.ozon.android.messenger.framework.core.d dVar, List noUiBlocks) {
        ArrayList arrayList;
        ArrayList a11 = ru.ozon.android.messenger.framework.presentation.models.f.a(noUiBlocks);
        List<ru.ozon.android.messenger.framework.presentation.models.q> oldNoUiItems = c9413c.f89430n;
        Intrinsics.checkNotNullParameter(oldNoUiItems, "oldNoUiItems");
        Intrinsics.checkNotNullParameter(noUiBlocks, "noUiBlocks");
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = oldNoUiItems.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) it.next();
            Iterator it2 = noUiBlocks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.d(((ru.ozon.android.messenger.framework.presentation.models.q) next).c().getId(), qVar.c().getId())) {
                    obj = next;
                    break;
                }
            }
            ru.ozon.android.messenger.framework.presentation.models.q qVar2 = (ru.ozon.android.messenger.framework.presentation.models.q) obj;
            if (qVar2 == null) {
                List<ru.ozon.android.messenger.framework.presentation.models.u> b11 = qVar.b();
                arrayList = new ArrayList(C7714v.z(b11, 10));
                Iterator<T> it3 = b11.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new ru.ozon.android.messenger.framework.presentation.models.q(C7714v.a0((ru.ozon.android.messenger.framework.presentation.models.u) it3.next()), qVar.c()));
                }
            } else {
                List<ru.ozon.android.messenger.framework.presentation.models.u> b12 = qVar.b();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : b12) {
                    ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) obj2;
                    List<ru.ozon.android.messenger.framework.presentation.models.u> b13 = qVar2.b();
                    if (!(b13 instanceof Collection) || !b13.isEmpty()) {
                        Iterator<T> it4 = b13.iterator();
                        while (it4.hasNext()) {
                            if (Intrinsics.d(((ru.ozon.android.messenger.framework.presentation.models.u) it4.next()).b().getName(), uVar.b().getName())) {
                                break;
                            }
                        }
                    }
                    arrayList3.add(obj2);
                }
                ArrayList arrayList4 = new ArrayList(C7714v.z(arrayList3, 10));
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(new ru.ozon.android.messenger.framework.presentation.models.q(C7714v.a0((ru.ozon.android.messenger.framework.presentation.models.u) it5.next()), qVar2.c()));
                }
                arrayList = arrayList4;
            }
            C7714v.p(arrayList, arrayList2);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it6 = ru.ozon.android.messenger.framework.presentation.models.f.a(arrayList2).iterator();
            while (it6.hasNext()) {
                ru.ozon.android.messenger.framework.presentation.models.e eVar = (ru.ozon.android.messenger.framework.presentation.models.e) it6.next();
                if (eVar.b() instanceof SnackbarVO) {
                    ru.ozon.android.messenger.framework.data.b bVar = c9413c.f89419c;
                    if (bVar == null) {
                        Intrinsics.n("blockStore");
                        throw null;
                    }
                    ru.ozon.android.messenger.framework.data.d.c(bVar, eVar.d()).k(dVar.e());
                } else {
                    ru.ozon.android.messenger.framework.data.b bVar2 = c9413c.f89419c;
                    if (bVar2 == null) {
                        Intrinsics.n("blockStore");
                        throw null;
                    }
                    ru.ozon.android.messenger.framework.data.d.d(bVar2, eVar).k(dVar.e());
                }
            }
        }
        Iterator it7 = a11.iterator();
        while (it7.hasNext()) {
            ru.ozon.android.messenger.framework.presentation.models.e eVar2 = (ru.ozon.android.messenger.framework.presentation.models.e) it7.next();
            ru.ozon.android.messenger.framework.data.b bVar3 = c9413c.f89419c;
            if (bVar3 == null) {
                Intrinsics.n("blockStore");
                throw null;
            }
            ru.ozon.android.messenger.framework.core.viewmapper.b<Object, ru.ozon.android.messenger.framework.presentation.models.g, ?> d11 = ru.ozon.android.messenger.framework.data.d.d(bVar3, eVar2);
            ConstraintLayout constraintLayout = c9413c.getBinding().getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            d11.m(constraintLayout, dVar, eVar2);
        }
        c9413c.f89430n = noUiBlocks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(C5353y0 c5353y0, boolean z11, int i11) {
        C5353y0 n11 = androidx.core.view.Y.n(getBinding().getConstraintLayout());
        if (n11 == null) {
            n11 = c5353y0;
        }
        ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        int i12 = n11.f(129).f42127b;
        int[] iArr = new int[2];
        constraintLayout.getLocationInWindow(iArr);
        int i13 = i12 - iArr[1];
        if (i13 < 0) {
            i13 = 0;
        }
        SquircleLinearLayout headerContainerLl = getBinding().headerContainerLl;
        Intrinsics.checkNotNullExpressionValue(headerContainerLl, "headerContainerLl");
        ru.ozon.android.messenger.utils.view.s.g(headerContainerLl, 0, i11 + i13, 0, 0, 13);
        ConstraintLayout constraintLayout2 = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        G(c5353y0, new C9425i(this, E(constraintLayout2, n11), z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E(ConstraintLayout constraintLayout, C5353y0 c5353y0) {
        int i11 = c5353y0.f(2).f42129d;
        if (i11 == 0 || constraintLayout.getHeight() == 0) {
            return 0;
        }
        View decorView = requireActivity().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        constraintLayout.getLocationInWindow(iArr);
        decorView.getLocationInWindow(iArr2);
        return kotlin.ranges.h.e((constraintLayout.getHeight() + iArr[1]) - ((decorView.getHeight() + iArr2[1]) - i11), 0, i11);
    }

    private final void F() {
        MFragmentAiAssistantBinding binding = getBinding();
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        if (this.f89421e == null) {
            Intrinsics.n("messengerConfig");
            throw null;
        }
        constraintLayout.setFitsSystemWindows(!r2.getEnabledInsets());
        ru.ozon.android.messenger.framework.core.initialization.d dVar = this.f89421e;
        if (dVar == null) {
            Intrinsics.n("messengerConfig");
            throw null;
        }
        if (dVar.getEnabledInsets()) {
            final int paddingTop = binding.headerContainerLl.getPaddingTop();
            androidx.core.view.Y.J(binding.getConstraintLayout(), new androidx.core.view.D() { // from class: ru.ozon.android.messenger.framework.presentation.ai.b
                @Override // androidx.core.view.D
                public final C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
                    return C9413c.u(C9413c.this, paddingTop, view, c5353y0);
                }
            });
            ConstraintLayout constraintLayout2 = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            if (constraintLayout2.isAttachedToWindow()) {
                androidx.core.view.Y.A(constraintLayout2);
            } else {
                constraintLayout2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC9446t());
            }
            ConstraintLayout constraintLayout3 = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "getRoot(...)");
            androidx.core.view.G.a(constraintLayout3, new k(constraintLayout3, binding, this, paddingTop));
            androidx.core.view.Y.Q(binding.getConstraintLayout(), new j(binding, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(C5353y0 c5353y0, InterfaceC6511n<? super Integer, ? super Integer, ? super Boolean, Unit> interfaceC6511n) {
        androidx.core.graphics.d f7 = c5353y0.f(2);
        Intrinsics.checkNotNullExpressionValue(f7, "getInsets(...)");
        androidx.core.graphics.d f11 = c5353y0.f(8);
        Intrinsics.checkNotNullExpressionValue(f11, "getInsets(...)");
        boolean p11 = c5353y0.p(8);
        boolean z11 = false;
        int i11 = p11 ? 0 : f7.f42129d;
        if (this.f89429m && !p11) {
            z11 = true;
        }
        this.f89429m = p11;
        interfaceC6511n.invoke(Integer.valueOf(f11.f42129d), Integer.valueOf(i11), Boolean.valueOf(z11));
    }

    public static C5353y0 u(C9413c c9413c, int i11, View view, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        c9413c.D(insets, true, i11);
        return C5353y0.f42353b;
    }

    public static final void v(C9413c c9413c, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-2102236612);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(c9413c) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            ru.ozon.android.messenger.framework.presentation.common.screen.compose.t.a(null, a1.c.c(1507896512, new C9421g(c9413c), u11), u11, 48);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C9423h(c9413c, i11));
        }
    }

    public static final /* synthetic */ MFragmentAiAssistantBinding y(C9413c c9413c) {
        return c9413c.getBinding();
    }

    public static final ru.ozon.android.messenger.utils.view.m z(C9413c c9413c) {
        return (ru.ozon.android.messenger.utils.view.m) c9413c.f89425i.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.ai.J0
    /* renamed from: i, reason: from getter */
    public final K0 getF89424h() {
        return this.f89424h;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ru.ozon.android.messenger.utils.g.d(this).z(this);
        super.onAttach(context);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        ProcessLifecycleOwner processLifecycleOwner;
        super.onCreate(bundle);
        ((ru.ozon.android.messenger.framework.presentation.messenger.b) this.f89428l.getValue()).g0(((C9414c0) this.f89426j.getValue()).e());
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a((androidx.lifecycle.G) this.f89431o.getValue());
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.screen.i, androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        AbstractC5434v lifecycle = getViewLifecycleOwner().getLifecycle();
        m.a aVar = m.a.ADJUST_RESIZE;
        Window window = requireActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        lifecycle.a(new ru.ozon.android.messenger.utils.m(aVar, window));
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        ProcessLifecycleOwner processLifecycleOwner;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().e((androidx.lifecycle.G) this.f89431o.getValue());
        super.onDestroy();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.screen.i, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        androidx.core.view.Y.Q(getBinding().getConstraintLayout(), null);
        ru.ozon.android.messenger.framework.core.e.b();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        Window window = requireActivity().getWindow();
        View currentFocus = requireActivity().getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        new androidx.core.view.Q0(window.getDecorView(), window).a(8);
        super.onPause();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((ru.ozon.android.messenger.framework.presentation.messenger.l) this.f89427k.getValue()).t0("ai_assistant");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        androidx.lifecycle.y0 y0Var = this.f89426j;
        ((C9414c0) y0Var.getValue()).onStart();
        K0 N02 = ((C9414c0) y0Var.getValue()).N0();
        if (N02 == null) {
            Intrinsics.n("aiSendActionStore");
            throw null;
        }
        this.f89424h = N02;
        ru.ozon.android.messenger.framework.navigation.controller.a controller = ((C9414c0) y0Var.getValue()).getController();
        ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ru.ozon.android.messenger.framework.presentation.messenger.a f02 = ((ru.ozon.android.messenger.framework.presentation.messenger.b) this.f89428l.getValue()).f0();
        ru.ozon.android.messenger.framework.data.b bVar = this.f89419c;
        if (bVar == null) {
            Intrinsics.n("blockStore");
            throw null;
        }
        ru.ozon.android.messenger.framework.core.d dVar = new ru.ozon.android.messenger.framework.core.d(controller, constraintLayout, viewLifecycleOwner, this, f02, bVar);
        ru.ozon.android.messenger.framework.core.e.a(dVar);
        F();
        androidx.lifecycle.J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner2), null, null, new C1648c(null), 3);
        androidx.lifecycle.J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner3), null, null, new d(dVar, null), 3);
        androidx.lifecycle.J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner4), null, null, new e(dVar, null), 3);
        androidx.lifecycle.J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner5), null, null, new f(null), 3);
        getBinding().sourcesCurtainContainer.a(new C4912a(true, -2100368688, new g()));
        getBinding().mainContent.a(new C4912a(true, 1625125177, new h(dVar)));
    }
}
