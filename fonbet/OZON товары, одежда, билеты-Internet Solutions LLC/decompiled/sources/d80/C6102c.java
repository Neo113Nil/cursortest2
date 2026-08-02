package d80;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import B90.K;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import V5.q;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import com.github.chrisbanes.photoview.PhotoView;
import e80.C6319a;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld80/c;", "LE30/c;", "<init>", "()V", "sharing-files_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: d80.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6102c extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    private W70.a f61280a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f61281b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f61282c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.OnePhotoPageFragment$onViewCreated$$inlined$observe$1", f = "OnePhotoPageFragment.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: d80.c$a */
    public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f61283d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f61284e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f61286g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C6102c f61287h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.OnePhotoPageFragment$onViewCreated$$inlined$observe$1$1", f = "OnePhotoPageFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: d80.c$a$a, reason: collision with other inner class name */
        public static final class C0950a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f61288d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f61289e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C6102c f61290f;

            /* renamed from: d80.c$a$a$a, reason: collision with other inner class name */
            public static final class C0951a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C6102c f61291a;

                public C0951a(C6102c c6102c) {
                    this.f61291a = c6102c;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    String str = (String) t2;
                    if (str != null) {
                        C6102c c6102c = this.f61291a;
                        W70.a aVar = c6102c.f61280a;
                        PhotoView photoView = aVar != null ? aVar.f33297b : null;
                        PhotoView photoView2 = photoView != null ? photoView : null;
                        if (photoView2 != null) {
                            ImageViewExtKt.loadOriginal$default(photoView2, str, null, c6102c.new d(), null, false, null, 58, null);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0950a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C6102c c6102c) {
                super(2, dVar);
                this.f61289e = interfaceC2395h;
                this.f61290f = c6102c;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0950a(this.f61289e, dVar, this.f61290f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0950a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f61288d;
                if (i11 == 0) {
                    s.b(obj);
                    C0951a c0951a = new C0951a(this.f61290f);
                    this.f61288d = 1;
                    if (this.f61289e.collect(c0951a, this) == aVar) {
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
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C6102c c6102c) {
            super(2, dVar);
            this.f61286g = interfaceC2395h;
            this.f61287h = c6102c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = C6102c.this.new a(this.f61286g, dVar, this.f61287h);
            aVar.f61284e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f61283d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f61284e)) {
                    J viewLifecycleOwner = C6102c.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    C0950a c0950a = new C0950a(this.f61286g, null, this.f61287h);
                    this.f61283d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, c0950a, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.OnePhotoPageFragment$onViewCreated$$inlined$observe$2", f = "OnePhotoPageFragment.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: d80.c$b */
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f61292d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f61293e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f61295g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C6102c f61296h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.OnePhotoPageFragment$onViewCreated$$inlined$observe$2$1", f = "OnePhotoPageFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: d80.c$b$a */
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f61297d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f61298e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C6102c f61299f;

            /* renamed from: d80.c$b$a$a, reason: collision with other inner class name */
            public static final class C0952a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C6102c f61300a;

                public C0952a(C6102c c6102c) {
                    this.f61300a = c6102c;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    String str = (String) t2;
                    C6102c c6102c = this.f61300a;
                    W70.a aVar = c6102c.f61280a;
                    PhotoView photoView = aVar != null ? aVar.f33297b : null;
                    if (str != null && photoView != null) {
                        byte[] decode = Base64.decode(C6319a.b(str), 0);
                        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                        com.bumptech.glide.c.n(c6102c.requireContext()).asBitmap().load(decode).listener(c6102c.new e()).into(photoView);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C6102c c6102c) {
                super(2, dVar);
                this.f61298e = interfaceC2395h;
                this.f61299f = c6102c;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f61298e, dVar, this.f61299f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f61297d;
                if (i11 == 0) {
                    s.b(obj);
                    C0952a c0952a = new C0952a(this.f61299f);
                    this.f61297d = 1;
                    if (this.f61298e.collect(c0952a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C6102c c6102c) {
            super(2, dVar);
            this.f61295g = interfaceC2395h;
            this.f61296h = c6102c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = C6102c.this.new b(this.f61295g, dVar, this.f61296h);
            bVar.f61293e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f61292d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f61293e)) {
                    J viewLifecycleOwner = C6102c.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f61295g, null, this.f61296h);
                    this.f61292d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.OnePhotoPageFragment$onViewCreated$$inlined$observe$3", f = "OnePhotoPageFragment.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: d80.c$c, reason: collision with other inner class name */
    public static final class C0953c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f61301d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f61302e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f61304g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C6102c f61305h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.OnePhotoPageFragment$onViewCreated$$inlined$observe$3$1", f = "OnePhotoPageFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: d80.c$c$a */
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f61306d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f61307e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C6102c f61308f;

            /* renamed from: d80.c$c$a$a, reason: collision with other inner class name */
            public static final class C0954a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C6102c f61309a;

                public C0954a(C6102c c6102c) {
                    this.f61309a = c6102c;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ScreenState screenState = (ScreenState) t2;
                    boolean z11 = screenState instanceof ScreenState.Progress;
                    C6102c c6102c = this.f61309a;
                    if (z11) {
                        W70.a aVar = c6102c.f61280a;
                        if (aVar != null) {
                            aVar.f33298c.setVisibility(0);
                        }
                        W70.a aVar2 = c6102c.f61280a;
                        if (aVar2 != null) {
                            aVar2.f33298c.bindState(screenState);
                        }
                    } else if (screenState instanceof ScreenState.Error) {
                        W70.a aVar3 = c6102c.f61280a;
                        if (aVar3 != null) {
                            aVar3.f33298c.setVisibility(0);
                        }
                        W70.a aVar4 = c6102c.f61280a;
                        if (aVar4 != null) {
                            aVar4.f33298c.bindState(screenState);
                        }
                    } else {
                        W70.a aVar5 = c6102c.f61280a;
                        if (aVar5 != null) {
                            aVar5.f33298c.setVisibility(8);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C6102c c6102c) {
                super(2, dVar);
                this.f61307e = interfaceC2395h;
                this.f61308f = c6102c;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f61307e, dVar, this.f61308f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f61306d;
                if (i11 == 0) {
                    s.b(obj);
                    C0954a c0954a = new C0954a(this.f61308f);
                    this.f61306d = 1;
                    if (this.f61307e.collect(c0954a, this) == aVar) {
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
        public C0953c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C6102c c6102c) {
            super(2, dVar);
            this.f61304g = interfaceC2395h;
            this.f61305h = c6102c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C0953c c0953c = C6102c.this.new C0953c(this.f61304g, dVar, this.f61305h);
            c0953c.f61302e = obj;
            return c0953c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0953c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f61301d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f61302e)) {
                    J viewLifecycleOwner = C6102c.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f61304g, null, this.f61305h);
                    this.f61301d = 1;
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

    /* renamed from: d80.c$d */
    public static final class d implements PikazonLoaderCallback<Drawable> {
        d() {
        }

        @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
        public final void onLoadFailed(Exception exc) {
            C6102c.v(C6102c.this).h0(exc);
        }

        @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
        public final void onLoadSuccessful(Drawable drawable) {
            C6102c.v(C6102c.this).i0();
        }
    }

    /* renamed from: d80.c$e */
    public static final class e implements l6.h<Bitmap> {
        e() {
        }

        @Override // l6.h
        public final boolean onLoadFailed(q qVar, Object obj, m6.h<Bitmap> target, boolean z11) {
            Intrinsics.checkNotNullParameter(target, "target");
            C6102c.v(C6102c.this).h0(qVar);
            return false;
        }

        @Override // l6.h
        public final boolean onResourceReady(Bitmap bitmap, Object model, m6.h<Bitmap> hVar, T5.a dataSource, boolean z11) {
            Bitmap resource = bitmap;
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            C6102c.v(C6102c.this).i0();
            return false;
        }
    }

    /* renamed from: d80.c$f */
    public static final class f extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return C6102c.this;
        }
    }

    /* renamed from: d80.c$g */
    public static final class g extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f61313b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f61313b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f61313b.invoke();
        }
    }

    /* renamed from: d80.c$h */
    public static final class h extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f61314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f61314b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f61314b.getValue()).getViewModelStore();
        }
    }

    /* renamed from: d80.c$i */
    public static final class i extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f61315b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f61315b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f61315b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public C6102c() {
        C6101b c6101b = new C6101b(this, 0);
        InterfaceC4008j a11 = k.a(n.NONE, new g(new f()));
        this.f61281b = b0.b(this, kotlin.jvm.internal.N.b(d80.d.class), new h(a11), new i(a11), c6101b);
        this.f61282c = "OnePhotoPageFragment";
    }

    public static void t(C6102c c6102c) {
        ComponentCallbacksC5392m parentFragment = c6102c.getParentFragment();
        PhotoPreviewFragment photoPreviewFragment = parentFragment instanceof PhotoPreviewFragment ? (PhotoPreviewFragment) parentFragment : null;
        if (photoPreviewFragment != null) {
            W70.a aVar = c6102c.f61280a;
            photoPreviewFragment.onScaleChange(aVar != null ? aVar.f33297b.g() : 1.0f);
        }
    }

    public static final d80.d v(C6102c c6102c) {
        return (d80.d) c6102c.f61281b.getValue();
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF61282c() {
        return this.f61282c;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((X70.b) O30.a.a(O30.c.a(requireActivity)).a(X70.b.class)).w(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("URL") : null;
        Bundle arguments2 = getArguments();
        ((d80.d) this.f61281b.getValue()).g0(string, arguments2 != null ? arguments2.getString("BASE_64_KEY") : null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        W70.a b11 = W70.a.b(inflater, viewGroup);
        this.f61280a = b11;
        FrameLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        W70.a aVar = this.f61280a;
        if (aVar != null) {
            aVar.f33297b.i(6.0f);
        }
        W70.a aVar2 = this.f61280a;
        if (aVar2 != null) {
            aVar2.f33297b.j(3.0f);
        }
        W70.a aVar3 = this.f61280a;
        if (aVar3 != null) {
            aVar3.f33297b.k();
        }
        W70.a aVar4 = this.f61280a;
        if (aVar4 != null) {
            aVar4.f33297b.setClipToOutline(false);
        }
        W70.a aVar5 = this.f61280a;
        if (aVar5 != null) {
            aVar5.f33297b.setCropToPadding(false);
        }
        W70.a aVar6 = this.f61280a;
        if (aVar6 != null) {
            aVar6.f33297b.l(new K(this));
        }
        y0 y0Var = this.f61281b;
        x0<String> f02 = ((d80.d) y0Var.getValue()).f0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new a(f02, null, this), 3);
        x0<String> e02 = ((d80.d) y0Var.getValue()).e0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner2), null, null, new b(e02, null, this), 3);
        x0<ScreenState> screenStateFlow = ((d80.d) y0Var.getValue()).getScreenStateFlow();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner3), null, null, new C0953c(screenStateFlow, null, this), 3);
    }

    public final Drawable w() {
        PhotoView photoView;
        W70.a aVar = this.f61280a;
        if (aVar == null || (photoView = aVar.f33297b) == null) {
            return null;
        }
        return photoView.getDrawable();
    }
}
