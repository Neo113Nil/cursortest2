package ru.ozon.fintech.features.cbottomstories.presentation;

import A50.c;
import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import B50.n;
import B50.o;
import C.D;
import Sc.InterfaceC4008j;
import Sc.s;
import android.content.Context;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import f3.AbstractC6409a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottomstories.presentation.a;
import ru.ozon.fintech.ui.storyprogress.StoryProgressState;
import x50.C10662c;
import xe.C10727i;
import xe.M;
import xe.N;

@Keep
@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0007*\u00012\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u000267B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, d2 = {"Lru/ozon/fintech/features/cbottomstories/presentation/StoryFragment;", "LE30/c;", "LA50/c$a;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "LA50/c;", "provideStoriesInteractor", "()LA50/c;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "", "fragmentName", "Ljava/lang/String;", "getFragmentName", "()Ljava/lang/String;", "", "isNeedSendOnCreateAnalytic", "Z", "()Z", "Lx50/c;", "binding", "Lx50/c;", "LB50/o;", "viewModel$delegate", "LSc/j;", "getViewModel", "()LB50/o;", "viewModel", "", "storyPos", "I", "ru/ozon/fintech/features/cbottomstories/presentation/StoryFragment$i", "pageListener", "Lru/ozon/fintech/features/cbottomstories/presentation/StoryFragment$i;", "Companion", "a", "b", "cbottom-stories_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoryFragment extends E30.c implements c.a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String STORY_POS = "STORY_POS";

    @NotNull
    private static final String TAG = "StoryFragment";
    private C10662c binding;

    @NotNull
    private final String fragmentName = TAG;
    private final boolean isNeedSendOnCreateAnalytic;

    @NotNull
    private final i pageListener;
    private int storyPos;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public final class b extends Z4.a {

        /* renamed from: a, reason: collision with root package name */
        private final C50.e f95345a;

        public b(C50.e eVar) {
            super(StoryFragment.this.getChildFragmentManager(), StoryFragment.this.getLifecycle());
            this.f95345a = eVar;
        }

        @Override // Z4.a
        @NotNull
        public final ComponentCallbacksC5392m createFragment(int i11) {
            C50.e eVar = this.f95345a;
            if ((eVar != null ? (C50.b) C7714v.Q(i11, eVar.a()) : null) == null) {
                throw new Exception("Not found");
            }
            int i12 = StoryFragment.this.storyPos;
            B50.h hVar = new B50.h();
            hVar.setArguments(androidx.core.os.d.b(new Pair(StoryFragment.STORY_POS, Integer.valueOf(i12)), new Pair("FRAME_POS", Integer.valueOf(i11))));
            return hVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: getItemCount */
        public final int getShimmersCount() {
            C50.e eVar = this.f95345a;
            if (eVar != null) {
                return ((ArrayList) eVar.a()).size();
            }
            return 0;
        }
    }

    public static final class c implements InterfaceC2395h<Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0 f95347a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StoryFragment f95348b;

        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f95349a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ StoryFragment f95350b;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment$onViewCreated$$inlined$filter$1$2", f = "StoryFragment.kt", l = {223}, m = "emit")
            /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2023a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f95351d;

                /* renamed from: e, reason: collision with root package name */
                int f95352e;

                public C2023a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f95351d = obj;
                    this.f95352e |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2397i interfaceC2397i, StoryFragment storyFragment) {
                this.f95349a = interfaceC2397i;
                this.f95350b = storyFragment;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C2023a c2023a;
                int i11;
                if (dVar instanceof C2023a) {
                    c2023a = (C2023a) dVar;
                    int i12 = c2023a.f95352e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c2023a.f95352e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c2023a.f95351d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c2023a.f95352e;
                        if (i11 != 0) {
                            s.b(obj2);
                            if (this.f95350b.storyPos == ((Number) ((Pair) obj).e()).intValue()) {
                                c2023a.f95352e = 1;
                                if (this.f95349a.emit(obj, c2023a) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c2023a = new C2023a(dVar);
                Object obj22 = c2023a.f95351d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c2023a.f95352e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public c(C0 c02, StoryFragment storyFragment) {
            this.f95347a = c02;
            this.f95348b = storyFragment;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super Pair<? extends Integer, ? extends Integer>> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f95347a.collect(new a(interfaceC2397i, this.f95348b), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment$onViewCreated$$inlined$observe$1", f = "StoryFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95354d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95355e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95357g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ StoryFragment f95358h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment$onViewCreated$$inlined$observe$1$1", f = "StoryFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95359d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95360e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ StoryFragment f95361f;

            /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment$d$a$a, reason: collision with other inner class name */
            public static final class C2024a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ StoryFragment f95362a;

                public C2024a(StoryFragment storyFragment) {
                    this.f95362a = storyFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ((Boolean) t2).getClass();
                    StoryFragment storyFragment = this.f95362a;
                    C10662c c10662c = storyFragment.binding;
                    if (c10662c != null) {
                        c10662c.f105037c.bindState(new StoryProgressState("progress", storyFragment.getViewModel().d0().m(storyFragment.storyPos), 2, E30.i.a()));
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, StoryFragment storyFragment) {
                super(2, dVar);
                this.f95360e = c02;
                this.f95361f = storyFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95360e, dVar, this.f95361f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95359d;
                if (i11 == 0) {
                    s.b(obj);
                    C2024a c2024a = new C2024a(this.f95361f);
                    this.f95359d = 1;
                    if (this.f95360e.collect(c2024a, this) == aVar) {
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
        public d(C0 c02, kotlin.coroutines.d dVar, StoryFragment storyFragment) {
            super(2, dVar);
            this.f95357g = c02;
            this.f95358h = storyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = StoryFragment.this.new d(this.f95357g, dVar, this.f95358h);
            dVar2.f95355e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95354d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95355e)) {
                    J viewLifecycleOwner = StoryFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95357g, null, this.f95358h);
                    this.f95354d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment$onViewCreated$$inlined$observe$2", f = "StoryFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95363d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95364e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f95366g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ StoryFragment f95367h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment$onViewCreated$$inlined$observe$2$1", f = "StoryFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95368d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f95369e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ StoryFragment f95370f;

            /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment$e$a$a, reason: collision with other inner class name */
            public static final class C2025a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ StoryFragment f95371a;

                public C2025a(StoryFragment storyFragment) {
                    this.f95371a = storyFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ViewPager2 viewPager2;
                    Pair pair = (Pair) t2;
                    C10662c c10662c = this.f95371a.binding;
                    if (c10662c != null && (viewPager2 = c10662c.f105038d) != null) {
                        viewPager2.t(((Number) pair.f()).intValue(), false);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, kotlin.coroutines.d dVar, StoryFragment storyFragment) {
                super(2, dVar);
                this.f95369e = cVar;
                this.f95370f = storyFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95369e, dVar, this.f95370f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95368d;
                if (i11 == 0) {
                    s.b(obj);
                    C2025a c2025a = new C2025a(this.f95370f);
                    this.f95368d = 1;
                    if (this.f95369e.collect(c2025a, this) == aVar) {
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
        public e(c cVar, kotlin.coroutines.d dVar, StoryFragment storyFragment) {
            super(2, dVar);
            this.f95366g = cVar;
            this.f95367h = storyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = StoryFragment.this.new e(this.f95366g, dVar, this.f95367h);
            eVar.f95364e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95363d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95364e)) {
                    J viewLifecycleOwner = StoryFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95366g, null, this.f95367h);
                    this.f95363d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment$onViewCreated$$inlined$observe$3", f = "StoryFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95372d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95373e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95375g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ StoryFragment f95376h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment$onViewCreated$$inlined$observe$3$1", f = "StoryFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95377d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95378e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ StoryFragment f95379f;

            /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment$f$a$a, reason: collision with other inner class name */
            public static final class C2026a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ StoryFragment f95380a;

                public C2026a(StoryFragment storyFragment) {
                    this.f95380a = storyFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C50.e eVar = (C50.e) t2;
                    StoryFragment storyFragment = this.f95380a;
                    C10662c c10662c = storyFragment.binding;
                    if ((c10662c != null ? c10662c.f105038d.e() : null) == null && eVar != null && (!eVar.a().isEmpty())) {
                        b bVar = storyFragment.new b(storyFragment.getViewModel().d0().r(storyFragment.storyPos));
                        C10662c c10662c2 = storyFragment.binding;
                        if (c10662c2 != null) {
                            c10662c2.f105038d.s(bVar);
                        }
                        C10662c c10662c3 = storyFragment.binding;
                        if (c10662c3 != null) {
                            c10662c3.f105038d.t(storyFragment.getViewModel().d0().q(storyFragment.storyPos), false);
                        }
                        C10662c c10662c4 = storyFragment.binding;
                        if (c10662c4 != null) {
                            c10662c4.f105038d.post(storyFragment.new h());
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, StoryFragment storyFragment) {
                super(2, dVar);
                this.f95378e = interfaceC2395h;
                this.f95379f = storyFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95378e, dVar, this.f95379f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95377d;
                if (i11 == 0) {
                    s.b(obj);
                    C2026a c2026a = new C2026a(this.f95379f);
                    this.f95377d = 1;
                    if (this.f95378e.collect(c2026a, this) == aVar) {
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
        public f(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, StoryFragment storyFragment) {
            super(2, dVar);
            this.f95375g = interfaceC2395h;
            this.f95376h = storyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = StoryFragment.this.new f(this.f95375g, dVar, this.f95376h);
            fVar.f95373e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95372d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95373e)) {
                    J viewLifecycleOwner = StoryFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95375g, null, this.f95376h);
                    this.f95372d = 1;
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

    public static final class g extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            if (outline != null) {
                if ((view != null ? Integer.valueOf(view.getWidth()) : null) != null) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), D.c(16.0f));
                }
            }
        }
    }

    static final class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StoryFragment storyFragment = StoryFragment.this;
            C10662c c10662c = storyFragment.binding;
            if (c10662c != null) {
                c10662c.f105038d.p(storyFragment.pageListener);
            }
        }
    }

    public static final class i extends ViewPager2.g {
        i() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i11) {
            ViewPager2 viewPager2;
            if (i11 == 0) {
                StoryFragment storyFragment = StoryFragment.this;
                A50.c d02 = storyFragment.getViewModel().d0();
                int i12 = storyFragment.storyPos;
                C10662c c10662c = storyFragment.binding;
                d02.u(i12, (c10662c == null || (viewPager2 = c10662c.f105038d) == null) ? 0 : viewPager2.f());
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i11) {
            StoryFragment storyFragment = StoryFragment.this;
            storyFragment.getViewModel().d0().f();
            storyFragment.getViewModel().d0().u(storyFragment.storyPos, i11);
            storyFragment.getViewModel().d0().t(false);
        }
    }

    public static final class j extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return StoryFragment.this;
        }
    }

    public static final class k extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f95384b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f95384b = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95384b.invoke();
        }
    }

    public static final class l extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95385b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95385b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95385b.getValue()).getViewModelStore();
        }
    }

    public static final class m extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95386b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95386b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95386b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public StoryFragment() {
        n nVar = new n(this, 0);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new k(new j()));
        this.viewModel = b0.b(this, kotlin.jvm.internal.N.b(o.class), new l(a11), new m(a11), nVar);
        this.pageListener = new i();
    }

    @NotNull
    public static final Bundle getBundle(int i11) {
        INSTANCE.getClass();
        return androidx.core.os.d.b(new Pair(STORY_POS, Integer.valueOf(i11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o getViewModel() {
        return (o) this.viewModel.getValue();
    }

    @NotNull
    public static final StoryFragment newInstance(int i11) {
        Companion companion = INSTANCE;
        companion.getClass();
        StoryFragment storyFragment = new StoryFragment();
        companion.getClass();
        storyFragment.setArguments(androidx.core.os.d.b(new Pair(STORY_POS, Integer.valueOf(i11))));
        return storyFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(StoryFragment storyFragment, View view) {
        Function0<Unit> function0 = storyFragment.getViewModel().d0().f463i;
        if (function0 != null) {
            ((a.b) function0).invoke();
        } else {
            Intrinsics.n("endDismissListener");
            throw null;
        }
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public String getF95666d() {
        return this.fragmentName;
    }

    @Override // E30.c
    /* renamed from: isNeedSendOnCreateAnalytic, reason: from getter */
    public boolean getIsNeedSendOnCreateAnalytic() {
        return this.isNeedSendOnCreateAnalytic;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((y50.g) O30.a.a(O30.c.a(requireActivity)).a(y50.g.class)).Q0(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.storyPos = arguments != null ? arguments.getInt(STORY_POS) : 0;
        getViewModel().f0(this.storyPos);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C10662c b11 = C10662c.b(inflater, container);
        this.binding = b11;
        FrameLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        C10662c c10662c = this.binding;
        if (c10662c != null) {
            c10662c.f105038d.A(this.pageListener);
        }
        getViewModel().d0().C(this.storyPos);
        super.onDestroyView();
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        FrameLayout a11;
        FrameLayout a12;
        Boolean b11;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        o viewModel = getViewModel();
        InterfaceC5431s parentFragment = getParentFragment();
        Intrinsics.g(parentFragment, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottomstories.intercator.StoriesInteractor.Provider");
        A50.c provideStoriesInteractor = ((c.a) parentFragment).provideStoriesInteractor();
        viewModel.getClass();
        Intrinsics.checkNotNullParameter(provideStoriesInteractor, "<set-?>");
        viewModel.f2947a = provideStoriesInteractor;
        getViewModel().g0();
        C10662c c10662c = this.binding;
        if (c10662c != null) {
            ImageView imageView = c10662c.f105036b;
            C50.d p11 = getViewModel().d0().p();
            imageView.setVisibility((p11 == null || (b11 = p11.b()) == null) ? true : b11.booleanValue() ? 0 : 8);
        }
        C10662c c10662c2 = this.binding;
        if (c10662c2 != null) {
            c10662c2.f105036b.setOnClickListener(new Am.b(this, 1));
        }
        C0 n11 = getViewModel().d0().n();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new d(n11, null, this), 3);
        c cVar = new c(getViewModel().d0().k(), this);
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new e(cVar, null, this), 3);
        C10662c c10662c3 = this.binding;
        if (c10662c3 != null && (a12 = c10662c3.a()) != null) {
            a12.setClipToOutline(true);
        }
        C10662c c10662c4 = this.binding;
        if (c10662c4 != null && (a11 = c10662c4.a()) != null) {
            a11.setOutlineProvider(new g());
        }
        C10662c c10662c5 = this.binding;
        if (c10662c5 != null) {
            ViewPager2 viewPager2 = c10662c5.f105038d;
            H30.D.b(viewPager2, 1);
            viewPager2.y(false);
            H30.D.a(viewPager2);
        }
        x0<C50.e> e02 = getViewModel().e0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new f(e02, null, this), 3);
        getViewModel().d0().A(this.storyPos, this);
    }

    @Override // A50.c.a
    @NotNull
    public A50.c provideStoriesInteractor() {
        return getViewModel().d0();
    }
}
