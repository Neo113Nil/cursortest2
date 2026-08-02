package ru.ozon.debugMenu.internal.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.k;
import Sc.n;
import Sc.o;
import Sc.s;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.C;
import androidx.activity.J;
import androidx.activity.L;
import androidx.activity.t;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.K;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.AbstractC9166c;
import r20.C9164a;
import ru.ozon.app.android.R;
import u20.InterfaceC9924a;
import w20.C10420b;
import w20.C10421c;
import w20.f;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/debugMenu/internal/presentation/OzonDebugMenuActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OzonDebugMenuActivity extends g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f94900j = 0;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f94901h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f94902i;

    static final class a extends AbstractC7737t implements Function0<C10420b> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f94903b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C10420b invoke() {
            C9164a c9164a = C9164a.f82858a;
            return C9164a.a().n();
        }
    }

    static final class b extends AbstractC7737t implements Function0<C10421c> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f94904b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final C10421c invoke() {
            C9164a c9164a = C9164a.f82858a;
            return C9164a.a().o();
        }
    }

    @e(c = "ru.ozon.debugMenu.internal.presentation.OzonDebugMenuActivity$onCreate$2", f = "OzonDebugMenuActivity.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f94905d;

        @e(c = "ru.ozon.debugMenu.internal.presentation.OzonDebugMenuActivity$onCreate$2$1", f = "OzonDebugMenuActivity.kt", l = {38}, m = "invokeSuspend")
        static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f94907d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ OzonDebugMenuActivity f94908e;

            /* renamed from: ru.ozon.debugMenu.internal.presentation.OzonDebugMenuActivity$c$a$a, reason: collision with other inner class name */
            static final class C1977a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OzonDebugMenuActivity f94909a;

                C1977a(OzonDebugMenuActivity ozonDebugMenuActivity) {
                    this.f94909a = ozonDebugMenuActivity;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    f fVar = (f) obj;
                    OzonDebugMenuActivity ozonDebugMenuActivity = this.f94909a;
                    G supportFragmentManager = ozonDebugMenuActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    int i11 = OzonDebugMenuActivity.f94900j;
                    if (fVar instanceof f.a) {
                        if (supportFragmentManager.l0() > 0) {
                            supportFragmentManager.P0();
                        } else {
                            ozonDebugMenuActivity.finish();
                        }
                    } else if (fVar instanceof f.b) {
                        ozonDebugMenuActivity.finish();
                    } else {
                        if (!(fVar instanceof f.c)) {
                            throw new o();
                        }
                        ComponentCallbacksC5392m a11 = ((f.c) fVar).a();
                        Q p11 = supportFragmentManager.p();
                        p11.r(R.id.container, a11, null);
                        p11.g(null);
                        p11.w();
                        p11.x();
                        p11.i();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(OzonDebugMenuActivity ozonDebugMenuActivity, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f94908e = ozonDebugMenuActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f94908e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f94907d;
                if (i11 == 0) {
                    s.b(obj);
                    OzonDebugMenuActivity ozonDebugMenuActivity = this.f94908e;
                    InterfaceC2395h<f> b11 = OzonDebugMenuActivity.J(ozonDebugMenuActivity).b();
                    C1977a c1977a = new C1977a(ozonDebugMenuActivity);
                    this.f94907d = 1;
                    if (b11.collect(c1977a, this) == aVar) {
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

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return OzonDebugMenuActivity.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f94905d;
            if (i11 == 0) {
                s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
                OzonDebugMenuActivity ozonDebugMenuActivity = OzonDebugMenuActivity.this;
                a aVar2 = new a(ozonDebugMenuActivity, null);
                this.f94905d = 1;
                if (C5412d0.b(ozonDebugMenuActivity, bVar, aVar2, this) == aVar) {
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

    static final class d extends AbstractC7737t implements Function1<C, Unit> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C c11) {
            C addCallback = c11;
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            OzonDebugMenuActivity.J(OzonDebugMenuActivity.this).d();
            return Unit.f71690a;
        }
    }

    public OzonDebugMenuActivity() {
        n nVar = n.NONE;
        this.f94901h = k.a(nVar, a.f94903b);
        this.f94902i = k.a(nVar, b.f94904b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final C10420b J(OzonDebugMenuActivity ozonDebugMenuActivity) {
        return (C10420b) ozonDebugMenuActivity.f94901h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r5v11, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(3);
        t.a(this);
        C9164a c9164a = C9164a.f82858a;
        Iterator<T> it = C9164a.a().r().iterator();
        while (it.hasNext()) {
            ((AbstractC9166c) it.next()).onActivityCreated(this);
        }
        setContentView(R.layout.ozon_debug_menu_activity);
        C10727i.c(K.a(this), null, null, new c(null), 3);
        if (bundle == null) {
            ((C10420b) this.f94901h.getValue()).e();
        }
        J onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        L.a(onBackPressedDispatcher, this, new d(), 2);
        Intent intent = getIntent();
        if ((intent != null ? intent.getData() : null) != null) {
            ((C10421c) this.f94902i.getValue()).a(this, getIntent().getData());
            getIntent().setData(null);
        }
        InterfaceC9924a.f99762b.c();
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        C9164a c9164a = C9164a.f82858a;
        Iterator<T> it = C9164a.a().r().iterator();
        while (it.hasNext()) {
            ((AbstractC9166c) it.next()).onActivityDestroyed(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ((intent != null ? intent.getData() : null) != null) {
            ((C10421c) this.f94902i.getValue()).a(this, intent.getData());
        }
    }
}
