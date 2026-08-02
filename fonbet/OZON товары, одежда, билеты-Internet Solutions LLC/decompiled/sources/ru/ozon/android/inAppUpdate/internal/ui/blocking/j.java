package ru.ozon.android.inAppUpdate.internal.ui.blocking;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import Sc.s;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import hj.C6960a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pj.C8938a;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.a;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.c;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.i;
import ru.ozon.android.inAppUpdate.internal.ui.g;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/inAppUpdate/internal/ui/blocking/j;", "Landroidx/lifecycle/w0;", "Landroidx/lifecycle/g0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/g0;)V", "in-app-update-sdk_googlePlayStoreRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<ru.ozon.android.inAppUpdate.internal.ui.blocking.a> f83880a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final M0<ru.ozon.android.inAppUpdate.internal.ui.blocking.a> f83881b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C0 f83882c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final B0<i> f83883d;

    /* renamed from: e, reason: collision with root package name */
    private xe.B0 f83884e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.inAppUpdate.internal.ui.g f83885f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.inAppUpdate.internal.ui.blocking.OzonInAppUpdateSdkBlockingViewModel$sendActivityCommand$1", f = "OzonInAppUpdateSdkBlockingViewModel.kt", l = {102}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f83886d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f83888f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f83888f = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new a(this.f83888f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f83886d;
            if (i11 == 0) {
                s.b(obj);
                C0 c02 = j.this.f83882c;
                this.f83886d = 1;
                if (c02.emit(this.f83888f, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.inAppUpdate.internal.ui.blocking.OzonInAppUpdateSdkBlockingViewModel$startDownloadTimer$1", f = "OzonInAppUpdateSdkBlockingViewModel.kt", l = {89}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f83889d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f83889d;
            if (i11 == 0) {
                s.b(obj);
                this.f83889d = 1;
                if (Y.b(180000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            int i12 = C8938a.f81237c;
            C8938a.b("Превышен таймаут скачивания, отображаем состояние ошибки");
            j.this.j0(i.a.f83875a);
            return Unit.f71690a;
        }
    }

    public j(@NotNull C5418g0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        x0<ru.ozon.android.inAppUpdate.internal.ui.blocking.a> a11 = O0.a(a.d.f83839a);
        this.f83880a = a11;
        this.f83881b = C2399j.b(a11);
        C0 b11 = E0.b(0, 0, null, 7);
        this.f83882c = b11;
        this.f83883d = C2399j.a(b11);
        Object c11 = savedStateHandle.c("ru.ozon.android.inAppUpdate.internal.ui.blocking.CONFIG_KEY");
        if (c11 == null) {
            throw new IllegalArgumentException("Не найден SdkConfig внутри SavedStateHandle. Скорее всего вы не передали SdkConfig в OzonInAppUpdateSdkBlockingActivity");
        }
        this.f83885f = (ru.ozon.android.inAppUpdate.internal.ui.g) c11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(i iVar) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new a(iVar, null), 3);
    }

    private final void k0() {
        xe.B0 b02 = this.f83884e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f83884e = null;
        this.f83884e = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new b(null), 3);
    }

    @NotNull
    public final B0<i> f0() {
        return this.f83883d;
    }

    @NotNull
    public final M0<ru.ozon.android.inAppUpdate.internal.ui.blocking.a> g0() {
        return this.f83881b;
    }

    @NotNull
    /* renamed from: h0, reason: from getter */
    public final ru.ozon.android.inAppUpdate.internal.ui.g getF83885f() {
        return this.f83885f;
    }

    public final void i0(@NotNull c action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i11 = C8938a.f81237c;
        C8938a.b("OzonInAppUpdateSdkBlockingViewModel.onAction: " + action);
        if (action instanceof c.a) {
            j0(i.b.f83876a);
            return;
        }
        boolean z11 = action instanceof c.e;
        x0<ru.ozon.android.inAppUpdate.internal.ui.blocking.a> x0Var = this.f83880a;
        if (z11) {
            if (((c.e) action).a()) {
                x0Var.setValue(a.C1447a.f83836a);
                k0();
                j0(i.e.f83879a);
                return;
            }
            return;
        }
        if (action instanceof c.C1448c) {
            xe.B0 b02 = this.f83884e;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            this.f83884e = null;
            if (((c.C1448c) action).a()) {
                x0Var.setValue(new a.c(this.f83885f.d() == g.c.GOOGLE_PLAY_STORE));
                return;
            } else {
                x0Var.setValue(a.b.f83837a);
                return;
            }
        }
        if (Intrinsics.d(action, c.b.f83861a)) {
            x0Var.setValue(a.C1447a.f83836a);
            k0();
            j0(i.d.f83878a);
        } else if (Intrinsics.d(action, c.d.f83863a)) {
            j0(i.c.f83877a);
        } else {
            if (!Intrinsics.d(action, c.f.f83865a)) {
                throw new o();
            }
            x0Var.setValue(a.C1447a.f83836a);
            k0();
            j0(i.e.f83879a);
        }
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        super.onCleared();
        xe.B0 b02 = this.f83884e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f83884e = null;
        C6960a.d();
    }
}
